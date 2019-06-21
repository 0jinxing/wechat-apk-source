package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

class TraeAudioManager$2
  implements Runnable
{
  TraeAudioManager$2(TraeAudioManager paramTraeAudioManager, ArrayList paramArrayList, String paramString1, String paramString2)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65663);
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY");
    localIntent.putExtra("PARAM_OPERATION", "NOTIFY_DEVICELISTUPDATE");
    localIntent.putExtra("EXTRA_DATA_AVAILABLEDEVICE_LIST", (String[])this.a.toArray(new String[0]));
    localIntent.putExtra("EXTRA_DATA_CONNECTEDDEVICE", this.b);
    localIntent.putExtra("EXTRA_DATA_PREV_CONNECTEDDEVICE", this.c);
    localIntent.putExtra("EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME", this.d._deviceConfigManager.d());
    if (this.d._context != null)
      this.d._context.sendBroadcast(localIntent);
    AppMethodBeat.o(65663);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.2
 * JD-Core Version:    0.6.2
 */