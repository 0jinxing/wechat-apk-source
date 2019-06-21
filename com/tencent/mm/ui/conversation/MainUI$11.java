package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.storage.z;

final class MainUI$11
  implements Runnable
{
  MainUI$11(MainUI paramMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34504);
    a locala = MainUI.d(this.zvg);
    o.acd().d(locala);
    aw.ZK();
    c.Ry().a(locala);
    locala.dIn();
    AppMethodBeat.o(34504);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.11
 * JD-Core Version:    0.6.2
 */