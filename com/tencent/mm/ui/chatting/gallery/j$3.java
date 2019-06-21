package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.e;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.g.a.lp.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.a.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class j$3 extends c<lp>
{
  j$3(j paramj)
  {
    AppMethodBeat.i(32316);
    this.xxI = lp.class.getName().hashCode();
    AppMethodBeat.o(32316);
  }

  private boolean a(lp paramlp)
  {
    AppMethodBeat.i(32317);
    if (!j.f(this.yWZ).ZA(paramlp.cHq.cHr))
      AppMethodBeat.o(32317);
    while (true)
    {
      return false;
      if ((paramlp.cHq.retCode == 0) || (paramlp.cHq.retCode == -21006))
        break;
      ab.w("MicroMsg.Imagegallery.handler.video", "stream download online video error. retCode: " + paramlp.cHq.retCode);
      j.a(this.yWZ, paramlp.cHq.cHr, paramlp.cHq.retCode);
      AppMethodBeat.o(32317);
    }
    switch (paramlp.cHq.cAd)
    {
    default:
      ab.w("MicroMsg.Imagegallery.handler.video", "unknown event opcode " + paramlp.cHq.cAd);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(32317);
      break;
      Object localObject1 = j.f(this.yWZ);
      long l1 = paramlp.cHq.offset;
      long l2 = paramlp.cHq.cHs;
      boolean bool = paramlp.cHq.cHt;
      ab.i("MicroMsg.OnlineVideoUIHelper", "deal moov ready moovPos[%d] needSeekTime[%d] timeDuration[%d] startDownload[%d %d]", new Object[] { Long.valueOf(l1), Integer.valueOf(((m)localObject1).fUS), Integer.valueOf(((m)localObject1).fUR), Long.valueOf(l2), Long.valueOf(((m)localObject1).egA) });
      if (((m)localObject1).fUR != 0)
        ab.w("MicroMsg.OnlineVideoUIHelper", "moov had callback, do nothing.");
      while (true)
      {
        j.a(this.yWZ, true);
        break;
        if (l2 > ((m)localObject1).egA);
        while (true)
        {
          while (true)
          {
            ((m)localObject1).egA = l2;
            h.pYm.a(354L, 5L, 1L, false);
            ((m)localObject1).rlG = bo.anU();
            o.all();
            paramlp = t.uh(((m)localObject1).filename);
            try
            {
              if (((m)localObject1).fUQ != null)
                break label428;
              ab.w("MicroMsg.OnlineVideoUIHelper", "parser is null, thread is error.");
            }
            catch (Exception paramlp)
            {
              ab.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", paramlp, "", new Object[0]);
              ab.e("MicroMsg.OnlineVideoUIHelper", "deal moov ready error: " + paramlp.toString());
            }
          }
          break;
          l2 = ((m)localObject1).egA;
        }
        label428: if (((m)localObject1).fUQ.v(paramlp, l1))
        {
          ((m)localObject1).fUR = ((m)localObject1).fUQ.gkm;
          ab.i("MicroMsg.OnlineVideoUIHelper", "mp4 parse moov success. duration %d filename %s isFastStart %b", new Object[] { Integer.valueOf(((m)localObject1).fUR), ((m)localObject1).filename, Boolean.valueOf(bool) });
          if (!bool)
          {
            paramlp = new com/tencent/mm/ui/chatting/gallery/m$1;
            paramlp.<init>((m)localObject1);
            al.d(paramlp);
          }
          if (((m)localObject1).fUS == -1);
          for (((m)localObject1).fUP = 1; ; ((m)localObject1).fUP = 2)
          {
            h.pYm.a(354L, 7L, 1L, false);
            break;
          }
        }
        ab.w("MicroMsg.OnlineVideoUIHelper", "mp4 parse moov error.");
        o.alm();
        e.k(((m)localObject1).cHr, 0, -1);
        u.af(((m)localObject1).filename, 15);
        h.pYm.a(354L, 8L, 1L, false);
        ab.w("MicroMsg.OnlineVideoUIHelper", "%d rpt parse moov fail %s ", new Object[] { Integer.valueOf(localObject1.hashCode()), ((m)localObject1).filename });
        h.pYm.e(13836, new Object[] { Integer.valueOf(302), Long.valueOf(bo.anT()), "" });
      }
      localObject1 = j.f(this.yWZ);
      Object localObject2 = paramlp.cHq.cHr;
      int i = paramlp.cHq.offset;
      int j = paramlp.cHq.length;
      ((m)localObject1).fUY = false;
      if ((i < 0) || (j < 0))
        ab.w("MicroMsg.OnlineVideoUIHelper", "deal data available error offset[%d], length[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      while (!((m)localObject1).ZA((String)localObject2))
      {
        if (paramlp.cHq.length <= 0)
          break;
        this.yWZ.cV(true);
        break;
      }
      localObject2 = ((m)localObject1).cHr + i + "_" + j;
      localObject2 = (Integer)((m)localObject1).rlC.get(localObject2);
      if ((localObject2 != null) && (((Integer)localObject2).intValue() > 0))
        ((m)localObject1).fUV = ((Integer)localObject2).intValue();
      while (true)
      {
        ab.i("MicroMsg.OnlineVideoUIHelper", "deal data available. offset[%d] length[%d] cachePlayTime[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(((m)localObject1).fUV) });
        break;
        try
        {
          ((m)localObject1).fUV = ((m)localObject1).fUQ.cK(i, j);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.OnlineVideoUIHelper", localException, "", new Object[0]);
          ab.e("MicroMsg.OnlineVideoUIHelper", "deal data available file pos to video time error: " + localException.toString());
        }
      }
      this.yWZ.cV(true);
      continue;
      paramlp = j.f(this.yWZ);
      ab.i("MicroMsg.OnlineVideoUIHelper", "deal stream finish. playStatus %d ", new Object[] { Integer.valueOf(paramlp.fUP) });
      paramlp.fUY = false;
      paramlp.fUO = 3;
      if (paramlp.fUP == 0)
      {
        ab.w("MicroMsg.OnlineVideoUIHelper", "it had not moov callback and download finish start to play video.");
        paramlp.csl();
        h.pYm.a(354L, 6L, 1L, false);
      }
      while (true)
      {
        paramlp.dGM();
        h.pYm.a(354L, 26L, 1L, false);
        this.yWZ.cV(true);
        break;
        if (paramlp.fUP == 5)
        {
          ab.w("MicroMsg.OnlineVideoUIHelper", "it had play error, it request all video data finish, start to play." + paramlp.cHr);
          paramlp.csl();
        }
      }
      m localm = j.f(this.yWZ);
      localObject1 = paramlp.cHq.cHr;
      j = paramlp.cHq.offset;
      if (localm.ZA((String)localObject1))
      {
        localm.rlE = (j * 100 / localm.gUm);
        ab.i("MicroMsg.OnlineVideoUIHelper", "deal progress callback. downloadedPercent : " + localm.rlE);
      }
      if (localm.rlE >= 100)
      {
        localm.fUO = 3;
        continue;
        paramlp = j.f(this.yWZ);
        ab.i("MicroMsg.OnlineVideoUIHelper", "deal had dup video.");
        paramlp.dGM();
        paramlp.csl();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.3
 * JD-Core Version:    0.6.2
 */