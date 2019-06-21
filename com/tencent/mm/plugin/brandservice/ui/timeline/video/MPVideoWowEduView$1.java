package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import a.v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoWowEduView$1
  implements View.OnClickListener
{
  MPVideoWowEduView$1(MPVideoWowEduView paramMPVideoWowEduView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15272);
    MPVideoWowEduView.a(this.jXT).setVisibility(8);
    paramView = MPVideoWowEduView.a(this.jXT).getParent();
    j.o(paramView, "root.parent");
    paramView = paramView.getParent();
    if (paramView == null)
    {
      paramView = new v("null cannot be cast to non-null type android.view.ViewGroup");
      AppMethodBeat.o(15272);
      throw paramView;
    }
    ((ViewGroup)paramView).setVisibility(8);
    AppMethodBeat.o(15272);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoWowEduView.1
 * JD-Core Version:    0.6.2
 */