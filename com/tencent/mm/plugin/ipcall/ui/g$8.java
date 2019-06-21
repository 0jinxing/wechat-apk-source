package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.e.d;

final class g$8
  implements View.OnClickListener
{
  g$8(g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22158);
    this.nDb.dismiss();
    paramView = new Intent();
    paramView.putExtra("IPCallShareCouponCardUI_KFrom", 2);
    paramView.setClass(g.i(this.nDb), IPCallShareCouponCardUI.class);
    g.i(this.nDb).startActivity(paramView);
    d.a(1, -1, g.h(this.nDb), g.b(this.nDb, g.h(this.nDb)), 1, 1, -1, g.e(this.nDb), g.f(this.nDb));
    AppMethodBeat.o(22158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.g.8
 * JD-Core Version:    0.6.2
 */