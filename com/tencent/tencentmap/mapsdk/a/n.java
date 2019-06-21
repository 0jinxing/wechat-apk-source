package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ho;
import com.tencent.tencentmap.mapsdk.maps.a.hq;
import com.tencent.tencentmap.mapsdk.maps.a.hr;
import com.tencent.tencentmap.mapsdk.maps.a.ic;
import com.tencent.tencentmap.mapsdk.maps.a.k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public class n
{
  private WeakReference<m> a;
  private String b;

  private List<hq> a(ho paramho)
  {
    Object localObject1 = null;
    AppMethodBeat.i(98250);
    try
    {
      Object localObject2 = "https://vectorsdk.map.qq.com".concat(String.valueOf(ic.a(this.b)));
      paramho = ds.a().a((String)localObject2, "androidsdk", paramho.toByteArray("UTF-8"));
      if ((paramho == null) || (paramho.a == null))
      {
        a(1, null);
        AppMethodBeat.o(98250);
        paramho = localObject1;
      }
      while (true)
      {
        return paramho;
        localObject2 = paramho.a;
        paramho = new com/tencent/tencentmap/mapsdk/maps/a/k;
        paramho.<init>((byte[])localObject2);
        paramho.a("UTF-8");
        localObject2 = new com/tencent/tencentmap/mapsdk/maps/a/hr;
        ((hr)localObject2).<init>();
        ((hr)localObject2).readFrom(paramho);
        if (((hr)localObject2).a == 0)
        {
          paramho = ((hr)localObject2).b;
          AppMethodBeat.o(98250);
        }
        else
        {
          a(2, null);
          label125: AppMethodBeat.o(98250);
          paramho = localObject1;
        }
      }
    }
    catch (Exception paramho)
    {
      break label125;
    }
  }

  private void a(int paramInt, hq paramhq)
  {
    AppMethodBeat.i(98252);
    if ((this.a != null) && (this.a.get() != null))
      ((m)this.a.get()).onResult(paramInt, paramhq);
    AppMethodBeat.o(98252);
  }

  // ERROR //
  private void a(hq paramhq, String paramString)
  {
    // Byte code:
    //   0: ldc 111
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: getfield 115	com/tencent/tencentmap/mapsdk/maps/a/hq:b	I
    //   9: ifne +206 -> 215
    //   12: aload_1
    //   13: getfield 118	com/tencent/tencentmap/mapsdk/maps/a/hq:d	I
    //   16: iconst_1
    //   17: if_icmpne +184 -> 201
    //   20: new 120	java/net/URL
    //   23: astore_3
    //   24: aload_3
    //   25: aload_1
    //   26: getfield 123	com/tencent/tencentmap/mapsdk/maps/a/hq:e	Ljava/lang/String;
    //   29: invokespecial 126	java/net/URL:<init>	(Ljava/lang/String;)V
    //   32: aload_3
    //   33: invokevirtual 130	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   36: checkcast 132	java/net/HttpURLConnection
    //   39: astore 4
    //   41: aload 4
    //   43: invokevirtual 136	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   46: astore_3
    //   47: new 138	java/io/File
    //   50: astore 5
    //   52: new 140	java/lang/StringBuilder
    //   55: astore 6
    //   57: aload 6
    //   59: invokespecial 141	java/lang/StringBuilder:<init>	()V
    //   62: aload 5
    //   64: aload 6
    //   66: aload_2
    //   67: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: getstatic 148	java/io/File:separator	Ljava/lang/String;
    //   73: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: aload_1
    //   77: getfield 150	com/tencent/tencentmap/mapsdk/maps/a/hq:a	Ljava/lang/String;
    //   80: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokespecial 155	java/io/File:<init>	(Ljava/lang/String;)V
    //   89: aload 5
    //   91: invokevirtual 159	java/io/File:exists	()Z
    //   94: ifne +24 -> 118
    //   97: aload 5
    //   99: invokevirtual 163	java/io/File:getParentFile	()Ljava/io/File;
    //   102: astore_2
    //   103: aload_2
    //   104: ifnull +8 -> 112
    //   107: aload_2
    //   108: invokevirtual 166	java/io/File:mkdirs	()Z
    //   111: pop
    //   112: aload 5
    //   114: invokevirtual 169	java/io/File:createNewFile	()Z
    //   117: pop
    //   118: new 171	java/io/FileOutputStream
    //   121: astore_2
    //   122: aload_2
    //   123: aload 5
    //   125: iconst_0
    //   126: invokespecial 174	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   129: aload_3
    //   130: aload_2
    //   131: invokestatic 179	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   134: pop2
    //   135: aload 4
    //   137: invokevirtual 182	java/net/HttpURLConnection:disconnect	()V
    //   140: aload_0
    //   141: iconst_0
    //   142: aload_1
    //   143: invokespecial 68	com/tencent/tencentmap/mapsdk/a/n:a	(ILcom/tencent/tencentmap/mapsdk/maps/a/hq;)V
    //   146: aload_3
    //   147: invokestatic 185	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   150: aload_2
    //   151: invokestatic 185	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   154: ldc 111
    //   156: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: return
    //   160: astore_1
    //   161: aconst_null
    //   162: astore_1
    //   163: aconst_null
    //   164: astore_3
    //   165: aload_3
    //   166: invokestatic 185	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   169: aload_1
    //   170: invokestatic 185	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   173: ldc 111
    //   175: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: goto -19 -> 159
    //   181: astore_1
    //   182: aconst_null
    //   183: astore_2
    //   184: aconst_null
    //   185: astore_3
    //   186: aload_3
    //   187: invokestatic 185	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   190: aload_2
    //   191: invokestatic 185	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   194: ldc 111
    //   196: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   199: aload_1
    //   200: athrow
    //   201: aload_0
    //   202: iconst_0
    //   203: aload_1
    //   204: invokespecial 68	com/tencent/tencentmap/mapsdk/a/n:a	(ILcom/tencent/tencentmap/mapsdk/maps/a/hq;)V
    //   207: ldc 111
    //   209: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: goto -53 -> 159
    //   215: aload_0
    //   216: iconst_2
    //   217: aconst_null
    //   218: invokespecial 68	com/tencent/tencentmap/mapsdk/a/n:a	(ILcom/tencent/tencentmap/mapsdk/maps/a/hq;)V
    //   221: ldc 111
    //   223: invokestatic 71	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: goto -67 -> 159
    //   229: astore_1
    //   230: aconst_null
    //   231: astore_2
    //   232: goto -46 -> 186
    //   235: astore_1
    //   236: goto -50 -> 186
    //   239: astore_1
    //   240: aconst_null
    //   241: astore_1
    //   242: goto -77 -> 165
    //   245: astore_1
    //   246: aload_2
    //   247: astore_1
    //   248: goto -83 -> 165
    //
    // Exception table:
    //   from	to	target	type
    //   20	47	160	java/lang/Exception
    //   20	47	181	finally
    //   47	103	229	finally
    //   107	112	229	finally
    //   112	118	229	finally
    //   118	129	229	finally
    //   129	146	235	finally
    //   47	103	239	java/lang/Exception
    //   107	112	239	java/lang/Exception
    //   112	118	239	java/lang/Exception
    //   118	129	239	java/lang/Exception
    //   129	146	245	java/lang/Exception
  }

  public void a(String paramString1, ho paramho, m paramm, String paramString2)
  {
    AppMethodBeat.i(98249);
    if ((paramho == null) || (paramm == null))
      AppMethodBeat.o(98249);
    while (true)
    {
      return;
      this.a = new WeakReference(paramm);
      this.b = paramString2;
      paramho = a(paramho);
      if ((paramho == null) || (paramho.size() == 0))
      {
        AppMethodBeat.o(98249);
      }
      else
      {
        paramho = paramho.iterator();
        while (paramho.hasNext())
          a((hq)paramho.next(), paramString1);
        AppMethodBeat.o(98249);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.n
 * JD-Core Version:    0.6.2
 */