package com.tencent.ttpic.model;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.cache.VideoMemoryManager;
import com.tencent.ttpic.logic.watermark.LogicDataManager;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.io.File;

public class ImageWMElement extends WMElement
{
  private static final String TAG;
  private long firstTimestamp;
  private boolean loadImageSuccess;

  static
  {
    AppMethodBeat.i(83506);
    TAG = ImageWMElement.class.getSimpleName();
    AppMethodBeat.o(83506);
  }

  private int getFrameIndex(long paramLong)
  {
    if (this.firstTimestamp <= 0L)
      this.firstTimestamp = paramLong;
    if (this.frames <= 0);
    for (int i = 0; ; i = (int)((paramLong - this.firstTimestamp) / this.frameDuration) % this.frames)
      return i;
  }

  private String getValue(int paramInt)
  {
    AppMethodBeat.i(83500);
    String str1;
    if (!TextUtils.isEmpty(this.userValue))
    {
      str1 = this.userValue;
      AppMethodBeat.o(83500);
    }
    while (true)
    {
      return str1;
      str1 = "";
      if (this.imgPath != null)
        str1 = new String(this.imgPath);
      String str2 = str1;
      if (this.logic != null)
        str2 = str1.replace("[logic]", this.logic.getValue(this.userValue));
      str1 = LogicDataManager.getInstance().replaceWithData(str2, this.dataKeys).replace("%d", String.valueOf(paramInt));
      AppMethodBeat.o(83500);
    }
  }

  private boolean needUpdateImage()
  {
    AppMethodBeat.i(83503);
    boolean bool;
    if ((!this.curValue.equals(this.lastValue)) || (!this.loadImageSuccess) || (!TextUtils.isEmpty(this.animateType)))
    {
      bool = true;
      AppMethodBeat.o(83503);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(83503);
    }
  }

  public Bitmap getBitmap()
  {
    AppMethodBeat.i(83504);
    this.lastValue = this.curValue;
    setContentChanged(false);
    Bitmap localBitmap = super.getBitmap();
    AppMethodBeat.o(83504);
    return localBitmap;
  }

  public void init()
  {
    AppMethodBeat.i(83499);
    super.init();
    this.curValue = getValue(0);
    AppMethodBeat.o(83499);
  }

  public void reset()
  {
    AppMethodBeat.i(83505);
    this.firstTimestamp = 0L;
    setContentChanged(false);
    AppMethodBeat.o(83505);
  }

  public boolean updateBitmap(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(83502);
    paramBoolean = updateBitmap(paramLong, paramBoolean, false);
    AppMethodBeat.o(83502);
    return paramBoolean;
  }

  public boolean updateBitmap(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(83501);
    BenchUtil.benchStart("ImageUpdateBitmap");
    this.curValue = getValue(getFrameIndex(paramLong));
    paramBoolean1 = bool1;
    Bitmap localBitmap;
    if (needUpdateImage())
    {
      if ((!paramBoolean2) || (TextUtils.isEmpty(this.dataPath)))
        break label169;
      localBitmap = BitmapUtils.decodeSampleBitmap(VideoGlobalContext.getContext(), this.dataPath + File.separator + this.itemId + File.separator + this.curValue, 1);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
        break label188;
      setIdleBitmap(localBitmap);
      swapActiveBitmap();
      setContentChanged(true);
      this.loadImageSuccess = true;
      paramBoolean1 = bool2;
      if (this.firstDrew)
        paramBoolean1 = true;
      this.firstDrew = true;
    }
    while (true)
    {
      BenchUtil.benchEnd("ImageUpdateBitmap");
      AppMethodBeat.o(83501);
      return paramBoolean1;
      label169: localBitmap = VideoMemoryManager.getInstance().loadImage(this.itemId, this.curValue);
      break;
      label188: this.loadImageSuccess = false;
      paramBoolean1 = bool1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.ImageWMElement
 * JD-Core Version:    0.6.2
 */