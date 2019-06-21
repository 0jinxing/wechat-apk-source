package com.tencent.matrix.resource;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.a;
import com.tencent.matrix.d.c;
import org.json.JSONObject;

public class CanaryResultService extends MatrixJobIntentService
{
  public static void d(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(paramContext, CanaryResultService.class);
    localIntent.setAction("com.tencent.matrix.resource.result.action.REPORT_HPROF_RESULT");
    localIntent.putExtra("RESULT_PATH", paramString1);
    localIntent.putExtra("RESULT_ACTIVITY", paramString2);
    a(paramContext, CanaryResultService.class, -84148994, localIntent);
  }

  protected final void l(Intent paramIntent)
  {
    Object localObject1;
    Object localObject2;
    if ((paramIntent != null) && ("com.tencent.matrix.resource.result.action.REPORT_HPROF_RESULT".equals(paramIntent.getAction())))
    {
      localObject1 = paramIntent.getStringExtra("RESULT_PATH");
      localObject2 = paramIntent.getStringExtra("RESULT_ACTIVITY");
      if ((localObject1 == null) || (((String)localObject1).isEmpty()) || (localObject2 == null) || (((String)localObject2).isEmpty()))
        break label120;
    }
    while (true)
    {
      try
      {
        paramIntent = new org/json/JSONObject;
        paramIntent.<init>();
        paramIntent.put("resultZipPath", localObject1);
        paramIntent.put("activity", localObject2);
        localObject2 = a.yK().F(b.class);
        if (localObject2 != null)
        {
          localObject1 = new com/tencent/matrix/c/b;
          ((com.tencent.matrix.c.b)localObject1).<init>(paramIntent);
          ((com.tencent.matrix.b.b)localObject2).onDetectIssue((com.tencent.matrix.c.b)localObject1);
        }
        return;
      }
      catch (Throwable paramIntent)
      {
        c.printErrStackTrace("Matrix.CanaryResultService", paramIntent, "unexpected exception, skip reporting.", new Object[0]);
        continue;
      }
      label120: c.e("Matrix.CanaryResultService", "resultPath or activityName is null or empty, skip reporting.", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.CanaryResultService
 * JD-Core Version:    0.6.2
 */