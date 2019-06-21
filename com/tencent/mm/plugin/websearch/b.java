package com.tencent.mm.plugin.websearch;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.websearch.api.ai;
import com.tencent.mm.protocal.protobuf.bur;
import com.tencent.mm.protocal.protobuf.bus;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.storage.z;

public final class b
  implements com.tencent.mm.plugin.websearch.api.m
{
  private static String tZm = "websearch_";
  private static String tZn;
  private static String tZo;
  private Runnable tZk;
  private Runnable tZl;

  private static void bg(Context paramContext, String paramString)
  {
    AppMethodBeat.i(91350);
    Intent localIntent = new Intent();
    localIntent.putExtra("showShare", true);
    localIntent.putExtra("rawUrl", paramString);
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(91350);
  }

  private static SharedPreferences cUI()
  {
    AppMethodBeat.i(91343);
    init();
    ab.i("WebSearchPrivacyMgr", " sp name %s ", new Object[] { tZm });
    SharedPreferences localSharedPreferences = ar.s(ah.getContext(), tZm, 0);
    AppMethodBeat.o(91343);
    return localSharedPreferences;
  }

  public static void cUJ()
  {
    AppMethodBeat.i(91345);
    ab.i("WebSearchPrivacyMgr", "reInit");
    Object localObject1 = new StringBuilder("websearch_");
    g.RN();
    tZm = a.QG();
    Object localObject2 = g.RP().Ry().get(274436, "");
    localObject1 = "en";
    if (localObject2 != null)
      localObject1 = localObject2.toString();
    tZn = ah.getContext().getString(2131305935, new Object[] { aa.dor(), localObject1 });
    tZo = ah.getContext().getString(2131305860, new Object[] { aa.dor(), localObject1 });
    AppMethodBeat.o(91345);
  }

  public static void init()
  {
    AppMethodBeat.i(91344);
    if (tZn == null)
      cUJ();
    AppMethodBeat.o(91344);
  }

  public final void a(Context paramContext, Runnable paramRunnable)
  {
    AppMethodBeat.i(91348);
    init();
    if ((!cUI().getBoolean("websearch_confirmed", false)) && (com.tencent.mm.au.b.sO((String)g.RP().Ry().get(274436, null))))
    {
      this.tZk = paramRunnable;
      bg(paramContext, tZn);
      AppMethodBeat.o(91348);
    }
    while (true)
    {
      return;
      paramRunnable.run();
      AppMethodBeat.o(91348);
    }
  }

  public final boolean b(Context paramContext, Runnable paramRunnable)
  {
    AppMethodBeat.i(91349);
    init();
    boolean bool;
    if (com.tencent.mm.au.b.sO((String)g.RP().Ry().get(274436, null)))
    {
      this.tZl = paramRunnable;
      bg(paramContext, tZo);
      bool = true;
      AppMethodBeat.o(91349);
    }
    while (true)
    {
      return bool;
      paramRunnable.run();
      bool = false;
      AppMethodBeat.o(91349);
    }
  }

  public final void cUK()
  {
    AppMethodBeat.i(91346);
    ab.i("WebSearchPrivacyMgr", "openSearch ");
    init();
    if (this.tZk != null)
    {
      this.tZk.run();
      if (this.tZk == this.tZk)
        this.tZk = null;
    }
    cUI().edit().putBoolean("websearch_confirmed", true).commit();
    bur localbur = new bur();
    localbur.wWg = 1;
    localbur.Timestamp = ((int)(System.currentTimeMillis() / 1000L));
    localbur.nbk = 1;
    b.a locala = new b.a();
    locala.fsJ = localbur;
    locala.fsK = new bus();
    locala.uri = "/cgi-bin/mmsearch-bin/searchconfirm";
    locala.fsI = 2957;
    w.a(locala.acD(), new w.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.b paramAnonymousb, com.tencent.mm.ai.m paramAnonymousm)
      {
        return 0;
      }
    });
    AppMethodBeat.o(91346);
  }

  public final void cUL()
  {
    AppMethodBeat.i(91347);
    ab.i("WebSearchPrivacyMgr", "closeSearch ");
    init();
    if (this.tZl != null)
    {
      this.tZl.run();
      if (this.tZl == this.tZl)
        this.tZl = null;
    }
    cUI().edit().putBoolean("websearch_confirmed", false).commit();
    bur localbur = new bur();
    localbur.wWg = 1;
    localbur.Timestamp = ((int)(System.currentTimeMillis() / 1000L));
    localbur.nbk = 2;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = localbur;
    ((b.a)localObject).fsK = new bus();
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/searchconfirm";
    ((b.a)localObject).fsI = 2957;
    w.a(((b.a)localObject).acD(), new b.2(this));
    ((n)g.M(n.class)).deleteSOSHistory();
    if (ai.uaA != null)
      ai.uaA = null;
    localObject = ai.cVl();
    ah.getContext().getSharedPreferences("fts_recent_biz_sp", 0).edit().remove((String)localObject).commit();
    AppMethodBeat.o(91347);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.b
 * JD-Core Version:    0.6.2
 */