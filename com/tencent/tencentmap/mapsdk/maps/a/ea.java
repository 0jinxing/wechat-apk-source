package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ea extends dy
{
  private dz a;

  public ea()
  {
    AppMethodBeat.i(98757);
    this.a = new dz("HttpSchedulerHandler");
    AppMethodBeat.o(98757);
  }

  public final void a()
  {
    AppMethodBeat.i(98758);
    bt.j().post(new eb(this, null, null));
    AppMethodBeat.o(98758);
  }

  public final void a(du paramdu)
  {
    AppMethodBeat.i(98759);
    Object localObject1;
    Object localObject4;
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      Object localObject2 = this.a;
      ce.e();
      localObject2 = ((dz)localObject2).a(ce.b());
      JSONObject localJSONObject1;
      Iterator localIterator;
      if (!eu.a((byte[])localObject2))
      {
        localObject4 = new java/lang/String;
        ((String)localObject4).<init>((byte[])localObject2);
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject4);
        if (localObject2 == null)
          break label309;
        localJSONObject1 = ((JSONObject)localObject2).optJSONObject("resultMap");
        if (localJSONObject1 != null)
          localIterator = localJSONObject1.keys();
      }
      else
      {
        while (true)
        {
          if (!localIterator.hasNext())
            break label288;
          String str = (String)localIterator.next();
          localObject4 = localJSONObject1.optJSONArray(str);
          if (localObject4 != null)
          {
            localObject2 = new org/json/JSONObject;
            ((JSONObject)localObject2).<init>();
            int i = 0;
            while (true)
              if (i < ((JSONArray)localObject4).length())
              {
                JSONObject localJSONObject2 = ((JSONArray)localObject4).getJSONObject(i);
                ((JSONObject)localObject2).put(localJSONObject2.optString("unit"), localJSONObject2.optString("schedulecode"));
                i++;
                continue;
                localObject2 = null;
                break;
              }
            ((JSONObject)localObject1).put(str, localObject2);
          }
        }
      }
    }
    catch (Exception localException)
    {
    }
    try
    {
      Object localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = bt.c();
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      ((JSONObject)localObject3).put((String)localObject4, localObject1);
      paramdu.a.put("directScheduleCodes", localObject3);
      AppMethodBeat.o(98759);
      return;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = bt.c();
      localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>();
      ((JSONObject)localObject1).put((String)localObject4, localObject3);
      while (true)
      {
        label288: paramdu.a.put("directScheduleCodes", localObject1);
        AppMethodBeat.o(98759);
        break;
        label309: localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = bt.c();
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>();
        ((JSONObject)localObject1).put((String)localObject4, localObject3);
      }
    }
    catch (Exception paramdu)
    {
      while (true)
        AppMethodBeat.o(98759);
    }
  }

  public final void a(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(98760);
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("AccessScheduleRsp");
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.toString();
        if (!eu.a(paramJSONObject))
        {
          paramJSONObject = paramJSONObject.getBytes();
          if (!eu.a(paramJSONObject))
          {
            String str = ce.b();
            this.a.a(str, paramJSONObject);
            Handler localHandler = bt.j();
            eb localeb = new com/tencent/tencentmap/mapsdk/maps/a/eb;
            localeb.<init>(this, str, paramJSONObject);
            localHandler.post(localeb);
          }
        }
      }
      AppMethodBeat.o(98760);
      return;
    }
    catch (Throwable paramJSONObject)
    {
      while (true)
        AppMethodBeat.o(98760);
    }
  }

  public final String c()
  {
    return "accessscheduler";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ea
 * JD-Core Version:    0.6.2
 */