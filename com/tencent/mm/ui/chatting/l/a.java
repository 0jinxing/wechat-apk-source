package com.tencent.mm.ui.chatting.l;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.chatting.f.d.b;
import java.util.List;

public final class a
  implements e<bi>
{
  private Cursor PI;
  private int emW;
  private String emo;
  private int mCount;
  private long yNB;

  public a(String paramString, long paramLong, int paramInt1, int paramInt2)
  {
    this.emo = paramString;
    this.yNB = paramLong;
    this.emW = paramInt2;
    this.mCount = paramInt1;
  }

  public final void a(d.b paramb)
  {
    AppMethodBeat.i(32684);
    long l = ((j)g.K(j.class)).Yo().QQ(this.emo);
    ab.d("MicroMsg.ChattingLoader.ChattingBizDataSource", "[ChattingBizDataSource] talker:%s bizChatId:%s,count:%s totalCount:%s createTime:%s", new Object[] { this.emo, Long.valueOf(this.yNB), Integer.valueOf(this.mCount), Integer.valueOf(this.emW), Long.valueOf(l) });
    aw.ZK();
    this.PI = com.tencent.mm.model.c.XP().p(this.emo, this.yNB, this.mCount);
    paramb.dY();
    AppMethodBeat.o(32684);
  }

  public final void close()
  {
    AppMethodBeat.i(32686);
    this.PI.close();
    AppMethodBeat.o(32686);
  }

  public final int dCP()
  {
    return this.emW;
  }

  public final void fk(List<bi> paramList)
  {
    AppMethodBeat.i(32685);
    this.PI.moveToFirst();
    while (!this.PI.isAfterLast())
    {
      bi localbi = new bi();
      localbi.d(this.PI);
      paramList.add(localbi);
      this.PI.moveToNext();
    }
    AppMethodBeat.o(32685);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.a
 * JD-Core Version:    0.6.2
 */