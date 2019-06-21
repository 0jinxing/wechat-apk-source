package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.m.c;
import com.tencent.filter.m.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTDetectInfo;
import com.tencent.ttpic.gles.GlUtil.DRAW_MODE;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.List;

public class SnakeFaceFilter extends VideoFilterBase
{
  private static final float CHIN_DOWN_SCALE = 0.05F;
  private static final float EYE_MAGNIFY_SCALE = 0.4F;
  private static final float FACE_SLIM_SCALE = 0.3F;
  private static final int SIZE_POINT = 102;
  private static final int XCOORD_NUM = 24;
  private static final int YCOORD_NUM = 32;
  private PointF[] dstPoints;
  private List<PointF> mFullscreenVertices;
  private List<PointF> mInitTextureCoordinates;
  private PointF[] pDst;
  private PointF[] pSrc;
  private PointF[] srcPoints;

  public SnakeFaceFilter()
  {
    super(ShaderCreateFactory.PROGRAM_TYPE.SNAKE_FACE);
    AppMethodBeat.i(82942);
    this.pSrc = new PointF[90];
    this.pDst = new PointF[90];
    initCoordinates();
    initParams();
    AppMethodBeat.o(82942);
  }

  private void adjustPoints(int paramInt)
  {
    if ((this.srcPoints == null) || (this.dstPoints == null) || (this.srcPoints.length != this.dstPoints.length));
    while (true)
    {
      return;
      for (int i = 0; i < paramInt; i++)
      {
        PointF localPointF = this.srcPoints[i];
        localPointF.x = ((float)(localPointF.x + 0.02D));
        localPointF = this.srcPoints[i];
        localPointF.y = ((float)(localPointF.y + 0.02D));
        localPointF = this.dstPoints[i];
        localPointF.x = ((float)(localPointF.x + 0.02D));
        localPointF = this.dstPoints[i];
        localPointF.y = ((float)(localPointF.y + 0.02D));
      }
    }
  }

  private void initCoordinates()
  {
    AppMethodBeat.i(82943);
    this.mFullscreenVertices = VideoMaterialUtil.genFullScreenVertices(24, 32, -1.0F, 1.0F, -1.0F, 1.0F);
    this.mInitTextureCoordinates = VideoMaterialUtil.genFullScreenVertices(24, 32, 0.0F, 1.0F, 0.0F, 1.0F);
    AppMethodBeat.o(82943);
  }

  private void refineSnakeEyePoint(PointF[] paramArrayOfPointF1, PointF[] paramArrayOfPointF2)
  {
    AppMethodBeat.i(82948);
    PointF localPointF1 = paramArrayOfPointF2[44];
    PointF localPointF2 = paramArrayOfPointF2[54];
    for (int i = 35; i <= 42; i++)
      paramArrayOfPointF2[i] = new PointF(paramArrayOfPointF1[i].x + (paramArrayOfPointF1[i].x - localPointF1.x) * 0.4F, paramArrayOfPointF1[i].y + (paramArrayOfPointF1[i].y - localPointF1.y) * 0.4F);
    for (i = 45; i <= 52; i++)
      paramArrayOfPointF2[i] = new PointF(paramArrayOfPointF1[i].x + (paramArrayOfPointF1[i].x - localPointF2.x) * 0.4F, paramArrayOfPointF1[i].y + (paramArrayOfPointF1[i].y - localPointF2.y) * 0.4F);
    AppMethodBeat.o(82948);
  }

  private void refineSnakeFacePoint(PointF[] paramArrayOfPointF1, PointF[] paramArrayOfPointF2)
  {
    AppMethodBeat.i(82947);
    PointF localPointF1 = paramArrayOfPointF2[0];
    PointF localPointF2 = paramArrayOfPointF2[9];
    PointF localPointF3 = paramArrayOfPointF2[18];
    for (int i = 1; i <= 9; i++)
    {
      paramArrayOfPointF2[i] = new PointF((localPointF1.x * (9 - i) + localPointF2.x * i) / 9.0F, (localPointF1.y * (9 - i) + localPointF2.y * i) / 9.0F);
      paramArrayOfPointF2[(18 - i)] = new PointF((localPointF3.x * (9 - i) + localPointF2.x * i) / 9.0F, (localPointF3.y * (9 - i) + localPointF2.y * i) / 9.0F);
    }
    for (i = 1; i < 18; i++)
    {
      float f1 = paramArrayOfPointF2[i].x;
      float f2 = paramArrayOfPointF1[i].x;
      float f3 = paramArrayOfPointF2[i].y;
      float f4 = paramArrayOfPointF1[i].y;
      paramArrayOfPointF2[i] = new PointF((f1 - f2) * 0.3F + paramArrayOfPointF1[i].x, (f3 - f4) * 0.3F + paramArrayOfPointF1[i].y);
    }
    AppMethodBeat.o(82947);
  }

  private void updateGLParams(int paramInt)
  {
    AppMethodBeat.i(82946);
    addParam(new m.i(SnakeFaceFilter.SHADER_FIELD.NPOINT.name, paramInt));
    addParam(new m.c(SnakeFaceFilter.SHADER_FIELD.FSRC.name, VideoMaterialUtil.toFlatArray(this.srcPoints)));
    addParam(new m.c(SnakeFaceFilter.SHADER_FIELD.FDST.name, VideoMaterialUtil.toFlatArray(this.dstPoints)));
    AppMethodBeat.o(82946);
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82949);
    super.ApplyGLSLFilter();
    setPositions(VideoMaterialUtil.toFlatArray((PointF[])this.mFullscreenVertices.toArray(new PointF[0])));
    setTexCords(VideoMaterialUtil.toFlatArray((PointF[])this.mInitTextureCoordinates.toArray(new PointF[0])));
    setDrawMode(GlUtil.DRAW_MODE.TRIANGLE_STRIP);
    setCoordNum(1561);
    AppMethodBeat.o(82949);
  }

  public void initParams()
  {
    AppMethodBeat.i(82944);
    addParam(new m.i(SnakeFaceFilter.SHADER_FIELD.NPOINT.name, 0));
    addParam(new m.c(SnakeFaceFilter.SHADER_FIELD.FSRC.name, new float[0]));
    addParam(new m.c(SnakeFaceFilter.SHADER_FIELD.FDST.name, new float[0]));
    AppMethodBeat.o(82944);
  }

  public void updatePreview(PTDetectInfo paramPTDetectInfo)
  {
    int i = 0;
    AppMethodBeat.i(82945);
    paramPTDetectInfo = VideoMaterialUtil.copyList(paramPTDetectInfo.facePoints);
    if ((paramPTDetectInfo == null) || (paramPTDetectInfo.size() < 90))
    {
      this.srcPoints = new PointF[0];
      this.dstPoints = new PointF[0];
    }
    for (int j = 0; ; j = 102)
    {
      adjustPoints(j);
      updateGLParams(j);
      AppMethodBeat.o(82945);
      return;
      VideoMaterialUtil.flipYPoints(paramPTDetectInfo, (int)(this.height * this.mFaceDetScale));
      for (j = 0; j < 90; j++)
      {
        if (this.pSrc[j] == null)
          this.pSrc[j] = new PointF();
        if (this.pDst[j] == null)
          this.pDst[j] = new PointF();
        PointF localPointF1 = this.pSrc[j];
        PointF localPointF2 = this.pDst[j];
        f1 = ((PointF)paramPTDetectInfo.get(j)).x;
        localPointF2.x = f1;
        localPointF1.x = f1;
        localPointF1 = this.pSrc[j];
        localPointF2 = this.pDst[j];
        f1 = ((PointF)paramPTDetectInfo.get(j)).y;
        localPointF2.y = f1;
        localPointF1.y = f1;
      }
      float f2 = this.pSrc[9].x;
      float f1 = this.pSrc[64].x;
      float f3 = this.pSrc[9].y;
      float f4 = this.pSrc[64].y;
      paramPTDetectInfo = this.pDst[9];
      paramPTDetectInfo.x = ((f2 - f1) * 0.05F + paramPTDetectInfo.x);
      paramPTDetectInfo = this.pDst[9];
      paramPTDetectInfo.y = ((f3 - f4) * 0.05F + paramPTDetectInfo.y);
      refineSnakeFacePoint(this.pSrc, this.pDst);
      refineSnakeEyePoint(this.pSrc, this.pDst);
      if ((this.srcPoints == null) || (this.srcPoints.length != 102))
        this.srcPoints = new PointF[102];
      if (this.dstPoints != null)
      {
        j = i;
        if (this.dstPoints.length == 102);
      }
      else
      {
        this.dstPoints = new PointF[102];
      }
      for (j = i; j < 83; j++)
      {
        this.srcPoints[j] = this.pSrc[j];
        this.dstPoints[j] = this.pDst[j];
      }
      for (j = 83; j < 101; j++)
      {
        i = j - 83;
        this.srcPoints[j] = new PointF((this.pSrc[i].x + this.pSrc[(i + 1)].x) / 2.0F, (this.pSrc[i].y + this.pSrc[(i + 1)].y) / 2.0F);
        paramPTDetectInfo = this.dstPoints;
        f3 = (this.pDst[i].x + this.pDst[(i + 1)].x) / 2.0F;
        f1 = this.pDst[i].y;
        paramPTDetectInfo[j] = new PointF(f3, (this.pDst[(i + 1)].y + f1) / 2.0F);
      }
      this.srcPoints[101] = new PointF((float)(this.width * this.mFaceDetScale), (float)(this.height * this.mFaceDetScale));
      this.dstPoints[101] = new PointF((float)(this.width * this.mFaceDetScale), (float)(this.height * this.mFaceDetScale));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.SnakeFaceFilter
 * JD-Core Version:    0.6.2
 */