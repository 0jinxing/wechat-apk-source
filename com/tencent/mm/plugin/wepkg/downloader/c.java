package com.tencent.mm.plugin.wepkg.downloader;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.HttpURLConnection;
import java.util.concurrent.Future;
import javax.net.ssl.SSLContext;

public final class c
  implements Runnable
{
  private String mContentType;
  private int mStatusCode;
  private int retCode = 0;
  f uVO;
  Future<?> uVP;
  HttpURLConnection uVQ;
  private String uVR;
  private String uVS;
  private String uVT;
  boolean uVU;
  private boolean uVV;
  private boolean uVW = false;

  public c(f paramf)
  {
    this.uVO = paramf;
  }

  private static SSLContext ahL(String paramString)
  {
    AppMethodBeat.i(63423);
    try
    {
      paramString = SSLContext.getInstance(paramString);
      AppMethodBeat.o(63423);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(63423);
      }
    }
  }

  private static int ahM(String paramString)
  {
    AppMethodBeat.i(63424);
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = paramString.split("/");
      if ((paramString == null) || (paramString.length != 2));
    }
    while (true)
    {
      try
      {
        i = Integer.valueOf(paramString[1]).intValue();
        AppMethodBeat.o(63424);
        return i;
      }
      catch (NumberFormatException paramString)
      {
      }
      int i = -1;
      AppMethodBeat.o(63424);
    }
  }

  private static long ahN(String paramString)
  {
    AppMethodBeat.i(63425);
    if (!TextUtils.isEmpty(paramString));
    while (true)
    {
      try
      {
        l = Long.valueOf(paramString).longValue();
        AppMethodBeat.o(63425);
        return l;
      }
      catch (NumberFormatException paramString)
      {
      }
      long l = -1L;
      AppMethodBeat.o(63425);
    }
  }

  // ERROR //
  private void dgv()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: ldc 101
    //   4: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aconst_null
    //   8: astore_2
    //   9: aload_0
    //   10: aload_0
    //   11: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   14: invokevirtual 108	java/net/HttpURLConnection:getResponseCode	()I
    //   17: putfield 110	com/tencent/mm/plugin/wepkg/downloader/c:mStatusCode	I
    //   20: ldc 112
    //   22: ldc 114
    //   24: iconst_2
    //   25: anewarray 4	java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   34: getfield 119	com/tencent/mm/plugin/wepkg/downloader/f:uWo	Ljava/lang/String;
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: aload_0
    //   41: getfield 110	com/tencent/mm/plugin/wepkg/downloader/c:mStatusCode	I
    //   44: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   47: aastore
    //   48: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: aload_0
    //   52: getfield 110	com/tencent/mm/plugin/wepkg/downloader/c:mStatusCode	I
    //   55: lookupswitch	default:+25->80, 200:+49->104, 206:+49->104
    //   81: aload_0
    //   82: getfield 110	com/tencent/mm/plugin/wepkg/downloader/c:mStatusCode	I
    //   85: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   88: aconst_null
    //   89: astore_3
    //   90: aload_3
    //   91: invokestatic 133	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   94: aload_2
    //   95: invokestatic 133	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   98: ldc 101
    //   100: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: return
    //   104: aload_0
    //   105: aload_0
    //   106: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   109: ldc 135
    //   111: invokevirtual 139	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   114: putfield 141	com/tencent/mm/plugin/wepkg/downloader/c:mContentType	Ljava/lang/String;
    //   117: aload_0
    //   118: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   121: invokevirtual 145	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   124: pop
    //   125: aload_0
    //   126: aload_0
    //   127: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   130: ldc 147
    //   132: invokevirtual 139	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   135: putfield 149	com/tencent/mm/plugin/wepkg/downloader/c:uVR	Ljava/lang/String;
    //   138: aload_0
    //   139: aload_0
    //   140: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   143: ldc 151
    //   145: invokevirtual 139	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   148: putfield 153	com/tencent/mm/plugin/wepkg/downloader/c:uVS	Ljava/lang/String;
    //   151: ldc 155
    //   153: aload_0
    //   154: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   157: ldc 157
    //   159: invokevirtual 139	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   162: invokevirtual 161	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   165: ifeq +122 -> 287
    //   168: iconst_1
    //   169: istore 4
    //   171: aload_0
    //   172: getfield 163	com/tencent/mm/plugin/wepkg/downloader/c:uVV	Z
    //   175: ifeq +195 -> 370
    //   178: iload 4
    //   180: ifne +138 -> 318
    //   183: ldc 112
    //   185: ldc 165
    //   187: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: aload_0
    //   191: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   194: getfield 171	com/tencent/mm/plugin/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   197: invokestatic 175	com/tencent/mm/pluginsdk/g/a/d/a:ajj	(Ljava/lang/String;)Z
    //   200: pop
    //   201: aload_0
    //   202: getfield 153	com/tencent/mm/plugin/wepkg/downloader/c:uVS	Ljava/lang/String;
    //   205: invokestatic 177	com/tencent/mm/plugin/wepkg/downloader/c:ahN	(Ljava/lang/String;)J
    //   208: lstore 5
    //   210: aload_0
    //   211: iload 4
    //   213: putfield 34	com/tencent/mm/plugin/wepkg/downloader/c:uVW	Z
    //   216: ldc 112
    //   218: ldc 179
    //   220: iconst_5
    //   221: anewarray 4	java/lang/Object
    //   224: dup
    //   225: iconst_0
    //   226: aload_0
    //   227: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   230: getfield 119	com/tencent/mm/plugin/wepkg/downloader/f:uWo	Ljava/lang/String;
    //   233: aastore
    //   234: dup
    //   235: iconst_1
    //   236: aload_0
    //   237: getfield 149	com/tencent/mm/plugin/wepkg/downloader/c:uVR	Ljava/lang/String;
    //   240: aastore
    //   241: dup
    //   242: iconst_2
    //   243: aload_0
    //   244: getfield 153	com/tencent/mm/plugin/wepkg/downloader/c:uVS	Ljava/lang/String;
    //   247: aastore
    //   248: dup
    //   249: iconst_3
    //   250: aload_0
    //   251: getfield 141	com/tencent/mm/plugin/wepkg/downloader/c:mContentType	Ljava/lang/String;
    //   254: aastore
    //   255: dup
    //   256: iconst_4
    //   257: iload 4
    //   259: invokestatic 184	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   262: aastore
    //   263: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: lload 5
    //   268: ldc2_w 98
    //   271: lcmp
    //   272: ifne +120 -> 392
    //   275: aload_0
    //   276: sipush 1010
    //   279: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   282: aconst_null
    //   283: astore_3
    //   284: goto -194 -> 90
    //   287: aload_0
    //   288: getfield 149	com/tencent/mm/plugin/wepkg/downloader/c:uVR	Ljava/lang/String;
    //   291: ifnull +21 -> 312
    //   294: aload_0
    //   295: getfield 149	com/tencent/mm/plugin/wepkg/downloader/c:uVR	Ljava/lang/String;
    //   298: ldc 155
    //   300: invokevirtual 187	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   303: ifeq +9 -> 312
    //   306: iconst_1
    //   307: istore 4
    //   309: goto -138 -> 171
    //   312: iconst_0
    //   313: istore 4
    //   315: goto -144 -> 171
    //   318: aload_0
    //   319: getfield 149	com/tencent/mm/plugin/wepkg/downloader/c:uVR	Ljava/lang/String;
    //   322: invokestatic 189	com/tencent/mm/plugin/wepkg/downloader/c:ahM	(Ljava/lang/String;)I
    //   325: i2l
    //   326: lstore 5
    //   328: lload 5
    //   330: ldc2_w 98
    //   333: lcmp
    //   334: ifne +706 -> 1040
    //   337: ldc 112
    //   339: ldc 191
    //   341: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   344: aload_0
    //   345: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   348: getfield 171	com/tencent/mm/plugin/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   351: invokestatic 175	com/tencent/mm/pluginsdk/g/a/d/a:ajj	(Ljava/lang/String;)Z
    //   354: pop
    //   355: aload_0
    //   356: getfield 153	com/tencent/mm/plugin/wepkg/downloader/c:uVS	Ljava/lang/String;
    //   359: invokestatic 177	com/tencent/mm/plugin/wepkg/downloader/c:ahN	(Ljava/lang/String;)J
    //   362: lstore 5
    //   364: iconst_0
    //   365: istore 4
    //   367: goto -157 -> 210
    //   370: ldc 112
    //   372: ldc 193
    //   374: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   377: aload_0
    //   378: getfield 153	com/tencent/mm/plugin/wepkg/downloader/c:uVS	Ljava/lang/String;
    //   381: invokestatic 177	com/tencent/mm/plugin/wepkg/downloader/c:ahN	(Ljava/lang/String;)J
    //   384: lstore 5
    //   386: iconst_0
    //   387: istore 4
    //   389: goto -179 -> 210
    //   392: ldc 112
    //   394: ldc 195
    //   396: iconst_2
    //   397: anewarray 4	java/lang/Object
    //   400: dup
    //   401: iconst_0
    //   402: aload_0
    //   403: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   406: getfield 199	com/tencent/mm/plugin/wepkg/downloader/f:uWs	J
    //   409: invokestatic 202	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   412: aastore
    //   413: dup
    //   414: iconst_1
    //   415: lload 5
    //   417: invokestatic 202	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   420: aastore
    //   421: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   424: aload_0
    //   425: aload_0
    //   426: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   429: invokevirtual 206	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   432: putfield 208	com/tencent/mm/plugin/wepkg/downloader/c:uVT	Ljava/lang/String;
    //   435: aload_0
    //   436: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   439: invokevirtual 212	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   442: astore_3
    //   443: aload_0
    //   444: getfield 208	com/tencent/mm/plugin/wepkg/downloader/c:uVT	Ljava/lang/String;
    //   447: invokestatic 217	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   450: ifne +178 -> 628
    //   453: aload_0
    //   454: getfield 208	com/tencent/mm/plugin/wepkg/downloader/c:uVT	Ljava/lang/String;
    //   457: ldc 219
    //   459: invokevirtual 222	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   462: ifeq +166 -> 628
    //   465: ldc 112
    //   467: ldc 224
    //   469: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   472: new 226	java/util/zip/GZIPInputStream
    //   475: dup
    //   476: aload_3
    //   477: invokespecial 229	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   480: astore_3
    //   481: aload_0
    //   482: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   485: getfield 171	com/tencent/mm/plugin/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   488: astore 7
    //   490: aload_0
    //   491: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   494: getfield 119	com/tencent/mm/plugin/wepkg/downloader/f:uWo	Ljava/lang/String;
    //   497: astore_2
    //   498: aload_0
    //   499: getfield 163	com/tencent/mm/plugin/wepkg/downloader/c:uVV	Z
    //   502: ifeq +147 -> 649
    //   505: iload 4
    //   507: ifeq +142 -> 649
    //   510: ldc 112
    //   512: ldc 231
    //   514: iconst_2
    //   515: anewarray 4	java/lang/Object
    //   518: dup
    //   519: iconst_0
    //   520: aload_2
    //   521: aastore
    //   522: dup
    //   523: iconst_1
    //   524: aload 7
    //   526: aastore
    //   527: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   530: aload 7
    //   532: invokestatic 217	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   535: ifeq +119 -> 654
    //   538: new 236	java/io/FileNotFoundException
    //   541: astore 7
    //   543: aload 7
    //   545: ldc 238
    //   547: iconst_1
    //   548: anewarray 4	java/lang/Object
    //   551: dup
    //   552: iconst_0
    //   553: aload_2
    //   554: aastore
    //   555: invokestatic 242	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   558: invokespecial 245	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   561: ldc 101
    //   563: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   566: aload 7
    //   568: athrow
    //   569: astore 7
    //   571: aconst_null
    //   572: astore 8
    //   574: aload_3
    //   575: astore_2
    //   576: aload 8
    //   578: astore_3
    //   579: aload_0
    //   580: getfield 247	com/tencent/mm/plugin/wepkg/downloader/c:uVU	Z
    //   583: ifeq +237 -> 820
    //   586: aload_0
    //   587: sipush 1001
    //   590: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   593: ldc 112
    //   595: ldc 249
    //   597: iconst_1
    //   598: anewarray 4	java/lang/Object
    //   601: dup
    //   602: iconst_0
    //   603: aload 7
    //   605: invokevirtual 252	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   608: aastore
    //   609: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   612: aload_2
    //   613: invokestatic 133	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   616: aload_3
    //   617: invokestatic 133	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   620: ldc 101
    //   622: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   625: goto -522 -> 103
    //   628: new 256	java/io/BufferedInputStream
    //   631: dup
    //   632: aload_3
    //   633: invokespecial 257	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   636: astore_3
    //   637: goto -156 -> 481
    //   640: astore 7
    //   642: aconst_null
    //   643: astore_3
    //   644: aconst_null
    //   645: astore_2
    //   646: goto -67 -> 579
    //   649: iconst_0
    //   650: istore_1
    //   651: goto -141 -> 510
    //   654: new 259	java/io/FileOutputStream
    //   657: astore_2
    //   658: aload_2
    //   659: aload 7
    //   661: iload_1
    //   662: invokespecial 262	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   665: new 264	java/io/BufferedOutputStream
    //   668: dup
    //   669: aload_2
    //   670: invokespecial 267	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   673: astore_2
    //   674: ldc 112
    //   676: ldc_w 269
    //   679: iconst_3
    //   680: anewarray 4	java/lang/Object
    //   683: dup
    //   684: iconst_0
    //   685: aload_0
    //   686: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   689: getfield 119	com/tencent/mm/plugin/wepkg/downloader/f:uWo	Ljava/lang/String;
    //   692: aastore
    //   693: dup
    //   694: iconst_1
    //   695: aload_0
    //   696: getfield 163	com/tencent/mm/plugin/wepkg/downloader/c:uVV	Z
    //   699: invokestatic 184	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   702: aastore
    //   703: dup
    //   704: iconst_2
    //   705: iload 4
    //   707: invokestatic 184	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   710: aastore
    //   711: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   714: sipush 4096
    //   717: newarray byte
    //   719: astore 7
    //   721: iconst_0
    //   722: istore 9
    //   724: aload_3
    //   725: aload 7
    //   727: iconst_0
    //   728: sipush 4096
    //   731: invokevirtual 275	java/io/InputStream:read	([BII)I
    //   734: istore 10
    //   736: iload 10
    //   738: iconst_m1
    //   739: if_icmpeq +22 -> 761
    //   742: aload_2
    //   743: aload 7
    //   745: iconst_0
    //   746: iload 10
    //   748: invokevirtual 281	java/io/OutputStream:write	([BII)V
    //   751: iload 9
    //   753: iload 10
    //   755: iadd
    //   756: istore 9
    //   758: goto -34 -> 724
    //   761: ldc 112
    //   763: ldc_w 283
    //   766: iconst_2
    //   767: anewarray 4	java/lang/Object
    //   770: dup
    //   771: iconst_0
    //   772: aload_0
    //   773: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   776: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   779: aastore
    //   780: dup
    //   781: iconst_1
    //   782: iload 9
    //   784: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   787: aastore
    //   788: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   791: aload_2
    //   792: invokevirtual 289	java/io/OutputStream:flush	()V
    //   795: ldc 112
    //   797: ldc_w 291
    //   800: iconst_1
    //   801: anewarray 4	java/lang/Object
    //   804: dup
    //   805: iconst_0
    //   806: aload_0
    //   807: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   810: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   813: aastore
    //   814: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   817: goto -727 -> 90
    //   820: invokestatic 297	com/tencent/mm/kernel/g:Rg	()Lcom/tencent/mm/ai/p;
    //   823: invokevirtual 302	com/tencent/mm/ai/p:acS	()I
    //   826: ifne +39 -> 865
    //   829: aload_0
    //   830: sipush 1002
    //   833: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   836: goto -243 -> 593
    //   839: astore 8
    //   841: aload_2
    //   842: astore 7
    //   844: aload_3
    //   845: astore_2
    //   846: aload 8
    //   848: astore_3
    //   849: aload 7
    //   851: invokestatic 133	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   854: aload_2
    //   855: invokestatic 133	com/tencent/mm/pluginsdk/g/a/d/a:e	(Ljava/io/Closeable;)V
    //   858: ldc 101
    //   860: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   863: aload_3
    //   864: athrow
    //   865: sipush 1000
    //   868: istore 9
    //   870: aload 7
    //   872: instanceof 304
    //   875: ifeq +17 -> 892
    //   878: sipush 1013
    //   881: istore 9
    //   883: aload_0
    //   884: iload 9
    //   886: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   889: goto -296 -> 593
    //   892: aload 7
    //   894: instanceof 306
    //   897: ifeq +11 -> 908
    //   900: sipush 1003
    //   903: istore 9
    //   905: goto -22 -> 883
    //   908: aload 7
    //   910: instanceof 308
    //   913: ifeq +11 -> 924
    //   916: sipush 1004
    //   919: istore 9
    //   921: goto -38 -> 883
    //   924: aload 7
    //   926: instanceof 310
    //   929: ifeq +11 -> 940
    //   932: sipush 1005
    //   935: istore 9
    //   937: goto -54 -> 883
    //   940: aload 7
    //   942: instanceof 312
    //   945: ifeq +11 -> 956
    //   948: sipush 1006
    //   951: istore 9
    //   953: goto -70 -> 883
    //   956: aload 7
    //   958: instanceof 314
    //   961: ifeq +11 -> 972
    //   964: sipush 1007
    //   967: istore 9
    //   969: goto -86 -> 883
    //   972: aload 7
    //   974: instanceof 316
    //   977: istore 4
    //   979: iload 4
    //   981: ifeq -98 -> 883
    //   984: sipush 1008
    //   987: istore 9
    //   989: goto -106 -> 883
    //   992: astore_3
    //   993: aconst_null
    //   994: astore_2
    //   995: aconst_null
    //   996: astore 7
    //   998: goto -149 -> 849
    //   1001: astore_2
    //   1002: aconst_null
    //   1003: astore 8
    //   1005: aload_3
    //   1006: astore 7
    //   1008: aload_2
    //   1009: astore_3
    //   1010: aload 8
    //   1012: astore_2
    //   1013: goto -164 -> 849
    //   1016: astore 8
    //   1018: aload_3
    //   1019: astore 7
    //   1021: aload 8
    //   1023: astore_3
    //   1024: goto -175 -> 849
    //   1027: astore 7
    //   1029: aload_2
    //   1030: astore 8
    //   1032: aload_3
    //   1033: astore_2
    //   1034: aload 8
    //   1036: astore_3
    //   1037: goto -458 -> 579
    //   1040: goto -830 -> 210
    //
    // Exception table:
    //   from	to	target	type
    //   481	505	569	java/lang/Exception
    //   510	569	569	java/lang/Exception
    //   654	674	569	java/lang/Exception
    //   9	80	640	java/lang/Exception
    //   80	88	640	java/lang/Exception
    //   104	168	640	java/lang/Exception
    //   171	178	640	java/lang/Exception
    //   183	210	640	java/lang/Exception
    //   210	266	640	java/lang/Exception
    //   275	282	640	java/lang/Exception
    //   287	306	640	java/lang/Exception
    //   318	328	640	java/lang/Exception
    //   337	364	640	java/lang/Exception
    //   370	386	640	java/lang/Exception
    //   392	481	640	java/lang/Exception
    //   628	637	640	java/lang/Exception
    //   579	593	839	finally
    //   593	612	839	finally
    //   820	836	839	finally
    //   870	878	839	finally
    //   883	889	839	finally
    //   892	900	839	finally
    //   908	916	839	finally
    //   924	932	839	finally
    //   940	948	839	finally
    //   956	964	839	finally
    //   972	979	839	finally
    //   9	80	992	finally
    //   80	88	992	finally
    //   104	168	992	finally
    //   171	178	992	finally
    //   183	210	992	finally
    //   210	266	992	finally
    //   275	282	992	finally
    //   287	306	992	finally
    //   318	328	992	finally
    //   337	364	992	finally
    //   370	386	992	finally
    //   392	481	992	finally
    //   628	637	992	finally
    //   481	505	1001	finally
    //   510	569	1001	finally
    //   654	674	1001	finally
    //   674	721	1016	finally
    //   724	736	1016	finally
    //   742	751	1016	finally
    //   761	817	1016	finally
    //   674	721	1027	java/lang/Exception
    //   724	736	1027	java/lang/Exception
    //   742	751	1027	java/lang/Exception
    //   761	817	1027	java/lang/Exception
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc_w 318
    //   3: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   10: ifnonnull +10 -> 20
    //   13: ldc_w 318
    //   16: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: return
    //   20: aload_0
    //   21: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   24: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   27: ifnonnull +12 -> 39
    //   30: ldc_w 318
    //   33: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: goto -17 -> 19
    //   39: aload_0
    //   40: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   43: getfield 321	com/tencent/mm/plugin/wepkg/downloader/f:lqQ	I
    //   46: istore_1
    //   47: iconst_0
    //   48: istore_2
    //   49: new 323	java/net/URL
    //   52: astore_3
    //   53: aload_3
    //   54: aload_0
    //   55: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   58: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   61: invokespecial 324	java/net/URL:<init>	(Ljava/lang/String;)V
    //   64: aload_0
    //   65: aload_3
    //   66: invokevirtual 328	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   69: checkcast 105	java/net/HttpURLConnection
    //   72: putfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   75: aload_0
    //   76: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   79: aload_0
    //   80: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   83: getfield 331	com/tencent/mm/plugin/wepkg/downloader/f:uWu	I
    //   86: invokevirtual 334	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   89: aload_0
    //   90: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   93: aload_0
    //   94: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   97: getfield 337	com/tencent/mm/plugin/wepkg/downloader/f:uWv	I
    //   100: invokevirtual 340	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   103: aload_0
    //   104: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   107: iconst_0
    //   108: invokevirtual 344	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   111: aload_0
    //   112: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   115: iconst_1
    //   116: invokevirtual 347	java/net/HttpURLConnection:setDoInput	(Z)V
    //   119: aload_0
    //   120: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   123: ldc_w 349
    //   126: invokevirtual 352	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   129: aload_0
    //   130: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   133: iconst_0
    //   134: invokevirtual 355	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   137: aload_0
    //   138: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   141: iconst_1
    //   142: invokevirtual 358	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   145: aload_0
    //   146: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   149: ldc_w 360
    //   152: ldc_w 362
    //   155: invokevirtual 365	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   158: ldc_w 367
    //   161: invokestatic 372	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   164: astore 4
    //   166: aload 4
    //   168: invokestatic 217	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   171: ifne +15 -> 186
    //   174: aload_0
    //   175: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   178: ldc_w 374
    //   181: aload 4
    //   183: invokevirtual 365	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   186: aload_0
    //   187: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   190: getfield 377	com/tencent/mm/plugin/wepkg/downloader/f:uWw	Z
    //   193: ifeq +382 -> 575
    //   196: aload_0
    //   197: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   200: getfield 171	com/tencent/mm/plugin/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   203: invokestatic 380	com/tencent/mm/pluginsdk/g/a/d/a:ek	(Ljava/lang/String;)J
    //   206: lstore 5
    //   208: ldc 112
    //   210: ldc_w 382
    //   213: iconst_2
    //   214: anewarray 4	java/lang/Object
    //   217: dup
    //   218: iconst_0
    //   219: aload_0
    //   220: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   223: getfield 119	com/tencent/mm/plugin/wepkg/downloader/f:uWo	Ljava/lang/String;
    //   226: aastore
    //   227: dup
    //   228: iconst_1
    //   229: lload 5
    //   231: invokestatic 202	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   234: aastore
    //   235: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: lload 5
    //   240: lconst_0
    //   241: lcmp
    //   242: ifne +284 -> 526
    //   245: iconst_0
    //   246: istore 7
    //   248: aload_0
    //   249: iload 7
    //   251: putfield 163	com/tencent/mm/plugin/wepkg/downloader/c:uVV	Z
    //   254: ldc_w 384
    //   257: aload_3
    //   258: invokevirtual 387	java/net/URL:getProtocol	()Ljava/lang/String;
    //   261: invokevirtual 390	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   264: ifeq +88 -> 352
    //   267: aload_0
    //   268: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   271: getfield 331	com/tencent/mm/plugin/wepkg/downloader/f:uWu	I
    //   274: istore 8
    //   276: aload_0
    //   277: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   280: checkcast 392	javax/net/ssl/HttpsURLConnection
    //   283: astore 9
    //   285: ldc_w 394
    //   288: invokestatic 396	com/tencent/mm/plugin/wepkg/downloader/c:ahL	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   291: astore 4
    //   293: aload 4
    //   295: astore_3
    //   296: aload 4
    //   298: ifnonnull +23 -> 321
    //   301: ldc_w 398
    //   304: invokestatic 396	com/tencent/mm/plugin/wepkg/downloader/c:ahL	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   307: astore 4
    //   309: aload 4
    //   311: astore_3
    //   312: aload 4
    //   314: ifnonnull +7 -> 321
    //   317: invokestatic 402	javax/net/ssl/SSLContext:getDefault	()Ljavax/net/ssl/SSLContext;
    //   320: astore_3
    //   321: aload_3
    //   322: ifnull +453 -> 775
    //   325: new 404	java/security/SecureRandom
    //   328: astore 4
    //   330: aload 4
    //   332: invokespecial 405	java/security/SecureRandom:<init>	()V
    //   335: aload_3
    //   336: aconst_null
    //   337: aconst_null
    //   338: aload 4
    //   340: invokevirtual 409	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   343: aload 9
    //   345: aload_3
    //   346: invokevirtual 413	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   349: invokevirtual 417	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   352: aload_0
    //   353: invokespecial 419	com/tencent/mm/plugin/wepkg/downloader/c:dgv	()V
    //   356: ldc 112
    //   358: ldc_w 421
    //   361: iconst_1
    //   362: anewarray 4	java/lang/Object
    //   365: dup
    //   366: iconst_0
    //   367: aload_0
    //   368: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   371: invokestatic 122	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   374: aastore
    //   375: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   378: aload_0
    //   379: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   382: ifne +507 -> 889
    //   385: aload_0
    //   386: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   389: getfield 425	com/tencent/mm/plugin/wepkg/downloader/f:uWx	Lcom/tencent/mm/plugin/wepkg/downloader/a;
    //   392: ifnull +640 -> 1032
    //   395: aload_0
    //   396: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   399: getfield 425	com/tencent/mm/plugin/wepkg/downloader/f:uWx	Lcom/tencent/mm/plugin/wepkg/downloader/a;
    //   402: astore 4
    //   404: new 427	com/tencent/mm/plugin/wepkg/downloader/g
    //   407: astore_3
    //   408: aload_0
    //   409: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   412: astore 9
    //   414: aload_0
    //   415: getfield 34	com/tencent/mm/plugin/wepkg/downloader/c:uVW	Z
    //   418: ifeq +465 -> 883
    //   421: iconst_1
    //   422: istore 8
    //   424: aload_3
    //   425: aload 9
    //   427: iconst_1
    //   428: iconst_0
    //   429: iload 8
    //   431: iload_2
    //   432: invokespecial 430	com/tencent/mm/plugin/wepkg/downloader/g:<init>	(Lcom/tencent/mm/plugin/wepkg/downloader/f;IIII)V
    //   435: aload 4
    //   437: aload_3
    //   438: invokeinterface 436 2 0
    //   443: aload_0
    //   444: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   447: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   450: ldc_w 384
    //   453: invokevirtual 187	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   456: ifeq +61 -> 517
    //   459: aload_0
    //   460: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   463: sipush 1013
    //   466: if_icmpne +51 -> 517
    //   469: iload_2
    //   470: iload_1
    //   471: iconst_1
    //   472: isub
    //   473: if_icmplt +44 -> 517
    //   476: ldc 112
    //   478: ldc_w 438
    //   481: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   484: aload_0
    //   485: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   488: aload_0
    //   489: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   492: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   495: ldc_w 384
    //   498: ldc_w 440
    //   501: invokevirtual 444	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   504: putfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   507: aload_0
    //   508: iconst_0
    //   509: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   512: aload_0
    //   513: iconst_0
    //   514: putfield 34	com/tencent/mm/plugin/wepkg/downloader/c:uVW	Z
    //   517: ldc_w 318
    //   520: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   523: goto -504 -> 19
    //   526: aload_0
    //   527: getfield 103	com/tencent/mm/plugin/wepkg/downloader/c:uVQ	Ljava/net/HttpURLConnection;
    //   530: astore 9
    //   532: new 446	java/lang/StringBuilder
    //   535: astore 4
    //   537: aload 4
    //   539: ldc_w 448
    //   542: invokespecial 449	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   545: aload 9
    //   547: ldc_w 451
    //   550: aload 4
    //   552: lload 5
    //   554: invokevirtual 455	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   557: ldc_w 457
    //   560: invokevirtual 460	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   563: invokevirtual 463	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   566: invokevirtual 466	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   569: iconst_1
    //   570: istore 7
    //   572: goto -324 -> 248
    //   575: aload_0
    //   576: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   579: getfield 171	com/tencent/mm/plugin/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   582: invokestatic 175	com/tencent/mm/pluginsdk/g/a/d/a:ajj	(Ljava/lang/String;)Z
    //   585: pop
    //   586: goto -332 -> 254
    //   589: astore_3
    //   590: ldc 112
    //   592: ldc_w 468
    //   595: iconst_1
    //   596: anewarray 4	java/lang/Object
    //   599: dup
    //   600: iconst_0
    //   601: aload_3
    //   602: invokevirtual 252	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   605: aastore
    //   606: invokestatic 254	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   609: iload_2
    //   610: istore 8
    //   612: aload_0
    //   613: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   616: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   619: ldc_w 384
    //   622: invokevirtual 187	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   625: ifeq +70 -> 695
    //   628: iload_2
    //   629: istore 8
    //   631: aload_0
    //   632: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   635: sipush 1013
    //   638: if_icmpne +57 -> 695
    //   641: iload_2
    //   642: istore 8
    //   644: iload_2
    //   645: iload_1
    //   646: iconst_1
    //   647: isub
    //   648: if_icmplt +47 -> 695
    //   651: ldc 112
    //   653: ldc_w 438
    //   656: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   659: aload_0
    //   660: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   663: aload_0
    //   664: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   667: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   670: ldc_w 384
    //   673: ldc_w 440
    //   676: invokevirtual 444	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   679: putfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   682: aload_0
    //   683: iconst_0
    //   684: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   687: aload_0
    //   688: iconst_0
    //   689: putfield 34	com/tencent/mm/plugin/wepkg/downloader/c:uVW	Z
    //   692: iconst_m1
    //   693: istore 8
    //   695: iinc 8 1
    //   698: iload 8
    //   700: istore_2
    //   701: iload 8
    //   703: iload_1
    //   704: if_icmplt -655 -> 49
    //   707: aload_0
    //   708: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   711: getfield 425	com/tencent/mm/plugin/wepkg/downloader/f:uWx	Lcom/tencent/mm/plugin/wepkg/downloader/a;
    //   714: ifnull +51 -> 765
    //   717: aload_0
    //   718: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   721: getfield 425	com/tencent/mm/plugin/wepkg/downloader/f:uWx	Lcom/tencent/mm/plugin/wepkg/downloader/a;
    //   724: astore_3
    //   725: aload_0
    //   726: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   729: astore 4
    //   731: aload_0
    //   732: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   735: istore_1
    //   736: aload_0
    //   737: getfield 34	com/tencent/mm/plugin/wepkg/downloader/c:uVW	Z
    //   740: ifeq +381 -> 1121
    //   743: iconst_1
    //   744: istore_2
    //   745: aload_3
    //   746: new 427	com/tencent/mm/plugin/wepkg/downloader/g
    //   749: dup
    //   750: aload 4
    //   752: iconst_2
    //   753: iload_1
    //   754: iload_2
    //   755: iload 8
    //   757: invokespecial 430	com/tencent/mm/plugin/wepkg/downloader/g:<init>	(Lcom/tencent/mm/plugin/wepkg/downloader/f;IIII)V
    //   760: invokeinterface 436 2 0
    //   765: ldc_w 318
    //   768: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   771: goto -752 -> 19
    //   774: astore_3
    //   775: new 470	android/net/SSLSessionCache
    //   778: astore_3
    //   779: aload_3
    //   780: invokestatic 476	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   783: invokespecial 479	android/net/SSLSessionCache:<init>	(Landroid/content/Context;)V
    //   786: aload 9
    //   788: iload 8
    //   790: aload_3
    //   791: invokestatic 484	android/net/SSLCertificateSocketFactory:getDefault	(ILandroid/net/SSLSessionCache;)Ljavax/net/ssl/SSLSocketFactory;
    //   794: invokevirtual 417	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   797: goto -445 -> 352
    //   800: astore_3
    //   801: aload_0
    //   802: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   805: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   808: ldc_w 384
    //   811: invokevirtual 187	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   814: ifeq +61 -> 875
    //   817: aload_0
    //   818: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   821: sipush 1013
    //   824: if_icmpne +51 -> 875
    //   827: iload_2
    //   828: iload_1
    //   829: iconst_1
    //   830: isub
    //   831: if_icmplt +44 -> 875
    //   834: ldc 112
    //   836: ldc_w 438
    //   839: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   842: aload_0
    //   843: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   846: aload_0
    //   847: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   850: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   853: ldc_w 384
    //   856: ldc_w 440
    //   859: invokevirtual 444	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   862: putfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   865: aload_0
    //   866: iconst_0
    //   867: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   870: aload_0
    //   871: iconst_0
    //   872: putfield 34	com/tencent/mm/plugin/wepkg/downloader/c:uVW	Z
    //   875: ldc_w 318
    //   878: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   881: aload_3
    //   882: athrow
    //   883: iconst_0
    //   884: istore 8
    //   886: goto -462 -> 424
    //   889: aload_0
    //   890: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   893: sipush 1011
    //   896: if_icmpeq +47 -> 943
    //   899: aload_0
    //   900: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   903: sipush 1001
    //   906: if_icmpeq +37 -> 943
    //   909: aload_0
    //   910: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   913: sipush 1009
    //   916: if_icmpeq +27 -> 943
    //   919: aload_0
    //   920: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   923: sipush 1002
    //   926: if_icmpeq +17 -> 943
    //   929: aload_0
    //   930: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   933: istore 8
    //   935: iload 8
    //   937: sipush 1007
    //   940: if_icmpne +92 -> 1032
    //   943: iload_2
    //   944: istore 8
    //   946: aload_0
    //   947: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   950: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   953: ldc_w 384
    //   956: invokevirtual 187	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   959: ifeq -252 -> 707
    //   962: iload_2
    //   963: istore 8
    //   965: aload_0
    //   966: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   969: sipush 1013
    //   972: if_icmpne -265 -> 707
    //   975: iload_2
    //   976: istore 8
    //   978: iload_2
    //   979: iload_1
    //   980: iconst_1
    //   981: isub
    //   982: if_icmplt -275 -> 707
    //   985: ldc 112
    //   987: ldc_w 438
    //   990: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   993: aload_0
    //   994: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   997: aload_0
    //   998: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   1001: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1004: ldc_w 384
    //   1007: ldc_w 440
    //   1010: invokevirtual 444	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1013: putfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1016: aload_0
    //   1017: iconst_0
    //   1018: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   1021: aload_0
    //   1022: iconst_0
    //   1023: putfield 34	com/tencent/mm/plugin/wepkg/downloader/c:uVW	Z
    //   1026: iconst_m1
    //   1027: istore 8
    //   1029: goto -322 -> 707
    //   1032: iload_2
    //   1033: istore 8
    //   1035: aload_0
    //   1036: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   1039: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1042: ldc_w 384
    //   1045: invokevirtual 187	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1048: ifeq -353 -> 695
    //   1051: iload_2
    //   1052: istore 8
    //   1054: aload_0
    //   1055: getfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   1058: sipush 1013
    //   1061: if_icmpne -366 -> 695
    //   1064: iload_2
    //   1065: istore 8
    //   1067: iload_2
    //   1068: iload_1
    //   1069: iconst_1
    //   1070: isub
    //   1071: if_icmplt -376 -> 695
    //   1074: ldc 112
    //   1076: ldc_w 438
    //   1079: invokestatic 168	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1082: aload_0
    //   1083: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   1086: aload_0
    //   1087: getfield 36	com/tencent/mm/plugin/wepkg/downloader/c:uVO	Lcom/tencent/mm/plugin/wepkg/downloader/f;
    //   1090: getfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1093: ldc_w 384
    //   1096: ldc_w 440
    //   1099: invokevirtual 444	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1102: putfield 286	com/tencent/mm/plugin/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1105: aload_0
    //   1106: iconst_0
    //   1107: putfield 32	com/tencent/mm/plugin/wepkg/downloader/c:retCode	I
    //   1110: aload_0
    //   1111: iconst_0
    //   1112: putfield 34	com/tencent/mm/plugin/wepkg/downloader/c:uVW	Z
    //   1115: iconst_m1
    //   1116: istore 8
    //   1118: goto -423 -> 695
    //   1121: iconst_0
    //   1122: istore_2
    //   1123: goto -378 -> 745
    //   1126: astore_3
    //   1127: aload 4
    //   1129: astore_3
    //   1130: goto -809 -> 321
    //
    // Exception table:
    //   from	to	target	type
    //   49	186	589	java/lang/Exception
    //   186	238	589	java/lang/Exception
    //   248	254	589	java/lang/Exception
    //   254	293	589	java/lang/Exception
    //   301	309	589	java/lang/Exception
    //   352	421	589	java/lang/Exception
    //   424	443	589	java/lang/Exception
    //   526	569	589	java/lang/Exception
    //   575	586	589	java/lang/Exception
    //   775	797	589	java/lang/Exception
    //   889	935	589	java/lang/Exception
    //   325	352	774	java/lang/Exception
    //   49	186	800	finally
    //   186	238	800	finally
    //   248	254	800	finally
    //   254	293	800	finally
    //   301	309	800	finally
    //   317	321	800	finally
    //   325	352	800	finally
    //   352	421	800	finally
    //   424	443	800	finally
    //   526	569	800	finally
    //   575	586	800	finally
    //   590	609	800	finally
    //   775	797	800	finally
    //   889	935	800	finally
    //   317	321	1126	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.downloader.c
 * JD-Core Version:    0.6.2
 */