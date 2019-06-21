package com.tencent.mm.plugin.choosemsgfile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.e.c;

final class ChooseMsgFileUI$10$1
  implements e.c
{
  ChooseMsgFileUI$10$1(ChooseMsgFileUI.10 param10)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(54453);
    ab.i("MicroMsg.ChooseMsgFileUI", "bOk:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
      ChooseMsgFileUI.d(this.kvT.kvQ);
    AppMethodBeat.o(54453);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI.10.1
 * JD-Core Version:    0.6.2
 */