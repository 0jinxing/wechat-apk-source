package com.tencent.d.d.b;

public final class a
{
  private static final byte[] Atf = { 127, 69, 76, 70 };

  // ERROR //
  public static boolean atP(java.lang.String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 18
    //   4: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: getstatic 14	com/tencent/d/d/b/a:Atf	[B
    //   10: arraylength
    //   11: newarray byte
    //   13: astore_2
    //   14: new 26	java/io/FileInputStream
    //   17: astore_3
    //   18: aload_3
    //   19: aload_0
    //   20: invokespecial 30	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   23: aload_3
    //   24: aload_2
    //   25: iconst_0
    //   26: getstatic 14	com/tencent/d/d/b/a:Atf	[B
    //   29: arraylength
    //   30: invokevirtual 36	java/io/InputStream:read	([BII)I
    //   33: aload_2
    //   34: arraylength
    //   35: if_icmpeq +52 -> 87
    //   38: new 38	java/io/IOException
    //   41: astore_0
    //   42: new 40	java/lang/StringBuilder
    //   45: astore 4
    //   47: aload 4
    //   49: ldc 42
    //   51: invokespecial 43	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   54: aload_0
    //   55: aload 4
    //   57: aload_2
    //   58: arraylength
    //   59: invokevirtual 47	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   62: invokevirtual 51	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: invokespecial 52	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   68: ldc 18
    //   70: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: aload_0
    //   74: athrow
    //   75: astore_0
    //   76: aload_3
    //   77: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   80: ldc 18
    //   82: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: aload_0
    //   86: athrow
    //   87: iconst_0
    //   88: istore 5
    //   90: iload 5
    //   92: getstatic 14	com/tencent/d/d/b/a:Atf	[B
    //   95: arraylength
    //   96: if_icmpge +41 -> 137
    //   99: getstatic 14	com/tencent/d/d/b/a:Atf	[B
    //   102: iload 5
    //   104: baload
    //   105: istore 6
    //   107: aload_2
    //   108: iload 5
    //   110: baload
    //   111: istore 7
    //   113: iload 6
    //   115: iload 7
    //   117: if_icmpeq +14 -> 131
    //   120: aload_3
    //   121: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   124: ldc 18
    //   126: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: iload_1
    //   130: ireturn
    //   131: iinc 5 1
    //   134: goto -44 -> 90
    //   137: aload_3
    //   138: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   141: iconst_1
    //   142: istore_1
    //   143: ldc 18
    //   145: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: goto -19 -> 129
    //   151: astore_0
    //   152: aconst_null
    //   153: astore_3
    //   154: goto -78 -> 76
    //
    // Exception table:
    //   from	to	target	type
    //   23	75	75	finally
    //   90	107	75	finally
    //   14	23	151	finally
  }

  // ERROR //
  public static byte[] atR(java.lang.String paramString)
  {
    // Byte code:
    //   0: ldc 64
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 26	java/io/FileInputStream
    //   8: astore_1
    //   9: aload_1
    //   10: aload_0
    //   11: invokespecial 30	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   14: new 66	java/io/ByteArrayOutputStream
    //   17: astore_2
    //   18: aload_2
    //   19: aload_1
    //   20: invokevirtual 70	java/io/FileInputStream:available	()I
    //   23: invokespecial 72	java/io/ByteArrayOutputStream:<init>	(I)V
    //   26: aload_1
    //   27: aload_2
    //   28: invokestatic 76	com/tencent/d/d/b/b:copyLarge	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   31: pop2
    //   32: aload_2
    //   33: invokevirtual 80	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   36: astore_0
    //   37: aload_0
    //   38: ifnull +18 -> 56
    //   41: aload_1
    //   42: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   45: aload_2
    //   46: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   49: ldc 64
    //   51: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: aload_0
    //   55: areturn
    //   56: ldc 82
    //   58: invokevirtual 87	java/lang/String:getBytes	()[B
    //   61: astore_0
    //   62: goto -21 -> 41
    //   65: astore_0
    //   66: aconst_null
    //   67: astore_2
    //   68: aconst_null
    //   69: astore_1
    //   70: aload_1
    //   71: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   74: aload_2
    //   75: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   78: ldc 64
    //   80: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: aload_0
    //   84: athrow
    //   85: astore_0
    //   86: aconst_null
    //   87: astore_2
    //   88: goto -18 -> 70
    //   91: astore_0
    //   92: goto -22 -> 70
    //
    // Exception table:
    //   from	to	target	type
    //   5	14	65	finally
    //   14	26	85	finally
    //   26	37	91	finally
    //   56	62	91	finally
  }

  // ERROR //
  public static byte[] eO(java.lang.String paramString, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 92
    //   4: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 94	java/io/File
    //   10: dup
    //   11: aload_0
    //   12: invokespecial 95	java/io/File:<init>	(Ljava/lang/String;)V
    //   15: astore_0
    //   16: aload_0
    //   17: invokevirtual 99	java/io/File:exists	()Z
    //   20: ifne +12 -> 32
    //   23: ldc 92
    //   25: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: aconst_null
    //   29: astore_0
    //   30: aload_0
    //   31: areturn
    //   32: new 26	java/io/FileInputStream
    //   35: astore_3
    //   36: aload_3
    //   37: aload_0
    //   38: invokespecial 102	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   41: iload_1
    //   42: newarray byte
    //   44: astore_0
    //   45: aload_3
    //   46: aload_0
    //   47: iload_2
    //   48: iload_1
    //   49: iload_2
    //   50: isub
    //   51: invokevirtual 103	java/io/FileInputStream:read	([BII)I
    //   54: istore 4
    //   56: iload_2
    //   57: istore 5
    //   59: iload 4
    //   61: iconst_m1
    //   62: if_icmpeq +18 -> 80
    //   65: iload_2
    //   66: iload 4
    //   68: iadd
    //   69: istore 5
    //   71: iload 5
    //   73: istore_2
    //   74: iload 5
    //   76: iload_1
    //   77: if_icmplt -32 -> 45
    //   80: iload 5
    //   82: ifne +17 -> 99
    //   85: aload_3
    //   86: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   89: ldc 92
    //   91: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aconst_null
    //   95: astore_0
    //   96: goto -66 -> 30
    //   99: iload 5
    //   101: iload_1
    //   102: if_icmpge +75 -> 177
    //   105: iload 5
    //   107: newarray byte
    //   109: astore 6
    //   111: aload_0
    //   112: iconst_0
    //   113: aload 6
    //   115: iconst_0
    //   116: iload 5
    //   118: invokestatic 109	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   121: aload 6
    //   123: astore_0
    //   124: aload_3
    //   125: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   128: ldc 92
    //   130: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: goto -103 -> 30
    //   136: astore_0
    //   137: aconst_null
    //   138: astore_0
    //   139: aload_0
    //   140: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   143: ldc 92
    //   145: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aconst_null
    //   149: astore_0
    //   150: goto -120 -> 30
    //   153: astore_0
    //   154: aconst_null
    //   155: astore_3
    //   156: aload_3
    //   157: invokestatic 61	com/tencent/d/d/b/b:closeQuietly	(Ljava/io/Closeable;)V
    //   160: ldc 92
    //   162: invokestatic 55	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: aload_0
    //   166: athrow
    //   167: astore_0
    //   168: goto -12 -> 156
    //   171: astore_0
    //   172: aload_3
    //   173: astore_0
    //   174: goto -35 -> 139
    //   177: goto -53 -> 124
    //
    // Exception table:
    //   from	to	target	type
    //   32	41	136	java/lang/Throwable
    //   32	41	153	finally
    //   41	45	167	finally
    //   45	56	167	finally
    //   105	121	167	finally
    //   41	45	171	java/lang/Throwable
    //   45	56	171	java/lang/Throwable
    //   105	121	171	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.b.a
 * JD-Core Version:    0.6.2
 */