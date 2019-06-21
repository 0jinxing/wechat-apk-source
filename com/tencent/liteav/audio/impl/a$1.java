package com.tencent.liteav.audio.impl;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

class a$1 extends BroadcastReceiver
{
  a$1(a parama)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(66707);
    paramContext = paramIntent.getAction();
    TXCLog.i(a.a(this.a), "onReceive, action = ".concat(String.valueOf(paramContext)));
    if (paramContext.equals("android.intent.action.HEADSET_PLUG"))
    {
      a.a(this.a, paramIntent);
      AppMethodBeat.o(66707);
    }
    while (true)
    {
      return;
      if (paramContext.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"))
      {
        a.b(this.a, paramIntent);
        AppMethodBeat.o(66707);
        continue;
      }
      paramContext = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
      if ((paramContext != null) && (a.b(this.a) != null));
      try
      {
        Thread.sleep(500L);
        label107: a.a(this.a, paramContext);
        AppMethodBeat.o(66707);
      }
      catch (InterruptedException paramIntent)
      {
        break label107;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.a.1
 * JD-Core Version:    0.6.2
 */