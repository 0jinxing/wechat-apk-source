package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c;

final class c$8
  implements Runnable
{
  c$8(c paramc, RecyclerView.v paramv, View paramView, ViewPropertyAnimator paramViewPropertyAnimator)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133786);
    ((BaseAppBrandRecentView.c)this.ahD).iYe.animate().scaleX(1.0F).scaleY(1.0F).setDuration(150L).setListener(new c.8.1(this)).start();
    AppMethodBeat.o(133786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.c.8
 * JD-Core Version:    0.6.2
 */