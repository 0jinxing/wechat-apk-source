package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Intent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.honey_pay.a.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.atj;
import com.tencent.mm.protocal.protobuf.us;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.p.a;

final class HoneyPayCheckPwdUI$13
  implements p.a
{
  HoneyPayCheckPwdUI$13(HoneyPayCheckPwdUI paramHoneyPayCheckPwdUI, c paramc)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41846);
    ab.i("MicroMsg.HoneyPayCheckPwdUI", "create success");
    paramString = new Intent(this.nse.mController.ylL, HoneyPayMainUI.class);
    paramString.putExtra("key_create_succ", true);
    if (this.nsi.nqz.wci != null)
    {
      paramString.putExtra("key_card_no", this.nsi.nqz.wci.wpp);
      paramString.putExtra("key_card_type", this.nsi.nqz.wci.kdf);
    }
    Toast.makeText(this.nse.mController.ylL, 2131300547, 1).show();
    this.nse.startActivity(paramString);
    h.pYm.k(875L, 2L, 1L);
    AppMethodBeat.o(41846);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.13
 * JD-Core Version:    0.6.2
 */