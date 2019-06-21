package com.tencent.mm.plugin.appbrand.page;

import a.l;
import android.view.animation.Animation;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.widget.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$dismiss$1", "Lcom/tencent/mm/ui/widget/MMAnimationListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "plugin-appbrand-integration_release"})
public final class f$c extends c
{
  public final void onAnimationEnd(Animation paramAnimation)
  {
    AppMethodBeat.i(134765);
    this.ire.setVisibility(8);
    al.d((Runnable)new f.c.a(this));
    AppMethodBeat.o(134765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.f.c
 * JD-Core Version:    0.6.2
 */