package com.tencent.mm.plugin.d.a.b;

import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;

public final class e$5
  implements Runnable
{
  public e$5(e parame, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18411);
    f localf = (f)this.jGm.jFA.remove(Long.valueOf(this.jGq));
    if (localf != null)
    {
      ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------close------, mac=%s, name=%s", new Object[] { b.ie(localf.mSessionId), localf.hGa.getName() });
      if (!localf.mHandler.sendMessage(localf.mHandler.obtainMessage(2)))
        ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(2) });
      this.jGm.jGk.put(Long.valueOf(this.jGq), Boolean.TRUE);
      AppMethodBeat.o(18411);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.exdevice.BluetoothLESimpleManager", "session not found! maybe ui don't handle session disconnect event correctly.");
      AppMethodBeat.o(18411);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.e.5
 * JD-Core Version:    0.6.2
 */