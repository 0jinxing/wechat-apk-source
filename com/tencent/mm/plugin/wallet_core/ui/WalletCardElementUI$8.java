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

final class WalletCardElementUI$8 extends BaseAdapter
{
  WalletCardElementUI$8(WalletCardElementUI paramWalletCardElementUI)
  {
  }

  private Integer Hu(int paramInt)
  {
    AppMethodBeat.i(47219);
    Integer localInteger = (Integer)WalletCardElementUI.n(this.tGf).cPs().get(paramInt);
    AppMethodBeat.o(47219);
    return localInteger;
  }

  public final int getCount()
  {
    AppMethodBeat.i(47218);
    int i;
    if (WalletCardElementUI.n(this.tGf).cPs() != null)
    {
      i = WalletCardElementUI.n(this.tGf).cPs().size();
      AppMethodBeat.o(47218);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(47218);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47220);
    paramView = (CheckedTextView)View.inflate(this.tGf, 2130971115, null);
    paramView.setText(r.cPQ().Z(this.tGf, Hu(paramInt).intValue()));
    if (WalletCardElementUI.v(this.tGf) == Hu(paramInt).intValue())
      paramView.setChecked(true);
    while (true)
    {
      AppMethodBeat.o(47220);
      return paramView;
      paramView.setChecked(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.8
 * JD-Core Version:    0.6.2
 */