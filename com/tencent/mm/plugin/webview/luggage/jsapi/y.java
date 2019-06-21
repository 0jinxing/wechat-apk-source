package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import org.json.JSONObject;

public class y extends bc
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a.a parama)
  {
    boolean bool1 = true;
    AppMethodBeat.i(6322);
    int i = parama.bPa.bOf.optInt("id");
    if (i <= 0)
      parama.a("fail", null);
    String str = parama.bPa.bOf.optString("value");
    boolean bool2;
    if (parama.bPa.bOf.optInt("is_important") > 0)
    {
      bool2 = true;
      if (parama.bPa.bOf.optInt("is_report_now") <= 0)
        break label111;
    }
    while (true)
    {
      h.pYm.a(i, str, bool1, bool2);
      parama.a("", null);
      AppMethodBeat.o(6322);
      return;
      bool2 = false;
      break;
      label111: bool1 = false;
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "kvReport";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.y
 * JD-Core Version:    0.6.2
 */