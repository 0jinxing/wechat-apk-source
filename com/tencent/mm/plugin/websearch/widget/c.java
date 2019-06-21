package com.tencent.mm.plugin.websearch.widget;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.service.a;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.o;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.protobuf.axy;
import com.tencent.mm.protocal.protobuf.ayr;
import com.tencent.mm.protocal.protobuf.ays;
import com.tencent.mm.protocal.protobuf.cvf;
import com.tencent.mm.protocal.protobuf.cxo;
import com.tencent.mm.protocal.protobuf.li;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  implements p
{
  private static List<WidgetData> adT(String paramString)
  {
    AppMethodBeat.i(91433);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = Collections.emptyList();
      AppMethodBeat.o(91433);
    }
    while (true)
    {
      return paramString;
      try
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Object localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(paramString);
        Object localObject2 = ((JSONObject)localObject1).optJSONArray("data");
        paramString = ((JSONObject)localObject1).optString("searchID");
        if ((localObject2 == null) || (((JSONArray)localObject2).length() == 0))
        {
          paramString = Collections.EMPTY_LIST;
          AppMethodBeat.o(91433);
        }
        else
        {
          localObject2 = ((JSONArray)localObject2).optJSONObject(0);
          if ((localObject2 != null) && (((JSONObject)localObject2).has("items")))
          {
            localObject2 = ((JSONObject)localObject2).optJSONArray("items");
            for (int i = 0; i < ((JSONArray)localObject2).length(); i++)
            {
              localObject1 = WidgetData.l(((JSONArray)localObject2).optJSONObject(i), paramString);
              if (localObject1 != null)
                localArrayList.add(localObject1);
            }
          }
          AppMethodBeat.o(91433);
          paramString = localArrayList;
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("WidgetLocalSearchService", paramString, "", new Object[0]);
        paramString = Collections.emptyList();
        AppMethodBeat.o(91433);
      }
    }
  }

  public final void a(String paramString1, String paramString2, o paramo)
  {
    int i = 1;
    AppMethodBeat.i(91432);
    Object localObject1;
    Object localObject2;
    boolean bool;
    if (!TextUtils.isEmpty(paramString1))
    {
      localObject1 = com.tencent.mm.model.c.c.abi().ll("100440");
      if (!((com.tencent.mm.storage.c)localObject1).isValid())
        break label114;
      localObject2 = ((com.tencent.mm.storage.c)localObject1).dru();
      if (localObject2 == null)
      {
        localObject1 = "";
        ab.i("WidgetLocalSearchService", "switch conf is %s", new Object[] { localObject1 });
        bool = "1".equals(((Map)localObject2).get("isOpen"));
        label81: if (bool)
          break label120;
      }
    }
    else
    {
      if (paramo != null)
        paramo.m(paramString1, null);
      AppMethodBeat.o(91432);
    }
    while (true)
    {
      return;
      localObject1 = localObject2.toString();
      break;
      label114: bool = false;
      break label81;
      label120: localObject1 = new b.a();
      ((b.a)localObject1).fsI = 2782;
      ((b.a)localObject1).uri = "/cgi-bin/mmux-bin/wxaapp/wxaapp_weappsearch_localdata";
      ((b.a)localObject1).fsJ = new ayr();
      ((b.a)localObject1).fsK = new ays();
      localObject1 = ((b.a)localObject1).acD();
      localObject2 = (ayr)((com.tencent.mm.ai.b)localObject1).fsG.fsP;
      ((ayr)localObject2).wCy = paramString2;
      ((ayr)localObject2).wol = paramString1;
      ((ayr)localObject2).wCv = 0;
      ((ayr)localObject2).wCu = aa.HV(0);
      paramString2 = new cxo();
      paramString2.xsT = true;
      paramString2.xsP = ((ayr)localObject2).wCu;
      Object localObject3 = new cvf();
      ((cvf)localObject3).xrk = new li();
      Object localObject4 = aa.abJ();
      if (localObject4 != null)
      {
        li localli = ((cvf)localObject3).xrk;
        if (com.tencent.mm.modelgeo.d.agz().agC())
          i = 0;
        localli.vOU = i;
        ((ayr)localObject2).wCw = ((axy)localObject4).vRq;
        ((ayr)localObject2).wCx = ((axy)localObject4).vRp;
        ((cvf)localObject3).xrl = ((a)g.K(a.class)).auH();
      }
      try
      {
        localObject4 = new com/tencent/mm/bt/b;
        ((com.tencent.mm.bt.b)localObject4).<init>(((cvf)localObject3).toByteArray());
        ((ayr)localObject2).wCz = ((com.tencent.mm.bt.b)localObject4);
        localObject3 = new com/tencent/mm/bt/b;
        ((com.tencent.mm.bt.b)localObject3).<init>(paramString2.toByteArray());
        ((ayr)localObject2).wCA = ((com.tencent.mm.bt.b)localObject3);
        w.a((com.tencent.mm.ai.b)localObject1, new c.1(this, paramo, paramString1));
        AppMethodBeat.o(91432);
        continue;
        ((cvf)localObject3).xrk.vOU = 1;
        ((ayr)localObject2).wCw = 0.0D;
        ((ayr)localObject2).wCx = 0.0D;
      }
      catch (IOException paramString2)
      {
        while (true)
          ab.printErrStackTrace("WidgetLocalSearchService", paramString2, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.c
 * JD-Core Version:    0.6.2
 */