package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

final class GameGLSurfaceView$k
{
  private static String TAG = "GLThreadManager";

  // ERROR //
  public final void f(GameGLSurfaceView.j paramj)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 26
    //   4: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 34	java/lang/StringBuilder
    //   10: astore_2
    //   11: aload_2
    //   12: ldc 36
    //   14: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   17: ldc 41
    //   19: aload_2
    //   20: aload_1
    //   21: invokevirtual 47	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j:getId	()J
    //   24: invokevirtual 51	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   27: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: iconst_0
    //   31: anewarray 4	java/lang/Object
    //   34: invokestatic 60	com/tencent/magicbrush/a/c$c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   37: aload_1
    //   38: invokestatic 64	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j:a	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j;)Ljava/lang/ref/WeakReference;
    //   41: invokevirtual 70	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   44: checkcast 6	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView
    //   47: astore_2
    //   48: aload_2
    //   49: ifnull +198 -> 247
    //   52: aload_2
    //   53: invokestatic 74	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView:g	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView;)Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$n;
    //   56: invokeinterface 79 1 0
    //   61: aload_1
    //   62: invokestatic 83	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j:b	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j;)Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i;
    //   65: astore_3
    //   66: new 34	java/lang/StringBuilder
    //   69: astore 4
    //   71: aload 4
    //   73: ldc 85
    //   75: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   78: ldc 41
    //   80: aload 4
    //   82: invokestatic 91	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   85: invokevirtual 92	java/lang/Thread:getId	()J
    //   88: invokevirtual 51	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   91: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   94: iconst_0
    //   95: anewarray 4	java/lang/Object
    //   98: invokestatic 95	com/tencent/magicbrush/a/c$c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload_3
    //   102: invokevirtual 100	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:destroySurfaceImp	()V
    //   105: aload_1
    //   106: invokestatic 103	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j:c	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j;)V
    //   109: aload_1
    //   110: invokestatic 106	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j:d	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j;)V
    //   113: aload_1
    //   114: invokestatic 83	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j:b	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j;)Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i;
    //   117: astore_3
    //   118: new 34	java/lang/StringBuilder
    //   121: astore 4
    //   123: aload 4
    //   125: ldc 108
    //   127: invokespecial 39	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   130: ldc 41
    //   132: aload 4
    //   134: invokestatic 91	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   137: invokevirtual 92	java/lang/Thread:getId	()J
    //   140: invokevirtual 51	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   143: invokevirtual 55	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   146: iconst_0
    //   147: anewarray 4	java/lang/Object
    //   150: invokestatic 95	com/tencent/magicbrush/a/c$c:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: aload_3
    //   154: getfield 112	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mEglContext	Ljavax/microedition/khronos/egl/EGLContext;
    //   157: ifnull +47 -> 204
    //   160: aload_3
    //   161: getfield 116	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mGLSurfaceViewWeakRef	Ljava/lang/ref/WeakReference;
    //   164: invokevirtual 70	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   167: checkcast 6	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView
    //   170: astore 4
    //   172: aload 4
    //   174: ifnull +25 -> 199
    //   177: aload 4
    //   179: invokestatic 119	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView:c	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView;)Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$f;
    //   182: aload_3
    //   183: getfield 123	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mEgl	Ljavax/microedition/khronos/egl/EGL10;
    //   186: aload_3
    //   187: getfield 127	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mEglDisplay	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   190: aload_3
    //   191: getfield 112	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mEglContext	Ljavax/microedition/khronos/egl/EGLContext;
    //   194: invokeinterface 133 4 0
    //   199: aload_3
    //   200: aconst_null
    //   201: putfield 112	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mEglContext	Ljavax/microedition/khronos/egl/EGLContext;
    //   204: aload_3
    //   205: getfield 127	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mEglDisplay	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   208: ifnull +22 -> 230
    //   211: aload_3
    //   212: getfield 123	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mEgl	Ljavax/microedition/khronos/egl/EGL10;
    //   215: aload_3
    //   216: getfield 127	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mEglDisplay	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   219: invokeinterface 139 2 0
    //   224: pop
    //   225: aload_3
    //   226: aconst_null
    //   227: putfield 127	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$i:mEglDisplay	Ljavax/microedition/khronos/egl/EGLDisplay;
    //   230: aload_1
    //   231: invokestatic 143	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j:e	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$j;)Z
    //   234: pop
    //   235: aload_0
    //   236: invokevirtual 146	java/lang/Object:notifyAll	()V
    //   239: ldc 26
    //   241: invokestatic 149	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: aload_0
    //   245: monitorexit
    //   246: return
    //   247: ldc 41
    //   249: ldc 151
    //   251: iconst_0
    //   252: anewarray 4	java/lang/Object
    //   255: invokestatic 60	com/tencent/magicbrush/a/c$c:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   258: goto -197 -> 61
    //   261: astore_1
    //   262: aload_0
    //   263: monitorexit
    //   264: aload_1
    //   265: athrow
    //   266: astore_3
    //   267: getstatic 15	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$k:TAG	Ljava/lang/String;
    //   270: ldc 153
    //   272: iconst_1
    //   273: anewarray 4	java/lang/Object
    //   276: dup
    //   277: iconst_0
    //   278: aload_3
    //   279: invokestatic 159	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   282: aastore
    //   283: invokestatic 161	com/tencent/magicbrush/a/c$c:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   286: aload_2
    //   287: ifnull -57 -> 230
    //   290: aload_2
    //   291: invokestatic 74	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView:g	(Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView;)Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView$n;
    //   294: invokeinterface 164 1 0
    //   299: goto -69 -> 230
    //
    // Exception table:
    //   from	to	target	type
    //   2	48	261	finally
    //   52	61	261	finally
    //   61	113	261	finally
    //   113	172	261	finally
    //   177	199	261	finally
    //   199	204	261	finally
    //   204	230	261	finally
    //   230	244	261	finally
    //   247	258	261	finally
    //   267	286	261	finally
    //   290	299	261	finally
    //   113	172	266	java/lang/Throwable
    //   177	199	266	java/lang/Throwable
    //   199	204	266	java/lang/Throwable
    //   204	230	266	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView.k
 * JD-Core Version:    0.6.2
 */