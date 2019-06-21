package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.r;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyCanShareListUI$2
  implements AdapterView.OnItemClickListener
{
  LuckyMoneyCanShareListUI$2(LuckyMoneyCanShareListUI paramLuckyMoneyCanShareListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(42637);
    paramAdapterView = LuckyMoneyCanShareListUI.a(this.odp).yb((int)paramLong);
    if ((paramAdapterView != null) && (!bo.isNullOrNil(paramAdapterView.nSX)))
    {
      paramView = new Intent();
      paramView.setClass(this.odp.mController.ylL, LuckyMoneyBeforeDetailUI.class);
      paramView.putExtra("key_sendid", paramAdapterView.nSX);
      this.odp.startActivity(paramView);
    }
    AppMethodBeat.o(42637);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyCanShareListUI.2
 * JD-Core Version:    0.6.2
 */