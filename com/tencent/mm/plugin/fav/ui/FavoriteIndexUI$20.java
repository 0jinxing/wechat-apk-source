package com.tencent.mm.plugin.fav.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FavoriteIndexUI$20
  implements AdapterView.OnItemLongClickListener
{
  FavoriteIndexUI$20(FavoriteIndexUI paramFavoriteIndexUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(74246);
    if (paramInt < this.mkH.mhs.getHeaderViewsCount())
    {
      ab.w("MicroMsg.FavoriteIndexUI", "on header view long click, ignore");
      AppMethodBeat.o(74246);
    }
    while (true)
    {
      return true;
      FavoriteIndexUI.a(this.mkH, paramView, paramInt, paramLong, FavoriteIndexUI.c(this.mkH));
      AppMethodBeat.o(74246);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.20
 * JD-Core Version:    0.6.2
 */