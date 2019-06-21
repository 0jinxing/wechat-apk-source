package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class c$7 extends AnimatorListenerAdapter
{
  c$7(c paramc, RecyclerView.v paramv, int paramInt, ViewPropertyAnimator paramViewPropertyAnimator, View paramView)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    AppMethodBeat.i(133783);
    ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateRemoveImpl onAnimationCancel");
    AppMethodBeat.o(133783);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(133782);
    ab.v("MicroMsg.AppBrandDesktopRecyclerItemAnimator", "alvinluo animateRemoveImpl onAnimationEnd, pos: %d", new Object[] { Integer.valueOf(this.gvp) });
    this.ahE.setListener(null);
    this.val$view.setAlpha(1.0F);
    this.iWY.B(this.ahD);
    this.iWY.ahx.remove(this.ahD);
    this.iWY.hY();
    AppMethodBeat.o(133782);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(133781);
    this.iWY.D(this.ahD);
    AppMethodBeat.o(133781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.7
 * JD-Core Version:    0.6.2
 */