package com.tencent.map.geolocation;

import android.content.Context;
import android.os.Looper;
import c.t.m.c.e;
import c.t.m.c.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class TencentLocationManager
{
  public static final int COORDINATE_TYPE_GCJ02 = 1;
  public static final int COORDINATE_TYPE_WGS84 = 0;
  private static TencentLocationManager b;
  private static Class c;
  private static Object d;
  private final byte[] a;
  private int e;
  private Context f;

  private TencentLocationManager(Context paramContext)
  {
    AppMethodBeat.i(136455);
    this.a = new byte[0];
    this.e = 0;
    if (TencentLocationManagerOptions.isLoadLibraryEnabled());
    try
    {
      System.loadLibrary("tencentloc");
      this.f = paramContext;
      localObject = f.a(paramContext);
    }
    catch (Throwable paramContext)
    {
      try
      {
        Object localObject = ((f)localObject).a();
        if (localObject == null)
        {
          e.a().a("LMI", "41");
          this.e = 4;
          AppMethodBeat.o(136455);
        }
        while (true)
        {
          return;
          paramContext = paramContext;
          this.e = 3;
          AppMethodBeat.o(136455);
          continue;
          localObject = ((DexClassLoader)localObject).loadClass("com.tencent.map.geolocation.proxy.TencentLocationManagerProxy");
          c = (Class)localObject;
          paramContext = ((Class)localObject).getConstructor(new Class[] { Context.class }).newInstance(new Object[] { paramContext });
          d = paramContext;
          if (paramContext == null)
          {
            this.e = 4;
            e.a().a("LMI", "42");
            AppMethodBeat.o(136455);
          }
          else
          {
            e.a().a("LMI", "0");
            AppMethodBeat.o(136455);
          }
        }
      }
      catch (Throwable paramContext)
      {
        while (true)
        {
          this.e = 5;
          e.a().a("LMI", "5" + paramContext.toString());
          AppMethodBeat.o(136455);
        }
      }
    }
  }

  public static TencentLocationManager getInstance(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(136456);
      if (b != null)
        break label85;
      if (paramContext == null)
      {
        paramContext = new java/lang/NullPointerException;
        paramContext.<init>("context is null");
        AppMethodBeat.o(136456);
        throw paramContext;
      }
    }
    finally
    {
    }
    if (paramContext.getApplicationContext() == null)
    {
      paramContext = new java/lang/NullPointerException;
      paramContext.<init>("application context is null");
      AppMethodBeat.o(136456);
      throw paramContext;
    }
    System.currentTimeMillis();
    TencentLocationManager localTencentLocationManager = new com/tencent/map/geolocation/TencentLocationManager;
    localTencentLocationManager.<init>(paramContext.getApplicationContext());
    b = localTencentLocationManager;
    label85: paramContext = b;
    AppMethodBeat.o(136456);
    return paramContext;
  }

  public final String getBuild()
  {
    AppMethodBeat.i(136466);
    try
    {
      String str1 = (String)c.getDeclaredMethod("getBuild", new Class[0]).invoke(d, new Object[0]);
      AppMethodBeat.o(136466);
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        String str2 = "error";
        AppMethodBeat.o(136466);
      }
    }
  }

  public final int getCoordinateType()
  {
    AppMethodBeat.i(136458);
    try
    {
      i = ((Integer)c.getDeclaredMethod("getCoordinateType", new Class[0]).invoke(d, new Object[0])).intValue();
      AppMethodBeat.o(136458);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        int i = -1;
        AppMethodBeat.o(136458);
      }
    }
  }

  public final TencentLocation getLastKnownLocation()
  {
    AppMethodBeat.i(136464);
    try
    {
      TencentLocation localTencentLocation = (TencentLocation)c.getDeclaredMethod("getLastKnownLocation", new Class[0]).invoke(d, new Object[0]);
      AppMethodBeat.o(136464);
      return localTencentLocation;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        Object localObject = null;
        AppMethodBeat.o(136464);
      }
    }
  }

  public final String getVersion()
  {
    AppMethodBeat.i(136467);
    try
    {
      String str1 = (String)c.getDeclaredMethod("getVersion", new Class[0]).invoke(d, new Object[0]);
      AppMethodBeat.o(136467);
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        String str2 = "error";
        AppMethodBeat.o(136467);
      }
    }
  }

  public final void removeUpdates(TencentLocationListener paramTencentLocationListener)
  {
    AppMethodBeat.i(136465);
    try
    {
      synchronized (this.a)
      {
        c.getDeclaredMethod("removeUpdates", new Class[] { TencentLocationListener.class }).invoke(d, new Object[] { paramTencentLocationListener });
        e.a().c();
        label50: AppMethodBeat.o(136465);
        return;
      }
    }
    catch (Throwable paramTencentLocationListener)
    {
      break label50;
    }
  }

  public final int requestLocationUpdates(TencentLocationRequest paramTencentLocationRequest, TencentLocationListener paramTencentLocationListener)
  {
    AppMethodBeat.i(136459);
    int i;
    if (this.e > 0)
    {
      i = this.e;
      AppMethodBeat.o(136459);
    }
    while (true)
    {
      return i;
      try
      {
        i = ((Integer)c.getDeclaredMethod("requestLocationUpdates", new Class[] { TencentLocationRequest.class, TencentLocationListener.class }).invoke(d, new Object[] { paramTencentLocationRequest, paramTencentLocationListener })).intValue();
        AppMethodBeat.o(136459);
      }
      catch (Throwable paramTencentLocationRequest)
      {
        i = 5;
        AppMethodBeat.o(136459);
      }
    }
  }

  public final int requestLocationUpdates(TencentLocationRequest paramTencentLocationRequest, TencentLocationListener paramTencentLocationListener, Looper paramLooper)
  {
    AppMethodBeat.i(136460);
    System.currentTimeMillis();
    if (paramTencentLocationRequest == null)
    {
      paramTencentLocationRequest = new NullPointerException("request is null");
      AppMethodBeat.o(136460);
      throw paramTencentLocationRequest;
    }
    if (paramTencentLocationListener == null)
    {
      paramTencentLocationRequest = new NullPointerException("listener is null");
      AppMethodBeat.o(136460);
      throw paramTencentLocationRequest;
    }
    if (paramLooper == null)
    {
      paramTencentLocationRequest = new NullPointerException("looper is null");
      AppMethodBeat.o(136460);
      throw paramTencentLocationRequest;
    }
    int i;
    if (this.e > 0)
    {
      i = this.e;
      AppMethodBeat.o(136460);
    }
    while (true)
    {
      return i;
      synchronized (this.a)
      {
        try
        {
          paramTencentLocationRequest = (Integer)c.getDeclaredMethod("requestLocationUpdates", new Class[] { TencentLocationRequest.class, TencentLocationListener.class, Looper.class }).invoke(d, new Object[] { paramTencentLocationRequest, paramTencentLocationListener, paramLooper });
          e.a().a("RLU", paramTencentLocationRequest.toString());
          i = paramTencentLocationRequest.intValue();
          AppMethodBeat.o(136460);
        }
        catch (Throwable paramTencentLocationRequest)
        {
          paramTencentLocationListener = e.a();
          paramLooper = new java/lang/StringBuilder;
          paramLooper.<init>("5,");
          paramTencentLocationListener.a("RLU", paramTencentLocationRequest.toString());
          i = 5;
          AppMethodBeat.o(136460);
        }
      }
    }
  }

  public final int requestSingleFreshLocation(TencentLocationRequest paramTencentLocationRequest, TencentLocationListener paramTencentLocationListener, Looper paramLooper)
  {
    AppMethodBeat.i(136461);
    if (paramTencentLocationListener == null)
    {
      paramTencentLocationRequest = new NullPointerException("listener is null");
      AppMethodBeat.o(136461);
      throw paramTencentLocationRequest;
    }
    if (paramLooper == null)
    {
      paramTencentLocationRequest = new NullPointerException("looper is null");
      AppMethodBeat.o(136461);
      throw paramTencentLocationRequest;
    }
    int i;
    if (this.e > 0)
    {
      i = this.e;
      AppMethodBeat.o(136461);
    }
    while (true)
    {
      return i;
      synchronized (this.a)
      {
        try
        {
          i = ((Integer)c.getDeclaredMethod("requestSingleFreshLocation", new Class[] { TencentLocationRequest.class, TencentLocationListener.class, Looper.class }).invoke(d, new Object[] { paramTencentLocationRequest, paramTencentLocationListener, paramLooper })).intValue();
          AppMethodBeat.o(136461);
        }
        catch (Throwable paramTencentLocationRequest)
        {
          i = 5;
          AppMethodBeat.o(136461);
        }
      }
    }
  }

  // ERROR //
  public final void setCoordinateType(int paramInt)
  {
    // Byte code:
    //   0: ldc 216
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iload_1
    //   6: iconst_1
    //   7: if_icmpeq +7 -> 14
    //   10: iload_1
    //   11: ifne +73 -> 84
    //   14: aload_0
    //   15: getfield 36	com/tencent/map/geolocation/TencentLocationManager:a	[B
    //   18: astore_2
    //   19: aload_2
    //   20: monitorenter
    //   21: getstatic 87	com/tencent/map/geolocation/TencentLocationManager:c	Ljava/lang/Class;
    //   24: ldc 217
    //   26: iconst_1
    //   27: anewarray 89	java/lang/Class
    //   30: dup
    //   31: iconst_0
    //   32: getstatic 220	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   35: aastore
    //   36: invokevirtual 152	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   39: getstatic 103	com/tencent/map/geolocation/TencentLocationManager:d	Ljava/lang/Object;
    //   42: iconst_1
    //   43: anewarray 4	java/lang/Object
    //   46: dup
    //   47: iconst_0
    //   48: iload_1
    //   49: invokestatic 224	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   52: aastore
    //   53: invokevirtual 158	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   56: pop
    //   57: aload_2
    //   58: monitorexit
    //   59: ldc 216
    //   61: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: return
    //   65: astore_3
    //   66: aload_2
    //   67: monitorexit
    //   68: ldc 216
    //   70: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: aload_3
    //   74: athrow
    //   75: astore_2
    //   76: ldc 216
    //   78: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: goto -17 -> 64
    //   84: new 226	java/lang/IllegalArgumentException
    //   87: astore_2
    //   88: aload_2
    //   89: ldc 228
    //   91: iload_1
    //   92: invokestatic 231	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   95: invokevirtual 235	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   98: invokespecial 236	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   101: ldc 216
    //   103: invokestatic 77	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: aload_2
    //   107: athrow
    //   108: astore_3
    //   109: goto -52 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   21	57	65	finally
    //   57	59	65	finally
    //   66	68	65	finally
    //   14	21	75	java/lang/Exception
    //   59	64	75	java/lang/Exception
    //   68	75	75	java/lang/Exception
    //   84	108	75	java/lang/Exception
    //   21	57	108	java/lang/Throwable
  }

  public final boolean startIndoorLocation()
  {
    AppMethodBeat.i(136462);
    try
    {
      bool = ((Boolean)c.getDeclaredMethod("startIndoorLocation", new Class[0]).invoke(d, new Object[0])).booleanValue();
      AppMethodBeat.o(136462);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        AppMethodBeat.o(136462);
        boolean bool = false;
      }
    }
  }

  public final boolean stopIndoorLocation()
  {
    AppMethodBeat.i(136463);
    try
    {
      bool = ((Boolean)c.getDeclaredMethod("stopIndoorLocation", new Class[0]).invoke(d, new Object[0])).booleanValue();
      AppMethodBeat.o(136463);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        AppMethodBeat.o(136463);
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.map.geolocation.TencentLocationManager
 * JD-Core Version:    0.6.2
 */