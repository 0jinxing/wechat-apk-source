package com.tencent.pb.common.c;

import com.tencent.pb.common.b.a.a.c;
import com.tencent.pb.common.b.a.a.w;
import com.tencent.pb.common.b.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class f
{
  private static HashMap<String, String> ApZ = new HashMap();
  private static Object sLock = new Object();

  public static void C(int paramInt1, int paramInt2, String paramString)
  {
    if (paramString == null)
      c.w("gyz", new Object[] { "addEmergencyRecord value is null" });
    while (true)
    {
      return;
      try
      {
        StringBuffer localStringBuffer = new java/lang/StringBuffer;
        localStringBuffer.<init>();
        localStringBuffer.append(paramInt1);
        localStringBuffer.append("---");
        localStringBuffer.append(paramInt2);
        synchronized (sLock)
        {
          String str = (String)ApZ.get(localStringBuffer.toString());
          Object localObject2 = paramString;
          if (str != null)
          {
            localObject2 = paramString;
            if (str.length() > 0)
            {
              localObject2 = new java/lang/StringBuffer;
              ((StringBuffer)localObject2).<init>(str);
              ((StringBuffer)localObject2).append("---");
              ((StringBuffer)localObject2).append(paramString);
              localObject2 = ((StringBuffer)localObject2).toString();
            }
          }
          ApZ.put(localStringBuffer.toString(), localObject2);
        }
      }
      catch (Throwable paramString)
      {
        c.w("gyz", new Object[] { paramString });
      }
    }
  }

  private static void as(ArrayList<a.w> paramArrayList)
  {
    while (true)
    {
      Object localObject3;
      Object localObject4;
      String str;
      synchronized (sLock)
      {
        ??? = ApZ.keySet();
        Iterator localIterator;
        if ((??? == null) || (((Set)???).size() <= 0))
        {
          return;
        }
        else
        {
          ??? = new StringBuffer();
          localIterator = ((Set)???).iterator();
        }
        if (!localIterator.hasNext())
          continue;
        localObject3 = (String)localIterator.next();
        ??? = ((String)localObject3).split("---");
        if (???.length < 2)
          continue;
        localObject4 = ???[0];
        str = ???[1];
      }
      synchronized (sLock)
      {
        localObject3 = (String)ApZ.get(localObject3);
        if ((localObject3 == null) || (((String)localObject3).length() == 0))
          continue;
        localObject3 = ((String)localObject3).split("---");
        if ((localObject3 == null) || (localObject3.length == 0))
          continue;
        int i = localObject3.length;
        for (int j = 0; j < i; j++)
        {
          ??? = localObject3[j];
          if ((??? != null) && (((String)???).length() != 0))
          {
            Object localObject5 = ((String)???).split("%");
            if (localObject5.length == 2)
              ??? = localObject5[1];
            localObject5 = new a.w();
            ((a.w)localObject5).AnO = localObject4;
            ((StringBuffer)???).setLength(0);
            ((StringBuffer)???).append(str);
            ((StringBuffer)???).append("%");
            ((StringBuffer)???).append((String)???);
            ((a.w)localObject5).AnP = ((StringBuffer)???).toString();
            paramArrayList.add(localObject5);
          }
        }
        paramArrayList = finally;
        throw paramArrayList;
      }
    }
  }

  public static void clearData()
  {
    synchronized (sLock)
    {
      ApZ.clear();
      return;
    }
  }

  public static void dPL()
  {
    if (!h.isNetworkConnected())
      c.w("StatisticsUtil", new Object[] { "reportStatisticsData network is false" });
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList();
      as(localArrayList);
      a.c localc;
      if (localArrayList.size() > 0)
      {
        localc = new a.c();
        a.w[] arrayOfw = new a.w[localArrayList.size()];
        localArrayList.toArray(arrayOfw);
        localc.Amy = arrayOfw;
      }
      while (true)
      {
        if (localc != null)
          break label93;
        c.w("StatisticsUtil", new Object[] { "reportStatisticsData CSClientReportReq is null" });
        break;
        localc = null;
      }
      label93: c.w("yunying", new Object[] { "reportStatisticsData" });
      c.d("StatisticsUtil", new Object[] { "reportStatisticsData start ret: ", Integer.valueOf(com.tencent.pb.common.b.f.dPx().a(new f.1(), "CsCmd.Cmd_CSClientReportReq", localc)) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.c.f
 * JD-Core Version:    0.6.2
 */