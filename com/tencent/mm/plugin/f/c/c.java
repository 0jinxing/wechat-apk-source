package com.tencent.mm.plugin.f.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.f.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class c
  implements Runnable
{
  public boolean isStop;
  private String kaj;
  private long kak;
  private c.a kal;
  private int limit;

  public c(String paramString, long paramLong, int paramInt, c.a parama)
  {
    AppMethodBeat.i(18645);
    this.kaj = paramString;
    this.kak = paramLong;
    this.limit = paramInt;
    this.kal = parama;
    ab.d("MicroMsg.ScanMsgTask", "%d scan msg[%d %d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.kak), Integer.valueOf(this.limit) });
    AppMethodBeat.o(18645);
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(18646);
    if (this.isStop)
      AppMethodBeat.o(18646);
    while (true)
    {
      return;
      long l = bo.yz();
      Object localObject1 = null;
      Cursor localCursor1 = null;
      Cursor localCursor2 = localCursor1;
      Object localObject3 = localObject1;
      try
      {
        aw.ZK();
        localCursor2 = localCursor1;
        localObject3 = localObject1;
        localCursor1 = com.tencent.mm.model.c.XO().h(this.kaj, this.kak, this.limit);
        localCursor2 = localCursor1;
        localObject3 = localCursor1;
        l = bo.az(l);
        localCursor2 = localCursor1;
        localObject3 = localCursor1;
        b.aZc();
        localCursor2 = localCursor1;
        localObject3 = localCursor1;
        b.C(this.limit, l);
        boolean bool;
        do
        {
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          if (!localCursor1.moveToNext())
            break;
          i++;
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          localObject1 = new com/tencent/mm/storage/bi;
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          ((bi)localObject1).<init>();
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          ((bi)localObject1).d(localCursor1);
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          b.aZc().O((bi)localObject1);
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          b.aZc().gS(((cy)localObject1).field_msgId);
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          bool = this.isStop;
        }
        while (!bool);
        if (localCursor1 != null)
          localCursor1.close();
        AppMethodBeat.o(18646);
        continue;
        localCursor2 = localCursor1;
        localObject3 = localCursor1;
        ab.d("MicroMsg.ScanMsgTask", "%d scan msg count[%d] limit[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(this.limit) });
        localCursor2 = localCursor1;
        localObject3 = localCursor1;
        if (i < this.limit)
        {
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          localObject1 = b.aZc();
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          b.aZc();
          localCursor2 = localCursor1;
          localObject3 = localCursor1;
          ((b)localObject1).gS(b.aZf());
        }
        if (localCursor1 != null)
          localCursor1.close();
        if (this.kal != null)
          this.kal.finish();
        AppMethodBeat.o(18646);
      }
      catch (Exception localException)
      {
        while (true)
        {
          localObject3 = localCursor2;
          ab.printErrStackTrace("MicroMsg.ScanMsgTask", localException, "", new Object[0]);
          if (localCursor2 != null)
            localCursor2.close();
        }
      }
      finally
      {
        if (localObject3 != null)
          ((Cursor)localObject3).close();
        AppMethodBeat.o(18646);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.c.c
 * JD-Core Version:    0.6.2
 */