package com.tencent.liteav.renderer;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

class TXCGLSurfaceViewBase$i extends Thread
{
  private boolean a;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  private int l;
  private int m;
  private int n;
  private boolean o;
  private boolean p;
  private ArrayList<Runnable> q;
  private boolean r;
  private TXCGLSurfaceViewBase.h s;
  private WeakReference<TXCGLSurfaceViewBase> t;

  TXCGLSurfaceViewBase$i(WeakReference<TXCGLSurfaceViewBase> paramWeakReference)
  {
    AppMethodBeat.i(67204);
    this.q = new ArrayList();
    this.r = true;
    this.l = 0;
    this.m = 0;
    this.o = true;
    this.n = 1;
    this.t = paramWeakReference;
    AppMethodBeat.o(67204);
  }

  // ERROR //
  private void i()
  {
    // Byte code:
    //   0: ldc 72
    //   2: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: new 74	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$h
    //   9: dup
    //   10: aload_0
    //   11: getfield 61	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:t	Ljava/lang/ref/WeakReference;
    //   14: invokespecial 76	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$h:<init>	(Ljava/lang/ref/WeakReference;)V
    //   17: putfield 78	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:s	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$h;
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:h	Z
    //   25: aload_0
    //   26: iconst_0
    //   27: putfield 82	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:i	Z
    //   30: iconst_0
    //   31: istore_1
    //   32: iconst_0
    //   33: istore_2
    //   34: iconst_0
    //   35: istore_3
    //   36: iconst_0
    //   37: istore 4
    //   39: iconst_0
    //   40: istore 5
    //   42: iconst_0
    //   43: istore 6
    //   45: iconst_0
    //   46: istore 7
    //   48: iconst_0
    //   49: istore 8
    //   51: iconst_0
    //   52: istore 9
    //   54: iconst_0
    //   55: istore 10
    //   57: aconst_null
    //   58: astore 11
    //   60: aconst_null
    //   61: astore 12
    //   63: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   66: astore 13
    //   68: aload 13
    //   70: monitorenter
    //   71: iload 8
    //   73: istore 14
    //   75: aload_0
    //   76: getfield 87	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:a	Z
    //   79: ifeq +44 -> 123
    //   82: aload 13
    //   84: monitorexit
    //   85: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   88: astore 12
    //   90: aload 12
    //   92: monitorenter
    //   93: aload_0
    //   94: invokespecial 89	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:j	()V
    //   97: aload_0
    //   98: invokespecial 91	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:k	()V
    //   101: aload 12
    //   103: monitorexit
    //   104: ldc 72
    //   106: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: return
    //   110: astore 11
    //   112: aload 12
    //   114: monitorexit
    //   115: ldc 72
    //   117: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: aload 11
    //   122: athrow
    //   123: aload_0
    //   124: getfield 49	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:q	Ljava/util/ArrayList;
    //   127: invokevirtual 95	java/util/ArrayList:isEmpty	()Z
    //   130: ifne +61 -> 191
    //   133: aload_0
    //   134: getfield 49	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:q	Ljava/util/ArrayList;
    //   137: iconst_0
    //   138: invokevirtual 99	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   141: checkcast 101	java/lang/Runnable
    //   144: astore 11
    //   146: iload 14
    //   148: istore 8
    //   150: iload 9
    //   152: istore 15
    //   154: iload_2
    //   155: istore 14
    //   157: iload 7
    //   159: istore_2
    //   160: aload 13
    //   162: monitorexit
    //   163: aload 11
    //   165: ifnull +630 -> 795
    //   168: aload 11
    //   170: invokeinterface 104 1 0
    //   175: aconst_null
    //   176: astore 11
    //   178: iload_2
    //   179: istore 7
    //   181: iload 14
    //   183: istore_2
    //   184: iload 15
    //   186: istore 9
    //   188: goto -125 -> 63
    //   191: aload_0
    //   192: getfield 106	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:d	Z
    //   195: aload_0
    //   196: getfield 108	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:c	Z
    //   199: if_icmpeq +1006 -> 1205
    //   202: aload_0
    //   203: getfield 108	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:c	Z
    //   206: istore 16
    //   208: aload_0
    //   209: aload_0
    //   210: getfield 108	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:c	Z
    //   213: putfield 106	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:d	Z
    //   216: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   219: invokevirtual 113	java/lang/Object:notifyAll	()V
    //   222: aload_0
    //   223: getfield 115	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:k	Z
    //   226: ifeq +19 -> 245
    //   229: aload_0
    //   230: invokespecial 89	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:j	()V
    //   233: aload_0
    //   234: invokespecial 91	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:k	()V
    //   237: aload_0
    //   238: iconst_0
    //   239: putfield 115	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:k	Z
    //   242: iconst_1
    //   243: istore 14
    //   245: iload 4
    //   247: istore 17
    //   249: iload 4
    //   251: ifeq +14 -> 265
    //   254: aload_0
    //   255: invokespecial 89	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:j	()V
    //   258: aload_0
    //   259: invokespecial 91	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:k	()V
    //   262: iconst_0
    //   263: istore 17
    //   265: iload 16
    //   267: ifeq +14 -> 281
    //   270: aload_0
    //   271: getfield 82	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:i	Z
    //   274: ifeq +7 -> 281
    //   277: aload_0
    //   278: invokespecial 89	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:j	()V
    //   281: iload 16
    //   283: ifeq +48 -> 331
    //   286: aload_0
    //   287: getfield 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:h	Z
    //   290: ifeq +41 -> 331
    //   293: aload_0
    //   294: getfield 61	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:t	Ljava/lang/ref/WeakReference;
    //   297: invokevirtual 121	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   300: checkcast 6	com/tencent/liteav/renderer/TXCGLSurfaceViewBase
    //   303: astore 18
    //   305: aload 18
    //   307: ifnonnull +332 -> 639
    //   310: iconst_0
    //   311: istore 19
    //   313: iload 19
    //   315: ifeq +12 -> 327
    //   318: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   321: invokevirtual 125	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$j:a	()Z
    //   324: ifeq +7 -> 331
    //   327: aload_0
    //   328: invokespecial 91	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:k	()V
    //   331: iload 16
    //   333: ifeq +19 -> 352
    //   336: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   339: invokevirtual 127	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$j:b	()Z
    //   342: ifeq +10 -> 352
    //   345: aload_0
    //   346: getfield 78	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:s	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$h;
    //   349: invokevirtual 129	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$h:g	()V
    //   352: aload_0
    //   353: getfield 131	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:e	Z
    //   356: ifne +37 -> 393
    //   359: aload_0
    //   360: getfield 133	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:g	Z
    //   363: ifne +30 -> 393
    //   366: aload_0
    //   367: getfield 82	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:i	Z
    //   370: ifeq +7 -> 377
    //   373: aload_0
    //   374: invokespecial 89	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:j	()V
    //   377: aload_0
    //   378: iconst_1
    //   379: putfield 133	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:g	Z
    //   382: aload_0
    //   383: iconst_0
    //   384: putfield 135	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:f	Z
    //   387: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   390: invokevirtual 113	java/lang/Object:notifyAll	()V
    //   393: aload_0
    //   394: getfield 131	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:e	Z
    //   397: ifeq +21 -> 418
    //   400: aload_0
    //   401: getfield 133	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:g	Z
    //   404: ifeq +14 -> 418
    //   407: aload_0
    //   408: iconst_0
    //   409: putfield 133	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:g	Z
    //   412: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   415: invokevirtual 113	java/lang/Object:notifyAll	()V
    //   418: iload 7
    //   420: istore 8
    //   422: iload 6
    //   424: istore 15
    //   426: iload 7
    //   428: ifeq +20 -> 448
    //   431: iconst_0
    //   432: istore 15
    //   434: iconst_0
    //   435: istore 8
    //   437: aload_0
    //   438: iconst_1
    //   439: putfield 137	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:p	Z
    //   442: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   445: invokevirtual 113	java/lang/Object:notifyAll	()V
    //   448: iload_2
    //   449: istore 20
    //   451: iload 14
    //   453: istore 21
    //   455: iload 5
    //   457: istore 22
    //   459: iload_3
    //   460: istore 23
    //   462: iload_1
    //   463: istore 24
    //   465: aload_0
    //   466: invokespecial 139	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:l	()Z
    //   469: ifeq +288 -> 757
    //   472: iload 14
    //   474: istore 4
    //   476: iload_1
    //   477: istore 7
    //   479: aload_0
    //   480: getfield 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:h	Z
    //   483: ifne +14 -> 497
    //   486: iload 14
    //   488: ifeq +161 -> 649
    //   491: iconst_0
    //   492: istore 4
    //   494: iload_1
    //   495: istore 7
    //   497: iload_2
    //   498: istore 6
    //   500: iload 5
    //   502: istore 14
    //   504: iload_3
    //   505: istore_1
    //   506: aload_0
    //   507: getfield 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:h	Z
    //   510: ifeq +32 -> 542
    //   513: iload_2
    //   514: istore 6
    //   516: iload 5
    //   518: istore 14
    //   520: iload_3
    //   521: istore_1
    //   522: aload_0
    //   523: getfield 82	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:i	Z
    //   526: ifne +16 -> 542
    //   529: aload_0
    //   530: iconst_1
    //   531: putfield 82	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:i	Z
    //   534: iconst_1
    //   535: istore 6
    //   537: iconst_1
    //   538: istore_1
    //   539: iconst_1
    //   540: istore 14
    //   542: iload 6
    //   544: istore 20
    //   546: iload 4
    //   548: istore 21
    //   550: iload 14
    //   552: istore 22
    //   554: iload_1
    //   555: istore 23
    //   557: iload 7
    //   559: istore 24
    //   561: aload_0
    //   562: getfield 82	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:i	Z
    //   565: ifeq +192 -> 757
    //   568: aload_0
    //   569: getfield 51	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:r	Z
    //   572: ifeq +616 -> 1188
    //   575: iconst_1
    //   576: istore 5
    //   578: aload_0
    //   579: getfield 53	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:l	I
    //   582: istore 9
    //   584: aload_0
    //   585: getfield 55	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:m	I
    //   588: istore_2
    //   589: iconst_1
    //   590: istore 6
    //   592: iconst_1
    //   593: istore_3
    //   594: aload_0
    //   595: iconst_0
    //   596: putfield 51	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:r	Z
    //   599: aload_0
    //   600: iconst_0
    //   601: putfield 57	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:o	Z
    //   604: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   607: invokevirtual 113	java/lang/Object:notifyAll	()V
    //   610: iload_2
    //   611: istore 10
    //   613: iload 8
    //   615: istore_2
    //   616: iload_3
    //   617: istore 14
    //   619: iload 9
    //   621: istore 15
    //   623: iload 4
    //   625: istore 8
    //   627: iload 17
    //   629: istore 4
    //   631: iload_1
    //   632: istore_3
    //   633: iload 7
    //   635: istore_1
    //   636: goto -476 -> 160
    //   639: aload 18
    //   641: invokestatic 142	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:a	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;)Z
    //   644: istore 19
    //   646: goto -333 -> 313
    //   649: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   652: aload_0
    //   653: invokevirtual 145	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$j:b	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$i;)Z
    //   656: istore 16
    //   658: iload 14
    //   660: istore 4
    //   662: iload_1
    //   663: istore 7
    //   665: iload 16
    //   667: ifeq -170 -> 497
    //   670: aload_0
    //   671: getfield 78	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:s	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$h;
    //   674: invokevirtual 147	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$h:a	()V
    //   677: aload_0
    //   678: iconst_1
    //   679: putfield 80	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:h	Z
    //   682: iconst_1
    //   683: istore 7
    //   685: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   688: invokevirtual 113	java/lang/Object:notifyAll	()V
    //   691: iload 14
    //   693: istore 4
    //   695: goto -198 -> 497
    //   698: astore 12
    //   700: aload 13
    //   702: monitorexit
    //   703: ldc 72
    //   705: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   708: aload 12
    //   710: athrow
    //   711: astore 11
    //   713: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   716: astore 12
    //   718: aload 12
    //   720: monitorenter
    //   721: aload_0
    //   722: invokespecial 89	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:j	()V
    //   725: aload_0
    //   726: invokespecial 91	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:k	()V
    //   729: aload 12
    //   731: monitorexit
    //   732: ldc 72
    //   734: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   737: aload 11
    //   739: athrow
    //   740: astore 12
    //   742: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   745: aload_0
    //   746: invokevirtual 150	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$j:c	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$i;)V
    //   749: ldc 72
    //   751: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   754: aload 12
    //   756: athrow
    //   757: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   760: invokevirtual 153	java/lang/Object:wait	()V
    //   763: iload 8
    //   765: istore 7
    //   767: iload 20
    //   769: istore_2
    //   770: iload 21
    //   772: istore 14
    //   774: iload 15
    //   776: istore 6
    //   778: iload 22
    //   780: istore 5
    //   782: iload 17
    //   784: istore 4
    //   786: iload 23
    //   788: istore_3
    //   789: iload 24
    //   791: istore_1
    //   792: goto -717 -> 75
    //   795: iload 14
    //   797: istore 9
    //   799: iload 14
    //   801: ifeq +38 -> 839
    //   804: aload_0
    //   805: getfield 78	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:s	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$h;
    //   808: invokevirtual 154	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$h:b	()Z
    //   811: ifeq +289 -> 1100
    //   814: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   817: astore 13
    //   819: aload 13
    //   821: monitorenter
    //   822: aload_0
    //   823: iconst_1
    //   824: putfield 156	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:j	Z
    //   827: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   830: invokevirtual 113	java/lang/Object:notifyAll	()V
    //   833: aload 13
    //   835: monitorexit
    //   836: iconst_0
    //   837: istore 9
    //   839: iload_3
    //   840: ifeq +345 -> 1185
    //   843: aload_0
    //   844: getfield 78	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:s	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$h;
    //   847: invokevirtual 159	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$h:d	()Ljavax/microedition/khronos/opengles/GL;
    //   850: checkcast 161	javax/microedition/khronos/opengles/GL10
    //   853: astore 12
    //   855: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   858: aload 12
    //   860: invokevirtual 164	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$j:a	(Ljavax/microedition/khronos/opengles/GL10;)V
    //   863: iconst_0
    //   864: istore_3
    //   865: iload_1
    //   866: istore 14
    //   868: iload_1
    //   869: ifeq +42 -> 911
    //   872: aload_0
    //   873: getfield 61	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:t	Ljava/lang/ref/WeakReference;
    //   876: invokevirtual 121	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   879: checkcast 6	com/tencent/liteav/renderer/TXCGLSurfaceViewBase
    //   882: astore 13
    //   884: aload 13
    //   886: ifnull +22 -> 908
    //   889: aload 13
    //   891: invokestatic 167	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:b	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;)Landroid/opengl/GLSurfaceView$Renderer;
    //   894: aload 12
    //   896: aload_0
    //   897: getfield 78	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:s	Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$h;
    //   900: getfield 170	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$h:d	Ljavax/microedition/khronos/egl/EGLConfig;
    //   903: invokeinterface 176 3 0
    //   908: iconst_0
    //   909: istore 14
    //   911: iload 5
    //   913: istore_1
    //   914: iload 5
    //   916: ifeq +38 -> 954
    //   919: aload_0
    //   920: getfield 61	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:t	Ljava/lang/ref/WeakReference;
    //   923: invokevirtual 121	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   926: checkcast 6	com/tencent/liteav/renderer/TXCGLSurfaceViewBase
    //   929: astore 13
    //   931: aload 13
    //   933: ifnull +19 -> 952
    //   936: aload 13
    //   938: invokestatic 167	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:b	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;)Landroid/opengl/GLSurfaceView$Renderer;
    //   941: aload 12
    //   943: iload 15
    //   945: iload 10
    //   947: invokeinterface 180 4 0
    //   952: iconst_0
    //   953: istore_1
    //   954: aload_0
    //   955: getfield 61	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:t	Ljava/lang/ref/WeakReference;
    //   958: invokevirtual 121	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   961: checkcast 6	com/tencent/liteav/renderer/TXCGLSurfaceViewBase
    //   964: astore 13
    //   966: aload 13
    //   968: ifnull +249 -> 1217
    //   971: aload 13
    //   973: invokestatic 167	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:b	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase;)Landroid/opengl/GLSurfaceView$Renderer;
    //   976: aload 12
    //   978: invokeinterface 183 2 0
    //   983: aload 13
    //   985: invokevirtual 186	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:c	()I
    //   988: istore 7
    //   990: iload 4
    //   992: istore 17
    //   994: iload 7
    //   996: lookupswitch	default:+28->1024, 12288:+63->1059, 12302:+157->1153
    //   1025: newarray 慢⁤污潬慣楴湯
    //   1027: arraylength
    //   1028: iload 7
    //   1030: invokestatic 193	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$h:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   1033: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   1036: astore 13
    //   1038: aload 13
    //   1040: monitorenter
    //   1041: aload_0
    //   1042: iconst_1
    //   1043: putfield 135	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:f	Z
    //   1046: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   1049: invokevirtual 113	java/lang/Object:notifyAll	()V
    //   1052: aload 13
    //   1054: monitorexit
    //   1055: iload 4
    //   1057: istore 17
    //   1059: iload 6
    //   1061: ifeq +150 -> 1211
    //   1064: iconst_1
    //   1065: istore 7
    //   1067: iload 9
    //   1069: istore_2
    //   1070: iload 15
    //   1072: istore 9
    //   1074: iload_1
    //   1075: istore 5
    //   1077: iload 17
    //   1079: istore 4
    //   1081: iload 14
    //   1083: istore_1
    //   1084: goto -1021 -> 63
    //   1087: astore 12
    //   1089: aload 13
    //   1091: monitorexit
    //   1092: ldc 72
    //   1094: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1097: aload 12
    //   1099: athrow
    //   1100: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   1103: astore 13
    //   1105: aload 13
    //   1107: monitorenter
    //   1108: aload_0
    //   1109: iconst_1
    //   1110: putfield 156	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:j	Z
    //   1113: aload_0
    //   1114: iconst_1
    //   1115: putfield 135	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:f	Z
    //   1118: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   1121: invokevirtual 113	java/lang/Object:notifyAll	()V
    //   1124: aload 13
    //   1126: monitorexit
    //   1127: iload_2
    //   1128: istore 7
    //   1130: iload 14
    //   1132: istore_2
    //   1133: iload 15
    //   1135: istore 9
    //   1137: goto -1074 -> 63
    //   1140: astore 12
    //   1142: aload 13
    //   1144: monitorexit
    //   1145: ldc 72
    //   1147: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1150: aload 12
    //   1152: athrow
    //   1153: iconst_1
    //   1154: istore 17
    //   1156: goto -97 -> 1059
    //   1159: astore 12
    //   1161: aload 13
    //   1163: monitorexit
    //   1164: ldc 72
    //   1166: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1169: aload 12
    //   1171: athrow
    //   1172: astore 11
    //   1174: aload 12
    //   1176: monitorexit
    //   1177: ldc 72
    //   1179: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1182: aload 11
    //   1184: athrow
    //   1185: goto -320 -> 865
    //   1188: iload 10
    //   1190: istore_2
    //   1191: iload 6
    //   1193: istore_3
    //   1194: iload 15
    //   1196: istore 6
    //   1198: iload 14
    //   1200: istore 5
    //   1202: goto -603 -> 599
    //   1205: iconst_0
    //   1206: istore 16
    //   1208: goto -986 -> 222
    //   1211: iload_2
    //   1212: istore 7
    //   1214: goto -147 -> 1067
    //   1217: sipush 12288
    //   1220: istore 7
    //   1222: goto -232 -> 990
    //
    // Exception table:
    //   from	to	target	type
    //   93	104	110	finally
    //   112	115	110	finally
    //   75	85	698	finally
    //   123	146	698	finally
    //   160	163	698	finally
    //   191	222	698	finally
    //   222	242	698	finally
    //   254	262	698	finally
    //   270	281	698	finally
    //   286	305	698	finally
    //   318	327	698	finally
    //   327	331	698	finally
    //   336	352	698	finally
    //   352	377	698	finally
    //   377	393	698	finally
    //   393	418	698	finally
    //   437	448	698	finally
    //   465	472	698	finally
    //   479	486	698	finally
    //   506	513	698	finally
    //   522	534	698	finally
    //   561	575	698	finally
    //   578	589	698	finally
    //   594	599	698	finally
    //   599	610	698	finally
    //   639	646	698	finally
    //   649	658	698	finally
    //   670	677	698	finally
    //   677	682	698	finally
    //   685	691	698	finally
    //   700	703	698	finally
    //   742	757	698	finally
    //   757	763	698	finally
    //   63	71	711	finally
    //   168	175	711	finally
    //   703	711	711	finally
    //   804	822	711	finally
    //   843	863	711	finally
    //   872	884	711	finally
    //   889	908	711	finally
    //   919	931	711	finally
    //   936	952	711	finally
    //   954	966	711	finally
    //   971	990	711	finally
    //   1024	1041	711	finally
    //   1092	1100	711	finally
    //   1100	1108	711	finally
    //   1145	1153	711	finally
    //   1164	1172	711	finally
    //   670	677	740	java/lang/RuntimeException
    //   822	836	1087	finally
    //   1089	1092	1087	finally
    //   1108	1127	1140	finally
    //   1142	1145	1140	finally
    //   1041	1055	1159	finally
    //   1161	1164	1159	finally
    //   721	732	1172	finally
    //   1174	1177	1172	finally
  }

  private void j()
  {
    AppMethodBeat.i(67208);
    if (this.i)
    {
      this.i = false;
      this.s.f();
    }
    AppMethodBeat.o(67208);
  }

  private void k()
  {
    AppMethodBeat.i(67209);
    if (this.h)
    {
      this.s.g();
      this.h = false;
      TXCGLSurfaceViewBase localTXCGLSurfaceViewBase = (TXCGLSurfaceViewBase)this.t.get();
      if (localTXCGLSurfaceViewBase != null)
        localTXCGLSurfaceViewBase.f = false;
      TXCGLSurfaceViewBase.e().c(this);
    }
    AppMethodBeat.o(67209);
  }

  private boolean l()
  {
    boolean bool1 = true;
    if ((!this.d) && (this.e) && (!this.f) && (this.l > 0) && (this.m > 0))
    {
      bool2 = bool1;
      if (!this.o)
        if (this.n != 1)
          break label58;
    }
    label58: for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public int a()
  {
    AppMethodBeat.i(67206);
    int i1 = this.s.c();
    AppMethodBeat.o(67206);
    return i1;
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(67211);
    if ((paramInt < 0) || (paramInt > 1))
    {
      ??? = new IllegalArgumentException("renderMode");
      AppMethodBeat.o(67211);
      throw ((Throwable)???);
    }
    synchronized (TXCGLSurfaceViewBase.e())
    {
      this.n = paramInt;
      TXCGLSurfaceViewBase.e().notifyAll();
      AppMethodBeat.o(67211);
      return;
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67215);
    synchronized (TXCGLSurfaceViewBase.e())
    {
      this.l = paramInt1;
      this.m = paramInt2;
      this.r = true;
      this.o = true;
      this.p = false;
      TXCGLSurfaceViewBase.e().notifyAll();
      while (true)
        if ((!this.b) && (!this.d) && (!this.p))
        {
          boolean bool = c();
          if (bool)
            try
            {
              TXCGLSurfaceViewBase.e().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(67215);
  }

  public void a(Runnable paramRunnable)
  {
    AppMethodBeat.i(67218);
    if (paramRunnable == null)
    {
      paramRunnable = new IllegalArgumentException("r must not be null");
      AppMethodBeat.o(67218);
      throw paramRunnable;
    }
    synchronized (TXCGLSurfaceViewBase.e())
    {
      this.q.add(paramRunnable);
      TXCGLSurfaceViewBase.e().notifyAll();
      AppMethodBeat.o(67218);
      return;
    }
  }

  public TXCGLSurfaceViewBase.h b()
  {
    return this.s;
  }

  public boolean c()
  {
    AppMethodBeat.i(67210);
    boolean bool;
    if ((this.h) && (this.i) && (l()))
    {
      bool = true;
      AppMethodBeat.o(67210);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67210);
    }
  }

  public int d()
  {
    AppMethodBeat.i(67212);
    synchronized (TXCGLSurfaceViewBase.e())
    {
      int i1 = this.n;
      AppMethodBeat.o(67212);
      return i1;
    }
  }

  public void e()
  {
    AppMethodBeat.i(67213);
    synchronized (TXCGLSurfaceViewBase.e())
    {
      this.e = true;
      this.j = false;
      TXCGLSurfaceViewBase.e().notifyAll();
      while (true)
        if ((this.g) && (!this.j))
        {
          boolean bool = this.b;
          if (!bool)
            try
            {
              TXCGLSurfaceViewBase.e().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(67213);
  }

  public void f()
  {
    AppMethodBeat.i(67214);
    synchronized (TXCGLSurfaceViewBase.e())
    {
      this.e = false;
      TXCGLSurfaceViewBase.e().notifyAll();
      while (true)
        if (!this.g)
        {
          boolean bool = this.b;
          if (!bool)
            try
            {
              TXCGLSurfaceViewBase.e().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(67214);
  }

  public void g()
  {
    AppMethodBeat.i(67216);
    synchronized (TXCGLSurfaceViewBase.e())
    {
      this.a = true;
      TXCGLSurfaceViewBase.e().notifyAll();
      while (true)
      {
        boolean bool = this.b;
        if (!bool)
          try
          {
            TXCGLSurfaceViewBase.e().wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
      }
    }
    AppMethodBeat.o(67216);
  }

  public void h()
  {
    AppMethodBeat.i(67217);
    this.k = true;
    TXCGLSurfaceViewBase.e().notifyAll();
    AppMethodBeat.o(67217);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc 237
    //   2: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: new 239	java/lang/StringBuilder
    //   9: dup
    //   10: ldc 241
    //   12: invokespecial 242	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: invokevirtual 246	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:getId	()J
    //   19: invokevirtual 250	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   22: invokevirtual 254	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   25: invokevirtual 257	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:setName	(Ljava/lang/String;)V
    //   28: aload_0
    //   29: invokespecial 259	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$i:i	()V
    //   32: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   35: aload_0
    //   36: invokevirtual 261	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$j:a	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$i;)V
    //   39: ldc 237
    //   41: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: return
    //   45: astore_1
    //   46: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   49: aload_0
    //   50: invokevirtual 261	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$j:a	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$i;)V
    //   53: ldc 237
    //   55: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: goto -14 -> 44
    //   61: astore_1
    //   62: invokestatic 85	com/tencent/liteav/renderer/TXCGLSurfaceViewBase:e	()Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$j;
    //   65: aload_0
    //   66: invokevirtual 261	com/tencent/liteav/renderer/TXCGLSurfaceViewBase$j:a	(Lcom/tencent/liteav/renderer/TXCGLSurfaceViewBase$i;)V
    //   69: ldc 237
    //   71: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: aload_1
    //   75: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   28	32	45	java/lang/InterruptedException
    //   28	32	61	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.renderer.TXCGLSurfaceViewBase.i
 * JD-Core Version:    0.6.2
 */