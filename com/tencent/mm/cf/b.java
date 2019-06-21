package com.tencent.mm.cf;

import android.os.Debug;
import android.os.Environment;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.q;
import com.tencent.mm.performance.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class b
{
  public static final String ydz;

  static
  {
    AppMethodBeat.i(76898);
    ydz = Environment.getExternalStorageDirectory() + "/tencent/MicroMsg/memory/";
    AppMethodBeat.o(76898);
  }

  private static boolean Z(File paramFile)
  {
    boolean bool = true;
    AppMethodBeat.i(76894);
    if (paramFile.exists())
      AppMethodBeat.o(76894);
    while (true)
    {
      return bool;
      if (!paramFile.mkdirs())
      {
        bool = paramFile.exists();
        AppMethodBeat.o(76894);
      }
      else
      {
        AppMethodBeat.o(76894);
      }
    }
  }

  private static boolean af(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(76891);
    if (!dvR())
    {
      paramBoolean1 = false;
      AppMethodBeat.o(76891);
    }
    while (true)
    {
      return paramBoolean1;
      Object localObject = new File(ydz);
      File[] arrayOfFile = ((File)localObject).listFiles();
      if (arrayOfFile.length == 0)
      {
        paramBoolean1 = true;
        AppMethodBeat.o(76891);
      }
      else
      {
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        long l1 = new Date().getTime();
        boolean bool1 = true;
        int i = arrayOfFile.length;
        int j = 0;
        while (true)
          if (j < i)
          {
            File localFile = arrayOfFile[j];
            String str = localFile.getName();
            int k = str.indexOf(".hprof");
            if (k > 0)
              str = str.substring(0, k);
            try
            {
              Date localDate = localSimpleDateFormat.parse(str);
              if (localDate == null)
              {
                localFile.delete();
                for (bool2 = bool1; ; bool2 = bool1)
                {
                  j++;
                  bool1 = bool2;
                  break;
                  localFile.delete();
                }
              }
            }
            catch (ParseException localParseException)
            {
              while (true)
              {
                ab.e("MicroMsg.MemoryDumpManager", "hprofFileCheck parse date fail %s", new Object[] { str });
                localFile.delete();
                boolean bool2 = bool1;
                continue;
                long l2 = localParseException.getTime();
                if (l2 >= l1)
                {
                  localFile.delete();
                  bool2 = bool1;
                }
                else
                {
                  l2 = (l1 - l2) / 86400000L;
                  if (l2 >= 3L)
                  {
                    localFile.delete();
                    bool2 = bool1;
                  }
                  else
                  {
                    bool2 = bool1;
                    if (paramBoolean1)
                    {
                      bool2 = bool1;
                      if (l2 < 1L)
                        bool2 = false;
                    }
                  }
                }
              }
            }
          }
        localObject = ((File)localObject).listFiles();
        if (localObject.length > 5)
        {
          if (paramBoolean2)
            Toast.makeText(ah.getContext(), "dump fail, hprof file size exceed", 0).show();
          ab.w("MicroMsg.MemoryDumpManager", "hprofFileCheck hprofFileDir.length() too large " + localObject.length);
          paramBoolean1 = false;
          AppMethodBeat.o(76891);
        }
        else
        {
          AppMethodBeat.o(76891);
          paramBoolean1 = bool1;
        }
      }
    }
  }

  public static String ag(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(76892);
    if (!af(paramBoolean1, paramBoolean2))
      AppMethodBeat.o(76892);
    while (true)
    {
      return localObject1;
      long l = System.currentTimeMillis();
      String str = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
      Object localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append(ydz).append(str).append(".hprof");
      localObject2 = ((StringBuffer)localObject2).toString();
      if (!Z(new File((String)localObject2).getParentFile()))
      {
        ab.i("MicroMsg.MemoryDumpManager", "failed to create dir for hprof file: %s", new Object[] { localObject2 });
        AppMethodBeat.o(76892);
      }
      else
      {
        try
        {
          dvS();
          Debug.dumpHprofData((String)localObject2);
          if (paramBoolean2)
            Toast.makeText(ah.getContext(), (String)localObject2 + " hprof file has saved ", 0).show();
          ab.i("MicroMsg.MemoryDumpManager", "dump file %s, use time %d", new Object[] { str, Long.valueOf(bo.gb(l)) });
          AppMethodBeat.o(76892);
          localObject1 = localObject2;
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.MemoryDumpManager", " dumpHprofFile Exception");
          AppMethodBeat.o(76892);
        }
      }
    }
  }

  public static String aqz(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(76893);
    if (!dvR())
    {
      AppMethodBeat.o(76893);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      long l = System.currentTimeMillis();
      Object localObject2 = new StringBuffer();
      ((StringBuffer)localObject2).append(ydz).append(paramString).append(".hprof");
      localObject2 = ((StringBuffer)localObject2).toString();
      if (!Z(new File((String)localObject2).getParentFile()))
      {
        ab.i("MicroMsg.MemoryDumpManager", "failed to create dir for hprof file: %s", new Object[] { localObject2 });
        AppMethodBeat.o(76893);
        paramString = localObject1;
      }
      else
      {
        try
        {
          dvS();
          Debug.dumpHprofData((String)localObject2);
          Toast.makeText(ah.getContext(), (String)localObject2 + " hprof file has saved ", 0).show();
          ab.i("MicroMsg.MemoryDumpManager", "dump file %s, use time %d", new Object[] { paramString, Long.valueOf(bo.gb(l)) });
          paramString = new File((String)localObject2);
          if (paramString.exists())
            break label219;
          ab.e("MicroMsg.MemoryDumpManager", "Hprof dump file is not exist");
          AppMethodBeat.o(76893);
          paramString = localObject1;
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.MemoryDumpManager", " dumpHprofFile Exception");
          AppMethodBeat.o(76893);
          paramString = localObject1;
        }
        continue;
        label219: paramString = q.b(paramString, true, null);
        if (paramString == null)
        {
          ab.e("MicroMsg.MemoryDumpManager", "zip hprof file fail");
          AppMethodBeat.o(76893);
          paramString = localObject1;
        }
        else
        {
          AppMethodBeat.o(76893);
        }
      }
    }
  }

  private static boolean dvR()
  {
    AppMethodBeat.i(76890);
    boolean bool;
    if (!c.Mn())
    {
      ab.i("MicroMsg.MemoryDumpManager", "Hprof sdcard is invalid");
      bool = false;
      AppMethodBeat.o(76890);
    }
    while (true)
    {
      return bool;
      File localFile = new File(ydz);
      if (!localFile.exists())
        localFile.mkdirs();
      bool = true;
      AppMethodBeat.o(76890);
    }
  }

  public static void dvS()
  {
    AppMethodBeat.i(76895);
    Runtime.getRuntime().gc();
    System.runFinalization();
    AppMethodBeat.o(76895);
  }

  // ERROR //
  public static void dvT()
  {
    // Byte code:
    //   0: ldc 249
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 255	android/os/Build$VERSION:SDK_INT	I
    //   8: bipush 14
    //   10: if_icmplt +17 -> 27
    //   13: invokestatic 261	com/tencent/mm/performance/a/a:any	()Lcom/tencent/mm/performance/a/a;
    //   16: iconst_1
    //   17: invokevirtual 265	com/tencent/mm/performance/a/a:df	(Z)Lcom/tencent/mm/performance/a/a$a;
    //   20: pop
    //   21: ldc 249
    //   23: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: return
    //   27: new 17	java/lang/StringBuilder
    //   30: dup
    //   31: ldc_w 267
    //   34: invokespecial 140	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   37: invokestatic 273	android/os/Process:myPid	()I
    //   40: invokevirtual 143	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   43: invokevirtual 39	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: astore_0
    //   47: invokestatic 237	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   50: aload_0
    //   51: invokevirtual 277	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   54: astore_1
    //   55: new 279	java/io/InputStreamReader
    //   58: astore_0
    //   59: aload_0
    //   60: aload_1
    //   61: invokevirtual 285	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   64: invokespecial 288	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   67: new 290	java/io/LineNumberReader
    //   70: astore_2
    //   71: aload_2
    //   72: aload_0
    //   73: invokespecial 293	java/io/LineNumberReader:<init>	(Ljava/io/Reader;)V
    //   76: aload_2
    //   77: astore_3
    //   78: aload_0
    //   79: astore 4
    //   81: aload_2
    //   82: invokevirtual 296	java/io/LineNumberReader:readLine	()Ljava/lang/String;
    //   85: astore 5
    //   87: aload 5
    //   89: ifnull +57 -> 146
    //   92: aload_2
    //   93: astore_3
    //   94: aload_0
    //   95: astore 4
    //   97: ldc 108
    //   99: aload 5
    //   101: invokestatic 230	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: goto -28 -> 76
    //   107: astore 4
    //   109: aload_2
    //   110: astore_3
    //   111: aload_0
    //   112: astore 4
    //   114: ldc 108
    //   116: ldc_w 298
    //   119: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: aload_2
    //   123: ifnull +7 -> 130
    //   126: aload_2
    //   127: invokevirtual 301	java/io/LineNumberReader:close	()V
    //   130: aload_0
    //   131: ifnull +7 -> 138
    //   134: aload_0
    //   135: invokevirtual 302	java/io/InputStreamReader:close	()V
    //   138: ldc 249
    //   140: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: goto -117 -> 26
    //   146: aload_2
    //   147: astore_3
    //   148: aload_0
    //   149: astore 4
    //   151: aload_1
    //   152: invokevirtual 305	java/lang/Process:waitFor	()I
    //   155: pop
    //   156: aload_2
    //   157: astore_3
    //   158: aload_0
    //   159: astore 4
    //   161: aload_1
    //   162: invokevirtual 308	java/lang/Process:destroy	()V
    //   165: aload_2
    //   166: invokevirtual 301	java/io/LineNumberReader:close	()V
    //   169: aload_0
    //   170: invokevirtual 302	java/io/InputStreamReader:close	()V
    //   173: ldc 249
    //   175: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: goto -152 -> 26
    //   181: astore_0
    //   182: ldc 249
    //   184: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: goto -161 -> 26
    //   190: astore_0
    //   191: ldc 249
    //   193: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: goto -170 -> 26
    //   199: astore_0
    //   200: aconst_null
    //   201: astore_2
    //   202: aconst_null
    //   203: astore_0
    //   204: aload_2
    //   205: astore_3
    //   206: aload_0
    //   207: astore 4
    //   209: ldc 108
    //   211: ldc_w 310
    //   214: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: aload_2
    //   218: ifnull +7 -> 225
    //   221: aload_2
    //   222: invokevirtual 301	java/io/LineNumberReader:close	()V
    //   225: aload_0
    //   226: ifnull +7 -> 233
    //   229: aload_0
    //   230: invokevirtual 302	java/io/InputStreamReader:close	()V
    //   233: ldc 249
    //   235: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: goto -212 -> 26
    //   241: astore_0
    //   242: ldc 249
    //   244: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   247: goto -221 -> 26
    //   250: astore_0
    //   251: aconst_null
    //   252: astore_3
    //   253: aconst_null
    //   254: astore 4
    //   256: aload_3
    //   257: ifnull +7 -> 264
    //   260: aload_3
    //   261: invokevirtual 301	java/io/LineNumberReader:close	()V
    //   264: aload 4
    //   266: ifnull +8 -> 274
    //   269: aload 4
    //   271: invokevirtual 302	java/io/InputStreamReader:close	()V
    //   274: ldc 249
    //   276: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   279: aload_0
    //   280: athrow
    //   281: astore 4
    //   283: goto -9 -> 274
    //   286: astore_3
    //   287: aconst_null
    //   288: astore_2
    //   289: aload_0
    //   290: astore 4
    //   292: aload_3
    //   293: astore_0
    //   294: aload_2
    //   295: astore_3
    //   296: goto -40 -> 256
    //   299: astore_0
    //   300: goto -44 -> 256
    //   303: astore 4
    //   305: aconst_null
    //   306: astore_2
    //   307: goto -103 -> 204
    //   310: astore 4
    //   312: goto -108 -> 204
    //   315: astore_0
    //   316: aconst_null
    //   317: astore_2
    //   318: aconst_null
    //   319: astore_0
    //   320: goto -211 -> 109
    //   323: astore 4
    //   325: aconst_null
    //   326: astore_2
    //   327: goto -218 -> 109
    //
    // Exception table:
    //   from	to	target	type
    //   81	87	107	java/io/IOException
    //   97	104	107	java/io/IOException
    //   151	156	107	java/io/IOException
    //   161	165	107	java/io/IOException
    //   165	173	181	java/io/IOException
    //   126	130	190	java/io/IOException
    //   134	138	190	java/io/IOException
    //   47	67	199	java/lang/InterruptedException
    //   221	225	241	java/io/IOException
    //   229	233	241	java/io/IOException
    //   47	67	250	finally
    //   260	264	281	java/io/IOException
    //   269	274	281	java/io/IOException
    //   67	76	286	finally
    //   81	87	299	finally
    //   97	104	299	finally
    //   114	122	299	finally
    //   151	156	299	finally
    //   161	165	299	finally
    //   209	217	299	finally
    //   67	76	303	java/lang/InterruptedException
    //   81	87	310	java/lang/InterruptedException
    //   97	104	310	java/lang/InterruptedException
    //   151	156	310	java/lang/InterruptedException
    //   161	165	310	java/lang/InterruptedException
    //   47	67	315	java/io/IOException
    //   67	76	323	java/io/IOException
  }

  public static void dvU()
  {
    AppMethodBeat.i(138445);
    a.any().df(true);
    AppMethodBeat.o(138445);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cf.b
 * JD-Core Version:    0.6.2
 */