package com.tencent.matrix.iocanary.c;

import android.content.Context;
import com.tencent.matrix.c.b;
import com.tencent.matrix.iocanary.core.IOIssue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static String sPackageName = null;

  public static b a(IOIssue paramIOIssue)
  {
    if (paramIOIssue == null)
      paramIOIssue = null;
    while (true)
    {
      return paramIOIssue;
      b localb = new b(paramIOIssue.type);
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("path", paramIOIssue.path);
        localJSONObject.put("size", paramIOIssue.fileSize);
        localJSONObject.put("op", paramIOIssue.opCnt);
        localJSONObject.put("buffer", paramIOIssue.bufferSize);
        localJSONObject.put("cost", paramIOIssue.opCostTime);
        localJSONObject.put("opType", paramIOIssue.opType);
        localJSONObject.put("opSize", paramIOIssue.opSize);
        localJSONObject.put("thread", paramIOIssue.threadName);
        localJSONObject.put("stack", paramIOIssue.stack);
        localJSONObject.put("repeat", paramIOIssue.repeatReadCnt);
        label138: localb.bWv = localJSONObject;
        paramIOIssue = localb;
      }
      catch (JSONException paramIOIssue)
      {
        break label138;
      }
    }
  }

  public static String getThrowableStack(Throwable paramThrowable)
  {
    if (paramThrowable == null)
      paramThrowable = "";
    while (true)
    {
      return paramThrowable;
      Object localObject = paramThrowable.getStackTrace();
      if (localObject == null)
      {
        paramThrowable = "";
      }
      else
      {
        paramThrowable = new ArrayList(localObject.length);
        for (int i = 0; i < localObject.length; i++)
        {
          String str = localObject[i].getClassName();
          if ((!str.contains("libcore.io")) && (!str.contains("com.tencent.matrix.iocanary")) && (!str.contains("java.io")) && (!str.contains("dalvik.system")) && (!str.contains("android.os")))
            paramThrowable.add(localObject[i]);
        }
        if ((paramThrowable.size() > 10) && (sPackageName != null))
        {
          localObject = paramThrowable.listIterator(paramThrowable.size());
          do
          {
            if (!((ListIterator)localObject).hasPrevious())
              break;
            if (!((StackTraceElement)((ListIterator)localObject).previous()).getClassName().contains(sPackageName))
              ((ListIterator)localObject).remove();
          }
          while (paramThrowable.size() > 10);
        }
        localObject = new StringBuffer(paramThrowable.size());
        paramThrowable = paramThrowable.iterator();
        while (paramThrowable.hasNext())
          ((StringBuffer)localObject).append((StackTraceElement)paramThrowable.next()).append('\n');
        paramThrowable = ((StringBuffer)localObject).toString();
      }
    }
  }

  public static void setPackageName(Context paramContext)
  {
    if (sPackageName == null)
      sPackageName = paramContext.getPackageName();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.iocanary.c.a
 * JD-Core Version:    0.6.2
 */