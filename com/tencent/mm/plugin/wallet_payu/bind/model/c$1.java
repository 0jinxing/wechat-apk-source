package com.tencent.mm.plugin.wallet_payu.bind.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_payu.pwd.a.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.i;

final class c$1 extends a
{
  c$1(c paramc, MMActivity paramMMActivity, i parami, Bundle paramBundle)
  {
    super(paramMMActivity, parami, paramBundle);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(48338);
    Object localObject;
    if (paramInt == 0)
    {
      localObject = this.hwd.getString(2131304736);
      AppMethodBeat.o(48338);
    }
    while (true)
    {
      return localObject;
      localObject = super.Au(paramInt);
      AppMethodBeat.o(48338);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.model.c.1
 * JD-Core Version:    0.6.2
 */