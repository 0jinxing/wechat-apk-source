package com.tencent.mm.plugin.address.e;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.j.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  public static String a(b paramb)
  {
    AppMethodBeat.i(17014);
    JSONObject localJSONObject = new JSONObject();
    if (paramb == null)
    {
      paramb = localJSONObject.toString();
      AppMethodBeat.o(17014);
    }
    while (true)
    {
      return paramb;
      try
      {
        localJSONObject.put("type", paramb.type);
        if ((paramb.type != null) && (paramb.type.equals("1")))
        {
          localJSONObject.put("title", paramb.nuI);
          localJSONObject.put("taxNumber", "");
          localJSONObject.put("companyAddress", "");
          localJSONObject.put("telephone", "");
          localJSONObject.put("bankName", "");
          localJSONObject.put("bankAccount", "");
        }
        while (true)
        {
          paramb = localJSONObject.toString();
          AppMethodBeat.o(17014);
          break;
          localJSONObject.put("title", paramb.title);
          if (paramb.nuJ == null)
            break label257;
          localJSONObject.put("taxNumber", paramb.nuJ);
          if (paramb.nuP == null)
            break label269;
          localJSONObject.put("companyAddress", paramb.nuP);
          if (paramb.nuN == null)
            break label281;
          localJSONObject.put("telephone", paramb.nuN);
          if (paramb.nuL == null)
            break label293;
          localJSONObject.put("bankName", paramb.nuL);
          if (paramb.nuK == null)
            break label305;
          localJSONObject.put("bankAccount", paramb.nuK);
        }
      }
      catch (JSONException paramb)
      {
        while (true)
        {
          ab.e("MicroMsg.InvoiceUtil", "put json value error : %s", new Object[] { Log.getStackTraceString(paramb) });
          continue;
          label257: localJSONObject.put("taxNumber", "");
          continue;
          label269: localJSONObject.put("companyAddress", "");
          continue;
          label281: localJSONObject.put("telephone", "");
          continue;
          label293: localJSONObject.put("bankName", "");
          continue;
          label305: localJSONObject.put("bankAccount", "");
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.e.e
 * JD-Core Version:    0.6.2
 */