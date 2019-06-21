package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.webkit.ConsoleMessage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.l;
import java.net.URLDecoder;
import java.util.Map;

final class ComposeUI$a extends l
{
  private ComposeUI$a(ComposeUI paramComposeUI)
  {
  }

  @Deprecated
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    AppMethodBeat.i(68207);
    ab.i("MicroMsg.ComposeUI", "console, consoleMessage: %s", new Object[] { paramConsoleMessage });
    Object localObject1;
    if (paramConsoleMessage != null)
    {
      localObject1 = paramConsoleMessage.message();
      localObject1 = u.akn((String)localObject1);
      if (!((String)localObject1).startsWith(ComposeUI.m(this.pwY)))
        break label267;
      this.pwY.aqX();
    }
    while (true)
    {
      Object localObject3;
      Object localObject4;
      try
      {
        localObject3 = URLDecoder.decode(((String)localObject1).substring(ComposeUI.m(this.pwY).length()), "utf-8").split("@@");
        localObject4 = localObject3[0].split(":");
        localObject1 = localObject4[0];
        localObject4 = localObject4[1];
        ab.i("MicroMsg.ComposeUI", "img onclick, src: %s, msgLocalId: %s, msgSvrId: %s", new Object[] { localObject3[1], localObject1, localObject4 });
        localObject3 = ((j)g.K(j.class)).bOr().jf(Integer.valueOf((String)localObject1).intValue());
        localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>(this.pwY, MailImageDownloadUI.class);
        ((Intent)localObject1).putExtra("img_msg_id", ((cy)localObject3).field_msgId);
        ((Intent)localObject1).putExtra("img_server_id", ((cy)localObject3).field_msgSvrId);
        ((Intent)localObject1).putExtra("img_download_compress_type", 0);
        ((Intent)localObject1).putExtra("img_download_username", ((cy)localObject3).field_talker);
        this.pwY.startActivity((Intent)localObject1);
        AppMethodBeat.o(68207);
        bool = true;
        return bool;
        localObject1 = null;
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.ComposeUI", "consoleMessage IMG_ONCLICK, ex = %s", new Object[] { localException.getMessage() });
      }
      label267: label421: 
      do
      {
        while (true)
        {
          bool = super.onConsoleMessage(paramConsoleMessage);
          AppMethodBeat.o(68207);
          break;
          if (!localException.startsWith(ComposeUI.n(this.pwY)))
            break label421;
          try
          {
            ComposeUI.a(this.pwY, URLDecoder.decode(localException.substring(ComposeUI.n(this.pwY).length()), "utf-8"));
            if (ComposeUI.o(this.pwY))
              if (ComposeUI.p(this.pwY).indexOf("<img") == -1)
              {
                ComposeUI.q(this.pwY).clear();
                ComposeUI.r(this.pwY);
                AppMethodBeat.o(68207);
                bool = true;
              }
          }
          catch (Exception paramConsoleMessage)
          {
            while (true)
              ab.w("MicroMsg.ComposeUI", "consoleMessage GET_MAIL_CONTENT, ex = %s", new Object[] { paramConsoleMessage.getMessage() });
            u.a(ComposeUI.s(this.pwY), ComposeUI.t(this.pwY), ComposeUI.u(this.pwY));
            AppMethodBeat.o(68207);
            bool = true;
          }
        }
        break;
      }
      while (!localException.startsWith(ComposeUI.t(this.pwY)));
      ComposeUI.q(this.pwY).clear();
      try
      {
        paramConsoleMessage = URLDecoder.decode(localException.substring(ComposeUI.t(this.pwY).length()), "utf-8");
        localObject4 = paramConsoleMessage.split("&&");
        for (int i = 0; i < localObject4.length; i++)
        {
          paramConsoleMessage = localObject4[i].split("@@");
          localObject3 = paramConsoleMessage[0].split(":")[1];
          Object localObject2 = paramConsoleMessage[1];
          paramConsoleMessage = localObject2;
          if (localObject2.startsWith("file://"))
            paramConsoleMessage = localObject2.replaceFirst("file://", "");
          ab.i("MicroMsg.ComposeUI", "put msgImgInfoMap, msgSvrId: %s, path: %s", new Object[] { localObject3, paramConsoleMessage });
          ComposeUI.q(this.pwY).put(localObject3, paramConsoleMessage);
        }
      }
      catch (Exception paramConsoleMessage)
      {
        ab.w("MicroMsg.ComposeUI", "consoleMessage GET_IMG_INFO, ex = %s", new Object[] { paramConsoleMessage.getMessage() });
        AppMethodBeat.o(68207);
        bool = true;
      }
      continue;
      if (ComposeUI.o(this.pwY))
        ComposeUI.r(this.pwY);
      AppMethodBeat.o(68207);
      boolean bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.a
 * JD-Core Version:    0.6.2
 */