package com.tencent.mm.plugin.downloader_app.search;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader_app.a.d;
import com.tencent.mm.vfs.e;

final class a$a$3
  implements View.OnClickListener
{
  a$a$3(a.a parama, a parama1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(136165);
    paramView = (b)paramView.getTag();
    this.kPx.kPv.kPj.IN(paramView.kPJ);
    if (this.kPx.kPv.mContext.getResources().getString(2131300935).equals(this.kPx.kPr.getText().toString()))
    {
      com.tencent.mm.plugin.downloader.h.a.a(this.kPx.kPv.mContext, paramView.appId, null);
      com.tencent.mm.plugin.downloader_app.c.a.a(13, 1303, paramView.position, 22, paramView.appId, "", "");
      AppMethodBeat.o(136165);
    }
    while (true)
    {
      return;
      Object localObject;
      if (this.kPx.kPv.mContext.getResources().getString(2131300623).equals(this.kPx.kPr.getText().toString()))
      {
        localObject = c.In(paramView.appId);
        if (localObject == null)
        {
          AppMethodBeat.o(136165);
        }
        else
        {
          if (e.ct(((com.tencent.mm.plugin.downloader.f.a)localObject).field_filePath))
          {
            com.tencent.mm.plugin.downloader.h.a.a(((com.tencent.mm.plugin.downloader.f.a)localObject).field_downloadId, false, null);
            com.tencent.mm.plugin.downloader_app.c.a.a(13, 1303, paramView.position, 44, paramView.appId, "", "");
          }
          AppMethodBeat.o(136165);
        }
      }
      else
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("appId", paramView.appId);
        ((d)g.K(d.class)).a(this.kPx.kPv.mContext, (Intent)localObject, null);
        com.tencent.mm.plugin.downloader_app.c.a.a(13, 1303, paramView.position, 23, paramView.appId, "", "");
        AppMethodBeat.o(136165);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.search.a.a.3
 * JD-Core Version:    0.6.2
 */