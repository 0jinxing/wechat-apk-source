package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;

public final class l extends k
{
  d uJH = null;
  private m uJI = null;

  public l(MMWebView paramMMWebView, boolean paramBoolean, d paramd)
  {
    this(paramMMWebView, paramBoolean, paramd, null);
  }

  public l(MMWebView paramMMWebView, boolean paramBoolean, d paramd, Bundle paramBundle)
  {
    super(paramMMWebView, paramBoolean, paramBundle);
    this.uJH = paramd;
  }

  protected final void a(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(10024);
    super.a(paramWebView, paramString, paramBitmap);
    if ((this.uJH instanceof e))
      ((e)this.uJH).abb();
    AppMethodBeat.o(10024);
  }

  protected final m aGt()
  {
    AppMethodBeat.i(10023);
    if (this.uJI == null)
      this.uJI = new l.1(this);
    m localm = this.uJI;
    AppMethodBeat.o(10023);
    return localm;
  }

  protected final void e(WebView paramWebView, String paramString)
  {
    AppMethodBeat.i(10025);
    super.e(paramWebView, paramString);
    if ((this.uJH instanceof e))
      ((e)this.uJH).a((MMWebView)paramWebView);
    AppMethodBeat.o(10025);
  }

  protected final boolean oZ(String paramString)
  {
    AppMethodBeat.i(10026);
    boolean bool;
    if ((this.uJH != null) && ((this.uJH instanceof e)))
    {
      bool = ((e)this.uJH).oZ(paramString);
      AppMethodBeat.o(10026);
    }
    while (true)
    {
      return bool;
      bool = super.oZ(paramString);
      AppMethodBeat.o(10026);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.l
 * JD-Core Version:    0.6.2
 */