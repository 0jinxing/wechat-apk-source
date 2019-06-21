package com.tencent.view;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.FilterWraper;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.a.by;
import com.tencent.filter.a.cj;
import com.tencent.filter.art.DofCpuFilter;
import com.tencent.filter.art.OilPaintFilter;
import com.tencent.filter.g;
import com.tencent.filter.i;
import com.tencent.filter.j;
import com.tencent.filter.n;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class e
{
  public static BaseFilter createFilter(int paramInt)
  {
    AppMethodBeat.i(86636);
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = cj.creatFilterById(paramInt);
    case 0:
    case 125:
    case 1:
    case 117:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 80:
    case 81:
    case 10:
    case 11:
    case 12:
    case 87:
    case 128:
    case 127:
    case 94:
    case 95:
    case 96:
    case 99:
    case 100:
    case 110:
    case 119:
    case 120:
    case 121:
    case 122:
    case 202:
    case 214:
    case 150:
    }
    while (true)
    {
      AppMethodBeat.o(86636);
      return localObject;
      localObject = new BaseFilter(GLSLRender.bJB);
      continue;
      localObject = new com.tencent.filter.f();
      continue;
      localObject = new com.tencent.filter.a(GLSLRender.bJE);
      continue;
      localObject = new com.tencent.filter.a(GLSLRender.bJF);
      continue;
      localObject = new com.tencent.filter.b(GLSLRender.bJB, 1);
      continue;
      localObject = new com.tencent.filter.e("rise.png");
      continue;
      localObject = new com.tencent.filter.b(GLSLRender.bJB, 0);
      continue;
      localObject = new by();
      continue;
      localObject = new com.tencent.filter.e("hudson.png");
      continue;
      localObject = new com.tencent.filter.art.a(GLSLRender.bJB);
      continue;
      localObject = new g();
      continue;
      localObject = new com.tencent.filter.e("xpro2.png");
      continue;
      localObject = new j();
      continue;
      localObject = new com.tencent.filter.art.e();
      continue;
      localObject = new com.tencent.filter.e("qiurisiyu.png");
      continue;
      localObject = new com.tencent.filter.e("jingdianheibai.png");
      ((com.tencent.filter.e)localObject).setMatrix(new float[] { 0.299F, 0.299F, 0.299F, 0.0F, 0.587F, 0.587F, 0.587F, 0.0F, 0.114F, 0.114F, 0.114F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F });
      continue;
      localObject = new com.tencent.filter.e("danya.png");
      ((com.tencent.filter.e)localObject).setMatrix(new float[] { 0.825F, 0.075F, 0.075F, 0.0F, 0.147F, 0.897F, 0.147F, 0.0F, 0.029F, 0.029F, 0.779F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F });
      continue;
      localObject = new BaseFilter(GLSLRender.bJL, "colorPencil.png");
      continue;
      localObject = new BaseFilter(GLSLRender.bKQ, "sketch.png");
      continue;
      localObject = new BaseFilter(GLSLRender.bKP);
      continue;
      localObject = new com.tencent.filter.art.b(0);
      continue;
      localObject = new com.tencent.filter.art.b(1);
      continue;
      localObject = new com.tencent.filter.art.b(2);
      continue;
      localObject = new OilPaintFilter(0);
      continue;
      localObject = new OilPaintFilter(1);
      continue;
      localObject = new DofCpuFilter(0);
      continue;
      localObject = new DofCpuFilter(1);
      continue;
      localObject = new com.tencent.filter.art.f();
      continue;
      localObject = new com.tencent.filter.art.d();
      continue;
      localObject = new i();
      continue;
      localObject = new com.tencent.filter.d();
      continue;
      localObject = new n();
      continue;
      localObject = new FilterWraper("Curve2D/amaro");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.view.e
 * JD-Core Version:    0.6.2
 */