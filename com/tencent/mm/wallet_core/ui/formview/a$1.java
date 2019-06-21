package com.tencent.mm.wallet_core.ui.formview;

import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tenpay.android.wechat.TenpaySecureEditText;

final class a$1 extends a.b
{
  a$1()
  {
    super((byte)0);
  }

  public final boolean a(WalletFormView paramWalletFormView)
  {
    AppMethodBeat.i(49355);
    boolean bool;
    if (paramWalletFormView.Aih == null)
    {
      bool = false;
      AppMethodBeat.o(49355);
    }
    while (true)
    {
      return bool;
      bool = paramWalletFormView.Aih.isBankcardNum();
      AppMethodBeat.o(49355);
    }
  }

  public final boolean c(WalletFormView paramWalletFormView, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(49353);
    if ((!bo.isNullOrNil(paramString)) && (paramString.length() <= 5))
    {
      paramWalletFormView.setSelection(0);
      paramWalletFormView.setBankcardTail(paramString);
      paramWalletFormView.setMaxInputLength(24 - paramString.length());
      paramWalletFormView.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramWalletFormView.getMaxInputLength()) });
      AppMethodBeat.o(49353);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(49353);
      bool = false;
    }
  }

  public final boolean cev()
  {
    return true;
  }

  public final boolean d(WalletFormView paramWalletFormView, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(49354);
    if ((!bo.isNullOrNil(paramString)) && (paramString.length() <= 5))
    {
      paramWalletFormView.setSelection(0);
      paramWalletFormView.set3DesToView(paramString);
      paramWalletFormView.setMaxInputLength(24 - paramString.length());
      paramWalletFormView.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramWalletFormView.getMaxInputLength()) });
      AppMethodBeat.o(49354);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(49354);
      bool = false;
    }
  }

  public final String e(WalletFormView paramWalletFormView, String paramString)
  {
    AppMethodBeat.i(49356);
    paramWalletFormView = bo.bc(paramString, "").replaceAll(" ", "");
    AppMethodBeat.o(49356);
    return paramWalletFormView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.a.1
 * JD-Core Version:    0.6.2
 */