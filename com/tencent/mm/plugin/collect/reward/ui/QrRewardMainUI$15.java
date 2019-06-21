package com.tencent.mm.plugin.collect.reward.ui;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.collect.reward.a.a.a;
import com.tencent.mm.plugin.collect.reward.a.b;
import com.tencent.mm.plugin.wallet_core.id_verify.util.a;
import com.tencent.mm.protocal.protobuf.bpt;
import com.tencent.mm.protocal.protobuf.pe;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class QrRewardMainUI$15
  implements a.a
{
  QrRewardMainUI$15(QrRewardMainUI paramQrRewardMainUI, b paramb)
  {
  }

  public final void j(m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(41099);
    ab.e("MicroMsg.QrRewardMainUI", "get code error: %s, %s", new Object[] { Integer.valueOf(this.kEH.kDu.kCl), this.kEH.kDu.kCm });
    if (this.kEH.kDu.kCl == 416)
      if (this.kEH.kDu.vWf == null)
      {
        ab.d("MicroMsg.QrRewardMainUI", "realNameInfo:%s", new Object[] { Boolean.valueOf(bool) });
        QrRewardMainUI.d(this.kEC).setVisibility(4);
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".reward.ui.CollectMainUI");
        localBundle.putString("realname_verify_process_jump_plugin", "collect");
        paramm = this.kEC;
        int i = this.kEH.kDu.kCl;
        bpt localbpt = this.kEH.kDu.vWf;
        new QrRewardMainUI.15.1(this);
        a.a(paramm, i, localbpt, localBundle, 1011);
        AppMethodBeat.o(41099);
      }
    while (true)
    {
      return;
      bool = false;
      break;
      if (!bo.isNullOrNil(this.kEH.kDu.kCm))
        Toast.makeText(this.kEC, this.kEH.kDu.kCm, 0).show();
      if (!this.kEH.kDv)
        QrRewardMainUI.a(this.kEC, false);
      AppMethodBeat.o(41099);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.15
 * JD-Core Version:    0.6.2
 */