package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo.Builder;
import com.tencent.ttpic.PTFaceAttr;
import com.tencent.ttpic.config.BeautyRealConfig.TYPE;
import com.tencent.ttpic.model.DistortParam;
import com.tencent.ttpic.util.BeautyRealUtil;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.FaceOffUtil;
import com.tencent.ttpic.util.VideoFrameUtil;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PTBeautyTransform
{
  private static final int MAX_TRANSFORMED_FACES = 5;
  private int frameIndex;
  private TransformFilter mBasic3;
  private BeautyParam mBeautyParam;
  private TransformFilter mChinThinShorten;
  private BaseFilter mCopyFilter;
  private List<TransformFilter> mFilters;
  private BeautyParam mOrigBeautyParam;
  private TransformFilter mVFaceEyeNose;
  private h[] transFrame;

  public PTBeautyTransform()
  {
    AppMethodBeat.i(82696);
    this.mBasic3 = null;
    this.transFrame = new h[2];
    BenchUtil.benchStart("[onSurfaceCreated] create BeautyParam");
    this.mOrigBeautyParam = new BeautyParam(true);
    this.mBeautyParam = new BeautyParam(false);
    BenchUtil.benchEnd("[onSurfaceCreated] create BeautyParam");
    this.mVFaceEyeNose = new TransformFilter(new ArrayList(), null);
    this.mChinThinShorten = new TransformFilter(new ArrayList(), null);
    this.mBasic3 = new TransformFilter(new ArrayList(), null);
    this.mFilters = new ArrayList();
    this.mCopyFilter = new BaseFilter(GLSLRender.bJB);
    while (i < this.transFrame.length)
    {
      this.transFrame[i] = new h();
      i++;
    }
    AppMethodBeat.o(82696);
  }

  private void clearTransFrame()
  {
    AppMethodBeat.i(82702);
    for (int i = 0; i < this.transFrame.length; i++)
      this.transFrame[i].clear();
    AppMethodBeat.o(82702);
  }

  private void rebuildFilterList()
  {
    AppMethodBeat.i(82701);
    this.mFilters.clear();
    if ((this.mBeautyParam.vlian.getLevel() != 0) || (this.mBeautyParam.eye.getLevel() != 0) || (this.mBeautyParam.nose.getLevel() != 0))
      this.mFilters.add(this.mVFaceEyeNose);
    if ((this.mBeautyParam.zhailian.getLevel() != 0) || (this.mBeautyParam.xiaba.getLevel() != 0) || (this.mBeautyParam.faceShorten.getLevel() != 0))
      this.mFilters.add(this.mChinThinShorten);
    if (BeautyParam.MESH_SET == 0)
      if (this.mBeautyParam.basic573.getLevel() != 0)
        this.mFilters.add(this.mBasic3);
    while (true)
    {
      clearTransFrame();
      AppMethodBeat.o(82701);
      return;
      if (this.mBeautyParam.basic4.getLevel() != 0)
        this.mFilters.add(this.mBasic3);
    }
  }

  private void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82707);
    this.mVFaceEyeNose.updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.mChinThinShorten.updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.mBasic3.updateVideoSize(paramInt1, paramInt2, paramDouble);
    AppMethodBeat.o(82707);
  }

  public void destroy()
  {
    AppMethodBeat.i(82706);
    clearTransFrame();
    this.mVFaceEyeNose.clearGLSLSelf();
    this.mChinThinShorten.clearGLSLSelf();
    this.mBasic3.clearGLSLSelf();
    this.mCopyFilter.ClearGLSL();
    AppMethodBeat.o(82706);
  }

  public BeautyParam getBeautyParam()
  {
    return this.mBeautyParam;
  }

  public void initial()
  {
    AppMethodBeat.i(82697);
    BenchUtil.benchStart("[onSurfaceCreated] create Beauty Transform Filters");
    this.mVFaceEyeNose.ApplyGLSLFilter();
    this.mChinThinShorten.ApplyGLSLFilter();
    this.mBasic3.ApplyGLSLFilter();
    BenchUtil.benchEnd("[onSurfaceCreated] create Beauty Transform Filters");
    BenchUtil.benchStart("[onSurfaceCreated] create Beauty mCopyFilter");
    this.mCopyFilter.ApplyGLSLFilter();
    BenchUtil.benchEnd("[onSurfaceCreated] create Beauty mCopyFilter");
    AppMethodBeat.o(82697);
  }

  public boolean needFaceInfo()
  {
    AppMethodBeat.i(82708);
    boolean bool;
    if (this.mFilters.size() != 0)
    {
      bool = true;
      AppMethodBeat.o(82708);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(82708);
    }
  }

  public h process(h paramh, PTFaceAttr paramPTFaceAttr)
  {
    AppMethodBeat.i(82703);
    List localList1 = paramPTFaceAttr.getAllFacePoints();
    List localList2 = paramPTFaceAttr.getAllFaceAngles();
    double d = paramPTFaceAttr.getFaceDetectScale();
    int i = paramPTFaceAttr.getRotation();
    updateVideoSize(paramh.width, paramh.height, d);
    paramh = updateAndRender(paramh, localList1, localList2, i);
    AppMethodBeat.o(82703);
    return paramh;
  }

  public void setBeautyParam(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82699);
    setBeautyParamItem(paramInt1, BeautyRealUtil.getDistortParam(this.mOrigBeautyParam.getDistortList(paramInt1), paramInt2, paramInt1));
    AppMethodBeat.o(82699);
  }

  public void setBeautyParam(BeautyParam paramBeautyParam)
  {
    AppMethodBeat.i(82698);
    if (paramBeautyParam == null)
    {
      AppMethodBeat.o(82698);
      return;
    }
    setBeautyParamItem(BeautyRealConfig.TYPE.FACE_V.value, paramBeautyParam.vlian);
    setBeautyParamItem(BeautyRealConfig.TYPE.EYE.value, paramBeautyParam.eye);
    setBeautyParamItem(BeautyRealConfig.TYPE.NOSE.value, paramBeautyParam.nose);
    setBeautyParamItem(BeautyRealConfig.TYPE.FACE_THIN.value, paramBeautyParam.zhailian);
    setBeautyParamItem(BeautyRealConfig.TYPE.CHIN.value, paramBeautyParam.xiaba);
    setBeautyParamItem(BeautyRealConfig.TYPE.FACE_SHORTEN.value, paramBeautyParam.faceShorten);
    if (BeautyParam.MESH_SET == 0)
      setBeautyParamItem(BeautyRealConfig.TYPE.BASIC3.value, paramBeautyParam.basic573);
    while (true)
    {
      rebuildFilterList();
      AppMethodBeat.o(82698);
      break;
      setBeautyParamItem(BeautyRealConfig.TYPE.BASIC3.value, paramBeautyParam.basic4);
    }
  }

  public void setBeautyParamItem(int paramInt, DistortParam paramDistortParam)
  {
    AppMethodBeat.i(82700);
    if (paramDistortParam == null)
    {
      AppMethodBeat.o(82700);
      return;
    }
    if ((paramInt == BeautyRealConfig.TYPE.FACE_V.value) || (paramInt == BeautyRealConfig.TYPE.EYE.value) || (paramInt == BeautyRealConfig.TYPE.NOSE.value))
      if (paramInt == BeautyRealConfig.TYPE.FACE_V.value)
      {
        this.mBeautyParam.vlian = paramDistortParam;
        label63: paramDistortParam = new ArrayList();
        paramDistortParam.addAll(this.mBeautyParam.vlian.getItems());
        paramDistortParam.addAll(this.mBeautyParam.eye.getItems());
        paramDistortParam.addAll(this.mBeautyParam.nose.getItems());
        this.mVFaceEyeNose.setDistortionItems(paramDistortParam);
      }
    while (true)
    {
      rebuildFilterList();
      AppMethodBeat.o(82700);
      break;
      if (paramInt == BeautyRealConfig.TYPE.EYE.value)
      {
        this.mBeautyParam.eye = paramDistortParam;
        break label63;
      }
      if (paramInt != BeautyRealConfig.TYPE.NOSE.value)
        break label63;
      this.mBeautyParam.nose = paramDistortParam;
      break label63;
      if ((paramInt == BeautyRealConfig.TYPE.FACE_THIN.value) || (paramInt == BeautyRealConfig.TYPE.CHIN.value) || (paramInt == BeautyRealConfig.TYPE.FACE_SHORTEN.value))
      {
        if (paramInt == BeautyRealConfig.TYPE.FACE_THIN.value)
          this.mBeautyParam.zhailian = paramDistortParam;
        while (true)
        {
          paramDistortParam = new ArrayList();
          paramDistortParam.addAll(this.mBeautyParam.zhailian.getItems());
          paramDistortParam.addAll(this.mBeautyParam.xiaba.getItems());
          paramDistortParam.addAll(this.mBeautyParam.faceShorten.getItems());
          this.mChinThinShorten.setDistortionItems(paramDistortParam);
          break;
          if (paramInt == BeautyRealConfig.TYPE.CHIN.value)
            this.mBeautyParam.xiaba = paramDistortParam;
          else if (paramInt == BeautyRealConfig.TYPE.FACE_SHORTEN.value)
            this.mBeautyParam.faceShorten = paramDistortParam;
        }
      }
      if (paramInt == BeautyRealConfig.TYPE.BASIC3.value)
        if (BeautyParam.MESH_SET == 0)
        {
          this.mBeautyParam.basic573 = paramDistortParam;
          paramDistortParam = new ArrayList();
          paramDistortParam.addAll(this.mBeautyParam.basic573.getItems());
          this.mBasic3.setDistortionItems(paramDistortParam);
        }
        else
        {
          this.mBeautyParam.basic4 = paramDistortParam;
          paramDistortParam = new ArrayList();
          paramDistortParam.addAll(this.mBeautyParam.basic4.getItems());
          this.mBasic3.setDistortionItems(paramDistortParam);
        }
    }
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(82709);
    this.mVFaceEyeNose.setRenderMode(paramInt);
    this.mChinThinShorten.setRenderMode(paramInt);
    this.mCopyFilter.setRenderMode(paramInt);
    AppMethodBeat.o(82709);
  }

  public h updateAndRender(h paramh, List<List<PointF>> paramList, List<float[]> paramList1, float paramFloat)
  {
    AppMethodBeat.i(82704);
    this.frameIndex = ((this.frameIndex + 1) % 2);
    if (paramList != null)
    {
      int i = 0;
      h localh = paramh;
      while (true)
      {
        localObject = localh;
        if (i >= Math.min(paramList.size(), 5))
          break;
        List localList = (List)paramList.get(i);
        localObject = (float[])paramList1.get(i);
        Iterator localIterator = this.mFilters.iterator();
        if (localIterator.hasNext())
        {
          TransformFilter localTransformFilter = (TransformFilter)localIterator.next();
          BenchUtil.benchStart("[BeautyTransformList] updatePreview");
          localTransformFilter.updatePreview(new PTDetectInfo.Builder().facePoints(localList).faceAngles((float[])localObject).phoneAngle(paramFloat).build());
          BenchUtil.benchEnd("[BeautyTransformList] updatePreview");
          BenchUtil.benchStart("[BeautyTransformList] renderProcessBySwitchFbo");
          if (VideoMaterialUtil.needCopyTransform());
          for (localh = VideoFrameUtil.renderProcessByCopy(localh.texture[0], localh.width, localh.height, localTransformFilter, this.mCopyFilter, paramh, this.transFrame[this.frameIndex]); ; localh = VideoFrameUtil.renderProcessBySwitchFbo(localh.texture[0], localh.width, localh.height, localTransformFilter, paramh, this.transFrame[this.frameIndex]))
          {
            BenchUtil.benchEnd("[BeautyTransformList] renderProcessBySwitchFbo");
            break;
          }
        }
        i++;
      }
    }
    Object localObject = paramh;
    AppMethodBeat.o(82704);
    return localObject;
  }

  public void updateAndRender(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, List<List<PointF>> paramList)
  {
    AppMethodBeat.i(82705);
    h localh1 = new h(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramList != null)
    {
      int i = 0;
      h localh2 = localh1;
      while (i < Math.min(paramList.size(), 5))
      {
        Object localObject = this.mFilters.iterator();
        while (((Iterator)localObject).hasNext())
        {
          TransformFilter localTransformFilter = (TransformFilter)((Iterator)localObject).next();
          localTransformFilter.updateParams((List)paramList.get(i), null, 1.0D, new float[] { 0.0F, 0.0F, 0.0F });
          localh2 = VideoFrameUtil.renderProcessBySwitchFbo(localh2.texture[0], paramInt3, paramInt4, localTransformFilter, localh1, this.transFrame[0]);
        }
        if (localh2.texture[0] != paramInt2)
        {
          localObject = new h(paramInt1, paramInt2, paramInt3, paramInt4);
          this.mCopyFilter.RenderProcess(localh2.texture[0], paramInt3, paramInt4, paramInt2, 0.0D, (h)localObject);
        }
        i++;
      }
    }
    AppMethodBeat.o(82705);
  }

  public void updateFaceFeature(List<List<PointF>> paramList)
  {
    AppMethodBeat.i(82710);
    if (paramList == null)
      AppMethodBeat.o(82710);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        List localList = (List)localIterator.next();
        BenchUtil.benchStart("[BeautyTransformList] getFullCoords");
        FaceOffUtil.getFullCoords(localList, 2.0F);
        BenchUtil.benchEnd("[BeautyTransformList] getFullCoords");
        BenchUtil.benchStart("[BeautyTransformList] updateFaceFeature");
        paramList = this.mFilters.iterator();
        while (paramList.hasNext())
          ((TransformFilter)paramList.next()).updateFaceFeatures(localList);
        BenchUtil.benchEnd("[BeautyTransformList] updateFaceFeature");
      }
      AppMethodBeat.o(82710);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.PTBeautyTransform
 * JD-Core Version:    0.6.2
 */