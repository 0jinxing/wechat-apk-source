package com.tencent.mm.plugin.d.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Iterator;

final class b$3$2
  implements Runnable
{
  b$3$2(b.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18367);
    if (!this.jFK.jFH.jFE.isEmpty())
    {
      Iterator localIterator = this.jFK.jFH.jFE.iterator();
      while (localIterator.hasNext())
      {
        Long localLong = (Long)localIterator.next();
        ab.e("MicroMsg.exdevice.BluetoothLEManager", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localLong });
        if (this.jFK.jFH.jFz != null)
          this.jFK.jFH.jFz.l(localLong.longValue(), false);
      }
      this.jFK.jFH.jFE.clear();
    }
    AppMethodBeat.o(18367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.b.3.2
 * JD-Core Version:    0.6.2
 */