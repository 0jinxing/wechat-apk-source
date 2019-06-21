package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.List;

final class WalletCardElementUI$7
  implements AdapterView.OnItemClickListener
{
  WalletCardElementUI$7(WalletCardElementUI paramWalletCardElementUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(47217);
    this.tGf.dismissDialog(1);
    paramInt = ((Integer)WalletCardElementUI.n(this.tGf).cPs().get(paramInt)).intValue();
    if (WalletCardElementUI.v(this.tGf) != paramInt)
    {
      WalletCardElementUI.i(this.tGf, paramInt);
      WalletCardElementUI.a(this.tGf, WalletCardElementUI.w(this.tGf).getText());
      WalletCardElementUI.w(this.tGf).setText(((CheckedTextView)paramView).getText().toString());
      WalletCardElementUI.b(WalletCardElementUI.x(this.tGf), WalletCardElementUI.v(this.tGf));
      WalletCardElementUI.x(this.tGf).cey();
      WalletCardElementUI.g(this.tGf);
      WalletCardElementUI.j(this.tGf, WalletCardElementUI.v(this.tGf));
    }
    AppMethodBeat.o(47217);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.7
 * JD-Core Version:    0.6.2
 */