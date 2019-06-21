package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class RechargeUI$6
  implements AdapterView.OnItemClickListener
{
  RechargeUI$6(RechargeUI paramRechargeUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44311);
    this.pHV.dismissDialog(1);
    ab.d("MicroMsg.MallRechargeUI", "onItemClick : ".concat(String.valueOf(paramInt)));
    RechargeUI.a(this.pHV, RechargeUI.g(this.pHV).BD(paramInt));
    RechargeUI.g(this.pHV).BC(paramInt);
    RechargeUI.g(this.pHV).notifyDataSetChanged();
    RechargeUI.n(this.pHV).remove(RechargeUI.B(RechargeUI.k(this.pHV).fmR, RechargeUI.k(this.pHV).cwg, RechargeUI.m(this.pHV)));
    RechargeUI.b(this.pHV);
    RechargeUI.l(this.pHV);
    AppMethodBeat.o(44311);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.6
 * JD-Core Version:    0.6.2
 */