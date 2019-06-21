package com.tencent.mm.pluginsdk.ui.tools;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.widget.a.c;

final class AppChooserUI$1
  implements AdapterView.OnItemClickListener
{
  AppChooserUI$1(AppChooserUI paramAppChooserUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(125854);
    if (AppChooserUI.a(this.vty) != null)
    {
      AppChooserUI.a(this.vty, AppChooserUI.a(this.vty).Lq(paramInt));
      AppChooserUI.a(this.vty).notifyDataSetChanged();
      if ((AppChooserUI.b(this.vty) != null) && (AppChooserUI.b(this.vty).gLj.isShowing()))
      {
        if ((AppChooserUI.c(this.vty) == null) || (!AppChooserUI.c(this.vty).vtF) || ((AppChooserUI.c(this.vty).nue) && ((AppChooserUI.c(this.vty).sKP) || (AppChooserUI.d(this.vty) >= AppChooserUI.e(this.vty)))))
          break label262;
        AppChooserUI.b(this.vty).oU(false);
      }
    }
    while (true)
    {
      if (((AppChooserUI.f(this.vty) == 6) || (AppChooserUI.g(this.vty) == 2)) && (AppChooserUI.c(this.vty) != null) && (AppChooserUI.c(this.vty).vtC != null))
      {
        AppChooserUI.a(this.vty, AppChooserUI.c(this.vty).vtC.activityInfo.packageName, false);
        h.pYm.e(12809, new Object[] { Integer.valueOf(4), AppChooserUI.c(this.vty).vtC.activityInfo.packageName });
      }
      AppMethodBeat.o(125854);
      return;
      label262: AppChooserUI.b(this.vty).oU(true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.1
 * JD-Core Version:    0.6.2
 */