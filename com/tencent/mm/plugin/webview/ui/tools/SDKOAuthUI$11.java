package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bet;

final class SDKOAuthUI$11
  implements AdapterView.OnItemClickListener
{
  SDKOAuthUI$11(SDKOAuthUI paramSDKOAuthUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(7535);
    SDKOAuthUI.b.a(SDKOAuthUI.h(this.usQ), SDKOAuthUI.h(this.usQ).Jm(paramInt).id);
    SDKOAuthUI.h(this.usQ).notifyDataSetChanged();
    AppMethodBeat.o(7535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.11
 * JD-Core Version:    0.6.2
 */