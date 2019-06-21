package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentHashMap;

final class m$4
  implements View.OnClickListener
{
  m$4(m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112061);
    if (!(paramView.getTag() instanceof c))
    {
      ab.e("MicroMsg.GameListAdapter", "No button tag retrived, ignore click");
      AppMethodBeat.o(112061);
    }
    while (true)
    {
      return;
      paramView = (c)paramView.getTag();
      if (!this.nkr.nko.containsKey(paramView.field_appId))
      {
        ab.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
        AppMethodBeat.o(112061);
      }
      else
      {
        k localk = (k)this.nkr.nko.get(paramView.field_appId);
        localk.ei(this.nkr.mContext);
        this.nkr.ngR.nek = paramView.mVB;
        this.nkr.ngR.mXC = this.nkr.mXC;
        this.nkr.ngR.a(paramView, localk);
        AppMethodBeat.o(112061);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.m.4
 * JD-Core Version:    0.6.2
 */