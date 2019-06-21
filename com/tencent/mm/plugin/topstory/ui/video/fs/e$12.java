package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.topstory.ui.video.b;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

final class e$12
  implements View.OnClickListener
{
  e$12(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(1897);
    if ((e.g(this.sFU) != null) && (!bo.isNullOrNil(e.h(this.sFU).phw)))
    {
      paramView = new Intent();
      paramView.putExtra("rawUrl", e.i(this.sFU).phw);
      d.b(this.sFU.getFSVideoUIComponent().bKU().getApplicationContext(), "webview", ".ui.tools.WebViewUI", paramView);
    }
    AppMethodBeat.o(1897);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.e.12
 * JD-Core Version:    0.6.2
 */