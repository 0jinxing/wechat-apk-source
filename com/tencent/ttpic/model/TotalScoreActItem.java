package com.tencent.ttpic.model;

import com.tencent.filter.BaseFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TotalScoreActItem extends SingleScoreActItem
{
  public TotalScoreActItem(CaptureActItem paramCaptureActItem, BaseFilter paramBaseFilter)
  {
    super(paramCaptureActItem, paramBaseFilter);
  }

  protected int getScore(CanvasItem paramCanvasItem)
  {
    AppMethodBeat.i(83551);
    int i = this.captureActItem.getTotalScore();
    AppMethodBeat.o(83551);
    return i;
  }

  protected int[] getScoreTexture(CanvasItem paramCanvasItem)
  {
    AppMethodBeat.i(83552);
    paramCanvasItem = this.captureActItem.getTotalScoreTexture();
    AppMethodBeat.o(83552);
    return paramCanvasItem;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.TotalScoreActItem
 * JD-Core Version:    0.6.2
 */