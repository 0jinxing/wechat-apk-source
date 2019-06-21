package com.tencent.ttpic.filter;

import com.tencent.ttpic.model.CanvasItem;
import java.util.Comparator;

final class ActFilters$1
  implements Comparator<CanvasItem>
{
  public final int compare(CanvasItem paramCanvasItem1, CanvasItem paramCanvasItem2)
  {
    return paramCanvasItem1.zIndex - paramCanvasItem2.zIndex;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.ActFilters.1
 * JD-Core Version:    0.6.2
 */