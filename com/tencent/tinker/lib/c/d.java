package com.tencent.tinker.lib.c;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.tencent.tinker.loader.TinkerDexOptimizer;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo;
import com.tencent.tinker.loader.shareutil.ShareElfFile;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class d extends b
{
  private static ArrayList<File> ABo = new ArrayList();
  private static ArrayList<ShareDexDiffPatchInfo> ABp = new ArrayList();
  private static HashMap<ShareDexDiffPatchInfo, File> ABq = new HashMap();
  private static boolean ABr = ShareTinkerInternals.dSp();

  // ERROR //
  private static void a(ZipFile paramZipFile1, ZipFile paramZipFile2, ZipEntry paramZipEntry1, ZipEntry paramZipEntry2, ShareDexDiffPatchInfo paramShareDexDiffPatchInfo, File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: new 43	java/io/BufferedInputStream
    //   9: astore 8
    //   11: aload 8
    //   13: aload_0
    //   14: aload_2
    //   15: invokevirtual 49	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   18: invokespecial 52	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   21: aload_3
    //   22: ifnull +195 -> 217
    //   25: new 43	java/io/BufferedInputStream
    //   28: astore_0
    //   29: aload_0
    //   30: aload_1
    //   31: aload_3
    //   32: invokevirtual 49	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   35: invokespecial 52	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   38: aload 4
    //   40: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   43: invokestatic 64	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aut	(Ljava/lang/String;)Z
    //   46: istore 9
    //   48: iload 9
    //   50: ifeq +15 -> 65
    //   53: aload 4
    //   55: getfield 67	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADU	Z
    //   58: istore 10
    //   60: iload 10
    //   62: ifeq +216 -> 278
    //   65: new 69	java/util/zip/ZipOutputStream
    //   68: astore_3
    //   69: new 71	java/io/BufferedOutputStream
    //   72: astore_1
    //   73: new 73	java/io/FileOutputStream
    //   76: astore_2
    //   77: aload_2
    //   78: aload 5
    //   80: invokespecial 76	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   83: aload_1
    //   84: aload_2
    //   85: invokespecial 79	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   88: aload_3
    //   89: aload_1
    //   90: invokespecial 80	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   93: new 82	java/util/zip/ZipEntry
    //   96: astore_1
    //   97: aload_1
    //   98: ldc 84
    //   100: invokespecial 87	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   103: aload_3
    //   104: aload_1
    //   105: invokevirtual 91	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   108: iload 9
    //   110: ifne +149 -> 259
    //   113: new 93	java/util/zip/ZipInputStream
    //   116: astore_2
    //   117: aload_2
    //   118: aload 8
    //   120: invokespecial 94	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   123: aload_2
    //   124: invokevirtual 98	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   127: astore_1
    //   128: aload_1
    //   129: ifnull +15 -> 144
    //   132: ldc 84
    //   134: aload_1
    //   135: invokevirtual 102	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   138: invokevirtual 108	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   141: ifeq -18 -> 123
    //   144: aload_1
    //   145: ifnonnull +77 -> 222
    //   148: new 110	com/tencent/tinker/loader/TinkerRuntimeException
    //   151: astore_1
    //   152: new 112	java/lang/StringBuilder
    //   155: astore 4
    //   157: aload 4
    //   159: ldc 114
    //   161: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   164: aload_1
    //   165: aload 4
    //   167: aload 5
    //   169: invokevirtual 120	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   172: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   178: invokespecial 128	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;)V
    //   181: aload_1
    //   182: athrow
    //   183: astore_1
    //   184: aload_2
    //   185: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   188: aload_1
    //   189: athrow
    //   190: astore_1
    //   191: aload_3
    //   192: astore_2
    //   193: aload_2
    //   194: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   197: aload_1
    //   198: athrow
    //   199: astore_3
    //   200: aload 8
    //   202: astore_2
    //   203: aload_0
    //   204: astore_1
    //   205: aload_3
    //   206: astore_0
    //   207: aload_2
    //   208: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   211: aload_1
    //   212: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   215: aload_0
    //   216: athrow
    //   217: aconst_null
    //   218: astore_0
    //   219: goto -181 -> 38
    //   222: new 136	com/tencent/tinker/c/a/a
    //   225: astore_1
    //   226: aload_1
    //   227: aload_2
    //   228: aload_0
    //   229: invokespecial 139	com/tencent/tinker/c/a/a:<init>	(Ljava/io/InputStream;Ljava/io/InputStream;)V
    //   232: aload_1
    //   233: aload_3
    //   234: invokevirtual 142	com/tencent/tinker/c/a/a:b	(Ljava/io/OutputStream;)V
    //   237: aload_2
    //   238: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   241: aload_3
    //   242: invokevirtual 145	java/util/zip/ZipOutputStream:closeEntry	()V
    //   245: aload_3
    //   246: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   249: aload 8
    //   251: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   254: aload_0
    //   255: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   258: return
    //   259: new 136	com/tencent/tinker/c/a/a
    //   262: astore_1
    //   263: aload_1
    //   264: aload 8
    //   266: aload_0
    //   267: invokespecial 139	com/tencent/tinker/c/a/a:<init>	(Ljava/io/InputStream;Ljava/io/InputStream;)V
    //   270: aload_1
    //   271: aload_3
    //   272: invokevirtual 142	com/tencent/tinker/c/a/a:b	(Ljava/io/OutputStream;)V
    //   275: goto -34 -> 241
    //   278: new 136	com/tencent/tinker/c/a/a
    //   281: astore_3
    //   282: aload_3
    //   283: aload 8
    //   285: aload_0
    //   286: invokespecial 139	com/tencent/tinker/c/a/a:<init>	(Ljava/io/InputStream;Ljava/io/InputStream;)V
    //   289: new 71	java/io/BufferedOutputStream
    //   292: astore_2
    //   293: new 73	java/io/FileOutputStream
    //   296: astore_1
    //   297: aload_1
    //   298: aload 5
    //   300: invokespecial 76	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   303: aload_2
    //   304: aload_1
    //   305: invokespecial 79	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   308: aload_3
    //   309: aload_2
    //   310: invokevirtual 142	com/tencent/tinker/c/a/a:b	(Ljava/io/OutputStream;)V
    //   313: aload_2
    //   314: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   317: goto -68 -> 249
    //   320: astore_1
    //   321: aload 6
    //   323: astore_2
    //   324: aload_2
    //   325: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   328: aload_1
    //   329: athrow
    //   330: astore_0
    //   331: aconst_null
    //   332: astore_1
    //   333: aconst_null
    //   334: astore_2
    //   335: goto -128 -> 207
    //   338: astore_0
    //   339: aconst_null
    //   340: astore_1
    //   341: aload 8
    //   343: astore_2
    //   344: goto -137 -> 207
    //   347: astore_1
    //   348: goto -24 -> 324
    //   351: astore_1
    //   352: aload 7
    //   354: astore_2
    //   355: goto -162 -> 193
    //   358: astore_1
    //   359: aconst_null
    //   360: astore_2
    //   361: goto -177 -> 184
    //
    // Exception table:
    //   from	to	target	type
    //   123	128	183	finally
    //   132	144	183	finally
    //   148	183	183	finally
    //   222	237	183	finally
    //   93	108	190	finally
    //   184	190	190	finally
    //   237	241	190	finally
    //   241	245	190	finally
    //   259	275	190	finally
    //   38	48	199	finally
    //   53	60	199	finally
    //   193	199	199	finally
    //   245	249	199	finally
    //   278	289	199	finally
    //   313	317	199	finally
    //   324	330	199	finally
    //   289	308	320	finally
    //   6	21	330	finally
    //   25	38	338	finally
    //   308	313	347	finally
    //   65	93	351	finally
    //   113	123	358	finally
  }

  // ERROR //
  private static boolean a(Context paramContext, File paramFile, String paramString)
  {
    // Byte code:
    //   0: getstatic 25	com/tencent/tinker/lib/c/d:ABp	Ljava/util/ArrayList;
    //   3: invokevirtual 151	java/util/ArrayList:isEmpty	()Z
    //   6: ifne +9 -> 15
    //   9: getstatic 38	com/tencent/tinker/lib/c/d:ABr	Z
    //   12: ifne +7 -> 19
    //   15: iconst_1
    //   16: istore_3
    //   17: iload_3
    //   18: ireturn
    //   19: new 117	java/io/File
    //   22: dup
    //   23: aload_2
    //   24: ldc 153
    //   26: invokespecial 156	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: astore 4
    //   31: getstatic 30	com/tencent/tinker/lib/c/d:ABq	Ljava/util/HashMap;
    //   34: invokevirtual 157	java/util/HashMap:isEmpty	()Z
    //   37: ifeq +31 -> 68
    //   40: ldc 159
    //   42: ldc 161
    //   44: iconst_1
    //   45: anewarray 163	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: getstatic 30	com/tencent/tinker/lib/c/d:ABq	Ljava/util/HashMap;
    //   53: invokevirtual 167	java/util/HashMap:size	()I
    //   56: invokestatic 173	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   59: aastore
    //   60: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   63: iconst_1
    //   64: istore_3
    //   65: goto -48 -> 17
    //   68: invokestatic 185	java/lang/System:currentTimeMillis	()J
    //   71: lstore 5
    //   73: aconst_null
    //   74: astore_2
    //   75: new 187	com/tencent/tinker/d/a/h
    //   78: astore 7
    //   80: new 71	java/io/BufferedOutputStream
    //   83: astore 8
    //   85: new 73	java/io/FileOutputStream
    //   88: astore 9
    //   90: aload 9
    //   92: aload 4
    //   94: invokespecial 76	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   97: aload 8
    //   99: aload 9
    //   101: invokespecial 79	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   104: aload 7
    //   106: aload 8
    //   108: invokespecial 188	com/tencent/tinker/d/a/h:<init>	(Ljava/io/OutputStream;)V
    //   111: getstatic 30	com/tencent/tinker/lib/c/d:ABq	Ljava/util/HashMap;
    //   114: invokevirtual 192	java/util/HashMap:keySet	()Ljava/util/Set;
    //   117: invokeinterface 198 1 0
    //   122: astore_2
    //   123: aload_2
    //   124: invokeinterface 203 1 0
    //   129: ifeq +329 -> 458
    //   132: aload_2
    //   133: invokeinterface 207 1 0
    //   138: checkcast 54	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo
    //   141: astore 8
    //   143: getstatic 30	com/tencent/tinker/lib/c/d:ABq	Ljava/util/HashMap;
    //   146: aload 8
    //   148: invokevirtual 211	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   151: checkcast 117	java/io/File
    //   154: astore 10
    //   156: aload 8
    //   158: getfield 67	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADU	Z
    //   161: istore_3
    //   162: iload_3
    //   163: ifeq +260 -> 423
    //   166: new 213	com/tencent/tinker/d/a/g
    //   169: astore 9
    //   171: aload 9
    //   173: aload 10
    //   175: invokespecial 214	com/tencent/tinker/d/a/g:<init>	(Ljava/io/File;)V
    //   178: aload 9
    //   180: ldc 84
    //   182: invokevirtual 218	com/tencent/tinker/d/a/g:auw	(Ljava/lang/String;)Lcom/tencent/tinker/d/a/f;
    //   185: astore 11
    //   187: new 220	com/tencent/tinker/d/a/f
    //   190: astore 10
    //   192: aload 10
    //   194: aload 11
    //   196: aload 8
    //   198: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   201: invokespecial 223	com/tencent/tinker/d/a/f:<init>	(Lcom/tencent/tinker/d/a/f;Ljava/lang/String;)V
    //   204: aload 9
    //   206: aload 11
    //   208: invokevirtual 226	com/tencent/tinker/d/a/g:a	(Lcom/tencent/tinker/d/a/f;)Ljava/io/InputStream;
    //   211: astore 8
    //   213: aload 10
    //   215: aload 8
    //   217: aload 7
    //   219: invokestatic 231	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/f;Ljava/io/InputStream;Lcom/tencent/tinker/d/a/h;)V
    //   222: aload 8
    //   224: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   227: aload 9
    //   229: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   232: goto -109 -> 123
    //   235: astore 8
    //   237: aload 7
    //   239: astore_2
    //   240: ldc 159
    //   242: aload 8
    //   244: ldc 233
    //   246: iconst_0
    //   247: anewarray 163	java/lang/Object
    //   250: invokestatic 237	com/tencent/tinker/lib/util/a:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   253: aload_2
    //   254: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   257: iconst_0
    //   258: istore_3
    //   259: iload_3
    //   260: istore 12
    //   262: iload_3
    //   263: ifeq +89 -> 352
    //   266: getstatic 30	com/tencent/tinker/lib/c/d:ABq	Ljava/util/HashMap;
    //   269: invokevirtual 192	java/util/HashMap:keySet	()Ljava/util/Set;
    //   272: invokeinterface 198 1 0
    //   277: astore_2
    //   278: iload_3
    //   279: istore 12
    //   281: aload_2
    //   282: invokeinterface 203 1 0
    //   287: ifeq +65 -> 352
    //   290: aload_2
    //   291: invokeinterface 207 1 0
    //   296: checkcast 54	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo
    //   299: astore 8
    //   301: aload 4
    //   303: aload 8
    //   305: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   308: aload 8
    //   310: getfield 240	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADP	Ljava/lang/String;
    //   313: invokestatic 243	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:b	(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z
    //   316: ifne -38 -> 278
    //   319: iconst_0
    //   320: istore 12
    //   322: ldc 159
    //   324: ldc 245
    //   326: iconst_2
    //   327: anewarray 163	java/lang/Object
    //   330: dup
    //   331: iconst_0
    //   332: aload 8
    //   334: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   337: aastore
    //   338: dup
    //   339: iconst_1
    //   340: aload 4
    //   342: invokevirtual 248	java/io/File:length	()J
    //   345: invokestatic 253	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   348: aastore
    //   349: invokestatic 256	com/tencent/tinker/lib/util/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   352: iload 12
    //   354: ifeq +114 -> 468
    //   357: getstatic 30	com/tencent/tinker/lib/c/d:ABq	Ljava/util/HashMap;
    //   360: invokevirtual 260	java/util/HashMap:values	()Ljava/util/Collection;
    //   363: invokeinterface 263 1 0
    //   368: astore_0
    //   369: aload_0
    //   370: invokeinterface 203 1 0
    //   375: ifeq +133 -> 508
    //   378: aload_0
    //   379: invokeinterface 207 1 0
    //   384: checkcast 117	java/io/File
    //   387: invokestatic 267	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:as	(Ljava/io/File;)Z
    //   390: pop
    //   391: goto -22 -> 369
    //   394: astore_2
    //   395: aconst_null
    //   396: astore 8
    //   398: aconst_null
    //   399: astore 9
    //   401: aload 8
    //   403: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   406: aload 9
    //   408: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   411: aload_2
    //   412: athrow
    //   413: astore_0
    //   414: aload 7
    //   416: astore_1
    //   417: aload_1
    //   418: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   421: aload_0
    //   422: athrow
    //   423: new 220	com/tencent/tinker/d/a/f
    //   426: astore 9
    //   428: aload 9
    //   430: aload 8
    //   432: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   435: invokespecial 268	com/tencent/tinker/d/a/f:<init>	(Ljava/lang/String;)V
    //   438: aload 9
    //   440: aload 10
    //   442: aload 8
    //   444: getfield 271	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADR	Ljava/lang/String;
    //   447: invokestatic 275	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   450: aload 7
    //   452: invokestatic 278	com/tencent/tinker/d/a/i:a	(Lcom/tencent/tinker/d/a/f;Ljava/io/File;JLcom/tencent/tinker/d/a/h;)V
    //   455: goto -332 -> 123
    //   458: aload 7
    //   460: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   463: iconst_1
    //   464: istore_3
    //   465: goto -206 -> 259
    //   468: ldc 159
    //   470: ldc_w 280
    //   473: iconst_0
    //   474: anewarray 163	java/lang/Object
    //   477: invokestatic 256	com/tencent/tinker/lib/util/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   480: aload 4
    //   482: invokestatic 267	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:as	(Ljava/io/File;)Z
    //   485: pop
    //   486: aload_0
    //   487: invokestatic 286	com/tencent/tinker/lib/e/a:iX	(Landroid/content/Context;)Lcom/tencent/tinker/lib/e/a;
    //   490: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   493: aload_1
    //   494: aload 4
    //   496: aload 4
    //   498: invokevirtual 291	java/io/File:getName	()Ljava/lang/String;
    //   501: bipush 7
    //   503: invokeinterface 296 5 0
    //   508: ldc 159
    //   510: ldc_w 298
    //   513: iconst_4
    //   514: anewarray 163	java/lang/Object
    //   517: dup
    //   518: iconst_0
    //   519: aload 4
    //   521: invokevirtual 301	java/io/File:getPath	()Ljava/lang/String;
    //   524: aastore
    //   525: dup
    //   526: iconst_1
    //   527: iload 12
    //   529: invokestatic 306	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   532: aastore
    //   533: dup
    //   534: iconst_2
    //   535: aload 4
    //   537: invokevirtual 248	java/io/File:length	()J
    //   540: invokestatic 253	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   543: aastore
    //   544: dup
    //   545: iconst_3
    //   546: invokestatic 185	java/lang/System:currentTimeMillis	()J
    //   549: lload 5
    //   551: lsub
    //   552: invokestatic 253	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   555: aastore
    //   556: invokestatic 309	com/tencent/tinker/lib/util/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   559: iload 12
    //   561: istore_3
    //   562: goto -545 -> 17
    //   565: astore_0
    //   566: aconst_null
    //   567: astore_1
    //   568: goto -151 -> 417
    //   571: astore_0
    //   572: aload_2
    //   573: astore_1
    //   574: goto -157 -> 417
    //   577: astore 8
    //   579: goto -339 -> 240
    //   582: astore_2
    //   583: aconst_null
    //   584: astore 8
    //   586: goto -185 -> 401
    //   589: astore_2
    //   590: goto -189 -> 401
    //
    // Exception table:
    //   from	to	target	type
    //   111	123	235	java/lang/Throwable
    //   123	162	235	java/lang/Throwable
    //   222	232	235	java/lang/Throwable
    //   401	413	235	java/lang/Throwable
    //   423	455	235	java/lang/Throwable
    //   166	178	394	finally
    //   111	123	413	finally
    //   123	162	413	finally
    //   222	232	413	finally
    //   401	413	413	finally
    //   423	455	413	finally
    //   75	111	565	finally
    //   240	253	571	finally
    //   75	111	577	java/lang/Throwable
    //   178	213	582	finally
    //   213	222	589	finally
  }

  private static boolean a(Context paramContext, List<File> paramList, String paramString, File paramFile)
  {
    com.tencent.tinker.lib.e.a locala = com.tencent.tinker.lib.e.a.iX(paramContext);
    ABo.clear();
    paramContext = new File(paramString);
    boolean bool;
    if ((!paramContext.exists()) && (!paramContext.mkdirs()))
    {
      com.tencent.tinker.lib.util.a.w("Tinker.DexDiffPatchInternal", "patch recover, make optimizeDexDirectoryFile fail", new Object[0]);
      bool = false;
    }
    while (true)
    {
      return bool;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        localObject = SharePatchFileUtil.k((File)localIterator.next(), paramContext);
        ABo.add(new File((String)localObject));
      }
      com.tencent.tinker.lib.util.a.i("Tinker.DexDiffPatchInternal", "patch recover, try to optimize dex file count:%d, optimizeDexDirectory:%s", new Object[] { Integer.valueOf(paramList.size()), paramString });
      paramString = new Vector();
      Object localObject = new Throwable[1];
      TinkerDexOptimizer.a(paramList, paramContext, new d.1(paramString, (Throwable[])localObject));
      if (!paramString.isEmpty())
      {
        locala.ABF.a(paramFile, paramString, localObject[0]);
        bool = false;
      }
      else
      {
        bool = true;
      }
    }
  }

  protected static boolean a(com.tencent.tinker.lib.e.a parama, ShareSecurityCheck paramShareSecurityCheck, Context paramContext, String paramString, File paramFile)
  {
    if (!ShareTinkerInternals.Sa(parama.tinkerFlags))
      com.tencent.tinker.lib.util.a.w("Tinker.DexDiffPatchInternal", "patch recover, dex is not enabled", new Object[0]);
    for (boolean bool = true; ; bool = true)
    {
      return bool;
      parama = (String)paramShareSecurityCheck.AFg.get("assets/dex_meta.txt");
      if (parama != null)
        break;
      com.tencent.tinker.lib.util.a.w("Tinker.DexDiffPatchInternal", "patch recover, dex is not contained", new Object[0]);
    }
    long l = SystemClock.elapsedRealtime();
    paramShareSecurityCheck = paramString + "/dex/";
    if (!b(paramContext, paramShareSecurityCheck, parama, paramFile))
      com.tencent.tinker.lib.util.a.w("Tinker.DexDiffPatchInternal", "patch recover, extractDiffInternals fail", new Object[0]);
    for (bool = false; ; bool = a(paramContext, paramShareSecurityCheck, paramString + "/odex/", paramFile))
    {
      com.tencent.tinker.lib.util.a.i("Tinker.DexDiffPatchInternal", "recover dex result:%b, cost:%d", new Object[] { Boolean.valueOf(bool), Long.valueOf(SystemClock.elapsedRealtime() - l) });
      break;
      File[] arrayOfFile = new File(paramShareSecurityCheck).listFiles();
      paramShareSecurityCheck = new ArrayList();
      if (arrayOfFile != null)
      {
        int i = arrayOfFile.length;
        for (int j = 0; j < i; j++)
        {
          parama = arrayOfFile[j];
          String str = parama.getName();
          if ((parama.isFile()) && ((str.endsWith(".dex")) || (str.endsWith(".jar")) || (str.endsWith(".apk"))))
            paramShareSecurityCheck.add(parama);
        }
      }
      com.tencent.tinker.lib.util.a.i("Tinker.DexDiffPatchInternal", "legal files to do dexopt: ".concat(String.valueOf(paramShareSecurityCheck)), new Object[0]);
    }
  }

  protected static boolean a(File paramFile, com.tencent.tinker.lib.e.a parama)
  {
    if (ABo.isEmpty());
    int j;
    Object localObject;
    Iterator localIterator2;
    File localFile1;
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      int i = ABp.size() * 30;
      j = i;
      if (i > 120)
        j = 120;
      com.tencent.tinker.lib.util.a.i("Tinker.DexDiffPatchInternal", "raw dex count: %d, dex opt dex count: %d, final wait times: %d", new Object[] { Integer.valueOf(ABp.size()), Integer.valueOf(ABo.size()), Integer.valueOf(j) });
      i = 0;
      while (true)
        if (i < j)
        {
          Iterator localIterator1 = ABo.iterator();
          int k;
          while (true)
            if (localIterator1.hasNext())
            {
              localObject = (File)localIterator1.next();
              if ((!SharePatchFileUtil.ap((File)localObject)) && (!SharePatchFileUtil.aq((File)localObject)))
              {
                com.tencent.tinker.lib.util.a.e("Tinker.DexDiffPatchInternal", "parallel dex optimizer file %s is not exist, just wait %d times", new Object[] { ((File)localObject).getName(), Integer.valueOf(i + 1) });
                k = 0;
                if (k != 0)
                  break;
              }
            }
          try
          {
            Thread.sleep(10000L);
            i++;
            continue;
            k = 1;
          }
          catch (InterruptedException localInterruptedException)
          {
            while (true)
              com.tencent.tinker.lib.util.a.e("Tinker.DexDiffPatchInternal", "thread sleep InterruptedException e:".concat(String.valueOf(localInterruptedException)), new Object[0]);
          }
        }
      localObject = new ArrayList();
      localIterator2 = ABo.iterator();
      while (localIterator2.hasNext())
      {
        localFile1 = (File)localIterator2.next();
        com.tencent.tinker.lib.util.a.i("Tinker.DexDiffPatchInternal", "check dex optimizer file exist: %s, size %d", new Object[] { localFile1.getPath(), Long.valueOf(localFile1.length()) });
        if ((!SharePatchFileUtil.ap(localFile1)) && (!SharePatchFileUtil.aq(localFile1)))
        {
          com.tencent.tinker.lib.util.a.e("Tinker.DexDiffPatchInternal", "final parallel dex optimizer file %s is not exist, return false", new Object[] { localFile1.getName() });
          ((List)localObject).add(localFile1);
        }
      }
      if (((List)localObject).isEmpty())
        break;
      parama.ABF.a(paramFile, (List)localObject, new TinkerRuntimeException("checkDexOptExist failed"));
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      localIterator2 = ABo.iterator();
      localFile1 = null;
    }
    while (true)
      while (true)
      {
        File localFile2;
        if (localIterator2.hasNext())
        {
          localFile2 = (File)localIterator2.next();
          if (!SharePatchFileUtil.aq(localFile2))
            com.tencent.tinker.lib.util.a.i("Tinker.DexDiffPatchInternal", "check dex optimizer file format: %s, size %d", new Object[] { localFile2.getName(), Long.valueOf(localFile2.length()) });
        }
        else
        {
          try
          {
            j = ShareElfFile.an(localFile2);
            if (j == 1)
            {
              try
              {
                ShareElfFile localShareElfFile = new com/tencent/tinker/loader/shareutil/ShareElfFile;
                localShareElfFile.<init>(localFile2);
                com.tencent.tinker.c.b.a.ah(localShareElfFile);
                continue;
              }
              catch (Throwable localThrowable)
              {
                com.tencent.tinker.lib.util.a.e("Tinker.DexDiffPatchInternal", "final parallel dex optimizer file %s is not elf format, return false", new Object[] { localFile2.getName() });
                ((List)localObject).add(localFile2);
                com.tencent.tinker.c.b.a.ah(null);
                continue;
              }
              finally
              {
                com.tencent.tinker.c.b.a.ah(null);
              }
              if (!((List)localObject).isEmpty())
              {
                if (localThrowable == null);
                for (TinkerRuntimeException localTinkerRuntimeException = new TinkerRuntimeException("checkDexOptFormat failed"); ; localTinkerRuntimeException = new TinkerRuntimeException("checkDexOptFormat failed", localTinkerRuntimeException))
                {
                  parama.ABF.a(paramFile, (List)localObject, localTinkerRuntimeException);
                  bool = false;
                  break;
                }
              }
              bool = true;
            }
          }
          catch (IOException localIOException)
          {
          }
        }
      }
  }

  private static boolean a(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile, ShareDexDiffPatchInfo paramShareDexDiffPatchInfo)
  {
    String str1;
    if (ABr)
    {
      str1 = paramShareDexDiffPatchInfo.ADP;
      String str2 = paramShareDexDiffPatchInfo.ADN;
      bool = paramShareDexDiffPatchInfo.ADU;
      if ((!SharePatchFileUtil.aut(str2)) || (!bool))
        break label59;
    }
    label59: for (boolean bool = b(paramZipFile, paramZipEntry, paramFile, str1); ; bool = a(paramZipFile, paramZipEntry, paramFile, str1, true))
    {
      return bool;
      str1 = paramShareDexDiffPatchInfo.ADO;
      break;
    }
  }

  private static boolean aui(String paramString)
  {
    boolean bool1;
    if ((ABp.isEmpty()) || (!ABr))
    {
      bool1 = false;
      return bool1;
    }
    Iterator localIterator = ABp.iterator();
    Object localObject1 = null;
    Object localObject2 = null;
    label31: if (localIterator.hasNext())
    {
      ShareDexDiffPatchInfo localShareDexDiffPatchInfo = (ShareDexDiffPatchInfo)localIterator.next();
      File localFile = new File(paramString + localShareDexDiffPatchInfo.eBb);
      String str = localFile.getName();
      if (ShareConstants.ADM.matcher(str).matches())
        ABq.put(localShareDexDiffPatchInfo, localFile);
      if (!localShareDexDiffPatchInfo.ADN.startsWith("test.dex"))
        break label335;
      localObject1 = localFile;
      localObject2 = localShareDexDiffPatchInfo;
    }
    label335: 
    while (true)
    {
      break label31;
      if (localObject2 != null)
        ABq.put(ShareTinkerInternals.a((ShareDexDiffPatchInfo)localObject2, ABq.size() + 1), localObject1);
      localObject2 = new File(paramString, "tinker_classN.apk");
      if (((File)localObject2).exists())
      {
        paramString = ABq.keySet().iterator();
        while (paramString.hasNext())
        {
          localObject1 = (ShareDexDiffPatchInfo)paramString.next();
          if (!SharePatchFileUtil.b((File)localObject2, ((ShareDexDiffPatchInfo)localObject1).ADN, ((ShareDexDiffPatchInfo)localObject1).ADP))
            com.tencent.tinker.lib.util.a.e("Tinker.DexDiffPatchInternal", "verify dex file md5 error, entry name; %s, file len: %d", new Object[] { ((ShareDexDiffPatchInfo)localObject1).ADN, Long.valueOf(((File)localObject2).length()) });
        }
      }
      for (boolean bool2 = false; ; bool2 = true)
      {
        bool1 = bool2;
        if (!bool2)
          SharePatchFileUtil.as((File)localObject2);
        for (bool1 = bool2; bool1; bool1 = false)
        {
          paramString = ABq.values().iterator();
          while (paramString.hasNext())
            SharePatchFileUtil.as((File)paramString.next());
        }
        break;
      }
    }
  }

  // ERROR //
  private static boolean b(Context paramContext, String paramString1, String paramString2, File paramFile)
  {
    // Byte code:
    //   0: getstatic 25	com/tencent/tinker/lib/c/d:ABp	Ljava/util/ArrayList;
    //   3: invokevirtual 313	java/util/ArrayList:clear	()V
    //   6: aload_2
    //   7: getstatic 25	com/tencent/tinker/lib/c/d:ABp	Ljava/util/ArrayList;
    //   10: invokestatic 520	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:o	(Ljava/lang/String;Ljava/util/ArrayList;)V
    //   13: getstatic 25	com/tencent/tinker/lib/c/d:ABp	Ljava/util/ArrayList;
    //   16: invokevirtual 151	java/util/ArrayList:isEmpty	()Z
    //   19: ifeq +28 -> 47
    //   22: ldc 159
    //   24: ldc_w 522
    //   27: iconst_1
    //   28: anewarray 163	java/lang/Object
    //   31: dup
    //   32: iconst_0
    //   33: iconst_3
    //   34: invokestatic 526	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   37: aastore
    //   38: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: iconst_1
    //   42: istore 4
    //   44: iload 4
    //   46: ireturn
    //   47: new 117	java/io/File
    //   50: dup
    //   51: aload_1
    //   52: invokespecial 314	java/io/File:<init>	(Ljava/lang/String;)V
    //   55: astore_2
    //   56: aload_2
    //   57: invokevirtual 317	java/io/File:exists	()Z
    //   60: ifne +8 -> 68
    //   63: aload_2
    //   64: invokevirtual 320	java/io/File:mkdirs	()Z
    //   67: pop
    //   68: aload_0
    //   69: invokestatic 286	com/tencent/tinker/lib/e/a:iX	(Landroid/content/Context;)Lcom/tencent/tinker/lib/e/a;
    //   72: astore 5
    //   74: aconst_null
    //   75: astore 6
    //   77: aconst_null
    //   78: astore 7
    //   80: aload_0
    //   81: invokevirtual 532	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   84: astore_2
    //   85: aload_2
    //   86: ifnonnull +29 -> 115
    //   89: ldc 159
    //   91: ldc_w 534
    //   94: iconst_0
    //   95: anewarray 163	java/lang/Object
    //   98: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aconst_null
    //   102: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   105: aconst_null
    //   106: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   109: iconst_0
    //   110: istore 4
    //   112: goto -68 -> 44
    //   115: new 45	java/util/zip/ZipFile
    //   118: dup
    //   119: aload_2
    //   120: getfield 542	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   123: invokespecial 543	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   126: astore_2
    //   127: new 45	java/util/zip/ZipFile
    //   130: astore 8
    //   132: aload 8
    //   134: aload_3
    //   135: invokespecial 544	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   138: aload_1
    //   139: invokestatic 546	com/tencent/tinker/lib/c/d:aui	(Ljava/lang/String;)Z
    //   142: ifeq +35 -> 177
    //   145: ldc 159
    //   147: ldc_w 548
    //   150: iconst_1
    //   151: anewarray 163	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: ldc 153
    //   158: aastore
    //   159: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: aload_2
    //   163: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   166: aload 8
    //   168: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   171: iconst_1
    //   172: istore 4
    //   174: goto -130 -> 44
    //   177: getstatic 25	com/tencent/tinker/lib/c/d:ABp	Ljava/util/ArrayList;
    //   180: invokevirtual 428	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   183: astore 9
    //   185: aload 9
    //   187: invokeinterface 203 1 0
    //   192: ifeq +1274 -> 1466
    //   195: aload 9
    //   197: invokeinterface 207 1 0
    //   202: checkcast 54	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo
    //   205: astore 10
    //   207: invokestatic 185	java/lang/System:currentTimeMillis	()J
    //   210: lstore 11
    //   212: aload 10
    //   214: getfield 551	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:path	Ljava/lang/String;
    //   217: ldc_w 553
    //   220: invokevirtual 108	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   223: ifeq +140 -> 363
    //   226: aload 10
    //   228: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   231: astore 7
    //   233: aload 10
    //   235: getfield 556	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADS	Ljava/lang/String;
    //   238: astore 13
    //   240: aload 10
    //   242: getfield 559	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADQ	Ljava/lang/String;
    //   245: astore 14
    //   247: getstatic 38	com/tencent/tinker/lib/c/d:ABr	Z
    //   250: ifne +155 -> 405
    //   253: aload 10
    //   255: getfield 480	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADO	Ljava/lang/String;
    //   258: ldc_w 561
    //   261: invokevirtual 108	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   264: ifeq +141 -> 405
    //   267: ldc 159
    //   269: ldc_w 563
    //   272: iconst_1
    //   273: anewarray 163	java/lang/Object
    //   276: dup
    //   277: iconst_0
    //   278: aload 7
    //   280: aastore
    //   281: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   284: goto -99 -> 185
    //   287: astore_1
    //   288: aload_2
    //   289: astore_0
    //   290: aload 8
    //   292: astore_2
    //   293: new 110	com/tencent/tinker/loader/TinkerRuntimeException
    //   296: astore_3
    //   297: new 112	java/lang/StringBuilder
    //   300: astore 8
    //   302: aload 8
    //   304: ldc_w 565
    //   307: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   310: aload_3
    //   311: aload 8
    //   313: iconst_3
    //   314: invokestatic 526	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   317: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   320: ldc_w 567
    //   323: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: aload_1
    //   327: invokevirtual 570	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   330: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   333: ldc_w 572
    //   336: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   342: aload_1
    //   343: invokespecial 473	com/tencent/tinker/loader/TinkerRuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   346: aload_3
    //   347: athrow
    //   348: astore_3
    //   349: aload_0
    //   350: astore_1
    //   351: aload_3
    //   352: astore_0
    //   353: aload_1
    //   354: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   357: aload_2
    //   358: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   361: aload_0
    //   362: athrow
    //   363: new 112	java/lang/StringBuilder
    //   366: astore 7
    //   368: aload 7
    //   370: invokespecial 380	java/lang/StringBuilder:<init>	()V
    //   373: aload 7
    //   375: aload 10
    //   377: getfield 551	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:path	Ljava/lang/String;
    //   380: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: ldc_w 574
    //   386: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   389: aload 10
    //   391: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   394: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   397: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   400: astore 7
    //   402: goto -169 -> 233
    //   405: getstatic 38	com/tencent/tinker/lib/c/d:ABr	Z
    //   408: ifeq +80 -> 488
    //   411: aload 10
    //   413: getfield 240	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADP	Ljava/lang/String;
    //   416: astore 6
    //   418: aload 6
    //   420: invokestatic 577	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aus	(Ljava/lang/String;)Z
    //   423: ifne +75 -> 498
    //   426: ldc 159
    //   428: ldc_w 579
    //   431: iconst_3
    //   432: anewarray 163	java/lang/Object
    //   435: dup
    //   436: iconst_0
    //   437: iconst_3
    //   438: invokestatic 526	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   441: aastore
    //   442: dup
    //   443: iconst_1
    //   444: aload 10
    //   446: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   449: aastore
    //   450: dup
    //   451: iconst_2
    //   452: aload 6
    //   454: aastore
    //   455: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   458: aload 5
    //   460: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   463: aload_3
    //   464: iconst_3
    //   465: invokestatic 583	com/tencent/tinker/lib/c/b:RZ	(I)I
    //   468: invokeinterface 586 3 0
    //   473: aload_2
    //   474: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   477: aload 8
    //   479: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   482: iconst_0
    //   483: istore 4
    //   485: goto -441 -> 44
    //   488: aload 10
    //   490: getfield 480	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADO	Ljava/lang/String;
    //   493: astore 6
    //   495: goto -77 -> 418
    //   498: new 117	java/io/File
    //   501: astore 15
    //   503: new 112	java/lang/StringBuilder
    //   506: astore 16
    //   508: aload 16
    //   510: invokespecial 380	java/lang/StringBuilder:<init>	()V
    //   513: aload 15
    //   515: aload 16
    //   517: aload_1
    //   518: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   521: aload 10
    //   523: getfield 487	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:eBb	Ljava/lang/String;
    //   526: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   529: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   532: invokespecial 314	java/io/File:<init>	(Ljava/lang/String;)V
    //   535: aload 15
    //   537: invokevirtual 317	java/io/File:exists	()Z
    //   540: ifeq +173 -> 713
    //   543: aload 15
    //   545: aload 6
    //   547: invokestatic 590	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:h	(Ljava/io/File;Ljava/lang/String;)Z
    //   550: ifeq +35 -> 585
    //   553: ldc 159
    //   555: ldc_w 592
    //   558: iconst_1
    //   559: anewarray 163	java/lang/Object
    //   562: dup
    //   563: iconst_0
    //   564: aload 15
    //   566: invokevirtual 301	java/io/File:getPath	()Ljava/lang/String;
    //   569: aastore
    //   570: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   573: goto -388 -> 185
    //   576: astore_0
    //   577: aload_2
    //   578: astore_1
    //   579: aload 8
    //   581: astore_2
    //   582: goto -229 -> 353
    //   585: new 112	java/lang/StringBuilder
    //   588: astore 16
    //   590: aload 16
    //   592: ldc_w 594
    //   595: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   598: ldc 159
    //   600: aload 16
    //   602: aload 15
    //   604: invokevirtual 301	java/io/File:getPath	()Ljava/lang/String;
    //   607: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   610: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   613: iconst_0
    //   614: anewarray 163	java/lang/Object
    //   617: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   620: aload 15
    //   622: invokevirtual 597	java/io/File:delete	()Z
    //   625: pop
    //   626: aload 8
    //   628: aload 7
    //   630: invokevirtual 601	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   633: astore 17
    //   635: aload_2
    //   636: aload 7
    //   638: invokevirtual 601	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   641: astore 16
    //   643: aload 14
    //   645: ldc_w 561
    //   648: invokevirtual 108	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   651: ifeq +154 -> 805
    //   654: aload 17
    //   656: ifnonnull +69 -> 725
    //   659: ldc 159
    //   661: ldc_w 603
    //   664: aload 7
    //   666: invokestatic 411	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   669: invokevirtual 415	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   672: iconst_0
    //   673: anewarray 163	java/lang/Object
    //   676: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   679: aload 5
    //   681: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   684: aload_3
    //   685: aload 15
    //   687: aload 10
    //   689: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   692: iconst_3
    //   693: invokeinterface 296 5 0
    //   698: aload_2
    //   699: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   702: aload 8
    //   704: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   707: iconst_0
    //   708: istore 4
    //   710: goto -666 -> 44
    //   713: aload 15
    //   715: invokevirtual 607	java/io/File:getParentFile	()Ljava/io/File;
    //   718: invokevirtual 320	java/io/File:mkdirs	()Z
    //   721: pop
    //   722: goto -96 -> 626
    //   725: aload 8
    //   727: aload 17
    //   729: aload 15
    //   731: aload 10
    //   733: invokestatic 609	com/tencent/tinker/lib/c/d:a	(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Lcom/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo;)Z
    //   736: ifne -551 -> 185
    //   739: new 112	java/lang/StringBuilder
    //   742: astore_0
    //   743: aload_0
    //   744: ldc_w 611
    //   747: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   750: ldc 159
    //   752: aload_0
    //   753: aload 15
    //   755: invokevirtual 301	java/io/File:getPath	()Ljava/lang/String;
    //   758: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   761: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   764: iconst_0
    //   765: anewarray 163	java/lang/Object
    //   768: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   771: aload 5
    //   773: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   776: aload_3
    //   777: aload 15
    //   779: aload 10
    //   781: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   784: iconst_3
    //   785: invokeinterface 296 5 0
    //   790: aload_2
    //   791: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   794: aload 8
    //   796: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   799: iconst_0
    //   800: istore 4
    //   802: goto -758 -> 44
    //   805: aload 13
    //   807: ldc_w 561
    //   810: invokevirtual 108	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   813: ifeq +242 -> 1055
    //   816: getstatic 38	com/tencent/tinker/lib/c/d:ABr	Z
    //   819: ifeq -634 -> 185
    //   822: aload 16
    //   824: ifnonnull +57 -> 881
    //   827: ldc 159
    //   829: ldc_w 613
    //   832: aload 7
    //   834: invokestatic 411	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   837: invokevirtual 415	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   840: iconst_0
    //   841: anewarray 163	java/lang/Object
    //   844: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   847: aload 5
    //   849: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   852: aload_3
    //   853: aload 15
    //   855: aload 10
    //   857: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   860: iconst_3
    //   861: invokeinterface 296 5 0
    //   866: aload_2
    //   867: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   870: aload 8
    //   872: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   875: iconst_0
    //   876: istore 4
    //   878: goto -834 -> 44
    //   881: aload 16
    //   883: invokevirtual 616	java/util/zip/ZipEntry:getCrc	()J
    //   886: invokestatic 619	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   889: astore 13
    //   891: aload 13
    //   893: aload 14
    //   895: invokevirtual 108	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   898: ifne +64 -> 962
    //   901: ldc 159
    //   903: ldc_w 621
    //   906: iconst_3
    //   907: anewarray 163	java/lang/Object
    //   910: dup
    //   911: iconst_0
    //   912: aload 7
    //   914: aastore
    //   915: dup
    //   916: iconst_1
    //   917: aload 14
    //   919: aastore
    //   920: dup
    //   921: iconst_2
    //   922: aload 13
    //   924: aastore
    //   925: invokestatic 256	com/tencent/tinker/lib/util/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   928: aload 5
    //   930: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   933: aload_3
    //   934: aload 15
    //   936: aload 10
    //   938: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   941: iconst_3
    //   942: invokeinterface 296 5 0
    //   947: aload_2
    //   948: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   951: aload 8
    //   953: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   956: iconst_0
    //   957: istore 4
    //   959: goto -915 -> 44
    //   962: aload_2
    //   963: aload 16
    //   965: aload 15
    //   967: aload 10
    //   969: invokestatic 609	com/tencent/tinker/lib/c/d:a	(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;Lcom/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo;)Z
    //   972: pop
    //   973: aload 15
    //   975: aload 6
    //   977: invokestatic 590	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:h	(Ljava/io/File;Ljava/lang/String;)Z
    //   980: ifne -795 -> 185
    //   983: new 112	java/lang/StringBuilder
    //   986: astore_0
    //   987: aload_0
    //   988: ldc_w 623
    //   991: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   994: ldc 159
    //   996: aload_0
    //   997: aload 15
    //   999: invokevirtual 301	java/io/File:getPath	()Ljava/lang/String;
    //   1002: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1005: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1008: iconst_0
    //   1009: anewarray 163	java/lang/Object
    //   1012: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1015: aload 5
    //   1017: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1020: aload_3
    //   1021: aload 15
    //   1023: aload 10
    //   1025: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   1028: iconst_3
    //   1029: invokeinterface 296 5 0
    //   1034: aload 15
    //   1036: invokestatic 267	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:as	(Ljava/io/File;)Z
    //   1039: pop
    //   1040: aload_2
    //   1041: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1044: aload 8
    //   1046: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1049: iconst_0
    //   1050: istore 4
    //   1052: goto -1008 -> 44
    //   1055: aload 17
    //   1057: ifnonnull +57 -> 1114
    //   1060: ldc 159
    //   1062: ldc_w 603
    //   1065: aload 7
    //   1067: invokestatic 411	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1070: invokevirtual 415	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1073: iconst_0
    //   1074: anewarray 163	java/lang/Object
    //   1077: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1080: aload 5
    //   1082: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1085: aload_3
    //   1086: aload 15
    //   1088: aload 10
    //   1090: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   1093: iconst_3
    //   1094: invokeinterface 296 5 0
    //   1099: aload_2
    //   1100: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1103: aload 8
    //   1105: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1108: iconst_0
    //   1109: istore 4
    //   1111: goto -1067 -> 44
    //   1114: aload 13
    //   1116: invokestatic 577	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aus	(Ljava/lang/String;)Z
    //   1119: ifne +65 -> 1184
    //   1122: ldc 159
    //   1124: ldc_w 579
    //   1127: iconst_3
    //   1128: anewarray 163	java/lang/Object
    //   1131: dup
    //   1132: iconst_0
    //   1133: iconst_3
    //   1134: invokestatic 526	com/tencent/tinker/loader/shareutil/ShareTinkerInternals:Sd	(I)Ljava/lang/String;
    //   1137: aastore
    //   1138: dup
    //   1139: iconst_1
    //   1140: aload 10
    //   1142: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   1145: aastore
    //   1146: dup
    //   1147: iconst_2
    //   1148: aload 13
    //   1150: aastore
    //   1151: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1154: aload 5
    //   1156: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1159: aload_3
    //   1160: iconst_3
    //   1161: invokestatic 583	com/tencent/tinker/lib/c/b:RZ	(I)I
    //   1164: invokeinterface 586 3 0
    //   1169: aload_2
    //   1170: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1173: aload 8
    //   1175: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1178: iconst_0
    //   1179: istore 4
    //   1181: goto -1137 -> 44
    //   1184: aload 16
    //   1186: ifnonnull +57 -> 1243
    //   1189: ldc 159
    //   1191: ldc_w 613
    //   1194: aload 7
    //   1196: invokestatic 411	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1199: invokevirtual 415	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1202: iconst_0
    //   1203: anewarray 163	java/lang/Object
    //   1206: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1209: aload 5
    //   1211: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1214: aload_3
    //   1215: aload 15
    //   1217: aload 10
    //   1219: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   1222: iconst_3
    //   1223: invokeinterface 296 5 0
    //   1228: aload_2
    //   1229: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1232: aload 8
    //   1234: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1237: iconst_0
    //   1238: istore 4
    //   1240: goto -1196 -> 44
    //   1243: aload 16
    //   1245: invokevirtual 616	java/util/zip/ZipEntry:getCrc	()J
    //   1248: invokestatic 619	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1251: astore 13
    //   1253: aload 13
    //   1255: aload 14
    //   1257: invokevirtual 108	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1260: ifne +64 -> 1324
    //   1263: ldc 159
    //   1265: ldc_w 621
    //   1268: iconst_3
    //   1269: anewarray 163	java/lang/Object
    //   1272: dup
    //   1273: iconst_0
    //   1274: aload 7
    //   1276: aastore
    //   1277: dup
    //   1278: iconst_1
    //   1279: aload 14
    //   1281: aastore
    //   1282: dup
    //   1283: iconst_2
    //   1284: aload 13
    //   1286: aastore
    //   1287: invokestatic 256	com/tencent/tinker/lib/util/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1290: aload 5
    //   1292: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1295: aload_3
    //   1296: aload 15
    //   1298: aload 10
    //   1300: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   1303: iconst_3
    //   1304: invokeinterface 296 5 0
    //   1309: aload_2
    //   1310: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1313: aload 8
    //   1315: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1318: iconst_0
    //   1319: istore 4
    //   1321: goto -1277 -> 44
    //   1324: aload_2
    //   1325: aload 8
    //   1327: aload 16
    //   1329: aload 17
    //   1331: aload 10
    //   1333: aload 15
    //   1335: invokestatic 625	com/tencent/tinker/lib/c/d:a	(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/util/zip/ZipEntry;Lcom/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo;Ljava/io/File;)V
    //   1338: aload 15
    //   1340: aload 6
    //   1342: invokestatic 590	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:h	(Ljava/io/File;Ljava/lang/String;)Z
    //   1345: ifne +75 -> 1420
    //   1348: new 112	java/lang/StringBuilder
    //   1351: astore_0
    //   1352: aload_0
    //   1353: ldc_w 623
    //   1356: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1359: ldc 159
    //   1361: aload_0
    //   1362: aload 15
    //   1364: invokevirtual 301	java/io/File:getPath	()Ljava/lang/String;
    //   1367: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1370: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1373: iconst_0
    //   1374: anewarray 163	java/lang/Object
    //   1377: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1380: aload 5
    //   1382: getfield 290	com/tencent/tinker/lib/e/a:ABF	Lcom/tencent/tinker/lib/d/d;
    //   1385: aload_3
    //   1386: aload 15
    //   1388: aload 10
    //   1390: getfield 58	com/tencent/tinker/loader/shareutil/ShareDexDiffPatchInfo:ADN	Ljava/lang/String;
    //   1393: iconst_3
    //   1394: invokeinterface 296 5 0
    //   1399: aload 15
    //   1401: invokestatic 267	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:as	(Ljava/io/File;)Z
    //   1404: pop
    //   1405: aload_2
    //   1406: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1409: aload 8
    //   1411: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1414: iconst_0
    //   1415: istore 4
    //   1417: goto -1373 -> 44
    //   1420: ldc 159
    //   1422: ldc_w 627
    //   1425: iconst_3
    //   1426: anewarray 163	java/lang/Object
    //   1429: dup
    //   1430: iconst_0
    //   1431: aload 15
    //   1433: invokevirtual 301	java/io/File:getPath	()Ljava/lang/String;
    //   1436: aastore
    //   1437: dup
    //   1438: iconst_1
    //   1439: aload 15
    //   1441: invokevirtual 248	java/io/File:length	()J
    //   1444: invokestatic 253	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1447: aastore
    //   1448: dup
    //   1449: iconst_2
    //   1450: invokestatic 185	java/lang/System:currentTimeMillis	()J
    //   1453: lload 11
    //   1455: lsub
    //   1456: invokestatic 253	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1459: aastore
    //   1460: invokestatic 179	com/tencent/tinker/lib/util/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1463: goto -1278 -> 185
    //   1466: aload_0
    //   1467: aload_3
    //   1468: aload_1
    //   1469: invokestatic 629	com/tencent/tinker/lib/c/d:a	(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z
    //   1472: istore 4
    //   1474: iload 4
    //   1476: ifne +18 -> 1494
    //   1479: aload_2
    //   1480: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1483: aload 8
    //   1485: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1488: iconst_0
    //   1489: istore 4
    //   1491: goto -1447 -> 44
    //   1494: aload_2
    //   1495: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1498: aload 8
    //   1500: invokestatic 537	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   1503: iconst_1
    //   1504: istore 4
    //   1506: goto -1462 -> 44
    //   1509: astore_0
    //   1510: aconst_null
    //   1511: astore_1
    //   1512: aload 6
    //   1514: astore_2
    //   1515: goto -1162 -> 353
    //   1518: astore_0
    //   1519: aload_2
    //   1520: astore_1
    //   1521: aload 6
    //   1523: astore_2
    //   1524: goto -1171 -> 353
    //   1527: astore_1
    //   1528: aconst_null
    //   1529: astore_0
    //   1530: aload 7
    //   1532: astore_2
    //   1533: goto -1240 -> 293
    //   1536: astore_1
    //   1537: aload_2
    //   1538: astore_0
    //   1539: aload 7
    //   1541: astore_2
    //   1542: goto -1249 -> 293
    //
    // Exception table:
    //   from	to	target	type
    //   138	162	287	java/lang/Throwable
    //   177	185	287	java/lang/Throwable
    //   185	233	287	java/lang/Throwable
    //   233	284	287	java/lang/Throwable
    //   363	402	287	java/lang/Throwable
    //   405	418	287	java/lang/Throwable
    //   418	473	287	java/lang/Throwable
    //   488	495	287	java/lang/Throwable
    //   498	573	287	java/lang/Throwable
    //   585	626	287	java/lang/Throwable
    //   626	654	287	java/lang/Throwable
    //   659	698	287	java/lang/Throwable
    //   713	722	287	java/lang/Throwable
    //   725	790	287	java/lang/Throwable
    //   805	822	287	java/lang/Throwable
    //   827	866	287	java/lang/Throwable
    //   881	947	287	java/lang/Throwable
    //   962	1040	287	java/lang/Throwable
    //   1060	1099	287	java/lang/Throwable
    //   1114	1169	287	java/lang/Throwable
    //   1189	1228	287	java/lang/Throwable
    //   1243	1309	287	java/lang/Throwable
    //   1324	1405	287	java/lang/Throwable
    //   1420	1463	287	java/lang/Throwable
    //   1466	1474	287	java/lang/Throwable
    //   293	348	348	finally
    //   138	162	576	finally
    //   177	185	576	finally
    //   185	233	576	finally
    //   233	284	576	finally
    //   363	402	576	finally
    //   405	418	576	finally
    //   418	473	576	finally
    //   488	495	576	finally
    //   498	573	576	finally
    //   585	626	576	finally
    //   626	654	576	finally
    //   659	698	576	finally
    //   713	722	576	finally
    //   725	790	576	finally
    //   805	822	576	finally
    //   827	866	576	finally
    //   881	947	576	finally
    //   962	1040	576	finally
    //   1060	1099	576	finally
    //   1114	1169	576	finally
    //   1189	1228	576	finally
    //   1243	1309	576	finally
    //   1324	1405	576	finally
    //   1420	1463	576	finally
    //   1466	1474	576	finally
    //   80	85	1509	finally
    //   89	101	1509	finally
    //   115	127	1509	finally
    //   127	138	1518	finally
    //   80	85	1527	java/lang/Throwable
    //   89	101	1527	java/lang/Throwable
    //   115	127	1527	java/lang/Throwable
    //   127	138	1536	java/lang/Throwable
  }

  // ERROR //
  private static boolean b(ZipFile paramZipFile, ZipEntry paramZipEntry, File paramFile, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: iconst_0
    //   4: istore 5
    //   6: iload 5
    //   8: iconst_2
    //   9: if_icmpge +261 -> 270
    //   12: iload 4
    //   14: ifne +256 -> 270
    //   17: ldc 159
    //   19: new 112	java/lang/StringBuilder
    //   22: dup
    //   23: ldc_w 631
    //   26: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   29: aload_2
    //   30: invokevirtual 301	java/io/File:getPath	()Ljava/lang/String;
    //   33: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: iconst_0
    //   40: anewarray 163	java/lang/Object
    //   43: invokestatic 309	com/tencent/tinker/lib/util/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: new 69	java/util/zip/ZipOutputStream
    //   49: astore 6
    //   51: new 71	java/io/BufferedOutputStream
    //   54: astore 7
    //   56: new 73	java/io/FileOutputStream
    //   59: astore 8
    //   61: aload 8
    //   63: aload_2
    //   64: invokespecial 76	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   67: aload 7
    //   69: aload 8
    //   71: invokespecial 79	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   74: aload 6
    //   76: aload 7
    //   78: invokespecial 80	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   81: new 43	java/io/BufferedInputStream
    //   84: astore 8
    //   86: aload 8
    //   88: aload_0
    //   89: aload_1
    //   90: invokevirtual 49	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   93: invokespecial 52	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   96: sipush 16384
    //   99: newarray byte
    //   101: astore 7
    //   103: new 82	java/util/zip/ZipEntry
    //   106: astore 9
    //   108: aload 9
    //   110: ldc 84
    //   112: invokespecial 87	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   115: aload 6
    //   117: aload 9
    //   119: invokevirtual 91	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   122: aload 8
    //   124: aload 7
    //   126: invokevirtual 635	java/io/BufferedInputStream:read	([B)I
    //   129: istore 10
    //   131: iload 10
    //   133: iconst_m1
    //   134: if_icmpeq +25 -> 159
    //   137: aload 6
    //   139: aload 7
    //   141: iconst_0
    //   142: iload 10
    //   144: invokevirtual 639	java/util/zip/ZipOutputStream:write	([BII)V
    //   147: aload 8
    //   149: aload 7
    //   151: invokevirtual 635	java/io/BufferedInputStream:read	([B)I
    //   154: istore 10
    //   156: goto -25 -> 131
    //   159: aload 6
    //   161: invokevirtual 145	java/util/zip/ZipOutputStream:closeEntry	()V
    //   164: aload 8
    //   166: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   169: aload 6
    //   171: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   174: aload_2
    //   175: aload_3
    //   176: invokestatic 590	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:h	(Ljava/io/File;Ljava/lang/String;)Z
    //   179: istore 4
    //   181: ldc 159
    //   183: ldc_w 641
    //   186: iconst_1
    //   187: anewarray 163	java/lang/Object
    //   190: dup
    //   191: iconst_0
    //   192: iload 4
    //   194: invokestatic 306	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   197: aastore
    //   198: invokestatic 309	com/tencent/tinker/lib/util/a:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: iload 4
    //   203: ifne +46 -> 249
    //   206: aload_2
    //   207: invokevirtual 597	java/io/File:delete	()Z
    //   210: ifeq +10 -> 220
    //   213: aload_2
    //   214: invokevirtual 317	java/io/File:exists	()Z
    //   217: ifeq +32 -> 249
    //   220: ldc 159
    //   222: new 112	java/lang/StringBuilder
    //   225: dup
    //   226: ldc_w 643
    //   229: invokespecial 115	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   232: aload_2
    //   233: invokevirtual 301	java/io/File:getPath	()Ljava/lang/String;
    //   236: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   242: iconst_0
    //   243: anewarray 163	java/lang/Object
    //   246: invokestatic 256	com/tencent/tinker/lib/util/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   249: iinc 5 1
    //   252: goto -246 -> 6
    //   255: astore_0
    //   256: aconst_null
    //   257: astore_1
    //   258: aconst_null
    //   259: astore_2
    //   260: aload_1
    //   261: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   264: aload_2
    //   265: invokestatic 134	com/tencent/tinker/c/b/a:ah	(Ljava/lang/Object;)V
    //   268: aload_0
    //   269: athrow
    //   270: iload 4
    //   272: ireturn
    //   273: astore_0
    //   274: aconst_null
    //   275: astore_1
    //   276: aload 6
    //   278: astore_2
    //   279: goto -19 -> 260
    //   282: astore_0
    //   283: aload 8
    //   285: astore_1
    //   286: aload 6
    //   288: astore_2
    //   289: goto -29 -> 260
    //
    // Exception table:
    //   from	to	target	type
    //   46	81	255	finally
    //   81	96	273	finally
    //   96	131	282	finally
    //   137	156	282	finally
    //   159	164	282	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.c.d
 * JD-Core Version:    0.6.2
 */