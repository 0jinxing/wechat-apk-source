package com.tencent.mm.plugin.downloader_app.detail.a;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class f extends bc
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a.a parama)
  {
    AppMethodBeat.i(136078);
    Object localObject = parama.bPa.bOf;
    if (localObject == null)
    {
      parama.a("invalid_data", null);
      AppMethodBeat.o(136078);
    }
    while (true)
    {
      return;
      int i = ((JSONObject)localObject).optInt("logId");
      String str = ((JSONObject)localObject).optString("values");
      if ((i <= 0) || (bo.isNullOrNil(str)))
      {
        parama.a("invalid_data", null);
        AppMethodBeat.o(136078);
      }
      else
      {
        localObject = str;
        if (i == 16099)
          localObject = a.azq() + "," + str;
        h.pYm.X(i, (String)localObject);
        parama.a("", null);
        AppMethodBeat.o(136078);
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "reportDownloaderAppKvState";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.a.f
 * JD-Core Version:    0.6.2
 */