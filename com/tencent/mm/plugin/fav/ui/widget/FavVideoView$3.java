package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.ui.base.h;
import java.io.File;

final class FavVideoView$3
  implements Runnable
{
  FavVideoView$3(FavVideoView paramFavVideoView, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74716);
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    k.a(this.mqn.getContext(), localIntent, new File(this.mqo), "video/*");
    try
    {
      this.mqn.getContext().startActivity(localIntent);
      AppMethodBeat.o(74716);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.FavVideoView", "startActivity fail, activity not found");
        h.g(this.mqn.getContext(), 2131299668, 2131299669);
        AppMethodBeat.o(74716);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavVideoView.3
 * JD-Core Version:    0.6.2
 */