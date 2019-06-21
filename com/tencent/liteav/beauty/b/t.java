package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.e.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public class t extends s
{
  protected float u;

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67045);
    super.a(paramInt1, paramInt2);
    s();
    AppMethodBeat.o(67045);
  }

  public boolean b()
  {
    AppMethodBeat.i(67043);
    boolean bool;
    if ((super.b()) && (GLES20.glGetError() == 0))
    {
      bool = true;
      AppMethodBeat.o(67043);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67043);
    }
  }

  public float q()
  {
    return this.u;
  }

  public float r()
  {
    return this.u;
  }

  protected void s()
  {
    AppMethodBeat.i(67044);
    float f = r();
    g localg = (g)this.r.get(0);
    int i = GLES20.glGetUniformLocation(localg.p(), "texelWidthOffset");
    int j = GLES20.glGetUniformLocation(localg.p(), "texelHeightOffset");
    localg.a(i, f / this.e);
    localg.a(j, 0.0F);
    f = q();
    localg = (g)this.r.get(1);
    j = GLES20.glGetUniformLocation(localg.p(), "texelWidthOffset");
    i = GLES20.glGetUniformLocation(localg.p(), "texelHeightOffset");
    localg.a(j, 0.0F);
    localg.a(i, f / this.f);
    AppMethodBeat.o(67044);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.t
 * JD-Core Version:    0.6.2
 */