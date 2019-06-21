package com.tencent.mm.plugin.webview.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class b
{
  private static long ueF = 2592000L;
  private static b ueG;
  private c ueH;
  private Map<String, Long> ueI;
  private long ueJ;

  public b()
  {
    AppMethodBeat.i(5625);
    this.ueI = new HashMap();
    this.ueJ = 0L;
    AppMethodBeat.o(5625);
  }

  private long adZ(String paramString)
  {
    AppMethodBeat.i(5632);
    long l;
    if (this.ueI.containsKey(paramString))
    {
      l = ((Long)this.ueI.get(paramString)).longValue();
      AppMethodBeat.o(5632);
    }
    while (true)
    {
      return l;
      l = cWj().adZ(paramString);
      AppMethodBeat.o(5632);
    }
  }

  private static long ax(String paramString, long paramLong)
  {
    AppMethodBeat.i(5633);
    if (paramString.equals("wx62d9035fd4fd2059"))
    {
      paramLong -= 52428800L;
      AppMethodBeat.o(5633);
    }
    while (true)
    {
      return paramLong;
      paramLong -= 10485760L;
      AppMethodBeat.o(5633);
    }
  }

  public static b cWi()
  {
    AppMethodBeat.i(5626);
    if (ueG == null)
      ueG = new b();
    b localb = ueG;
    AppMethodBeat.o(5626);
    return localb;
  }

  public final boolean a(String paramString1, final String paramString2, String paramString3, final String paramString4, final String paramString5, boolean paramBoolean)
  {
    AppMethodBeat.i(5628);
    long l1 = cWj().gW(paramString1, paramString2);
    long l2 = paramString2.getBytes().length + paramString3.getBytes().length;
    long l3 = l2 - l1;
    final long l4 = adZ(paramString1) + l3;
    final long l5 = ax(paramString1, l4);
    ab.i("MicroMsg.WebViewDataCenter", "prevSize = %d, valueSize = %d, diffSize = %d, newAppSize = %d, expireSize = %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l5) });
    if ((l5 > 0L) && (!paramBoolean))
    {
      paramBoolean = false;
      AppMethodBeat.o(5628);
    }
    while (true)
    {
      return paramBoolean;
      com.tencent.mm.plugin.webview.a.a.R(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(5624);
          Object localObject1;
          Object localObject2;
          long l1;
          Object localObject3;
          label112: Object localObject4;
          if (l5 > 0L)
          {
            localObject1 = b.this.cWj();
            localObject2 = l4;
            l1 = l5;
            localObject2 = String.format("select * from %s where appId='%s' order by weight,timeStamp", new Object[] { "WebViewData", localObject2 });
            ab.d("MicroMsg.WebViewDataStorage", "deleteSize querySql: ".concat(String.valueOf(localObject2)));
            localObject3 = ((c)localObject1).rawQuery((String)localObject2, new String[0]);
            if (localObject3 == null)
            {
              l2 = 0L;
              b.a(b.this).put(l4, Long.valueOf(paramString2 - l2));
              localObject2 = b.this.cWj();
              localObject3 = l4;
              localObject4 = paramString4;
              String str = paramString5;
              localObject1 = bo.bc(this.ueM, "1");
              l2 = b.aea(this.ueN);
              a locala = new a();
              locala.field_appId = ((String)localObject3);
              locala.field_appIdKey = c.gY((String)localObject3, (String)localObject4);
              locala.field_value = str;
              locala.field_weight = ((String)localObject1);
              locala.field_expireTime = (l2 + System.currentTimeMillis() / 1000L);
              locala.field_size = (((String)localObject4).getBytes().length + str.getBytes().length);
              locala.field_timeStamp = (System.currentTimeMillis() / 1000L);
              ab.d("MicroMsg.WebViewDataStorage", "setData: ".concat(String.valueOf(((c)localObject2).a(locala))));
              localObject2 = b.this.cWj();
              localObject4 = l4;
              if (b.a(b.this).get(l4) != null)
                break label664;
            }
          }
          label664: for (long l2 = 0L; ; l2 = ((Long)b.a(b.this).get(l4)).longValue())
          {
            localObject1 = new a();
            ((a)localObject1).field_appId = ((String)localObject4);
            ((a)localObject1).field_appIdKey = c.at((String)localObject4, "###@@@@TOTAL@@@###SIZE####", "_");
            ((a)localObject1).field_expireTime = 9223372036854775807L;
            ((a)localObject1).field_size = l2;
            ab.d("MicroMsg.WebViewDataStorage", "setAppIdSize: %b, size: %d", new Object[] { Boolean.valueOf(((c)localObject2).a((com.tencent.mm.sdk.e.c)localObject1)), Long.valueOf(l2) });
            b.b(b.this);
            AppMethodBeat.o(5624);
            return;
            localObject4 = new LinkedList();
            long l3;
            for (l2 = l1; (((Cursor)localObject3).moveToFirst()) && (l2 > 0L); l2 -= l3)
            {
              localObject2 = ((Cursor)localObject3).getString(1);
              l3 = ((Cursor)localObject3).getLong(6);
              ((List)localObject4).add(localObject2);
            }
            ((Cursor)localObject3).close();
            if (((List)localObject4).size() > 0)
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("(");
              localObject3 = ((List)localObject4).iterator();
              while (((Iterator)localObject3).hasNext())
              {
                localObject4 = (String)((Iterator)localObject3).next();
                ((StringBuilder)localObject2).append("\"" + (String)localObject4 + "\",");
              }
              ((StringBuilder)localObject2).deleteCharAt(((StringBuilder)localObject2).length() - 1);
              ((StringBuilder)localObject2).append(")");
              localObject2 = String.format("delete from %s where %s in %s", new Object[] { "WebViewData", "appIdKey", ((StringBuilder)localObject2).toString() });
              ab.d("MicroMsg.WebViewDataStorage", "deleteSize deleteSql: ".concat(String.valueOf(localObject2)));
              ab.d("MicroMsg.WebViewDataStorage", "deleteSize: ".concat(String.valueOf(((c)localObject1).hY("WebViewData", (String)localObject2))));
            }
            l2 = l1 - l2;
            break;
            b.a(b.this).put(l4, Long.valueOf(paramString2));
            break label112;
          }
        }
      });
      paramBoolean = true;
      AppMethodBeat.o(5628);
    }
  }

  public final void adY(String paramString)
  {
    AppMethodBeat.i(5631);
    cWj().adY(paramString);
    AppMethodBeat.o(5631);
  }

  public final void b(String paramString, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(5630);
    cWj().b(paramString, paramJSONArray);
    AppMethodBeat.o(5630);
  }

  public final c cWj()
  {
    AppMethodBeat.i(5627);
    if (this.ueH == null)
    {
      g.RQ();
      this.ueH = new c(g.RP().eJN);
    }
    c localc = this.ueH;
    AppMethodBeat.o(5627);
    return localc;
  }

  public final a gV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5629);
    paramString1 = cWj().gV(paramString1, paramString2);
    AppMethodBeat.o(5629);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.b.b
 * JD-Core Version:    0.6.2
 */