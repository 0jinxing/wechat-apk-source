package com.github.henryye.nativeiv.b;

public final class a
{
  // ERROR //
  public static java.nio.ByteBuffer f(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: ldc 13
    //   2: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: astore_1
    //   7: aload_0
    //   8: invokevirtual 25	java/io/InputStream:markSupported	()Z
    //   11: ifne +12 -> 23
    //   14: aload_0
    //   15: invokestatic 31	com/github/henryye/nativeiv/b/d:h	(Ljava/io/InputStream;)Ljava/io/InputStream;
    //   18: astore_1
    //   19: aload_1
    //   20: invokestatic 34	com/github/henryye/nativeiv/b/d:i	(Ljava/io/InputStream;)V
    //   23: aload_1
    //   24: ifnonnull +12 -> 36
    //   27: ldc 13
    //   29: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aconst_null
    //   33: astore_0
    //   34: aload_0
    //   35: areturn
    //   36: sipush 10000
    //   39: newarray byte
    //   41: astore_2
    //   42: ldc 38
    //   44: invokestatic 44	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   47: astore_0
    //   48: aload_0
    //   49: invokestatic 50	java/nio/ByteOrder:nativeOrder	()Ljava/nio/ByteOrder;
    //   52: invokevirtual 54	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   55: pop
    //   56: ldc 38
    //   58: istore_3
    //   59: iconst_0
    //   60: istore 4
    //   62: iconst_0
    //   63: istore 5
    //   65: aload_1
    //   66: aload_2
    //   67: invokevirtual 58	java/io/InputStream:read	([B)I
    //   70: istore 6
    //   72: iload 4
    //   74: iload 6
    //   76: iadd
    //   77: istore 4
    //   79: iload 4
    //   81: iload_3
    //   82: if_icmple +256 -> 338
    //   85: aload_0
    //   86: invokevirtual 62	java/nio/ByteBuffer:capacity	()I
    //   89: ldc 38
    //   91: iadd
    //   92: invokestatic 44	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   95: astore 7
    //   97: aload 7
    //   99: invokestatic 50	java/nio/ByteOrder:nativeOrder	()Ljava/nio/ByteOrder;
    //   102: invokevirtual 54	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   105: pop
    //   106: aload_0
    //   107: iconst_0
    //   108: invokevirtual 66	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   111: pop
    //   112: aload 7
    //   114: aload_0
    //   115: invokevirtual 70	java/nio/ByteBuffer:put	(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   118: pop
    //   119: aload 7
    //   121: astore 8
    //   123: aload 7
    //   125: invokevirtual 62	java/nio/ByteBuffer:capacity	()I
    //   128: istore_3
    //   129: aload 7
    //   131: astore_0
    //   132: iload 6
    //   134: iflt +35 -> 169
    //   137: aload_0
    //   138: astore 8
    //   140: aload_0
    //   141: iload 5
    //   143: invokevirtual 66	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   146: pop
    //   147: aload_0
    //   148: astore 8
    //   150: aload_0
    //   151: aload_2
    //   152: iconst_0
    //   153: iload 6
    //   155: invokevirtual 73	java/nio/ByteBuffer:put	([BII)Ljava/nio/ByteBuffer;
    //   158: pop
    //   159: iload 5
    //   161: iload 6
    //   163: iadd
    //   164: istore 5
    //   166: goto -101 -> 65
    //   169: aload_0
    //   170: astore 8
    //   172: aload_0
    //   173: iconst_0
    //   174: invokevirtual 66	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   177: pop
    //   178: aload_1
    //   179: invokevirtual 77	java/io/InputStream:reset	()V
    //   182: ldc 13
    //   184: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: goto -153 -> 34
    //   190: astore 8
    //   192: ldc 79
    //   194: aload 8
    //   196: ldc 81
    //   198: iconst_0
    //   199: anewarray 4	java/lang/Object
    //   202: invokestatic 87	com/tencent/magicbrush/a/c$c:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: goto -23 -> 182
    //   208: astore_0
    //   209: ldc 79
    //   211: aload_0
    //   212: ldc 89
    //   214: iconst_0
    //   215: anewarray 4	java/lang/Object
    //   218: invokestatic 87	com/tencent/magicbrush/a/c$c:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   221: aload_1
    //   222: invokevirtual 77	java/io/InputStream:reset	()V
    //   225: ldc 13
    //   227: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   230: aconst_null
    //   231: astore_0
    //   232: goto -198 -> 34
    //   235: astore_0
    //   236: ldc 79
    //   238: aload_0
    //   239: ldc 81
    //   241: iconst_0
    //   242: anewarray 4	java/lang/Object
    //   245: invokestatic 87	com/tencent/magicbrush/a/c$c:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: goto -23 -> 225
    //   251: astore 8
    //   253: aload_0
    //   254: astore 7
    //   256: aload 8
    //   258: astore_0
    //   259: aload 7
    //   261: astore 8
    //   263: ldc 79
    //   265: aload_0
    //   266: ldc 91
    //   268: iconst_0
    //   269: anewarray 4	java/lang/Object
    //   272: invokestatic 87	com/tencent/magicbrush/a/c$c:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   275: aload_1
    //   276: invokevirtual 77	java/io/InputStream:reset	()V
    //   279: aload 8
    //   281: astore_0
    //   282: goto -100 -> 182
    //   285: astore_0
    //   286: ldc 79
    //   288: aload_0
    //   289: ldc 81
    //   291: iconst_0
    //   292: anewarray 4	java/lang/Object
    //   295: invokestatic 87	com/tencent/magicbrush/a/c$c:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   298: aload 8
    //   300: astore_0
    //   301: goto -119 -> 182
    //   304: astore_0
    //   305: aload_1
    //   306: invokevirtual 77	java/io/InputStream:reset	()V
    //   309: ldc 13
    //   311: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   314: aload_0
    //   315: athrow
    //   316: astore 8
    //   318: ldc 79
    //   320: aload 8
    //   322: ldc 81
    //   324: iconst_0
    //   325: anewarray 4	java/lang/Object
    //   328: invokestatic 87	com/tencent/magicbrush/a/c$c:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   331: goto -22 -> 309
    //   334: astore_0
    //   335: goto -72 -> 263
    //   338: goto -206 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   178	182	190	java/lang/Exception
    //   65	72	208	java/io/IOException
    //   85	119	208	java/io/IOException
    //   123	129	208	java/io/IOException
    //   140	147	208	java/io/IOException
    //   150	159	208	java/io/IOException
    //   172	178	208	java/io/IOException
    //   221	225	235	java/lang/Exception
    //   65	72	251	java/nio/BufferOverflowException
    //   85	119	251	java/nio/BufferOverflowException
    //   275	279	285	java/lang/Exception
    //   65	72	304	finally
    //   85	119	304	finally
    //   123	129	304	finally
    //   140	147	304	finally
    //   150	159	304	finally
    //   172	178	304	finally
    //   209	221	304	finally
    //   263	275	304	finally
    //   305	309	316	java/lang/Exception
    //   123	129	334	java/nio/BufferOverflowException
    //   140	147	334	java/nio/BufferOverflowException
    //   150	159	334	java/nio/BufferOverflowException
    //   172	178	334	java/nio/BufferOverflowException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.b.a
 * JD-Core Version:    0.6.2
 */