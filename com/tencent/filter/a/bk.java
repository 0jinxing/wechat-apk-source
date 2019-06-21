package com.tencent.filter.a;

import android.opengl.GLES20;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.art.c;
import com.tencent.filter.l;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class bk extends BaseFilter
{
  public bk()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86518);
    if (paramBoolean)
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86518);
      return;
    }
    float f1 = paramFloat1 / 2.0F;
    float f2 = paramFloat2 / 2.0F;
    float f3 = Math.min(paramFloat1, paramFloat2) / 4.0F;
    c localc = new c();
    Object localObject1 = new HashMap();
    ((Map)localObject1).put("bokehType", Integer.valueOf(1));
    ((Map)localObject1).put("blurRiness", Float.valueOf(0.4F));
    ((Map)localObject1).put("innerRadius", Float.valueOf(f3));
    ((Map)localObject1).put("outerRadius", Float.valueOf(60.0F + f3));
    ((Map)localObject1).put("tx", Float.valueOf(f1));
    ((Map)localObject1).put("ty", Float.valueOf(f2));
    ((Map)localObject1).put("theta", Float.valueOf(0.0F));
    ((Map)localObject1).put("eclipseA", Float.valueOf(1.5F));
    ((Map)localObject1).put("MethodType", Integer.valueOf(1));
    ((Map)localObject1).put("lumi_threshold", Float.valueOf(0.0F));
    ((Map)localObject1).put("lumi_weight", Float.valueOf(0.0F));
    ((Map)localObject1).put("defaultWidth", Float.valueOf(400.0F));
    Object localObject2 = GLES20.glGetString(7937);
    int i;
    if (localObject2 == null)
    {
      i = 0;
      label254: if (i == 0)
        break label889;
      ((Map)localObject1).put("bokehmode", Integer.valueOf(1));
    }
    while (true)
    {
      localc.setParameterDic((Map)localObject1);
      ((Map)localObject1).clear();
      localc.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      setNextFilter(localc, null);
      localObject2 = localc.getLastFilter();
      i = getTheFilterIndex((BaseFilter)localObject2);
      localObject1 = new BaseFilter(GLSLRender.bJB);
      ((BaseFilter)localObject1).scaleFact = Math.min(100.0F / Math.min(paramFloat2, paramFloat1), 1.0F);
      ((BaseFilter)localObject2).setNextFilter((BaseFilter)localObject1, null);
      localObject2 = new l();
      ((BaseFilter)localObject1).setNextFilter((BaseFilter)localObject2, new int[] { i + (this.srcTextureIndex + 1) });
      localObject1 = new BaseFilter(GLSLRender.bLI);
      ((BaseFilter)localObject1).addParam(new m.f("shadows", 0.45F));
      ((BaseFilter)localObject1).addParam(new m.f("highlights", 0.0F));
      ((BaseFilter)localObject2).setNextFilter((BaseFilter)localObject1, null);
      localObject2 = new BaseFilter(GLSLRender.bMy, GLSLRender.bLJ);
      ((BaseFilter)localObject2).addParam(new m.f("sharpness", 0.2F));
      ((BaseFilter)localObject2).addParam(new m.f("inputH", 1.0F));
      ((BaseFilter)localObject2).addParam(new m.f("inputS", 1.36F));
      ((BaseFilter)localObject2).addParam(new m.f("inputV", 1.1F));
      ((BaseFilter)localObject2).addParam(new m.f("imageWidthFactor", 1.0F / paramFloat1));
      ((BaseFilter)localObject2).addParam(new m.f("imageHeightFactor", 1.0F / paramFloat2));
      ((BaseFilter)localObject1).setNextFilter((BaseFilter)localObject2, null);
      localObject1 = new BaseFilter(GLSLRender.bJO);
      ((BaseFilter)localObject1).addParam(new m.f("contrast", 1.32F));
      ((BaseFilter)localObject1).addParam(new m.f("saturation", 0.758F));
      ((BaseFilter)localObject1).addParam(new m.f("brightness", 1.0F));
      ((BaseFilter)localObject2).setNextFilter((BaseFilter)localObject1, null);
      localObject2 = new BaseFilter(GLSLRender.bKG);
      ((BaseFilter)localObject2).addParam(new m.g("shadowsShift", new float[] { 0.0627451F, 0.0F, -0.0627451F }));
      ((BaseFilter)localObject2).addParam(new m.g("midtonesShift", new float[] { 0.0627451F, 0.0F, -0.0627451F }));
      ((BaseFilter)localObject2).addParam(new m.g("highlightsShift", new float[] { 0.0F, 0.0F, 0.0F }));
      ((BaseFilter)localObject2).addParam(new m.i("preserveLuminosity", 1));
      ((BaseFilter)localObject1).setNextFilter((BaseFilter)localObject2, null);
      localObject1 = new BaseFilter(GLSLRender.bKE);
      ((BaseFilter)localObject1).addParam(new m.f("scaleC", -0.2715F));
      ((BaseFilter)localObject1).addParam(new m.f("scaleT", 0.0F));
      ((BaseFilter)localObject2).setNextFilter((BaseFilter)localObject1, null);
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86518);
      break;
      if (((String)localObject2).indexOf("NVIDIA Tegra") != -1)
      {
        i = 0;
        break label254;
      }
      if (((String)localObject2).indexOf("VideoCore IV HW") != -1)
      {
        i = 0;
        break label254;
      }
      if (((String)localObject2).indexOf("PowerVR SGX 544MP") != -1)
      {
        i = 0;
        break label254;
      }
      i = 1;
      break label254;
      label889: ((Map)localObject1).put("bokehmode", Integer.valueOf(2));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.bk
 * JD-Core Version:    0.6.2
 */