package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multi.talk.a;
import com.tencent.pb.common.c.c;

final class f$1
  implements talk.a
{
  f$1(f paramf)
  {
  }

  public final void keep_OnError(int paramInt)
  {
    int i = -401;
    AppMethodBeat.i(127866);
    int j = 207;
    int k = -3007;
    int m = 103;
    switch (paramInt)
    {
    default:
      i = -400;
    case -1:
    case -2:
    case -3:
    case -4:
    }
    while (true)
    {
      h.St(k);
      this.AKd.AJC.Su(j);
      c.d("TalkRoomService", new Object[] { "engine exitTalkRoom engineCallback OnError:", Integer.valueOf(paramInt) });
      this.AKd.a(f.b(this.AKd), f.g(this.AKd), f.h(this.AKd), m, true);
      f.f(this.AKd).k(i, null);
      AppMethodBeat.o(127866);
      return;
      j = 203;
      m = 112;
      k = -3003;
      continue;
      j = 204;
      m = 113;
      k = -3004;
      continue;
      j = 205;
      m = 114;
      k = -3005;
      continue;
      j = 206;
      k = -3006;
      m = 115;
      i = -400;
    }
  }

  public final void keep_OnNotify(int paramInt)
  {
    AppMethodBeat.i(127867);
    c.w("TalkRoomService", new Object[] { "keep_OnNotify eventCode: ", Integer.valueOf(paramInt) });
    h localh;
    if (paramInt == 5)
    {
      this.AKd.AJC.AKS = 1;
      localh = this.AKd.AJC;
      if (localh.ALf != 0L)
        break label121;
    }
    label121: for (localh.AKT = 0L; ; localh.AKT = (System.currentTimeMillis() - localh.ALf))
    {
      c.d(h.TAG, new Object[] { "endRecvFirstPcm", Long.valueOf(localh.ALf), Long.valueOf(localh.AKT) });
      f.i(this.AKd);
      f.j(this.AKd);
      AppMethodBeat.o(127867);
      return;
    }
  }

  // ERROR //
  public final void keep_OnOpenSuccess()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 131
    //   4: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   11: getfield 38	com/tencent/wecall/talkroom/model/f:AJC	Lcom/tencent/wecall/talkroom/model/h;
    //   14: iconst_1
    //   15: putfield 134	com/tencent/wecall/talkroom/model/h:nxL	I
    //   18: ldc 43
    //   20: iconst_1
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: ldc 136
    //   28: aastore
    //   29: invokestatic 57	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: aload_0
    //   33: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   36: invokestatic 138	com/tencent/wecall/talkroom/model/f:a	(Lcom/tencent/wecall/talkroom/model/f;)I
    //   39: iconst_4
    //   40: if_icmpeq +36 -> 76
    //   43: ldc 43
    //   45: iconst_2
    //   46: anewarray 4	java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: ldc 140
    //   53: aastore
    //   54: dup
    //   55: iconst_1
    //   56: aload_0
    //   57: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   60: invokestatic 138	com/tencent/wecall/talkroom/model/f:a	(Lcom/tencent/wecall/talkroom/model/f;)I
    //   63: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: aastore
    //   67: invokestatic 93	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: ldc 131
    //   72: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   75: return
    //   76: aload_0
    //   77: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   80: astore_2
    //   81: invokestatic 146	com/tencent/wecall/talkroom/model/c:dTg	()Lcom/tencent/wecall/talkroom/model/c;
    //   84: astore_3
    //   85: aload_0
    //   86: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   89: invokestatic 61	com/tencent/wecall/talkroom/model/f:b	(Lcom/tencent/wecall/talkroom/model/f;)Ljava/lang/String;
    //   92: astore 4
    //   94: aload 4
    //   96: invokestatic 152	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   99: ifeq +321 -> 420
    //   102: aload_1
    //   103: astore_3
    //   104: aload_2
    //   105: aload_3
    //   106: invokestatic 155	com/tencent/wecall/talkroom/model/f:a	(Lcom/tencent/wecall/talkroom/model/f;[I)V
    //   109: aload_0
    //   110: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   113: invokestatic 159	com/tencent/wecall/talkroom/model/f:c	(Lcom/tencent/wecall/talkroom/model/f;)Lcom/tencent/wecall/talkroom/model/b;
    //   116: ifnull +29 -> 145
    //   119: aload_0
    //   120: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   123: invokestatic 159	com/tencent/wecall/talkroom/model/f:c	(Lcom/tencent/wecall/talkroom/model/f;)Lcom/tencent/wecall/talkroom/model/b;
    //   126: astore_3
    //   127: invokestatic 162	com/tencent/wecall/talkroom/model/f:KU	()Z
    //   130: istore 5
    //   132: getstatic 168	com/tencent/pb/common/a/a:Alr	Z
    //   135: ifeq +10 -> 145
    //   138: aload_3
    //   139: getfield 174	com/tencent/wecall/talkroom/model/b:AIV	Lcom/tencent/mm/plugin/multi/talk;
    //   142: ifnonnull +417 -> 559
    //   145: aload_0
    //   146: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   149: invokestatic 177	com/tencent/wecall/talkroom/model/f:d	(Lcom/tencent/wecall/talkroom/model/f;)Z
    //   152: pop
    //   153: aload_0
    //   154: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   157: invokestatic 159	com/tencent/wecall/talkroom/model/f:c	(Lcom/tencent/wecall/talkroom/model/f;)Lcom/tencent/wecall/talkroom/model/b;
    //   160: pop
    //   161: invokestatic 181	com/tencent/wecall/talkroom/model/f:dTA	()Lcom/tencent/pb/talkroom/sdk/e;
    //   164: astore_3
    //   165: aload_3
    //   166: ifnull +10 -> 176
    //   169: aload_3
    //   170: invokeinterface 187 1 0
    //   175: pop
    //   176: aload_0
    //   177: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   180: invokestatic 159	com/tencent/wecall/talkroom/model/f:c	(Lcom/tencent/wecall/talkroom/model/f;)Lcom/tencent/wecall/talkroom/model/b;
    //   183: getfield 174	com/tencent/wecall/talkroom/model/b:AIV	Lcom/tencent/mm/plugin/multi/talk;
    //   186: astore_2
    //   187: getstatic 168	com/tencent/pb/common/a/a:Alr	Z
    //   190: ifeq +80 -> 270
    //   193: new 189	java/util/concurrent/atomic/AtomicInteger
    //   196: astore_3
    //   197: aload_3
    //   198: invokespecial 190	java/util/concurrent/atomic/AtomicInteger:<init>	()V
    //   201: new 189	java/util/concurrent/atomic/AtomicInteger
    //   204: astore_1
    //   205: aload_1
    //   206: invokespecial 190	java/util/concurrent/atomic/AtomicInteger:<init>	()V
    //   209: aload_2
    //   210: aload_3
    //   211: aload_1
    //   212: invokevirtual 196	com/tencent/mm/plugin/multi/talk:getSampleRate	(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;)I
    //   215: pop
    //   216: aload_3
    //   217: invokevirtual 199	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   220: istore 6
    //   222: aload_1
    //   223: invokevirtual 199	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   226: istore 7
    //   228: iload 6
    //   230: putstatic 202	com/tencent/mm/plugin/multi/talk:VOICE_SAMPLERATE	I
    //   233: iload 7
    //   235: putstatic 205	com/tencent/mm/plugin/multi/talk:VOICE_FRAME_DURATION	I
    //   238: ldc 207
    //   240: iconst_3
    //   241: anewarray 4	java/lang/Object
    //   244: dup
    //   245: iconst_0
    //   246: ldc 209
    //   248: aastore
    //   249: dup
    //   250: iconst_1
    //   251: getstatic 202	com/tencent/mm/plugin/multi/talk:VOICE_SAMPLERATE	I
    //   254: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   257: aastore
    //   258: dup
    //   259: iconst_2
    //   260: getstatic 205	com/tencent/mm/plugin/multi/talk:VOICE_FRAME_DURATION	I
    //   263: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   266: aastore
    //   267: invokestatic 93	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   270: new 211	android/os/Handler
    //   273: astore_1
    //   274: aload_1
    //   275: invokestatic 217	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   278: invokespecial 220	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   281: new 222	com/tencent/wecall/talkroom/model/f$1$1
    //   284: astore_3
    //   285: aload_3
    //   286: aload_0
    //   287: invokespecial 225	com/tencent/wecall/talkroom/model/f$1$1:<init>	(Lcom/tencent/wecall/talkroom/model/f$1;)V
    //   290: aload_1
    //   291: aload_3
    //   292: invokevirtual 229	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   295: pop
    //   296: aload_0
    //   297: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   300: getfield 38	com/tencent/wecall/talkroom/model/f:AJC	Lcom/tencent/wecall/talkroom/model/h;
    //   303: astore_3
    //   304: aload_3
    //   305: getfield 101	com/tencent/wecall/talkroom/model/h:ALf	J
    //   308: lconst_0
    //   309: lcmp
    //   310: ifne +305 -> 615
    //   313: aload_3
    //   314: lconst_0
    //   315: putfield 232	com/tencent/wecall/talkroom/model/h:AKU	J
    //   318: getstatic 108	com/tencent/wecall/talkroom/model/h:TAG	Ljava/lang/String;
    //   321: iconst_3
    //   322: anewarray 4	java/lang/Object
    //   325: dup
    //   326: iconst_0
    //   327: ldc 234
    //   329: aastore
    //   330: dup
    //   331: iconst_1
    //   332: aload_3
    //   333: getfield 232	com/tencent/wecall/talkroom/model/h:AKU	J
    //   336: invokestatic 115	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   339: aastore
    //   340: dup
    //   341: iconst_2
    //   342: aload_3
    //   343: getfield 101	com/tencent/wecall/talkroom/model/h:ALf	J
    //   346: invokestatic 115	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   349: aastore
    //   350: invokestatic 57	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   353: aload_0
    //   354: getfield 17	com/tencent/wecall/talkroom/model/f$1:AKd	Lcom/tencent/wecall/talkroom/model/f;
    //   357: invokestatic 77	com/tencent/wecall/talkroom/model/f:f	(Lcom/tencent/wecall/talkroom/model/f;)Lcom/tencent/wecall/talkroom/model/g;
    //   360: astore_1
    //   361: new 236	com/tencent/wecall/talkroom/model/g$3
    //   364: astore_3
    //   365: aload_3
    //   366: aload_1
    //   367: invokespecial 239	com/tencent/wecall/talkroom/model/g$3:<init>	(Lcom/tencent/wecall/talkroom/model/g;)V
    //   370: invokestatic 242	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   373: invokestatic 217	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   376: if_acmpne +254 -> 630
    //   379: aload_3
    //   380: invokeinterface 247 1 0
    //   385: ldc 131
    //   387: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   390: goto -315 -> 75
    //   393: astore_3
    //   394: ldc 43
    //   396: iconst_2
    //   397: anewarray 4	java/lang/Object
    //   400: dup
    //   401: iconst_0
    //   402: ldc 249
    //   404: aastore
    //   405: dup
    //   406: iconst_1
    //   407: aload_3
    //   408: aastore
    //   409: invokestatic 93	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   412: ldc 131
    //   414: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   417: goto -342 -> 75
    //   420: aload_3
    //   421: aload 4
    //   423: invokevirtual 253	com/tencent/wecall/talkroom/model/c:auE	(Ljava/lang/String;)Lcom/tencent/wecall/talkroom/model/TalkRoom;
    //   426: astore 4
    //   428: aload_1
    //   429: astore_3
    //   430: aload 4
    //   432: ifnull -328 -> 104
    //   435: aload 4
    //   437: invokevirtual 259	com/tencent/wecall/talkroom/model/TalkRoom:dSX	()Ljava/util/List;
    //   440: astore 4
    //   442: aload_1
    //   443: astore_3
    //   444: aload 4
    //   446: ifnull -342 -> 104
    //   449: aload 4
    //   451: invokeinterface 264 1 0
    //   456: newarray int
    //   458: astore_3
    //   459: new 266	java/lang/StringBuffer
    //   462: astore_1
    //   463: aload_1
    //   464: invokespecial 267	java/lang/StringBuffer:<init>	()V
    //   467: iconst_0
    //   468: istore 7
    //   470: iload 7
    //   472: aload 4
    //   474: invokeinterface 264 1 0
    //   479: if_icmpge +54 -> 533
    //   482: aload 4
    //   484: iload 7
    //   486: invokeinterface 270 2 0
    //   491: checkcast 272	com/tencent/wecall/talkroom/model/d
    //   494: astore 8
    //   496: aload 8
    //   498: ifnull +29 -> 527
    //   501: aload_3
    //   502: iload 7
    //   504: aload 8
    //   506: invokevirtual 275	com/tencent/wecall/talkroom/model/d:dTj	()I
    //   509: iastore
    //   510: aload_1
    //   511: aload_3
    //   512: iload 7
    //   514: iaload
    //   515: invokevirtual 279	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   518: pop
    //   519: aload_1
    //   520: ldc_w 281
    //   523: invokevirtual 284	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   526: pop
    //   527: iinc 7 1
    //   530: goto -60 -> 470
    //   533: ldc_w 286
    //   536: iconst_2
    //   537: anewarray 4	java/lang/Object
    //   540: dup
    //   541: iconst_0
    //   542: ldc_w 288
    //   545: aastore
    //   546: dup
    //   547: iconst_1
    //   548: aload_1
    //   549: invokevirtual 292	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   552: aastore
    //   553: invokestatic 93	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   556: goto -452 -> 104
    //   559: iload 5
    //   561: ifeq +17 -> 578
    //   564: aload_3
    //   565: getfield 174	com/tencent/wecall/talkroom/model/b:AIV	Lcom/tencent/mm/plugin/multi/talk;
    //   568: sipush 401
    //   571: invokevirtual 296	com/tencent/mm/plugin/multi/talk:setAppCmd	(I)I
    //   574: pop
    //   575: goto -430 -> 145
    //   578: aload_3
    //   579: getfield 174	com/tencent/wecall/talkroom/model/b:AIV	Lcom/tencent/mm/plugin/multi/talk;
    //   582: sipush 402
    //   585: invokevirtual 296	com/tencent/mm/plugin/multi/talk:setAppCmd	(I)I
    //   588: pop
    //   589: goto -444 -> 145
    //   592: astore_2
    //   593: ldc 207
    //   595: iconst_2
    //   596: anewarray 4	java/lang/Object
    //   599: dup
    //   600: iconst_0
    //   601: ldc_w 298
    //   604: aastore
    //   605: dup
    //   606: iconst_1
    //   607: aload_2
    //   608: aastore
    //   609: invokestatic 93	com/tencent/pb/common/c/c:w	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   612: goto -396 -> 216
    //   615: aload_3
    //   616: invokestatic 127	java/lang/System:currentTimeMillis	()J
    //   619: aload_3
    //   620: getfield 101	com/tencent/wecall/talkroom/model/h:ALf	J
    //   623: lsub
    //   624: putfield 232	com/tencent/wecall/talkroom/model/h:AKU	J
    //   627: goto -309 -> 318
    //   630: aload_1
    //   631: getfield 302	com/tencent/wecall/talkroom/model/g:handler	Landroid/os/Handler;
    //   634: aload_3
    //   635: invokevirtual 229	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   638: pop
    //   639: ldc 131
    //   641: invokestatic 86	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   644: goto -569 -> 75
    //
    // Exception table:
    //   from	to	target	type
    //   76	102	393	java/lang/Throwable
    //   104	145	393	java/lang/Throwable
    //   145	165	393	java/lang/Throwable
    //   169	176	393	java/lang/Throwable
    //   176	209	393	java/lang/Throwable
    //   216	270	393	java/lang/Throwable
    //   270	318	393	java/lang/Throwable
    //   318	390	393	java/lang/Throwable
    //   420	428	393	java/lang/Throwable
    //   435	442	393	java/lang/Throwable
    //   449	467	393	java/lang/Throwable
    //   470	496	393	java/lang/Throwable
    //   501	527	393	java/lang/Throwable
    //   533	556	393	java/lang/Throwable
    //   564	575	393	java/lang/Throwable
    //   578	589	393	java/lang/Throwable
    //   593	612	393	java/lang/Throwable
    //   615	627	393	java/lang/Throwable
    //   630	639	393	java/lang/Throwable
    //   209	216	592	java/lang/Throwable
  }

  public final void keep_OnReportChannel(String paramString)
  {
    AppMethodBeat.i(127870);
    c.d("TalkRoomService", new Object[] { "keep_OnReportChannel:", paramString });
    StringBuilder localStringBuilder = new StringBuilder(com.tencent.pb.common.c.g.atI(this.AKd.AJO));
    localStringBuilder.append(",");
    localStringBuilder.append(paramString);
    h.auR(localStringBuilder.toString());
    AppMethodBeat.o(127870);
  }

  public final void keep_OnReportEngineRecv(String paramString, int paramInt)
  {
    AppMethodBeat.i(127868);
    c.d("TalkRoomService", new Object[] { "keep_OnReportEngineRecv:", Integer.valueOf(paramInt), paramString });
    StringBuilder localStringBuilder = new StringBuilder(com.tencent.pb.common.c.g.atI(this.AKd.AJO));
    localStringBuilder.append(",");
    localStringBuilder.append(paramString);
    h.auP(localStringBuilder.toString());
    AppMethodBeat.o(127868);
  }

  public final void keep_OnReportEngineSend(String paramString)
  {
    AppMethodBeat.i(127869);
    c.d("TalkRoomService", new Object[] { "keep_OnReportEngineSend:", paramString });
    StringBuilder localStringBuilder = new StringBuilder(com.tencent.pb.common.c.g.atI(this.AKd.AJO));
    localStringBuilder.append(",");
    localStringBuilder.append(paramString);
    h.auQ(localStringBuilder.toString());
    AppMethodBeat.o(127869);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.f.1
 * JD-Core Version:    0.6.2
 */