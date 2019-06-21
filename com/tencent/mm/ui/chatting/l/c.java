package com.tencent.mm.ui.chatting.l;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.f.d.b;
import java.util.List;

public final class c
  implements e<bi>
{
  private Cursor PI;
  private int emW;
  private String emo;
  private int mCount;

  public c(String paramString, int paramInt1, int paramInt2)
  {
    this.emo = paramString;
    this.mCount = paramInt1;
    this.emW = paramInt2;
  }

  public final void a(d.b paramb)
  {
    AppMethodBeat.i(32706);
    long l = ((j)g.K(j.class)).Yo().QQ(this.emo);
    ab.d("MicroMsg.ChattingLoader.ChattingNormalDataSource", "[ChattingNormalDataSource] talker:%s count:%d mTotalCount:%d createTime:%d", new Object[] { this.emo, Integer.valueOf(this.mCount), Integer.valueOf(this.emW), Long.valueOf(l) });
    aw.ZK();
    this.PI = com.tencent.mm.model.c.XO().i(this.emo, this.mCount, l);
    paramb.dY();
    AppMethodBeat.o(32706);
  }

  public final void close()
  {
    AppMethodBeat.i(32708);
    this.PI.close();
    AppMethodBeat.o(32708);
  }

  public final int dCP()
  {
    return this.emW;
  }

  public final void fk(List<bi> paramList)
  {
    AppMethodBeat.i(32707);
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
      ab.printErrStackTrace("MicroMsg.ChattingLoader.ChattingNormalDataSource", paramList, "", new Object[0]);
      AppMethodBeat.o(32707);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(32707);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.c
 * JD-Core Version:    0.6.2
 */