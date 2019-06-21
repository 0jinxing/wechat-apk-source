package com.tencent.mm.plugin.honey_pay.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.honey_pay.a.a;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.protocal.protobuf.rb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;

final class HoneyPayMainUI$14
  implements p.a
{
  HoneyPayMainUI$14(HoneyPayMainUI paramHoneyPayMainUI, a parama)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41893);
    if (this.nsH.nqx.vYe != null)
    {
      ab.i(this.nsB.TAG, "do realname guide");
      paramString = new Bundle();
      paramString.putString("realname_verify_process_jump_activity", ".ui.HoneyPayMainUI");
      c.a(this.nsB, paramString, this.nsH.nqx.vYe, true);
      AppMethodBeat.o(41893);
    }
    while (true)
    {
      return;
      HoneyPayMainUI.b(this.nsB, this.nsH.nqx.vYf);
      AppMethodBeat.o(41893);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.14
 * JD-Core Version:    0.6.2
 */