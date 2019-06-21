package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.e;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.g.a.lp.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.a.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class OnlineVideoView$5 extends c<lp>
{
  OnlineVideoView$5(OnlineVideoView paramOnlineVideoView)
  {
    AppMethodBeat.i(38392);
    this.xxI = lp.class.getName().hashCode();
    AppMethodBeat.o(38392);
  }

  private boolean a(lp paramlp)
  {
    AppMethodBeat.i(38393);
    if (OnlineVideoView.k(this.rly) == null)
    {
      ab.w("MicroMsg.OnlineVideoView", "%d online video helper is null.", new Object[] { Integer.valueOf(this.rly.hashCode()) });
      AppMethodBeat.o(38393);
    }
    while (true)
    {
      return false;
      try
      {
        bool = OnlineVideoView.k(this.rly).ZA(paramlp.cHq.cHr);
        if (!bool)
        {
          AppMethodBeat.o(38393);
          continue;
        }
        if (paramlp.cHq.retCode == -21112)
        {
          localObject1 = this.rly;
          h.pYm.a(354L, 218L, 1L, false);
          paramlp = ((OnlineVideoView)localObject1).kkp;
          localObject2 = new com/tencent/mm/plugin/sns/ui/OnlineVideoView$9;
          ((OnlineVideoView.9)localObject2).<init>((OnlineVideoView)localObject1);
          paramlp.post((Runnable)localObject2);
          AppMethodBeat.o(38393);
          continue;
        }
        if ((paramlp.cHq.retCode != 0) && (paramlp.cHq.retCode != -21006))
        {
          ab.w("MicroMsg.OnlineVideoView", "%d stream download online video error. retCode %d ", new Object[] { Integer.valueOf(this.rly.hashCode()), Integer.valueOf(paramlp.cHq.retCode) });
          AppMethodBeat.o(38393);
          continue;
        }
        switch (paramlp.cHq.cAd)
        {
        default:
          ab.w("MicroMsg.OnlineVideoView", "%d unknown event opcode %d", new Object[] { Integer.valueOf(this.rly.hashCode()), Integer.valueOf(paramlp.cHq.cAd) });
        case 1:
          while (true)
          {
            AppMethodBeat.o(38393);
            break;
            localObject2 = OnlineVideoView.k(this.rly);
            l1 = paramlp.cHq.offset;
            l2 = paramlp.cHq.cHs;
            bool = paramlp.cHq.cHt;
            ab.i("MicroMsg.OnlineVideoViewHelper", "deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s startDownload[%d %d]", new Object[] { Long.valueOf(l1), Integer.valueOf(((ae)localObject2).fUR), ((ae)localObject2).fUL, Long.valueOf(l2), Long.valueOf(((ae)localObject2).egA) });
            if (((ae)localObject2).fUR == 0)
              break label444;
            ab.w("MicroMsg.OnlineVideoViewHelper", "moov had callback, do nothing.");
            OnlineVideoView.r(this.rly);
          }
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        }
      }
      catch (Exception paramlp)
      {
        while (true)
        {
          boolean bool;
          Object localObject2;
          long l1;
          long l2;
          ab.e("MicroMsg.OnlineVideoView", "online video callback error: " + paramlp.toString());
          continue;
          label444: if (l2 > ((ae)localObject2).egA);
          while (true)
          {
            while (true)
            {
              ((ae)localObject2).egA = l2;
              ((ae)localObject2).rlG = bo.anU();
              try
              {
                if (((ae)localObject2).fUQ != null)
                  break label530;
                ab.w("MicroMsg.OnlineVideoViewHelper", "parser is null, thread is error.");
              }
              catch (Exception localException1)
              {
                paramlp = new java/lang/StringBuilder;
                paramlp.<init>("deal moov ready error: ");
                ab.e("MicroMsg.OnlineVideoViewHelper", localException1.toString());
              }
            }
            break;
            l2 = localException1.egA;
          }
          label530: if (localException1.fUQ.v(localException1.fUM, l1))
          {
            localException1.fUR = localException1.fUQ.gkm;
            ab.i("MicroMsg.OnlineVideoViewHelper", "mp4 parse moov success. duration %d cdnMediaId %s isFastStart %b", new Object[] { Integer.valueOf(localException1.fUR), localException1.fUL, Boolean.valueOf(bool) });
            if (!bool)
            {
              paramlp = new com/tencent/mm/plugin/sns/ui/ae$1;
              paramlp.<init>(localException1);
              al.d(paramlp);
            }
            if (localException1.fUS == -1);
            for (localException1.fUP = 1; ; localException1.fUP = 2)
            {
              h.pYm.a(354L, 204L, 1L, false);
              break;
            }
          }
          ab.w("MicroMsg.OnlineVideoViewHelper", "mp4 parse moov error. cdnMediaId %s", new Object[] { localException1.fUL });
          o.alm();
          e.k(localException1.fUL, 0, -1);
          h.pYm.a(354L, 205L, 1L, false);
          h.pYm.e(13836, new Object[] { Integer.valueOf(402), Long.valueOf(bo.anT()), "" });
          continue;
          Object localObject3 = OnlineVideoView.k(this.rly);
          Object localObject1 = paramlp.cHq.cHr;
          int i = paramlp.cHq.offset;
          int j = paramlp.cHq.length;
          ((ae)localObject3).fUY = false;
          if ((i < 0) || (j < 0))
            ab.w("MicroMsg.OnlineVideoViewHelper", "deal data available error offset[%d], length[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          while (!((ae)localObject3).ZA((String)localObject1))
          {
            if (paramlp.cHq.length <= 0)
              break;
            this.rly.cV(true);
            break;
          }
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((ae)localObject3).fUL + i + "_" + j;
          localObject1 = (Integer)((ae)localObject3).rlC.get(localObject1);
          if ((localObject1 != null) && (((Integer)localObject1).intValue() > 0))
            ((ae)localObject3).fUV = ((Integer)localObject1).intValue();
          while (true)
          {
            ab.i("MicroMsg.OnlineVideoViewHelper", "deal data available. offset[%d] length[%d] cachePlayTime[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(((ae)localObject3).fUV) });
            break;
            try
            {
              ((ae)localObject3).fUV = ((ae)localObject3).fUQ.cK(i, j);
            }
            catch (Exception localException2)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("deal data available file pos to video time error: ");
              ab.e("MicroMsg.OnlineVideoViewHelper", localException2.toString());
            }
          }
          this.rly.cV(true);
          continue;
          ab.i("MicroMsg.OnlineVideoView", "%d download finish. cdnMediaId %s sendReqCode %d favFromScene %d", new Object[] { Integer.valueOf(this.rly.hashCode()), paramlp.cHq.cHr, Integer.valueOf(OnlineVideoView.s(this.rly)), Integer.valueOf(OnlineVideoView.t(this.rly)) });
          paramlp = OnlineVideoView.k(this.rly);
          ab.i("MicroMsg.OnlineVideoViewHelper", "deal stream finish. playStatus %d cdnMediaId %s", new Object[] { Integer.valueOf(paramlp.fUP), paramlp.fUL });
          paramlp.fUY = false;
          paramlp.fUO = 3;
          h.pYm.a(354L, 206L, 1L, false);
          if (paramlp.fUP == 0)
          {
            ab.w("MicroMsg.OnlineVideoViewHelper", "it had not moov callback and download finish start to play video.");
            paramlp.csl();
          }
          while (true)
          {
            if (OnlineVideoView.s(this.rly) <= 0)
              break label1250;
            OnlineVideoView.n(this.rly);
            OnlineVideoView.b(this.rly, OnlineVideoView.s(this.rly));
            break;
            if (paramlp.fUP == 5)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>("it had play error, it request all video data finish, start to play.");
              ab.w("MicroMsg.OnlineVideoViewHelper", paramlp.fUL);
              paramlp.csl();
            }
          }
          label1250: if (OnlineVideoView.t(this.rly) > 0)
          {
            OnlineVideoView.n(this.rly);
            OnlineVideoView.b(this.rly, OnlineVideoView.t(this.rly), OnlineVideoView.u(this.rly));
          }
          else if (OnlineVideoView.v(this.rly))
          {
            OnlineVideoView.n(this.rly);
            OnlineVideoView.w(this.rly);
          }
          else
          {
            this.rly.cV(true);
            continue;
            if (OnlineVideoView.j(this.rly) == 1)
            {
              localObject3 = OnlineVideoView.k(this.rly);
              localObject1 = paramlp.cHq.cHr;
              i = paramlp.cHq.offset;
              j = paramlp.cHq.length;
              if (((ae)localObject3).ZA((String)localObject1))
              {
                ((ae)localObject3).progress = i;
                ((ae)localObject3).total = j;
                ((ae)localObject3).rlE = (((ae)localObject3).progress * 100 / ((ae)localObject3).total);
                ab.i("MicroMsg.OnlineVideoViewHelper", "deal video[%s] progress callback[%d, %d]. downloadedPercent[%d]", new Object[] { ((ae)localObject3).fUL, Integer.valueOf(((ae)localObject3).progress), Integer.valueOf(((ae)localObject3).total), Integer.valueOf(((ae)localObject3).rlE) });
              }
              if (((ae)localObject3).rlE >= 100)
                ((ae)localObject3).fUO = 3;
            }
            else if (OnlineVideoView.j(this.rly) == 2)
            {
              OnlineVideoView.a(this.rly, paramlp.cHq.offset, paramlp.cHq.length);
              continue;
              paramlp = OnlineVideoView.k(this.rly);
              ab.i("MicroMsg.OnlineVideoViewHelper", "deal had dup video. cdnMediaId %s", new Object[] { paramlp.fUL });
              paramlp.csl();
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView.5
 * JD-Core Version:    0.6.2
 */