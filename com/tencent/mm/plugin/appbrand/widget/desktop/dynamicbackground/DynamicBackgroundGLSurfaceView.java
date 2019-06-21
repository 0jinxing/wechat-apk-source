package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundGLSurfaceView;", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GameGLSurfaceView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDelayPauseRunnable", "Ljava/lang/Runnable;", "mRenderer", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundGLSurfaceView$GLRenderer;", "needPause", "", "showGradientView", "onAttachedToWindow", "", "onDetachedFromWindow", "onResume", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "", "release", "setGradientBackgroundView", "gradientColorBackgroundView", "Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/GradientColorBackgroundView;", "setShowGradientView", "show", "surfaceCreated", "holder", "Landroid/view/SurfaceHolder;", "surfaceDestroyed", "Companion", "GLRenderer", "plugin-appbrand-integration_release"})
public final class DynamicBackgroundGLSurfaceView extends GameGLSurfaceView
{
  public static final DynamicBackgroundGLSurfaceView.a iZk;
  private DynamicBackgroundGLSurfaceView.b iZh;
  private boolean iZi;
  private boolean iZj;

  static
  {
    AppMethodBeat.i(135248);
    iZk = new DynamicBackgroundGLSurfaceView.a((byte)0);
    AppMethodBeat.o(135248);
  }

  public DynamicBackgroundGLSurfaceView(Context paramContext, byte paramByte)
  {
    this(paramContext);
  }

  public DynamicBackgroundGLSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(135247);
    setEGLContextClientVersion(2);
    aPV();
    setPreserveEGLContextOnPause(true);
    this.iZh = new DynamicBackgroundGLSurfaceView.b(paramContext);
    setRenderer((GameGLSurfaceView.n)this.iZh);
    getHolder().setFormat(-3);
    paramAttributeSet = this.iZh;
    if (paramAttributeSet != null)
    {
      paramContext = (GameGLSurfaceView)this;
      j.p(paramContext, "surfaceView");
      paramAttributeSet.iZr = paramContext;
      AppMethodBeat.o(135247);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135247);
    }
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(135243);
    super.onAttachedToWindow();
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo onAttachedToWindow");
    AppMethodBeat.o(135243);
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(135240);
    super.onDetachedFromWindow();
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo onDetachedFromWindow");
    AppMethodBeat.o(135240);
  }

  public final void onResume()
  {
    AppMethodBeat.i(135245);
    super.onResume();
    this.iZi = false;
    AppMethodBeat.o(135245);
  }

  protected final void onVisibilityChanged(View paramView, int paramInt)
  {
    AppMethodBeat.i(135244);
    j.p(paramView, "changedView");
    super.onVisibilityChanged(paramView, paramInt);
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo onVisibilityChanged: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 0) && (this.iZi))
    {
      ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo needPause");
      this.iZi = false;
    }
    AppMethodBeat.o(135244);
  }

  public final void setGradientBackgroundView(GradientColorBackgroundView paramGradientColorBackgroundView)
  {
    AppMethodBeat.i(135246);
    j.p(paramGradientColorBackgroundView, "gradientColorBackgroundView");
    DynamicBackgroundGLSurfaceView.b localb = this.iZh;
    if (localb != null)
    {
      j.p(paramGradientColorBackgroundView, "gradientColorBackgroundView");
      localb.iWx = paramGradientColorBackgroundView;
      AppMethodBeat.o(135246);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135246);
    }
  }

  public final void setShowGradientView(boolean paramBoolean)
  {
    this.iZj = paramBoolean;
    DynamicBackgroundGLSurfaceView.b localb = this.iZh;
    if (localb != null)
    {
      localb.iZj = paramBoolean;
      if (!localb.iZj)
        localb.iZq = false;
    }
  }

  public final void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(135242);
    super.surfaceCreated(paramSurfaceHolder);
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo surfaceCreated");
    AppMethodBeat.o(135242);
  }

  public final void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(135241);
    super.surfaceDestroyed(paramSurfaceHolder);
    ab.i("MicroMsg.DynamicBgSurfaceView", "alvinluo surfaceDestroyed");
    paramSurfaceHolder = this.iZh;
    if (paramSurfaceHolder != null)
    {
      paramSurfaceHolder.iZp = false;
      AppMethodBeat.o(135241);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135241);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundGLSurfaceView$GLRenderer$Companion;", "", "()V", "ALPHA_ANIMATION_DURATION", "", "checkBlackScreen", "", "buf", "Ljava/nio/ByteBuffer;", "width", "", "height", "getAlphaAnimation", "loadShader", "type", "shaderCode", "", "saveRgb2Bitmap", "Landroid/graphics/Bitmap;", "Ljava/nio/Buffer;", "filename", "updateAlphaAnimation", "", "duration", "plugin-appbrand-integration_release"})
  public static final class b$a
  {
    // ERROR //
    public static android.graphics.Bitmap a(java.nio.Buffer paramBuffer, java.lang.String paramString)
    {
      // Byte code:
      //   0: ldc 44
      //   2: invokestatic 50	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aload_0
      //   6: ldc 51
      //   8: invokestatic 57	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
      //   11: aload_1
      //   12: ldc 58
      //   14: invokestatic 57	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
      //   17: ldc 60
      //   19: ldc 62
      //   21: aload_1
      //   22: invokestatic 68	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   25: invokevirtual 72	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
      //   28: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
      //   31: new 80	java/io/BufferedOutputStream
      //   34: astore_2
      //   35: new 82	java/io/FileOutputStream
      //   38: astore_3
      //   39: aload_3
      //   40: aload_1
      //   41: invokespecial 85	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
      //   44: aload_2
      //   45: aload_3
      //   46: checkcast 87	java/io/OutputStream
      //   49: invokespecial 90	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   52: sipush 1024
      //   55: sipush 2000
      //   58: getstatic 96	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
      //   61: invokestatic 102	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
      //   64: astore_1
      //   65: aload_1
      //   66: aload_0
      //   67: invokevirtual 106	android/graphics/Bitmap:copyPixelsFromBuffer	(Ljava/nio/Buffer;)V
      //   70: aload_1
      //   71: getstatic 112	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
      //   74: bipush 90
      //   76: aload_2
      //   77: checkcast 87	java/io/OutputStream
      //   80: invokevirtual 116	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
      //   83: pop
      //   84: aload_2
      //   85: invokevirtual 119	java/io/BufferedOutputStream:close	()V
      //   88: ldc 44
      //   90: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   93: aload_1
      //   94: astore_0
      //   95: aload_0
      //   96: areturn
      //   97: astore_0
      //   98: aconst_null
      //   99: astore_2
      //   100: aload_2
      //   101: ifnull +7 -> 108
      //   104: aload_2
      //   105: invokevirtual 119	java/io/BufferedOutputStream:close	()V
      //   108: ldc 44
      //   110: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   113: aconst_null
      //   114: astore_0
      //   115: goto -20 -> 95
      //   118: astore_0
      //   119: aconst_null
      //   120: astore_2
      //   121: aload_2
      //   122: ifnull +7 -> 129
      //   125: aload_2
      //   126: invokevirtual 119	java/io/BufferedOutputStream:close	()V
      //   129: ldc 44
      //   131: invokestatic 122	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   134: aload_0
      //   135: athrow
      //   136: astore_0
      //   137: goto -49 -> 88
      //   140: astore_0
      //   141: goto -33 -> 108
      //   144: astore_1
      //   145: goto -16 -> 129
      //   148: astore_0
      //   149: goto -28 -> 121
      //   152: astore_0
      //   153: goto -53 -> 100
      //
      // Exception table:
      //   from	to	target	type
      //   31	52	97	java/io/IOException
      //   31	52	118	finally
      //   84	88	136	java/io/IOException
      //   104	108	140	java/io/IOException
      //   125	129	144	java/io/IOException
      //   52	84	148	finally
      //   52	84	152	java/io/IOException
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.DynamicBackgroundGLSurfaceView
 * JD-Core Version:    0.6.2
 */