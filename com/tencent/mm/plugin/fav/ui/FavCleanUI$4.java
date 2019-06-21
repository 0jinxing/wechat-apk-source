package com.tencent.mm.plugin.fav.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.a.b;

final class FavCleanUI$4
  implements AdapterView.OnItemClickListener
{
  FavCleanUI$4(FavCleanUI paramFavCleanUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(73952);
    if (FavCleanUI.e(this.mhW) != null)
      FavCleanUI.e(this.mhW).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    AppMethodBeat.o(73952);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavCleanUI.4
 * JD-Core Version:    0.6.2
 */