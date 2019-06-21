package com.tencent.mm.plugin.luckymoney.sns;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
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
    boolean bool = true;
    AppMethodBeat.i(42489);
    if ((paramm instanceof com.tencent.mm.plugin.luckymoney.sns.a.a))
    {
      ab.i("MicroMsg.ProcessManager", "OpenSnsPayProcess onSceneEnd, errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        h.bQ(this.hwd, this.hwd.getString(2131301159));
        a.xT(121);
        a.a(this.obz).putBoolean("is_open_sns_pay", true);
        this.obz.a(this.hwd, 0, a.b(this.obz));
        AppMethodBeat.o(42489);
      }
    }
    while (true)
    {
      return bool;
      h.bQ(this.hwd, this.hwd.getString(2131301158));
      a.xT(122);
      this.obz.c(this.hwd, 0);
      break;
      AppMethodBeat.o(42489);
      bool = false;
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(42490);
    paramArrayOfObject = (String)paramArrayOfObject[0];
    this.Agm.a(new com.tencent.mm.plugin.luckymoney.sns.a.a(1, paramArrayOfObject, ""), true, 1);
    AppMethodBeat.o(42490);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.a.1
 * JD-Core Version:    0.6.2
 */