package com.tencent.liteav.audio.impl;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

class a$2
  implements BluetoothProfile.ServiceListener
{
  a$2(a parama)
  {
  }

  public void onServiceConnected(int paramInt, BluetoothProfile paramBluetoothProfile)
  {
    AppMethodBeat.i(66705);
    TXCLog.i(a.a(this.a), "onServiceConnected");
    if (paramInt == 1)
    {
      a.a(this.a, (BluetoothHeadset)paramBluetoothProfile);
      paramBluetoothProfile = a.b(this.a).getConnectedDevices();
      if ((paramBluetoothProfile != null) && (paramBluetoothProfile.size() > 0))
      {
        paramBluetoothProfile = (BluetoothDevice)paramBluetoothProfile.get(0);
        a.a(this.a, paramBluetoothProfile);
      }
    }
    AppMethodBeat.o(66705);
  }

  public void onServiceDisconnected(int paramInt)
  {
    AppMethodBeat.i(66706);
    TXCLog.i(a.a(this.a), "onServiceDisconnected");
    if (paramInt == 1)
    {
      a.a(this.a, null);
      this.a.a(a.c(this.a));
    }
    AppMethodBeat.o(66706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.a.2
 * JD-Core Version:    0.6.2
 */