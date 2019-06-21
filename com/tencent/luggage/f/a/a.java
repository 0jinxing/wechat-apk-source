package com.tencent.luggage.f.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.HandlerThread;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManager;
import com.tencent.map.geolocation.TencentLocationRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.s.b.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class a
  implements com.tencent.mm.plugin.appbrand.s.b.a
{
  private volatile TencentLocationManager bRp;

  @SuppressLint({"NewApi"})
  private final List<a.b> bRq;

  @SuppressLint({"NewApi"})
  private final List<a.b> bRr;

  @SuppressLint({"NewApi"})
  private final List<a.b> bRs;

  @SuppressLint({"NewApi"})
  private final List<a.b> bRt;
  TencentLocationListener bRu;
  private Set<String> bRv;
  private Runnable bRw;

  public a()
  {
    AppMethodBeat.i(51138);
    this.bRq = new CopyOnWriteArrayList();
    this.bRr = new CopyOnWriteArrayList();
    this.bRs = new CopyOnWriteArrayList();
    this.bRt = new CopyOnWriteArrayList();
    this.bRu = new TencentLocationListener()
    {
      public final void onLocationChanged(TencentLocation paramAnonymousTencentLocation, int paramAnonymousInt, String paramAnonymousString)
      {
        AppMethodBeat.i(51135);
        ab.v("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]error:%d, reason:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        if (paramAnonymousInt != 0)
          ab.e("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]error:%d, reason:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        if ((a.a(a.this) != null) && (a.a(a.this).size() > 0))
        {
          a.a(a.a(a.this), paramAnonymousInt, paramAnonymousString, a.a(paramAnonymousTencentLocation, false));
          a.a(a.this).clear();
        }
        if ((a.b(a.this) != null) && (a.b(a.this).size() > 0))
        {
          a.a(a.b(a.this), paramAnonymousInt, paramAnonymousString, a.a(paramAnonymousTencentLocation, true));
          a.b(a.this).clear();
        }
        if ((a.c(a.this) != null) && (a.c(a.this).size() > 0))
          a.a(a.c(a.this), paramAnonymousInt, paramAnonymousString, a.a(paramAnonymousTencentLocation, false));
        if ((a.d(a.this) != null) && (a.d(a.this).size() > 0))
          a.a(a.d(a.this), paramAnonymousInt, paramAnonymousString, a.a(paramAnonymousTencentLocation, true));
        a.e(a.this);
        AppMethodBeat.o(51135);
      }

      public final void onStatusUpdate(String paramAnonymousString1, int paramAnonymousInt, String paramAnonymousString2)
      {
        AppMethodBeat.i(51136);
        ab.i("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]name:%s, status:%d, desc:%s", new Object[] { paramAnonymousString1, Integer.valueOf(paramAnonymousInt), paramAnonymousString2 });
        AppMethodBeat.o(51136);
      }
    };
    this.bRv = new HashSet();
    this.bRw = new a.3(this);
    ab.i("MicroMsg.DefaultTencentLocationManager", "DefaultTencentLocationManager() construct in process %s", new Object[] { ah.getProcessName() });
    AppMethodBeat.o(51138);
  }

  // ERROR //
  private TencentLocationManager yg()
  {
    // Byte code:
    //   0: ldc 208
    //   2: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 210	com/tencent/luggage/f/a/a:bRp	Lcom/tencent/map/geolocation/TencentLocationManager;
    //   9: ifnonnull +113 -> 122
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield 210	com/tencent/luggage/f/a/a:bRp	Lcom/tencent/map/geolocation/TencentLocationManager;
    //   18: ifnonnull +102 -> 120
    //   21: aload_0
    //   22: invokevirtual 213	com/tencent/luggage/f/a/a:yh	()Z
    //   25: ifeq +58 -> 83
    //   28: new 215	java/io/File
    //   31: astore_1
    //   32: new 217	java/lang/StringBuilder
    //   35: astore_2
    //   36: aload_2
    //   37: invokespecial 218	java/lang/StringBuilder:<init>	()V
    //   40: aload_1
    //   41: aload_2
    //   42: getstatic 223	com/tencent/mm/loader/j/b:eSn	Ljava/lang/String;
    //   45: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: ldc 229
    //   50: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: invokestatic 73	com/tencent/mm/sdk/platformtools/ah:getProcessName	()Ljava/lang/String;
    //   56: invokestatic 232	com/tencent/mm/sdk/platformtools/ah:getPackageName	()Ljava/lang/String;
    //   59: invokevirtual 236	java/lang/String:length	()I
    //   62: iconst_1
    //   63: iadd
    //   64: invokevirtual 240	java/lang/String:substring	(I)Ljava/lang/String;
    //   67: invokevirtual 227	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: invokevirtual 243	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   73: invokespecial 246	java/io/File:<init>	(Ljava/lang/String;)V
    //   76: invokestatic 250	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   79: aload_1
    //   80: invokestatic 256	com/tencent/map/geolocation/internal/TencentExtraKeys:setTencentLog	(Landroid/content/Context;Ljava/io/File;)V
    //   83: aload_0
    //   84: invokestatic 250	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   87: invokestatic 262	com/tencent/map/geolocation/TencentLocationManager:getInstance	(Landroid/content/Context;)Lcom/tencent/map/geolocation/TencentLocationManager;
    //   90: putfield 210	com/tencent/luggage/f/a/a:bRp	Lcom/tencent/map/geolocation/TencentLocationManager;
    //   93: aload_0
    //   94: getfield 210	com/tencent/luggage/f/a/a:bRp	Lcom/tencent/map/geolocation/TencentLocationManager;
    //   97: iconst_0
    //   98: invokevirtual 265	com/tencent/map/geolocation/TencentLocationManager:setCoordinateType	(I)V
    //   101: invokestatic 250	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   104: invokestatic 269	com/tencent/map/geolocation/internal/TencentExtraKeys:setContext	(Landroid/content/Context;)V
    //   107: new 271	com/tencent/luggage/f/a/a$1
    //   110: astore_1
    //   111: aload_1
    //   112: aload_0
    //   113: invokespecial 272	com/tencent/luggage/f/a/a$1:<init>	(Lcom/tencent/luggage/f/a/a;)V
    //   116: aload_1
    //   117: invokestatic 276	com/tencent/map/geolocation/internal/TencentExtraKeys:setTencentLogCallback	(Lcom/tencent/map/geolocation/internal/LocationLogCallback;)V
    //   120: aload_0
    //   121: monitorexit
    //   122: aload_0
    //   123: getfield 210	com/tencent/luggage/f/a/a:bRp	Lcom/tencent/map/geolocation/TencentLocationManager;
    //   126: astore_1
    //   127: ldc 208
    //   129: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: aload_1
    //   133: areturn
    //   134: astore_1
    //   135: ldc 65
    //   137: ldc 171
    //   139: iconst_1
    //   140: anewarray 4	java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: aload_1
    //   146: aastore
    //   147: invokestatic 278	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: goto -67 -> 83
    //   153: astore_1
    //   154: aload_0
    //   155: monitorexit
    //   156: ldc 208
    //   158: invokestatic 81	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: aload_1
    //   162: athrow
    //   163: astore_1
    //   164: ldc 65
    //   166: ldc 171
    //   168: iconst_1
    //   169: anewarray 4	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload_1
    //   175: aastore
    //   176: invokestatic 278	com/tencent/mm/sdk/platformtools/ab:c	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: goto -59 -> 120
    //
    // Exception table:
    //   from	to	target	type
    //   76	83	134	java/lang/Exception
    //   14	76	153	finally
    //   76	83	153	finally
    //   83	107	153	finally
    //   107	120	153	finally
    //   120	122	153	finally
    //   135	150	153	finally
    //   154	156	153	finally
    //   164	179	153	finally
    //   107	120	163	java/lang/Exception
  }

  private void yi()
  {
    AppMethodBeat.i(51143);
    if ((this.bRr.size() <= 0) && (this.bRq.size() <= 0) && (this.bRs.size() <= 0) && (this.bRt.size() <= 0))
    {
      ab.i("MicroMsg.DefaultTencentLocationManager", "releaseLocationManager");
      yg().removeUpdates(null);
    }
    AppMethodBeat.o(51143);
  }

  public final void a(String paramString, a.b paramb, Bundle paramBundle)
  {
    AppMethodBeat.i(51140);
    if ("wgs84".equals(paramString))
      this.bRq.add(paramb);
    while (true)
    {
      m.aNS().doN().removeCallbacks(this.bRw);
      m.aNS().m(this.bRw, 20000L);
      boolean bool = paramBundle.getBoolean("enableIndoor");
      paramString = TencentLocationRequest.create();
      paramString.setInterval(2000L);
      paramString.setIndoorLocationMode(bool);
      paramString.setSmallAppKey(paramBundle.getString("smallAppKey"));
      int i = yg().requestSingleFreshLocation(paramString, this.bRu, m.aNS().oAl.getLooper());
      ab.d("MicroMsg.DefaultTencentLocationManager", "MapReport:%s getLocation", new Object[] { paramBundle.getString("smallAppKey") });
      ab.i("MicroMsg.DefaultTencentLocationManager", "requestCode %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(51140);
      return;
      this.bRr.add(paramb);
    }
  }

  public final boolean b(String paramString, a.b paramb, Bundle paramBundle)
  {
    while (true)
    {
      a.b localb;
      try
      {
        AppMethodBeat.i(51141);
        ab.i("MicroMsg.DefaultTencentLocationManager", "[registerLocation]type:%s", new Object[] { paramString });
        if ("wgs84".equals(paramString))
        {
          paramString = this.bRs.iterator();
          if (paramString.hasNext())
          {
            localb = (a.b)paramString.next();
            if ((localb == null) || (!localb.equals(paramb)))
              continue;
            ab.w("MicroMsg.DefaultTencentLocationManager", "already register");
            AppMethodBeat.o(51141);
            return false;
          }
          this.bRs.add(paramb);
          if (paramBundle != null)
          {
            paramString = paramBundle.getString("smallAppKey");
            if (!bo.isNullOrNil(paramString))
              this.bRv.add(paramString);
          }
          if ((paramBundle == null) || (!paramBundle.getBoolean("enableIndoor")))
            break label342;
          bool = true;
          if (this.bRs.size() + this.bRt.size() != 1)
            break label348;
          i = 1;
          if ((i == 0) && (!bool))
            break label429;
          paramBundle = TencentLocationRequest.create();
          paramBundle.setIndoorLocationMode(bool);
          if (!bool)
            break label354;
          l = 1000L;
          paramBundle.setInterval(l);
          paramb = new java/lang/StringBuilder;
          paramb.<init>();
          paramString = this.bRv.iterator();
          if (!paramString.hasNext())
            break label362;
          paramb.append((String)paramString.next());
          continue;
        }
      }
      finally
      {
      }
      paramString = this.bRt.iterator();
      while (true)
        if (paramString.hasNext())
        {
          localb = (a.b)paramString.next();
          if ((localb != null) && (localb.equals(paramb)))
          {
            ab.w("MicroMsg.DefaultTencentLocationManager", "already register");
            AppMethodBeat.o(51141);
            break;
          }
        }
      this.bRt.add(paramb);
      continue;
      label342: boolean bool = false;
      continue;
      label348: int i = 0;
      continue;
      label354: long l = 2000L;
      continue;
      label362: ab.d("MicroMsg.DefaultTencentLocationManager", "MapReport reportMsg:%s", new Object[] { paramb.toString() });
      paramBundle.setSmallAppKey(paramb.toString());
      ab.i("MicroMsg.DefaultTencentLocationManager", "requestCode %d", new Object[] { Integer.valueOf(yg().requestLocationUpdates(paramBundle, this.bRu, m.aNS().oAl.getLooper())) });
      label429: AppMethodBeat.o(51141);
    }
  }

  public final boolean c(String paramString, a.b paramb, Bundle paramBundle)
  {
    try
    {
      AppMethodBeat.i(51142);
      ab.i("MicroMsg.DefaultTencentLocationManager", "[unregisterLocation]type:%s", new Object[] { paramString });
      if ("wgs84".equals(paramString))
        this.bRs.remove(paramb);
      while (true)
      {
        if (paramBundle != null)
        {
          paramString = paramBundle.getString("smallAppKey");
          this.bRv.remove(paramString);
        }
        yi();
        AppMethodBeat.o(51142);
        return false;
        this.bRt.remove(paramb);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  protected boolean yh()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.f.a.a
 * JD-Core Version:    0.6.2
 */