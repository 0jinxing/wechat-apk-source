package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.bx;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.al;

final class SettingsUI$19
  implements f
{
  SettingsUI$19(SettingsUI paramSettingsUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127581);
    paramString = r.Yz();
    if (bx.fnB.oL(paramString))
      bx.fnB.n(paramString, "last_logout_no_pwd_ticket", "");
    al.d(new SettingsUI.19.1(this));
    AppMethodBeat.o(127581);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.19
 * JD-Core Version:    0.6.2
 */