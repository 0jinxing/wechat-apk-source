package com.tencent.mm.plugin.radar.ui;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class RadarTipsView$c
  implements View.OnClickListener
{
  RadarTipsView$c(RadarTipsView paramRadarTipsView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(103054);
    ab.d(RadarTipsView.access$getTAG$cp(), "noviceEducationTips onclick");
    this.pDI.cdO();
    AppMethodBeat.o(103054);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarTipsView.c
 * JD-Core Version:    0.6.2
 */