package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zzwn
{
  private static final Uri CONTENT_URI;
  private static final Uri zzbmh;
  public static final Pattern zzbmi;
  public static final Pattern zzbmj;
  private static final AtomicBoolean zzbmk;
  private static HashMap<String, String> zzbml;
  private static final HashMap<String, Boolean> zzbmm;
  private static final HashMap<String, Integer> zzbmn;
  private static final HashMap<String, Long> zzbmo;
  private static final HashMap<String, Float> zzbmp;
  private static Object zzbmq;
  private static boolean zzbmr;
  private static String[] zzbms;

  static
  {
    AppMethodBeat.i(69751);
    CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    zzbmh = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    zzbmi = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    zzbmj = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    zzbmk = new AtomicBoolean();
    zzbmm = new HashMap();
    zzbmn = new HashMap();
    zzbmo = new HashMap();
    zzbmp = new HashMap();
    zzbms = new String[0];
    AppMethodBeat.o(69751);
  }

  private static <T> T zza(HashMap<String, T> paramHashMap, String paramString, T paramT)
  {
    AppMethodBeat.i(69750);
    try
    {
      if (paramHashMap.containsKey(paramString))
      {
        paramHashMap = paramHashMap.get(paramString);
        if (paramHashMap == null);
      }
      while (true)
      {
        return paramHashMap;
        paramHashMap = paramT;
        continue;
        paramHashMap = null;
        AppMethodBeat.o(69750);
      }
    }
    finally
    {
      AppMethodBeat.o(69750);
    }
    throw paramHashMap;
  }

  // ERROR //
  public static String zza(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore_2
    //   7: aconst_null
    //   8: astore 5
    //   10: ldc 108
    //   12: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   15: ldc 2
    //   17: monitorenter
    //   18: aload_0
    //   19: invokestatic 111	com/google/android/gms/internal/measurement/zzwn:zza	(Landroid/content/ContentResolver;)V
    //   22: getstatic 113	com/google/android/gms/internal/measurement/zzwn:zzbmq	Ljava/lang/Object;
    //   25: astore 6
    //   27: getstatic 115	com/google/android/gms/internal/measurement/zzwn:zzbml	Ljava/util/HashMap;
    //   30: aload_1
    //   31: invokevirtual 100	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   34: ifeq +33 -> 67
    //   37: getstatic 115	com/google/android/gms/internal/measurement/zzwn:zzbml	Ljava/util/HashMap;
    //   40: aload_1
    //   41: invokevirtual 104	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   44: checkcast 86	java/lang/String
    //   47: astore_1
    //   48: aload 5
    //   50: astore_0
    //   51: aload_1
    //   52: ifnull +5 -> 57
    //   55: aload_1
    //   56: astore_0
    //   57: ldc 2
    //   59: monitorexit
    //   60: ldc 108
    //   62: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   65: aload_0
    //   66: areturn
    //   67: getstatic 88	com/google/android/gms/internal/measurement/zzwn:zzbms	[Ljava/lang/String;
    //   70: astore 5
    //   72: aload 5
    //   74: arraylength
    //   75: istore 7
    //   77: iconst_0
    //   78: istore 8
    //   80: iload 8
    //   82: iload 7
    //   84: if_icmpge +109 -> 193
    //   87: aload_1
    //   88: aload 5
    //   90: iload 8
    //   92: aaload
    //   93: invokevirtual 119	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   96: ifeq +91 -> 187
    //   99: getstatic 121	com/google/android/gms/internal/measurement/zzwn:zzbmr	Z
    //   102: ifeq +12 -> 114
    //   105: getstatic 115	com/google/android/gms/internal/measurement/zzwn:zzbml	Ljava/util/HashMap;
    //   108: invokevirtual 125	java/util/HashMap:isEmpty	()Z
    //   111: ifeq +63 -> 174
    //   114: getstatic 88	com/google/android/gms/internal/measurement/zzwn:zzbms	[Ljava/lang/String;
    //   117: astore_2
    //   118: getstatic 115	com/google/android/gms/internal/measurement/zzwn:zzbml	Ljava/util/HashMap;
    //   121: aload_0
    //   122: aload_2
    //   123: invokestatic 128	com/google/android/gms/internal/measurement/zzwn:zza	(Landroid/content/ContentResolver;[Ljava/lang/String;)Ljava/util/Map;
    //   126: invokevirtual 132	java/util/HashMap:putAll	(Ljava/util/Map;)V
    //   129: iconst_1
    //   130: putstatic 121	com/google/android/gms/internal/measurement/zzwn:zzbmr	Z
    //   133: getstatic 115	com/google/android/gms/internal/measurement/zzwn:zzbml	Ljava/util/HashMap;
    //   136: aload_1
    //   137: invokevirtual 100	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   140: ifeq +34 -> 174
    //   143: getstatic 115	com/google/android/gms/internal/measurement/zzwn:zzbml	Ljava/util/HashMap;
    //   146: aload_1
    //   147: invokevirtual 104	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   150: checkcast 86	java/lang/String
    //   153: astore_1
    //   154: aload 4
    //   156: astore_0
    //   157: aload_1
    //   158: ifnull +5 -> 163
    //   161: aload_1
    //   162: astore_0
    //   163: ldc 2
    //   165: monitorexit
    //   166: ldc 108
    //   168: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: goto -106 -> 65
    //   174: ldc 2
    //   176: monitorexit
    //   177: ldc 108
    //   179: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: aload_3
    //   183: astore_0
    //   184: goto -119 -> 65
    //   187: iinc 8 1
    //   190: goto -110 -> 80
    //   193: ldc 2
    //   195: monitorexit
    //   196: aload_0
    //   197: getstatic 48	com/google/android/gms/internal/measurement/zzwn:CONTENT_URI	Landroid/net/Uri;
    //   200: aconst_null
    //   201: aconst_null
    //   202: iconst_1
    //   203: anewarray 86	java/lang/String
    //   206: dup
    //   207: iconst_0
    //   208: aload_1
    //   209: aastore
    //   210: aconst_null
    //   211: invokevirtual 138	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   214: astore 4
    //   216: aload 4
    //   218: ifnull +13 -> 231
    //   221: aload 4
    //   223: invokeinterface 143 1 0
    //   228: ifne +43 -> 271
    //   231: aload 6
    //   233: aload_1
    //   234: aconst_null
    //   235: invokestatic 146	com/google/android/gms/internal/measurement/zzwn:zza	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   238: aload 4
    //   240: ifnull +10 -> 250
    //   243: aload 4
    //   245: invokeinterface 149 1 0
    //   250: ldc 108
    //   252: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: aload_3
    //   256: astore_0
    //   257: goto -192 -> 65
    //   260: astore_0
    //   261: ldc 2
    //   263: monitorexit
    //   264: ldc 108
    //   266: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   269: aload_0
    //   270: athrow
    //   271: aload 4
    //   273: iconst_1
    //   274: invokeinterface 153 2 0
    //   279: astore_3
    //   280: aload_3
    //   281: astore_0
    //   282: aload_3
    //   283: ifnull +15 -> 298
    //   286: aload_3
    //   287: astore_0
    //   288: aload_3
    //   289: aconst_null
    //   290: invokevirtual 156	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   293: ifeq +5 -> 298
    //   296: aconst_null
    //   297: astore_0
    //   298: aload 6
    //   300: aload_1
    //   301: aload_0
    //   302: invokestatic 146	com/google/android/gms/internal/measurement/zzwn:zza	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   305: aload_2
    //   306: astore_1
    //   307: aload_0
    //   308: ifnull +5 -> 313
    //   311: aload_0
    //   312: astore_1
    //   313: aload 4
    //   315: ifnull +10 -> 325
    //   318: aload 4
    //   320: invokeinterface 149 1 0
    //   325: ldc 108
    //   327: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   330: aload_1
    //   331: astore_0
    //   332: goto -267 -> 65
    //   335: astore_0
    //   336: aload 4
    //   338: ifnull +10 -> 348
    //   341: aload 4
    //   343: invokeinterface 149 1 0
    //   348: ldc 108
    //   350: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   353: aload_0
    //   354: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   18	48	260	finally
    //   57	60	260	finally
    //   67	77	260	finally
    //   87	114	260	finally
    //   114	154	260	finally
    //   163	166	260	finally
    //   174	177	260	finally
    //   193	196	260	finally
    //   261	264	260	finally
    //   221	231	335	finally
    //   231	238	335	finally
    //   271	280	335	finally
    //   288	296	335	finally
    //   298	305	335	finally
  }

  private static Map<String, String> zza(ContentResolver paramContentResolver, String[] paramArrayOfString)
  {
    AppMethodBeat.i(69748);
    paramContentResolver = paramContentResolver.query(zzbmh, null, null, paramArrayOfString, null);
    paramArrayOfString = new TreeMap();
    if (paramContentResolver == null)
      AppMethodBeat.o(69748);
    while (true)
    {
      return paramArrayOfString;
      try
      {
        if (paramContentResolver.moveToNext())
          paramArrayOfString.put(paramContentResolver.getString(0), paramContentResolver.getString(1));
      }
      finally
      {
        paramContentResolver.close();
        AppMethodBeat.o(69748);
      }
    }
  }

  private static void zza(ContentResolver paramContentResolver)
  {
    AppMethodBeat.i(69744);
    if (zzbml == null)
    {
      zzbmk.set(false);
      zzbml = new HashMap();
      zzbmq = new Object();
      zzbmr = false;
      paramContentResolver.registerContentObserver(CONTENT_URI, true, new zzwo(null));
      AppMethodBeat.o(69744);
    }
    while (true)
    {
      return;
      if (zzbmk.getAndSet(false))
      {
        zzbml.clear();
        zzbmm.clear();
        zzbmn.clear();
        zzbmo.clear();
        zzbmp.clear();
        zzbmq = new Object();
        zzbmr = false;
      }
      AppMethodBeat.o(69744);
    }
  }

  private static void zza(Object paramObject, String paramString1, String paramString2)
  {
    AppMethodBeat.i(69746);
    try
    {
      if (paramObject == zzbmq)
        zzbml.put(paramString1, paramString2);
      return;
    }
    finally
    {
      AppMethodBeat.o(69746);
    }
    throw paramObject;
  }

  public static boolean zza(ContentResolver paramContentResolver, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(69747);
    Object localObject1 = zzb(paramContentResolver);
    Object localObject2 = (Boolean)zza(zzbmm, paramString, Boolean.valueOf(paramBoolean));
    boolean bool;
    if (localObject2 != null)
    {
      bool = ((Boolean)localObject2).booleanValue();
      AppMethodBeat.o(69747);
    }
    while (true)
    {
      return bool;
      String str = zza(paramContentResolver, paramString, null);
      paramContentResolver = (ContentResolver)localObject2;
      bool = paramBoolean;
      if (str != null)
      {
        if (str.equals(""))
        {
          bool = paramBoolean;
          paramContentResolver = (ContentResolver)localObject2;
        }
      }
      else
        label81: localObject2 = zzbmm;
      try
      {
        if (localObject1 == zzbmq)
        {
          ((HashMap)localObject2).put(paramString, paramContentResolver);
          zzbml.remove(paramString);
        }
        AppMethodBeat.o(69747);
        continue;
        if (zzbmi.matcher(str).matches())
        {
          bool = true;
          paramContentResolver = Boolean.TRUE;
          break label81;
        }
        if (zzbmj.matcher(str).matches())
        {
          bool = false;
          paramContentResolver = Boolean.FALSE;
          break label81;
        }
        new StringBuilder("attempt to read gservices key ").append(paramString).append(" (value \"").append(str).append("\") as boolean");
        paramContentResolver = (ContentResolver)localObject2;
        bool = paramBoolean;
        break label81;
      }
      finally
      {
        AppMethodBeat.o(69747);
      }
    }
    throw paramContentResolver;
  }

  private static Object zzb(ContentResolver paramContentResolver)
  {
    AppMethodBeat.i(69749);
    try
    {
      zza(paramContentResolver);
      paramContentResolver = zzbmq;
      return paramContentResolver;
    }
    finally
    {
      AppMethodBeat.o(69749);
    }
    throw paramContentResolver;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzwn
 * JD-Core Version:    0.6.2
 */