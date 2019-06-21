package com.tencent.map.geolocation.internal;

import android.content.Context;
import android.location.Location;
import c.t.m.c.f;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;

public class TencentExtraKeys
{
  public static final boolean ALLOW_NLP_LOCATION = true;
  public static final boolean DIDI_INTERNAL = false;
  public static final String LOCATION_KEY_ADMIN_LEVEL1 = "admin_level_1";
  public static final String LOCATION_KEY_ADMIN_LEVEL2 = "admin_level_2";
  public static final String LOCATION_KEY_ADMIN_LEVEL3 = "admin_level_3";
  public static final String LOCATION_KEY_LOCALITY = "locality";
  public static final String LOCATION_KEY_NATION = "nation";
  public static final String LOCATION_KEY_ROUTE = "route";
  public static final String LOCATION_KEY_SUBLOCALITY = "sublocality";
  public static final String LOCATION_SOURCE_CELL = "cell";
  public static final String LOCATION_SOURCE_GPS = "gps";
  public static final String LOCATION_SOURCE_WIFI = "wifi";
  public static final String RAW_DATA = "raw_data";
  public static final String REQUEST_RAW_DATA = "request_raw_data";
  public static final boolean STRICT_CELL_FILTER = true;
  private static final String TAG = "TencentExtraKeys";
  public static final boolean TENCENT_INTERNAL = true;
  private static Context mContext;
  private static DexClassLoader mLoader;
  private static Object mProxyObj;
  private static Class mProxyclass;

  public static void enableMockLocationFilter(boolean paramBoolean)
  {
    AppMethodBeat.i(136436);
    try
    {
      if (!initProxy())
      {
        Exception localException1 = new java/lang/Exception;
        localException1.<init>("proxy is error");
        AppMethodBeat.o(136436);
        throw localException1;
      }
    }
    catch (Throwable localThrowable)
    {
      Exception localException2 = new Exception(localThrowable.toString());
      AppMethodBeat.o(136436);
      throw localException2;
    }
    mProxyclass.getDeclaredMethod("enableMockLocationFilter", new Class[] { Boolean.TYPE }).invoke(mProxyObj, new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(136436);
  }

  public static String getLocationSource(TencentLocation paramTencentLocation)
  {
    AppMethodBeat.i(136447);
    try
    {
      if (!initProxy())
      {
        paramTencentLocation = new java/lang/Exception;
        paramTencentLocation.<init>("proxy is error");
        AppMethodBeat.o(136447);
        throw paramTencentLocation;
      }
    }
    catch (Throwable paramTencentLocation)
    {
      paramTencentLocation = new Exception(paramTencentLocation.toString());
      AppMethodBeat.o(136447);
      throw paramTencentLocation;
    }
    paramTencentLocation = (String)mProxyclass.getDeclaredMethod("getLocationSource", new Class[] { TencentLocation.class }).invoke(mProxyObj, new Object[] { paramTencentLocation });
    AppMethodBeat.o(136447);
    return paramTencentLocation;
  }

  public static File getLogDir()
  {
    try
    {
      AppMethodBeat.i(136453);
      try
      {
        if (!initProxy())
        {
          Exception localException1 = new java/lang/Exception;
          localException1.<init>("proxy is error");
          AppMethodBeat.o(136453);
          throw localException1;
        }
      }
      catch (Throwable localThrowable)
      {
        Exception localException2 = new java/lang/Exception;
        localException2.<init>(localThrowable.toString());
        AppMethodBeat.o(136453);
        throw localException2;
      }
    }
    finally
    {
    }
    File localFile = (File)mProxyclass.getDeclaredMethod("getLogDir", new Class[0]).invoke(mProxyObj, new Object[0]);
    AppMethodBeat.o(136453);
    return localFile;
  }

  public static byte[] getRawData(TencentLocation paramTencentLocation)
  {
    AppMethodBeat.i(136437);
    try
    {
      if (!initProxy())
      {
        paramTencentLocation = new java/lang/Exception;
        paramTencentLocation.<init>("proxy is error");
        AppMethodBeat.o(136437);
        throw paramTencentLocation;
      }
    }
    catch (Throwable paramTencentLocation)
    {
      paramTencentLocation = new Exception(paramTencentLocation.toString());
      AppMethodBeat.o(136437);
      throw paramTencentLocation;
    }
    paramTencentLocation = (byte[])mProxyclass.getDeclaredMethod("getRawData", new Class[] { TencentLocation.class }).invoke(mProxyObj, new Object[] { paramTencentLocation });
    AppMethodBeat.o(136437);
    return paramTencentLocation;
  }

  public static Location getRawGps(TencentLocation paramTencentLocation)
  {
    AppMethodBeat.i(136441);
    try
    {
      if (!initProxy())
      {
        paramTencentLocation = new java/lang/Exception;
        paramTencentLocation.<init>("proxy is error");
        AppMethodBeat.o(136441);
        throw paramTencentLocation;
      }
    }
    catch (Throwable paramTencentLocation)
    {
      paramTencentLocation = new Exception(paramTencentLocation.toString());
      AppMethodBeat.o(136441);
      throw paramTencentLocation;
    }
    paramTencentLocation = (Location)mProxyclass.getDeclaredMethod("getRawGps", new Class[] { TencentLocation.class }).invoke(mProxyObj, new Object[] { paramTencentLocation });
    AppMethodBeat.o(136441);
    return paramTencentLocation;
  }

  public static String getRawQuery(TencentLocation paramTencentLocation)
  {
    AppMethodBeat.i(136439);
    try
    {
      if (!initProxy())
      {
        paramTencentLocation = new java/lang/Exception;
        paramTencentLocation.<init>("proxy is error");
        AppMethodBeat.o(136439);
        throw paramTencentLocation;
      }
    }
    catch (Throwable paramTencentLocation)
    {
      paramTencentLocation = new Exception(paramTencentLocation.toString());
      AppMethodBeat.o(136439);
      throw paramTencentLocation;
    }
    paramTencentLocation = (String)mProxyclass.getDeclaredMethod("getRawQuery", new Class[] { TencentLocation.class }).invoke(mProxyObj, new Object[] { paramTencentLocation });
    AppMethodBeat.o(136439);
    return paramTencentLocation;
  }

  private static boolean initProxy()
  {
    boolean bool = false;
    AppMethodBeat.i(136435);
    try
    {
      Object localObject = mContext;
      if (localObject == null)
        AppMethodBeat.o(136435);
      while (true)
      {
        return bool;
        localObject = f.a(mContext).a();
        if (localObject == null)
        {
          AppMethodBeat.o(136435);
        }
        else
        {
          if ((mProxyclass == null) || (mProxyObj == null))
          {
            localObject = ((DexClassLoader)localObject).loadClass("com.tencent.map.geolocation.proxy.TencentExtraKeysProxy");
            mProxyclass = (Class)localObject;
            mProxyObj = ((Class)localObject).newInstance();
          }
          bool = true;
          AppMethodBeat.o(136435);
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(136435);
    }
  }

  public static boolean isAllowedLevel(int paramInt)
  {
    AppMethodBeat.i(136445);
    try
    {
      if (!initProxy())
      {
        Exception localException1 = new java/lang/Exception;
        localException1.<init>("proxy is error");
        AppMethodBeat.o(136445);
        throw localException1;
      }
    }
    catch (Throwable localThrowable)
    {
      Exception localException2 = new Exception(localThrowable.toString());
      AppMethodBeat.o(136445);
      throw localException2;
    }
    boolean bool = ((Boolean)mProxyclass.getDeclaredMethod("isAllowedLevel", new Class[] { Integer.TYPE }).invoke(mProxyObj, new Object[] { Integer.valueOf(paramInt) })).booleanValue();
    AppMethodBeat.o(136445);
    return bool;
  }

  @Deprecated
  public static boolean isDebugEnabled()
  {
    try
    {
      AppMethodBeat.i(136451);
      try
      {
        if (!initProxy())
        {
          Exception localException1 = new java/lang/Exception;
          localException1.<init>("proxy is error");
          AppMethodBeat.o(136451);
          throw localException1;
        }
      }
      catch (Throwable localThrowable)
      {
        Exception localException2 = new java/lang/Exception;
        localException2.<init>(localThrowable.toString());
        AppMethodBeat.o(136451);
        throw localException2;
      }
    }
    finally
    {
    }
    boolean bool = ((Boolean)mProxyclass.getDeclaredMethod("isDebugEnabled", new Class[0]).invoke(mProxyObj, new Object[0])).booleanValue();
    AppMethodBeat.o(136451);
    return bool;
  }

  public static int isInsIllegalApp(Context paramContext)
  {
    AppMethodBeat.i(136446);
    try
    {
      mContext = paramContext;
      if (!initProxy())
      {
        paramContext = new java/lang/Exception;
        paramContext.<init>("proxy is error");
        AppMethodBeat.o(136446);
        throw paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      paramContext = new Exception(paramContext.toString());
      AppMethodBeat.o(136446);
      throw paramContext;
    }
    int i = ((Integer)mProxyclass.getDeclaredMethod("isInsIllegalApp", new Class[] { Context.class }).invoke(mProxyObj, new Object[] { paramContext })).intValue();
    AppMethodBeat.o(136446);
    return i;
  }

  public static boolean isRequestRawData(TencentLocationRequest paramTencentLocationRequest)
  {
    AppMethodBeat.i(136444);
    try
    {
      if (!initProxy())
      {
        paramTencentLocationRequest = new java/lang/Exception;
        paramTencentLocationRequest.<init>("proxy is error");
        AppMethodBeat.o(136444);
        throw paramTencentLocationRequest;
      }
    }
    catch (Throwable paramTencentLocationRequest)
    {
      paramTencentLocationRequest = new Exception(paramTencentLocationRequest.toString());
      AppMethodBeat.o(136444);
      throw paramTencentLocationRequest;
    }
    boolean bool = ((Boolean)mProxyclass.getDeclaredMethod("isRequestRawData", new Class[] { TencentLocationRequest.class }).invoke(mProxyObj, new Object[] { paramTencentLocationRequest })).booleanValue();
    AppMethodBeat.o(136444);
    return bool;
  }

  public static void loadLibrary(String paramString)
  {
    AppMethodBeat.i(136448);
    try
    {
      System.load(paramString);
      AppMethodBeat.o(136448);
      return;
    }
    catch (Throwable paramString)
    {
      paramString = new Exception(paramString.toString());
      AppMethodBeat.o(136448);
    }
    throw paramString;
  }

  public static void setContext(Context paramContext)
  {
    mContext = paramContext;
  }

  public static void setLogDir(File paramFile)
  {
    try
    {
      AppMethodBeat.i(136452);
      try
      {
        if (!initProxy())
        {
          paramFile = new java/lang/Exception;
          paramFile.<init>("proxy is error");
          AppMethodBeat.o(136452);
          throw paramFile;
        }
      }
      catch (Throwable localThrowable)
      {
        paramFile = new java/lang/Exception;
        paramFile.<init>(localThrowable.toString());
        AppMethodBeat.o(136452);
        throw paramFile;
      }
    }
    finally
    {
    }
    mProxyclass.getDeclaredMethod("setLogDir", new Class[] { File.class }).invoke(mProxyObj, new Object[] { paramFile });
    AppMethodBeat.o(136452);
  }

  public static TencentLocation setRawData(TencentLocation paramTencentLocation, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(136438);
    try
    {
      if (!initProxy())
      {
        paramTencentLocation = new java/lang/Exception;
        paramTencentLocation.<init>("proxy is error");
        AppMethodBeat.o(136438);
        throw paramTencentLocation;
      }
    }
    catch (Throwable paramTencentLocation)
    {
      paramTencentLocation = new Exception(paramTencentLocation.toString());
      AppMethodBeat.o(136438);
      throw paramTencentLocation;
    }
    paramTencentLocation = (TencentLocation)mProxyclass.getDeclaredMethod("setRawData", new Class[] { TencentLocation.class, [B.class }).invoke(mProxyObj, new Object[] { paramTencentLocation, paramArrayOfByte });
    AppMethodBeat.o(136438);
    return paramTencentLocation;
  }

  public static void setRawGps(TencentLocation paramTencentLocation, Location paramLocation)
  {
    AppMethodBeat.i(136442);
    try
    {
      if (!initProxy())
      {
        paramTencentLocation = new java/lang/Exception;
        paramTencentLocation.<init>("proxy is error");
        AppMethodBeat.o(136442);
        throw paramTencentLocation;
      }
    }
    catch (Throwable paramTencentLocation)
    {
      paramTencentLocation = new Exception(paramTencentLocation.toString());
      AppMethodBeat.o(136442);
      throw paramTencentLocation;
    }
    mProxyclass.getDeclaredMethod("setRawGps", new Class[] { TencentLocation.class, Location.class }).invoke(mProxyObj, new Object[] { paramTencentLocation, paramLocation });
    AppMethodBeat.o(136442);
  }

  public static void setRawQuery(TencentLocation paramTencentLocation, String paramString)
  {
    AppMethodBeat.i(136440);
    try
    {
      if (!initProxy())
      {
        paramTencentLocation = new java/lang/Exception;
        paramTencentLocation.<init>("proxy is error");
        AppMethodBeat.o(136440);
        throw paramTencentLocation;
      }
    }
    catch (Throwable paramTencentLocation)
    {
      paramTencentLocation = new Exception(paramTencentLocation.toString());
      AppMethodBeat.o(136440);
      throw paramTencentLocation;
    }
    mProxyclass.getDeclaredMethod("setRawQuery", new Class[] { TencentLocation.class, String.class }).invoke(mProxyObj, new Object[] { paramTencentLocation, paramString });
    AppMethodBeat.o(136440);
  }

  public static TencentLocationRequest setRequestRawData(TencentLocationRequest paramTencentLocationRequest, boolean paramBoolean)
  {
    AppMethodBeat.i(136443);
    try
    {
      if (!initProxy())
      {
        paramTencentLocationRequest = new java/lang/Exception;
        paramTencentLocationRequest.<init>("proxy is error");
        AppMethodBeat.o(136443);
        throw paramTencentLocationRequest;
      }
    }
    catch (Throwable paramTencentLocationRequest)
    {
      paramTencentLocationRequest = new Exception(paramTencentLocationRequest.toString());
      AppMethodBeat.o(136443);
      throw paramTencentLocationRequest;
    }
    paramTencentLocationRequest = (TencentLocationRequest)mProxyclass.getDeclaredMethod("setRequestRawData", new Class[] { TencentLocationRequest.class, Boolean.TYPE }).invoke(mProxyObj, new Object[] { paramTencentLocationRequest, Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(136443);
    return paramTencentLocationRequest;
  }

  public static void setTencentLog(Context paramContext, File paramFile)
  {
    AppMethodBeat.i(136449);
    try
    {
      mContext = paramContext;
      if (!initProxy())
      {
        paramContext = new java/lang/Exception;
        paramContext.<init>("proxy is error");
        AppMethodBeat.o(136449);
        throw paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      paramContext = new Exception(paramContext.toString());
      AppMethodBeat.o(136449);
      throw paramContext;
    }
    mProxyclass.getDeclaredMethod("setTencentLog", new Class[] { Context.class, File.class }).invoke(mProxyObj, new Object[] { paramContext, paramFile });
    AppMethodBeat.o(136449);
  }

  public static void setTencentLogCallback(LocationLogCallback paramLocationLogCallback)
  {
    AppMethodBeat.i(136450);
    try
    {
      if (!initProxy())
      {
        paramLocationLogCallback = new java/lang/Exception;
        paramLocationLogCallback.<init>("proxy is error");
        AppMethodBeat.o(136450);
        throw paramLocationLogCallback;
      }
    }
    catch (Throwable paramLocationLogCallback)
    {
      paramLocationLogCallback = new Exception(paramLocationLogCallback.toString());
      AppMethodBeat.o(136450);
      throw paramLocationLogCallback;
    }
    mProxyclass.getDeclaredMethod("setTencentLogCallback", new Class[] { LocationLogCallback.class }).invoke(mProxyObj, new Object[] { paramLocationLogCallback });
    AppMethodBeat.o(136450);
  }

  // ERROR //
  public static boolean wgs84ToGcj02(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 248
    //   4: invokestatic 75	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 253	com/tencent/map/geolocation/TencentLocationManagerOptions:isLoadLibraryEnabled	()Z
    //   10: istore_3
    //   11: iload_3
    //   12: ifeq +8 -> 20
    //   15: ldc 255
    //   17: invokestatic 257	java/lang/System:loadLibrary	(Ljava/lang/String;)V
    //   20: invokestatic 79	com/tencent/map/geolocation/internal/TencentExtraKeys:initProxy	()Z
    //   23: ifne +68 -> 91
    //   26: new 81	java/lang/Exception
    //   29: astore_0
    //   30: aload_0
    //   31: ldc 83
    //   33: invokespecial 86	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   36: ldc 248
    //   38: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: aload_0
    //   42: athrow
    //   43: astore_0
    //   44: new 81	java/lang/Exception
    //   47: dup
    //   48: aload_0
    //   49: invokevirtual 93	java/lang/Throwable:toString	()Ljava/lang/String;
    //   52: invokespecial 86	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   55: astore_0
    //   56: ldc 248
    //   58: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: aload_0
    //   62: athrow
    //   63: astore_1
    //   64: new 259	java/lang/StringBuilder
    //   67: astore_0
    //   68: aload_0
    //   69: ldc_w 261
    //   72: invokespecial 262	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: aload_0
    //   76: aload_1
    //   77: invokevirtual 93	java/lang/Throwable:toString	()Ljava/lang/String;
    //   80: invokevirtual 266	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: ldc 248
    //   86: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: iload_2
    //   90: ireturn
    //   91: getstatic 95	com/tencent/map/geolocation/internal/TencentExtraKeys:mProxyclass	Ljava/lang/Class;
    //   94: ldc_w 267
    //   97: iconst_2
    //   98: anewarray 98	java/lang/Class
    //   101: dup
    //   102: iconst_0
    //   103: ldc_w 269
    //   106: aastore
    //   107: dup
    //   108: iconst_1
    //   109: ldc_w 269
    //   112: aastore
    //   113: invokevirtual 107	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   116: getstatic 109	com/tencent/map/geolocation/internal/TencentExtraKeys:mProxyObj	Ljava/lang/Object;
    //   119: iconst_2
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: aload_0
    //   126: aastore
    //   127: dup
    //   128: iconst_1
    //   129: aload_1
    //   130: aastore
    //   131: invokevirtual 119	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   134: checkcast 100	java/lang/Boolean
    //   137: invokevirtual 185	java/lang/Boolean:booleanValue	()Z
    //   140: istore_2
    //   141: ldc 248
    //   143: invokestatic 89	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: goto -57 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   7	11	43	java/lang/Throwable
    //   20	43	43	java/lang/Throwable
    //   64	84	43	java/lang/Throwable
    //   91	141	43	java/lang/Throwable
    //   15	20	63	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.map.geolocation.internal.TencentExtraKeys
 * JD-Core Version:    0.6.2
 */