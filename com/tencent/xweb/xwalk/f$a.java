package com.tencent.xweb.xwalk;

import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.CustomViewCallback;

public final class f$a
  implements WebChromeClient.CustomViewCallback
{
  CustomViewCallback ART;

  f$a(CustomViewCallback paramCustomViewCallback)
  {
    this.ART = paramCustomViewCallback;
  }

  public final void onCustomViewHidden()
  {
    AppMethodBeat.i(85217);
    this.ART.onCustomViewHidden();
    AppMethodBeat.o(85217);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.f.a
 * JD-Core Version:    0.6.2
 */