package com.tencent.mm.ui;

import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.story.api.AbsStoryGallery;
import com.tencent.mm.plugin.story.api.e;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.listview.PullDownListView;

final class MoreTabUI$b
{
  private int status = 2;

  private MoreTabUI$b(MoreTabUI paramMoreTabUI)
  {
  }

  public final void Nr(int paramInt)
  {
    AppMethodBeat.i(29716);
    ab.i("MicroMsg.MoreTabUI", "forceToStatus %s", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt == 0)
      MoreTabUI.d(this.yoD, true);
    while (true)
    {
      this.status = paramInt;
      caH();
      AppMethodBeat.o(29716);
      return;
      MoreTabUI.d(this.yoD, false);
    }
  }

  public final void caH()
  {
    AppMethodBeat.i(29714);
    if (this.yoD.getActivity() == null)
    {
      AppMethodBeat.o(29714);
      return;
    }
    switch (this.status)
    {
    default:
    case 1:
    case 0:
    case 2:
    }
    while (true)
    {
      label52: AppMethodBeat.o(29714);
      break;
      MoreTabUI.h(this.yoD).setSupportOverscroll(true);
      MoreTabUI.o(this.yoD);
      if (MoreTabUI.n(this.yoD))
        MoreTabUI.h(this.yoD).setBackgroundResource(2130839497);
      while (true)
      {
        if (MoreTabUI.i(this.yoD) != null)
        {
          ((RelativeLayout.LayoutParams)MoreTabUI.i(this.yoD).getLayoutParams()).topMargin = MoreTabUI.v(this.yoD);
          MoreTabUI.h(this.yoD).x(MoreTabUI.i(this.yoD), MoreTabUI.w(this.yoD), MoreTabUI.v(this.yoD));
        }
        MoreTabUI.h(this.yoD).setMuteView(null);
        MoreTabUI.c(this.yoD, MoreTabUI.m(this.yoD));
        MoreTabUI.a(this.yoD, 0);
        MoreTabUI.b(this.yoD, MoreTabUI.m(this.yoD));
        if (MoreTabUI.x(this.yoD) == null)
          break label52;
        MoreTabUI.x(this.yoD).ad(MoreTabUI.m(this.yoD), MoreTabUI.n(this.yoD));
        AppMethodBeat.o(29714);
        break;
        MoreTabUI.h(this.yoD).setBackgroundResource(2130839495);
      }
      MoreTabUI.h(this.yoD).setBackgroundResource(2130839495);
      MoreTabUI.h(this.yoD).setSupportOverscroll(MoreTabUI.m(this.yoD));
      MoreTabUI.y(this.yoD);
      MoreTabUI.b(this.yoD, a.am(this.yoD.getContext(), 2131428603));
      if (MoreTabUI.i(this.yoD) != null)
      {
        ((RelativeLayout.LayoutParams)MoreTabUI.i(this.yoD).getLayoutParams()).topMargin = MoreTabUI.z(this.yoD);
        MoreTabUI.h(this.yoD).x(MoreTabUI.i(this.yoD), MoreTabUI.w(this.yoD), MoreTabUI.z(this.yoD));
      }
      MoreTabUI.h(this.yoD).setMuteView(MoreTabUI.u(this.yoD));
      MoreTabUI.c(this.yoD, MoreTabUI.m(this.yoD));
      MoreTabUI.a(this.yoD, 0);
      MoreTabUI.b(this.yoD, MoreTabUI.m(this.yoD));
      if (MoreTabUI.x(this.yoD) != null)
      {
        MoreTabUI.x(this.yoD).ad(MoreTabUI.m(this.yoD), MoreTabUI.n(this.yoD));
        AppMethodBeat.o(29714);
        break;
        MoreTabUI.h(this.yoD).setBackgroundResource(2130839497);
        MoreTabUI.h(this.yoD).setSupportOverscroll(MoreTabUI.m(this.yoD));
        MoreTabUI.c(this.yoD, MoreTabUI.m(this.yoD));
        MoreTabUI.j(this.yoD);
        if (MoreTabUI.x(this.yoD) != null)
          MoreTabUI.x(this.yoD).ad(MoreTabUI.m(this.yoD), MoreTabUI.n(this.yoD));
      }
    }
  }

  public final void dyU()
  {
    AppMethodBeat.i(29715);
    if ((!n.isShowStoryCheck()) || (MoreTabUI.g(this.yoD)))
    {
      MoreTabUI.d(this.yoD, false);
      this.status = 2;
    }
    while (true)
    {
      ab.i("MicroMsg.MoreTabUI", "checkStoryStatus status=%s", new Object[] { Integer.valueOf(this.status) });
      caH();
      AppMethodBeat.o(29715);
      return;
      if (((e)g.M(e.class)).isStoryExist(r.Yz()))
      {
        MoreTabUI.d(this.yoD, true);
        this.status = 0;
      }
      else
      {
        MoreTabUI.d(this.yoD, false);
        this.status = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MoreTabUI.b
 * JD-Core Version:    0.6.2
 */