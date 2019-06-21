package com.google.android.gms.internal.stable;

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

public class zzi
{
  private static final Uri CONTENT_URI;
  private static HashMap<String, String> zzagq;
  private static final Uri zzagv;
  private static final Pattern zzagw;
  private static final Pattern zzagx;
  private static final AtomicBoolean zzagy;
  private static final HashMap<String, Boolean> zzagz;
  private static final HashMap<String, Integer> zzaha;
  private static final HashMap<String, Long> zzahb;
  private static final HashMap<String, Float> zzahc;
  private static Object zzahd;
  private static boolean zzahe;
  private static String[] zzahf;

  static
  {
    AppMethodBeat.i(90491);
    CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    zzagv = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    zzagw = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    zzagx = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    zzagy = new AtomicBoolean();
    zzagz = new HashMap();
    zzaha = new HashMap();
    zzahb = new HashMap();
    zzahc = new HashMap();
    zzahf = new String[0];
    AppMethodBeat.o(90491);
  }

  public static int getInt(ContentResolver paramContentResolver, String paramString, int paramInt)
  {
    AppMethodBeat.i(90484);
    Object localObject = zzb(paramContentResolver);
    Integer localInteger = (Integer)zza(zzaha, paramString, Integer.valueOf(paramInt));
    if (localInteger != null)
    {
      paramInt = localInteger.intValue();
      AppMethodBeat.o(90484);
      return paramInt;
    }
    paramContentResolver = zza(paramContentResolver, paramString, null);
    if (paramContentResolver == null)
      paramContentResolver = localInteger;
    while (true)
    {
      zza(localObject, zzaha, paramString, paramContentResolver);
      AppMethodBeat.o(90484);
      break;
      try
      {
        int i = Integer.parseInt(paramContentResolver);
        paramContentResolver = Integer.valueOf(i);
        paramInt = i;
      }
      catch (NumberFormatException paramContentResolver)
      {
        paramContentResolver = localInteger;
      }
    }
  }

  public static long getLong(ContentResolver paramContentResolver, String paramString, long paramLong)
  {
    AppMethodBeat.i(90485);
    Object localObject = zzb(paramContentResolver);
    Long localLong = (Long)zza(zzahb, paramString, Long.valueOf(paramLong));
    if (localLong != null)
    {
      paramLong = localLong.longValue();
      AppMethodBeat.o(90485);
      return paramLong;
    }
    paramContentResolver = zza(paramContentResolver, paramString, null);
    if (paramContentResolver == null)
      paramContentResolver = localLong;
    while (true)
    {
      zza(localObject, zzahb, paramString, paramContentResolver);
      AppMethodBeat.o(90485);
      break;
      try
      {
        long l = Long.parseLong(paramContentResolver);
        paramContentResolver = Long.valueOf(l);
        paramLong = l;
      }
      catch (NumberFormatException paramContentResolver)
      {
        paramContentResolver = localLong;
      }
    }
  }

  private static <T> T zza(HashMap<String, T> paramHashMap, String paramString, T paramT)
  {
    AppMethodBeat.i(90489);
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
        AppMethodBeat.o(90489);
      }
    }
    finally
    {
      AppMethodBeat.o(90489);
    }
    throw paramHashMap;
  }

  // ERROR //
  public static String zza(ContentResolver paramContentResolver, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 154
    //   2: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 2
    //   7: monitorenter
    //   8: aload_0
    //   9: invokestatic 157	com/google/android/gms/internal/stable/zzi:zza	(Landroid/content/ContentResolver;)V
    //   12: getstatic 159	com/google/android/gms/internal/stable/zzi:zzahd	Ljava/lang/Object;
    //   15: astore_3
    //   16: getstatic 161	com/google/android/gms/internal/stable/zzi:zzagq	Ljava/util/HashMap;
    //   19: aload_1
    //   20: invokevirtual 147	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   23: ifeq +30 -> 53
    //   26: getstatic 161	com/google/android/gms/internal/stable/zzi:zzagq	Ljava/util/HashMap;
    //   29: aload_1
    //   30: invokevirtual 151	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   33: checkcast 86	java/lang/String
    //   36: astore_0
    //   37: aload_0
    //   38: ifnull +5 -> 43
    //   41: aload_0
    //   42: astore_2
    //   43: ldc 2
    //   45: monitorexit
    //   46: ldc 154
    //   48: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   51: aload_2
    //   52: areturn
    //   53: getstatic 88	com/google/android/gms/internal/stable/zzi:zzahf	[Ljava/lang/String;
    //   56: astore 4
    //   58: aload 4
    //   60: arraylength
    //   61: istore 5
    //   63: iconst_0
    //   64: istore 6
    //   66: iload 6
    //   68: iload 5
    //   70: if_icmpge +106 -> 176
    //   73: aload_1
    //   74: aload 4
    //   76: iload 6
    //   78: aaload
    //   79: invokevirtual 165	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   82: ifeq +88 -> 170
    //   85: getstatic 167	com/google/android/gms/internal/stable/zzi:zzahe	Z
    //   88: ifeq +12 -> 100
    //   91: getstatic 161	com/google/android/gms/internal/stable/zzi:zzagq	Ljava/util/HashMap;
    //   94: invokevirtual 171	java/util/HashMap:isEmpty	()Z
    //   97: ifeq +62 -> 159
    //   100: getstatic 88	com/google/android/gms/internal/stable/zzi:zzahf	[Ljava/lang/String;
    //   103: astore 4
    //   105: getstatic 161	com/google/android/gms/internal/stable/zzi:zzagq	Ljava/util/HashMap;
    //   108: aload_0
    //   109: aload 4
    //   111: invokestatic 174	com/google/android/gms/internal/stable/zzi:zza	(Landroid/content/ContentResolver;[Ljava/lang/String;)Ljava/util/Map;
    //   114: invokevirtual 178	java/util/HashMap:putAll	(Ljava/util/Map;)V
    //   117: iconst_1
    //   118: putstatic 167	com/google/android/gms/internal/stable/zzi:zzahe	Z
    //   121: getstatic 161	com/google/android/gms/internal/stable/zzi:zzagq	Ljava/util/HashMap;
    //   124: aload_1
    //   125: invokevirtual 147	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   128: ifeq +31 -> 159
    //   131: getstatic 161	com/google/android/gms/internal/stable/zzi:zzagq	Ljava/util/HashMap;
    //   134: aload_1
    //   135: invokevirtual 151	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   138: checkcast 86	java/lang/String
    //   141: astore_0
    //   142: aload_0
    //   143: ifnull +5 -> 148
    //   146: aload_0
    //   147: astore_2
    //   148: ldc 2
    //   150: monitorexit
    //   151: ldc 154
    //   153: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   156: goto -105 -> 51
    //   159: ldc 2
    //   161: monitorexit
    //   162: ldc 154
    //   164: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: goto -116 -> 51
    //   170: iinc 6 1
    //   173: goto -107 -> 66
    //   176: ldc 2
    //   178: monitorexit
    //   179: aload_0
    //   180: getstatic 48	com/google/android/gms/internal/stable/zzi:CONTENT_URI	Landroid/net/Uri;
    //   183: aconst_null
    //   184: aconst_null
    //   185: iconst_1
    //   186: anewarray 86	java/lang/String
    //   189: dup
    //   190: iconst_0
    //   191: aload_1
    //   192: aastore
    //   193: aconst_null
    //   194: invokevirtual 184	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   197: astore 7
    //   199: aload 7
    //   201: ifnull +13 -> 214
    //   204: aload 7
    //   206: invokeinterface 189 1 0
    //   211: ifne +40 -> 251
    //   214: aload_3
    //   215: aload_1
    //   216: aconst_null
    //   217: invokestatic 192	com/google/android/gms/internal/stable/zzi:zza	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   220: aload 7
    //   222: ifnull +10 -> 232
    //   225: aload 7
    //   227: invokeinterface 195 1 0
    //   232: ldc 154
    //   234: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: goto -186 -> 51
    //   240: astore_0
    //   241: ldc 2
    //   243: monitorexit
    //   244: ldc 154
    //   246: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   249: aload_0
    //   250: athrow
    //   251: aload 7
    //   253: iconst_1
    //   254: invokeinterface 199 2 0
    //   259: astore 4
    //   261: aload 4
    //   263: astore_0
    //   264: aload 4
    //   266: ifnull +17 -> 283
    //   269: aload 4
    //   271: astore_0
    //   272: aload 4
    //   274: aload_2
    //   275: invokevirtual 202	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   278: ifeq +5 -> 283
    //   281: aload_2
    //   282: astore_0
    //   283: aload_3
    //   284: aload_1
    //   285: aload_0
    //   286: invokestatic 192	com/google/android/gms/internal/stable/zzi:zza	(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    //   289: aload_0
    //   290: ifnull +5 -> 295
    //   293: aload_0
    //   294: astore_2
    //   295: aload 7
    //   297: ifnull +10 -> 307
    //   300: aload 7
    //   302: invokeinterface 195 1 0
    //   307: ldc 154
    //   309: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   312: goto -261 -> 51
    //   315: astore_0
    //   316: aload 7
    //   318: ifnull +10 -> 328
    //   321: aload 7
    //   323: invokeinterface 195 1 0
    //   328: ldc 154
    //   330: invokestatic 91	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   333: aload_0
    //   334: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   8	37	240	finally
    //   43	46	240	finally
    //   53	63	240	finally
    //   73	100	240	finally
    //   100	142	240	finally
    //   148	151	240	finally
    //   159	162	240	finally
    //   176	179	240	finally
    //   241	244	240	finally
    //   204	214	315	finally
    //   214	220	315	finally
    //   251	261	315	finally
    //   272	281	315	finally
    //   283	289	315	finally
  }

  private static Map<String, String> zza(ContentResolver paramContentResolver, String[] paramArrayOfString)
  {
    AppMethodBeat.i(90487);
    paramContentResolver = paramContentResolver.query(zzagv, null, null, paramArrayOfString, null);
    paramArrayOfString = new TreeMap();
    if (paramContentResolver == null)
      AppMethodBeat.o(90487);
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
        AppMethodBeat.o(90487);
      }
    }
  }

  private static void zza(ContentResolver paramContentResolver)
  {
    AppMethodBeat.i(90481);
    if (zzagq == null)
    {
      zzagy.set(false);
      zzagq = new HashMap();
      zzahd = new Object();
      zzahe = false;
      paramContentResolver.registerContentObserver(CONTENT_URI, true, new zzj(null));
      AppMethodBeat.o(90481);
    }
    while (true)
    {
      return;
      if (zzagy.getAndSet(false))
      {
        zzagq.clear();
        zzagz.clear();
        zzaha.clear();
        zzahb.clear();
        zzahc.clear();
        zzahd = new Object();
        zzahe = false;
      }
      AppMethodBeat.o(90481);
    }
  }

  private static void zza(Object paramObject, String paramString1, String paramString2)
  {
    AppMethodBeat.i(90483);
    try
    {
      if (paramObject == zzahd)
        zzagq.put(paramString1, paramString2);
      return;
    }
    finally
    {
      AppMethodBeat.o(90483);
    }
    throw paramObject;
  }

  private static <T> void zza(Object paramObject, HashMap<String, T> paramHashMap, String paramString, T paramT)
  {
    AppMethodBeat.i(90490);
    try
    {
      if (paramObject == zzahd)
      {
        paramHashMap.put(paramString, paramT);
        zzagq.remove(paramString);
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(90490);
    }
    throw paramObject;
  }

  public static boolean zza(ContentResolver paramContentResolver, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(90486);
    Object localObject = zzb(paramContentResolver);
    Boolean localBoolean = (Boolean)zza(zzagz, paramString, Boolean.valueOf(paramBoolean));
    if (localBoolean != null)
    {
      bool = localBoolean.booleanValue();
      AppMethodBeat.o(90486);
      return bool;
    }
    String str = zza(paramContentResolver, paramString, null);
    paramContentResolver = localBoolean;
    boolean bool = paramBoolean;
    if (str != null)
    {
      if (!str.equals(""))
        break label98;
      bool = paramBoolean;
      paramContentResolver = localBoolean;
    }
    while (true)
    {
      zza(localObject, zzagz, paramString, paramContentResolver);
      AppMethodBeat.o(90486);
      break;
      label98: if (zzagw.matcher(str).matches())
      {
        bool = true;
        paramContentResolver = Boolean.TRUE;
      }
      else if (zzagx.matcher(str).matches())
      {
        bool = false;
        paramContentResolver = Boolean.FALSE;
      }
      else
      {
        new StringBuilder("attempt to read gservices key ").append(paramString).append(" (value \"").append(str).append("\") as boolean");
        paramContentResolver = localBoolean;
        bool = paramBoolean;
      }
    }
  }

  private static Object zzb(ContentResolver paramContentResolver)
  {
    AppMethodBeat.i(90488);
    try
    {
      zza(paramContentResolver);
      paramContentResolver = zzahd;
      return paramContentResolver;
    }
    finally
    {
      AppMethodBeat.o(90488);
    }
    throw paramContentResolver;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.stable.zzi
 * JD-Core Version:    0.6.2
 */