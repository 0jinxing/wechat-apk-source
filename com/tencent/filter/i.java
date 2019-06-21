package com.tencent.filter;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class i extends BaseFilter
{
  Bitmap bCr = null;
  private int type = 0;

  public i()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86370);
    if (this.bCr == null)
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86370);
    }
    float f2;
    while (true)
    {
      return;
      addParam(new m.k("inputImageTexture2", this.bCr, 33986, false));
      if (this.type != 0)
        break;
      this.glsl_programID = GLSLRender.bKA;
      f1 = (float)Math.floor(paramFloat2 / this.bCr.getHeight() + 0.999999D);
      f2 = (float)Math.floor(paramFloat1 / this.bCr.getWidth() + 0.999999D);
      addParam(new m.f("height_scale", f1));
      addParam(new m.f("width_scale", f2));
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86370);
    }
    this.glsl_vertextshaderID = GLSLRender.bMr;
    this.glsl_programID = GLSLRender.bKz;
    float f1 = this.bCr.getHeight() / this.bCr.getWidth();
    if (this.type == 1)
    {
      this.glsl_vertextshaderID = GLSLRender.bMs;
      if (paramFloat2 > paramFloat1 * f1)
      {
        f1 = (paramFloat2 - f1 * paramFloat1) / 2.0F / paramFloat2;
        f2 = 0.0F;
      }
    }
    while (true)
    {
      addParam(new m.f("height_offset", f1));
      addParam(new m.f("width_offset", f2));
      break;
      f2 = (paramFloat1 - paramFloat2 / f1) / 2.0F / paramFloat1;
      f1 = 0.0F;
      continue;
      if (this.type == 2)
      {
        this.glsl_vertextshaderID = GLSLRender.bMt;
        if (paramFloat2 < paramFloat1 * f1)
        {
          f1 = (paramFloat1 * f1 - paramFloat2) / 2.0F / (f1 * paramFloat1);
          f2 = 0.0F;
        }
        else
        {
          f2 = (paramFloat2 / f1 - paramFloat1) / 2.0F / (paramFloat2 / f1);
          f1 = 0.0F;
        }
      }
      else
      {
        f1 = 0.0F;
        f2 = 0.0F;
      }
    }
  }

  public final void ClearGLSL()
  {
    AppMethodBeat.i(86371);
    if (this.bCr != null)
    {
      this.bCr.recycle();
      this.bCr = null;
    }
    super.ClearGLSL();
    AppMethodBeat.o(86371);
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86369);
    if (paramMap.containsKey("image"))
      this.bCr = ((Bitmap)paramMap.get("image"));
    if (paramMap.containsKey("effectIndex"))
      this.type = ((Integer)paramMap.get("effectIndex")).intValue();
    AppMethodBeat.o(86369);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.i
 * JD-Core Version:    0.6.2
 */