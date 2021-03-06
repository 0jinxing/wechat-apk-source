package com.tencent.ttpic.cache;

import android.graphics.Bitmap;
import android.opengl.ETC1Util.ETC1Texture;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.filter.FabbyMvPart;
import com.tencent.ttpic.filter.FabbyParts;
import com.tencent.ttpic.gameplaysdk.model.GameParams;
import com.tencent.ttpic.gameplaysdk.model.StickerItem3D;
import com.tencent.ttpic.model.FaceFeatureItem;
import com.tencent.ttpic.model.FaceItem;
import com.tencent.ttpic.model.MultiViewerItem;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.VideoMaterial;
import com.tencent.ttpic.util.FaceOffUtil.FEATURE_TYPE;
import com.tencent.ttpic.util.VideoFilterFactory.STICKER_TYPE;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class VideoMemoryManager
{
  private static final String TAG;
  public static final int VIDEO_CACHE_MEM_CACHE_MIN_SIZE_IN_KB = 51200;
  public static final int VIDEO_CACHE_MEM_CACHE_REMAIN_SIZE = 10240;
  private static final VideoMemoryManager mInstance;
  private final Map<String, Bitmap> mBeautyFaceCache;
  private final Map<String, Bitmap> mCache;
  private double mCurMaterialSizeInMB;
  private final Map<String, ETC1Util.ETC1Texture> mETCCache;
  private final Map<FaceOffUtil.FEATURE_TYPE, Bitmap> mGrayCache;
  private final Handler mHandler;
  private int mInitSampleSize;
  private int mMaxPreloadSizeInKB;
  private int mSampleSize;
  private final Map<String, LoadItemManager> managers;

  static
  {
    AppMethodBeat.i(81850);
    TAG = VideoMemoryManager.class.getSimpleName();
    mInstance = new VideoMemoryManager();
    AppMethodBeat.o(81850);
  }

  private VideoMemoryManager()
  {
    AppMethodBeat.i(81833);
    this.mInitSampleSize = 1;
    this.managers = new ConcurrentHashMap();
    this.mCache = new ConcurrentHashMap();
    this.mGrayCache = new ConcurrentHashMap();
    this.mETCCache = new ConcurrentHashMap();
    this.mHandler = new Handler(HandlerThreadManager.getInstance().getHanderThread(TAG).getLooper());
    this.mBeautyFaceCache = new ConcurrentHashMap();
    AppMethodBeat.o(81833);
  }

  public static VideoMemoryManager getInstance()
  {
    return mInstance;
  }

  private long getMaterialImageSizeInKB(VideoMaterial paramVideoMaterial)
  {
    long l1 = 0L;
    AppMethodBeat.i(81837);
    long l2;
    if (paramVideoMaterial == null)
    {
      AppMethodBeat.o(81837);
      l2 = l1;
    }
    while (true)
    {
      return l2;
      Object localObject1 = new ArrayList();
      if (paramVideoMaterial.getItemList() != null)
        ((List)localObject1).addAll(paramVideoMaterial.getItemList());
      if (paramVideoMaterial.getHeadCropItemList() != null)
        ((List)localObject1).addAll(paramVideoMaterial.getHeadCropItemList());
      Object localObject2;
      Object localObject3;
      if (paramVideoMaterial.getFabbyParts() != null)
      {
        localObject2 = paramVideoMaterial.getFabbyParts().getParts().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (FabbyMvPart)((Iterator)localObject2).next();
          if (((FabbyMvPart)localObject3).bgItem != null)
            ((List)localObject1).add(((FabbyMvPart)localObject3).bgItem);
          if (((FabbyMvPart)localObject3).fgItem != null)
            ((List)localObject1).add(((FabbyMvPart)localObject3).fgItem);
          if (((FabbyMvPart)localObject3).coverItem != null)
            ((List)localObject1).add(((FabbyMvPart)localObject3).coverItem);
          if (((FabbyMvPart)localObject3).transitionItem != null)
            ((List)localObject1).add(((FabbyMvPart)localObject3).transitionItem);
        }
      }
      if (paramVideoMaterial.getFaceFeatureItemList() != null)
      {
        localObject3 = paramVideoMaterial.getFaceFeatureItemList().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (FaceFeatureItem)((Iterator)localObject3).next();
          if ((localObject2 != null) && (((FaceFeatureItem)localObject2).getStickerItems() != null))
            ((List)localObject1).addAll(((FaceFeatureItem)localObject2).getStickerItems());
        }
      }
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (StickerItem)((Iterator)localObject1).next();
        l1 = VideoMaterialUtil.getAllImageSize(paramVideoMaterial.getDataPath() + File.separator + ((StickerItem)localObject3).subFolder) / 1024 + l1;
      }
      l2 = l1;
      if (paramVideoMaterial.getFaceOffItemList() != null)
      {
        localObject1 = paramVideoMaterial.getFaceOffItemList().iterator();
        while (true)
        {
          l2 = l1;
          if (!((Iterator)localObject1).hasNext())
            break;
          localObject3 = (FaceItem)((Iterator)localObject1).next();
          if (!TextUtils.isEmpty(((FaceItem)localObject3).id))
            l1 += VideoMaterialUtil.getAllImageSize(paramVideoMaterial.getDataPath() + File.separator + ((FaceItem)localObject3).id) / 1024;
        }
      }
      l1 = l2;
      if (paramVideoMaterial.getFaceFeatureItemList() != null)
      {
        localObject1 = paramVideoMaterial.getFaceFeatureItemList().iterator();
        do
        {
          l1 = l2;
          if (!((Iterator)localObject1).hasNext())
            break;
          localObject3 = (FaceFeatureItem)((Iterator)localObject1).next();
        }
        while ((localObject3 == null) || (((FaceFeatureItem)localObject3).getFaceOffItemList() == null));
        localObject2 = ((FaceFeatureItem)localObject3).getFaceOffItemList().iterator();
        l1 = l2;
        while (true)
        {
          l2 = l1;
          if (!((Iterator)localObject2).hasNext())
            break;
          localObject3 = (FaceItem)((Iterator)localObject2).next();
          if (!TextUtils.isEmpty(((FaceItem)localObject3).id))
            l1 += VideoMaterialUtil.getAllImageSize(paramVideoMaterial.getDataPath() + File.separator + ((FaceItem)localObject3).id) / 1024;
        }
      }
      paramVideoMaterial = paramVideoMaterial.getMultiViewerItemList();
      l2 = l1;
      if (paramVideoMaterial != null)
      {
        paramVideoMaterial = paramVideoMaterial.iterator();
        while (true)
        {
          l2 = l1;
          if (!paramVideoMaterial.hasNext())
            break;
          localObject1 = (MultiViewerItem)paramVideoMaterial.next();
          if (localObject1 != null)
            l1 += getMaterialImageSizeInKB(((MultiViewerItem)localObject1).videoMaterial);
        }
      }
      AppMethodBeat.o(81837);
    }
  }

  private void loadAllItemsAppend(VideoMaterial paramVideoMaterial, int paramInt)
  {
    AppMethodBeat.i(81836);
    if (paramVideoMaterial == null)
      AppMethodBeat.o(81836);
    while (true)
    {
      return;
      Object localObject2;
      if (paramVideoMaterial.getFaceOffItemList() != null)
      {
        localObject1 = paramVideoMaterial.getFaceOffItemList().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (FaceItem)((Iterator)localObject1).next();
          if (!VideoMaterialUtil.isEmptyItem((FaceItem)localObject2))
          {
            if (TextUtils.isEmpty(((FaceItem)localObject2).id));
            for (localObject3 = ((FaceItem)localObject2).faceExchangeImage; ; localObject3 = ((FaceItem)localObject2).id)
            {
              this.managers.put(localObject3, new LoadFaceItemManager(this.mCache, this.mGrayCache, paramVideoMaterial.getDataPath(), (FaceItem)localObject2, paramInt));
              break;
            }
          }
        }
      }
      Object localObject4;
      if (paramVideoMaterial.getFaceFeatureItemList() != null)
      {
        localObject2 = paramVideoMaterial.getFaceFeatureItemList().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          FaceFeatureItem localFaceFeatureItem = (FaceFeatureItem)((Iterator)localObject2).next();
          if ((localFaceFeatureItem != null) && (localFaceFeatureItem.getFaceOffItemList() != null))
          {
            localObject4 = localFaceFeatureItem.getFaceOffItemList().iterator();
            label192: 
            while (((Iterator)localObject4).hasNext())
            {
              localObject1 = (FaceItem)((Iterator)localObject4).next();
              if (!VideoMaterialUtil.isEmptyItem((FaceItem)localObject1))
                if (!TextUtils.isEmpty(((FaceItem)localObject1).id))
                  break label273;
            }
            label273: for (localObject3 = ((FaceItem)localObject1).faceExchangeImage; ; localObject3 = ((FaceItem)localObject1).id)
            {
              this.managers.put(localObject3, new LoadFaceItemManager(this.mCache, this.mGrayCache, localFaceFeatureItem.getDataPath(), (FaceItem)localObject1, paramInt));
              break label192;
              break;
            }
          }
        }
      }
      Object localObject3 = new ArrayList();
      if (paramVideoMaterial.getItemList() != null)
        ((List)localObject3).addAll(paramVideoMaterial.getItemList());
      if (paramVideoMaterial.getHeadCropItemList() != null)
        ((List)localObject3).addAll(paramVideoMaterial.getHeadCropItemList());
      if (paramVideoMaterial.getFabbyParts() != null)
      {
        localObject2 = paramVideoMaterial.getFabbyParts().getParts().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (FabbyMvPart)((Iterator)localObject2).next();
          if (((FabbyMvPart)localObject1).bgItem != null)
            ((List)localObject3).add(((FabbyMvPart)localObject1).bgItem);
          if (((FabbyMvPart)localObject1).fgItem != null)
            ((List)localObject3).add(((FabbyMvPart)localObject1).fgItem);
          if (((FabbyMvPart)localObject1).coverItem != null)
            ((List)localObject3).add(((FabbyMvPart)localObject1).coverItem);
          if (((FabbyMvPart)localObject1).transitionItem != null)
            ((List)localObject3).add(((FabbyMvPart)localObject1).transitionItem);
        }
      }
      if (paramVideoMaterial.getFaceFeatureItemList() != null)
      {
        localObject1 = paramVideoMaterial.getFaceFeatureItemList().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (FaceFeatureItem)((Iterator)localObject1).next();
          if ((localObject2 != null) && (((FaceFeatureItem)localObject2).getStickerItems() != null))
            ((List)localObject3).addAll(((FaceFeatureItem)localObject2).getStickerItems());
        }
      }
      Object localObject1 = ((List)localObject3).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (StickerItem)((Iterator)localObject1).next();
        if ((!this.managers.containsKey(((StickerItem)localObject3).id)) && (!VideoMaterialUtil.isEmptyItem((StickerItem)localObject3)))
          if (((StickerItem)localObject3).stickerType == VideoFilterFactory.STICKER_TYPE.ETC.type)
            this.managers.put(((StickerItem)localObject3).id, new LoadETCItemManager(this.mETCCache, paramVideoMaterial.getDataPath(), (StickerItem)localObject3));
          else
            this.managers.put(((StickerItem)localObject3).id, new LoadStickerItemManager(this.mCache, paramVideoMaterial.getDataPath(), (StickerItem)localObject3, LoadItemManager.LOAD_TYPE.LOAD_ALL, paramInt));
      }
      localObject1 = paramVideoMaterial.getItemList3D();
      if (localObject1 != null)
      {
        if ((paramVideoMaterial.getGameParams() != null) && (paramVideoMaterial.getGameParams().textureImages != null))
          this.managers.put("", new Load3DTextureManager(paramVideoMaterial.getDataPath(), paramVideoMaterial.getGameParams().textureImages));
        localObject3 = new HashSet();
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (StickerItem3D)((Iterator)localObject1).next();
          if (((StickerItem3D)localObject2).id.contains(":"))
          {
            localObject4 = ((StickerItem3D)localObject2).id.split(":");
            if (localObject4.length == 2)
            {
              localObject4 = localObject4[1];
              if (!((Set)localObject3).contains(localObject4))
              {
                this.managers.put(((StickerItem3D)localObject2).id, new LoadStickerItemManager3D(paramVideoMaterial.getDataPath(), (StickerItem3D)localObject2, (String)localObject4, LoadItemManager.LOAD_TYPE.LOAD_ALL));
                ((Set)localObject3).add(localObject4);
              }
            }
          }
        }
      }
      AppMethodBeat.o(81836);
    }
  }

  private void loadImportMaterial(VideoMaterial paramVideoMaterial, int paramInt)
  {
    AppMethodBeat.i(81835);
    Iterator localIterator = paramVideoMaterial.getMultiViewerItemList().iterator();
    while (localIterator.hasNext())
    {
      paramVideoMaterial = (MultiViewerItem)localIterator.next();
      if (paramVideoMaterial != null)
        loadAllItemsAppend(paramVideoMaterial.videoMaterial, paramInt);
    }
    AppMethodBeat.o(81835);
  }

  public void clear()
  {
    AppMethodBeat.i(81843);
    ??? = this.managers.values().iterator();
    while (((Iterator)???).hasNext())
      ((LoadItemManager)((Iterator)???).next()).clear();
    this.managers.clear();
    synchronized (PreLoader.LOCK_IMAGE_PRE_LOADER)
    {
      localIterator = this.mCache.values().iterator();
      while (localIterator.hasNext())
      {
        Bitmap localBitmap1 = (Bitmap)localIterator.next();
        if (BitmapUtils.isLegal(localBitmap1))
          localBitmap1.recycle();
      }
    }
    Iterator localIterator = this.mGrayCache.values().iterator();
    while (localIterator.hasNext())
    {
      Bitmap localBitmap2 = (Bitmap)localIterator.next();
      if (BitmapUtils.isLegal(localBitmap2))
        localBitmap2.recycle();
    }
    this.mCache.clear();
    this.mGrayCache.clear();
    this.mCurMaterialSizeInMB = 0.0D;
    AppMethodBeat.o(81843);
  }

  public Bitmap getBeautyFaceCacheBitmap(String paramString)
  {
    AppMethodBeat.i(81845);
    paramString = (Bitmap)this.mBeautyFaceCache.get(paramString);
    AppMethodBeat.o(81845);
    return paramString;
  }

  public double getMaterialSizeInMB()
  {
    return this.mCurMaterialSizeInMB;
  }

  public int getSampleSize()
  {
    return this.mSampleSize;
  }

  public void loadAllImages(VideoMaterial paramVideoMaterial)
  {
    AppMethodBeat.i(81834);
    clear();
    this.mHandler.post(new VideoMemoryManager.1(this, paramVideoMaterial));
    AppMethodBeat.o(81834);
  }

  public void loadBeautyFaceCacheBitmap(List<String> paramList)
  {
    AppMethodBeat.i(81846);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      if ((!this.mBeautyFaceCache.containsKey(paramList)) || (BitmapUtils.isLegal((Bitmap)this.mBeautyFaceCache.get(paramList))));
    }
    AppMethodBeat.o(81846);
  }

  public ETC1Util.ETC1Texture loadETCAlphaTexture(String paramString, int paramInt)
  {
    AppMethodBeat.i(81842);
    paramString = (LoadItemManager)this.managers.get(paramString);
    if (paramString != null)
    {
      paramString = paramString.loadETCAlphaTexture(paramInt);
      AppMethodBeat.o(81842);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(81842);
    }
  }

  public ETC1Util.ETC1Texture loadETCRGBTexture(String paramString, int paramInt)
  {
    AppMethodBeat.i(81841);
    paramString = (LoadItemManager)this.managers.get(paramString);
    if (paramString != null)
    {
      paramString = paramString.loadETCRGBTexture(paramInt);
      AppMethodBeat.o(81841);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(81841);
    }
  }

  public Bitmap loadImage(FaceOffUtil.FEATURE_TYPE paramFEATURE_TYPE)
  {
    AppMethodBeat.i(81840);
    paramFEATURE_TYPE = (Bitmap)this.mGrayCache.get(paramFEATURE_TYPE);
    AppMethodBeat.o(81840);
    return paramFEATURE_TYPE;
  }

  public Bitmap loadImage(String paramString, int paramInt)
  {
    AppMethodBeat.i(81839);
    paramString = (LoadItemManager)this.managers.get(paramString);
    if (paramString != null)
    {
      paramString = paramString.loadImage(paramInt);
      AppMethodBeat.o(81839);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(81839);
    }
  }

  public Bitmap loadImage(String paramString1, String paramString2)
  {
    AppMethodBeat.i(81838);
    paramString1 = (LoadItemManager)this.managers.get(paramString1);
    if (paramString1 != null)
    {
      paramString1 = paramString1.loadImage(paramString2);
      AppMethodBeat.o(81838);
    }
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(81838);
    }
  }

  public void reset(String paramString)
  {
    AppMethodBeat.i(81844);
    paramString = (LoadItemManager)this.managers.get(paramString);
    if (paramString != null)
      paramString.reset();
    AppMethodBeat.o(81844);
  }

  public void setMaxPreloadMemorySizeInKB(int paramInt)
  {
    this.mMaxPreloadSizeInKB = paramInt;
  }

  public void setSampleSize(int paramInt)
  {
    this.mInitSampleSize = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.VideoMemoryManager
 * JD-Core Version:    0.6.2
 */