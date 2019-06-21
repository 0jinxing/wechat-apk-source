package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandDesktopDragView$8
  implements ValueAnimator.AnimatorUpdateListener
{
  float iWQ = 0.0F;
  float iWR = 0.0F;

  AppBrandDesktopDragView$8(AppBrandDesktopDragView paramAppBrandDesktopDragView, int paramInt1, int paramInt2)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(133757);
    try
    {
      float f = ((Float)paramValueAnimator.getAnimatedValue("transY")).floatValue();
      this.iWR += f - this.iWQ;
      AppBrandDesktopDragView.f(this.iWO).getBackUpFooterRect().top = ((int)(this.iWS + f));
      ab.v("MicroMsg.AppBrandDesktopDragView", "alvinluo transBackFooterAnim totalValue: %f, top: %d", new Object[] { Float.valueOf(this.iWR), Integer.valueOf(AppBrandDesktopDragView.f(this.iWO).getBackUpFooterRect().top) });
      AppBrandDesktopDragView.f(this.iWO).setExtraBottomHeight(this.iWT - (int)this.iWR);
      AppBrandDesktopDragView.f(this.iWO).requestLayout();
      this.iWQ = f;
      if (AppBrandDesktopDragView.f(this.iWO).getParent() != null)
        ((ViewGroup)AppBrandDesktopDragView.f(this.iWO).getParent()).invalidate();
      AppMethodBeat.o(133757);
      return;
    }
    catch (Exception paramValueAnimator)
    {
      while (true)
        AppMethodBeat.o(133757);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView.8
 * JD-Core Version:    0.6.2
 */