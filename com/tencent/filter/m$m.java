package com.tencent.filter;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.util.f;

public final class m$m extends m.n
{
  int[] value;

  public m$m(String paramString, int[] paramArrayOfInt, int paramInt)
  {
    super(paramString, 0, paramInt);
    this.value = paramArrayOfInt;
  }

  public final void clear()
  {
    AppMethodBeat.i(86417);
    GLES20.glActiveTexture(this.bMU);
    f.dSJ().G(this.texture);
    super.clear();
    AppMethodBeat.o(86417);
  }

  public final void initialParams(int paramInt)
  {
    AppMethodBeat.i(86418);
    super.initialParams(paramInt);
    if (this.value == null)
      AppMethodBeat.o(86418);
    while (true)
    {
      return;
      GLES20.glActiveTexture(this.bMU);
      f.dSJ().F(this.texture);
      GLSLRender.nativeTextCure(this.value, this.texture[0]);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      AppMethodBeat.o(86418);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.m
 * JD-Core Version:    0.6.2
 */