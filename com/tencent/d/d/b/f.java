package com.tencent.d.d.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  private static Boolean Atl;
  private static final Object Atm;

  static
  {
    AppMethodBeat.i(114533);
    Atl = null;
    Atm = new Object();
    AppMethodBeat.o(114533);
  }

  // ERROR //
  public static boolean dQp()
  {
    // Byte code:
    //   0: ldc 33
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 24	com/tencent/d/d/b/f:Atm	Ljava/lang/Object;
    //   8: astore_0
    //   9: aload_0
    //   10: monitorenter
    //   11: getstatic 19	com/tencent/d/d/b/f:Atl	Ljava/lang/Boolean;
    //   14: ifnonnull +74 -> 88
    //   17: getstatic 39	android/os/Build$VERSION:SDK_INT	I
    //   20: bipush 17
    //   22: if_icmplt +140 -> 162
    //   25: new 41	java/io/File
    //   28: astore_1
    //   29: aload_1
    //   30: ldc 43
    //   32: invokespecial 46	java/io/File:<init>	(Ljava/lang/String;)V
    //   35: aload_1
    //   36: invokevirtual 49	java/io/File:exists	()Z
    //   39: istore_2
    //   40: iload_2
    //   41: ifeq +121 -> 162
    //   44: new 51	java/io/FileInputStream
    //   47: astore_1
    //   48: aload_1
    //   49: ldc 43
    //   51: invokespecial 52	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   54: aload_1
    //   55: invokevirtual 58	java/io/InputStream:read	()I
    //   58: bipush 49
    //   60: if_icmpne +44 -> 104
    //   63: iconst_1
    //   64: istore_2
    //   65: aload_1
    //   66: invokestatic 64	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   69: iload_2
    //   70: invokestatic 70	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   73: astore_1
    //   74: aload_1
    //   75: astore_3
    //   76: aload_1
    //   77: ifnonnull +7 -> 84
    //   80: getstatic 73	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   83: astore_3
    //   84: aload_3
    //   85: putstatic 19	com/tencent/d/d/b/f:Atl	Ljava/lang/Boolean;
    //   88: getstatic 19	com/tencent/d/d/b/f:Atl	Ljava/lang/Boolean;
    //   91: invokevirtual 76	java/lang/Boolean:booleanValue	()Z
    //   94: istore_2
    //   95: aload_0
    //   96: monitorexit
    //   97: ldc 33
    //   99: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: iload_2
    //   103: ireturn
    //   104: iconst_0
    //   105: istore_2
    //   106: goto -41 -> 65
    //   109: astore_1
    //   110: aconst_null
    //   111: astore_1
    //   112: aload_1
    //   113: invokestatic 64	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   116: aconst_null
    //   117: astore_1
    //   118: goto -44 -> 74
    //   121: astore_1
    //   122: aconst_null
    //   123: astore_3
    //   124: aload_1
    //   125: astore 4
    //   127: aload_3
    //   128: invokestatic 64	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   131: ldc 33
    //   133: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload 4
    //   138: athrow
    //   139: astore_1
    //   140: aload_0
    //   141: monitorexit
    //   142: ldc 33
    //   144: invokestatic 27	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_1
    //   148: athrow
    //   149: astore_3
    //   150: aload_3
    //   151: astore 4
    //   153: aload_1
    //   154: astore_3
    //   155: goto -28 -> 127
    //   158: astore_3
    //   159: goto -47 -> 112
    //   162: aconst_null
    //   163: astore_1
    //   164: goto -90 -> 74
    //
    // Exception table:
    //   from	to	target	type
    //   44	54	109	java/lang/Exception
    //   44	54	121	finally
    //   11	40	139	finally
    //   65	74	139	finally
    //   80	84	139	finally
    //   84	88	139	finally
    //   88	97	139	finally
    //   112	116	139	finally
    //   127	139	139	finally
    //   140	142	139	finally
    //   54	63	149	finally
    //   54	63	158	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.b.f
 * JD-Core Version:    0.6.2
 */