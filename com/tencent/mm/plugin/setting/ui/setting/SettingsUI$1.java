package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.x.a.a;

final class SettingsUI$1
  implements a.a
{
  SettingsUI$1(SettingsUI paramSettingsUI)
  {
  }

  public final void b(ac.a parama)
  {
    AppMethodBeat.i(127560);
    if ((parama != null) && (parama == ac.a.xUP))
      SettingsUI.b(this.qpA);
    AppMethodBeat.o(127560);
  }

  public final void p(int paramInt, String paramString)
  {
    AppMethodBeat.i(127559);
    if ((paramInt == 262145) || (paramInt == 262157) || (paramInt == 262158))
      SettingsUI.a(this.qpA);
    AppMethodBeat.o(127559);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsUI.1
 * JD-Core Version:    0.6.2
 */