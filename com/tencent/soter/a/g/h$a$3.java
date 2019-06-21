package com.tencent.soter.a.g;

final class h$a$3
  implements Runnable
{
  h$a$3(h.a parama)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 10500
    //   3: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   10: getfield 35	com/tencent/soter/a/g/h$a:AwL	Lcom/tencent/soter/a/g/h;
    //   13: getfield 41	com/tencent/soter/a/g/h:tWZ	Ljava/lang/String;
    //   16: invokestatic 47	com/tencent/soter/core/c/g:isNullOrNil	(Ljava/lang/String;)Z
    //   19: ifne +449 -> 468
    //   22: invokestatic 53	com/tencent/soter/core/a:dQL	()I
    //   25: iconst_1
    //   26: if_icmpne +142 -> 168
    //   29: aload_0
    //   30: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   33: getfield 35	com/tencent/soter/a/g/h$a:AwL	Lcom/tencent/soter/a/g/h;
    //   36: astore_1
    //   37: aload_0
    //   38: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   41: getfield 57	com/tencent/soter/a/g/h$a:AvH	J
    //   44: lstore_2
    //   45: aload_1
    //   46: lload_2
    //   47: invokestatic 61	com/tencent/soter/core/a:nB	(J)[B
    //   50: invokestatic 65	com/tencent/soter/core/a:co	([B)Lcom/tencent/soter/core/c/j;
    //   53: putfield 69	com/tencent/soter/a/g/h:AwG	Lcom/tencent/soter/core/c/j;
    //   56: aload_1
    //   57: getfield 73	com/tencent/soter/a/g/h:AwC	Lcom/tencent/soter/a/f/f;
    //   60: ifnull +14 -> 74
    //   63: aload_1
    //   64: invokevirtual 76	com/tencent/soter/a/g/h:dRs	()V
    //   67: sipush 10500
    //   70: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: return
    //   74: ldc 81
    //   76: ldc 83
    //   78: iconst_0
    //   79: anewarray 4	java/lang/Object
    //   82: invokestatic 88	com/tencent/soter/core/c/d:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   85: new 90	com/tencent/soter/a/b/a
    //   88: astore 4
    //   90: aload 4
    //   92: aload_1
    //   93: getfield 69	com/tencent/soter/a/g/h:AwG	Lcom/tencent/soter/core/c/j;
    //   96: invokespecial 93	com/tencent/soter/a/b/a:<init>	(Lcom/tencent/soter/core/c/j;)V
    //   99: aload_1
    //   100: aload 4
    //   102: invokevirtual 97	com/tencent/soter/a/g/h:b	(Lcom/tencent/soter/a/b/e;)V
    //   105: sipush 10500
    //   108: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: goto -38 -> 73
    //   114: astore 4
    //   116: ldc 81
    //   118: ldc 99
    //   120: iconst_1
    //   121: anewarray 4	java/lang/Object
    //   124: dup
    //   125: iconst_0
    //   126: aload 4
    //   128: invokevirtual 103	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   131: aastore
    //   132: invokestatic 106	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   135: ldc 81
    //   137: aload 4
    //   139: ldc 108
    //   141: invokestatic 112	com/tencent/soter/core/c/d:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   144: aload_1
    //   145: new 90	com/tencent/soter/a/b/a
    //   148: dup
    //   149: bipush 22
    //   151: ldc 114
    //   153: invokespecial 117	com/tencent/soter/a/b/a:<init>	(ILjava/lang/String;)V
    //   156: invokevirtual 97	com/tencent/soter/a/g/h:b	(Lcom/tencent/soter/a/b/e;)V
    //   159: sipush 10500
    //   162: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: goto -92 -> 73
    //   168: aload_0
    //   169: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   172: getfield 121	com/tencent/soter/a/g/h$a:AwM	Ljava/security/Signature;
    //   175: aload_0
    //   176: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   179: getfield 35	com/tencent/soter/a/g/h$a:AwL	Lcom/tencent/soter/a/g/h;
    //   182: getfield 41	com/tencent/soter/a/g/h:tWZ	Ljava/lang/String;
    //   185: ldc 123
    //   187: invokestatic 129	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   190: invokevirtual 135	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   193: invokevirtual 141	java/security/Signature:update	([B)V
    //   196: aload_0
    //   197: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   200: getfield 35	com/tencent/soter/a/g/h$a:AwL	Lcom/tencent/soter/a/g/h;
    //   203: astore_1
    //   204: aload_0
    //   205: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   208: getfield 121	com/tencent/soter/a/g/h$a:AwM	Ljava/security/Signature;
    //   211: astore 4
    //   213: aload_1
    //   214: aload 4
    //   216: invokevirtual 145	java/security/Signature:sign	()[B
    //   219: invokestatic 65	com/tencent/soter/core/a:co	([B)Lcom/tencent/soter/core/c/j;
    //   222: putfield 69	com/tencent/soter/a/g/h:AwG	Lcom/tencent/soter/core/c/j;
    //   225: aload_1
    //   226: getfield 73	com/tencent/soter/a/g/h:AwC	Lcom/tencent/soter/a/f/f;
    //   229: ifnull +158 -> 387
    //   232: aload_1
    //   233: invokevirtual 76	com/tencent/soter/a/g/h:dRs	()V
    //   236: sipush 10500
    //   239: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: goto -169 -> 73
    //   245: astore 4
    //   247: ldc 81
    //   249: ldc 147
    //   251: iconst_1
    //   252: anewarray 4	java/lang/Object
    //   255: dup
    //   256: iconst_0
    //   257: aload 4
    //   259: invokevirtual 148	java/security/SignatureException:getMessage	()Ljava/lang/String;
    //   262: aastore
    //   263: invokestatic 106	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   266: ldc 81
    //   268: aload 4
    //   270: ldc 108
    //   272: invokestatic 112	com/tencent/soter/core/c/d:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   275: new 90	com/tencent/soter/a/b/a
    //   278: astore 4
    //   280: aload 4
    //   282: bipush 22
    //   284: ldc 114
    //   286: invokespecial 117	com/tencent/soter/a/b/a:<init>	(ILjava/lang/String;)V
    //   289: aload_1
    //   290: aload 4
    //   292: invokevirtual 97	com/tencent/soter/a/g/h:b	(Lcom/tencent/soter/a/b/e;)V
    //   295: sipush 10500
    //   298: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   301: goto -228 -> 73
    //   304: astore_1
    //   305: ldc 81
    //   307: ldc 150
    //   309: iconst_0
    //   310: anewarray 4	java/lang/Object
    //   313: invokestatic 106	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   316: ldc 81
    //   318: aload_1
    //   319: ldc 150
    //   321: invokestatic 112	com/tencent/soter/core/c/d:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   324: ldc 81
    //   326: ldc 152
    //   328: iconst_1
    //   329: anewarray 4	java/lang/Object
    //   332: dup
    //   333: iconst_0
    //   334: aload_0
    //   335: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   338: getfield 35	com/tencent/soter/a/g/h$a:AwL	Lcom/tencent/soter/a/g/h;
    //   341: getfield 155	com/tencent/soter/a/g/h:AvS	Ljava/lang/String;
    //   344: aastore
    //   345: invokestatic 106	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   348: aload_0
    //   349: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   352: getfield 35	com/tencent/soter/a/g/h$a:AwL	Lcom/tencent/soter/a/g/h;
    //   355: getfield 155	com/tencent/soter/a/g/h:AvS	Ljava/lang/String;
    //   358: iconst_0
    //   359: invokestatic 159	com/tencent/soter/core/a:cn	(Ljava/lang/String;Z)Lcom/tencent/soter/core/c/f;
    //   362: pop
    //   363: aload_0
    //   364: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   367: getfield 35	com/tencent/soter/a/g/h$a:AwL	Lcom/tencent/soter/a/g/h;
    //   370: new 90	com/tencent/soter/a/b/a
    //   373: dup
    //   374: bipush 30
    //   376: ldc 161
    //   378: invokespecial 117	com/tencent/soter/a/b/a:<init>	(ILjava/lang/String;)V
    //   381: invokevirtual 97	com/tencent/soter/a/g/h:b	(Lcom/tencent/soter/a/b/e;)V
    //   384: goto -188 -> 196
    //   387: ldc 81
    //   389: ldc 83
    //   391: iconst_0
    //   392: anewarray 4	java/lang/Object
    //   395: invokestatic 88	com/tencent/soter/core/c/d:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: new 90	com/tencent/soter/a/b/a
    //   401: astore 4
    //   403: aload 4
    //   405: aload_1
    //   406: getfield 69	com/tencent/soter/a/g/h:AwG	Lcom/tencent/soter/core/c/j;
    //   409: invokespecial 93	com/tencent/soter/a/b/a:<init>	(Lcom/tencent/soter/core/c/j;)V
    //   412: aload_1
    //   413: aload 4
    //   415: invokevirtual 97	com/tencent/soter/a/g/h:b	(Lcom/tencent/soter/a/b/e;)V
    //   418: sipush 10500
    //   421: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   424: goto -351 -> 73
    //   427: astore_1
    //   428: ldc 81
    //   430: ldc 163
    //   432: iconst_0
    //   433: anewarray 4	java/lang/Object
    //   436: invokestatic 106	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   439: ldc 81
    //   441: aload_1
    //   442: ldc 165
    //   444: invokestatic 112	com/tencent/soter/core/c/d:a	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   447: aload_0
    //   448: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   451: sipush -1000
    //   454: ldc 167
    //   456: invokevirtual 171	com/tencent/soter/a/g/h$a:onAuthenticationError	(ILjava/lang/CharSequence;)V
    //   459: sipush 10500
    //   462: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   465: goto -392 -> 73
    //   468: ldc 81
    //   470: ldc 173
    //   472: iconst_0
    //   473: anewarray 4	java/lang/Object
    //   476: invokestatic 106	com/tencent/soter/core/c/d:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   479: aload_0
    //   480: getfield 17	com/tencent/soter/a/g/h$a$3:AwP	Lcom/tencent/soter/a/g/h$a;
    //   483: sipush -1000
    //   486: ldc 175
    //   488: invokevirtual 171	com/tencent/soter/a/g/h$a:onAuthenticationError	(ILjava/lang/CharSequence;)V
    //   491: sipush 10500
    //   494: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   497: goto -424 -> 73
    //
    // Exception table:
    //   from	to	target	type
    //   45	73	114	java/lang/Exception
    //   74	105	114	java/lang/Exception
    //   213	242	245	java/security/SignatureException
    //   387	418	245	java/security/SignatureException
    //   168	196	304	java/security/SignatureException
    //   196	213	427	java/lang/Exception
    //   213	242	427	java/lang/Exception
    //   247	295	427	java/lang/Exception
    //   387	418	427	java/lang/Exception
    //   418	424	427	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.h.a.3
 * JD-Core Version:    0.6.2
 */