package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public class m$n extends m
{
  int bMU;
  int[] texture;

  public m$n(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString);
    AppMethodBeat.i(86419);
    this.texture = new int[] { 0 };
    this.bMU = paramInt2;
    this.texture[0] = paramInt1;
    AppMethodBeat.o(86419);
  }

  public void clear()
  {
    AppMethodBeat.i(86420);
    super.clear();
    this.texture[0] = 0;
    AppMethodBeat.o(86420);
  }

  public void setParams(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(86421);
    if ((this.handle < 0) || (this.texture[0] == 0))
    {
      AppMethodBeat.o(86421);
      return;
    }
    GLES20.glActiveTexture(this.bMU);
    GLES20.glBindTexture(3553, this.texture[0]);
    paramInt = i;
    switch (this.bMU)
    {
    default:
      paramInt = i;
    case 33984:
    case 33985:
    case 33986:
    case 33987:
    case 33988:
    case 33989:
    case 33990:
    case 33991:
    }
    while (true)
    {
      GLES20.glUniform1i(this.handle, paramInt);
      g.checkGlError("TextureParam setParams");
      AppMethodBeat.o(86421);
      break;
      paramInt = 1;
      continue;
      paramInt = 2;
      continue;
      paramInt = 3;
      continue;
      paramInt = 4;
      continue;
      paramInt = 5;
      continue;
      paramInt = 6;
      continue;
      paramInt = 7;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.n
 * JD-Core Version:    0.6.2
 */