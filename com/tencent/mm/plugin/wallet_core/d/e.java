package com.tencent.mm.plugin.wallet_core.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.w;
import com.tencent.mm.sdk.e.j;

public final class e extends j<w>
{
  public static final String[] fnj;
  public com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(47074);
    fnj = new String[] { j.a(w.ccO, "WalletFunciontList") };
    AppMethodBeat.o(47074);
  }

  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, w.ccO, "WalletFunciontList", null);
    this.bSd = parame;
  }

  public final void b(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2)
  {
    AppMethodBeat.i(47073);
    w localw = new w();
    localw.field_wallet_region = paramInt1;
    localw.field_function_list = paramString1;
    localw.field_new_list = paramString2;
    localw.field_banner_list = paramString3;
    localw.field_type_name_list = paramString4;
    localw.field_isShowSetting = paramInt2;
    super.a(localw);
    AppMethodBeat.o(47073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.d.e
 * JD-Core Version:    0.6.2
 */