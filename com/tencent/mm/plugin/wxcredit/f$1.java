package com.tencent.mm.plugin.wxcredit;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class f$1 extends g
{
  f$1(f paramf, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48645);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof com.tencent.mm.plugin.wxcredit.a.f)))
    {
      this.uYr.a(this.hwd, 0, f.a(this.uYr));
      bool = true;
      AppMethodBeat.o(48645);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48645);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48646);
    boolean bool;
    if (!f.b(this.uYr).getBoolean("key_is_show_detail", true))
    {
      paramArrayOfObject = (Bankcard)f.c(this.uYr).getParcelable("key_bankcard");
      this.Agm.a(new com.tencent.mm.plugin.wxcredit.a.f(paramArrayOfObject.field_bankcardType, paramArrayOfObject.field_bindSerial, f.d(this.uYr).getString("key_pwd1")), true, 1);
      AppMethodBeat.o(48646);
      bool = true;
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(48646);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.f.1
 * JD-Core Version:    0.6.2
 */