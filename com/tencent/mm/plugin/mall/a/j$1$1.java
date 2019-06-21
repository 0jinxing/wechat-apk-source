package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import java.util.Map;

final class j$1$1
  implements Runnable
{
  j$1$1(j.1 param1, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43116);
    com.tencent.mm.plugin.wallet_core.model.mall.c localc = com.tencent.mm.plugin.wallet_core.model.mall.c.cQT();
    Object localObject = this.gUV;
    MallNews localMallNews = com.tencent.mm.plugin.wallet_core.model.mall.c.acJ((String)localObject);
    if (localMallNews != null)
      if (!"2".equals(localMallNews.type))
      {
        localc.tDE.put(localMallNews.fsT, localMallNews);
        ab.i("MicroMsg.MallNewsManager", "onRecieveMsg : ".concat(String.valueOf(localObject)));
        localc.bZX();
        if (com.tencent.mm.plugin.wallet_core.model.mall.c.a(localMallNews))
        {
          ab.i("MicroMsg.MallNewsManager", "set OutOfDateRedDot");
          AppMethodBeat.o(43116);
        }
      }
    while (true)
    {
      return;
      if (localMallNews.showType == 0)
      {
        ab.d("MicroMsg.MallNewsManager", "showType New");
        com.tencent.mm.x.c.PK().x(262156, true);
        g.RQ();
        g.RP().Ry().set(ac.a.xSq, Long.valueOf(System.currentTimeMillis()));
      }
      while (true)
      {
        com.tencent.mm.plugin.wallet_core.model.mall.c.cQV();
        AppMethodBeat.o(43116);
        break;
        if (localMallNews.showType == 1)
        {
          ab.d("MicroMsg.MallNewsManager", "showType Dot");
          com.tencent.mm.x.c.PK().y(262156, true);
          g.RQ();
          g.RP().Ry().set(ac.a.xSq, Long.valueOf(System.currentTimeMillis()));
        }
      }
      ab.d("MicroMsg.MallNewsManager", "removeNews : ".concat(String.valueOf(localMallNews)));
      localObject = (MallNews)localc.tDE.get(localMallNews.fsT);
      if ((localObject != null) && (((MallNews)localObject).ssr.equals(localMallNews.ssr)) && (((MallNews)localObject).cxb.equals(localMallNews.cxb)))
      {
        ab.i("MicroMsg.MallNewsManager", "onRecieveMsg remove : " + localMallNews.fsT);
        localc.tDE.remove(localMallNews.fsT);
        AppMethodBeat.o(43116);
      }
      else
      {
        ab.i("MicroMsg.MallNewsManager", "onRecieveMsg cancel not found!");
        AppMethodBeat.o(43116);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.j.1.1
 * JD-Core Version:    0.6.2
 */