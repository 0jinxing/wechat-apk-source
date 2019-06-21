package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.po;
import com.tencent.mm.g.a.po.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONException;
import org.json.JSONObject;

final class e$2 extends c<po>
{
  e$2(e parame)
  {
    AppMethodBeat.i(6934);
    this.xxI = po.class.getName().hashCode();
    AppMethodBeat.o(6934);
  }

  private boolean a(po parampo)
  {
    AppMethodBeat.i(6935);
    if (((parampo instanceof po)) && ("bank".equals(this.uoK.uoF)))
    {
      if (parampo.cLL.action != 0)
        break label67;
      e.a(this.uoK, this.uoK.uoF);
    }
    while (true)
    {
      e.a(this.uoK);
      AppMethodBeat.o(6935);
      return false;
      label67: if (parampo.cLL.action == 1)
        if (bo.isNullOrNil(parampo.cLL.cardNum))
          e.b(this.uoK, this.uoK.uoF);
        else
          try
          {
            JSONObject localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>();
            localJSONObject.put("bankcard_number", parampo.cLL.cardNum);
            e.a(this.uoK, this.uoK.uoF, localJSONObject, null);
          }
          catch (JSONException parampo)
          {
            ab.e("MicroMsg.LicenceScanner", "type = bankcard, add cardNum into json, exp = %s ", new Object[] { parampo });
            e.b(this.uoK, this.uoK.uoF);
          }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.e.2
 * JD-Core Version:    0.6.2
 */