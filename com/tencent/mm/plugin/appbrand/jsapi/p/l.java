package com.tencent.mm.plugin.appbrand.jsapi.p;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.file.f.a;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class l
{
  private SensorManager bCW;
  private Handler mHandler;

  public l()
  {
    AppMethodBeat.i(126402);
    this.mHandler = new Handler(m.aNS().oAl.getLooper());
    AppMethodBeat.o(126402);
  }

  public final f.a a(c paramc, JSONObject paramJSONObject, l.a parama, String paramString, List<Integer> paramList)
  {
    AppMethodBeat.i(126403);
    boolean bool1 = paramJSONObject.optBoolean("enable");
    int i = paramJSONObject.optInt("interval", 200);
    if (this.bCW == null)
      this.bCW = ((SensorManager)ah.getContext().getSystemService("sensor"));
    if (this.bCW == null)
    {
      ab.i("MicroMsg.UnitSensor", "getSystemService(SENSOR_SERVICE) failed.");
      paramc = new f.a("fail:null system service", new Object[0]);
      AppMethodBeat.o(126403);
      return paramc;
    }
    Object localObject = new ArrayList();
    paramList = paramList.iterator();
    int j;
    while (true)
    {
      if (!paramList.hasNext())
        break label179;
      j = ((Integer)paramList.next()).intValue();
      paramJSONObject = this.bCW.getDefaultSensor(j);
      if (paramJSONObject == null)
      {
        ab.i("MicroMsg.UnitSensor", "get sensor failed.");
        paramc = new f.a("fail:null sensor", new Object[0]);
        AppMethodBeat.o(126403);
        break;
      }
      ((List)localObject).add(paramJSONObject);
    }
    label179: if (bool1)
    {
      paramJSONObject = v.Zp().nU(paramString);
      if (paramJSONObject != null)
        break label657;
      paramJSONObject = v.Zp().y(paramString, true);
    }
    label657: 
    while (true)
    {
      if ((l.a)paramJSONObject.get("sensor_event_listener", null) != null)
      {
        ab.w("MicroMsg.UnitSensor", "register failed, sensorEventListener has already registered.");
        paramc = new f.a("fail, has enable, should stop pre operation", new Object[0]);
        AppMethodBeat.o(126403);
        break;
      }
      g.a(paramc.getAppId(), parama);
      paramJSONObject.j("sensor_event_listener", parama);
      Iterator localIterator = ((List)localObject).iterator();
      bool1 = false;
      while (localIterator.hasNext())
      {
        localObject = (Sensor)localIterator.next();
        paramList = this.bCW;
        switch (i)
        {
        default:
          j = 3;
          label355: boolean bool2 = paramList.registerListener(parama, (Sensor)localObject, j, this.mHandler);
          bool1 = bool2;
          if (!bool2)
            bool1 = bool2;
          break;
        case 0:
        case 20:
        case 60:
        case 200:
        }
      }
      if (!bool1)
      {
        this.bCW.unregisterListener(parama);
        parama.aEP();
        g.b(paramc.getAppId(), parama);
        paramJSONObject.recycle();
        v.Zp().nV(paramString);
      }
      ab.i("MicroMsg.UnitSensor", "register sensor finished(s : %s, r : %s).", new Object[] { paramString, Boolean.valueOf(bool1) });
      if (bool1);
      for (paramc = "ok"; ; paramc = "fail:system error")
      {
        paramc = new f.a(paramc, new Object[0]);
        AppMethodBeat.o(126403);
        break;
        j = 0;
        break label355;
        j = 1;
        break label355;
        j = 2;
        break label355;
        j = 3;
        break label355;
      }
      paramJSONObject = v.Zp().nV(paramString);
      if (paramJSONObject == null)
      {
        ab.i("MicroMsg.UnitSensor", "unregister sensor event listener failed, keyValueSet do not exist.");
        paramc = new f.a("fail:fail to disable, not enable?", new Object[0]);
        AppMethodBeat.o(126403);
        break;
      }
      parama = (l.a)paramJSONObject.get("sensor_event_listener", null);
      if (parama == null)
      {
        ab.i("MicroMsg.UnitSensor", "unregister sensor event listener failed, listener do not exist.");
        paramc = new f.a("fail:fail to disable, not enable?", new Object[0]);
        AppMethodBeat.o(126403);
        break;
      }
      this.bCW.unregisterListener(parama);
      g.b(paramc.getAppId(), parama);
      parama.aEP();
      paramJSONObject.recycle();
      ab.i("MicroMsg.UnitSensor", "unregister sensor finished(%s).", new Object[] { paramString });
      paramc = new f.a("ok", new Object[0]);
      AppMethodBeat.o(126403);
      break;
    }
  }

  public final void a(l.a parama)
  {
    AppMethodBeat.i(126404);
    this.bCW.unregisterListener(parama);
    AppMethodBeat.o(126404);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.l
 * JD-Core Version:    0.6.2
 */