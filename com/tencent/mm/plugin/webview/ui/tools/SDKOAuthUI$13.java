package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bet;
import com.tencent.mm.ui.widget.b.a;

final class SDKOAuthUI$13
  implements AdapterView.OnItemLongClickListener
{
  SDKOAuthUI$13(SDKOAuthUI paramSDKOAuthUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(7537);
    SDKOAuthUI.d(this.usQ, paramInt);
    int i = SDKOAuthUI.h(this.usQ).Jm(paramInt).id;
    if ((i != 0) && (i != 1))
      SDKOAuthUI.l(this.usQ).a(paramView, paramInt, paramLong, this.usQ, SDKOAuthUI.i(this.usQ), SDKOAuthUI.j(this.usQ), SDKOAuthUI.k(this.usQ));
    AppMethodBeat.o(7537);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.13
 * JD-Core Version:    0.6.2
 */