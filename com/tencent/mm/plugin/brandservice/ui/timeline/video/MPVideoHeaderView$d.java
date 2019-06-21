package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.jz;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class MPVideoHeaderView$d
  implements View.OnClickListener
{
  MPVideoHeaderView$d(MPVideoHeaderView paramMPVideoHeaderView, jz paramjz)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(15254);
    if (this.jXO.vMP == 1)
    {
      MPVideoHeaderView.e(this.jXL).ao(2, "");
      AppMethodBeat.o(15254);
    }
    while (true)
    {
      return;
      MPVideoHeaderView.e(this.jXL).ao(1, "");
      MPVideoHeaderView.f(this.jXL);
      AppMethodBeat.o(15254);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.MPVideoHeaderView.d
 * JD-Core Version:    0.6.2
 */