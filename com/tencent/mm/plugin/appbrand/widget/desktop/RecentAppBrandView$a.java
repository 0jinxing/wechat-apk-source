package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class RecentAppBrandView$a extends RecyclerView.a<e>
{
  RecentAppBrandView$a(RecentAppBrandView paramRecentAppBrandView)
  {
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(133933);
    int i = RecentAppBrandView.d(this.iYO).size();
    AppMethodBeat.o(133933);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(133932);
    paramInt = RecentAppBrandView.a(this.iYO, paramInt).type;
    AppMethodBeat.o(133932);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.RecentAppBrandView.a
 * JD-Core Version:    0.6.2
 */