package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rj;
import com.tencent.mm.g.a.rj.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class a$2 extends c<rj>
{
  a$2(a parama)
  {
    AppMethodBeat.i(5664);
    this.xxI = rj.class.getName().hashCode();
    AppMethodBeat.o(5664);
  }

  private boolean a(rj paramrj)
  {
    AppMethodBeat.i(5665);
    if (((paramrj instanceof rj)) && (paramrj.cNq.cuy == 2))
    {
      ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "Download callback %s", new Object[] { paramrj.cNq.cHr });
      if (!this.uff.ueZ.containsKey(paramrj.cNq.cHr));
    }
    while (true)
    {
      int i;
      JSONArray localJSONArray;
      String str1;
      Object localObject2;
      String str2;
      synchronized (this.uff.ueZ)
      {
        i = ((Integer)this.uff.ufc.get(paramrj.cNq.cHr)).intValue();
        Object localObject1 = (HashSet)this.uff.ueZ.get(paramrj.cNq.cHr);
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        localObject1 = ((HashSet)localObject1).iterator();
        if (((Iterator)localObject1).hasNext())
        {
          str1 = (String)((Iterator)localObject1).next();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("weixin://fts/sns?path=");
          str2 = paramrj.cNq.path;
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>();
        }
      }
      try
      {
        ((JSONObject)localObject2).put("id", str1);
        ((JSONObject)localObject2).put("src", str2);
        label219: localJSONArray.put(localObject2);
        continue;
        paramrj = finally;
        AppMethodBeat.o(5665);
        throw paramrj;
        h.JR(i).bH(0, localJSONArray.toString());
        this.uff.ueZ.remove(paramrj.cNq.cHr);
        this.uff.ufc.remove(paramrj.cNq.cHr);
        AppMethodBeat.o(5665);
        return false;
      }
      catch (JSONException localJSONException)
      {
        break label219;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.a.2
 * JD-Core Version:    0.6.2
 */