package com.tencent.filter.art;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.filter.m.k;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class d extends BaseFilter
{
  Bitmap bNC = null;
  int type = 0;

  public d()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    float f1 = 852.0F;
    float f2 = 640.0F;
    AppMethodBeat.i(86301);
    this.glsl_programID = GLSLRender.bJB;
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bMu, GLSLRender.bLm);
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2;
    BaseFilter localBaseFilter3;
    label229: float f3;
    float f4;
    if (this.bNC == null)
    {
      localBaseFilter2 = new BaseFilter(GLSLRender.bMv, GLSLRender.bLr);
      localBaseFilter1.setNextFilter(localBaseFilter2, null);
      if (GLES20.glGetString(7937).indexOf("PowerVR SGX 540") != -1)
      {
        localBaseFilter3 = new BaseFilter(GLSLRender.bLt);
        localBaseFilter2.setNextFilter(localBaseFilter3, new int[] { this.srcTextureIndex + 2 });
        localBaseFilter2 = new BaseFilter(GLSLRender.bMw, GLSLRender.bLo);
        localBaseFilter3.setNextFilter(localBaseFilter2, new int[] { this.srcTextureIndex + 3 });
        localBaseFilter3 = new BaseFilter(GLSLRender.bLp);
        localBaseFilter3.addParam(new m.o("inputImageTexture2", "manga/manga.png", 33986));
        localBaseFilter3.addParam(new m.f("height_scale", paramFloat2 / 64.0F));
        localBaseFilter3.addParam(new m.f("width_scale", paramFloat1 / 64.0F));
        localBaseFilter2.setNextFilter(localBaseFilter3, null);
        localBaseFilter2 = new BaseFilter(GLSLRender.bLq);
        localBaseFilter2.addParam(new m.f("rx", 1.0F));
        localBaseFilter2.addParam(new m.f("ry", 1.0F));
        localBaseFilter2.addParam(new m.f("tx", 0.0F));
        localBaseFilter2.addParam(new m.f("ty", 0.0F));
        localBaseFilter2.addParam(new m.i("flag", this.type));
        if ((paramFloat1 <= 640.0F) || (paramFloat2 <= 852.0F))
          break label562;
        f3 = paramFloat1 / 640.0F;
        f4 = paramFloat2 / 852.0F;
        if (f3 >= f4)
          break label553;
        f1 = paramFloat2 / f3;
      }
    }
    while (true)
    {
      localBaseFilter2.addParam(new m.f("w", f2));
      localBaseFilter2.addParam(new m.f("h", f1));
      localBaseFilter3.setNextFilter(localBaseFilter2, null);
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86301);
      return;
      localBaseFilter3 = new BaseFilter(GLSLRender.bLn);
      break;
      localBaseFilter3 = new BaseFilter(GLSLRender.bLs);
      localBaseFilter3.addParam(new m.o("inputImageTexture3", "manga/manga.png", 33987));
      localBaseFilter3.addParam(new m.k("inputImageTexture2", this.bNC, 33986, false));
      localBaseFilter3.addParam(new m.f("par", 0.45F));
      localBaseFilter3.addParam(new m.f("height_scale", paramFloat2 / 64.0F));
      localBaseFilter3.addParam(new m.f("width_scale", paramFloat1 / 64.0F));
      localBaseFilter1.setNextFilter(localBaseFilter3, null);
      break label229;
      label553: f2 = paramFloat1 / f4;
      continue;
      label562: f4 = 640.0F / paramFloat1;
      f3 = 852.0F / paramFloat2;
      if (f4 < f3)
        f2 = paramFloat1 * f3;
      else
        f1 = paramFloat2 * f4;
    }
  }

  public final void ClearGLSL()
  {
    AppMethodBeat.i(86302);
    if (this.bNC != null)
    {
      this.bNC.recycle();
      this.bNC = null;
    }
    super.ClearGLSL();
    AppMethodBeat.o(86302);
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86300);
    if (paramMap.containsKey("graybitmap"))
      this.bNC = ((Bitmap)paramMap.get("graybitmap"));
    if (paramMap.containsKey("effectIndex"))
      this.type = ((Integer)paramMap.get("effectIndex")).intValue();
    AppMethodBeat.o(86300);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.filter.art.d
 * JD-Core Version:    0.6.2
 */