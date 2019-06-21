package com.tencent.filter.a;

import android.graphics.Bitmap;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.art.a;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.b;
import java.util.HashMap;
import java.util.Map;

public final class cs extends BaseFilter
{
  public cs()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86552);
    a locala = new a(GLSLRender.bJB);
    Object localObject = new HashMap();
    ((Map)localObject).put("intensity", Float.valueOf(0.65F));
    locala.setParameterDic((Map)localObject);
    setNextFilter(locala, null);
    localObject = new ab();
    boolean bool = b.AIE;
    b.AIE = true;
    Bitmap localBitmap = b.vt("filter/egWeizhidao/eftXinxian/xinxian_lf.png");
    b.AIE = bool;
    ((BaseFilter)localObject).addParam(new m.k("inputImageTexture2", localBitmap, 33986, true));
    locala.setNextFilter((BaseFilter)localObject, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.cs
 * JD-Core Version:    0.6.2
 */