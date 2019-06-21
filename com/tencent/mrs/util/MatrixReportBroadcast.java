package com.tencent.mrs.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.d.c;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MatrixReportBroadcast extends BroadcastReceiver
{
  private static final HashMap<String, ArrayList<a>> AjR = new HashMap();

  public static void dPd()
  {
    Looper.getMainLooper();
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        Iterator localIterator = MatrixReportBroadcast.bDq().keySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject1 = (String)localIterator.next();
          Object localObject2 = (ArrayList)MatrixReportBroadcast.bDq().get(localObject1);
          c.i("Matrix.ReportBroadcast", "MatrixReportBroadcast, matrix report pending issues tag:%s, size:%d", new Object[] { localObject1, Integer.valueOf(((ArrayList)localObject2).size()) });
          localObject1 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (MatrixReportBroadcast.a)((Iterator)localObject1).next();
            MatrixReport.with().reportLocal(((MatrixReportBroadcast.a)localObject2).tag, ((MatrixReportBroadcast.a)localObject2).value);
          }
        }
        MatrixReportBroadcast.bDq().clear();
        return false;
      }
    });
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null)
      c.e("Matrix.ReportBroadcast", "MatrixReportBroadcast intent == null", new Object[0]);
    while (true)
    {
      return;
      paramContext = w.n(paramIntent, "tag");
      paramIntent = w.n(paramIntent, "value");
      if (!MatrixReport.isInstalled())
      {
        c.e("Matrix.ReportBroadcast", "MatrixReportBroadcast, matrix report is not init, wait to report plugin:%s, content:%s", new Object[] { paramContext, paramIntent });
        a locala = new a(paramContext, paramIntent);
        paramIntent = (ArrayList)AjR.get(paramContext);
        paramContext = paramIntent;
        if (paramIntent == null)
          paramContext = new ArrayList();
        paramContext.add(locala);
      }
      else
      {
        c.i("Matrix.ReportBroadcast", "MatrixReportBroadcast, receive broadcast with tag %s, value:%s", new Object[] { paramContext, paramIntent });
        MatrixReport.with().reportLocal(paramContext, paramIntent);
      }
    }
  }

  static final class a
  {
    String tag;
    String value;

    a(String paramString1, String paramString2)
    {
      this.tag = paramString1;
      this.value = paramString2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mrs.util.MatrixReportBroadcast
 * JD-Core Version:    0.6.2
 */