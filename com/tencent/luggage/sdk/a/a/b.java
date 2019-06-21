package com.tencent.luggage.sdk.a.a;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import org.json.JSONObject;

public class b extends q
{
  public com.tencent.luggage.sdk.b.b xL()
  {
    AppMethodBeat.i(101658);
    com.tencent.luggage.sdk.b.b localb = (com.tencent.luggage.sdk.b.b)super.getRuntime();
    AppMethodBeat.o(101658);
    return localb;
  }

  public a xV()
  {
    AppMethodBeat.i(101657);
    a locala = (a)super.ac(a.class);
    AppMethodBeat.o(101657);
    return locala;
  }

  public JSONObject xW()
  {
    AppMethodBeat.i(101659);
    JSONObject localJSONObject = super.xW();
    b(localJSONObject, "appType", Integer.valueOf(xL().ya().bQe));
    AppMethodBeat.o(101659);
    return localJSONObject;
  }

  public final boolean xX()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.a.a.b
 * JD-Core Version:    0.6.2
 */