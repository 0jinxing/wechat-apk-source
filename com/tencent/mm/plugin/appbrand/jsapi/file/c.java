package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.jsapi.u;
import org.json.JSONObject;

abstract class c<T extends d> extends u
{
  private final T hJD;

  public c(T paramT)
  {
    this.hJD = paramT;
    this.hJD.hJG = this;
  }

  public final String b(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject)
  {
    paramJSONObject = this.hJD.c(paramc, paramJSONObject);
    return a(paramc, paramJSONObject.aIm, paramJSONObject.values);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.c
 * JD-Core Version:    0.6.2
 */