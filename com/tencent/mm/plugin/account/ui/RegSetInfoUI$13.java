package com.tencent.mm.plugin.account.ui;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.ui.applet.SecurityImage.b;

final class RegSetInfoUI$13 extends SecurityImage.b
{
  RegSetInfoUI$13(RegSetInfoUI paramRegSetInfoUI, m paramm)
  {
  }

  public final void apw()
  {
    AppMethodBeat.i(125519);
    this.gHM.aqX();
    String str = RegSetInfoUI.a(this.gHM).getText().toString().trim();
    Object localObject = RegSetInfoUI.b(this.gHM).getText().toString().trim();
    int i = RegSetInfoUI.e(this.gHM);
    g.Rg().a(126, this.gHM);
    localObject = new s("", RegSetInfoUI.y(this.gHM), (String)localObject, RegSetInfoUI.z(this.gHM), RegSetInfoUI.A(this.gHM), RegSetInfoUI.B(this.gHM), "", "", RegSetInfoUI.g(this.gHM), i, str, ((s)this.crb).ajn(), "", RegSetInfoUI.D(this.gHM), RegSetInfoUI.j(this.gHM));
    ((s)localObject).ts(RegSetInfoUI.E(this.gHM));
    ((s)localObject).tt(RegSetInfoUI.F(this.gHM));
    ((s)localObject).lX(RegSetInfoUI.G(this.gHM));
    g.Rg().a((m)localObject, 0);
    AppMethodBeat.o(125519);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.13
 * JD-Core Version:    0.6.2
 */