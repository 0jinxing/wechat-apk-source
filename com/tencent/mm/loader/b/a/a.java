package com.tencent.mm.loader.b.a;

import a.f.b.j;
import a.k.m;
import a.l;
import a.v;
import android.graphics.Bitmap;
import com.tencent.mm.loader.c.e;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/cache/disk/BitmapDiskCache;", "T", "Lcom/tencent/mm/loader/cache/disk/IDiskCache;", "Landroid/graphics/Bitmap;", "()V", "mFileNameCreator", "Lcom/tencent/mm/loader/listener/ILoadFileNameCreator;", "buildFilePath", "", "url", "Lcom/tencent/mm/loader/model/data/DataItem;", "opts", "Lcom/tencent/mm/loader/cfg/ImageLoaderOptions;", "reaper", "Lcom/tencent/mm/loader/Reaper;", "delete", "", "exists", "save", "httpResponse", "Lcom/tencent/mm/loader/model/Response;", "source", "Lcom/tencent/mm/loader/model/Resource;", "resource", "Companion", "libimageloader_release"})
public abstract class a<T> extends d<T, Bitmap>
{
  private static final String TAG = "MicroMsg.Loader.IDiskCache";
  public static final a.a ePj = new a.a((byte)0);
  private com.tencent.mm.loader.f.f ePi;

  public String a(com.tencent.mm.loader.h.a.a<T> parama, e parame, com.tencent.mm.loader.f<?, Bitmap> paramf)
  {
    j.p(parama, "url");
    j.p(parame, "opts");
    j.p(paramf, "reaper");
    String str1 = parame.Tx();
    if (str1 != null)
    {
      paramf = str1;
      if (str1.length() != 0);
    }
    else
    {
      String str2 = parame.Tv();
      paramf = str1;
      if (str2 != null)
      {
        paramf = str1;
        if (str2.length() > 0)
        {
          parame = parame.Tw();
          if ((parame == null) || (parame.length() == 0) || (!m.jb(str2, parame)))
          {
            ab.e(TAG, "[johnw] SFS can't deal with absolute path: %s", new Object[] { str2 });
            throw ((Throwable)new IllegalArgumentException("SFS can't deal with absolute path: ".concat(String.valueOf(str2))));
          }
          parame = str2.substring(parame.length());
          j.o(parame, "(this as java.lang.String).substring(startIndex)");
          paramf = parame;
          if (m.jb(parame, "/"))
          {
            if (parame == null)
              throw new v("null cannot be cast to non-null type java.lang.String");
            paramf = parame.substring(1);
            j.o(paramf, "(this as java.lang.String).substring(startIndex)");
          }
        }
      }
    }
    if (paramf != null)
    {
      parame = paramf;
      if (paramf.length() != 0);
    }
    else
    {
      parame = this.ePi;
      if (parame == null)
        j.dWJ();
      parame = parame.b(parama);
    }
    if (parame != null)
    {
      parama = parame;
      if (parame.length() != 0);
    }
    else
    {
      parama = "";
    }
    return parama;
  }

  // ERROR //
  public final boolean a(com.tencent.mm.loader.h.a.a<T> parama, com.tencent.mm.loader.h.f<?> paramf, com.tencent.mm.loader.h.e<Bitmap> parame1, com.tencent.mm.loader.h.e<Bitmap> parame2, e parame, com.tencent.mm.loader.f<?, Bitmap> paramf1)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 7
    //   3: aload_1
    //   4: ldc 62
    //   6: invokestatic 68	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   9: aload_2
    //   10: ldc 153
    //   12: invokestatic 68	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_3
    //   16: ldc 154
    //   18: invokestatic 68	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload 5
    //   23: ldc 69
    //   25: invokestatic 68	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   28: aload 6
    //   30: ldc 70
    //   32: invokestatic 68	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   35: aload_0
    //   36: aload_1
    //   37: aload_2
    //   38: aload 5
    //   40: aload 6
    //   42: invokevirtual 157	com/tencent/mm/loader/b/a/a:a	(Lcom/tencent/mm/loader/h/a/a;Lcom/tencent/mm/loader/h/f;Lcom/tencent/mm/loader/c/e;Lcom/tencent/mm/loader/f;)Z
    //   45: pop
    //   46: aload_0
    //   47: aload_1
    //   48: aload 5
    //   50: aload 6
    //   52: invokevirtual 159	com/tencent/mm/loader/b/a/a:a	(Lcom/tencent/mm/loader/h/a/a;Lcom/tencent/mm/loader/c/e;Lcom/tencent/mm/loader/f;)Ljava/lang/String;
    //   55: astore 8
    //   57: getstatic 56	com/tencent/mm/loader/b/a/a:TAG	Ljava/lang/String;
    //   60: new 161	java/lang/StringBuilder
    //   63: dup
    //   64: ldc 163
    //   66: invokespecial 164	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   69: aload_1
    //   70: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   73: ldc 170
    //   75: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload 8
    //   80: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: invokevirtual 176	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokestatic 180	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   89: getstatic 186	com/tencent/mm/loader/b/a/c:ePl	Lcom/tencent/mm/loader/b/a/c;
    //   92: astore_3
    //   93: aload 8
    //   95: aload 5
    //   97: invokevirtual 190	com/tencent/mm/loader/c/e:TF	()Lcom/tencent/mm/modelsfs/SFSContext;
    //   100: invokestatic 193	com/tencent/mm/loader/b/a/c:a	(Ljava/lang/String;Lcom/tencent/mm/modelsfs/SFSContext;)Ljava/io/OutputStream;
    //   103: astore 8
    //   105: aload 8
    //   107: ifnull +80 -> 187
    //   110: aload 8
    //   112: checkcast 195	java/io/Closeable
    //   115: astore_3
    //   116: iconst_0
    //   117: istore 9
    //   119: aload 4
    //   121: ifnull +36 -> 157
    //   124: getstatic 186	com/tencent/mm/loader/b/a/c:ePl	Lcom/tencent/mm/loader/b/a/c;
    //   127: astore 10
    //   129: aload 4
    //   131: invokevirtual 201	com/tencent/mm/loader/h/e:value	()Ljava/lang/Object;
    //   134: astore 4
    //   136: aload 4
    //   138: ldc 203
    //   140: invokestatic 130	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   143: aload 4
    //   145: checkcast 205	android/graphics/Bitmap
    //   148: aload 8
    //   150: invokestatic 208	com/tencent/mm/loader/b/a/c:a	(Landroid/graphics/Bitmap;Ljava/io/OutputStream;)Z
    //   153: pop
    //   154: iconst_1
    //   155: istore 9
    //   157: iload 9
    //   159: ifne +9 -> 168
    //   162: aload_2
    //   163: aload 8
    //   165: invokevirtual 213	com/tencent/mm/loader/h/f:a	(Ljava/io/OutputStream;)V
    //   168: aload_0
    //   169: aload_1
    //   170: aload 5
    //   172: aload 6
    //   174: invokevirtual 216	com/tencent/mm/loader/b/a/a:b	(Lcom/tencent/mm/loader/h/a/a;Lcom/tencent/mm/loader/c/e;Lcom/tencent/mm/loader/f;)Z
    //   177: pop
    //   178: getstatic 222	a/y:AUy	La/y;
    //   181: astore_1
    //   182: aload_3
    //   183: aconst_null
    //   184: invokestatic 227	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   187: iconst_1
    //   188: ireturn
    //   189: astore_2
    //   190: aload_2
    //   191: athrow
    //   192: astore_1
    //   193: aload_3
    //   194: aload_2
    //   195: invokestatic 227	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   198: aload_1
    //   199: athrow
    //   200: astore_1
    //   201: aload 7
    //   203: astore_2
    //   204: goto -11 -> 193
    //
    // Exception table:
    //   from	to	target	type
    //   124	154	189	java/lang/Throwable
    //   162	168	189	java/lang/Throwable
    //   168	182	189	java/lang/Throwable
    //   190	192	192	finally
    //   124	154	200	finally
    //   162	168	200	finally
    //   168	182	200	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.b.a.a
 * JD-Core Version:    0.6.2
 */