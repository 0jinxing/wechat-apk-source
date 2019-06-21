package com.tencent.ttpic.baseutils;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtils
{
  private static final String TAG;

  static
  {
    AppMethodBeat.i(49799);
    TAG = ZipUtils.class.getSimpleName();
    AppMethodBeat.o(49799);
  }

  private static void doZip(ZipOutputStream paramZipOutputStream, File paramFile, String paramString, byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(49797);
    if ((paramZipOutputStream != null) && (paramFile != null))
    {
      if (!paramFile.exists())
      {
        paramZipOutputStream = new FileNotFoundException("Target File is missing");
        AppMethodBeat.o(49797);
        throw paramZipOutputStream;
      }
      if (TextUtils.isEmpty(paramString))
        paramString = paramFile.getName();
    }
    while (true)
    {
      if (paramFile.isFile());
      try
      {
        BufferedInputStream localBufferedInputStream = new java/io/BufferedInputStream;
        FileInputStream localFileInputStream = new java/io/FileInputStream;
        localFileInputStream.<init>(paramFile);
        localBufferedInputStream.<init>(localFileInputStream);
        try
        {
          paramFile = new java/util/zip/ZipEntry;
          paramFile.<init>(paramString);
          paramZipOutputStream.putNextEntry(paramFile);
          while (true)
          {
            i = localBufferedInputStream.read(paramArrayOfByte, 0, paramArrayOfByte.length);
            if (-1 == i)
              break;
            paramZipOutputStream.write(paramArrayOfByte, 0, i);
          }
        }
        catch (IOException paramZipOutputStream)
        {
          paramFile = localBufferedInputStream;
        }
        if (paramFile != null);
        try
        {
          paramFile.close();
          label136: AppMethodBeat.o(49797);
          throw paramZipOutputStream;
          paramString = paramString + File.separator + paramFile.getName();
          continue;
          while (true)
          {
            try
            {
              localBufferedInputStream.close();
              AppMethodBeat.o(49797);
              return;
            }
            catch (IOException paramZipOutputStream)
            {
              AppMethodBeat.o(49797);
              continue;
            }
            if (paramFile.isDirectory())
            {
              paramFile = paramFile.listFiles();
              if (paramFile != null)
              {
                int j = paramFile.length;
                while (i < j)
                {
                  doZip(paramZipOutputStream, paramFile[i], paramString, paramArrayOfByte);
                  i++;
                }
              }
            }
            AppMethodBeat.o(49797);
          }
          paramZipOutputStream = new IOException("I/O Object got NullPointerException");
          AppMethodBeat.o(49797);
          throw paramZipOutputStream;
        }
        catch (IOException paramFile)
        {
          break label136;
        }
      }
      catch (IOException paramZipOutputStream)
      {
        while (true)
          paramFile = null;
      }
    }
  }

  // ERROR //
  public static String unZip(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 118
    //   5: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokestatic 54	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   12: ifeq +15 -> 27
    //   15: ldc 118
    //   17: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: aconst_null
    //   21: astore_0
    //   22: ldc 2
    //   24: monitorexit
    //   25: aload_0
    //   26: areturn
    //   27: new 37	java/io/File
    //   30: astore_2
    //   31: aload_2
    //   32: aload_0
    //   33: invokespecial 119	java/io/File:<init>	(Ljava/lang/String;)V
    //   36: aload_2
    //   37: invokevirtual 41	java/io/File:exists	()Z
    //   40: ifne +13 -> 53
    //   43: ldc 118
    //   45: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aconst_null
    //   49: astore_0
    //   50: goto -28 -> 22
    //   53: new 37	java/io/File
    //   56: astore_0
    //   57: aload_0
    //   58: aload_1
    //   59: invokespecial 119	java/io/File:<init>	(Ljava/lang/String;)V
    //   62: aload_0
    //   63: invokevirtual 41	java/io/File:exists	()Z
    //   66: ifne +8 -> 74
    //   69: aload_0
    //   70: invokevirtual 122	java/io/File:mkdirs	()Z
    //   73: pop
    //   74: new 64	java/io/FileInputStream
    //   77: astore_3
    //   78: aload_3
    //   79: aload_2
    //   80: invokespecial 67	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   83: new 124	java/util/zip/ZipInputStream
    //   86: astore 4
    //   88: new 62	java/io/BufferedInputStream
    //   91: astore_0
    //   92: aload_0
    //   93: aload_3
    //   94: invokespecial 70	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   97: aload 4
    //   99: aload_0
    //   100: invokespecial 125	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   103: aconst_null
    //   104: astore_0
    //   105: aconst_null
    //   106: astore_2
    //   107: aconst_null
    //   108: astore 5
    //   110: aload 5
    //   112: astore 6
    //   114: aload 4
    //   116: invokevirtual 129	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   119: astore 7
    //   121: aload 7
    //   123: ifnull +505 -> 628
    //   126: getstatic 23	com/tencent/ttpic/baseutils/ZipUtils:TAG	Ljava/lang/String;
    //   129: ldc 131
    //   131: aload 7
    //   133: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   136: invokevirtual 141	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   139: invokestatic 147	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: aload 7
    //   144: invokevirtual 148	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   147: astore 8
    //   149: aload 6
    //   151: astore 5
    //   153: aload 8
    //   155: ldc 150
    //   157: invokevirtual 153	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   160: ifne -50 -> 110
    //   163: aload 7
    //   165: invokevirtual 154	java/util/zip/ZipEntry:isDirectory	()Z
    //   168: ifeq +105 -> 273
    //   171: new 92	java/lang/StringBuilder
    //   174: astore 5
    //   176: aload 5
    //   178: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   181: aload 5
    //   183: aload_1
    //   184: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: getstatic 100	java/io/File:separator	Ljava/lang/String;
    //   190: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: aload 8
    //   195: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: astore 5
    //   203: getstatic 23	com/tencent/ttpic/baseutils/ZipUtils:TAG	Ljava/lang/String;
    //   206: ldc 156
    //   208: aload 5
    //   210: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   213: invokevirtual 141	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   216: invokestatic 147	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   219: new 37	java/io/File
    //   222: astore 8
    //   224: aload 8
    //   226: aload 5
    //   228: invokespecial 119	java/io/File:<init>	(Ljava/lang/String;)V
    //   231: aload 8
    //   233: invokevirtual 41	java/io/File:exists	()Z
    //   236: ifne +9 -> 245
    //   239: aload 8
    //   241: invokevirtual 122	java/io/File:mkdirs	()Z
    //   244: pop
    //   245: aload 5
    //   247: aconst_null
    //   248: invokestatic 161	com/tencent/ttpic/baseutils/FileUtils:deleteFiles	(Ljava/lang/String;Ljava/lang/String;)V
    //   251: aload 6
    //   253: astore 5
    //   255: aload 6
    //   257: invokestatic 54	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   260: ifeq -150 -> 110
    //   263: aload 8
    //   265: invokevirtual 164	java/io/File:getPath	()Ljava/lang/String;
    //   268: astore 5
    //   270: goto -160 -> 110
    //   273: sipush 4096
    //   276: newarray byte
    //   278: astore 9
    //   280: new 92	java/lang/StringBuilder
    //   283: astore 5
    //   285: aload 5
    //   287: invokespecial 93	java/lang/StringBuilder:<init>	()V
    //   290: aload 5
    //   292: aload_1
    //   293: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: getstatic 100	java/io/File:separator	Ljava/lang/String;
    //   299: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: aload 8
    //   304: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: astore 5
    //   312: getstatic 23	com/tencent/ttpic/baseutils/ZipUtils:TAG	Ljava/lang/String;
    //   315: ldc 166
    //   317: aload 5
    //   319: invokestatic 137	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   322: invokevirtual 141	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   325: invokestatic 147	com/tencent/ttpic/baseutils/LogUtils:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   328: new 37	java/io/File
    //   331: astore 8
    //   333: aload 8
    //   335: aload 5
    //   337: invokespecial 119	java/io/File:<init>	(Ljava/lang/String;)V
    //   340: new 168	java/io/FileOutputStream
    //   343: astore 5
    //   345: aload 5
    //   347: aload 8
    //   349: invokespecial 169	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   352: new 171	java/io/BufferedOutputStream
    //   355: astore_2
    //   356: aload_2
    //   357: aload 5
    //   359: sipush 4096
    //   362: invokespecial 174	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   365: aload_2
    //   366: astore 8
    //   368: aload 5
    //   370: astore 7
    //   372: aload 4
    //   374: aload 9
    //   376: invokevirtual 177	java/util/zip/ZipInputStream:read	([B)I
    //   379: istore 10
    //   381: iload 10
    //   383: iconst_m1
    //   384: if_icmpeq +68 -> 452
    //   387: aload_2
    //   388: astore 8
    //   390: aload 5
    //   392: astore 7
    //   394: aload_2
    //   395: aload 9
    //   397: iconst_0
    //   398: iload 10
    //   400: invokevirtual 178	java/io/BufferedOutputStream:write	([BII)V
    //   403: goto -38 -> 365
    //   406: astore 8
    //   408: aload_2
    //   409: astore_0
    //   410: aload 8
    //   412: astore_2
    //   413: aload_0
    //   414: astore 8
    //   416: aload 5
    //   418: astore 7
    //   420: aload_2
    //   421: invokestatic 182	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   424: aload_0
    //   425: ifnull +7 -> 432
    //   428: aload_0
    //   429: invokevirtual 183	java/io/BufferedOutputStream:close	()V
    //   432: aload 5
    //   434: ifnull +8 -> 442
    //   437: aload 5
    //   439: invokevirtual 184	java/io/FileOutputStream:close	()V
    //   442: aload 5
    //   444: astore_2
    //   445: aload 6
    //   447: astore 5
    //   449: goto -339 -> 110
    //   452: aload_2
    //   453: astore 8
    //   455: aload 5
    //   457: astore 7
    //   459: aload_2
    //   460: invokevirtual 187	java/io/BufferedOutputStream:flush	()V
    //   463: aload_2
    //   464: invokevirtual 183	java/io/BufferedOutputStream:close	()V
    //   467: aload 5
    //   469: invokevirtual 184	java/io/FileOutputStream:close	()V
    //   472: aload_2
    //   473: astore_0
    //   474: aload 5
    //   476: astore_2
    //   477: aload 6
    //   479: astore 5
    //   481: goto -371 -> 110
    //   484: astore_0
    //   485: aload_0
    //   486: invokestatic 182	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   489: aload_2
    //   490: astore_0
    //   491: aload 5
    //   493: astore_2
    //   494: aload 6
    //   496: astore 5
    //   498: goto -388 -> 110
    //   501: astore_2
    //   502: aload_2
    //   503: invokestatic 182	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   506: aload 5
    //   508: astore_2
    //   509: aload 6
    //   511: astore 5
    //   513: goto -403 -> 110
    //   516: astore_0
    //   517: aload 7
    //   519: astore 5
    //   521: aload 8
    //   523: ifnull +8 -> 531
    //   526: aload 8
    //   528: invokevirtual 183	java/io/BufferedOutputStream:close	()V
    //   531: aload 5
    //   533: ifnull +8 -> 541
    //   536: aload 5
    //   538: invokevirtual 184	java/io/FileOutputStream:close	()V
    //   541: ldc 118
    //   543: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   546: aload_0
    //   547: athrow
    //   548: astore 5
    //   550: aload 4
    //   552: astore_2
    //   553: aload_3
    //   554: astore_1
    //   555: aload 6
    //   557: astore_0
    //   558: aload 5
    //   560: invokestatic 182	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   563: aload_2
    //   564: ifnull +7 -> 571
    //   567: aload_2
    //   568: invokevirtual 188	java/util/zip/ZipInputStream:close	()V
    //   571: aload_1
    //   572: ifnull +7 -> 579
    //   575: aload_1
    //   576: invokevirtual 189	java/io/FileInputStream:close	()V
    //   579: ldc 118
    //   581: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   584: goto -562 -> 22
    //   587: astore_0
    //   588: ldc 2
    //   590: monitorexit
    //   591: aload_0
    //   592: athrow
    //   593: astore_1
    //   594: aload_1
    //   595: invokestatic 182	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   598: goto -57 -> 541
    //   601: astore_0
    //   602: aload 4
    //   604: astore_1
    //   605: aload_1
    //   606: ifnull +7 -> 613
    //   609: aload_1
    //   610: invokevirtual 188	java/util/zip/ZipInputStream:close	()V
    //   613: aload_3
    //   614: ifnull +7 -> 621
    //   617: aload_3
    //   618: invokevirtual 189	java/io/FileInputStream:close	()V
    //   621: ldc 118
    //   623: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   626: aload_0
    //   627: athrow
    //   628: aload 4
    //   630: invokevirtual 188	java/util/zip/ZipInputStream:close	()V
    //   633: aload_3
    //   634: invokevirtual 189	java/io/FileInputStream:close	()V
    //   637: aload 6
    //   639: astore_0
    //   640: goto -61 -> 579
    //   643: astore_0
    //   644: aload_0
    //   645: invokestatic 182	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   648: aload 6
    //   650: astore_0
    //   651: goto -72 -> 579
    //   654: astore_1
    //   655: aload_1
    //   656: invokestatic 182	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   659: goto -80 -> 579
    //   662: astore_1
    //   663: aload_1
    //   664: invokestatic 182	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   667: goto -46 -> 621
    //   670: astore_0
    //   671: aconst_null
    //   672: astore_1
    //   673: aconst_null
    //   674: astore_3
    //   675: goto -70 -> 605
    //   678: astore_0
    //   679: aconst_null
    //   680: astore_1
    //   681: goto -76 -> 605
    //   684: astore_0
    //   685: aload_1
    //   686: astore_3
    //   687: aload_2
    //   688: astore_1
    //   689: goto -84 -> 605
    //   692: astore 5
    //   694: aconst_null
    //   695: astore_2
    //   696: aconst_null
    //   697: astore_1
    //   698: aconst_null
    //   699: astore_0
    //   700: goto -142 -> 558
    //   703: astore 5
    //   705: aconst_null
    //   706: astore_2
    //   707: aload_3
    //   708: astore_1
    //   709: aconst_null
    //   710: astore_0
    //   711: goto -153 -> 558
    //   714: astore_1
    //   715: aload_0
    //   716: astore 8
    //   718: aload_1
    //   719: astore_0
    //   720: aload_2
    //   721: astore 5
    //   723: goto -202 -> 521
    //   726: astore_1
    //   727: aload_0
    //   728: astore 8
    //   730: aload_1
    //   731: astore_0
    //   732: goto -211 -> 521
    //   735: astore 5
    //   737: aload_2
    //   738: astore 8
    //   740: aload 5
    //   742: astore_2
    //   743: aload 8
    //   745: astore 5
    //   747: goto -334 -> 413
    //   750: astore_2
    //   751: goto -338 -> 413
    //
    // Exception table:
    //   from	to	target	type
    //   372	381	406	java/io/IOException
    //   394	403	406	java/io/IOException
    //   459	463	406	java/io/IOException
    //   463	472	484	java/io/IOException
    //   428	432	501	java/io/IOException
    //   437	442	501	java/io/IOException
    //   372	381	516	finally
    //   394	403	516	finally
    //   420	424	516	finally
    //   459	463	516	finally
    //   114	121	548	java/io/IOException
    //   126	149	548	java/io/IOException
    //   153	245	548	java/io/IOException
    //   245	251	548	java/io/IOException
    //   255	270	548	java/io/IOException
    //   273	340	548	java/io/IOException
    //   485	489	548	java/io/IOException
    //   502	506	548	java/io/IOException
    //   541	548	548	java/io/IOException
    //   594	598	548	java/io/IOException
    //   3	20	587	finally
    //   27	48	587	finally
    //   53	74	587	finally
    //   567	571	587	finally
    //   575	579	587	finally
    //   579	584	587	finally
    //   609	613	587	finally
    //   617	621	587	finally
    //   621	628	587	finally
    //   628	637	587	finally
    //   644	648	587	finally
    //   655	659	587	finally
    //   663	667	587	finally
    //   526	531	593	java/io/IOException
    //   536	541	593	java/io/IOException
    //   114	121	601	finally
    //   126	149	601	finally
    //   153	245	601	finally
    //   245	251	601	finally
    //   255	270	601	finally
    //   273	340	601	finally
    //   428	432	601	finally
    //   437	442	601	finally
    //   463	472	601	finally
    //   485	489	601	finally
    //   502	506	601	finally
    //   526	531	601	finally
    //   536	541	601	finally
    //   541	548	601	finally
    //   594	598	601	finally
    //   628	637	643	java/io/IOException
    //   567	571	654	java/io/IOException
    //   575	579	654	java/io/IOException
    //   609	613	662	java/io/IOException
    //   617	621	662	java/io/IOException
    //   74	83	670	finally
    //   83	103	678	finally
    //   558	563	684	finally
    //   74	83	692	java/io/IOException
    //   83	103	703	java/io/IOException
    //   340	352	714	finally
    //   352	365	726	finally
    //   340	352	735	java/io/IOException
    //   352	365	750	java/io/IOException
  }

  public static boolean zip(File paramFile1, File paramFile2)
  {
    AppMethodBeat.i(49795);
    boolean bool = zip(new File[] { paramFile1 }, paramFile2);
    AppMethodBeat.o(49795);
    return bool;
  }

  // ERROR //
  public static boolean zip(File[] paramArrayOfFile, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: iconst_0
    //   5: istore 4
    //   7: ldc 196
    //   9: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: aload_0
    //   13: ifnull +159 -> 172
    //   16: aload_0
    //   17: arraylength
    //   18: ifle +154 -> 172
    //   21: aload_1
    //   22: ifnull +150 -> 172
    //   25: sipush 4096
    //   28: newarray byte
    //   30: astore 5
    //   32: new 75	java/util/zip/ZipOutputStream
    //   35: astore 6
    //   37: new 171	java/io/BufferedOutputStream
    //   40: astore 7
    //   42: new 168	java/io/FileOutputStream
    //   45: astore 8
    //   47: aload 8
    //   49: aload_1
    //   50: iconst_0
    //   51: invokespecial 199	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   54: aload 7
    //   56: aload 8
    //   58: invokespecial 202	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   61: aload 6
    //   63: aload 7
    //   65: invokespecial 203	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   68: aload_0
    //   69: arraylength
    //   70: istore 9
    //   72: iconst_0
    //   73: istore 10
    //   75: iload 10
    //   77: iload 9
    //   79: if_icmpge +21 -> 100
    //   82: aload 6
    //   84: aload_0
    //   85: iload 10
    //   87: aaload
    //   88: aconst_null
    //   89: aload 5
    //   91: invokestatic 112	com/tencent/ttpic/baseutils/ZipUtils:doZip	(Ljava/util/zip/ZipOutputStream;Ljava/io/File;Ljava/lang/String;[B)V
    //   94: iinc 10 1
    //   97: goto -22 -> 75
    //   100: aload 6
    //   102: invokevirtual 204	java/util/zip/ZipOutputStream:flush	()V
    //   105: aload 6
    //   107: invokevirtual 207	java/util/zip/ZipOutputStream:closeEntry	()V
    //   110: iconst_1
    //   111: istore_3
    //   112: aload 6
    //   114: invokevirtual 208	java/util/zip/ZipOutputStream:close	()V
    //   117: ldc 196
    //   119: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: iload_3
    //   123: ireturn
    //   124: astore_0
    //   125: aconst_null
    //   126: astore 6
    //   128: iload 4
    //   130: istore_3
    //   131: aload 6
    //   133: ifnull -16 -> 117
    //   136: aload 6
    //   138: invokevirtual 208	java/util/zip/ZipOutputStream:close	()V
    //   141: iload 4
    //   143: istore_3
    //   144: goto -27 -> 117
    //   147: astore_0
    //   148: iload 4
    //   150: istore_3
    //   151: goto -34 -> 117
    //   154: astore_0
    //   155: aload_2
    //   156: astore_1
    //   157: aload_1
    //   158: ifnull +7 -> 165
    //   161: aload_1
    //   162: invokevirtual 208	java/util/zip/ZipOutputStream:close	()V
    //   165: ldc 196
    //   167: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   170: aload_0
    //   171: athrow
    //   172: ldc 196
    //   174: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   177: goto -55 -> 122
    //   180: astore_0
    //   181: goto -64 -> 117
    //   184: astore_1
    //   185: goto -20 -> 165
    //   188: astore_0
    //   189: aload 6
    //   191: astore_1
    //   192: goto -35 -> 157
    //   195: astore_0
    //   196: goto -68 -> 128
    //
    // Exception table:
    //   from	to	target	type
    //   25	68	124	java/io/IOException
    //   136	141	147	java/io/IOException
    //   25	68	154	finally
    //   112	117	180	java/io/IOException
    //   161	165	184	java/io/IOException
    //   68	72	188	finally
    //   82	94	188	finally
    //   100	110	188	finally
    //   68	72	195	java/io/IOException
    //   82	94	195	java/io/IOException
    //   100	110	195	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.ZipUtils
 * JD-Core Version:    0.6.2
 */