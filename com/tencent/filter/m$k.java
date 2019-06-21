package com.tencent.filter;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.util.f;

public final class m$k extends m.n
{
  Bitmap bMS;
  boolean bMT = false;

  public m$k(String paramString, Bitmap paramBitmap, int paramInt, boolean paramBoolean)
  {
    super(paramString, 0, paramInt);
    this.bMT = paramBoolean;
    this.bMS = paramBitmap;
  }

  public final void clear()
  {
    AppMethodBeat.i(86410);
    GLES20.glActiveTexture(this.bMU);
    f.dSJ().G(this.texture);
    super.clear();
    if ((this.bMT) && (this.bMS != null))
    {
      this.bMS.recycle();
      this.bMS = null;
    }
    AppMethodBeat.o(86410);
  }

  public final void initialParams(int paramInt)
  {
    AppMethodBeat.i(86411);
    super.initialParams(paramInt);
    if ((this.bMS == null) || (this.bMS.isRecycled()))
      AppMethodBeat.o(86411);
    while (true)
    {
      return;
      GLES20.glActiveTexture(this.bMU);
      f.dSJ().F(this.texture);
      GLES20.glBindTexture(3553, this.texture[0]);
      GLUtils.texImage2D(3553, 0, this.bMS, 0);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      AppMethodBeat.o(86411);
    }
  }

  public final void m(Bitmap paramBitmap)
  {
    AppMethodBeat.i(86412);
    if ((this.bMT) && (this.bMS != null) && (!this.bMS.isRecycled()))
      this.bMS.recycle();
    this.bMS = paramBitmap;
    if ((this.bMS == null) || (this.bMS.isRecycled()))
      AppMethodBeat.o(86412);
    while (true)
    {
      return;
      GLES20.glActiveTexture(this.bMU);
      GLES20.glBindTexture(3553, this.texture[0]);
      GLUtils.texImage2D(3553, 0, this.bMS, 0);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      AppMethodBeat.o(86412);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.k
 * JD-Core Version:    0.6.2
 */