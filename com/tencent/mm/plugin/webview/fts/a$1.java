package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gb;
import com.tencent.mm.g.a.gb.a;
import com.tencent.mm.g.a.gb.b;
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

final class a$1 extends c<gb>
{
  a$1(a parama)
  {
    AppMethodBeat.i(5661);
    this.xxI = gb.class.getName().hashCode();
    AppMethodBeat.o(5661);
  }

  private boolean a(gb paramgb)
  {
    AppMethodBeat.i(5662);
    if (paramgb.cAm.cuy == 2)
    {
      ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "Emoji Download callback %s", new Object[] { paramgb.cAm.cvZ });
      if (!this.uff.ufa.containsKey(paramgb.cAm.cvZ));
    }
    while (true)
    {
      int i;
      JSONArray localJSONArray;
      String str1;
      Object localObject2;
      String str2;
      synchronized (this.uff.ufa)
      {
        i = ((Integer)this.uff.ufd.get(paramgb.cAm.cvZ)).intValue();
        Object localObject1 = (HashSet)this.uff.ufa.get(paramgb.cAm.cvZ);
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        localObject1 = ((HashSet)localObject1).iterator();
        if (((Iterator)localObject1).hasNext())
        {
          str1 = (String)((Iterator)localObject1).next();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("weixin://fts/emoji?path=");
          str2 = paramgb.cAn.path;
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>();
        }
      }
      try
      {
        ((JSONObject)localObject2).put("id", str1);
        ((JSONObject)localObject2).put("src", str2);
        label212: localJSONArray.put(localObject2);
        continue;
        paramgb = finally;
        AppMethodBeat.o(5662);
        throw paramgb;
        h.JR(i).bH(0, localJSONArray.toString());
        this.uff.ufa.remove(paramgb.cAm.cvZ);
        this.uff.ufd.remove(paramgb.cAm.cvZ);
        AppMethodBeat.o(5662);
        return false;
      }
      catch (JSONException localJSONException)
      {
        break label212;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.a.1
 * JD-Core Version:    0.6.2
 */