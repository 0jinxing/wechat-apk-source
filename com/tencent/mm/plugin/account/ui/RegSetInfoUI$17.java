package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ad;
import com.tencent.mm.ui.applet.SecurityImage.b;

final class RegSetInfoUI$17 extends SecurityImage.b
{
  RegSetInfoUI$17(RegSetInfoUI paramRegSetInfoUI, m paramm)
  {
  }

  public final void apw()
  {
    AppMethodBeat.i(125524);
    this.gHM.aqX();
    int i = RegSetInfoUI.e(this.gHM);
    Object localObject = RegSetInfoUI.f(this.gHM);
    g.Rg().a(429, this.gHM);
    localObject = new ad((String)localObject, RegSetInfoUI.g(this.gHM), i, "", "", ((ad)this.crb).ajn(), "");
    g.Rg().a((m)localObject, 0);
    AppMethodBeat.o(125524);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.17
 * JD-Core Version:    0.6.2
 */