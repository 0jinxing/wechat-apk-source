package com.tencent.mm.plugin.fingerprint.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class a$1 extends g
{
  a$1(a parama, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(41591);
    paramArrayOfObject = (String)paramArrayOfObject[0];
    a.a(this.mss).putString("pwd", paramArrayOfObject);
    ab.i("MicroMsg.FingerPrintAuthProcess", "this is onNext");
    AppMethodBeat.o(41591);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.a.1
 * JD-Core Version:    0.6.2
 */