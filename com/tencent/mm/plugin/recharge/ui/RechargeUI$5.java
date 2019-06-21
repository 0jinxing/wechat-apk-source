package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class RechargeUI$5
  implements AdapterView.OnItemClickListener
{
  RechargeUI$5(RechargeUI paramRechargeUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44310);
    this.pHV.dismissDialog(1);
    ab.d("MicroMsg.MallRechargeUI", "onItemClick : ".concat(String.valueOf(paramInt)));
    ab.d("MicroMsg.MallRechargeUI", "checkProduct: " + RechargeUI.k(this.pHV));
    RechargeUI.a(this.pHV, RechargeUI.f(this.pHV).BD(paramInt));
    RechargeUI.f(this.pHV).BC(paramInt);
    RechargeUI.f(this.pHV).notifyDataSetChanged();
    ab.d("MicroMsg.MallRechargeUI", "checkProduct: " + RechargeUI.k(this.pHV));
    RechargeUI.l(this.pHV);
    AppMethodBeat.o(44310);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.5
 * JD-Core Version:    0.6.2
 */