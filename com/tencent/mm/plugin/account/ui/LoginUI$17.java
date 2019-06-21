package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;

final class LoginUI$17
  implements Runnable
{
  LoginUI$17(LoginUI paramLoginUI, m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125044);
    ab.d("MicroMsg.LoginUI", "onSceneEnd, in runnable");
    Intent localIntent = a.gkE.bh(this.gDe);
    localIntent.addFlags(67108864);
    localIntent.putExtra("kstyle_show_bind_mobile_afterauth", ((q)this.crb).ajr());
    localIntent.putExtra("kstyle_bind_wording", ((q)this.crb).ajs());
    localIntent.putExtra("kstyle_bind_recommend_show", ((q)this.crb).aju());
    this.gDe.startActivity(localIntent);
    this.gDe.finish();
    AppMethodBeat.o(125044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.17
 * JD-Core Version:    0.6.2
 */