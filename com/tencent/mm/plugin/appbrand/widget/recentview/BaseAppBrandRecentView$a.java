package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import java.util.List;

public final class BaseAppBrandRecentView$a extends RecyclerView.a<BaseAppBrandRecentView.c>
{
  c.a jnM;

  private BaseAppBrandRecentView$a(BaseAppBrandRecentView paramBaseAppBrandRecentView)
  {
    AppMethodBeat.i(134342);
    this.jnM = new c.a();
    this.jnM.ePT = 2131231172;
    AppMethodBeat.o(134342);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(134343);
    int i = BaseAppBrandRecentView.b(this.jnL).size();
    int j = this.jnL.getCompletelyCountPerPage();
    int k = i;
    if (this.jnL.getCustomItemCount() == 1)
      k = i - 1;
    i = k;
    if (k > this.jnL.getShowCount())
      i = this.jnL.getShowCount();
    if (this.jnL.getCustomItemCount() == 1)
      if (i % j == 0)
      {
        i++;
        k = i + this.jnL.getCustomItemCount();
        AppMethodBeat.o(134343);
      }
    while (true)
    {
      return k;
      i += j + 1 - i % j;
      break;
      k = i;
      if (i % j != 0)
        k = i + (j - i % j);
      AppMethodBeat.o(134343);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.a
 * JD-Core Version:    0.6.2
 */