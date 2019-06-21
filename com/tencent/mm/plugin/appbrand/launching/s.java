package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.c;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.f;
import com.tencent.mm.plugin.appbrand.launching.c.a;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class s
  implements m
{
  final String appId;
  final int har;
  List<WxaAttributes.f> hin;
  final int ihg;
  private final AtomicInteger ihi;
  private volatile boolean ihj;
  LinkedHashMap<String, j<WxaPkgWrappingInfo>> ihp;
  private a ihq;
  List<WxaAttributes.c> ihu;

  s(String paramString, int paramInt1, int paramInt2, List<WxaAttributes.f> paramList)
  {
    AppMethodBeat.i(131876);
    this.ihp = new LinkedHashMap();
    this.ihi = new AtomicInteger(0);
    this.ihj = false;
    ab.i("MicroMsg.AppBrand.LaunchCheckPkgSplitCodeLibModuleHandler", "appId:%s,versionType:%s,desirePkgVersion:%s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.appId = paramString;
    this.har = paramInt1;
    this.ihg = paramInt2;
    this.hin = paramList;
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      WxaAttributes.f localf = (WxaAttributes.f)paramList.next();
      if ((!bo.isNullOrNil(localf.name)) && (localf.name.equals("__APP__")))
        this.ihu = localf.hir;
    }
    this.ihq = new a(paramString, paramInt2, paramInt1, this.ihu);
    AppMethodBeat.o(131876);
  }

  // ERROR //
  private static WxaPkgWrappingInfo J(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 132
    //   4: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 134	com/tencent/mm/plugin/appbrand/appcache/y
    //   10: dup
    //   11: aload_0
    //   12: ldc 104
    //   14: invokespecial 137	com/tencent/mm/plugin/appbrand/appcache/y:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: astore 4
    //   19: iload_1
    //   20: invokestatic 143	com/tencent/mm/plugin/appbrand/appcache/j$a:np	(I)Z
    //   23: ifeq +312 -> 335
    //   26: invokestatic 149	com/tencent/mm/plugin/appbrand/app/f:auV	()Lcom/tencent/mm/plugin/appbrand/appcache/ax;
    //   29: astore 5
    //   31: aload 5
    //   33: ifnonnull +12 -> 45
    //   36: ldc 132
    //   38: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: aload_3
    //   42: astore_0
    //   43: aload_0
    //   44: areturn
    //   45: aload 5
    //   47: aload 4
    //   49: invokevirtual 153	com/tencent/mm/plugin/appbrand/appcache/y:toString	()Ljava/lang/String;
    //   52: iload_2
    //   53: iload_1
    //   54: iconst_0
    //   55: anewarray 106	java/lang/String
    //   58: invokevirtual 159	com/tencent/mm/plugin/appbrand/appcache/ax:a	(Ljava/lang/String;II[Ljava/lang/String;)Lcom/tencent/mm/plugin/appbrand/appcache/at;
    //   61: astore 6
    //   63: aload 6
    //   65: ifnonnull +13 -> 78
    //   68: ldc 132
    //   70: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: aload_3
    //   74: astore_0
    //   75: goto -32 -> 43
    //   78: aload 6
    //   80: getfield 164	com/tencent/mm/plugin/appbrand/appcache/at:field_versionMd5	Ljava/lang/String;
    //   83: invokestatic 102	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   86: ifeq +13 -> 99
    //   89: ldc 132
    //   91: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_3
    //   95: astore_0
    //   96: goto -53 -> 43
    //   99: aload 6
    //   101: getfield 167	com/tencent/mm/plugin/appbrand/appcache/at:field_pkgPath	Ljava/lang/String;
    //   104: invokestatic 173	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   107: astore 7
    //   109: aload 7
    //   111: astore 5
    //   113: aload 6
    //   115: getfield 164	com/tencent/mm/plugin/appbrand/appcache/at:field_versionMd5	Ljava/lang/String;
    //   118: aload 7
    //   120: sipush 4096
    //   123: invokestatic 179	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   126: invokevirtual 110	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   129: ifeq +67 -> 196
    //   132: aload 7
    //   134: astore 5
    //   136: ldc 54
    //   138: ldc 181
    //   140: iconst_3
    //   141: anewarray 4	java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload_0
    //   147: aastore
    //   148: dup
    //   149: iconst_1
    //   150: iload_1
    //   151: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   154: aastore
    //   155: dup
    //   156: iconst_2
    //   157: iload_2
    //   158: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   161: aastore
    //   162: invokestatic 67	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aload 7
    //   167: astore 5
    //   169: aload 6
    //   171: getfield 167	com/tencent/mm/plugin/appbrand/appcache/at:field_pkgPath	Ljava/lang/String;
    //   174: iload_2
    //   175: invokestatic 185	com/tencent/mm/plugin/appbrand/launching/s:bo	(Ljava/lang/String;I)Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   178: astore 8
    //   180: aload 8
    //   182: astore_0
    //   183: aload 7
    //   185: invokestatic 188	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   188: ldc 132
    //   190: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   193: goto -150 -> 43
    //   196: aload 7
    //   198: invokestatic 188	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   201: aload 6
    //   203: getfield 167	com/tencent/mm/plugin/appbrand/appcache/at:field_pkgPath	Ljava/lang/String;
    //   206: invokestatic 191	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   209: pop
    //   210: aload 4
    //   212: iload_1
    //   213: iload_2
    //   214: aload 6
    //   216: getfield 164	com/tencent/mm/plugin/appbrand/appcache/at:field_versionMd5	Ljava/lang/String;
    //   219: invokestatic 196	com/tencent/mm/plugin/appbrand/launching/h:a	(Lcom/tencent/mm/plugin/appbrand/appcache/y;IILjava/lang/String;)Lcom/tencent/mm/plugin/appbrand/appcache/at;
    //   222: astore_0
    //   223: aload_0
    //   224: ifnull +190 -> 414
    //   227: aload 4
    //   229: invokevirtual 153	com/tencent/mm/plugin/appbrand/appcache/y:toString	()Ljava/lang/String;
    //   232: iload_2
    //   233: invokestatic 202	com/tencent/mm/plugin/appbrand/appcache/aq:aq	(Ljava/lang/String;I)Ljava/lang/String;
    //   236: astore 5
    //   238: aload_0
    //   239: getfield 167	com/tencent/mm/plugin/appbrand/appcache/at:field_pkgPath	Ljava/lang/String;
    //   242: aload 5
    //   244: invokestatic 206	com/tencent/mm/vfs/e:y	(Ljava/lang/String;Ljava/lang/String;)J
    //   247: pop2
    //   248: invokestatic 149	com/tencent/mm/plugin/appbrand/app/f:auV	()Lcom/tencent/mm/plugin/appbrand/appcache/ax;
    //   251: aload 4
    //   253: invokevirtual 153	com/tencent/mm/plugin/appbrand/appcache/y:toString	()Ljava/lang/String;
    //   256: iload_1
    //   257: iload_2
    //   258: aload 5
    //   260: invokevirtual 210	com/tencent/mm/plugin/appbrand/appcache/ax:d	(Ljava/lang/String;IILjava/lang/String;)Z
    //   263: pop
    //   264: aload 5
    //   266: iload_2
    //   267: invokestatic 185	com/tencent/mm/plugin/appbrand/launching/s:bo	(Ljava/lang/String;I)Lcom/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo;
    //   270: astore_0
    //   271: ldc 132
    //   273: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   276: goto -233 -> 43
    //   279: astore 5
    //   281: aconst_null
    //   282: astore 7
    //   284: aload 7
    //   286: astore 5
    //   288: ldc 54
    //   290: ldc 212
    //   292: iconst_2
    //   293: anewarray 4	java/lang/Object
    //   296: dup
    //   297: iconst_0
    //   298: aload_0
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload 6
    //   304: getfield 167	com/tencent/mm/plugin/appbrand/appcache/at:field_pkgPath	Ljava/lang/String;
    //   307: aastore
    //   308: invokestatic 215	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: aload 7
    //   313: invokestatic 188	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   316: goto -115 -> 201
    //   319: astore_0
    //   320: aconst_null
    //   321: astore 5
    //   323: aload 5
    //   325: invokestatic 188	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   328: ldc 132
    //   330: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   333: aload_0
    //   334: athrow
    //   335: aload 4
    //   337: invokevirtual 153	com/tencent/mm/plugin/appbrand/appcache/y:toString	()Ljava/lang/String;
    //   340: iload_1
    //   341: iconst_1
    //   342: invokestatic 221	com/tencent/mm/plugin/appbrand/appcache/as:v	(Ljava/lang/String;II)Landroid/util/Pair;
    //   345: astore 5
    //   347: aload 5
    //   349: getfield 227	android/util/Pair:second	Ljava/lang/Object;
    //   352: ifnull +62 -> 414
    //   355: aload 5
    //   357: getfield 227	android/util/Pair:second	Ljava/lang/Object;
    //   360: checkcast 229	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo
    //   363: ldc 104
    //   365: putfield 230	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo:name	Ljava/lang/String;
    //   368: ldc 54
    //   370: ldc 232
    //   372: iconst_3
    //   373: anewarray 4	java/lang/Object
    //   376: dup
    //   377: iconst_0
    //   378: aload_0
    //   379: aastore
    //   380: dup
    //   381: iconst_1
    //   382: iload_1
    //   383: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   386: aastore
    //   387: dup
    //   388: iconst_2
    //   389: iload_2
    //   390: invokestatic 62	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   393: aastore
    //   394: invokestatic 67	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   397: aload 5
    //   399: getfield 227	android/util/Pair:second	Ljava/lang/Object;
    //   402: checkcast 229	com/tencent/mm/plugin/appbrand/appcache/WxaPkgWrappingInfo
    //   405: astore_0
    //   406: ldc 132
    //   408: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: goto -368 -> 43
    //   414: ldc 132
    //   416: invokestatic 124	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   419: aload_3
    //   420: astore_0
    //   421: goto -378 -> 43
    //   424: astore_0
    //   425: goto -102 -> 323
    //   428: astore 5
    //   430: goto -146 -> 284
    //
    // Exception table:
    //   from	to	target	type
    //   99	109	279	java/io/FileNotFoundException
    //   99	109	319	finally
    //   113	132	424	finally
    //   136	165	424	finally
    //   169	180	424	finally
    //   288	311	424	finally
    //   113	132	428	java/io/FileNotFoundException
    //   136	165	428	java/io/FileNotFoundException
    //   169	180	428	java/io/FileNotFoundException
  }

  private static WxaPkgWrappingInfo bo(String paramString, int paramInt)
  {
    AppMethodBeat.i(131878);
    paramString = WxaPkgWrappingInfo.xM(paramString);
    paramString.gVu = paramInt;
    AppMethodBeat.o(131878);
    return paramString;
  }

  private void oW(int paramInt)
  {
    AppMethodBeat.i(131879);
    this.ihq.pd(paramInt);
    AppMethodBeat.o(131879);
  }

  public void aHe()
  {
  }

  public void aHj()
  {
  }

  public void onDownloadProgress(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.s
 * JD-Core Version:    0.6.2
 */