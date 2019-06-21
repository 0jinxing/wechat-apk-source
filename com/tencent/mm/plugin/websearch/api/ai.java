package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.protocal.protobuf.bdi;
import com.tencent.mm.protocal.protobuf.bdj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public final class ai
{
  public static bdj uaA;

  public static void adO(String paramString)
  {
    AppMethodBeat.i(124176);
    if (b.sO((String)g.RP().Ry().get(274436, null)))
      AppMethodBeat.o(124176);
    while (true)
    {
      return;
      if (t.mZ(paramString))
        break;
      AppMethodBeat.o(124176);
    }
    if (uaA == null)
      cVo();
    long l1 = System.currentTimeMillis();
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    if (i < uaA.jBw.size())
    {
      localObject2 = (bdi)uaA.jBw.get(i);
      long l2 = (l1 - ((bdi)localObject2).wHn) / 86400000L;
      ((bdi)localObject2).wHm *= Math.pow(0.98D, l2);
      ((bdi)localObject2).wHn = (l2 * 86400000L + ((bdi)localObject2).wHn);
      ab.d("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "after update: %.2f %d %s", new Object[] { Double.valueOf(((bdi)localObject2).wHm), Long.valueOf(((bdi)localObject2).wHn), ((bdi)localObject2).vHl });
      if (!((bdi)localObject2).vHl.equals(paramString))
        break label476;
      localObject1 = localObject2;
    }
    label476: 
    while (true)
    {
      while (true)
      {
        i++;
        break;
        if (localObject1 == null)
        {
          localObject1 = new bdi();
          ((bdi)localObject1).wHm = 1.0D;
          ((bdi)localObject1).wHn = l1;
          ((bdi)localObject1).vHl = paramString;
          uaA.jBw.add(localObject1);
          ab.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "add new use %s", new Object[] { paramString });
        }
        while (true)
        {
          Collections.sort(uaA.jBw, new Comparator()
          {
          });
          for (i = uaA.jBw.size() - 1; (i < uaA.jBw.size()) && (uaA.jBw.size() > 8); i++)
            if (((bdi)uaA.jBw.get(i)).wHm < 0.5D)
              uaA.jBw.remove(i);
          ((bdi)localObject1).wHm += 1.0D;
          ab.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "update use %s %.2f", new Object[] { paramString, Double.valueOf(((bdi)localObject1).wHm) });
        }
        localObject1 = ah.getContext().getSharedPreferences("fts_recent_biz_sp", 0);
        try
        {
          localObject2 = cVl();
          paramString = Base64.encodeToString(uaA.toByteArray(), 0);
          ((SharedPreferences)localObject1).edit().putString((String)localObject2, paramString).commit();
          ab.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "useBiz pbListString %s", new Object[] { paramString });
          AppMethodBeat.o(124176);
        }
        catch (IOException paramString)
        {
          AppMethodBeat.o(124176);
        }
      }
      break;
    }
  }

  public static String cVl()
  {
    AppMethodBeat.i(124175);
    String str = "key_pb_most_search_biz_list" + r.Yz();
    AppMethodBeat.o(124175);
    return str;
  }

  public static bdj cVo()
  {
    AppMethodBeat.i(124174);
    Object localObject;
    if (uaA == null)
    {
      localObject = cVl();
      uaA = new bdj();
      localObject = ah.getContext().getSharedPreferences("fts_recent_biz_sp", 0).getString((String)localObject, "");
      if (!bo.isNullOrNil((String)localObject))
        localObject = Base64.decode(((String)localObject).getBytes(), 0);
    }
    try
    {
      uaA.parseFrom((byte[])localObject);
      label67: if (b.sO((String)g.RP().Ry().get(274436, null)))
        uaA.jBw.clear();
      localObject = uaA;
      AppMethodBeat.o(124174);
      return localObject;
    }
    catch (IOException localIOException)
    {
      break label67;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ai
 * JD-Core Version:    0.6.2
 */