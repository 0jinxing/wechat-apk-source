package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b.a;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.Map;

final class WalletPhoneInputView$5
  implements View.OnFocusChangeListener
{
  WalletPhoneInputView$5(WalletPhoneInputView paramWalletPhoneInputView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(47912);
    if (!paramBoolean)
      if ((b.a)WalletPhoneInputView.h(this.tNV).get(WalletPhoneInputView.e(this.tNV).getText().toString()) == null)
      {
        WalletPhoneInputView.d(this.tNV).setContentTextColorRes(2131690386);
        WalletPhoneInputView.e(this.tNV).setTextColor(this.tNV.getResources().getColor(2131690386));
        AppMethodBeat.o(47912);
      }
    while (true)
    {
      return;
      WalletPhoneInputView.d(this.tNV).setContentTextColorRes(2131690316);
      WalletPhoneInputView.e(this.tNV).setTextColor(this.tNV.getResources().getColor(2131690316));
      AppMethodBeat.o(47912);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView.5
 * JD-Core Version:    0.6.2
 */