package com.tencent.ttpic.util.youtu;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.util.AlgoUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YoutuPointsUtil
{
  private static void adjustEyeFeatureV2(PointF[] paramArrayOfPointF)
  {
    paramArrayOfPointF[40].x = ((float)(paramArrayOfPointF[38].x + (paramArrayOfPointF[40].x - paramArrayOfPointF[38].x) * 0.98D));
    paramArrayOfPointF[40].y = ((float)(paramArrayOfPointF[38].y + (paramArrayOfPointF[40].y - paramArrayOfPointF[38].y) * 0.98D));
    paramArrayOfPointF[41].x = ((float)(paramArrayOfPointF[37].x + (paramArrayOfPointF[41].x - paramArrayOfPointF[37].x) * 0.95D));
    paramArrayOfPointF[41].y = ((float)(paramArrayOfPointF[37].y + (paramArrayOfPointF[41].y - paramArrayOfPointF[37].y) * 0.95D));
    paramArrayOfPointF[42].x = ((float)(paramArrayOfPointF[36].x + (paramArrayOfPointF[42].x - paramArrayOfPointF[36].x) * 0.9D));
    paramArrayOfPointF[42].y = ((float)(paramArrayOfPointF[36].y + (paramArrayOfPointF[42].y - paramArrayOfPointF[36].y) * 0.9D));
    paramArrayOfPointF[50].x = ((float)(paramArrayOfPointF[48].x + (paramArrayOfPointF[50].x - paramArrayOfPointF[48].x) * 0.98D));
    paramArrayOfPointF[50].y = ((float)(paramArrayOfPointF[48].y + (paramArrayOfPointF[50].y - paramArrayOfPointF[48].y) * 0.98D));
    paramArrayOfPointF[51].x = ((float)(paramArrayOfPointF[47].x + (paramArrayOfPointF[51].x - paramArrayOfPointF[47].x) * 0.95D));
    paramArrayOfPointF[51].y = ((float)(paramArrayOfPointF[47].y + (paramArrayOfPointF[51].y - paramArrayOfPointF[47].y) * 0.95D));
    paramArrayOfPointF[52].x = ((float)(paramArrayOfPointF[46].x + (paramArrayOfPointF[52].x - paramArrayOfPointF[46].x) * 0.9D));
    paramArrayOfPointF[52].y = ((float)(paramArrayOfPointF[46].y + (paramArrayOfPointF[52].y - paramArrayOfPointF[46].y) * 0.9D));
    PointF localPointF = paramArrayOfPointF[35];
    localPointF.y = ((float)(localPointF.y + (paramArrayOfPointF[39].x - paramArrayOfPointF[35].x) / 40.0D));
    localPointF = paramArrayOfPointF[45];
    localPointF.y = ((float)(localPointF.y + (paramArrayOfPointF[45].x - paramArrayOfPointF[49].x) / 40.0D));
  }

  private static PointF getArrayMiddleV2(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84410);
    PointF localPointF = new PointF();
    for (int i = paramInt1; i <= paramInt2; i++)
    {
      localPointF.x += paramArrayOfFloat[(i * 2)];
      localPointF.y += paramArrayOfFloat[(i * 2 + 1)];
    }
    localPointF.x /= (paramInt2 - paramInt1 + 1);
    localPointF.y /= (paramInt2 - paramInt1 + 1);
    AppMethodBeat.o(84410);
    return localPointF;
  }

  public static List<PointF> getIris3Points(List<List<PointF>> paramList1, List<List<PointF>> paramList2)
  {
    AppMethodBeat.i(84414);
    ArrayList localArrayList = new ArrayList();
    if ((BaseUtils.isEmpty(paramList1)) || (BaseUtils.isEmpty(paramList2)))
      AppMethodBeat.o(84414);
    while (true)
    {
      return localArrayList;
      paramList1 = (List)paramList1.get(0);
      paramList2.get(0);
      localArrayList.add(paramList1.get(43));
      localArrayList.add(paramList1.get(53));
      AppMethodBeat.o(84414);
    }
  }

  public static List<PointF> getIris4Points(List<List<PointF>> paramList1, List<List<PointF>> paramList2)
  {
    AppMethodBeat.i(84413);
    ArrayList localArrayList = new ArrayList();
    if ((BaseUtils.isEmpty(paramList1)) || (BaseUtils.isEmpty(paramList2)))
      AppMethodBeat.o(84413);
    while (true)
    {
      return localArrayList;
      paramList1 = (List)paramList1.get(0);
      paramList2.get(0);
      localArrayList.add(paramList1.get(44));
      localArrayList.add(paramList1.get(54));
      AppMethodBeat.o(84413);
    }
  }

  public static List<PointF> getIrisPoints(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(84411);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfFloat.length != 188)
      AppMethodBeat.o(84411);
    while (true)
    {
      return localArrayList;
      for (int i = 90; i < 94; i++)
        localArrayList.add(new PointF(paramArrayOfFloat[(i * 2)], paramArrayOfFloat[(i * 2 + 1)]));
      AppMethodBeat.o(84411);
    }
  }

  public static List<PointF> getIrisRelatedPoints(List<List<PointF>> paramList1, List<List<PointF>> paramList2)
  {
    AppMethodBeat.i(84412);
    ArrayList localArrayList = new ArrayList();
    if ((BaseUtils.isEmpty(paramList1)) || (BaseUtils.isEmpty(paramList2)))
      AppMethodBeat.o(84412);
    while (true)
    {
      return localArrayList;
      paramList1 = (List)paramList1.get(0);
      paramList2 = (List)paramList2.get(0);
      localArrayList.add(paramList1.get(44));
      localArrayList.add(paramList1.get(41));
      localArrayList.add(paramList2.get(0));
      localArrayList.add(paramList1.get(37));
      localArrayList.add(paramList2.get(1));
      localArrayList.add(paramList1.get(54));
      localArrayList.add(paramList1.get(51));
      localArrayList.add(paramList2.get(2));
      localArrayList.add(paramList1.get(47));
      localArrayList.add(paramList2.get(3));
      AppMethodBeat.o(84412);
    }
  }

  private static PointF getMiddleV2(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84409);
    paramArrayOfFloat = new PointF((paramArrayOfFloat[(paramInt1 * 2)] + paramArrayOfFloat[(paramInt2 * 2)]) / 2.0F, (paramArrayOfFloat[(paramInt1 * 2 + 1)] + paramArrayOfFloat[(paramInt2 * 2 + 1)]) / 2.0F);
    AppMethodBeat.o(84409);
    return paramArrayOfFloat;
  }

  private static List<PointF> transform90PointsTo83(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(84408);
    PointF[] arrayOfPointF = new PointF[83];
    for (int i = 0; i < 83; i++)
      arrayOfPointF[i] = new PointF();
    arrayOfPointF[0] = getMiddleV2(paramArrayOfFloat, 67, 68);
    for (i = 1; i <= 17; i++)
    {
      arrayOfPointF[i].x = paramArrayOfFloat[((i + 68) * 2 + 0)];
      arrayOfPointF[i].y = paramArrayOfFloat[((i + 68) * 2 + 1)];
    }
    arrayOfPointF[18] = getMiddleV2(paramArrayOfFloat, 86, 87);
    for (i = 19; i <= 34; i++)
    {
      arrayOfPointF[i].x = paramArrayOfFloat[((i - 19) * 2 + 0)];
      arrayOfPointF[i].y = paramArrayOfFloat[((i - 19) * 2 + 1)];
    }
    for (i = 35; i <= 42; i++)
    {
      arrayOfPointF[i].x = paramArrayOfFloat[((i - 19) * 2 + 0)];
      arrayOfPointF[i].y = paramArrayOfFloat[((i - 19) * 2 + 1)];
    }
    arrayOfPointF[43] = getArrayMiddleV2(paramArrayOfFloat, 16, 23);
    arrayOfPointF[44].x = paramArrayOfFloat['°'];
    arrayOfPointF[44].y = paramArrayOfFloat['±'];
    for (i = 45; i <= 52; i++)
    {
      arrayOfPointF[i].x = paramArrayOfFloat[((i - 21) * 2 + 0)];
      arrayOfPointF[i].y = paramArrayOfFloat[((i - 21) * 2 + 1)];
    }
    arrayOfPointF[53] = getArrayMiddleV2(paramArrayOfFloat, 24, 31);
    arrayOfPointF[54].x = paramArrayOfFloat['²'];
    arrayOfPointF[54].y = paramArrayOfFloat['³'];
    arrayOfPointF[55].x = ((float)(paramArrayOfFloat[66] * 0.5D + paramArrayOfFloat[40] * 0.5D));
    arrayOfPointF[55].y = ((float)(paramArrayOfFloat[67] * 0.5D + paramArrayOfFloat[41] * 0.5D));
    arrayOfPointF[56].x = ((float)(0.1D * paramArrayOfFloat[64] + paramArrayOfFloat[70] * 0.45D + paramArrayOfFloat[72] * 0.45D));
    arrayOfPointF[56].y = ((float)(0.1D * paramArrayOfFloat[65] + paramArrayOfFloat[71] * 0.45D + paramArrayOfFloat[73] * 0.45D));
    for (i = 57; i <= 61; i++)
    {
      arrayOfPointF[i].x = paramArrayOfFloat[((i - 20) * 2 + 0)];
      arrayOfPointF[i].y = paramArrayOfFloat[((i - 20) * 2 + 1)];
    }
    arrayOfPointF[62].x = ((float)(0.1D * paramArrayOfFloat[64] + paramArrayOfFloat[86] * 0.45D + paramArrayOfFloat[84] * 0.45D));
    arrayOfPointF[62].y = ((float)(0.1D * paramArrayOfFloat[65] + paramArrayOfFloat[87] * 0.45D + paramArrayOfFloat[85] * 0.45D));
    arrayOfPointF[63].x = ((float)(paramArrayOfFloat[66] * 0.5D + paramArrayOfFloat[56] * 0.5D));
    arrayOfPointF[63].y = ((float)(paramArrayOfFloat[67] * 0.5D + paramArrayOfFloat[57] * 0.5D));
    arrayOfPointF[64].x = paramArrayOfFloat[64];
    arrayOfPointF[64].y = paramArrayOfFloat[65];
    arrayOfPointF[65].x = paramArrayOfFloat[90];
    arrayOfPointF[65].y = paramArrayOfFloat[91];
    arrayOfPointF[66].x = paramArrayOfFloat[102];
    arrayOfPointF[66].y = paramArrayOfFloat[103];
    for (i = 67; i <= 71; i++)
    {
      arrayOfPointF[i].x = paramArrayOfFloat[((i - 21) * 2 + 0)];
      arrayOfPointF[i].y = paramArrayOfFloat[((i - 21) * 2 + 1)];
    }
    arrayOfPointF[72] = getMiddleV2(paramArrayOfFloat, 60, 61);
    arrayOfPointF[73].x = paramArrayOfFloat[118];
    arrayOfPointF[73].y = paramArrayOfFloat[119];
    arrayOfPointF[74] = getMiddleV2(paramArrayOfFloat, 57, 58);
    for (i = 75; i <= 79; i++)
    {
      arrayOfPointF[i].x = paramArrayOfFloat[((131 - i) * 2 + 0)];
      arrayOfPointF[i].y = paramArrayOfFloat[((131 - i) * 2 + 1)];
    }
    arrayOfPointF[80] = getMiddleV2(paramArrayOfFloat, 62, 63);
    arrayOfPointF[81].x = paramArrayOfFloat[''];
    arrayOfPointF[81].y = paramArrayOfFloat[''];
    arrayOfPointF[82] = getMiddleV2(paramArrayOfFloat, 65, 66);
    adjustEyeFeatureV2(arrayOfPointF);
    paramArrayOfFloat = new ArrayList();
    paramArrayOfFloat.addAll(Arrays.asList(arrayOfPointF));
    AppMethodBeat.o(84408);
    return paramArrayOfFloat;
  }

  public static List<PointF> transformYTPointsToPtuPoints(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(84407);
    paramArrayOfFloat = transform90PointsTo83(paramArrayOfFloat);
    PointF localPointF = AlgoUtils.middlePoint((PointF)paramArrayOfFloat.get(55), (PointF)paramArrayOfFloat.get(63));
    paramArrayOfFloat.add(localPointF);
    paramArrayOfFloat.add(AlgoUtils.middlePoint((PointF)paramArrayOfFloat.get(23), (PointF)paramArrayOfFloat.get(31)));
    paramArrayOfFloat.add(AlgoUtils.middlePoint((PointF)paramArrayOfFloat.get(59), (PointF)paramArrayOfFloat.get(77)));
    paramArrayOfFloat.add(new PointF(2.0F * ((PointF)paramArrayOfFloat.get(35)).x - ((PointF)paramArrayOfFloat.get(6)).x, (float)(((PointF)paramArrayOfFloat.get(39)).y + (((PointF)paramArrayOfFloat.get(39)).y - ((PointF)paramArrayOfFloat.get(56)).y) * 3.2D)));
    paramArrayOfFloat.add(new PointF((float)(2.4D * ((PointF)paramArrayOfFloat.get(64)).x - 1.4D * ((PointF)paramArrayOfFloat.get(9)).x), (float)(2.5D * localPointF.y - 1.5D * ((PointF)paramArrayOfFloat.get(59)).y)));
    paramArrayOfFloat.add(new PointF(2.0F * ((PointF)paramArrayOfFloat.get(45)).x - ((PointF)paramArrayOfFloat.get(12)).x, (float)(((PointF)paramArrayOfFloat.get(49)).y * 4.2D - ((PointF)paramArrayOfFloat.get(62)).y * 3.2D)));
    float f1 = localPointF.x;
    float f2 = ((PointF)paramArrayOfFloat.get(59)).x;
    float f3 = ((PointF)paramArrayOfFloat.get(39)).y;
    paramArrayOfFloat.add(new PointF(2.0F * f1 - f2, (float)((((PointF)paramArrayOfFloat.get(49)).y + f3) / 2.0D - (((PointF)paramArrayOfFloat.get(64)).y - localPointF.y) * 1.4D)));
    AppMethodBeat.o(84407);
    return paramArrayOfFloat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.YoutuPointsUtil
 * JD-Core Version:    0.6.2
 */