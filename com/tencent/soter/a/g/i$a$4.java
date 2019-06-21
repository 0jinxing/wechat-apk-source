package com.tencent.soter.a.g;

final class i$a$4
  implements Runnable
{
  i$a$4(i.a parama)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 10528
    //   3: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   10: getfield 36	com/tencent/soter/a/g/i$a:AwV	Lcom/tencent/soter/a/g/i;
    //   13: getfield 42	com/tencent/soter/a/g/i:tWZ	Ljava/lang/String;
    //   16: invokestatic 48	com/tencent/soter/core/c/g:isNullOrNil	(Ljava/lang/String;)Z
    //   19: ifne +457 -> 476
    //   22: invokestatic 54	com/tencent/soter/core/a:dQL	()I
    //   25: iconst_1
    //   26: if_icmpne +150 -> 176
    //   29: aload_0
    //   30: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   33: getfield 36	com/tencent/soter/a/g/i$a:AwV	Lcom/tencent/soter/a/g/i;
    //   36: astore_1
    //   37: aload_0
    //   38: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   41: invokestatic 58	com/tencent/soter/a/g/i$a:a	(Lcom/tencent/soter/a/g/i$a;)Ljava/security/Signature;
    //   44: pop
    //   45: aload_0
    //   46: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   49: invokestatic 62	com/tencent/soter/a/g/i$a:b	(Lcom/tencent/soter/a/g/i$a;)J
    //   52: lstore_2
    //   53: aload_1
    //   54: lload_2
    //   55: invokestatic 66	com/tencent/soter/core/a:nB	(J)[B
    //   58: invokestatic 70	com/tencent/soter/core/a:co	([B)Lcom/tencent/soter/core/c/j;
    //   61: putfield 74	com/tencent/soter/a/g/i:AwG	Lcom/tencent/soter/core/c/j;
    //   64: aload_1
    //   65: getfield 78	com/tencent/soter/a/g/i:AwC	Lcom/tencent/soter/a/f/f;
    //   68: ifnull +14 -> 82
    //   71: aload_1
    //   72: invokevirtual 81	com/tencent/soter/a/g/i:dRs	()V
    //   75: sipush 10528
    //   78: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: return
    //   82: ldc 86
    //   84: ldc 88
    //   86: iconst_0
    //   87: anewarray 4	java/lang/Object
    //   90: invokestatic 93	com/tencent/soter/core/c/d:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   93: new 95	com/tencent/soter/a/b/a
    //   96: astore 4
    //   98: aload 4
    //   100: aload_1
    //   101: getfield 74	com/tencent/soter/a/g/i:AwG	Lcom/tencent/soter/core/c/j;
    //   104: invokespecial 98	com/tencent/soter/a/b/a:<init>	(Lcom/tencent/soter/core/c/j;)V
    //   107: aload_1
    //   108: aload 4
    //   110: invokevirtual 101	com/tencent/soter/a/g/i:b	(Lcom/tencent/soter/a/b/e;)V
    //   113: sipush 10528
    //   116: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: goto -38 -> 81
    //   122: astore 4
    //   124: ldc 86
    //   126: ldc 103
    //   128: iconst_1
    //   129: anewarray 4	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload 4
    //   136: invokevirtual 107	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   139: aastore
    //   140: invokestatic 110	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   143: ldc 86
    //   145: aload 4
    //   147: ldc 112
    //   149: invokestatic 115	com/tencent/soter/core/c/d:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   152: aload_1
    //   153: new 95	com/tencent/soter/a/b/a
    //   156: dup
    //   157: bipush 22
    //   159: ldc 117
    //   161: invokespecial 120	com/tencent/soter/a/b/a:<init>	(ILjava/lang/String;)V
    //   164: invokevirtual 101	com/tencent/soter/a/g/i:b	(Lcom/tencent/soter/a/b/e;)V
    //   167: sipush 10528
    //   170: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: goto -92 -> 81
    //   176: aload_0
    //   177: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   180: invokestatic 58	com/tencent/soter/a/g/i$a:a	(Lcom/tencent/soter/a/g/i$a;)Ljava/security/Signature;
    //   183: aload_0
    //   184: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   187: getfield 36	com/tencent/soter/a/g/i$a:AwV	Lcom/tencent/soter/a/g/i;
    //   190: getfield 42	com/tencent/soter/a/g/i:tWZ	Ljava/lang/String;
    //   193: ldc 122
    //   195: invokestatic 128	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   198: invokevirtual 134	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   201: invokevirtual 140	java/security/Signature:update	([B)V
    //   204: aload_0
    //   205: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   208: getfield 36	com/tencent/soter/a/g/i$a:AwV	Lcom/tencent/soter/a/g/i;
    //   211: astore_1
    //   212: aload_0
    //   213: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   216: invokestatic 58	com/tencent/soter/a/g/i$a:a	(Lcom/tencent/soter/a/g/i$a;)Ljava/security/Signature;
    //   219: astore 4
    //   221: aload_1
    //   222: aload 4
    //   224: invokevirtual 144	java/security/Signature:sign	()[B
    //   227: invokestatic 70	com/tencent/soter/core/a:co	([B)Lcom/tencent/soter/core/c/j;
    //   230: putfield 74	com/tencent/soter/a/g/i:AwG	Lcom/tencent/soter/core/c/j;
    //   233: aload_1
    //   234: getfield 78	com/tencent/soter/a/g/i:AwC	Lcom/tencent/soter/a/f/f;
    //   237: ifnull +158 -> 395
    //   240: aload_1
    //   241: invokevirtual 81	com/tencent/soter/a/g/i:dRs	()V
    //   244: sipush 10528
    //   247: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: goto -169 -> 81
    //   253: astore 4
    //   255: ldc 86
    //   257: ldc 146
    //   259: iconst_1
    //   260: anewarray 4	java/lang/Object
    //   263: dup
    //   264: iconst_0
    //   265: aload 4
    //   267: invokevirtual 147	java/security/SignatureException:getMessage	()Ljava/lang/String;
    //   270: aastore
    //   271: invokestatic 110	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   274: ldc 86
    //   276: aload 4
    //   278: ldc 112
    //   280: invokestatic 115	com/tencent/soter/core/c/d:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   283: new 95	com/tencent/soter/a/b/a
    //   286: astore 4
    //   288: aload 4
    //   290: bipush 22
    //   292: ldc 117
    //   294: invokespecial 120	com/tencent/soter/a/b/a:<init>	(ILjava/lang/String;)V
    //   297: aload_1
    //   298: aload 4
    //   300: invokevirtual 101	com/tencent/soter/a/g/i:b	(Lcom/tencent/soter/a/b/e;)V
    //   303: sipush 10528
    //   306: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   309: goto -228 -> 81
    //   312: astore_1
    //   313: ldc 86
    //   315: ldc 149
    //   317: iconst_0
    //   318: anewarray 4	java/lang/Object
    //   321: invokestatic 110	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   324: ldc 86
    //   326: aload_1
    //   327: ldc 149
    //   329: invokestatic 115	com/tencent/soter/core/c/d:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   332: ldc 86
    //   334: ldc 151
    //   336: iconst_1
    //   337: anewarray 4	java/lang/Object
    //   340: dup
    //   341: iconst_0
    //   342: aload_0
    //   343: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   346: getfield 36	com/tencent/soter/a/g/i$a:AwV	Lcom/tencent/soter/a/g/i;
    //   349: getfield 154	com/tencent/soter/a/g/i:AvS	Ljava/lang/String;
    //   352: aastore
    //   353: invokestatic 110	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   356: aload_0
    //   357: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   360: getfield 36	com/tencent/soter/a/g/i$a:AwV	Lcom/tencent/soter/a/g/i;
    //   363: getfield 154	com/tencent/soter/a/g/i:AvS	Ljava/lang/String;
    //   366: iconst_0
    //   367: invokestatic 158	com/tencent/soter/core/a:cn	(Ljava/lang/String;Z)Lcom/tencent/soter/core/c/f;
    //   370: pop
    //   371: aload_0
    //   372: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   375: getfield 36	com/tencent/soter/a/g/i$a:AwV	Lcom/tencent/soter/a/g/i;
    //   378: new 95	com/tencent/soter/a/b/a
    //   381: dup
    //   382: bipush 30
    //   384: ldc 160
    //   386: invokespecial 120	com/tencent/soter/a/b/a:<init>	(ILjava/lang/String;)V
    //   389: invokevirtual 101	com/tencent/soter/a/g/i:b	(Lcom/tencent/soter/a/b/e;)V
    //   392: goto -188 -> 204
    //   395: ldc 86
    //   397: ldc 88
    //   399: iconst_0
    //   400: anewarray 4	java/lang/Object
    //   403: invokestatic 93	com/tencent/soter/core/c/d:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   406: new 95	com/tencent/soter/a/b/a
    //   409: astore 4
    //   411: aload 4
    //   413: aload_1
    //   414: getfield 74	com/tencent/soter/a/g/i:AwG	Lcom/tencent/soter/core/c/j;
    //   417: invokespecial 98	com/tencent/soter/a/b/a:<init>	(Lcom/tencent/soter/core/c/j;)V
    //   420: aload_1
    //   421: aload 4
    //   423: invokevirtual 101	com/tencent/soter/a/g/i:b	(Lcom/tencent/soter/a/b/e;)V
    //   426: sipush 10528
    //   429: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   432: goto -351 -> 81
    //   435: astore_1
    //   436: ldc 86
    //   438: ldc 162
    //   440: iconst_0
    //   441: anewarray 4	java/lang/Object
    //   444: invokestatic 110	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   447: ldc 86
    //   449: aload_1
    //   450: ldc 164
    //   452: invokestatic 115	com/tencent/soter/core/c/d:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   455: aload_0
    //   456: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   459: sipush -1000
    //   462: ldc 166
    //   464: invokevirtual 170	com/tencent/soter/a/g/i$a:onAuthenticationError	(ILjava/lang/CharSequence;)V
    //   467: sipush 10528
    //   470: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   473: goto -392 -> 81
    //   476: ldc 86
    //   478: ldc 172
    //   480: iconst_0
    //   481: anewarray 4	java/lang/Object
    //   484: invokestatic 110	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   487: aload_0
    //   488: getfield 17	com/tencent/soter/a/g/i$a$4:AwW	Lcom/tencent/soter/a/g/i$a;
    //   491: sipush -1000
    //   494: ldc 174
    //   496: invokevirtual 170	com/tencent/soter/a/g/i$a:onAuthenticationError	(ILjava/lang/CharSequence;)V
    //   499: sipush 10528
    //   502: invokestatic 84	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   505: goto -424 -> 81
    //
    // Exception table:
    //   from	to	target	type
    //   53	81	122	java/lang/Exception
    //   82	113	122	java/lang/Exception
    //   221	250	253	java/security/SignatureException
    //   395	426	253	java/security/SignatureException
    //   176	204	312	java/security/SignatureException
    //   204	221	435	java/lang/Exception
    //   221	250	435	java/lang/Exception
    //   255	303	435	java/lang/Exception
    //   395	426	435	java/lang/Exception
    //   426	432	435	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.i.a.4
 * JD-Core Version:    0.6.2
 */