package com.tencent.mm.plugin.remittance.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c;

public class a extends c
{
  public c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(44422);
    ab.d("MicroMsg.RemittanceProcess", "start Process : RemittanceProcess");
    b(paramActivity, RemittanceAdapterUI.class, paramBundle);
    AppMethodBeat.o(44422);
    return this;
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(44423);
    super.aG(paramActivity);
    AppMethodBeat.o(44423);
  }

  public final String bxP()
  {
    return "RemittanceProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(44424);
    F(paramActivity);
    AppMethodBeat.o(44424);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.a.a
 * JD-Core Version:    0.6.2
 */