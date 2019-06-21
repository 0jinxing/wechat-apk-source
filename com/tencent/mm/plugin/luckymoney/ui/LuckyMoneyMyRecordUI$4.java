package com.tencent.mm.plugin.luckymoney.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class LuckyMoneyMyRecordUI$4
  implements AdapterView.OnItemLongClickListener
{
  LuckyMoneyMyRecordUI$4(LuckyMoneyMyRecordUI paramLuckyMoneyMyRecordUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(42761);
    if ((paramInt <= 0) || (paramInt > LuckyMoneyMyRecordUI.f(this.ofb).getCount()))
      AppMethodBeat.o(42761);
    while (true)
    {
      return true;
      h.a(this.ofb, this.ofb.getResources().getString(2131301128), null, this.ofb.getResources().getString(2131296881), new LuckyMoneyMyRecordUI.4.1(this, paramInt - 1));
      AppMethodBeat.o(42761);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI.4
 * JD-Core Version:    0.6.2
 */