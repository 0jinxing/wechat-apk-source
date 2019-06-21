package com.tencent.mm.plugin.location.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LocationExtUI$2
  implements View.OnClickListener
{
  LocationExtUI$2(LocationExtUI paramLocationExtUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113432);
    paramView = new Intent(this.nLA.mController.ylL, RemarkUI.class);
    paramView.putExtra("key_nullable", true);
    paramView.putExtra("key_value", this.nLA.getIntent().getStringExtra("key_value"));
    paramView.putExtra("key_hint", this.nLA.getString(2131300984));
    paramView.putExtra("Kwebmap_locaion", this.nLA.getIntent().getStringExtra("Kwebmap_locaion"));
    paramView.putExtra("MMActivity.OverrideExitAnimation", 2131034227);
    paramView.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
    paramView.putExtra("kFavInfoLocalId", this.nLA.getIntent().getLongExtra("kFavInfoLocalId", -1L));
    paramView.putExtra("kRemark", this.nLA.getIntent().getStringExtra("kRemark"));
    this.nLA.startActivityForResult(paramView, 4097);
    AppMethodBeat.o(113432);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.LocationExtUI.2
 * JD-Core Version:    0.6.2
 */