package com.tencent.mm.plugin.location.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LocationExtUI$1
  implements View.OnClickListener
{
  LocationExtUI$1(LocationExtUI paramLocationExtUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113431);
    paramView = new Intent();
    paramView.putExtra("key_fav_result_list", LocationExtUI.a(this.nLA));
    b.a(this.nLA.mController.ylL, ".ui.FavTagEditUI", paramView, 4098);
    AppMethodBeat.o(113431);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.LocationExtUI.1
 * JD-Core Version:    0.6.2
 */