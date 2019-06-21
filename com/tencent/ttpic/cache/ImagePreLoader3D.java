package com.tencent.ttpic.cache;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.config.MediaConfig;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.io.File;
import java.util.Map;

public class ImagePreLoader3D extends PreLoader
{
  private static final String TAG;

  static
  {
    AppMethodBeat.i(81773);
    TAG = ImagePreLoader3D.class.getSimpleName();
    AppMethodBeat.o(81773);
  }

  public ImagePreLoader3D(Map<String, Bitmap> paramMap, String paramString, StickerItem paramStickerItem, int paramInt)
  {
    super(paramMap, paramString, paramStickerItem, paramInt);
  }

  public void clear()
  {
  }

  public void preloadNewImages(int paramInt)
  {
    AppMethodBeat.i(81772);
    this.frontIndex = paramInt;
    this.rearIndex = ((this.frontIndex + this.capacity) % this.item.frames);
    paramInt = this.frontIndex;
    if (paramInt != this.rearIndex)
    {
      Object localObject1 = this.item.id + "_" + paramInt + ".png";
      if (TextUtils.isEmpty(this.materialId));
      for (Object localObject2 = localObject1; ; localObject2 = this.materialId + File.separator + (String)localObject1)
      {
        if (!this.cache.containsKey(localObject2))
        {
          localObject1 = this.dataPath + File.separator + this.item.subFolder + File.separator + (String)localObject1;
          localObject1 = BitmapUtils.decodeSampleBitmap(VideoGlobalContext.getContext(), (String)localObject1, MediaConfig.VIDEO_OUTPUT_WIDTH, MediaConfig.VIDEO_OUTPUT_HEIGHT);
          if (BitmapUtils.isLegal((Bitmap)localObject1))
            this.cache.put(localObject2, localObject1);
        }
        paramInt = (paramInt + 1) % this.item.frames;
        break;
      }
    }
    AppMethodBeat.o(81772);
  }

  public void prepareImages()
  {
    int i = 0;
    AppMethodBeat.i(81771);
    this.frontIndex = 0;
    if ((i < this.capacity) && (i < this.item.frames))
    {
      String str = this.item.id + "_" + i + ".png";
      Object localObject = this.dataPath + File.separator + this.item.subFolder + File.separator + str;
      localObject = BitmapUtils.decodeSampleBitmap(VideoGlobalContext.getContext(), (String)localObject, MediaConfig.VIDEO_OUTPUT_WIDTH, MediaConfig.VIDEO_OUTPUT_HEIGHT);
      if (TextUtils.isEmpty(this.materialId));
      while (true)
      {
        if ((BitmapUtils.isLegal((Bitmap)localObject)) && (!this.cache.containsKey(str)))
          this.cache.put(str, localObject);
        this.rearIndex = i;
        i++;
        break;
        str = this.materialId + File.separator + str;
      }
    }
    AppMethodBeat.o(81771);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.ImagePreLoader3D
 * JD-Core Version:    0.6.2
 */