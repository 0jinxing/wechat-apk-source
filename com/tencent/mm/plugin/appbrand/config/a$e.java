package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public final class a$e
{
  public final String desc;
  public final String name;

  public a$e(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(86876);
    this.name = paramString;
    this.desc = paramJSONObject.getString("desc");
    AppMethodBeat.o(86876);
  }

  public final String toString()
  {
    AppMethodBeat.i(86877);
    String str = "Permission{name='" + this.name + '\'' + ", desc='" + this.desc + '\'' + '}';
    AppMethodBeat.o(86877);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.a.e
 * JD-Core Version:    0.6.2
 */