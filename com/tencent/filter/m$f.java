package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class m$f extends m
{
  float value;

  public m$f(String paramString, float paramFloat)
  {
    super(paramString);
    this.value = paramFloat;
  }

  public final void setParams(int paramInt)
  {
    AppMethodBeat.i(86399);
    if (this.handle < 0)
      AppMethodBeat.o(86399);
    while (true)
    {
      return;
      GLES20.glUniform1f(this.handle, this.value);
      g.checkGlError("FloatParam setParams");
      AppMethodBeat.o(86399);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(86400);
    String str = this.name + "=" + this.value;
    AppMethodBeat.o(86400);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.f
 * JD-Core Version:    0.6.2
 */