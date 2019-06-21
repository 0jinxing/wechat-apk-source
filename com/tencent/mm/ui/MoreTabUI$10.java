package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.api.AbsStoryGallery;
import com.tencent.mm.plugin.story.api.AbsStoryMuteView;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.listview.PullDownListView.a;

final class MoreTabUI$10
  implements PullDownListView.a
{
  MoreTabUI$10(MoreTabUI paramMoreTabUI)
  {
  }

  public final void AU(int paramInt)
  {
    AppMethodBeat.i(29710);
    if (MoreTabUI.i(this.yoD) != null)
      MoreTabUI.i(this.yoD).EF(paramInt);
    AppMethodBeat.o(29710);
  }

  public final void AV(int paramInt)
  {
    AppMethodBeat.i(29711);
    if (MoreTabUI.i(this.yoD) != null)
      MoreTabUI.i(this.yoD).EG(paramInt);
    AppMethodBeat.o(29711);
  }

  public final void AW(int paramInt)
  {
    AppMethodBeat.i(29712);
    if (MoreTabUI.i(this.yoD) != null)
      MoreTabUI.i(this.yoD).AW(paramInt);
    AppMethodBeat.o(29712);
  }

  public final void caI()
  {
    AppMethodBeat.i(29705);
    if (MoreTabUI.i(this.yoD) == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.MoreTabUI", "story_cat onPostClose, storyGallery is null?:%s", new Object[] { Boolean.valueOf(bool) });
      if (MoreTabUI.i(this.yoD) != null)
      {
        MoreTabUI.i(this.yoD).lr(true);
        MoreTabUI.i(this.yoD).post(new MoreTabUI.10.1(this));
      }
      MoreTabUI.a(this.yoD, false);
      MoreTabUI.r(this.yoD);
      MoreTabUI.s(this.yoD).caH();
      if ((MoreTabUI.t(this.yoD)) && (!MoreTabUI.m(this.yoD)))
      {
        long l = System.currentTimeMillis();
        h localh = h.scu;
        h.lq(l);
        localh = h.scu;
        h.cAJ().cZm = l;
      }
      AppMethodBeat.o(29705);
      return;
    }
  }

  public final void caJ()
  {
    AppMethodBeat.i(29706);
    if (MoreTabUI.i(this.yoD) != null)
      MoreTabUI.i(this.yoD).cwK();
    if ((MoreTabUI.t(this.yoD)) && (!MoreTabUI.m(this.yoD)))
    {
      h localh = h.scu;
      h.cAJ().cZY = System.currentTimeMillis();
      localh = h.scu;
      h.cAK();
    }
    AppMethodBeat.o(29706);
  }

  public final void caK()
  {
    AppMethodBeat.i(29707);
    if (MoreTabUI.i(this.yoD) != null)
      MoreTabUI.i(this.yoD).cwL();
    AppMethodBeat.o(29707);
  }

  public final void caL()
  {
    AppMethodBeat.i(29708);
    ab.i("MicroMsg.MoreTabUI", "story_cat onMuteIn");
    MoreTabUI.u(this.yoD).cwM();
    AppMethodBeat.o(29708);
  }

  public final void caM()
  {
    AppMethodBeat.i(29709);
    MoreTabUI.u(this.yoD).cwN();
    AppMethodBeat.o(29709);
  }

  public final void jM(boolean paramBoolean)
  {
    AppMethodBeat.i(29704);
    if (MoreTabUI.i(this.yoD) == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.MoreTabUI", "story_cat onPostOpen, storyGallery is null?:%s", new Object[] { Boolean.valueOf(bool) });
      if (MoreTabUI.i(this.yoD) != null)
      {
        h localh = h.scu;
        h.cAs().cYQ = 1L;
        localh = h.scu;
        h.cAs().cZT = 1L;
        MoreTabUI.i(this.yoD).K(paramBoolean, true);
        MoreTabUI.a(this.yoD, 8);
        MoreTabUI.j(this.yoD);
        MoreTabUI.k(this.yoD);
      }
      MoreTabUI.a(this.yoD, true);
      MoreTabUI.l(this.yoD);
      if ((!MoreTabUI.m(this.yoD)) && (!MoreTabUI.n(this.yoD)))
      {
        int i = g.RP().Ry().getInt(ac.a.xWP, 0);
        g.RP().Ry().set(ac.a.xWP, Integer.valueOf(i + 1));
        MoreTabUI.o(this.yoD);
      }
      AppMethodBeat.o(29704);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MoreTabUI.10
 * JD-Core Version:    0.6.2
 */