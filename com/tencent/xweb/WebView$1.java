package com.tencent.xweb;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebView$1 extends MutableContextWrapper
{
  WebView$1(Context paramContext)
  {
    super(paramContext);
  }

  public final void setBaseContext(Context paramContext)
  {
    AppMethodBeat.i(3839);
    super.setBaseContext(paramContext);
    m.dTZ();
    AppMethodBeat.o(3839);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.WebView.1
 * JD-Core Version:    0.6.2
 */