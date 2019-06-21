package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.sdk.platformtools.ah;

public final class c
  implements v
{
  private int height;
  private String mii;
  private String url;
  private int width;

  public c(String paramString1, String paramString2)
  {
    this.mii = paramString1;
    this.url = paramString2;
    this.width = 0;
    this.height = 0;
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  // ERROR //
  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    // Byte code:
    //   0: ldc 35
    //   2: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: astore_3
    //   7: getstatic 47	com/tencent/mm/platformtools/v$a:ghm	Lcom/tencent/mm/platformtools/v$a;
    //   10: aload_2
    //   11: if_acmpne +133 -> 144
    //   14: aload_1
    //   15: astore_3
    //   16: ldc 49
    //   18: ldc 51
    //   20: iconst_1
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: aload_0
    //   27: getfield 21	com/tencent/mm/pluginsdk/ui/tools/c:url	Ljava/lang/String;
    //   30: aastore
    //   31: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: aload_1
    //   35: astore_2
    //   36: aload_1
    //   37: astore_3
    //   38: aload_0
    //   39: getfield 23	com/tencent/mm/pluginsdk/ui/tools/c:width	I
    //   42: ifle +30 -> 72
    //   45: aload_1
    //   46: astore_2
    //   47: aload_1
    //   48: astore_3
    //   49: aload_0
    //   50: getfield 25	com/tencent/mm/pluginsdk/ui/tools/c:height	I
    //   53: ifle +19 -> 72
    //   56: aload_1
    //   57: astore_3
    //   58: aload_1
    //   59: aload_0
    //   60: getfield 23	com/tencent/mm/pluginsdk/ui/tools/c:width	I
    //   63: aload_0
    //   64: getfield 25	com/tencent/mm/pluginsdk/ui/tools/c:height	I
    //   67: iconst_1
    //   68: invokestatic 63	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   71: astore_2
    //   72: aload_2
    //   73: astore_3
    //   74: aload_0
    //   75: invokevirtual 67	com/tencent/mm/pluginsdk/ui/tools/c:anJ	()Ljava/lang/String;
    //   78: astore 4
    //   80: aload_2
    //   81: astore_3
    //   82: new 69	java/io/File
    //   85: astore_1
    //   86: aload_2
    //   87: astore_3
    //   88: aload_1
    //   89: aload 4
    //   91: invokespecial 72	java/io/File:<init>	(Ljava/lang/String;)V
    //   94: aload_2
    //   95: astore_3
    //   96: aload_1
    //   97: invokevirtual 76	java/io/File:createNewFile	()Z
    //   100: pop
    //   101: new 78	java/io/FileOutputStream
    //   104: astore 4
    //   106: aload 4
    //   108: aload_1
    //   109: invokespecial 81	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   112: aload 4
    //   114: astore_1
    //   115: aload_2
    //   116: getstatic 87	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   119: bipush 100
    //   121: aload 4
    //   123: invokevirtual 93	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   126: pop
    //   127: aload 4
    //   129: astore_1
    //   130: aload 4
    //   132: invokevirtual 96	java/io/FileOutputStream:flush	()V
    //   135: aload_2
    //   136: astore_3
    //   137: aload 4
    //   139: invokevirtual 99	java/io/FileOutputStream:close	()V
    //   142: aload_2
    //   143: astore_3
    //   144: ldc 35
    //   146: invokestatic 102	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: aload_3
    //   150: areturn
    //   151: astore_3
    //   152: aconst_null
    //   153: astore 4
    //   155: aload 4
    //   157: astore_1
    //   158: ldc 49
    //   160: aload_3
    //   161: ldc 104
    //   163: iconst_0
    //   164: anewarray 4	java/lang/Object
    //   167: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   170: aload_2
    //   171: astore_3
    //   172: aload 4
    //   174: ifnull -30 -> 144
    //   177: aload_2
    //   178: astore_3
    //   179: aload 4
    //   181: invokevirtual 99	java/io/FileOutputStream:close	()V
    //   184: aload_2
    //   185: astore_3
    //   186: goto -42 -> 144
    //   189: astore_1
    //   190: ldc 49
    //   192: aload_1
    //   193: ldc 104
    //   195: iconst_0
    //   196: anewarray 4	java/lang/Object
    //   199: invokestatic 108	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: goto -58 -> 144
    //   205: astore 4
    //   207: aconst_null
    //   208: astore_1
    //   209: aload_1
    //   210: ifnull +9 -> 219
    //   213: aload_2
    //   214: astore_3
    //   215: aload_1
    //   216: invokevirtual 99	java/io/FileOutputStream:close	()V
    //   219: aload_2
    //   220: astore_3
    //   221: ldc 35
    //   223: invokestatic 102	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: aload_2
    //   227: astore_3
    //   228: aload 4
    //   230: athrow
    //   231: astore 4
    //   233: goto -24 -> 209
    //   236: astore_3
    //   237: goto -82 -> 155
    //
    // Exception table:
    //   from	to	target	type
    //   101	112	151	java/io/FileNotFoundException
    //   16	34	189	java/io/IOException
    //   38	45	189	java/io/IOException
    //   49	56	189	java/io/IOException
    //   58	72	189	java/io/IOException
    //   74	80	189	java/io/IOException
    //   82	86	189	java/io/IOException
    //   88	94	189	java/io/IOException
    //   96	101	189	java/io/IOException
    //   137	142	189	java/io/IOException
    //   179	184	189	java/io/IOException
    //   215	219	189	java/io/IOException
    //   221	226	189	java/io/IOException
    //   228	231	189	java/io/IOException
    //   101	112	205	finally
    //   115	127	231	finally
    //   130	135	231	finally
    //   158	170	231	finally
    //   115	127	236	java/io/FileNotFoundException
    //   130	135	236	java/io/FileNotFoundException
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
    AppMethodBeat.i(79913);
    String str = com.tencent.mm.plugin.i.c.XW() + "/" + g.x(this.url.getBytes());
    AppMethodBeat.o(79913);
    return str;
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
    AppMethodBeat.i(79914);
    Bitmap localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839709);
    AppMethodBeat.o(79914);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.c
 * JD-Core Version:    0.6.2
 */