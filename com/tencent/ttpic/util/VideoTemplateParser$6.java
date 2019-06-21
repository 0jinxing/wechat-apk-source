package com.tencent.ttpic.util;

import com.tencent.ttpic.model.GridModel;
import java.util.Comparator;

final class VideoTemplateParser$6
  implements Comparator<GridModel>
{
  public final int compare(GridModel paramGridModel1, GridModel paramGridModel2)
  {
    return paramGridModel1.zIndex - paramGridModel2.zIndex;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoTemplateParser.6
 * JD-Core Version:    0.6.2
 */