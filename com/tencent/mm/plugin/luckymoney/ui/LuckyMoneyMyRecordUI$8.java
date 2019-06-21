package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.util.List;
import java.util.Map;

final class LuckyMoneyMyRecordUI$8
  implements AdapterView.OnItemClickListener
{
  LuckyMoneyMyRecordUI$8(LuckyMoneyMyRecordUI paramLuckyMoneyMyRecordUI, LuckyMoneyMyRecordUI.a parama)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(42765);
    this.ofb.dismissDialog(1);
    paramAdapterView = this.ofg.getItem(paramInt);
    this.ofg.biG = paramInt;
    if (!paramAdapterView.equals(LuckyMoneyMyRecordUI.j(this.ofb)))
    {
      LuckyMoneyMyRecordUI.a(this.ofb, paramAdapterView);
      LuckyMoneyMyRecordUI.k(this.ofb).setText(this.ofb.getString(2131301176, new Object[] { LuckyMoneyMyRecordUI.j(this.ofb) }));
      LuckyMoneyMyRecordUI.l(this.ofb);
      LuckyMoneyMyRecordUI.m(this.ofb).clear();
      LuckyMoneyMyRecordUI.n(this.ofb).clear();
      LuckyMoneyMyRecordUI.d(this.ofb);
    }
    h.pYm.e(11701, new Object[] { Integer.valueOf(LuckyMoneyMyRecordUI.e(this.ofb)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3), paramAdapterView });
    AppMethodBeat.o(42765);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.8
 * JD-Core Version:    0.6.2
 */