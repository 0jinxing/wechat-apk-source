package com.tencent.liteav.audio.impl.Play;

class d$1 extends d.a
{
  d$1(d paramd, String paramString)
  {
    super(paramd, paramString);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_1
    //   2: ldc 24
    //   4: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokevirtual 32	com/tencent/liteav/audio/impl/Play/d$1:a	()V
    //   11: aload_0
    //   12: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   15: invokestatic 35	com/tencent/liteav/audio/impl/Play/d:a	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   18: iconst_1
    //   19: if_icmpne +437 -> 456
    //   22: iconst_2
    //   23: istore_2
    //   24: aload_0
    //   25: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   28: invokestatic 37	com/tencent/liteav/audio/impl/Play/d:b	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   31: bipush 8
    //   33: if_icmpne +418 -> 451
    //   36: aload_0
    //   37: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   40: invokestatic 40	com/tencent/liteav/audio/impl/Play/d:c	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   43: iload_2
    //   44: iload_1
    //   45: invokestatic 46	android/media/AudioTrack:getMinBufferSize	(III)I
    //   48: istore_3
    //   49: new 42	android/media/AudioTrack
    //   52: astore 4
    //   54: aload 4
    //   56: iconst_3
    //   57: aload_0
    //   58: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   61: invokestatic 40	com/tencent/liteav/audio/impl/Play/d:c	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   64: iload_2
    //   65: iload_1
    //   66: iload_3
    //   67: iconst_1
    //   68: invokespecial 49	android/media/AudioTrack:<init>	(IIIIII)V
    //   71: invokestatic 53	com/tencent/liteav/audio/impl/Play/d:e	()Ljava/lang/String;
    //   74: astore 5
    //   76: new 55	java/lang/StringBuilder
    //   79: astore 6
    //   81: aload 6
    //   83: ldc 57
    //   85: invokespecial 60	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   88: aload 5
    //   90: aload 6
    //   92: aload_0
    //   93: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   96: invokestatic 40	com/tencent/liteav/audio/impl/Play/d:c	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   99: invokevirtual 64	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   102: ldc 66
    //   104: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: aload_0
    //   108: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   111: invokestatic 35	com/tencent/liteav/audio/impl/Play/d:a	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   114: invokevirtual 64	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   117: ldc 71
    //   119: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload_0
    //   123: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   126: invokestatic 37	com/tencent/liteav/audio/impl/Play/d:b	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   129: invokevirtual 64	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   132: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: invokestatic 79	com/tencent/liteav/basic/log/TXCLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   138: aload 4
    //   140: invokevirtual 82	android/media/AudioTrack:play	()V
    //   143: aload_0
    //   144: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   147: iconst_1
    //   148: invokestatic 85	com/tencent/liteav/audio/impl/Play/d:a	(Lcom/tencent/liteav/audio/impl/Play/d;Z)Z
    //   151: pop
    //   152: aload_0
    //   153: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   156: aload_0
    //   157: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   160: invokestatic 89	com/tencent/liteav/audio/impl/Play/d:d	(Lcom/tencent/liteav/audio/impl/Play/d;)Landroid/content/Context;
    //   163: aload_0
    //   164: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   167: invokestatic 91	com/tencent/liteav/audio/impl/Play/d:e	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   170: invokevirtual 94	com/tencent/liteav/audio/impl/Play/d:a	(Landroid/content/Context;I)V
    //   173: bipush 100
    //   175: istore_1
    //   176: iconst_0
    //   177: istore_2
    //   178: aload_0
    //   179: getfield 97	com/tencent/liteav/audio/impl/Play/d$1:b	Z
    //   182: ifeq +228 -> 410
    //   185: aload_0
    //   186: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   189: invokestatic 35	com/tencent/liteav/audio/impl/Play/d:a	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   192: sipush 2048
    //   195: imul
    //   196: invokestatic 103	com/tencent/liteav/audio/impl/Play/b:nativeGetMixedTracksData	(I)[B
    //   199: astore 5
    //   201: aload 5
    //   203: ifnull +193 -> 396
    //   206: aload 5
    //   208: arraylength
    //   209: ifle +187 -> 396
    //   212: aload_0
    //   213: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   216: invokestatic 107	com/tencent/liteav/audio/impl/Play/d:f	(Lcom/tencent/liteav/audio/impl/Play/d;)Z
    //   219: ifeq +9 -> 228
    //   222: aload 5
    //   224: iconst_0
    //   225: invokestatic 113	java/util/Arrays:fill	([BB)V
    //   228: iload_1
    //   229: istore 7
    //   231: iload_2
    //   232: istore_3
    //   233: iload_1
    //   234: ifeq +142 -> 376
    //   237: iload_1
    //   238: istore 7
    //   240: iload_2
    //   241: istore_3
    //   242: iload_2
    //   243: sipush 800
    //   246: if_icmpge +130 -> 376
    //   249: aload 5
    //   251: arraylength
    //   252: iconst_2
    //   253: idiv
    //   254: newarray short
    //   256: astore 6
    //   258: aload 5
    //   260: invokestatic 119	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   263: getstatic 125	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   266: invokevirtual 129	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   269: invokevirtual 133	java/nio/ByteBuffer:asShortBuffer	()Ljava/nio/ShortBuffer;
    //   272: aload 6
    //   274: invokevirtual 139	java/nio/ShortBuffer:get	([S)Ljava/nio/ShortBuffer;
    //   277: pop
    //   278: iconst_0
    //   279: istore_3
    //   280: iload_3
    //   281: aload 6
    //   283: arraylength
    //   284: if_icmpge +39 -> 323
    //   287: aload 6
    //   289: iload_3
    //   290: aload 6
    //   292: iload_3
    //   293: saload
    //   294: iload_1
    //   295: idiv
    //   296: i2s
    //   297: i2s
    //   298: sastore
    //   299: iinc 3 1
    //   302: goto -22 -> 280
    //   305: astore 4
    //   307: ldc 24
    //   309: invokestatic 142	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   312: return
    //   313: astore 4
    //   315: ldc 24
    //   317: invokestatic 142	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   320: goto -8 -> 312
    //   323: aload 5
    //   325: invokestatic 119	java/nio/ByteBuffer:wrap	([B)Ljava/nio/ByteBuffer;
    //   328: getstatic 125	java/nio/ByteOrder:LITTLE_ENDIAN	Ljava/nio/ByteOrder;
    //   331: invokevirtual 129	java/nio/ByteBuffer:order	(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   334: invokevirtual 133	java/nio/ByteBuffer:asShortBuffer	()Ljava/nio/ShortBuffer;
    //   337: aload 6
    //   339: invokevirtual 145	java/nio/ShortBuffer:put	([S)Ljava/nio/ShortBuffer;
    //   342: pop
    //   343: iload_2
    //   344: aload 5
    //   346: arraylength
    //   347: aload_0
    //   348: getfield 15	com/tencent/liteav/audio/impl/Play/d$1:a	Lcom/tencent/liteav/audio/impl/Play/d;
    //   351: invokestatic 40	com/tencent/liteav/audio/impl/Play/d:c	(Lcom/tencent/liteav/audio/impl/Play/d;)I
    //   354: iconst_2
    //   355: imul
    //   356: sipush 1000
    //   359: idiv
    //   360: idiv
    //   361: iadd
    //   362: istore_3
    //   363: iload_1
    //   364: sipush 800
    //   367: iload_3
    //   368: isub
    //   369: imul
    //   370: sipush 800
    //   373: idiv
    //   374: istore 7
    //   376: aload 4
    //   378: aload 5
    //   380: iconst_0
    //   381: aload 5
    //   383: arraylength
    //   384: invokevirtual 149	android/media/AudioTrack:write	([BII)I
    //   387: pop
    //   388: iload 7
    //   390: istore_1
    //   391: iload_3
    //   392: istore_2
    //   393: goto -215 -> 178
    //   396: ldc2_w 150
    //   399: invokestatic 155	com/tencent/liteav/audio/impl/Play/d$1:sleep	(J)V
    //   402: goto -224 -> 178
    //   405: astore 5
    //   407: goto -229 -> 178
    //   410: aload 4
    //   412: invokevirtual 158	android/media/AudioTrack:pause	()V
    //   415: aload 4
    //   417: invokevirtual 161	android/media/AudioTrack:flush	()V
    //   420: aload 4
    //   422: invokevirtual 164	android/media/AudioTrack:stop	()V
    //   425: aload 4
    //   427: invokevirtual 167	android/media/AudioTrack:release	()V
    //   430: invokestatic 53	com/tencent/liteav/audio/impl/Play/d:e	()Ljava/lang/String;
    //   433: ldc 169
    //   435: invokestatic 171	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   438: ldc 24
    //   440: invokestatic 142	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   443: goto -131 -> 312
    //   446: astore 4
    //   448: goto -18 -> 430
    //   451: iconst_2
    //   452: istore_1
    //   453: goto -417 -> 36
    //   456: iconst_3
    //   457: istore_2
    //   458: goto -434 -> 24
    //
    // Exception table:
    //   from	to	target	type
    //   11	22	305	java/lang/Exception
    //   24	36	305	java/lang/Exception
    //   36	138	305	java/lang/Exception
    //   138	143	313	java/lang/Exception
    //   396	402	405	java/lang/InterruptedException
    //   410	430	446	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Play.d.1
 * JD-Core Version:    0.6.2
 */