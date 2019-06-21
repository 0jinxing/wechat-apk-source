package com.tencent.filter;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.util.f;

public final class m$l extends m.n
{
  public Bitmap bMS;
  public boolean update;

  public m$l(String paramString)
  {
    super(paramString, 0, 33987);
    AppMethodBeat.i(86413);
    this.bMS = null;
    boolean bool2 = bool1;
    if (this.bMS != null)
    {
      bool2 = bool1;
      if (!this.bMS.isRecycled())
        bool2 = true;
    }
    this.update = bool2;
    AppMethodBeat.o(86413);
  }

  public final void clear()
  {
    AppMethodBeat.i(86414);
    GLES20.glActiveTexture(this.bMU);
    f.dSJ().G(this.texture);
    super.clear();
    AppMethodBeat.o(86414);
  }

  public final void initialParams(int paramInt)
  {
    AppMethodBeat.i(86415);
    super.initialParams(paramInt);
    GLES20.glActiveTexture(this.bMU);
    f.dSJ().F(this.texture);
    AppMethodBeat.o(86415);
  }

  public final void setParams(int paramInt)
  {
    AppMethodBeat.i(86416);
    if (this.update)
    {
      GLES20.glActiveTexture(this.bMU);
      GLES20.glBindTexture(3553, this.texture[0]);
    }
    try
    {
      GLUtils.texImage2D(3553, 0, this.bMS, 0);
      label43: GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      super.setParams(paramInt);
      this.update = false;
      AppMethodBeat.o(86416);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label43;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.l
 * JD-Core Version:    0.6.2
 */