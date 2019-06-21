package com.tencent.ttpic.cache;

import android.graphics.Bitmap;
import android.opengl.ETC1Util.ETC1Texture;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.thread.VideoThreadPool;
import com.tencent.ttpic.util.VideoFilterUtil;
import com.tencent.ttpic.util.VideoMaterialUtil;
import com.tencent.ttpic.util.VideoMaterialUtil.ITEM_SOURCE_TYPE;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LoadStickerItemManager
  implements LoadItemManager
{
  private static final int CAPACITY = 5;
  public static final Comparator<String> mPngComperator;
  private String dataPath;
  private StickerItem item;
  private LoadItemManager.LOAD_TYPE loadType;
  private Map<String, Bitmap> mCache;
  private AsyncTask<Void, Integer, Boolean> mImageTask;
  private PreLoader mPreLoader;
  private int sampleSize;

  static
  {
    AppMethodBeat.i(81818);
    mPngComperator = new LoadStickerItemManager.1();
    AppMethodBeat.o(81818);
  }

  public LoadStickerItemManager(Map<String, Bitmap> paramMap, String paramString, StickerItem paramStickerItem, LoadItemManager.LOAD_TYPE paramLOAD_TYPE, int paramInt)
  {
    AppMethodBeat.i(81812);
    this.dataPath = paramString;
    this.item = paramStickerItem;
    this.mCache = paramMap;
    this.sampleSize = paramInt;
    if (paramStickerItem.markMode != 0)
    {
      this.loadType = LoadItemManager.LOAD_TYPE.LOAD_ALL;
      AppMethodBeat.o(81812);
    }
    while (true)
    {
      return;
      this.loadType = paramLOAD_TYPE;
      AppMethodBeat.o(81812);
    }
  }

  public void clear()
  {
    AppMethodBeat.i(81816);
    if (this.mImageTask != null)
      this.mImageTask.cancel(true);
    if (this.mPreLoader != null)
      this.mPreLoader.clear();
    AppMethodBeat.o(81816);
  }

  public ETC1Util.ETC1Texture loadETCAlphaTexture(int paramInt)
  {
    return null;
  }

  public ETC1Util.ETC1Texture loadETCRGBTexture(int paramInt)
  {
    return null;
  }

  public Bitmap loadImage(int paramInt)
  {
    AppMethodBeat.i(81814);
    if (this.mPreLoader != null)
      this.mPreLoader.updateIndex(paramInt);
    Object localObject = VideoMaterialUtil.getMaterialId(this.dataPath) + File.separator + this.item.id + "_" + paramInt + ".png";
    localObject = (Bitmap)this.mCache.get(localObject);
    AppMethodBeat.o(81814);
    return localObject;
  }

  public Bitmap loadImage(String paramString)
  {
    AppMethodBeat.i(81815);
    paramString = VideoMaterialUtil.getMaterialId(this.dataPath) + File.separator + paramString;
    paramString = (Bitmap)this.mCache.get(paramString);
    AppMethodBeat.o(81815);
    return paramString;
  }

  public void prepareImages()
  {
    AppMethodBeat.i(81813);
    if (this.loadType == LoadItemManager.LOAD_TYPE.LOAD_ALL)
    {
      if (this.item.sourceType != VideoMaterialUtil.ITEM_SOURCE_TYPE.IMAGE)
        break label453;
      HashSet localHashSet = new HashSet();
      ArrayList localArrayList = new ArrayList(this.item.frames);
      if (this.item.markMode != 0)
      {
        for (i = 0; i <= 10; i++)
          for (int j = 0; j < this.item.frames; j++)
            localArrayList.add(this.item.id + "_" + j + "_" + i + ".png");
        for (i = 0; i < this.item.frames; i++)
          localArrayList.add(this.item.id + "_" + i + "_x.png");
      }
      localHashSet.addAll(VideoFilterUtil.getAllPngFileNames(this.dataPath + File.separator + this.item.subFolder));
      for (int i = 0; i < this.item.frames; i++)
        localHashSet.add(this.item.id + "_" + i + ".png");
      localArrayList.addAll(localHashSet);
      Collections.sort(localArrayList, mPngComperator);
      this.mImageTask = new LoadImageTask(this.mCache, localArrayList, this.dataPath + File.separator + this.item.subFolder, VideoMaterialUtil.getMaterialId(this.dataPath), this.sampleSize);
      this.mImageTask.executeOnExecutor(VideoThreadPool.getInstance().getDualThreadExecutor(), new Void[0]);
      AppMethodBeat.o(81813);
    }
    while (true)
    {
      return;
      if (this.item.sourceType == VideoMaterialUtil.ITEM_SOURCE_TYPE.IMAGE)
      {
        this.mPreLoader = new ImagePreLoader(this.mCache, this.dataPath, this.item, 5);
        this.mPreLoader.prepare();
      }
      label453: AppMethodBeat.o(81813);
    }
  }

  public void reset()
  {
    AppMethodBeat.i(81817);
    if (this.mPreLoader != null)
      this.mPreLoader.reset();
    AppMethodBeat.o(81817);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.LoadStickerItemManager
 * JD-Core Version:    0.6.2
 */