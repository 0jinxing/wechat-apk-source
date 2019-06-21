package com.tencent.map.lib.gl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

class e$b extends e.a
{
  protected int c;
  protected int d;
  protected int e;
  protected int f;
  protected int g;
  protected int h;
  private int[] j;

  public e$b(e parame, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(parame, new int[] { 12324, paramInt1, 12323, paramInt2, 12322, paramInt3, 12321, paramInt4, 12325, paramInt5, 12326, paramInt6, 12344 });
    AppMethodBeat.i(98057);
    this.j = new int[1];
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
    this.g = paramInt5;
    this.h = paramInt6;
    AppMethodBeat.o(98057);
  }

  private int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(98059);
    if (paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt1, this.j))
    {
      paramInt2 = this.j[0];
      AppMethodBeat.o(98059);
    }
    while (true)
    {
      return paramInt2;
      AppMethodBeat.o(98059);
    }
  }

  public EGLConfig a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    AppMethodBeat.i(98058);
    int k = paramArrayOfEGLConfig.length;
    int m = 0;
    if (m < k)
    {
      EGLConfig localEGLConfig = paramArrayOfEGLConfig[m];
      int n = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12325, 0);
      int i1 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12326, 0);
      if ((n >= this.g) && (i1 >= this.h))
      {
        n = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12324, 0);
        int i2 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12323, 0);
        i1 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12322, 0);
        int i3 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12321, 0);
        if ((n == this.c) && (i2 == this.d) && (i1 == this.e) && (i3 == this.f))
        {
          AppMethodBeat.o(98058);
          paramEGL10 = localEGLConfig;
        }
      }
    }
    while (true)
    {
      return paramEGL10;
      m++;
      break;
      paramEGL10 = null;
      AppMethodBeat.o(98058);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.e.b
 * JD-Core Version:    0.6.2
 */