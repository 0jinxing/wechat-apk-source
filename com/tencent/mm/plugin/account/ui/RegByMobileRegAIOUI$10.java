package com.tencent.mm.plugin.account.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al.a;

final class RegByMobileRegAIOUI$10
  implements al.a
{
  RegByMobileRegAIOUI$10(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  // ERROR //
  public final boolean acf()
  {
    // Byte code:
    //   0: ldc 25
    //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_1
    //   7: aload_1
    //   8: astore_2
    //   9: new 33	java/net/URL
    //   12: astore_3
    //   13: aload_1
    //   14: astore_2
    //   15: aload_3
    //   16: aload_0
    //   17: getfield 17	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10:gGd	Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;
    //   20: invokestatic 37	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI:s	(Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;)Ljava/lang/String;
    //   23: invokespecial 40	java/net/URL:<init>	(Ljava/lang/String;)V
    //   26: aload_1
    //   27: astore_2
    //   28: aload_3
    //   29: invokevirtual 44	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   32: invokevirtual 50	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   35: astore_1
    //   36: aload_1
    //   37: astore_2
    //   38: aload_0
    //   39: getfield 17	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10:gGd	Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;
    //   42: aload_1
    //   43: invokestatic 56	com/tencent/mm/sdk/platformtools/d:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   46: invokestatic 60	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI:a	(Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   49: pop
    //   50: aload_1
    //   51: astore_2
    //   52: aload_0
    //   53: getfield 17	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10:gGd	Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;
    //   56: invokestatic 64	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI:n	(Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;)Landroid/graphics/Bitmap;
    //   59: ifnull +76 -> 135
    //   62: aload_1
    //   63: astore_2
    //   64: aload_0
    //   65: getfield 17	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10:gGd	Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;
    //   68: invokestatic 64	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI:n	(Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;)Landroid/graphics/Bitmap;
    //   71: invokevirtual 69	android/graphics/Bitmap:isRecycled	()Z
    //   74: ifne +61 -> 135
    //   77: aload_1
    //   78: astore_2
    //   79: aload_0
    //   80: getfield 17	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10:gGd	Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;
    //   83: invokestatic 64	com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI:n	(Lcom/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI;)Landroid/graphics/Bitmap;
    //   86: astore_3
    //   87: aload_1
    //   88: astore_2
    //   89: getstatic 75	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   92: astore 4
    //   94: aload_1
    //   95: astore_2
    //   96: new 77	java/lang/StringBuilder
    //   99: astore 5
    //   101: aload_1
    //   102: astore_2
    //   103: aload 5
    //   105: invokespecial 78	java/lang/StringBuilder:<init>	()V
    //   108: aload_1
    //   109: astore_2
    //   110: aload_3
    //   111: bipush 100
    //   113: aload 4
    //   115: aload 5
    //   117: getstatic 84	com/tencent/mm/compatible/util/e:euY	Ljava/lang/String;
    //   120: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: ldc 90
    //   125: invokevirtual 88	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 94	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: iconst_0
    //   132: invokestatic 97	com/tencent/mm/sdk/platformtools/d:a	(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap$CompressFormat;Ljava/lang/String;Z)V
    //   135: aload_1
    //   136: ifnull +7 -> 143
    //   139: aload_1
    //   140: invokevirtual 102	java/io/InputStream:close	()V
    //   143: ldc 25
    //   145: invokestatic 105	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: iconst_1
    //   149: ireturn
    //   150: astore_1
    //   151: aload_2
    //   152: ifnull +7 -> 159
    //   155: aload_2
    //   156: invokevirtual 102	java/io/InputStream:close	()V
    //   159: ldc 25
    //   161: invokestatic 105	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: aload_1
    //   165: athrow
    //   166: astore_2
    //   167: ldc 107
    //   169: aload_2
    //   170: ldc 109
    //   172: iconst_0
    //   173: anewarray 4	java/lang/Object
    //   176: invokestatic 115	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: goto -36 -> 143
    //
    // Exception table:
    //   from	to	target	type
    //   9	13	150	finally
    //   15	26	150	finally
    //   28	36	150	finally
    //   38	50	150	finally
    //   52	62	150	finally
    //   64	77	150	finally
    //   79	87	150	finally
    //   89	94	150	finally
    //   96	101	150	finally
    //   103	108	150	finally
    //   110	135	150	finally
    //   139	143	166	java/lang/Exception
    //   155	159	166	java/lang/Exception
    //   159	166	166	java/lang/Exception
  }

  public final boolean acg()
  {
    AppMethodBeat.i(125352);
    if ((!RegByMobileRegAIOUI.o(this.gGd)) && (RegByMobileRegAIOUI.n(this.gGd) != null) && (!RegByMobileRegAIOUI.n(this.gGd).isRecycled()))
    {
      RegByMobileRegAIOUI.p(this.gGd).setImageBitmap(RegByMobileRegAIOUI.n(this.gGd));
      RegByMobileRegAIOUI.q(this.gGd).setVisibility(8);
      RegByMobileRegAIOUI.r(this.gGd);
    }
    AppMethodBeat.o(125352);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.10
 * JD-Core Version:    0.6.2
 */