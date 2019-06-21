package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

final class MainUI$3
  implements Runnable
{
  MainUI$3(MainUI paramMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34494);
    a locala = MainUI.d(this.zvg);
    ab.i("MicroMsg.BannerHelper", "destroyBanner");
    a.fw(locala.zqr);
    a.fw(locala.zqs);
    a.fw(locala.zqt);
    a.fw(locala.zqu);
    Iterator localIterator = locala.zqv.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb != null)
        localb.destroy();
    }
    aw.b(locala.qbK);
    com.tencent.mm.sdk.b.a.xxA.d(locala.zqx);
    com.tencent.mm.sdk.b.a.xxA.d(locala.zqy);
    if (aw.RK())
    {
      aw.ZK();
      c.b(locala);
    }
    locala.context = null;
    AppMethodBeat.o(34494);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.3
 * JD-Core Version:    0.6.2
 */