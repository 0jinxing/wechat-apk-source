package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class AppBrandSearchUI$1
  implements View.OnClickListener
{
  AppBrandSearchUI$1(AppBrandSearchUI paramAppBrandSearchUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17081);
    if (TextUtils.isEmpty(AppBrandSearchUI.a(this.iIz)))
      AppMethodBeat.o(17081);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("rawUrl", AppBrandSearchUI.a(this.iIz));
      localIntent.putExtra("geta8key_scene", 41);
      localIntent.putExtra("show_long_click_popup_menu", false);
      d.b(paramView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(17081);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI.1
 * JD-Core Version:    0.6.2
 */