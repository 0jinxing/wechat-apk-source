package com.tencent.mm.plugin.wxcredit.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wxcredit.a.l;

final class WalletWXCreditChangeAmountUI$2 extends BaseAdapter
{
  WalletWXCreditChangeAmountUI$2(WalletWXCreditChangeAmountUI paramWalletWXCreditChangeAmountUI)
  {
  }

  public final int getCount()
  {
    return 2;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    AppMethodBeat.i(48689);
    paramView = (CheckedTextView)View.inflate(this.uZr, 2130971115, null);
    if (paramInt == 0)
    {
      paramView.setText(2131297088);
      if (!WalletWXCreditChangeAmountUI.l(this.uZr))
        break label137;
      if ((WalletWXCreditChangeAmountUI.c(this.uZr).uYS == null) || (!"Y".equals(WalletWXCreditChangeAmountUI.c(this.uZr).nYb)))
        break label114;
      if (paramInt != 0)
        break label108;
    }
    while (true)
    {
      paramView.setChecked(bool4);
      AppMethodBeat.o(48689);
      return paramView;
      paramView.setText(2131296990);
      break;
      label108: bool4 = false;
    }
    label114: if (paramInt != 0);
    for (bool4 = bool1; ; bool4 = false)
    {
      paramView.setChecked(bool4);
      break;
    }
    label137: if ((WalletWXCreditChangeAmountUI.f(this.uZr).uYS != null) && ("Y".equals(WalletWXCreditChangeAmountUI.f(this.uZr).nYb)))
    {
      if (paramInt == 0);
      for (bool4 = bool2; ; bool4 = false)
      {
        paramView.setChecked(bool4);
        break;
      }
    }
    if (paramInt != 0);
    for (bool4 = bool3; ; bool4 = false)
    {
      paramView.setChecked(bool4);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.2
 * JD-Core Version:    0.6.2
 */