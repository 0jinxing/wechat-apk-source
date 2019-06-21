package com.tencent.mm.plugin.radar.ui;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bpb;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class RadarMemberView$e
  implements View.OnClickListener
{
  RadarMemberView$e(RadarMemberView paramRadarMemberView, bpb parambpb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(102951);
    if ((this.pCy.getState() == null) || (RadarMemberView.a(this.pCy) == null))
      AppMethodBeat.o(102951);
    while (true)
    {
      return;
      paramView = RadarMemberView.a(this.pCy);
      if (paramView != null)
        paramView.a(this.pCz, this.pCy.getState());
      this.pCy.dismiss();
      AppMethodBeat.o(102951);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarMemberView.e
 * JD-Core Version:    0.6.2
 */