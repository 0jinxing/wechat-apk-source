package com.tencent.mm.plugin.appbrand.jsapi.s;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class a
{
  public static void a(View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(91066);
    if ((paramView != null) && (paramJSONObject != null) && (paramJSONObject.has("accessibility")) && (paramJSONObject.optBoolean("accessibility", false)))
      paramView.setAccessibilityDelegate(new a.1(paramJSONObject.optString("ariaLabel", ""), paramJSONObject.optString("ariaRole", "")));
    AppMethodBeat.o(91066);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.s.a
 * JD-Core Version:    0.6.2
 */