package com.tencent.map.lib.gl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

class e$i extends Thread
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
  private e.h s;
  private WeakReference<e> t;

  e$i(WeakReference<e> paramWeakReference)
  {
    AppMethodBeat.i(98075);
    this.q = new ArrayList();
    this.r = true;
    this.l = 0;
    this.m = 0;
    this.o = true;
    this.n = 1;
    this.t = paramWeakReference;
    AppMethodBeat.o(98075);
  }

  private void j()
  {
    AppMethodBeat.i(98077);
    if (this.i)
    {
      this.i = false;
      this.s.e();
    }
    AppMethodBeat.o(98077);
  }

  private void k()
  {
    AppMethodBeat.i(98078);
    if (this.h)
    {
      this.s.f();
      this.h = false;
      e.c().c(this);
    }
    AppMethodBeat.o(98078);
  }

  // ERROR //
  private void l()
  {
    // Byte code:
    //   0: ldc 96
    //   2: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: new 76	com/tencent/map/lib/gl/e$h
    //   9: dup
    //   10: aload_0
    //   11: getfield 61	com/tencent/map/lib/gl/e$i:t	Ljava/lang/ref/WeakReference;
    //   14: invokespecial 98	com/tencent/map/lib/gl/e$h:<init>	(Ljava/lang/ref/WeakReference;)V
    //   17: putfield 74	com/tencent/map/lib/gl/e$i:s	Lcom/tencent/map/lib/gl/e$h;
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield 81	com/tencent/map/lib/gl/e$i:h	Z
    //   25: aload_0
    //   26: iconst_0
    //   27: putfield 72	com/tencent/map/lib/gl/e$i:i	Z
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
    //   63: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   66: astore 13
    //   68: aload 13
    //   70: monitorenter
    //   71: iload_1
    //   72: istore 14
    //   74: iload 6
    //   76: istore 15
    //   78: iload 7
    //   80: istore 16
    //   82: aload_0
    //   83: getfield 100	com/tencent/map/lib/gl/e$i:a	Z
    //   86: ifeq +71 -> 157
    //   89: aload_0
    //   90: getfield 61	com/tencent/map/lib/gl/e$i:t	Ljava/lang/ref/WeakReference;
    //   93: invokevirtual 106	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   96: checkcast 6	com/tencent/map/lib/gl/e
    //   99: astore 12
    //   101: aload 12
    //   103: ifnull +13 -> 116
    //   106: aload 12
    //   108: invokestatic 109	com/tencent/map/lib/gl/e:g	(Lcom/tencent/map/lib/gl/e;)Lcom/tencent/map/lib/gl/e$m;
    //   111: invokeinterface 113 1 0
    //   116: aload 13
    //   118: monitorexit
    //   119: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   122: astore 11
    //   124: aload 11
    //   126: monitorenter
    //   127: aload_0
    //   128: invokespecial 114	com/tencent/map/lib/gl/e$i:j	()V
    //   131: aload_0
    //   132: invokespecial 116	com/tencent/map/lib/gl/e$i:k	()V
    //   135: aload 11
    //   137: monitorexit
    //   138: ldc 96
    //   140: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: return
    //   144: astore 12
    //   146: aload 11
    //   148: monitorexit
    //   149: ldc 96
    //   151: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   154: aload 12
    //   156: athrow
    //   157: aload_0
    //   158: getfield 49	com/tencent/map/lib/gl/e$i:q	Ljava/util/ArrayList;
    //   161: invokevirtual 120	java/util/ArrayList:isEmpty	()Z
    //   164: ifne +64 -> 228
    //   167: aload_0
    //   168: getfield 49	com/tencent/map/lib/gl/e$i:q	Ljava/util/ArrayList;
    //   171: iconst_0
    //   172: invokevirtual 124	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   175: checkcast 126	java/lang/Runnable
    //   178: astore 11
    //   180: iload 14
    //   182: istore_1
    //   183: iload_3
    //   184: istore 14
    //   186: iload 15
    //   188: istore_3
    //   189: iload 9
    //   191: istore 6
    //   193: iload 16
    //   195: istore 7
    //   197: aload 13
    //   199: monitorexit
    //   200: aload 11
    //   202: ifnull +615 -> 817
    //   205: aload 11
    //   207: invokeinterface 129 1 0
    //   212: aconst_null
    //   213: astore 11
    //   215: iload 6
    //   217: istore 9
    //   219: iload_3
    //   220: istore 6
    //   222: iload 14
    //   224: istore_3
    //   225: goto -162 -> 63
    //   228: aload_0
    //   229: getfield 131	com/tencent/map/lib/gl/e$i:d	Z
    //   232: aload_0
    //   233: getfield 133	com/tencent/map/lib/gl/e$i:c	Z
    //   236: if_icmpeq +1051 -> 1287
    //   239: aload_0
    //   240: getfield 133	com/tencent/map/lib/gl/e$i:c	Z
    //   243: istore 17
    //   245: aload_0
    //   246: aload_0
    //   247: getfield 133	com/tencent/map/lib/gl/e$i:c	Z
    //   250: putfield 131	com/tencent/map/lib/gl/e$i:d	Z
    //   253: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   256: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   259: iload 8
    //   261: istore 7
    //   263: aload_0
    //   264: getfield 140	com/tencent/map/lib/gl/e$i:k	Z
    //   267: ifeq +19 -> 286
    //   270: aload_0
    //   271: invokespecial 114	com/tencent/map/lib/gl/e$i:j	()V
    //   274: aload_0
    //   275: invokespecial 116	com/tencent/map/lib/gl/e$i:k	()V
    //   278: aload_0
    //   279: iconst_0
    //   280: putfield 140	com/tencent/map/lib/gl/e$i:k	Z
    //   283: iconst_1
    //   284: istore 7
    //   286: iload 4
    //   288: istore 18
    //   290: iload 4
    //   292: ifeq +14 -> 306
    //   295: aload_0
    //   296: invokespecial 114	com/tencent/map/lib/gl/e$i:j	()V
    //   299: aload_0
    //   300: invokespecial 116	com/tencent/map/lib/gl/e$i:k	()V
    //   303: iconst_0
    //   304: istore 18
    //   306: iload 17
    //   308: ifeq +14 -> 322
    //   311: aload_0
    //   312: getfield 72	com/tencent/map/lib/gl/e$i:i	Z
    //   315: ifeq +7 -> 322
    //   318: aload_0
    //   319: invokespecial 114	com/tencent/map/lib/gl/e$i:j	()V
    //   322: iload 17
    //   324: ifeq +48 -> 372
    //   327: aload_0
    //   328: getfield 81	com/tencent/map/lib/gl/e$i:h	Z
    //   331: ifeq +41 -> 372
    //   334: aload_0
    //   335: getfield 61	com/tencent/map/lib/gl/e$i:t	Ljava/lang/ref/WeakReference;
    //   338: invokevirtual 106	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   341: checkcast 6	com/tencent/map/lib/gl/e
    //   344: astore 19
    //   346: aload 19
    //   348: ifnonnull +322 -> 670
    //   351: iconst_0
    //   352: istore 20
    //   354: iload 20
    //   356: ifeq +12 -> 368
    //   359: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   362: invokevirtual 142	com/tencent/map/lib/gl/e$j:a	()Z
    //   365: ifeq +7 -> 372
    //   368: aload_0
    //   369: invokespecial 116	com/tencent/map/lib/gl/e$i:k	()V
    //   372: iload 17
    //   374: ifeq +19 -> 393
    //   377: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   380: invokevirtual 144	com/tencent/map/lib/gl/e$j:b	()Z
    //   383: ifeq +10 -> 393
    //   386: aload_0
    //   387: getfield 74	com/tencent/map/lib/gl/e$i:s	Lcom/tencent/map/lib/gl/e$h;
    //   390: invokevirtual 83	com/tencent/map/lib/gl/e$h:f	()V
    //   393: aload_0
    //   394: getfield 146	com/tencent/map/lib/gl/e$i:e	Z
    //   397: ifne +37 -> 434
    //   400: aload_0
    //   401: getfield 148	com/tencent/map/lib/gl/e$i:g	Z
    //   404: ifne +30 -> 434
    //   407: aload_0
    //   408: getfield 72	com/tencent/map/lib/gl/e$i:i	Z
    //   411: ifeq +7 -> 418
    //   414: aload_0
    //   415: invokespecial 114	com/tencent/map/lib/gl/e$i:j	()V
    //   418: aload_0
    //   419: iconst_1
    //   420: putfield 148	com/tencent/map/lib/gl/e$i:g	Z
    //   423: aload_0
    //   424: iconst_0
    //   425: putfield 150	com/tencent/map/lib/gl/e$i:f	Z
    //   428: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   431: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   434: aload_0
    //   435: getfield 146	com/tencent/map/lib/gl/e$i:e	Z
    //   438: ifeq +21 -> 459
    //   441: aload_0
    //   442: getfield 148	com/tencent/map/lib/gl/e$i:g	Z
    //   445: ifeq +14 -> 459
    //   448: aload_0
    //   449: iconst_0
    //   450: putfield 148	com/tencent/map/lib/gl/e$i:g	Z
    //   453: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   456: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   459: iload 16
    //   461: istore 6
    //   463: iload 16
    //   465: ifeq +20 -> 485
    //   468: iconst_0
    //   469: istore 15
    //   471: iconst_0
    //   472: istore 6
    //   474: aload_0
    //   475: iconst_1
    //   476: putfield 152	com/tencent/map/lib/gl/e$i:p	Z
    //   479: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   482: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   485: iload_2
    //   486: istore 21
    //   488: iload 7
    //   490: istore 22
    //   492: iload 5
    //   494: istore 23
    //   496: iload_3
    //   497: istore 24
    //   499: iload 14
    //   501: istore 25
    //   503: aload_0
    //   504: invokespecial 154	com/tencent/map/lib/gl/e$i:m	()Z
    //   507: ifeq +275 -> 782
    //   510: iload 7
    //   512: istore 4
    //   514: iload 14
    //   516: istore_1
    //   517: aload_0
    //   518: getfield 81	com/tencent/map/lib/gl/e$i:h	Z
    //   521: ifne +14 -> 535
    //   524: iload 7
    //   526: ifeq +154 -> 680
    //   529: iconst_0
    //   530: istore 4
    //   532: iload 14
    //   534: istore_1
    //   535: iload_2
    //   536: istore 8
    //   538: iload 5
    //   540: istore 7
    //   542: iload_3
    //   543: istore 14
    //   545: aload_0
    //   546: getfield 81	com/tencent/map/lib/gl/e$i:h	Z
    //   549: ifeq +34 -> 583
    //   552: iload_2
    //   553: istore 8
    //   555: iload 5
    //   557: istore 7
    //   559: iload_3
    //   560: istore 14
    //   562: aload_0
    //   563: getfield 72	com/tencent/map/lib/gl/e$i:i	Z
    //   566: ifne +17 -> 583
    //   569: aload_0
    //   570: iconst_1
    //   571: putfield 72	com/tencent/map/lib/gl/e$i:i	Z
    //   574: iconst_1
    //   575: istore 8
    //   577: iconst_1
    //   578: istore 14
    //   580: iconst_1
    //   581: istore 7
    //   583: iload 8
    //   585: istore 21
    //   587: iload 4
    //   589: istore 22
    //   591: iload 7
    //   593: istore 23
    //   595: iload 14
    //   597: istore 24
    //   599: iload_1
    //   600: istore 25
    //   602: aload_0
    //   603: getfield 72	com/tencent/map/lib/gl/e$i:i	Z
    //   606: ifeq +176 -> 782
    //   609: aload_0
    //   610: getfield 51	com/tencent/map/lib/gl/e$i:r	Z
    //   613: ifeq +661 -> 1274
    //   616: iconst_1
    //   617: istore 5
    //   619: aload_0
    //   620: getfield 53	com/tencent/map/lib/gl/e$i:l	I
    //   623: istore 9
    //   625: aload_0
    //   626: getfield 55	com/tencent/map/lib/gl/e$i:m	I
    //   629: istore 10
    //   631: iconst_1
    //   632: istore_3
    //   633: iconst_1
    //   634: istore_2
    //   635: aload_0
    //   636: iconst_0
    //   637: putfield 51	com/tencent/map/lib/gl/e$i:r	Z
    //   640: aload_0
    //   641: iconst_0
    //   642: putfield 57	com/tencent/map/lib/gl/e$i:o	Z
    //   645: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   648: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   651: iload 6
    //   653: istore 7
    //   655: iload 9
    //   657: istore 6
    //   659: iload 4
    //   661: istore 8
    //   663: iload 18
    //   665: istore 4
    //   667: goto -470 -> 197
    //   670: aload 19
    //   672: invokestatic 157	com/tencent/map/lib/gl/e:h	(Lcom/tencent/map/lib/gl/e;)Z
    //   675: istore 20
    //   677: goto -323 -> 354
    //   680: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   683: aload_0
    //   684: invokevirtual 160	com/tencent/map/lib/gl/e$j:b	(Lcom/tencent/map/lib/gl/e$i;)Z
    //   687: istore 17
    //   689: iload 7
    //   691: istore 4
    //   693: iload 14
    //   695: istore_1
    //   696: iload 17
    //   698: ifeq -163 -> 535
    //   701: aload_0
    //   702: getfield 74	com/tencent/map/lib/gl/e$i:s	Lcom/tencent/map/lib/gl/e$h;
    //   705: invokevirtual 162	com/tencent/map/lib/gl/e$h:a	()V
    //   708: aload_0
    //   709: iconst_1
    //   710: putfield 81	com/tencent/map/lib/gl/e$i:h	Z
    //   713: iconst_1
    //   714: istore_1
    //   715: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   718: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   721: iload 7
    //   723: istore 4
    //   725: goto -190 -> 535
    //   728: astore 12
    //   730: aload 13
    //   732: monitorexit
    //   733: ldc 96
    //   735: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   738: aload 12
    //   740: athrow
    //   741: astore 12
    //   743: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   746: astore 12
    //   748: aload 12
    //   750: monitorenter
    //   751: aload_0
    //   752: invokespecial 114	com/tencent/map/lib/gl/e$i:j	()V
    //   755: aload_0
    //   756: invokespecial 116	com/tencent/map/lib/gl/e$i:k	()V
    //   759: aload 12
    //   761: monitorexit
    //   762: ldc 96
    //   764: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   767: goto -624 -> 143
    //   770: astore 19
    //   772: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   775: aload_0
    //   776: invokevirtual 91	com/tencent/map/lib/gl/e$j:c	(Lcom/tencent/map/lib/gl/e$i;)V
    //   779: goto -71 -> 708
    //   782: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   785: invokevirtual 165	java/lang/Object:wait	()V
    //   788: iload 6
    //   790: istore 16
    //   792: iload 21
    //   794: istore_2
    //   795: iload 22
    //   797: istore 8
    //   799: iload 23
    //   801: istore 5
    //   803: iload 18
    //   805: istore 4
    //   807: iload 24
    //   809: istore_3
    //   810: iload 25
    //   812: istore 14
    //   814: goto -732 -> 82
    //   817: iload_2
    //   818: istore 9
    //   820: iload_2
    //   821: ifeq +38 -> 859
    //   824: aload_0
    //   825: getfield 74	com/tencent/map/lib/gl/e$i:s	Lcom/tencent/map/lib/gl/e$h;
    //   828: invokevirtual 166	com/tencent/map/lib/gl/e$h:b	()Z
    //   831: ifeq +338 -> 1169
    //   834: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   837: astore 13
    //   839: aload 13
    //   841: monitorenter
    //   842: aload_0
    //   843: iconst_1
    //   844: putfield 168	com/tencent/map/lib/gl/e$i:j	Z
    //   847: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   850: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   853: aload 13
    //   855: monitorexit
    //   856: iconst_0
    //   857: istore 9
    //   859: iload 14
    //   861: ifeq +406 -> 1267
    //   864: aload_0
    //   865: getfield 74	com/tencent/map/lib/gl/e$i:s	Lcom/tencent/map/lib/gl/e$h;
    //   868: invokevirtual 171	com/tencent/map/lib/gl/e$h:c	()Ljavax/microedition/khronos/opengles/GL;
    //   871: checkcast 173	javax/microedition/khronos/opengles/GL10
    //   874: astore 12
    //   876: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   879: aload 12
    //   881: invokevirtual 176	com/tencent/map/lib/gl/e$j:a	(Ljavax/microedition/khronos/opengles/GL10;)V
    //   884: iconst_0
    //   885: istore 18
    //   887: iload_1
    //   888: istore 14
    //   890: iload_1
    //   891: ifeq +42 -> 933
    //   894: aload_0
    //   895: getfield 61	com/tencent/map/lib/gl/e$i:t	Ljava/lang/ref/WeakReference;
    //   898: invokevirtual 106	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   901: checkcast 6	com/tencent/map/lib/gl/e
    //   904: astore 13
    //   906: aload 13
    //   908: ifnull +22 -> 930
    //   911: aload 13
    //   913: invokestatic 109	com/tencent/map/lib/gl/e:g	(Lcom/tencent/map/lib/gl/e;)Lcom/tencent/map/lib/gl/e$m;
    //   916: aload 12
    //   918: aload_0
    //   919: getfield 74	com/tencent/map/lib/gl/e$i:s	Lcom/tencent/map/lib/gl/e$h;
    //   922: getfield 179	com/tencent/map/lib/gl/e$h:d	Ljavax/microedition/khronos/egl/EGLConfig;
    //   925: invokeinterface 182 3 0
    //   930: iconst_0
    //   931: istore 14
    //   933: iload 5
    //   935: istore_1
    //   936: iload 5
    //   938: ifeq +38 -> 976
    //   941: aload_0
    //   942: getfield 61	com/tencent/map/lib/gl/e$i:t	Ljava/lang/ref/WeakReference;
    //   945: invokevirtual 106	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   948: checkcast 6	com/tencent/map/lib/gl/e
    //   951: astore 13
    //   953: aload 13
    //   955: ifnull +19 -> 974
    //   958: aload 13
    //   960: invokestatic 109	com/tencent/map/lib/gl/e:g	(Lcom/tencent/map/lib/gl/e;)Lcom/tencent/map/lib/gl/e$m;
    //   963: aload 12
    //   965: iload 6
    //   967: iload 10
    //   969: invokeinterface 185 4 0
    //   974: iconst_0
    //   975: istore_1
    //   976: aload_0
    //   977: getfield 61	com/tencent/map/lib/gl/e$i:t	Ljava/lang/ref/WeakReference;
    //   980: invokevirtual 106	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   983: checkcast 6	com/tencent/map/lib/gl/e
    //   986: astore 13
    //   988: aload 13
    //   990: ifnull +310 -> 1300
    //   993: aload 13
    //   995: invokestatic 109	com/tencent/map/lib/gl/e:g	(Lcom/tencent/map/lib/gl/e;)Lcom/tencent/map/lib/gl/e$m;
    //   998: aload 12
    //   1000: invokeinterface 188 2 0
    //   1005: istore 17
    //   1007: iload 4
    //   1009: istore 15
    //   1011: iload 17
    //   1013: ifeq +77 -> 1090
    //   1016: aload_0
    //   1017: getfield 74	com/tencent/map/lib/gl/e$i:s	Lcom/tencent/map/lib/gl/e$h;
    //   1020: invokevirtual 191	com/tencent/map/lib/gl/e$h:d	()I
    //   1023: istore_2
    //   1024: iload 4
    //   1026: istore 15
    //   1028: iload_2
    //   1029: lookupswitch	default:+27->1056, 12288:+61->1090, 12302:+193->1222
    //   1057: instanceof 4803
    //   1060: iload_2
    //   1061: invokestatic 198	com/tencent/map/lib/gl/e$h:a	(Ljava/lang/String;Ljava/lang/String;I)V
    //   1064: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   1067: astore 13
    //   1069: aload 13
    //   1071: monitorenter
    //   1072: aload_0
    //   1073: iconst_1
    //   1074: putfield 150	com/tencent/map/lib/gl/e$i:f	Z
    //   1077: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   1080: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   1083: aload 13
    //   1085: monitorexit
    //   1086: iload 4
    //   1088: istore 15
    //   1090: iload_3
    //   1091: ifeq +202 -> 1293
    //   1094: iconst_1
    //   1095: istore 4
    //   1097: iload 4
    //   1099: istore 7
    //   1101: iload 9
    //   1103: istore_2
    //   1104: iload 6
    //   1106: istore 9
    //   1108: iload_3
    //   1109: istore 6
    //   1111: iload_1
    //   1112: istore 5
    //   1114: iload 15
    //   1116: istore 4
    //   1118: iload 18
    //   1120: istore_3
    //   1121: iload 14
    //   1123: istore_1
    //   1124: goto -1061 -> 63
    //   1127: astore 12
    //   1129: aload 13
    //   1131: monitorexit
    //   1132: ldc 96
    //   1134: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1137: aload 12
    //   1139: athrow
    //   1140: astore 11
    //   1142: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   1145: astore 12
    //   1147: aload 12
    //   1149: monitorenter
    //   1150: aload_0
    //   1151: invokespecial 114	com/tencent/map/lib/gl/e$i:j	()V
    //   1154: aload_0
    //   1155: invokespecial 116	com/tencent/map/lib/gl/e$i:k	()V
    //   1158: aload 12
    //   1160: monitorexit
    //   1161: ldc 96
    //   1163: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1166: aload 11
    //   1168: athrow
    //   1169: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   1172: astore 13
    //   1174: aload 13
    //   1176: monitorenter
    //   1177: aload_0
    //   1178: iconst_1
    //   1179: putfield 168	com/tencent/map/lib/gl/e$i:j	Z
    //   1182: aload_0
    //   1183: iconst_1
    //   1184: putfield 150	com/tencent/map/lib/gl/e$i:f	Z
    //   1187: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   1190: invokevirtual 138	java/lang/Object:notifyAll	()V
    //   1193: aload 13
    //   1195: monitorexit
    //   1196: iload 6
    //   1198: istore 9
    //   1200: iload_3
    //   1201: istore 6
    //   1203: iload 14
    //   1205: istore_3
    //   1206: goto -1143 -> 63
    //   1209: astore 12
    //   1211: aload 13
    //   1213: monitorexit
    //   1214: ldc 96
    //   1216: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1219: aload 12
    //   1221: athrow
    //   1222: iconst_1
    //   1223: istore 15
    //   1225: goto -135 -> 1090
    //   1228: astore 12
    //   1230: aload 13
    //   1232: monitorexit
    //   1233: ldc 96
    //   1235: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1238: aload 12
    //   1240: athrow
    //   1241: astore 11
    //   1243: aload 12
    //   1245: monitorexit
    //   1246: ldc 96
    //   1248: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1251: aload 11
    //   1253: athrow
    //   1254: astore 11
    //   1256: aload 12
    //   1258: monitorexit
    //   1259: ldc 96
    //   1261: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1264: aload 11
    //   1266: athrow
    //   1267: iload 14
    //   1269: istore 18
    //   1271: goto -384 -> 887
    //   1274: iload 8
    //   1276: istore_2
    //   1277: iload 15
    //   1279: istore_3
    //   1280: iload 7
    //   1282: istore 5
    //   1284: goto -644 -> 640
    //   1287: iconst_0
    //   1288: istore 17
    //   1290: goto -1031 -> 259
    //   1293: iload 7
    //   1295: istore 4
    //   1297: goto -200 -> 1097
    //   1300: iconst_0
    //   1301: istore 17
    //   1303: goto -296 -> 1007
    //
    // Exception table:
    //   from	to	target	type
    //   127	138	144	finally
    //   146	149	144	finally
    //   82	101	728	finally
    //   106	116	728	finally
    //   116	119	728	finally
    //   157	180	728	finally
    //   197	200	728	finally
    //   228	259	728	finally
    //   263	283	728	finally
    //   295	303	728	finally
    //   311	322	728	finally
    //   327	346	728	finally
    //   359	368	728	finally
    //   368	372	728	finally
    //   377	393	728	finally
    //   393	418	728	finally
    //   418	434	728	finally
    //   434	459	728	finally
    //   474	485	728	finally
    //   503	510	728	finally
    //   517	524	728	finally
    //   545	552	728	finally
    //   562	574	728	finally
    //   602	616	728	finally
    //   619	631	728	finally
    //   635	640	728	finally
    //   640	651	728	finally
    //   670	677	728	finally
    //   680	689	728	finally
    //   701	708	728	finally
    //   708	713	728	finally
    //   715	721	728	finally
    //   730	733	728	finally
    //   772	779	728	finally
    //   782	788	728	finally
    //   63	71	741	java/lang/Exception
    //   205	212	741	java/lang/Exception
    //   733	741	741	java/lang/Exception
    //   824	842	741	java/lang/Exception
    //   864	884	741	java/lang/Exception
    //   894	906	741	java/lang/Exception
    //   911	930	741	java/lang/Exception
    //   941	953	741	java/lang/Exception
    //   958	974	741	java/lang/Exception
    //   976	988	741	java/lang/Exception
    //   993	1007	741	java/lang/Exception
    //   1016	1024	741	java/lang/Exception
    //   1056	1072	741	java/lang/Exception
    //   1132	1140	741	java/lang/Exception
    //   1169	1177	741	java/lang/Exception
    //   1214	1222	741	java/lang/Exception
    //   1233	1241	741	java/lang/Exception
    //   701	708	770	java/lang/RuntimeException
    //   842	856	1127	finally
    //   1129	1132	1127	finally
    //   63	71	1140	finally
    //   205	212	1140	finally
    //   733	741	1140	finally
    //   824	842	1140	finally
    //   864	884	1140	finally
    //   894	906	1140	finally
    //   911	930	1140	finally
    //   941	953	1140	finally
    //   958	974	1140	finally
    //   976	988	1140	finally
    //   993	1007	1140	finally
    //   1016	1024	1140	finally
    //   1056	1072	1140	finally
    //   1132	1140	1140	finally
    //   1169	1177	1140	finally
    //   1214	1222	1140	finally
    //   1233	1241	1140	finally
    //   1177	1196	1209	finally
    //   1211	1214	1209	finally
    //   1072	1086	1228	finally
    //   1230	1233	1228	finally
    //   751	762	1241	finally
    //   1243	1246	1241	finally
    //   1150	1161	1254	finally
    //   1256	1259	1254	finally
  }

  private boolean m()
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

  public void a(int paramInt)
  {
    AppMethodBeat.i(98081);
    if ((paramInt < 0) || (paramInt > 1))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("renderMode");
      AppMethodBeat.o(98081);
      throw localIllegalArgumentException;
    }
    synchronized (e.c())
    {
      this.n = paramInt;
      e.c().notifyAll();
      AppMethodBeat.o(98081);
      return;
    }
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98088);
    synchronized (e.c())
    {
      this.l = paramInt1;
      this.m = paramInt2;
      this.r = true;
      this.o = true;
      this.p = false;
      e.c().notifyAll();
      while (true)
        if ((!this.b) && (!this.d) && (!this.p))
        {
          boolean bool = a();
          if (bool)
            try
            {
              e.c().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(98088);
  }

  public boolean a()
  {
    AppMethodBeat.i(98080);
    boolean bool;
    if ((this.h) && (this.i) && (m()))
    {
      bool = true;
      AppMethodBeat.o(98080);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(98080);
    }
  }

  public int b()
  {
    AppMethodBeat.i(98082);
    synchronized (e.c())
    {
      int i1 = this.n;
      AppMethodBeat.o(98082);
      return i1;
    }
  }

  public void c()
  {
    AppMethodBeat.i(98083);
    synchronized (e.c())
    {
      this.o = true;
      e.c().notifyAll();
      AppMethodBeat.o(98083);
      return;
    }
  }

  public void d()
  {
    AppMethodBeat.i(98084);
    synchronized (e.c())
    {
      this.e = true;
      this.j = false;
      e.c().notifyAll();
      while (true)
        if ((this.g) && (!this.j))
        {
          boolean bool = this.b;
          if (!bool)
            try
            {
              e.c().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(98084);
  }

  public void e()
  {
    AppMethodBeat.i(98085);
    synchronized (e.c())
    {
      this.e = false;
      e.c().notifyAll();
      while (true)
        if (!this.g)
        {
          boolean bool = this.b;
          if (!bool)
            try
            {
              e.c().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(98085);
  }

  public void f()
  {
    AppMethodBeat.i(98086);
    synchronized (e.c())
    {
      this.c = true;
      e.c().notifyAll();
      while (true)
        if (!this.b)
        {
          boolean bool = this.d;
          if (!bool)
            try
            {
              e.c().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(98086);
  }

  public void g()
  {
    AppMethodBeat.i(98087);
    synchronized (e.c())
    {
      this.c = false;
      this.o = true;
      this.p = false;
      e.c().notifyAll();
      while (true)
        if ((!this.b) && (this.d))
        {
          boolean bool = this.p;
          if (!bool)
            try
            {
              e.c().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(98087);
  }

  public void h()
  {
    AppMethodBeat.i(98089);
    synchronized (e.c())
    {
      this.a = true;
      e.c().notifyAll();
      while (true)
      {
        boolean bool = this.b;
        if (!bool)
          try
          {
            e.c().wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
      }
    }
    AppMethodBeat.o(98089);
  }

  public void i()
  {
    AppMethodBeat.i(98090);
    this.k = true;
    e.c().notifyAll();
    AppMethodBeat.o(98090);
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc 228
    //   2: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: new 230	java/lang/StringBuilder
    //   9: dup
    //   10: ldc 232
    //   12: invokespecial 233	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: invokevirtual 237	com/tencent/map/lib/gl/e$i:getId	()J
    //   19: invokevirtual 241	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   22: invokevirtual 245	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   25: invokevirtual 248	com/tencent/map/lib/gl/e$i:setName	(Ljava/lang/String;)V
    //   28: aload_0
    //   29: invokespecial 250	com/tencent/map/lib/gl/e$i:l	()V
    //   32: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   35: aload_0
    //   36: invokevirtual 252	com/tencent/map/lib/gl/e$j:a	(Lcom/tencent/map/lib/gl/e$i;)V
    //   39: ldc 228
    //   41: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: return
    //   45: astore_1
    //   46: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   49: aload_0
    //   50: invokevirtual 252	com/tencent/map/lib/gl/e$j:a	(Lcom/tencent/map/lib/gl/e$i;)V
    //   53: ldc 228
    //   55: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: goto -14 -> 44
    //   61: astore_1
    //   62: invokestatic 86	com/tencent/map/lib/gl/e:c	()Lcom/tencent/map/lib/gl/e$j;
    //   65: aload_0
    //   66: invokevirtual 252	com/tencent/map/lib/gl/e$j:a	(Lcom/tencent/map/lib/gl/e$i;)V
    //   69: ldc 228
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.e.i
 * JD-Core Version:    0.6.2
 */