package com.tencent.mm.plugin.wallet_payu.remittance.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.a.a;
import com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceAdapterUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c;

public class g extends a
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48537);
    ab.d("MicroMsg.PayURemittanceProcess", "start Process : PayURemittanceProcess");
    b(paramActivity, PayURemittanceAdapterUI.class, paramBundle);
    AppMethodBeat.o(48537);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.a.g
 * JD-Core Version:    0.6.2
 */