package com.tencent.mm.plugin.downloader_app.search;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class a$a$2
  implements View.OnClickListener
{
  a$a$2(a.a parama, a parama1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136164);
    b localb = (b)paramView.getTag();
    DownloadSearchListView localDownloadSearchListView = this.kPx.kPv.kPj;
    paramView = localb.kPJ;
    if (!bo.isNullOrNil(paramView))
    {
      b.am(localDownloadSearchListView.mContext, paramView);
      localDownloadSearchListView.kPz = b.dD(localDownloadSearchListView.mContext);
      localDownloadSearchListView.setData(localDownloadSearchListView.kPz);
    }
    com.tencent.mm.plugin.downloader_app.c.a.a(13, 1302, localb.position, 81, "", "", "");
    AppMethodBeat.o(136164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.search.a.a.2
 * JD-Core Version:    0.6.2
 */