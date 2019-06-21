package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo.Builder;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.config.BeautyRealConfig.TYPE;
import com.tencent.ttpic.model.DistortParam;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.FaceOffUtil;
import com.tencent.ttpic.util.VideoFrameUtil;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BeautyTransformList
{
  private static int FACE_CACHE_LEN = 0;
  private static final int MAX_TRANSFORMED_FACES = 5;
  private final int MAX_COUNT;
  private int frameIndex;
  private TransformFilter mBasic3;
  private BeautyParam mBeautyParam;
  private TransformFilter mChinThinShorten;
  private BaseFilter mCopyFilter;
  private List<TransformFilter> mFilters;
  private TransformFilter mVFaceEyeNose;
  private List<BeautyTransformList.FaceInfoOfPeople> peopleList;
  private h[] transFrame;

  public BeautyTransformList()
  {
    AppMethodBeat.i(82025);
    this.mBasic3 = null;
    this.transFrame = new h[2];
    this.peopleList = new LinkedList();
    this.MAX_COUNT = 6;
    BenchUtil.benchStart("[onSurfaceCreated] create BeautyParam");
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
    AppMethodBeat.o(82025);
  }

  private int chooseBestDataIndex(List<List<PointF>> paramList, List<float[]> paramList1)
  {
    AppMethodBeat.i(82034);
    paramList.size();
    int i = paramList.size() - 1;
    if (i >= 0)
      if (sameShape((List)paramList.get(0), (List)paramList.get(i), (float[])paramList1.get(0), (float[])paramList1.get(i)))
        AppMethodBeat.o(82034);
    while (true)
    {
      return i;
      i--;
      break;
      AppMethodBeat.o(82034);
      i = 0;
    }
  }

  private void clearTransFrame()
  {
    AppMethodBeat.i(82030);
    for (int i = 0; i < this.transFrame.length; i++)
      this.transFrame[i].clear();
    AppMethodBeat.o(82030);
  }

  private BeautyTransformList.FaceInfoOfFrame getFaceInfo()
  {
    AppMethodBeat.i(82035);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    Object localObject = this.peopleList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      BeautyTransformList.FaceInfoOfPeople localFaceInfoOfPeople = (BeautyTransformList.FaceInfoOfPeople)((Iterator)localObject).next();
      localArrayList1.add(localFaceInfoOfPeople.faces.getLast());
      localArrayList2.add(localFaceInfoOfPeople.facesAngles.getLast());
      localArrayList3.add(Integer.valueOf(localFaceInfoOfPeople.count));
    }
    localObject = new BeautyTransformList.FaceInfoOfFrame(this, localArrayList1, localArrayList2, localArrayList3);
    AppMethodBeat.o(82035);
    return localObject;
  }

  private float my_smoothstep(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    paramFloat1 = (paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1);
    if (paramFloat1 < 0.0F)
      paramFloat1 = f2;
    while (true)
    {
      if (paramFloat1 > 1.0F)
        paramFloat1 = f1;
      while (true)
        return (3.0F - paramFloat1 * 2.0F) * (paramFloat1 * paramFloat1);
    }
  }

  private void rebuildFilterList()
  {
    AppMethodBeat.i(82029);
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
      AppMethodBeat.o(82029);
      return;
      if (this.mBeautyParam.basic4.getLevel() != 0)
        this.mFilters.add(this.mBasic3);
    }
  }

  private boolean samePeople(List<PointF> paramList1, List<PointF> paramList2)
  {
    AppMethodBeat.i(82032);
    float f1 = ((PointF)paramList1.get(0)).x;
    f1 = (((PointF)paramList1.get(18)).x + f1) / 2.0F;
    float f2 = ((PointF)paramList1.get(0)).y;
    PointF localPointF1 = new PointF(f1, (((PointF)paramList1.get(18)).y + f2) / 2.0F);
    f1 = ((PointF)paramList2.get(0)).x;
    f1 = (((PointF)paramList2.get(18)).x + f1) / 2.0F;
    f2 = ((PointF)paramList2.get(0)).y;
    PointF localPointF2 = new PointF(f1, (((PointF)paramList2.get(18)).y + f2) / 2.0F);
    f1 = Math.min(AlgoUtils.getDistance((PointF)paramList1.get(0), (PointF)paramList1.get(18)), AlgoUtils.getDistance((PointF)paramList2.get(0), (PointF)paramList2.get(18)));
    boolean bool;
    if (AlgoUtils.getDistance(localPointF1, localPointF2) < f1 * 0.5F)
    {
      bool = true;
      AppMethodBeat.o(82032);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(82032);
      bool = false;
    }
  }

  private boolean sameShape(List<PointF> paramList1, List<PointF> paramList2, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    AppMethodBeat.i(82036);
    float f1 = (float)Math.min(0.8353981633974483D, Math.max(-0.8353981633974483D, paramArrayOfFloat1[1] * 1.2D));
    float f2 = (float)Math.min(0.8353981633974483D, Math.max(-0.8353981633974483D, paramArrayOfFloat1[0] * 1.1D));
    float f3 = (float)(AlgoUtils.getDistance((PointF)paramList1.get(0), (PointF)paramList1.get(18)) / Math.cos(f1));
    f1 = (float)(AlgoUtils.getDistance((PointF)paramList1.get(44), (PointF)paramList1.get(54)) / Math.cos(f1));
    float f4 = ((PointF)paramList1.get(44)).x;
    f4 = (((PointF)paramList1.get(54)).x + f4) / 2.0F;
    float f5 = ((PointF)paramList1.get(44)).y;
    f2 = (float)(AlgoUtils.getDistance(new PointF(f4, (((PointF)paramList1.get(54)).y + f5) / 2.0F), (PointF)paramList1.get(9)) / Math.cos(f2));
    float f6 = (float)Math.min(0.8353981633974483D, Math.max(-0.8353981633974483D, paramArrayOfFloat2[1] * 1.2D));
    f5 = (float)Math.min(0.8353981633974483D, Math.max(-0.8353981633974483D, paramArrayOfFloat2[0] * 1.1D));
    f4 = (float)(AlgoUtils.getDistance((PointF)paramList2.get(0), (PointF)paramList2.get(18)) / Math.cos(f6));
    f6 = (float)(AlgoUtils.getDistance((PointF)paramList2.get(44), (PointF)paramList2.get(54)) / Math.cos(f6));
    float f7 = ((PointF)paramList2.get(44)).x;
    f7 = (((PointF)paramList2.get(54)).x + f7) / 2.0F;
    float f8 = ((PointF)paramList2.get(44)).y;
    f5 = (float)(AlgoUtils.getDistance(new PointF(f7, (((PointF)paramList2.get(54)).y + f8) / 2.0F), (PointF)paramList2.get(9)) / Math.cos(f5));
    f1 = Math.abs(f1 / f3 - f6 / f4);
    boolean bool;
    if (Math.abs(f2 / f3 - f5 / f4) + f1 < 0.1D)
    {
      bool = true;
      AppMethodBeat.o(82036);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(82036);
    }
  }

  private void updatePeopleList(List<List<PointF>> paramList, List<float[]> paramList1)
  {
    AppMethodBeat.i(82033);
    if (BaseUtils.isEmpty(paramList))
    {
      AppMethodBeat.o(82033);
      return;
    }
    int i = 0;
    label22: Object localObject1;
    Object localObject2;
    if (i < paramList.size())
    {
      localObject1 = (List)paramList.get(i);
      Iterator localIterator = this.peopleList.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (BeautyTransformList.FaceInfoOfPeople)localIterator.next();
        if (samePeople((List)localObject1, (List)((BeautyTransformList.FaceInfoOfPeople)localObject2).faces.getLast()))
        {
          if (((BeautyTransformList.FaceInfoOfPeople)localObject2).count > 0)
          {
            ((BeautyTransformList.FaceInfoOfPeople)localObject2).faces.clear();
            ((BeautyTransformList.FaceInfoOfPeople)localObject2).facesAngles.clear();
          }
          ((BeautyTransformList.FaceInfoOfPeople)localObject2).faces.add(localObject1);
          if (((BeautyTransformList.FaceInfoOfPeople)localObject2).faces.size() > FACE_CACHE_LEN)
            ((BeautyTransformList.FaceInfoOfPeople)localObject2).faces.removeFirst();
          ((BeautyTransformList.FaceInfoOfPeople)localObject2).facesAngles.add(paramList1.get(i));
          if (((BeautyTransformList.FaceInfoOfPeople)localObject2).facesAngles.size() > FACE_CACHE_LEN)
            ((BeautyTransformList.FaceInfoOfPeople)localObject2).facesAngles.removeFirst();
          ((BeautyTransformList.FaceInfoOfPeople)localObject2).count = -1;
        }
      }
    }
    for (int j = 0; ; j = 1)
    {
      if (j != 0)
      {
        localObject2 = new BeautyTransformList.FaceInfoOfPeople(this);
        ((BeautyTransformList.FaceInfoOfPeople)localObject2).faces.add(localObject1);
        ((BeautyTransformList.FaceInfoOfPeople)localObject2).facesAngles.add(paramList1.get(i));
        this.peopleList.add(localObject2);
      }
      i++;
      break label22;
      localObject2 = this.peopleList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramList = (BeautyTransformList.FaceInfoOfPeople)((Iterator)localObject2).next();
        paramList.count += 1;
        if (paramList.count > 0)
          if (paramList.count >= 6)
          {
            ((Iterator)localObject2).remove();
          }
          else
          {
            i = chooseBestDataIndex(paramList.faces, paramList.facesAngles);
            paramList1 = (List)paramList.faces.get(i);
            localObject1 = (float[])paramList.facesAngles.get(i);
            paramList.faces.clear();
            paramList.facesAngles.clear();
            paramList.faces.add(paramList1);
            paramList.facesAngles.add(localObject1);
          }
      }
      AppMethodBeat.o(82033);
      break;
    }
  }

  public void clear()
  {
    AppMethodBeat.i(82039);
    clearTransFrame();
    this.mVFaceEyeNose.clearGLSLSelf();
    this.mChinThinShorten.clearGLSLSelf();
    this.mBasic3.clearGLSLSelf();
    this.mCopyFilter.ClearGLSL();
    AppMethodBeat.o(82039);
  }

  public BeautyParam getBeautyParam()
  {
    return this.mBeautyParam;
  }

  public void initial()
  {
    AppMethodBeat.i(82026);
    BenchUtil.benchStart("[onSurfaceCreated] create Beauty Transform Filters");
    this.mVFaceEyeNose.ApplyGLSLFilter();
    this.mChinThinShorten.ApplyGLSLFilter();
    this.mBasic3.ApplyGLSLFilter();
    BenchUtil.benchEnd("[onSurfaceCreated] create Beauty Transform Filters");
    BenchUtil.benchStart("[onSurfaceCreated] create Beauty mCopyFilter");
    this.mCopyFilter.ApplyGLSLFilter();
    BenchUtil.benchEnd("[onSurfaceCreated] create Beauty mCopyFilter");
    AppMethodBeat.o(82026);
  }

  public boolean needFaceInfo()
  {
    AppMethodBeat.i(82041);
    boolean bool;
    if (this.mFilters.size() != 0)
    {
      bool = true;
      AppMethodBeat.o(82041);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(82041);
    }
  }

  public h process(h paramh, List<List<PointF>> paramList, double paramDouble, List<float[]> paramList1, float paramFloat)
  {
    AppMethodBeat.i(82031);
    updateVideoSize(paramh.width, paramh.height, paramDouble);
    paramh = updateAndRender(paramh, paramList, paramList1, paramFloat);
    AppMethodBeat.o(82031);
    return paramh;
  }

  public void setBeautyParam(int paramInt, DistortParam paramDistortParam)
  {
    AppMethodBeat.i(82028);
    if (paramDistortParam == null)
    {
      AppMethodBeat.o(82028);
      return;
    }
    if ((paramInt == BeautyRealConfig.TYPE.FACE_V.value) || (paramInt == BeautyRealConfig.TYPE.EYE.value) || (paramInt == BeautyRealConfig.TYPE.NOSE.value))
      if (paramInt == BeautyRealConfig.TYPE.FACE_V.value)
      {
        this.mBeautyParam.vlian = paramDistortParam;
        label65: paramDistortParam = new ArrayList();
        paramDistortParam.addAll(this.mBeautyParam.vlian.getItems());
        paramDistortParam.addAll(this.mBeautyParam.eye.getItems());
        paramDistortParam.addAll(this.mBeautyParam.nose.getItems());
        this.mVFaceEyeNose.setDistortionItems(paramDistortParam);
      }
    while (true)
    {
      rebuildFilterList();
      AppMethodBeat.o(82028);
      break;
      if (paramInt == BeautyRealConfig.TYPE.EYE.value)
      {
        this.mBeautyParam.eye = paramDistortParam;
        break label65;
      }
      if (paramInt != BeautyRealConfig.TYPE.NOSE.value)
        break label65;
      this.mBeautyParam.nose = paramDistortParam;
      break label65;
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

  public void setBeautyParam(BeautyParam paramBeautyParam)
  {
    AppMethodBeat.i(82027);
    if (paramBeautyParam == null)
    {
      AppMethodBeat.o(82027);
      return;
    }
    setBeautyParam(BeautyRealConfig.TYPE.FACE_V.value, paramBeautyParam.vlian);
    setBeautyParam(BeautyRealConfig.TYPE.EYE.value, paramBeautyParam.eye);
    setBeautyParam(BeautyRealConfig.TYPE.NOSE.value, paramBeautyParam.nose);
    setBeautyParam(BeautyRealConfig.TYPE.FACE_THIN.value, paramBeautyParam.zhailian);
    setBeautyParam(BeautyRealConfig.TYPE.CHIN.value, paramBeautyParam.xiaba);
    setBeautyParam(BeautyRealConfig.TYPE.FACE_SHORTEN.value, paramBeautyParam.faceShorten);
    if (BeautyParam.MESH_SET == 0)
      setBeautyParam(BeautyRealConfig.TYPE.BASIC3.value, paramBeautyParam.basic573);
    while (true)
    {
      rebuildFilterList();
      AppMethodBeat.o(82027);
      break;
      setBeautyParam(BeautyRealConfig.TYPE.BASIC3.value, paramBeautyParam.basic4);
    }
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(82042);
    this.mVFaceEyeNose.setRenderMode(paramInt);
    this.mChinThinShorten.setRenderMode(paramInt);
    this.mCopyFilter.setRenderMode(paramInt);
    AppMethodBeat.o(82042);
  }

  public h updateAndRender(h paramh, List<List<PointF>> paramList, List<float[]> paramList1, float paramFloat)
  {
    AppMethodBeat.i(82037);
    updatePeopleList(paramList, paramList1);
    paramList = getFaceInfo();
    List localList1 = paramList.faces;
    List localList2 = paramList.facesAngles;
    List localList3 = paramList.countList;
    this.frameIndex = ((this.frameIndex + 1) % 2);
    if (!BaseUtils.isEmpty(localList1))
    {
      int i = 0;
      paramList = paramh;
      while (true)
      {
        paramList1 = paramList;
        if (i >= Math.min(localList1.size(), 5))
          break;
        paramList1 = (List)localList1.get(i);
        float[] arrayOfFloat = (float[])localList2.get(i);
        Iterator localIterator = this.mFilters.iterator();
        if (localIterator.hasNext())
        {
          TransformFilter localTransformFilter = (TransformFilter)localIterator.next();
          BenchUtil.benchStart("[BeautyTransformList] updatePreview");
          localTransformFilter.updateStrength(1.0F - my_smoothstep(0.4F, 1.0F, ((Integer)localList3.get(i)).intValue() / 6.0F));
          localTransformFilter.updatePreview(new PTDetectInfo.Builder().facePoints(paramList1).faceAngles(arrayOfFloat).phoneAngle(paramFloat).build());
          BenchUtil.benchEnd("[BeautyTransformList] updatePreview");
          BenchUtil.benchStart("[BeautyTransformList] renderProcessBySwitchFbo");
          if (VideoMaterialUtil.needCopyTransform());
          for (paramList = VideoFrameUtil.renderProcessByCopy(paramList.texture[0], paramList.width, paramList.height, localTransformFilter, this.mCopyFilter, paramh, this.transFrame[this.frameIndex]); ; paramList = VideoFrameUtil.renderProcessBySwitchFbo(paramList.texture[0], paramList.width, paramList.height, localTransformFilter, paramh, this.transFrame[this.frameIndex]))
          {
            BenchUtil.benchEnd("[BeautyTransformList] renderProcessBySwitchFbo");
            break;
          }
        }
        i++;
      }
    }
    paramList1 = paramh;
    AppMethodBeat.o(82037);
    return paramList1;
  }

  public void updateAndRender(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, List<List<PointF>> paramList)
  {
    AppMethodBeat.i(82038);
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
    AppMethodBeat.o(82038);
  }

  public void updateFaceFeature(List<List<PointF>> paramList)
  {
    AppMethodBeat.i(82043);
    if (paramList == null)
      AppMethodBeat.o(82043);
    while (true)
    {
      return;
      Iterator localIterator1 = paramList.iterator();
      while (localIterator1.hasNext())
      {
        paramList = (List)localIterator1.next();
        BenchUtil.benchStart("[BeautyTransformList] getFullCoords");
        FaceOffUtil.getFullCoords(paramList, 2.0F);
        BenchUtil.benchEnd("[BeautyTransformList] getFullCoords");
        BenchUtil.benchStart("[BeautyTransformList] updateFaceFeature");
        Iterator localIterator2 = this.mFilters.iterator();
        while (localIterator2.hasNext())
          ((TransformFilter)localIterator2.next()).updateFaceFeatures(paramList);
        BenchUtil.benchEnd("[BeautyTransformList] updateFaceFeature");
      }
      AppMethodBeat.o(82043);
    }
  }

  public void updateVideoSize(int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(82040);
    this.mVFaceEyeNose.updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.mChinThinShorten.updateVideoSize(paramInt1, paramInt2, paramDouble);
    this.mBasic3.updateVideoSize(paramInt1, paramInt2, paramDouble);
    AppMethodBeat.o(82040);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.BeautyTransformList
 * JD-Core Version:    0.6.2
 */