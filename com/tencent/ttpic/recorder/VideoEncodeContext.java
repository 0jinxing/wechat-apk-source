package com.tencent.ttpic.recorder;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.util.i;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class VideoEncodeContext
{
  static final boolean LIST_CONFIGS = false;
  static final String TAG;
  EGL10 mEGL;
  EGLConfig mEGLConfig;
  EGLConfig[] mEGLConfigs;
  EGLContext mEGLContext;
  EGLDisplay mEGLDisplay;
  EGLSurface mEGLSurface;

  static
  {
    AppMethodBeat.i(83726);
    TAG = VideoEncodeContext.class.getSimpleName();
    AppMethodBeat.o(83726);
  }

  public VideoEncodeContext()
  {
    AppMethodBeat.i(83720);
    int[] arrayOfInt = new int[2];
    this.mEGL = ((EGL10)EGLContext.getEGL());
    this.mEGLDisplay = this.mEGL.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    this.mEGL.eglInitialize(this.mEGLDisplay, arrayOfInt);
    this.mEGLConfig = chooseConfig();
    if (this.mEGLConfig != null)
    {
      this.mEGLContext = this.mEGL.eglCreateContext(this.mEGLDisplay, this.mEGLConfig, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
      this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[] { 12375, 100, 12374, 100, 12344 });
    }
    AppMethodBeat.o(83720);
  }

  private EGLConfig chooseConfig()
  {
    EGLConfig localEGLConfig = null;
    AppMethodBeat.i(83722);
    int[] arrayOfInt1 = new int[15];
    int[] tmp13_12 = arrayOfInt1;
    tmp13_12[0] = 12325;
    int[] tmp19_13 = tmp13_12;
    tmp19_13[1] = 0;
    int[] tmp23_19 = tmp19_13;
    tmp23_19[2] = 12326;
    int[] tmp29_23 = tmp23_19;
    tmp29_23[3] = 0;
    int[] tmp33_29 = tmp29_23;
    tmp33_29[4] = 12324;
    int[] tmp39_33 = tmp33_29;
    tmp39_33[5] = 8;
    int[] tmp44_39 = tmp39_33;
    tmp44_39[6] = 12323;
    int[] tmp51_44 = tmp44_39;
    tmp51_44[7] = 8;
    int[] tmp57_51 = tmp51_44;
    tmp57_51[8] = 12322;
    int[] tmp64_57 = tmp57_51;
    tmp64_57[9] = 8;
    int[] tmp70_64 = tmp64_57;
    tmp70_64[10] = 12321;
    int[] tmp77_70 = tmp70_64;
    tmp77_70[11] = 8;
    int[] tmp83_77 = tmp77_70;
    tmp83_77[12] = 12352;
    int[] tmp90_83 = tmp83_77;
    tmp90_83[13] = 4;
    int[] tmp95_90 = tmp90_83;
    tmp95_90[14] = 12344;
    tmp95_90;
    int[] arrayOfInt2 = new int[1];
    this.mEGL.eglChooseConfig(this.mEGLDisplay, arrayOfInt1, null, 0, arrayOfInt2);
    int i = arrayOfInt2[0];
    if (i > 0)
    {
      this.mEGLConfigs = new EGLConfig[i];
      this.mEGL.eglChooseConfig(this.mEGLDisplay, arrayOfInt1, this.mEGLConfigs, i, arrayOfInt2);
      localEGLConfig = this.mEGLConfigs[0];
      AppMethodBeat.o(83722);
    }
    while (true)
    {
      return localEGLConfig;
      AppMethodBeat.o(83722);
    }
  }

  private int getConfigAttrib(EGLConfig paramEGLConfig, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(83724);
    int[] arrayOfInt = new int[1];
    if (this.mEGL.eglGetConfigAttrib(this.mEGLDisplay, paramEGLConfig, paramInt, arrayOfInt))
    {
      paramInt = arrayOfInt[0];
      AppMethodBeat.o(83724);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(83724);
      paramInt = i;
    }
  }

  private void listConfig()
  {
    AppMethodBeat.i(83723);
    i.j(TAG, "Config List {");
    for (EGLConfig localEGLConfig : this.mEGLConfigs)
    {
      int k = getConfigAttrib(localEGLConfig, 12325);
      int m = getConfigAttrib(localEGLConfig, 12326);
      int n = getConfigAttrib(localEGLConfig, 12324);
      int i1 = getConfigAttrib(localEGLConfig, 12323);
      int i2 = getConfigAttrib(localEGLConfig, 12322);
      int i3 = getConfigAttrib(localEGLConfig, 12321);
      i.j(TAG, "    <d,s,r,g,b,a> = <" + k + "," + m + "," + n + "," + i1 + "," + i2 + "," + i3 + ">");
    }
    i.j(TAG, "}");
    AppMethodBeat.o(83723);
  }

  public void destroyEgl()
  {
    AppMethodBeat.i(83721);
    EGL10 localEGL10 = this.mEGL;
    EGLDisplay localEGLDisplay = this.mEGLDisplay;
    EGLSurface localEGLSurface = EGL10.EGL_NO_SURFACE;
    localEGL10.eglMakeCurrent(localEGLDisplay, localEGLSurface, localEGLSurface, EGL10.EGL_NO_CONTEXT);
    if (this.mEGLConfig != null)
    {
      this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface);
      this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
    }
    this.mEGL.eglTerminate(this.mEGLDisplay);
    AppMethodBeat.o(83721);
  }

  public boolean usecurruntContext()
  {
    AppMethodBeat.i(83725);
    boolean bool;
    if (this.mEGLConfig == null)
    {
      bool = false;
      AppMethodBeat.o(83725);
    }
    while (true)
    {
      return bool;
      bool = this.mEGL.eglMakeCurrent(this.mEGLDisplay, this.mEGLSurface, this.mEGLSurface, this.mEGLContext);
      AppMethodBeat.o(83725);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.recorder.VideoEncodeContext
 * JD-Core Version:    0.6.2
 */