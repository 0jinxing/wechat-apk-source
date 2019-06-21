package com.tencent.ttpic.filter;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.model.FaceCropItem;
import com.tencent.ttpic.model.FaceCropItem.CropFrame;
import com.tencent.ttpic.model.VideoMaterial;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import com.tencent.ttpic.util.FaceOffUtil;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FaceCropFilter extends VideoFilterBase
{
  private float[] attrPositions;
  private float[] attrTexCoords;
  private FaceCropItem faceCropItem;
  private boolean needRender;
  private List<NormalVideoFilter> normalFilters;

  public FaceCropFilter(VideoMaterial paramVideoMaterial)
  {
    super(ShaderCreateFactory.PROGRAM_TYPE.FACE_CROP);
    AppMethodBeat.i(82337);
    this.attrPositions = new float[8];
    this.attrTexCoords = new float[8];
    this.faceCropItem = paramVideoMaterial.getFaceCropItem();
    AppMethodBeat.o(82337);
  }

  private void updateParams(List<PointF> paramList, float[] paramArrayOfFloat, float paramFloat, int paramInt)
  {
    AppMethodBeat.i(82339);
    Object localObject1 = (FaceCropItem.CropFrame)this.faceCropItem.frameList.get(paramInt);
    float f1 = (float)Math.min(((FaceCropItem.CropFrame)localObject1).width / this.width, ((FaceCropItem.CropFrame)localObject1).height / this.height);
    float f2 = (float)(((FaceCropItem.CropFrame)localObject1).width / f1);
    paramFloat = (float)(((FaceCropItem.CropFrame)localObject1).height / f1);
    Object localObject2 = new PointF((f2 - this.width) / 2.0F, (paramFloat - this.height) / 2.0F);
    float f3 = (float)(((FaceCropItem.CropFrame)localObject1).faceWidth / f1);
    paramFloat = (float)(((FaceCropItem.CropFrame)localObject1).noseX / f1 - ((PointF)localObject2).x);
    float f4 = (float)(((FaceCropItem.CropFrame)localObject1).noseY / f1 - ((PointF)localObject2).y);
    localObject2 = FaceOffUtil.getFullCoords(paramList, 3.0F);
    Iterator localIterator = ((List)localObject2).iterator();
    while (localIterator.hasNext())
    {
      paramList = (PointF)localIterator.next();
      paramList.x = ((float)(paramList.x / this.mFaceDetScale));
      paramList.y = ((float)(paramList.y / this.mFaceDetScale));
    }
    float f5 = DISTANCE_OF((PointF)((List)localObject2).get(0), (PointF)((List)localObject2).get(18));
    f2 = ((PointF)((List)localObject2).get(64)).x;
    f1 = ((PointF)((List)localObject2).get(64)).y;
    paramList = new ArrayList();
    paramList.add(((List)localObject2).get(99));
    paramList.add(((List)localObject2).get(105));
    paramList.add(((List)localObject2).get(101));
    paramList.add(((List)localObject2).get(103));
    f3 /= f5;
    localObject2 = new Matrix();
    ((Matrix)localObject2).reset();
    ((Matrix)localObject2).postRotate(RADIANS2DEGREES((float)(paramArrayOfFloat[2] - ((FaceCropItem.CropFrame)localObject1).faceAngle)), f2, f1);
    ((Matrix)localObject2).postScale(f3, f3, f2, f1);
    ((Matrix)localObject2).postTranslate(paramFloat - f2, f4 - f1);
    paramArrayOfFloat = new ArrayList();
    localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (PointF)localIterator.next();
      float[] arrayOfFloat = new float[2];
      ((Matrix)localObject2).mapPoints(arrayOfFloat, new float[] { ((PointF)localObject1).x, ((PointF)localObject1).y });
      paramArrayOfFloat.add(new PointF(arrayOfFloat[0], arrayOfFloat[1]));
    }
    int i = 0;
    for (paramInt = 0; paramInt < 4; paramInt++)
    {
      localObject1 = (PointF)paramArrayOfFloat.get(paramInt);
      this.attrPositions[i] = (2.0F * ((PointF)localObject1).x / this.width - 1.0F);
      this.attrPositions[(i + 1)] = (((PointF)localObject1).y * 2.0F / this.height - 1.0F);
      localObject1 = (PointF)paramList.get(paramInt);
      this.attrTexCoords[i] = (((PointF)localObject1).x / this.width);
      this.attrTexCoords[(i + 1)] = (((PointF)localObject1).y / this.height);
      i += 2;
    }
    setDrawMode(GlUtil.DRAW_MODE.TRIANGLE_STRIP);
    setPositions(this.attrPositions);
    setTexCords(this.attrTexCoords);
    AppMethodBeat.o(82339);
  }

  final float DISTANCE_OF(PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(82340);
    float f1 = paramPointF2.x - paramPointF1.x;
    float f2 = paramPointF2.y - paramPointF1.y;
    f2 = (float)Math.sqrt(f1 * f1 + f2 * f2);
    AppMethodBeat.o(82340);
    return f2;
  }

  final float RADIANS2DEGREES(float paramFloat)
  {
    return 180.0F * paramFloat / 3.14159F;
  }

  public void initParams()
  {
  }

  public boolean isNeedRender()
  {
    return this.needRender;
  }

  public void setNormalFilters(List<NormalVideoFilter> paramList)
  {
    this.normalFilters = paramList;
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    AppMethodBeat.i(82338);
    if ((this.faceCropItem == null) || (paramPTDetectInfo.facePoints == null) || (paramPTDetectInfo.facePoints.size() < 90) || (paramPTDetectInfo.faceAngles == null) || (paramPTDetectInfo.faceAngles.length < 3))
    {
      this.needRender = false;
      AppMethodBeat.o(82338);
    }
    while (true)
    {
      return;
      label97: NormalVideoFilter localNormalVideoFilter;
      if (!BaseUtils.isEmpty(this.normalFilters))
      {
        bool = true;
        this.needRender = bool;
        if (this.normalFilters == null)
          break label165;
        Iterator localIterator = this.normalFilters.iterator();
        i = 0;
        if (!localIterator.hasNext())
          break label168;
        localNormalVideoFilter = (NormalVideoFilter)localIterator.next();
        localNormalVideoFilter.updatePreview(paramPTDetectInfo);
        if ((!this.needRender) || (!localNormalVideoFilter.isRenderReady()))
          break label160;
      }
      label160: for (boolean bool = true; ; bool = false)
      {
        this.needRender = bool;
        i = localNormalVideoFilter.getLastFrameIndex();
        break label97;
        bool = false;
        break;
      }
      label165: int i = 0;
      label168: if ((!this.needRender) || (BaseUtils.indexOutOfBounds(this.faceCropItem.frameList, i)))
      {
        AppMethodBeat.o(82338);
      }
      else
      {
        updateParams(VideoMaterialUtil.copyList(paramPTDetectInfo.facePoints), paramPTDetectInfo.faceAngles, paramPTDetectInfo.phoneAngle, i);
        AppMethodBeat.o(82338);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FaceCropFilter
 * JD-Core Version:    0.6.2
 */