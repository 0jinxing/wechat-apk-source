package com.tencent.filter.art;

import android.graphics.Bitmap;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public class BokehFilter extends BaseFilter
{
  public static Bitmap[] bNe = { null, null, null, null, null, null };
  Bitmap bNf;
  float bNg;
  int bNh;
  float bNi;
  float bNj;
  float bNk;
  int radius;

  public BokehFilter()
  {
    super(GLSLRender.bKc);
    AppMethodBeat.i(86288);
    this.bNf = null;
    this.bNg = 400.0F;
    this.bNh = 1;
    this.bNi = 0.5F;
    this.radius = 8;
    this.bNj = ((float)(1.0D / Math.exp(0.0D)));
    this.bNk = 0.0F;
    AppMethodBeat.o(86288);
  }

  public static native int nativeBokehProcess(QImage paramQImage1, QImage paramQImage2, int paramInt, float paramFloat1, float paramFloat2);

  public void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86291);
    this.glsl_programID = GLSLRender.bJB;
    this.scaleFact = (Math.min(960.0F / Math.max(paramFloat1, paramFloat2), 1.0F) * this.bNi);
    BokehFilter.a locala = new BokehFilter.a(this.radius, this.bNj, this.bNk, this.bNh, 1);
    locala.setScaleFact(this.scaleFact);
    setNextFilter(locala, null);
    locala.setNextFilter(new BaseFilter(GLSLRender.bJB), null);
    BaseFilter localBaseFilter = new BaseFilter(GLSLRender.bKn);
    if (this.bNf != null)
      localBaseFilter.addParam(new m.k("inputImageTexture3", this.bNf, 33987, false));
    locala.setNextFilter(localBaseFilter, new int[] { -1 });
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86291);
  }

  public void ClearGLSL()
  {
    AppMethodBeat.i(86289);
    super.ClearGLSL();
    this.bNf = null;
    AppMethodBeat.o(86289);
  }

  public void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86290);
    float f;
    if (paramMap.containsKey("inputradius"))
    {
      f = ((Float)paramMap.get("input_radius")).floatValue();
      this.bNi = (1.0F - f);
      this.radius = 5;
      if ((this.bNi >= 0.8D) || (this.bNi <= 0.4F))
        break label229;
      this.radius = 8;
    }
    while (true)
    {
      if (paramMap.containsKey("maxwidth"))
        this.bNg = ((Float)paramMap.get("maxwidth")).floatValue();
      if (paramMap.containsKey("maskbmp"))
        this.bNf = ((Bitmap)paramMap.get("maskbmp"));
      if (paramMap.containsKey("bokehType"))
        this.bNh = (((Integer)paramMap.get("bokehType")).intValue() % 6);
      if (paramMap.containsKey("lumi_threshold"))
        this.bNk = ((Float)paramMap.get("lumi_threshold")).floatValue();
      if (paramMap.containsKey("lumi_weight"))
        this.bNj = ((float)(1.0D / Math.exp(((Float)paramMap.get("lumi_weight")).floatValue())));
      AppMethodBeat.o(86290);
      return;
      label229: if (this.bNi <= 0.4F)
      {
        this.bNi = 0.4F;
        this.radius = ((int)(f * 6.0F + 8.0F));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.art.BokehFilter
 * JD-Core Version:    0.6.2
 */