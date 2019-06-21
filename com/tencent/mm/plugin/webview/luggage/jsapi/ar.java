package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public class ar extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6372);
    ab.i("MicroMsg.JsApiSetCloseWindowConfirmDialogInfo", "invoke");
    boolean bool = parama.bPa.bOf.optBoolean("switch");
    String str1 = parama.bPa.bOf.optString("title_cn");
    String str2 = parama.bPa.bOf.optString("title_eng");
    String str3 = parama.bPa.bOf.optString("ok_cn");
    String str4 = parama.bPa.bOf.optString("ok_eng");
    String str5 = parama.bPa.bOf.optString("cancel_cn");
    String str6 = parama.bPa.bOf.optString("cancel_eng");
    com.tencent.mm.plugin.webview.luggage.k localk = ((d)parama.bOZ).cWH();
    if (localk == null)
      AppMethodBeat.o(6372);
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("close_window_confirm_dialog_switch", Boolean.valueOf(bool).booleanValue());
      localBundle.putString("close_window_confirm_dialog_title_cn", str1);
      localBundle.putString("close_window_confirm_dialog_title_eng", str2);
      localBundle.putString("close_window_confirm_dialog_ok_cn", str3);
      localBundle.putString("close_window_confirm_dialog_ok_eng", str4);
      localBundle.putString("close_window_confirm_dialog_cancel_cn", str5);
      localBundle.putString("close_window_confirm_dialog_cancel_eng", str6);
      localk.setCloseWindowConfirmInfo(localBundle);
      parama.a("", null);
      AppMethodBeat.o(6372);
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "setCloseWindowConfirmDialogInfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ar
 * JD-Core Version:    0.6.2
 */