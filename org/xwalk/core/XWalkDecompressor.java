package org.xwalk.core;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public class XWalkDecompressor
{
  private static final int LZMA_OUTSIZE = 8;
  private static final int LZMA_PROP_SIZE = 5;
  private static final String[] MANDATORY_LIBRARIES = { "libxwalkcore.so" };
  private static final String[] MANDATORY_RESOURCES = XWalkEnvironment.MANDATORY_RESOURCES;
  private static final int STREAM_BUFFER_SIZE = 1048576;
  private static final String TAG = "XWalkLib";

  // ERROR //
  public static void copyApkToLocal(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 40
    //   2: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 18
    //   7: ldc 48
    //   9: aload_0
    //   10: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   13: invokevirtual 56	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   16: invokestatic 61	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: new 63	java/io/FileInputStream
    //   22: astore_2
    //   23: new 65	java/io/File
    //   26: astore_3
    //   27: aload_3
    //   28: aload_0
    //   29: invokespecial 68	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: aload_2
    //   33: aload_3
    //   34: invokespecial 71	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   37: new 65	java/io/File
    //   40: astore_3
    //   41: aload_3
    //   42: aload_1
    //   43: invokespecial 68	java/io/File:<init>	(Ljava/lang/String;)V
    //   46: aload_3
    //   47: invokevirtual 75	java/io/File:exists	()Z
    //   50: ifeq +8 -> 58
    //   53: aload_3
    //   54: invokevirtual 78	java/io/File:delete	()Z
    //   57: pop
    //   58: new 80	java/io/FileOutputStream
    //   61: astore_0
    //   62: aload_0
    //   63: aload_3
    //   64: invokespecial 81	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   67: aload_0
    //   68: astore_3
    //   69: aload_2
    //   70: astore_1
    //   71: sipush 1024
    //   74: newarray byte
    //   76: astore 4
    //   78: aload_0
    //   79: astore_3
    //   80: aload_2
    //   81: astore_1
    //   82: aload_2
    //   83: aload 4
    //   85: invokevirtual 85	java/io/FileInputStream:read	([B)I
    //   88: istore 5
    //   90: iload 5
    //   92: ifle +49 -> 141
    //   95: aload_0
    //   96: astore_3
    //   97: aload_2
    //   98: astore_1
    //   99: aload_0
    //   100: aload 4
    //   102: iconst_0
    //   103: iload 5
    //   105: invokevirtual 89	java/io/FileOutputStream:write	([BII)V
    //   108: goto -30 -> 78
    //   111: astore 4
    //   113: aload_0
    //   114: astore_3
    //   115: aload_2
    //   116: astore_1
    //   117: ldc 91
    //   119: aload 4
    //   121: invokevirtual 95	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   124: invokestatic 98	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   127: aload_2
    //   128: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   131: aload_0
    //   132: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   135: ldc 40
    //   137: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: return
    //   141: aload_2
    //   142: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   145: aload_0
    //   146: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   149: ldc 40
    //   151: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: goto -14 -> 140
    //   157: astore_0
    //   158: aconst_null
    //   159: astore_3
    //   160: aconst_null
    //   161: astore_1
    //   162: aload_1
    //   163: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   166: aload_3
    //   167: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   170: ldc 40
    //   172: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: aload_0
    //   176: athrow
    //   177: astore_0
    //   178: aconst_null
    //   179: astore_3
    //   180: aload_2
    //   181: astore_1
    //   182: goto -20 -> 162
    //   185: astore_0
    //   186: goto -24 -> 162
    //   189: astore 4
    //   191: aconst_null
    //   192: astore_0
    //   193: aconst_null
    //   194: astore_2
    //   195: goto -82 -> 113
    //   198: astore 4
    //   200: aconst_null
    //   201: astore_0
    //   202: goto -89 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   71	78	111	java/lang/Exception
    //   82	90	111	java/lang/Exception
    //   99	108	111	java/lang/Exception
    //   19	37	157	finally
    //   37	58	177	finally
    //   58	67	177	finally
    //   71	78	185	finally
    //   82	90	185	finally
    //   99	108	185	finally
    //   117	127	185	finally
    //   19	37	189	java/lang/Exception
    //   37	58	198	java/lang/Exception
    //   58	67	198	java/lang/Exception
  }

  // ERROR //
  public static boolean decompressDownloadFullZip(String paramString, int paramInt)
  {
    // Byte code:
    //   0: ldc 112
    //   2: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 18
    //   7: new 114	java/lang/StringBuilder
    //   10: dup
    //   11: ldc 116
    //   13: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   16: aload_0
    //   17: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: ldc 123
    //   22: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: iload_1
    //   26: invokevirtual 126	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   29: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   32: invokestatic 131	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: invokestatic 137	android/os/SystemClock:uptimeMillis	()J
    //   38: lstore_2
    //   39: new 139	java/util/zip/ZipFile
    //   42: astore 4
    //   44: aload 4
    //   46: aload_0
    //   47: invokespecial 140	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   50: aload 4
    //   52: invokevirtual 144	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   55: astore 5
    //   57: aload 5
    //   59: invokeinterface 149 1 0
    //   64: ifeq +424 -> 488
    //   67: aload 5
    //   69: invokeinterface 153 1 0
    //   74: checkcast 155	java/util/zip/ZipEntry
    //   77: astore 6
    //   79: aload 6
    //   81: invokevirtual 158	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   84: ldc 160
    //   86: invokestatic 166	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   89: astore_0
    //   90: ldc 18
    //   92: ldc 168
    //   94: aload_0
    //   95: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   98: invokevirtual 56	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   101: invokestatic 131	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: aload_0
    //   105: ldc 170
    //   107: invokevirtual 174	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   110: ifne -53 -> 57
    //   113: aload_0
    //   114: ldc 176
    //   116: invokevirtual 174	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   119: ifne -62 -> 57
    //   122: aload 6
    //   124: invokevirtual 179	java/util/zip/ZipEntry:isDirectory	()Z
    //   127: ifne -70 -> 57
    //   130: aload 4
    //   132: aload 6
    //   134: invokevirtual 183	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   137: astore 6
    //   139: aload_0
    //   140: ldc 185
    //   142: invokevirtual 189	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   145: ifeq +139 -> 284
    //   148: new 65	java/io/File
    //   151: astore 7
    //   153: aload 7
    //   155: iload_1
    //   156: invokestatic 193	org/xwalk/core/XWalkEnvironment:getDownloadApkPath	(I)Ljava/lang/String;
    //   159: invokespecial 68	java/io/File:<init>	(Ljava/lang/String;)V
    //   162: aload 7
    //   164: invokevirtual 75	java/io/File:exists	()Z
    //   167: ifne +240 -> 407
    //   170: aload 7
    //   172: invokevirtual 197	java/io/File:getParentFile	()Ljava/io/File;
    //   175: astore_0
    //   176: aload_0
    //   177: invokevirtual 75	java/io/File:exists	()Z
    //   180: ifne +8 -> 188
    //   183: aload_0
    //   184: invokevirtual 200	java/io/File:mkdirs	()Z
    //   187: pop
    //   188: new 80	java/io/FileOutputStream
    //   191: astore_0
    //   192: aload_0
    //   193: aload 7
    //   195: invokespecial 81	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   198: aload_0
    //   199: astore 8
    //   201: aload 6
    //   203: astore 9
    //   205: aload 4
    //   207: astore 10
    //   209: ldc 14
    //   211: newarray byte
    //   213: astore 7
    //   215: aload_0
    //   216: astore 8
    //   218: aload 6
    //   220: astore 9
    //   222: aload 4
    //   224: astore 10
    //   226: aload 6
    //   228: aload 7
    //   230: invokevirtual 203	java/io/InputStream:read	([B)I
    //   233: istore 11
    //   235: iload 11
    //   237: iconst_m1
    //   238: if_icmpeq +227 -> 465
    //   241: aload_0
    //   242: astore 8
    //   244: aload 6
    //   246: astore 9
    //   248: aload 4
    //   250: astore 10
    //   252: aload_0
    //   253: aload 7
    //   255: iconst_0
    //   256: iload 11
    //   258: invokevirtual 206	java/io/OutputStream:write	([BII)V
    //   261: aload_0
    //   262: astore 8
    //   264: aload 6
    //   266: astore 9
    //   268: aload 4
    //   270: astore 10
    //   272: aload 6
    //   274: aload 7
    //   276: invokevirtual 203	java/io/InputStream:read	([B)I
    //   279: istore 11
    //   281: goto -46 -> 235
    //   284: new 65	java/io/File
    //   287: dup
    //   288: iload_1
    //   289: aload_0
    //   290: invokestatic 210	org/xwalk/core/XWalkEnvironment:getExtractedCoreFile	(ILjava/lang/String;)Ljava/lang/String;
    //   293: invokespecial 68	java/io/File:<init>	(Ljava/lang/String;)V
    //   296: astore 7
    //   298: goto -136 -> 162
    //   301: astore 7
    //   303: aconst_null
    //   304: astore_0
    //   305: aload_0
    //   306: astore 8
    //   308: aload 6
    //   310: astore 9
    //   312: aload 4
    //   314: astore 10
    //   316: new 114	java/lang/StringBuilder
    //   319: astore 5
    //   321: aload_0
    //   322: astore 8
    //   324: aload 6
    //   326: astore 9
    //   328: aload 4
    //   330: astore 10
    //   332: aload 5
    //   334: ldc 212
    //   336: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   339: aload_0
    //   340: astore 8
    //   342: aload 6
    //   344: astore 9
    //   346: aload 4
    //   348: astore 10
    //   350: ldc 18
    //   352: aload 5
    //   354: aload 7
    //   356: invokevirtual 215	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   359: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   365: invokestatic 98	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   368: aload 4
    //   370: ifnull +8 -> 378
    //   373: aload 4
    //   375: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   378: aload_0
    //   379: ifnull +7 -> 386
    //   382: aload_0
    //   383: invokevirtual 219	java/io/OutputStream:close	()V
    //   386: aload 6
    //   388: ifnull +8 -> 396
    //   391: aload 6
    //   393: invokevirtual 220	java/io/InputStream:close	()V
    //   396: ldc 112
    //   398: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   401: iconst_0
    //   402: istore 12
    //   404: iload 12
    //   406: ireturn
    //   407: aload 7
    //   409: invokevirtual 78	java/io/File:delete	()Z
    //   412: pop
    //   413: goto -225 -> 188
    //   416: astore_0
    //   417: aconst_null
    //   418: astore 10
    //   420: aload 6
    //   422: astore 7
    //   424: aload 10
    //   426: astore 6
    //   428: aload 4
    //   430: ifnull +8 -> 438
    //   433: aload 4
    //   435: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   438: aload 6
    //   440: ifnull +8 -> 448
    //   443: aload 6
    //   445: invokevirtual 219	java/io/OutputStream:close	()V
    //   448: aload 7
    //   450: ifnull +8 -> 458
    //   453: aload 7
    //   455: invokevirtual 220	java/io/InputStream:close	()V
    //   458: ldc 112
    //   460: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   463: aload_0
    //   464: athrow
    //   465: aload_0
    //   466: astore 8
    //   468: aload 6
    //   470: astore 9
    //   472: aload 4
    //   474: astore 10
    //   476: aload_0
    //   477: invokevirtual 219	java/io/OutputStream:close	()V
    //   480: aload 6
    //   482: invokevirtual 220	java/io/InputStream:close	()V
    //   485: goto -428 -> 57
    //   488: aload 4
    //   490: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   493: invokestatic 225	java/lang/System:gc	()V
    //   496: ldc 18
    //   498: new 114	java/lang/StringBuilder
    //   501: dup
    //   502: ldc 227
    //   504: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   507: invokestatic 137	android/os/SystemClock:uptimeMillis	()J
    //   510: lload_2
    //   511: lsub
    //   512: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   515: ldc 232
    //   517: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   523: invokestatic 61	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   526: iconst_1
    //   527: istore 12
    //   529: ldc 112
    //   531: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   534: goto -130 -> 404
    //   537: astore_0
    //   538: goto -45 -> 493
    //   541: astore 6
    //   543: goto -85 -> 458
    //   546: astore_0
    //   547: aconst_null
    //   548: astore 6
    //   550: aconst_null
    //   551: astore 7
    //   553: aconst_null
    //   554: astore 4
    //   556: goto -128 -> 428
    //   559: astore_0
    //   560: aconst_null
    //   561: astore 6
    //   563: aconst_null
    //   564: astore 7
    //   566: goto -138 -> 428
    //   569: astore_0
    //   570: aload 8
    //   572: astore 6
    //   574: aload 9
    //   576: astore 7
    //   578: aload 10
    //   580: astore 4
    //   582: goto -154 -> 428
    //   585: astore_0
    //   586: goto -190 -> 396
    //   589: astore 7
    //   591: aconst_null
    //   592: astore_0
    //   593: aconst_null
    //   594: astore 6
    //   596: aconst_null
    //   597: astore 4
    //   599: goto -294 -> 305
    //   602: astore 7
    //   604: aconst_null
    //   605: astore_0
    //   606: aconst_null
    //   607: astore 6
    //   609: goto -304 -> 305
    //   612: astore 7
    //   614: goto -309 -> 305
    //
    // Exception table:
    //   from	to	target	type
    //   139	162	301	java/io/IOException
    //   162	188	301	java/io/IOException
    //   188	198	301	java/io/IOException
    //   284	298	301	java/io/IOException
    //   407	413	301	java/io/IOException
    //   480	485	301	java/io/IOException
    //   139	162	416	finally
    //   162	188	416	finally
    //   188	198	416	finally
    //   284	298	416	finally
    //   407	413	416	finally
    //   480	485	416	finally
    //   488	493	537	java/lang/Exception
    //   433	438	541	java/lang/Exception
    //   443	448	541	java/lang/Exception
    //   453	458	541	java/lang/Exception
    //   39	50	546	finally
    //   50	57	559	finally
    //   57	139	559	finally
    //   209	215	569	finally
    //   226	235	569	finally
    //   252	261	569	finally
    //   272	281	569	finally
    //   316	321	569	finally
    //   332	339	569	finally
    //   350	368	569	finally
    //   476	480	569	finally
    //   373	378	585	java/lang/Exception
    //   382	386	585	java/lang/Exception
    //   391	396	585	java/lang/Exception
    //   39	50	589	java/io/IOException
    //   50	57	602	java/io/IOException
    //   57	139	602	java/io/IOException
    //   209	215	612	java/io/IOException
    //   226	235	612	java/io/IOException
    //   252	261	612	java/io/IOException
    //   272	281	612	java/io/IOException
    //   476	480	612	java/io/IOException
  }

  // ERROR //
  public static boolean decompressDownloadPatchZip(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 237
    //   2: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 18
    //   7: ldc 239
    //   9: aload_0
    //   10: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   13: invokevirtual 56	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   16: invokestatic 61	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: invokestatic 137	android/os/SystemClock:uptimeMillis	()J
    //   22: lstore_2
    //   23: new 139	java/util/zip/ZipFile
    //   26: astore 4
    //   28: aload 4
    //   30: aload_0
    //   31: invokespecial 140	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   34: aload 4
    //   36: invokevirtual 144	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   39: astore 5
    //   41: aconst_null
    //   42: astore 6
    //   44: aconst_null
    //   45: astore_0
    //   46: aload_0
    //   47: astore 7
    //   49: aload 6
    //   51: astore 8
    //   53: aload_0
    //   54: astore 9
    //   56: aload 4
    //   58: astore 10
    //   60: aload 5
    //   62: invokeinterface 149 1 0
    //   67: ifeq +517 -> 584
    //   70: aload_0
    //   71: astore 7
    //   73: aload 6
    //   75: astore 8
    //   77: aload_0
    //   78: astore 9
    //   80: aload 4
    //   82: astore 10
    //   84: aload 5
    //   86: invokeinterface 153 1 0
    //   91: checkcast 155	java/util/zip/ZipEntry
    //   94: astore 11
    //   96: aload_0
    //   97: astore 7
    //   99: aload 6
    //   101: astore 8
    //   103: aload_0
    //   104: astore 9
    //   106: aload 4
    //   108: astore 10
    //   110: aload 11
    //   112: invokevirtual 158	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   115: ldc 160
    //   117: invokestatic 166	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   120: astore 12
    //   122: aload_0
    //   123: astore 7
    //   125: aload 6
    //   127: astore 8
    //   129: aload_0
    //   130: astore 9
    //   132: aload 4
    //   134: astore 10
    //   136: aload 12
    //   138: ldc 170
    //   140: invokevirtual 174	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   143: ifne -97 -> 46
    //   146: aload_0
    //   147: astore 7
    //   149: aload 6
    //   151: astore 8
    //   153: aload_0
    //   154: astore 9
    //   156: aload 4
    //   158: astore 10
    //   160: aload 12
    //   162: ldc 176
    //   164: invokevirtual 174	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   167: ifne -121 -> 46
    //   170: aload_0
    //   171: astore 7
    //   173: aload 6
    //   175: astore 8
    //   177: aload_0
    //   178: astore 9
    //   180: aload 4
    //   182: astore 10
    //   184: aload 11
    //   186: invokevirtual 179	java/util/zip/ZipEntry:isDirectory	()Z
    //   189: ifne -143 -> 46
    //   192: aload_0
    //   193: astore 7
    //   195: aload 6
    //   197: astore 8
    //   199: aload_0
    //   200: astore 9
    //   202: aload 4
    //   204: astore 10
    //   206: aload_0
    //   207: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   210: aload_0
    //   211: astore 7
    //   213: aload 6
    //   215: astore 8
    //   217: aload_0
    //   218: astore 9
    //   220: aload 4
    //   222: astore 10
    //   224: aload 4
    //   226: aload 11
    //   228: invokevirtual 183	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   231: astore_0
    //   232: aload_0
    //   233: astore 7
    //   235: aload 6
    //   237: astore 8
    //   239: aload_0
    //   240: astore 9
    //   242: aload 4
    //   244: astore 10
    //   246: new 65	java/io/File
    //   249: astore 11
    //   251: aload_0
    //   252: astore 7
    //   254: aload 6
    //   256: astore 8
    //   258: aload_0
    //   259: astore 9
    //   261: aload 4
    //   263: astore 10
    //   265: aload 11
    //   267: aload_1
    //   268: aload 12
    //   270: invokespecial 241	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: aload_0
    //   274: astore 7
    //   276: aload 6
    //   278: astore 8
    //   280: aload_0
    //   281: astore 9
    //   283: aload 4
    //   285: astore 10
    //   287: aload 11
    //   289: invokevirtual 75	java/io/File:exists	()Z
    //   292: ifne +166 -> 458
    //   295: aload_0
    //   296: astore 7
    //   298: aload 6
    //   300: astore 8
    //   302: aload_0
    //   303: astore 9
    //   305: aload 4
    //   307: astore 10
    //   309: aload 11
    //   311: invokevirtual 197	java/io/File:getParentFile	()Ljava/io/File;
    //   314: astore 12
    //   316: aload_0
    //   317: astore 7
    //   319: aload 6
    //   321: astore 8
    //   323: aload_0
    //   324: astore 9
    //   326: aload 4
    //   328: astore 10
    //   330: aload 12
    //   332: invokevirtual 75	java/io/File:exists	()Z
    //   335: ifne +23 -> 358
    //   338: aload_0
    //   339: astore 7
    //   341: aload 6
    //   343: astore 8
    //   345: aload_0
    //   346: astore 9
    //   348: aload 4
    //   350: astore 10
    //   352: aload 12
    //   354: invokevirtual 200	java/io/File:mkdirs	()Z
    //   357: pop
    //   358: aload_0
    //   359: astore 7
    //   361: aload 6
    //   363: astore 8
    //   365: aload_0
    //   366: astore 9
    //   368: aload 4
    //   370: astore 10
    //   372: aload 6
    //   374: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   377: aload_0
    //   378: astore 7
    //   380: aload 6
    //   382: astore 8
    //   384: aload_0
    //   385: astore 9
    //   387: aload 4
    //   389: astore 10
    //   391: new 80	java/io/FileOutputStream
    //   394: astore 12
    //   396: aload_0
    //   397: astore 7
    //   399: aload 6
    //   401: astore 8
    //   403: aload_0
    //   404: astore 9
    //   406: aload 4
    //   408: astore 10
    //   410: aload 12
    //   412: aload 11
    //   414: invokespecial 81	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   417: ldc 14
    //   419: newarray byte
    //   421: astore 9
    //   423: aload_0
    //   424: aload 9
    //   426: invokevirtual 203	java/io/InputStream:read	([B)I
    //   429: istore 13
    //   431: iload 13
    //   433: iconst_m1
    //   434: if_icmpeq +143 -> 577
    //   437: aload 12
    //   439: aload 9
    //   441: iconst_0
    //   442: iload 13
    //   444: invokevirtual 206	java/io/OutputStream:write	([BII)V
    //   447: aload_0
    //   448: aload 9
    //   450: invokevirtual 203	java/io/InputStream:read	([B)I
    //   453: istore 13
    //   455: goto -24 -> 431
    //   458: aload_0
    //   459: astore 7
    //   461: aload 6
    //   463: astore 8
    //   465: aload_0
    //   466: astore 9
    //   468: aload 4
    //   470: astore 10
    //   472: aload 11
    //   474: invokevirtual 78	java/io/File:delete	()Z
    //   477: pop
    //   478: goto -120 -> 358
    //   481: astore 9
    //   483: aload 7
    //   485: astore_0
    //   486: aload 6
    //   488: astore_1
    //   489: aload 9
    //   491: astore 6
    //   493: aload_1
    //   494: astore 8
    //   496: aload_0
    //   497: astore 9
    //   499: aload 4
    //   501: astore 10
    //   503: new 114	java/lang/StringBuilder
    //   506: astore 7
    //   508: aload_1
    //   509: astore 8
    //   511: aload_0
    //   512: astore 9
    //   514: aload 4
    //   516: astore 10
    //   518: aload 7
    //   520: ldc 212
    //   522: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   525: aload_1
    //   526: astore 8
    //   528: aload_0
    //   529: astore 9
    //   531: aload 4
    //   533: astore 10
    //   535: ldc 18
    //   537: aload 7
    //   539: aload 6
    //   541: invokevirtual 215	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   544: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   547: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   550: invokestatic 98	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   553: aload 4
    //   555: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   558: aload_1
    //   559: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   562: aload_0
    //   563: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   566: ldc 237
    //   568: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   571: iconst_0
    //   572: istore 14
    //   574: iload 14
    //   576: ireturn
    //   577: aload 12
    //   579: astore 6
    //   581: goto -535 -> 46
    //   584: aload 4
    //   586: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   589: aload 6
    //   591: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   594: aload_0
    //   595: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   598: invokestatic 225	java/lang/System:gc	()V
    //   601: ldc 18
    //   603: new 114	java/lang/StringBuilder
    //   606: dup
    //   607: ldc 227
    //   609: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   612: invokestatic 137	android/os/SystemClock:uptimeMillis	()J
    //   615: lload_2
    //   616: lsub
    //   617: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   620: ldc 232
    //   622: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   628: invokestatic 61	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   631: iconst_1
    //   632: istore 14
    //   634: ldc 237
    //   636: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   639: goto -65 -> 574
    //   642: astore_1
    //   643: aconst_null
    //   644: astore 6
    //   646: aconst_null
    //   647: astore_0
    //   648: aconst_null
    //   649: astore 4
    //   651: aload 4
    //   653: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   656: aload 6
    //   658: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   661: aload_0
    //   662: invokestatic 104	com/tencent/xweb/util/b:tryClose	(Ljava/io/Closeable;)V
    //   665: ldc 237
    //   667: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   670: aload_1
    //   671: athrow
    //   672: astore_1
    //   673: goto -84 -> 589
    //   676: astore_1
    //   677: goto -88 -> 589
    //   680: astore 9
    //   682: goto -124 -> 558
    //   685: astore 9
    //   687: goto -129 -> 558
    //   690: astore 9
    //   692: goto -36 -> 656
    //   695: astore 9
    //   697: goto -41 -> 656
    //   700: astore_1
    //   701: aconst_null
    //   702: astore 6
    //   704: aconst_null
    //   705: astore_0
    //   706: goto -55 -> 651
    //   709: astore_1
    //   710: aload 12
    //   712: astore 6
    //   714: goto -63 -> 651
    //   717: astore_1
    //   718: aload 8
    //   720: astore 6
    //   722: aload 9
    //   724: astore_0
    //   725: aload 10
    //   727: astore 4
    //   729: goto -78 -> 651
    //   732: astore 6
    //   734: aconst_null
    //   735: astore_1
    //   736: aconst_null
    //   737: astore_0
    //   738: aconst_null
    //   739: astore 4
    //   741: goto -248 -> 493
    //   744: astore 6
    //   746: aconst_null
    //   747: astore_1
    //   748: aconst_null
    //   749: astore_0
    //   750: goto -257 -> 493
    //   753: astore 6
    //   755: aload 12
    //   757: astore_1
    //   758: goto -265 -> 493
    //
    // Exception table:
    //   from	to	target	type
    //   60	70	481	java/io/IOException
    //   84	96	481	java/io/IOException
    //   110	122	481	java/io/IOException
    //   136	146	481	java/io/IOException
    //   160	170	481	java/io/IOException
    //   184	192	481	java/io/IOException
    //   206	210	481	java/io/IOException
    //   224	232	481	java/io/IOException
    //   246	251	481	java/io/IOException
    //   265	273	481	java/io/IOException
    //   287	295	481	java/io/IOException
    //   309	316	481	java/io/IOException
    //   330	338	481	java/io/IOException
    //   352	358	481	java/io/IOException
    //   372	377	481	java/io/IOException
    //   391	396	481	java/io/IOException
    //   410	417	481	java/io/IOException
    //   472	478	481	java/io/IOException
    //   23	34	642	finally
    //   584	589	672	java/io/IOException
    //   584	589	676	java/lang/NullPointerException
    //   553	558	680	java/io/IOException
    //   553	558	685	java/lang/NullPointerException
    //   651	656	690	java/io/IOException
    //   651	656	695	java/lang/NullPointerException
    //   34	41	700	finally
    //   417	431	709	finally
    //   437	455	709	finally
    //   60	70	717	finally
    //   84	96	717	finally
    //   110	122	717	finally
    //   136	146	717	finally
    //   160	170	717	finally
    //   184	192	717	finally
    //   206	210	717	finally
    //   224	232	717	finally
    //   246	251	717	finally
    //   265	273	717	finally
    //   287	295	717	finally
    //   309	316	717	finally
    //   330	338	717	finally
    //   352	358	717	finally
    //   372	377	717	finally
    //   391	396	717	finally
    //   410	417	717	finally
    //   472	478	717	finally
    //   503	508	717	finally
    //   518	525	717	finally
    //   535	553	717	finally
    //   23	34	732	java/io/IOException
    //   34	41	744	java/io/IOException
    //   417	431	753	java/io/IOException
    //   437	455	753	java/io/IOException
  }

  // ERROR //
  private static void extractLzmaToFile(InputStream paramInputStream, java.io.File paramFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 244
    //   4: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 246	java/io/BufferedInputStream
    //   10: astore_3
    //   11: aload_3
    //   12: aload_0
    //   13: invokespecial 249	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   16: new 251	java/io/BufferedOutputStream
    //   19: astore_0
    //   20: new 80	java/io/FileOutputStream
    //   23: astore 4
    //   25: aload 4
    //   27: aload_1
    //   28: invokespecial 81	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   31: aload_0
    //   32: aload 4
    //   34: invokespecial 254	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   37: aload_0
    //   38: astore 4
    //   40: aload_3
    //   41: astore 5
    //   43: iconst_5
    //   44: newarray byte
    //   46: astore 6
    //   48: aload_0
    //   49: astore 4
    //   51: aload_3
    //   52: astore 5
    //   54: aload_3
    //   55: aload 6
    //   57: iconst_0
    //   58: iconst_5
    //   59: invokevirtual 257	java/io/InputStream:read	([BII)I
    //   62: iconst_5
    //   63: if_icmpeq +119 -> 182
    //   66: aload_0
    //   67: astore 4
    //   69: aload_3
    //   70: astore 5
    //   72: new 111	java/io/IOException
    //   75: astore 6
    //   77: aload_0
    //   78: astore 4
    //   80: aload_3
    //   81: astore 5
    //   83: aload 6
    //   85: ldc_w 259
    //   88: invokespecial 260	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   91: aload_0
    //   92: astore 4
    //   94: aload_3
    //   95: astore 5
    //   97: ldc 244
    //   99: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: aload_0
    //   103: astore 4
    //   105: aload_3
    //   106: astore 5
    //   108: aload 6
    //   110: athrow
    //   111: astore 6
    //   113: aload_0
    //   114: astore 4
    //   116: aload_3
    //   117: astore 5
    //   119: aload_1
    //   120: invokevirtual 263	java/io/File:isFile	()Z
    //   123: ifeq +14 -> 137
    //   126: aload_0
    //   127: astore 4
    //   129: aload_3
    //   130: astore 5
    //   132: aload_1
    //   133: invokevirtual 78	java/io/File:delete	()Z
    //   136: pop
    //   137: aload_0
    //   138: astore 4
    //   140: aload_3
    //   141: astore 5
    //   143: ldc 244
    //   145: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aload_0
    //   149: astore 4
    //   151: aload_3
    //   152: astore 5
    //   154: aload 6
    //   156: athrow
    //   157: astore_0
    //   158: aload 5
    //   160: astore_3
    //   161: aload 4
    //   163: invokevirtual 266	java/io/OutputStream:flush	()V
    //   166: aload 4
    //   168: invokevirtual 219	java/io/OutputStream:close	()V
    //   171: aload_3
    //   172: invokevirtual 220	java/io/InputStream:close	()V
    //   175: ldc 244
    //   177: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: aload_0
    //   181: athrow
    //   182: aload_0
    //   183: astore 4
    //   185: aload_3
    //   186: astore 5
    //   188: new 268	g/a/b/a
    //   191: astore 7
    //   193: aload_0
    //   194: astore 4
    //   196: aload_3
    //   197: astore 5
    //   199: aload 7
    //   201: invokespecial 269	g/a/b/a:<init>	()V
    //   204: aload_0
    //   205: astore 4
    //   207: aload_3
    //   208: astore 5
    //   210: aload 7
    //   212: aload 6
    //   214: invokevirtual 273	g/a/b/a:cR	([B)Z
    //   217: ifne +48 -> 265
    //   220: aload_0
    //   221: astore 4
    //   223: aload_3
    //   224: astore 5
    //   226: new 111	java/io/IOException
    //   229: astore 6
    //   231: aload_0
    //   232: astore 4
    //   234: aload_3
    //   235: astore 5
    //   237: aload 6
    //   239: ldc_w 275
    //   242: invokespecial 260	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   245: aload_0
    //   246: astore 4
    //   248: aload_3
    //   249: astore 5
    //   251: ldc 244
    //   253: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: aload_0
    //   257: astore 4
    //   259: aload_3
    //   260: astore 5
    //   262: aload 6
    //   264: athrow
    //   265: lconst_0
    //   266: lstore 8
    //   268: iload_2
    //   269: bipush 8
    //   271: if_icmpge +53 -> 324
    //   274: aload_0
    //   275: astore 4
    //   277: aload_3
    //   278: astore 5
    //   280: aload_3
    //   281: invokevirtual 278	java/io/InputStream:read	()I
    //   284: istore 10
    //   286: iload 10
    //   288: ifge +17 -> 305
    //   291: aload_0
    //   292: astore 4
    //   294: aload_3
    //   295: astore 5
    //   297: ldc 18
    //   299: ldc_w 280
    //   302: invokestatic 283	org/xwalk/core/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   305: lload 8
    //   307: iload 10
    //   309: i2l
    //   310: iload_2
    //   311: bipush 8
    //   313: imul
    //   314: lshl
    //   315: lor
    //   316: lstore 8
    //   318: iinc 2 1
    //   321: goto -53 -> 268
    //   324: aload_0
    //   325: astore 4
    //   327: aload_3
    //   328: astore 5
    //   330: aload 7
    //   332: aload_3
    //   333: aload_0
    //   334: lload 8
    //   336: invokevirtual 287	g/a/b/a:a	(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z
    //   339: ifne +48 -> 387
    //   342: aload_0
    //   343: astore 4
    //   345: aload_3
    //   346: astore 5
    //   348: new 111	java/io/IOException
    //   351: astore 6
    //   353: aload_0
    //   354: astore 4
    //   356: aload_3
    //   357: astore 5
    //   359: aload 6
    //   361: ldc_w 289
    //   364: invokespecial 260	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   367: aload_0
    //   368: astore 4
    //   370: aload_3
    //   371: astore 5
    //   373: ldc 244
    //   375: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   378: aload_0
    //   379: astore 4
    //   381: aload_3
    //   382: astore 5
    //   384: aload 6
    //   386: athrow
    //   387: aload_0
    //   388: invokevirtual 266	java/io/OutputStream:flush	()V
    //   391: aload_0
    //   392: invokevirtual 219	java/io/OutputStream:close	()V
    //   395: aload_3
    //   396: invokevirtual 220	java/io/InputStream:close	()V
    //   399: ldc 244
    //   401: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   404: return
    //   405: astore_0
    //   406: ldc 244
    //   408: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: goto -7 -> 404
    //   414: astore_1
    //   415: goto -24 -> 391
    //   418: astore_1
    //   419: goto -28 -> 391
    //   422: astore_0
    //   423: goto -28 -> 395
    //   426: astore_0
    //   427: goto -32 -> 395
    //   430: astore_0
    //   431: goto -25 -> 406
    //   434: astore_1
    //   435: goto -269 -> 166
    //   438: astore_1
    //   439: goto -273 -> 166
    //   442: astore_1
    //   443: goto -272 -> 171
    //   446: astore_1
    //   447: goto -276 -> 171
    //   450: astore_1
    //   451: goto -276 -> 175
    //   454: astore_1
    //   455: goto -280 -> 175
    //   458: astore_0
    //   459: aconst_null
    //   460: astore 4
    //   462: aconst_null
    //   463: astore_3
    //   464: goto -303 -> 161
    //   467: astore_0
    //   468: aconst_null
    //   469: astore 4
    //   471: goto -310 -> 161
    //   474: astore 6
    //   476: aconst_null
    //   477: astore_0
    //   478: aconst_null
    //   479: astore_3
    //   480: goto -367 -> 113
    //   483: astore 6
    //   485: aconst_null
    //   486: astore_0
    //   487: goto -374 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   43	48	111	java/io/IOException
    //   54	66	111	java/io/IOException
    //   72	77	111	java/io/IOException
    //   83	91	111	java/io/IOException
    //   97	102	111	java/io/IOException
    //   108	111	111	java/io/IOException
    //   188	193	111	java/io/IOException
    //   199	204	111	java/io/IOException
    //   210	220	111	java/io/IOException
    //   226	231	111	java/io/IOException
    //   237	245	111	java/io/IOException
    //   251	256	111	java/io/IOException
    //   262	265	111	java/io/IOException
    //   280	286	111	java/io/IOException
    //   297	305	111	java/io/IOException
    //   330	342	111	java/io/IOException
    //   348	353	111	java/io/IOException
    //   359	367	111	java/io/IOException
    //   373	378	111	java/io/IOException
    //   384	387	111	java/io/IOException
    //   43	48	157	finally
    //   54	66	157	finally
    //   72	77	157	finally
    //   83	91	157	finally
    //   97	102	157	finally
    //   108	111	157	finally
    //   119	126	157	finally
    //   132	137	157	finally
    //   143	148	157	finally
    //   154	157	157	finally
    //   188	193	157	finally
    //   199	204	157	finally
    //   210	220	157	finally
    //   226	231	157	finally
    //   237	245	157	finally
    //   251	256	157	finally
    //   262	265	157	finally
    //   280	286	157	finally
    //   297	305	157	finally
    //   330	342	157	finally
    //   348	353	157	finally
    //   359	367	157	finally
    //   373	378	157	finally
    //   384	387	157	finally
    //   395	399	405	java/io/IOException
    //   387	391	414	java/io/IOException
    //   387	391	418	java/lang/NullPointerException
    //   391	395	422	java/io/IOException
    //   391	395	426	java/lang/NullPointerException
    //   395	399	430	java/lang/NullPointerException
    //   161	166	434	java/io/IOException
    //   161	166	438	java/lang/NullPointerException
    //   166	171	442	java/io/IOException
    //   166	171	446	java/lang/NullPointerException
    //   171	175	450	java/io/IOException
    //   171	175	454	java/lang/NullPointerException
    //   7	16	458	finally
    //   16	37	467	finally
    //   7	16	474	java/io/IOException
    //   16	37	483	java/io/IOException
  }

  // ERROR //
  public static boolean extractResource(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 291
    //   5: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 18
    //   10: ldc_w 293
    //   13: aload_0
    //   14: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   17: invokevirtual 56	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   20: invokestatic 131	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: invokestatic 137	android/os/SystemClock:uptimeMillis	()J
    //   26: lstore_3
    //   27: new 139	java/util/zip/ZipFile
    //   30: astore 5
    //   32: aload 5
    //   34: aload_0
    //   35: invokespecial 140	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   38: aload 5
    //   40: astore_0
    //   41: getstatic 31	org/xwalk/core/XWalkDecompressor:MANDATORY_RESOURCES	[Ljava/lang/String;
    //   44: astore 6
    //   46: aload 5
    //   48: astore_0
    //   49: aload 6
    //   51: arraylength
    //   52: istore 7
    //   54: iconst_0
    //   55: istore 8
    //   57: iload 8
    //   59: iload 7
    //   61: if_icmpge +432 -> 493
    //   64: aload 6
    //   66: iload 8
    //   68: aaload
    //   69: astore 9
    //   71: aload 5
    //   73: astore_0
    //   74: aload 9
    //   76: invokestatic 297	org/xwalk/core/XWalkDecompressor:isNativeLibrary	(Ljava/lang/String;)Z
    //   79: ifeq +122 -> 201
    //   82: aload 5
    //   84: astore_0
    //   85: new 114	java/lang/StringBuilder
    //   88: astore 10
    //   90: aload 5
    //   92: astore_0
    //   93: aload 10
    //   95: ldc_w 299
    //   98: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   101: aload 5
    //   103: astore_0
    //   104: aload 5
    //   106: aload 10
    //   108: getstatic 302	java/io/File:separator	Ljava/lang/String;
    //   111: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: ldc_w 304
    //   117: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: getstatic 302	java/io/File:separator	Ljava/lang/String;
    //   123: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: aload 9
    //   128: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   134: invokevirtual 308	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   137: astore 10
    //   139: aload 10
    //   141: ifnonnull +184 -> 325
    //   144: aload 5
    //   146: astore_0
    //   147: aload 9
    //   149: invokestatic 311	org/xwalk/core/XWalkDecompressor:isClassesDex	(Ljava/lang/String;)Z
    //   152: ifeq +123 -> 275
    //   155: aload 5
    //   157: astore_0
    //   158: new 114	java/lang/StringBuilder
    //   161: astore 10
    //   163: aload 5
    //   165: astore_0
    //   166: aload 10
    //   168: invokespecial 312	java/lang/StringBuilder:<init>	()V
    //   171: aload 5
    //   173: astore_0
    //   174: ldc 18
    //   176: aload 10
    //   178: aload 9
    //   180: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: ldc_w 314
    //   186: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   192: invokestatic 131	org/xwalk/core/Log:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   195: iinc 8 1
    //   198: goto -141 -> 57
    //   201: aload 5
    //   203: astore_0
    //   204: aload 9
    //   206: invokestatic 317	org/xwalk/core/XWalkDecompressor:isAsset	(Ljava/lang/String;)Z
    //   209: ifeq +51 -> 260
    //   212: aload 5
    //   214: astore_0
    //   215: new 114	java/lang/StringBuilder
    //   218: astore 10
    //   220: aload 5
    //   222: astore_0
    //   223: aload 10
    //   225: ldc_w 319
    //   228: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   231: aload 5
    //   233: astore_0
    //   234: aload 5
    //   236: aload 10
    //   238: getstatic 302	java/io/File:separator	Ljava/lang/String;
    //   241: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: aload 9
    //   246: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   252: invokevirtual 308	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   255: astore 10
    //   257: goto -118 -> 139
    //   260: aload 5
    //   262: astore_0
    //   263: aload 5
    //   265: aload 9
    //   267: invokevirtual 308	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   270: astore 10
    //   272: goto -133 -> 139
    //   275: aload 5
    //   277: astore_0
    //   278: new 114	java/lang/StringBuilder
    //   281: astore_1
    //   282: aload 5
    //   284: astore_0
    //   285: aload_1
    //   286: invokespecial 312	java/lang/StringBuilder:<init>	()V
    //   289: aload 5
    //   291: astore_0
    //   292: ldc 18
    //   294: aload_1
    //   295: aload 9
    //   297: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: ldc_w 321
    //   303: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   309: invokestatic 98	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   312: aload 5
    //   314: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   317: ldc_w 291
    //   320: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   323: iload_2
    //   324: ireturn
    //   325: aload 5
    //   327: astore_0
    //   328: ldc 18
    //   330: ldc_w 323
    //   333: aload 9
    //   335: invokestatic 52	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   338: invokevirtual 56	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   341: invokestatic 61	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   344: aload 5
    //   346: astore_0
    //   347: new 65	java/io/File
    //   350: astore 11
    //   352: aload 5
    //   354: astore_0
    //   355: aload 11
    //   357: aload_1
    //   358: aload 9
    //   360: invokespecial 241	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   363: aload 5
    //   365: astore_0
    //   366: aload 11
    //   368: invokevirtual 263	java/io/File:isFile	()Z
    //   371: ifeq +23 -> 394
    //   374: aload 5
    //   376: astore_0
    //   377: aload 11
    //   379: invokevirtual 75	java/io/File:exists	()Z
    //   382: ifeq +12 -> 394
    //   385: aload 5
    //   387: astore_0
    //   388: aload 11
    //   390: invokevirtual 78	java/io/File:delete	()Z
    //   393: pop
    //   394: aload 5
    //   396: astore_0
    //   397: aload 5
    //   399: aload 10
    //   401: invokevirtual 183	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   404: astore 11
    //   406: aload 5
    //   408: astore_0
    //   409: new 65	java/io/File
    //   412: astore 10
    //   414: aload 5
    //   416: astore_0
    //   417: aload 10
    //   419: aload_1
    //   420: aload 9
    //   422: invokespecial 241	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   425: aload 5
    //   427: astore_0
    //   428: aload 11
    //   430: aload 10
    //   432: invokestatic 326	org/xwalk/core/XWalkDecompressor:extractStreamToFile	(Ljava/io/InputStream;Ljava/io/File;)V
    //   435: goto -240 -> 195
    //   438: astore 10
    //   440: aload 5
    //   442: astore_1
    //   443: aload_1
    //   444: astore_0
    //   445: new 114	java/lang/StringBuilder
    //   448: astore 5
    //   450: aload_1
    //   451: astore_0
    //   452: aload 5
    //   454: ldc_w 328
    //   457: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   460: aload_1
    //   461: astore_0
    //   462: ldc 18
    //   464: aload 5
    //   466: aload 10
    //   468: invokevirtual 215	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   471: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   477: invokestatic 98	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   480: aload_1
    //   481: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   484: ldc_w 291
    //   487: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   490: goto -167 -> 323
    //   493: aload 5
    //   495: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   498: invokestatic 225	java/lang/System:gc	()V
    //   501: ldc 18
    //   503: new 114	java/lang/StringBuilder
    //   506: dup
    //   507: ldc_w 330
    //   510: invokespecial 117	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   513: invokestatic 137	android/os/SystemClock:uptimeMillis	()J
    //   516: lload_3
    //   517: lsub
    //   518: invokevirtual 230	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   521: ldc 232
    //   523: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   526: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   529: invokestatic 61	org/xwalk/core/Log:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   532: iconst_1
    //   533: istore_2
    //   534: ldc_w 291
    //   537: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   540: goto -217 -> 323
    //   543: astore_1
    //   544: aconst_null
    //   545: astore_0
    //   546: aload_0
    //   547: invokevirtual 218	java/util/zip/ZipFile:close	()V
    //   550: ldc_w 291
    //   553: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   556: aload_1
    //   557: athrow
    //   558: astore_0
    //   559: goto -242 -> 317
    //   562: astore_0
    //   563: goto -246 -> 317
    //   566: astore_0
    //   567: goto -69 -> 498
    //   570: astore_0
    //   571: goto -73 -> 498
    //   574: astore_0
    //   575: goto -91 -> 484
    //   578: astore_0
    //   579: goto -95 -> 484
    //   582: astore_0
    //   583: goto -33 -> 550
    //   586: astore_0
    //   587: goto -37 -> 550
    //   590: astore_1
    //   591: goto -45 -> 546
    //   594: astore 10
    //   596: aconst_null
    //   597: astore_1
    //   598: goto -155 -> 443
    //
    // Exception table:
    //   from	to	target	type
    //   41	46	438	java/io/IOException
    //   49	54	438	java/io/IOException
    //   74	82	438	java/io/IOException
    //   85	90	438	java/io/IOException
    //   93	101	438	java/io/IOException
    //   104	139	438	java/io/IOException
    //   147	155	438	java/io/IOException
    //   158	163	438	java/io/IOException
    //   166	171	438	java/io/IOException
    //   174	195	438	java/io/IOException
    //   204	212	438	java/io/IOException
    //   215	220	438	java/io/IOException
    //   223	231	438	java/io/IOException
    //   234	257	438	java/io/IOException
    //   263	272	438	java/io/IOException
    //   278	282	438	java/io/IOException
    //   285	289	438	java/io/IOException
    //   292	312	438	java/io/IOException
    //   328	344	438	java/io/IOException
    //   347	352	438	java/io/IOException
    //   355	363	438	java/io/IOException
    //   366	374	438	java/io/IOException
    //   377	385	438	java/io/IOException
    //   388	394	438	java/io/IOException
    //   397	406	438	java/io/IOException
    //   409	414	438	java/io/IOException
    //   417	425	438	java/io/IOException
    //   428	435	438	java/io/IOException
    //   27	38	543	finally
    //   312	317	558	java/io/IOException
    //   312	317	562	java/lang/NullPointerException
    //   493	498	566	java/io/IOException
    //   493	498	570	java/lang/NullPointerException
    //   480	484	574	java/io/IOException
    //   480	484	578	java/lang/NullPointerException
    //   546	550	582	java/io/IOException
    //   546	550	586	java/lang/NullPointerException
    //   41	46	590	finally
    //   49	54	590	finally
    //   74	82	590	finally
    //   85	90	590	finally
    //   93	101	590	finally
    //   104	139	590	finally
    //   147	155	590	finally
    //   158	163	590	finally
    //   166	171	590	finally
    //   174	195	590	finally
    //   204	212	590	finally
    //   215	220	590	finally
    //   223	231	590	finally
    //   234	257	590	finally
    //   263	272	590	finally
    //   278	282	590	finally
    //   285	289	590	finally
    //   292	312	590	finally
    //   328	344	590	finally
    //   347	352	590	finally
    //   355	363	590	finally
    //   366	374	590	finally
    //   377	385	590	finally
    //   388	394	590	finally
    //   397	406	590	finally
    //   409	414	590	finally
    //   417	425	590	finally
    //   428	435	590	finally
    //   445	450	590	finally
    //   452	460	590	finally
    //   462	480	590	finally
    //   27	38	594	java/io/IOException
  }

  // ERROR //
  private static void extractStreamToFile(InputStream paramInputStream, java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc_w 331
    //   3: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 334	java/io/InputStream:available	()I
    //   10: pop
    //   11: new 80	java/io/FileOutputStream
    //   14: astore_2
    //   15: aload_2
    //   16: aload_1
    //   17: invokespecial 81	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   20: aload_2
    //   21: astore_3
    //   22: ldc 14
    //   24: newarray byte
    //   26: astore 4
    //   28: aload_2
    //   29: astore_3
    //   30: aload_0
    //   31: aload 4
    //   33: invokevirtual 203	java/io/InputStream:read	([B)I
    //   36: istore 5
    //   38: iload 5
    //   40: iflt +69 -> 109
    //   43: aload_2
    //   44: astore_3
    //   45: aload_2
    //   46: aload 4
    //   48: iconst_0
    //   49: iload 5
    //   51: invokevirtual 206	java/io/OutputStream:write	([BII)V
    //   54: goto -26 -> 28
    //   57: astore 4
    //   59: aload_2
    //   60: astore_3
    //   61: aload_1
    //   62: invokevirtual 263	java/io/File:isFile	()Z
    //   65: ifeq +10 -> 75
    //   68: aload_2
    //   69: astore_3
    //   70: aload_1
    //   71: invokevirtual 78	java/io/File:delete	()Z
    //   74: pop
    //   75: aload_2
    //   76: astore_3
    //   77: ldc_w 331
    //   80: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: aload_2
    //   84: astore_3
    //   85: aload 4
    //   87: athrow
    //   88: astore_1
    //   89: aload_3
    //   90: invokevirtual 266	java/io/OutputStream:flush	()V
    //   93: aload_3
    //   94: invokevirtual 219	java/io/OutputStream:close	()V
    //   97: aload_0
    //   98: invokevirtual 220	java/io/InputStream:close	()V
    //   101: ldc_w 331
    //   104: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: aload_1
    //   108: athrow
    //   109: aload_2
    //   110: invokevirtual 266	java/io/OutputStream:flush	()V
    //   113: aload_2
    //   114: invokevirtual 219	java/io/OutputStream:close	()V
    //   117: aload_0
    //   118: invokevirtual 220	java/io/InputStream:close	()V
    //   121: ldc_w 331
    //   124: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   127: return
    //   128: astore_0
    //   129: ldc_w 331
    //   132: invokestatic 107	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   135: goto -8 -> 127
    //   138: astore_1
    //   139: goto -26 -> 113
    //   142: astore_1
    //   143: goto -30 -> 113
    //   146: astore_1
    //   147: goto -30 -> 117
    //   150: astore_1
    //   151: goto -34 -> 117
    //   154: astore_0
    //   155: goto -26 -> 129
    //   158: astore_2
    //   159: goto -66 -> 93
    //   162: astore_2
    //   163: goto -70 -> 93
    //   166: astore_3
    //   167: goto -70 -> 97
    //   170: astore_3
    //   171: goto -74 -> 97
    //   174: astore_0
    //   175: goto -74 -> 101
    //   178: astore_0
    //   179: goto -78 -> 101
    //   182: astore_1
    //   183: aconst_null
    //   184: astore_3
    //   185: goto -96 -> 89
    //   188: astore 4
    //   190: aconst_null
    //   191: astore_2
    //   192: goto -133 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   22	28	57	java/io/IOException
    //   30	38	57	java/io/IOException
    //   45	54	57	java/io/IOException
    //   22	28	88	finally
    //   30	38	88	finally
    //   45	54	88	finally
    //   61	68	88	finally
    //   70	75	88	finally
    //   77	83	88	finally
    //   85	88	88	finally
    //   117	121	128	java/io/IOException
    //   109	113	138	java/io/IOException
    //   109	113	142	java/lang/NullPointerException
    //   113	117	146	java/io/IOException
    //   113	117	150	java/lang/NullPointerException
    //   117	121	154	java/lang/NullPointerException
    //   89	93	158	java/io/IOException
    //   89	93	162	java/lang/NullPointerException
    //   93	97	166	java/io/IOException
    //   93	97	170	java/lang/NullPointerException
    //   97	101	174	java/io/IOException
    //   97	101	178	java/lang/NullPointerException
    //   6	20	182	finally
    //   6	20	188	java/io/IOException
  }

  private static boolean isAsset(String paramString)
  {
    AppMethodBeat.i(85596);
    boolean bool;
    if ((paramString.endsWith(".dat")) || (paramString.endsWith(".pak")) || (paramString.endsWith(".js")))
    {
      bool = true;
      AppMethodBeat.o(85596);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85596);
    }
  }

  private static boolean isClassesDex(String paramString)
  {
    AppMethodBeat.i(85597);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      bool = false;
      AppMethodBeat.o(85597);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith("classes.dex");
      AppMethodBeat.o(85597);
    }
  }

  private static boolean isNativeLibrary(String paramString)
  {
    AppMethodBeat.i(85595);
    boolean bool = paramString.endsWith(".so");
    AppMethodBeat.o(85595);
    return bool;
  }

  private static InputStream openRawResource(String paramString)
  {
    AppMethodBeat.i(85598);
    Context localContext = XWalkEnvironment.getApplicationContext();
    Resources localResources = localContext.getResources();
    paramString = localResources.openRawResource(localResources.getIdentifier(paramString.split("\\.")[0], "raw", localContext.getPackageName()));
    AppMethodBeat.o(85598);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkDecompressor
 * JD-Core Version:    0.6.2
 */