package com.tencent.mm.plugin.appbrand.jsapi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class h$6 extends com.tencent.mm.plugin.appbrand.widget.input.i
{
  h$6(h paramh, WeakReference paramWeakReference, int paramInt, String paramString)
  {
  }

  private void aDC()
  {
    AppMethodBeat.i(123554);
    u localu = (u)this.hKr.get();
    if ((localu == null) || (localu.aJz() == null))
      AppMethodBeat.o(123554);
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.widget.input.h.aQx().d(localu.aJz());
      AppMethodBeat.o(123554);
    }
  }

  public final void Ba(String paramString)
  {
    AppMethodBeat.i(123553);
    u localu = (u)this.hKr.get();
    if (localu == null)
      AppMethodBeat.o(123553);
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
        paramString = localJSONObject.put("value", e.Ei(paramString)).put("data", h.ol(i)).put("cursor", 0).put("inputId", i).put("keyCode", 8);
        locala.a(localu.getRuntime().xT(), localu.hashCode()).AL(paramString.toString()).aCj();
        AppMethodBeat.o(123553);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.JsApiShowKeyboard", "onBackspacePressedWhileValueNoChange, e = %s", new Object[] { paramString });
        AppMethodBeat.o(123553);
      }
    }
  }

  public final void aDA()
  {
    AppMethodBeat.i(123551);
    if (this.hKr.get() != null)
    {
      int i = this.jdU;
      HashMap localHashMap = new HashMap(1);
      localHashMap.put("inputId", Integer.valueOf(i));
      ((u)this.hKr.get()).M(this.eIl, this.hKz.j("ok", localHashMap));
      h.S(i, this.hKs);
      h.a(i, (u)this.hKr.get());
    }
    AppMethodBeat.o(123551);
  }

  public final void aDB()
  {
    AppMethodBeat.i(123552);
    if (this.hKr.get() != null)
    {
      ((u)this.hKr.get()).M(this.eIl, this.hKz.j("fail", null));
      aDC();
    }
    AppMethodBeat.o(123552);
  }

  public final void b(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(123550);
    if (this.hKr.get() != null);
    try
    {
      String str = e.Ei(paramString);
      paramString = new org/json/JSONObject;
      paramString.<init>();
      paramString = paramString.put("value", str).put("inputId", this.jdU).put("cursor", paramInt).toString();
      if (paramBoolean1)
        ((u)this.hKr.get()).h("onKeyboardConfirm", paramString, 0);
      if (!paramBoolean2)
        ((u)this.hKr.get()).h("onKeyboardComplete", paramString, 0);
      if (!paramBoolean2)
        aDC();
      AppMethodBeat.o(123550);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
        ab.e("MicroMsg.JsApiShowKeyboard", "dispatch input done, exp = %s", new Object[] { bo.l(paramString) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.h.6
 * JD-Core Version:    0.6.2
 */