package com.tencent.xweb.x5;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.WebChromeClient;

public class b extends WebChromeClient
{
  public final void dVA()
  {
    AppMethodBeat.i(84796);
    super.onHideCustomView();
    AppMethodBeat.o(84796);
  }

  public View getVideoLoadingProgressView()
  {
    AppMethodBeat.i(84797);
    View localView = super.getVideoLoadingProgressView();
    AppMethodBeat.o(84797);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.b
 * JD-Core Version:    0.6.2
 */