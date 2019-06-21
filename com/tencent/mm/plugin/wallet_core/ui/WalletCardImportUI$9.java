package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.t;
import java.util.List;

final class WalletCardImportUI$9 extends BaseAdapter
{
  WalletCardImportUI$9(WalletCardImportUI paramWalletCardImportUI)
  {
  }

  private Integer Hu(int paramInt)
  {
    AppMethodBeat.i(47275);
    Integer localInteger = (Integer)WalletCardImportUI.c(this.tGt).cPs().get(paramInt);
    AppMethodBeat.o(47275);
    return localInteger;
  }

  public final int getCount()
  {
    AppMethodBeat.i(47274);
    int i;
    if (WalletCardImportUI.c(this.tGt).cPs() != null)
    {
      i = WalletCardImportUI.c(this.tGt).cPs().size();
      AppMethodBeat.o(47274);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(47274);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47276);
    paramView = (CheckedTextView)View.inflate(this.tGt, 2130971115, null);
    paramView.setText(r.cPQ().Z(this.tGt, Hu(paramInt).intValue()));
    if (WalletCardImportUI.f(this.tGt) == Hu(paramInt).intValue())
      paramView.setChecked(true);
    while (true)
    {
      paramView.setBackgroundResource(2130838396);
      AppMethodBeat.o(47276);
      return paramView;
      paramView.setChecked(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.9
 * JD-Core Version:    0.6.2
 */