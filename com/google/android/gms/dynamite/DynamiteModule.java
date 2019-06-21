package com.google.android.gms.dynamite;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule
{
  public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION;
  public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING;
  public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION;
  public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION_NO_FORCE_STAGING;
  public static final VersionPolicy PREFER_LOCAL;
  public static final VersionPolicy PREFER_REMOTE;

  @GuardedBy("DynamiteModule.class")
  private static Boolean zzabr;

  @GuardedBy("DynamiteModule.class")
  private static IDynamiteLoader zzabs;

  @GuardedBy("DynamiteModule.class")
  private static IDynamiteLoaderV2 zzabt;

  @GuardedBy("DynamiteModule.class")
  private static String zzabu;
  private static final ThreadLocal<zza> zzabv;
  private static final DynamiteModule.VersionPolicy.IVersions zzabw;
  private final Context zzabx;

  static
  {
    AppMethodBeat.i(90442);
    zzabv = new ThreadLocal();
    zzabw = new zza();
    PREFER_REMOTE = new zzb();
    PREFER_LOCAL = new zzc();
    PREFER_HIGHEST_OR_LOCAL_VERSION = new zzd();
    PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zze();
    PREFER_HIGHEST_OR_REMOTE_VERSION = new zzf();
    PREFER_HIGHEST_OR_REMOTE_VERSION_NO_FORCE_STAGING = new zzg();
    AppMethodBeat.o(90442);
  }

  private DynamiteModule(Context paramContext)
  {
    AppMethodBeat.i(90441);
    this.zzabx = ((Context)Preconditions.checkNotNull(paramContext));
    AppMethodBeat.o(90441);
  }

  public static int getLocalVersion(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(90426);
    try
    {
      paramContext = paramContext.getApplicationContext().getClassLoader();
      int j = String.valueOf(paramString).length();
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>(j + 61);
      localObject = paramContext.loadClass("com.google.android.gms.dynamite.descriptors." + paramString + ".ModuleDescriptor");
      paramContext = ((Class)localObject).getDeclaredField("MODULE_ID");
      localObject = ((Class)localObject).getDeclaredField("MODULE_VERSION");
      if (!paramContext.get(null).equals(paramString))
      {
        paramContext = String.valueOf(paramContext.get(null));
        int k = String.valueOf(paramContext).length();
        j = String.valueOf(paramString).length();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(k + 51 + j);
        ((StringBuilder)localObject).append("Module descriptor id '").append(paramContext).append("' didn't match expected id '").append(paramString).append("'");
        AppMethodBeat.o(90426);
      }
      while (true)
      {
        return i;
        j = ((Field)localObject).getInt(null);
        i = j;
        AppMethodBeat.o(90426);
      }
    }
    catch (ClassNotFoundException paramContext)
    {
      while (true)
      {
        new StringBuilder(String.valueOf(paramString).length() + 45).append("Local module descriptor class for ").append(paramString).append(" not found.");
        AppMethodBeat.o(90426);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = String.valueOf(paramContext.getMessage());
        if (paramContext.length() != 0)
          "Failed to load module descriptor class: ".concat(paramContext);
        else
          new String("Failed to load module descriptor class: ");
      }
    }
  }

  public static Uri getQueryUri(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(90432);
    if (paramBoolean);
    for (String str = "api_force_staging"; ; str = "api")
    {
      paramString = Uri.parse(String.valueOf(str).length() + 42 + String.valueOf(paramString).length() + "content://com.google.android.gms.chimera/" + str + "/" + paramString);
      AppMethodBeat.o(90432);
      return paramString;
    }
  }

  public static int getRemoteVersion(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90430);
    int i = getRemoteVersion(paramContext, paramString, false);
    AppMethodBeat.o(90430);
    return i;
  }

  // ERROR //
  public static int getRemoteVersion(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 237
    //   2: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 2
    //   7: monitorenter
    //   8: getstatic 239	com/google/android/gms/dynamite/DynamiteModule:zzabr	Ljava/lang/Boolean;
    //   11: astore_3
    //   12: aload_3
    //   13: astore 4
    //   15: aload_3
    //   16: ifnonnull +65 -> 81
    //   19: aload_0
    //   20: invokevirtual 129	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   23: invokevirtual 133	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   26: ldc 6
    //   28: invokevirtual 242	java/lang/Class:getName	()Ljava/lang/String;
    //   31: invokevirtual 165	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   34: astore_3
    //   35: aload_3
    //   36: ldc 244
    //   38: invokevirtual 173	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   41: astore 4
    //   43: aload_3
    //   44: monitorenter
    //   45: aload 4
    //   47: aconst_null
    //   48: invokevirtual 180	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast 161	java/lang/ClassLoader
    //   54: astore 5
    //   56: aload 5
    //   58: ifnull +63 -> 121
    //   61: aload 5
    //   63: invokestatic 247	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   66: if_acmpne +42 -> 108
    //   69: getstatic 252	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   72: astore 4
    //   74: aload_3
    //   75: monitorexit
    //   76: aload 4
    //   78: putstatic 239	com/google/android/gms/dynamite/DynamiteModule:zzabr	Ljava/lang/Boolean;
    //   81: ldc 2
    //   83: monitorexit
    //   84: aload 4
    //   86: invokevirtual 256	java/lang/Boolean:booleanValue	()Z
    //   89: ifeq +297 -> 386
    //   92: aload_0
    //   93: aload_1
    //   94: iload_2
    //   95: invokestatic 258	com/google/android/gms/dynamite/DynamiteModule:zzb	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   98: istore 6
    //   100: ldc 237
    //   102: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   105: iload 6
    //   107: ireturn
    //   108: aload 5
    //   110: invokestatic 261	com/google/android/gms/dynamite/DynamiteModule:zza	(Ljava/lang/ClassLoader;)V
    //   113: getstatic 264	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   116: astore 4
    //   118: goto -44 -> 74
    //   121: ldc_w 266
    //   124: aload_0
    //   125: invokevirtual 129	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   128: invokevirtual 269	android/content/Context:getPackageName	()Ljava/lang/String;
    //   131: invokevirtual 270	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   134: ifeq +20 -> 154
    //   137: aload 4
    //   139: aconst_null
    //   140: invokestatic 247	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   143: invokevirtual 274	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   146: getstatic 252	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   149: astore 4
    //   151: goto -77 -> 74
    //   154: aload_0
    //   155: aload_1
    //   156: iload_2
    //   157: invokestatic 258	com/google/android/gms/dynamite/DynamiteModule:zzb	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   160: istore 6
    //   162: getstatic 276	com/google/android/gms/dynamite/DynamiteModule:zzabu	Ljava/lang/String;
    //   165: ifnull +16 -> 181
    //   168: getstatic 276	com/google/android/gms/dynamite/DynamiteModule:zzabu	Ljava/lang/String;
    //   171: invokevirtual 279	java/lang/String:isEmpty	()Z
    //   174: istore 7
    //   176: iload 7
    //   178: ifeq +16 -> 194
    //   181: aload_3
    //   182: monitorexit
    //   183: ldc 2
    //   185: monitorexit
    //   186: ldc 237
    //   188: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: goto -86 -> 105
    //   194: new 281	com/google/android/gms/dynamite/zzh
    //   197: astore 5
    //   199: aload 5
    //   201: getstatic 276	com/google/android/gms/dynamite/DynamiteModule:zzabu	Ljava/lang/String;
    //   204: invokestatic 247	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   207: invokespecial 284	com/google/android/gms/dynamite/zzh:<init>	(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    //   210: aload 5
    //   212: invokestatic 261	com/google/android/gms/dynamite/DynamiteModule:zza	(Ljava/lang/ClassLoader;)V
    //   215: aload 4
    //   217: aconst_null
    //   218: aload 5
    //   220: invokevirtual 274	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   223: getstatic 264	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   226: putstatic 239	com/google/android/gms/dynamite/DynamiteModule:zzabr	Ljava/lang/Boolean;
    //   229: aload_3
    //   230: monitorexit
    //   231: ldc 2
    //   233: monitorexit
    //   234: ldc 237
    //   236: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: goto -134 -> 105
    //   242: astore 5
    //   244: aload 4
    //   246: aconst_null
    //   247: invokestatic 247	java/lang/ClassLoader:getSystemClassLoader	()Ljava/lang/ClassLoader;
    //   250: invokevirtual 274	java/lang/reflect/Field:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   253: getstatic 252	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   256: astore 4
    //   258: goto -184 -> 74
    //   261: astore 4
    //   263: aload_3
    //   264: monitorexit
    //   265: ldc 237
    //   267: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   270: aload 4
    //   272: athrow
    //   273: astore 4
    //   275: aload 4
    //   277: invokestatic 139	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   280: astore_3
    //   281: aload_3
    //   282: invokestatic 139	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   285: invokevirtual 143	java/lang/String:length	()I
    //   288: istore 6
    //   290: new 145	java/lang/StringBuilder
    //   293: astore 4
    //   295: aload 4
    //   297: iload 6
    //   299: bipush 30
    //   301: iadd
    //   302: invokespecial 147	java/lang/StringBuilder:<init>	(I)V
    //   305: aload 4
    //   307: ldc_w 286
    //   310: invokevirtual 153	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: aload_3
    //   314: invokevirtual 153	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: pop
    //   318: getstatic 252	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   321: astore 4
    //   323: goto -247 -> 76
    //   326: astore_0
    //   327: ldc 2
    //   329: monitorexit
    //   330: ldc 237
    //   332: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   335: aload_0
    //   336: athrow
    //   337: astore_0
    //   338: aload_0
    //   339: invokevirtual 287	com/google/android/gms/dynamite/DynamiteModule$LoadingException:getMessage	()Ljava/lang/String;
    //   342: invokestatic 139	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   345: astore_0
    //   346: aload_0
    //   347: invokevirtual 143	java/lang/String:length	()I
    //   350: ifeq +22 -> 372
    //   353: ldc_w 289
    //   356: aload_0
    //   357: invokevirtual 207	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   360: pop
    //   361: iconst_0
    //   362: istore 6
    //   364: ldc 237
    //   366: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   369: goto -264 -> 105
    //   372: new 135	java/lang/String
    //   375: dup
    //   376: ldc_w 289
    //   379: invokespecial 210	java/lang/String:<init>	(Ljava/lang/String;)V
    //   382: pop
    //   383: goto -22 -> 361
    //   386: aload_0
    //   387: aload_1
    //   388: iload_2
    //   389: invokestatic 291	com/google/android/gms/dynamite/DynamiteModule:zza	(Landroid/content/Context;Ljava/lang/String;Z)I
    //   392: istore 6
    //   394: ldc 237
    //   396: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   399: goto -294 -> 105
    //   402: astore 4
    //   404: goto -291 -> 113
    //   407: astore 4
    //   409: goto -134 -> 275
    //   412: astore 4
    //   414: goto -139 -> 275
    //
    // Exception table:
    //   from	to	target	type
    //   154	176	242	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   194	229	242	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   45	56	261	finally
    //   61	74	261	finally
    //   74	76	261	finally
    //   108	113	261	finally
    //   113	118	261	finally
    //   121	151	261	finally
    //   154	176	261	finally
    //   181	183	261	finally
    //   194	229	261	finally
    //   229	231	261	finally
    //   244	258	261	finally
    //   263	265	261	finally
    //   19	45	273	java/lang/ClassNotFoundException
    //   265	273	273	java/lang/ClassNotFoundException
    //   8	12	326	finally
    //   19	45	326	finally
    //   76	81	326	finally
    //   81	84	326	finally
    //   183	186	326	finally
    //   231	234	326	finally
    //   265	273	326	finally
    //   275	323	326	finally
    //   327	330	326	finally
    //   92	100	337	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   108	113	402	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   19	45	407	java/lang/NoSuchFieldException
    //   265	273	407	java/lang/NoSuchFieldException
    //   19	45	412	java/lang/IllegalAccessException
    //   265	273	412	java/lang/IllegalAccessException
  }

  @VisibleForTesting
  public static Boolean getUseV2ForTesting()
  {
    try
    {
      Boolean localBoolean = zzabr;
      return localBoolean;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static DynamiteModule load(Context paramContext, VersionPolicy paramVersionPolicy, String paramString)
  {
    AppMethodBeat.i(90425);
    zza localzza1 = (zza)zzabv.get();
    zza localzza2 = new zza(null);
    zzabv.set(localzza2);
    DynamiteModule.VersionPolicy.SelectionResult localSelectionResult;
    Object localObject1;
    try
    {
      localSelectionResult = paramVersionPolicy.selectModule(paramContext, paramString, zzabw);
      int i = localSelectionResult.localVersion;
      int j = localSelectionResult.remoteVersion;
      k = String.valueOf(paramString).length();
      int m = String.valueOf(paramString).length();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>(k + 68 + m);
      ((StringBuilder)localObject1).append("Considering local module ").append(paramString).append(":").append(i).append(" and remote module ").append(paramString).append(":").append(j);
      if ((localSelectionResult.selection == 0) || ((localSelectionResult.selection == -1) && (localSelectionResult.localVersion == 0)) || ((localSelectionResult.selection == 1) && (localSelectionResult.remoteVersion == 0)))
      {
        paramContext = new com/google/android/gms/dynamite/DynamiteModule$LoadingException;
        i = localSelectionResult.localVersion;
        k = localSelectionResult.remoteVersion;
        paramVersionPolicy = new java/lang/StringBuilder;
        paramVersionPolicy.<init>(91);
        paramContext.<init>("No acceptable module found. Local version is " + i + " and remote version is " + k + ".", null);
        AppMethodBeat.o(90425);
        throw paramContext;
      }
    }
    finally
    {
      if (localzza2.zzaby != null)
        localzza2.zzaby.close();
      zzabv.set(localzza1);
      AppMethodBeat.o(90425);
    }
    if (localSelectionResult.selection == -1)
    {
      paramContext = zzd(paramContext, paramString);
      if (localzza2.zzaby != null)
        localzza2.zzaby.close();
      zzabv.set(localzza1);
      AppMethodBeat.o(90425);
    }
    while (true)
    {
      return paramContext;
      k = localSelectionResult.selection;
      if (k == 1)
        try
        {
          localObject1 = zza(paramContext, paramString, localSelectionResult.remoteVersion);
          if (localzza2.zzaby != null)
            localzza2.zzaby.close();
          zzabv.set(localzza1);
          AppMethodBeat.o(90425);
          paramContext = (Context)localObject1;
        }
        catch (LoadingException localLoadingException)
        {
          Object localObject2 = String.valueOf(localLoadingException.getMessage());
          if (((String)localObject2).length() != 0)
            "Failed to load remote module: ".concat((String)localObject2);
          while (true)
          {
            if (localSelectionResult.localVersion == 0)
              break label525;
            localObject2 = new com/google/android/gms/dynamite/DynamiteModule$zzb;
            ((zzb)localObject2).<init>(localSelectionResult.localVersion, 0);
            if (paramVersionPolicy.selectModule(paramContext, paramString, (DynamiteModule.VersionPolicy.IVersions)localObject2).selection != -1)
              break label525;
            paramContext = zzd(paramContext, paramString);
            if (localzza2.zzaby != null)
              localzza2.zzaby.close();
            zzabv.set(localzza1);
            AppMethodBeat.o(90425);
            break;
            new String("Failed to load remote module: ");
          }
          label525: paramContext = new com/google/android/gms/dynamite/DynamiteModule$LoadingException;
          paramContext.<init>("Remote load failed. No local fallback found.", localLoadingException, null);
          AppMethodBeat.o(90425);
          throw paramContext;
        }
    }
    paramContext = new com/google/android/gms/dynamite/DynamiteModule$LoadingException;
    int k = localSelectionResult.selection;
    paramVersionPolicy = new java/lang/StringBuilder;
    paramVersionPolicy.<init>(47);
    paramContext.<init>("VersionPolicy returned invalid code:" + k, null);
    AppMethodBeat.o(90425);
    throw paramContext;
  }

  public static Cursor queryForDynamiteModule(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(90431);
    paramContext = paramContext.getContentResolver().query(getQueryUri(paramString, paramBoolean), null, null, null, null);
    AppMethodBeat.o(90431);
    return paramContext;
  }

  @VisibleForTesting
  public static void resetInternalStateForTesting()
  {
    try
    {
      zzabs = null;
      zzabt = null;
      zzabu = null;
      zzabr = null;
      try
      {
        DynamiteLoaderClassLoader.sClassLoader = null;
        return;
      }
      finally
      {
      }
    }
    finally
    {
    }
  }

  @VisibleForTesting
  public static void setUseV2ForTesting(Boolean paramBoolean)
  {
    try
    {
      zzabr = paramBoolean;
      return;
    }
    finally
    {
      paramBoolean = finally;
    }
    throw paramBoolean;
  }

  private static int zza(Context paramContext, String paramString, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(90428);
    IDynamiteLoader localIDynamiteLoader = zzg(paramContext);
    int j;
    if (localIDynamiteLoader == null)
    {
      AppMethodBeat.o(90428);
      j = i;
    }
    while (true)
    {
      return j;
      try
      {
        j = localIDynamiteLoader.getModuleVersion2(ObjectWrapper.wrap(paramContext), paramString, paramBoolean);
        AppMethodBeat.o(90428);
      }
      catch (RemoteException paramContext)
      {
        paramContext = String.valueOf(paramContext.getMessage());
        if (paramContext.length() == 0)
          break label91;
      }
    }
    "Failed to retrieve remote module version: ".concat(paramContext);
    while (true)
    {
      AppMethodBeat.o(90428);
      j = i;
      break;
      label91: new String("Failed to retrieve remote module version: ");
    }
  }

  private static Context zza(Context paramContext, String paramString, int paramInt, Cursor paramCursor, IDynamiteLoaderV2 paramIDynamiteLoaderV2)
  {
    AppMethodBeat.i(90438);
    try
    {
      paramContext = (Context)ObjectWrapper.unwrap(paramIDynamiteLoaderV2.loadModule2(ObjectWrapper.wrap(paramContext), paramString, paramInt, ObjectWrapper.wrap(paramCursor)));
      AppMethodBeat.o(90438);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext = String.valueOf(paramContext.toString());
      if (paramContext.length() == 0)
        break label73;
    }
    "Failed to load DynamiteLoader: ".concat(paramContext);
    while (true)
    {
      paramContext = null;
      AppMethodBeat.o(90438);
      break;
      label73: new String("Failed to load DynamiteLoader: ");
    }
  }

  private static DynamiteModule zza(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(90434);
    Boolean localBoolean;
    try
    {
      localBoolean = zzabr;
      if (localBoolean == null)
      {
        paramContext = new LoadingException("Failed to determine which loading route to use.", null);
        AppMethodBeat.o(90434);
        throw paramContext;
      }
    }
    finally
    {
      AppMethodBeat.o(90434);
    }
    if (localBoolean.booleanValue())
    {
      paramContext = zzc(paramContext, paramString, paramInt);
      AppMethodBeat.o(90434);
    }
    while (true)
    {
      return paramContext;
      paramContext = zzb(paramContext, paramString, paramInt);
      AppMethodBeat.o(90434);
    }
  }

  @GuardedBy("DynamiteModule.class")
  private static void zza(ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(90439);
    try
    {
      zzabt = IDynamiteLoaderV2.Stub.asInterface((IBinder)paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
      AppMethodBeat.o(90439);
      return;
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      paramClassLoader = new LoadingException("Failed to instantiate dynamite loader", paramClassLoader, null);
      AppMethodBeat.o(90439);
      throw paramClassLoader;
    }
    catch (InstantiationException paramClassLoader)
    {
      break label44;
    }
    catch (IllegalAccessException paramClassLoader)
    {
      break label44;
    }
    catch (NoSuchMethodException paramClassLoader)
    {
      break label44;
    }
    catch (InvocationTargetException paramClassLoader)
    {
      label44: break label44;
    }
  }

  // ERROR //
  private static int zzb(Context paramContext, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 465
    //   3: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: iload_2
    //   9: invokestatic 467	com/google/android/gms/dynamite/DynamiteModule:queryForDynamiteModule	(Landroid/content/Context;Ljava/lang/String;Z)Landroid/database/Cursor;
    //   12: astore_0
    //   13: aload_0
    //   14: ifnull +14 -> 28
    //   17: aload_0
    //   18: astore_1
    //   19: aload_0
    //   20: invokeinterface 470 1 0
    //   25: ifne +72 -> 97
    //   28: aload_0
    //   29: astore_1
    //   30: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   33: astore_3
    //   34: aload_0
    //   35: astore_1
    //   36: aload_3
    //   37: ldc_w 472
    //   40: aconst_null
    //   41: invokespecial 339	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Lcom/google/android/gms/dynamite/zza;)V
    //   44: aload_0
    //   45: astore_1
    //   46: ldc_w 465
    //   49: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: aload_0
    //   53: astore_1
    //   54: aload_3
    //   55: athrow
    //   56: astore_3
    //   57: aload_0
    //   58: astore_1
    //   59: aload_3
    //   60: instanceof 9
    //   63: ifeq +147 -> 210
    //   66: aload_0
    //   67: astore_1
    //   68: ldc_w 465
    //   71: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: aload_0
    //   75: astore_1
    //   76: aload_3
    //   77: athrow
    //   78: astore_0
    //   79: aload_1
    //   80: ifnull +9 -> 89
    //   83: aload_1
    //   84: invokeinterface 348 1 0
    //   89: ldc_w 465
    //   92: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: aload_0
    //   96: athrow
    //   97: aload_0
    //   98: astore_1
    //   99: aload_0
    //   100: iconst_0
    //   101: invokeinterface 475 2 0
    //   106: istore 4
    //   108: aload_0
    //   109: astore_3
    //   110: iload 4
    //   112: ifle +63 -> 175
    //   115: aload_0
    //   116: astore_1
    //   117: ldc 2
    //   119: monitorenter
    //   120: aload_0
    //   121: iconst_2
    //   122: invokeinterface 479 2 0
    //   127: putstatic 276	com/google/android/gms/dynamite/DynamiteModule:zzabu	Ljava/lang/String;
    //   130: ldc 2
    //   132: monitorexit
    //   133: aload_0
    //   134: astore_1
    //   135: getstatic 66	com/google/android/gms/dynamite/DynamiteModule:zzabv	Ljava/lang/ThreadLocal;
    //   138: invokevirtual 301	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   141: checkcast 21	com/google/android/gms/dynamite/DynamiteModule$zza
    //   144: astore 5
    //   146: aload_0
    //   147: astore_3
    //   148: aload 5
    //   150: ifnull +25 -> 175
    //   153: aload_0
    //   154: astore_1
    //   155: aload_0
    //   156: astore_3
    //   157: aload 5
    //   159: getfield 343	com/google/android/gms/dynamite/DynamiteModule$zza:zzaby	Landroid/database/Cursor;
    //   162: ifnonnull +13 -> 175
    //   165: aload_0
    //   166: astore_1
    //   167: aload 5
    //   169: aload_0
    //   170: putfield 343	com/google/android/gms/dynamite/DynamiteModule$zza:zzaby	Landroid/database/Cursor;
    //   173: aconst_null
    //   174: astore_3
    //   175: aload_3
    //   176: ifnull +9 -> 185
    //   179: aload_3
    //   180: invokeinterface 348 1 0
    //   185: ldc_w 465
    //   188: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   191: iload 4
    //   193: ireturn
    //   194: astore_3
    //   195: ldc 2
    //   197: monitorexit
    //   198: aload_0
    //   199: astore_1
    //   200: ldc_w 465
    //   203: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: aload_0
    //   207: astore_1
    //   208: aload_3
    //   209: athrow
    //   210: aload_0
    //   211: astore_1
    //   212: new 9	com/google/android/gms/dynamite/DynamiteModule$LoadingException
    //   215: astore 5
    //   217: aload_0
    //   218: astore_1
    //   219: aload 5
    //   221: ldc_w 481
    //   224: aload_3
    //   225: aconst_null
    //   226: invokespecial 365	com/google/android/gms/dynamite/DynamiteModule$LoadingException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;Lcom/google/android/gms/dynamite/zza;)V
    //   229: aload_0
    //   230: astore_1
    //   231: ldc_w 465
    //   234: invokestatic 104	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: aload_0
    //   238: astore_1
    //   239: aload 5
    //   241: athrow
    //   242: astore_0
    //   243: aconst_null
    //   244: astore_1
    //   245: goto -166 -> 79
    //   248: astore_3
    //   249: aconst_null
    //   250: astore_0
    //   251: goto -194 -> 57
    //
    // Exception table:
    //   from	to	target	type
    //   19	28	56	java/lang/Exception
    //   30	34	56	java/lang/Exception
    //   36	44	56	java/lang/Exception
    //   46	52	56	java/lang/Exception
    //   54	56	56	java/lang/Exception
    //   99	108	56	java/lang/Exception
    //   117	120	56	java/lang/Exception
    //   135	146	56	java/lang/Exception
    //   157	165	56	java/lang/Exception
    //   167	173	56	java/lang/Exception
    //   200	206	56	java/lang/Exception
    //   208	210	56	java/lang/Exception
    //   19	28	78	finally
    //   30	34	78	finally
    //   36	44	78	finally
    //   46	52	78	finally
    //   54	56	78	finally
    //   59	66	78	finally
    //   68	74	78	finally
    //   76	78	78	finally
    //   99	108	78	finally
    //   117	120	78	finally
    //   135	146	78	finally
    //   157	165	78	finally
    //   167	173	78	finally
    //   200	206	78	finally
    //   208	210	78	finally
    //   212	217	78	finally
    //   219	229	78	finally
    //   231	237	78	finally
    //   239	242	78	finally
    //   120	133	194	finally
    //   195	198	194	finally
    //   6	13	242	finally
    //   6	13	248	java/lang/Exception
  }

  private static DynamiteModule zzb(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(90435);
    new StringBuilder(String.valueOf(paramString).length() + 51).append("Selected remote version of ").append(paramString).append(", version >= ").append(paramInt);
    IDynamiteLoader localIDynamiteLoader = zzg(paramContext);
    if (localIDynamiteLoader == null)
    {
      paramContext = new LoadingException("Failed to create IDynamiteLoader.", null);
      AppMethodBeat.o(90435);
      throw paramContext;
    }
    try
    {
      paramContext = localIDynamiteLoader.createModuleContext(ObjectWrapper.wrap(paramContext), paramString, paramInt);
      if (ObjectWrapper.unwrap(paramContext) == null)
      {
        paramContext = new LoadingException("Failed to load remote module.", null);
        AppMethodBeat.o(90435);
        throw paramContext;
      }
    }
    catch (RemoteException paramContext)
    {
      paramContext = new LoadingException("Failed to load remote module.", paramContext, null);
      AppMethodBeat.o(90435);
      throw paramContext;
    }
    paramContext = new DynamiteModule((Context)ObjectWrapper.unwrap(paramContext));
    AppMethodBeat.o(90435);
    return paramContext;
  }

  private static DynamiteModule zzc(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(90437);
    new StringBuilder(String.valueOf(paramString).length() + 51).append("Selected remote version of ").append(paramString).append(", version >= ").append(paramInt);
    IDynamiteLoaderV2 localIDynamiteLoaderV2;
    try
    {
      localIDynamiteLoaderV2 = zzabt;
      if (localIDynamiteLoaderV2 == null)
      {
        paramContext = new LoadingException("DynamiteLoaderV2 was not cached.", null);
        AppMethodBeat.o(90437);
        throw paramContext;
      }
    }
    finally
    {
      AppMethodBeat.o(90437);
    }
    zza localzza = (zza)zzabv.get();
    if ((localzza == null) || (localzza.zzaby == null))
    {
      paramContext = new LoadingException("No result cursor", null);
      AppMethodBeat.o(90437);
      throw paramContext;
    }
    paramContext = zza(paramContext.getApplicationContext(), paramString, paramInt, localzza.zzaby, localIDynamiteLoaderV2);
    if (paramContext == null)
    {
      paramContext = new LoadingException("Failed to get module context", null);
      AppMethodBeat.o(90437);
      throw paramContext;
    }
    paramContext = new DynamiteModule(paramContext);
    AppMethodBeat.o(90437);
    return paramContext;
  }

  private static DynamiteModule zzd(Context paramContext, String paramString)
  {
    AppMethodBeat.i(90433);
    paramString = String.valueOf(paramString);
    if (paramString.length() != 0)
      "Selected local version of ".concat(paramString);
    while (true)
    {
      paramContext = new DynamiteModule(paramContext.getApplicationContext());
      AppMethodBeat.o(90433);
      return paramContext;
      new String("Selected local version of ");
    }
  }

  private static IDynamiteLoader zzg(Context paramContext)
  {
    AppMethodBeat.i(90436);
    try
    {
      if (zzabs != null)
        paramContext = zzabs;
      while (true)
      {
        return paramContext;
        if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(paramContext) != 0)
        {
          AppMethodBeat.o(90436);
          paramContext = null;
        }
        else
        {
          try
          {
            paramContext = IDynamiteLoader.Stub.asInterface((IBinder)paramContext.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
            if (paramContext != null)
              zzabs = paramContext;
          }
          catch (Exception paramContext)
          {
            paramContext = String.valueOf(paramContext.getMessage());
            if (paramContext.length() != 0)
              "Failed to load IDynamiteLoader from GmsCore: ".concat(paramContext);
            while (true)
            {
              AppMethodBeat.o(90436);
              paramContext = null;
              break;
              new String("Failed to load IDynamiteLoader from GmsCore: ");
            }
          }
        }
      }
    }
    finally
    {
      AppMethodBeat.o(90436);
    }
    throw paramContext;
  }

  public final Context getModuleContext()
  {
    return this.zzabx;
  }

  public final IBinder instantiate(String paramString)
  {
    AppMethodBeat.i(90440);
    try
    {
      IBinder localIBinder = (IBinder)this.zzabx.getClassLoader().loadClass(paramString).newInstance();
      AppMethodBeat.o(90440);
      return localIBinder;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0);
      for (paramString = "Failed to instantiate module class: ".concat(paramString); ; paramString = new String("Failed to instantiate module class: "))
      {
        paramString = new LoadingException(paramString, localClassNotFoundException, null);
        AppMethodBeat.o(90440);
        throw paramString;
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      break label33;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label33: break label33;
    }
  }

  @DynamiteApi
  public static class DynamiteLoaderClassLoader
  {

    @GuardedBy("DynamiteLoaderClassLoader.class")
    public static ClassLoader sClassLoader;
  }

  public static class LoadingException extends Exception
  {
    private LoadingException(String paramString)
    {
      super();
    }

    private LoadingException(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }

  public static abstract interface VersionPolicy
  {
    public abstract SelectionResult selectModule(Context paramContext, String paramString, IVersions paramIVersions);

    public static abstract interface IVersions
    {
      public abstract int getLocalVersion(Context paramContext, String paramString);

      public abstract int getRemoteVersion(Context paramContext, String paramString, boolean paramBoolean);
    }

    public static class SelectionResult
    {
      public int localVersion = 0;
      public int remoteVersion = 0;
      public int selection = 0;
    }
  }

  static final class zza
  {
    public Cursor zzaby;
  }

  static final class zzb
    implements DynamiteModule.VersionPolicy.IVersions
  {
    private final int zzabz;
    private final int zzaca;

    public zzb(int paramInt1, int paramInt2)
    {
      this.zzabz = paramInt1;
      this.zzaca = 0;
    }

    public final int getLocalVersion(Context paramContext, String paramString)
    {
      return this.zzabz;
    }

    public final int getRemoteVersion(Context paramContext, String paramString, boolean paramBoolean)
    {
      return 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.DynamiteModule
 * JD-Core Version:    0.6.2
 */