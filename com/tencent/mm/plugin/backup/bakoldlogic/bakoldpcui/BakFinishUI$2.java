package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;

final class BakFinishUI$2
  implements Runnable
{
  BakFinishUI$2(BakFinishUI paramBakFinishUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17922);
    a.aUB().aUC().jzK = -1;
    BakFinishUI.b(this.jAw);
    AppMethodBeat.o(17922);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakFinishUI.2
 * JD-Core Version:    0.6.2
 */