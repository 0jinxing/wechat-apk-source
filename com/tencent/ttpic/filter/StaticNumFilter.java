package com.tencent.ttpic.filter;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import com.tencent.filter.m.i;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.cache.VideoMemoryManager;
import com.tencent.ttpic.config.MediaConfig;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.TRIGGERED_STATUS;
import com.tencent.ttpic.model.TriggerCtrlItem;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.util.i;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticNumFilter extends NormalVideoFilter
{
  private Map<String, Point> mBitSizeMap;
  private boolean mIsUnitExists;
  private int mLastBitIndex;
  private Map<String, Integer> mLastImageIndexMap;
  private int mNum;
  private m.k mTextureParam;

  public StaticNumFilter(StickerItem paramStickerItem, String paramString)
  {
    super(paramStickerItem, paramString);
    AppMethodBeat.i(82954);
    this.mLastImageIndexMap = new HashMap();
    this.mBitSizeMap = new HashMap();
    this.mLastBitIndex = -1;
    this.mNum = -1;
    this.mIsUnitExists = false;
    AppMethodBeat.o(82954);
  }

  private Bitmap getNextFrame(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82959);
    StringBuilder localStringBuilder = new StringBuilder().append(paramString).append("_").append(paramInt2).append("_");
    Object localObject;
    if (paramInt1 == -1)
    {
      localObject = "x";
      localObject = localObject + ".png";
      localObject = VideoMemoryManager.getInstance().loadImage(paramString, (String)localObject);
      if (!BitmapUtils.isLegal((Bitmap)localObject))
        break label96;
      AppMethodBeat.o(82959);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      localObject = Integer.valueOf(paramInt1);
      break;
      label96: paramString = loadFromAssetsOrFile(paramString, paramInt1, paramInt2);
      AppMethodBeat.o(82959);
    }
  }

  private int getTotalBit(int paramInt)
  {
    for (int i = 0; paramInt > 0; i++)
      paramInt /= 10;
    return i;
  }

  private Bitmap loadFromAssetsOrFile(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82960);
    StringBuilder localStringBuilder = new StringBuilder().append(this.dataPath).append(File.separator).append(paramString).append(File.separator).append(paramString).append("_").append(paramInt2).append("_");
    if (paramInt1 == -1)
    {
      paramString = "x";
      paramString = paramString + ".png";
      if (!this.dataPath.startsWith("assets://"))
        break label122;
      paramString = BitmapUtils.decodeSampledBitmapFromAssets(VideoGlobalContext.getContext(), FileUtils.getRealPath(paramString), MediaConfig.VIDEO_OUTPUT_WIDTH, MediaConfig.VIDEO_OUTPUT_HEIGHT);
      AppMethodBeat.o(82960);
    }
    while (true)
    {
      return paramString;
      paramString = Integer.valueOf(paramInt1);
      break;
      label122: paramString = BitmapUtils.decodeSampledBitmapFromFile(paramString, MediaConfig.VIDEO_OUTPUT_WIDTH, MediaConfig.VIDEO_OUTPUT_HEIGHT);
      AppMethodBeat.o(82960);
    }
  }

  private void updateNumPosition(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82962);
    if ((this.item == null) || (this.item.position == null) || (this.item.position.length < 2))
    {
      setPositions(GlUtil.EMPTY_POSITIONS);
      AppMethodBeat.o(82962);
    }
    while (true)
    {
      return;
      if (this.mBitSizeMap.containsKey(paramString));
      int i;
      int j;
      for (paramString = (Point)this.mBitSizeMap.get(paramString); ; paramString = new Point(this.item.width, this.item.height))
      {
        d1 = this.item.height;
        i = (int)(paramString.x * 1.0D / paramString.y * d1);
        j = (this.item.width - paramInt2 * i) / 2;
        if (this.width / this.height < 0.75D)
          break label312;
        d1 = this.width / 720.0D;
        k = (int)(this.width / 0.75D);
        m = (int)(k * (1.0D - this.item.position[1]));
        paramInt1 = (int)((int)((int)(this.width * this.item.position[0]) + (paramInt2 - paramInt1 - 1) * i * d1) + j * d1);
        paramInt2 = m - (k - this.height) / 2;
        setPositions(AlgoUtils.calPositions(paramInt1, paramInt2, (int)(i * d1) + paramInt1, (int)(paramInt2 - d1 * this.item.height), this.width, this.height));
        AppMethodBeat.o(82962);
        break;
      }
      label312: double d1 = this.height / 960.0D;
      int k = (int)(this.height * 0.75D);
      int m = (int)(this.height * (1.0D - this.item.position[1]));
      double d2 = (int)((int)(k * this.item.position[0]) + (paramInt2 - paramInt1 - 1) * i * d1);
      paramInt1 = (int)(j * d1 + d2);
      setPositions(AlgoUtils.calPositions(paramInt1, m, (int)(i * d1) + paramInt1, (int)(m - d1 * this.item.height), this.width, this.height));
      AppMethodBeat.o(82962);
    }
  }

  private void updateTextureParam(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82961);
    Object localObject1 = new StringBuilder().append(paramString).append("_");
    Object localObject2;
    int i;
    if (paramInt1 == -1)
    {
      localObject2 = "x";
      localObject1 = localObject2;
      i = this.triggerCtrlItem.getFrameIndex();
      if ((paramInt2 != this.mLastBitIndex) || (!this.mLastImageIndexMap.containsKey(localObject1)) || (i != ((Integer)this.mLastImageIndexMap.get(localObject1)).intValue()) || (this.mTextureParam == null))
        break label119;
      AppMethodBeat.o(82961);
    }
    while (true)
    {
      return;
      localObject2 = Integer.valueOf(paramInt1);
      break;
      label119: localObject2 = getNextFrame(paramString, paramInt1, i);
      if ((!BitmapUtils.isLegal((Bitmap)localObject2)) || (!needRenderTexture()))
      {
        clearTextureParam();
        AppMethodBeat.o(82961);
        continue;
      }
      if (paramInt1 == -1)
        this.mIsUnitExists = true;
      if (!this.mBitSizeMap.containsKey(localObject1))
        this.mBitSizeMap.put(localObject1, new Point(((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight()));
      try
      {
        if (this.mTextureParam != null)
          this.mTextureParam.m((Bitmap)localObject2);
        while (true)
        {
          localObject2 = this.mLastImageIndexMap;
          localObject1 = new StringBuilder().append(paramString).append("_");
          if (paramInt1 != -1)
            break label348;
          paramString = "x";
          ((Map)localObject2).put(paramString, Integer.valueOf(i));
          AppMethodBeat.o(82961);
          break;
          localObject1 = new com/tencent/filter/m$k;
          ((m.k)localObject1).<init>("inputImageTexture2", (Bitmap)localObject2, 33986, false);
          this.mTextureParam = ((m.k)localObject1);
          this.mTextureParam.initialParams(getProgramIds());
          addParam(this.mTextureParam);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          i.m(this, localException.getMessage());
          continue;
          label348: paramString = Integer.valueOf(paramInt1);
        }
      }
    }
  }

  public void clearTextureParam()
  {
    AppMethodBeat.i(82958);
    if (this.mTextureParam != null)
    {
      this.mTextureParam.clear();
      this.mTextureParam = null;
    }
    setPositions(GlUtil.EMPTY_POSITIONS);
    AppMethodBeat.o(82958);
  }

  public void initParams()
  {
    AppMethodBeat.i(82955);
    addParam(new m.i("texNeedTransform", -1));
    addParam(new m.i("blendMode", this.item.blendMode));
    AppMethodBeat.o(82955);
  }

  public boolean isRenderReady()
  {
    if (this.mNum >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(82963);
    if (this.mNum < 0)
    {
      AppMethodBeat.o(82963);
      return true;
    }
    int m = getTotalBit(this.mNum);
    updateTextureParam(this.item.id, -1, 0);
    int n = m;
    if (this.mIsUnitExists)
    {
      n = m + 1;
      updateNumPosition(this.item.id + "_x", 0, n);
      OnDrawFrameGLSL();
      super.renderTexture(paramInt1, paramInt2, paramInt3);
      this.mLastBitIndex = 0;
    }
    if (this.mNum < 10)
    {
      if (this.mIsUnitExists)
        k = 1;
      updateTextureParam(this.item.id, this.mNum, k);
      updateNumPosition(this.item.id + "_" + this.mNum, k, n);
      OnDrawFrameGLSL();
      super.renderTexture(paramInt1, paramInt2, paramInt3);
      this.mLastBitIndex = k;
    }
    while (true)
    {
      AppMethodBeat.o(82963);
      break;
      if ((10 <= this.mNum) && (this.mNum < 100))
      {
        k = i;
        if (this.mIsUnitExists)
          k = 1;
        i = this.mNum % 10;
        updateTextureParam(this.item.id, i, k);
        updateNumPosition(this.item.id + "_" + i, k, n);
        OnDrawFrameGLSL();
        super.renderTexture(paramInt1, paramInt2, paramInt3);
        this.mLastBitIndex = k;
        k++;
        i = this.mNum / 10;
        updateTextureParam(this.item.id, i, k);
        updateNumPosition(this.item.id + "_" + i, k, n);
        OnDrawFrameGLSL();
        super.renderTexture(paramInt1, paramInt2, paramInt3);
        this.mLastBitIndex = k;
      }
      else
      {
        k = j;
        if (this.mIsUnitExists)
          k = 1;
        i = this.mNum % 10;
        updateTextureParam(this.item.id, i, k);
        updateNumPosition(this.item.id + "_" + i, k, n);
        OnDrawFrameGLSL();
        super.renderTexture(paramInt1, paramInt2, paramInt3);
        this.mLastBitIndex = k;
        k++;
        i = this.mNum / 10 % 10;
        updateTextureParam(this.item.id, i, k);
        updateNumPosition(this.item.id + "_" + i, k, n);
        OnDrawFrameGLSL();
        super.renderTexture(paramInt1, paramInt2, paramInt3);
        this.mLastBitIndex = k;
        k++;
        i = this.mNum / 100;
        updateTextureParam(this.item.id, i, k);
        updateNumPosition(this.item.id + "_" + i, k, n);
        OnDrawFrameGLSL();
        super.renderTexture(paramInt1, paramInt2, paramInt3);
        this.mLastBitIndex = k;
      }
    }
  }

  public void setNum(int paramInt)
  {
    this.mNum = paramInt;
  }

  protected void updatePositions(List<PointF> paramList, float[] paramArrayOfFloat, float paramFloat)
  {
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(82957);
    if (updateActionTriggered(paramPTDetectInfo) == TRIGGERED_STATUS.FIRST_TRIGGERED);
    for (boolean bool = true; ; bool = false)
    {
      updatePlayer(bool);
      if (!needRenderTexture())
      {
        clearTextureParam();
        setNum(-1);
      }
      AppMethodBeat.o(82957);
      return;
    }
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82956);
    super.updateVideoSize(paramInt1, paramInt2, paramDouble);
    AppMethodBeat.o(82956);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.StaticNumFilter
 * JD-Core Version:    0.6.2
 */