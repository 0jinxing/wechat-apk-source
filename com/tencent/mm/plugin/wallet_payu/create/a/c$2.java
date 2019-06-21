package com.tencent.mm.plugin.wallet_payu.create.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_payu.a.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.e;

final class c$2 extends g
{
  c$2(c paramc, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(48377);
    Object localObject;
    if (paramInt == 0)
    {
      localObject = this.hwd.getString(2131305393, new Object[] { e.atu("+" + c.b(this.tTg).getString("dial_code") + c.c(this.tTg).getString("key_mobile")) });
      AppMethodBeat.o(48377);
    }
    while (true)
    {
      return localObject;
      localObject = super.Au(paramInt);
      AppMethodBeat.o(48377);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(48375);
    if ((paramm instanceof com.tencent.mm.plugin.wallet_payu.a.a))
    {
      paramString = (com.tencent.mm.plugin.wallet_payu.a.a)paramm;
      if ((paramInt1 != 0) || (paramInt2 != 0) || (!paramString.qnM))
        break label121;
      c.a(this.tTg).putString("payu_reference", paramString.tTy);
      com.tencent.mm.wallet_core.a.j(this.hwd, this.tTg.mqu);
      AppMethodBeat.o(48375);
    }
    while (true)
    {
      return bool;
      if (((paramm instanceof b)) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (b)paramm;
        this.tTg.mqu.putString("payu_reference", paramString.cEW);
        AppMethodBeat.o(48375);
      }
      else
      {
        label121: bool = false;
        AppMethodBeat.o(48375);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48376);
    this.Agm.a(new com.tencent.mm.plugin.wallet_payu.a.a((String)paramArrayOfObject[0], this.tTg.mqu.getString("payu_reference")), true);
    AppMethodBeat.o(48376);
    return true;
  }

  public final boolean x(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48374);
    this.Agm.a(new b(this.tTg.mqu.getString("dial_code"), this.tTg.mqu.getString("key_mobile")), true, 1);
    AppMethodBeat.o(48374);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.a.c.2
 * JD-Core Version:    0.6.2
 */