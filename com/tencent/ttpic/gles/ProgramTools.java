package com.tencent.ttpic.gles;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.opengl.GLES31;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class ProgramTools
{
  public static final int PER_FLOAT_BYTE = 4;
  private static final String TAG;

  static
  {
    AppMethodBeat.i(50028);
    TAG = ProgramTools.class.getSimpleName();
    AppMethodBeat.o(50028);
  }

  public static int createComputeProgram(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(50023);
    int j = GLES31.glCreateShader(37305);
    GLES20.glShaderSource(j, paramString);
    Object localObject = new int[1];
    GLES20.glCompileShader(j);
    GLES20.glGetShaderiv(j, 35713, (int[])localObject, 0);
    int k;
    if (localObject[0] == 0)
    {
      localObject = GLES20.glGetShaderInfoLog(j);
      GLES20.glDeleteShader(j);
      if (GLConfig.DEBUG)
      {
        if (paramString.length() >= 100)
        {
          k = paramString.length() - 100;
          LogUtils.e(TAG, "vertex shader compile,failed:" + paramString.substring(k));
          LogUtils.e(TAG, (String)localObject);
        }
      }
      else
      {
        AppMethodBeat.o(50023);
        k = i;
      }
    }
    while (true)
    {
      return k;
      k = 0;
      break;
      k = GLES20.glCreateProgram();
      GLES20.glAttachShader(k, j);
      GLES20.glLinkProgram(k);
      GLES20.glGetProgramiv(k, 35714, (int[])localObject, 0);
      if (localObject[0] == 0)
      {
        GLES20.glDeleteProgram(k);
        new StringBuilder("link program,failed:").append(GLES20.glGetProgramInfoLog(k));
        if (GLConfig.DEBUG)
          LogUtils.e(TAG, "link program,failed:" + GLES20.glGetProgramInfoLog(k));
        AppMethodBeat.o(50023);
        k = i;
      }
      else
      {
        GLES20.glDeleteShader(j);
        AppMethodBeat.o(50023);
      }
    }
  }

  public static int createProgram(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(50022);
    int j = GLES20.glCreateShader(35633);
    int k = GLES20.glCreateShader(35632);
    GLES20.glShaderSource(j, paramString1);
    GLES20.glShaderSource(k, paramString2);
    int[] arrayOfInt = new int[1];
    GLES20.glCompileShader(j);
    GLES20.glGetShaderiv(j, 35713, arrayOfInt, 0);
    int m;
    if (arrayOfInt[0] == 0)
    {
      paramString2 = GLES20.glGetShaderInfoLog(j);
      GLES20.glDeleteShader(j);
      if (GLConfig.DEBUG)
      {
        if (paramString1.length() >= 100)
        {
          m = paramString1.length() - 100;
          LogUtils.e(TAG, "vertex shader compile,failed:" + paramString1.substring(m));
          LogUtils.e(TAG, paramString2);
        }
      }
      else
      {
        AppMethodBeat.o(50022);
        m = i;
      }
    }
    while (true)
    {
      return m;
      m = 0;
      break;
      GLES20.glCompileShader(k);
      GLES20.glGetShaderiv(k, 35713, arrayOfInt, 0);
      if (arrayOfInt[0] == 0)
      {
        paramString1 = GLES20.glGetShaderInfoLog(k);
        GLES20.glDeleteShader(k);
        if (GLConfig.DEBUG)
          if (paramString2.length() < 100)
            break label242;
        label242: for (m = paramString2.length() - 100; ; m = 0)
        {
          LogUtils.e(TAG, "fragment shader compile,failed:" + paramString2.substring(m));
          LogUtils.e(TAG, paramString1);
          AppMethodBeat.o(50022);
          m = i;
          break;
        }
      }
      m = GLES20.glCreateProgram();
      GLES20.glAttachShader(m, j);
      GLES20.glAttachShader(m, k);
      GLES20.glLinkProgram(m);
      GLES20.glGetProgramiv(m, 35714, arrayOfInt, 0);
      if (arrayOfInt[0] == 0)
      {
        GLES20.glDeleteProgram(m);
        new StringBuilder("link program,failed:").append(GLES20.glGetProgramInfoLog(m));
        if (GLConfig.DEBUG)
          LogUtils.e(TAG, "link program,failed:" + GLES20.glGetProgramInfoLog(m));
        AppMethodBeat.o(50022);
        m = i;
      }
      else
      {
        GLES20.glDeleteShader(j);
        GLES20.glDeleteShader(k);
        AppMethodBeat.o(50022);
      }
    }
  }

  public static void createTexture(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(50024);
    GLES20.glGenTextures(1, paramArrayOfInt, 0);
    GLES20.glBindTexture(3553, paramArrayOfInt[0]);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glTexParameteri(3553, 10241, 9728);
    GLES20.glTexParameteri(3553, 10240, 9729);
    GLES20.glTexImage2D(3553, 0, paramInt3, paramInt1, paramInt2, 0, paramInt3, 5121, null);
    AppMethodBeat.o(50024);
  }

  public static int loadShader(int paramInt, String paramString)
  {
    AppMethodBeat.i(50025);
    paramInt = GLES20.glCreateShader(paramInt);
    GLES20.glShaderSource(paramInt, paramString);
    GLES20.glCompileShader(paramInt);
    AppMethodBeat.o(50025);
    return paramInt;
  }

  public static void mallocTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(50026);
    GLES20.glBindTexture(3553, paramInt1);
    GLES20.glTexParameteri(3553, 10242, 33071);
    GLES20.glTexParameteri(3553, 10243, 33071);
    GLES20.glTexParameteri(3553, 10241, 9728);
    GLES20.glTexParameteri(3553, 10240, 9729);
    GLES20.glTexImage2D(3553, 0, 6408, paramInt2, paramInt3, 0, 6408, 5121, null);
    AppMethodBeat.o(50026);
  }

  private static String readTextFile(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(50021);
    paramContext = paramContext.getResources().openRawResource(paramInt);
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramContext));
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      while (true)
      {
        String str = localBufferedReader.readLine();
        if (str == null)
          break;
        localStringBuilder.append(str);
        localStringBuilder.append("\n");
      }
    }
    catch (Exception localException)
    {
    }
    finally
    {
      try
      {
        paramContext.close();
        localBufferedReader.close();
        paramContext = null;
        AppMethodBeat.o(50021);
        return paramContext;
      }
      catch (IOException paramContext)
      {
        try
        {
          while (true)
          {
            paramContext.close();
            localBufferedReader.close();
            label92: paramContext = localException.toString();
            AppMethodBeat.o(50021);
          }
          localObject = finally;
          try
          {
            paramContext.close();
            localBufferedReader.close();
            label114: AppMethodBeat.o(50021);
            throw localObject;
          }
          catch (IOException paramContext)
          {
            break label114;
          }
          paramContext = paramContext;
        }
        catch (IOException paramContext)
        {
          break label92;
        }
      }
    }
  }

  @TargetApi(18)
  public static void setupSSBufferObject(int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3)
  {
    AppMethodBeat.i(50027);
    FloatBuffer localFloatBuffer = ByteBuffer.allocateDirect(paramInt3 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    if (paramArrayOfFloat != null)
      localFloatBuffer.put(paramArrayOfFloat).position(0);
    GLES31.glBindBuffer(37074, paramInt1);
    GLES31.glBufferData(37074, paramInt3 * 4, localFloatBuffer, 35044);
    GLES31.glBindBufferBase(37074, paramInt2, paramInt1);
    AppMethodBeat.o(50027);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.gles.ProgramTools
 * JD-Core Version:    0.6.2
 */