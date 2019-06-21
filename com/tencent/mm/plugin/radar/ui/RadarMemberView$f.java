package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.l;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"})
final class RadarMemberView$f
  implements View.OnTouchListener
{
  RadarMemberView$f(RadarMemberView paramRadarMemberView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(102952);
    if (paramView != RadarMemberView.b(this.pCy))
    {
      j.o(paramMotionEvent, "event");
      if ((paramMotionEvent.getAction() == 1) && (this.pCy.isShowing()))
        this.pCy.dismiss();
    }
    AppMethodBeat.o(102952);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarMemberView.f
 * JD-Core Version:    0.6.2
 */