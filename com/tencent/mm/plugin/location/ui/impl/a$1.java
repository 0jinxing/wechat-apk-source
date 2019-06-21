package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.ui.RemarkUI;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113589);
    paramView = new Intent(this.nOW.activity, RemarkUI.class);
    paramView.putExtra("key_nullable", true);
    paramView.putExtra("key_value", this.nOW.bKk());
    paramView.putExtra("key_hint", this.nOW.getString(2131300984));
    paramView.putExtra("Kwebmap_locaion", this.nOW.nOJ.nJx);
    paramView.putExtra("kFavInfoLocalId", this.nOW.activity.getIntent().getLongExtra("kFavInfoLocalId", -1L));
    paramView.putExtra("kRemark", this.nOW.activity.getIntent().getStringExtra("kRemark"));
    this.nOW.activity.startActivityForResult(paramView, 4096);
    AppMethodBeat.o(113589);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.a.1
 * JD-Core Version:    0.6.2
 */