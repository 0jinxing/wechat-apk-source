package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;

final class FavCapacityPanel$1
  implements View.OnClickListener
{
  FavCapacityPanel$1(FavCapacityPanel paramFavCapacityPanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74663);
    paramView = new Intent();
    if (this.mpy.mpw == 0)
      paramView.putExtra("key_enter_fav_cleanui_from", 1);
    while (true)
    {
      b.b(this.mpy.getContext(), ".ui.FavCleanUI", paramView);
      AppMethodBeat.o(74663);
      return;
      paramView.putExtra("key_enter_fav_cleanui_from", 2);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel.1
 * JD-Core Version:    0.6.2
 */