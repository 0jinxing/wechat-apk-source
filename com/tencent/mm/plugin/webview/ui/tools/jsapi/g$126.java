package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

final class g$126
  implements Runnable
{
  g$126(g paramg, String paramString1, i parami, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9203);
    ab.i("MicroMsg.MsgHandler", "doShareEmoticon use base64DataString");
    int i = this.uIu.indexOf(";base64,");
    Object localObject = "";
    if (i != -1)
      localObject = this.uIu.substring(i + 8, this.uIu.length());
    try
    {
      localObject = Base64.decode((String)localObject, 0);
      if (bo.cb((byte[])localObject))
      {
        g.a(this.uHd, this.uqf, "shareEmoticon:fail", null);
        AppMethodBeat.o(9203);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MsgHandler", "doShareEmoticon error:" + localException.getMessage());
        g.a(this.uHd, this.uqf, "shareEmoticon:fail_" + localException.getMessage(), null);
        AppMethodBeat.o(9203);
        continue;
        String str1 = com.tencent.mm.a.g.x(localException);
        if (bo.isNullOrNil(str1))
        {
          g.a(this.uHd, this.uqf, "shareEmoticon:fail empty buffer", null);
          AppMethodBeat.o(9203);
        }
        else
        {
          String str2 = EmojiLogic.L(b.Yb(), "", str1);
          if ((!e.ct(str2)) || (!e.atg(str2).equalsIgnoreCase(str1)))
            e.b(str2, localException, localException.length);
          g.a(this.uHd, str1, this.uIv);
          AppMethodBeat.o(9203);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.126
 * JD-Core Version:    0.6.2
 */