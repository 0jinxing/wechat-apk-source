package com.tencent.mm.media.h.a;

import a.f.b.j;
import a.f.b.y;
import a.l;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/config/RenderConfigChooser;", "Landroid/opengl/GLSurfaceView$EGLConfigChooser;", "mRedSize", "", "mGreenSize", "mBlueSize", "mAlphaSize", "mDepthSize", "mStencilSize", "(IIIIII)V", "EGL_OPENGL_ES2_BIT", "TAG", "", "TAG$1", "getMAlphaSize", "()I", "setMAlphaSize", "(I)V", "getMBlueSize", "setMBlueSize", "getMDepthSize", "setMDepthSize", "getMGreenSize", "setMGreenSize", "getMRedSize", "setMRedSize", "getMStencilSize", "setMStencilSize", "mValue", "", "s_configAttribs2", "chooseConfig", "Ljavax/microedition/khronos/egl/EGLConfig;", "egl", "Ljavax/microedition/khronos/egl/EGL10;", "display", "Ljavax/microedition/khronos/egl/EGLDisplay;", "configs", "", "(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)Ljavax/microedition/khronos/egl/EGLConfig;", "findConfigAttrib", "config", "attribute", "defaultValue", "printConfig", "", "printConfigs", "(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;[Ljavax/microedition/khronos/egl/EGLConfig;)V", "Companion", "plugin-mediaeditor_release"})
public final class a
  implements GLSurfaceView.EGLConfigChooser
{
  private static final String TAG = "GLConfigChooser";
  public static final a.a eZg;
  private final int EGL_OPENGL_ES2_BIT;
  private final String eZe;
  private final int[] eZf;
  private int mAlphaSize;
  private int mBlueSize;
  private int mDepthSize;
  private int mGreenSize;
  private int mRedSize;
  private int mStencilSize;
  private final int[] mValue;

  static
  {
    AppMethodBeat.i(13097);
    eZg = new a.a((byte)0);
    TAG = "GLConfigChooser";
    AppMethodBeat.o(13097);
  }

  public a()
  {
    AppMethodBeat.i(13096);
    this.mRedSize = 5;
    this.mGreenSize = 6;
    this.mBlueSize = 5;
    this.mAlphaSize = 0;
    this.mDepthSize = 0;
    this.mStencilSize = 0;
    this.eZe = "MicroMsg.RenderConfigChooser";
    this.EGL_OPENGL_ES2_BIT = 4;
    this.eZf = new int[] { 12324, 4, 12323, 4, 12322, 4, 12352, this.EGL_OPENGL_ES2_BIT, 12344 };
    this.mValue = new int[1];
    AppMethodBeat.o(13096);
  }

  private final int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(13094);
    if (paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt, this.mValue))
    {
      paramInt = this.mValue[0];
      AppMethodBeat.o(13094);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(13094);
      paramInt = i;
    }
  }

  private final void b(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    AppMethodBeat.i(13095);
    int i = paramArrayOfEGLConfig.length;
    Object localObject1 = this.eZe;
    Object localObject2 = y.AVH;
    localObject2 = String.format("%d configurations", Arrays.copyOf(new Object[] { Integer.valueOf(i) }, 1));
    j.o(localObject2, "java.lang.String.format(format, *args)");
    ab.i((String)localObject1, (String)localObject2);
    for (int j = 0; j < i; j++)
    {
      localObject1 = this.eZe;
      localObject2 = y.AVH;
      localObject2 = String.format("Configuration %d:\n", Arrays.copyOf(new Object[] { Integer.valueOf(j) }, 1));
      j.o(localObject2, "java.lang.String.format(format, *args)");
      ab.i((String)localObject1, (String)localObject2);
      localObject2 = paramArrayOfEGLConfig[j];
      if (localObject2 == null)
        j.dWJ();
      localObject1 = new int[1];
      for (int k = 0; k < 33; k++)
        paramEGL10.eglGetConfigAttrib(paramEGLDisplay, (EGLConfig)localObject2, new int[] { 12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354 }[k], (int[])localObject1);
    }
    AppMethodBeat.o(13095);
  }

  private EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    AppMethodBeat.i(13093);
    j.p(paramEGL10, "egl");
    j.p(paramEGLDisplay, "display");
    j.p(paramArrayOfEGLConfig, "configs");
    int i = paramArrayOfEGLConfig.length;
    int j = 0;
    if (j < i)
    {
      EGLConfig localEGLConfig = paramArrayOfEGLConfig[j];
      if (localEGLConfig == null)
        j.dWJ();
      int k = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12325);
      int m = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12326);
      if ((k < this.mDepthSize) || (m < this.mStencilSize));
      int n;
      int i1;
      do
      {
        j++;
        break;
        n = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12324);
        m = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12323);
        k = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12322);
        i1 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12321);
      }
      while ((n != this.mRedSize) || (m != this.mGreenSize) || (k != this.mBlueSize) || (i1 != this.mAlphaSize));
      AppMethodBeat.o(13093);
      paramEGL10 = localEGLConfig;
    }
    while (true)
    {
      return paramEGL10;
      paramEGL10 = null;
      AppMethodBeat.o(13093);
    }
  }

  public final EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay)
  {
    AppMethodBeat.i(13092);
    j.p(paramEGL10, "egl");
    j.p(paramEGLDisplay, "display");
    int[] arrayOfInt = new int[1];
    paramEGL10.eglChooseConfig(paramEGLDisplay, this.eZf, null, 0, arrayOfInt);
    int i = arrayOfInt[0];
    if (i <= 0)
    {
      paramEGL10 = (Throwable)new IllegalArgumentException("No configs match configSpec");
      AppMethodBeat.o(13092);
      throw paramEGL10;
    }
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[i];
    paramEGL10.eglChooseConfig(paramEGLDisplay, this.eZf, arrayOfEGLConfig, i, arrayOfInt);
    b(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
    paramEGL10 = chooseConfig(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
    AppMethodBeat.o(13092);
    return paramEGL10;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.h.a.a
 * JD-Core Version:    0.6.2
 */