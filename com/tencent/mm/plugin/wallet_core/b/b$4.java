package com.tencent.mm.plugin.wallet_core.b;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.id_verify.model.h;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$4 extends g
{
  b$4(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46474);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.b.a.b))
    {
      this.ttJ.a(this.Agm);
      if (((com.tencent.mm.plugin.wallet_core.b.a.b)paramm).ttK != null)
        b.h(this.ttJ).putParcelable("key_bindcard_value_result", ((com.tencent.mm.plugin.wallet_core.b.a.b)paramm).ttK);
      bool = false;
      AppMethodBeat.o(46474);
    }
    while (true)
    {
      return bool;
      if (!(paramm instanceof h))
        break;
      bool = true;
      AppMethodBeat.o(46474);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(46475);
    paramArrayOfObject = (s)paramArrayOfObject[0];
    b.i(this.ttJ).getString("verify_card_flag", "0");
    if ("realname_verify_process".equals(this.ttJ.bxP()))
      this.Agm.a(new com.tencent.mm.plugin.wallet_core.b.a.b(paramArrayOfObject, this.ttJ.mqu.getInt("entry_scene", -1)), true);
    while (true)
    {
      AppMethodBeat.o(46475);
      return false;
      this.Agm.a(new com.tencent.mm.plugin.wallet_core.b.a.b(paramArrayOfObject), true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.b.b.4
 * JD-Core Version:    0.6.2
 */