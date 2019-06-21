package com.tencent.mm.ui.chatting.l;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.f.d.b;
import java.util.List;

public final class d
  implements e<bi>
{
  private Cursor PI;
  private String emo;
  private long zac;
  private long zad;

  public d(String paramString, long paramLong1, long paramLong2)
  {
    this.emo = paramString;
    this.zac = paramLong1;
    this.zad = paramLong2;
  }

  public final void a(d.b paramb)
  {
    AppMethodBeat.i(32709);
    aw.ZK();
    this.PI = c.XO().t(this.emo, this.zac, this.zad);
    paramb.dY();
    AppMethodBeat.o(32709);
  }

  public final void close()
  {
    AppMethodBeat.i(32712);
    this.PI.close();
    AppMethodBeat.o(32712);
  }

  public final int dCP()
  {
    AppMethodBeat.i(32710);
    aw.ZK();
    int i = c.XO().Rp(this.emo);
    AppMethodBeat.o(32710);
    return i;
  }

  public final void fk(List<bi> paramList)
  {
    AppMethodBeat.i(32711);
    try
    {
      this.PI.moveToFirst();
      while (!this.PI.isAfterLast())
      {
        bi localbi = new com/tencent/mm/storage/bi;
        localbi.<init>();
        localbi.d(this.PI);
        paramList.add(localbi);
        this.PI.moveToNext();
      }
    }
    catch (Exception paramList)
    {
      ab.printErrStackTrace("MicroMsg.ChattingLoader.ChattingSearchDataSource", paramList, "", new Object[0]);
      AppMethodBeat.o(32711);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(32711);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.d
 * JD-Core Version:    0.6.2
 */