package com.tencent.ttpic.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

class GLSurfaceView$ComponentSizeChooser extends GLSurfaceView.BaseConfigChooser
{
  protected int mAlphaSize;
  protected int mBlueSize;
  protected int mDepthSize;
  protected int mGreenSize;
  protected int mRedSize;
  protected int mStencilSize;
  private int[] mValue;

  public GLSurfaceView$ComponentSizeChooser(GLSurfaceView paramGLSurfaceView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramGLSurfaceView, new int[] { 12324, paramInt1, 12323, paramInt2, 12322, paramInt3, 12321, paramInt4, 12325, paramInt5, 12326, paramInt6, 12344 });
    AppMethodBeat.i(84428);
    this.mValue = new int[1];
    this.mRedSize = paramInt1;
    this.mGreenSize = paramInt2;
    this.mBlueSize = paramInt3;
    this.mAlphaSize = paramInt4;
    this.mDepthSize = paramInt5;
    this.mStencilSize = paramInt6;
    AppMethodBeat.o(84428);
  }

  private int findConfigAttrib(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84430);
    if (paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt1, this.mValue))
    {
      paramInt2 = this.mValue[0];
      AppMethodBeat.o(84430);
    }
    while (true)
    {
      return paramInt2;
      AppMethodBeat.o(84430);
    }
  }

  public EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    AppMethodBeat.i(84429);
    int i = paramArrayOfEGLConfig.length;
    int j = 0;
    if (j < i)
    {
      EGLConfig localEGLConfig = paramArrayOfEGLConfig[j];
      int k = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12325, 0);
      int m = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12326, 0);
      if ((k >= this.mDepthSize) && (m >= this.mStencilSize))
      {
        k = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12324, 0);
        int n = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12323, 0);
        m = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12322, 0);
        int i1 = findConfigAttrib(paramEGL10, paramEGLDisplay, localEGLConfig, 12321, 0);
        if ((k == this.mRedSize) && (n == this.mGreenSize) && (m == this.mBlueSize) && (i1 == this.mAlphaSize))
        {
          AppMethodBeat.o(84429);
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
      AppMethodBeat.o(84429);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.view.GLSurfaceView.ComponentSizeChooser
 * JD-Core Version:    0.6.2
 */