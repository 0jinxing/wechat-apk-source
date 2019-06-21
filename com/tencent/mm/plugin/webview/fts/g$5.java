package com.tencent.mm.plugin.webview.fts;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class g$5
  implements com.tencent.mm.plugin.fts.a.l
{
  g$5(g paramg)
  {
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(5742);
    switch (paramj.bFZ)
    {
    default:
    case 0:
    case -3:
    case -2:
    case -1:
    }
    while (true)
    {
      AppMethodBeat.o(5742);
      while (true)
      {
        return;
        if ((paramj.mEy == null) || (paramj.mEy.size() == 0))
        {
          ab.i("MicroMsg.FTS.WebSearchLogic", "local contact search size 0");
          h.JR(((Integer)g.e(this.ugk).mDs).intValue()).agq("");
          AppMethodBeat.o(5742);
        }
        else
        {
          JSONObject localJSONObject1;
          JSONArray localJSONArray1;
          JSONObject localJSONObject2;
          JSONArray localJSONArray2;
          try
          {
            localJSONObject1 = new org/json/JSONObject;
            localJSONObject1.<init>();
            localJSONArray1 = new org/json/JSONArray;
            localJSONArray1.<init>();
            localJSONObject2 = new org/json/JSONObject;
            localJSONObject2.<init>();
            localJSONArray2 = new org/json/JSONArray;
            localJSONArray2.<init>();
            Iterator localIterator = paramj.mEy.iterator();
            while (localIterator.hasNext())
            {
              com.tencent.mm.plugin.fts.a.a.l locall = (com.tencent.mm.plugin.fts.a.a.l)localIterator.next();
              if (locall.type == 131072)
                localJSONArray2.put(g.a(locall, paramj.mDz));
            }
          }
          catch (Exception paramj)
          {
            ab.printErrStackTrace("MicroMsg.FTS.WebSearchLogic", paramj, "onSearchDone", new Object[0]);
            AppMethodBeat.o(5742);
          }
          continue;
          localJSONObject2.put("items", localJSONArray2);
          localJSONObject2.put("title", ah.getContext().getString(2131300132));
          localJSONObject2.put("count", localJSONArray2.length());
          localJSONObject2.put("type", 3);
          localJSONArray1.put(localJSONObject2);
          localJSONObject1.put("data", localJSONArray1);
          localJSONObject1.put("ret", 0);
          h.JR(((Integer)g.e(this.ugk).mDs).intValue()).agq(localJSONObject1.toString());
          AppMethodBeat.o(5742);
        }
      }
      h.JR(((Integer)g.e(this.ugk).mDs).intValue()).agq("");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.g.5
 * JD-Core Version:    0.6.2
 */