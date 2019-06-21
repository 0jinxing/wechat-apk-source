package com.tencent.mm.plugin.wallet_payu.create.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_payu.security_question.model.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class c$3 extends g
{
  c$3(c paramc, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48379);
    boolean bool;
    if (((paramm instanceof d)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      this.tTg.mqu.putParcelableArrayList("key_security_question_list", ((d)paramm).tUM);
      bool = true;
      AppMethodBeat.o(48379);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(48379);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    return false;
  }

  public final boolean w(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48378);
    this.Agm.a(new d(), true);
    AppMethodBeat.o(48378);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.create.a.c.3
 * JD-Core Version:    0.6.2
 */