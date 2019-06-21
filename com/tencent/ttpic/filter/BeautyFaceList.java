package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.FaceOffUtil;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.List;

public class BeautyFaceList
{
  public static final String TAG;
  private float[] faceVertices;
  private int height;
  private ContrastFilter mContrastFilter;
  private h mContrastFrame;
  private BaseFilter mCopyFilter;
  private h mCopyFrame1;
  private h mCopyFrame2;
  private EyeLightenAndPounchFilter mEyeLightenFilter;
  private h[] mEyeLightenFrame;
  private double mFaceDetScale;
  private FaceFeatureFilter mFaceFeatureFilter;
  private h[] mFaceFeatureFrame;
  private LightRemovePouchFilter mLightRemovePouchFilter;
  private h[] mLightRemovePouchFrame;
  private h mRemovePounchFrame;
  private int width;

  static
  {
    AppMethodBeat.i(81988);
    TAG = BeautyFaceList.class.getName();
    AppMethodBeat.o(81988);
  }

  public BeautyFaceList()
  {
    AppMethodBeat.i(81974);
    this.mContrastFilter = new ContrastFilter();
    this.mCopyFilter = new BaseFilter(GLSLRender.bJB);
    this.mRemovePounchFrame = new h();
    this.mContrastFrame = new h();
    this.mEyeLightenFrame = new h[2];
    this.mFaceFeatureFrame = new h[2];
    this.mLightRemovePouchFrame = new h[2];
    this.mCopyFrame1 = new h();
    this.mCopyFrame2 = new h();
    this.faceVertices = new float[1380];
    this.mEyeLightenFilter = new EyeLightenAndPounchFilter();
    this.mFaceFeatureFilter = new FaceFeatureFilter();
    this.mLightRemovePouchFilter = new LightRemovePouchFilter();
    for (int j = 0; j < this.mEyeLightenFrame.length; j++)
      this.mEyeLightenFrame[j] = new h();
    int k;
    for (j = 0; ; j++)
    {
      k = i;
      if (j >= this.mFaceFeatureFrame.length)
        break;
      this.mFaceFeatureFrame[j] = new h();
    }
    while (k < this.mLightRemovePouchFrame.length)
    {
      this.mLightRemovePouchFrame[k] = new h();
      k++;
    }
    AppMethodBeat.o(81974);
  }

  public void clear()
  {
    int i = 0;
    AppMethodBeat.i(81982);
    this.mEyeLightenFilter.clearGLSLSelf();
    this.mFaceFeatureFilter.clearGLSLSelf();
    this.mLightRemovePouchFilter.clearGLSLSelf();
    this.mContrastFilter.ClearGLSL();
    this.mRemovePounchFrame.clear();
    h localh;
    for (localh : this.mEyeLightenFrame)
      if (localh != null)
        localh.clear();
    for (localh : this.mFaceFeatureFrame)
      if (localh != null)
        localh.clear();
    ??? = this.mLightRemovePouchFrame;
    ??? = ???.length;
    for (??? = i; ??? < ???; ???++)
    {
      localh = ???[???];
      if (localh != null)
        localh.clear();
    }
    this.mCopyFrame1.clear();
    this.mCopyFrame2.clear();
    this.mContrastFrame.clear();
    AppMethodBeat.o(81982);
  }

  public void initial()
  {
    AppMethodBeat.i(81975);
    this.mEyeLightenFilter.ApplyGLSLFilter();
    this.mFaceFeatureFilter.ApplyGLSLFilter();
    this.mLightRemovePouchFilter.ApplyGLSLFilter();
    this.mContrastFilter.ApplyGLSLFilter();
    this.mCopyFilter.ApplyGLSLFilter();
    AppMethodBeat.o(81975);
  }

  public h render(h paramh, List<List<PointF>> paramList)
  {
    AppMethodBeat.i(81981);
    int i = 0;
    int j = 0;
    if (i < paramList.size())
    {
      List localList = VideoMaterialUtil.copyList((List)paramList.get(i));
      FaceOffUtil.initFacePositions(FaceOffUtil.getFullCoords(localList, 2.0F), (int)(this.width * this.mFaceDetScale), (int)(this.height * this.mFaceDetScale), this.faceVertices);
      BenchUtil.benchStart("mBeautyFaceList mFaceFeatherFilter");
      Object localObject1 = paramh;
      int k;
      if (this.mFaceFeatureFilter.needRender())
      {
        localObject2 = this.mCopyFilter;
        k = paramh.texture[0];
        m = paramh.width;
        n = paramh.height;
        localObject1 = this.mFaceFeatureFrame;
        ((BaseFilter)localObject2).RenderProcess(k, m, n, -1, 0.0D, localObject1[(i % localObject1.length)]);
        this.mFaceFeatureFilter.updateParam(this.faceVertices);
        this.mFaceFeatureFilter.OnDrawFrameGLSL();
        this.mFaceFeatureFilter.renderTexture(paramh.texture[0], paramh.width, paramh.height);
        paramh = this.mFaceFeatureFrame;
        localObject1 = paramh[(i % paramh.length)];
      }
      BenchUtil.benchEnd("mBeautyFaceList mFaceFeatherFilter");
      paramh = (h)localObject1;
      if (this.mLightRemovePouchFilter.needRender())
      {
        localObject2 = this.mCopyFilter;
        k = localObject1.texture[0];
        n = ((h)localObject1).width;
        m = ((h)localObject1).height;
        paramh = this.mLightRemovePouchFrame;
        ((BaseFilter)localObject2).RenderProcess(k, n, m, -1, 0.0D, paramh[(i % paramh.length)]);
        this.mLightRemovePouchFilter.updateParam(this.faceVertices);
        this.mLightRemovePouchFilter.OnDrawFrameGLSL();
        this.mLightRemovePouchFilter.renderTexture(localObject1.texture[0], ((h)localObject1).width, ((h)localObject1).height);
        paramh = this.mLightRemovePouchFrame;
        paramh = paramh[(i % paramh.length)];
      }
      BenchUtil.benchStart("mBeautyFaceList mEyeLightenFilter");
      if (!this.mEyeLightenFilter.needRender())
        break label517;
      localObject1 = this.mContrastFilter;
      int n = paramh.texture[0];
      j = paramh.width;
      int m = paramh.height;
      Object localObject2 = this.mEyeLightenFrame;
      ((ContrastFilter)localObject1).RenderProcess(n, j, m, -1, 0.0D, localObject2[(i % localObject2.length)]);
      this.mEyeLightenFilter.updateParam(localList, this.faceVertices);
      this.mEyeLightenFilter.OnDrawFrameGLSL();
      this.mEyeLightenFilter.renderTexture(paramh.texture[0], paramh.width, paramh.height);
      paramh = this.mEyeLightenFrame;
      paramh = paramh[(i % paramh.length)];
      j = 1;
    }
    label517: 
    while (true)
    {
      BenchUtil.benchEnd("mBeautyFaceList mEyeLightenFilter");
      i++;
      break;
      paramList = paramh;
      if (j == 0)
      {
        paramList = paramh;
        if (this.mContrastFilter.needRender())
        {
          this.mContrastFilter.RenderProcess(paramh.texture[0], paramh.width, paramh.height, -1, 0.0D, this.mContrastFrame);
          paramList = this.mContrastFrame;
        }
      }
      AppMethodBeat.o(81981);
      return paramList;
    }
  }

  public void setContrastLevel(int paramInt)
  {
    AppMethodBeat.i(81987);
    this.mContrastFilter.setContrastLevel(paramInt);
    this.mEyeLightenFilter.setContrastLevel(paramInt);
    AppMethodBeat.o(81987);
  }

  public void setEyeLightenAlpha(float paramFloat)
  {
    AppMethodBeat.i(81978);
    this.mEyeLightenFilter.setAlphaValue(paramFloat);
    AppMethodBeat.o(81978);
  }

  public void setFaceFeatureParam(FaceFeatureParam paramFaceFeatureParam)
  {
    AppMethodBeat.i(81979);
    this.mFaceFeatureFilter.setFaceFeatureParam(paramFaceFeatureParam);
    AppMethodBeat.o(81979);
  }

  public void setLightRemovePouchAlpha(float paramFloat)
  {
    AppMethodBeat.i(81977);
    paramFloat = Math.min(1.0F, Math.max(0.0F, paramFloat / 0.9F));
    this.mLightRemovePouchFilter.setSmoothOpacity(paramFloat);
    AppMethodBeat.o(81977);
  }

  public void setLightRemovePouchSkinTexture(int paramInt)
  {
    AppMethodBeat.i(81986);
    this.mLightRemovePouchFilter.setSkinTexture(paramInt);
    AppMethodBeat.o(81986);
  }

  public void setNormalAlphaFactor(float paramFloat)
  {
    AppMethodBeat.i(81985);
    this.mFaceFeatureFilter.setNormalAlphaFactor(paramFloat);
    AppMethodBeat.o(81985);
  }

  public void setRemovePounchAlpha(float paramFloat)
  {
    AppMethodBeat.i(81976);
    this.mEyeLightenFilter.setSmoothOpacity(paramFloat);
    AppMethodBeat.o(81976);
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(81983);
    this.mEyeLightenFilter.setRenderMode(paramInt);
    this.mFaceFeatureFilter.setRenderMode(paramInt);
    this.mLightRemovePouchFilter.setRenderMode(paramInt);
    this.mContrastFilter.setRenderMode(paramInt);
    this.mCopyFilter.setRenderMode(paramInt);
    AppMethodBeat.o(81983);
  }

  public void setToothWhitenAlpha(float paramFloat)
  {
    AppMethodBeat.i(81984);
    this.mEyeLightenFilter.setToothWhitenAlpha(paramFloat);
    AppMethodBeat.o(81984);
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(81980);
    this.mEyeLightenFilter.updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.mFaceFeatureFilter.updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.mLightRemovePouchFilter.updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.width = paramInt1;
    this.height = paramInt2;
    this.mFaceDetScale = paramDouble;
    AppMethodBeat.o(81980);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.BeautyFaceList
 * JD-Core Version:    0.6.2
 */