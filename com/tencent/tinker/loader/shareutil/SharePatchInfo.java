package com.tencent.tinker.loader.shareutil;

import com.tencent.tinker.loader.TinkerRuntimeException;
import java.io.File;
import java.io.IOException;

public class SharePatchInfo
{
  public String ABP;
  public String AES;
  public boolean AET;
  public String AEU;
  public String uWO;

  public SharePatchInfo(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4)
  {
    this.uWO = paramString1;
    this.AES = paramString2;
    this.AET = paramBoolean;
    this.AEU = paramString3;
    this.ABP = paramString4;
  }

  // ERROR //
  private static boolean a(File paramFile, SharePatchInfo paramSharePatchInfo)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: istore_3
    //   4: aload_0
    //   5: ifnull +9 -> 14
    //   8: aload_1
    //   9: ifnonnull +7 -> 16
    //   12: iload_2
    //   13: istore_3
    //   14: iload_3
    //   15: ireturn
    //   16: aload_1
    //   17: getfield 24	com/tencent/tinker/loader/shareutil/SharePatchInfo:AEU	Ljava/lang/String;
    //   20: invokestatic 37	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:isNullOrNil	(Ljava/lang/String;)Z
    //   23: ifeq +10 -> 33
    //   26: aload_1
    //   27: getstatic 42	android/os/Build:FINGERPRINT	Ljava/lang/String;
    //   30: putfield 24	com/tencent/tinker/loader/shareutil/SharePatchInfo:AEU	Ljava/lang/String;
    //   33: aload_1
    //   34: getfield 26	com/tencent/tinker/loader/shareutil/SharePatchInfo:ABP	Ljava/lang/String;
    //   37: invokestatic 37	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:isNullOrNil	(Ljava/lang/String;)Z
    //   40: ifeq +9 -> 49
    //   43: aload_1
    //   44: ldc 44
    //   46: putfield 26	com/tencent/tinker/loader/shareutil/SharePatchInfo:ABP	Ljava/lang/String;
    //   49: new 46	java/lang/StringBuilder
    //   52: dup
    //   53: ldc 48
    //   55: invokespecial 51	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   58: aload_0
    //   59: invokevirtual 57	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   62: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: ldc 63
    //   67: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload_1
    //   71: getfield 18	com/tencent/tinker/loader/shareutil/SharePatchInfo:uWO	Ljava/lang/String;
    //   74: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: ldc 65
    //   79: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: aload_1
    //   83: getfield 20	com/tencent/tinker/loader/shareutil/SharePatchInfo:AES	Ljava/lang/String;
    //   86: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: ldc 67
    //   91: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: astore 4
    //   96: aload_1
    //   97: getfield 22	com/tencent/tinker/loader/shareutil/SharePatchInfo:AET	Z
    //   100: ifeq +285 -> 385
    //   103: iconst_1
    //   104: istore 5
    //   106: aload 4
    //   108: iload 5
    //   110: invokevirtual 70	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   113: ldc 72
    //   115: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: aload_1
    //   119: getfield 24	com/tencent/tinker/loader/shareutil/SharePatchInfo:AEU	Ljava/lang/String;
    //   122: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: ldc 74
    //   127: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: aload_1
    //   131: getfield 26	com/tencent/tinker/loader/shareutil/SharePatchInfo:ABP	Ljava/lang/String;
    //   134: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload_0
    //   139: invokevirtual 78	java/io/File:getParentFile	()Ljava/io/File;
    //   142: astore 4
    //   144: aload 4
    //   146: invokevirtual 82	java/io/File:exists	()Z
    //   149: ifne +9 -> 158
    //   152: aload 4
    //   154: invokevirtual 85	java/io/File:mkdirs	()Z
    //   157: pop
    //   158: iconst_0
    //   159: istore 6
    //   161: iconst_0
    //   162: istore 5
    //   164: iload 6
    //   166: iconst_2
    //   167: if_icmpge +293 -> 460
    //   170: iload 5
    //   172: ifne +288 -> 460
    //   175: new 87	java/util/Properties
    //   178: dup
    //   179: invokespecial 88	java/util/Properties:<init>	()V
    //   182: astore 7
    //   184: aload 7
    //   186: ldc 90
    //   188: aload_1
    //   189: getfield 18	com/tencent/tinker/loader/shareutil/SharePatchInfo:uWO	Ljava/lang/String;
    //   192: invokevirtual 94	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   195: pop
    //   196: aload 7
    //   198: ldc 96
    //   200: aload_1
    //   201: getfield 20	com/tencent/tinker/loader/shareutil/SharePatchInfo:AES	Ljava/lang/String;
    //   204: invokevirtual 94	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   207: pop
    //   208: aload_1
    //   209: getfield 22	com/tencent/tinker/loader/shareutil/SharePatchInfo:AET	Z
    //   212: ifeq +179 -> 391
    //   215: ldc 98
    //   217: astore 4
    //   219: aload 7
    //   221: ldc 100
    //   223: aload 4
    //   225: invokevirtual 94	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   228: pop
    //   229: aload 7
    //   231: ldc 102
    //   233: aload_1
    //   234: getfield 24	com/tencent/tinker/loader/shareutil/SharePatchInfo:AEU	Ljava/lang/String;
    //   237: invokevirtual 94	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   240: pop
    //   241: aload 7
    //   243: ldc 104
    //   245: aload_1
    //   246: getfield 26	com/tencent/tinker/loader/shareutil/SharePatchInfo:ABP	Ljava/lang/String;
    //   249: invokevirtual 94	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   252: pop
    //   253: new 106	java/io/FileOutputStream
    //   256: astore 8
    //   258: aload 8
    //   260: aload_0
    //   261: iconst_0
    //   262: invokespecial 109	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   265: aload 8
    //   267: astore 4
    //   269: new 46	java/lang/StringBuilder
    //   272: astore 9
    //   274: aload 8
    //   276: astore 4
    //   278: aload 9
    //   280: ldc 111
    //   282: invokespecial 51	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   285: aload 8
    //   287: astore 4
    //   289: aload 7
    //   291: aload 8
    //   293: aload 9
    //   295: aload_1
    //   296: getfield 18	com/tencent/tinker/loader/shareutil/SharePatchInfo:uWO	Ljava/lang/String;
    //   299: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: ldc 113
    //   304: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: aload_1
    //   308: getfield 20	com/tencent/tinker/loader/shareutil/SharePatchInfo:AES	Ljava/lang/String;
    //   311: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: invokevirtual 116	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   317: invokevirtual 120	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   320: aload 8
    //   322: invokestatic 126	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   325: aload_0
    //   326: invokestatic 130	com/tencent/tinker/loader/shareutil/SharePatchInfo:av	(Ljava/io/File;)Lcom/tencent/tinker/loader/shareutil/SharePatchInfo;
    //   329: astore 4
    //   331: aload 4
    //   333: ifnull +121 -> 454
    //   336: aload 4
    //   338: getfield 18	com/tencent/tinker/loader/shareutil/SharePatchInfo:uWO	Ljava/lang/String;
    //   341: aload_1
    //   342: getfield 18	com/tencent/tinker/loader/shareutil/SharePatchInfo:uWO	Ljava/lang/String;
    //   345: invokevirtual 136	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   348: ifeq +106 -> 454
    //   351: aload 4
    //   353: getfield 20	com/tencent/tinker/loader/shareutil/SharePatchInfo:AES	Ljava/lang/String;
    //   356: aload_1
    //   357: getfield 20	com/tencent/tinker/loader/shareutil/SharePatchInfo:AES	Ljava/lang/String;
    //   360: invokevirtual 136	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   363: ifeq +91 -> 454
    //   366: iconst_1
    //   367: istore 5
    //   369: iload 5
    //   371: ifne +8 -> 379
    //   374: aload_0
    //   375: invokevirtual 139	java/io/File:delete	()Z
    //   378: pop
    //   379: iinc 6 1
    //   382: goto -218 -> 164
    //   385: iconst_0
    //   386: istore 5
    //   388: goto -282 -> 106
    //   391: ldc 141
    //   393: astore 4
    //   395: goto -176 -> 219
    //   398: astore 7
    //   400: aconst_null
    //   401: astore 8
    //   403: aload 8
    //   405: astore 4
    //   407: new 46	java/lang/StringBuilder
    //   410: astore 9
    //   412: aload 8
    //   414: astore 4
    //   416: aload 9
    //   418: ldc 143
    //   420: invokespecial 51	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   423: aload 8
    //   425: astore 4
    //   427: aload 9
    //   429: aload 7
    //   431: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   434: pop
    //   435: aload 8
    //   437: invokestatic 126	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   440: goto -115 -> 325
    //   443: astore_0
    //   444: aconst_null
    //   445: astore 4
    //   447: aload 4
    //   449: invokestatic 126	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   452: aload_0
    //   453: athrow
    //   454: iconst_0
    //   455: istore 5
    //   457: goto -88 -> 369
    //   460: iload_2
    //   461: istore_3
    //   462: iload 5
    //   464: ifeq -450 -> 14
    //   467: iconst_1
    //   468: istore_3
    //   469: goto -455 -> 14
    //   472: astore_0
    //   473: goto -26 -> 447
    //   476: astore 7
    //   478: goto -75 -> 403
    //
    // Exception table:
    //   from	to	target	type
    //   253	265	398	java/lang/Exception
    //   253	265	443	finally
    //   269	274	472	finally
    //   278	285	472	finally
    //   289	320	472	finally
    //   407	412	472	finally
    //   416	423	472	finally
    //   427	435	472	finally
    //   269	274	476	java/lang/Exception
    //   278	285	476	java/lang/Exception
    //   289	320	476	java/lang/Exception
  }

  public static boolean a(File paramFile1, SharePatchInfo paramSharePatchInfo, File paramFile2)
  {
    boolean bool;
    if ((paramFile1 == null) || (paramSharePatchInfo == null) || (paramFile2 == null))
      bool = false;
    File localFile2;
    while (true)
    {
      return bool;
      File localFile1 = paramFile2.getParentFile();
      if (!localFile1.exists())
        localFile1.mkdirs();
      localFile2 = null;
      localFile1 = null;
      try
      {
        paramFile2 = ShareFileLockHelper.ao(paramFile2);
        localFile1 = paramFile2;
        localFile2 = paramFile2;
        bool = a(paramFile1, paramSharePatchInfo);
        try
        {
          paramFile2.close();
        }
        catch (IOException paramFile1)
        {
        }
      }
      catch (Exception paramSharePatchInfo)
      {
        localFile2 = localFile1;
        paramFile1 = new com/tencent/tinker/loader/TinkerRuntimeException;
        localFile2 = localFile1;
        paramFile1.<init>("rewritePatchInfoFileWithLock fail", paramSharePatchInfo);
        localFile2 = localFile1;
        throw paramFile1;
      }
      finally
      {
        if (localFile2 == null);
      }
    }
    try
    {
      localFile2.close();
      label107: throw paramFile1;
    }
    catch (IOException paramSharePatchInfo)
    {
      break label107;
    }
  }

  // ERROR //
  private static SharePatchInfo av(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aconst_null
    //   10: astore 5
    //   12: aconst_null
    //   13: astore 6
    //   15: iconst_0
    //   16: istore 7
    //   18: iconst_0
    //   19: istore 8
    //   21: iload 7
    //   23: iconst_2
    //   24: if_icmpge +294 -> 318
    //   27: iload 8
    //   29: ifne +289 -> 318
    //   32: iinc 7 1
    //   35: new 87	java/util/Properties
    //   38: dup
    //   39: invokespecial 88	java/util/Properties:<init>	()V
    //   42: astore 9
    //   44: new 169	java/io/FileInputStream
    //   47: astore 10
    //   49: aload 10
    //   51: aload_0
    //   52: invokespecial 172	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   55: aload 10
    //   57: astore 11
    //   59: aload 9
    //   61: aload 10
    //   63: invokevirtual 176	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   66: aload 10
    //   68: astore 11
    //   70: aload 9
    //   72: ldc 90
    //   74: invokevirtual 180	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   77: astore 12
    //   79: aload 12
    //   81: astore 6
    //   83: aload 10
    //   85: astore 11
    //   87: iload_3
    //   88: istore 13
    //   90: aload 4
    //   92: astore 12
    //   94: aload 9
    //   96: ldc 96
    //   98: invokevirtual 180	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   101: astore 14
    //   103: aload 10
    //   105: astore 11
    //   107: aload 14
    //   109: astore 5
    //   111: iload_3
    //   112: istore 13
    //   114: aload 4
    //   116: astore 12
    //   118: ldc 141
    //   120: aload 9
    //   122: ldc 100
    //   124: invokevirtual 180	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   127: invokevirtual 136	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   130: ifne +121 -> 251
    //   133: iconst_1
    //   134: istore_3
    //   135: aload 10
    //   137: astore 11
    //   139: aload 14
    //   141: astore 5
    //   143: iload_3
    //   144: istore 13
    //   146: aload 4
    //   148: astore 12
    //   150: aload 9
    //   152: ldc 102
    //   154: invokevirtual 180	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   157: astore 4
    //   159: aload 10
    //   161: astore 11
    //   163: aload 14
    //   165: astore 5
    //   167: iload_3
    //   168: istore 13
    //   170: aload 4
    //   172: astore 12
    //   174: aload 9
    //   176: ldc 104
    //   178: invokevirtual 180	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   181: astore 9
    //   183: aload 9
    //   185: astore_2
    //   186: aload 10
    //   188: invokestatic 126	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   191: aload 14
    //   193: astore 5
    //   195: aload 6
    //   197: ifnull +171 -> 368
    //   200: aload 5
    //   202: ifnull +166 -> 368
    //   205: aload 6
    //   207: ldc 182
    //   209: invokevirtual 136	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   212: ifne +11 -> 223
    //   215: aload 6
    //   217: invokestatic 185	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aus	(Ljava/lang/String;)Z
    //   220: ifeq +11 -> 231
    //   223: aload 5
    //   225: invokestatic 185	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aus	(Ljava/lang/String;)Z
    //   228: ifne +84 -> 312
    //   231: new 46	java/lang/StringBuilder
    //   234: dup
    //   235: ldc 187
    //   237: invokespecial 51	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   240: aload_0
    //   241: invokevirtual 57	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   244: invokevirtual 61	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   247: pop
    //   248: goto -227 -> 21
    //   251: iconst_0
    //   252: istore_3
    //   253: goto -118 -> 135
    //   256: astore 12
    //   258: aconst_null
    //   259: astore 10
    //   261: aload 10
    //   263: astore 11
    //   265: new 46	java/lang/StringBuilder
    //   268: astore 14
    //   270: aload 10
    //   272: astore 11
    //   274: aload 14
    //   276: ldc 189
    //   278: invokespecial 51	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   281: aload 10
    //   283: astore 11
    //   285: aload 14
    //   287: aload 12
    //   289: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload 10
    //   295: invokestatic 126	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   298: goto -103 -> 195
    //   301: astore_0
    //   302: aconst_null
    //   303: astore 11
    //   305: aload 11
    //   307: invokestatic 126	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   310: aload_0
    //   311: athrow
    //   312: iconst_1
    //   313: istore 8
    //   315: goto -294 -> 21
    //   318: aload_1
    //   319: astore_0
    //   320: iload 8
    //   322: ifeq +19 -> 341
    //   325: new 2	com/tencent/tinker/loader/shareutil/SharePatchInfo
    //   328: dup
    //   329: aload 6
    //   331: aload 5
    //   333: iload_3
    //   334: aload 4
    //   336: aload_2
    //   337: invokespecial 191	com/tencent/tinker/loader/shareutil/SharePatchInfo:<init>	(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    //   340: astore_0
    //   341: aload_0
    //   342: areturn
    //   343: astore_0
    //   344: goto -39 -> 305
    //   347: astore 12
    //   349: goto -88 -> 261
    //   352: astore 11
    //   354: iload 13
    //   356: istore_3
    //   357: aload 12
    //   359: astore 4
    //   361: aload 11
    //   363: astore 12
    //   365: goto -104 -> 261
    //   368: goto -347 -> 21
    //
    // Exception table:
    //   from	to	target	type
    //   44	55	256	java/io/IOException
    //   44	55	301	finally
    //   59	66	343	finally
    //   70	79	343	finally
    //   94	103	343	finally
    //   118	133	343	finally
    //   150	159	343	finally
    //   174	183	343	finally
    //   265	270	343	finally
    //   274	281	343	finally
    //   285	293	343	finally
    //   59	66	347	java/io/IOException
    //   70	79	347	java/io/IOException
    //   94	103	352	java/io/IOException
    //   118	133	352	java/io/IOException
    //   150	159	352	java/io/IOException
    //   174	183	352	java/io/IOException
  }

  // ERROR //
  public static SharePatchInfo l(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_2
    //   3: astore_3
    //   4: aload_0
    //   5: ifnull +9 -> 14
    //   8: aload_1
    //   9: ifnonnull +7 -> 16
    //   12: aload_2
    //   13: astore_3
    //   14: aload_3
    //   15: areturn
    //   16: aload_1
    //   17: invokevirtual 78	java/io/File:getParentFile	()Ljava/io/File;
    //   20: astore_3
    //   21: aload_3
    //   22: invokevirtual 82	java/io/File:exists	()Z
    //   25: ifne +8 -> 33
    //   28: aload_3
    //   29: invokevirtual 85	java/io/File:mkdirs	()Z
    //   32: pop
    //   33: aload_1
    //   34: invokestatic 155	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:ao	(Ljava/io/File;)Lcom/tencent/tinker/loader/shareutil/ShareFileLockHelper;
    //   37: astore_3
    //   38: aload_3
    //   39: astore_1
    //   40: aload_0
    //   41: invokestatic 130	com/tencent/tinker/loader/shareutil/SharePatchInfo:av	(Ljava/io/File;)Lcom/tencent/tinker/loader/shareutil/SharePatchInfo;
    //   44: astore_0
    //   45: aload_3
    //   46: invokevirtual 160	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   49: aload_0
    //   50: astore_3
    //   51: goto -37 -> 14
    //   54: astore_1
    //   55: aload_0
    //   56: astore_3
    //   57: goto -43 -> 14
    //   60: astore_0
    //   61: aconst_null
    //   62: astore_3
    //   63: aload_3
    //   64: astore_1
    //   65: new 162	com/tencent/tinker/loader/TinkerRuntimeException
    //   68: astore_2
    //   69: aload_3
    //   70: astore_1
    //   71: aload_2
    //   72: ldc 195
    //   74: aload_0
    //   75: invokespecial 167	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   78: aload_3
    //   79: astore_1
    //   80: aload_2
    //   81: athrow
    //   82: astore_0
    //   83: aload_1
    //   84: ifnull +7 -> 91
    //   87: aload_1
    //   88: invokevirtual 160	com/tencent/tinker/loader/shareutil/ShareFileLockHelper:close	()V
    //   91: aload_0
    //   92: athrow
    //   93: astore_1
    //   94: goto -3 -> 91
    //   97: astore_0
    //   98: aconst_null
    //   99: astore_1
    //   100: goto -17 -> 83
    //   103: astore_0
    //   104: goto -41 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   45	49	54	java/io/IOException
    //   33	38	60	java/lang/Exception
    //   40	45	82	finally
    //   65	69	82	finally
    //   71	78	82	finally
    //   80	82	82	finally
    //   87	91	93	java/io/IOException
    //   33	38	97	finally
    //   40	45	103	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.SharePatchInfo
 * JD-Core Version:    0.6.2
 */