package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class m$i extends m
{
  int value;

  public m$i(String paramString, int paramInt)
  {
    super(paramString);
    this.value = paramInt;
  }

  public final void setParams(int paramInt)
  {
    AppMethodBeat.i(86408);
    if (this.handle < 0)
      AppMethodBeat.o(86408);
    while (true)
    {
      return;
      GLES20.glUniform1i(this.handle, this.value);
      g.checkGlError("IntParam setParams");
      AppMethodBeat.o(86408);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(86407);
    String str = this.name + "=" + this.value;
    AppMethodBeat.o(86407);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.i
 * JD-Core Version:    0.6.2
 */