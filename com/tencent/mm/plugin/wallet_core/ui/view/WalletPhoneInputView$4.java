package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.Map;

final class WalletPhoneInputView$4
  implements TextWatcher
{
  WalletPhoneInputView$4(WalletPhoneInputView paramWalletPhoneInputView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(47911);
    if (bo.isNullOrNil(paramEditable.toString()))
    {
      WalletPhoneInputView.d(this.tNV).setText("");
      WalletPhoneInputView.d(this.tNV).setContentTextColorRes(2131690316);
      WalletPhoneInputView.e(this.tNV).setTextColor(this.tNV.getResources().getColor(2131690316));
      AppMethodBeat.o(47911);
    }
    while (true)
    {
      return;
      if (WalletPhoneInputView.f(this.tNV))
        break;
      ab.i("MicroMsg.WalletPhoneInputView", "manual pick don't search");
      WalletPhoneInputView.d(this.tNV).setContentTextColorRes(2131690316);
      WalletPhoneInputView.e(this.tNV).setTextColor(this.tNV.getResources().getColor(2131690316));
      WalletPhoneInputView.g(this.tNV);
      AppMethodBeat.o(47911);
    }
    b.a locala = (b.a)WalletPhoneInputView.h(this.tNV).get(paramEditable.toString());
    ab.d("MicroMsg.WalletPhoneInputView", "cCode: %s, s: %s", new Object[] { locala, paramEditable.toString() });
    if (locala != null)
    {
      WalletPhoneInputView.a(this.tNV, locala.fHD);
      WalletPhoneInputView.b(this.tNV, locala.fHE);
      WalletPhoneInputView.d(this.tNV).setText(locala.fHE);
      WalletPhoneInputView.d(this.tNV).setContentTextColorRes(2131690316);
      WalletPhoneInputView.e(this.tNV).setTextColor(this.tNV.getResources().getColor(2131690316));
    }
    while (true)
    {
      WalletPhoneInputView.c(this.tNV).getInputValidChangeListener().hY(WalletPhoneInputView.c(this.tNV).asa());
      AppMethodBeat.o(47911);
      break;
      WalletPhoneInputView.a(this.tNV, "");
      WalletPhoneInputView.b(this.tNV, "");
      WalletPhoneInputView.d(this.tNV).setText(this.tNV.getContext().getString(2131305232));
    }
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView.4
 * JD-Core Version:    0.6.2
 */