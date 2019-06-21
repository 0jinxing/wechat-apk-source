package com.google.android.gms.internal.stable;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class zze$zza
  implements BaseColumns
{
  private static HashMap<Uri, zzh> zzagq;

  static
  {
    AppMethodBeat.i(90474);
    zzagq = new HashMap();
    AppMethodBeat.o(90474);
  }

  private static zzh zza(ContentResolver paramContentResolver, Uri paramUri)
  {
    AppMethodBeat.i(90471);
    zzh localzzh = (zzh)zzagq.get(paramUri);
    if (localzzh == null)
    {
      localzzh = new zzh();
      zzagq.put(paramUri, localzzh);
      paramContentResolver.registerContentObserver(paramUri, true, new zzf(null, localzzh));
      paramContentResolver = localzzh;
    }
    while (true)
    {
      AppMethodBeat.o(90471);
      return paramContentResolver;
      paramContentResolver = localzzh;
      if (localzzh.zzagu.getAndSet(false))
        try
        {
          localzzh.zzags.clear();
          paramContentResolver = new java/lang/Object;
          paramContentResolver.<init>();
          localzzh.zzagt = paramContentResolver;
          paramContentResolver = localzzh;
        }
        finally
        {
          AppMethodBeat.o(90471);
        }
    }
    throw paramContentResolver;
  }

  // ERROR //
  protected static String zza(ContentResolver paramContentResolver, Uri paramUri, String paramString)
  {
    // Byte code:
    //   0: ldc 81
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 2
    //   7: monitorenter
    //   8: aload_0
    //   9: aload_1
    //   10: invokestatic 83	com/google/android/gms/internal/stable/zze$zza:zza	(Landroid/content/ContentResolver;Landroid/net/Uri;)Lcom/google/android/gms/internal/stable/zzh;
    //   13: astore_3
    //   14: ldc 2
    //   16: monitorexit
    //   17: aload_3
    //   18: monitorenter
    //   19: aload_3
    //   20: getfield 77	com/google/android/gms/internal/stable/zzh:zzagt	Ljava/lang/Object;
    //   23: astore 4
    //   25: aload_3
    //   26: getfield 70	com/google/android/gms/internal/stable/zzh:zzags	Ljava/util/HashMap;
    //   29: aload_2
    //   30: invokevirtual 87	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   33: ifeq +35 -> 68
    //   36: aload_3
    //   37: getfield 70	com/google/android/gms/internal/stable/zzh:zzags	Ljava/util/HashMap;
    //   40: aload_2
    //   41: invokevirtual 39	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   44: checkcast 89	java/lang/String
    //   47: astore_1
    //   48: aload_3
    //   49: monitorexit
    //   50: ldc 81
    //   52: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   55: aload_1
    //   56: areturn
    //   57: astore_0
    //   58: ldc 2
    //   60: monitorexit
    //   61: ldc 81
    //   63: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: aload_0
    //   67: athrow
    //   68: aload_3
    //   69: monitorexit
    //   70: aload_0
    //   71: aload_1
    //   72: iconst_1
    //   73: anewarray 89	java/lang/String
    //   76: dup
    //   77: iconst_0
    //   78: ldc 91
    //   80: aastore
    //   81: ldc 93
    //   83: iconst_1
    //   84: anewarray 89	java/lang/String
    //   87: dup
    //   88: iconst_0
    //   89: aload_2
    //   90: aastore
    //   91: aconst_null
    //   92: invokevirtual 97	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   95: astore 5
    //   97: aload 5
    //   99: ifnull +17 -> 116
    //   102: aload 5
    //   104: astore 6
    //   106: aload 5
    //   108: invokeinterface 103 1 0
    //   113: ifne +47 -> 160
    //   116: aload 5
    //   118: astore 6
    //   120: aload_3
    //   121: aload 4
    //   123: aload_2
    //   124: aconst_null
    //   125: invokestatic 106	com/google/android/gms/internal/stable/zze$zza:zza	(Lcom/google/android/gms/internal/stable/zzh;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   128: aload 5
    //   130: ifnull +10 -> 140
    //   133: aload 5
    //   135: invokeinterface 109 1 0
    //   140: ldc 81
    //   142: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: aconst_null
    //   146: astore_1
    //   147: goto -92 -> 55
    //   150: astore_0
    //   151: aload_3
    //   152: monitorexit
    //   153: ldc 81
    //   155: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: aload_0
    //   159: athrow
    //   160: aload 5
    //   162: astore 6
    //   164: aload 5
    //   166: iconst_0
    //   167: invokeinterface 113 2 0
    //   172: astore_0
    //   173: aload 5
    //   175: astore 6
    //   177: aload_3
    //   178: aload 4
    //   180: aload_2
    //   181: aload_0
    //   182: invokestatic 106	com/google/android/gms/internal/stable/zze$zza:zza	(Lcom/google/android/gms/internal/stable/zzh;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   185: aload_0
    //   186: astore_1
    //   187: aload 5
    //   189: ifnull +12 -> 201
    //   192: aload 5
    //   194: invokeinterface 109 1 0
    //   199: aload_0
    //   200: astore_1
    //   201: ldc 81
    //   203: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: goto -151 -> 55
    //   209: astore_0
    //   210: aconst_null
    //   211: astore 5
    //   213: aconst_null
    //   214: astore_0
    //   215: aload 5
    //   217: astore 6
    //   219: new 115	java/lang/StringBuilder
    //   222: astore_3
    //   223: aload 5
    //   225: astore 6
    //   227: aload_3
    //   228: ldc 117
    //   230: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   233: aload 5
    //   235: astore 6
    //   237: aload_3
    //   238: aload_2
    //   239: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: ldc 126
    //   244: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: aload_1
    //   248: invokevirtual 129	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   251: pop
    //   252: aload_0
    //   253: astore_1
    //   254: aload 5
    //   256: ifnull -55 -> 201
    //   259: aload 5
    //   261: invokeinterface 109 1 0
    //   266: aload_0
    //   267: astore_1
    //   268: goto -67 -> 201
    //   271: astore_0
    //   272: aconst_null
    //   273: astore 6
    //   275: aload 6
    //   277: ifnull +10 -> 287
    //   280: aload 6
    //   282: invokeinterface 109 1 0
    //   287: ldc 81
    //   289: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: aload_0
    //   293: athrow
    //   294: astore_0
    //   295: goto -20 -> 275
    //   298: astore_0
    //   299: aconst_null
    //   300: astore_0
    //   301: goto -86 -> 215
    //   304: astore 6
    //   306: goto -91 -> 215
    //
    // Exception table:
    //   from	to	target	type
    //   8	17	57	finally
    //   58	61	57	finally
    //   19	50	150	finally
    //   68	70	150	finally
    //   151	153	150	finally
    //   70	97	209	android/database/SQLException
    //   70	97	271	finally
    //   106	116	294	finally
    //   120	128	294	finally
    //   164	173	294	finally
    //   177	185	294	finally
    //   219	223	294	finally
    //   227	233	294	finally
    //   237	252	294	finally
    //   106	116	298	android/database/SQLException
    //   120	128	298	android/database/SQLException
    //   164	173	298	android/database/SQLException
    //   177	185	304	android/database/SQLException
  }

  private static void zza(zzh paramzzh, Object paramObject, String paramString1, String paramString2)
  {
    AppMethodBeat.i(90473);
    try
    {
      if (paramObject == paramzzh.zzagt)
        paramzzh.zzags.put(paramString1, paramString2);
      return;
    }
    finally
    {
      AppMethodBeat.o(90473);
    }
    throw paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.stable.zze.zza
 * JD-Core Version:    0.6.2
 */