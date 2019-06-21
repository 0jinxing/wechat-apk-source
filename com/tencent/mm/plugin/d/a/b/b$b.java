package com.tencent.mm.plugin.d.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class b$b
  implements Runnable
{
  private long jFL = 0L;
  private long jFM = 0L;

  public b$b(b paramb, long paramLong1, long paramLong2)
  {
    this.jFL = paramLong1;
    this.jFM = paramLong2;
  }

  public final void run()
  {
    AppMethodBeat.i(18370);
    b localb = this.jFH;
    long l = this.jFL;
    d locald1 = new d(l, localb.Gn, localb);
    String str = String.valueOf(locald1.mSessionId);
    ab.i("MicroMsg.exdevice.BluetoothLEManager", "BluetoothLESession hashCode = %d, macAddr = %d, mapKey = %s", new Object[] { Integer.valueOf(locald1.hashCode()), Long.valueOf(l), str });
    d locald2 = (d)localb.jFA.remove(str);
    if (locald2 != null)
      locald2.close();
    localb.jFA.put(str, locald1);
    l = locald1.mSessionId;
    if (this.jFH.jFz != null)
      this.jFH.jFz.g(l, this.jFL, this.jFM);
    AppMethodBeat.o(18370);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.b.b
 * JD-Core Version:    0.6.2
 */