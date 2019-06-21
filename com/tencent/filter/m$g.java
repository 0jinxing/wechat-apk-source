package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class m$g extends m
{
  float[] bMQ;

  public m$g(String paramString, float[] paramArrayOfFloat)
  {
    super(paramString);
    AppMethodBeat.i(86401);
    this.bMQ = new float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++)
      this.bMQ[i] = paramArrayOfFloat[i];
    AppMethodBeat.o(86401);
  }

  public final void setParams(int paramInt)
  {
    AppMethodBeat.i(86403);
    if (this.handle < 0)
    {
      AppMethodBeat.o(86403);
      return;
    }
    switch (this.bMQ.length)
    {
    default:
      GLES20.glUniform1fv(this.handle, this.bMQ.length, this.bMQ, 0);
    case 1:
    case 2:
    case 3:
    case 4:
    case 9:
    case 16:
    }
    while (true)
    {
      g.checkGlError("FloatsParam setParams");
      AppMethodBeat.o(86403);
      break;
      GLES20.glUniform1f(this.handle, this.bMQ[0]);
      continue;
      GLES20.glUniform2fv(this.handle, 1, this.bMQ, 0);
      continue;
      GLES20.glUniform3fv(this.handle, 1, this.bMQ, 0);
      continue;
      GLES20.glUniform4fv(this.handle, 1, this.bMQ, 0);
      continue;
      GLES20.glUniformMatrix3fv(this.handle, 1, false, this.bMQ, 0);
      continue;
      GLES20.glUniformMatrix4fv(this.handle, 1, false, this.bMQ, 0);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(86402);
    String str = this.name + "=" + this.bMQ.toString();
    AppMethodBeat.o(86402);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.g
 * JD-Core Version:    0.6.2
 */