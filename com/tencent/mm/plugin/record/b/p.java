package com.tencent.mm.plugin.record.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;

final class p
  implements v
{
  private int height;
  private String mii;
  private String url;
  private int width;

  public p(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24175);
    this.mii = paramString1;
    this.url = paramString2;
    this.width = paramInt1;
    this.height = paramInt2;
    paramString1 = new StringBuilder();
    aw.ZK();
    paramString1 = new File(c.Yg() + "web/");
    if (!paramString1.exists())
      paramString1.mkdirs();
    AppMethodBeat.o(24175);
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  // ERROR //
  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    // Byte code:
    //   0: sipush 24178
    //   3: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: astore_3
    //   8: getstatic 85	com/tencent/mm/platformtools/v$a:ghm	Lcom/tencent/mm/platformtools/v$a;
    //   11: aload_2
    //   12: if_acmpne +133 -> 145
    //   15: aload_1
    //   16: astore_3
    //   17: ldc 87
    //   19: ldc 89
    //   21: iconst_1
    //   22: anewarray 4	java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: aload_0
    //   28: getfield 27	com/tencent/mm/plugin/record/b/p:url	Ljava/lang/String;
    //   31: aastore
    //   32: invokestatic 95	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   35: aload_1
    //   36: astore_2
    //   37: aload_1
    //   38: astore_3
    //   39: aload_0
    //   40: getfield 29	com/tencent/mm/plugin/record/b/p:width	I
    //   43: ifle +30 -> 73
    //   46: aload_1
    //   47: astore_2
    //   48: aload_1
    //   49: astore_3
    //   50: aload_0
    //   51: getfield 31	com/tencent/mm/plugin/record/b/p:height	I
    //   54: ifle +19 -> 73
    //   57: aload_1
    //   58: astore_3
    //   59: aload_1
    //   60: aload_0
    //   61: getfield 29	com/tencent/mm/plugin/record/b/p:width	I
    //   64: aload_0
    //   65: getfield 31	com/tencent/mm/plugin/record/b/p:height	I
    //   68: iconst_1
    //   69: invokestatic 101	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   72: astore_2
    //   73: aload_2
    //   74: astore_3
    //   75: aload_0
    //   76: invokevirtual 104	com/tencent/mm/plugin/record/b/p:anJ	()Ljava/lang/String;
    //   79: astore 4
    //   81: aload_2
    //   82: astore_3
    //   83: new 42	java/io/File
    //   86: astore_1
    //   87: aload_2
    //   88: astore_3
    //   89: aload_1
    //   90: aload 4
    //   92: invokespecial 60	java/io/File:<init>	(Ljava/lang/String;)V
    //   95: aload_2
    //   96: astore_3
    //   97: aload_1
    //   98: invokevirtual 107	java/io/File:createNewFile	()Z
    //   101: pop
    //   102: new 109	java/io/FileOutputStream
    //   105: astore 4
    //   107: aload 4
    //   109: aload_1
    //   110: invokespecial 112	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   113: aload 4
    //   115: astore_1
    //   116: aload_2
    //   117: getstatic 118	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   120: bipush 100
    //   122: aload 4
    //   124: invokevirtual 124	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   127: pop
    //   128: aload 4
    //   130: astore_1
    //   131: aload 4
    //   133: invokevirtual 127	java/io/FileOutputStream:flush	()V
    //   136: aload_2
    //   137: astore_3
    //   138: aload 4
    //   140: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   143: aload_2
    //   144: astore_3
    //   145: sipush 24178
    //   148: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   151: aload_3
    //   152: areturn
    //   153: astore_3
    //   154: aconst_null
    //   155: astore 4
    //   157: aload 4
    //   159: astore_1
    //   160: ldc 87
    //   162: aload_3
    //   163: ldc 132
    //   165: iconst_0
    //   166: anewarray 4	java/lang/Object
    //   169: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload_2
    //   173: astore_3
    //   174: aload 4
    //   176: ifnull -31 -> 145
    //   179: aload_2
    //   180: astore_3
    //   181: aload 4
    //   183: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   186: aload_2
    //   187: astore_3
    //   188: goto -43 -> 145
    //   191: astore_1
    //   192: ldc 87
    //   194: aload_1
    //   195: ldc 132
    //   197: iconst_0
    //   198: anewarray 4	java/lang/Object
    //   201: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   204: goto -59 -> 145
    //   207: astore 4
    //   209: aconst_null
    //   210: astore_1
    //   211: aload_1
    //   212: ifnull +9 -> 221
    //   215: aload_2
    //   216: astore_3
    //   217: aload_1
    //   218: invokevirtual 130	java/io/FileOutputStream:close	()V
    //   221: aload_2
    //   222: astore_3
    //   223: sipush 24178
    //   226: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   229: aload_2
    //   230: astore_3
    //   231: aload 4
    //   233: athrow
    //   234: astore 4
    //   236: goto -25 -> 211
    //   239: astore_3
    //   240: goto -83 -> 157
    //
    // Exception table:
    //   from	to	target	type
    //   102	113	153	java/io/FileNotFoundException
    //   17	35	191	java/io/IOException
    //   39	46	191	java/io/IOException
    //   50	57	191	java/io/IOException
    //   59	73	191	java/io/IOException
    //   75	81	191	java/io/IOException
    //   83	87	191	java/io/IOException
    //   89	95	191	java/io/IOException
    //   97	102	191	java/io/IOException
    //   138	143	191	java/io/IOException
    //   181	186	191	java/io/IOException
    //   217	221	191	java/io/IOException
    //   223	229	191	java/io/IOException
    //   231	234	191	java/io/IOException
    //   102	113	207	finally
    //   116	128	234	finally
    //   131	136	234	finally
    //   160	172	234	finally
    //   116	128	239	java/io/FileNotFoundException
    //   131	136	239	java/io/FileNotFoundException
  }

  public final void a(v.a parama, String paramString)
  {
  }

  public final v.b anI()
  {
    return null;
  }

  public final String anJ()
  {
    AppMethodBeat.i(24176);
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = c.Yg() + "web/" + g.x(this.url.getBytes());
    AppMethodBeat.o(24176);
    return localObject;
  }

  public final String anK()
  {
    return this.url;
  }

  public final String anL()
  {
    return this.mii;
  }

  public final boolean anM()
  {
    return true;
  }

  public final boolean anN()
  {
    return false;
  }

  public final Bitmap anO()
  {
    AppMethodBeat.i(24177);
    Bitmap localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839709);
    AppMethodBeat.o(24177);
    return localBitmap;
  }

  public final void anP()
  {
  }

  public final String getCacheKey()
  {
    return this.mii;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.p
 * JD-Core Version:    0.6.2
 */