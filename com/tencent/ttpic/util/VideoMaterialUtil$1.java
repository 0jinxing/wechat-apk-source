package com.tencent.ttpic.util;

import com.tencent.ttpic.model.StickerItem;
import java.util.Comparator;

final class VideoMaterialUtil$1
  implements Comparator<StickerItem>
{
  public final int compare(StickerItem paramStickerItem1, StickerItem paramStickerItem2)
  {
    return paramStickerItem1.type - paramStickerItem2.type;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.1
 * JD-Core Version:    0.6.2
 */