package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.a;
import com.tencent.mm.sdk.platformtools.bo;

final class RechargeUI$17
  implements View.OnClickListener
{
  RechargeUI$17(RechargeUI paramRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44323);
    RechargeUI.e(this.pHV).getFocus();
    if (RechargeUI.e(this.pHV).getInputRecord().cvp == 2)
      RechargeUI.e(this.pHV).setInput(null);
    if (bo.isNullOrNil(RechargeUI.e(this.pHV).getText().toString()))
      RechargeUI.e(this.pHV).pGt.showDropDown();
    this.pHV.showVKB();
    AppMethodBeat.o(44323);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.17
 * JD-Core Version:    0.6.2
 */