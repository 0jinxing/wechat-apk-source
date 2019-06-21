package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.luggage.d.e;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bd;
import com.tencent.mm.plugin.webview.ui.tools.game.c;
import com.tencent.mm.plugin.webview.ui.tools.game.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class o extends bd<e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a.a parama)
  {
    AppMethodBeat.i(135885);
    Object localObject = parama.bPa.bOf;
    String str1 = ((JSONObject)localObject).optString("reportId");
    boolean bool1;
    boolean bool2;
    label48: String str2;
    String str3;
    if (((JSONObject)localObject).optInt("reportInstantly", 0) == 1)
    {
      bool1 = true;
      if (((JSONObject)localObject).optInt("reportTimeBegin", 0) != 1)
        break label97;
      bool2 = true;
      str2 = ((JSONObject)localObject).optString("reportFormatData");
      str3 = ((JSONObject)localObject).optString("reportTabsFormatData");
      if (!bo.isNullOrNil(str1))
        break label103;
      ab.e("MicroMsg.JsApiReportGamePageTime", "reportId is null or nil");
      parama.a("invalid_reportId", null);
      AppMethodBeat.o(135885);
    }
    while (true)
    {
      return;
      bool1 = false;
      break;
      label97: bool2 = false;
      break label48;
      label103: if ((bo.isNullOrNil(str2)) && (bo.isNullOrNil(str3)))
      {
        ab.e("MicroMsg.JsApiReportGamePageTime", "reportFormatData && reportTabsFormatData is null or nil");
        parama.a("invalid_reportFormatData_reportTabsFormatData", null);
        AppMethodBeat.o(135885);
      }
      else
      {
        ab.i("MicroMsg.JsApiReportGamePageTime", "reportGamePageTime, reportId:%s, reportInstantly:%b, reportTimeBegin:%b, reportFormatData:(%s), reportTabsFormatData(%s)", new Object[] { str1, Boolean.valueOf(bool1), Boolean.valueOf(bool2), str2, str3 });
        localObject = new Bundle();
        ((Bundle)localObject).putString("game_page_report_id", str1);
        ((Bundle)localObject).putBoolean("game_page_report_instantly", bool1);
        ((Bundle)localObject).putBoolean("game_page_report_time_begin", bool2);
        ((Bundle)localObject).putString("game_page_report_format_data", str2);
        ((Bundle)localObject).putString("game_page_report_tabs_format_data", str3);
        ((e)parama.bOZ).mUY.uDp.ao((Bundle)localObject);
        parama.a("", null);
        AppMethodBeat.o(135885);
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "reportGamePageTime";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.o
 * JD-Core Version:    0.6.2
 */