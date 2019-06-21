package com.tencent.mm.app;

final class e$6
  implements Runnable
{
  private int cei = 0;

  e$6(e parame)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 26
    //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   9: invokestatic 36	com/tencent/mm/app/e:b	(Lcom/tencent/mm/app/e;)Ljava/util/concurrent/locks/ReentrantLock;
    //   12: invokevirtual 41	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   15: aload_0
    //   16: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   19: invokestatic 45	com/tencent/mm/app/e:c	(Lcom/tencent/mm/app/e;)Landroid/os/IBinder;
    //   22: ifnull +75 -> 97
    //   25: aload_0
    //   26: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   29: invokestatic 45	com/tencent/mm/app/e:c	(Lcom/tencent/mm/app/e;)Landroid/os/IBinder;
    //   32: invokeinterface 51 1 0
    //   37: ifeq +60 -> 97
    //   40: iconst_1
    //   41: istore_1
    //   42: ldc 53
    //   44: ldc 55
    //   46: iconst_2
    //   47: anewarray 4	java/lang/Object
    //   50: dup
    //   51: iconst_0
    //   52: aload_0
    //   53: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   56: invokestatic 45	com/tencent/mm/app/e:c	(Lcom/tencent/mm/app/e;)Landroid/os/IBinder;
    //   59: aastore
    //   60: dup
    //   61: iconst_1
    //   62: iload_1
    //   63: invokestatic 61	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   66: aastore
    //   67: invokestatic 66	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: iload_1
    //   71: ifeq +31 -> 102
    //   74: ldc 53
    //   76: ldc 68
    //   78: invokestatic 72	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   81: aload_0
    //   82: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   85: invokestatic 36	com/tencent/mm/app/e:b	(Lcom/tencent/mm/app/e;)Ljava/util/concurrent/locks/ReentrantLock;
    //   88: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   91: ldc 26
    //   93: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: return
    //   97: iconst_0
    //   98: istore_1
    //   99: goto -57 -> 42
    //   102: aload_0
    //   103: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   106: invokestatic 36	com/tencent/mm/app/e:b	(Lcom/tencent/mm/app/e;)Ljava/util/concurrent/locks/ReentrantLock;
    //   109: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   112: ldc 53
    //   114: ldc 80
    //   116: iconst_1
    //   117: anewarray 4	java/lang/Object
    //   120: dup
    //   121: iconst_0
    //   122: aload_0
    //   123: getfield 21	com/tencent/mm/app/e$6:cei	I
    //   126: invokestatic 85	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   129: aastore
    //   130: invokestatic 91	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   133: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   136: aload_0
    //   137: getfield 21	com/tencent/mm/app/e$6:cei	I
    //   140: iconst_1
    //   141: if_icmpne +42 -> 183
    //   144: ldc 96
    //   146: invokestatic 100	com/tencent/mm/app/e:cS	(Ljava/lang/String;)I
    //   149: istore_2
    //   150: iload_2
    //   151: iconst_m1
    //   152: if_icmpeq +152 -> 304
    //   155: ldc 53
    //   157: ldc 102
    //   159: iconst_1
    //   160: anewarray 4	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: iload_2
    //   166: invokestatic 85	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   169: aastore
    //   170: invokestatic 91	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   173: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   176: invokestatic 107	com/tencent/mm/sdk/platformtools/ab:dot	()V
    //   179: iload_2
    //   180: invokestatic 112	android/os/Process:killProcess	(I)V
    //   183: invokestatic 118	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   186: astore_3
    //   187: new 120	android/content/Intent
    //   190: dup
    //   191: aload_3
    //   192: ldc 122
    //   194: invokespecial 125	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   197: astore 4
    //   199: ldc 53
    //   201: ldc 127
    //   203: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   206: aload_3
    //   207: aload_0
    //   208: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   211: invokevirtual 133	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   214: invokestatic 138	com/tencent/mm/booter/c:Ij	()Z
    //   217: ifeq +97 -> 314
    //   220: aload_3
    //   221: aload 4
    //   223: aload_0
    //   224: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   227: iconst_1
    //   228: invokevirtual 142	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   231: pop
    //   232: aload_0
    //   233: getfield 21	com/tencent/mm/app/e$6:cei	I
    //   236: iconst_1
    //   237: if_icmpne +287 -> 524
    //   240: aload_0
    //   241: iconst_0
    //   242: putfield 21	com/tencent/mm/app/e$6:cei	I
    //   245: aload_0
    //   246: ldc2_w 143
    //   249: invokestatic 150	com/tencent/mm/sdk/platformtools/al:n	(Ljava/lang/Runnable;J)V
    //   252: ldc 53
    //   254: ldc 152
    //   256: iconst_1
    //   257: anewarray 4	java/lang/Object
    //   260: dup
    //   261: iconst_0
    //   262: aload_0
    //   263: getfield 21	com/tencent/mm/app/e$6:cei	I
    //   266: invokestatic 85	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   269: aastore
    //   270: invokestatic 91	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   273: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   276: ldc 26
    //   278: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: goto -185 -> 96
    //   284: astore 4
    //   286: aload_0
    //   287: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   290: invokestatic 36	com/tencent/mm/app/e:b	(Lcom/tencent/mm/app/e;)Ljava/util/concurrent/locks/ReentrantLock;
    //   293: invokevirtual 75	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   296: ldc 26
    //   298: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   301: aload 4
    //   303: athrow
    //   304: ldc 53
    //   306: ldc 154
    //   308: invokestatic 104	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   311: goto -128 -> 183
    //   314: aload_3
    //   315: aload 4
    //   317: invokevirtual 158	android/content/Context:stopService	(Landroid/content/Intent;)Z
    //   320: pop
    //   321: aload_3
    //   322: aload 4
    //   324: aload_0
    //   325: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   328: iconst_1
    //   329: invokevirtual 142	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   332: pop
    //   333: aload_3
    //   334: aload 4
    //   336: invokevirtual 162	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   339: pop
    //   340: goto -108 -> 232
    //   343: astore 4
    //   345: ldc 53
    //   347: ldc 164
    //   349: iconst_1
    //   350: anewarray 4	java/lang/Object
    //   353: dup
    //   354: iconst_0
    //   355: aload 4
    //   357: invokevirtual 168	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   360: aastore
    //   361: invokestatic 170	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   364: goto -132 -> 232
    //   367: astore 5
    //   369: invokestatic 138	com/tencent/mm/booter/c:Ij	()Z
    //   372: ifeq +42 -> 414
    //   375: aload_3
    //   376: aload 4
    //   378: aload_0
    //   379: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   382: iconst_1
    //   383: invokevirtual 142	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   386: pop
    //   387: goto -155 -> 232
    //   390: astore 4
    //   392: ldc 53
    //   394: ldc 164
    //   396: iconst_1
    //   397: anewarray 4	java/lang/Object
    //   400: dup
    //   401: iconst_0
    //   402: aload 4
    //   404: invokevirtual 168	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   407: aastore
    //   408: invokestatic 170	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   411: goto -179 -> 232
    //   414: aload_3
    //   415: aload 4
    //   417: invokevirtual 158	android/content/Context:stopService	(Landroid/content/Intent;)Z
    //   420: pop
    //   421: aload_3
    //   422: aload 4
    //   424: aload_0
    //   425: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   428: iconst_1
    //   429: invokevirtual 142	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   432: pop
    //   433: aload_3
    //   434: aload 4
    //   436: invokevirtual 162	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   439: pop
    //   440: goto -208 -> 232
    //   443: astore 5
    //   445: invokestatic 138	com/tencent/mm/booter/c:Ij	()Z
    //   448: ifeq +23 -> 471
    //   451: aload_3
    //   452: aload 4
    //   454: aload_0
    //   455: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   458: iconst_1
    //   459: invokevirtual 142	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   462: pop
    //   463: ldc 26
    //   465: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   468: aload 5
    //   470: athrow
    //   471: aload_3
    //   472: aload 4
    //   474: invokevirtual 158	android/content/Context:stopService	(Landroid/content/Intent;)Z
    //   477: pop
    //   478: aload_3
    //   479: aload 4
    //   481: aload_0
    //   482: getfield 16	com/tencent/mm/app/e$6:cef	Lcom/tencent/mm/app/e;
    //   485: iconst_1
    //   486: invokevirtual 142	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   489: pop
    //   490: aload_3
    //   491: aload 4
    //   493: invokevirtual 162	android/content/Context:startService	(Landroid/content/Intent;)Landroid/content/ComponentName;
    //   496: pop
    //   497: goto -34 -> 463
    //   500: astore 4
    //   502: ldc 53
    //   504: ldc 164
    //   506: iconst_1
    //   507: anewarray 4	java/lang/Object
    //   510: dup
    //   511: iconst_0
    //   512: aload 4
    //   514: invokevirtual 168	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   517: aastore
    //   518: invokestatic 170	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   521: goto -58 -> 463
    //   524: aload_0
    //   525: aload_0
    //   526: getfield 21	com/tencent/mm/app/e$6:cei	I
    //   529: iconst_1
    //   530: iadd
    //   531: putfield 21	com/tencent/mm/app/e$6:cei	I
    //   534: goto -289 -> 245
    //
    // Exception table:
    //   from	to	target	type
    //   5	40	284	finally
    //   42	70	284	finally
    //   74	81	284	finally
    //   214	232	343	java/lang/Exception
    //   314	340	343	java/lang/Exception
    //   199	214	367	java/lang/Exception
    //   369	387	390	java/lang/Exception
    //   414	440	390	java/lang/Exception
    //   199	214	443	finally
    //   445	463	500	java/lang/Exception
    //   471	497	500	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.e.6
 * JD-Core Version:    0.6.2
 */