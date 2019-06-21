package com.tencent.mm.plugin.search.b.a.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.service.f;
import com.tencent.mm.plugin.fts.a.a.c;
import com.tencent.mm.plugin.fts.a.d.a.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.j;

public final class a
  implements b
{
  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(24405);
    parama = (j)parama;
    ((n)com.tencent.mm.kernel.g.M(n.class)).updateTopHitsRank(parama.mDz.mDY, parama.hpS, 0);
    if (((f)com.tencent.mm.kernel.g.K(f.class)).Cl(parama.mKM.field_url))
      AppMethodBeat.o(24405);
    while (true)
    {
      return true;
      Intent localIntent;
      if (parama.mKM.field_actionType == 2)
      {
        localIntent = new Intent();
        localIntent.putExtra("rawUrl", parama.mKM.field_url);
        d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
        AppMethodBeat.o(24405);
      }
      else
      {
        if (!com.tencent.mm.plugin.search.a.a.U(paramContext, parama.mKM.field_featureId))
        {
          localIntent = new Intent();
          localIntent.putExtra("rawUrl", parama.mKM.field_updateUrl);
          d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
        }
        AppMethodBeat.o(24405);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.search.b.a.a.a
 * JD-Core Version:    0.6.2
 */