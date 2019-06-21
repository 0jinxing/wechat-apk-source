package com.tencent.mm.plugin.welab.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.plugin.welab.a.a.b
{
  public final String ddq()
  {
    AppMethodBeat.i(26580);
    String str = ac.adL("discoverSearchEntry").optString("labIcon");
    AppMethodBeat.o(26580);
    return str;
  }

  public final String ddr()
  {
    AppMethodBeat.i(26581);
    String str = ac.adL("discoverSearchEntry").optString("wording");
    if (bo.isNullOrNil(str))
    {
      str = ah.getContext().getString(2131299820);
      AppMethodBeat.o(26581);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(26581);
    }
  }

  public final void f(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(26579);
    if (!aa.HU(0))
    {
      ab.e("MicroMsg.FTS.SearchOneSearchOpener", "fts h5 template not avail");
      AppMethodBeat.o(26579);
    }
    while (true)
    {
      return;
      Intent localIntent = aa.cVd();
      localIntent.putExtra("ftsbizscene", 20);
      paramString = aa.d(20, true, 0);
      localIntent.putExtra("ftsneedkeyboard", true);
      localIntent.putExtra("rawUrl", aa.E(paramString));
      d.b(paramActivity, "webview", ".ui.tools.fts.FTSSearchOneSearchWebViewUI", localIntent);
      AppMethodBeat.o(26579);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.c.b
 * JD-Core Version:    0.6.2
 */