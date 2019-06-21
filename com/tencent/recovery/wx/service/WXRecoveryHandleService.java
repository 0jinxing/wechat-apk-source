package com.tencent.recovery.wx.service;

import android.content.Context;
import android.os.PowerManager;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.model.RecoveryData;
import com.tencent.recovery.model.RecoveryHandleItem;
import com.tencent.recovery.service.RecoveryHandleService;
import com.tencent.recovery.wx.util.NetUtil;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;

public class WXRecoveryHandleService extends RecoveryHandleService
{
  private PowerManager tXN;

  private RecoveryHandleItem a(RecoveryData paramRecoveryData, String paramString)
  {
    RecoveryHandleItem localRecoveryHandleItem = new RecoveryHandleItem();
    localRecoveryHandleItem.eCq = paramRecoveryData.eCq;
    localRecoveryHandleItem.clientVersion = paramRecoveryData.clientVersion;
    localRecoveryHandleItem.timestamp = System.currentTimeMillis();
    localRecoveryHandleItem.key = paramString;
    localRecoveryHandleItem.processName = paramRecoveryData.processName;
    localRecoveryHandleItem.Arn = iE(this);
    return localRecoveryHandleItem;
  }

  // ERROR //
  private static String a(String paramString, RecoveryHandleItem paramRecoveryHandleItem)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 58
    //   3: invokevirtual 64	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   6: ifeq +145 -> 151
    //   9: new 66	java/io/File
    //   12: dup
    //   13: aload_0
    //   14: ldc 58
    //   16: ldc 68
    //   18: invokevirtual 72	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   21: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   24: astore_2
    //   25: new 77	java/io/FileInputStream
    //   28: astore_0
    //   29: aload_0
    //   30: aload_2
    //   31: invokespecial 80	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   34: aload_0
    //   35: invokestatic 86	com/tencent/recovery/wx/util/FileUtil:q	(Ljava/io/InputStream;)[B
    //   38: astore_2
    //   39: aload_0
    //   40: invokevirtual 91	java/io/InputStream:close	()V
    //   43: aload_2
    //   44: astore_0
    //   45: aload_0
    //   46: ifnull +456 -> 502
    //   49: aload_0
    //   50: invokestatic 97	com/tencent/recovery/wx/util/EncryptUtil:x	([B)Ljava/lang/String;
    //   53: astore_2
    //   54: ldc 99
    //   56: ldc 101
    //   58: iconst_1
    //   59: anewarray 103	java/lang/Object
    //   62: dup
    //   63: iconst_0
    //   64: aload_2
    //   65: aastore
    //   66: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload_0
    //   70: ldc 111
    //   72: invokestatic 115	com/tencent/recovery/wx/util/EncryptUtil:g	([BLjava/lang/String;)[B
    //   75: astore_0
    //   76: aload_0
    //   77: ifnonnull +354 -> 431
    //   80: new 117	java/lang/StringBuilder
    //   83: astore_0
    //   84: aload_0
    //   85: ldc 119
    //   87: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   90: aload_1
    //   91: aload_0
    //   92: aload_2
    //   93: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: ldc 126
    //   98: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   107: aconst_null
    //   108: astore_0
    //   109: aload_0
    //   110: areturn
    //   111: astore_0
    //   112: aconst_null
    //   113: astore_0
    //   114: aload_0
    //   115: ifnull +31 -> 146
    //   118: aload_0
    //   119: invokevirtual 91	java/io/InputStream:close	()V
    //   122: aconst_null
    //   123: astore_0
    //   124: goto -79 -> 45
    //   127: astore_0
    //   128: aconst_null
    //   129: astore_0
    //   130: goto -85 -> 45
    //   133: astore_0
    //   134: aconst_null
    //   135: astore_1
    //   136: aload_1
    //   137: ifnull +7 -> 144
    //   140: aload_1
    //   141: invokevirtual 91	java/io/InputStream:close	()V
    //   144: aload_0
    //   145: athrow
    //   146: aconst_null
    //   147: astore_0
    //   148: goto -103 -> 45
    //   151: aload_0
    //   152: invokestatic 136	com/tencent/recovery/wx/util/WXUtil:atN	(Ljava/lang/String;)Ljava/lang/String;
    //   155: astore_0
    //   156: new 138	java/net/URL
    //   159: astore_2
    //   160: aload_2
    //   161: aload_0
    //   162: invokespecial 139	java/net/URL:<init>	(Ljava/lang/String;)V
    //   165: aload_2
    //   166: invokevirtual 143	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   169: checkcast 145	java/net/HttpURLConnection
    //   172: astore_2
    //   173: aload_2
    //   174: ldc 147
    //   176: invokevirtual 150	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   179: aload_2
    //   180: sipush 10000
    //   183: invokevirtual 154	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   186: aload_2
    //   187: sipush 20000
    //   190: invokevirtual 157	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   193: aload_2
    //   194: invokevirtual 160	java/net/HttpURLConnection:connect	()V
    //   197: aload_2
    //   198: invokevirtual 164	java/net/HttpURLConnection:getResponseCode	()I
    //   201: istore_3
    //   202: iload_3
    //   203: sipush 200
    //   206: if_icmpeq +44 -> 250
    //   209: aload_1
    //   210: iload_3
    //   211: invokestatic 168	com/tencent/recovery/wx/util/WXUtil:QZ	(I)Ljava/lang/String;
    //   214: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   217: aconst_null
    //   218: astore 4
    //   220: aconst_null
    //   221: astore 5
    //   223: aload 4
    //   225: ifnull +8 -> 233
    //   228: aload 4
    //   230: invokevirtual 91	java/io/InputStream:close	()V
    //   233: aload 5
    //   235: astore_0
    //   236: aload_2
    //   237: ifnull -192 -> 45
    //   240: aload_2
    //   241: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   244: aload 5
    //   246: astore_0
    //   247: goto -202 -> 45
    //   250: aload_2
    //   251: invokevirtual 175	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   254: astore_0
    //   255: aload_0
    //   256: ifnonnull +18 -> 274
    //   259: aload_1
    //   260: ldc 177
    //   262: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   265: aconst_null
    //   266: astore 5
    //   268: aload_0
    //   269: astore 4
    //   271: goto -48 -> 223
    //   274: aload_0
    //   275: invokestatic 178	com/tencent/recovery/wx/service/WXRecoveryHandleService:q	(Ljava/io/InputStream;)[B
    //   278: astore 6
    //   280: aload 6
    //   282: ifnonnull +101 -> 383
    //   285: aload_1
    //   286: ldc 180
    //   288: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   291: aload_0
    //   292: astore 4
    //   294: aload 6
    //   296: astore 5
    //   298: goto -75 -> 223
    //   301: astore 4
    //   303: aload 6
    //   305: astore 5
    //   307: aload 4
    //   309: astore 6
    //   311: ldc 99
    //   313: aload 6
    //   315: ldc 182
    //   317: iconst_0
    //   318: anewarray 103	java/lang/Object
    //   321: invokestatic 186	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   324: new 117	java/lang/StringBuilder
    //   327: astore 4
    //   329: aload 4
    //   331: ldc 188
    //   333: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   336: aload_1
    //   337: aload 4
    //   339: aload 6
    //   341: invokevirtual 191	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   344: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   347: ldc 126
    //   349: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   355: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   358: aload_0
    //   359: ifnull +7 -> 366
    //   362: aload_0
    //   363: invokevirtual 91	java/io/InputStream:close	()V
    //   366: aload 5
    //   368: astore_0
    //   369: aload_2
    //   370: ifnull -325 -> 45
    //   373: aload_2
    //   374: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   377: aload 5
    //   379: astore_0
    //   380: goto -335 -> 45
    //   383: aload_0
    //   384: astore 4
    //   386: aload 6
    //   388: astore 5
    //   390: aload 6
    //   392: arraylength
    //   393: ifne -170 -> 223
    //   396: aload_1
    //   397: ldc 193
    //   399: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   402: aload_0
    //   403: astore 4
    //   405: aload 6
    //   407: astore 5
    //   409: goto -186 -> 223
    //   412: astore_1
    //   413: aload_0
    //   414: ifnull +7 -> 421
    //   417: aload_0
    //   418: invokevirtual 91	java/io/InputStream:close	()V
    //   421: aload_2
    //   422: ifnull +7 -> 429
    //   425: aload_2
    //   426: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   429: aload_1
    //   430: athrow
    //   431: ldc 99
    //   433: ldc 195
    //   435: iconst_1
    //   436: anewarray 103	java/lang/Object
    //   439: dup
    //   440: iconst_0
    //   441: aload_0
    //   442: invokestatic 97	com/tencent/recovery/wx/util/EncryptUtil:x	([B)Ljava/lang/String;
    //   445: aastore
    //   446: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: new 60	java/lang/String
    //   452: dup
    //   453: aload_0
    //   454: invokespecial 198	java/lang/String:<init>	([B)V
    //   457: astore_0
    //   458: goto -349 -> 109
    //   461: astore_0
    //   462: ldc 99
    //   464: aload_0
    //   465: ldc 182
    //   467: iconst_0
    //   468: anewarray 103	java/lang/Object
    //   471: invokestatic 186	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   474: aload_1
    //   475: new 117	java/lang/StringBuilder
    //   478: dup
    //   479: ldc 200
    //   481: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   484: aload_0
    //   485: invokevirtual 191	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   488: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   491: ldc 126
    //   493: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   499: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   502: aconst_null
    //   503: astore_0
    //   504: goto -395 -> 109
    //   507: astore_0
    //   508: aload_2
    //   509: astore_0
    //   510: goto -465 -> 45
    //   513: astore_1
    //   514: goto -370 -> 144
    //   517: astore_0
    //   518: goto -285 -> 233
    //   521: astore_0
    //   522: goto -156 -> 366
    //   525: astore_0
    //   526: goto -105 -> 421
    //   529: astore_1
    //   530: aconst_null
    //   531: astore_0
    //   532: aconst_null
    //   533: astore_2
    //   534: goto -121 -> 413
    //   537: astore_1
    //   538: aconst_null
    //   539: astore_0
    //   540: goto -127 -> 413
    //   543: astore_1
    //   544: goto -131 -> 413
    //   547: astore 6
    //   549: aconst_null
    //   550: astore_0
    //   551: aconst_null
    //   552: astore_2
    //   553: aconst_null
    //   554: astore 5
    //   556: goto -245 -> 311
    //   559: astore 6
    //   561: aconst_null
    //   562: astore_0
    //   563: aconst_null
    //   564: astore 5
    //   566: goto -255 -> 311
    //   569: astore 6
    //   571: aconst_null
    //   572: astore 5
    //   574: goto -263 -> 311
    //   577: astore_2
    //   578: aload_0
    //   579: astore_1
    //   580: aload_2
    //   581: astore_0
    //   582: goto -446 -> 136
    //   585: astore_2
    //   586: goto -472 -> 114
    //
    // Exception table:
    //   from	to	target	type
    //   25	34	111	java/lang/Exception
    //   118	122	127	java/io/IOException
    //   25	34	133	finally
    //   285	291	301	java/lang/Exception
    //   390	402	301	java/lang/Exception
    //   259	265	412	finally
    //   274	280	412	finally
    //   285	291	412	finally
    //   390	402	412	finally
    //   49	76	461	java/lang/Exception
    //   80	107	461	java/lang/Exception
    //   431	458	461	java/lang/Exception
    //   39	43	507	java/io/IOException
    //   140	144	513	java/io/IOException
    //   228	233	517	java/io/IOException
    //   362	366	521	java/io/IOException
    //   417	421	525	java/io/IOException
    //   156	173	529	finally
    //   173	202	537	finally
    //   209	217	537	finally
    //   250	255	537	finally
    //   311	358	543	finally
    //   156	173	547	java/lang/Exception
    //   173	202	559	java/lang/Exception
    //   209	217	559	java/lang/Exception
    //   250	255	559	java/lang/Exception
    //   259	265	569	java/lang/Exception
    //   274	280	569	java/lang/Exception
    //   34	39	577	finally
    //   34	39	585	java/lang/Exception
  }

  // ERROR //
  private static byte[] a(String paramString1, String paramString2, RecoveryHandleItem paramRecoveryHandleItem)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: ldc 58
    //   5: invokevirtual 64	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   8: ifeq +81 -> 89
    //   11: new 66	java/io/File
    //   14: dup
    //   15: aload_0
    //   16: ldc 58
    //   18: ldc 68
    //   20: invokevirtual 72	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   23: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   26: astore_1
    //   27: new 77	java/io/FileInputStream
    //   30: astore_0
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial 80	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   36: aload_0
    //   37: invokestatic 178	com/tencent/recovery/wx/service/WXRecoveryHandleService:q	(Ljava/io/InputStream;)[B
    //   40: astore_1
    //   41: aload_0
    //   42: invokevirtual 91	java/io/InputStream:close	()V
    //   45: aload_1
    //   46: astore_0
    //   47: aload_0
    //   48: areturn
    //   49: astore_0
    //   50: aconst_null
    //   51: astore_0
    //   52: aload_0
    //   53: ifnull +31 -> 84
    //   56: aload_0
    //   57: invokevirtual 91	java/io/InputStream:close	()V
    //   60: aconst_null
    //   61: astore_0
    //   62: goto -15 -> 47
    //   65: astore_0
    //   66: aconst_null
    //   67: astore_0
    //   68: goto -21 -> 47
    //   71: astore_0
    //   72: aload_3
    //   73: astore_1
    //   74: aload_1
    //   75: ifnull +7 -> 82
    //   78: aload_1
    //   79: invokevirtual 91	java/io/InputStream:close	()V
    //   82: aload_0
    //   83: athrow
    //   84: aconst_null
    //   85: astore_0
    //   86: goto -39 -> 47
    //   89: aload_0
    //   90: invokestatic 136	com/tencent/recovery/wx/util/WXUtil:atN	(Ljava/lang/String;)Ljava/lang/String;
    //   93: astore_3
    //   94: new 138	java/net/URL
    //   97: astore_0
    //   98: aload_0
    //   99: aload_3
    //   100: invokespecial 139	java/net/URL:<init>	(Ljava/lang/String;)V
    //   103: aload_0
    //   104: invokevirtual 143	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   107: checkcast 145	java/net/HttpURLConnection
    //   110: astore_3
    //   111: aload_3
    //   112: ldc 147
    //   114: invokevirtual 150	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   117: aload_3
    //   118: sipush 10000
    //   121: invokevirtual 154	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   124: aload_3
    //   125: sipush 20000
    //   128: invokevirtual 157	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   131: aload_3
    //   132: invokevirtual 160	java/net/HttpURLConnection:connect	()V
    //   135: aload_3
    //   136: invokevirtual 164	java/net/HttpURLConnection:getResponseCode	()I
    //   139: istore 4
    //   141: iload 4
    //   143: sipush 200
    //   146: if_icmpeq +40 -> 186
    //   149: aload_2
    //   150: iload 4
    //   152: invokestatic 204	com/tencent/recovery/wx/util/WXUtil:Ra	(I)Ljava/lang/String;
    //   155: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   158: aconst_null
    //   159: astore 5
    //   161: aconst_null
    //   162: astore_0
    //   163: aload 5
    //   165: ifnull +8 -> 173
    //   168: aload 5
    //   170: invokevirtual 91	java/io/InputStream:close	()V
    //   173: aload_0
    //   174: astore_2
    //   175: aload_3
    //   176: ifnull +319 -> 495
    //   179: aload_3
    //   180: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   183: goto -136 -> 47
    //   186: aload_3
    //   187: invokevirtual 175	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   190: astore 6
    //   192: aload 6
    //   194: ifnonnull +18 -> 212
    //   197: aload_2
    //   198: ldc 206
    //   200: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   203: aconst_null
    //   204: astore_0
    //   205: aload 6
    //   207: astore 5
    //   209: goto -46 -> 163
    //   212: aload 6
    //   214: invokestatic 86	com/tencent/recovery/wx/util/FileUtil:q	(Ljava/io/InputStream;)[B
    //   217: astore 7
    //   219: aload 7
    //   221: ifnonnull +95 -> 316
    //   224: aload_2
    //   225: ldc 208
    //   227: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   230: aload 7
    //   232: astore_0
    //   233: aload 6
    //   235: astore 5
    //   237: goto -74 -> 163
    //   240: astore_0
    //   241: aload_3
    //   242: astore_1
    //   243: aload_0
    //   244: astore_3
    //   245: aload 7
    //   247: astore_0
    //   248: ldc 99
    //   250: aload_3
    //   251: ldc 210
    //   253: iconst_0
    //   254: anewarray 103	java/lang/Object
    //   257: invokestatic 186	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: new 117	java/lang/StringBuilder
    //   263: astore 7
    //   265: aload 7
    //   267: ldc 212
    //   269: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   272: aload_2
    //   273: aload 7
    //   275: aload_3
    //   276: invokevirtual 191	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   279: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: ldc 126
    //   284: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   290: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   293: aload 6
    //   295: ifnull +8 -> 303
    //   298: aload 6
    //   300: invokevirtual 91	java/io/InputStream:close	()V
    //   303: aload_0
    //   304: astore_2
    //   305: aload_1
    //   306: ifnull +189 -> 495
    //   309: aload_1
    //   310: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   313: goto -266 -> 47
    //   316: aload 7
    //   318: arraylength
    //   319: ifne +42 -> 361
    //   322: aload_2
    //   323: ldc 214
    //   325: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   328: aload 7
    //   330: astore_0
    //   331: aload 6
    //   333: astore 5
    //   335: goto -172 -> 163
    //   338: astore_0
    //   339: aload_3
    //   340: astore_1
    //   341: aload 6
    //   343: ifnull +8 -> 351
    //   346: aload 6
    //   348: invokevirtual 91	java/io/InputStream:close	()V
    //   351: aload_1
    //   352: ifnull +7 -> 359
    //   355: aload_1
    //   356: invokevirtual 171	java/net/HttpURLConnection:disconnect	()V
    //   359: aload_0
    //   360: athrow
    //   361: aload 7
    //   363: astore_0
    //   364: aload 6
    //   366: astore 5
    //   368: aload 7
    //   370: invokestatic 97	com/tencent/recovery/wx/util/EncryptUtil:x	([B)Ljava/lang/String;
    //   373: aload_1
    //   374: invokevirtual 218	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   377: ifne -214 -> 163
    //   380: aload_2
    //   381: ldc 220
    //   383: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   386: aconst_null
    //   387: astore_0
    //   388: aload 6
    //   390: astore 5
    //   392: goto -229 -> 163
    //   395: astore_0
    //   396: aload_1
    //   397: astore_0
    //   398: goto -351 -> 47
    //   401: astore_1
    //   402: goto -320 -> 82
    //   405: astore_1
    //   406: goto -233 -> 173
    //   409: astore_2
    //   410: goto -107 -> 303
    //   413: astore_2
    //   414: goto -63 -> 351
    //   417: astore_0
    //   418: aconst_null
    //   419: astore 6
    //   421: aconst_null
    //   422: astore_1
    //   423: goto -82 -> 341
    //   426: astore_0
    //   427: aconst_null
    //   428: astore 6
    //   430: aload_3
    //   431: astore_1
    //   432: goto -91 -> 341
    //   435: astore_0
    //   436: goto -95 -> 341
    //   439: astore_3
    //   440: aconst_null
    //   441: astore 6
    //   443: aconst_null
    //   444: astore_1
    //   445: aconst_null
    //   446: astore_0
    //   447: goto -199 -> 248
    //   450: astore 6
    //   452: aconst_null
    //   453: astore 7
    //   455: aload_3
    //   456: astore_1
    //   457: aconst_null
    //   458: astore_0
    //   459: aload 6
    //   461: astore_3
    //   462: aload 7
    //   464: astore 6
    //   466: goto -218 -> 248
    //   469: astore 7
    //   471: aload_3
    //   472: astore_1
    //   473: aconst_null
    //   474: astore_0
    //   475: aload 7
    //   477: astore_3
    //   478: goto -230 -> 248
    //   481: astore_1
    //   482: aload_0
    //   483: astore_2
    //   484: aload_1
    //   485: astore_0
    //   486: aload_2
    //   487: astore_1
    //   488: goto -414 -> 74
    //   491: astore_1
    //   492: goto -440 -> 52
    //   495: aload_2
    //   496: astore_0
    //   497: goto -450 -> 47
    //
    // Exception table:
    //   from	to	target	type
    //   27	36	49	java/lang/Exception
    //   56	60	65	java/io/IOException
    //   27	36	71	finally
    //   224	230	240	java/lang/Exception
    //   316	328	240	java/lang/Exception
    //   368	386	240	java/lang/Exception
    //   197	203	338	finally
    //   212	219	338	finally
    //   224	230	338	finally
    //   316	328	338	finally
    //   368	386	338	finally
    //   41	45	395	java/io/IOException
    //   78	82	401	java/io/IOException
    //   168	173	405	java/io/IOException
    //   298	303	409	java/io/IOException
    //   346	351	413	java/io/IOException
    //   94	111	417	finally
    //   111	141	426	finally
    //   149	158	426	finally
    //   186	192	426	finally
    //   248	293	435	finally
    //   94	111	439	java/lang/Exception
    //   111	141	450	java/lang/Exception
    //   149	158	450	java/lang/Exception
    //   186	192	450	java/lang/Exception
    //   197	203	469	java/lang/Exception
    //   212	219	469	java/lang/Exception
    //   36	41	481	finally
    //   36	41	491	java/lang/Exception
  }

  private static boolean atM(String paramString)
  {
    boolean bool1 = false;
    try
    {
      paramString = InetAddress.getByName(paramString);
      bool2 = bool1;
      if (paramString != null)
      {
        paramString = paramString.getHostAddress();
        bool2 = bool1;
        if (paramString != null)
          bool2 = true;
      }
      return bool2;
    }
    catch (Exception paramString)
    {
      while (true)
        boolean bool2 = bool1;
    }
  }

  private String iE(Context paramContext)
  {
    paramContext = NetUtil.iF(paramContext);
    boolean bool1 = this.tXN.isScreenOn();
    boolean bool2 = atM("dldir1.qq.com");
    boolean bool3 = atM("www.qq.com");
    return paramContext + "|" + bool1 + "|" + bool2 + "|" + bool3;
  }

  private static byte[] q(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[1024];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte, 0, 1024);
      if (i <= 0)
        break;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    return localByteArrayOutputStream.toByteArray();
  }

  // ERROR //
  public final com.tencent.recovery.model.RecoveryHandleResult a(Context paramContext, RecoveryData paramRecoveryData, ArrayList<RecoveryHandleItem> paramArrayList, boolean paramBoolean)
  {
    // Byte code:
    //   0: new 273	com/tencent/recovery/model/RecoveryHandleResult
    //   3: dup
    //   4: invokespecial 274	com/tencent/recovery/model/RecoveryHandleResult:<init>	()V
    //   7: astore 5
    //   9: aload_3
    //   10: aload_0
    //   11: aload_2
    //   12: ldc_w 276
    //   15: iconst_2
    //   16: anewarray 103	java/lang/Object
    //   19: dup
    //   20: iconst_0
    //   21: ldc_w 278
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: iload 4
    //   29: invokestatic 284	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   32: aastore
    //   33: invokestatic 288	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   36: invokespecial 290	com/tencent/recovery/wx/service/WXRecoveryHandleService:a	(Lcom/tencent/recovery/model/RecoveryData;Ljava/lang/String;)Lcom/tencent/recovery/model/RecoveryHandleItem;
    //   39: invokevirtual 295	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   42: pop
    //   43: aload_0
    //   44: aload_2
    //   45: ldc 68
    //   47: invokespecial 290	com/tencent/recovery/wx/service/WXRecoveryHandleService:a	(Lcom/tencent/recovery/model/RecoveryData;Ljava/lang/String;)Lcom/tencent/recovery/model/RecoveryHandleItem;
    //   50: astore 6
    //   52: aload_0
    //   53: invokestatic 299	com/tencent/recovery/wx/util/NetUtil:isConnected	(Landroid/content/Context;)Z
    //   56: ifeq +500 -> 556
    //   59: aload_2
    //   60: getfield 302	com/tencent/recovery/model/RecoveryData:Arl	Ljava/lang/String;
    //   63: astore_2
    //   64: ldc 99
    //   66: ldc_w 304
    //   69: iconst_1
    //   70: anewarray 103	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_2
    //   76: aastore
    //   77: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: aload_2
    //   81: aload 6
    //   83: invokestatic 306	com/tencent/recovery/wx/service/WXRecoveryHandleService:a	(Ljava/lang/String;Lcom/tencent/recovery/model/RecoveryHandleItem;)Ljava/lang/String;
    //   86: astore 7
    //   88: aload 7
    //   90: ifnull +432 -> 522
    //   93: ldc 99
    //   95: ldc_w 308
    //   98: iconst_1
    //   99: anewarray 103	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: aload 7
    //   106: aastore
    //   107: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: new 310	org/json/JSONObject
    //   113: astore_2
    //   114: aload_2
    //   115: aload 7
    //   117: invokespecial 311	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   120: aload_2
    //   121: ifnull +378 -> 499
    //   124: aload_2
    //   125: ldc_w 313
    //   128: iconst_m1
    //   129: invokevirtual 317	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   132: istore 8
    //   134: aload_2
    //   135: ldc_w 319
    //   138: iconst_m1
    //   139: invokevirtual 317	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   142: istore 9
    //   144: aload_2
    //   145: ldc_w 321
    //   148: ldc 68
    //   150: invokevirtual 325	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   153: astore 7
    //   155: aload_2
    //   156: ldc_w 327
    //   159: ldc 68
    //   161: invokevirtual 325	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   164: astore_2
    //   165: aload_0
    //   166: invokestatic 333	com/tencent/recovery/util/Util:iB	(Landroid/content/Context;)I
    //   169: iload 8
    //   171: irem
    //   172: iload 9
    //   174: if_icmpne +204 -> 378
    //   177: iconst_1
    //   178: istore 9
    //   180: iload 9
    //   182: ifeq +294 -> 476
    //   185: ldc 99
    //   187: ldc_w 335
    //   190: iconst_1
    //   191: anewarray 103	java/lang/Object
    //   194: dup
    //   195: iconst_0
    //   196: aload 7
    //   198: aastore
    //   199: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: aload 7
    //   204: aload_2
    //   205: aload 6
    //   207: invokestatic 337	com/tencent/recovery/wx/service/WXRecoveryHandleService:a	(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/recovery/model/RecoveryHandleItem;)[B
    //   210: astore 10
    //   212: aload 10
    //   214: ifnull +247 -> 461
    //   217: new 117	java/lang/StringBuilder
    //   220: dup
    //   221: invokespecial 250	java/lang/StringBuilder:<init>	()V
    //   224: aload_1
    //   225: invokevirtual 343	android/content/Context:getCacheDir	()Ljava/io/File;
    //   228: invokevirtual 346	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   231: ldc_w 348
    //   234: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   240: astore 7
    //   242: new 66	java/io/File
    //   245: dup
    //   246: aload 7
    //   248: invokespecial 75	java/io/File:<init>	(Ljava/lang/String;)V
    //   251: astore 11
    //   253: aload 11
    //   255: invokevirtual 351	java/io/File:exists	()Z
    //   258: ifeq +9 -> 267
    //   261: aload 11
    //   263: invokevirtual 354	java/io/File:delete	()Z
    //   266: pop
    //   267: new 356	java/io/FileOutputStream
    //   270: astore_2
    //   271: aload_2
    //   272: aload 11
    //   274: invokespecial 357	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   277: aload_2
    //   278: aload 10
    //   280: invokevirtual 359	java/io/FileOutputStream:write	([B)V
    //   283: aload_2
    //   284: invokevirtual 360	java/io/FileOutputStream:close	()V
    //   287: aload 11
    //   289: invokevirtual 351	java/io/File:exists	()Z
    //   292: ifeq +146 -> 438
    //   295: aload_1
    //   296: aload 7
    //   298: invokestatic 366	com/tencent/recovery/wx/RecoveryTinkerManager:bY	(Landroid/content/Context;Ljava/lang/String;)I
    //   301: istore 9
    //   303: iload 9
    //   305: ifeq +110 -> 415
    //   308: aload 6
    //   310: new 117	java/lang/StringBuilder
    //   313: dup
    //   314: ldc_w 368
    //   317: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   320: iload 9
    //   322: invokevirtual 371	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   325: ldc 126
    //   327: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   333: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   336: ldc 99
    //   338: ldc_w 373
    //   341: iconst_1
    //   342: anewarray 103	java/lang/Object
    //   345: dup
    //   346: iconst_0
    //   347: iload 9
    //   349: invokestatic 378	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   352: aastore
    //   353: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   356: aload 5
    //   358: iconst_1
    //   359: putfield 382	com/tencent/recovery/model/RecoveryHandleResult:csN	Z
    //   362: aload_3
    //   363: aload 6
    //   365: invokevirtual 295	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   368: pop
    //   369: aload 5
    //   371: areturn
    //   372: astore_2
    //   373: aconst_null
    //   374: astore_2
    //   375: goto -255 -> 120
    //   378: iconst_0
    //   379: istore 9
    //   381: goto -201 -> 180
    //   384: astore_2
    //   385: aconst_null
    //   386: astore_2
    //   387: aload_2
    //   388: ifnull -101 -> 287
    //   391: aload_2
    //   392: invokevirtual 360	java/io/FileOutputStream:close	()V
    //   395: goto -108 -> 287
    //   398: astore_2
    //   399: goto -112 -> 287
    //   402: astore_1
    //   403: aconst_null
    //   404: astore_2
    //   405: aload_2
    //   406: ifnull +7 -> 413
    //   409: aload_2
    //   410: invokevirtual 360	java/io/FileOutputStream:close	()V
    //   413: aload_1
    //   414: athrow
    //   415: aload 6
    //   417: ldc_w 384
    //   420: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   423: ldc 99
    //   425: ldc_w 386
    //   428: iconst_0
    //   429: anewarray 103	java/lang/Object
    //   432: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   435: goto -79 -> 356
    //   438: aload 6
    //   440: ldc_w 388
    //   443: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   446: ldc 99
    //   448: ldc_w 390
    //   451: iconst_0
    //   452: anewarray 103	java/lang/Object
    //   455: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   458: goto -96 -> 362
    //   461: ldc 99
    //   463: ldc_w 392
    //   466: iconst_0
    //   467: anewarray 103	java/lang/Object
    //   470: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   473: goto -111 -> 362
    //   476: ldc 99
    //   478: ldc_w 394
    //   481: iconst_0
    //   482: anewarray 103	java/lang/Object
    //   485: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   488: aload 6
    //   490: ldc_w 396
    //   493: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   496: goto -134 -> 362
    //   499: ldc 99
    //   501: ldc_w 398
    //   504: iconst_0
    //   505: anewarray 103	java/lang/Object
    //   508: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   511: aload 6
    //   513: ldc_w 400
    //   516: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   519: goto -157 -> 362
    //   522: ldc 99
    //   524: ldc_w 402
    //   527: iconst_0
    //   528: anewarray 103	java/lang/Object
    //   531: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   534: aload 6
    //   536: getfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   539: invokestatic 405	com/tencent/recovery/util/Util:isNullOrNil	(Ljava/lang/String;)Z
    //   542: ifeq -180 -> 362
    //   545: aload 6
    //   547: ldc_w 407
    //   550: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   553: goto -191 -> 362
    //   556: ldc 99
    //   558: ldc_w 409
    //   561: iconst_0
    //   562: anewarray 103	java/lang/Object
    //   565: invokestatic 109	com/tencent/recovery/log/RecoveryLog:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   568: iload 4
    //   570: ifne +9 -> 579
    //   573: aload 5
    //   575: iconst_1
    //   576: putfield 412	com/tencent/recovery/model/RecoveryHandleResult:retry	Z
    //   579: aload 6
    //   581: ldc_w 276
    //   584: iconst_2
    //   585: anewarray 103	java/lang/Object
    //   588: dup
    //   589: iconst_0
    //   590: ldc_w 414
    //   593: aastore
    //   594: dup
    //   595: iconst_1
    //   596: iload 4
    //   598: invokestatic 284	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   601: aastore
    //   602: invokestatic 288	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   605: putfield 40	com/tencent/recovery/model/RecoveryHandleItem:key	Ljava/lang/String;
    //   608: goto -246 -> 362
    //   611: astore_2
    //   612: goto -325 -> 287
    //   615: astore_2
    //   616: goto -203 -> 413
    //   619: astore_1
    //   620: goto -215 -> 405
    //   623: astore 10
    //   625: goto -238 -> 387
    //
    // Exception table:
    //   from	to	target	type
    //   110	120	372	java/lang/Exception
    //   267	277	384	java/lang/Exception
    //   391	395	398	java/io/IOException
    //   267	277	402	finally
    //   283	287	611	java/io/IOException
    //   409	413	615	java/io/IOException
    //   277	283	619	finally
    //   277	283	623	java/lang/Exception
  }

  public final void a(RecoveryData paramRecoveryData, ArrayList<RecoveryHandleItem> paramArrayList, boolean paramBoolean)
  {
    paramArrayList.add(a(paramRecoveryData, String.format("%s[%b]", new Object[] { "KeyTotalCount", Boolean.valueOf(paramBoolean) })));
    paramArrayList.add(a(paramRecoveryData, String.format("%s[%b]", new Object[] { "KeyAlreadyRunning", Boolean.valueOf(paramBoolean) })));
  }

  public void onCreate()
  {
    super.onCreate();
    RecoveryLog.i("Recovery.WXRecoveryHandleService", "onCreate", new Object[0]);
    this.tXN = ((PowerManager)getSystemService("power"));
  }

  public void onDestroy()
  {
    RecoveryLog.i("Recovery.WXRecoveryHandleService", "onDestroy", new Object[0]);
    super.onDestroy();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.wx.service.WXRecoveryHandleService
 * JD-Core Version:    0.6.2
 */