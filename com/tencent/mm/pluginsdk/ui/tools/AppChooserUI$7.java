package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.permission.a;
import com.tencent.mm.storage.z;

final class AppChooserUI$7
  implements a
{
  AppChooserUI$7(AppChooserUI paramAppChooserUI)
  {
  }

  public final void dT(boolean paramBoolean)
  {
    AppMethodBeat.i(125864);
    if (paramBoolean)
    {
      if (AppChooserUI.a(this.vty) == null)
        break label103;
      AppChooserUI.a(this.vty).vtz = AppChooserUI.f.vtM;
      AppChooserUI.a(this.vty).notifyDataSetChanged();
      AppMethodBeat.o(125864);
    }
    while (true)
    {
      return;
      g.RP().Ry().set(AppChooserUI.a(this.vty, 274560), Long.valueOf(0L));
      if (AppChooserUI.a(this.vty) != null)
      {
        AppChooserUI.a(this.vty).vtz = AppChooserUI.f.vtK;
        AppChooserUI.a(this.vty).notifyDataSetChanged();
      }
      label103: AppMethodBeat.o(125864);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.7
 * JD-Core Version:    0.6.2
 */