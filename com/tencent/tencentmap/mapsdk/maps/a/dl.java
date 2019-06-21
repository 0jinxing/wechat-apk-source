package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class dl extends dk
  implements cd
{
  private dz a;
  private cb b;

  public dl()
  {
    AppMethodBeat.i(98717);
    this.a = new dz("HttpSchedulerClient");
    AppMethodBeat.o(98717);
  }

  private static void a(cb paramcb, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(98721);
    int i = 0;
    try
    {
      if (i < paramJSONArray.length())
      {
        localObject = paramJSONArray.getJSONObject(i);
        JSONArray localJSONArray1 = ((JSONObject)localObject).optJSONArray("domains");
        localJSONArray2 = ((JSONObject)localObject).optJSONArray("resultlist");
        String str1 = ((JSONObject)localObject).optString("schedulecode");
        localObject = ((JSONObject)localObject).optString("httpsport");
        if ((localJSONArray1 != null) && (localJSONArray2 != null))
        {
          j = 0;
          if (j < localJSONArray1.length())
          {
            str2 = localJSONArray1.getString(j);
            localcc = new com/tencent/tencentmap/mapsdk/maps/a/cc;
            localcc.<init>(str2, str1);
          }
        }
      }
    }
    catch (Exception paramcb)
    {
      try
      {
        while (true)
        {
          Object localObject;
          JSONArray localJSONArray2;
          int j;
          String str2;
          cc localcc;
          localcc.d = Integer.parseInt((String)localObject);
          for (int k = 0; k < localJSONArray2.length(); k++)
          {
            str2 = localJSONArray2.getString(k);
            bu localbu = new com/tencent/tencentmap/mapsdk/maps/a/bu;
            localbu.<init>();
            if (localbu.a(str2))
              localcc.c.add(localbu);
          }
          paramcb.a(localcc);
          label174: j++;
          continue;
          i++;
        }
        AppMethodBeat.o(98721);
        while (true)
        {
          return;
          paramcb = paramcb;
          AppMethodBeat.o(98721);
        }
      }
      catch (Throwable localThrowable)
      {
        break label174;
      }
    }
  }

  public final List<cc> a()
  {
    AppMethodBeat.i(98720);
    ArrayList localArrayList;
    if ((this.b != null) && (this.b.a().equals(ce.b())))
    {
      localArrayList = new ArrayList();
      Iterator localIterator = this.b.b().entrySet().iterator();
      while (localIterator.hasNext())
        localArrayList.add(((Map.Entry)localIterator.next()).getValue());
      AppMethodBeat.o(98720);
    }
    while (true)
    {
      return localArrayList;
      bt.j().post(new dm(this));
      localArrayList = null;
      AppMethodBeat.o(98720);
    }
  }

  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    AppMethodBeat.i(98719);
    this.a.a(paramString1, paramArrayOfByte);
    bt.j().post(new dm(this));
    AppMethodBeat.o(98719);
  }

  public final String b()
  {
    return "accessscheduler";
  }

  public final void c()
  {
    AppMethodBeat.i(98718);
    en.d().a();
    AppMethodBeat.o(98718);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dl
 * JD-Core Version:    0.6.2
 */