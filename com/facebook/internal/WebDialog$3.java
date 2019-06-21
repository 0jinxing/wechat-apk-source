package com.facebook.internal;

import android.content.Context;
import android.webkit.WebView;
import com.tencent.matrix.trace.core.AppMethodBeat;

class WebDialog$3 extends WebView
{
  WebDialog$3(WebDialog paramWebDialog, Context paramContext)
  {
    super(paramContext);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(96657);
    try
    {
      super.onWindowFocusChanged(paramBoolean);
      AppMethodBeat.o(96657);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
        AppMethodBeat.o(96657);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WebDialog.3
 * JD-Core Version:    0.6.2
 */