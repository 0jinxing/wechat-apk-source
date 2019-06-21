package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyMyRecordUI$3
  implements AdapterView.OnItemClickListener
{
  LuckyMoneyMyRecordUI$3(LuckyMoneyMyRecordUI paramLuckyMoneyMyRecordUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramInt = 3;
    AppMethodBeat.i(42759);
    int i = (int)paramLong;
    h.pYm.e(11701, new Object[] { Integer.valueOf(LuckyMoneyMyRecordUI.e(this.ofb)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
    if ((i >= 0) && (i < LuckyMoneyMyRecordUI.f(this.ofb).getCount()))
    {
      paramView = LuckyMoneyMyRecordUI.f(this.ofb).yb(i);
      if ((paramView != null) && (!bo.isNullOrNil(paramView.nSX)))
      {
        paramAdapterView = new Intent();
        if (paramView.nXi != 2)
          break label197;
        ab.d("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go busi detail");
        paramAdapterView.setClass(this.ofb.mController.ylL, LuckyMoneyBusiDetailUI.class);
        paramAdapterView.putExtra("key_sendid", paramView.nSX);
        if (LuckyMoneyMyRecordUI.a(this.ofb) != 1)
          break label224;
      }
    }
    while (true)
    {
      paramAdapterView.putExtra("key_jump_from", paramInt);
      this.ofb.startActivity(paramAdapterView);
      AppMethodBeat.o(42759);
      return;
      label197: ab.d("MicroMsg.LuckyMoneyMyRecordUI", "onItemClick: go normal detail");
      paramAdapterView.setClass(this.ofb.mController.ylL, LuckyMoneyBeforeDetailUI.class);
      break;
      label224: paramInt = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.3
 * JD-Core Version:    0.6.2
 */