package com.tencent.filter.art;

import android.opengl.GLES20;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class e$a extends BaseFilter
{
  int paramTEXTRUEID = 0;

  public e$a()
  {
    super(GLSLRender.bLl);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86303);
    this.paramTEXTRUEID = g.dSO();
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86303);
  }

  public final void ClearGLSL()
  {
    AppMethodBeat.i(86306);
    g.Sk(this.paramTEXTRUEID);
    super.ClearGLSL();
    AppMethodBeat.o(86306);
  }

  public final void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    AppMethodBeat.i(86304);
    Object localObject = g.aL(paramInt1, paramInt2, paramInt3);
    int[] arrayOfInt = ((QImage)localObject).nativeGetArrayHistogram();
    ((QImage)localObject).Dispose();
    paramInt3 = 0;
    paramInt1 = 0;
    paramInt2 = 0;
    while (paramInt3 < 256)
    {
      paramInt1 += arrayOfInt[paramInt3];
      paramInt2 += arrayOfInt[paramInt3] * paramInt3;
      paramInt3++;
    }
    int j = paramInt2 / paramInt1;
    int k = (int)(paramInt1 * 0.001F);
    int m = (int)(paramInt1 * 0.99F);
    paramInt3 = 0;
    paramInt2 = 0;
    if (paramInt2 < 256)
    {
      paramInt3 += arrayOfInt[paramInt2];
      if (paramInt3 <= k);
    }
    for (paramInt1 = paramInt2; ; paramInt1 = 0)
    {
      paramInt2++;
      label113: if (paramInt2 < 256)
      {
        paramInt3 += arrayOfInt[paramInt2];
        if (paramInt3 <= m);
      }
      while (true)
      {
        float f1 = (j - paramInt1) / (paramInt2 - paramInt1);
        float f2 = (float)(Math.log(0.5D) / Math.log(f1));
        if (f2 < 0.1D);
        for (f1 = 0.1F; ; f1 = f2)
        {
          if (f2 > 10.0D)
            f1 = 10.0F;
          localObject = new float[256];
          paramInt3 = 0;
          while (true)
            if (paramInt3 < paramInt1)
            {
              localObject[paramInt3] = 0.0F;
              paramInt3++;
              continue;
              paramInt2++;
              break;
              paramInt2++;
              break label113;
            }
          for (j = paramInt1; ; j++)
          {
            paramInt3 = paramInt2;
            if (j >= paramInt2)
              break;
            localObject[j] = ((float)Math.pow((j - paramInt1) / (paramInt2 - paramInt1), f1));
          }
          while (paramInt3 < 256)
          {
            localObject[paramInt3] = 1.0F;
            paramInt3++;
          }
          arrayOfInt = new int[256];
          for (paramInt1 = i; paramInt1 < 256; paramInt1++)
            arrayOfInt[paramInt1] = ((int)(localObject[paramInt1] * 255.0F));
          GLES20.glActiveTexture(33984);
          GLSLRender.nativeTextCure(arrayOfInt, this.paramTEXTRUEID);
          AppMethodBeat.o(86304);
          return;
        }
        paramInt2 = 255;
      }
    }
  }

  public final boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86305);
    setTextureParam(this.paramTEXTRUEID, 1);
    boolean bool = super.renderTexture(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(86305);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.filter.art.e.a
 * JD-Core Version:    0.6.2
 */