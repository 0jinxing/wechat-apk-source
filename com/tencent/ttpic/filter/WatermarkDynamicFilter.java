package com.tencent.ttpic.filter;

import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.WMGroup;

public class WatermarkDynamicFilter extends DynamicStickerFilter
{
  public WatermarkDynamicFilter(StickerItem paramStickerItem, String paramString)
  {
    super(paramStickerItem, paramString);
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(83186);
    super.ApplyGLSLFilter();
    if (this.item.wmGroup != null)
      this.item.wmGroup.init();
    AppMethodBeat.o(83186);
  }

  public void clearGLSLSelf()
  {
    AppMethodBeat.i(83187);
    super.clearGLSLSelf();
    if (this.item.wmGroup != null)
      this.item.wmGroup.clear();
    AppMethodBeat.o(83187);
  }

  public void reset()
  {
    AppMethodBeat.i(83188);
    this.item.wmGroup.reset();
    super.reset();
    AppMethodBeat.o(83188);
  }

  protected void updateTextureParam(int paramInt, long paramLong)
  {
    AppMethodBeat.i(83185);
    if (this.item.wmGroup != null)
    {
      this.item.wmGroup.updateTexture(paramLong);
      this.isImageReady = true;
      addParam(new m.n("inputImageTexture2", this.item.wmGroup.getTexture(), 33986));
      AppMethodBeat.o(83185);
    }
    while (true)
    {
      return;
      this.isImageReady = false;
      clearTextureParam();
      AppMethodBeat.o(83185);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.WatermarkDynamicFilter
 * JD-Core Version:    0.6.2
 */