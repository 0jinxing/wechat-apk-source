package com.tencent.mm.plugin.choosemsgfile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.e.c;

final class ChooseMsgFileListUI$3$1
  implements e.c
{
  ChooseMsgFileListUI$3$1(ChooseMsgFileListUI.3 param3)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(54413);
    ab.i("MicroMsg.ChooseMsgFileListUI", "bOk:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
      ChooseMsgFileListUI.b(this.kvC.kvB);
    AppMethodBeat.o(54413);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileListUI.3.1
 * JD-Core Version:    0.6.2
 */