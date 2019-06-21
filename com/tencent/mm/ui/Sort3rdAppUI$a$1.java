package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class Sort3rdAppUI$a$1
  implements MMSwitchBtn.a
{
  Sort3rdAppUI$a$1(Sort3rdAppUI.a parama, f paramf)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(29900);
    f localf;
    if (paramBoolean)
      localf = this.yqr;
    for (localf.field_appInfoFlag &= -16385; ; localf.field_appInfoFlag |= 16384)
    {
      am.bYJ().a(this.yqr, new String[0]);
      AppMethodBeat.o(29900);
      return;
      localf = this.yqr;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.Sort3rdAppUI.a.1
 * JD-Core Version:    0.6.2
 */