package com.example.administrator.intentservicetest;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private final static String TAG="TestIntentService";
    private TextView text;
    private Button btnStart;
    private Button btnSendOther;
    private ProgressBar mProgressBar;
    private Button mTest;
//    private MessageReceiver receiver ;
//    private MessageReceiver receiver1 ;
    /*
     * Action
     */
    private static final String ACTION_RECV_MSG = "com.linc.intent.action.RECEIVE_MESSAGE";
    private static final String ACTION_OTHER_MSG = "com.linc.intent.action.OTHER_MESSAGE";

    /*
     * Message
     */
    private static final String MESSAGE_IN="message_input";
    private static final String MESSAGE_OUT="message_output";

    private CallbackService mCallbackService;
    ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mCallbackService = ((CallbackService.CallbackBinder) service).getService();
            mCallbackService.setProgressListener(new OnProgressListener() {
                @Override
                public void onProgress(int progress) {
                    mProgressBar.setProgress(progress);
                }
            });
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_service_callback);
        File cacheDie = getExternalCacheDir();
        if (!cacheDie.exists()) {
            cacheDie.mkdir();
        }

        String tmp = cacheDie.getAbsolutePath() + "/" + "tmp";
        String tmp2 = cacheDie.getAbsolutePath() + "/" + "tmp2";
        String tmp22 = cacheDie.getAbsolutePath() + "/" + "tmp2" + "/" + "tmp22";
        File tmpFile = new File(tmp);
        File tmpFile2 = new File(tmp2);
        File tmpFile22 = new File((tmp22));
        if (!tmpFile.exists())
            tmpFile.mkdir();
        if (!tmpFile2.exists()) {
            tmpFile2.mkdir();
        }

        if (!tmpFile22.exists())
            tmpFile22.mkdir();

        File[] files = cacheDie.listFiles();
        HashSet<String> tmpSet = new HashSet<>();
        for (File f : files) {
            Log.e(TAG, "listFiles: " + f.getName());
            tmpSet.add(f.getAbsolutePath());
        }

        HashSet<String> tmpSet2 = (HashSet<String>) filter(tmpSet);

        for (String str : tmpSet2) {
            Log.e(TAG, "tmpSet2" + str);
        }

//        Settings settings = Logger.init("HankCoder");
//        Logger.d("onCreate");
//
//        final Intent intent = new Intent(MainActivity.this, CallbackService.class);
//        bindService(intent, conn, Context.BIND_AUTO_CREATE);
//        mProgressBar = (ProgressBar) findViewById(R.id.progressbar);
//        mTest = (Button) findViewById(R.id.button);
//        mTest.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
////                startService(intent);
//
//                sendBroadcast(new Intent("com.nd.social.setting.clear.cache.clock"));
//            }
//        });

//        text=(TextView)findViewById(R.id.text);
//        text.setText("准备");
//        btnStart=(Button)findViewById(R.id.btnStart);
//        btnStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//
//                Intent msgIntent = new Intent(MainActivity.this,
//                        TestIntentService.class);
//
//                msgIntent.putExtra(MESSAGE_IN, text.getText().toString());
//                startService(msgIntent);
//
//            }
//        });
//
//        btnSendOther=(Button)findViewById(R.id.btnSendOther);
//        btnSendOther.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//            }
//        });
//
//        //动态注册receiver
//        IntentFilter filter = new IntentFilter(ACTION_RECV_MSG);
//        filter.addCategory(Intent.CATEGORY_DEFAULT);
//        receiver = new MessageReceiver();
//        registerReceiver(receiver, filter);
//        IntentFilter filter2 = new IntentFilter(ACTION_OTHER_MSG);
//        filter2.addCategory(Intent.CATEGORY_DEFAULT);
//        receiver1 = new MessageReceiver();
//        registerReceiver(receiver1, filter2);
    }

//    //广播来接收
//    public class MessageReceiver extends BroadcastReceiver {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//
//            String message = intent.getStringExtra(MESSAGE_OUT);
//            text.setText(message);
//
//            Toast.makeText(context, "message",
//                    Toast.LENGTH_SHORT).show();
//        }
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        unregisterReceiver(receiver);
//        unregisterReceiver(receiver1);
//        unbindService(conn);
    }

    public static Set<String> filter(Set<String> source) {

        HashSet<String> target = new HashSet<>();

        for (String outPath : source) {

            File outFile = new File(outPath);
            if (outFile.exists() && outFile.isDirectory()) {
                boolean ingnore = false;
                for (String insPath : source) {
                    File insFile = new File(insPath);
                    if (insFile.exists() && insFile.isDirectory()) {
                        String outAbsPath = outFile.getAbsolutePath();
                        String insAbsPath = insFile.getAbsolutePath();

                        Log.e(TAG, outFile.getParent());
                        if (!outAbsPath.equals(insAbsPath)
                                && !outFile.getParent().equals(insFile.getParent())
                                && outAbsPath.contains(insAbsPath)) {
                            ingnore = true;
                            break;
                        }
                    }
                }
                if (!ingnore) {
                    target.add(outFile.getAbsolutePath());
                }
            }
        }
        return target;
    }

}
