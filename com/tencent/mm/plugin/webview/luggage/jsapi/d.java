package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(6283);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      paramString = ((JSONObject)localObject).optString("card_list");
      String str = ((JSONObject)localObject).optString("tempalate_id");
      localObject = new Intent();
      ((Intent)localObject).putExtra("card_list", paramString);
      ((Intent)localObject).putExtra("key_template_id", str);
      ((Intent)localObject).putExtra("key_from_scene", 7);
      ((MMActivity)paramContext).ifE = new d.1(this, parama);
      com.tencent.mm.bp.d.a(paramContext, "card", ".ui.CardViewEntranceUI", (Intent)localObject, 0xFFFF & hashCode(), false);
      AppMethodBeat.o(6283);
      return;
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiBatchViewCard", "paras data error: " + paramContext.getMessage());
        parama.d("fail", null);
        AppMethodBeat.o(6283);
      }
    }
  }

  public final void b(a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "batchViewCard";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.d
 * JD-Core Version:    0.6.2
 */