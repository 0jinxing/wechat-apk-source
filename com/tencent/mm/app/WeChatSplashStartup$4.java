package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.splash.a;
import com.tencent.mm.splash.h;
import com.tencent.mm.splash.o.a;
import java.io.File;

final class WeChatSplashStartup$4
  implements com.tencent.mm.kernel.api.g
{
  WeChatSplashStartup$4(WeChatSplashStartup paramWeChatSplashStartup, boolean paramBoolean, o.a parama)
  {
  }

  public final void BR()
  {
    AppMethodBeat.i(137943);
    com.tencent.mm.kernel.g.RQ().b(this);
    if (!this.cfE)
    {
      this.cfz.done();
      AppMethodBeat.o(137943);
    }
    while (true)
    {
      return;
      h.g("MicroMsg.FigLeaf", "deleteRequest ", new Object[0]);
      Object localObject = a.dqR();
      if (!new File((String)localObject).exists())
      {
        h.g("MicroMsg.FigLeaf", "deleteRequest dex opt dir not exists.", new Object[0]);
        AppMethodBeat.o(137943);
      }
      else
      {
        localObject = new File((String)localObject + "/main-process-blocking");
        if (((File)localObject).exists())
          h.g("MicroMsg.FigLeaf", "deleteRequest result %s.", new Object[] { Boolean.valueOf(((File)localObject).delete()) });
        AppMethodBeat.o(137943);
      }
    }
  }

  public final void bi(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WeChatSplashStartup.4
 * JD-Core Version:    0.6.2
 */