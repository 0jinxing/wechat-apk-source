package com.tencent.tencentmap.mapsdk.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

public class k
{
  public static final void a(Closeable paramCloseable)
  {
    AppMethodBeat.i(101230);
    if (paramCloseable != null);
    while (true)
    {
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(101230);
        return;
      }
      catch (IOException paramCloseable)
      {
      }
      AppMethodBeat.o(101230);
    }
  }

  // ERROR //
  public static boolean a(File paramFile, String paramString)
  {
    // Byte code:
    //   0: ldc 29
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 31	java/io/File
    //   8: dup
    //   9: aload_1
    //   10: invokespecial 35	java/io/File:<init>	(Ljava/lang/String;)V
    //   13: astore_2
    //   14: aload_2
    //   15: invokevirtual 39	java/io/File:exists	()Z
    //   18: ifne +8 -> 26
    //   21: aload_2
    //   22: invokevirtual 42	java/io/File:mkdirs	()Z
    //   25: pop
    //   26: new 44	java/util/zip/ZipFile
    //   29: astore_3
    //   30: aload_3
    //   31: aload_0
    //   32: invokespecial 47	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   35: sipush 4096
    //   38: newarray byte
    //   40: astore 4
    //   42: aload_3
    //   43: invokevirtual 51	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   46: astore 5
    //   48: aconst_null
    //   49: astore 6
    //   51: aconst_null
    //   52: astore_0
    //   53: aload_0
    //   54: astore 7
    //   56: aload 6
    //   58: astore 8
    //   60: aload_0
    //   61: astore_2
    //   62: aload_3
    //   63: astore 9
    //   65: aload 5
    //   67: invokeinterface 56 1 0
    //   72: ifeq +574 -> 646
    //   75: aload_0
    //   76: astore 7
    //   78: aload 6
    //   80: astore 8
    //   82: aload_0
    //   83: astore_2
    //   84: aload_3
    //   85: astore 9
    //   87: aload 5
    //   89: invokeinterface 60 1 0
    //   94: checkcast 62	java/util/zip/ZipEntry
    //   97: astore 10
    //   99: aload_0
    //   100: astore 7
    //   102: aload 6
    //   104: astore 8
    //   106: aload_0
    //   107: astore_2
    //   108: aload_3
    //   109: astore 9
    //   111: aload 10
    //   113: invokevirtual 66	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   116: astore 11
    //   118: aload 11
    //   120: ifnull +25 -> 145
    //   123: aload_0
    //   124: astore 7
    //   126: aload 6
    //   128: astore 8
    //   130: aload_0
    //   131: astore_2
    //   132: aload_3
    //   133: astore 9
    //   135: aload 11
    //   137: ldc 68
    //   139: invokevirtual 74	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   142: ifne -89 -> 53
    //   145: aload_0
    //   146: astore 7
    //   148: aload 6
    //   150: astore 8
    //   152: aload_0
    //   153: astore_2
    //   154: aload_3
    //   155: astore 9
    //   157: aload 10
    //   159: invokevirtual 77	java/util/zip/ZipEntry:isDirectory	()Z
    //   162: ifeq +180 -> 342
    //   165: aload_0
    //   166: astore 7
    //   168: aload 6
    //   170: astore 8
    //   172: aload_0
    //   173: astore_2
    //   174: aload_3
    //   175: astore 9
    //   177: new 79	java/lang/StringBuilder
    //   180: astore 11
    //   182: aload_0
    //   183: astore 7
    //   185: aload 6
    //   187: astore 8
    //   189: aload_0
    //   190: astore_2
    //   191: aload_3
    //   192: astore 9
    //   194: aload 11
    //   196: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   199: aload_0
    //   200: astore 7
    //   202: aload 6
    //   204: astore 8
    //   206: aload_0
    //   207: astore_2
    //   208: aload_3
    //   209: astore 9
    //   211: aload 11
    //   213: aload_1
    //   214: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: getstatic 89	java/io/File:separator	Ljava/lang/String;
    //   220: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: aload 10
    //   225: invokevirtual 66	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   228: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   234: astore 11
    //   236: aload_0
    //   237: astore 7
    //   239: aload 6
    //   241: astore 8
    //   243: aload_0
    //   244: astore_2
    //   245: aload_3
    //   246: astore 9
    //   248: new 31	java/io/File
    //   251: astore 10
    //   253: aload_0
    //   254: astore 7
    //   256: aload 6
    //   258: astore 8
    //   260: aload_0
    //   261: astore_2
    //   262: aload_3
    //   263: astore 9
    //   265: aload 10
    //   267: aload 11
    //   269: invokespecial 35	java/io/File:<init>	(Ljava/lang/String;)V
    //   272: aload_0
    //   273: astore 7
    //   275: aload 6
    //   277: astore 8
    //   279: aload_0
    //   280: astore_2
    //   281: aload_3
    //   282: astore 9
    //   284: aload 10
    //   286: invokevirtual 95	java/io/File:mkdir	()Z
    //   289: pop
    //   290: goto -237 -> 53
    //   293: astore_2
    //   294: aload 7
    //   296: astore_0
    //   297: aload 6
    //   299: astore_1
    //   300: aload_2
    //   301: astore 6
    //   303: aload_1
    //   304: astore 8
    //   306: aload_0
    //   307: astore_2
    //   308: aload_3
    //   309: astore 9
    //   311: aload 6
    //   313: invokestatic 101	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   316: invokestatic 106	com/tencent/tencentmap/mapsdk/a/dy:b	(Ljava/lang/String;)V
    //   319: aload_0
    //   320: invokestatic 108	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   323: aload_1
    //   324: invokestatic 108	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   327: aload_3
    //   328: invokevirtual 109	java/util/zip/ZipFile:close	()V
    //   331: ldc 29
    //   333: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   336: iconst_0
    //   337: istore 12
    //   339: iload 12
    //   341: ireturn
    //   342: aload_0
    //   343: astore 7
    //   345: aload 6
    //   347: astore 8
    //   349: aload_0
    //   350: astore_2
    //   351: aload_3
    //   352: astore 9
    //   354: aload_3
    //   355: aload 10
    //   357: invokevirtual 113	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   360: astore_0
    //   361: aload_0
    //   362: astore 7
    //   364: aload 6
    //   366: astore 8
    //   368: aload_0
    //   369: astore_2
    //   370: aload_3
    //   371: astore 9
    //   373: new 79	java/lang/StringBuilder
    //   376: astore 11
    //   378: aload_0
    //   379: astore 7
    //   381: aload 6
    //   383: astore 8
    //   385: aload_0
    //   386: astore_2
    //   387: aload_3
    //   388: astore 9
    //   390: aload 11
    //   392: invokespecial 81	java/lang/StringBuilder:<init>	()V
    //   395: aload_0
    //   396: astore 7
    //   398: aload 6
    //   400: astore 8
    //   402: aload_0
    //   403: astore_2
    //   404: aload_3
    //   405: astore 9
    //   407: aload 11
    //   409: aload_1
    //   410: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: getstatic 89	java/io/File:separator	Ljava/lang/String;
    //   416: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   419: aload 10
    //   421: invokevirtual 66	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   424: invokevirtual 85	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   427: invokevirtual 92	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   430: astore 11
    //   432: aload_0
    //   433: astore 7
    //   435: aload 6
    //   437: astore 8
    //   439: aload_0
    //   440: astore_2
    //   441: aload_3
    //   442: astore 9
    //   444: new 31	java/io/File
    //   447: astore 10
    //   449: aload_0
    //   450: astore 7
    //   452: aload 6
    //   454: astore 8
    //   456: aload_0
    //   457: astore_2
    //   458: aload_3
    //   459: astore 9
    //   461: aload 10
    //   463: aload 11
    //   465: invokespecial 35	java/io/File:<init>	(Ljava/lang/String;)V
    //   468: aload_0
    //   469: astore 7
    //   471: aload 6
    //   473: astore 8
    //   475: aload_0
    //   476: astore_2
    //   477: aload_3
    //   478: astore 9
    //   480: aload 10
    //   482: invokevirtual 39	java/io/File:exists	()Z
    //   485: ifne +83 -> 568
    //   488: aload_0
    //   489: astore 7
    //   491: aload 6
    //   493: astore 8
    //   495: aload_0
    //   496: astore_2
    //   497: aload_3
    //   498: astore 9
    //   500: aload 10
    //   502: invokevirtual 117	java/io/File:getParentFile	()Ljava/io/File;
    //   505: astore 11
    //   507: aload 11
    //   509: ifnull +41 -> 550
    //   512: aload_0
    //   513: astore 7
    //   515: aload 6
    //   517: astore 8
    //   519: aload_0
    //   520: astore_2
    //   521: aload_3
    //   522: astore 9
    //   524: aload 11
    //   526: invokevirtual 39	java/io/File:exists	()Z
    //   529: ifne +21 -> 550
    //   532: aload_0
    //   533: astore 7
    //   535: aload 6
    //   537: astore 8
    //   539: aload_0
    //   540: astore_2
    //   541: aload_3
    //   542: astore 9
    //   544: aload 11
    //   546: invokevirtual 42	java/io/File:mkdirs	()Z
    //   549: pop
    //   550: aload_0
    //   551: astore 7
    //   553: aload 6
    //   555: astore 8
    //   557: aload_0
    //   558: astore_2
    //   559: aload_3
    //   560: astore 9
    //   562: aload 10
    //   564: invokevirtual 120	java/io/File:createNewFile	()Z
    //   567: pop
    //   568: aload_0
    //   569: astore 7
    //   571: aload 6
    //   573: astore 8
    //   575: aload_0
    //   576: astore_2
    //   577: aload_3
    //   578: astore 9
    //   580: new 122	java/io/FileOutputStream
    //   583: dup
    //   584: aload 10
    //   586: invokespecial 123	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   589: astore 10
    //   591: aload_0
    //   592: aload 4
    //   594: invokevirtual 129	java/io/InputStream:read	([B)I
    //   597: istore 13
    //   599: iload 13
    //   601: ifle +24 -> 625
    //   604: aload 10
    //   606: aload 4
    //   608: iconst_0
    //   609: iload 13
    //   611: invokevirtual 135	java/io/OutputStream:write	([BII)V
    //   614: goto -23 -> 591
    //   617: astore 6
    //   619: aload 10
    //   621: astore_1
    //   622: goto -319 -> 303
    //   625: aload 10
    //   627: invokevirtual 138	java/io/OutputStream:flush	()V
    //   630: aload_0
    //   631: invokestatic 108	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   634: aload 10
    //   636: invokestatic 108	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   639: aload 10
    //   641: astore 6
    //   643: goto -590 -> 53
    //   646: aload_0
    //   647: invokestatic 108	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   650: aload 6
    //   652: invokestatic 108	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   655: aload_3
    //   656: invokevirtual 109	java/util/zip/ZipFile:close	()V
    //   659: iconst_1
    //   660: istore 12
    //   662: ldc 29
    //   664: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   667: goto -328 -> 339
    //   670: astore_1
    //   671: aconst_null
    //   672: astore 6
    //   674: aconst_null
    //   675: astore_0
    //   676: aconst_null
    //   677: astore_3
    //   678: aload_0
    //   679: invokestatic 108	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   682: aload 6
    //   684: invokestatic 108	com/tencent/tencentmap/mapsdk/a/k:a	(Ljava/io/Closeable;)V
    //   687: aload_3
    //   688: invokevirtual 109	java/util/zip/ZipFile:close	()V
    //   691: ldc 29
    //   693: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   696: aload_1
    //   697: athrow
    //   698: astore_0
    //   699: goto -40 -> 659
    //   702: astore_0
    //   703: goto -372 -> 331
    //   706: astore_0
    //   707: goto -16 -> 691
    //   710: astore_1
    //   711: aconst_null
    //   712: astore 6
    //   714: aconst_null
    //   715: astore_0
    //   716: goto -38 -> 678
    //   719: astore_1
    //   720: aload 10
    //   722: astore 6
    //   724: goto -46 -> 678
    //   727: astore_1
    //   728: aload 8
    //   730: astore 6
    //   732: aload_2
    //   733: astore_0
    //   734: aload 9
    //   736: astore_3
    //   737: goto -59 -> 678
    //   740: astore 6
    //   742: aconst_null
    //   743: astore_1
    //   744: aconst_null
    //   745: astore_0
    //   746: aconst_null
    //   747: astore_3
    //   748: goto -445 -> 303
    //   751: astore 6
    //   753: aconst_null
    //   754: astore_1
    //   755: aconst_null
    //   756: astore_0
    //   757: goto -454 -> 303
    //
    // Exception table:
    //   from	to	target	type
    //   65	75	293	java/lang/Exception
    //   87	99	293	java/lang/Exception
    //   111	118	293	java/lang/Exception
    //   135	145	293	java/lang/Exception
    //   157	165	293	java/lang/Exception
    //   177	182	293	java/lang/Exception
    //   194	199	293	java/lang/Exception
    //   211	236	293	java/lang/Exception
    //   248	253	293	java/lang/Exception
    //   265	272	293	java/lang/Exception
    //   284	290	293	java/lang/Exception
    //   354	361	293	java/lang/Exception
    //   373	378	293	java/lang/Exception
    //   390	395	293	java/lang/Exception
    //   407	432	293	java/lang/Exception
    //   444	449	293	java/lang/Exception
    //   461	468	293	java/lang/Exception
    //   480	488	293	java/lang/Exception
    //   500	507	293	java/lang/Exception
    //   524	532	293	java/lang/Exception
    //   544	550	293	java/lang/Exception
    //   562	568	293	java/lang/Exception
    //   580	591	293	java/lang/Exception
    //   591	599	617	java/lang/Exception
    //   604	614	617	java/lang/Exception
    //   625	639	617	java/lang/Exception
    //   26	35	670	finally
    //   655	659	698	java/io/IOException
    //   327	331	702	java/io/IOException
    //   687	691	706	java/io/IOException
    //   35	48	710	finally
    //   591	599	719	finally
    //   604	614	719	finally
    //   625	639	719	finally
    //   65	75	727	finally
    //   87	99	727	finally
    //   111	118	727	finally
    //   135	145	727	finally
    //   157	165	727	finally
    //   177	182	727	finally
    //   194	199	727	finally
    //   211	236	727	finally
    //   248	253	727	finally
    //   265	272	727	finally
    //   284	290	727	finally
    //   311	319	727	finally
    //   354	361	727	finally
    //   373	378	727	finally
    //   390	395	727	finally
    //   407	432	727	finally
    //   444	449	727	finally
    //   461	468	727	finally
    //   480	488	727	finally
    //   500	507	727	finally
    //   524	532	727	finally
    //   544	550	727	finally
    //   562	568	727	finally
    //   580	591	727	finally
    //   26	35	740	java/lang/Exception
    //   35	48	751	java/lang/Exception
  }

  public static boolean a(String paramString)
  {
    AppMethodBeat.i(101231);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(101231);
      bool = false;
    }
    while (true)
    {
      return bool;
      Stack localStack = new Stack();
      localStack.push(paramString);
      while (!localStack.isEmpty())
      {
        File localFile = new File((String)localStack.peek());
        if (localFile.exists())
        {
          if (localFile.isDirectory())
          {
            paramString = localFile.listFiles();
            if ((paramString == null) || (paramString.length == 0))
            {
              localFile.delete();
              localStack.pop();
            }
            else
            {
              int i = paramString.length;
              int j = 0;
              label105: if (j < i)
              {
                localFile = paramString[j];
                if (!localFile.isDirectory())
                  break label139;
                localStack.push(localFile.getAbsolutePath());
              }
              while (true)
              {
                j++;
                break label105;
                break;
                label139: localFile.delete();
              }
            }
          }
          else
          {
            localFile.delete();
            localStack.pop();
          }
        }
        else
          localStack.pop();
      }
      bool = true;
      AppMethodBeat.o(101231);
    }
  }

  public static boolean b(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(101232);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(101232);
    while (true)
    {
      return bool1;
      try
      {
        File localFile = new java/io/File;
        localFile.<init>(paramString);
        boolean bool2;
        if (localFile.exists())
        {
          bool2 = localFile.isDirectory();
          if (bool2)
          {
            bool1 = true;
            AppMethodBeat.o(101232);
          }
        }
        else
        {
          if ((localFile.exists()) && (localFile.isFile()))
            localFile.delete();
          bool2 = localFile.mkdirs();
          bool1 = bool2;
          AppMethodBeat.o(101232);
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(101232);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.k
 * JD-Core Version:    0.6.2
 */