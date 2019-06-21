package com.tencent.mm.plugin.appbrand.page;

import a.l;
import android.view.animation.Animation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$show$1", "Lcom/tencent/mm/ui/widget/MMAnimationListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "plugin-appbrand-integration_release"})
public final class f$d extends c
{
  f$d(Runnable paramRunnable)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(134766);
    f.a(this.ire);
    paramAnimation = this.irh;
    if (paramAnimation != null)
    {
      paramAnimation.run();
      AppMethodBeat.o(134766);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134766);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.f.d
 * JD-Core Version:    0.6.2
 */