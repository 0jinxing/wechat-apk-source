package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseAppBrandRecentView$c$1
  implements View.OnClickListener
{
  BaseAppBrandRecentView$c$1(BaseAppBrandRecentView.c paramc, BaseAppBrandRecentView paramBaseAppBrandRecentView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134350);
    a locala = (a)paramView.getTag();
    locala.position = this.jnO.kj();
    if (this.jnO.jnL.getOnItemClickListener() != null)
      this.jnO.jnL.getOnItemClickListener().a(paramView, locala, BaseAppBrandRecentView.c(this.jnO.jnL), BaseAppBrandRecentView.d(this.jnO.jnL));
    AppMethodBeat.o(134350);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.c.1
 * JD-Core Version:    0.6.2
 */