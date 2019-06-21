package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavoriteIndexUI$4
  implements View.OnClickListener
{
  FavoriteIndexUI$4(FavoriteIndexUI paramFavoriteIndexUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74222);
    int i = ((Integer)paramView.getTag()).intValue();
    paramView = new Intent();
    paramView.putExtra("key_enter_fav_search_from", 0);
    paramView.putExtra("key_preset_search_type", i);
    FavoriteIndexUI.a(this.mkH, paramView);
    AppMethodBeat.o(74222);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.4
 * JD-Core Version:    0.6.2
 */