package com.tencent.mm.modelappbrand.a;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class b$l
  implements b.d.a
{
  private final String fqA;
  boolean fqB = true;
  final b.g fqe;
  final b fqu;
  final String fqw;
  private final b.f fqx;
  private final b.j fqy;
  private final b.e fqz;

  private b$l(String paramString1, b.f paramf, b paramb, b.j paramj, b.g paramg, b.e parame, String paramString2)
  {
    this.fqw = paramString1;
    this.fqx = paramf;
    this.fqu = paramb;
    this.fqy = paramj;
    this.fqe = paramg;
    this.fqz = parame;
    this.fqA = paramString2;
  }

  private void A(Bitmap paramBitmap)
  {
    boolean bool1 = false;
    AppMethodBeat.i(77357);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()));
    for (boolean bool2 = true; ; bool2 = false)
    {
      ab.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInWorkerThread bitmap ok %b", new Object[] { Boolean.valueOf(bool2) });
      final Bitmap localBitmap = paramBitmap;
      if (this.fqx != null)
      {
        localBitmap = paramBitmap;
        if (paramBitmap != null)
        {
          localBitmap = paramBitmap;
          if (!paramBitmap.isRecycled())
          {
            localBitmap = z(paramBitmap);
            ab.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInWorkerThread, transform bmp, origin %s, transformed %s", new Object[] { paramBitmap, localBitmap });
            if (localBitmap != paramBitmap)
              this.fqy.f(paramBitmap);
          }
        }
      }
      this.fqy.c(abZ(), localBitmap);
      bool2 = bool1;
      if (localBitmap != null)
      {
        bool2 = bool1;
        if (!localBitmap.isRecycled())
          bool2 = true;
      }
      ab.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInWorkerThread before post to main thread, bitmap %s, ok %b", new Object[] { localBitmap, Boolean.valueOf(bool2) });
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(77347);
          b.l locall = b.l.this;
          Object localObject = localBitmap;
          if ((localObject == null) || (((Bitmap)localObject).isRecycled()))
          {
            ab.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInMainThread, onLoadFailed bmp %s", new Object[] { localObject });
            localObject = (b.i)b.b(locall.fqu).remove(locall.abY());
            if (localObject != null)
            {
              ((b.i)localObject).mr();
              b.a(locall.fqu).remove(localObject);
            }
            AppMethodBeat.o(77347);
          }
          while (true)
          {
            return;
            ab.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "postLoadInMainThread, onBitmapLoaded bmp %s", new Object[] { localObject });
            locall.x((Bitmap)localObject);
            AppMethodBeat.o(77347);
          }
        }
      });
      AppMethodBeat.o(77357);
      return;
    }
  }

  // ERROR //
  private Bitmap acb()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 121
    //   6: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: invokestatic 124	com/tencent/mm/modelappbrand/a/b:abT	()Z
    //   12: ifne +25 -> 37
    //   15: ldc 68
    //   17: ldc 126
    //   19: invokestatic 129	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: new 131	com/tencent/mm/modelappbrand/a/d$c
    //   25: dup
    //   26: invokespecial 132	com/tencent/mm/modelappbrand/a/d$c:<init>	()V
    //   29: astore_3
    //   30: ldc 121
    //   32: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: aload_3
    //   36: athrow
    //   37: aload_0
    //   38: getfield 35	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   41: ldc 134
    //   43: invokevirtual 140	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   46: ifne +15 -> 61
    //   49: aload_0
    //   50: getfield 35	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   53: ldc 142
    //   55: invokevirtual 140	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   58: ifeq +105 -> 163
    //   61: aload_0
    //   62: getfield 35	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   65: invokestatic 148	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   68: astore_3
    //   69: aload_3
    //   70: ifnull +263 -> 333
    //   73: aload_0
    //   74: aload_3
    //   75: invokespecial 152	com/tencent/mm/modelappbrand/a/b$l:w	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   78: astore_3
    //   79: aload_3
    //   80: ifnull +223 -> 303
    //   83: aload_3
    //   84: invokevirtual 66	android/graphics/Bitmap:isRecycled	()Z
    //   87: ifne +216 -> 303
    //   90: ldc 68
    //   92: ldc 154
    //   94: iconst_3
    //   95: anewarray 4	java/lang/Object
    //   98: dup
    //   99: iconst_0
    //   100: aload_3
    //   101: aastore
    //   102: dup
    //   103: iconst_1
    //   104: aload_3
    //   105: invokestatic 159	android/support/v4/a/a:c	(Landroid/graphics/Bitmap;)I
    //   108: sipush 1024
    //   111: idiv
    //   112: invokestatic 164	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   115: aastore
    //   116: dup
    //   117: iconst_2
    //   118: aload_0
    //   119: getfield 35	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   122: aastore
    //   123: invokestatic 82	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   126: ldc 121
    //   128: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: aload_3
    //   132: areturn
    //   133: astore_3
    //   134: ldc 68
    //   136: aload_3
    //   137: ldc 166
    //   139: iconst_1
    //   140: anewarray 4	java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: aload_0
    //   146: getfield 35	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   149: aastore
    //   150: invokestatic 170	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: ldc 121
    //   155: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: aload_1
    //   159: astore_3
    //   160: goto -29 -> 131
    //   163: aload_0
    //   164: getfield 43	com/tencent/mm/modelappbrand/a/b$l:fqe	Lcom/tencent/mm/modelappbrand/a/b$g;
    //   167: aload_0
    //   168: getfield 35	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   171: invokestatic 174	com/tencent/mm/modelappbrand/a/b:pG	(Ljava/lang/String;)Ljava/lang/String;
    //   174: invokeinterface 177 2 0
    //   179: astore 4
    //   181: aload 4
    //   183: astore_3
    //   184: aload 4
    //   186: ifnonnull -117 -> 69
    //   189: ldc 68
    //   191: ldc 179
    //   193: iconst_1
    //   194: anewarray 4	java/lang/Object
    //   197: dup
    //   198: iconst_0
    //   199: aload_0
    //   200: getfield 33	com/tencent/mm/modelappbrand/a/b$l:fqB	Z
    //   203: invokestatic 76	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   206: aastore
    //   207: invokestatic 82	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   210: aload_0
    //   211: getfield 33	com/tencent/mm/modelappbrand/a/b$l:fqB	Z
    //   214: ifeq +22 -> 236
    //   217: new 181	com/tencent/mm/modelappbrand/a/b$l$4
    //   220: dup
    //   221: aload_0
    //   222: invokespecial 184	com/tencent/mm/modelappbrand/a/b$l$4:<init>	(Lcom/tencent/mm/modelappbrand/a/b$l;)V
    //   225: ldc 186
    //   227: invokestatic 192	com/tencent/mm/sdk/g/d:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   230: aload 4
    //   232: astore_3
    //   233: goto -164 -> 69
    //   236: aload_0
    //   237: getfield 39	com/tencent/mm/modelappbrand/a/b$l:fqu	Lcom/tencent/mm/modelappbrand/a/b;
    //   240: invokestatic 195	com/tencent/mm/modelappbrand/a/b:d	(Lcom/tencent/mm/modelappbrand/a/b;)Lcom/tencent/mm/modelappbrand/a/b$d;
    //   243: aload_0
    //   244: getfield 35	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   247: invokestatic 174	com/tencent/mm/modelappbrand/a/b:pG	(Ljava/lang/String;)Ljava/lang/String;
    //   250: invokevirtual 201	com/tencent/mm/modelappbrand/a/b$d:pM	(Ljava/lang/String;)V
    //   253: aload_0
    //   254: getfield 39	com/tencent/mm/modelappbrand/a/b$l:fqu	Lcom/tencent/mm/modelappbrand/a/b;
    //   257: invokestatic 195	com/tencent/mm/modelappbrand/a/b:d	(Lcom/tencent/mm/modelappbrand/a/b;)Lcom/tencent/mm/modelappbrand/a/b$d;
    //   260: aload_0
    //   261: getfield 35	com/tencent/mm/modelappbrand/a/b$l:fqw	Ljava/lang/String;
    //   264: invokestatic 174	com/tencent/mm/modelappbrand/a/b:pG	(Ljava/lang/String;)Ljava/lang/String;
    //   267: invokevirtual 204	com/tencent/mm/modelappbrand/a/b$d:pL	(Ljava/lang/String;)V
    //   270: new 206	com/tencent/mm/modelappbrand/a/d$b
    //   273: dup
    //   274: invokespecial 207	com/tencent/mm/modelappbrand/a/d$b:<init>	()V
    //   277: astore_3
    //   278: ldc 121
    //   280: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   283: aload_3
    //   284: athrow
    //   285: astore_3
    //   286: ldc 68
    //   288: aload_3
    //   289: ldc 209
    //   291: iconst_0
    //   292: anewarray 4	java/lang/Object
    //   295: invokestatic 170	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   298: aload_2
    //   299: astore_3
    //   300: goto -221 -> 79
    //   303: ldc 68
    //   305: ldc 211
    //   307: iconst_1
    //   308: anewarray 4	java/lang/Object
    //   311: dup
    //   312: iconst_0
    //   313: aload_3
    //   314: aastore
    //   315: invokestatic 82	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   318: new 213	com/tencent/mm/modelappbrand/a/d$a
    //   321: dup
    //   322: invokespecial 214	com/tencent/mm/modelappbrand/a/d$a:<init>	()V
    //   325: astore_3
    //   326: ldc 121
    //   328: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   331: aload_3
    //   332: athrow
    //   333: ldc 121
    //   335: invokestatic 114	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   338: aload_1
    //   339: astore_3
    //   340: goto -209 -> 131
    //
    // Exception table:
    //   from	to	target	type
    //   61	69	133	java/io/FileNotFoundException
    //   73	79	285	java/lang/Exception
  }

  private Bitmap w(InputStream paramInputStream)
  {
    AppMethodBeat.i(77359);
    try
    {
      Bitmap localBitmap;
      if (this.fqz != null)
        localBitmap = this.fqz.v(paramInputStream);
      while (true)
      {
        return localBitmap;
        localBitmap = com.tencent.mm.sdk.platformtools.d.decodeStream(paramInputStream);
        bo.b(paramInputStream);
        AppMethodBeat.o(77359);
      }
    }
    finally
    {
      bo.b(paramInputStream);
      AppMethodBeat.o(77359);
    }
  }

  private Bitmap z(Bitmap paramBitmap)
  {
    AppMethodBeat.i(77356);
    paramBitmap = this.fqx.y(paramBitmap);
    AppMethodBeat.o(77356);
    return paramBitmap;
  }

  public final void abV()
  {
    AppMethodBeat.i(77353);
    Object localObject1 = this.fqy.kR(abZ());
    if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
    {
      ab.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "before actually doIOJob, same keyForMemory bitmap already exists, key %s", new Object[] { abZ() });
      al.d(new b.l.1(this, (Bitmap)localObject1));
      AppMethodBeat.o(77353);
    }
    while (true)
    {
      return;
      Object localObject2;
      if (b.d(this.fqu).pK(b.pG(this.fqw)))
      {
        b.d locald = b.d(this.fqu);
        String str = b.pG(this.fqw);
        if (!bo.isNullOrNil(str))
        {
          localObject2 = (List)locald.fqs.get(str);
          localObject1 = localObject2;
          if (localObject2 == null)
          {
            localObject1 = new LinkedList();
            locald.fqs.put(str, localObject1);
          }
          ((List)localObject1).add(this);
        }
        ab.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", "already has job processing, make this job pending, key %s", new Object[] { b.pG(this.fqw) });
        AppMethodBeat.o(77353);
      }
      else
      {
        localObject1 = b.d(this.fqu);
        localObject2 = b.pG(this.fqw);
        if (!bo.isNullOrNil((String)localObject2))
          ((b.d)localObject1).fqt.put(localObject2, Boolean.TRUE);
        aca();
        AppMethodBeat.o(77353);
      }
    }
  }

  public final void abW()
  {
    AppMethodBeat.i(77354);
    b.i locali = (b.i)b.b(this.fqu).remove(abY());
    if (locali != null)
      b.a(this.fqu).remove(locali);
    AppMethodBeat.o(77354);
  }

  final String abY()
  {
    AppMethodBeat.i(77350);
    String str = b.as(this.fqA, abZ());
    AppMethodBeat.o(77350);
    return str;
  }

  final String abZ()
  {
    AppMethodBeat.i(77351);
    String str = b.b(this.fqw, this.fqx, this.fqz);
    AppMethodBeat.o(77351);
    return str;
  }

  final void aca()
  {
    AppMethodBeat.i(77352);
    try
    {
      Bitmap localBitmap = acb();
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        b.d(this.fqu).pL(b.pG(this.fqw));
        b.d(this.fqu).a(b.pG(this.fqw), this);
        A(localBitmap);
        b.d(this.fqu).pJ(b.pG(this.fqw));
      }
      AppMethodBeat.o(77352);
      return;
    }
    catch (d locald)
    {
      while (true)
      {
        ab.d("MicroMsg.AppBrandSimpleImageLoader.LoadTask", " doIOJobImpl, exp %s", new Object[] { locald });
        b.d(this.fqu).pL(b.pG(this.fqw));
        b.d(this.fqu).pM(b.pG(this.fqw));
        A(null);
        if ((locald instanceof d.a))
          b.e(this.fqu).pI(b.pG(this.fqw));
        AppMethodBeat.o(77352);
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandSimpleImageLoader.LoadTask", localIOException, " doIOJobImpl, io exp ", new Object[0]);
        b.d(this.fqu).pL(b.pG(this.fqw));
        b.d(this.fqu).a(b.pG(this.fqw), this);
        b.d(this.fqu).pJ(b.pG(this.fqw));
        AppMethodBeat.o(77352);
      }
    }
  }

  final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(77355);
    b.i locali = (b.i)b.b(this.fqu).remove(abY());
    if (locali != null)
    {
      locali.x(paramBitmap);
      b.a(this.fqu).remove(locali);
    }
    AppMethodBeat.o(77355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.b.l
 * JD-Core Version:    0.6.2
 */