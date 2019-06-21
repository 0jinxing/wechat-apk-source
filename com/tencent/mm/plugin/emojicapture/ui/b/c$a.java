package com.tencent.mm.plugin.emojicapture.ui.b;

import a.f.b.j;
import a.l;
import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiCaptureGLUtil$Companion;", "", "()V", "CUBE_PROTRAIT", "", "TAG", "", "TEXTURE_COORD", "TEXTURE_COORD_VERTICAL_FLIP", "bindFrameBuffer", "", "fbo", "", "texture", "width", "height", "bindRenderBuffer", "buffer", "chooseConfig", "Ljavax/microedition/khronos/egl/EGLConfig;", "eGL", "Ljavax/microedition/khronos/egl/EGL10;", "eGLDisplay", "Ljavax/microedition/khronos/egl/EGLDisplay;", "redSize", "greenSize", "blueSize", "alphaSize", "withSample", "", "chooseConfigEGL14", "Landroid/opengl/EGLConfig;", "Landroid/opengl/EGLDisplay;", "clearGL", "genFrameBuffer", "genRenderBuffer", "genTexture", "genTextureExternal", "loadShader", "shaderSource", "type", "loadShaderProgram", "vertexShaderSource", "fragmentShaderSource", "plugin-emojicapture_release"})
public final class c$a
{
  private static int M(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(3148);
    j.p(paramString, "shaderSource");
    int[] arrayOfInt = new int[1];
    paramInt = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(paramInt, paramString);
    GLES20.glCompileShader(paramInt);
    GLES20.glGetShaderiv(paramInt, 35713, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      ab.e("MicroMsg.EmojiCaptureGLUtil", "loadShader error, infoLog: %s", new Object[] { GLES20.glGetShaderInfoLog(paramInt) });
      AppMethodBeat.o(3148);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(3148);
    }
  }

  public static int U(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(3149);
    j.p(paramString1, "vertexShaderSource");
    j.p(paramString2, "fragmentShaderSource");
    int[] arrayOfInt = new int[1];
    int j = M(paramString1, 35633);
    if (j == 0)
    {
      ab.e("MicroMsg.EmojiCaptureGLUtil", "load vertex shader failed");
      AppMethodBeat.o(3149);
    }
    while (true)
    {
      return i;
      int k = M(paramString2, 35632);
      if (k == 0)
      {
        ab.e("MicroMsg.EmojiCaptureGLUtil", "load fragment shader failed");
        AppMethodBeat.o(3149);
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
          ab.e("MicroMsg.EmojiCaptureGLUtil", "link program failed");
          AppMethodBeat.o(3149);
        }
        else
        {
          GLES20.glDeleteShader(j);
          GLES20.glDeleteShader(k);
          AppMethodBeat.o(3149);
          i = m;
        }
      }
    }
  }

  public static int Vh()
  {
    AppMethodBeat.i(3146);
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    GLES20.glBindTexture(3553, arrayOfInt[0]);
    GLES20.glTexParameteri(3553, 10241, 9729);
    GLES20.glTexParameteri(3553, 10240, 9728);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glBindTexture(3553, 0);
    int i = arrayOfInt[0];
    AppMethodBeat.o(3146);
    return i;
  }

  public static int Vi()
  {
    int i = 0;
    AppMethodBeat.i(3150);
    int[] arrayOfInt = new int[1];
    GLES20.glGenFramebuffers(1, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      ab.e("MicroMsg.EmojiCaptureGLUtil", "gen frame buffer error");
      AppMethodBeat.o(3150);
    }
    while (true)
    {
      return i;
      i = arrayOfInt[0];
      AppMethodBeat.o(3150);
    }
  }

  public static void Vj()
  {
    AppMethodBeat.i(3151);
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    GLES20.glClear(19798);
    GLES20.glBindFramebuffer(36160, 0);
    AppMethodBeat.o(3151);
  }

  public static int bof()
  {
    AppMethodBeat.i(3147);
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    GLES20.glBindTexture(36197, arrayOfInt[0]);
    GLES20.glTexParameteri(36197, 10241, 9729);
    GLES20.glTexParameteri(36197, 10240, 9728);
    GLES20.glTexParameteri(36197, 10242, 33071);
    GLES20.glTexParameteri(36197, 10243, 33071);
    GLES20.glBindTexture(36197, 0);
    int i = arrayOfInt[0];
    AppMethodBeat.o(3147);
    return i;
  }

  public static void y(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(3152);
    GLES20.glBindFramebuffer(36160, paramInt1);
    GLES20.glBindTexture(3553, paramInt2);
    GLES20.glTexImage2D(3553, 0, 6408, paramInt3, paramInt4, 0, 6408, 5121, null);
    GLES20.glFramebufferTexture2D(36160, 36064, 3553, paramInt2, 0);
    GLES20.glBindTexture(3553, 0);
    AppMethodBeat.o(3152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.c.a
 * JD-Core Version:    0.6.2
 */