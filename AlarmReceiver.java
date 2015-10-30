package tw.idv.gocar.kn1.webview;

/**
 * Created by 蔡小開 on 2015/10/26.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context,Intent intent){
        Toast.makeText(context,"時間到",Toast.LENGTH_LONG).show(); // 時間到要做什麼
    }
}
