package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;

abstract class TraeAudioManager$d
{
  TraeAudioManager$d(TraeAudioManager paramTraeAudioManager)
  {
  }

  String a(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "unknow";
    case 10:
    case 11:
    case 12:
    case 13:
    }
    while (true)
    {
      return str + ":" + paramInt;
      str = "STATE_OFF";
      continue;
      str = "STATE_TURNING_ON";
      continue;
      str = "STATE_ON";
      continue;
      str = "STATE_TURNING_OFF";
    }
  }

  public abstract void a();

  abstract void a(Context paramContext, Intent paramIntent);

  public void a(Context paramContext, Intent paramIntent, TraeAudioManager.e parame)
  {
    int i;
    if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(paramIntent.getAction()))
    {
      i = paramIntent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
      int j = paramIntent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "BT ACTION_STATE_CHANGED|   EXTRA_STATE " + a(i));
      if (QLog.isColorLevel())
        QLog.w("TRAE", 2, "BT ACTION_STATE_CHANGED|   EXTRA_PREVIOUS_STATE " + a(j));
      if (i == 10)
      {
        if (QLog.isColorLevel())
          QLog.w("TRAE", 2, "    BT off");
        parame.a("DEVICE_BLUETOOTHHEADSET", false);
      }
    }
    while (true)
    {
      return;
      if ((i == 12) && (QLog.isColorLevel()))
      {
        QLog.w("TRAE", 2, "BT OFF-->ON,Visiable it...");
        continue;
        if (((!"android.bluetooth.device.action.ACL_CONNECTED".equals(paramIntent.getAction())) || (Build.VERSION.SDK_INT >= 11)) && ((!"android.bluetooth.device.action.ACL_DISCONNECTED".equals(paramIntent.getAction())) || (Build.VERSION.SDK_INT >= 11)))
          a(paramContext, paramIntent);
      }
    }
  }

  abstract void a(IntentFilter paramIntentFilter);

  public abstract boolean a(Context paramContext, TraeAudioManager.e parame);

  String b(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "unknow";
    case 0:
    case 1:
    case 2:
    case -1:
    }
    while (true)
    {
      return str + ":" + paramInt;
      str = "SCO_AUDIO_STATE_DISCONNECTED";
      continue;
      str = "SCO_AUDIO_STATE_CONNECTED";
      continue;
      str = "SCO_AUDIO_STATE_CONNECTING";
      continue;
      str = "SCO_AUDIO_STATE_ERROR";
    }
  }

  public void b(IntentFilter paramIntentFilter)
  {
    paramIntentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
    paramIntentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
    paramIntentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
    a(paramIntentFilter);
  }

  public abstract boolean b();

  public abstract String c();

  String c(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "unknow";
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return str + ":" + paramInt;
      str = "STATE_DISCONNECTED";
      continue;
      str = "STATE_CONNECTING";
      continue;
      str = "STATE_CONNECTED";
      continue;
      str = "STATE_DISCONNECTING";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioManager.d
 * JD-Core Version:    0.6.2
 */