package com.tencent.mm.plugin.appbrand.jsapi.m;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.ac;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandEmptyPickerView;
import com.tencent.mm.plugin.appbrand.widget.picker.a;
import com.tencent.mm.plugin.appbrand.widget.picker.b;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

abstract class d extends b
{
  private int bOs;
  WeakReference<e> hUk;
  private m hxE;

  abstract void C(JSONObject paramJSONObject);

  final void a(m paramm, e parame, JSONObject paramJSONObject, int paramInt)
  {
    this.hxE = paramm;
    this.hUk = new WeakReference(parame);
    this.bOs = paramInt;
    C(paramJSONObject);
  }

  public final View aEK()
  {
    if (this.hUk == null);
    for (Object localObject = null; ; localObject = ((e)this.hUk.get()).aBf().ius)
      return localObject;
  }

  final void aEL()
  {
    an(AppBrandEmptyPickerView.class);
    this.jks.setOnResultListener(new d.1(this));
    this.jks.show();
  }

  final void l(String paramString, Map<String, Object> paramMap)
  {
    if ((this.hUk != null) && (this.hUk.get() != null) && (this.hxE != null))
      ((e)this.hUk.get()).M(this.bOs, this.hxE.j(paramString, paramMap));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.d
 * JD-Core Version:    0.6.2
 */