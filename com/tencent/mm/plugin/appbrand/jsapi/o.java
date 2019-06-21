package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import java.util.Map;
import org.json.JSONObject;

public abstract class o
{
  protected q hwf;
  protected u hwg;
  protected JSONObject hwh;
  private int hwi;
  private m hwj;

  public o(m paramm, q paramq, u paramu, JSONObject paramJSONObject, int paramInt)
  {
    if ((paramm == null) || (paramq == null) || (paramJSONObject == null))
      throw new IllegalArgumentException("JsApiAsyncRequest");
    this.hwj = paramm;
    this.hwf = paramq;
    this.hwg = paramu;
    this.hwi = paramInt;
    this.hwh = paramJSONObject;
  }

  public final JSONObject aCg()
  {
    return this.hwh;
  }

  protected final void k(String paramString, Map<String, ? extends Object> paramMap)
  {
    this.hwf.M(this.hwi, this.hwj.j(paramString, paramMap));
  }

  protected final void w(Map<String, ? extends Object> paramMap)
  {
    this.hwf.M(this.hwi, this.hwj.j("ok", paramMap));
  }

  public final q xT()
  {
    return this.hwf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.o
 * JD-Core Version:    0.6.2
 */