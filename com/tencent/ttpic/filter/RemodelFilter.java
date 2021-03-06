package com.tencent.ttpic.filter;

import android.graphics.PointF;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.CameraBeautyParams;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.FaceDetectUtil;
import com.tencent.ttpic.util.FrameUtil;
import com.tencent.ttpic.util.VideoMaterialUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RemodelFilter
{
  private static final String PERF_LOG = "[showPreview]";
  private String[] GPU_LIST;
  public CameraBeautyParams cameraBeautyParams;
  private BaseFilter copyFilter;
  private h copyFrame;
  private BaseFilter cropFilter;
  private h cropFrame;
  private BaseFilter drawFilter;
  private h eyesFrame;
  private int[][] faceOutline;
  private List<PointF> facePoints;
  private boolean isForPhotoEdit;
  private int mChoose;
  private int mCropWidth;
  private h noseFrame;
  private ReshapeCombineFilter reshapeCombineFilter;
  private h reshapeCombineFrame;
  private ReshapeEyeNoseLips reshapeEyeNoseLipsFilter;
  private ReshapeWholeFace reshapeWholeFaceFilter;
  private int singleItemStartIndex;
  private h tempFrame;
  private int useMeshType;

  public RemodelFilter()
  {
    AppMethodBeat.i(82731);
    this.singleItemStartIndex = 2;
    this.mChoose = this.singleItemStartIndex;
    this.copyFilter = new BaseFilter(GLSLRender.bJB);
    this.cropFilter = new BaseFilter(GLSLRender.bJB);
    this.drawFilter = new BaseFilter(GLSLRender.bJB);
    this.eyesFrame = new h();
    this.noseFrame = new h();
    this.reshapeCombineFrame = new h();
    this.tempFrame = new h();
    this.cropFrame = new h();
    this.copyFrame = new h();
    this.GPU_LIST = new String[] { "Mali", "PowerVR Rogue G6200" };
    this.useMeshType = 0;
    this.isForPhotoEdit = false;
    this.cameraBeautyParams = new CameraBeautyParams();
    this.faceOutline = null;
    this.facePoints = new ArrayList();
    this.useMeshType = 0;
    this.reshapeCombineFilter = new ReshapeCombineFilter();
    this.reshapeEyeNoseLipsFilter = new ReshapeEyeNoseLips(1 - this.useMeshType);
    this.reshapeWholeFaceFilter = new ReshapeWholeFace(1 - this.useMeshType);
    AppMethodBeat.o(82731);
  }

  private void _initFilter(int[][] paramArrayOfInt, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82736);
    float[] arrayOfFloat1 = new float[2];
    arrayOfFloat1[0] = ((paramArrayOfInt[55][0] + paramArrayOfInt[63][0]) / 2.0F);
    arrayOfFloat1[1] = ((paramArrayOfInt[55][1] + paramArrayOfInt[63][1]) / 2.0F);
    float f1 = (paramArrayOfInt[23][0] + paramArrayOfInt[31][0]) / 2.0F;
    float f2 = (paramArrayOfInt[23][1] + paramArrayOfInt[31][1]) / 2.0F;
    float[] arrayOfFloat2 = new float[2];
    arrayOfFloat2[0] = (getDistance(paramArrayOfInt[39], paramArrayOfInt[35]) / paramInt1);
    arrayOfFloat2[1] = (getDistance(paramArrayOfInt[41], paramArrayOfInt[37]) / paramInt2);
    float[] arrayOfFloat3 = new float[2];
    arrayOfFloat3[0] = (paramArrayOfInt[43][0] / paramInt1);
    arrayOfFloat3[1] = (paramArrayOfInt[43][1] / paramInt2);
    float[] arrayOfFloat4 = new float[2];
    arrayOfFloat4[0] = (getDistance(paramArrayOfInt[45], paramArrayOfInt[49]) / paramInt1);
    arrayOfFloat4[1] = (getDistance(paramArrayOfInt[51], paramArrayOfInt[47]) / paramInt2);
    float[] arrayOfFloat5 = new float[2];
    arrayOfFloat5[0] = (paramArrayOfInt[53][0] / paramInt1);
    arrayOfFloat5[1] = (paramArrayOfInt[53][1] / paramInt2);
    float[] arrayOfFloat6 = new float[2];
    arrayOfFloat6[0] = ((arrayOfFloat1[0] + paramArrayOfInt[59][0]) / 2.0F / paramInt1);
    arrayOfFloat6[1] = ((arrayOfFloat1[1] + paramArrayOfInt[59][1]) / 2.0F / paramInt2);
    float[] arrayOfFloat7 = new float[2];
    arrayOfFloat7[0] = (getDistance(paramArrayOfInt[61], paramArrayOfInt[57]) / paramInt1);
    arrayOfFloat7[1] = (getDistance(arrayOfFloat1, new float[] { paramArrayOfInt[59][0], paramArrayOfInt[59][1] }) / paramInt2);
    float f3 = paramArrayOfInt[64][0] / paramInt1;
    float f4 = paramArrayOfInt[64][1] / paramInt2;
    float f5 = (paramArrayOfInt[56][0] + paramArrayOfInt[62][0]) / 2.0F;
    float f6 = (paramArrayOfInt[56][1] + paramArrayOfInt[62][1]) / 2.0F;
    float f7 = (getDistance(paramArrayOfInt[62], paramArrayOfInt[56]) + getDistance(paramArrayOfInt[61], paramArrayOfInt[57])) / 2.0F / paramInt1;
    Object localObject = paramArrayOfInt[59];
    float f8 = getDistance(new float[] { f5, f6 }, (int[])localObject) / paramInt2;
    float f9 = (paramArrayOfInt[61][0] + paramArrayOfInt[57][0]) / 2.0F / paramInt1;
    float f10 = (paramArrayOfInt[61][1] + paramArrayOfInt[57][1]) / 2.0F / paramInt2;
    f5 = (paramArrayOfInt[75][0] + paramArrayOfInt[79][0] + paramArrayOfInt[67][0] + paramArrayOfInt[71][0]) / 4.0F;
    f6 = (paramArrayOfInt[75][1] + paramArrayOfInt[79][1] + paramArrayOfInt[67][1] + paramArrayOfInt[71][1]) / 4.0F;
    float[] arrayOfFloat8 = new float[2];
    arrayOfFloat8[0] = (f5 / paramInt1);
    arrayOfFloat8[1] = (f6 / paramInt2);
    float[] arrayOfFloat9 = new float[2];
    arrayOfFloat9[0] = (getDistance(paramArrayOfInt[66], paramArrayOfInt[65]) / paramInt1);
    arrayOfFloat9[1] = (getDistance(paramArrayOfInt[77], paramArrayOfInt[69]) / paramInt2);
    float f11 = paramArrayOfInt[65][0] / paramInt1;
    float f12 = paramArrayOfInt[65][1] / paramInt2;
    float f13 = paramArrayOfInt[66][0] / paramInt1;
    float f14 = paramArrayOfInt[66][1] / paramInt2;
    float f15 = arrayOfFloat9[0] / 3.0F;
    float f16 = getDistance(paramArrayOfInt[2], paramArrayOfInt[8]) / paramInt2;
    float f17 = (paramArrayOfInt[4][0] + paramArrayOfInt[3][0]) / 2.0F / paramInt1;
    float f18 = (paramArrayOfInt[4][1] + paramArrayOfInt[3][1]) / 2.0F / paramInt2;
    float f19 = (float)(Math.atan2(paramArrayOfInt[8][1] - paramArrayOfInt[1][1], paramArrayOfInt[8][0] - paramArrayOfInt[1][0]) + 1.570796326794897D);
    float f20 = arrayOfFloat9[0] / 3.0F;
    float f21 = getDistance(paramArrayOfInt[16], paramArrayOfInt[10]) / paramInt2;
    float f22 = (paramArrayOfInt[15][0] + paramArrayOfInt[14][0]) / 2.0F / paramInt1;
    float f23 = (paramArrayOfInt[15][1] + paramArrayOfInt[14][1]) / 2.0F / paramInt2;
    float f24 = (float)(Math.atan2(paramArrayOfInt[17][1] - paramArrayOfInt[10][1], paramArrayOfInt[17][0] - paramArrayOfInt[10][0]) + 1.570796326794897D);
    f5 = 0.0F;
    f6 = 0.0F;
    for (int i = 19; i <= 26; i++)
    {
      f5 += paramArrayOfInt[i][0];
      f6 += paramArrayOfInt[i][1];
    }
    f5 /= 8.0F;
    f6 /= 8.0F;
    float[] arrayOfFloat10 = new float[2];
    arrayOfFloat10[0] = (f5 / paramInt1);
    arrayOfFloat10[1] = (f6 / paramInt2);
    float[] arrayOfFloat11 = new float[2];
    arrayOfFloat11[0] = (getDistance(paramArrayOfInt[19], paramArrayOfInt[23]) / paramInt1);
    arrayOfFloat11[1] = (getDistance(paramArrayOfInt[21], paramArrayOfInt[25]) / paramInt2);
    f5 = 0.0F;
    f6 = 0.0F;
    for (i = 27; i <= 34; i++)
    {
      f5 += paramArrayOfInt[i][0];
      f6 += paramArrayOfInt[i][1];
    }
    f5 /= 8.0F;
    f6 /= 8.0F;
    float[] arrayOfFloat12 = new float[2];
    arrayOfFloat12[0] = (f5 / paramInt1);
    arrayOfFloat12[1] = (f6 / paramInt2);
    float[] arrayOfFloat13 = new float[2];
    arrayOfFloat13[0] = (getDistance(paramArrayOfInt[27], paramArrayOfInt[31]) / paramInt1);
    arrayOfFloat13[1] = (getDistance(paramArrayOfInt[29], paramArrayOfInt[33]) / paramInt2);
    f6 = getDistance(paramArrayOfInt[0], paramArrayOfInt[18]) / paramInt1;
    float f25 = getDistance(new float[] { paramArrayOfInt[9][0], paramArrayOfInt[9][1] }, new float[] { f1, f2 }) * 1.1F / paramInt2;
    float f26 = (paramArrayOfInt[1][0] + paramArrayOfInt[17][0]) / 2.0F / paramInt1;
    f2 = (paramArrayOfInt[1][1] + paramArrayOfInt[17][1]) / 2.0F / paramInt2;
    float[] arrayOfFloat14 = new float[2];
    arrayOfFloat14[0] = ((paramArrayOfInt[56][0] + paramArrayOfInt[62][0]) / 2.0F / paramInt1);
    arrayOfFloat14[1] = ((paramArrayOfInt[56][1] + paramArrayOfInt[62][1]) / 2.0F / paramInt2);
    f5 = getDistance(paramArrayOfInt[2], paramArrayOfInt[57]) / paramInt1;
    float f27 = getDistance(paramArrayOfInt[2], paramArrayOfInt[8]) / paramInt2;
    float[] arrayOfFloat15 = new float[2];
    arrayOfFloat15[0] = ((paramArrayOfInt[4][0] + paramArrayOfInt[5][0]) / 2.0F / paramInt1);
    arrayOfFloat15[1] = ((paramArrayOfInt[4][1] + paramArrayOfInt[5][1]) / 2.0F / paramInt2);
    for (i = 0; i < 2; i++)
      arrayOfFloat15[i] += (arrayOfFloat14[i] - arrayOfFloat15[i]) * 0.07F;
    float f28 = (float)(Math.atan2(paramArrayOfInt[8][1] - paramArrayOfInt[1][1], paramArrayOfInt[8][0] - paramArrayOfInt[1][0]) + 1.570796326794897D);
    float f29 = getDistance(paramArrayOfInt[16], paramArrayOfInt[61]) / paramInt1;
    float f30 = getDistance(paramArrayOfInt[16], paramArrayOfInt[10]) / paramInt2;
    localObject = new float[2];
    localObject[0] = ((paramArrayOfInt[13][0] + paramArrayOfInt[14][0]) / 2.0F / paramInt1);
    localObject[1] = ((paramArrayOfInt[13][1] + paramArrayOfInt[14][1]) / 2.0F / paramInt2);
    for (i = 0; i < 2; i++)
      localObject[i] += (arrayOfFloat14[i] - localObject[i]) * 0.07F;
    f1 = (float)(Math.atan2(paramArrayOfInt[17][1] - paramArrayOfInt[10][1], paramArrayOfInt[17][0] - paramArrayOfInt[10][0]) + 1.570796326794897D);
    float f31 = (paramArrayOfInt[4][0] * 0.5F + paramArrayOfInt[14][0] * 0.5F) / paramInt1;
    float f32 = (paramArrayOfInt[4][1] * 0.6F + paramArrayOfInt[14][1] * 0.4F) / paramInt2;
    float f33 = getDistance(paramArrayOfInt[15], paramArrayOfInt[3]) / paramInt1;
    float f34 = getDistance(paramArrayOfInt[9], paramArrayOfInt[59]) / paramInt2;
    float f35 = arrayOfFloat1[0];
    f35 = arrayOfFloat1[0];
    f35 = paramArrayOfInt[9][0];
    f35 = arrayOfFloat1[1];
    f35 = arrayOfFloat1[1];
    f35 = paramArrayOfInt[9][1];
    float[] arrayOfFloat16 = new float[2];
    arrayOfFloat16[0] = (getDistance(paramArrayOfInt[0], paramArrayOfInt[18]) / paramInt1);
    arrayOfFloat16[1] = (getDistance(new float[] { paramArrayOfInt[59][0], paramArrayOfInt[59][1] }, arrayOfFloat1) / paramInt2);
    float[] arrayOfFloat17 = new float[3];
    arrayOfFloat17[0] = paramArrayOfFloat[0];
    arrayOfFloat17[1] = paramArrayOfFloat[1];
    arrayOfFloat17[2] = paramArrayOfFloat[2];
    arrayOfFloat17[2] = ((float)Math.atan2(paramArrayOfInt[53][1] - paramArrayOfInt[43][1], paramArrayOfInt[53][0] - paramArrayOfInt[43][0]));
    float f36 = (float)Math.min(0.8353981633974483D, Math.max(-0.8353981633974483D, arrayOfFloat17[1] * 1.0D));
    f35 = (float)Math.cos(f36);
    paramArrayOfFloat = new float[2];
    paramArrayOfFloat[0] = (paramArrayOfInt[0][0] + (arrayOfFloat1[0] - paramArrayOfInt[9][0]) * 0.7F);
    paramArrayOfFloat[1] = (paramArrayOfInt[0][1] + (arrayOfFloat1[1] - paramArrayOfInt[9][1]) * 0.7F);
    float[] arrayOfFloat18 = new float[2];
    arrayOfFloat18[0] = (paramArrayOfInt[18][0] + (arrayOfFloat1[0] - paramArrayOfInt[9][0]) * 0.7F);
    float f37 = paramArrayOfInt[18][1];
    arrayOfFloat18[1] = ((arrayOfFloat1[1] - paramArrayOfInt[9][1]) * 0.7F + f37);
    if (f36 < 0.0F)
    {
      paramArrayOfInt = new float[2];
      paramArrayOfFloat[0] += (arrayOfFloat18[0] - paramArrayOfFloat[0]) / f35 / 2.0F;
      f37 = paramArrayOfFloat[1];
      paramArrayOfInt[1] = ((arrayOfFloat18[1] - paramArrayOfFloat[1]) / f35 / 2.0F + f37);
    }
    while (true)
    {
      paramArrayOfInt[0] /= paramInt1;
      paramArrayOfInt[1] /= paramInt2;
      arrayOfFloat16[0] /= f35;
      paramArrayOfFloat = this.cameraBeautyParams.param;
      paramArrayOfFloat.clear();
      paramArrayOfFloat.put("angles", arrayOfFloat17);
      paramArrayOfFloat.put("size", new float[] { paramInt1, paramInt2 });
      paramArrayOfFloat.put("leftEyePlainSize", arrayOfFloat2);
      paramArrayOfFloat.put("leftEyeCenter", arrayOfFloat3);
      paramArrayOfFloat.put("rightEyePlainSize", arrayOfFloat4);
      paramArrayOfFloat.put("rightEyeCenter", arrayOfFloat5);
      paramArrayOfFloat.put("nose3DCenter", arrayOfFloat6);
      paramArrayOfFloat.put("nosePlainSize", arrayOfFloat7);
      paramArrayOfFloat.put("noseTipCenter", new float[] { f3, f4 });
      paramArrayOfFloat.put("noseTipPlaneSize", new float[] { f7, f8 });
      paramArrayOfFloat.put("noseBottomCenter", new float[] { f9, f10 });
      paramArrayOfFloat.put("lipsCenter", arrayOfFloat8);
      paramArrayOfFloat.put("lipsPlainSize", arrayOfFloat9);
      paramArrayOfFloat.put("leftEyebrowCenter", arrayOfFloat10);
      paramArrayOfFloat.put("leftEyebrowPlainSize", arrayOfFloat11);
      paramArrayOfFloat.put("rightEyebrowCenter", arrayOfFloat12);
      paramArrayOfFloat.put("rightEyebrowPlainSize", arrayOfFloat13);
      paramArrayOfFloat.put("lipsProtectSizeLeft", new float[] { f15, f16 });
      paramArrayOfFloat.put("lipsProtectCenterLeft", new float[] { f17, f18 });
      paramArrayOfFloat.put("lipsProtectAngleLeft", Float.valueOf(f19));
      paramArrayOfFloat.put("lipsProtectSizeRight", new float[] { f20, f21 });
      paramArrayOfFloat.put("lipsProtectCenterRight", new float[] { f22, f23 });
      paramArrayOfFloat.put("lipsProtectAngleRight", Float.valueOf(f24));
      this.reshapeEyeNoseLipsFilter.setParam(paramArrayOfFloat);
      paramArrayOfFloat.clear();
      paramArrayOfFloat.put("angles", arrayOfFloat17);
      paramArrayOfFloat.put("size", new float[] { paramInt1, paramInt2 });
      paramArrayOfFloat.put("leftEyePlainSize", arrayOfFloat2);
      paramArrayOfFloat.put("leftEyeCenter", arrayOfFloat3);
      paramArrayOfFloat.put("rightEyePlainSize", arrayOfFloat4);
      paramArrayOfFloat.put("rightEyeCenter", arrayOfFloat5);
      paramArrayOfFloat.put("leftEyebrowCenter", arrayOfFloat10);
      paramArrayOfFloat.put("leftEyebrowPlainSize", arrayOfFloat11);
      paramArrayOfFloat.put("rightEyebrowCenter", arrayOfFloat12);
      paramArrayOfFloat.put("rightEyebrowPlainSize", arrayOfFloat13);
      paramArrayOfFloat.put("nose3DCenter", arrayOfFloat6);
      paramArrayOfFloat.put("nosePlainSize", arrayOfFloat7);
      paramArrayOfFloat.put("lipsCenter", arrayOfFloat8);
      paramArrayOfFloat.put("lipsPlainSize", arrayOfFloat9);
      paramArrayOfFloat.put("lipsLeftEdge", new float[] { f11, f12 });
      paramArrayOfFloat.put("lipsRightEdge", new float[] { f13, f14 });
      paramArrayOfFloat.put("facePlainSize", new float[] { f6, f25 });
      paramArrayOfFloat.put("faceCenter", new float[] { f26, f2 });
      paramArrayOfFloat.put("facePlainSizeLeft2", new float[] { f5, f27 });
      paramArrayOfFloat.put("faceCenterLeft2", arrayOfFloat15);
      paramArrayOfFloat.put("leftAngle2", Float.valueOf(f28));
      paramArrayOfFloat.put("facePlainSizeRight2", new float[] { f29, f30 });
      paramArrayOfFloat.put("faceCenterRight2", localObject);
      paramArrayOfFloat.put("rightAngle2", Float.valueOf(f1));
      paramArrayOfFloat.put("faceMoveCenter2", arrayOfFloat14);
      paramArrayOfFloat.put("jawCenterOfGravity", new float[] { f31, f32 });
      paramArrayOfFloat.put("jawSize", new float[] { f33, f34 });
      paramArrayOfFloat.put("foreheadCenter", paramArrayOfInt);
      paramArrayOfFloat.put("foreheadSize", arrayOfFloat16);
      this.reshapeWholeFaceFilter.setParam(paramArrayOfFloat);
      AppMethodBeat.o(82736);
      return;
      paramArrayOfInt = new float[2];
      arrayOfFloat18[0] += (paramArrayOfFloat[0] - arrayOfFloat18[0]) / f35 / 2.0F;
      f37 = arrayOfFloat18[1];
      paramArrayOfInt[1] = ((paramArrayOfFloat[1] - arrayOfFloat18[1]) / f35 / 2.0F + f37);
    }
  }

  private float getDistance(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    AppMethodBeat.i(82738);
    float f1 = paramArrayOfFloat1[0] - paramArrayOfFloat2[0];
    float f2 = paramArrayOfFloat1[1] - paramArrayOfFloat2[1];
    f2 = (float)Math.sqrt(f1 * f1 + f2 * f2);
    AppMethodBeat.o(82738);
    return f2;
  }

  private float getDistance(float[] paramArrayOfFloat, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(82737);
    float f1 = paramArrayOfFloat[0] - paramArrayOfInt[0];
    float f2 = paramArrayOfFloat[1] - paramArrayOfInt[1];
    f2 = (float)Math.sqrt(f1 * f1 + f2 * f2);
    AppMethodBeat.o(82737);
    return f2;
  }

  private float getDistance(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(82739);
    float f1 = paramArrayOfInt1[0] - paramArrayOfInt2[0];
    float f2 = paramArrayOfInt1[1] - paramArrayOfInt2[1];
    f2 = (float)Math.sqrt(f1 * f1 + f2 * f2);
    AppMethodBeat.o(82739);
    return f2;
  }

  private void initFilter(List<PointF> paramList, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82734);
    if ((this.faceOutline == null) || (this.faceOutline.length != paramList.size()))
    {
      i = paramList.size();
      this.faceOutline = new int[i][2];
    }
    int j = 2147483647;
    int k = 2147483647;
    int m = -2147483648;
    int i = -2147483648;
    int n = 0;
    while (n < paramList.size())
    {
      i1 = j;
      if (j > ((PointF)paramList.get(n)).x)
        i1 = (int)((PointF)paramList.get(n)).x;
      j = k;
      if (k > ((PointF)paramList.get(n)).y)
        j = (int)((PointF)paramList.get(n)).y;
      k = m;
      if (m < ((PointF)paramList.get(n)).x)
        k = (int)((PointF)paramList.get(n)).x;
      m = i;
      if (i < ((PointF)paramList.get(n)).y)
        m = (int)((PointF)paramList.get(n)).y;
      n++;
      i = m;
      m = k;
      k = j;
      j = i1;
    }
    int i2 = (m + j) / 2;
    int i1 = (i + k) / 2;
    m = (int)(Math.max(m - j, i - k) * 2.5D);
    i = m / 2;
    k = i2 - i;
    n = i1 - i;
    j = i2 + i;
    i1 = i + i1;
    for (i = 0; i < paramList.size(); i++)
    {
      this.faceOutline[i][0] = ((int)(((PointF)paramList.get(i)).x - k));
      this.faceOutline[i][1] = ((int)(((PointF)paramList.get(i)).y - n));
    }
    paramList = new float[8];
    paramList[0] = (k / paramInt1);
    paramList[1] = (n / paramInt2);
    paramList[2] = (k / paramInt1);
    paramList[3] = (i1 / paramInt2);
    paramList[4] = (j / paramInt1);
    paramList[5] = (i1 / paramInt2);
    paramList[6] = (j / paramInt1);
    paramList[7] = (n / paramInt2);
    this.cropFilter.setTexCords(paramList);
    for (paramInt1 = 0; paramInt1 < 8; paramInt1++)
      paramList[paramInt1] = (paramList[paramInt1] * 2.0F - 1.0F);
    this.drawFilter.setPositions(paramList);
    this.mCropWidth = m;
    _initFilter(this.faceOutline, paramArrayOfFloat, m, m);
    AppMethodBeat.o(82734);
  }

  private void initFilter4(List<PointF> paramList, float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82735);
    if ((this.faceOutline == null) || (this.faceOutline.length != paramList.size()))
    {
      i = paramList.size();
      this.faceOutline = new int[i][2];
    }
    int j = 2147483647;
    int k = 2147483647;
    int m = -2147483648;
    int i = -2147483648;
    int n = 0;
    while (n < paramList.size())
    {
      i1 = j;
      if (j > ((PointF)paramList.get(n)).x)
        i1 = (int)((PointF)paramList.get(n)).x;
      j = k;
      if (k > ((PointF)paramList.get(n)).y)
        j = (int)((PointF)paramList.get(n)).y;
      k = m;
      if (m < ((PointF)paramList.get(n)).x)
        k = (int)((PointF)paramList.get(n)).x;
      m = i;
      if (i < ((PointF)paramList.get(n)).y)
        m = (int)((PointF)paramList.get(n)).y;
      n++;
      i = m;
      m = k;
      k = j;
      j = i1;
    }
    n = (m + j) / 2;
    int i1 = (i + k) / 2;
    k = (int)(Math.max(m - j, i - k) * 2.5F);
    j = k / 2;
    m = n - j;
    int i2 = i1 - j;
    for (i = 0; i < paramList.size(); i++)
    {
      this.faceOutline[i][0] = ((int)(((PointF)paramList.get(i)).x - m));
      this.faceOutline[i][1] = ((int)(((PointF)paramList.get(i)).y - i2));
    }
    paramList = this.cameraBeautyParams.param;
    paramList.clear();
    paramList.put("size", new float[] { paramInt1, paramInt2 });
    paramList.put("vectorMapSize", new float[] { k, k });
    this.reshapeCombineFilter.updateSize(m / paramInt1, (n + j) / paramInt1, i2 / paramInt2, (j + i1) / paramInt2);
    this.reshapeCombineFilter.setParam(paramList);
    _initFilter(this.faceOutline, paramArrayOfFloat, k, k);
    AppMethodBeat.o(82735);
  }

  private h processReshape(h paramh, List<List<PointF>> paramList, List<float[]> paramList1, double paramDouble)
  {
    AppMethodBeat.i(82741);
    this.cameraBeautyParams.updateReshapeParams();
    Object localObject1 = this.cameraBeautyParams.param;
    this.reshapeEyeNoseLipsFilter.setParam((Map)localObject1);
    this.reshapeWholeFaceFilter.setParam((Map)localObject1);
    int i = 0;
    localObject1 = paramh;
    while (i < paramList.size())
    {
      List localList = FaceDetectUtil.facePointf83to90(VideoMaterialUtil.copyList((List)paramList.get(i)));
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (PointF)localIterator.next();
        ((PointF)localObject2).x = ((float)(((PointF)localObject2).x / paramDouble));
        ((PointF)localObject2).y = ((float)(((PointF)localObject2).y / paramDouble));
      }
      initFilter(localList, (float[])paramList1.get(i), paramh.width, paramh.height);
      this.cropFilter.RenderProcess(localObject1.texture[0], this.mCropWidth, this.mCropWidth, -1, 0.0D, this.cropFrame);
      Object localObject2 = this.cropFrame;
      this.reshapeEyeNoseLipsFilter.RenderProcess(localObject2.texture[0], this.mCropWidth, this.mCropWidth, -1, 0.0D, this.eyesFrame);
      localObject2 = this.eyesFrame;
      this.reshapeWholeFaceFilter.RenderProcess(localObject2.texture[0], this.mCropWidth, this.mCropWidth, -1, 0.0D, this.noseFrame);
      localObject2 = this.noseFrame;
      this.copyFilter.RenderProcess(localObject1.texture[0], paramh.width, paramh.height, -1, 0.0D, this.reshapeCombineFrame);
      this.drawFilter.RenderProcess(localObject2.texture[0], paramh.width, paramh.height, -1, 0.0D, this.reshapeCombineFrame);
      localObject1 = this.reshapeCombineFrame;
      i++;
    }
    AppMethodBeat.o(82741);
    return localObject1;
  }

  private h processReshape4(h paramh, List<List<PointF>> paramList, List<float[]> paramList1, double paramDouble)
  {
    AppMethodBeat.i(82742);
    BenchUtil.benchStart("[showPreview]processReshape4 prepare");
    if (!this.cameraBeautyParams.needRender())
    {
      AppMethodBeat.o(82742);
      return paramh;
    }
    this.cameraBeautyParams.updateReshapeParams4();
    Map localMap = this.cameraBeautyParams.param;
    this.reshapeEyeNoseLipsFilter.setParam(localMap);
    this.reshapeWholeFaceFilter.setParam(localMap);
    FrameUtil.clearFrame(this.tempFrame, 0.4980392F, 0.4980392F, 0.5019608F, 0.5019608F, 128, 128);
    Object localObject1 = this.tempFrame;
    BenchUtil.benchEnd("[showPreview]processReshape4 prepare");
    int i = 0;
    h localh = paramh;
    label108: Object localObject2;
    if (i < paramList.size())
    {
      BenchUtil.benchStart("[showPreview]processReshape4 initFilter 0");
      this.facePoints = VideoMaterialUtil.copyList((List)paramList.get(i));
      List localList = FaceDetectUtil.facePointf83to90(this.facePoints);
      localObject2 = localList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        PointF localPointF = (PointF)((Iterator)localObject2).next();
        localPointF.x = ((float)(localPointF.x / paramDouble));
        localPointF.y = ((float)(localPointF.y / paramDouble));
      }
      BenchUtil.benchEnd("[showPreview]processReshape4 initFilter 0");
      BenchUtil.benchStart("[showPreview]processReshape4 initFilter4");
      initFilter4(localList, (float[])paramList1.get(i), paramh.width, paramh.height);
      BenchUtil.benchEnd("[showPreview]processReshape4 initFilter4");
      localObject2 = localObject1;
      if (this.cameraBeautyParams.needRenderEyeNoseLips())
      {
        BenchUtil.benchStart("[showPreview]processReshape4 reshapeEyeNoseLipsFilter");
        this.reshapeEyeNoseLipsFilter.RenderProcess(localObject1.texture[0], 128, 128, -1, 0.0D, this.eyesFrame);
        localObject2 = this.eyesFrame;
        BenchUtil.benchEnd("[showPreview]processReshape4 reshapeEyeNoseLipsFilter");
      }
      if (!this.cameraBeautyParams.needRenderWholeFace())
        break label590;
      BenchUtil.benchStart("[showPreview]processReshape4 reshapeWholeFaceFilter");
      this.reshapeWholeFaceFilter.RenderProcess(localObject2.texture[0], 128, 128, -1, 0.0D, this.noseFrame);
      localObject1 = this.noseFrame;
      BenchUtil.benchEnd("[showPreview]processReshape4 reshapeWholeFaceFilter");
    }
    while (true)
    {
      BenchUtil.benchStart("[showPreview]processReshape4 copyFilter 0");
      localMap.clear();
      localMap.put("inputImageTexture2", Integer.valueOf(localObject1.texture[0]));
      this.copyFilter.RenderProcess(localh.texture[0], localh.width, localh.height, -1, 0.0D, this.reshapeCombineFrame);
      BenchUtil.benchEnd("[showPreview]processReshape4 copyFilter 0");
      BenchUtil.benchStart("[showPreview]processReshape4 reshapeCombineFilter");
      this.reshapeCombineFilter.setParam(localMap);
      this.reshapeCombineFilter.RenderProcess(localh.texture[0], localh.width, localh.height, -1, 0.0D, this.reshapeCombineFrame);
      BenchUtil.benchEnd("[showPreview]processReshape4 reshapeCombineFilter");
      localh = this.reshapeCombineFrame;
      if (i < paramList.size() - 1)
      {
        BenchUtil.benchStart("[showPreview]processReshape4 copyFilter 1");
        this.copyFilter.RenderProcess(this.reshapeCombineFrame.texture[0], this.reshapeCombineFrame.width, this.reshapeCombineFrame.height, -1, 0.0D, this.copyFrame);
        BenchUtil.benchEnd("[showPreview]processReshape4 copyFilter 1");
        localh = this.copyFrame;
      }
      i++;
      break label108;
      AppMethodBeat.o(82742);
      paramh = localh;
      break;
      label590: localObject1 = localObject2;
    }
  }

  public void clear()
  {
    AppMethodBeat.i(82740);
    if (this.reshapeCombineFilter != null)
      this.reshapeCombineFilter.clearGLSLSelf();
    if (this.reshapeEyeNoseLipsFilter != null)
      this.reshapeEyeNoseLipsFilter.clearGLSLSelf();
    if (this.reshapeWholeFaceFilter != null)
      this.reshapeWholeFaceFilter.clearGLSLSelf();
    if (this.copyFilter != null)
      this.copyFilter.clearGLSLSelf();
    if (this.cropFilter != null)
      this.cropFilter.clearGLSLSelf();
    if (this.drawFilter != null)
      this.drawFilter.clearGLSLSelf();
    if (this.eyesFrame != null)
      this.eyesFrame.clear();
    if (this.noseFrame != null)
      this.noseFrame.clear();
    if (this.reshapeCombineFrame != null)
      this.reshapeCombineFrame.clear();
    if (this.tempFrame != null)
      this.tempFrame.clear();
    if (this.cropFrame != null)
      this.cropFrame.clear();
    if (this.copyFrame != null)
      this.copyFrame.clear();
    AppMethodBeat.o(82740);
  }

  public void init()
  {
    AppMethodBeat.i(82732);
    this.reshapeEyeNoseLipsFilter.ApplyGLSLFilter();
    this.reshapeWholeFaceFilter.ApplyGLSLFilter();
    this.reshapeCombineFilter.ApplyGLSLFilter();
    this.copyFilter.ApplyGLSLFilter();
    this.cropFilter.ApplyGLSLFilter();
    this.drawFilter.ApplyGLSLFilter();
    AppMethodBeat.o(82732);
  }

  public h process(h paramh, List<List<PointF>> paramList, List<float[]> paramList1, double paramDouble)
  {
    AppMethodBeat.i(82743);
    if (this.useMeshType == 0)
    {
      paramh = processReshape4(paramh, paramList, paramList1, paramDouble);
      AppMethodBeat.o(82743);
    }
    while (true)
    {
      return paramh;
      paramh = processReshape(paramh, paramList, paramList1, paramDouble);
      AppMethodBeat.o(82743);
    }
  }

  public void setIsForPhotoEdit(boolean paramBoolean)
  {
    this.isForPhotoEdit = paramBoolean;
  }

  public void setParam(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(82744);
    this.cameraBeautyParams.setParam(paramInt, paramFloat);
    AppMethodBeat.o(82744);
  }

  public void setRenderMode(int paramInt)
  {
    AppMethodBeat.i(82733);
    this.reshapeEyeNoseLipsFilter.setRenderMode(paramInt);
    this.reshapeWholeFaceFilter.setRenderMode(paramInt);
    this.reshapeCombineFilter.setRenderMode(paramInt);
    this.copyFilter.setRenderMode(paramInt);
    this.cropFilter.setRenderMode(paramInt);
    this.drawFilter.setRenderMode(paramInt);
    AppMethodBeat.o(82733);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.RemodelFilter
 * JD-Core Version:    0.6.2
 */