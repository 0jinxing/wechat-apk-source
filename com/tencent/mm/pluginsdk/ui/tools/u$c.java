package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class u$c
  implements az.a
{
  private static Pattern vvU;
  private static Pattern vvV;
  private Context context;
  private String ffl;
  private String imagePath;
  private boolean kuU;
  private int opType;
  private String vvW;
  private String vvX;
  private u.a vvY;

  static
  {
    AppMethodBeat.i(80466);
    vvU = Pattern.compile("image/[A-Za-z0-9]+");
    vvV = Pattern.compile("filename=[A-Za-z0-9@.]+.[A-Za-z0-9]+");
    AppMethodBeat.o(80466);
  }

  public u$c(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    this(paramContext, paramString1, paramString2, paramBoolean, 0, null);
  }

  public u$c(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, int paramInt, u.a parama)
  {
    this.context = paramContext;
    this.ffl = paramString1;
    this.vvX = paramString2;
    this.kuU = paramBoolean;
    this.opType = paramInt;
    this.vvY = parama;
  }

  private void a(String paramString1, String paramString2, InputStream paramInputStream)
  {
    AppMethodBeat.i(80464);
    ab.i("MicroMsg.WebViewUtil", "contentType = %s, dispositionType = %s", new Object[] { paramString1, paramString2 });
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (!bo.isNullOrNil(paramString1))
    {
      paramString1 = vvU.matcher(paramString1);
      localObject2 = localObject1;
      if (paramString1.find())
        localObject2 = paramString1.group().substring(paramString1.group().lastIndexOf('/') + 1);
    }
    paramString1 = (String)localObject2;
    if (bo.isNullOrNil((String)localObject2))
    {
      paramString1 = (String)localObject2;
      if (!bo.isNullOrNil(paramString2))
      {
        paramString2 = vvV.matcher(paramString2);
        paramString1 = (String)localObject2;
        if (paramString2.find())
          paramString1 = paramString2.group().substring(paramString2.group().lastIndexOf('.') + 1);
      }
    }
    paramString2 = paramString1;
    int i;
    if (bo.isNullOrNil(paramString1))
    {
      paramString1 = new s(this.ffl);
      i = paramString1.mPath.lastIndexOf('.');
      if (i != -1)
        break label226;
    }
    label226: for (paramString2 = "jpg"; ; paramString2 = paramString1.mPath.substring(i + 1))
    {
      this.imagePath = n.RL(paramString2);
      paramString2 = new FileOutputStream(this.imagePath);
      paramString1 = new byte[8192];
      while (true)
      {
        i = paramInputStream.read(paramString1);
        if (i == -1)
          break;
        paramString2.write(paramString1, 0, i);
      }
    }
    try
    {
      paramString2.flush();
      paramString2.close();
      if (this.opType == 0)
      {
        this.vvW = this.context.getString(2131298807, new Object[] { n.dlz() });
        n.a(this.imagePath, this.context);
      }
      AppMethodBeat.o(80464);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
        ab.e("MicroMsg.WebViewUtil", "close os failed : %s", new Object[] { paramString1.getMessage() });
    }
  }

  private static void a(HttpURLConnection paramHttpURLConnection, InputStream paramInputStream)
  {
    AppMethodBeat.i(80463);
    if (paramHttpURLConnection != null)
      paramHttpURLConnection.disconnect();
    if (paramInputStream != null);
    while (true)
    {
      try
      {
        paramInputStream.close();
        AppMethodBeat.o(80463);
        return;
      }
      catch (Exception paramHttpURLConnection)
      {
        ab.printErrStackTrace("MicroMsg.WebViewUtil", paramHttpURLConnection, "", new Object[0]);
      }
      AppMethodBeat.o(80463);
    }
  }

  // ERROR //
  private void dlF()
  {
    // Byte code:
    //   0: ldc 191
    //   2: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 193	java/net/URL
    //   8: astore_1
    //   9: aload_1
    //   10: aload_0
    //   11: getfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   14: invokespecial 194	java/net/URL:<init>	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: invokevirtual 198	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   21: checkcast 179	java/net/HttpURLConnection
    //   24: astore_1
    //   25: aload_1
    //   26: ldc 200
    //   28: invokevirtual 203	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   31: aload_1
    //   32: ldc 205
    //   34: aload_0
    //   35: getfield 65	com/tencent/mm/pluginsdk/ui/tools/u$c:vvX	Ljava/lang/String;
    //   38: invokevirtual 209	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: aload_1
    //   42: iconst_1
    //   43: invokevirtual 213	java/net/HttpURLConnection:setAllowUserInteraction	(Z)V
    //   46: aload_1
    //   47: invokevirtual 217	java/net/HttpURLConnection:getResponseCode	()I
    //   50: istore_2
    //   51: iload_2
    //   52: sipush 200
    //   55: if_icmpeq +110 -> 165
    //   58: iload_2
    //   59: sipush 301
    //   62: if_icmpeq +10 -> 72
    //   65: iload_2
    //   66: sipush 302
    //   69: if_icmpne +70 -> 139
    //   72: aload_1
    //   73: ldc 219
    //   75: invokevirtual 222	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   78: astore_3
    //   79: aload_3
    //   80: astore 4
    //   82: aload_3
    //   83: ifnonnull +11 -> 94
    //   86: aload_1
    //   87: ldc 224
    //   89: invokevirtual 222	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   92: astore 4
    //   94: ldc 78
    //   96: ldc 226
    //   98: iconst_1
    //   99: anewarray 4	java/lang/Object
    //   102: dup
    //   103: iconst_0
    //   104: aload 4
    //   106: aastore
    //   107: invokestatic 85	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload 4
    //   112: invokestatic 91	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   115: ifne +24 -> 139
    //   118: aload_0
    //   119: aload 4
    //   121: putfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   124: aload_0
    //   125: invokespecial 228	com/tencent/mm/pluginsdk/ui/tools/u$c:dlF	()V
    //   128: aload_1
    //   129: aconst_null
    //   130: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   133: ldc 191
    //   135: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: return
    //   139: aload_0
    //   140: aload_0
    //   141: getfield 61	com/tencent/mm/pluginsdk/ui/tools/u$c:context	Landroid/content/Context;
    //   144: ldc 231
    //   146: invokevirtual 233	android/content/Context:getString	(I)Ljava/lang/String;
    //   149: putfield 164	com/tencent/mm/pluginsdk/ui/tools/u$c:vvW	Ljava/lang/String;
    //   152: aload_1
    //   153: aconst_null
    //   154: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   157: ldc 191
    //   159: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: goto -24 -> 138
    //   165: aload_1
    //   166: invokevirtual 236	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   169: astore_3
    //   170: aload_1
    //   171: invokevirtual 240	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   174: astore 4
    //   176: aload_0
    //   177: aload_3
    //   178: aload_1
    //   179: ldc 242
    //   181: invokevirtual 222	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   184: aload 4
    //   186: invokespecial 244	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    //   189: aload_1
    //   190: aload 4
    //   192: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   195: ldc 191
    //   197: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: goto -62 -> 138
    //   203: astore_3
    //   204: aconst_null
    //   205: astore 4
    //   207: aconst_null
    //   208: astore_1
    //   209: ldc 78
    //   211: ldc 246
    //   213: iconst_1
    //   214: anewarray 4	java/lang/Object
    //   217: dup
    //   218: iconst_0
    //   219: aload_3
    //   220: invokevirtual 172	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   223: aastore
    //   224: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   227: aload_1
    //   228: aload 4
    //   230: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   233: ldc 191
    //   235: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: goto -100 -> 138
    //   241: astore_3
    //   242: aconst_null
    //   243: astore 4
    //   245: aconst_null
    //   246: astore_1
    //   247: aload_1
    //   248: aload 4
    //   250: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   253: ldc 191
    //   255: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   258: aload_3
    //   259: athrow
    //   260: astore_3
    //   261: aconst_null
    //   262: astore 4
    //   264: goto -17 -> 247
    //   267: astore_3
    //   268: goto -21 -> 247
    //   271: astore_3
    //   272: goto -25 -> 247
    //   275: astore_3
    //   276: aconst_null
    //   277: astore 4
    //   279: goto -70 -> 209
    //   282: astore_3
    //   283: goto -74 -> 209
    //
    // Exception table:
    //   from	to	target	type
    //   5	25	203	java/lang/Exception
    //   5	25	241	finally
    //   25	51	260	finally
    //   72	79	260	finally
    //   86	94	260	finally
    //   94	128	260	finally
    //   139	152	260	finally
    //   165	176	260	finally
    //   176	189	267	finally
    //   209	227	271	finally
    //   25	51	275	java/lang/Exception
    //   72	79	275	java/lang/Exception
    //   86	94	275	java/lang/Exception
    //   94	128	275	java/lang/Exception
    //   139	152	275	java/lang/Exception
    //   165	176	275	java/lang/Exception
    //   176	189	282	java/lang/Exception
  }

  // ERROR //
  public final boolean acf()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: ldc 248
    //   8: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_0
    //   12: getfield 67	com/tencent/mm/pluginsdk/ui/tools/u$c:kuU	Z
    //   15: ifne +25 -> 40
    //   18: aload_0
    //   19: aload_0
    //   20: getfield 61	com/tencent/mm/pluginsdk/ui/tools/u$c:context	Landroid/content/Context;
    //   23: ldc 249
    //   25: invokevirtual 233	android/content/Context:getString	(I)Ljava/lang/String;
    //   28: putfield 164	com/tencent/mm/pluginsdk/ui/tools/u$c:vvW	Ljava/lang/String;
    //   31: ldc 248
    //   33: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: iconst_1
    //   37: istore_3
    //   38: iload_3
    //   39: ireturn
    //   40: aload_0
    //   41: getfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   44: invokestatic 91	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   47: ifeq +11 -> 58
    //   50: ldc 248
    //   52: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   55: goto -17 -> 38
    //   58: aload_0
    //   59: getfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   62: invokestatic 254	android/webkit/URLUtil:isDataUrl	(Ljava/lang/String;)Z
    //   65: ifeq +293 -> 358
    //   68: aload_0
    //   69: ldc 125
    //   71: invokestatic 131	com/tencent/mm/pluginsdk/ui/tools/n:RL	(Ljava/lang/String;)Ljava/lang/String;
    //   74: putfield 133	com/tencent/mm/pluginsdk/ui/tools/u$c:imagePath	Ljava/lang/String;
    //   77: aload_1
    //   78: astore 4
    //   80: aload_0
    //   81: getfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   84: ldc_w 256
    //   87: invokevirtual 260	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   90: istore 5
    //   92: iload 5
    //   94: ifle +22 -> 116
    //   97: aload_1
    //   98: astore 4
    //   100: aload_0
    //   101: aload_0
    //   102: getfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   105: iload 5
    //   107: bipush 7
    //   109: iadd
    //   110: invokevirtual 115	java/lang/String:substring	(I)Ljava/lang/String;
    //   113: putfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   116: aload_1
    //   117: astore 4
    //   119: new 135	java/io/FileOutputStream
    //   122: astore 6
    //   124: aload_1
    //   125: astore 4
    //   127: aload 6
    //   129: aload_0
    //   130: getfield 133	com/tencent/mm/pluginsdk/ui/tools/u$c:imagePath	Ljava/lang/String;
    //   133: invokespecial 136	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   136: aload_0
    //   137: getfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   140: iconst_0
    //   141: invokestatic 266	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   144: astore 4
    //   146: aload 4
    //   148: ifnull +10 -> 158
    //   151: aload 6
    //   153: aload 4
    //   155: invokevirtual 269	java/io/FileOutputStream:write	([B)V
    //   158: aload 6
    //   160: invokevirtual 149	java/io/FileOutputStream:flush	()V
    //   163: aload 6
    //   165: invokevirtual 152	java/io/FileOutputStream:close	()V
    //   168: aload_0
    //   169: aload_0
    //   170: getfield 61	com/tencent/mm/pluginsdk/ui/tools/u$c:context	Landroid/content/Context;
    //   173: ldc 153
    //   175: iconst_1
    //   176: anewarray 4	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: invokestatic 156	com/tencent/mm/pluginsdk/ui/tools/n:dlz	()Ljava/lang/String;
    //   184: aastore
    //   185: invokevirtual 162	android/content/Context:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   188: putfield 164	com/tencent/mm/pluginsdk/ui/tools/u$c:vvW	Ljava/lang/String;
    //   191: aload_0
    //   192: getfield 133	com/tencent/mm/pluginsdk/ui/tools/u$c:imagePath	Ljava/lang/String;
    //   195: aload_0
    //   196: getfield 61	com/tencent/mm/pluginsdk/ui/tools/u$c:context	Landroid/content/Context;
    //   199: invokestatic 167	com/tencent/mm/pluginsdk/ui/tools/n:a	(Ljava/lang/String;Landroid/content/Context;)V
    //   202: aload 6
    //   204: invokevirtual 152	java/io/FileOutputStream:close	()V
    //   207: ldc 248
    //   209: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: iconst_1
    //   213: istore_3
    //   214: goto -176 -> 38
    //   217: astore 4
    //   219: ldc 78
    //   221: ldc_w 271
    //   224: iconst_1
    //   225: anewarray 4	java/lang/Object
    //   228: dup
    //   229: iconst_0
    //   230: aload 4
    //   232: invokevirtual 172	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   235: aastore
    //   236: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: goto -32 -> 207
    //   242: astore_1
    //   243: aload_2
    //   244: astore 6
    //   246: aload 6
    //   248: astore 4
    //   250: ldc 78
    //   252: ldc_w 273
    //   255: iconst_1
    //   256: anewarray 4	java/lang/Object
    //   259: dup
    //   260: iconst_0
    //   261: aload_1
    //   262: invokevirtual 172	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   265: aastore
    //   266: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   269: aload 6
    //   271: ifnull -64 -> 207
    //   274: aload 6
    //   276: invokevirtual 152	java/io/FileOutputStream:close	()V
    //   279: goto -72 -> 207
    //   282: astore 4
    //   284: ldc 78
    //   286: ldc_w 271
    //   289: iconst_1
    //   290: anewarray 4	java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload 4
    //   297: invokevirtual 172	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   300: aastore
    //   301: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   304: goto -97 -> 207
    //   307: astore_1
    //   308: aload 4
    //   310: astore 6
    //   312: aload_1
    //   313: astore 4
    //   315: aload 6
    //   317: ifnull +8 -> 325
    //   320: aload 6
    //   322: invokevirtual 152	java/io/FileOutputStream:close	()V
    //   325: ldc 248
    //   327: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   330: aload 4
    //   332: athrow
    //   333: astore 6
    //   335: ldc 78
    //   337: ldc_w 271
    //   340: iconst_1
    //   341: anewarray 4	java/lang/Object
    //   344: dup
    //   345: iconst_0
    //   346: aload 6
    //   348: invokevirtual 172	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   351: aastore
    //   352: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   355: goto -30 -> 325
    //   358: aload_0
    //   359: getfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   362: invokestatic 276	android/webkit/URLUtil:isHttpsUrl	(Ljava/lang/String;)Z
    //   365: ifeq +265 -> 630
    //   368: new 193	java/net/URL
    //   371: astore 4
    //   373: aload 4
    //   375: aload_0
    //   376: getfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   379: invokespecial 194	java/net/URL:<init>	(Ljava/lang/String;)V
    //   382: aload 4
    //   384: invokevirtual 198	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   387: checkcast 278	javax/net/ssl/HttpsURLConnection
    //   390: astore 4
    //   392: aload 4
    //   394: ldc 200
    //   396: invokevirtual 279	javax/net/ssl/HttpsURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   399: aload 4
    //   401: ldc 205
    //   403: aload_0
    //   404: getfield 65	com/tencent/mm/pluginsdk/ui/tools/u$c:vvX	Ljava/lang/String;
    //   407: invokevirtual 280	javax/net/ssl/HttpsURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   410: aload 4
    //   412: iconst_1
    //   413: invokevirtual 281	javax/net/ssl/HttpsURLConnection:setAllowUserInteraction	(Z)V
    //   416: aload 4
    //   418: invokevirtual 282	javax/net/ssl/HttpsURLConnection:getResponseCode	()I
    //   421: istore 5
    //   423: iload 5
    //   425: sipush 200
    //   428: if_icmpeq +108 -> 536
    //   431: iload 5
    //   433: sipush 301
    //   436: if_icmpeq +11 -> 447
    //   439: iload 5
    //   441: sipush 302
    //   444: if_icmpne +70 -> 514
    //   447: aload 4
    //   449: ldc 219
    //   451: invokevirtual 283	javax/net/ssl/HttpsURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   454: astore_1
    //   455: aload_1
    //   456: astore 6
    //   458: aload_1
    //   459: ifnonnull +12 -> 471
    //   462: aload 4
    //   464: ldc 224
    //   466: invokevirtual 283	javax/net/ssl/HttpsURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   469: astore 6
    //   471: ldc 78
    //   473: ldc 226
    //   475: iconst_1
    //   476: anewarray 4	java/lang/Object
    //   479: dup
    //   480: iconst_0
    //   481: aload 6
    //   483: aastore
    //   484: invokestatic 85	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   487: aload 6
    //   489: invokestatic 91	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   492: ifne +22 -> 514
    //   495: aload_0
    //   496: aload 6
    //   498: putfield 63	com/tencent/mm/pluginsdk/ui/tools/u$c:ffl	Ljava/lang/String;
    //   501: aload_0
    //   502: invokespecial 228	com/tencent/mm/pluginsdk/ui/tools/u$c:dlF	()V
    //   505: aload 4
    //   507: aconst_null
    //   508: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   511: goto -304 -> 207
    //   514: aload_0
    //   515: aload_0
    //   516: getfield 61	com/tencent/mm/pluginsdk/ui/tools/u$c:context	Landroid/content/Context;
    //   519: ldc 231
    //   521: invokevirtual 233	android/content/Context:getString	(I)Ljava/lang/String;
    //   524: putfield 164	com/tencent/mm/pluginsdk/ui/tools/u$c:vvW	Ljava/lang/String;
    //   527: aload 4
    //   529: aconst_null
    //   530: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   533: goto -326 -> 207
    //   536: aload 4
    //   538: invokevirtual 284	javax/net/ssl/HttpsURLConnection:getContentType	()Ljava/lang/String;
    //   541: astore_1
    //   542: aload 4
    //   544: invokevirtual 285	javax/net/ssl/HttpsURLConnection:getInputStream	()Ljava/io/InputStream;
    //   547: astore 6
    //   549: aload_0
    //   550: aload_1
    //   551: aload 4
    //   553: ldc 242
    //   555: invokevirtual 283	javax/net/ssl/HttpsURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   558: aload 6
    //   560: invokespecial 244	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    //   563: aload 4
    //   565: aload 6
    //   567: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   570: goto -363 -> 207
    //   573: astore 4
    //   575: aconst_null
    //   576: astore 6
    //   578: aconst_null
    //   579: astore_1
    //   580: ldc 78
    //   582: ldc_w 287
    //   585: iconst_1
    //   586: anewarray 4	java/lang/Object
    //   589: dup
    //   590: iconst_0
    //   591: aload 4
    //   593: invokevirtual 172	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   596: aastore
    //   597: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   600: aload_1
    //   601: aload 6
    //   603: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   606: goto -399 -> 207
    //   609: astore 4
    //   611: aconst_null
    //   612: astore 6
    //   614: aconst_null
    //   615: astore_1
    //   616: aload_1
    //   617: aload 6
    //   619: invokestatic 230	com/tencent/mm/pluginsdk/ui/tools/u$c:a	(Ljava/net/HttpURLConnection;Ljava/io/InputStream;)V
    //   622: ldc 248
    //   624: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   627: aload 4
    //   629: athrow
    //   630: aload_0
    //   631: invokespecial 228	com/tencent/mm/pluginsdk/ui/tools/u$c:dlF	()V
    //   634: goto -427 -> 207
    //   637: astore 6
    //   639: aconst_null
    //   640: astore_2
    //   641: aload 4
    //   643: astore_1
    //   644: aload 6
    //   646: astore 4
    //   648: aload_2
    //   649: astore 6
    //   651: goto -35 -> 616
    //   654: astore_1
    //   655: aload 4
    //   657: astore_2
    //   658: aload_1
    //   659: astore 4
    //   661: aload_2
    //   662: astore_1
    //   663: goto -47 -> 616
    //   666: astore 4
    //   668: goto -52 -> 616
    //   671: astore 6
    //   673: aconst_null
    //   674: astore_2
    //   675: aload 4
    //   677: astore_1
    //   678: aload 6
    //   680: astore 4
    //   682: aload_2
    //   683: astore 6
    //   685: goto -105 -> 580
    //   688: astore_1
    //   689: aload 4
    //   691: astore_2
    //   692: aload_1
    //   693: astore 4
    //   695: aload_2
    //   696: astore_1
    //   697: goto -117 -> 580
    //   700: astore 4
    //   702: goto -387 -> 315
    //   705: astore_1
    //   706: goto -460 -> 246
    //
    // Exception table:
    //   from	to	target	type
    //   202	207	217	java/lang/Exception
    //   80	92	242	java/lang/Exception
    //   100	116	242	java/lang/Exception
    //   119	124	242	java/lang/Exception
    //   127	136	242	java/lang/Exception
    //   274	279	282	java/lang/Exception
    //   80	92	307	finally
    //   100	116	307	finally
    //   119	124	307	finally
    //   127	136	307	finally
    //   250	269	307	finally
    //   320	325	333	java/lang/Exception
    //   368	392	573	java/lang/Exception
    //   368	392	609	finally
    //   392	423	637	finally
    //   447	455	637	finally
    //   462	471	637	finally
    //   471	505	637	finally
    //   514	527	637	finally
    //   536	549	637	finally
    //   549	563	654	finally
    //   580	600	666	finally
    //   392	423	671	java/lang/Exception
    //   447	455	671	java/lang/Exception
    //   462	471	671	java/lang/Exception
    //   471	505	671	java/lang/Exception
    //   514	527	671	java/lang/Exception
    //   536	549	671	java/lang/Exception
    //   549	563	688	java/lang/Exception
    //   136	146	700	finally
    //   151	158	700	finally
    //   158	202	700	finally
    //   136	146	705	java/lang/Exception
    //   151	158	705	java/lang/Exception
    //   158	202	705	java/lang/Exception
  }

  public final boolean acg()
  {
    AppMethodBeat.i(80461);
    if (1 == this.opType)
    {
      this.vvY.BX(this.imagePath);
      AppMethodBeat.o(80461);
      return true;
    }
    if (!bo.isNullOrNil(this.vvW))
      Toast.makeText(this.context, this.vvW, 1).show();
    while (true)
    {
      AppMethodBeat.o(80461);
      break;
      Toast.makeText(this.context, this.context.getString(2131305719), 1).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.u.c
 * JD-Core Version:    0.6.2
 */