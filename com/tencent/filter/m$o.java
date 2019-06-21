package com.tencent.filter;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.util.f;
import com.tencent.util.i;

public final class m$o extends m.n
{
  String bMV = null;
  double bMW = 0.0D;
  int bMX = 0;

  public m$o(String paramString1, String paramString2, double paramDouble)
  {
    super(paramString1, 0, 33986);
    this.bMV = paramString2;
    this.bMW = paramDouble;
  }

  public m$o(String paramString1, String paramString2, int paramInt)
  {
    super(paramString1, 0, paramInt);
    this.bMV = paramString2;
  }

  public m$o(String paramString1, String paramString2, int paramInt, byte paramByte)
  {
    super(paramString1, 0, 33986);
    this.bMV = paramString2;
    this.bMX = paramInt;
  }

  public final void clear()
  {
    AppMethodBeat.i(86423);
    GLES20.glActiveTexture(this.bMU);
    f.dSJ().G(this.texture);
    super.clear();
    AppMethodBeat.o(86423);
  }

  public final void initialParams(int paramInt)
  {
    AppMethodBeat.i(86422);
    super.initialParams(paramInt);
    if (this.bMV == null)
    {
      AppMethodBeat.o(86422);
      return;
    }
    GLES20.glActiveTexture(this.bMU);
    f.dSJ().F(this.texture);
    GLES20.glBindTexture(3553, this.texture[0]);
    Object localObject1 = com.tencent.view.b.vt(this.bMV);
    Object localObject2 = null;
    if (localObject1 != null)
      if (this.bMW > 0.0D)
        if (this.bMW < 1.0D)
        {
          localObject2 = com.tencent.util.b.g((Bitmap)localObject1, (int)(((Bitmap)localObject1).getHeight() * this.bMW), ((Bitmap)localObject1).getHeight());
          label104: ((Bitmap)localObject1).recycle();
          localObject1 = null;
          label110: if (this.bMX != 1)
            break label325;
          localObject2 = new Matrix();
          ((Matrix)localObject2).setValues(new float[] { 1.0F, 0.0F, 0.0F, 0.0F, -1.0F, ((Bitmap)localObject1).getHeight(), 0.0F, 0.0F, 1.0F });
          localObject2 = com.tencent.util.b.a((Bitmap)localObject1, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), (Matrix)localObject2);
          if (localObject2 != null)
            break label321;
          label196: if (localObject1 == null)
            break label330;
          GLUtils.texImage2D(3553, 0, (Bitmap)localObject1, 0);
          ((Bitmap)localObject1).recycle();
        }
    while (true)
    {
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      AppMethodBeat.o(86422);
      break;
      localObject2 = com.tencent.util.b.g((Bitmap)localObject1, ((Bitmap)localObject1).getWidth(), (int)(((Bitmap)localObject1).getWidth() / this.bMW));
      break label104;
      localObject2 = localObject1;
      break label110;
      i.m("Param", "lastBitmap is null " + this.bMV);
      break label110;
      label321: ((Bitmap)localObject1).recycle();
      label325: localObject1 = localObject2;
      break label196;
      label330: i.m("Param", "bitmap is null");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.filter.m.o
 * JD-Core Version:    0.6.2
 */