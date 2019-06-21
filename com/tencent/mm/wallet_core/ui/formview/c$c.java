package com.tencent.mm.wallet_core.ui.formview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.b;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class c$c
{
  public static String b(int paramInt, TenpaySecureEditText paramTenpaySecureEditText)
  {
    AppMethodBeat.i(49409);
    switch (paramInt)
    {
    default:
      if (paramTenpaySecureEditText.getText().toString() == null)
      {
        paramTenpaySecureEditText = "";
        AppMethodBeat.o(49409);
      }
      break;
    case 2:
    case 1:
    case 0:
    case 3:
    }
    while (true)
    {
      return paramTenpaySecureEditText;
      paramTenpaySecureEditText = paramTenpaySecureEditText.get3DesEncrptData();
      AppMethodBeat.o(49409);
      continue;
      b.dNA();
      paramTenpaySecureEditText = paramTenpaySecureEditText.getEncryptDataWithHash(true, b.dNB());
      AppMethodBeat.o(49409);
      continue;
      b.dNA();
      paramTenpaySecureEditText = paramTenpaySecureEditText.getEncryptDataWithHash(false, b.dNB());
      AppMethodBeat.o(49409);
      continue;
      paramTenpaySecureEditText = paramTenpaySecureEditText.get3DesVerifyCode();
      AppMethodBeat.o(49409);
      continue;
      paramTenpaySecureEditText = paramTenpaySecureEditText.getText().toString();
      AppMethodBeat.o(49409);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.c.c
 * JD-Core Version:    0.6.2
 */