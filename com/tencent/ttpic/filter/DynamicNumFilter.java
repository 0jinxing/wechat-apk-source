package com.tencent.ttpic.filter;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import com.tencent.filter.m.b;
import com.tencent.filter.m.d;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.filter.m.j;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.cache.VideoMemoryManager;
import com.tencent.ttpic.config.MediaConfig;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.model.StickerItem;
import com.tencent.ttpic.model.TRIGGERED_STATUS;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.MatrixUtil;
import com.tencent.ttpic.util.PlayerUtil;
import com.tencent.ttpic.util.PlayerUtil.Player;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.VideoPrefsUtil;
import com.tencent.util.i;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicNumFilter extends NormalVideoFilter
{
  private static final String TAG;
  private Point canvasCenter;
  private long frameStartTime;
  private PointF mAnchor;
  private float mAngle;
  private Map<String, Point> mBitSizeMap;
  private float[] mFaceAngles;
  private List<PointF> mFacePoints;
  private boolean mIsUnitExists;
  private int mLastBitIndex;
  private Map<String, Integer> mLastImageIndexMap;
  private int mNum;
  private PlayerUtil.Player mPlayer;
  protected m.k mTextureParam;
  private long mTimestamp;
  protected int playCount;
  protected boolean triggered;

  static
  {
    AppMethodBeat.i(82172);
    TAG = NormalVideoFilter.class.getSimpleName();
    AppMethodBeat.o(82172);
  }

  public DynamicNumFilter(StickerItem paramStickerItem, String paramString)
  {
    super(paramStickerItem, paramString);
    AppMethodBeat.i(82159);
    this.triggered = false;
    this.playCount = 0;
    this.mAnchor = new PointF();
    this.mNum = -1;
    this.mLastImageIndexMap = new HashMap();
    this.mBitSizeMap = new HashMap();
    this.mLastBitIndex = -1;
    this.mIsUnitExists = false;
    this.mNum = -1;
    AppMethodBeat.o(82159);
  }

  private Bitmap getNextFrame(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82166);
    StringBuilder localStringBuilder = new StringBuilder().append(paramString).append("_").append(paramInt2).append("_");
    Object localObject;
    if (paramInt1 == -1)
    {
      localObject = "x";
      localObject = localObject + ".png";
      localObject = VideoMemoryManager.getInstance().loadImage(paramString, (String)localObject);
      if (!BitmapUtils.isLegal((Bitmap)localObject))
        break label96;
      AppMethodBeat.o(82166);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      localObject = Integer.valueOf(paramInt1);
      break;
      label96: paramString = loadFromAssetsOrFile(paramString, paramInt1, paramInt2);
      AppMethodBeat.o(82166);
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
    AppMethodBeat.i(82167);
    StringBuilder localStringBuilder = new StringBuilder().append(this.dataPath).append(File.separator).append(paramString).append(File.separator).append(paramString).append("_").append(paramInt2).append("_");
    if (paramInt1 == -1)
    {
      paramString = "x";
      paramString = paramString + ".png";
      if (!this.dataPath.startsWith("assets://"))
        break label122;
      paramString = BitmapUtils.decodeSampledBitmapFromAssets(VideoGlobalContext.getContext(), FileUtils.getRealPath(paramString), MediaConfig.VIDEO_OUTPUT_WIDTH, MediaConfig.VIDEO_OUTPUT_HEIGHT);
      AppMethodBeat.o(82167);
    }
    while (true)
    {
      return paramString;
      paramString = Integer.valueOf(paramInt1);
      break;
      label122: paramString = BitmapUtils.decodeSampledBitmapFromFile(paramString, MediaConfig.VIDEO_OUTPUT_WIDTH, MediaConfig.VIDEO_OUTPUT_HEIGHT);
      AppMethodBeat.o(82167);
    }
  }

  private void updateNumPosition(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82168);
    PointF localPointF = (PointF)this.mFacePoints.get(this.item.alignFacePoints[0]);
    Object localObject = this.mFacePoints;
    int i;
    if (this.item.alignFacePoints.length == 1)
    {
      i = this.item.alignFacePoints[0];
      localObject = (PointF)((List)localObject).get(i);
      float f1 = (localPointF.x + ((PointF)localObject).x) / 2.0F;
      float f2 = ((PointF)localObject).y;
      localPointF = new PointF(f1, (((PointF)localObject).y + f2) / 2.0F);
      localPointF.x = ((float)(localPointF.x * (1.0D / this.mFaceDetScale)));
      localPointF.y = ((float)(localPointF.y * (1.0D / this.mFaceDetScale)));
      if (!this.mBitSizeMap.containsKey(paramString))
        break label753;
      paramString = (Point)this.mBitSizeMap.get(paramString);
      label179: double d = this.item.height;
      int j = (int)(paramString.x * 1.0D / paramString.y * d);
      i = (this.item.width - paramInt2 * j) / 2;
      f1 = localPointF.x;
      f2 = this.item.anchorPoint[0];
      float f3 = (paramInt2 - paramInt1 - 1) * j;
      f1 = i + (f1 - f2 + f3);
      f2 = this.height - localPointF.y + this.item.anchorPoint[1];
      setPositions(AlgoUtils.calPositions(f1, f2, j + f1, f2 - this.item.height, this.width, this.height));
      addParam(new m.b("texAnchor", localPointF.x - this.canvasCenter.x, this.canvasCenter.y - localPointF.y));
      this.mAnchor.x = (localPointF.x - this.canvasCenter.x);
      this.mAnchor.y = (this.canvasCenter.y - localPointF.y);
      localPointF = new PointF(((PointF)this.mFacePoints.get(this.item.scalePivots[0])).x, ((PointF)this.mFacePoints.get(this.item.scalePivots[0])).y);
      localPointF.x = ((float)(localPointF.x * (1.0D / this.mFaceDetScale)));
      localPointF.y = ((float)(localPointF.y * (1.0D / this.mFaceDetScale)));
      paramString = new PointF(((PointF)this.mFacePoints.get(this.item.scalePivots[1])).x, ((PointF)this.mFacePoints.get(this.item.scalePivots[1])).y);
      paramString.x = ((float)(paramString.x * (1.0D / this.mFaceDetScale)));
      paramString.y = ((float)(paramString.y * (1.0D / this.mFaceDetScale)));
      d = Math.pow(localPointF.x - paramString.x, 2.0D);
      addParam(new m.f("texScale", (float)(Math.sqrt(Math.pow(localPointF.y - paramString.y, 2.0D) + d) / this.item.scaleFactor)));
      if (this.item.support3D != 1)
        break label778;
      addParam(new m.d("texRotate", this.mFaceAngles[0], this.mFaceAngles[1], this.mFaceAngles[2] - this.item.angle));
    }
    while (true)
    {
      addParam(new m.f("positionRotate", -this.mAngle));
      AppMethodBeat.o(82168);
      return;
      i = this.item.alignFacePoints[1];
      break;
      label753: paramString = new Point(this.item.width, this.item.height);
      break label179;
      label778: addParam(new m.d("texRotate", 0.0F, 0.0F, this.mFaceAngles[2] - this.item.angle));
    }
  }

  private void updateTextureParam(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(82165);
    Object localObject1 = new StringBuilder().append(paramString).append("_");
    Object localObject2;
    int i;
    if (paramInt1 == -1)
    {
      localObject2 = "x";
      localObject1 = localObject2;
      i = (int)((paramLong - this.frameStartTime) / Math.max(this.item.frameDuration, 1.0D));
      if ((i >= this.item.frames * (this.playCount + 1)) && (!VideoPrefsUtil.getMaterialMute()))
      {
        this.playCount += 1;
        PlayerUtil.startPlayer(this.mPlayer, true);
      }
      i %= Math.max(this.item.frames, 1);
      if ((paramInt2 != this.mLastBitIndex) || (!this.mLastImageIndexMap.containsKey(localObject1)) || (i != ((Integer)this.mLastImageIndexMap.get(localObject1)).intValue()) || (this.mTextureParam == null))
        break label194;
      AppMethodBeat.o(82165);
    }
    while (true)
    {
      return;
      localObject2 = Integer.valueOf(paramInt1);
      break;
      label194: localObject2 = getNextFrame(paramString, paramInt1, i);
      if ((!BitmapUtils.isLegal((Bitmap)localObject2)) || (needClearTexture()))
      {
        clearTextureParam();
        AppMethodBeat.o(82165);
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
            break label426;
          paramString = "x";
          ((Map)localObject2).put(paramString, Integer.valueOf(i));
          AppMethodBeat.o(82165);
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
          label426: paramString = Integer.valueOf(paramInt1);
        }
      }
    }
  }

  public void clearTextureParam()
  {
    AppMethodBeat.i(82163);
    if (this.mTextureParam != null)
    {
      this.mTextureParam.clear();
      this.mTextureParam = null;
    }
    setPositions(GlUtil.EMPTY_POSITIONS);
    AppMethodBeat.o(82163);
  }

  public void destroy()
  {
    AppMethodBeat.i(82170);
    clearGLSLSelf();
    PlayerUtil.destroyPlayer(this.mPlayer);
    AppMethodBeat.o(82170);
  }

  public void destroyAudio()
  {
    AppMethodBeat.i(82171);
    PlayerUtil.destroyPlayer(this.mPlayer);
    this.mPlayer = null;
    AppMethodBeat.o(82171);
  }

  public float getFrameDuration(long paramLong)
  {
    if (!this.triggered);
    for (float f = 0.0F; ; f = (float)((paramLong - this.frameStartTime) / 1000.0D))
      return f;
  }

  public void initParams()
  {
    AppMethodBeat.i(82160);
    addParam(new m.i("texNeedTransform", 1));
    addParam(new m.b("canvasSize", 0.0F, 0.0F));
    addParam(new m.b("texAnchor", 0.0F, 0.0F));
    addParam(new m.f("texScale", 1.0F));
    addParam(new m.d("texRotate", 0.0F, 0.0F, 0.0F));
    addParam(new m.f("positionRotate", 0.0F));
    addParam(new m.i("blendMode", this.item.blendMode));
    addParam(new m.j("u_MVPMatrix", MatrixUtil.getMVPMatrix(6.0F, 4.0F, 10.0F)));
    AppMethodBeat.o(82160);
  }

  public boolean isRenderReady()
  {
    if (this.mNum >= 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected boolean needClearTexture()
  {
    if ((this.item.triggerType != PTFaceAttr.PTExpression.ALWAYS.value) && ((!this.triggered) || ((this.item.playCount != 0) && (this.playCount >= this.item.playCount))));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(82169);
    if ((BaseUtils.isEmpty(this.mFacePoints)) || (this.mFaceAngles == null) || (this.mFaceAngles.length < 3) || (this.mNum < 0))
    {
      AppMethodBeat.o(82169);
      return true;
    }
    int m = getTotalBit(this.mNum);
    updateTextureParam(this.item.id, -1, this.mTimestamp, 0);
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
      updateTextureParam(this.item.id, this.mNum, this.mTimestamp, k);
      updateNumPosition(this.item.id + "_" + this.mNum, k, n);
      OnDrawFrameGLSL();
      super.renderTexture(paramInt1, paramInt2, paramInt3);
      this.mLastBitIndex = k;
    }
    while (true)
    {
      AppMethodBeat.o(82169);
      break;
      if ((10 <= this.mNum) && (this.mNum < 100))
      {
        k = i;
        if (this.mIsUnitExists)
          k = 1;
        i = this.mNum % 10;
        updateTextureParam(this.item.id, i, this.mTimestamp, k);
        updateNumPosition(this.item.id + "_" + i, k, n);
        OnDrawFrameGLSL();
        super.renderTexture(paramInt1, paramInt2, paramInt3);
        this.mLastBitIndex = k;
        k++;
        i = this.mNum / 10;
        updateTextureParam(this.item.id, i, this.mTimestamp, k);
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
        updateTextureParam(this.item.id, i, this.mTimestamp, k);
        updateNumPosition(this.item.id + "_" + i, k, n);
        OnDrawFrameGLSL();
        super.renderTexture(paramInt1, paramInt2, paramInt3);
        this.mLastBitIndex = k;
        i = k + 1;
        k = this.mNum / 10 % 10;
        updateTextureParam(this.item.id, k, this.mTimestamp, i);
        updateNumPosition(this.item.id + "_" + k, i, n);
        OnDrawFrameGLSL();
        super.renderTexture(paramInt1, paramInt2, paramInt3);
        this.mLastBitIndex = i;
        i++;
        k = this.mNum / 100;
        updateTextureParam(this.item.id, k, this.mTimestamp, i);
        updateNumPosition(this.item.id + "_" + k, i, n);
        OnDrawFrameGLSL();
        super.renderTexture(paramInt1, paramInt2, paramInt3);
        this.mLastBitIndex = i;
      }
    }
  }

  public void setNum(int paramInt)
  {
    this.mNum = paramInt;
  }

  public void setStickerItem(StickerItem paramStickerItem)
  {
    this.item = paramStickerItem;
  }

  protected void updatePositions(List<PointF> paramList, float[] paramArrayOfFloat, float paramFloat)
  {
    AppMethodBeat.i(82164);
    if ((BaseUtils.isEmpty(paramList)) || (paramArrayOfFloat == null) || (paramArrayOfFloat.length < 3))
    {
      clearTextureParam();
      this.mFacePoints = null;
      this.mFaceAngles = null;
      this.mAngle = 0.0F;
      this.mNum = -1;
      AppMethodBeat.o(82164);
    }
    while (true)
    {
      return;
      this.mFacePoints = paramList;
      this.mFaceAngles = paramArrayOfFloat;
      this.mAngle = paramFloat;
      AppMethodBeat.o(82164);
    }
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(82162);
    boolean bool;
    if (updateActionTriggered(paramPTDetectInfo) == TRIGGERED_STATUS.FIRST_TRIGGERED)
    {
      bool = true;
      updatePlayer(bool);
      if (!needClearTexture())
        break label69;
      clearTextureParam();
      this.triggered = false;
      this.playCount = 0;
      this.mTimestamp = -1L;
      this.mNum = -1;
      AppMethodBeat.o(82162);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label69: this.mTimestamp = paramPTDetectInfo.timestamp;
      updatePositions(paramPTDetectInfo.facePoints, paramPTDetectInfo.faceAngles, paramPTDetectInfo.phoneAngle);
      AppMethodBeat.o(82162);
    }
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82161);
    super.updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.canvasCenter = new Point(paramInt1 / 2, paramInt2 / 2);
    addParam(new m.b("canvasSize", paramInt1, paramInt2));
    AppMethodBeat.o(82161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.DynamicNumFilter
 * JD-Core Version:    0.6.2
 */