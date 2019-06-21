package com.tencent.ttpic.util;

import com.tencent.ttpic.model.StickerItem;
import java.util.Comparator;

final class VideoTemplateParser$2
  implements Comparator<StickerItem>
{
  public final int compare(StickerItem paramStickerItem1, StickerItem paramStickerItem2)
  {
    return paramStickerItem1.zIndex - paramStickerItem2.zIndex;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoTemplateParser.2
 * JD-Core Version:    0.6.2
 */