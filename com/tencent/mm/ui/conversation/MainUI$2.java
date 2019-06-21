package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;

final class MainUI$2
  implements Runnable
{
  MainUI$2(MainUI paramMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34493);
    a locala = MainUI.d(this.zvg);
    ab.i("MicroMsg.BannerHelper", "releaseBanner");
    a.fv(locala.zqr);
    a.fv(locala.zqs);
    a.fv(locala.zqt);
    a.fv(locala.zqu);
    Iterator localIterator = locala.zqv.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb != null)
        localb.release();
    }
    if (aw.RK())
      o.acd().e(locala);
    if (aw.RK())
    {
      aw.ZK();
      c.Ry().b(locala);
    }
    AppMethodBeat.o(34493);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.2
 * JD-Core Version:    0.6.2
 */