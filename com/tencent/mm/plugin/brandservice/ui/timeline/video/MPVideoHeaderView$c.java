package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMNeat7extView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoHeaderView$c
  implements View.OnClickListener
{
  MPVideoHeaderView$c(MPVideoHeaderView paramMPVideoHeaderView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15252);
    MPVideoHeaderView.a(this.jXL).setVisibility(8);
    MPVideoHeaderView.b(this.jXL).setMaxLines(2147483647);
    MPVideoHeaderView.b(this.jXL).requestLayout();
    AppMethodBeat.o(15252);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoHeaderView.c
 * JD-Core Version:    0.6.2
 */