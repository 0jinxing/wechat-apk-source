package com.tencent.ttpic.util.youtu;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class YtHandBox
{
  public float confidence = 0.0F;
  public int handType = -999;
  public float height = 0.0F;
  public long makeTime = 0L;
  public float width = 0.0F;
  public float x = 0.0F;
  public float y = 0.0F;

  public YtHandBox copy()
  {
    AppMethodBeat.i(84415);
    YtHandBox localYtHandBox = new YtHandBox();
    localYtHandBox.x = this.x;
    localYtHandBox.y = this.y;
    localYtHandBox.width = this.width;
    localYtHandBox.height = this.height;
    localYtHandBox.confidence = this.confidence;
    localYtHandBox.makeTime = this.makeTime;
    localYtHandBox.handType = this.handType;
    AppMethodBeat.o(84415);
    return localYtHandBox;
  }

  public boolean isValid()
  {
    if ((this.width > 0.0F) && (this.height > 0.0F));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void reset()
  {
    this.confidence = 0.0F;
    this.height = 0.0F;
    this.width = 0.0F;
    this.y = 0.0F;
    this.x = 0.0F;
    this.makeTime = 0L;
    this.handType = -999;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.YtHandBox
 * JD-Core Version:    0.6.2
 */