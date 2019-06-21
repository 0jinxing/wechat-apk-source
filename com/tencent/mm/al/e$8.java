package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.g.a.lp.a;
import com.tencent.mm.i.h.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.modelvideo.y.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class e$8
  implements Runnable
{
  e$8(e parame, String paramString, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    boolean bool = false;
    AppMethodBeat.i(50565);
    com.tencent.mm.i.h localh = (com.tencent.mm.i.h)this.fzs.fyM.get(this.IN);
    if (localh != null)
    {
      localh.egJ = this.fzv;
      if (localh.egK != null)
      {
        localh.egK.onMoovReady(this.IN, this.fzv, this.fzw);
        AppMethodBeat.o(50565);
      }
    }
    while (true)
    {
      return;
      if (r.ua(localh.field_fullpath))
      {
        ab.w("MicroMsg.OnlineVideoService", "it is qt video, need finish all file. isPlayMode" + localh.egD);
        if (localh.egD == 1)
        {
          e.k(localh.field_mediaId, 0, localh.field_totalLen);
          com.tencent.mm.plugin.report.service.h.pYm.a(354L, 19L, 1L, false);
        }
        AppMethodBeat.o(50565);
      }
      else
      {
        lp locallp = new lp();
        locallp.cHq.cAd = 1;
        locallp.cHq.retCode = 0;
        locallp.cHq.cHr = this.IN;
        locallp.cHq.offset = this.fzv;
        locallp.cHq.length = this.fzw;
        locallp.cHq.cHs = localh.egA;
        Object localObject = locallp.cHq;
        if (localh.initialDownloadLength > 0)
          bool = true;
        ((lp.a)localObject).cHt = bool;
        a.xxA.m(locallp);
        localObject = u.ut(localh.filename);
        if (localObject != null)
        {
          ab.i("MicroMsg.OnlineVideoService", "on moov ready info: " + ((s)localObject).getFileName() + " status : " + ((s)localObject).status);
          if (((s)localObject).status == 130)
          {
            AppMethodBeat.o(50565);
          }
          else if (((s)localObject).status != 122)
          {
            localObject = u.ut(localh.filename);
            if (localObject != null)
            {
              ((s)localObject).status = 121;
              ((s)localObject).bJt = 256;
              o.all().c((s)localObject);
            }
            if (localh.egD == 0)
            {
              ab.i("MicroMsg.OnlineVideoService", "stop download video");
              o.alq().alG();
              o.alq().run();
            }
          }
        }
        else
        {
          AppMethodBeat.o(50565);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.e.8
 * JD-Core Version:    0.6.2
 */