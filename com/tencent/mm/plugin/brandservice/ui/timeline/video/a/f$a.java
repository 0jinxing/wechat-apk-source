package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.f.b.j;
import a.l;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.e;
import com.tencent.mm.ui.tools.e.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/util/MPVideoImageAnimationHelper$handleAnimation$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "plugin-brandservice_release"})
public final class f$a
  implements ViewTreeObserver.OnPreDrawListener
{
  public f$a(e.b paramb)
  {
  }

  public final boolean onPreDraw()
  {
    AppMethodBeat.i(15332);
    Object localObject = f.a(this.jYJ).getViewTreeObserver();
    if (localObject != null)
      ((ViewTreeObserver)localObject).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
    f.b(this.jYJ).PJ(this.jYJ.duration);
    if (this.jYJ.jYG != null)
    {
      localObject = this.jYJ.jYG;
      if (localObject == null)
        j.dWJ();
      ((View)localObject).setAlpha(1.0F);
      localObject = this.jYJ.jYG;
      if (localObject == null)
        j.dWJ();
      ((View)localObject).animate().setDuration(1000L).setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator()).alpha(0.0F);
    }
    f.b(this.jYJ).a(f.a(this.jYJ), null, (e.b)new f.a.a(this));
    AppMethodBeat.o(15332);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f.a
 * JD-Core Version:    0.6.2
 */