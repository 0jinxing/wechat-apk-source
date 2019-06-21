package com.tencent.mm.plugin.game.luggage;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.b;
import com.tencent.xweb.c;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1, Map paramMap, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135823);
    String str1;
    String str2;
    Object localObject1;
    Object localObject2;
    String str3;
    if (this.mTP != null)
    {
      str1 = "." + bo.anB(this.mTQ);
      str2 = bo.anB(this.mTQ);
      c.jx(ah.getContext());
      localObject1 = b.dTR();
      localObject2 = this.mTP.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        str3 = (String)((Iterator)localObject2).next();
        ((b)localObject1).setCookie(str2, str3 + "=" + (String)this.mTP.get(str3));
      }
      if (!bo.isNullOrNil(this.mTQ))
      {
        str3 = Uri.parse(this.mTQ).getQueryParameter("pass_ticket");
        if (!bo.isNullOrNil(str3))
        {
          ((b)localObject1).setCookie(str2, "pass_ticket=".concat(String.valueOf(str3)));
          ((b)localObject1).setCookie(str1, "pass_ticket=".concat(String.valueOf(str3)));
        }
      }
      ((b)localObject1).setCookie(str2, "httponly");
      ((b)localObject1).setCookie(str1, "httponly");
      c.dTT();
      c.sync();
      ab.i("MicroMsg.LuggageGetA8KeyUtil", "cookies:%s", new Object[] { ((b)localObject1).getCookie(str2) });
    }
    while (true)
    {
      l.q(new c.2(this.mTR.mTO, this.mTQ));
      AppMethodBeat.o(135823);
      return;
      str1 = this.mTQ;
      localObject1 = "." + bo.anB(str1);
      str2 = bo.anB(str1);
      localObject2 = Uri.parse(str1);
      str3 = ((Uri)localObject2).getQueryParameter("uin");
      str1 = ((Uri)localObject2).getQueryParameter("key");
      localObject2 = ((Uri)localObject2).getQueryParameter("pass_ticket");
      c.jx(ah.getContext());
      b localb = b.dTR();
      if (!bo.isNullOrNil(str3))
      {
        localb.setCookie((String)localObject1, "uin=".concat(String.valueOf(str3)));
        localb.setCookie(str2, "uin=".concat(String.valueOf(str3)));
      }
      if (!bo.isNullOrNil(str1))
      {
        localb.setCookie((String)localObject1, "key=".concat(String.valueOf(str1)));
        localb.setCookie(str2, "key=".concat(String.valueOf(str1)));
      }
      if (!bo.isNullOrNil((String)localObject2))
      {
        localb.setCookie((String)localObject1, "pass_ticket=".concat(String.valueOf(localObject2)));
        localb.setCookie(str2, "pass_ticket=".concat(String.valueOf(localObject2)));
      }
      localb.setCookie(str2, "httponly");
      localb.setCookie((String)localObject1, "httponly");
      c.dTT();
      c.sync();
      ab.i("MicroMsg.LuggageGetA8KeyUtil", "getUinKeyFromFullUrl, cookies:%s", new Object[] { localb.getCookie(str2) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.1.1
 * JD-Core Version:    0.6.2
 */