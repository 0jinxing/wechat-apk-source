package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.facebook.device.yearclass.YearClass;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.plugin.webview.luggage.jsapi.bd;
import com.tencent.mm.plugin.webview.ui.tools.game.e.a;
import com.tencent.mm.plugin.webview.ui.tools.game.e.b;
import com.tencent.mm.plugin.wepkg.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;

public class p extends bd<com.tencent.mm.plugin.game.luggage.d.e>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<com.tencent.mm.plugin.game.luggage.d.e>.a parama)
  {
    AppMethodBeat.i(135887);
    Object localObject1 = new TreeMap(new p.1(this));
    ((Map)localObject1).put(Integer.valueOf(e.a.uDu), ((com.tencent.mm.plugin.game.luggage.d.e)parama.bOZ).bDI());
    ((Map)localObject1).put(Integer.valueOf(e.a.uDv), at.gB(ah.getContext()));
    ((Map)localObject1).put(Integer.valueOf(e.a.uDw), String.valueOf(YearClass.get(ah.getContext())));
    try
    {
      ((Map)localObject1).put(Integer.valueOf(e.a.uDx), q.encode(bo.nullAsNil(((com.tencent.mm.plugin.game.luggage.d.e)parama.bOZ).cWL()), "UTF-8"));
      label116: Object localObject2 = ((com.tencent.mm.plugin.game.luggage.d.e)parama.bOZ).cWL();
      int i = e.a.uDy;
      int j;
      label210: Object localObject3;
      boolean bool;
      if (((com.tencent.mm.plugin.game.luggage.d.e)parama.bOZ).NQ((String)localObject2))
      {
        j = 1;
        ((Map)localObject1).put(Integer.valueOf(i), Integer.valueOf(j));
        ((Map)localObject1).put(Integer.valueOf(e.a.uDz), Integer.valueOf(1));
        if (!(parama.bOZ instanceof com.tencent.mm.plugin.game.luggage.d.f))
          break label338;
        ((Map)localObject1).put(Integer.valueOf(e.a.uDA), Integer.valueOf(1));
        ((Map)localObject1).put(Integer.valueOf(e.a.uDB), ((com.tencent.mm.plugin.game.luggage.d.e)parama.bOZ).bDH().dgj());
        j = e.a.uDC;
        ((com.tencent.mm.plugin.game.luggage.d.e)parama.bOZ).bDH();
        ((Map)localObject1).put(Integer.valueOf(j), c.dgk());
        localObject3 = parama.bPa.bOf;
        localObject2 = ((JSONObject)localObject3).optString("type");
        bool = "1".equals(((JSONObject)localObject3).optString("isReportNow"));
        localObject3 = ((JSONObject)localObject3).optJSONObject("data");
        if (localObject3 != null)
          break label358;
        ab.i("MicroMsg.JsApiReportGameWeb", "data is null or not json");
        parama.a("data_is_null", null);
        AppMethodBeat.o(135887);
      }
      while (true)
      {
        return;
        j = 0;
        break;
        label338: ((Map)localObject1).put(Integer.valueOf(e.a.uDA), Integer.valueOf(0));
        break label210;
        label358: Object localObject4;
        if ("1".equals(localObject2))
        {
          ((Map)localObject1).put(Integer.valueOf(e.b.uDE), Boolean.valueOf(bool));
          localObject3 = com.tencent.mm.plugin.webview.ui.tools.game.f.aO((JSONObject)localObject3);
          localObject2 = ((Map)localObject3).keySet().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject4 = (Integer)((Iterator)localObject2).next();
            if (!((Map)localObject1).containsKey(localObject4))
              ((Map)localObject1).put(localObject4, ((Map)localObject3).get(localObject4));
          }
          com.tencent.mm.plugin.webview.ui.tools.game.f.y(((com.tencent.mm.plugin.game.luggage.d.e)parama.bOZ).cWL(), (Map)localObject1);
          parama.a("", null);
          AppMethodBeat.o(135887);
        }
        else if ("2".equals(localObject2))
        {
          localObject4 = com.tencent.mm.plugin.webview.ui.tools.game.f.aO((JSONObject)localObject3);
          localObject2 = ((Map)localObject4).keySet().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (Integer)((Iterator)localObject2).next();
            if (!((Map)localObject1).containsKey(localObject3))
              ((Map)localObject1).put(localObject3, ((Map)localObject4).get(localObject3));
          }
          localObject1 = com.tencent.mm.plugin.webview.ui.tools.game.e.aI((Map)localObject1);
          ab.i("MicroMsg.JsApiReportGameWeb", "report web runtime. isReportNow:%b, reportData: [%s]", new Object[] { Boolean.valueOf(bool), localObject1 });
          h.pYm.a(16145, (String)localObject1, bool, false);
          parama.a("", null);
          AppMethodBeat.o(135887);
        }
        else
        {
          ab.i("MicroMsg.JsApiReportGameWeb", "type is error. type:%s", new Object[] { localObject2 });
          parama.a("type_not_right", null);
          AppMethodBeat.o(135887);
        }
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      break label116;
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "reportGameWeb";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.p
 * JD-Core Version:    0.6.2
 */