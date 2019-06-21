package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import junit.framework.Assert;

public final class x
{
  private static Vector<WeakReference<x.a>> ghp;
  private static LinkedList<x.a> ghq;

  static
  {
    AppMethodBeat.i(79041);
    ghp = new Vector();
    ghq = new LinkedList();
    AppMethodBeat.o(79041);
  }

  public static Bitmap a(v paramv)
  {
    AppMethodBeat.i(79034);
    if (!b(paramv))
    {
      paramv = null;
      AppMethodBeat.o(79034);
    }
    while (true)
    {
      return paramv;
      if (!g.RP().RB())
      {
        paramv = paramv.anO();
        AppMethodBeat.o(79034);
      }
      else if (paramv.anN())
      {
        paramv = b.a(b.ghr, paramv);
        AppMethodBeat.o(79034);
      }
      else
      {
        paramv = b.b(b.ghr, paramv);
        AppMethodBeat.o(79034);
      }
    }
  }

  public static boolean a(x.a parama)
  {
    AppMethodBeat.i(79031);
    boolean bool = ghp.add(new WeakReference(parama));
    AppMethodBeat.o(79031);
    return bool;
  }

  private static boolean b(v paramv)
  {
    AppMethodBeat.i(79038);
    boolean bool;
    if ((paramv == null) || (bo.isNullOrNil(paramv.anK())))
    {
      bool = false;
      AppMethodBeat.o(79038);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(79038);
    }
  }

  public static boolean b(x.a parama)
  {
    AppMethodBeat.i(79032);
    ghq.remove(parama);
    boolean bool = ghq.add(parama);
    AppMethodBeat.o(79032);
    return bool;
  }

  public static boolean c(x.a parama)
  {
    AppMethodBeat.i(79033);
    boolean bool = ghq.remove(parama);
    AppMethodBeat.o(79033);
    return bool;
  }

  public static Bitmap q(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(79036);
    paramString = b.q(paramString, paramInt1, paramInt2);
    AppMethodBeat.o(79036);
    return paramString;
  }

  public static Bitmap vv(String paramString)
  {
    AppMethodBeat.i(79035);
    paramString = b.vv(paramString);
    AppMethodBeat.o(79035);
    return paramString;
  }

  public static Bitmap vw(String paramString)
  {
    AppMethodBeat.i(79037);
    paramString = b.vw(paramString);
    AppMethodBeat.o(79037);
    return paramString;
  }

  static enum b
  {
    private static DisplayMetrics ghw;
    private Map<String, x.b.c> ghs;
    private Map<String, WeakReference<Bitmap>> ght;
    private az ghu;
    private az ghv;

    static
    {
      AppMethodBeat.i(79030);
      ghr = new b("INSTANCE");
      ghx = new b[] { ghr };
      ghw = null;
      AppMethodBeat.o(79030);
    }

    private b()
    {
      AppMethodBeat.i(79018);
      this.ghs = new HashMap();
      this.ght = new HashMap();
      this.ghu = null;
      this.ghv = null;
      AppMethodBeat.o(79018);
    }

    private static DisplayMetrics anS()
    {
      AppMethodBeat.i(79022);
      if (ghw == null)
        ghw = ah.getContext().getResources().getDisplayMetrics();
      DisplayMetrics localDisplayMetrics = ghw;
      AppMethodBeat.o(79022);
      return localDisplayMetrics;
    }

    private void b(v paramv, Bitmap paramBitmap)
    {
      AppMethodBeat.i(79021);
      Assert.assertTrue("picture strategy here must be validity", x.c(paramv));
      String str = paramv.getCacheKey();
      if (this.ght.containsKey(str));
      for (paramv = (Bitmap)((WeakReference)this.ght.get(str)).get(); ; paramv = null)
      {
        if ((paramv == null) || (paramv.isRecycled()))
        {
          this.ght.remove(str);
          this.ght.put(str, new WeakReference(paramBitmap));
        }
        AppMethodBeat.o(79021);
        return;
      }
    }

    private Bitmap d(v paramv)
    {
      AppMethodBeat.i(79019);
      Assert.assertTrue("picture strategy here must be validity", x.c(paramv));
      String str = paramv.anK();
      x.b.c localc = (x.b.c)this.ghs.get(str);
      Object localObject = localc;
      if (localc == null)
        localObject = new x.b.c();
      if (((x.b.c)localObject).ghA)
        if (((x.b.c)localObject).ghB >= 3)
          if (bo.fp(((x.b.c)localObject).ghC) < 120L)
          {
            ab.w("MicroMsg.MMPictureLogic", "download fail interval less than %d s for %s", new Object[] { Integer.valueOf(120), str });
            AppMethodBeat.o(79019);
            paramv = null;
          }
      while (true)
      {
        return paramv;
        ((x.b.c)localObject).ghB = 0;
        label122: ((x.b.c)localObject).ghA = false;
        ((x.b.c)localObject).ghC = ((int)bo.anT());
        this.ghs.put(str, localObject);
        label150: if (paramv.anM())
        {
          localObject = paramv.anI();
          if (localObject != null);
          for (localObject = ((v.b)localObject).vt(paramv.anJ()); ; localObject = vv(paramv.anJ()))
          {
            if (localObject == null)
              break label334;
            paramv = a(paramv, (Bitmap)localObject);
            this.ghs.remove(str);
            AppMethodBeat.o(79019);
            break;
            ((x.b.c)localObject).ghB += 1;
            break label122;
            if (bo.fp(((x.b.c)localObject).ghC) < 120L)
            {
              ab.d("MicroMsg.MMPictureLogic", "downloading interval less than %d s for %s", new Object[] { Integer.valueOf(120), str });
              AppMethodBeat.o(79019);
              paramv = null;
              break;
            }
            ((x.b.c)localObject).ghB += 1;
            ((x.b.c)localObject).ghC = ((int)bo.anT());
            this.ghs.put(str, localObject);
            break label150;
          }
          label334: if ((this.ghu == null) || (this.ghu.dpg()))
            this.ghu = new az(1, "readerapp-pic-logic-download", 3);
          this.ghu.e(new a(paramv));
          AppMethodBeat.o(79019);
          paramv = null;
        }
        else
        {
          if ((this.ghv == null) || (this.ghv.dpg()))
            this.ghv = new az(1, "readerapp-pic-logic-reader", 1);
          this.ghv.e(new b(paramv));
          AppMethodBeat.o(79019);
          paramv = null;
        }
      }
    }

    public static Bitmap q(String paramString, int paramInt1, int paramInt2)
    {
      Object localObject = null;
      AppMethodBeat.i(79023);
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.MMPictureLogic", "error input, path is null");
        AppMethodBeat.o(79023);
        paramString = localObject;
      }
      while (true)
      {
        return paramString;
        if ((paramInt1 <= 0) || (paramInt2 <= 0))
        {
          ab.w("MicroMsg.MMPictureLogic", "error input, targetWidth %d, targetHeight %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          AppMethodBeat.o(79023);
          paramString = localObject;
        }
        else
        {
          paramString = d.ap(paramString, paramInt1, paramInt2);
          AppMethodBeat.o(79023);
        }
      }
    }

    public static Bitmap vv(String paramString)
    {
      AppMethodBeat.i(79024);
      DisplayMetrics localDisplayMetrics = anS();
      paramString = q(paramString, localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
      AppMethodBeat.o(79024);
      return paramString;
    }

    public static Bitmap vw(String paramString)
    {
      AppMethodBeat.i(79025);
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.MMPictureLogic", "error input, path is null");
        paramString = null;
        AppMethodBeat.o(79025);
      }
      while (true)
      {
        return paramString;
        paramString = d.ap(paramString, 0, 0);
        AppMethodBeat.o(79025);
      }
    }

    protected final Bitmap a(v paramv, Bitmap paramBitmap)
    {
      AppMethodBeat.i(79020);
      Assert.assertTrue("picture strategy here must be validity", x.c(paramv));
      if (paramBitmap != null)
      {
        Bitmap localBitmap = paramv.a(paramBitmap, v.a.ghn, paramv.anJ());
        if ((localBitmap != paramBitmap) && (!paramBitmap.isRecycled()))
        {
          ab.i("MicroMsg.MMPictureLogic", "recycle bitmap:%s", new Object[] { paramBitmap.toString() });
          paramBitmap.recycle();
        }
        b(paramv, localBitmap);
        paramBitmap = localBitmap;
      }
      while (true)
      {
        AppMethodBeat.o(79020);
        return paramBitmap;
        paramv.a(v.a.ghn, null);
      }
    }

    static final class a
      implements az.a
    {
      private Bitmap fru;
      private int ghy;
      private v ghz;

      public a(v paramv)
      {
        AppMethodBeat.i(79009);
        this.ghy = 0;
        this.fru = null;
        if (!x.c(paramv))
        {
          paramv = new IllegalArgumentException("from net, picture strategy here must be validity");
          AppMethodBeat.o(79009);
          throw paramv;
        }
        this.ghz = paramv;
        AppMethodBeat.o(79009);
      }

      // ERROR //
      public final boolean acf()
      {
        // Byte code:
        //   0: ldc 58
        //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
        //   5: aload_0
        //   6: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   9: ifnonnull +17 -> 26
        //   12: ldc 60
        //   14: ldc 62
        //   16: invokestatic 68	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
        //   19: ldc 58
        //   21: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   24: iconst_1
        //   25: ireturn
        //   26: aload_0
        //   27: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   30: invokeinterface 73 1 0
        //   35: new 75	java/io/File
        //   38: astore_1
        //   39: aload_1
        //   40: aload_0
        //   41: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   44: invokeinterface 79 1 0
        //   49: invokespecial 80	java/io/File:<init>	(Ljava/lang/String;)V
        //   52: new 82	java/io/FileOutputStream
        //   55: astore_2
        //   56: new 84	java/lang/StringBuilder
        //   59: astore_3
        //   60: aload_3
        //   61: invokespecial 85	java/lang/StringBuilder:<init>	()V
        //   64: aload_2
        //   65: aload_3
        //   66: aload_1
        //   67: invokevirtual 88	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   70: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   73: ldc 94
        //   75: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   78: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   81: invokespecial 98	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
        //   84: aload_0
        //   85: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   88: invokeinterface 101 1 0
        //   93: aconst_null
        //   94: invokestatic 106	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/u;
        //   97: astore 4
        //   99: invokestatic 111	com/tencent/mm/at/q:ahs	()Z
        //   102: ifeq +46 -> 148
        //   105: aload_0
        //   106: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   109: invokeinterface 101 1 0
        //   114: invokestatic 115	com/tencent/mm/at/q:sz	(Ljava/lang/String;)Z
        //   117: ifeq +31 -> 148
        //   120: getstatic 120	com/tencent/mm/protocal/d:vxo	I
        //   123: invokestatic 124	com/tencent/mm/at/q:lH	(I)Ljava/lang/String;
        //   126: astore_3
        //   127: ldc 60
        //   129: ldc 126
        //   131: iconst_1
        //   132: anewarray 4	java/lang/Object
        //   135: dup
        //   136: iconst_0
        //   137: aload_3
        //   138: aastore
        //   139: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   142: aload 4
        //   144: aload_3
        //   145: invokevirtual 135	com/tencent/mm/network/u:vc	(Ljava/lang/String;)V
        //   148: aload 4
        //   150: sipush 10000
        //   153: invokevirtual 138	com/tencent/mm/network/u:setConnectTimeout	(I)V
        //   156: aload 4
        //   158: sipush 20000
        //   161: invokevirtual 141	com/tencent/mm/network/u:setReadTimeout	(I)V
        //   164: aload 4
        //   166: ldc 143
        //   168: invokevirtual 146	com/tencent/mm/network/u:setRequestMethod	(Ljava/lang/String;)V
        //   171: aload 4
        //   173: invokestatic 149	com/tencent/mm/network/b:a	(Lcom/tencent/mm/network/u;)I
        //   176: ifne +940 -> 1116
        //   179: aload 4
        //   181: invokevirtual 153	com/tencent/mm/network/u:getInputStream	()Ljava/io/InputStream;
        //   184: astore_3
        //   185: aload_3
        //   186: astore 5
        //   188: aload_2
        //   189: astore 6
        //   191: aload 4
        //   193: getfield 157	com/tencent/mm/network/u:connection	Ljava/net/HttpURLConnection;
        //   196: invokevirtual 162	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
        //   199: astore 7
        //   201: aload_3
        //   202: astore 5
        //   204: aload_2
        //   205: astore 6
        //   207: ldc 60
        //   209: ldc 164
        //   211: iconst_1
        //   212: anewarray 4	java/lang/Object
        //   215: dup
        //   216: iconst_0
        //   217: aload 7
        //   219: aastore
        //   220: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   223: aload_3
        //   224: ifnonnull +114 -> 338
        //   227: aload_3
        //   228: astore 5
        //   230: aload_2
        //   231: astore 6
        //   233: ldc 60
        //   235: ldc 166
        //   237: iconst_1
        //   238: anewarray 4	java/lang/Object
        //   241: dup
        //   242: iconst_0
        //   243: aload_0
        //   244: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   247: invokeinterface 101 1 0
        //   252: aastore
        //   253: invokestatic 169	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   256: aload_3
        //   257: astore 5
        //   259: aload_2
        //   260: astore 6
        //   262: aload_0
        //   263: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   266: aload 7
        //   268: iconst_0
        //   269: invokeinterface 173 3 0
        //   274: aload_3
        //   275: ifnull +7 -> 282
        //   278: aload_3
        //   279: invokevirtual 178	java/io/InputStream:close	()V
        //   282: aload_2
        //   283: invokevirtual 179	java/io/FileOutputStream:close	()V
        //   286: ldc 58
        //   288: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   291: goto -267 -> 24
        //   294: astore_3
        //   295: ldc 60
        //   297: ldc 181
        //   299: iconst_1
        //   300: anewarray 4	java/lang/Object
        //   303: dup
        //   304: iconst_0
        //   305: aload_3
        //   306: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   309: aastore
        //   310: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   313: goto -31 -> 282
        //   316: astore_3
        //   317: ldc 60
        //   319: ldc 181
        //   321: iconst_1
        //   322: anewarray 4	java/lang/Object
        //   325: dup
        //   326: iconst_0
        //   327: aload_3
        //   328: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   331: aastore
        //   332: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   335: goto -49 -> 286
        //   338: aload_3
        //   339: astore 5
        //   341: aload_2
        //   342: astore 6
        //   344: sipush 1024
        //   347: newarray byte
        //   349: astore 4
        //   351: aload_3
        //   352: astore 5
        //   354: aload_2
        //   355: astore 6
        //   357: aload_3
        //   358: aload 4
        //   360: invokevirtual 193	java/io/InputStream:read	([B)I
        //   363: istore 8
        //   365: iload 8
        //   367: iconst_m1
        //   368: if_icmpeq +136 -> 504
        //   371: aload_3
        //   372: astore 5
        //   374: aload_2
        //   375: astore 6
        //   377: aload_0
        //   378: aload_0
        //   379: getfield 32	com/tencent/mm/platformtools/x$b$a:ghy	I
        //   382: iload 8
        //   384: iadd
        //   385: putfield 32	com/tencent/mm/platformtools/x$b$a:ghy	I
        //   388: aload_3
        //   389: astore 5
        //   391: aload_2
        //   392: astore 6
        //   394: aload_2
        //   395: aload 4
        //   397: iconst_0
        //   398: iload 8
        //   400: invokevirtual 197	java/io/FileOutputStream:write	([BII)V
        //   403: goto -52 -> 351
        //   406: astore 4
        //   408: aload_3
        //   409: astore 5
        //   411: aload_2
        //   412: astore 6
        //   414: ldc 60
        //   416: ldc 181
        //   418: iconst_1
        //   419: anewarray 4	java/lang/Object
        //   422: dup
        //   423: iconst_0
        //   424: aload 4
        //   426: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   429: aastore
        //   430: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   433: aload_3
        //   434: astore 5
        //   436: aload_2
        //   437: astore 6
        //   439: ldc 60
        //   441: ldc 199
        //   443: iconst_1
        //   444: anewarray 4	java/lang/Object
        //   447: dup
        //   448: iconst_0
        //   449: aload_0
        //   450: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   453: invokeinterface 101 1 0
        //   458: aastore
        //   459: invokestatic 169	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   462: aload_3
        //   463: astore 5
        //   465: aload_2
        //   466: astore 6
        //   468: aload_0
        //   469: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   472: aload 7
        //   474: iconst_0
        //   475: invokeinterface 173 3 0
        //   480: aload_3
        //   481: ifnull +7 -> 488
        //   484: aload_3
        //   485: invokevirtual 178	java/io/InputStream:close	()V
        //   488: aload_2
        //   489: ifnull +7 -> 496
        //   492: aload_2
        //   493: invokevirtual 179	java/io/FileOutputStream:close	()V
        //   496: ldc 58
        //   498: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   501: goto -477 -> 24
        //   504: aload_3
        //   505: astore 5
        //   507: aload_2
        //   508: astore 6
        //   510: ldc 60
        //   512: ldc 201
        //   514: iconst_2
        //   515: anewarray 4	java/lang/Object
        //   518: dup
        //   519: iconst_0
        //   520: aload_0
        //   521: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   524: invokeinterface 101 1 0
        //   529: aastore
        //   530: dup
        //   531: iconst_1
        //   532: aload_0
        //   533: getfield 32	com/tencent/mm/platformtools/x$b$a:ghy	I
        //   536: invokestatic 207	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   539: aastore
        //   540: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   543: aload_3
        //   544: astore 5
        //   546: aload_2
        //   547: astore 6
        //   549: aload_0
        //   550: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   553: aload 7
        //   555: iconst_1
        //   556: invokeinterface 173 3 0
        //   561: aload_3
        //   562: ifnull +7 -> 569
        //   565: aload_3
        //   566: invokevirtual 178	java/io/InputStream:close	()V
        //   569: aload_2
        //   570: invokevirtual 179	java/io/FileOutputStream:close	()V
        //   573: new 84	java/lang/StringBuilder
        //   576: astore_3
        //   577: aload_3
        //   578: invokespecial 85	java/lang/StringBuilder:<init>	()V
        //   581: aload_3
        //   582: aload_1
        //   583: invokevirtual 88	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   586: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   589: ldc 94
        //   591: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   594: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   597: invokestatic 215	com/tencent/mm/a/g:cz	(Ljava/lang/String;)Ljava/lang/String;
        //   600: pop
        //   601: aload_0
        //   602: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   605: invokeinterface 219 1 0
        //   610: astore_3
        //   611: aload_3
        //   612: ifnull +361 -> 973
        //   615: new 84	java/lang/StringBuilder
        //   618: astore 4
        //   620: aload 4
        //   622: invokespecial 85	java/lang/StringBuilder:<init>	()V
        //   625: aload_3
        //   626: aload 4
        //   628: aload_1
        //   629: invokevirtual 88	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   632: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   635: ldc 94
        //   637: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   640: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   643: invokeinterface 225 2 0
        //   648: astore 4
        //   650: aload 4
        //   652: ifnull +353 -> 1005
        //   655: aload_0
        //   656: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   659: astore_3
        //   660: getstatic 231	com/tencent/mm/platformtools/v$a:ghm	Lcom/tencent/mm/platformtools/v$a;
        //   663: astore_2
        //   664: new 84	java/lang/StringBuilder
        //   667: astore 7
        //   669: aload 7
        //   671: invokespecial 85	java/lang/StringBuilder:<init>	()V
        //   674: aload_3
        //   675: aload 4
        //   677: aload_2
        //   678: aload 7
        //   680: aload_1
        //   681: invokevirtual 88	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   684: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   687: ldc 94
        //   689: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   692: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   695: invokeinterface 234 4 0
        //   700: astore_3
        //   701: aload_3
        //   702: aload 4
        //   704: if_acmpeq +35 -> 739
        //   707: aload 4
        //   709: invokevirtual 239	android/graphics/Bitmap:isRecycled	()Z
        //   712: ifne +27 -> 739
        //   715: ldc 60
        //   717: ldc 241
        //   719: iconst_1
        //   720: anewarray 4	java/lang/Object
        //   723: dup
        //   724: iconst_0
        //   725: aload 4
        //   727: invokevirtual 242	java/lang/Object:toString	()Ljava/lang/String;
        //   730: aastore
        //   731: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   734: aload 4
        //   736: invokevirtual 245	android/graphics/Bitmap:recycle	()V
        //   739: getstatic 249	com/tencent/mm/platformtools/x$b:ghr	Lcom/tencent/mm/platformtools/x$b;
        //   742: aload_0
        //   743: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   746: aload_3
        //   747: invokestatic 252	com/tencent/mm/platformtools/x$b:a	(Lcom/tencent/mm/platformtools/x$b;Lcom/tencent/mm/platformtools/v;Landroid/graphics/Bitmap;)V
        //   750: new 75	java/io/File
        //   753: astore 7
        //   755: new 84	java/lang/StringBuilder
        //   758: astore 4
        //   760: aload 4
        //   762: invokespecial 85	java/lang/StringBuilder:<init>	()V
        //   765: aload 7
        //   767: aload 4
        //   769: aload_1
        //   770: invokevirtual 88	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   773: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   776: ldc 94
        //   778: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   781: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   784: invokespecial 80	java/io/File:<init>	(Ljava/lang/String;)V
        //   787: aload 7
        //   789: invokevirtual 255	java/io/File:delete	()Z
        //   792: pop
        //   793: aload_0
        //   794: aload_3
        //   795: putfield 34	com/tencent/mm/platformtools/x$b$a:fru	Landroid/graphics/Bitmap;
        //   798: ldc 58
        //   800: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   803: goto -779 -> 24
        //   806: astore_3
        //   807: ldc 60
        //   809: ldc 181
        //   811: iconst_1
        //   812: anewarray 4	java/lang/Object
        //   815: dup
        //   816: iconst_0
        //   817: aload_3
        //   818: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   821: aastore
        //   822: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   825: goto -256 -> 569
        //   828: astore_3
        //   829: ldc 60
        //   831: ldc 181
        //   833: iconst_1
        //   834: anewarray 4	java/lang/Object
        //   837: dup
        //   838: iconst_0
        //   839: aload_3
        //   840: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   843: aastore
        //   844: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   847: goto -274 -> 573
        //   850: astore_3
        //   851: ldc 60
        //   853: ldc 181
        //   855: iconst_1
        //   856: anewarray 4	java/lang/Object
        //   859: dup
        //   860: iconst_0
        //   861: aload_3
        //   862: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   865: aastore
        //   866: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   869: goto -381 -> 488
        //   872: astore_3
        //   873: ldc 60
        //   875: ldc 181
        //   877: iconst_1
        //   878: anewarray 4	java/lang/Object
        //   881: dup
        //   882: iconst_0
        //   883: aload_3
        //   884: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   887: aastore
        //   888: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   891: goto -395 -> 496
        //   894: astore_3
        //   895: aconst_null
        //   896: astore 5
        //   898: aconst_null
        //   899: astore_2
        //   900: aload 5
        //   902: ifnull +8 -> 910
        //   905: aload 5
        //   907: invokevirtual 178	java/io/InputStream:close	()V
        //   910: aload_2
        //   911: ifnull +7 -> 918
        //   914: aload_2
        //   915: invokevirtual 179	java/io/FileOutputStream:close	()V
        //   918: ldc 58
        //   920: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   923: aload_3
        //   924: athrow
        //   925: astore 4
        //   927: ldc 60
        //   929: ldc 181
        //   931: iconst_1
        //   932: anewarray 4	java/lang/Object
        //   935: dup
        //   936: iconst_0
        //   937: aload 4
        //   939: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   942: aastore
        //   943: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   946: goto -36 -> 910
        //   949: astore 4
        //   951: ldc 60
        //   953: ldc 181
        //   955: iconst_1
        //   956: anewarray 4	java/lang/Object
        //   959: dup
        //   960: iconst_0
        //   961: aload 4
        //   963: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   966: aastore
        //   967: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   970: goto -52 -> 918
        //   973: new 84	java/lang/StringBuilder
        //   976: astore_3
        //   977: aload_3
        //   978: invokespecial 85	java/lang/StringBuilder:<init>	()V
        //   981: aload_3
        //   982: aload_1
        //   983: invokevirtual 88	java/io/File:getAbsolutePath	()Ljava/lang/String;
        //   986: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   989: ldc 94
        //   991: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   994: invokevirtual 97	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   997: invokestatic 258	com/tencent/mm/platformtools/x$b:vv	(Ljava/lang/String;)Landroid/graphics/Bitmap;
        //   1000: astore 4
        //   1002: goto -352 -> 650
        //   1005: aload_0
        //   1006: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   1009: getstatic 231	com/tencent/mm/platformtools/v$a:ghm	Lcom/tencent/mm/platformtools/v$a;
        //   1012: aload 7
        //   1014: invokeinterface 261 3 0
        //   1019: aconst_null
        //   1020: astore_3
        //   1021: goto -320 -> 701
        //   1024: astore_3
        //   1025: ldc 60
        //   1027: ldc_w 263
        //   1030: iconst_1
        //   1031: anewarray 4	java/lang/Object
        //   1034: dup
        //   1035: iconst_0
        //   1036: aload_0
        //   1037: getfield 50	com/tencent/mm/platformtools/x$b$a:ghz	Lcom/tencent/mm/platformtools/v;
        //   1040: invokeinterface 101 1 0
        //   1045: aastore
        //   1046: invokestatic 169	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1049: ldc 60
        //   1051: ldc 181
        //   1053: iconst_1
        //   1054: anewarray 4	java/lang/Object
        //   1057: dup
        //   1058: iconst_0
        //   1059: aload_3
        //   1060: invokestatic 187	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
        //   1063: aastore
        //   1064: invokestatic 189	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
        //   1067: aconst_null
        //   1068: astore_3
        //   1069: goto -276 -> 793
        //   1072: astore_3
        //   1073: aconst_null
        //   1074: astore 5
        //   1076: goto -176 -> 900
        //   1079: astore_3
        //   1080: aload 6
        //   1082: astore_2
        //   1083: goto -183 -> 900
        //   1086: astore 4
        //   1088: aconst_null
        //   1089: astore 7
        //   1091: aconst_null
        //   1092: astore_3
        //   1093: aconst_null
        //   1094: astore_2
        //   1095: goto -687 -> 408
        //   1098: astore 4
        //   1100: aconst_null
        //   1101: astore 7
        //   1103: aconst_null
        //   1104: astore_3
        //   1105: goto -697 -> 408
        //   1108: astore 4
        //   1110: aconst_null
        //   1111: astore 7
        //   1113: goto -705 -> 408
        //   1116: aconst_null
        //   1117: astore_3
        //   1118: goto -933 -> 185
        //
        // Exception table:
        //   from	to	target	type
        //   278	282	294	java/io/IOException
        //   282	286	316	java/io/IOException
        //   207	223	406	java/lang/Exception
        //   233	256	406	java/lang/Exception
        //   262	274	406	java/lang/Exception
        //   344	351	406	java/lang/Exception
        //   357	365	406	java/lang/Exception
        //   377	388	406	java/lang/Exception
        //   394	403	406	java/lang/Exception
        //   510	543	406	java/lang/Exception
        //   549	561	406	java/lang/Exception
        //   565	569	806	java/io/IOException
        //   569	573	828	java/io/IOException
        //   484	488	850	java/io/IOException
        //   492	496	872	java/io/IOException
        //   26	84	894	finally
        //   905	910	925	java/io/IOException
        //   914	918	949	java/io/IOException
        //   573	611	1024	java/lang/Exception
        //   615	650	1024	java/lang/Exception
        //   655	701	1024	java/lang/Exception
        //   707	739	1024	java/lang/Exception
        //   739	793	1024	java/lang/Exception
        //   973	1002	1024	java/lang/Exception
        //   1005	1019	1024	java/lang/Exception
        //   84	148	1072	finally
        //   148	185	1072	finally
        //   191	201	1079	finally
        //   207	223	1079	finally
        //   233	256	1079	finally
        //   262	274	1079	finally
        //   344	351	1079	finally
        //   357	365	1079	finally
        //   377	388	1079	finally
        //   394	403	1079	finally
        //   414	433	1079	finally
        //   439	462	1079	finally
        //   468	480	1079	finally
        //   510	543	1079	finally
        //   549	561	1079	finally
        //   26	84	1086	java/lang/Exception
        //   84	148	1098	java/lang/Exception
        //   148	185	1098	java/lang/Exception
        //   191	201	1108	java/lang/Exception
      }

      public final boolean acg()
      {
        AppMethodBeat.i(79011);
        try
        {
          ao.a.flv.cm(this.ghy, 0);
          x.b.a(x.b.ghr, this.ghz.anK(), this.ghz.anL(), this.fru);
          this.fru = null;
          AppMethodBeat.o(79011);
          return false;
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.MMPictureLogic", "exception:%s", new Object[] { bo.l(localException) });
        }
      }
    }

    static final class b
      implements az.a
    {
      public Bitmap fru;
      private v ghz;

      public b(v paramv)
      {
        AppMethodBeat.i(79012);
        this.fru = null;
        if (!x.c(paramv))
        {
          paramv = new IllegalArgumentException("from sdcard, picture strategy here must be validity");
          AppMethodBeat.o(79012);
          throw paramv;
        }
        this.ghz = paramv;
        AppMethodBeat.o(79012);
      }

      public final boolean acf()
      {
        boolean bool = false;
        AppMethodBeat.i(79013);
        this.fru = x.b.vv(this.ghz.anJ());
        if (this.fru != null)
          this.fru = x.b.ghr.a(this.ghz, this.fru);
        String str1 = this.ghz.anK();
        String str2 = this.ghz.anJ();
        if (this.fru != null)
          bool = true;
        ab.v("MicroMsg.MMPictureLogic", "get url[%s] from[%s] result[%B]", new Object[] { str1, str2, Boolean.valueOf(bool) });
        AppMethodBeat.o(79013);
        return true;
      }

      public final boolean acg()
      {
        AppMethodBeat.i(79014);
        if (this.fru == null)
        {
          ab.d("MicroMsg.MMPictureLogic", "can not find bitmap on sdCard, url=%s, try to download it", new Object[] { this.ghz.anK() });
          if ((x.b.a(x.b.ghr) == null) || (x.b.a(x.b.ghr).dpg()))
            x.b.a(x.b.ghr, new az(1, "readerapp-pic-logic-download", 3));
          x.b.a(x.b.ghr).e(new x.b.a(this.ghz));
        }
        while (true)
        {
          AppMethodBeat.o(79014);
          return false;
          x.b.a(x.b.ghr, this.ghz.anK(), this.ghz.anL(), this.fru);
          this.fru = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.x
 * JD-Core Version:    0.6.2
 */