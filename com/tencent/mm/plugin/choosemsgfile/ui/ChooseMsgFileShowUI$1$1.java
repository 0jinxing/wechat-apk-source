package com.tencent.mm.plugin.choosemsgfile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.x5.sdk.d.a;

final class ChooseMsgFileShowUI$1$1
  implements d.a
{
  ChooseMsgFileShowUI$1$1(ChooseMsgFileShowUI.1 param1)
  {
  }

  public final void onViewInitFinished(boolean paramBoolean)
  {
    AppMethodBeat.i(54431);
    ab.i("MicroMsg.ChooseMsgFileShowUI", "tbs preInit callback, %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      ChooseMsgFileShowUI.b(this.kvG.kvF, this.kvG.val$filePath, this.kvG.kvE);
      AppMethodBeat.o(54431);
    }
    while (true)
    {
      return;
      ChooseMsgFileShowUI.a(this.kvG.kvF, this.kvG.val$filePath, this.kvG.kvE);
      AppMethodBeat.o(54431);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileShowUI.1.1
 * JD-Core Version:    0.6.2
 */