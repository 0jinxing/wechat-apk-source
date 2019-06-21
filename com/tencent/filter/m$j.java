package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m$j extends m
{
  private final float[] bMR;

  public m$j(String paramString, float[] paramArrayOfFloat)
  {
    super(paramString);
    this.bMR = paramArrayOfFloat;
  }

  public final void setParams(int paramInt)
  {
    AppMethodBeat.i(86409);
    GLES20.glUniformMatrix4fv(this.handle, 1, false, this.bMR, 0);
    AppMethodBeat.o(86409);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.j
 * JD-Core Version:    0.6.2
 */