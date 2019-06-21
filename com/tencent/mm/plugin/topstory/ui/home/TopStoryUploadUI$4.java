package com.tencent.mm.plugin.topstory.ui.home;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.sns.ui.SnsEditText;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;

final class TopStoryUploadUI$4
  implements MenuItem.OnMenuItemClickListener
{
  TopStoryUploadUI$4(TopStoryUploadUI paramTopStoryUploadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = false;
    AppMethodBeat.i(1683);
    if (this.sDa.isFinishing())
      AppMethodBeat.o(1683);
    while (true)
    {
      return bool;
      if (System.currentTimeMillis() - TopStoryUploadUI.d(this.sDa) < 500L)
      {
        AppMethodBeat.o(1683);
      }
      else
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(17080, new Object[] { Integer.valueOf(4), Integer.valueOf(2), TopStoryUploadUI.e(this.sDa) });
        TopStoryUploadUI.a(this.sDa, System.currentTimeMillis());
        String str = TopStoryUploadUI.f(this.sDa).getText().toString();
        if (str.length() > 200)
        {
          com.tencent.mm.ui.base.h.b(this.sDa, this.sDa.getString(2131303848), "", true);
          AppMethodBeat.o(1683);
          bool = true;
        }
        else if (!TopStoryUploadUI.bBL())
        {
          com.tencent.mm.ui.base.h.b(this.sDa, this.sDa.getString(2131299946), "", true);
          e.pXa.a(1032L, 1L, 1L, false);
          AppMethodBeat.o(1683);
          bool = true;
        }
        else
        {
          long l = System.currentTimeMillis();
          paramMenuItem = TopStoryUploadUI.cFJ();
          f localf = g.bT(TopStoryUploadUI.e(this.sDa), true);
          this.sDa.a(l, TopStoryUploadUI.g(this.sDa), str, paramMenuItem, localf, TopStoryUploadUI.h(this.sDa));
          AppMethodBeat.o(1683);
          bool = true;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI.4
 * JD-Core Version:    0.6.2
 */