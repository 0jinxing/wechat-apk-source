package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;

final class FTSSOSHomeWebViewUI$7
  implements AdapterView.OnItemClickListener
{
  FTSSOSHomeWebViewUI$7(FTSSOSHomeWebViewUI paramFTSSOSHomeWebViewUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(8435);
    paramAdapterView = FTSSOSHomeWebViewUI.z(this.uBG).JF(paramInt);
    this.uBG.dby().n(paramAdapterView.content, null);
    if (paramAdapterView.type == 2)
    {
      FTSSOSHomeWebViewUI.a(this.uBG, paramAdapterView, 1);
      FTSSOSHomeWebViewUI.e(this.uBG, 1);
    }
    this.uBG.aMo();
    AppMethodBeat.o(8435);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI.7
 * JD-Core Version:    0.6.2
 */