package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.i;

final class g$1 extends a
{
  g$1(g paramg, MMActivity paramMMActivity, i parami, Bundle paramBundle)
  {
    super(paramMMActivity, parami, paramBundle);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(48513);
    Object localObject;
    if (paramInt == 0)
    {
      localObject = this.hwd.getString(2131304741);
      AppMethodBeat.o(48513);
    }
    while (true)
    {
      return localObject;
      localObject = super.Au(paramInt);
      AppMethodBeat.o(48513);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pwd.a.g.1
 * JD-Core Version:    0.6.2
 */