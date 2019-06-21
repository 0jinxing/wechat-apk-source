package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class SettingsAliasUI$5
  implements f
{
  SettingsAliasUI$5(SettingsAliasUI paramSettingsAliasUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127190);
    ab.d("MicroMsg.SettingsAliasUI", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramm.getType());
    g.Rg().b(255, SettingsAliasUI.g(this.qmW));
    al.d(new SettingsAliasUI.5.1(this, paramm, paramInt2, paramInt1));
    AppMethodBeat.o(127190);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.5
 * JD-Core Version:    0.6.2
 */