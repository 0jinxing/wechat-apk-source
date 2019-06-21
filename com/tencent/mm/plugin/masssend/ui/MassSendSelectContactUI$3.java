package com.tencent.mm.plugin.masssend.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.a;
import java.util.HashSet;

final class MassSendSelectContactUI$3
  implements MultiSelectContactView.a
{
  MassSendSelectContactUI$3(MassSendSelectContactUI paramMassSendSelectContactUI)
  {
  }

  public final void vI(String paramString)
  {
    AppMethodBeat.i(22876);
    if (paramString != null)
    {
      MassSendSelectContactUI.a(this.opp).remove(paramString);
      MassSendSelectContactUI.a(this.opp, MassSendSelectContactUI.a(this.opp).size());
    }
    AppMethodBeat.o(22876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI.3
 * JD-Core Version:    0.6.2
 */