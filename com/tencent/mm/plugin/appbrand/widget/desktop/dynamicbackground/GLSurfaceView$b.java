package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

class GLSurfaceView$b extends GLSurfaceView.a
{
  protected int mAlphaSize;
  protected int mBlueSize;
  protected int mDepthSize;
  protected int mGreenSize;
  protected int mRedSize;
  protected int mStencilSize;
  private int[] mValue;

  public GLSurfaceView$b(GLSurfaceView paramGLSurfaceView, int paramInt)
  {
    super(paramGLSurfaceView, new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, paramInt, 12326, 0, 12344 });
    AppMethodBeat.i(133974);
    this.mValue = new int[1];
    this.mRedSize = 8;
    this.mGreenSize = 8;
    this.mBlueSize = 8;
    this.mAlphaSize = 0;
    this.mDepthSize = paramInt;
    this.mStencilSize = 0;
    AppMethodBeat.o(133974);
  }

  private int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(133976);
    if (paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt, this.mValue))
    {
      paramInt = this.mValue[0];
      AppMethodBeat.o(133976);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(133976);
      paramInt = i;
    }
  }

  public final EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    AppMethodBeat.i(133975);
    int i = paramArrayOfEGLConfig.length;
    int j = 0;
    if (j < i)
    {
      EGLConfig localEGLConfig = paramArrayOfEGLConfig[j];
      int k = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12325);
      int m = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12326);
      if ((k >= this.mDepthSize) && (m >= this.mStencilSize))
      {
        m = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12324);
        int n = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12323);
        int i1 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12322);
        k = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12321);
        if ((m == this.mRedSize) && (n == this.mGreenSize) && (i1 == this.mBlueSize) && (k == this.mAlphaSize))
        {
          AppMethodBeat.o(133975);
          paramEGL10 = localEGLConfig;
        }
      }
    }
    while (true)
    {
      return paramEGL10;
      j++;
      break;
      paramEGL10 = null;
      AppMethodBeat.o(133975);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GLSurfaceView.b
 * JD-Core Version:    0.6.2
 */