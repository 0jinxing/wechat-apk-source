package com.tencent.mm.wallet_core.ui.formview;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class b
{
  private static int Ahe = 0;
  private static int Ahf = 0;
  private static final int Aid = 2131820689;

  public static void a(MMActivity paramMMActivity, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49406);
    if (paramInt1 == -1)
      AppMethodBeat.o(49406);
    while (true)
    {
      return;
      paramMMActivity.addDialog(com.tencent.mm.wallet_core.ui.b.a(paramMMActivity, paramInt1, paramMMActivity.getResources().getString(paramInt2), paramMMActivity.getResources().getString(2131304829), new b.2()));
      AppMethodBeat.o(49406);
    }
  }

  static void a(TenpaySecureEditText paramTenpaySecureEditText, int paramInt)
  {
    AppMethodBeat.i(49404);
    if (paramTenpaySecureEditText != null)
      if (paramInt == 1)
      {
        paramTenpaySecureEditText.setIsPasswordFormat(true);
        AppMethodBeat.o(49404);
      }
    while (true)
    {
      return;
      if (paramInt == 2)
      {
        paramTenpaySecureEditText.setIsSecurityAnswerFormat(true);
        AppMethodBeat.o(49404);
      }
      else if (paramInt == 3)
      {
        paramTenpaySecureEditText.setIsCvvPaymentFormat(true);
        AppMethodBeat.o(49404);
      }
      else if (paramInt == 4)
      {
        paramTenpaySecureEditText.setIsCvv4PaymentFormat(true);
        AppMethodBeat.o(49404);
      }
      else if (paramInt == 5)
      {
        paramTenpaySecureEditText.setIsValidThru(true);
        AppMethodBeat.o(49404);
      }
      else if (paramInt == 6)
      {
        paramTenpaySecureEditText.setIsBankcardFormat(true);
        AppMethodBeat.o(49404);
      }
      else if (paramInt == 7)
      {
        paramTenpaySecureEditText.setIsMoneyAmountFormat(true);
        AppMethodBeat.o(49404);
      }
      else if (paramInt == 8)
      {
        paramTenpaySecureEditText.setIsIdCardTailFormat(true);
        AppMethodBeat.o(49404);
      }
      else
      {
        paramTenpaySecureEditText.setIsCvv4PaymentFormat(false);
        AppMethodBeat.o(49404);
        continue;
        ab.e("MicroMsg.FormatViewUtil", "hy: param error: no edit text view");
        AppMethodBeat.o(49404);
      }
    }
  }

  public static void f(MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
    AppMethodBeat.i(49405);
    paramWalletFormView.setOnClickListener(new b.1(paramMMActivity, paramWalletFormView));
    AppMethodBeat.o(49405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.b
 * JD-Core Version:    0.6.2
 */