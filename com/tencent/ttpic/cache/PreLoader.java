package com.tencent.ttpic.cache;

import android.graphics.Bitmap;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.thread.VideoThreadPool;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.io.File;
import java.util.Map;

public abstract class PreLoader
{
  public static final Object LOCK_IMAGE_PRE_LOADER = new Object();
  private static final String TAG = PreLoader.class.getSimpleName();
  protected Map<String, Bitmap> cache;
  protected int capacity;
  protected String dataPath;
  protected int frontIndex;
  private volatile boolean isRunning;
  protected StickerItem item;
  protected String materialId;
  private boolean prepared;
  protected int rearIndex;

  public PreLoader(Map<String, Bitmap> paramMap, String paramString, StickerItem paramStickerItem, int paramInt)
  {
    this.cache = paramMap;
    this.dataPath = paramString;
    this.materialId = VideoMaterialUtil.getMaterialId(paramString);
    this.item = paramStickerItem;
    this.capacity = paramInt;
  }

  private void releaseExpiredBitmaps(int paramInt1, int paramInt2)
  {
    while (paramInt1 != paramInt2)
    {
      ??? = this.materialId + File.separator + this.item.id + "_" + paramInt1 + ".png";
      Bitmap localBitmap = (Bitmap)this.cache.remove(???);
      synchronized (LOCK_IMAGE_PRE_LOADER)
      {
        if (BitmapUtils.isLegal(localBitmap))
          localBitmap.recycle();
        paramInt1 = (paramInt1 + 1) % this.item.frames;
      }
    }
  }

  public abstract void clear();

  public abstract void preloadNewImages(int paramInt);

  public void prepare()
  {
    reset();
  }

  public abstract void prepareImages();

  public void reset()
  {
    if (this.prepared);
    while (true)
    {
      return;
      this.prepared = true;
      VideoThreadPool.getInstance().submit(new PreLoader.1(this));
    }
  }

  public void updateIndex(int paramInt)
  {
    if ((paramInt == this.frontIndex) || (this.isRunning));
    while (true)
    {
      return;
      this.prepared = false;
      releaseExpiredBitmaps(this.frontIndex, paramInt);
      this.isRunning = true;
      VideoThreadPool.getInstance().submit(new PreLoader.2(this, paramInt));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.PreLoader
 * JD-Core Version:    0.6.2
 */