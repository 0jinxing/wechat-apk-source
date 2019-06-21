package com.tencent.mm.plugin.game.luggage.d;

import com.tencent.luggage.d.k;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.b;
import com.tencent.xweb.c;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class e$4
  implements Runnable
{
  e$4(e parame, Map paramMap, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135967);
    if ((this.mTP != null) && (this.mTP.size() != 0))
    {
      e.a(this.mVd);
      c.jx(this.mVd.mContext);
      b localb = b.dTR();
      Iterator localIterator = this.mTP.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localb.setCookie(bo.anB(this.mTQ), str + "=" + (String)this.mTP.get(str));
      }
      localb.setCookie(bo.anB(this.mTQ), "httponly");
      c.dTT();
      c.sync();
      ab.i("MicroMsg.GameWebPage", "cookies:%s", new Object[] { localb.getCookie(bo.anB(e.b(this.mVd))) });
    }
    this.mVd.bPN.a(new e.4.1(this));
    AppMethodBeat.o(135967);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.e.4
 * JD-Core Version:    0.6.2
 */