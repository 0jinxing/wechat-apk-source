package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

public final class CrashUtils
{
  private static final String[] zzzc = { "android.", "com.android.", "dalvik.", "java.", "javax." };
  private static DropBoxManager zzzd = null;
  private static boolean zzze = false;
  private static boolean zzzf;
  private static boolean zzzg;
  private static int zzzh = -1;

  @GuardedBy("CrashUtils.class")
  private static int zzzi = 0;

  @GuardedBy("CrashUtils.class")
  private static int zzzj = 0;

  public static boolean addDynamiteErrorToDropBox(Context paramContext, Throwable paramThrowable)
  {
    AppMethodBeat.i(90135);
    boolean bool = addErrorToDropBoxInternal(paramContext, paramThrowable, 536870912);
    AppMethodBeat.o(90135);
    return bool;
  }

  @Deprecated
  public static boolean addErrorToDropBox(Context paramContext, Throwable paramThrowable)
  {
    AppMethodBeat.i(90136);
    boolean bool = addDynamiteErrorToDropBox(paramContext, paramThrowable);
    AppMethodBeat.o(90136);
    return bool;
  }

  public static boolean addErrorToDropBoxInternal(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(90138);
    boolean bool = zza(paramContext, paramString1, paramString2, paramInt, null);
    AppMethodBeat.o(90138);
    return bool;
  }

  public static boolean addErrorToDropBoxInternal(Context paramContext, Throwable paramThrowable, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(90137);
    try
    {
      Preconditions.checkNotNull(paramContext);
      Preconditions.checkNotNull(paramThrowable);
      bool2 = isPackageSide();
      if (!bool2)
      {
        AppMethodBeat.o(90137);
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        Throwable localThrowable = paramThrowable;
        if (!zzdb())
        {
          paramThrowable = zza(paramThrowable);
          localThrowable = paramThrowable;
          if (paramThrowable == null)
          {
            AppMethodBeat.o(90137);
            bool2 = bool1;
          }
        }
        else
        {
          bool2 = zza(paramContext, Log.getStackTraceString(localThrowable), ProcessUtils.getMyProcessName(), paramInt, localThrowable);
          AppMethodBeat.o(90137);
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        try
        {
          bool2 = zzdb();
          if (bool2)
          {
            AppMethodBeat.o(90137);
            throw paramContext;
          }
        }
        catch (Exception paramThrowable)
        {
          boolean bool2 = false;
          continue;
          AppMethodBeat.o(90137);
          bool2 = bool1;
        }
    }
  }

  private static boolean isPackageSide()
  {
    if (zzze);
    for (boolean bool = zzzf; ; bool = false)
      return bool;
  }

  public static boolean isSystemClassPrefixInternal(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(90140);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(90140);
    while (true)
    {
      return bool;
      String[] arrayOfString = zzzc;
      int i = arrayOfString.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label64;
        if (paramString.startsWith(arrayOfString[j]))
        {
          bool = true;
          AppMethodBeat.o(90140);
          break;
        }
      }
      label64: AppMethodBeat.o(90140);
    }
  }

  @VisibleForTesting
  public static void setTestVariables(DropBoxManager paramDropBoxManager, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    try
    {
      zzze = true;
      zzzd = paramDropBoxManager;
      zzzg = paramBoolean1;
      zzzf = paramBoolean2;
      zzzh = paramInt;
      zzzi = 0;
      zzzj = 0;
      return;
    }
    finally
    {
      paramDropBoxManager = finally;
    }
    throw paramDropBoxManager;
  }

  // ERROR //
  @VisibleForTesting
  private static String zza(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 136
    //   5: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 138	java/lang/StringBuilder
    //   11: astore 4
    //   13: aload 4
    //   15: sipush 1024
    //   18: invokespecial 140	java/lang/StringBuilder:<init>	(I)V
    //   21: aload 4
    //   23: ldc 142
    //   25: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload_2
    //   29: invokestatic 152	com/google/android/gms/common/util/Strings:nullToEmpty	(Ljava/lang/String;)Ljava/lang/String;
    //   32: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc 154
    //   37: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: aload 4
    //   43: ldc 156
    //   45: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: ldc 157
    //   51: istore 5
    //   53: ldc 159
    //   55: astore 6
    //   57: invokestatic 97	com/google/android/gms/common/util/CrashUtils:zzdb	()Z
    //   60: istore 7
    //   62: aload 6
    //   64: astore_2
    //   65: iload 5
    //   67: istore 8
    //   69: iload 7
    //   71: ifeq +65 -> 136
    //   74: iload 5
    //   76: istore 9
    //   78: aload_0
    //   79: invokestatic 165	com/google/android/gms/common/wrappers/Wrappers:packageManager	(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;
    //   82: aload_0
    //   83: invokevirtual 170	android/content/Context:getPackageName	()Ljava/lang/String;
    //   86: iconst_0
    //   87: invokevirtual 176	com/google/android/gms/common/wrappers/PackageManagerWrapper:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   90: astore 10
    //   92: iload 5
    //   94: istore 9
    //   96: aload 10
    //   98: getfield 181	android/content/pm/PackageInfo:versionCode	I
    //   101: istore 5
    //   103: aload 6
    //   105: astore_2
    //   106: iload 5
    //   108: istore 8
    //   110: iload 5
    //   112: istore 9
    //   114: aload 10
    //   116: getfield 185	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   119: ifnull +17 -> 136
    //   122: iload 5
    //   124: istore 9
    //   126: aload 10
    //   128: getfield 185	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   131: astore_2
    //   132: iload 5
    //   134: istore 8
    //   136: aload 4
    //   138: ldc 187
    //   140: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: iload 8
    //   145: invokevirtual 190	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: aload_2
    //   150: invokestatic 123	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   153: ifne +80 -> 233
    //   156: aload_2
    //   157: astore 6
    //   159: aload_2
    //   160: ldc 192
    //   162: invokevirtual 195	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   165: ifeq +50 -> 215
    //   168: aload_2
    //   169: astore 6
    //   171: aload_2
    //   172: ldc 197
    //   174: invokevirtual 195	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   177: ifne +38 -> 215
    //   180: aload_2
    //   181: astore 6
    //   183: aload_2
    //   184: ldc 199
    //   186: invokevirtual 202	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   189: ifeq +14 -> 203
    //   192: aload_2
    //   193: invokestatic 206	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   196: ldc 208
    //   198: invokevirtual 211	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   201: astore 6
    //   203: aload 6
    //   205: invokestatic 206	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   208: ldc 197
    //   210: invokevirtual 211	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   213: astore 6
    //   215: aload 4
    //   217: ldc 213
    //   219: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: aload 6
    //   224: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: ldc 197
    //   229: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: aload 4
    //   235: ldc 154
    //   237: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: aload 4
    //   243: ldc 215
    //   245: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: getstatic 220	android/os/Build:FINGERPRINT	Ljava/lang/String;
    //   251: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: ldc 154
    //   256: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: invokestatic 225	android/os/Debug:isDebuggerConnected	()Z
    //   263: ifeq +11 -> 274
    //   266: aload 4
    //   268: ldc 227
    //   270: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: iload_3
    //   275: ifeq +20 -> 295
    //   278: aload 4
    //   280: ldc 229
    //   282: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: iload_3
    //   286: invokevirtual 190	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   289: ldc 154
    //   291: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: pop
    //   295: aload 4
    //   297: ldc 154
    //   299: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: pop
    //   303: aload_1
    //   304: invokestatic 123	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   307: ifne +10 -> 317
    //   310: aload 4
    //   312: aload_1
    //   313: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   316: pop
    //   317: invokestatic 97	com/google/android/gms/common/util/CrashUtils:zzdb	()Z
    //   320: ifeq +291 -> 611
    //   323: getstatic 44	com/google/android/gms/common/util/CrashUtils:zzzh	I
    //   326: iflt +194 -> 520
    //   329: getstatic 44	com/google/android/gms/common/util/CrashUtils:zzzh	I
    //   332: istore_3
    //   333: iload_3
    //   334: ifle +170 -> 504
    //   337: aload 4
    //   339: ldc 154
    //   341: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: pop
    //   345: new 231	java/lang/ProcessBuilder
    //   348: astore_0
    //   349: aload_0
    //   350: bipush 13
    //   352: anewarray 26	java/lang/String
    //   355: dup
    //   356: iconst_0
    //   357: ldc 233
    //   359: aastore
    //   360: dup
    //   361: iconst_1
    //   362: ldc 235
    //   364: aastore
    //   365: dup
    //   366: iconst_2
    //   367: ldc 237
    //   369: aastore
    //   370: dup
    //   371: iconst_3
    //   372: ldc 239
    //   374: aastore
    //   375: dup
    //   376: iconst_4
    //   377: ldc 241
    //   379: aastore
    //   380: dup
    //   381: iconst_5
    //   382: ldc 239
    //   384: aastore
    //   385: dup
    //   386: bipush 6
    //   388: ldc 243
    //   390: aastore
    //   391: dup
    //   392: bipush 7
    //   394: ldc 239
    //   396: aastore
    //   397: dup
    //   398: bipush 8
    //   400: ldc 245
    //   402: aastore
    //   403: dup
    //   404: bipush 9
    //   406: ldc 239
    //   408: aastore
    //   409: dup
    //   410: bipush 10
    //   412: ldc 247
    //   414: aastore
    //   415: dup
    //   416: bipush 11
    //   418: ldc 249
    //   420: aastore
    //   421: dup
    //   422: bipush 12
    //   424: iload_3
    //   425: invokestatic 252	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   428: aastore
    //   429: invokespecial 255	java/lang/ProcessBuilder:<init>	([Ljava/lang/String;)V
    //   432: aload_0
    //   433: iconst_1
    //   434: invokevirtual 259	java/lang/ProcessBuilder:redirectErrorStream	(Z)Ljava/lang/ProcessBuilder;
    //   437: invokevirtual 263	java/lang/ProcessBuilder:start	()Ljava/lang/Process;
    //   440: astore_1
    //   441: aload_1
    //   442: invokevirtual 269	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   445: invokevirtual 274	java/io/OutputStream:close	()V
    //   448: aload_1
    //   449: invokevirtual 278	java/lang/Process:getErrorStream	()Ljava/io/InputStream;
    //   452: invokevirtual 281	java/io/InputStream:close	()V
    //   455: new 283	java/io/InputStreamReader
    //   458: astore_0
    //   459: aload_0
    //   460: aload_1
    //   461: invokevirtual 286	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   464: invokespecial 289	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   467: sipush 8192
    //   470: newarray char
    //   472: astore_1
    //   473: aload_0
    //   474: aload_1
    //   475: invokevirtual 293	java/io/InputStreamReader:read	([C)I
    //   478: istore_3
    //   479: iload_3
    //   480: ifle +55 -> 535
    //   483: aload 4
    //   485: aload_1
    //   486: iconst_0
    //   487: iload_3
    //   488: invokevirtual 296	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   491: pop
    //   492: goto -19 -> 473
    //   495: astore_1
    //   496: aload_0
    //   497: ifnull +7 -> 504
    //   500: aload_0
    //   501: invokevirtual 297	java/io/InputStreamReader:close	()V
    //   504: aload 4
    //   506: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   509: astore_0
    //   510: ldc 136
    //   512: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   515: ldc 2
    //   517: monitorexit
    //   518: aload_0
    //   519: areturn
    //   520: aload_0
    //   521: invokevirtual 304	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   524: ldc_w 306
    //   527: iconst_0
    //   528: invokestatic 312	android/provider/Settings$Secure:getInt	(Landroid/content/ContentResolver;Ljava/lang/String;I)I
    //   531: istore_3
    //   532: goto -199 -> 333
    //   535: aload_0
    //   536: invokevirtual 297	java/io/InputStreamReader:close	()V
    //   539: goto -35 -> 504
    //   542: astore_0
    //   543: goto -39 -> 504
    //   546: astore_0
    //   547: aconst_null
    //   548: astore_1
    //   549: aload_1
    //   550: ifnull +7 -> 557
    //   553: aload_1
    //   554: invokevirtual 297	java/io/InputStreamReader:close	()V
    //   557: ldc 136
    //   559: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   562: aload_0
    //   563: athrow
    //   564: astore_0
    //   565: ldc 2
    //   567: monitorexit
    //   568: aload_0
    //   569: athrow
    //   570: astore_0
    //   571: goto -67 -> 504
    //   574: astore_1
    //   575: goto -18 -> 557
    //   578: astore_2
    //   579: aload_0
    //   580: astore_1
    //   581: aload_2
    //   582: astore_0
    //   583: goto -34 -> 549
    //   586: astore_0
    //   587: aconst_null
    //   588: astore_0
    //   589: goto -93 -> 496
    //   592: astore_0
    //   593: goto -138 -> 455
    //   596: astore_0
    //   597: goto -149 -> 448
    //   600: astore_2
    //   601: aload 6
    //   603: astore_2
    //   604: iload 9
    //   606: istore 8
    //   608: goto -472 -> 136
    //   611: iconst_0
    //   612: istore_3
    //   613: goto -280 -> 333
    //
    // Exception table:
    //   from	to	target	type
    //   467	473	495	java/io/IOException
    //   473	479	495	java/io/IOException
    //   483	492	495	java/io/IOException
    //   535	539	542	java/io/IOException
    //   345	441	546	finally
    //   441	448	546	finally
    //   448	455	546	finally
    //   455	467	546	finally
    //   3	49	564	finally
    //   57	62	564	finally
    //   78	92	564	finally
    //   96	103	564	finally
    //   114	122	564	finally
    //   126	132	564	finally
    //   136	156	564	finally
    //   159	168	564	finally
    //   171	180	564	finally
    //   183	203	564	finally
    //   203	215	564	finally
    //   215	233	564	finally
    //   233	274	564	finally
    //   278	295	564	finally
    //   295	317	564	finally
    //   317	333	564	finally
    //   337	345	564	finally
    //   500	504	564	finally
    //   504	515	564	finally
    //   520	532	564	finally
    //   535	539	564	finally
    //   553	557	564	finally
    //   557	564	564	finally
    //   500	504	570	java/io/IOException
    //   553	557	574	java/io/IOException
    //   467	473	578	finally
    //   473	479	578	finally
    //   483	492	578	finally
    //   345	441	586	java/io/IOException
    //   455	467	586	java/io/IOException
    //   448	455	592	java/io/IOException
    //   441	448	596	java/io/IOException
    //   78	92	600	java/lang/Exception
    //   96	103	600	java/lang/Exception
    //   114	122	600	java/lang/Exception
    //   126	132	600	java/lang/Exception
  }

  @VisibleForTesting
  private static Throwable zza(Throwable paramThrowable)
  {
    try
    {
      AppMethodBeat.i(90141);
      LinkedList localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      while (paramThrowable != null)
      {
        localLinkedList.push(paramThrowable);
        paramThrowable = paramThrowable.getCause();
      }
      paramThrowable = null;
      int i = 0;
      if (!localLinkedList.isEmpty())
      {
        Throwable localThrowable = (Throwable)localLinkedList.pop();
        StackTraceElement[] arrayOfStackTraceElement = localThrowable.getStackTrace();
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Object localObject = new java/lang/StackTraceElement;
        ((StackTraceElement)localObject).<init>(localThrowable.getClass().getName(), "<filtered>", "<filtered>", 1);
        localArrayList.add(localObject);
        int j = arrayOfStackTraceElement.length;
        int k = 0;
        if (k < j)
        {
          localThrowable = arrayOfStackTraceElement[k];
          String str = localThrowable.getClassName();
          localObject = localThrowable.getFileName();
          if ((!TextUtils.isEmpty((CharSequence)localObject)) && (((String)localObject).startsWith(":com.google.android.gms")));
          for (int m = 1; ; m = 0)
          {
            i |= m;
            localObject = localThrowable;
            if (m == 0)
            {
              localObject = localThrowable;
              if (!isSystemClassPrefixInternal(str))
              {
                localObject = new java/lang/StackTraceElement;
                ((StackTraceElement)localObject).<init>("<filtered>", "<filtered>", "<filtered>", 1);
              }
            }
            localArrayList.add(localObject);
            k++;
            break;
          }
        }
        if (paramThrowable == null)
        {
          paramThrowable = new java/lang/Throwable;
          paramThrowable.<init>("<filtered>");
        }
        while (true)
        {
          paramThrowable.setStackTrace((StackTraceElement[])localArrayList.toArray(new StackTraceElement[0]));
          break;
          paramThrowable = new Throwable("<filtered>", paramThrowable);
        }
      }
      if (i == 0)
      {
        paramThrowable = null;
        AppMethodBeat.o(90141);
      }
      while (true)
      {
        return paramThrowable;
        AppMethodBeat.o(90141);
      }
    }
    finally
    {
    }
    throw paramThrowable;
  }

  private static boolean zza(Context paramContext, String paramString1, String paramString2, int paramInt, Throwable paramThrowable)
  {
    try
    {
      AppMethodBeat.i(90139);
      Preconditions.checkNotNull(paramContext);
      boolean bool;
      if ((!isPackageSide()) || (Strings.isEmptyOrWhitespace(paramString1)))
      {
        AppMethodBeat.o(90139);
        bool = false;
      }
      while (true)
      {
        return bool;
        int i = paramString1.hashCode();
        if (paramThrowable == null);
        for (int j = zzzj; ; j = paramThrowable.hashCode())
        {
          if ((zzzi != i) || (zzzj != j))
            break label96;
          AppMethodBeat.o(90139);
          bool = false;
          break;
        }
        label96: zzzi = i;
        zzzj = j;
        if (zzzd != null);
        for (paramThrowable = zzzd; ; paramThrowable = (DropBoxManager)paramContext.getSystemService("dropbox"))
        {
          if ((paramThrowable != null) && (paramThrowable.isTagEnabled("system_app_crash")))
            break label160;
          AppMethodBeat.o(90139);
          bool = false;
          break;
        }
        label160: paramThrowable.addText("system_app_crash", zza(paramContext, paramString1, paramString2, paramInt));
        bool = true;
        AppMethodBeat.o(90139);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  private static boolean zzdb()
  {
    if (zzze);
    for (boolean bool = zzzg; ; bool = false)
      return bool;
  }

  @Retention(RetentionPolicy.SOURCE)
  public static @interface ErrorDialogData
  {
    public static final int AVG_CRASH_FREQ = 2;
    public static final int BINDER_CRASH = 268435456;
    public static final int DYNAMITE_CRASH = 536870912;
    public static final int FORCED_SHUSHED_BY_WRAPPER = 4;
    public static final int NONE = 0;
    public static final int POPUP_FREQ = 1;
    public static final int SUPPRESSED = 1073741824;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.CrashUtils
 * JD-Core Version:    0.6.2
 */