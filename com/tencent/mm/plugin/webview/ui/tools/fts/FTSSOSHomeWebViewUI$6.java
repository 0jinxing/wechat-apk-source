package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;

final class FTSSOSHomeWebViewUI$6
  implements View.OnClickListener
{
  FTSSOSHomeWebViewUI$6(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(8434);
    paramView = (FTSSOSHomeWebViewUI.c)paramView.getTag();
    Bundle localBundle;
    if (paramView.type == 1)
    {
      localBundle = new Bundle();
      localBundle.putString("history", paramView.content);
    }
    try
    {
      FTSSOSHomeWebViewUI.y(this.uBG).j(5, localBundle);
      label54: al.d(new FTSSOSHomeWebViewUI.a.2(FTSSOSHomeWebViewUI.z(this.uBG), paramView));
      AppMethodBeat.o(8434);
      while (true)
      {
        return;
        if (paramView.type == 2)
        {
          FTSSOSHomeWebViewUI.z(this.uBG).clear();
          this.uBG.dby().n(paramView.content, null);
          FTSSOSHomeWebViewUI.a(this.uBG, paramView, 2);
          FTSSOSHomeWebViewUI.e(this.uBG, 2);
          FTSSOSHomeWebViewUI.A(this.uBG);
        }
        AppMethodBeat.o(8434);
      }
    }
    catch (RemoteException localRemoteException)
    {
      break label54;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.6
 * JD-Core Version:    0.6.2
 */