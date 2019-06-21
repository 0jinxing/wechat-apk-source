package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.k;
import com.tencent.mm.plugin.topstory.ui.video.n;
import com.tencent.mm.plugin.topstory.ui.video.o;
import com.tencent.mm.plugin.topstory.ui.video.r;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.chy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class e$3
  implements h.b
{
  e$3(e parame)
  {
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(1880);
    ab.e("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError errorMsg=%s what=%d extra=%d", new Object[] { paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString2 = e.x(this.sFU).cGg().FL(e.w(this.sFU).cFY());
    int j;
    if ((paramString2 != null) && (paramString2.xhb != null))
    {
      ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError, change url, errno:%s, urlListSize:%s, curUrl:%s, curVt:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramString2.xhb.size()), paramString2.videoUrl, Integer.valueOf(paramString2.xhg) });
      j = 0;
      if (j < paramString2.xhb.size())
      {
        chy localchy = (chy)paramString2.xhb.get(j);
        if (paramString2.videoUrl.equals(localchy.url))
        {
          if (j + 1 >= paramString2.xhb.size())
            break label313;
          j++;
          localchy = (chy)paramString2.xhb.get(j);
          if ((localchy == null) || (bo.isNullOrNil(localchy.url)))
            break label313;
          paramString2.xhg = localchy.xhg;
          paramString2.videoUrl = localchy.url;
          ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onError, change url succ, nextIndex:%s, nextUrl:%s, nextVt:%s", new Object[] { Integer.valueOf(j), localchy.url, Integer.valueOf(localchy.xhg) });
          com.tencent.mm.plugin.websearch.api.a.b.kT(com.tencent.mm.plugin.websearch.api.a.b.ubZ);
          this.sFU.postDelayed(new e.3.1(this), 100L);
          AppMethodBeat.o(1880);
        }
      }
    }
    while (true)
    {
      return;
      j++;
      break;
      label313: e.A(this.sFU).cGg().a(e.y(this.sFU).cFT(), e.z(this.sFU).cFY());
      this.sFU.gE(this.sFU.getContext().getString(2131304246, new Object[] { paramInt1 + ":" + paramInt2 }), this.sFU.getContext().getString(2131304271));
      this.sFU.getFSVideoUIComponent().cFV().onError(paramString1);
      com.tencent.mm.plugin.topstory.a.h.Fz(paramInt1);
      paramString1 = this.sFU.getFSVideoUIComponent().cFR().sFp;
      paramInt2 = i;
      if (paramString1 != null)
      {
        paramInt2 = i;
        if (paramString1.sAE > 0L)
          paramInt2 = (int)(System.currentTimeMillis() - paramString1.sAE) / 1000;
      }
      com.tencent.mm.plugin.topstory.a.h.a(paramString2, paramInt1, paramString3, paramInt2);
      AppMethodBeat.o(1880);
    }
  }

  public final void cp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(1881);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onPrepared");
    e.B(this.sFU).aFY();
    if (!e.C(this.sFU))
      this.sFU.cGp();
    AppMethodBeat.o(1881);
  }

  public final void cq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(1882);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoEnded");
    this.sFU.getFSVideoUIComponent().cFV().abK(paramString1);
    this.sFU.getFSVideoUIComponent().cFR().sFo = 1;
    int i = this.sFU.getFSVideoUIComponent().cGk();
    ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "clicfg_topstory_v_video_play  %s", new Object[] { Integer.valueOf(i) });
    if ((i == 1) && (this.sFU.getFSVideoUIComponent().cGb()) && ((e.D(this.sFU) instanceof j)));
    try
    {
      Thread.sleep(100L);
      ((j)e.E(this.sFU)).mc(true);
      ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "VVideoAutoPlay replay succ");
      bool = true;
      if ((bool) || (!(e.G(this.sFU) instanceof com.tencent.mm.plugin.topstory.ui.video.h)));
    }
    catch (InterruptedException paramString1)
    {
      try
      {
        while (true)
        {
          Thread.sleep(100L);
          label166: ((com.tencent.mm.plugin.topstory.ui.video.h)e.H(this.sFU)).mc(true);
          e.a(this.sFU, false);
          AppMethodBeat.o(1882);
          return;
          boolean bool = this.sFU.getFSVideoUIComponent().FC(e.F(this.sFU).cFP() + 1);
        }
        paramString1 = paramString1;
      }
      catch (InterruptedException paramString1)
      {
        break label166;
      }
    }
  }

  public final void cr(String paramString1, String paramString2)
  {
  }

  public final void cs(String paramString1, String paramString2)
  {
  }

  public final void ct(String paramString1, String paramString2)
  {
    AppMethodBeat.i(1884);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoWaiting");
    e.a(this.sFU, true);
    AppMethodBeat.o(1884);
  }

  public final void cu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(1885);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onVideoWaitingEnd");
    e.a(this.sFU, false);
    this.sFU.cGp();
    paramString1 = this.sFU.getFSVideoUIComponent().cFR().sFp;
    if ((paramString1 != null) && (paramString1.sAP == 0L))
    {
      paramString1.sAP = (System.currentTimeMillis() - paramString1.sAE);
      ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "FirstLoadTime %d %d", new Object[] { Long.valueOf(paramString1.sAM), Long.valueOf(paramString1.sAP) });
    }
    AppMethodBeat.o(1885);
  }

  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1883);
    ab.i("MicroMsg.TopStory.TopStoryFSVideoContainer", "onGetVideoSize width=%d height=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(1883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.3
 * JD-Core Version:    0.6.2
 */