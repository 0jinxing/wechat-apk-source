package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.art.a;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class cu$e extends BaseFilter
{
  public cu$e()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86558);
    a locala = new a(GLSLRender.bJB);
    Object localObject = new HashMap();
    ((Map)localObject).put("intensity", Float.valueOf(0.65F));
    locala.setParameterDic((Map)localObject);
    setNextFilter(locala, null);
    localObject = new ab();
    ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "weizhidao/xinxian_lf.png", 33986));
    locala.setNextFilter((BaseFilter)localObject, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86558);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.cu.e
 * JD-Core Version:    0.6.2
 */