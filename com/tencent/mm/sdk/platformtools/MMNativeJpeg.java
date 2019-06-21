package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.e;
import java.io.PrintWriter;
import java.io.StringWriter;

public class MMNativeJpeg
{
  public static final int FAKE_PARTIAL_PROGRESSIVE_QUALITY = 25;
  public static final String TAG = "MMJPEG.JAVA";

  // ERROR //
  public static boolean Convert2Baseline(String paramString, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc 23
    //   4: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokestatic 33	com/tencent/mm/sdk/platformtools/MMNativeJpeg:isProgressive	(Ljava/lang/String;)Z
    //   11: ifne +25 -> 36
    //   14: ldc 11
    //   16: ldc 35
    //   18: iconst_1
    //   19: anewarray 4	java/lang/Object
    //   22: dup
    //   23: iconst_0
    //   24: aload_0
    //   25: aastore
    //   26: invokestatic 41	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   29: ldc 23
    //   31: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: iload_2
    //   35: ireturn
    //   36: aconst_null
    //   37: astore_3
    //   38: aconst_null
    //   39: astore 4
    //   41: aconst_null
    //   42: astore 5
    //   44: aconst_null
    //   45: astore 6
    //   47: aload_3
    //   48: astore 7
    //   50: aload 4
    //   52: astore 8
    //   54: aload 5
    //   56: astore 9
    //   58: aload_0
    //   59: invokestatic 50	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   62: astore 10
    //   64: aload 10
    //   66: astore 11
    //   68: aload 10
    //   70: ifnonnull +38 -> 108
    //   73: aload_3
    //   74: astore 7
    //   76: aload 4
    //   78: astore 8
    //   80: aload 5
    //   82: astore 9
    //   84: ldc 11
    //   86: ldc 52
    //   88: invokestatic 55	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_3
    //   92: astore 7
    //   94: aload 4
    //   96: astore 8
    //   98: aload 5
    //   100: astore 9
    //   102: aload_0
    //   103: invokestatic 58	com/tencent/mm/sdk/platformtools/MMNativeJpeg:decodeAsBitmap	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   106: astore 11
    //   108: aload 11
    //   110: ifnull +178 -> 288
    //   113: aload_3
    //   114: astore 7
    //   116: aload 4
    //   118: astore 8
    //   120: aload 5
    //   122: astore 9
    //   124: new 60	java/lang/StringBuilder
    //   127: astore 6
    //   129: aload_3
    //   130: astore 7
    //   132: aload 4
    //   134: astore 8
    //   136: aload 5
    //   138: astore 9
    //   140: aload 6
    //   142: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   145: aload_3
    //   146: astore 7
    //   148: aload 4
    //   150: astore 8
    //   152: aload 5
    //   154: astore 9
    //   156: aload 6
    //   158: aload_0
    //   159: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: ldc 67
    //   164: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   170: astore 12
    //   172: aload_3
    //   173: astore 7
    //   175: aload 4
    //   177: astore 8
    //   179: aload 5
    //   181: astore 9
    //   183: getstatic 77	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   186: astore 10
    //   188: aload_3
    //   189: astore 7
    //   191: aload 4
    //   193: astore 8
    //   195: aload 5
    //   197: astore 9
    //   199: aload 12
    //   201: iconst_0
    //   202: invokestatic 83	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   205: astore_3
    //   206: aload_3
    //   207: astore 6
    //   209: aload_3
    //   210: astore 7
    //   212: aload_3
    //   213: astore 8
    //   215: aload_3
    //   216: astore 9
    //   218: aload 11
    //   220: aload 10
    //   222: iload_1
    //   223: aload_3
    //   224: invokevirtual 89	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   227: ifeq +61 -> 288
    //   230: aload_3
    //   231: astore 7
    //   233: aload_3
    //   234: astore 8
    //   236: aload_3
    //   237: astore 9
    //   239: ldc 11
    //   241: ldc 91
    //   243: iconst_1
    //   244: anewarray 4	java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: aload 12
    //   251: aastore
    //   252: invokestatic 93	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   255: aload_3
    //   256: astore 7
    //   258: aload_3
    //   259: astore 8
    //   261: aload_3
    //   262: astore 9
    //   264: aload 12
    //   266: aload_0
    //   267: iconst_1
    //   268: invokestatic 99	com/tencent/mm/sdk/platformtools/m:C	(Ljava/lang/String;Ljava/lang/String;Z)Z
    //   271: istore_2
    //   272: aload_3
    //   273: ifnull +7 -> 280
    //   276: aload_3
    //   277: invokevirtual 104	java/io/OutputStream:close	()V
    //   280: ldc 23
    //   282: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   285: goto -251 -> 34
    //   288: aload 6
    //   290: ifnull +8 -> 298
    //   293: aload 6
    //   295: invokevirtual 104	java/io/OutputStream:close	()V
    //   298: ldc 23
    //   300: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: iconst_0
    //   304: istore_2
    //   305: goto -271 -> 34
    //   308: astore_0
    //   309: aload 7
    //   311: astore 9
    //   313: ldc 11
    //   315: ldc 106
    //   317: iconst_1
    //   318: anewarray 4	java/lang/Object
    //   321: dup
    //   322: iconst_0
    //   323: aload_0
    //   324: invokestatic 110	com/tencent/mm/sdk/platformtools/MMNativeJpeg:exception2String	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   327: aastore
    //   328: invokestatic 41	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: aload 7
    //   333: ifnull -35 -> 298
    //   336: aload 7
    //   338: invokevirtual 104	java/io/OutputStream:close	()V
    //   341: goto -43 -> 298
    //   344: astore_0
    //   345: goto -47 -> 298
    //   348: astore_0
    //   349: aload 8
    //   351: astore 9
    //   353: ldc 11
    //   355: ldc 112
    //   357: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   360: aload 8
    //   362: ifnull -64 -> 298
    //   365: aload 8
    //   367: invokevirtual 104	java/io/OutputStream:close	()V
    //   370: goto -72 -> 298
    //   373: astore_0
    //   374: goto -76 -> 298
    //   377: astore_0
    //   378: aload 9
    //   380: ifnull +8 -> 388
    //   383: aload 9
    //   385: invokevirtual 104	java/io/OutputStream:close	()V
    //   388: ldc 23
    //   390: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   393: aload_0
    //   394: athrow
    //   395: astore_0
    //   396: goto -116 -> 280
    //   399: astore_0
    //   400: goto -102 -> 298
    //   403: astore 9
    //   405: goto -17 -> 388
    //
    // Exception table:
    //   from	to	target	type
    //   58	64	308	java/lang/Exception
    //   84	91	308	java/lang/Exception
    //   102	108	308	java/lang/Exception
    //   124	129	308	java/lang/Exception
    //   140	145	308	java/lang/Exception
    //   156	172	308	java/lang/Exception
    //   183	188	308	java/lang/Exception
    //   199	206	308	java/lang/Exception
    //   218	230	308	java/lang/Exception
    //   239	255	308	java/lang/Exception
    //   264	272	308	java/lang/Exception
    //   336	341	344	java/lang/Exception
    //   58	64	348	java/lang/OutOfMemoryError
    //   84	91	348	java/lang/OutOfMemoryError
    //   102	108	348	java/lang/OutOfMemoryError
    //   124	129	348	java/lang/OutOfMemoryError
    //   140	145	348	java/lang/OutOfMemoryError
    //   156	172	348	java/lang/OutOfMemoryError
    //   183	188	348	java/lang/OutOfMemoryError
    //   199	206	348	java/lang/OutOfMemoryError
    //   218	230	348	java/lang/OutOfMemoryError
    //   239	255	348	java/lang/OutOfMemoryError
    //   264	272	348	java/lang/OutOfMemoryError
    //   365	370	373	java/lang/Exception
    //   58	64	377	finally
    //   84	91	377	finally
    //   102	108	377	finally
    //   124	129	377	finally
    //   140	145	377	finally
    //   156	172	377	finally
    //   183	188	377	finally
    //   199	206	377	finally
    //   218	230	377	finally
    //   239	255	377	finally
    //   264	272	377	finally
    //   313	331	377	finally
    //   353	360	377	finally
    //   276	280	395	java/lang/Exception
    //   293	298	399	java/lang/Exception
    //   383	388	403	java/lang/Exception
  }

  public static void Destroy()
  {
  }

  public static boolean IsJpegFile(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(93411);
    try
    {
      if (mmjpeg.queryParams(paramString) == null)
      {
        ab.e("MMJPEG.JAVA", "IsJpegFile : can't query jpeg parames.");
        AppMethodBeat.o(93411);
        return bool;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MMJPEG.JAVA", "IsJpegFile exception:%s", new Object[] { exception2String(paramString) });
        AppMethodBeat.o(93411);
        continue;
        AppMethodBeat.o(93411);
        bool = true;
      }
    }
  }

  private static boolean checkAndroidVersion()
  {
    AppMethodBeat.i(93405);
    boolean bool;
    if (Build.VERSION.SDK_INT < 11)
    {
      ab.i("MMJPEG.JAVA", "early version before android 3.0  unsupported.");
      bool = false;
      AppMethodBeat.o(93405);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(93405);
    }
  }

  public static boolean convertToProgressive(String paramString, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(93408);
    if (!checkAndroidVersion())
      AppMethodBeat.o(93408);
    while (true)
    {
      return bool1;
      try
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = paramString + ".prog.dat";
        ab.d("MMJPEG.JAVA", "convert %s to %s use progressive.quality:%d", new Object[] { paramString, localObject, Integer.valueOf(paramInt) });
        paramInt = mmjpeg.convertToProgressive(paramString, (String)localObject);
        if (paramInt != 0)
        {
          ab.e("MMJPEG.JAVA", "convert failed. error:%d", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(93408);
        }
        else
        {
          boolean bool2 = e.aQ((String)localObject, paramString);
          ab.i("MMJPEG.JAVA", "convert ret:%b", new Object[] { Boolean.valueOf(bool2) });
          AppMethodBeat.o(93408);
          bool1 = bool2;
        }
      }
      catch (Exception paramString)
      {
        ab.e("MMJPEG.JAVA", "convertToProgressive exception:%s", new Object[] { exception2String(paramString) });
        AppMethodBeat.o(93408);
      }
    }
  }

  public static Bitmap decodeAsBitmap(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(93409);
    ab.v("MMJPEG.JAVA", "decodeAsBitmap:%s", new Object[] { paramString });
    try
    {
      Object localObject2 = mmjpeg.queryParams(paramString);
      if (localObject2 == null)
      {
        ab.e("MMJPEG.JAVA", "can't query jpeg parames.");
        AppMethodBeat.o(93409);
        paramString = localObject1;
      }
      while (true)
      {
        return paramString;
        localObject2 = Bitmap.createBitmap(((JpegParams)localObject2).Width, ((JpegParams)localObject2).Height, Bitmap.Config.ARGB_8888);
        if (mmjpeg.decodeToBitmap(paramString, (Bitmap)localObject2))
        {
          ab.i("MMJPEG.JAVA", "decode bitmap successed.");
          AppMethodBeat.o(93409);
          paramString = (String)localObject2;
        }
        else
        {
          ab.e("MMJPEG.JAVA", "can't decode to bmp.");
          AppMethodBeat.o(93409);
          paramString = localObject1;
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MMJPEG.JAVA", "decodeAsBitmap exception:%s", new Object[] { exception2String(paramString) });
        AppMethodBeat.o(93409);
        paramString = localObject1;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        ab.e("MMJPEG.JAVA", "decodeAsBitmap OOM:%s", new Object[] { paramString });
        AppMethodBeat.o(93409);
        paramString = localObject1;
      }
    }
  }

  private static String exception2String(Throwable paramThrowable)
  {
    AppMethodBeat.i(93404);
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    paramThrowable = localStringWriter.toString();
    AppMethodBeat.o(93404);
    return paramThrowable;
  }

  public static boolean isProgressive(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(93407);
    ab.v("MMJPEG.JAVA", "isProgressive:%s", new Object[] { paramString });
    if (!checkAndroidVersion())
      AppMethodBeat.o(93407);
    while (true)
    {
      return bool;
      if (!e.ct(paramString))
      {
        AppMethodBeat.o(93407);
      }
      else
      {
        ab.d("MMJPEG.JAVA", "check progressive for file:%s", new Object[] { paramString });
        try
        {
          int i = mmjpeg.isProgressiveFile(paramString);
          if ((1 != i) && (i != 0))
          {
            ab.e("MMJPEG.JAVA", "check failed. error:%d", new Object[] { Integer.valueOf(i) });
            AppMethodBeat.o(93407);
          }
          else
          {
            ab.i("MMJPEG.JAVA", "file:%s progressive:%d", new Object[] { paramString, Integer.valueOf(i) });
            if (i == 1)
            {
              AppMethodBeat.o(93407);
              bool = true;
            }
            else
            {
              AppMethodBeat.o(93407);
            }
          }
        }
        catch (Exception paramString)
        {
          ab.e("MMJPEG.JAVA", "isProgressive exception:%s", new Object[] { exception2String(paramString) });
          AppMethodBeat.o(93407);
        }
      }
    }
  }

  public static int queryQuality(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(93406);
    if (!checkAndroidVersion())
      AppMethodBeat.o(93406);
    while (true)
    {
      return i;
      if (!e.ct(paramString))
        AppMethodBeat.o(93406);
      else
        try
        {
          int j = mmjpeg.queryQuality(paramString);
          ab.i("MMJPEG.JAVA", "after query quality:%d", new Object[] { Integer.valueOf(j) });
          if ((j < 10000) && (j >= 24))
          {
            AppMethodBeat.o(93406);
            i = j;
          }
          else
          {
            j = mmjpeg.isProgressiveFile(paramString);
            if (1 == j)
            {
              i = 25;
              AppMethodBeat.o(93406);
            }
            else
            {
              ab.w("MMJPEG.JAVA", "invalid jpeg file or too small quality.");
              AppMethodBeat.o(93406);
            }
          }
        }
        catch (Exception paramString)
        {
          ab.e("MMJPEG.JAVA", "queryQuality failed. exception:%s", new Object[] { exception2String(paramString) });
          AppMethodBeat.o(93406);
        }
        catch (IncompatibleClassChangeError paramString)
        {
          ab.printErrStackTrace("MicroMsg.Crash", paramString, "May cause dvmFindCatchBlock crash!", new Object[0]);
          paramString = (IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(paramString);
          AppMethodBeat.o(93406);
          throw paramString;
        }
        catch (Error paramString)
        {
          ab.e("MMJPEG.JAVA", "queryQuality error. java.lang.UnsatisfiedLinkError: queryQuality, %s", new Object[] { paramString.toString() });
          AppMethodBeat.o(93406);
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.MMNativeJpeg
 * JD-Core Version:    0.6.2
 */