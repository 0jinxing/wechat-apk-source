package com.tencent.mm.plugin.traceroute.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a$j
  implements Runnable
{
  private a$j(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25978);
    this.sID.mf(false);
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    long l1 = bo.anU();
    Object localObject1 = new java.sql.Date(l1);
    ab.i("MicroMsg.MMTraceRoute", "mmtraceroute start time " + localSimpleDateFormat.format((java.util.Date)localObject1));
    localObject1 = this.sID.sIx.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject1).next();
      Object localObject2 = new a.i(this.sID, (String)localEntry.getKey());
      if (a.sIt != null)
        a.sIt.execute((Runnable)localObject2);
      localObject2 = new a.a(this.sID, (String)localEntry.getKey(), (Set)localEntry.getValue());
      if (a.sIt != null)
        a.sIt.execute((Runnable)localObject2);
    }
    try
    {
      do
      {
        Thread.sleep(500L);
        if ((this.sID.cHu()) || (a.sIt.getActiveCount() <= 0))
          break;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("task count: ");
        ab.d("MicroMsg.MMTraceRoute", String.valueOf(a.sIt.getActiveCount()));
        l2 = bo.anU();
      }
      while (l2 - l1 < 120000L);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("traceroute timeout: ");
      ab.i("MicroMsg.MMTraceRoute", (l2 - l1) / 1000L);
      this.sID.mf(true);
      this.sID.stop();
      if (this.sID.sIy != null)
        this.sID.sIy.cHz();
      AppMethodBeat.o(25978);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMTraceRoute", "wait for command end err: " + localException.getMessage());
        ab.printErrStackTrace("MicroMsg.MMTraceRoute", localException, "", new Object[0]);
        continue;
        long l2 = bo.anU();
        ab.i("MicroMsg.MMTraceRoute", "mmtraceroute end time " + localSimpleDateFormat.format(new java.util.Date(l2)));
        ab.i("MicroMsg.MMTraceRoute", "mmtraceroute total time " + (l2 - l1) / 1000L);
        if ((this.sID.sIz != null) && (!this.sID.cHu()))
          this.sID.sIz.arL();
        AppMethodBeat.o(25978);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.b.a.j
 * JD-Core Version:    0.6.2
 */