package com.tencent.mm.plugin.favorite.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.sdk.platformtools.w;

final class FavOpenApiEntry$2
  implements q.a
{
  FavOpenApiEntry$2(FavOpenApiEntry paramFavOpenApiEntry, WXMediaMessage paramWXMediaMessage)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(20541);
    if (paramBoolean)
    {
      l.a(w.a(this.mqy.getIntent(), "_mmessage_sdkVersion", 0), FavOpenApiEntry.d(this.mqy), this.mqz);
      FavOpenApiEntry.b(this.mqy, this.mqz);
      paramString = ReportUtil.c(this.mqy.getIntent().getExtras(), 0);
      ReportUtil.a(this.mqy, paramString, false);
      AppMethodBeat.o(20541);
    }
    while (true)
    {
      return;
      this.mqy.finish();
      ReportUtil.a(this.mqy, ReportUtil.c(this.mqy.getIntent().getExtras(), 0), true);
      AppMethodBeat.o(20541);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry.2
 * JD-Core Version:    0.6.2
 */