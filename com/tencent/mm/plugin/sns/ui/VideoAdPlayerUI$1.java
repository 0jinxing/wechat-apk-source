package com.tencent.mm.plugin.sns.ui;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.d;
import com.tencent.mm.modelstat.i;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.a;
import com.tencent.mm.plugin.sns.a.b.a.a;
import com.tencent.mm.plugin.sns.a.b.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class VideoAdPlayerUI$1
  implements VideoPlayView.a
{
  VideoAdPlayerUI$1(VideoAdPlayerUI paramVideoAdPlayerUI)
  {
  }

  public final void CG(int paramInt)
  {
    AppMethodBeat.i(39911);
    if (VideoAdPlayerUI.i(this.rEw) == 0)
    {
      VideoAdPlayerUI.a(this.rEw, paramInt);
      VideoAdPlayerUI.j(this.rEw).rEd = paramInt;
    }
    AppMethodBeat.o(39911);
  }

  public final void clr()
  {
    AppMethodBeat.i(39908);
    VideoAdPlayerUI.d(this.rEw).cy(false);
    a locala = VideoAdPlayerUI.a(this.rEw).qEs;
    locala.qFq += (int)bo.az(VideoAdPlayerUI.a(this.rEw).qEs.qFu);
    VideoAdPlayerUI.a(this.rEw, false);
    AppMethodBeat.o(39908);
  }

  public final void cls()
  {
    AppMethodBeat.i(39909);
    ab.i("MicroMsg.VideoPlayerUI", "onPlayCompletion");
    Object localObject = VideoAdPlayerUI.a(this.rEw).qEs;
    ((a)localObject).qFp += 1;
    VideoAdPlayerUI.a(this.rEw, false);
    if (VideoAdPlayerUI.e(this.rEw) != 0)
    {
      localObject = new i(13227, "1,2," + VideoAdPlayerUI.i(this.rEw) + "," + VideoAdPlayerUI.f(this.rEw) + "," + VideoAdPlayerUI.g(this.rEw) + "," + bo.anT() + "," + VideoAdPlayerUI.h(this.rEw) + "," + VideoAdPlayerUI.i(this.rEw), (int)bo.anT());
      g.RQ();
      g.RO().eJo.a((m)localObject, 0);
    }
    AppMethodBeat.o(39909);
  }

  public final void clt()
  {
    AppMethodBeat.i(39910);
    ab.i("MicroMsg.VideoPlayerUI", "onPlayDownloadedPartComplete");
    VideoAdPlayerUI.a(this.rEw, false);
    VideoAdPlayerUI.c(this.rEw).clo();
    AppMethodBeat.o(39910);
  }

  public final void kC(boolean paramBoolean)
  {
    AppMethodBeat.i(39907);
    Object localObject;
    if (paramBoolean)
    {
      localObject = VideoAdPlayerUI.a(this.rEw).qEs;
      if (this.rEw.getResources().getConfiguration().orientation != 2)
        break label301;
    }
    label301: for (int i = 2; ; i = 1)
    {
      ((a)localObject).qFt = i;
      VideoAdPlayerUI.a(this.rEw).qEs.qFu = bo.yz();
      VideoAdPlayerUI.a(this.rEw).qEs.qFs = 2;
      VideoAdPlayerUI.a(this.rEw).qEs.qFq = 0;
      if ((!VideoAdPlayerUI.b(this.rEw)) && ((int)VideoAdPlayerUI.c(this.rEw).getLastProgresstime() == 0))
      {
        localObject = VideoAdPlayerUI.a(this.rEw).qEs;
        ((a)localObject).qFo += 1;
      }
      VideoAdPlayerUI.a(this.rEw).qEs.qFu = bo.yz();
      VideoAdPlayerUI.d(this.rEw).a(VideoAdPlayerUI.c(this.rEw));
      if (VideoAdPlayerUI.e(this.rEw) != 0)
      {
        localObject = new i(13227, "1,1,0," + VideoAdPlayerUI.f(this.rEw) + "," + VideoAdPlayerUI.g(this.rEw) + "," + bo.anT() + "," + VideoAdPlayerUI.h(this.rEw) + "," + VideoAdPlayerUI.i(this.rEw), (int)bo.anT());
        g.RQ();
        g.RO().eJo.a((m)localObject, 0);
      }
      VideoAdPlayerUI.a(this.rEw, true);
      AppMethodBeat.o(39907);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.1
 * JD-Core Version:    0.6.2
 */