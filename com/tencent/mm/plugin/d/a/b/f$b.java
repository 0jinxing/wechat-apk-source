package com.tencent.mm.plugin.d.a.b;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

final class f$b extends ak
{
  private final WeakReference<f> jGh;

  public f$b(Looper paramLooper, f paramf)
  {
    super(paramLooper);
    AppMethodBeat.i(18424);
    this.jGh = new WeakReference(paramf);
    AppMethodBeat.o(18424);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(18425);
    f localf = (f)this.jGh.get();
    if (localf == null)
    {
      ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "null == BluetoothLESession");
      AppMethodBeat.o(18425);
      return;
    }
    switch (paramMessage.what)
    {
    default:
    case 0:
    case 4:
    case 5:
    case 6:
    case 1:
    case 3:
    case 7:
    case 8:
    case 2:
    case 9:
    }
    while (true)
    {
      AppMethodBeat.o(18425);
      break;
      f.a(localf);
      AppMethodBeat.o(18425);
      break;
      f.a(localf, paramMessage.arg1);
      AppMethodBeat.o(18425);
      break;
      if (!f.a(localf, (BluetoothGatt)paramMessage.obj, paramMessage.arg1))
      {
        ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------disconnect------, mac=%s, name=%s", new Object[] { b.ie(localf.mSessionId), localf.hGa.getName() });
        if (!localf.mHandler.sendMessage(localf.mHandler.obtainMessage(1)))
          ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(1) });
        AppMethodBeat.o(18425);
        break;
        Object localObject = paramMessage.obj;
        f.b(localf, paramMessage.arg1);
        AppMethodBeat.o(18425);
        break;
        f.b(localf);
        AppMethodBeat.o(18425);
        break;
        f.a(localf, (byte[])paramMessage.obj);
        AppMethodBeat.o(18425);
        break;
        f.c(localf, paramMessage.arg1);
        AppMethodBeat.o(18425);
        break;
        f.a(localf, (BluetoothGattCharacteristic)paramMessage.obj);
        AppMethodBeat.o(18425);
        break;
        f.c(localf);
        AppMethodBeat.o(18425);
        break;
        f.d(localf);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.f.b
 * JD-Core Version:    0.6.2
 */