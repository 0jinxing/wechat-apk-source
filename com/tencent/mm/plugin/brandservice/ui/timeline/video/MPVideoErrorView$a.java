package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoErrorView$a
  implements View.OnClickListener
{
  MPVideoErrorView$a(MPVideoErrorView paramMPVideoErrorView, b paramb, f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15247);
    this.jXr.setVisibility(8);
    this.jXs.aYm();
    paramView = this.jXt;
    if (paramView != null)
    {
      paramView.jYH = false;
      if (paramView.enable)
      {
        paramView = paramView.jYF;
        if (paramView == null)
          j.avw("animationView");
        paramView.setVisibility(0);
      }
      AppMethodBeat.o(15247);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(15247);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoErrorView.a
 * JD-Core Version:    0.6.2
 */