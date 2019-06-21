package com.tencent.ttpic.filter;

import com.tencent.ttpic.model.RenderParam;
import java.util.Comparator;

class FastRenderFilter$1
  implements Comparator<RenderParam>
{
  FastRenderFilter$1(FastRenderFilter paramFastRenderFilter)
  {
  }

  public int compare(RenderParam paramRenderParam1, RenderParam paramRenderParam2)
  {
    return paramRenderParam1.texture - paramRenderParam2.texture;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FastRenderFilter.1
 * JD-Core Version:    0.6.2
 */