package com.tencent.xweb.xwalk;

import android.webkit.WebView.FindListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkFindListener;

public final class f$f extends XWalkFindListener
{
  WebView.FindListener AQm;

  public f$f(WebView.FindListener paramFindListener)
  {
    this.AQm = paramFindListener;
  }

  public final void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(85226);
    if (this.AQm != null)
      this.AQm.onFindResultReceived(paramInt1, paramInt2, paramBoolean);
    AppMethodBeat.o(85226);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.f.f
 * JD-Core Version:    0.6.2
 */