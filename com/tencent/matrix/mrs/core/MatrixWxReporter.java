package com.tencent.matrix.mrs.core;

import com.tencent.matrix.resource.b;
import com.tencent.matrix.trace.b.a.a;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.sqlitelint.SQLiteLintPlugin;
import org.json.JSONObject;

public class MatrixWxReporter
{
  private static final int MATRIX_TRACE_ID_KEY = 1033;
  private static final String TAG = "MatrixWxReporter";
  private int MATRIX_TAG_REPORT_LOG_ID = 17108;

  public void report(String paramString, JSONObject paramJSONObject)
  {
    try
    {
      ab.i("MatrixWxReporter", "[report] tag:%s", new Object[] { paramString });
      if (!com.tencent.matrix.a.isInstalled())
        ab.i("MatrixWxReporter", "matrix not installed");
      while (true)
      {
        return;
        str = "";
        localObject1 = null;
        localObject2 = localObject1;
        if (paramString != null)
        {
          localObject2 = localObject1;
          if (paramString.startsWith("Trace"))
            localObject2 = com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class);
        }
        localObject1 = str;
        if (localObject2 != null)
        {
          if (!(localObject2 instanceof com.tencent.matrix.trace.a))
            break label285;
          localObject1 = str;
          if (paramJSONObject.getString("tag").equalsIgnoreCase("Trace_EvilMethod"))
          {
            localObject2 = paramJSONObject.getString("detail");
            ab.i("MatrixWxReporter", "[report] _detail:%s", new Object[] { localObject2 });
            if (!((String)localObject2).equalsIgnoreCase(a.a.bYJ.toString()))
              break;
            e.pXa.a(1033L, 0L, 1L, true);
            localObject1 = localObject2;
          }
        }
        h.pYm.e(this.MATRIX_TAG_REPORT_LOG_ID, new Object[] { paramString, Integer.valueOf(d.vxo), localObject1 });
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        String str;
        Object localObject1;
        Object localObject2;
        ab.printErrStackTrace("MatrixWxReporter", paramString, "data:%s", new Object[] { paramJSONObject.toString() });
        continue;
        if (((String)localObject2).equalsIgnoreCase(a.a.bYI.toString()))
        {
          e.pXa.a(1033L, 21L, 1L, true);
          localObject1 = localObject2;
        }
        else
        {
          localObject1 = localObject2;
          if (((String)localObject2).equalsIgnoreCase(a.a.bYK.toString()))
          {
            e.pXa.a(1033L, 11L, 1L, true);
            localObject1 = localObject2;
            continue;
            label285: if ((localObject2 instanceof com.tencent.matrix.iocanary.a))
            {
              e.pXa.a(1033L, 30L, 1L, false);
              localObject1 = str;
            }
            else if ((localObject2 instanceof SQLiteLintPlugin))
            {
              e.pXa.a(1033L, 31L, 1L, false);
              localObject1 = str;
            }
            else if ((localObject2 instanceof com.tencent.matrix.a.a))
            {
              e.pXa.a(1033L, 32L, 1L, false);
              localObject1 = str;
            }
            else
            {
              localObject1 = str;
              if ((localObject2 instanceof b))
              {
                e.pXa.a(1033L, 33L, 1L, false);
                localObject1 = str;
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.mrs.core.MatrixWxReporter
 * JD-Core Version:    0.6.2
 */