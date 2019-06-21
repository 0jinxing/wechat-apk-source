package com.tencent.ttpic.filter;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tencent.filter.m.b;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.util.List;

public class ThinShoulderFilter extends VideoFilterBase
{
  private static final int BODY_POINTS_NUM = 59;
  public static final String FRAGMENT_SHADER;
  public static final String TAG;
  public static final String VERTEX_SHADER;
  private static final int[] leftIndexs;
  private static final int[] rightIndexs;
  private PointF center;
  private int currentIdx;
  private boolean hasSeenValid;
  private float height;
  private long lastValidTime;
  private boolean mEnable;
  private ThinShoulderParameters params;
  private PointF[] pointsNormalized;
  private ThinShoulderParameters[] previousParams;
  private boolean[] previousValidFrames;
  private ThinShoulderParameters previousValidParams;
  private float prop;
  private boolean showMark;
  private ThinShoulderParameters smoothedParams;
  private int smoothedWithinFrames;
  private float strength;
  private long validDuration;
  private float width;

  static
  {
    AppMethodBeat.i(83003);
    TAG = ThinShoulderFilter.class.getSimpleName();
    leftIndexs = new int[] { 13, 14, 15, 16, 17 };
    rightIndexs = new int[] { 45, 44, 43, 42, 41 };
    VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ThinShoulderVertexShader.dat");
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/ThinShoulderFragmentShader.dat");
    AppMethodBeat.o(83003);
  }

  public ThinShoulderFilter()
  {
    super(VERTEX_SHADER, FRAGMENT_SHADER);
    AppMethodBeat.i(82991);
    this.showMark = false;
    this.mEnable = false;
    this.pointsNormalized = new PointF[59];
    initParams();
    this.smoothedWithinFrames = 2;
    this.currentIdx = 0;
    this.validDuration = 2000L;
    this.hasSeenValid = false;
    for (int i = 0; i < this.pointsNormalized.length; i++)
      this.pointsNormalized[i] = new PointF();
    if (this.previousValidFrames == null)
    {
      this.previousValidFrames = new boolean[this.smoothedWithinFrames];
      for (i = 0; i < this.smoothedWithinFrames; i++)
        this.previousValidFrames[i] = false;
    }
    if (this.params == null)
      this.params = new ThinShoulderParameters();
    if (this.previousParams == null)
    {
      this.previousParams = new ThinShoulderParameters[this.smoothedWithinFrames];
      for (i = 0; i < this.smoothedWithinFrames; i++)
        this.previousParams[i] = new ThinShoulderParameters();
    }
    if (this.previousValidParams == null)
      this.previousValidParams = new ThinShoulderParameters();
    if (this.smoothedParams == null)
      this.smoothedParams = new ThinShoulderParameters();
    this.smoothedParams.reset();
    int j = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f6;
    for (int k = 0; j < this.smoothedWithinFrames; k = i)
    {
      float f4 = f1;
      float f5 = f2;
      f6 = f3;
      i = k;
      if (this.previousValidFrames[j] != 0)
      {
        i = k + 1;
        ThinShoulderParameters localThinShoulderParameters = this.previousParams[j];
        f6 = f3 + localThinShoulderParameters.rect.left;
        f5 = f2 + localThinShoulderParameters.rect.top;
        f4 = f1 + localThinShoulderParameters.rect.right + localThinShoulderParameters.rect.bottom;
      }
      j++;
      f1 = f4;
      f2 = f5;
      f3 = f6;
    }
    if (k > 0)
    {
      f3 /= k;
      f2 /= k;
      f6 = f1 / k;
      f1 = 0.0F / k;
      ThinShoulderParameters.access$002(this.smoothedParams, new RectF(f3, f2, f6, f1));
    }
    AppMethodBeat.o(82991);
  }

  private void normalizePoints(List<PointF> paramList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(83002);
    if ((paramList == null) || (paramList.size() == 0))
      AppMethodBeat.o(83002);
    while (true)
    {
      return;
      for (int i = 0; i < paramList.size(); i++)
      {
        this.pointsNormalized[i].x = (((PointF)paramList.get(i)).x / paramInt1);
        this.pointsNormalized[i].y = (((PointF)paramList.get(i)).y / paramInt2);
      }
      AppMethodBeat.o(83002);
    }
  }

  public void calculateMiddleLineWithNormalizedPoints()
  {
    int i = 0;
    AppMethodBeat.i(83001);
    int j = leftIndexs.length;
    PointF localPointF1 = this.pointsNormalized[0];
    PointF localPointF2 = this.pointsNormalized[58];
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    while (i < j)
    {
      PointF localPointF3 = this.pointsNormalized[leftIndexs[i]];
      PointF localPointF4 = this.pointsNormalized[rightIndexs[i]];
      f4 += (localPointF3.x + localPointF4.x) / 2.0F;
      f3 += (localPointF3.y + localPointF4.y) / 2.0F;
      float f5 = localPointF4.x;
      float f6 = localPointF3.x;
      f1 += localPointF3.y + localPointF4.y - localPointF1.y - localPointF2.y;
      i++;
      f2 = f5 - f6 + f2;
    }
    setParams(new ThinShoulderParameters(new RectF(f4 / j, f3 / j - 0.05F * f1, f2 / j * 2.0F, f1 * 0.18F)));
    AppMethodBeat.o(83001);
  }

  public void initParams()
  {
    int i = 0;
    AppMethodBeat.i(82999);
    this.center = new PointF();
    this.showMark = false;
    this.mEnable = false;
    this.prop = 0.5625F;
    if (this.showMark)
      i = 1;
    addParam(new m.i("showMark", i));
    addParam(new m.f("strength", 0.0F));
    addParam(new m.b("center", 0.0F, 0.0F));
    addParam(new m.f("width", 0.0F));
    addParam(new m.f("height", 0.0F));
    addParam(new m.f("prop", 0.5625F));
    AppMethodBeat.o(82999);
  }

  public void resetState()
  {
    this.hasSeenValid = false;
    this.previousParams = null;
  }

  public void setCenter(PointF paramPointF)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(82995);
    PointF localPointF = this.center;
    if (paramPointF.x > 1.0F)
    {
      f3 = 1.0F;
      localPointF.x = f3;
      localPointF = this.center;
      if (paramPointF.x >= 0.0F)
        break label151;
      f3 = 0.0F;
      label52: localPointF.x = f3;
      localPointF = this.center;
      if (paramPointF.y <= 1.0F)
        break label160;
      f3 = f1;
      label77: localPointF.y = f3;
      localPointF = this.center;
      if (paramPointF.y >= 0.0F)
        break label169;
    }
    label151: label160: label169: for (float f3 = f2; ; f3 = paramPointF.y)
    {
      localPointF.y = f3;
      addParam(new m.b("center", this.center.x, this.center.y));
      AppMethodBeat.o(82995);
      return;
      f3 = paramPointF.x;
      break;
      f3 = paramPointF.x;
      break label52;
      f3 = paramPointF.y;
      break label77;
    }
  }

  public void setEnable(boolean paramBoolean)
  {
    this.mEnable = paramBoolean;
  }

  public void setHeight(float paramFloat)
  {
    float f = 1.0F;
    AppMethodBeat.i(82997);
    if (paramFloat > 1.0F);
    while (true)
    {
      this.height = f;
      f = paramFloat;
      if (paramFloat < 0.0F)
        f = 0.0F;
      this.height = f;
      addParam(new m.f("height", this.height));
      AppMethodBeat.o(82997);
      return;
      f = paramFloat;
    }
  }

  public void setParams(ThinShoulderParameters paramThinShoulderParameters)
  {
    AppMethodBeat.i(82994);
    setCenter(new PointF(paramThinShoulderParameters.rect.left, paramThinShoulderParameters.rect.top));
    setWidth(paramThinShoulderParameters.rect.right);
    setHeight(paramThinShoulderParameters.rect.bottom);
    AppMethodBeat.o(82994);
  }

  public void setProp(float paramFloat)
  {
    float f = 2.0F;
    AppMethodBeat.i(82998);
    if (paramFloat > 2.0F);
    while (true)
    {
      this.prop = f;
      f = paramFloat;
      if (paramFloat < 0.5F)
        f = 0.5F;
      this.prop = f;
      addParam(new m.f("prop", this.prop));
      AppMethodBeat.o(82998);
      return;
      f = paramFloat;
    }
  }

  public void setShowMark(boolean paramBoolean)
  {
    AppMethodBeat.i(82993);
    if (this.showMark != paramBoolean)
    {
      this.showMark = paramBoolean;
      if (!this.showMark)
        break label47;
    }
    label47: for (int i = 1; ; i = 0)
    {
      addParam(new m.i("showMark", i));
      AppMethodBeat.o(82993);
      return;
    }
  }

  public void setStrength(float paramFloat)
  {
    float f = 1.0F;
    AppMethodBeat.i(82992);
    if (paramFloat > 1.0F);
    while (true)
    {
      this.strength = f;
      f = paramFloat;
      if (paramFloat < 0.0F)
        f = 0.0F;
      this.strength = f;
      addParam(new m.f("strength", this.strength));
      AppMethodBeat.o(82992);
      return;
      f = paramFloat;
    }
  }

  public void setWidth(float paramFloat)
  {
    float f = 1.0F;
    AppMethodBeat.i(82996);
    if (paramFloat > 1.0F);
    while (true)
    {
      this.width = f;
      f = paramFloat;
      if (paramFloat < 0.0F)
        f = 0.0F;
      this.width = f;
      addParam(new m.f("width", this.width));
      AppMethodBeat.o(82996);
      return;
      f = paramFloat;
    }
  }

  public boolean setupBodyPoints(List<PointF> paramList, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(83000);
    if (this.mEnable)
    {
      this.currentIdx += 1;
      if (this.currentIdx >= this.smoothedWithinFrames)
        this.currentIdx = 0;
      if (paramList != null)
      {
        this.hasSeenValid = true;
        normalizePoints(paramList, paramInt1, paramInt2);
        calculateMiddleLineWithNormalizedPoints();
        this.previousValidFrames[this.currentIdx] = true;
        this.previousParams[this.currentIdx] = this.params.copy();
        paramList = this.smoothedParams;
        this.params = paramList;
        this.previousValidParams = paramList;
        this.lastValidTime = System.currentTimeMillis();
      }
    }
    while (true)
    {
      this.mEnable = bool;
      bool = this.mEnable;
      AppMethodBeat.o(83000);
      return bool;
      this.previousValidFrames[this.currentIdx] = false;
      if ((this.hasSeenValid) && (System.currentTimeMillis() - this.lastValidTime < this.validDuration))
        this.params = this.previousValidParams;
      else
        bool = false;
    }
  }

  class ThinShoulderParameters
  {
    private RectF rect;

    public ThinShoulderParameters()
    {
      AppMethodBeat.i(82988);
      this.rect = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
      AppMethodBeat.o(82988);
    }

    public ThinShoulderParameters(RectF arg2)
    {
      Object localObject;
      this.rect = localObject;
    }

    public ThinShoulderParameters copy()
    {
      AppMethodBeat.i(82990);
      ThinShoulderParameters localThinShoulderParameters = new ThinShoulderParameters(ThinShoulderFilter.this, new RectF(this.rect));
      AppMethodBeat.o(82990);
      return localThinShoulderParameters;
    }

    public void reset()
    {
      AppMethodBeat.i(82989);
      this.rect.set(0.0F, 0.0F, 0.0F, 0.0F);
      AppMethodBeat.o(82989);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.ThinShoulderFilter
 * JD-Core Version:    0.6.2
 */