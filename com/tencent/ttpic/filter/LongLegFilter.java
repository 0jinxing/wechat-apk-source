package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.util.List;

public class LongLegFilter extends VideoFilterBase
{
  public static final String FRAGMENT_SHADER;
  public static final String VERTEX_SHADER;
  private int currentFrame;
  private boolean hasSeenValidPoints;
  private boolean legLineStable;
  private float lineMax;
  private float lineMin;
  private long previousLostWaistTime;
  private long previousTimeForChangeToStable;
  private long previousTimeForChangeToUnstable;
  private float previousValidWaistLine;
  private float[] previousWaistLines;
  private float rangeMax;
  private long timesForChangeToStable;
  private long timesForChangeToUnstable;
  private long usePreviousIfWithin;
  private final int waistLineFrames;

  static
  {
    AppMethodBeat.i(82657);
    VERTEX_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/LongLegVertexFilter.dat");
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/LongLegFragmentFilter.dat");
    AppMethodBeat.o(82657);
  }

  public LongLegFilter()
  {
    super(VERTEX_SHADER, FRAGMENT_SHADER);
    AppMethodBeat.i(82650);
    this.waistLineFrames = 8;
    this.usePreviousIfWithin = 2000L;
    this.legLineStable = false;
    this.lineMax = 1.0F;
    this.lineMin = 1.0F;
    this.rangeMax = 0.1F;
    this.timesForChangeToStable = 3000L;
    this.timesForChangeToUnstable = 3000L;
    this.previousTimeForChangeToStable = System.currentTimeMillis();
    this.previousTimeForChangeToUnstable = System.currentTimeMillis();
    this.previousLostWaistTime = System.currentTimeMillis();
    this.hasSeenValidPoints = false;
    initParams();
    this.previousWaistLines = new float[8];
    while (i < 8)
    {
      this.previousWaistLines[i] = 1.0F;
      i++;
    }
    AppMethodBeat.o(82650);
  }

  private int getCurrentFrame()
  {
    if (this.currentFrame >= 8)
      this.currentFrame = 0;
    return this.currentFrame;
  }

  private float getCurrentSmoothedWaistLine()
  {
    float f = 0.0F;
    for (int i = 0; i < 8; i++)
      f += this.previousWaistLines[i];
    return f / 8.0F;
  }

  private float legLineToset(float paramFloat)
  {
    int i = 0;
    AppMethodBeat.i(82656);
    float f;
    if (!this.hasSeenValidPoints)
    {
      f = 1.0F;
      AppMethodBeat.o(82656);
      return f;
    }
    long l = System.currentTimeMillis();
    if (this.legLineStable)
    {
      f = (this.lineMin + this.lineMax) / 2.0F;
      if (Math.abs(f - paramFloat) < this.rangeMax)
        this.previousTimeForChangeToUnstable = l;
    }
    while (true)
    {
      AppMethodBeat.o(82656);
      break;
      if (l - this.previousTimeForChangeToUnstable >= this.timesForChangeToUnstable)
      {
        this.legLineStable = false;
        this.previousTimeForChangeToStable = l;
        this.lineMax = paramFloat;
        this.lineMin = paramFloat;
        while (i < 8)
        {
          this.previousWaistLines[i] = f;
          i++;
        }
        continue;
        if (this.lineMin < paramFloat)
        {
          f = this.lineMin;
          label144: this.lineMin = f;
          if (this.lineMax <= paramFloat)
            break label211;
        }
        label211: for (f = this.lineMax; ; f = paramFloat)
        {
          this.lineMax = f;
          if (this.lineMax - this.lineMin <= this.rangeMax)
            break label216;
          this.lineMax = paramFloat;
          this.lineMin = paramFloat;
          this.previousTimeForChangeToStable = l;
          f = paramFloat;
          break;
          f = paramFloat;
          break label144;
        }
        label216: f = paramFloat;
        if (l - this.previousTimeForChangeToStable >= this.timesForChangeToStable)
        {
          this.legLineStable = true;
          this.lineMin = (paramFloat - this.rangeMax / 2.0F);
          this.lineMax = (this.rangeMax / 2.0F + paramFloat);
          this.previousTimeForChangeToUnstable = l;
          f = paramFloat;
        }
      }
    }
  }

  public void initParams()
  {
    AppMethodBeat.i(82651);
    addParam(new m.f("y0", 0.5F));
    addParam(new m.f("strecthRatio", 0.0F));
    addParam(new m.i("showMark", 0));
    addParam(new m.i("useful", 1));
    AppMethodBeat.o(82651);
  }

  public void setStrength(float paramFloat)
  {
    AppMethodBeat.i(82652);
    addParam(new m.f("strecthRatio", 0.2F * paramFloat));
    AppMethodBeat.o(82652);
  }

  public void setWaistLine(float paramFloat)
  {
    AppMethodBeat.i(82654);
    setWaistLine(paramFloat, true);
    AppMethodBeat.o(82654);
  }

  public void setWaistLine(float paramFloat, boolean paramBoolean)
  {
    float f1 = 1.0F;
    AppMethodBeat.i(82655);
    long l = System.currentTimeMillis();
    float f2;
    if (paramFloat < 0.0F)
    {
      if ((this.legLineStable) || (l - this.previousLostWaistTime >= this.usePreviousIfWithin))
        break label176;
      f2 = this.previousValidWaistLine;
      this.previousTimeForChangeToStable = System.currentTimeMillis();
    }
    while (true)
    {
      this.previousWaistLines[getCurrentFrame()] = f2;
      this.currentFrame += 1;
      if (paramBoolean)
      {
        paramFloat = legLineToset(getCurrentSmoothedWaistLine());
        label87: if (paramFloat <= 1.0F)
          break label173;
        paramFloat = f1;
      }
      label173: 
      while (true)
      {
        f2 = paramFloat;
        if (paramFloat < 0.0F)
          f2 = 0.0F;
        addParam(new m.f("y0", f2));
        AppMethodBeat.o(82655);
        return;
        this.previousValidWaistLine = paramFloat;
        this.previousLostWaistTime = l;
        f2 = paramFloat;
        if (this.hasSeenValidPoints)
          break;
        this.hasSeenValidPoints = true;
        this.previousTimeForChangeToStable = System.currentTimeMillis();
        f2 = paramFloat;
        break;
        paramFloat = f2;
        break label87;
      }
      label176: f2 = 1.0F;
    }
  }

  public void setWaistLine(List<PointF> paramList, int paramInt)
  {
    AppMethodBeat.i(82653);
    if ((paramList == null) || (paramList.isEmpty()));
    for (float f = -1.0F; ; f = (((PointF)paramList.get(43)).y + f) / 2.0F / paramInt)
    {
      setWaistLine(f);
      AppMethodBeat.o(82653);
      return;
      f = ((PointF)paramList.get(15)).y;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.LongLegFilter
 * JD-Core Version:    0.6.2
 */