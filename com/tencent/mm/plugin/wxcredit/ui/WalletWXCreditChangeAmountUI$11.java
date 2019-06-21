package com.tencent.mm.plugin.wxcredit.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxcredit.a.l;
import java.util.List;

final class WalletWXCreditChangeAmountUI$11 extends BaseAdapter
{
  WalletWXCreditChangeAmountUI$11(WalletWXCreditChangeAmountUI paramWalletWXCreditChangeAmountUI)
  {
  }

  private l Km(int paramInt)
  {
    AppMethodBeat.i(48700);
    l locall = (l)WalletWXCreditChangeAmountUI.j(this.uZr).get(paramInt);
    AppMethodBeat.o(48700);
    return locall;
  }

  public final int getCount()
  {
    AppMethodBeat.i(48699);
    int i;
    if (WalletWXCreditChangeAmountUI.j(this.uZr) != null)
    {
      i = WalletWXCreditChangeAmountUI.j(this.uZr).size();
      AppMethodBeat.o(48699);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(48699);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(48701);
    paramViewGroup = (CheckedTextView)View.inflate(this.uZr, 2130971115, null);
    paramView = Km(paramInt);
    paramViewGroup.setText(paramView.desc);
    if (paramView.uYP != 0);
    for (boolean bool = true; ; bool = false)
    {
      paramViewGroup.setChecked(bool);
      AppMethodBeat.o(48701);
      return paramViewGroup;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.11
 * JD-Core Version:    0.6.2
 */