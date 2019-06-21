package com.tencent.ttpic.model;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BitmapUtils;
import com.tencent.ttpic.gles.GlUtil;
import com.tencent.ttpic.util.ActUtil;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CaptureActItem extends FrameSourceItem
{
  private static final String TAG;
  private int[] captureTimes;
  private BaseFilter copyFilter;
  private h[] copyFrames;
  private String dataPath;
  private List<ExpressionItem> expressionList;
  private String imageId;
  private int lastCaptureIndex;
  private int[] numTextures;
  private final Random random;
  private CaptureActItem.ScoreTag[] scores;
  private List<float[]> starFaceAngles;
  private List<List<PointF>> starFacePoints;

  static
  {
    AppMethodBeat.i(83477);
    TAG = CaptureActItem.class.getSimpleName();
    AppMethodBeat.o(83477);
  }

  public CaptureActItem(List<ExpressionItem> paramList, String paramString1, String paramString2, BaseFilter paramBaseFilter)
  {
    super(paramBaseFilter);
    AppMethodBeat.i(83473);
    this.numTextures = new int[10];
    this.copyFilter = new BaseFilter(GLSLRender.bJB);
    this.lastCaptureIndex = -1;
    this.expressionList = paramList;
    this.dataPath = paramString1;
    this.imageId = paramString2;
    this.starFacePoints = new ArrayList(paramList.size());
    this.starFaceAngles = new ArrayList(paramList.size());
    this.captureTimes = new int[paramList.size()];
    for (int j = 0; j < paramList.size(); j++)
    {
      paramString1 = (ExpressionItem)paramList.get(j);
      this.starFacePoints.add(paramString1.expressionFeat);
      this.starFaceAngles.add(paramString1.expressionAngle);
      this.captureTimes[j] = paramString1.expressionTime;
    }
    this.scores = new CaptureActItem.ScoreTag[paramList.size()];
    for (j = 0; j < this.scores.length; j++)
      this.scores[j] = new CaptureActItem.ScoreTag(null);
    this.copyFrames = new h[paramList.size()];
    for (j = i; j < this.copyFrames.length; j++)
      this.copyFrames[j] = new h();
    this.random = new Random(System.currentTimeMillis());
    AppMethodBeat.o(83473);
  }

  private int getCaptureIndex(long paramLong)
  {
    if ((this.lastCaptureIndex + 1 < this.captureTimes.length) && (paramLong >= this.captureTimes[(this.lastCaptureIndex + 1)]))
      this.lastCaptureIndex += 1;
    for (int i = this.lastCaptureIndex; ; i = -1)
      return i;
  }

  public void clear()
  {
    AppMethodBeat.i(83475);
    this.copyFilter.ClearGLSL();
    Object localObject2;
    for (localObject2 : this.copyFrames)
      if (localObject2 != null)
        localObject2.clear();
    for (localObject2 : this.scores)
      if (localObject2.texId != null)
      {
        GLES20.glDeleteTextures(localObject2.texId.length, localObject2.texId, 0);
        localObject2.texId = null;
      }
    AppMethodBeat.o(83475);
  }

  public int getOrigHeight(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.copyFrames.length));
    for (paramInt = -1; ; paramInt = this.copyFrames[paramInt].height)
      return paramInt;
  }

  public int getOrigWidth(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.copyFrames.length));
    for (paramInt = -1; ; paramInt = this.copyFrames[paramInt].width)
      return paramInt;
  }

  public int getScore(CanvasItem paramCanvasItem)
  {
    this.scores[paramCanvasItem.index].hasShowed = true;
    return this.scores[paramCanvasItem.index].score;
  }

  public int[] getScoreTexture(CanvasItem paramCanvasItem)
  {
    if (this.scores[paramCanvasItem.index].texId != null);
    for (paramCanvasItem = this.scores[paramCanvasItem.index].texId; ; paramCanvasItem = this.numTextures)
      return paramCanvasItem;
  }

  public int getTexture(CanvasItem paramCanvasItem, long paramLong)
  {
    return this.copyFrames[paramCanvasItem.index].texture[0];
  }

  public int getTotalScore()
  {
    CaptureActItem.ScoreTag[] arrayOfScoreTag = this.scores;
    int i = arrayOfScoreTag.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      CaptureActItem.ScoreTag localScoreTag = arrayOfScoreTag[j];
      m = k;
      if (localScoreTag.hasShowed)
        m = k + localScoreTag.score;
      j++;
    }
    return k;
  }

  public int[] getTotalScoreTexture()
  {
    return this.numTextures;
  }

  public void init()
  {
    AppMethodBeat.i(83474);
    this.copyFilter.ApplyGLSLFilter();
    GLES20.glGenTextures(this.numTextures.length, this.numTextures, 0);
    Bitmap localBitmap;
    for (int i = 0; i < 10; i++)
    {
      localBitmap = BitmapUtils.decodeSampleBitmap(VideoGlobalContext.getContext(), this.dataPath + File.separator + "expression" + File.separator + this.imageId + File.separator + this.imageId + "_" + i + ".png", 720, 1280);
      if (BitmapUtils.isLegal(localBitmap))
      {
        GlUtil.loadTexture(this.numTextures[i], localBitmap);
        localBitmap.recycle();
      }
    }
    for (i = 0; i < this.expressionList.size(); i++)
    {
      String str = ((ExpressionItem)this.expressionList.get(i)).scoreImageID;
      if (!TextUtils.isEmpty(str))
      {
        int[] arrayOfInt = new int[10];
        GLES20.glGenTextures(10, arrayOfInt, 0);
        for (int j = 0; j < 10; j++)
        {
          localBitmap = BitmapUtils.decodeSampleBitmap(VideoGlobalContext.getContext(), this.dataPath + File.separator + "expression" + File.separator + str + File.separator + str + "_" + j + ".png", 720, 1280);
          if (BitmapUtils.isLegal(localBitmap))
          {
            GlUtil.loadTexture(arrayOfInt[j], localBitmap);
            localBitmap.recycle();
          }
        }
        this.scores[i].texId = arrayOfInt;
      }
    }
    AppMethodBeat.o(83474);
  }

  public void reset()
  {
    this.lastCaptureIndex = -1;
    for (int i = 0; i < this.scores.length; i++)
    {
      this.scores[i].score = 0;
      this.scores[i].hasShowed = false;
    }
  }

  public void update(h paramh, long paramLong, List<List<PointF>> paramList, List<float[]> paramList1, int paramInt)
  {
    AppMethodBeat.i(83476);
    super.update(paramh, paramLong, paramList, paramList1, paramInt);
    int i = getCaptureIndex(paramLong);
    if (i >= 0)
    {
      BenchUtil.benchStart(TAG + "[update]");
      this.copyFilter.RenderProcess(paramh.texture[0], paramh.width, paramh.height, -1, 0.0D, this.copyFrames[i]);
      BenchUtil.benchEnd(TAG + "[update]");
      if ((paramList.size() > 0) && (paramInt == 0))
      {
        BenchUtil.benchStart(TAG + "[calculate score]");
        this.scores[i].score = ((int)ActUtil.getExpressionSimilarity((List)this.starFacePoints.get(i), (List)paramList.get(0), (float[])this.starFaceAngles.get(i), (float[])paramList1.get(0), ((ExpressionItem)this.expressionList.get(i)).expressionWeight));
        BenchUtil.benchEnd(TAG + "[calculate score]");
        AppMethodBeat.o(83476);
      }
    }
    while (true)
    {
      return;
      this.scores[i].score = (this.random.nextInt(5) + 5);
      AppMethodBeat.o(83476);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.CaptureActItem
 * JD-Core Version:    0.6.2
 */