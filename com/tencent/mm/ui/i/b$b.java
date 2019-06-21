package com.tencent.mm.ui.i;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView;
import com.tencent.xweb.s;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
final class b$b extends s
{
  boolean zxZ = true;

  private b$b(b paramb)
  {
  }

  private static Bundle arZ(String paramString)
  {
    AppMethodBeat.i(80365);
    Bundle localBundle = new Bundle();
    if (paramString != null)
    {
      String[] arrayOfString = paramString.split("&");
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        paramString = arrayOfString[j].split("=");
        localBundle.putString(URLDecoder.decode(paramString[0]), URLDecoder.decode(paramString[1]));
      }
    }
    AppMethodBeat.o(80365);
    return localBundle;
  }

  private static Bundle asa(String paramString)
  {
    AppMethodBeat.i(80366);
    paramString = paramString.replace("wechatapp", "http");
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(paramString);
      paramString = arZ(localURL.getQuery());
      paramString.putAll(arZ(localURL.getRef()));
      AppMethodBeat.o(80366);
      return paramString;
    }
    catch (MalformedURLException paramString)
    {
      while (true)
      {
        paramString = new Bundle();
        AppMethodBeat.o(80366);
      }
    }
  }

  public final void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(80362);
    super.a(paramWebView, paramInt, paramString1, paramString2);
    this.zxZ = false;
    paramWebView = b.a(this.zLi);
    new com.tencent.mm.ui.f.a.b(paramString1, paramInt, paramString2);
    paramWebView.dKw();
    try
    {
      this.zLi.dismiss();
      b.b(this.zLi).dismiss();
      AppMethodBeat.o(80362);
      return;
    }
    catch (Exception paramWebView)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TwitterDialog", paramWebView, "", new Object[0]);
        AppMethodBeat.o(80362);
      }
    }
  }

  public final boolean a(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(80361);
    ab.d("Twitter-WebView", "Redirect URL: ".concat(String.valueOf(paramString)));
    if (paramString.startsWith("wechatapp://sign-in-twitter.wechatapp.com/"))
    {
      paramWebView = asa(paramString);
      if (paramWebView.getString("denied") == null)
      {
        b.a(this.zLi).p(paramWebView);
        this.zLi.dismiss();
        AppMethodBeat.o(80361);
      }
    }
    while (true)
    {
      return true;
      b.a(this.zLi).onCancel();
      break;
      this.zLi.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
      AppMethodBeat.o(80361);
    }
  }

  public final void b(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(80364);
    super.b(paramWebView, paramString);
    this.zxZ = false;
    try
    {
      b.b(this.zLi).dismiss();
      b.c(this.zLi).setBackgroundColor(0);
      b.d(this.zLi).setVisibility(0);
      b.e(this.zLi).setVisibility(0);
      AppMethodBeat.o(80364);
      return;
    }
    catch (Exception paramWebView)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TwitterDialog", paramWebView, "", new Object[0]);
    }
  }

  public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(80363);
    ab.d("Twitter-WebView", "Webview loading URL: ".concat(String.valueOf(paramString)));
    super.b(paramWebView, paramString, paramBitmap);
    try
    {
      b.b(this.zLi).show();
      paramWebView = b.b(this.zLi);
      paramString = new com/tencent/mm/ui/i/b$b$1;
      paramString.<init>(this);
      paramWebView.setOnDismissListener(paramString);
      AppMethodBeat.o(80363);
      return;
    }
    catch (Exception paramWebView)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TwitterDialog", paramWebView, "", new Object[0]);
        AppMethodBeat.o(80363);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i.b.b
 * JD-Core Version:    0.6.2
 */