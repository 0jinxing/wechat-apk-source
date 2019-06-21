package com.tencent.mm.plugin.sns.ui.jsapi;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;

final class JsapiSnsLabelUI$8
  implements MenuItem.OnMenuItemClickListener
{
  JsapiSnsLabelUI$8(JsapiSnsLabelUI paramJsapiSnsLabelUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(40179);
    paramMenuItem = this.rJs;
    String str1 = bo.c(paramMenuItem.rJq.rtH, ",");
    String str2 = bo.c(paramMenuItem.rJq.rtJ, ",");
    String str3 = bo.c(paramMenuItem.rJq.rtI, ",");
    String str4 = bo.c(paramMenuItem.rJq.rtK, ",");
    if (((paramMenuItem.rJq.rtF == paramMenuItem.rJn) && (paramMenuItem.rJq.rtH.size() == 0) && (paramMenuItem.rJq.rtJ.size() == 0)) || ((paramMenuItem.rJq.rtF == paramMenuItem.rJo) && (paramMenuItem.rJq.rtI.size() == 0) && (paramMenuItem.rJq.rtK.size() == 0)))
      h.a(paramMenuItem, paramMenuItem.getString(2131303677), "", paramMenuItem.getString(2131303686), null);
    while (true)
    {
      AppMethodBeat.o(40179);
      return true;
      if (((paramMenuItem.rJq.rtF == paramMenuItem.rJn) && (bo.isNullOrNil(str1)) && (bo.isNullOrNil(str2))) || ((paramMenuItem.rJq.rtF == paramMenuItem.rJo) && (bo.isNullOrNil(str3)) && (bo.isNullOrNil(str4))))
        h.a(paramMenuItem, paramMenuItem.getString(2131303677), "", paramMenuItem.getString(2131303686), null);
      else
        paramMenuItem.ctv();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.8
 * JD-Core Version:    0.6.2
 */