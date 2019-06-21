package com.tencent.mm.plugin.appbrand.page;

import a.l;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import me.imid.swipebacklayout.lib.SwipeBackLayout.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$1", "Lme/imid/swipebacklayout/lib/SwipeBackLayout$SwipeListenerEx;", "onContentViewSwipedBack", "", "onDispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "onEdgeTouch", "edgeFlag", "", "onScrollOverThreshold", "onScrollStateChange", "state", "scrollPercent", "", "onViewReleased", "", "willSwipeBack", "plugin-appbrand-integration_release"})
public final class f$1
  implements SwipeBackLayout.b
{
  public final void aJd()
  {
    AppMethodBeat.i(134762);
    this.ire.setVisibility(8);
    this.ire.post((Runnable)new f.1.a(this));
    AppMethodBeat.o(134762);
  }

  public final boolean ba(boolean paramBoolean)
  {
    return false;
  }

  public final void h(int paramInt, float paramFloat)
  {
  }

  public final void l(MotionEvent paramMotionEvent)
  {
  }

  public final void xv()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.f.1
 * JD-Core Version:    0.6.2
 */