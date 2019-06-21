package com.tencent.mm.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.p;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  private static String bWa;
  private static int cdA;
  private static p cdB;
  private static final a.b cdC;
  private static final a.d cdD;
  private static a.b cdE;
  private static a.d cdF;
  private static Handler cdG;
  private static int cdH;
  private static int cdI;
  private static String cdJ;
  private static boolean cdK;
  private static boolean cdL;
  private static Thread cdM;
  private static int cdz;

  static
  {
    AppMethodBeat.i(15364);
    cdz = 0;
    cdA = 0;
    cdB = new p(Process.myPid());
    cdC = new a.b()
    {
      public final void c(a.a paramAnonymousa)
      {
        AppMethodBeat.i(15348);
        int i = ah.getContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getInt("main_thread_watch_report", 0);
        boolean bool;
        if (i > 0)
          bool = true;
        while (true)
        {
          ab.w("MicroMsg.ANRWatchDog.summeranr", "summeranr onAppNotResponding error reportFlag[%b]", new Object[] { Boolean.valueOf(bool) });
          try
          {
            String str = a.b(paramAnonymousa);
            if (i > 0)
            {
              paramAnonymousa = str;
              if (str != null)
              {
                paramAnonymousa = str;
                if (str.length() > 51200)
                  paramAnonymousa = str.substring(0, 51200);
              }
              b.A(Base64.encodeToString(paramAnonymousa.getBytes(), 2), "main_thread_watch");
              AppMethodBeat.o(15348);
            }
            while (true)
            {
              return;
              bool = false;
              break;
              com.tencent.mm.plugin.report.service.h.pYm.a(510L, 14L, 1L, true);
              AppMethodBeat.o(15348);
            }
          }
          catch (OutOfMemoryError paramAnonymousa)
          {
            while (true)
            {
              ab.e("MicroMsg.ANRWatchDog.summeranr", "summeranr buildReport OutOfMemory %s", new Object[] { paramAnonymousa.getMessage() });
              System.gc();
              com.tencent.mm.plugin.report.service.h.pYm.a(510L, 15L, 1L, true);
              AppMethodBeat.o(15348);
            }
          }
        }
      }
    };
    cdD = new a.d()
    {
      public final void a(InterruptedException paramAnonymousInterruptedException)
      {
        AppMethodBeat.i(15349);
        ab.w("MicroMsg.ANRWatchDog.summeranr", "summeranr DEFAULT_INTERRUPTION_LISTENER onInterrupted exception.getMessage[%s]", new Object[] { paramAnonymousInterruptedException.getMessage() });
        AppMethodBeat.o(15349);
      }
    };
    cdE = cdC;
    cdF = cdD;
    cdH = 4500;
    cdI = 500;
    cdJ = "";
    cdK = true;
    cdL = false;
    bWa = "";
    AppMethodBeat.o(15364);
  }

  // ERROR //
  private static String a(a.a parama)
  {
    // Byte code:
    //   0: sipush 15361
    //   3: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 123	org/json/JSONObject
    //   9: dup
    //   10: invokespecial 124	org/json/JSONObject:<init>	()V
    //   13: astore_1
    //   14: new 123	org/json/JSONObject
    //   17: astore_2
    //   18: aload_2
    //   19: invokespecial 124	org/json/JSONObject:<init>	()V
    //   22: aload_1
    //   23: ldc 126
    //   25: aload_2
    //   26: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   29: pop
    //   30: aload_2
    //   31: ldc 132
    //   33: iconst_1
    //   34: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   37: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   40: pop
    //   41: new 140	java/lang/String
    //   44: astore_3
    //   45: aload_3
    //   46: getstatic 145	android/os/Build:MODEL	Ljava/lang/String;
    //   49: invokespecial 148	java/lang/String:<init>	(Ljava/lang/String;)V
    //   52: aload_2
    //   53: ldc 150
    //   55: aload_3
    //   56: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   59: pop
    //   60: new 140	java/lang/String
    //   63: astore 4
    //   65: new 152	java/lang/StringBuilder
    //   68: astore_3
    //   69: aload_3
    //   70: ldc 154
    //   72: invokespecial 155	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   75: aload 4
    //   77: aload_3
    //   78: getstatic 160	android/os/Build$VERSION:SDK_INT	I
    //   81: invokevirtual 164	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   84: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokespecial 148	java/lang/String:<init>	(Ljava/lang/String;)V
    //   90: aload_2
    //   91: ldc 170
    //   93: aload 4
    //   95: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   98: pop
    //   99: new 123	org/json/JSONObject
    //   102: astore_3
    //   103: aload_3
    //   104: invokespecial 124	org/json/JSONObject:<init>	()V
    //   107: aload_1
    //   108: ldc 172
    //   110: aload_3
    //   111: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   114: pop
    //   115: aload_3
    //   116: ldc 174
    //   118: ldc 176
    //   120: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   123: pop
    //   124: new 178	org/json/JSONArray
    //   127: astore_2
    //   128: aload_2
    //   129: invokespecial 179	org/json/JSONArray:<init>	()V
    //   132: new 123	org/json/JSONObject
    //   135: astore 4
    //   137: aload 4
    //   139: invokespecial 124	org/json/JSONObject:<init>	()V
    //   142: aload_2
    //   143: aload 4
    //   145: invokevirtual 182	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   148: pop
    //   149: aload_3
    //   150: ldc 184
    //   152: aload_2
    //   153: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   156: pop
    //   157: new 123	org/json/JSONObject
    //   160: astore_2
    //   161: aload_2
    //   162: invokespecial 124	org/json/JSONObject:<init>	()V
    //   165: aload 4
    //   167: ldc 186
    //   169: aload_2
    //   170: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   173: pop
    //   174: aload_0
    //   175: getfield 190	com/tencent/mm/app/a$a:cdN	Ljava/util/LinkedList;
    //   178: astore_0
    //   179: aload_0
    //   180: invokestatic 196	com/tencent/mm/sdk/platformtools/bo:ek	(Ljava/util/List;)Z
    //   183: ifne +301 -> 484
    //   186: aload_0
    //   187: invokevirtual 202	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   190: astore_0
    //   191: aload_0
    //   192: invokeinterface 207 1 0
    //   197: ifeq +287 -> 484
    //   200: aload_0
    //   201: invokeinterface 211 1 0
    //   206: checkcast 213	android/util/Pair
    //   209: astore 5
    //   211: aload 5
    //   213: getfield 217	android/util/Pair:first	Ljava/lang/Object;
    //   216: checkcast 219	java/lang/Thread
    //   219: astore 6
    //   221: aload 5
    //   223: getfield 222	android/util/Pair:second	Ljava/lang/Object;
    //   226: checkcast 224	[Ljava/lang/StackTraceElement;
    //   229: astore 5
    //   231: aload 5
    //   233: ifnull -42 -> 191
    //   236: aload 5
    //   238: arraylength
    //   239: ifle -48 -> 191
    //   242: new 152	java/lang/StringBuilder
    //   245: astore 7
    //   247: aload 7
    //   249: invokespecial 225	java/lang/StringBuilder:<init>	()V
    //   252: aload 7
    //   254: aload 6
    //   256: invokevirtual 228	java/lang/Thread:getName	()Ljava/lang/String;
    //   259: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: ldc 233
    //   264: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: aload 6
    //   269: invokevirtual 236	java/lang/Thread:getPriority	()I
    //   272: invokevirtual 164	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   275: ldc 238
    //   277: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: aload 6
    //   282: invokevirtual 242	java/lang/Thread:getId	()J
    //   285: invokevirtual 245	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   288: ldc 247
    //   290: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: aload 6
    //   295: invokevirtual 251	java/lang/Thread:getState	()Ljava/lang/Thread$State;
    //   298: invokevirtual 254	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   301: ldc_w 256
    //   304: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: astore 7
    //   312: new 178	org/json/JSONArray
    //   315: astore 6
    //   317: aload 6
    //   319: invokespecial 179	org/json/JSONArray:<init>	()V
    //   322: aload 5
    //   324: arraylength
    //   325: istore 8
    //   327: iconst_0
    //   328: istore 9
    //   330: iload 9
    //   332: iload 8
    //   334: if_icmpge +32 -> 366
    //   337: aload 5
    //   339: iload 9
    //   341: aaload
    //   342: astore 10
    //   344: aload 10
    //   346: ifnull +14 -> 360
    //   349: aload 6
    //   351: aload 10
    //   353: invokevirtual 259	java/lang/StackTraceElement:toString	()Ljava/lang/String;
    //   356: invokevirtual 182	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   359: pop
    //   360: iinc 9 1
    //   363: goto -33 -> 330
    //   366: aload_2
    //   367: aload 7
    //   369: aload 6
    //   371: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   374: pop
    //   375: goto -184 -> 191
    //   378: astore_0
    //   379: ldc_w 261
    //   382: aload_0
    //   383: ldc_w 263
    //   386: iconst_0
    //   387: anewarray 4	java/lang/Object
    //   390: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   393: getstatic 275	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   396: ldc2_w 276
    //   399: ldc2_w 278
    //   402: lconst_1
    //   403: iconst_1
    //   404: invokevirtual 282	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   407: aload_1
    //   408: invokevirtual 283	org/json/JSONObject:toString	()Ljava/lang/String;
    //   411: astore_2
    //   412: aload_1
    //   413: invokevirtual 286	org/json/JSONObject:length	()I
    //   416: istore 9
    //   418: aload_2
    //   419: invokevirtual 287	java/lang/String:length	()I
    //   422: istore 8
    //   424: aload_2
    //   425: invokevirtual 287	java/lang/String:length	()I
    //   428: ldc_w 288
    //   431: if_icmple +986 -> 1417
    //   434: aload_2
    //   435: iconst_0
    //   436: ldc_w 288
    //   439: invokevirtual 292	java/lang/String:substring	(II)Ljava/lang/String;
    //   442: astore_0
    //   443: ldc_w 261
    //   446: ldc_w 294
    //   449: iconst_3
    //   450: anewarray 4	java/lang/Object
    //   453: dup
    //   454: iconst_0
    //   455: iload 9
    //   457: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   460: aastore
    //   461: dup
    //   462: iconst_1
    //   463: iload 8
    //   465: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   468: aastore
    //   469: dup
    //   470: iconst_2
    //   471: aload_0
    //   472: aastore
    //   473: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   476: sipush 15361
    //   479: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   482: aload_2
    //   483: areturn
    //   484: getstatic 65	com/tencent/mm/app/a:cdB	Lcom/tencent/mm/compatible/e/p;
    //   487: invokevirtual 300	com/tencent/mm/compatible/e/p:LI	()I
    //   490: istore 11
    //   492: getstatic 65	com/tencent/mm/app/a:cdB	Lcom/tencent/mm/compatible/e/p;
    //   495: invokevirtual 303	com/tencent/mm/compatible/e/p:LJ	()I
    //   498: istore 9
    //   500: getstatic 65	com/tencent/mm/app/a:cdB	Lcom/tencent/mm/compatible/e/p;
    //   503: invokevirtual 306	com/tencent/mm/compatible/e/p:LH	()I
    //   506: istore 8
    //   508: ldc_w 261
    //   511: ldc_w 308
    //   514: iconst_3
    //   515: anewarray 4	java/lang/Object
    //   518: dup
    //   519: iconst_0
    //   520: iload 11
    //   522: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   525: aastore
    //   526: dup
    //   527: iconst_1
    //   528: iload 9
    //   530: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   533: aastore
    //   534: dup
    //   535: iconst_2
    //   536: iload 8
    //   538: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   541: aastore
    //   542: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   545: aload 4
    //   547: ldc_w 310
    //   550: iload 11
    //   552: invokevirtual 313	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   555: pop
    //   556: aload 4
    //   558: ldc_w 315
    //   561: iload 9
    //   563: invokevirtual 313	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   566: pop
    //   567: aload 4
    //   569: ldc_w 317
    //   572: iload 8
    //   574: invokevirtual 313	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   577: pop
    //   578: invokestatic 323	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   581: ldc_w 325
    //   584: invokevirtual 331	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   587: checkcast 333	android/app/ActivityManager
    //   590: astore 5
    //   592: new 335	android/app/ActivityManager$MemoryInfo
    //   595: astore_2
    //   596: aload_2
    //   597: invokespecial 336	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   600: aload 5
    //   602: aload_2
    //   603: invokevirtual 340	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   606: lconst_0
    //   607: lstore 12
    //   609: bipush 16
    //   611: invokestatic 346	com/tencent/mm/compatible/util/d:iW	(I)Z
    //   614: ifeq +399 -> 1013
    //   617: aload_2
    //   618: getfield 350	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   621: lstore 12
    //   623: ldc_w 261
    //   626: ldc_w 352
    //   629: iconst_4
    //   630: anewarray 4	java/lang/Object
    //   633: dup
    //   634: iconst_0
    //   635: lload 12
    //   637: invokestatic 357	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   640: aastore
    //   641: dup
    //   642: iconst_1
    //   643: aload_2
    //   644: getfield 360	android/app/ActivityManager$MemoryInfo:availMem	J
    //   647: invokestatic 357	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   650: aastore
    //   651: dup
    //   652: iconst_2
    //   653: aload_2
    //   654: getfield 363	android/app/ActivityManager$MemoryInfo:threshold	J
    //   657: invokestatic 357	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   660: aastore
    //   661: dup
    //   662: iconst_3
    //   663: aload_2
    //   664: getfield 366	android/app/ActivityManager$MemoryInfo:lowMemory	Z
    //   667: invokestatic 371	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   670: aastore
    //   671: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   674: aload 4
    //   676: ldc_w 373
    //   679: lload 12
    //   681: invokevirtual 376	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   684: pop
    //   685: aload 4
    //   687: ldc_w 378
    //   690: aload_2
    //   691: getfield 360	android/app/ActivityManager$MemoryInfo:availMem	J
    //   694: invokevirtual 376	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   697: pop
    //   698: aload 4
    //   700: ldc_w 380
    //   703: aload_2
    //   704: getfield 363	android/app/ActivityManager$MemoryInfo:threshold	J
    //   707: invokevirtual 376	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   710: pop
    //   711: aload 4
    //   713: ldc_w 382
    //   716: aload_2
    //   717: getfield 366	android/app/ActivityManager$MemoryInfo:lowMemory	Z
    //   720: invokevirtual 385	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   723: pop
    //   724: aload 4
    //   726: ldc_w 387
    //   729: invokestatic 392	android/os/Debug:getNativeHeapSize	()J
    //   732: invokevirtual 376	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   735: pop
    //   736: aload 4
    //   738: ldc_w 394
    //   741: invokestatic 397	android/os/Debug:getNativeHeapAllocatedSize	()J
    //   744: invokevirtual 376	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   747: pop
    //   748: aload 4
    //   750: ldc_w 399
    //   753: invokestatic 402	android/os/Debug:getNativeHeapFreeSize	()J
    //   756: invokevirtual 376	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   759: pop
    //   760: aload 5
    //   762: iconst_1
    //   763: newarray int
    //   765: dup
    //   766: iconst_0
    //   767: invokestatic 59	android/os/Process:myPid	()I
    //   770: iastore
    //   771: invokevirtual 406	android/app/ActivityManager:getProcessMemoryInfo	([I)[Landroid/os/Debug$MemoryInfo;
    //   774: astore_0
    //   775: aload_0
    //   776: ifnull +66 -> 842
    //   779: aload_0
    //   780: arraylength
    //   781: ifle +61 -> 842
    //   784: aload_0
    //   785: iconst_0
    //   786: aaload
    //   787: ifnull +55 -> 842
    //   790: aload_0
    //   791: iconst_0
    //   792: aaload
    //   793: astore_0
    //   794: aload 4
    //   796: ldc_w 408
    //   799: aload_0
    //   800: invokevirtual 413	android/os/Debug$MemoryInfo:getTotalPrivateDirty	()I
    //   803: bipush 10
    //   805: ishl
    //   806: invokevirtual 313	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   809: pop
    //   810: aload 4
    //   812: ldc_w 415
    //   815: aload_0
    //   816: invokevirtual 418	android/os/Debug$MemoryInfo:getTotalSharedDirty	()I
    //   819: bipush 10
    //   821: ishl
    //   822: invokevirtual 313	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   825: pop
    //   826: aload 4
    //   828: ldc_w 420
    //   831: aload_0
    //   832: invokevirtual 423	android/os/Debug$MemoryInfo:getTotalPss	()I
    //   835: bipush 10
    //   837: ishl
    //   838: invokevirtual 313	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   841: pop
    //   842: getstatic 49	com/tencent/mm/app/a:cdz	I
    //   845: iconst_1
    //   846: if_icmpne +417 -> 1263
    //   849: invokestatic 428	com/tencent/mm/model/aw:RK	()Z
    //   852: ifeq +411 -> 1263
    //   855: invokestatic 434	com/tencent/mm/kernel/g:RN	()Lcom/tencent/mm/kernel/a;
    //   858: getfield 439	com/tencent/mm/kernel/a:eJb	Z
    //   861: ifeq +402 -> 1263
    //   864: getstatic 445	com/tencent/mm/storage/ac$a:xQt	Lcom/tencent/mm/storage/ac$a;
    //   867: astore 6
    //   869: getstatic 448	com/tencent/mm/storage/ac$a:xQu	Lcom/tencent/mm/storage/ac$a;
    //   872: astore 14
    //   874: getstatic 451	com/tencent/mm/storage/ac$a:xQv	Lcom/tencent/mm/storage/ac$a;
    //   877: astore 10
    //   879: getstatic 454	com/tencent/mm/storage/ac$a:xQw	Lcom/tencent/mm/storage/ac$a;
    //   882: astore 5
    //   884: getstatic 457	com/tencent/mm/storage/ac$a:xQx	Lcom/tencent/mm/storage/ac$a;
    //   887: astore 7
    //   889: getstatic 460	com/tencent/mm/storage/ac$a:xQy	Lcom/tencent/mm/storage/ac$a;
    //   892: astore 15
    //   894: getstatic 463	com/tencent/mm/storage/ac$a:xQz	Lcom/tencent/mm/storage/ac$a;
    //   897: astore 16
    //   899: iconst_0
    //   900: istore 9
    //   902: ldc 82
    //   904: astore_0
    //   905: iload 9
    //   907: bipush 7
    //   909: if_icmpge +321 -> 1230
    //   912: bipush 7
    //   914: anewarray 441	com/tencent/mm/storage/ac$a
    //   917: dup
    //   918: iconst_0
    //   919: aload 6
    //   921: aastore
    //   922: dup
    //   923: iconst_1
    //   924: aload 14
    //   926: aastore
    //   927: dup
    //   928: iconst_2
    //   929: aload 10
    //   931: aastore
    //   932: dup
    //   933: iconst_3
    //   934: aload 5
    //   936: aastore
    //   937: dup
    //   938: iconst_4
    //   939: aload 7
    //   941: aastore
    //   942: dup
    //   943: iconst_5
    //   944: aload 15
    //   946: aastore
    //   947: dup
    //   948: bipush 6
    //   950: aload 16
    //   952: aastore
    //   953: iload 9
    //   955: aaload
    //   956: astore_2
    //   957: new 152	java/lang/StringBuilder
    //   960: astore 17
    //   962: aload 17
    //   964: invokespecial 225	java/lang/StringBuilder:<init>	()V
    //   967: aload 17
    //   969: aload_0
    //   970: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   973: astore 17
    //   975: invokestatic 467	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   978: pop
    //   979: aload 17
    //   981: invokestatic 473	com/tencent/mm/model/c:Ry	()Lcom/tencent/mm/storage/z;
    //   984: aload_2
    //   985: lconst_0
    //   986: invokestatic 357	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   989: invokevirtual 479	com/tencent/mm/storage/z:get	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   992: invokevirtual 254	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   995: ldc_w 481
    //   998: invokevirtual 231	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1001: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1004: astore_2
    //   1005: iinc 9 1
    //   1008: aload_2
    //   1009: astore_0
    //   1010: goto -105 -> 905
    //   1013: new 483	java/io/RandomAccessFile
    //   1016: astore_0
    //   1017: aload_0
    //   1018: ldc_w 485
    //   1021: ldc_w 487
    //   1024: invokespecial 490	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   1027: new 492	java/lang/StringBuffer
    //   1030: astore 7
    //   1032: aload 7
    //   1034: invokespecial 493	java/lang/StringBuffer:<init>	()V
    //   1037: aload_0
    //   1038: invokevirtual 496	java/io/RandomAccessFile:readLine	()Ljava/lang/String;
    //   1041: invokevirtual 500	java/lang/String:toCharArray	()[C
    //   1044: astore 6
    //   1046: aload 6
    //   1048: arraylength
    //   1049: istore 8
    //   1051: iconst_0
    //   1052: istore 9
    //   1054: iload 9
    //   1056: iload 8
    //   1058: if_icmpge +40 -> 1098
    //   1061: aload 6
    //   1063: iload 9
    //   1065: caload
    //   1066: bipush 57
    //   1068: if_icmpgt +24 -> 1092
    //   1071: aload 6
    //   1073: iload 9
    //   1075: caload
    //   1076: bipush 48
    //   1078: if_icmplt +14 -> 1092
    //   1081: aload 7
    //   1083: aload 6
    //   1085: iload 9
    //   1087: caload
    //   1088: invokevirtual 503	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   1091: pop
    //   1092: iinc 9 1
    //   1095: goto -41 -> 1054
    //   1098: aload 7
    //   1100: invokevirtual 504	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   1103: ldc2_w 505
    //   1106: invokestatic 510	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   1109: lstore 18
    //   1111: lload 18
    //   1113: lconst_0
    //   1114: lcmp
    //   1115: ifle +10 -> 1125
    //   1118: lload 18
    //   1120: bipush 10
    //   1122: lshl
    //   1123: lstore 12
    //   1125: aload_0
    //   1126: invokevirtual 513	java/io/RandomAccessFile:close	()V
    //   1129: goto -506 -> 623
    //   1132: astore_0
    //   1133: ldc_w 261
    //   1136: aload_0
    //   1137: ldc_w 515
    //   1140: iconst_0
    //   1141: anewarray 4	java/lang/Object
    //   1144: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1147: getstatic 275	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1150: ldc2_w 276
    //   1153: ldc2_w 516
    //   1156: lconst_1
    //   1157: iconst_1
    //   1158: invokevirtual 282	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   1161: goto -754 -> 407
    //   1164: astore 6
    //   1166: ldc_w 261
    //   1169: aload 6
    //   1171: ldc_w 519
    //   1174: iconst_0
    //   1175: anewarray 4	java/lang/Object
    //   1178: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1181: aload_0
    //   1182: invokevirtual 513	java/io/RandomAccessFile:close	()V
    //   1185: goto -562 -> 623
    //   1188: astore_2
    //   1189: aload_0
    //   1190: invokevirtual 513	java/io/RandomAccessFile:close	()V
    //   1193: sipush 15361
    //   1196: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1199: aload_2
    //   1200: athrow
    //   1201: astore_2
    //   1202: ldc_w 261
    //   1205: aload_2
    //   1206: ldc_w 521
    //   1209: iconst_0
    //   1210: anewarray 4	java/lang/Object
    //   1213: invokestatic 269	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1216: getstatic 275	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1219: ldc2_w 276
    //   1222: ldc2_w 522
    //   1225: lconst_1
    //   1226: iconst_1
    //   1227: invokevirtual 282	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   1230: ldc_w 261
    //   1233: ldc_w 525
    //   1236: iconst_2
    //   1237: anewarray 4	java/lang/Object
    //   1240: dup
    //   1241: iconst_0
    //   1242: getstatic 90	com/tencent/mm/app/a:bWa	Ljava/lang/String;
    //   1245: aastore
    //   1246: dup
    //   1247: iconst_1
    //   1248: aload_0
    //   1249: aastore
    //   1250: invokestatic 297	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1253: aload 4
    //   1255: ldc_w 527
    //   1258: aload_0
    //   1259: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1262: pop
    //   1263: aload 4
    //   1265: ldc_w 529
    //   1268: getstatic 78	com/tencent/mm/app/a:cdH	I
    //   1271: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1274: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1277: pop
    //   1278: iconst_0
    //   1279: istore 9
    //   1281: getstatic 534	com/tencent/mm/storage/ac:eSj	Ljava/lang/String;
    //   1284: astore_0
    //   1285: new 536	java/io/File
    //   1288: astore_2
    //   1289: aload_2
    //   1290: aload_0
    //   1291: invokespecial 537	java/io/File:<init>	(Ljava/lang/String;)V
    //   1294: aload_2
    //   1295: invokevirtual 540	java/io/File:exists	()Z
    //   1298: ifeq +26 -> 1324
    //   1301: invokestatic 323	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   1304: ldc_w 542
    //   1307: invokestatic 547	com/tencent/mm/compatible/util/h:Mu	()I
    //   1310: invokevirtual 551	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1313: ldc_w 553
    //   1316: iconst_0
    //   1317: invokeinterface 559 3 0
    //   1322: istore 9
    //   1324: new 354	java/lang/Long
    //   1327: astore_0
    //   1328: aload_0
    //   1329: iload 9
    //   1331: i2l
    //   1332: invokespecial 560	java/lang/Long:<init>	(J)V
    //   1335: aload_3
    //   1336: ldc_w 562
    //   1339: aload_0
    //   1340: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1343: pop
    //   1344: aload_3
    //   1345: ldc_w 564
    //   1348: getstatic 90	com/tencent/mm/app/a:bWa	Ljava/lang/String;
    //   1351: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1354: pop
    //   1355: new 354	java/lang/Long
    //   1358: astore_0
    //   1359: aload_0
    //   1360: invokestatic 569	java/lang/System:currentTimeMillis	()J
    //   1363: invokespecial 560	java/lang/Long:<init>	(J)V
    //   1366: aload_3
    //   1367: ldc_w 529
    //   1370: aload_0
    //   1371: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1374: pop
    //   1375: aload_3
    //   1376: ldc_w 571
    //   1379: getstatic 576	com/tencent/mm/protocal/d:vxo	I
    //   1382: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1385: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1388: pop
    //   1389: aload_3
    //   1390: ldc_w 578
    //   1393: invokestatic 583	com/tencent/mm/loader/j/a:Uk	()Ljava/lang/String;
    //   1396: invokevirtual 130	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   1399: pop
    //   1400: getstatic 275	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1403: ldc2_w 276
    //   1406: ldc2_w 584
    //   1409: lconst_1
    //   1410: iconst_1
    //   1411: invokevirtual 282	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   1414: goto -1007 -> 407
    //   1417: aload_2
    //   1418: astore_0
    //   1419: goto -976 -> 443
    //
    // Exception table:
    //   from	to	target	type
    //   14	191	378	org/json/JSONException
    //   191	231	378	org/json/JSONException
    //   236	327	378	org/json/JSONException
    //   349	360	378	org/json/JSONException
    //   366	375	378	org/json/JSONException
    //   484	606	378	org/json/JSONException
    //   609	623	378	org/json/JSONException
    //   623	775	378	org/json/JSONException
    //   779	784	378	org/json/JSONException
    //   794	842	378	org/json/JSONException
    //   842	899	378	org/json/JSONException
    //   912	1005	378	org/json/JSONException
    //   1013	1027	378	org/json/JSONException
    //   1125	1129	378	org/json/JSONException
    //   1181	1185	378	org/json/JSONException
    //   1189	1201	378	org/json/JSONException
    //   1202	1230	378	org/json/JSONException
    //   1230	1263	378	org/json/JSONException
    //   1263	1278	378	org/json/JSONException
    //   1281	1294	378	org/json/JSONException
    //   1294	1324	378	org/json/JSONException
    //   1324	1414	378	org/json/JSONException
    //   14	191	1132	java/lang/Exception
    //   191	231	1132	java/lang/Exception
    //   236	327	1132	java/lang/Exception
    //   349	360	1132	java/lang/Exception
    //   366	375	1132	java/lang/Exception
    //   484	606	1132	java/lang/Exception
    //   609	623	1132	java/lang/Exception
    //   623	775	1132	java/lang/Exception
    //   779	784	1132	java/lang/Exception
    //   794	842	1132	java/lang/Exception
    //   842	899	1132	java/lang/Exception
    //   1013	1027	1132	java/lang/Exception
    //   1125	1129	1132	java/lang/Exception
    //   1181	1185	1132	java/lang/Exception
    //   1189	1201	1132	java/lang/Exception
    //   1202	1230	1132	java/lang/Exception
    //   1230	1263	1132	java/lang/Exception
    //   1263	1278	1132	java/lang/Exception
    //   1281	1294	1132	java/lang/Exception
    //   1294	1324	1132	java/lang/Exception
    //   1324	1414	1132	java/lang/Exception
    //   1027	1051	1164	java/lang/Exception
    //   1081	1092	1164	java/lang/Exception
    //   1098	1111	1164	java/lang/Exception
    //   1027	1051	1188	finally
    //   1081	1092	1188	finally
    //   1098	1111	1188	finally
    //   1166	1181	1188	finally
    //   912	1005	1201	java/lang/Exception
  }

  public static void cP(String paramString)
  {
    AppMethodBeat.i(15360);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu());
    int i = localSharedPreferences.getInt("main_thread_watch_enable", 65535);
    int j = localSharedPreferences.getInt("main_thread_watch_timeout", 0);
    int k = localSharedPreferences.getInt("main_thread_watch_log_loop", 0);
    int m = localSharedPreferences.getInt("main_thread_watch_report", 0);
    int n = k;
    int i1 = j;
    if (q(paramString, i))
    {
      i1 = j;
      if (j <= 0)
        i1 = 4500;
      j = k;
      if (k <= 0)
        j = 500;
      if (cdM != null)
        cdM.interrupt();
      bWa = paramString;
      if (i1 > 0)
        cdH = i1;
      if (j > 0)
        cdI = j;
      cdM = com.tencent.mm.sdk.g.d.h(new a.c(), paramString + "_ANRWatchDog");
      if (cdG == null)
        cdG = new Handler(Looper.getMainLooper());
      cdM.start();
      ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr startWatch sProcessName[%s], sTimeoutInterval[%d], logLoop[%d], sWatchThread[%s], stack[%s]", new Object[] { bWa, Integer.valueOf(cdH), Integer.valueOf(cdI), cdM.getName(), bo.dpG() });
      n = j;
    }
    ab.i("MicroMsg.ANRWatchDog.summeranr", "summeranr startWatch processName[%s] enable[%d], timeout[%d], loop[%d], report[%d]", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(i1), Integer.valueOf(n), Integer.valueOf(m) });
    AppMethodBeat.o(15360);
  }

  private static boolean q(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(15359);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(15359);
    while (true)
    {
      return bool;
      if (paramString.equals(ah.getPackageName()))
      {
        cdz = 1;
        if ((com.tencent.mm.protocal.d.vxs) || ((paramInt & 0x1) != 0))
        {
          AppMethodBeat.o(15359);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(15359);
        }
      }
      else if (paramString.endsWith(":push"))
      {
        cdz = 2;
        if ((paramInt & 0x2) != 0)
        {
          AppMethodBeat.o(15359);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(15359);
        }
      }
      else if ((paramString.endsWith(":tools")) || (paramString.endsWith(":toolsmp")))
      {
        cdz = 4;
        if ((paramInt & 0x4) != 0)
        {
          AppMethodBeat.o(15359);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(15359);
        }
      }
      else if (paramString.endsWith(":sandbox"))
      {
        cdz = 8;
        if ((paramInt & 0x8) != 0)
        {
          AppMethodBeat.o(15359);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(15359);
        }
      }
      else if (paramString.endsWith(":exdevice"))
      {
        cdz = 16;
        if ((paramInt & 0x10) != 0)
        {
          AppMethodBeat.o(15359);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(15359);
        }
      }
      else if (paramString.contains(":appbrand"))
      {
        cdz = 32;
        if ((paramInt & 0x20) != 0)
        {
          AppMethodBeat.o(15359);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(15359);
        }
      }
      else
      {
        AppMethodBeat.o(15359);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.a
 * JD-Core Version:    0.6.2
 */