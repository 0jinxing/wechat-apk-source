package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

class lh$1
  implements Animation.AnimationListener
{
  lh$1(lh paramlh)
  {
  }

  public void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(100360);
    if (lh.a(this.a) != null)
      lh.a(this.a).setVisibility(8);
    AppMethodBeat.o(100360);
  }

  public void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public void onAnimationStart(Animation paramAnimation)
  {
    AppMethodBeat.i(100359);
    if (lh.a(this.a) != null)
      lh.a(this.a).setVisibility(0);
    AppMethodBeat.o(100359);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lh.1
 * JD-Core Version:    0.6.2
 */