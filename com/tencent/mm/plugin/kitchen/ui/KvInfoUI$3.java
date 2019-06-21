package com.tencent.mm.plugin.kitchen.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.plugin.report.service.e;
import com.tencent.mm.plugin.report.service.j;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

final class KvInfoUI$3
  implements MMSwitchBtn.a
{
  KvInfoUI$3(KvInfoUI paramKvInfoUI)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(114443);
    j localj = j.cgu();
    localj.pWV = paramBoolean;
    e.kh(localj.pWV);
    a.kh(localj.pWV);
    AppMethodBeat.o(114443);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.kitchen.ui.KvInfoUI.3
 * JD-Core Version:    0.6.2
 */