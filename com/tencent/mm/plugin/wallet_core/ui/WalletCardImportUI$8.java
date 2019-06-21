package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.List;

final class WalletCardImportUI$8
  implements AdapterView.OnItemClickListener
{
  WalletCardImportUI$8(WalletCardImportUI paramWalletCardImportUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(47273);
    this.tGt.dismissDialog(1);
    paramInt = ((Integer)WalletCardImportUI.c(this.tGt).cPs().get(paramInt)).intValue();
    if (WalletCardImportUI.f(this.tGt) != paramInt)
    {
      WalletCardImportUI.a(this.tGt, paramInt);
      WalletCardImportUI.g(this.tGt).setText(((CheckedTextView)paramView).getText().toString());
      WalletCardImportUI.c(WalletCardImportUI.h(this.tGt), WalletCardImportUI.f(this.tGt));
      WalletCardImportUI.h(this.tGt).cey();
      WalletCardImportUI.i(this.tGt);
    }
    AppMethodBeat.o(47273);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.8
 * JD-Core Version:    0.6.2
 */