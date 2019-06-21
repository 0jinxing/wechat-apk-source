package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class a extends g
{
  private Bundle mqu;

  public a(MMActivity paramMMActivity, i parami, Bundle paramBundle)
  {
    super(paramMMActivity, parami);
    this.mqu = paramBundle;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48501);
    if ((paramm instanceof c))
    {
      paramString = (c)paramm;
      if (bo.isNullOrNil(paramString.token))
        break label67;
      ab.d("MicroMsg.CommonCheckPwdController", "hy: check pwd pass");
      this.mqu.putString("payu_reference", paramString.token);
      com.tencent.mm.wallet_core.a.j(this.hwd, this.mqu);
    }
    while (true)
    {
      AppMethodBeat.o(48501);
      return false;
      label67: ab.w("MicroMsg.CommonCheckPwdController", "hy: check pwd failed");
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48502);
    this.mqu.putString("key_pwd1", (String)paramArrayOfObject[0]);
    this.Agm.a(new c(this.mqu.getString("key_pwd1")), true);
    AppMethodBeat.o(48502);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pwd.a.a
 * JD-Core Version:    0.6.2
 */