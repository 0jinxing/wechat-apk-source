package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

final class g$122
  implements Runnable
{
  g$122(g paramg, String paramString1, i parami, String paramString2, String paramString3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9199);
    ab.i("MicroMsg.MsgHandler", "doAddToEmoticon use base64DataString");
    int i = this.uIu.indexOf(";base64,");
    String str1 = "";
    if (i != -1)
      str1 = this.uIu.substring(i + 8, this.uIu.length());
    try
    {
      arrayOfByte = Base64.decode(str1, 0);
      if (bo.cb(arrayOfByte))
      {
        g.a(this.uHd, this.uqf, "addToEmoticon:fail", null);
        AppMethodBeat.o(9199);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        byte[] arrayOfByte;
        ab.e("MicroMsg.MsgHandler", "doAddToEmoticon error:" + localException.getMessage());
        g.a(this.uHd, this.uqf, "addToEmoticon:fail_" + localException.getMessage(), null);
        AppMethodBeat.o(9199);
        continue;
        String str3 = com.tencent.mm.a.g.x(arrayOfByte);
        String str2 = EmojiLogic.L(b.Yb(), "", str3);
        if ((!e.ct(str2)) || (!e.atg(str2).equalsIgnoreCase(str3)))
          e.b(str2, arrayOfByte, arrayOfByte.length);
        g.a(this.uHd, str3, this.fEJ, this.uIv);
        AppMethodBeat.o(9199);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.122
 * JD-Core Version:    0.6.2
 */