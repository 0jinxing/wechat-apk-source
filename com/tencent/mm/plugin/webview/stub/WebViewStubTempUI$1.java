package com.tencent.mm.plugin.webview.stub;

import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewStubTempUI$1 extends ResultReceiver
{
  WebViewStubTempUI$1(Handler paramHandler, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    super(paramHandler);
  }

  protected final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7218);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(7218);
      while (true)
      {
        return;
        this.uqL.onClick(null, 0);
        AppMethodBeat.o(7218);
      }
      this.uqM.onClick(null, 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubTempUI.1
 * JD-Core Version:    0.6.2
 */