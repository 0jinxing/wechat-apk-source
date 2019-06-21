package com.tencent.mm.plugin.expt.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.picker.b;
import com.tencent.mm.ui.widget.picker.b.a;

final class ExptDebugUI$4$1
  implements b.a
{
  ExptDebugUI$4$1(ExptDebugUI.4 param4, b paramb, String[] paramArrayOfString)
  {
  }

  public final void d(boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(73635);
    this.jqm.hide();
    int i = this.jqm.dLl();
    paramObject = this.lPe[i];
    ExptDebugUI.a(this.lPf.lPd, bo.getInt(paramObject, 0));
    AppMethodBeat.o(73635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.ui.ExptDebugUI.4.1
 * JD-Core Version:    0.6.2
 */