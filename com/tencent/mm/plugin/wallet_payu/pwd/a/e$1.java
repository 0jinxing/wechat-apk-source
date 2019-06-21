package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class e$1 extends g
{
  e$1(e parame, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48508);
    if ((paramm instanceof d))
    {
      ab.d("MicroMsg.PayUBaseChangePwdProcess", "hy: forget pwd user success");
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.tUt.mqu.putInt("key_errcode_payu", 0);
        a.b(this.hwd, this.tUt.mqu, 0);
        bool = true;
        AppMethodBeat.o(48508);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48508);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48509);
    Object localObject = (s)paramArrayOfObject[0];
    paramArrayOfObject = this.tUt.mqu.getString("payu_reference");
    localObject = ((s)localObject).guu;
    this.Agm.a(new d(paramArrayOfObject, (String)localObject), true);
    AppMethodBeat.o(48509);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pwd.a.e.1
 * JD-Core Version:    0.6.2
 */