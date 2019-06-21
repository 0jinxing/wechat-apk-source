package com.tencent.mm.plugin.d.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class e$2$1
  implements Runnable
{
  e$2$1(e.2 param2, long paramLong1, boolean paramBoolean, long paramLong2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18405);
    f localf = (f)this.jGp.jGm.jFA.get(Long.valueOf(this.hbB));
    Boolean localBoolean = Boolean.FALSE;
    int i;
    if (!this.jGn)
    {
      i = 1;
      if ((localf == null) && (i == 0))
        break label193;
      if (this.jGp.jGm.jGi != null)
      {
        this.jGp.jGm.jGi.a(this.hbB, this.jGn, this.jGo);
        if (i != 0)
          ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "disconnected, mBLEManagerCallback callback mac=%s", new Object[] { b.ie(this.hbB) });
      }
      if (i == 0)
        break label214;
      ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "remove seesion(mac=%s)", new Object[] { b.ie(this.hbB) });
      this.jGp.jGm.jFA.remove(Long.valueOf(this.hbB));
      this.jGp.jGm.jGk.remove(Long.valueOf(this.hbB));
      AppMethodBeat.o(18405);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label193: ab.e("MicroMsg.exdevice.BluetoothLESimpleManager", "no seesion(mac=%s) found", new Object[] { b.ie(this.hbB) });
      label214: AppMethodBeat.o(18405);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.e.2.1
 * JD-Core Version:    0.6.2
 */