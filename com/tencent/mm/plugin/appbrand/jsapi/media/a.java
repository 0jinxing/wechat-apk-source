package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.InputStream;

abstract class a extends com.tencent.mm.plugin.appbrand.jsapi.a<q>
{
  // ERROR //
  static boolean d(String paramString, InputStream paramInputStream)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: new 18	java/io/File
    //   5: astore_3
    //   6: aload_3
    //   7: aload_0
    //   8: invokespecial 21	java/io/File:<init>	(Ljava/lang/String;)V
    //   11: aload_3
    //   12: invokevirtual 25	java/io/File:getParentFile	()Ljava/io/File;
    //   15: invokevirtual 29	java/io/File:mkdirs	()Z
    //   18: pop
    //   19: new 31	java/io/FileOutputStream
    //   22: astore 4
    //   24: aload 4
    //   26: aload_3
    //   27: invokespecial 34	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   30: aload 4
    //   32: astore_0
    //   33: sipush 4096
    //   36: newarray byte
    //   38: astore_3
    //   39: aload 4
    //   41: astore_0
    //   42: aload_1
    //   43: aload_3
    //   44: iconst_0
    //   45: sipush 4096
    //   48: invokevirtual 40	java/io/InputStream:read	([BII)I
    //   51: istore 5
    //   53: iload 5
    //   55: iconst_m1
    //   56: if_icmpeq +50 -> 106
    //   59: aload 4
    //   61: astore_0
    //   62: aload 4
    //   64: aload_3
    //   65: iconst_0
    //   66: iload 5
    //   68: invokevirtual 44	java/io/FileOutputStream:write	([BII)V
    //   71: goto -32 -> 39
    //   74: astore_3
    //   75: aload 4
    //   77: astore_0
    //   78: ldc 46
    //   80: ldc 48
    //   82: iconst_1
    //   83: anewarray 50	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_3
    //   89: aastore
    //   90: invokestatic 56	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: aload 4
    //   95: invokestatic 62	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   98: aload_1
    //   99: invokestatic 62	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   102: iconst_0
    //   103: istore_2
    //   104: iload_2
    //   105: ireturn
    //   106: aload 4
    //   108: astore_0
    //   109: aload 4
    //   111: invokevirtual 65	java/io/FileOutputStream:flush	()V
    //   114: aload 4
    //   116: invokestatic 62	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   119: aload_1
    //   120: invokestatic 62	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   123: goto -19 -> 104
    //   126: astore 4
    //   128: aconst_null
    //   129: astore_0
    //   130: aload_0
    //   131: invokestatic 62	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   134: aload_1
    //   135: invokestatic 62	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   138: aload 4
    //   140: athrow
    //   141: astore 4
    //   143: goto -13 -> 130
    //   146: astore_3
    //   147: aconst_null
    //   148: astore 4
    //   150: goto -75 -> 75
    //
    // Exception table:
    //   from	to	target	type
    //   33	39	74	java/lang/Exception
    //   42	53	74	java/lang/Exception
    //   62	71	74	java/lang/Exception
    //   109	114	74	java/lang/Exception
    //   2	30	126	finally
    //   33	39	141	finally
    //   42	53	141	finally
    //   62	71	141	finally
    //   78	93	141	finally
    //   109	114	141	finally
    //   2	30	146	java/lang/Exception
  }

  abstract boolean Bk(String paramString);

  abstract String Bl(String paramString);

  abstract void Bm(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.a
 * JD-Core Version:    0.6.2
 */