package com.tencent.mm.plugin.welab.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WelabMainUI$1
  implements View.OnClickListener
{
  WelabMainUI$1(WelabMainUI paramWelabMainUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(80615);
    Intent localIntent = new Intent();
    localIntent.putExtra("title", paramView.getResources().getString(2131305644));
    localIntent.putExtra("rawUrl", this.uMC.mController.ylL.getString(2131305639, new Object[] { aa.dor(), Integer.valueOf(com.tencent.mm.protocal.d.vxo) }));
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bp.d.b(paramView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(80615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.ui.WelabMainUI.1
 * JD-Core Version:    0.6.2
 */