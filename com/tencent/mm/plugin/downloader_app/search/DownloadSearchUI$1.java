package com.tencent.mm.plugin.downloader_app.search;

import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.plugin.downloader_app.a.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.o;
import java.util.List;

final class DownloadSearchUI$1
  implements MRecyclerView.a
{
  DownloadSearchUI$1(DownloadSearchUI paramDownloadSearchUI)
  {
  }

  public final void I(View paramView, int paramInt)
  {
    AppMethodBeat.i(136181);
    paramView = DownloadSearchUI.a(this.kPH).kPy.iPr;
    if ((paramView != null) && (paramInt >= 0) && (paramInt < paramView.size()))
    {
      paramView = (b)paramView.get(paramInt);
      if (paramView != null)
        break label63;
      AppMethodBeat.o(136181);
    }
    while (true)
    {
      return;
      paramView = null;
      break;
      label63: if (paramView.type == 2)
      {
        DownloadSearchUI.a(this.kPH).IN(paramView.kPJ);
        DownloadSearchUI.b(this.kPH).setSearchContent(paramView.kPJ);
        com.tencent.mm.plugin.downloader_app.c.a.a(13, 1302, paramView.position, 2, "", "", com.tencent.mm.plugin.downloader_app.c.a.dD("search_key_word", paramView.kPJ));
        AppMethodBeat.o(136181);
      }
      else
      {
        if (paramView.type == 3)
        {
          DownloadSearchUI.a(this.kPH).IN(DownloadSearchUI.b(this.kPH).getSearchContent());
          if (!bo.isNullOrNil(paramView.jumpUrl))
          {
            Bundle localBundle = new Bundle();
            localBundle.putString("rawUrl", paramView.jumpUrl);
            ((d)g.K(d.class)).f(this.kPH.mController.ylL, localBundle);
          }
          com.tencent.mm.plugin.downloader_app.c.a.a(13, 1303, paramView.position, 40, paramView.appId, "", "");
        }
        AppMethodBeat.o(136181);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.search.DownloadSearchUI.1
 * JD-Core Version:    0.6.2
 */