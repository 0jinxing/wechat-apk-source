package com.tencent.mm.ui;

import android.os.MessageQueue.IdleHandler;

final class HomeUI$15
  implements MessageQueue.IdleHandler
{
  HomeUI$15(HomeUI paramHomeUI)
  {
  }

  // ERROR //
  public final boolean queueIdle()
  {
    // Byte code:
    //   0: sipush 29361
    //   3: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 32	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   9: pop
    //   10: invokestatic 38	com/tencent/mm/model/c:Ry	()Lcom/tencent/mm/storage/z;
    //   13: bipush 15
    //   15: aconst_null
    //   16: invokevirtual 44	com/tencent/mm/storage/z:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   19: checkcast 46	java/lang/Integer
    //   22: invokestatic 52	com/tencent/mm/platformtools/ah:h	(Ljava/lang/Integer;)I
    //   25: ifne +24 -> 49
    //   28: iconst_1
    //   29: istore_1
    //   30: iload_1
    //   31: ifeq +23 -> 54
    //   34: ldc 54
    //   36: ldc 56
    //   38: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   41: sipush 29361
    //   44: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: iconst_0
    //   48: ireturn
    //   49: iconst_0
    //   50: istore_1
    //   51: goto -21 -> 30
    //   54: getstatic 71	com/tencent/mm/model/av:fly	Lcom/tencent/mm/model/av;
    //   57: ldc 73
    //   59: ldc 75
    //   61: invokevirtual 79	com/tencent/mm/model/av:T	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   64: astore_2
    //   65: invokestatic 82	com/tencent/mm/model/aw:ZM	()Z
    //   68: ifne +12 -> 80
    //   71: aload_2
    //   72: ldc 75
    //   74: invokevirtual 88	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   77: ifne +28 -> 105
    //   80: invokestatic 92	com/tencent/mm/model/aw:Rg	()Lcom/tencent/mm/ai/p;
    //   83: new 94	com/tencent/mm/model/bk
    //   86: dup
    //   87: new 96	com/tencent/mm/ui/HomeUI$15$1
    //   90: dup
    //   91: aload_0
    //   92: invokespecial 99	com/tencent/mm/ui/HomeUI$15$1:<init>	(Lcom/tencent/mm/ui/HomeUI$15;)V
    //   95: ldc 101
    //   97: invokespecial 104	com/tencent/mm/model/bk:<init>	(Lcom/tencent/mm/model/bk$a;Ljava/lang/String;)V
    //   100: iconst_0
    //   101: invokevirtual 110	com/tencent/mm/ai/p:a	(Lcom/tencent/mm/ai/m;I)Z
    //   104: pop
    //   105: new 112	com/tencent/mm/booter/w$1
    //   108: dup
    //   109: new 114	com/tencent/mm/booter/w
    //   112: dup
    //   113: aload_0
    //   114: getfield 14	com/tencent/mm/ui/HomeUI$15:yjm	Lcom/tencent/mm/ui/HomeUI;
    //   117: invokestatic 118	com/tencent/mm/ui/HomeUI:b	(Lcom/tencent/mm/ui/HomeUI;)Lcom/tencent/mm/ui/MMFragmentActivity;
    //   120: invokespecial 121	com/tencent/mm/booter/w:<init>	(Landroid/content/Context;)V
    //   123: invokespecial 124	com/tencent/mm/booter/w$1:<init>	(Lcom/tencent/mm/booter/w;)V
    //   126: ldc 126
    //   128: invokestatic 132	com/tencent/mm/sdk/g/d:post	(Ljava/lang/Runnable;Ljava/lang/String;)V
    //   131: invokestatic 137	com/tencent/mm/booter/n:IE	()V
    //   134: invokestatic 140	com/tencent/mm/ui/HomeUI:dxw	()V
    //   137: invokestatic 145	com/tencent/mm/plugin/report/service/f:cgq	()V
    //   140: invokestatic 151	com/tencent/mm/at/n:ahb	()Lcom/tencent/mm/at/n;
    //   143: getfield 155	com/tencent/mm/at/n:fFM	Lcom/tencent/mm/at/n$c;
    //   146: astore_2
    //   147: aload_2
    //   148: getfield 161	com/tencent/mm/at/n$c:fGb	Ljava/util/LinkedList;
    //   151: invokevirtual 167	java/util/LinkedList:size	()I
    //   154: ifgt +13 -> 167
    //   157: aload_2
    //   158: getfield 170	com/tencent/mm/at/n$c:fGa	Ljava/util/LinkedList;
    //   161: invokevirtual 167	java/util/LinkedList:size	()I
    //   164: ifle +29 -> 193
    //   167: aload_2
    //   168: invokevirtual 173	com/tencent/mm/at/n$c:ahf	()V
    //   171: invokestatic 179	android/os/Looper:myQueue	()Landroid/os/MessageQueue;
    //   174: aload_0
    //   175: getfield 14	com/tencent/mm/ui/HomeUI$15:yjm	Lcom/tencent/mm/ui/HomeUI;
    //   178: getfield 183	com/tencent/mm/ui/HomeUI:jQs	Landroid/os/MessageQueue$IdleHandler;
    //   181: invokevirtual 189	android/os/MessageQueue:removeIdleHandler	(Landroid/os/MessageQueue$IdleHandler;)V
    //   184: sipush 29361
    //   187: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   190: goto -143 -> 47
    //   193: invokestatic 195	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   196: invokevirtual 198	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   199: ldc 199
    //   201: ldc 75
    //   203: invokevirtual 44	com/tencent/mm/storage/z:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   206: checkcast 84	java/lang/String
    //   209: astore_3
    //   210: invokestatic 195	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   213: invokevirtual 198	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   216: ldc 200
    //   218: ldc 75
    //   220: invokevirtual 44	com/tencent/mm/storage/z:get	(ILjava/lang/Object;)Ljava/lang/Object;
    //   223: checkcast 84	java/lang/String
    //   226: astore 4
    //   228: aload_3
    //   229: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   232: ifne +55 -> 287
    //   235: aload_3
    //   236: ldc 208
    //   238: invokevirtual 212	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   241: astore 5
    //   243: aload_2
    //   244: monitorenter
    //   245: aload 5
    //   247: arraylength
    //   248: istore 6
    //   250: iconst_0
    //   251: istore_1
    //   252: iload_1
    //   253: iload 6
    //   255: if_icmpge +30 -> 285
    //   258: aload 5
    //   260: iload_1
    //   261: aaload
    //   262: invokestatic 216	com/tencent/mm/at/n$c:su	(Ljava/lang/String;)Lcom/tencent/mm/at/n$b;
    //   265: astore_3
    //   266: aload_3
    //   267: ifnull +12 -> 279
    //   270: aload_2
    //   271: getfield 161	com/tencent/mm/at/n$c:fGb	Ljava/util/LinkedList;
    //   274: aload_3
    //   275: invokevirtual 219	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   278: pop
    //   279: iinc 1 1
    //   282: goto -30 -> 252
    //   285: aload_2
    //   286: monitorexit
    //   287: aload 4
    //   289: invokestatic 206	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   292: ifne +69 -> 361
    //   295: aload 4
    //   297: ldc 208
    //   299: invokevirtual 212	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   302: astore_3
    //   303: aload_2
    //   304: monitorenter
    //   305: aload_3
    //   306: arraylength
    //   307: istore 6
    //   309: iconst_0
    //   310: istore_1
    //   311: iload_1
    //   312: iload 6
    //   314: if_icmpge +45 -> 359
    //   317: aload_3
    //   318: iload_1
    //   319: aaload
    //   320: invokestatic 222	com/tencent/mm/at/n$c:st	(Ljava/lang/String;)Lcom/tencent/mm/at/n$b;
    //   323: astore 4
    //   325: aload 4
    //   327: ifnull +13 -> 340
    //   330: aload_2
    //   331: getfield 170	com/tencent/mm/at/n$c:fGa	Ljava/util/LinkedList;
    //   334: aload 4
    //   336: invokevirtual 219	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   339: pop
    //   340: iinc 1 1
    //   343: goto -32 -> 311
    //   346: astore 4
    //   348: aload_2
    //   349: monitorexit
    //   350: sipush 29361
    //   353: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   356: aload 4
    //   358: athrow
    //   359: aload_2
    //   360: monitorexit
    //   361: ldc 224
    //   363: ldc 226
    //   365: iconst_2
    //   366: anewarray 4	java/lang/Object
    //   369: dup
    //   370: iconst_0
    //   371: aload_2
    //   372: getfield 170	com/tencent/mm/at/n$c:fGa	Ljava/util/LinkedList;
    //   375: invokevirtual 167	java/util/LinkedList:size	()I
    //   378: invokestatic 230	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   381: aastore
    //   382: dup
    //   383: iconst_1
    //   384: aload_2
    //   385: getfield 161	com/tencent/mm/at/n$c:fGb	Ljava/util/LinkedList;
    //   388: invokevirtual 167	java/util/LinkedList:size	()I
    //   391: invokestatic 230	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   394: aastore
    //   395: invokestatic 233	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   398: goto -231 -> 167
    //   401: astore 4
    //   403: aload_2
    //   404: monitorexit
    //   405: sipush 29361
    //   408: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   411: aload 4
    //   413: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   245	250	346	finally
    //   258	266	346	finally
    //   270	279	346	finally
    //   285	287	346	finally
    //   348	350	346	finally
    //   305	309	401	finally
    //   317	325	401	finally
    //   330	340	401	finally
    //   359	361	401	finally
    //   403	405	401	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.15
 * JD-Core Version:    0.6.2
 */