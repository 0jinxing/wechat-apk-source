package com.tencent.mm.ui.d;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class a$1
  implements View.OnClickListener
{
  a$1(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29989);
    this.ysi.Nx(1);
    a locala = this.ysi;
    paramView = this.ysi.mUrl;
    if (bo.isNullOrNil(paramView))
    {
      ab.e("MicroMsg.ChattingMonitoredBanner", "hy: not provide url");
      AppMethodBeat.o(29989);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramView);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("show_bottom", false);
      d.b((Context)locala.vlu.get(), "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(29989);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.d.a.1
 * JD-Core Version:    0.6.2
 */