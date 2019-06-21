package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;

final class SnsLabelUI$8
  implements MenuItem.OnMenuItemClickListener
{
  SnsLabelUI$8(SnsLabelUI paramSnsLabelUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39018);
    SnsLabelUI localSnsLabelUI = this.rtz;
    String str1 = bo.c(localSnsLabelUI.rtl.rtH, ",");
    String str2 = bo.c(localSnsLabelUI.rtl.rtJ, ",");
    paramMenuItem = bo.c(localSnsLabelUI.rtl.rtI, ",");
    String str3 = bo.c(localSnsLabelUI.rtl.rtK, ",");
    if (((localSnsLabelUI.rtl.rtF == 2) && (localSnsLabelUI.rtl.rtH.size() == 0) && (localSnsLabelUI.rtl.rtJ.size() == 0)) || ((localSnsLabelUI.rtl.rtF == 3) && (localSnsLabelUI.rtl.rtI.size() == 0) && (localSnsLabelUI.rtl.rtK.size() == 0)))
      h.a(localSnsLabelUI, localSnsLabelUI.getString(2131303677), "", localSnsLabelUI.getString(2131303686), null);
    while (true)
    {
      AppMethodBeat.o(39018);
      return true;
      if (((localSnsLabelUI.rtl.rtF == 2) && (bo.isNullOrNil(str1)) && (bo.isNullOrNil(str2))) || ((localSnsLabelUI.rtl.rtF == 3) && (bo.isNullOrNil(paramMenuItem)) && (bo.isNullOrNil(str3))))
        h.a(localSnsLabelUI, localSnsLabelUI.getString(2131303677), "", localSnsLabelUI.getString(2131303686), null);
      else
        localSnsLabelUI.ctv();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsLabelUI.8
 * JD-Core Version:    0.6.2
 */