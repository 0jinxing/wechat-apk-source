package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.facebook.FacebookException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

public class AttributionIdentifiers
{
  private static final String ANDROID_ID_COLUMN_NAME = "androidid";
  private static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
  private static final String ATTRIBUTION_ID_CONTENT_PROVIDER = "com.facebook.katana.provider.AttributionIdProvider";
  private static final String ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI = "com.facebook.wakizashi.provider.AttributionIdProvider";
  private static final int CONNECTION_RESULT_SUCCESS = 0;
  private static final long IDENTIFIER_REFRESH_INTERVAL_MILLIS = 3600000L;
  private static final String LIMIT_TRACKING_COLUMN_NAME = "limit_tracking";
  private static final String TAG;
  private static AttributionIdentifiers recentlyFetchedIdentifiers;
  private String androidAdvertiserId;
  private String androidInstallerPackage;
  private String attributionId;
  private long fetchTime;
  private boolean limitTracking;

  static
  {
    AppMethodBeat.i(72243);
    TAG = AttributionIdentifiers.class.getCanonicalName();
    AppMethodBeat.o(72243);
  }

  private static AttributionIdentifiers cacheAndReturnIdentifiers(AttributionIdentifiers paramAttributionIdentifiers)
  {
    AppMethodBeat.i(72241);
    paramAttributionIdentifiers.fetchTime = System.currentTimeMillis();
    recentlyFetchedIdentifiers = paramAttributionIdentifiers;
    AppMethodBeat.o(72241);
    return paramAttributionIdentifiers;
  }

  private static AttributionIdentifiers getAndroidId(Context paramContext)
  {
    AppMethodBeat.i(72237);
    AttributionIdentifiers localAttributionIdentifiers = getAndroidIdViaReflection(paramContext);
    Object localObject = localAttributionIdentifiers;
    if (localAttributionIdentifiers == null)
    {
      paramContext = getAndroidIdViaService(paramContext);
      localObject = paramContext;
      if (paramContext == null)
        localObject = new AttributionIdentifiers();
    }
    AppMethodBeat.o(72237);
    return localObject;
  }

  private static AttributionIdentifiers getAndroidIdViaReflection(Context paramContext)
  {
    AppMethodBeat.i(72238);
    try
    {
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        paramContext = new com/facebook/FacebookException;
        paramContext.<init>("getAndroidId cannot be called on the main thread.");
        AppMethodBeat.o(72238);
        throw paramContext;
      }
    }
    catch (Exception paramContext)
    {
      Utility.logd("android_id", paramContext);
      AppMethodBeat.o(72238);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      Object localObject1 = Utility.getMethodQuietly("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] { Context.class });
      if (localObject1 == null)
      {
        AppMethodBeat.o(72238);
        paramContext = null;
      }
      else
      {
        localObject1 = Utility.invokeMethodQuietly(null, (Method)localObject1, new Object[] { paramContext });
        if ((localObject1 instanceof Integer))
        {
          int i = ((Integer)localObject1).intValue();
          if (i == 0);
        }
        else
        {
          AppMethodBeat.o(72238);
          paramContext = null;
          continue;
        }
        localObject1 = Utility.getMethodQuietly("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] { Context.class });
        if (localObject1 == null)
        {
          AppMethodBeat.o(72238);
          paramContext = null;
        }
        else
        {
          Object localObject2 = Utility.invokeMethodQuietly(null, (Method)localObject1, new Object[] { paramContext });
          if (localObject2 == null)
          {
            AppMethodBeat.o(72238);
            paramContext = null;
          }
          else
          {
            localObject1 = Utility.getMethodQuietly(localObject2.getClass(), "getId", new Class[0]);
            Method localMethod = Utility.getMethodQuietly(localObject2.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
            if ((localObject1 == null) || (localMethod == null))
            {
              AppMethodBeat.o(72238);
              paramContext = null;
            }
            else
            {
              paramContext = new com/facebook/internal/AttributionIdentifiers;
              paramContext.<init>();
              paramContext.androidAdvertiserId = ((String)Utility.invokeMethodQuietly(localObject2, (Method)localObject1, new Object[0]));
              paramContext.limitTracking = ((Boolean)Utility.invokeMethodQuietly(localObject2, localMethod, new Object[0])).booleanValue();
              AppMethodBeat.o(72238);
            }
          }
        }
      }
    }
  }

  private static AttributionIdentifiers getAndroidIdViaService(Context paramContext)
  {
    AppMethodBeat.i(72239);
    AttributionIdentifiers.GoogleAdServiceConnection localGoogleAdServiceConnection = new AttributionIdentifiers.GoogleAdServiceConnection(null);
    Object localObject1 = new Intent("com.google.android.gms.ads.identifier.service.START");
    ((Intent)localObject1).setPackage("com.google.android.gms");
    if (paramContext.bindService((Intent)localObject1, localGoogleAdServiceConnection, 1));
    try
    {
      AttributionIdentifiers.GoogleAdInfo localGoogleAdInfo = new com/facebook/internal/AttributionIdentifiers$GoogleAdInfo;
      localGoogleAdInfo.<init>(localGoogleAdServiceConnection.getBinder());
      localObject1 = new com/facebook/internal/AttributionIdentifiers;
      ((AttributionIdentifiers)localObject1).<init>();
      ((AttributionIdentifiers)localObject1).androidAdvertiserId = localGoogleAdInfo.getAdvertiserId();
      ((AttributionIdentifiers)localObject1).limitTracking = localGoogleAdInfo.isTrackingLimited();
      paramContext.unbindService(localGoogleAdServiceConnection);
      AppMethodBeat.o(72239);
      paramContext = (Context)localObject1;
      return paramContext;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Utility.logd("android_id", localException);
        paramContext.unbindService(localGoogleAdServiceConnection);
        AppMethodBeat.o(72239);
        paramContext = null;
      }
    }
    finally
    {
      paramContext.unbindService(localGoogleAdServiceConnection);
      AppMethodBeat.o(72239);
    }
  }

  // ERROR //
  public static AttributionIdentifiers getAttributionIdentifiers(Context paramContext)
  {
    // Byte code:
    //   0: ldc 199
    //   2: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 96	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   8: pop
    //   9: invokestatic 99	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   12: pop
    //   13: getstatic 77	com/facebook/internal/AttributionIdentifiers:recentlyFetchedIdentifiers	Lcom/facebook/internal/AttributionIdentifiers;
    //   16: ifnull +31 -> 47
    //   19: invokestatic 73	java/lang/System:currentTimeMillis	()J
    //   22: getstatic 77	com/facebook/internal/AttributionIdentifiers:recentlyFetchedIdentifiers	Lcom/facebook/internal/AttributionIdentifiers;
    //   25: getfield 75	com/facebook/internal/AttributionIdentifiers:fetchTime	J
    //   28: lsub
    //   29: ldc2_w 27
    //   32: lcmp
    //   33: ifge +14 -> 47
    //   36: getstatic 77	com/facebook/internal/AttributionIdentifiers:recentlyFetchedIdentifiers	Lcom/facebook/internal/AttributionIdentifiers;
    //   39: astore_0
    //   40: ldc 199
    //   42: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   45: aload_0
    //   46: areturn
    //   47: aload_0
    //   48: invokestatic 201	com/facebook/internal/AttributionIdentifiers:getAndroidId	(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;
    //   51: astore_1
    //   52: aload_0
    //   53: invokevirtual 205	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   56: ldc 18
    //   58: iconst_0
    //   59: invokevirtual 211	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   62: ifnull +40 -> 102
    //   65: ldc 213
    //   67: invokestatic 219	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   70: astore_2
    //   71: aload_0
    //   72: invokestatic 223	com/facebook/internal/AttributionIdentifiers:getInstallerPackageName	(Landroid/content/Context;)Ljava/lang/String;
    //   75: astore_3
    //   76: aload_3
    //   77: ifnull +8 -> 85
    //   80: aload_1
    //   81: aload_3
    //   82: putfield 225	com/facebook/internal/AttributionIdentifiers:androidInstallerPackage	Ljava/lang/String;
    //   85: aload_2
    //   86: ifnonnull +38 -> 124
    //   89: aload_1
    //   90: invokestatic 227	com/facebook/internal/AttributionIdentifiers:cacheAndReturnIdentifiers	(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;
    //   93: astore_0
    //   94: ldc 199
    //   96: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   99: goto -54 -> 45
    //   102: aload_0
    //   103: invokevirtual 205	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   106: ldc 21
    //   108: iconst_0
    //   109: invokevirtual 211	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   112: ifnull +299 -> 411
    //   115: ldc 229
    //   117: invokestatic 219	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   120: astore_2
    //   121: goto -50 -> 71
    //   124: aload_0
    //   125: invokevirtual 233	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   128: aload_2
    //   129: iconst_3
    //   130: anewarray 151	java/lang/String
    //   133: dup
    //   134: iconst_0
    //   135: ldc 15
    //   137: aastore
    //   138: dup
    //   139: iconst_1
    //   140: ldc 12
    //   142: aastore
    //   143: dup
    //   144: iconst_2
    //   145: ldc 31
    //   147: aastore
    //   148: aconst_null
    //   149: aconst_null
    //   150: aconst_null
    //   151: invokevirtual 239	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   154: astore_2
    //   155: aload_2
    //   156: ifnull +14 -> 170
    //   159: aload_2
    //   160: astore_0
    //   161: aload_2
    //   162: invokeinterface 244 1 0
    //   167: ifne +30 -> 197
    //   170: aload_2
    //   171: astore_0
    //   172: aload_1
    //   173: invokestatic 227	com/facebook/internal/AttributionIdentifiers:cacheAndReturnIdentifiers	(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;
    //   176: astore_1
    //   177: aload_1
    //   178: astore_0
    //   179: aload_2
    //   180: ifnull +9 -> 189
    //   183: aload_2
    //   184: invokeinterface 247 1 0
    //   189: ldc 199
    //   191: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: goto -149 -> 45
    //   197: aload_2
    //   198: astore_0
    //   199: aload_2
    //   200: ldc 15
    //   202: invokeinterface 251 2 0
    //   207: istore 4
    //   209: aload_2
    //   210: astore_0
    //   211: aload_2
    //   212: ldc 12
    //   214: invokeinterface 251 2 0
    //   219: istore 5
    //   221: aload_2
    //   222: astore_0
    //   223: aload_2
    //   224: ldc 31
    //   226: invokeinterface 251 2 0
    //   231: istore 6
    //   233: aload_2
    //   234: astore_0
    //   235: aload_1
    //   236: aload_2
    //   237: iload 4
    //   239: invokeinterface 255 2 0
    //   244: putfield 257	com/facebook/internal/AttributionIdentifiers:attributionId	Ljava/lang/String;
    //   247: iload 5
    //   249: ifle +48 -> 297
    //   252: iload 6
    //   254: ifle +43 -> 297
    //   257: aload_2
    //   258: astore_0
    //   259: aload_1
    //   260: invokevirtual 260	com/facebook/internal/AttributionIdentifiers:getAndroidAdvertiserId	()Ljava/lang/String;
    //   263: ifnonnull +34 -> 297
    //   266: aload_2
    //   267: astore_0
    //   268: aload_1
    //   269: aload_2
    //   270: iload 5
    //   272: invokeinterface 255 2 0
    //   277: putfield 153	com/facebook/internal/AttributionIdentifiers:androidAdvertiserId	Ljava/lang/String;
    //   280: aload_2
    //   281: astore_0
    //   282: aload_1
    //   283: aload_2
    //   284: iload 6
    //   286: invokeinterface 255 2 0
    //   291: invokestatic 264	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   294: putfield 161	com/facebook/internal/AttributionIdentifiers:limitTracking	Z
    //   297: aload_2
    //   298: ifnull +9 -> 307
    //   301: aload_2
    //   302: invokeinterface 247 1 0
    //   307: aload_1
    //   308: invokestatic 227	com/facebook/internal/AttributionIdentifiers:cacheAndReturnIdentifiers	(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;
    //   311: astore_0
    //   312: ldc 199
    //   314: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   317: goto -272 -> 45
    //   320: astore_1
    //   321: aconst_null
    //   322: astore_2
    //   323: aload_2
    //   324: astore_0
    //   325: getstatic 57	com/facebook/internal/AttributionIdentifiers:TAG	Ljava/lang/String;
    //   328: astore 7
    //   330: aload_2
    //   331: astore_0
    //   332: new 266	java/lang/StringBuilder
    //   335: astore_3
    //   336: aload_2
    //   337: astore_0
    //   338: aload_3
    //   339: ldc_w 268
    //   342: invokespecial 269	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   345: aload_2
    //   346: astore_0
    //   347: aload 7
    //   349: aload_3
    //   350: aload_1
    //   351: invokevirtual 272	java/lang/Exception:toString	()Ljava/lang/String;
    //   354: invokevirtual 276	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   357: invokevirtual 277	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   360: invokestatic 280	com/facebook/internal/Utility:logd	(Ljava/lang/String;Ljava/lang/String;)V
    //   363: aload_2
    //   364: ifnull +9 -> 373
    //   367: aload_2
    //   368: invokeinterface 247 1 0
    //   373: ldc 199
    //   375: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   378: aconst_null
    //   379: astore_0
    //   380: goto -335 -> 45
    //   383: astore_2
    //   384: aconst_null
    //   385: astore_0
    //   386: aload_0
    //   387: ifnull +9 -> 396
    //   390: aload_0
    //   391: invokeinterface 247 1 0
    //   396: ldc 199
    //   398: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   401: aload_2
    //   402: athrow
    //   403: astore_2
    //   404: goto -18 -> 386
    //   407: astore_1
    //   408: goto -85 -> 323
    //   411: aconst_null
    //   412: astore_2
    //   413: goto -342 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   52	71	320	java/lang/Exception
    //   71	76	320	java/lang/Exception
    //   80	85	320	java/lang/Exception
    //   89	94	320	java/lang/Exception
    //   102	121	320	java/lang/Exception
    //   124	155	320	java/lang/Exception
    //   52	71	383	finally
    //   71	76	383	finally
    //   80	85	383	finally
    //   89	94	383	finally
    //   102	121	383	finally
    //   124	155	383	finally
    //   161	170	403	finally
    //   172	177	403	finally
    //   199	209	403	finally
    //   211	221	403	finally
    //   223	233	403	finally
    //   235	247	403	finally
    //   259	266	403	finally
    //   268	280	403	finally
    //   282	297	403	finally
    //   325	330	403	finally
    //   332	336	403	finally
    //   338	345	403	finally
    //   347	363	403	finally
    //   161	170	407	java/lang/Exception
    //   172	177	407	java/lang/Exception
    //   199	209	407	java/lang/Exception
    //   211	221	407	java/lang/Exception
    //   223	233	407	java/lang/Exception
    //   235	247	407	java/lang/Exception
    //   259	266	407	java/lang/Exception
    //   268	280	407	java/lang/Exception
    //   282	297	407	java/lang/Exception
  }

  private static String getInstallerPackageName(Context paramContext)
  {
    AppMethodBeat.i(72242);
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager != null)
    {
      paramContext = localPackageManager.getInstallerPackageName(paramContext.getPackageName());
      AppMethodBeat.o(72242);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(72242);
    }
  }

  public String getAndroidAdvertiserId()
  {
    return this.androidAdvertiserId;
  }

  public String getAndroidInstallerPackage()
  {
    return this.androidInstallerPackage;
  }

  public String getAttributionId()
  {
    return this.attributionId;
  }

  public boolean isTrackingLimited()
  {
    return this.limitTracking;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.AttributionIdentifiers
 * JD-Core Version:    0.6.2
 */