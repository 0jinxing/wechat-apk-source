package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.sdk.platformtools.ah;

public final class d
  implements v
{
  private int height;
  private String mii;
  private String url;
  private int width;

  public d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.mii = paramString1;
    this.url = paramString2;
    this.width = paramInt1;
    this.height = paramInt2;
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
    //   11: if_acmpne +164 -> 175
    //   14: aload_1
    //   15: astore_3
    //   16: ldc 49
    //   18: ldc 51
    //   20: iconst_1
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: aload_0
    //   27: getfield 21	com/tencent/mm/plugin/fav/ui/d:url	Ljava/lang/String;
    //   30: aastore
    //   31: invokestatic 57	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: aload_1
    //   35: astore_3
    //   36: new 59	com/tencent/mm/vfs/b
    //   39: astore_2
    //   40: aload_1
    //   41: astore_3
    //   42: aload_2
    //   43: invokestatic 65	com/tencent/mm/plugin/fav/a/b:bue	()Ljava/lang/String;
    //   46: invokespecial 68	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   49: aload_1
    //   50: astore_3
    //   51: aload_2
    //   52: invokevirtual 72	com/tencent/mm/vfs/b:exists	()Z
    //   55: ifne +10 -> 65
    //   58: aload_1
    //   59: astore_3
    //   60: aload_2
    //   61: invokevirtual 75	com/tencent/mm/vfs/b:mkdirs	()Z
    //   64: pop
    //   65: aload_1
    //   66: astore_2
    //   67: aload_1
    //   68: astore_3
    //   69: aload_0
    //   70: getfield 23	com/tencent/mm/plugin/fav/ui/d:width	I
    //   73: ifle +30 -> 103
    //   76: aload_1
    //   77: astore_2
    //   78: aload_1
    //   79: astore_3
    //   80: aload_0
    //   81: getfield 25	com/tencent/mm/plugin/fav/ui/d:height	I
    //   84: ifle +19 -> 103
    //   87: aload_1
    //   88: astore_3
    //   89: aload_1
    //   90: aload_0
    //   91: getfield 23	com/tencent/mm/plugin/fav/ui/d:width	I
    //   94: aload_0
    //   95: getfield 25	com/tencent/mm/plugin/fav/ui/d:height	I
    //   98: iconst_1
    //   99: invokestatic 81	com/tencent/mm/sdk/platformtools/d:b	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   102: astore_2
    //   103: aload_2
    //   104: astore_3
    //   105: aload_0
    //   106: invokevirtual 84	com/tencent/mm/plugin/fav/ui/d:anJ	()Ljava/lang/String;
    //   109: astore 4
    //   111: aload_2
    //   112: astore_3
    //   113: new 59	com/tencent/mm/vfs/b
    //   116: astore_1
    //   117: aload_2
    //   118: astore_3
    //   119: aload_1
    //   120: aload 4
    //   122: invokespecial 68	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   125: aload_2
    //   126: astore_3
    //   127: aload_1
    //   128: invokevirtual 87	com/tencent/mm/vfs/b:createNewFile	()Z
    //   131: pop
    //   132: new 89	com/tencent/mm/vfs/f
    //   135: astore 4
    //   137: aload 4
    //   139: aload_1
    //   140: invokespecial 92	com/tencent/mm/vfs/f:<init>	(Lcom/tencent/mm/vfs/b;)V
    //   143: aload 4
    //   145: astore_1
    //   146: aload_2
    //   147: getstatic 98	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   150: bipush 100
    //   152: aload 4
    //   154: invokevirtual 104	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   157: pop
    //   158: aload 4
    //   160: astore_1
    //   161: aload 4
    //   163: invokevirtual 107	com/tencent/mm/vfs/f:flush	()V
    //   166: aload_2
    //   167: astore_3
    //   168: aload 4
    //   170: invokevirtual 110	com/tencent/mm/vfs/f:close	()V
    //   173: aload_2
    //   174: astore_3
    //   175: ldc 35
    //   177: invokestatic 113	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: aload_3
    //   181: areturn
    //   182: astore_3
    //   183: aconst_null
    //   184: astore 4
    //   186: aload 4
    //   188: astore_1
    //   189: ldc 49
    //   191: aload_3
    //   192: ldc 115
    //   194: iconst_0
    //   195: anewarray 4	java/lang/Object
    //   198: invokestatic 119	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   201: aload_2
    //   202: astore_3
    //   203: aload 4
    //   205: ifnull -30 -> 175
    //   208: aload_2
    //   209: astore_3
    //   210: aload 4
    //   212: invokevirtual 110	com/tencent/mm/vfs/f:close	()V
    //   215: aload_2
    //   216: astore_3
    //   217: goto -42 -> 175
    //   220: astore_1
    //   221: ldc 49
    //   223: aload_1
    //   224: ldc 115
    //   226: iconst_0
    //   227: anewarray 4	java/lang/Object
    //   230: invokestatic 119	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: goto -58 -> 175
    //   236: astore 4
    //   238: aconst_null
    //   239: astore_1
    //   240: aload_1
    //   241: ifnull +9 -> 250
    //   244: aload_2
    //   245: astore_3
    //   246: aload_1
    //   247: invokevirtual 110	com/tencent/mm/vfs/f:close	()V
    //   250: aload_2
    //   251: astore_3
    //   252: ldc 35
    //   254: invokestatic 113	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: aload_2
    //   258: astore_3
    //   259: aload 4
    //   261: athrow
    //   262: astore 4
    //   264: goto -24 -> 240
    //   267: astore_3
    //   268: goto -82 -> 186
    //
    // Exception table:
    //   from	to	target	type
    //   132	143	182	java/io/FileNotFoundException
    //   16	34	220	java/io/IOException
    //   36	40	220	java/io/IOException
    //   42	49	220	java/io/IOException
    //   51	58	220	java/io/IOException
    //   60	65	220	java/io/IOException
    //   69	76	220	java/io/IOException
    //   80	87	220	java/io/IOException
    //   89	103	220	java/io/IOException
    //   105	111	220	java/io/IOException
    //   113	117	220	java/io/IOException
    //   119	125	220	java/io/IOException
    //   127	132	220	java/io/IOException
    //   168	173	220	java/io/IOException
    //   210	215	220	java/io/IOException
    //   246	250	220	java/io/IOException
    //   252	257	220	java/io/IOException
    //   259	262	220	java/io/IOException
    //   132	143	236	finally
    //   146	158	262	finally
    //   161	166	262	finally
    //   189	201	262	finally
    //   146	158	267	java/io/FileNotFoundException
    //   161	166	267	java/io/FileNotFoundException
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
    AppMethodBeat.i(73997);
    String str = b.bue() + g.x(this.url.getBytes());
    AppMethodBeat.o(73997);
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
    AppMethodBeat.i(73998);
    Bitmap localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839709);
    AppMethodBeat.o(73998);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d
 * JD-Core Version:    0.6.2
 */