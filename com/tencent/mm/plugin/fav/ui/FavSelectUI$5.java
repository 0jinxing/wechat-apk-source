package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavSelectUI$5
  implements View.OnClickListener
{
  FavSelectUI$5(FavSelectUI paramFavSelectUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74107);
    int i = ((Integer)paramView.getTag()).intValue();
    paramView = new Intent();
    paramView.putExtra("key_preset_search_type", i);
    FavSelectUI.a(this.mjF, paramView);
    AppMethodBeat.o(74107);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSelectUI.5
 * JD-Core Version:    0.6.2
 */