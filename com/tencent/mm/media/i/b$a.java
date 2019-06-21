package com.tencent.mm.media.i;

import a.f.b.j;
import a.l;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/util/GLEnvironmentUtil$Companion;", "", "()V", "CUBE_PROTRAIT", "", "EGL_RECORDABLE_ANDROID", "", "TAG", "", "TEXTURE_COORD", "TEXTURE_COORD_VERTICAL_FLIP", "commonEGLAttributeList", "", "commonEGLAttributeListWithMSAA", "bindContextAndSurface", "Lcom/tencent/mm/media/util/GLEnvironmentUtil$EGLEnvironment;", "eglContext", "Landroid/opengl/EGLContext;", "surface", "width", "height", "bindFrameBuffer", "", "fbo", "texture", "bindRenderBuffer", "buffer", "checkEglError", "", "msg", "tag", "checkGLError", "chooseConfig", "Ljavax/microedition/khronos/egl/EGLConfig;", "eGL", "Ljavax/microedition/khronos/egl/EGL10;", "eGLDisplay", "Ljavax/microedition/khronos/egl/EGLDisplay;", "redSize", "greenSize", "blueSize", "alphaSize", "withSample", "chooseConfigEGL14", "Landroid/opengl/EGLConfig;", "Landroid/opengl/EGLDisplay;", "clearGL", "drawBitmapToTexture", "bitmap", "Landroid/graphics/Bitmap;", "eglSetupBySurface", "mSurface", "Landroid/view/Surface;", "genFrameBuffer", "genRenderBuffer", "genTexture", "genTextureExternal", "loadShader", "shaderSource", "type", "loadShaderProgram", "vertexShaderSource", "fragmentShaderSource", "release", "eglSurface", "Landroid/opengl/EGLSurface;", "eglDisplay", "eglEnvironment", "swapBuffers", "plugin-mediaeditor_release"})
public final class b$a
{
  private static int M(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(13115);
    j.p(paramString, "shaderSource");
    int[] arrayOfInt = new int[1];
    paramInt = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(paramInt, paramString);
    GLES20.glCompileShader(paramInt);
    GLES20.glGetShaderiv(paramInt, 35713, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      ab.e("MicroMsg.GLEnvironmentUtil", "loadShader error, infoLog: %s", new Object[] { GLES20.glGetShaderInfoLog(paramInt) });
      AppMethodBeat.o(13115);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(13115);
    }
  }

  public static int U(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(13116);
    j.p(paramString1, "vertexShaderSource");
    j.p(paramString2, "fragmentShaderSource");
    int[] arrayOfInt = new int[1];
    int j = M(paramString1, 35633);
    if (j == 0)
    {
      ab.e("MicroMsg.GLEnvironmentUtil", "load vertex shader failed");
      AppMethodBeat.o(13116);
    }
    while (true)
    {
      return i;
      int k = M(paramString2, 35632);
      if (k == 0)
      {
        ab.e("MicroMsg.GLEnvironmentUtil", "load fragment shader failed");
        AppMethodBeat.o(13116);
      }
      else
      {
        int m = GLES20.glCreateProgram();
        GLES20.glAttachShader(m, j);
        GLES20.glAttachShader(m, k);
        GLES20.glLinkProgram(m);
        GLES20.glGetProgramiv(m, 35714, arrayOfInt, 0);
        if (arrayOfInt[0] <= 0)
        {
          ab.e("MicroMsg.GLEnvironmentUtil", "link program failed");
          AppMethodBeat.o(13116);
        }
        else
        {
          GLES20.glDeleteShader(j);
          GLES20.glDeleteShader(k);
          AppMethodBeat.o(13116);
          i = m;
        }
      }
    }
  }

  private static boolean V(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(13121);
    j.p(paramString1, "msg");
    j.p(paramString2, "tag");
    int i = EGL14.eglGetError();
    if (i != 12288)
    {
      ab.c(paramString2, paramString1 + ": EGL error: 0x" + Integer.toHexString(i), new Object[0]);
      bool = true;
      AppMethodBeat.o(13121);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(13121);
    }
  }

  public static int Vh()
  {
    AppMethodBeat.i(13114);
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    GLES20.glBindTexture(3553, arrayOfInt[0]);
    GLES20.glTexParameteri(3553, 10241, 9729);
    GLES20.glTexParameteri(3553, 10240, 9728);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glBindTexture(3553, 0);
    ma("genTexture");
    int i = arrayOfInt[0];
    AppMethodBeat.o(13114);
    return i;
  }

  public static int Vi()
  {
    int i = 0;
    AppMethodBeat.i(13117);
    int[] arrayOfInt = new int[1];
    GLES20.glGenFramebuffers(1, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      ab.e("MicroMsg.GLEnvironmentUtil", "gen frame buffer error");
      AppMethodBeat.o(13117);
    }
    while (true)
    {
      return i;
      i = arrayOfInt[0];
      AppMethodBeat.o(13117);
    }
  }

  public static void Vj()
  {
    AppMethodBeat.i(13118);
    GLES20.glClear(19798);
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    GLES20.glBindFramebuffer(36160, 0);
    AppMethodBeat.o(13118);
  }

  public static b.b a(EGLContext paramEGLContext, Object paramObject, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13124);
    j.p(paramEGLContext, "eglContext");
    ab.i("MicroMsg.GLEnvironmentUtil", "bindContextAndSurface");
    if ((paramObject != null) && (!(paramObject instanceof Surface)) && (!(paramObject instanceof SurfaceHolder)))
    {
      paramEGLContext = (Throwable)new IllegalArgumentException("unsupported surface");
      AppMethodBeat.o(13124);
      throw paramEGLContext;
    }
    EGLDisplay localEGLDisplay = EGL14.eglGetDisplay(0);
    if (localEGLDisplay == EGL14.EGL_NO_DISPLAY)
    {
      paramEGLContext = (Throwable)new RuntimeException("unable to get EGL14 display");
      AppMethodBeat.o(13124);
      throw paramEGLContext;
    }
    Object localObject = new int[2];
    if (!EGL14.eglInitialize(localEGLDisplay, (int[])localObject, 0, (int[])localObject, 1))
    {
      paramEGLContext = (Throwable)new RuntimeException("eglInitialize failed");
      AppMethodBeat.o(13124);
      throw paramEGLContext;
    }
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
    localObject = new int[1];
    EGL14.eglChooseConfig(localEGLDisplay, b.Vg(), 0, arrayOfEGLConfig, 0, 1, (int[])localObject, 0);
    if (arrayOfEGLConfig[0] == null)
    {
      paramEGLContext = (Throwable)new RuntimeException("chooseConfig failed");
      AppMethodBeat.o(13124);
      throw paramEGLContext;
    }
    localObject = EGL14.eglCreateContext(localEGLDisplay, arrayOfEGLConfig[0], paramEGLContext, new int[] { 12440, 2, 12344 }, 0);
    if (j.j(localObject, EGL14.EGL_NO_CONTEXT))
    {
      paramEGLContext = (Throwable)new RuntimeException("EGL error " + EGL14.eglGetError());
      AppMethodBeat.o(13124);
      throw paramEGLContext;
    }
    lZ("eglCreateContext");
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      paramEGLContext = new int[5];
      paramEGLContext[0] = 12375;
      paramEGLContext[1] = paramInt1;
      paramEGLContext[2] = 12374;
      paramEGLContext[3] = paramInt2;
      paramEGLContext[4] = 12344;
    }
    while (true)
    {
      if (paramObject != null);
      try
      {
        for (paramEGLContext = EGL14.eglCreateWindowSurface(localEGLDisplay, arrayOfEGLConfig[0], paramObject, paramEGLContext, 0); ; paramEGLContext = EGL14.eglCreatePbufferSurface(localEGLDisplay, arrayOfEGLConfig[0], paramEGLContext, 0))
        {
          if (paramObject == null)
            break label504;
          lZ("eglCreateWindowSurface");
          if (((paramEGLContext == null) || (paramEGLContext == EGL14.EGL_NO_SURFACE)) && (EGL14.eglGetError() == 12299))
            ab.e("MicroMsg.GLEnvironmentUtil", "makeMyEGLCurrentSurface:returned EGL_BAD_NATIVE_WINDOW.");
          if (!EGL14.eglMakeCurrent(localEGLDisplay, paramEGLContext, paramEGLContext, (EGLContext)localObject))
            ab.w("MicroMsg.GLEnvironmentUtil", "eglMakeCurrent:" + EGL14.eglGetError());
          j.o(localEGLDisplay, "eglDisplay");
          if (paramEGLContext == null)
            j.dWJ();
          j.o(localObject, "outputEGLContext");
          paramEGLContext = new b.b(localEGLDisplay, paramEGLContext, (EGLContext)localObject);
          AppMethodBeat.o(13124);
          return paramEGLContext;
          paramEGLContext = new int[1];
          paramEGLContext[0] = 12344;
          break;
        }
      }
      catch (IllegalArgumentException paramEGLContext)
      {
        while (true)
        {
          ab.e("MicroMsg.GLEnvironmentUtil", "eglCreateWindowSurface", new Object[] { paramEGLContext });
          paramEGLContext = null;
          continue;
          label504: lZ("eglCreatePbufferSurface");
        }
      }
    }
  }

  public static boolean a(EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface)
  {
    AppMethodBeat.i(13120);
    boolean bool;
    if ((paramEGLDisplay == null) || (paramEGLSurface == null))
    {
      bool = false;
      AppMethodBeat.o(13120);
    }
    while (true)
    {
      return bool;
      bool = EGL14.eglSwapBuffers(paramEGLDisplay, paramEGLSurface);
      lZ("eglSwapBuffers");
      AppMethodBeat.o(13120);
    }
  }

  public static b.b b(Surface paramSurface, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13119);
    ab.i("MicroMsg.GLEnvironmentUtil", "eglSetupBySurface");
    EGLDisplay localEGLDisplay = EGL14.eglGetDisplay(0);
    if (localEGLDisplay == EGL14.EGL_NO_DISPLAY)
    {
      paramSurface = (Throwable)new RuntimeException("unable to get EGL14 display");
      AppMethodBeat.o(13119);
      throw paramSurface;
    }
    Object localObject = new int[2];
    if (!EGL14.eglInitialize(localEGLDisplay, (int[])localObject, 0, (int[])localObject, 1))
    {
      paramSurface = (Throwable)new RuntimeException("unable to initialize EGL14");
      AppMethodBeat.o(13119);
      throw paramSurface;
    }
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[1];
    localObject = new int[1];
    EGL14.eglChooseConfig(localEGLDisplay, b.Vg(), 0, arrayOfEGLConfig, 0, 1, (int[])localObject, 0);
    lZ("eglCreateContext RGB888+recordable ES2");
    EGLContext localEGLContext = EGL14.eglCreateContext(localEGLDisplay, arrayOfEGLConfig[0], EGL14.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 }, 0);
    lZ("eglCreateContext");
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      localObject = new int[5];
      localObject[0] = 12375;
      localObject[1] = paramInt1;
      localObject[2] = 12374;
      localObject[3] = paramInt2;
      localObject[4] = 12344;
      if (paramSurface == null)
        break label312;
      localObject = EGL14.eglCreateWindowSurface(localEGLDisplay, arrayOfEGLConfig[0], paramSurface, (int[])localObject, 0);
      label224: if (paramSurface == null)
        break label328;
      lZ("eglCreateWindowSurface");
    }
    while (true)
    {
      EGL14.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject, (EGLSurface)localObject, localEGLContext);
      lZ("eglMakeCurrent");
      j.o(localEGLDisplay, "mEGLDisplay");
      j.o(localObject, "mEGLSurface");
      j.o(localEGLContext, "mEGLContext");
      paramSurface = new b.b(localEGLDisplay, (EGLSurface)localObject, localEGLContext);
      AppMethodBeat.o(13119);
      return paramSurface;
      localObject = new int[1];
      localObject[0] = 12344;
      break;
      label312: localObject = EGL14.eglCreatePbufferSurface(localEGLDisplay, arrayOfEGLConfig[0], (int[])localObject, 0);
      break label224;
      label328: lZ("eglCreatePbufferSurface");
    }
  }

  public static void ma(String paramString)
  {
    AppMethodBeat.i(13123);
    int i = GLES20.glGetError();
    if (i != 0)
      ab.c("MicroMsg.GLEnvironmentUtil", paramString + ": GL error: 0x" + Integer.toHexString(i), new Object[0]);
    AppMethodBeat.o(13123);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.i.b.a
 * JD-Core Version:    0.6.2
 */