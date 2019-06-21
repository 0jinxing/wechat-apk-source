package com.tencent.ttpic.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

class GLSurfaceView$GLThread extends Thread
{
  private GLSurfaceView.EglHelper mEglHelper;
  private ArrayList<Runnable> mEventQueue;
  private boolean mExited;
  private Runnable mFinishDrawingRunnable;
  private boolean mFinishedCreatingEglSurface;
  private WeakReference<GLSurfaceView> mGLSurfaceViewWeakRef;
  private boolean mHasSurface;
  private boolean mHaveEglContext;
  private boolean mHaveEglSurface;
  private int mHeight;
  private boolean mPaused;
  private boolean mRenderComplete;
  private int mRenderMode;
  private boolean mRequestPaused;
  private boolean mRequestRender;
  private boolean mShouldExit;
  private boolean mShouldReleaseEglContext;
  private boolean mSizeChanged;
  private boolean mSurfaceIsBad;
  private boolean mWaitingForSurface;
  private boolean mWantRenderNotification;
  private int mWidth;

  GLSurfaceView$GLThread(WeakReference<GLSurfaceView> paramWeakReference)
  {
    AppMethodBeat.i(84446);
    this.mEventQueue = new ArrayList();
    this.mSizeChanged = true;
    this.mFinishDrawingRunnable = null;
    this.mWidth = 0;
    this.mHeight = 0;
    this.mRequestRender = true;
    this.mRenderMode = 1;
    this.mWantRenderNotification = false;
    this.mGLSurfaceViewWeakRef = paramWeakReference;
    AppMethodBeat.o(84446);
  }

  // ERROR //
  private void guardedRun()
  {
    // Byte code:
    //   0: ldc 84
    //   2: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: new 86	com/tencent/ttpic/view/GLSurfaceView$EglHelper
    //   9: dup
    //   10: aload_0
    //   11: getfield 70	com/tencent/ttpic/view/GLSurfaceView$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
    //   14: invokespecial 88	com/tencent/ttpic/view/GLSurfaceView$EglHelper:<init>	(Ljava/lang/ref/WeakReference;)V
    //   17: putfield 90	com/tencent/ttpic/view/GLSurfaceView$GLThread:mEglHelper	Lcom/tencent/ttpic/view/GLSurfaceView$EglHelper;
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield 92	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglContext	Z
    //   25: aload_0
    //   26: iconst_0
    //   27: putfield 94	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglSurface	Z
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 68	com/tencent/ttpic/view/GLSurfaceView$GLThread:mWantRenderNotification	Z
    //   35: iconst_0
    //   36: istore_1
    //   37: iconst_0
    //   38: istore_2
    //   39: iconst_0
    //   40: istore_3
    //   41: iconst_0
    //   42: istore 4
    //   44: iconst_0
    //   45: istore 5
    //   47: iconst_0
    //   48: istore 6
    //   50: iconst_0
    //   51: istore 7
    //   53: iconst_0
    //   54: istore 8
    //   56: iconst_0
    //   57: istore 9
    //   59: iconst_0
    //   60: istore 10
    //   62: aconst_null
    //   63: astore 11
    //   65: aconst_null
    //   66: astore 12
    //   68: aconst_null
    //   69: astore 13
    //   71: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   74: astore 14
    //   76: aload 14
    //   78: monitorenter
    //   79: iload 8
    //   81: istore 15
    //   83: aload_0
    //   84: getfield 54	com/tencent/ttpic/view/GLSurfaceView$GLThread:mEventQueue	Ljava/util/ArrayList;
    //   87: invokevirtual 102	java/util/ArrayList:isEmpty	()Z
    //   90: ifne +61 -> 151
    //   93: aload_0
    //   94: getfield 54	com/tencent/ttpic/view/GLSurfaceView$GLThread:mEventQueue	Ljava/util/ArrayList;
    //   97: iconst_0
    //   98: invokevirtual 106	java/util/ArrayList:remove	(I)Ljava/lang/Object;
    //   101: checkcast 108	java/lang/Runnable
    //   104: astore 16
    //   106: iload 15
    //   108: istore 8
    //   110: iload 9
    //   112: istore 17
    //   114: iload_2
    //   115: istore 15
    //   117: iload 7
    //   119: istore_2
    //   120: aload 14
    //   122: monitorexit
    //   123: aload 16
    //   125: ifnull +706 -> 831
    //   128: aload 16
    //   130: invokeinterface 111 1 0
    //   135: aconst_null
    //   136: astore 11
    //   138: iload_2
    //   139: istore 7
    //   141: iload 15
    //   143: istore_2
    //   144: iload 17
    //   146: istore 9
    //   148: goto -77 -> 71
    //   151: aload_0
    //   152: getfield 113	com/tencent/ttpic/view/GLSurfaceView$GLThread:mShouldExit	Z
    //   155: ifeq +44 -> 199
    //   158: aload 14
    //   160: monitorexit
    //   161: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   164: astore 11
    //   166: aload 11
    //   168: monitorenter
    //   169: aload_0
    //   170: invokespecial 116	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglSurfaceLocked	()V
    //   173: aload_0
    //   174: invokespecial 119	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglContextLocked	()V
    //   177: aload 11
    //   179: monitorexit
    //   180: ldc 84
    //   182: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: return
    //   186: astore 12
    //   188: aload 11
    //   190: monitorexit
    //   191: ldc 84
    //   193: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: aload 12
    //   198: athrow
    //   199: iconst_0
    //   200: istore 18
    //   202: aload_0
    //   203: getfield 121	com/tencent/ttpic/view/GLSurfaceView$GLThread:mPaused	Z
    //   206: aload_0
    //   207: getfield 123	com/tencent/ttpic/view/GLSurfaceView$GLThread:mRequestPaused	Z
    //   210: if_icmpeq +23 -> 233
    //   213: aload_0
    //   214: getfield 123	com/tencent/ttpic/view/GLSurfaceView$GLThread:mRequestPaused	Z
    //   217: istore 18
    //   219: aload_0
    //   220: aload_0
    //   221: getfield 123	com/tencent/ttpic/view/GLSurfaceView$GLThread:mRequestPaused	Z
    //   224: putfield 121	com/tencent/ttpic/view/GLSurfaceView$GLThread:mPaused	Z
    //   227: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   230: invokevirtual 128	java/lang/Object:notifyAll	()V
    //   233: aload_0
    //   234: getfield 130	com/tencent/ttpic/view/GLSurfaceView$GLThread:mShouldReleaseEglContext	Z
    //   237: ifeq +19 -> 256
    //   240: aload_0
    //   241: invokespecial 116	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglSurfaceLocked	()V
    //   244: aload_0
    //   245: invokespecial 119	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglContextLocked	()V
    //   248: aload_0
    //   249: iconst_0
    //   250: putfield 130	com/tencent/ttpic/view/GLSurfaceView$GLThread:mShouldReleaseEglContext	Z
    //   253: iconst_1
    //   254: istore 15
    //   256: iload 4
    //   258: istore 19
    //   260: iload 4
    //   262: ifeq +14 -> 276
    //   265: aload_0
    //   266: invokespecial 116	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglSurfaceLocked	()V
    //   269: aload_0
    //   270: invokespecial 119	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglContextLocked	()V
    //   273: iconst_0
    //   274: istore 19
    //   276: iload 18
    //   278: ifeq +14 -> 292
    //   281: aload_0
    //   282: getfield 94	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglSurface	Z
    //   285: ifeq +7 -> 292
    //   288: aload_0
    //   289: invokespecial 116	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglSurfaceLocked	()V
    //   292: iload 18
    //   294: ifeq +39 -> 333
    //   297: aload_0
    //   298: getfield 92	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglContext	Z
    //   301: ifeq +32 -> 333
    //   304: aload_0
    //   305: getfield 70	com/tencent/ttpic/view/GLSurfaceView$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
    //   308: invokevirtual 136	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   311: checkcast 6	com/tencent/ttpic/view/GLSurfaceView
    //   314: astore 16
    //   316: aload 16
    //   318: ifnonnull +325 -> 643
    //   321: iconst_0
    //   322: istore 18
    //   324: iload 18
    //   326: ifne +7 -> 333
    //   329: aload_0
    //   330: invokespecial 119	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglContextLocked	()V
    //   333: aload_0
    //   334: getfield 138	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHasSurface	Z
    //   337: ifne +37 -> 374
    //   340: aload_0
    //   341: getfield 140	com/tencent/ttpic/view/GLSurfaceView$GLThread:mWaitingForSurface	Z
    //   344: ifne +30 -> 374
    //   347: aload_0
    //   348: getfield 94	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglSurface	Z
    //   351: ifeq +7 -> 358
    //   354: aload_0
    //   355: invokespecial 116	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglSurfaceLocked	()V
    //   358: aload_0
    //   359: iconst_1
    //   360: putfield 140	com/tencent/ttpic/view/GLSurfaceView$GLThread:mWaitingForSurface	Z
    //   363: aload_0
    //   364: iconst_0
    //   365: putfield 142	com/tencent/ttpic/view/GLSurfaceView$GLThread:mSurfaceIsBad	Z
    //   368: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   371: invokevirtual 128	java/lang/Object:notifyAll	()V
    //   374: aload_0
    //   375: getfield 138	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHasSurface	Z
    //   378: ifeq +21 -> 399
    //   381: aload_0
    //   382: getfield 140	com/tencent/ttpic/view/GLSurfaceView$GLThread:mWaitingForSurface	Z
    //   385: ifeq +14 -> 399
    //   388: aload_0
    //   389: iconst_0
    //   390: putfield 140	com/tencent/ttpic/view/GLSurfaceView$GLThread:mWaitingForSurface	Z
    //   393: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   396: invokevirtual 128	java/lang/Object:notifyAll	()V
    //   399: iload 7
    //   401: istore 17
    //   403: iload 7
    //   405: ifeq +22 -> 427
    //   408: aload_0
    //   409: iconst_0
    //   410: putfield 68	com/tencent/ttpic/view/GLSurfaceView$GLThread:mWantRenderNotification	Z
    //   413: iconst_0
    //   414: istore 17
    //   416: aload_0
    //   417: iconst_1
    //   418: putfield 144	com/tencent/ttpic/view/GLSurfaceView$GLThread:mRenderComplete	Z
    //   421: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   424: invokevirtual 128	java/lang/Object:notifyAll	()V
    //   427: aload_0
    //   428: getfield 58	com/tencent/ttpic/view/GLSurfaceView$GLThread:mFinishDrawingRunnable	Ljava/lang/Runnable;
    //   431: ifnull +856 -> 1287
    //   434: aload_0
    //   435: getfield 58	com/tencent/ttpic/view/GLSurfaceView$GLThread:mFinishDrawingRunnable	Ljava/lang/Runnable;
    //   438: astore 12
    //   440: aload_0
    //   441: aconst_null
    //   442: putfield 58	com/tencent/ttpic/view/GLSurfaceView$GLThread:mFinishDrawingRunnable	Ljava/lang/Runnable;
    //   445: aload_0
    //   446: invokespecial 147	com/tencent/ttpic/view/GLSurfaceView$GLThread:readyToDraw	()Z
    //   449: ifeq +291 -> 740
    //   452: iload 15
    //   454: istore 4
    //   456: iload_1
    //   457: istore 7
    //   459: aload_0
    //   460: getfield 92	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglContext	Z
    //   463: ifne +14 -> 477
    //   466: iload 15
    //   468: ifeq +185 -> 653
    //   471: iconst_0
    //   472: istore 4
    //   474: iload_1
    //   475: istore 7
    //   477: iload_2
    //   478: istore 8
    //   480: iload 5
    //   482: istore 15
    //   484: iload_3
    //   485: istore_1
    //   486: aload_0
    //   487: getfield 92	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglContext	Z
    //   490: ifeq +32 -> 522
    //   493: iload_2
    //   494: istore 8
    //   496: iload 5
    //   498: istore 15
    //   500: iload_3
    //   501: istore_1
    //   502: aload_0
    //   503: getfield 94	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglSurface	Z
    //   506: ifne +16 -> 522
    //   509: aload_0
    //   510: iconst_1
    //   511: putfield 94	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglSurface	Z
    //   514: iconst_1
    //   515: istore 8
    //   517: iconst_1
    //   518: istore_1
    //   519: iconst_1
    //   520: istore 15
    //   522: aload 12
    //   524: astore 16
    //   526: iload 8
    //   528: istore 20
    //   530: iload 4
    //   532: istore 21
    //   534: iload 15
    //   536: istore 22
    //   538: iload_1
    //   539: istore 23
    //   541: iload 7
    //   543: istore 24
    //   545: aload_0
    //   546: getfield 94	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglSurface	Z
    //   549: ifeq +244 -> 793
    //   552: iload 15
    //   554: istore 5
    //   556: aload_0
    //   557: getfield 56	com/tencent/ttpic/view/GLSurfaceView$GLThread:mSizeChanged	Z
    //   560: ifeq +31 -> 591
    //   563: iconst_1
    //   564: istore 5
    //   566: aload_0
    //   567: getfield 60	com/tencent/ttpic/view/GLSurfaceView$GLThread:mWidth	I
    //   570: istore 9
    //   572: aload_0
    //   573: getfield 62	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHeight	I
    //   576: istore 10
    //   578: aload_0
    //   579: iconst_1
    //   580: putfield 68	com/tencent/ttpic/view/GLSurfaceView$GLThread:mWantRenderNotification	Z
    //   583: iconst_1
    //   584: istore 8
    //   586: aload_0
    //   587: iconst_0
    //   588: putfield 56	com/tencent/ttpic/view/GLSurfaceView$GLThread:mSizeChanged	Z
    //   591: aload_0
    //   592: iconst_0
    //   593: putfield 64	com/tencent/ttpic/view/GLSurfaceView$GLThread:mRequestRender	Z
    //   596: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   599: invokevirtual 128	java/lang/Object:notifyAll	()V
    //   602: aload_0
    //   603: getfield 68	com/tencent/ttpic/view/GLSurfaceView$GLThread:mWantRenderNotification	Z
    //   606: ifeq +650 -> 1256
    //   609: iconst_1
    //   610: istore 6
    //   612: iload 17
    //   614: istore_2
    //   615: iload 8
    //   617: istore 15
    //   619: aload 11
    //   621: astore 16
    //   623: iload 9
    //   625: istore 17
    //   627: iload 4
    //   629: istore 8
    //   631: iload 19
    //   633: istore 4
    //   635: iload_1
    //   636: istore_3
    //   637: iload 7
    //   639: istore_1
    //   640: goto -520 -> 120
    //   643: aload 16
    //   645: invokestatic 151	com/tencent/ttpic/view/GLSurfaceView:access$900	(Lcom/tencent/ttpic/view/GLSurfaceView;)Z
    //   648: istore 18
    //   650: goto -326 -> 324
    //   653: aload_0
    //   654: getfield 90	com/tencent/ttpic/view/GLSurfaceView$GLThread:mEglHelper	Lcom/tencent/ttpic/view/GLSurfaceView$EglHelper;
    //   657: invokevirtual 154	com/tencent/ttpic/view/GLSurfaceView$EglHelper:start	()V
    //   660: aload_0
    //   661: iconst_1
    //   662: putfield 92	com/tencent/ttpic/view/GLSurfaceView$GLThread:mHaveEglContext	Z
    //   665: iconst_1
    //   666: istore 7
    //   668: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   671: invokevirtual 128	java/lang/Object:notifyAll	()V
    //   674: iload 15
    //   676: istore 4
    //   678: goto -201 -> 477
    //   681: astore 12
    //   683: aload 14
    //   685: monitorexit
    //   686: ldc 84
    //   688: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   691: aload 12
    //   693: athrow
    //   694: astore 11
    //   696: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   699: astore 12
    //   701: aload 12
    //   703: monitorenter
    //   704: aload_0
    //   705: invokespecial 116	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglSurfaceLocked	()V
    //   708: aload_0
    //   709: invokespecial 119	com/tencent/ttpic/view/GLSurfaceView$GLThread:stopEglContextLocked	()V
    //   712: aload 12
    //   714: monitorexit
    //   715: ldc 84
    //   717: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   720: aload 11
    //   722: athrow
    //   723: astore 12
    //   725: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   728: aload_0
    //   729: invokevirtual 160	com/tencent/ttpic/view/GLSurfaceView$GLThreadManager:releaseEglContextLocked	(Lcom/tencent/ttpic/view/GLSurfaceView$GLThread;)V
    //   732: ldc 84
    //   734: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   737: aload 12
    //   739: athrow
    //   740: aload 12
    //   742: astore 16
    //   744: iload_2
    //   745: istore 20
    //   747: iload 15
    //   749: istore 21
    //   751: iload 5
    //   753: istore 22
    //   755: iload_3
    //   756: istore 23
    //   758: iload_1
    //   759: istore 24
    //   761: aload 12
    //   763: ifnull +30 -> 793
    //   766: aload 12
    //   768: invokeinterface 111 1 0
    //   773: aconst_null
    //   774: astore 16
    //   776: iload_1
    //   777: istore 24
    //   779: iload_3
    //   780: istore 23
    //   782: iload 5
    //   784: istore 22
    //   786: iload 15
    //   788: istore 21
    //   790: iload_2
    //   791: istore 20
    //   793: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   796: invokevirtual 163	java/lang/Object:wait	()V
    //   799: aload 16
    //   801: astore 12
    //   803: iload 17
    //   805: istore 7
    //   807: iload 20
    //   809: istore_2
    //   810: iload 21
    //   812: istore 15
    //   814: iload 22
    //   816: istore 5
    //   818: iload 19
    //   820: istore 4
    //   822: iload 23
    //   824: istore_3
    //   825: iload 24
    //   827: istore_1
    //   828: goto -745 -> 83
    //   831: iload 15
    //   833: istore 9
    //   835: iload 15
    //   837: ifeq +38 -> 875
    //   840: aload_0
    //   841: getfield 90	com/tencent/ttpic/view/GLSurfaceView$GLThread:mEglHelper	Lcom/tencent/ttpic/view/GLSurfaceView$EglHelper;
    //   844: invokevirtual 166	com/tencent/ttpic/view/GLSurfaceView$EglHelper:createSurface	()Z
    //   847: ifeq +321 -> 1168
    //   850: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   853: astore 11
    //   855: aload 11
    //   857: monitorenter
    //   858: aload_0
    //   859: iconst_1
    //   860: putfield 168	com/tencent/ttpic/view/GLSurfaceView$GLThread:mFinishedCreatingEglSurface	Z
    //   863: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   866: invokevirtual 128	java/lang/Object:notifyAll	()V
    //   869: aload 11
    //   871: monitorexit
    //   872: iconst_0
    //   873: istore 9
    //   875: iload_3
    //   876: istore 15
    //   878: iload_3
    //   879: ifeq +18 -> 897
    //   882: aload_0
    //   883: getfield 90	com/tencent/ttpic/view/GLSurfaceView$GLThread:mEglHelper	Lcom/tencent/ttpic/view/GLSurfaceView$EglHelper;
    //   886: invokevirtual 172	com/tencent/ttpic/view/GLSurfaceView$EglHelper:createGL	()Ljavax/microedition/khronos/opengles/GL;
    //   889: checkcast 174	javax/microedition/khronos/opengles/GL10
    //   892: astore 13
    //   894: iconst_0
    //   895: istore 15
    //   897: iload_1
    //   898: istore 19
    //   900: iload_1
    //   901: ifeq +42 -> 943
    //   904: aload_0
    //   905: getfield 70	com/tencent/ttpic/view/GLSurfaceView$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
    //   908: invokevirtual 136	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   911: checkcast 6	com/tencent/ttpic/view/GLSurfaceView
    //   914: astore 11
    //   916: aload 11
    //   918: ifnull +22 -> 940
    //   921: aload 11
    //   923: invokestatic 178	com/tencent/ttpic/view/GLSurfaceView:access$1000	(Lcom/tencent/ttpic/view/GLSurfaceView;)Lcom/tencent/ttpic/view/GLSurfaceView$Renderer;
    //   926: aload 13
    //   928: aload_0
    //   929: getfield 90	com/tencent/ttpic/view/GLSurfaceView$GLThread:mEglHelper	Lcom/tencent/ttpic/view/GLSurfaceView$EglHelper;
    //   932: getfield 182	com/tencent/ttpic/view/GLSurfaceView$EglHelper:mEglConfig	Ljavax/microedition/khronos/egl/EGLConfig;
    //   935: invokeinterface 188 3 0
    //   940: iconst_0
    //   941: istore 19
    //   943: iload 5
    //   945: istore_1
    //   946: iload 5
    //   948: ifeq +38 -> 986
    //   951: aload_0
    //   952: getfield 70	com/tencent/ttpic/view/GLSurfaceView$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
    //   955: invokevirtual 136	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   958: checkcast 6	com/tencent/ttpic/view/GLSurfaceView
    //   961: astore 11
    //   963: aload 11
    //   965: ifnull +19 -> 984
    //   968: aload 11
    //   970: invokestatic 178	com/tencent/ttpic/view/GLSurfaceView:access$1000	(Lcom/tencent/ttpic/view/GLSurfaceView;)Lcom/tencent/ttpic/view/GLSurfaceView$Renderer;
    //   973: aload 13
    //   975: iload 17
    //   977: iload 10
    //   979: invokeinterface 192 4 0
    //   984: iconst_0
    //   985: istore_1
    //   986: aload_0
    //   987: getfield 70	com/tencent/ttpic/view/GLSurfaceView$GLThread:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
    //   990: invokevirtual 136	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   993: checkcast 6	com/tencent/ttpic/view/GLSurfaceView
    //   996: astore 14
    //   998: aload 12
    //   1000: astore 11
    //   1002: aload 14
    //   1004: ifnull +34 -> 1038
    //   1007: aload 14
    //   1009: invokestatic 178	com/tencent/ttpic/view/GLSurfaceView:access$1000	(Lcom/tencent/ttpic/view/GLSurfaceView;)Lcom/tencent/ttpic/view/GLSurfaceView$Renderer;
    //   1012: aload 13
    //   1014: invokeinterface 196 2 0
    //   1019: aload 12
    //   1021: astore 11
    //   1023: aload 12
    //   1025: ifnull +13 -> 1038
    //   1028: aload 12
    //   1030: invokeinterface 111 1 0
    //   1035: aconst_null
    //   1036: astore 11
    //   1038: aload_0
    //   1039: getfield 90	com/tencent/ttpic/view/GLSurfaceView$GLThread:mEglHelper	Lcom/tencent/ttpic/view/GLSurfaceView$EglHelper;
    //   1042: invokevirtual 200	com/tencent/ttpic/view/GLSurfaceView$EglHelper:swap	()I
    //   1045: istore 7
    //   1047: iload 4
    //   1049: istore_3
    //   1050: iload 7
    //   1052: lookupswitch	default:+28->1080, 12288:+62->1114, 12302:+173->1225
    //   1081: jsr_w 18 203 21 7
    //   1086: invokestatic 207	com/tencent/ttpic/view/GLSurfaceView$EglHelper:logEglErrorAsWarning	(Ljava/lang/String;Ljava/lang/String;I)V
    //   1089: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   1092: astore 12
    //   1094: aload 12
    //   1096: monitorenter
    //   1097: aload_0
    //   1098: iconst_1
    //   1099: putfield 142	com/tencent/ttpic/view/GLSurfaceView$GLThread:mSurfaceIsBad	Z
    //   1102: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   1105: invokevirtual 128	java/lang/Object:notifyAll	()V
    //   1108: aload 12
    //   1110: monitorexit
    //   1111: iload 4
    //   1113: istore_3
    //   1114: iload 6
    //   1116: ifeq +174 -> 1290
    //   1119: iconst_1
    //   1120: istore 7
    //   1122: iconst_0
    //   1123: istore 6
    //   1125: iload 9
    //   1127: istore_2
    //   1128: aload 11
    //   1130: astore 12
    //   1132: aload 16
    //   1134: astore 11
    //   1136: iload 17
    //   1138: istore 9
    //   1140: iload_1
    //   1141: istore 5
    //   1143: iload_3
    //   1144: istore 4
    //   1146: iload 15
    //   1148: istore_3
    //   1149: iload 19
    //   1151: istore_1
    //   1152: goto -1081 -> 71
    //   1155: astore 12
    //   1157: aload 11
    //   1159: monitorexit
    //   1160: ldc 84
    //   1162: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1165: aload 12
    //   1167: athrow
    //   1168: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   1171: astore 11
    //   1173: aload 11
    //   1175: monitorenter
    //   1176: aload_0
    //   1177: iconst_1
    //   1178: putfield 168	com/tencent/ttpic/view/GLSurfaceView$GLThread:mFinishedCreatingEglSurface	Z
    //   1181: aload_0
    //   1182: iconst_1
    //   1183: putfield 142	com/tencent/ttpic/view/GLSurfaceView$GLThread:mSurfaceIsBad	Z
    //   1186: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   1189: invokevirtual 128	java/lang/Object:notifyAll	()V
    //   1192: aload 11
    //   1194: monitorexit
    //   1195: iload_2
    //   1196: istore 7
    //   1198: iload 15
    //   1200: istore_2
    //   1201: aload 16
    //   1203: astore 11
    //   1205: iload 17
    //   1207: istore 9
    //   1209: goto -1138 -> 71
    //   1212: astore 12
    //   1214: aload 11
    //   1216: monitorexit
    //   1217: ldc 84
    //   1219: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1222: aload 12
    //   1224: athrow
    //   1225: iconst_1
    //   1226: istore_3
    //   1227: goto -113 -> 1114
    //   1230: astore 11
    //   1232: aload 12
    //   1234: monitorexit
    //   1235: ldc 84
    //   1237: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1240: aload 11
    //   1242: athrow
    //   1243: astore 11
    //   1245: aload 12
    //   1247: monitorexit
    //   1248: ldc 84
    //   1250: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1253: aload 11
    //   1255: athrow
    //   1256: iload 17
    //   1258: istore_2
    //   1259: iload 8
    //   1261: istore 15
    //   1263: aload 11
    //   1265: astore 16
    //   1267: iload 9
    //   1269: istore 17
    //   1271: iload 4
    //   1273: istore 8
    //   1275: iload 19
    //   1277: istore 4
    //   1279: iload_1
    //   1280: istore_3
    //   1281: iload 7
    //   1283: istore_1
    //   1284: goto -1164 -> 120
    //   1287: goto -842 -> 445
    //   1290: iload_2
    //   1291: istore 7
    //   1293: goto -168 -> 1125
    //
    // Exception table:
    //   from	to	target	type
    //   169	180	186	finally
    //   188	191	186	finally
    //   83	106	681	finally
    //   120	123	681	finally
    //   151	161	681	finally
    //   202	233	681	finally
    //   233	253	681	finally
    //   265	273	681	finally
    //   281	292	681	finally
    //   297	316	681	finally
    //   329	333	681	finally
    //   333	358	681	finally
    //   358	374	681	finally
    //   374	399	681	finally
    //   408	413	681	finally
    //   416	427	681	finally
    //   427	445	681	finally
    //   445	452	681	finally
    //   459	466	681	finally
    //   486	493	681	finally
    //   502	514	681	finally
    //   545	552	681	finally
    //   556	563	681	finally
    //   566	583	681	finally
    //   586	591	681	finally
    //   591	609	681	finally
    //   643	650	681	finally
    //   653	660	681	finally
    //   660	665	681	finally
    //   668	674	681	finally
    //   683	686	681	finally
    //   725	740	681	finally
    //   766	773	681	finally
    //   793	799	681	finally
    //   71	79	694	finally
    //   128	135	694	finally
    //   686	694	694	finally
    //   840	858	694	finally
    //   882	894	694	finally
    //   904	916	694	finally
    //   921	940	694	finally
    //   951	963	694	finally
    //   968	984	694	finally
    //   986	998	694	finally
    //   1007	1019	694	finally
    //   1028	1035	694	finally
    //   1038	1047	694	finally
    //   1080	1097	694	finally
    //   1160	1168	694	finally
    //   1168	1176	694	finally
    //   1217	1225	694	finally
    //   1235	1243	694	finally
    //   653	660	723	java/lang/RuntimeException
    //   858	872	1155	finally
    //   1157	1160	1155	finally
    //   1176	1195	1212	finally
    //   1214	1217	1212	finally
    //   1097	1111	1230	finally
    //   1232	1235	1230	finally
    //   704	715	1243	finally
    //   1245	1248	1243	finally
  }

  private boolean readyToDraw()
  {
    boolean bool1 = true;
    if ((!this.mPaused) && (this.mHasSurface) && (!this.mSurfaceIsBad) && (this.mWidth > 0) && (this.mHeight > 0))
    {
      bool2 = bool1;
      if (!this.mRequestRender)
        if (this.mRenderMode != 1)
          break label58;
    }
    label58: for (boolean bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  private void stopEglContextLocked()
  {
    AppMethodBeat.i(84449);
    if (this.mHaveEglContext)
    {
      this.mEglHelper.finish();
      this.mHaveEglContext = false;
      GLSurfaceView.access$800().releaseEglContextLocked(this);
    }
    AppMethodBeat.o(84449);
  }

  private void stopEglSurfaceLocked()
  {
    AppMethodBeat.i(84448);
    if (this.mHaveEglSurface)
    {
      this.mHaveEglSurface = false;
      this.mEglHelper.destroySurface();
    }
    AppMethodBeat.o(84448);
  }

  public boolean ableToDraw()
  {
    AppMethodBeat.i(84451);
    boolean bool;
    if ((this.mHaveEglContext) && (this.mHaveEglSurface) && (readyToDraw()))
    {
      bool = true;
      AppMethodBeat.o(84451);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84451);
    }
  }

  public int getRenderMode()
  {
    AppMethodBeat.i(84453);
    synchronized (GLSurfaceView.access$800())
    {
      int i = this.mRenderMode;
      AppMethodBeat.o(84453);
      return i;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(84458);
    synchronized (GLSurfaceView.access$800())
    {
      this.mRequestPaused = true;
      GLSurfaceView.access$800().notifyAll();
      while (true)
        if (!this.mExited)
        {
          boolean bool = this.mPaused;
          if (!bool)
            try
            {
              GLSurfaceView.access$800().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(84458);
  }

  public void onResume()
  {
    AppMethodBeat.i(84459);
    synchronized (GLSurfaceView.access$800())
    {
      this.mRequestPaused = false;
      this.mRequestRender = true;
      this.mRenderComplete = false;
      GLSurfaceView.access$800().notifyAll();
      while (true)
        if ((!this.mExited) && (this.mPaused))
        {
          boolean bool = this.mRenderComplete;
          if (!bool)
            try
            {
              GLSurfaceView.access$800().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(84459);
  }

  public void onWindowResize(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84460);
    while (true)
    {
      synchronized (GLSurfaceView.access$800())
      {
        this.mWidth = paramInt1;
        this.mHeight = paramInt2;
        this.mSizeChanged = true;
        this.mRequestRender = true;
        this.mRenderComplete = false;
        if (Thread.currentThread() == this)
        {
          AppMethodBeat.o(84460);
          return;
        }
        GLSurfaceView.access$800().notifyAll();
        if ((!this.mExited) && (!this.mPaused) && (!this.mRenderComplete))
        {
          boolean bool = ableToDraw();
          if (bool)
            try
            {
              GLSurfaceView.access$800().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
      }
      AppMethodBeat.o(84460);
    }
  }

  public void queueEvent(Runnable paramRunnable)
  {
    AppMethodBeat.i(84463);
    if (paramRunnable == null)
    {
      paramRunnable = new IllegalArgumentException("r must not be null");
      AppMethodBeat.o(84463);
      throw paramRunnable;
    }
    synchronized (GLSurfaceView.access$800())
    {
      this.mEventQueue.add(paramRunnable);
      GLSurfaceView.access$800().notifyAll();
      AppMethodBeat.o(84463);
      return;
    }
  }

  public void requestExitAndWait()
  {
    AppMethodBeat.i(84461);
    synchronized (GLSurfaceView.access$800())
    {
      this.mShouldExit = true;
      GLSurfaceView.access$800().notifyAll();
      while (true)
      {
        boolean bool = this.mExited;
        if (!bool)
          try
          {
            GLSurfaceView.access$800().wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
          }
      }
    }
    AppMethodBeat.o(84461);
  }

  public void requestReleaseEglContextLocked()
  {
    AppMethodBeat.i(84462);
    this.mShouldReleaseEglContext = true;
    GLSurfaceView.access$800().notifyAll();
    AppMethodBeat.o(84462);
  }

  public void requestRender()
  {
    AppMethodBeat.i(84454);
    synchronized (GLSurfaceView.access$800())
    {
      this.mRequestRender = true;
      GLSurfaceView.access$800().notifyAll();
      AppMethodBeat.o(84454);
      return;
    }
  }

  public void requestRenderAndNotify(Runnable paramRunnable)
  {
    AppMethodBeat.i(84455);
    synchronized (GLSurfaceView.access$800())
    {
      if (Thread.currentThread() == this)
      {
        AppMethodBeat.o(84455);
        return;
      }
      this.mWantRenderNotification = true;
      this.mRequestRender = true;
      this.mRenderComplete = false;
      this.mFinishDrawingRunnable = paramRunnable;
      GLSurfaceView.access$800().notifyAll();
      AppMethodBeat.o(84455);
    }
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc_w 260
    //   3: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: new 262	java/lang/StringBuilder
    //   10: dup
    //   11: ldc_w 264
    //   14: invokespecial 265	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: aload_0
    //   18: invokevirtual 269	com/tencent/ttpic/view/GLSurfaceView$GLThread:getId	()J
    //   21: invokevirtual 273	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   24: invokevirtual 277	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: invokevirtual 280	com/tencent/ttpic/view/GLSurfaceView$GLThread:setName	(Ljava/lang/String;)V
    //   30: aload_0
    //   31: invokespecial 282	com/tencent/ttpic/view/GLSurfaceView$GLThread:guardedRun	()V
    //   34: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   37: aload_0
    //   38: invokevirtual 285	com/tencent/ttpic/view/GLSurfaceView$GLThreadManager:threadExiting	(Lcom/tencent/ttpic/view/GLSurfaceView$GLThread;)V
    //   41: ldc_w 260
    //   44: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: return
    //   48: astore_1
    //   49: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   52: aload_0
    //   53: invokevirtual 285	com/tencent/ttpic/view/GLSurfaceView$GLThreadManager:threadExiting	(Lcom/tencent/ttpic/view/GLSurfaceView$GLThread;)V
    //   56: ldc_w 260
    //   59: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: goto -15 -> 47
    //   65: astore_1
    //   66: invokestatic 98	com/tencent/ttpic/view/GLSurfaceView:access$800	()Lcom/tencent/ttpic/view/GLSurfaceView$GLThreadManager;
    //   69: aload_0
    //   70: invokevirtual 285	com/tencent/ttpic/view/GLSurfaceView$GLThreadManager:threadExiting	(Lcom/tencent/ttpic/view/GLSurfaceView$GLThread;)V
    //   73: ldc_w 260
    //   76: invokestatic 73	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   79: aload_1
    //   80: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   30	34	48	java/lang/InterruptedException
    //   30	34	65	finally
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(84452);
    if ((paramInt < 0) || (paramInt > 1))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("renderMode");
      AppMethodBeat.o(84452);
      throw localIllegalArgumentException;
    }
    synchronized (GLSurfaceView.access$800())
    {
      this.mRenderMode = paramInt;
      GLSurfaceView.access$800().notifyAll();
      AppMethodBeat.o(84452);
      return;
    }
  }

  public void surfaceCreated()
  {
    AppMethodBeat.i(84456);
    synchronized (GLSurfaceView.access$800())
    {
      this.mHasSurface = true;
      this.mFinishedCreatingEglSurface = false;
      GLSurfaceView.access$800().notifyAll();
      while (true)
        if ((this.mWaitingForSurface) && (!this.mFinishedCreatingEglSurface))
        {
          boolean bool = this.mExited;
          if (!bool)
            try
            {
              GLSurfaceView.access$800().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(84456);
  }

  public void surfaceDestroyed()
  {
    AppMethodBeat.i(84457);
    synchronized (GLSurfaceView.access$800())
    {
      this.mHasSurface = false;
      GLSurfaceView.access$800().notifyAll();
      while (true)
        if (!this.mWaitingForSurface)
        {
          boolean bool = this.mExited;
          if (!bool)
            try
            {
              GLSurfaceView.access$800().wait();
            }
            catch (InterruptedException localInterruptedException)
            {
              Thread.currentThread().interrupt();
            }
        }
    }
    AppMethodBeat.o(84457);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.view.GLSurfaceView.GLThread
 * JD-Core Version:    0.6.2
 */