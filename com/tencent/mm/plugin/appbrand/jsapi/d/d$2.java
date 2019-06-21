package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.widget.input.h;
import com.tencent.mm.plugin.appbrand.widget.input.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class d$2 extends x
{
  d$2(d paramd, WeakReference paramWeakReference, int paramInt, String paramString)
  {
  }

  private void aDC()
  {
    AppMethodBeat.i(123533);
    u localu = (u)this.hKr.get();
    if ((localu == null) || (localu.aJz() == null))
      AppMethodBeat.o(123533);
    while (true)
    {
      return;
      h.aQx().d(localu.aJz());
      AppMethodBeat.o(123533);
    }
  }

  public final void Ba(String paramString)
  {
    AppMethodBeat.i(123531);
    u localu = (u)this.hKr.get();
    if (localu == null)
      AppMethodBeat.o(123531);
    while (true)
    {
      return;
      try
      {
        int i = this.jdU;
        h.a locala = new com/tencent/mm/plugin/appbrand/jsapi/d/h$a;
        locala.<init>();
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        paramString = localJSONObject.put("value", e.Ei(paramString)).put("data", d.ol(i)).put("cursor", 0).put("inputId", i).put("keyCode", 8);
        locala.a(localu.getRuntime().xT(), localu.hashCode()).AL(paramString.toString()).aCj();
        AppMethodBeat.o(123531);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.JsApiInsertTextArea", "onBackspacePressedWhileValueNoChange, e = %s", new Object[] { paramString });
        AppMethodBeat.o(123531);
      }
    }
  }

  public final void aDA()
  {
    AppMethodBeat.i(123530);
    if (this.hKr.get() != null)
    {
      int i = this.jdU;
      HashMap localHashMap = new HashMap(1);
      localHashMap.put("inputId", Integer.valueOf(i));
      ((u)this.hKr.get()).M(this.eIl, this.hKq.j("ok", localHashMap));
      d.S(i, this.hKs);
      d.a(i, (u)this.hKr.get());
    }
    AppMethodBeat.o(123530);
  }

  public final void aDB()
  {
    AppMethodBeat.i(123532);
    if (this.hKr.get() != null)
    {
      ((u)this.hKr.get()).M(this.eIl, this.hKq.j("fail", null));
      aDC();
    }
    AppMethodBeat.o(123532);
  }

  public final void b(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(123529);
    if (this.hKr.get() != null);
    try
    {
      paramString = e.Ei(paramString);
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      paramString = localJSONObject.put("value", paramString).put("inputId", this.jdU).put("cursor", paramInt).toString();
      if (paramBoolean1)
        ((u)this.hKr.get()).h("onKeyboardConfirm", paramString, 0);
      if (!paramBoolean2)
        ((u)this.hKr.get()).h("onKeyboardComplete", paramString, 0);
      if (!paramBoolean2)
        aDC();
      AppMethodBeat.o(123529);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
        ab.e("MicroMsg.JsApiInsertTextArea", "dispatch input done, exp = %s", new Object[] { bo.l(paramString) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.d.2
 * JD-Core Version:    0.6.2
 */