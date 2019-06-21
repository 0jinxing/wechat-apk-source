package com.tencent.mm.modelappbrand.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static final String fqf;
  private final Map<b.i, String> fpZ;
  private final Map<String, b.i> fqa;
  private final Map<Integer, String> fqb;
  private final b.d fqc;
  private final b.j fqd;
  private final g fqe;

  static
  {
    AppMethodBeat.i(77381);
    String str1 = com.tencent.mm.compatible.util.e.eSn;
    String str2 = str1;
    if (!str1.endsWith("/"))
      str2 = str1 + "/";
    str2 = str2 + "wxacache/";
    fqf = str2;
    com.tencent.mm.vfs.e.tf(str2);
    AppMethodBeat.o(77381);
  }

  private b()
  {
    AppMethodBeat.i(77361);
    this.fpZ = new ConcurrentHashMap();
    this.fqa = new ConcurrentHashMap();
    this.fqb = new ConcurrentHashMap();
    this.fqd = new b.c();
    this.fqe = new b.a((byte)0);
    this.fqc = new b.d(new ak(new al("AppBrandSimpleImageLoaderDiskIOHandlerThread").oAl.getLooper()), (byte)0);
    AppMethodBeat.o(77361);
  }

  private static String a(String paramString, b.f paramf, e parame)
  {
    AppMethodBeat.i(77373);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    if (paramf != null)
    {
      localStringBuilder.append("|transformation:");
      localStringBuilder.append(paramf.wP());
    }
    if (parame != null)
    {
      localStringBuilder.append("|decoder:");
      localStringBuilder.append(parame.wP());
    }
    paramString = localStringBuilder.toString();
    AppMethodBeat.o(77373);
    return paramString;
  }

  public static b abR()
  {
    return b.m.fqG;
  }

  private static String ar(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77372);
    paramString1 = paramString1 + paramString2;
    AppMethodBeat.o(77372);
    return paramString1;
  }

  private void e(ImageView paramImageView)
  {
    AppMethodBeat.i(77362);
    if (paramImageView == null)
      AppMethodBeat.o(77362);
    while (true)
    {
      return;
      paramImageView = (String)this.fqb.get(Integer.valueOf(paramImageView.hashCode()));
      if (paramImageView == null)
      {
        AppMethodBeat.o(77362);
      }
      else
      {
        paramImageView = (b.i)this.fqa.get(paramImageView);
        if (paramImageView == null)
        {
          AppMethodBeat.o(77362);
        }
        else
        {
          paramImageView = (String)this.fpZ.get(paramImageView);
          if (!bo.isNullOrNil(paramImageView))
            this.fqa.remove(paramImageView);
          AppMethodBeat.o(77362);
        }
      }
    }
  }

  private static String pE(String paramString)
  {
    AppMethodBeat.i(77374);
    String str = null;
    if (!bo.isNullOrNil(paramString))
      str = g.x(paramString.getBytes());
    AppMethodBeat.o(77374);
    return str;
  }

  // ERROR //
  public final Bitmap a(String paramString, e parame)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc 241
    //   4: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_1
    //   8: invokestatic 215	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   11: ifeq +12 -> 23
    //   14: ldc 241
    //   16: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: aload_3
    //   20: astore_1
    //   21: aload_1
    //   22: areturn
    //   23: aload_1
    //   24: aconst_null
    //   25: aload_2
    //   26: invokestatic 188	com/tencent/mm/modelappbrand/a/b:a	(Ljava/lang/String;Lcom/tencent/mm/modelappbrand/a/b$f;Lcom/tencent/mm/modelappbrand/a/b$e;)Ljava/lang/String;
    //   29: astore 4
    //   31: aload_0
    //   32: getfield 112	com/tencent/mm/modelappbrand/a/b:fqd	Lcom/tencent/mm/modelappbrand/a/b$j;
    //   35: aload 4
    //   37: invokeinterface 245 2 0
    //   42: astore 5
    //   44: aload 5
    //   46: ifnull +14 -> 60
    //   49: ldc 241
    //   51: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: aload 5
    //   56: astore_1
    //   57: goto -36 -> 21
    //   60: aload_1
    //   61: ldc 247
    //   63: invokevirtual 250	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   66: istore 6
    //   68: iload 6
    //   70: ifeq +80 -> 150
    //   73: aload_1
    //   74: invokestatic 254	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   77: astore_1
    //   78: aload_2
    //   79: ifnull +88 -> 167
    //   82: aload_1
    //   83: astore 5
    //   85: aload_2
    //   86: aload_1
    //   87: invokeinterface 258 2 0
    //   92: astore_2
    //   93: aload_2
    //   94: ifnull +18 -> 112
    //   97: aload_1
    //   98: astore 5
    //   100: aload_0
    //   101: getfield 112	com/tencent/mm/modelappbrand/a/b:fqd	Lcom/tencent/mm/modelappbrand/a/b$j;
    //   104: aload 4
    //   106: aload_2
    //   107: invokeinterface 261 3 0
    //   112: aload_1
    //   113: invokestatic 264	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   116: ldc 241
    //   118: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   121: aload_2
    //   122: astore_1
    //   123: goto -102 -> 21
    //   126: astore_1
    //   127: ldc_w 266
    //   130: ldc_w 268
    //   133: invokestatic 273	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: aconst_null
    //   137: invokestatic 264	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   140: ldc 241
    //   142: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: aload_3
    //   146: astore_1
    //   147: goto -126 -> 21
    //   150: aload_0
    //   151: getfield 117	com/tencent/mm/modelappbrand/a/b:fqe	Lcom/tencent/mm/modelappbrand/a/b$g;
    //   154: aload_1
    //   155: invokestatic 235	com/tencent/mm/modelappbrand/a/b:pE	(Ljava/lang/String;)Ljava/lang/String;
    //   158: invokeinterface 274 2 0
    //   163: astore_1
    //   164: goto -86 -> 78
    //   167: aload_1
    //   168: astore 5
    //   170: aload_1
    //   171: invokestatic 279	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   174: astore_2
    //   175: goto -82 -> 93
    //   178: astore_2
    //   179: aconst_null
    //   180: astore_1
    //   181: aload_1
    //   182: astore 5
    //   184: ldc_w 266
    //   187: aload_2
    //   188: ldc_w 281
    //   191: iconst_0
    //   192: anewarray 4	java/lang/Object
    //   195: invokestatic 285	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   198: aload_1
    //   199: invokestatic 264	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   202: ldc 241
    //   204: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: aload_3
    //   208: astore_1
    //   209: goto -188 -> 21
    //   212: astore_1
    //   213: aconst_null
    //   214: astore 5
    //   216: aload 5
    //   218: invokestatic 264	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   221: ldc 241
    //   223: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: aload_1
    //   227: athrow
    //   228: astore_1
    //   229: goto -13 -> 216
    //   232: astore_2
    //   233: goto -52 -> 181
    //
    // Exception table:
    //   from	to	target	type
    //   73	78	126	java/io/FileNotFoundException
    //   60	68	178	java/lang/Exception
    //   73	78	178	java/lang/Exception
    //   127	136	178	java/lang/Exception
    //   150	164	178	java/lang/Exception
    //   60	68	212	finally
    //   73	78	212	finally
    //   127	136	212	finally
    //   150	164	212	finally
    //   85	93	228	finally
    //   100	112	228	finally
    //   170	175	228	finally
    //   184	198	228	finally
    //   85	93	232	java/lang/Exception
    //   100	112	232	java/lang/Exception
    //   170	175	232	java/lang/Exception
  }

  public final String a(ImageView paramImageView, String paramString, int paramInt, b.f paramf)
  {
    AppMethodBeat.i(77368);
    if (paramImageView == null)
    {
      paramImageView = null;
      AppMethodBeat.o(77368);
    }
    while (true)
    {
      return paramImageView;
      paramImageView = a(paramImageView, paramString, paramImageView.getContext().getResources().getDrawable(paramInt), paramf);
      AppMethodBeat.o(77368);
    }
  }

  public final String a(ImageView paramImageView, String paramString, Drawable paramDrawable, b.f paramf)
  {
    AppMethodBeat.i(77369);
    paramImageView = a(paramImageView, paramString, paramDrawable, paramf, null);
    AppMethodBeat.o(77369);
    return paramImageView;
  }

  public final String a(ImageView paramImageView, String paramString, Drawable paramDrawable, b.f paramf, e parame)
  {
    Object localObject = null;
    AppMethodBeat.i(77370);
    if (paramImageView == null)
    {
      AppMethodBeat.o(77370);
      paramImageView = localObject;
    }
    while (true)
    {
      return paramImageView;
      e(paramImageView);
      if (bo.isNullOrNil(paramString))
      {
        if (paramDrawable != null)
          paramImageView.setImageDrawable(paramDrawable);
        AppMethodBeat.o(77370);
        paramImageView = localObject;
      }
      else
      {
        paramDrawable = new b.2(this, paramImageView, this, paramDrawable);
        paramString = a(paramDrawable, paramString, paramf, parame);
        if (!paramDrawable.fqv)
          this.fqb.put(Integer.valueOf(paramImageView.hashCode()), ar(paramDrawable.key, paramString));
        AppMethodBeat.o(77370);
        paramImageView = paramString;
      }
    }
  }

  public final String a(b.i parami, String paramString, b.f paramf)
  {
    AppMethodBeat.i(77367);
    parami = a(parami, paramString, paramf, null);
    AppMethodBeat.o(77367);
    return parami;
  }

  public final String a(b.i parami, String paramString, b.f paramf, e parame)
  {
    Object localObject = null;
    AppMethodBeat.i(77366);
    if (parami == null)
      AppMethodBeat.o(77366);
    for (parami = localObject; ; parami = localObject)
    {
      return parami;
      if (!bo.isNullOrNil(paramString))
        break;
      parami.mr();
      AppMethodBeat.o(77366);
    }
    ab.d("MicroMsg.AppBrandSimpleImageLoader", "load before start LoadTask url %s", new Object[] { paramString });
    parame = new b.l(paramString, paramf, this, this.fqd, this.fqe, parame, parami.wP(), (byte)0);
    paramf = parame.abZ();
    parami = new b.1(this, paramf, parami, paramString, parame);
    if (al.isMainThread())
      parami.run();
    while (true)
    {
      AppMethodBeat.o(77366);
      parami = paramf;
      break;
      al.d(parami);
    }
  }

  public final Bitmap pB(String paramString)
  {
    AppMethodBeat.i(77363);
    paramString = this.fqd.kR(paramString);
    if ((paramString == null) || (paramString.isRecycled()))
    {
      paramString = null;
      AppMethodBeat.o(77363);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(77363);
    }
  }

  public final String pC(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(77365);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(77365);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = a(new b.b(), paramString, null);
      AppMethodBeat.o(77365);
    }
  }

  // ERROR //
  public final byte[] pD(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 385
    //   5: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: invokestatic 215	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   12: ifeq +13 -> 25
    //   15: ldc_w 385
    //   18: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_2
    //   22: astore_3
    //   23: aload_3
    //   24: areturn
    //   25: aload_1
    //   26: ldc 247
    //   28: invokevirtual 250	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   31: istore 4
    //   33: iload 4
    //   35: ifeq +57 -> 92
    //   38: aload_1
    //   39: invokestatic 254	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   42: astore_1
    //   43: aload_1
    //   44: astore_3
    //   45: aload_1
    //   46: invokestatic 391	com/tencent/luggage/g/i:k	(Ljava/io/InputStream;)[B
    //   49: astore 5
    //   51: aload 5
    //   53: astore_3
    //   54: aload_1
    //   55: invokestatic 264	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   58: ldc_w 385
    //   61: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: goto -41 -> 23
    //   67: astore_1
    //   68: ldc_w 266
    //   71: ldc_w 268
    //   74: invokestatic 273	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: aconst_null
    //   78: invokestatic 264	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   81: ldc_w 385
    //   84: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_2
    //   88: astore_3
    //   89: goto -66 -> 23
    //   92: aload_0
    //   93: getfield 117	com/tencent/mm/modelappbrand/a/b:fqe	Lcom/tencent/mm/modelappbrand/a/b$g;
    //   96: aload_1
    //   97: invokestatic 235	com/tencent/mm/modelappbrand/a/b:pE	(Ljava/lang/String;)Ljava/lang/String;
    //   100: invokeinterface 274 2 0
    //   105: astore_1
    //   106: goto -63 -> 43
    //   109: astore 5
    //   111: aconst_null
    //   112: astore_1
    //   113: aload_1
    //   114: astore_3
    //   115: ldc_w 266
    //   118: aload 5
    //   120: ldc_w 281
    //   123: iconst_0
    //   124: anewarray 4	java/lang/Object
    //   127: invokestatic 285	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload_1
    //   131: invokestatic 264	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   134: ldc_w 385
    //   137: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   140: aload_2
    //   141: astore_3
    //   142: goto -119 -> 23
    //   145: astore_1
    //   146: aconst_null
    //   147: astore_3
    //   148: aload_3
    //   149: invokestatic 264	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   152: ldc_w 385
    //   155: invokestatic 97	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: aload_1
    //   159: athrow
    //   160: astore_1
    //   161: goto -13 -> 148
    //   164: astore 5
    //   166: goto -53 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   38	43	67	java/io/FileNotFoundException
    //   25	33	109	java/lang/Exception
    //   38	43	109	java/lang/Exception
    //   68	77	109	java/lang/Exception
    //   92	106	109	java/lang/Exception
    //   25	33	145	finally
    //   38	43	145	finally
    //   68	77	145	finally
    //   92	106	145	finally
    //   45	51	160	finally
    //   115	130	160	finally
    //   45	51	164	java/lang/Exception
  }

  public final void pF(String paramString)
  {
    AppMethodBeat.i(77375);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(77375);
    while (true)
    {
      return;
      paramString = pE(paramString);
      if (this.fqc.pK(paramString))
      {
        AppMethodBeat.o(77375);
      }
      else
      {
        this.fqe.pI(paramString);
        AppMethodBeat.o(77375);
      }
    }
  }

  static abstract interface d$a
  {
    public abstract void abV();

    public abstract void abW();
  }

  public static abstract interface e extends c
  {
    public abstract Bitmap v(InputStream paramInputStream);
  }

  public static abstract interface g
  {
    public abstract InputStream openRead(String paramString);

    public abstract OutputStream pH(String paramString);

    public abstract boolean pI(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b
 * JD-Core Version:    0.6.2
 */