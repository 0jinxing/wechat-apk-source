package com.tencent.xweb.x5;

import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient.CustomViewCallback;

public final class g$c
  implements WebChromeClient.CustomViewCallback
{
  IX5WebChromeClient.CustomViewCallback AQw;

  g$c(IX5WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    this.AQw = paramCustomViewCallback;
  }

  public final void onCustomViewHidden()
  {
    AppMethodBeat.i(84825);
    this.AQw.onCustomViewHidden();
    AppMethodBeat.o(84825);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.g.c
 * JD-Core Version:    0.6.2
 */