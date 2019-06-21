package com.tencent.mm.plugin.api.recordView;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  private static int M(String paramString, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(76326);
    int[] arrayOfInt = new int[1];
    paramInt = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(paramInt, paramString);
    GLES20.glCompileShader(paramInt);
    GLES20.glGetShaderiv(paramInt, 35713, arrayOfInt, 0);
    if (arrayOfInt[0] == 0)
    {
      ab.e("loadShader error, infoLog: %s", GLES20.glGetShaderInfoLog(paramInt));
      AppMethodBeat.o(76326);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(76326);
    }
  }

  public static int U(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(76327);
    int[] arrayOfInt = new int[1];
    int j = M(paramString1, 35633);
    if (j == 0)
    {
      ab.e("MicroMsg.MMSightCameraGLUtil", "load vertex shader failed");
      AppMethodBeat.o(76327);
    }
    while (true)
    {
      return i;
      int k = M(paramString2, 35632);
      if (k == 0)
      {
        ab.e("MicroMsg.MMSightCameraGLUtil", "load fragment shader failed");
        AppMethodBeat.o(76327);
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
          ab.e("MicroMsg.MMSightCameraGLUtil", "link program failed");
          AppMethodBeat.o(76327);
        }
        else
        {
          GLES20.glDeleteShader(j);
          GLES20.glDeleteShader(k);
          AppMethodBeat.o(76327);
          i = m;
        }
      }
    }
  }

  public static int Vh()
  {
    AppMethodBeat.i(76325);
    int[] arrayOfInt = new int[1];
    GLES20.glGenTextures(1, arrayOfInt, 0);
    GLES20.glBindTexture(3553, arrayOfInt[0]);
    GLES20.glTexParameteri(3553, 10241, 9729);
    GLES20.glTexParameteri(3553, 10240, 9728);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    int i = arrayOfInt[0];
    AppMethodBeat.o(76325);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.b
 * JD-Core Version:    0.6.2
 */