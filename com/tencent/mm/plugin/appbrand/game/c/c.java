package com.tencent.mm.plugin.appbrand.game.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.udp.libmmudp.a;
import com.tencent.mm.udp.libmmudp.a.a;

public class c
{
  private static boolean hru = false;

  public static void axy()
  {
    AppMethodBeat.i(130139);
    com.tencent.magicbrush.a.b.a(new c.1());
    a.a(new a.a()
    {
      public final void loadLibrary(String paramAnonymousString)
      {
        AppMethodBeat.i(130138);
        try
        {
          ab.i("MicroMsg.MBLoadDelegateRegistery", "loadLibrary libName:%s", new Object[] { paramAnonymousString });
          k.a(paramAnonymousString, c.class.getClassLoader());
          AppMethodBeat.o(130138);
          return;
        }
        catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.MBLoadDelegateRegistery", localUnsatisfiedLinkError, "hy: link %s error!!", new Object[] { paramAnonymousString });
            com.tencent.mm.plugin.appbrand.game.g.b.cH(ah.getContext());
            AppMethodBeat.o(130138);
          }
        }
      }
    });
    AppMethodBeat.o(130139);
  }

  // ERROR //
  private static java.io.File bT(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 45
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 51	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   8: ldc 53
    //   10: iconst_0
    //   11: invokevirtual 59	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   14: astore_2
    //   15: aload_2
    //   16: invokevirtual 65	java/io/File:exists	()Z
    //   19: ifne +25 -> 44
    //   22: aload_2
    //   23: invokevirtual 68	java/io/File:mkdirs	()Z
    //   26: ifne +18 -> 44
    //   29: new 70	java/lang/IllegalStateException
    //   32: dup
    //   33: invokespecial 71	java/lang/IllegalStateException:<init>	()V
    //   36: astore_0
    //   37: ldc 45
    //   39: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   42: aload_0
    //   43: athrow
    //   44: new 61	java/io/File
    //   47: dup
    //   48: aload_2
    //   49: aload_0
    //   50: invokespecial 74	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   53: astore_0
    //   54: new 76	java/io/BufferedInputStream
    //   57: astore_2
    //   58: new 78	java/io/FileInputStream
    //   61: astore_3
    //   62: aload_3
    //   63: aload_1
    //   64: invokespecial 81	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   67: aload_2
    //   68: aload_3
    //   69: invokespecial 84	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   72: new 86	java/io/BufferedOutputStream
    //   75: astore_1
    //   76: new 88	java/io/FileOutputStream
    //   79: astore_3
    //   80: aload_3
    //   81: aload_0
    //   82: invokespecial 91	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   85: aload_1
    //   86: aload_3
    //   87: invokespecial 94	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   90: aload_2
    //   91: aload_1
    //   92: invokestatic 100	com/tencent/util/g:copy	(Ljava/io/InputStream;Ljava/io/OutputStream;)I
    //   95: pop
    //   96: aload_2
    //   97: invokestatic 103	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   100: aload_1
    //   101: invokestatic 105	com/tencent/util/g:closeQuietly	(Ljava/io/OutputStream;)V
    //   104: ldc 45
    //   106: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: aload_0
    //   110: areturn
    //   111: astore_0
    //   112: aconst_null
    //   113: astore_1
    //   114: aconst_null
    //   115: astore_2
    //   116: aload_2
    //   117: invokestatic 103	com/tencent/util/g:closeQuietly	(Ljava/io/InputStream;)V
    //   120: aload_1
    //   121: invokestatic 105	com/tencent/util/g:closeQuietly	(Ljava/io/OutputStream;)V
    //   124: ldc 45
    //   126: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: aload_0
    //   130: athrow
    //   131: astore_0
    //   132: aconst_null
    //   133: astore_1
    //   134: goto -18 -> 116
    //   137: astore_0
    //   138: goto -22 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   54	72	111	finally
    //   72	90	131	finally
    //   90	96	137	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.c.c
 * JD-Core Version:    0.6.2
 */