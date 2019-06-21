package com.tencent.mm.plugin.fav.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class FavSearchActionView$2
  implements View.OnClickListener
{
  FavSearchActionView$2(FavSearchActionView paramFavSearchActionView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74688);
    if (FavSearchActionView.d(this.mpV) == null)
      AppMethodBeat.o(74688);
    while (true)
    {
      return;
      FavSearchActionView.a(this.mpV).dAg();
      FavSearchActionView.a(this.mpV).dAb();
      FavSearchActionView.f(this.mpV).clear();
      FavSearchActionView.b(this.mpV).clear();
      FavSearchActionView.d(this.mpV).a(FavSearchActionView.e(this.mpV), FavSearchActionView.f(this.mpV), FavSearchActionView.b(this.mpV), true);
      FavSearchActionView.c(this.mpV);
      AppMethodBeat.o(74688);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView.2
 * JD-Core Version:    0.6.2
 */