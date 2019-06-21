package com.tencent.mm.wallet_core.ui.formview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a.a;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class c$b
{
  public static String b(int paramInt, TenpaySecureEditText paramTenpaySecureEditText)
  {
    AppMethodBeat.i(49408);
    paramTenpaySecureEditText.setSecureEncrypt(new a(paramInt));
    paramTenpaySecureEditText = paramTenpaySecureEditText.get3DesEncrptData();
    AppMethodBeat.o(49408);
    return paramTenpaySecureEditText;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.c.b
 * JD-Core Version:    0.6.2
 */