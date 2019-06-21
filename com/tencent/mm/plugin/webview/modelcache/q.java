package com.tencent.mm.plugin.webview.modelcache;

import android.net.Uri;
import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class q
{
  public static boolean Ed(String paramString)
  {
    AppMethodBeat.i(6867);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && ((URLUtil.isHttpsUrl(paramString)) || (URLUtil.isHttpUrl(paramString))))
    {
      bool = true;
      AppMethodBeat.o(6867);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(6867);
    }
  }

  public static int a(i parami)
  {
    AppMethodBeat.i(6875);
    int i;
    if (!bo.nullAsNil(parami.uIJ).equals("cache"))
    {
      AppMethodBeat.o(6875);
      i = -1;
    }
    while (true)
    {
      return i;
      if ((Boolean.parseBoolean((String)parami.puc.get("async"))) && (!bo.isNullOrNil((String)parami.puc.get("src"))))
      {
        i = 2;
        AppMethodBeat.o(6875);
      }
      else if (!bo.isNullOrNil((String)parami.puc.get("resourceList")))
      {
        i = 1;
        AppMethodBeat.o(6875);
      }
      else
      {
        AppMethodBeat.o(6875);
        i = -1;
      }
    }
  }

  public static String aeJ(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(6868);
    if (!Ed(paramString))
    {
      AppMethodBeat.o(6868);
      paramString = (String)localObject1;
    }
    while (true)
    {
      return paramString;
      Object localObject2 = paramString;
      Object localObject3 = paramString;
      try
      {
        Object localObject4 = new java/net/URI;
        localObject2 = paramString;
        localObject3 = paramString;
        ((URI)localObject4).<init>(paramString);
        localObject2 = paramString;
        localObject3 = paramString;
        String str1 = bo.nullAsNil(((URI)localObject4).getScheme()).toLowerCase();
        localObject2 = paramString;
        localObject3 = paramString;
        String str2 = bo.nullAsNil(((URI)localObject4).getHost()).toLowerCase();
        localObject2 = paramString;
        localObject3 = paramString;
        boolean bool = bo.isNullOrNil(str2);
        if (bool)
        {
          AppMethodBeat.o(6868);
          paramString = (String)localObject1;
        }
        else
        {
          localObject2 = paramString;
          localObject3 = paramString;
          int i;
          if (((URI)localObject4).getPort() == -1)
          {
            localObject2 = paramString;
            localObject3 = paramString;
            if (str1.equalsIgnoreCase("http"))
            {
              i = 80;
              label136: localObject2 = paramString;
              localObject3 = paramString;
              if (!bo.isNullOrNil(((URI)localObject4).getQuery()))
                break label348;
              localObject1 = "";
              label154: localObject2 = paramString;
              localObject3 = paramString;
              if (!bo.isNullOrNil(((URI)localObject4).getFragment()))
                break label386;
            }
          }
          for (Object localObject5 = ""; ; localObject5 = ((URI)localObject4).getFragment())
          {
            localObject2 = paramString;
            localObject3 = paramString;
            localObject4 = bo.nullAsNil(((URI)localObject4).getPath());
            localObject2 = paramString;
            localObject3 = paramString;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localObject2 = paramString;
            localObject3 = paramString;
            localStringBuilder.<init>();
            localObject2 = paramString;
            localObject3 = paramString;
            localObject1 = str1 + "://" + str2 + ":" + i + "/" + (String)localObject4 + (String)localObject1 + (String)localObject5;
            paramString = (String)localObject1;
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (((String)localObject1).endsWith("/"))
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramString = new java/lang/StringBuilder;
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramString.<init>();
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramString = (String)localObject1 + "/";
            }
            localObject2 = paramString;
            localObject3 = paramString;
            paramString = aeK(paramString);
            AppMethodBeat.o(6868);
            break;
            i = 443;
            break label136;
            localObject2 = paramString;
            localObject3 = paramString;
            i = ((URI)localObject4).getPort();
            break label136;
            label348: localObject2 = paramString;
            localObject3 = paramString;
            localObject1 = new java/lang/StringBuilder;
            localObject2 = paramString;
            localObject3 = paramString;
            ((StringBuilder)localObject1).<init>("?");
            localObject2 = paramString;
            localObject3 = paramString;
            localObject1 = ((URI)localObject4).getQuery();
            break label154;
            label386: localObject2 = paramString;
            localObject3 = paramString;
            localObject5 = new java/lang/StringBuilder;
            localObject2 = paramString;
            localObject3 = paramString;
            ((StringBuilder)localObject5).<init>("#");
            localObject2 = paramString;
            localObject3 = paramString;
          }
        }
      }
      catch (URISyntaxException localURISyntaxException)
      {
        paramString = (String)localObject2;
        ab.e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL URISyntaxException : %s", new Object[] { localURISyntaxException.getMessage() });
        AppMethodBeat.o(6868);
      }
      catch (Exception localException)
      {
        paramString = localURISyntaxException;
        ab.e("MicroMsg.WebViewCacheUtils", "getFormattedHttpURL normal : %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(6868);
      }
    }
  }

  private static String aeK(String paramString)
  {
    AppMethodBeat.i(6869);
    Uri localUri = Uri.parse(paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localUri.getScheme()).append("://");
    localStringBuilder.append(localUri.getHost()).append(":").append(localUri.getPort());
    if (bo.ek(localUri.getPathSegments()))
      localStringBuilder.append("/");
    while (true)
    {
      if (!bo.isNullOrNil(localUri.getQuery()))
        localStringBuilder.append("?").append(localUri.getQuery());
      if (!bo.isNullOrNil(localUri.getFragment()))
        localStringBuilder.append("#").append(localUri.getFragment());
      if (paramString.endsWith("/"))
        localStringBuilder.append("/");
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(6869);
      return paramString;
      Iterator localIterator = localUri.getPathSegments().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("/").append(str);
      }
    }
  }

  public static String aeL(String paramString)
  {
    AppMethodBeat.i(6870);
    paramString = aeJ(paramString);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(6870);
    }
    while (true)
    {
      return paramString;
      paramString = Uri.parse(paramString).getHost();
      AppMethodBeat.o(6870);
    }
  }

  public static String aeM(String paramString)
  {
    AppMethodBeat.i(6871);
    paramString = aeN(paramString);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(6871);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replaceAll("http://", "").replaceAll("https://", "");
      AppMethodBeat.o(6871);
    }
  }

  public static String aeN(String paramString)
  {
    AppMethodBeat.i(6872);
    Object localObject1 = aeJ(paramString);
    if (bo.isNullOrNil((String)localObject1))
    {
      ab.e("MicroMsg.WebViewCacheUtils", "evaluateResURLWithScheme, original url is invalid = %s", new Object[] { paramString });
      paramString = null;
      AppMethodBeat.o(6872);
    }
    while (true)
    {
      return paramString;
      Object localObject2 = Uri.parse((String)localObject1);
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(((Uri)localObject2).getScheme()).append("://").append(((Uri)localObject2).getHost()).append(":").append(((Uri)localObject2).getPort());
      if (!bo.ek(((Uri)localObject2).getPathSegments()))
      {
        localObject2 = ((Uri)localObject2).getPathSegments().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          ((StringBuilder)localObject1).append("/").append(bo.nullAsNil(str));
        }
      }
      if (paramString.endsWith("/"))
        ((StringBuilder)localObject1).append("/");
      paramString = ((StringBuilder)localObject1).toString();
      AppMethodBeat.o(6872);
    }
  }

  // ERROR //
  public static byte[] aeO(String paramString)
  {
    // Byte code:
    //   0: sipush 6873
    //   3: invokestatic 12	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 217	java/io/ByteArrayOutputStream
    //   9: astore_1
    //   10: aload_1
    //   11: invokespecial 218	java/io/ByteArrayOutputStream:<init>	()V
    //   14: new 220	java/net/URL
    //   17: astore_2
    //   18: aload_2
    //   19: aload_0
    //   20: invokespecial 221	java/net/URL:<init>	(Ljava/lang/String;)V
    //   23: aload_2
    //   24: invokevirtual 225	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   27: checkcast 227	java/net/HttpURLConnection
    //   30: astore_2
    //   31: aload_2
    //   32: ldc 229
    //   34: invokevirtual 232	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   37: ldc 147
    //   39: ldc 234
    //   41: iconst_3
    //   42: anewarray 4	java/lang/Object
    //   45: dup
    //   46: iconst_0
    //   47: aload_0
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: aload_2
    //   52: invokevirtual 237	java/net/HttpURLConnection:getResponseCode	()I
    //   55: invokestatic 243	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   58: aastore
    //   59: dup
    //   60: iconst_2
    //   61: aload_2
    //   62: invokevirtual 246	java/net/HttpURLConnection:getContentLength	()I
    //   65: invokestatic 243	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   68: aastore
    //   69: invokestatic 249	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   72: aload_2
    //   73: invokevirtual 253	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   76: astore_2
    //   77: aload_2
    //   78: ifnull +128 -> 206
    //   81: aload_1
    //   82: astore_3
    //   83: aload_2
    //   84: astore 4
    //   86: sipush 1024
    //   89: newarray byte
    //   91: astore 5
    //   93: aload_1
    //   94: astore_3
    //   95: aload_2
    //   96: astore 4
    //   98: aload_2
    //   99: aload 5
    //   101: invokevirtual 259	java/io/InputStream:read	([B)I
    //   104: istore 6
    //   106: iload 6
    //   108: iconst_m1
    //   109: if_icmpeq +66 -> 175
    //   112: aload_1
    //   113: astore_3
    //   114: aload_2
    //   115: astore 4
    //   117: aload_1
    //   118: aload 5
    //   120: iconst_0
    //   121: iload 6
    //   123: invokevirtual 263	java/io/ByteArrayOutputStream:write	([BII)V
    //   126: goto -33 -> 93
    //   129: astore 5
    //   131: aload_1
    //   132: astore_3
    //   133: aload_2
    //   134: astore 4
    //   136: ldc 147
    //   138: ldc_w 265
    //   141: iconst_2
    //   142: anewarray 4	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: aload_0
    //   148: aastore
    //   149: dup
    //   150: iconst_1
    //   151: aload 5
    //   153: aastore
    //   154: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload_2
    //   158: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   161: aload_1
    //   162: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   165: sipush 6873
    //   168: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: aconst_null
    //   172: astore_0
    //   173: aload_0
    //   174: areturn
    //   175: aload_1
    //   176: astore_3
    //   177: aload_2
    //   178: astore 4
    //   180: aload_1
    //   181: invokevirtual 273	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   184: astore 5
    //   186: aload 5
    //   188: astore_0
    //   189: aload_2
    //   190: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   193: aload_1
    //   194: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   197: sipush 6873
    //   200: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: goto -30 -> 173
    //   206: aload_2
    //   207: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   210: aload_1
    //   211: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   214: goto -49 -> 165
    //   217: astore_0
    //   218: aconst_null
    //   219: astore_1
    //   220: aconst_null
    //   221: astore 4
    //   223: aload 4
    //   225: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   228: aload_1
    //   229: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   232: sipush 6873
    //   235: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   238: aload_0
    //   239: athrow
    //   240: astore_0
    //   241: aconst_null
    //   242: astore 4
    //   244: goto -21 -> 223
    //   247: astore_0
    //   248: aload_3
    //   249: astore_1
    //   250: goto -27 -> 223
    //   253: astore 5
    //   255: aconst_null
    //   256: astore_1
    //   257: aconst_null
    //   258: astore_2
    //   259: goto -128 -> 131
    //   262: astore 5
    //   264: aconst_null
    //   265: astore_2
    //   266: goto -135 -> 131
    //
    // Exception table:
    //   from	to	target	type
    //   86	93	129	java/lang/Exception
    //   98	106	129	java/lang/Exception
    //   117	126	129	java/lang/Exception
    //   180	186	129	java/lang/Exception
    //   6	14	217	finally
    //   14	77	240	finally
    //   86	93	247	finally
    //   98	106	247	finally
    //   117	126	247	finally
    //   136	157	247	finally
    //   180	186	247	finally
    //   6	14	253	java/lang/Exception
    //   14	77	262	java/lang/Exception
  }

  // ERROR //
  public static String aeP(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 6874
    //   5: invokestatic 12	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokestatic 281	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   12: ifne +13 -> 25
    //   15: sipush 6874
    //   18: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_1
    //   22: astore_0
    //   23: aload_0
    //   24: areturn
    //   25: aload_0
    //   26: invokestatic 285	com/tencent/mm/vfs/e:asZ	(Ljava/lang/String;)J
    //   29: l2i
    //   30: istore_2
    //   31: aload_0
    //   32: invokestatic 289	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   35: astore_3
    //   36: aload_3
    //   37: astore 4
    //   39: aload_3
    //   40: iload_2
    //   41: invokestatic 294	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   44: astore 5
    //   46: aload 5
    //   48: astore_0
    //   49: aload_3
    //   50: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   53: sipush 6874
    //   56: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: goto -36 -> 23
    //   62: astore 5
    //   64: aconst_null
    //   65: astore_3
    //   66: aload_3
    //   67: astore 4
    //   69: ldc 147
    //   71: ldc_w 296
    //   74: iconst_2
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: aload_0
    //   81: aastore
    //   82: dup
    //   83: iconst_1
    //   84: aload 5
    //   86: aastore
    //   87: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   90: aload_3
    //   91: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   94: sipush 6874
    //   97: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_1
    //   101: astore_0
    //   102: goto -79 -> 23
    //   105: astore 5
    //   107: aconst_null
    //   108: astore_3
    //   109: aload_3
    //   110: astore 4
    //   112: ldc 147
    //   114: ldc_w 296
    //   117: iconst_2
    //   118: anewarray 4	java/lang/Object
    //   121: dup
    //   122: iconst_0
    //   123: aload_0
    //   124: aastore
    //   125: dup
    //   126: iconst_1
    //   127: aload 5
    //   129: aastore
    //   130: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: aload_3
    //   134: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   137: sipush 6874
    //   140: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aload_1
    //   144: astore_0
    //   145: goto -122 -> 23
    //   148: astore_0
    //   149: aconst_null
    //   150: astore 4
    //   152: aload 4
    //   154: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   157: sipush 6874
    //   160: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: aload_0
    //   164: athrow
    //   165: astore_0
    //   166: goto -14 -> 152
    //   169: astore 5
    //   171: goto -62 -> 109
    //   174: astore 5
    //   176: goto -110 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   25	36	62	java/io/FileNotFoundException
    //   25	36	105	java/lang/Exception
    //   25	36	148	finally
    //   39	46	165	finally
    //   69	90	165	finally
    //   112	133	165	finally
    //   39	46	169	java/lang/Exception
    //   39	46	174	java/io/FileNotFoundException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.q
 * JD-Core Version:    0.6.2
 */