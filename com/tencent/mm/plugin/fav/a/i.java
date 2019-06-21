package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{
  public static List<i.a> mfh;
  private static String mfi = "";
  private static String mfj = "";
  private static long mfk = 0L;

  public static void LK(String paramString)
  {
    AppMethodBeat.i(102662);
    el(paramString, "");
    AppMethodBeat.o(102662);
  }

  public static void LL(String paramString)
  {
    AppMethodBeat.i(102664);
    em(paramString, "");
    AppMethodBeat.o(102664);
  }

  private static void a(String paramString1, long paramLong, int paramInt, String paramString2)
  {
    AppMethodBeat.i(102660);
    if (mfh == null)
    {
      AppMethodBeat.o(102660);
      return;
    }
    i.a locala = new i.a((byte)0);
    locala.pageId = paramString1;
    locala.mfl = paramLong;
    locala.in = paramInt;
    if (bo.isNullOrNil(paramString2));
    for (locala.sid = "-1"; ; locala.sid = paramString2)
    {
      if (mfh != null)
        mfh.add(locala);
      AppMethodBeat.o(102660);
      break;
    }
  }

  private static void buD()
  {
    mfi = "";
    mfj = "";
    mfk = 0L;
  }

  public static void el(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102661);
    if (!bo.isNullOrNil(mfi))
      em(mfi, mfj);
    mfi = paramString1;
    mfj = paramString2;
    mfk = System.currentTimeMillis();
    AppMethodBeat.o(102661);
  }

  private static void em(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102663);
    if ((bo.isNullOrNil(paramString1)) || (!paramString1.equals(mfi)))
      AppMethodBeat.o(102663);
    while (true)
    {
      return;
      int i = (int)(System.currentTimeMillis() - mfk);
      mfk /= 1000L;
      String str = paramString2;
      if (bo.isNullOrNil(paramString2))
        str = "-1";
      a(paramString1, mfk, i, str);
      buD();
      AppMethodBeat.o(102663);
    }
  }

  public static void end()
  {
    AppMethodBeat.i(102659);
    if (mfh == null)
    {
      mfh = null;
      buD();
      AppMethodBeat.o(102659);
    }
    while (true)
    {
      return;
      Object localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("[");
      Iterator localIterator = mfh.iterator();
      label48: if (localIterator.hasNext())
      {
        i.a locala = (i.a)localIterator.next();
        localObject2 = new JSONObject();
        try
        {
          ((JSONObject)localObject2).put("p", locala.pageId);
          ((JSONObject)localObject2).put("tbe", locala.mfl);
          ((JSONObject)localObject2).put("in", locala.in);
          ((JSONObject)localObject2).put("sid", locala.sid);
          ((StringBuilder)localObject1).append(((JSONObject)localObject2).toString()).append(";");
          if (((StringBuilder)localObject1).length() <= 3072)
            break label48;
          mfh = null;
          buD();
          AppMethodBeat.o(102659);
        }
        catch (JSONException localJSONException)
        {
          while (true)
            ab.w("MicroMsg.Fav.FavSearchFlowReportLogic", "end, JSONException");
        }
      }
      ((StringBuilder)localObject1).append("]");
      localObject1 = ((StringBuilder)localObject1).toString();
      if (((String)localObject1).length() > 3072)
      {
        mfh = null;
        buD();
        AppMethodBeat.o(102659);
        continue;
      }
      Object localObject2 = new String[3];
      for (int i = 0; i < 3; i++)
        localObject2[i] = "";
      i = 0;
      label235: if (i < 3);
      try
      {
        if (((String)localObject1).length() > 1024)
        {
          localObject2[i] = ((String)localObject1).substring(0, 1024);
          localObject1 = ((String)localObject1).substring(1024);
          i++;
          break label235;
        }
        localObject2[i] = localObject1;
        h.pYm.e(15508, new Object[] { localObject2[0], localObject2[1], localObject2[2] });
        mfh = null;
        buD();
        AppMethodBeat.o(102659);
      }
      catch (Throwable localThrowable)
      {
        while (true)
          ab.w("MicroMsg.Fav.FavSearchFlowReportLogic", "report flow error: " + localThrowable.getMessage());
      }
    }
  }

  public static void start()
  {
    AppMethodBeat.i(102658);
    mfh = new Vector();
    AppMethodBeat.o(102658);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.i
 * JD-Core Version:    0.6.2
 */