package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.map.lib.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class q
{
  public static int a = 1000;
  private volatile List<p> b;
  private s c;
  private int d;

  public q(Context paramContext, String paramString)
  {
    AppMethodBeat.i(98255);
    this.d = -1;
    if (paramString == null);
    for (this.c = w.a(paramContext); ; this.c = u.a(paramContext, paramString))
    {
      b();
      AppMethodBeat.o(98255);
      return;
    }
  }

  private List<p> b(JSONArray paramJSONArray)
  {
    Object localObject1 = null;
    AppMethodBeat.i(98258);
    if (paramJSONArray == null)
    {
      AppMethodBeat.o(98258);
      paramJSONArray = localObject1;
    }
    while (true)
    {
      return paramJSONArray;
      int i = paramJSONArray.length();
      ArrayList localArrayList = new ArrayList(i);
      int j = 0;
      while (true)
      {
        if (j >= i)
          break label122;
        try
        {
          Object localObject2 = paramJSONArray.getJSONObject(j);
          int k = ((JSONObject)localObject2).getInt("index");
          int m = ((JSONObject)localObject2).getInt("id");
          int n = ((JSONObject)localObject2).getInt("order");
          localObject2 = new com/tencent/tencentmap/mapsdk/a/p;
          ((p)localObject2).<init>(k, m, n);
          localArrayList.add(localObject2);
          j++;
        }
        catch (Exception paramJSONArray)
        {
          AppMethodBeat.o(98258);
          paramJSONArray = localObject1;
        }
      }
      continue;
      label122: Collections.sort(localArrayList);
      AppMethodBeat.o(98258);
      paramJSONArray = localArrayList;
    }
  }

  private void b()
  {
    AppMethodBeat.i(98256);
    this.b = new CopyOnWriteArrayList();
    Object localObject1 = this.c.a("mapStyleList");
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = "[{\"id\":0,\"index\":0,\"order\":1},{\"id\":-1,\"index\":1,\"order\":-1},{\"id\":-1,\"index\":2,\"order\":-1},{\"id\":-1,\"index\":3,\"order\":-1},{\"id\":-1,\"index\":4,\"order\":-1},{\"id\":-1,\"index\":5,\"order\":-1},{\"id\":-1,\"index\":6,\"order\":-1},{\"id\":-1,\"index\":7,\"order\":-1},{\"id\":-1,\"index\":8,\"order\":-1},{\"id\":9,\"index\":9,\"order\":-1},{\"id\":10,\"index\":10,\"order\":-1},{\"id\":5,\"index\":11,\"order\":-1},{\"id\":4,\"index\":12,\"order\":-1},{\"id\":6,\"index\":13,\"order\":-1},{\"id\":7,\"index\":14,\"order\":-1},{\"id\":8,\"index\":15,\"order\":-1}]";
    try
    {
      localObject1 = new org/json/JSONArray;
      ((JSONArray)localObject1).<init>((String)localObject2);
      this.b.addAll(b((JSONArray)localObject1));
      AppMethodBeat.o(98256);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(98256);
    }
  }

  public int a(int paramInt)
  {
    AppMethodBeat.i(98260);
    if ((this.b == null) || (this.b.size() == 0) || (paramInt < 0))
      AppMethodBeat.o(98260);
    while (true)
    {
      return paramInt;
      this.d = paramInt;
      if (paramInt >= a)
      {
        paramInt -= a;
        AppMethodBeat.o(98260);
      }
      else
      {
        Iterator localIterator = this.b.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            p localp = (p)localIterator.next();
            if (localp.c == paramInt)
            {
              paramInt = localp.a;
              AppMethodBeat.o(98260);
              break;
            }
          }
        AppMethodBeat.o(98260);
      }
    }
  }

  public String a()
  {
    AppMethodBeat.i(98259);
    Object localObject;
    if (this.b == null)
    {
      localObject = null;
      AppMethodBeat.o(98259);
    }
    while (true)
    {
      return localObject;
      StringBuilder localStringBuilder = new StringBuilder(128);
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        localObject = (p)localIterator.next();
        if (((p)localObject).b != -1)
        {
          if (localStringBuilder.length() == 0)
          {
            localStringBuilder.append(((p)localObject).b);
          }
          else
          {
            localStringBuilder.append(",");
            localStringBuilder.append(((p)localObject).b);
          }
        }
        else if (localStringBuilder.length() == 0)
          localStringBuilder.append(0);
        else
          localStringBuilder.append(",");
      }
      localObject = localStringBuilder.toString();
      AppMethodBeat.o(98259);
    }
  }

  public void a(f paramf)
  {
    AppMethodBeat.i(98261);
    if (paramf != null)
      paramf.a(a(this.d));
    AppMethodBeat.o(98261);
  }

  public void a(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(98257);
    String str = this.c.a("mapStyleList");
    if (paramJSONArray != null)
    {
      List localList = b(paramJSONArray);
      if (localList != null)
      {
        this.b.clear();
        this.b.addAll(localList);
        if (!paramJSONArray.toString().equals(str))
        {
          this.c.a();
          this.c.a("mapStyleList", paramJSONArray.toString());
        }
      }
    }
    AppMethodBeat.o(98257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.q
 * JD-Core Version:    0.6.2
 */