package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.FilterAlgorithm;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;
import java.util.Map;

public final class u extends BaseFilter
{
  private int bNT = 1;
  private int quality = 2;

  public u()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86470);
    new StringBuilder("value = ").append(this.bNT);
    this.glsl_programID = GLSLRender.bJB;
    BaseFilter localBaseFilter = new BaseFilter(GLSLRender.bLw);
    setNextFilter(localBaseFilter, null);
    int i = this.bNT;
    int j = this.quality;
    double d1 = 0.0D;
    double d2 = 0.0D;
    double d3 = 0.0D;
    double d4 = 0.0D;
    double d5 = 0.0D;
    double d6 = 0.0D;
    double d7 = 0.0D;
    if (i == 1)
    {
      d1 = 0.09D;
      d2 = 0.09D;
      d7 = 0.15D;
    }
    if (i == 3)
    {
      d5 = -0.06D;
      d7 = 0.07000000000000001D;
    }
    double d8 = d7;
    double d9 = d2;
    double d10 = d6;
    double d11 = d4;
    double d12 = d3;
    label212: Object localObject;
    float f;
    if (i == 4)
    {
      if (j == 1)
      {
        d9 = 0.455D;
        d12 = 0.17D;
        d11 = 0.177D;
        d10 = 0.2D;
        d8 = d7;
      }
    }
    else
    {
      d7 = d9;
      d3 = d10;
      d2 = d1;
      if (i == 2)
      {
        if (j != 1)
          break label678;
        d2 = 0.121D;
        d7 = 0.354D;
        d3 = d10;
      }
      d10 = d5;
      if (i == 5)
        d10 = -0.08D;
      if (i == 7)
      {
        d7 = 0.1D;
        d10 = -0.08D;
        d8 = 0.15D;
      }
      if (i == 6)
      {
        d10 = -0.12D;
        d8 = 0.16D;
      }
      localBaseFilter.addParam(new m.f("percent1", (float)d2));
      localBaseFilter.addParam(new m.f("percent2", (float)d7));
      localBaseFilter.addParam(new m.f("percent3", (float)d12));
      localBaseFilter.addParam(new m.f("percent4", (float)d11));
      localBaseFilter.addParam(new m.f("percent5", (float)d10));
      localBaseFilter.addParam(new m.f("percent6", (float)d3));
      localBaseFilter.addParam(new m.f("percent7", (float)d8));
      localObject = new u.b(this, this.bNT, this.quality);
      localBaseFilter.setNextFilter((BaseFilter)localObject, null);
      if (this.bNT == 5)
      {
        f = Math.min(paramFloat2, paramFloat1);
        localBaseFilter = new BaseFilter(GLSLRender.bJB);
        localBaseFilter.scaleFact = Math.min(400.0F / f, 1.0F);
        ((BaseFilter)localObject).setNextFilter(localBaseFilter, null);
        localObject = new a(this.quality, localBaseFilter.scaleFact);
        localBaseFilter.setNextFilter((BaseFilter)localObject, null);
        localBaseFilter = new BaseFilter(GLSLRender.bJE);
        f = 0.0F;
        switch (this.quality)
        {
        default:
        case 1:
        case 2:
        case 3:
        }
      }
    }
    while (true)
    {
      ((BaseFilter)localObject).setNextFilter(localBaseFilter, new int[] { this.srcTextureIndex + 3 });
      ((BaseFilter)localObject).addParam(new m.f("filterAdjustParam", 1.0F - f));
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86470);
      return;
      if (j == 2)
      {
        d9 = 0.62D;
        d12 = 0.375D;
        d11 = 0.07000000000000001D;
        d10 = 0.125D;
        d8 = 0.26D;
        break;
      }
      d8 = d7;
      d9 = d2;
      d10 = d6;
      d11 = d4;
      d12 = d3;
      if (j != 3)
        break;
      d9 = 0.824D;
      d12 = 0.461D;
      d11 = 0.152D;
      d10 = 0.2D;
      d8 = d7;
      break;
      label678: if (j == 2)
      {
        d2 = 0.32D;
        d7 = 0.35D;
        d3 = -0.1D;
        break label212;
      }
      d7 = d9;
      d3 = d10;
      d2 = d1;
      if (j != 3)
        break label212;
      d2 = 0.366D;
      d7 = 0.5540000000000001D;
      d3 = d10;
      break label212;
      f = 0.89F;
      continue;
      f = 0.78F;
      continue;
      f = 0.573F;
    }
  }

  public final void setEffectIndex(int paramInt)
  {
    this.bNT = paramInt;
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86469);
    if (paramMap.containsKey("effectIndex"))
      this.bNT = ((Integer)paramMap.get("effectIndex")).intValue();
    if (paramMap.containsKey("filter_type"))
      this.bNT = ((Integer)paramMap.get("filter_type")).intValue();
    if (paramMap.containsKey("filter_quality"))
      this.quality = ((Integer)paramMap.get("filter_quality")).intValue();
    AppMethodBeat.o(86469);
  }

  public final class a extends BaseFilter
  {
    float bMG;
    private float bNa;
    private int paramTEXTRUEID;

    public a(int paramFloat, float arg3)
    {
      super();
      AppMethodBeat.i(86462);
      this.bNa = 0.0F;
      this.paramTEXTRUEID = 0;
      this.bMG = 1.0F;
      Object localObject;
      this.bMG = localObject;
      switch (paramFloat)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        this.bNa *= 2.0F;
        AppMethodBeat.o(86462);
        return;
        this.bNa = 0.62F;
        continue;
        this.bNa = 0.67F;
        continue;
        this.bNa = 1.0F;
      }
    }

    public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
    {
      AppMethodBeat.i(86463);
      this.paramTEXTRUEID = g.dSO();
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86463);
    }

    public final void ClearGLSL()
    {
      AppMethodBeat.i(86466);
      g.Sk(this.paramTEXTRUEID);
      super.ClearGLSL();
      AppMethodBeat.o(86466);
    }

    public final void beforeRender(int paramInt1, int paramInt2, int paramInt3)
    {
      AppMethodBeat.i(86464);
      QImage localQImage = g.aL(paramInt1, paramInt2, paramInt3);
      FilterAlgorithm.nativeFastBlur(localQImage, this.bNa * this.bMG);
      GLSLRender.nativeTextImage(localQImage, this.paramTEXTRUEID);
      localQImage.Dispose();
      AppMethodBeat.o(86464);
    }

    public final boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
    {
      AppMethodBeat.i(86465);
      boolean bool = super.renderTexture(this.paramTEXTRUEID, paramInt2, paramInt3);
      AppMethodBeat.o(86465);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.u
 * JD-Core Version:    0.6.2
 */