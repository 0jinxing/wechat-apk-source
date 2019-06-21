package com.tencent.mm.ui.chatting.l;

import android.database.Cursor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aq.b.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.w;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.f.d.b;
import com.tencent.mm.ui.chatting.f.d.d;
import java.util.List;

public final class b
  implements e<bi>
{
  Cursor PI;
  String emo;
  private boolean ooX;
  private d.a yZP;
  long yZQ;
  long yZR;
  private long yZS;
  int yZT;
  private Bundle yZU;
  private d.d yZV;

  public b(String paramString, d.a parama, Bundle paramBundle, long paramLong1, long paramLong2, long paramLong3, int paramInt, d.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(32693);
    this.yZS = paramLong1;
    this.yZQ = paramLong2;
    this.yZR = paramLong3;
    this.yZT = paramInt;
    this.emo = paramString;
    this.yZP = parama;
    this.yZU = paramBundle;
    this.yZV = paramd;
    this.ooX = paramBoolean;
    ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[ChattingGetDataSource] mLastTopCreateTime:" + this.yZQ + " mLastBottomCreateTime:" + this.yZR + " isFromSearch:" + paramBoolean + " mLastCount:" + this.yZT + " mLastBottomMsgSeq:" + this.yZS + " mTalker:" + this.emo + " action:" + parama);
    AppMethodBeat.o(32693);
  }

  private void b(d.b paramb)
  {
    AppMethodBeat.i(32695);
    long l1 = dHc();
    long l2 = dHf();
    ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleEnter] from:%d to:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
    this.PI = ((j)g.K(j.class)).bOr().d(this.emo, l1, l2, 18);
    paramb.dY();
    AppMethodBeat.o(32695);
  }

  private void c(d.b paramb)
  {
    AppMethodBeat.i(32696);
    boolean bool;
    if ((this.yZV.yYz != null) && (this.yZV.yYz.getBoolean("has_position_tongue", false)))
    {
      bool = true;
      if ((this.yZV.yYz == null) || (!this.yZV.yYz.getBoolean("has_position_search", false)))
        break label175;
    }
    label175: for (int i = 1; ; i = 0)
    {
      if (!bool)
        break label180;
      bi localbi = ((j)g.K(j.class)).bOr().Rb(this.emo);
      if ((localbi == null) || (localbi.field_isSend != 1) || (localbi.field_msgSeq != 0L))
        break label180;
      b(paramb);
      if (this.yZV.yYz == null)
        this.yZV.yYz = new Bundle();
      this.yZV.yYz.putBoolean("need_scroll_to_bottom", true);
      ab.w("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleUpdate] send msg! need scroll to bottom!");
      AppMethodBeat.o(32696);
      return;
      bool = false;
      break;
    }
    label180: long l1 = dHe();
    if ((!bool) && (i != 0));
    for (long l2 = this.yZR; ; l2 = dHd())
    {
      ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleUpdate] talker:" + this.emo + " from:" + l1 + " to:" + l2 + " hasTongue:" + bool);
      this.PI = ((j)g.K(j.class)).bOr().d(this.emo, l1, l2, 2147483647);
      paramb.dY();
      AppMethodBeat.o(32696);
      break;
    }
  }

  private long dHd()
  {
    AppMethodBeat.i(32702);
    w localw = ((j)g.K(j.class)).bOm().QN(this.emo);
    long l;
    if ((this.yZS > 0L) && (localw.mP(this.yZS).size() > 0))
    {
      ab.w("MicroMsg.ChattingLoader.ChattingGetDataSource", "[findUpdateLastCreateTime] mLastBottomMsgSeq:" + this.yZS + " chatroomMsgSeq:" + localw);
      l = this.yZR;
      AppMethodBeat.o(32702);
    }
    while (true)
    {
      return l;
      l = dHf();
      AppMethodBeat.o(32702);
    }
  }

  private long dHe()
  {
    AppMethodBeat.i(32703);
    if (this.yZQ == 0L)
    {
      ab.w("MicroMsg.ChattingLoader.ChattingGetDataSource", "[findUpdateFirstCreateTime] mLastTopCreateTime == 0");
      this.yZQ = ((j)g.K(j.class)).bOr().f(this.emo, dHf(), 18);
    }
    long l = this.yZQ;
    AppMethodBeat.o(32703);
    return l;
  }

  public final void a(final d.b paramb)
  {
    AppMethodBeat.i(32694);
    switch (b.6.yZG[this.yZP.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(32694);
      Object localObject1;
      while (true)
      {
        return;
        b(paramb);
        AppMethodBeat.o(32694);
        continue;
        if ((this.yZU != null) && (this.yZU.getBoolean("load_bottom", false)))
        {
          localObject1 = ((j)g.K(j.class)).bOm().QN(this.emo);
          l1 = ((w)localObject1).field_lastPushSeq;
          l2 = ((w)localObject1).field_lastLocalSeq;
          com.tencent.mm.aq.b.agG().a(this.emo, l1, 1L + l2, 1, new b.2(this, paramb));
          AppMethodBeat.o(32694);
        }
        else
        {
          localObject1 = ((j)g.K(j.class)).bOm();
          Object localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).f(this.emo, this.yZR, true);
          if (localObject2 != null)
          {
            com.tencent.mm.aq.b.agG().a(this.emo, ((com.tencent.mm.j.a.a.c)localObject2).eoC, ((com.tencent.mm.j.a.a.c)localObject2).eoD, 0, new b.3(this, paramb));
            AppMethodBeat.o(32694);
          }
          else
          {
            ab.w("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadBottom] null == seqBlock talker:" + this.emo + " mLastBottomCreateTime:" + this.yZR);
            localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QN(this.emo);
            l2 = ((w)localObject1).field_lastPushSeq;
            l1 = ((w)localObject1).field_lastLocalSeq;
            com.tencent.mm.aq.b.agG().a(this.emo, 1L + l1, l2, 0, new b.4(this, paramb));
            AppMethodBeat.o(32694);
            continue;
            localObject2 = ((j)g.K(j.class)).bOm();
            com.tencent.mm.j.a.a.c localc = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject2).M(this.emo, this.yZQ);
            label368: int i;
            if (localc == null)
            {
              l1 = 0L;
              l2 = this.yZQ;
              i = ((j)g.K(j.class)).bOr().s(this.emo, l1, l2);
              localObject1 = new StringBuilder("[handleLoadTop] talker:").append(this.emo).append(" from:").append(l1).append(" to:").append(l2).append(" count:").append(i).append(" seqBlock is null? ");
              if (localc != null)
                break label615;
            }
            label615: for (boolean bool = true; ; bool = false)
            {
              ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", bool);
              if ((i < 18) && (localc != null))
                break label621;
              l2 = this.yZR;
              ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handleLoadTop] talker:" + this.emo + " from:" + l1 + " to:" + l2 + " count:" + (this.yZT + 18));
              this.PI = ((j)g.K(j.class)).bOr().d(this.emo, l1, l2, this.yZT + 18);
              paramb.dY();
              AppMethodBeat.o(32694);
              break;
              l1 = localc.eoF;
              break label368;
            }
            label621: if (localc != null)
            {
              l2 = localc.eoD;
              l3 = localc.eoC;
              l1 = localc.eoF;
              l4 = localc.eoE;
              com.tencent.mm.aq.b.agG().a(this.emo, l2, l3, 1, new b.5(this, l4, (com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject2, l1, paramb));
            }
            AppMethodBeat.o(32694);
            continue;
            c(paramb);
            AppMethodBeat.o(32694);
            continue;
            if (this.ooX)
            {
              l1 = this.yZU.getLong("MSG_ID");
              bool = this.yZU.getBoolean("IS_LOAD_ALL", false);
              aw.ZK();
              localObject1 = com.tencent.mm.model.c.XO().jf(l1);
              if (((cy)localObject1).field_msgId != l1)
              {
                ab.w("MicroMsg.ChattingLoader.ChattingGetDataSource", "get msg info by id %d error", new Object[] { Long.valueOf(l1) });
                paramb.dY();
                AppMethodBeat.o(32694);
              }
              else
              {
                l2 = ((cy)localObject1).field_createTime;
                ab.d("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePositionForSearch] targetCreateTime:%s [%s:%s]", new Object[] { Long.valueOf(l2), Long.valueOf(this.yZQ), Long.valueOf(this.yZR) });
                if ((l2 < this.yZQ) || (l2 > this.yZR))
                {
                  l2 = ((cy)localObject1).field_createTime;
                  aw.ZK();
                  l4 = com.tencent.mm.model.c.XO().g(this.emo, l2, 18);
                  l4 = Math.min(ns(((cy)localObject1).field_createTime), l4);
                  ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePositionForSearch] [from:%s to:%s] messageId:%s isLoadAllBottomMsg:%s selection:%s", new Object[] { Long.valueOf(l2), Long.valueOf(l4), Long.valueOf(l1), Boolean.valueOf(bool), Integer.valueOf(0) });
                  this.PI = ((j)g.K(j.class)).bOr().d(this.emo, l2, l4, 2147483647);
                  i = 0;
                }
                while (true)
                {
                  this.yZV.selection = Math.max(0, i);
                  paramb.dY();
                  AppMethodBeat.o(32694);
                  break;
                  this.PI = ((j)g.K(j.class)).bOr().d(this.emo, this.yZQ, this.yZR, 2147483647);
                  aw.ZK();
                  i = com.tencent.mm.model.c.XO().s(this.emo, this.yZQ, l2) - 1;
                  ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePositionForSearch] selection:%s messageId:%s isLoadAllBottomMsg:%s", new Object[] { Integer.valueOf(i), Long.valueOf(l1), Boolean.valueOf(bool) });
                }
              }
            }
            else
            {
              localObject1 = ((j)g.K(j.class)).bOm();
              if (this.yZU == null)
              {
                bool = true;
                label1139: ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "null == mSourceArgs?%s", new Object[] { Boolean.valueOf(bool) });
                if (this.yZU != null)
                  break label1314;
              }
              label1314: for (i = 0; ; i = this.yZU.getInt("MSG_POSITION_UNREAD_COUNT"))
              {
                if (i <= 0)
                  break label1329;
                l2 = dHd();
                l1 = ((j)g.K(j.class)).bOr().f(this.emo, l2, i);
                ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePosition] talker:" + this.emo + " from:" + l1 + " to:" + l2 + " unreadCount:" + i);
                this.PI = ((j)g.K(j.class)).bOr().d(this.emo, l1, l2, 2147483647);
                paramb.dY();
                AppMethodBeat.o(32694);
                break;
                bool = false;
                break label1139;
              }
              label1329: localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.a.b)localObject1).QM(this.emo);
              if (localObject1 != null)
                break;
              ab.w("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePosition] lastSeqBlock == null！mTalker:%s", new Object[] { this.emo });
              d(paramb);
              AppMethodBeat.o(32694);
            }
          }
        }
      }
      long l2 = ((com.tencent.mm.j.a.a.c)localObject1).eoC;
      final long l1 = ((com.tencent.mm.j.a.a.c)localObject1).eoE;
      long l4 = ((com.tencent.mm.j.a.a.c)localObject1).eoD;
      long l3 = ((com.tencent.mm.j.a.a.c)localObject1).eoF;
      com.tencent.mm.aq.b.agG().a(this.emo, l2, l4, 0, new b.b()
      {
        public final void b(int paramAnonymousInt, List<bi> paramAnonymousList)
        {
          AppMethodBeat.i(32687);
          if ((paramAnonymousInt >= 0) && (paramAnonymousList.size() > 0))
          {
            ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[handlePosition] talker:" + b.this.emo + " fromCreateTime:" + l1 + " toCreateTime:" + paramb + " addSize:" + paramAnonymousList.size());
            long l = paramb;
            if (paramAnonymousList.size() <= 18)
              l = b.this.ns(((bi)paramAnonymousList.get(paramAnonymousList.size() - 1)).field_createTime);
            b.this.PI = ((j)g.K(j.class)).bOr().d(b.this.emo, l1, l, 36);
            this.yYo.dY();
            AppMethodBeat.o(32687);
          }
          while (true)
          {
            return;
            b.this.d(this.yYo);
            AppMethodBeat.o(32687);
          }
        }
      });
    }
  }

  public final void close()
  {
    AppMethodBeat.i(32699);
    if (this.PI != null)
      this.PI.close();
    AppMethodBeat.o(32699);
  }

  final void d(d.b paramb)
  {
    AppMethodBeat.i(32705);
    ab.e("MicroMsg.ChattingLoader.ChattingGetDataSource", "[fallback]");
    c(paramb);
    AppMethodBeat.o(32705);
  }

  public final int dCP()
  {
    AppMethodBeat.i(32697);
    aw.ZK();
    int i = com.tencent.mm.model.c.XO().Rp(this.emo);
    AppMethodBeat.o(32697);
    return i;
  }

  final long dHc()
  {
    AppMethodBeat.i(32700);
    com.tencent.mm.j.a.a.c localc = ((j)g.K(j.class)).bOm().QM(this.emo);
    long l;
    if (localc != null)
    {
      ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[findLastBlockLastSeq] has block! so return just lastBlock of lastCreateTime! lastCreateTime:" + localc.eoF + " seq:" + localc.eoC + "~" + localc.eoD);
      l = localc.eoF;
      AppMethodBeat.o(32700);
    }
    while (true)
    {
      return l;
      l = this.yZQ;
      AppMethodBeat.o(32700);
    }
  }

  final long dHf()
  {
    AppMethodBeat.i(32704);
    long l = ((j)g.K(j.class)).bOr().Rt(this.emo);
    AppMethodBeat.o(32704);
    return l;
  }

  public final void fk(List<bi> paramList)
  {
    AppMethodBeat.i(32698);
    if (this.PI == null)
    {
      ab.e("MicroMsg.ChattingLoader.ChattingGetDataSource", "[fillItem] cursor is null");
      AppMethodBeat.o(32698);
    }
    while (true)
    {
      return;
      this.PI.moveToFirst();
      while (!this.PI.isAfterLast())
      {
        bi localbi = new bi();
        localbi.d(this.PI);
        paramList.add(localbi);
        this.PI.moveToNext();
      }
      AppMethodBeat.o(32698);
    }
  }

  final long ns(long paramLong)
  {
    AppMethodBeat.i(32701);
    com.tencent.mm.j.a.a.c localc = ((j)g.K(j.class)).bOm().f(this.emo, paramLong, true);
    if (localc != null)
    {
      ab.i("MicroMsg.ChattingLoader.ChattingGetDataSource", "[findLastBlockFirstCreateTime] has block! so return just lastBlock of lastCreateTime! firstCreateTime:" + localc.eoE + " time:" + paramLong);
      paramLong = localc.eoE;
      AppMethodBeat.o(32701);
    }
    while (true)
    {
      return paramLong;
      paramLong = dHf();
      AppMethodBeat.o(32701);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l.b
 * JD-Core Version:    0.6.2
 */