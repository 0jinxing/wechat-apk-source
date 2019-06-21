package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.protocal.protobuf.acc;
import com.tencent.mm.protocal.protobuf.cte;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

final class g$1
  implements Runnable
{
  g$1(WepkgCrossProcessTask paramWepkgCrossProcessTask, String paramString, File paramFile, g.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63552);
    if (this.uXk.csN)
      d.aNS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(63551);
          JSONObject localJSONObject1;
          Object localObject2;
          JSONObject localJSONObject2;
          Object localObject3;
          Object localObject4;
          try
          {
            localJSONObject1 = new org/json/JSONObject;
            localJSONObject1.<init>();
            localJSONObject1.put("rootDir", g.1.this.uXl);
            Object localObject1 = new java/util/HashMap;
            ((HashMap)localObject1).<init>();
            g.a(g.1.this.uXm, (Map)localObject1);
            JSONArray localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>();
            localObject1 = ((Map)localObject1).entrySet().iterator();
            while (true)
              if (((Iterator)localObject1).hasNext())
              {
                localObject2 = (Map.Entry)((Iterator)localObject1).next();
                if (((List)((Map.Entry)localObject2).getValue()).size() != 0)
                {
                  localJSONObject2 = new org/json/JSONObject;
                  localJSONObject2.<init>();
                  localJSONObject2.put("pkgId", ((Map.Entry)localObject2).getKey());
                  localObject3 = h.ahW((String)((Map.Entry)localObject2).getKey());
                  if (localObject3 != null)
                    localJSONObject2.put("controlInfo", ((WepkgVersion)localObject3).dgC());
                  localObject4 = h.aia((String)((Map.Entry)localObject2).getKey());
                  if (!bo.ek((List)localObject4))
                  {
                    localObject3 = new org/json/JSONArray;
                    ((JSONArray)localObject3).<init>();
                    localObject4 = ((List)localObject4).iterator();
                    while (((Iterator)localObject4).hasNext())
                      ((JSONArray)localObject3).put(((WepkgPreloadFile)((Iterator)localObject4).next()).dgC());
                  }
                }
              }
          }
          catch (Exception localException)
          {
            if (g.1.this.uXn != null)
              g.1.this.uXn.U(null);
            AppMethodBeat.o(63551);
          }
          while (true)
          {
            return;
            localJSONObject2.put("preloadFilesInfo", localObject3);
            localObject3 = new org/json/JSONArray;
            ((JSONArray)localObject3).<init>();
            localObject2 = ((List)((Map.Entry)localObject2).getValue()).iterator();
            while (((Iterator)localObject2).hasNext())
            {
              Object localObject5 = (g.b)((Iterator)localObject2).next();
              localObject4 = new org/json/JSONObject;
              ((JSONObject)localObject4).<init>();
              ((JSONObject)localObject4).put("version", ((g.b)localObject5).version);
              Object localObject6;
              if (!bo.isNullOrNil(((g.b)localObject5).rgC))
              {
                localObject6 = new java/io/File;
                ((File)localObject6).<init>(((g.b)localObject5).rgC);
                if ((((File)localObject6).exists()) && (((File)localObject6).isFile()))
                {
                  ((JSONObject)localObject4).put("md5", com.tencent.mm.a.g.v((File)localObject6));
                  ((JSONObject)localObject4).put("size", ((File)localObject6).length());
                  Object localObject7 = new com/tencent/mm/plugin/wepkg/model/e;
                  ((e)localObject7).<init>((File)localObject6);
                  localObject7 = ((e)localObject7).uWV;
                  if (localObject7 != null)
                  {
                    ((JSONObject)localObject4).put("charset", ((cte)localObject7).xql);
                    ((JSONObject)localObject4).put("desc", ((cte)localObject7).Desc);
                    if (((cte)localObject7).xqk != null)
                    {
                      localObject6 = new org/json/JSONArray;
                      ((JSONArray)localObject6).<init>();
                      Iterator localIterator = ((cte)localObject7).xqk.iterator();
                      while (localIterator.hasNext())
                      {
                        localObject7 = (acc)localIterator.next();
                        JSONObject localJSONObject3 = new org/json/JSONObject;
                        localJSONObject3.<init>();
                        localJSONObject3.put("rid", ((acc)localObject7).wjQ);
                        localJSONObject3.put("offset", ((acc)localObject7).wjR);
                        localJSONObject3.put("size", ((acc)localObject7).jCo);
                        localJSONObject3.put("mimeType", ((acc)localObject7).wjS);
                        ((JSONArray)localObject6).put(localJSONObject3);
                      }
                      ((JSONObject)localObject4).put("resList", localObject6);
                    }
                  }
                }
              }
              else
              {
                localObject6 = ((g.b)localObject5).uXq;
                if (!bo.ek((List)localObject6))
                {
                  localObject5 = new org/json/JSONArray;
                  ((JSONArray)localObject5).<init>();
                  localObject6 = ((List)localObject6).iterator();
                  while (((Iterator)localObject6).hasNext())
                    ((JSONArray)localObject5).put((String)((Iterator)localObject6).next());
                  ((JSONObject)localObject4).put("preloadFiles", localObject5);
                }
                ((JSONArray)localObject3).put(localObject4);
              }
            }
            localJSONObject2.put("versionList", localObject3);
            localException.put(localJSONObject2);
            break;
            localJSONObject1.put("pkgList", localException);
            if (g.1.this.uXn != null)
              g.1.this.uXn.U(localJSONObject1);
            AppMethodBeat.o(63551);
          }
        }
      });
    this.uXk.aBW();
    AppMethodBeat.o(63552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.g.1
 * JD-Core Version:    0.6.2
 */