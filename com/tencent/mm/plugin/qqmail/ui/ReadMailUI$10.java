package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.plugin.webview.ui.tools.widget.e;
import com.tencent.mm.plugin.webview.ui.tools.widget.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.widget.MMWebView;

final class ReadMailUI$10
  implements e
{
  ReadMailUI$10(ReadMailUI paramReadMailUI)
  {
  }

  public final void a(MMWebView paramMMWebView)
  {
    AppMethodBeat.i(68433);
    paramMMWebView.evaluateJavascript("javascript:var meta = document.createElement(\"meta\");meta.name=\"viewport\";meta.id=\"viewport\";meta.content=\"initial-scale=1,user-scalable=yes,maximum-scale=3.0\";document.head.appendChild(meta);", null);
    paramMMWebView.evaluateJavascript("javascript:" + ReadMailUI.cds(), null);
    paramMMWebView.evaluateJavascript("javascript:" + ReadMailUI.cdt(), null);
    paramMMWebView.evaluateJavascript("javascript:" + ReadMailUI.cdu(), null);
    if (ReadMailUI.l(this.pzZ).isConnected())
    {
      if (!ReadMailUI.t(this.pzZ))
        ReadMailUI.u(this.pzZ);
      ReadMailUI.a(this.pzZ, new ReadMailProxy(ReadMailUI.l(this.pzZ), null, new ReadMailUI.b(this.pzZ), new ReadMailUI.c(this.pzZ)));
      ReadMailUI.v(this.pzZ).REMOTE_CALL("addDownloadCallback", new Object[0]);
    }
    new ak(this.pzZ.getMainLooper()).postDelayed(new ReadMailUI.10.1(this), 200L);
    new ak(this.pzZ.getMainLooper()).postDelayed(new ReadMailUI.10.2(this), 400L);
    AppMethodBeat.o(68433);
  }

  public final boolean aba()
  {
    return false;
  }

  public final void abb()
  {
  }

  public final boolean c(int paramInt, Bundle paramBundle)
  {
    return false;
  }

  public final boolean oZ(String paramString)
  {
    AppMethodBeat.i(68432);
    ab.d("MicroMsg.ReadMailUI", "url:%s", new Object[] { paramString });
    Intent localIntent;
    boolean bool;
    if ((paramString != null) && (paramString.startsWith("mailto:")))
    {
      paramString = paramString.trim().replace("mailto:", "");
      localIntent = new Intent(this.pzZ, ComposeUI.class);
      localIntent.putExtra("composeType", 4);
      localIntent.putExtra("toList", new String[] { paramString + " " + paramString });
      this.pzZ.startActivity(localIntent);
      AppMethodBeat.o(68432);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramString != null) && (paramString.startsWith("tel:")))
      {
        paramString = new Intent("android.intent.action.DIAL", Uri.parse(paramString));
        paramString.addFlags(268435456);
        this.pzZ.startActivity(paramString);
        break;
      }
      if ((paramString != null) && (!paramString.startsWith("data:")))
      {
        if (((h)ReadMailUI.g(this.pzZ)).dcQ())
        {
          ((h)ReadMailUI.g(this.pzZ)).dcR();
          AppMethodBeat.o(68432);
          bool = true;
          continue;
        }
        if (paramString.startsWith("http"))
        {
          localIntent = new Intent();
          localIntent.putExtra("rawUrl", paramString);
          com.tencent.mm.bp.d.b(this.pzZ, "webview", ".ui.tools.WebViewUI", localIntent);
          break;
        }
        AppMethodBeat.o(68432);
        bool = false;
        continue;
      }
      AppMethodBeat.o(68432);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.10
 * JD-Core Version:    0.6.2
 */