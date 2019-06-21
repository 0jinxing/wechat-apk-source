package com.tencent.mm.plugin.topstory.ui.video.list;

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

final class f$6
  implements h.b
{
  f$6(f paramf)
  {
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(2041);
    ab.e("MicroMsg.TopStory.TopStoryListVideoContainer", "onError errorMsg=%s what=%d extra=%d", new Object[] { paramString3, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    int j;
    if (paramInt1 != 0)
    {
      paramString2 = f.p(this.sGV).cGg().FL(f.o(this.sGV).cFY());
      if ((paramString2 != null) && (paramString2.xhb != null))
      {
        ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onError, change url, errno:%s, urlListSize:%s, curUrl:%s, curVt:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramString2.xhb.size()), paramString2.videoUrl, Integer.valueOf(paramString2.xhg) });
        j = 0;
        if (j < paramString2.xhb.size())
        {
          chy localchy = (chy)paramString2.xhb.get(j);
          if (paramString2.videoUrl.equals(localchy.url))
          {
            if (j + 1 >= paramString2.xhb.size())
              break label318;
            j++;
            localchy = (chy)paramString2.xhb.get(j);
            if ((localchy == null) || (bo.isNullOrNil(localchy.url)))
              break label318;
            paramString2.xhg = localchy.xhg;
            paramString2.videoUrl = localchy.url;
            ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onError, change url succ, nextIndex:%s, nextUrl:%s, nextVt:%s", new Object[] { Integer.valueOf(j), localchy.url, Integer.valueOf(localchy.xhg) });
            com.tencent.mm.plugin.websearch.api.a.b.kT(com.tencent.mm.plugin.websearch.api.a.b.ubZ);
            this.sGV.postDelayed(new f.6.1(this), 100L);
            AppMethodBeat.o(2041);
          }
        }
      }
    }
    while (true)
    {
      return;
      j++;
      break;
      label318: f.s(this.sGV).cGg().a(f.q(this.sGV).cFT(), f.r(this.sGV).cFY());
      this.sGV.gE(this.sGV.getContext().getString(2131304246, new Object[] { paramInt1 + ":" + paramInt2 }), this.sGV.getContext().getString(2131304271));
      this.sGV.getListVideoUIComponent().cFV().onError(paramString1);
      com.tencent.mm.plugin.topstory.a.h.Fz(paramInt1);
      paramString1 = this.sGV.getListVideoUIComponent().cFR().sFp;
      paramInt2 = i;
      if (paramString1 != null)
      {
        paramInt2 = i;
        if (paramString1.sAE > 0L)
          paramInt2 = (int)(System.currentTimeMillis() - paramString1.sAE) / 1000;
      }
      com.tencent.mm.plugin.topstory.a.h.a(f.t(this.sGV), paramInt1, paramString3, paramInt2);
      AppMethodBeat.o(2041);
    }
  }

  public final void cp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(2042);
    ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onPrepared");
    f.u(this.sGV).aFY();
    if (!f.v(this.sGV))
      this.sGV.cGp();
    AppMethodBeat.o(2042);
  }

  public final void cq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(2043);
    ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoEnded, pos:%s, listpos:%s", new Object[] { Integer.valueOf(f.w(this.sGV).cFP()), Integer.valueOf(f.x(this.sGV).cFP()) });
    this.sGV.getListVideoUIComponent().cFV().abK(paramString1);
    this.sGV.getListVideoUIComponent().cFR().sFo = 1;
    if ((!this.sGV.getListVideoUIComponent().FC(f.y(this.sGV).cFP() + 1)) && ((f.z(this.sGV) instanceof com.tencent.mm.plugin.topstory.ui.video.h)));
    try
    {
      Thread.sleep(100L);
      label134: ((com.tencent.mm.plugin.topstory.ui.video.h)f.A(this.sGV)).mc(true);
      f.g(this.sGV).setVisibility(8);
      f.a(this.sGV, false);
      AppMethodBeat.o(2043);
      return;
    }
    catch (InterruptedException paramString1)
    {
      break label134;
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
    AppMethodBeat.i(2045);
    ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoWaiting");
    f.a(this.sGV, true);
    AppMethodBeat.o(2045);
  }

  public final void cu(String paramString1, String paramString2)
  {
    AppMethodBeat.i(2046);
    ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onVideoWaitingEnd");
    f.a(this.sGV, false);
    f.g(this.sGV).setVisibility(8);
    this.sGV.cGp();
    paramString1 = this.sGV.getListVideoUIComponent().cFR().sFp;
    if ((paramString1 != null) && (paramString1.sAP == 0L))
    {
      paramString1.sAP = (System.currentTimeMillis() - paramString1.sAE);
      ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "FirstLoadTime %d %d", new Object[] { Long.valueOf(paramString1.sAM), Long.valueOf(paramString1.sAP) });
    }
    AppMethodBeat.o(2046);
  }

  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2044);
    ab.i("MicroMsg.TopStory.TopStoryListVideoContainer", "onGetVideoSize width=%d height=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(2044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.f.6
 * JD-Core Version:    0.6.2
 */