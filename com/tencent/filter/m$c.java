package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class m$c extends m
{
  float[] bMQ;

  public m$c(String paramString, float[] paramArrayOfFloat)
  {
    super(paramString);
    AppMethodBeat.i(86392);
    this.bMQ = new float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++)
      this.bMQ[i] = paramArrayOfFloat[i];
    AppMethodBeat.o(86392);
  }

  public final void setParams(int paramInt)
  {
    AppMethodBeat.i(86393);
    if (this.handle < 0)
      AppMethodBeat.o(86393);
    while (true)
    {
      return;
      GLES20.glUniform2fv(this.handle, this.bMQ.length / 2, this.bMQ, 0);
      g.checkGlError("Float2sParam setParams");
      AppMethodBeat.o(86393);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(86394);
    String str = this.name + "=" + this.bMQ;
    AppMethodBeat.o(86394);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.c
 * JD-Core Version:    0.6.2
 */