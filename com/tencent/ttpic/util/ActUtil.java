package com.tencent.ttpic.util;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class ActUtil
{
  public static final String EXPRESSION = "expression";
  public static final int EXPRESSION_ITEM_COUNT = 7;
  public static final int HEIGHT = 1280;
  private static final String TAG;
  public static final double[] WEIGHT;
  public static final int WIDTH = 720;

  static
  {
    AppMethodBeat.i(83804);
    TAG = ActUtil.class.getSimpleName();
    WEIGHT = new double[] { 0.2D, 0.2D, 0.3D, 0.06D, 0.06D, 0.06D, 0.12D };
    AppMethodBeat.o(83804);
  }

  private static float distanceOfPoint(PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(83802);
    float f = (float)Math.sqrt((paramPointF1.x - paramPointF2.x) * (paramPointF1.x - paramPointF2.x) + (paramPointF1.y - paramPointF2.y) * (paramPointF1.y - paramPointF2.y));
    AppMethodBeat.o(83802);
    return f;
  }

  public static float getExpressionSimilarity(List<PointF> paramList1, List<PointF> paramList2, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, double[] paramArrayOfDouble)
  {
    AppMethodBeat.i(83801);
    float f1;
    if ((paramList1 == null) || (paramList2 == null) || (paramArrayOfFloat1 == null) || (paramArrayOfFloat1.length < 3) || (paramArrayOfDouble == null) || (paramArrayOfDouble.length < 7))
    {
      f1 = 0.0F;
      AppMethodBeat.o(83801);
    }
    while (true)
    {
      return f1;
      paramList1 = FaceOffUtil.getFullCoords(FaceDetectUtil.facePointf83to90(paramList1), 2.0F);
      paramList2 = FaceOffUtil.getFullCoords(FaceDetectUtil.facePointf83to90(paramList2), 2.0F);
      if ((paramList2.size() < 106) || (paramList1.size() < 106))
      {
        f1 = 0.0F;
        AppMethodBeat.o(83801);
      }
      else
      {
        ArrayList localArrayList1 = new ArrayList(paramList1.size());
        ArrayList localArrayList2 = new ArrayList(paramList2.size());
        float f2 = AlgoUtils.getDistance((PointF)paramList1.get(99), (PointF)paramList1.get(105));
        float f3 = AlgoUtils.getDistance((PointF)paramList1.get(99), (PointF)paramList1.get(101));
        float f4 = AlgoUtils.getDistance((PointF)paramList2.get(99), (PointF)paramList2.get(105));
        f1 = AlgoUtils.getDistance((PointF)paramList2.get(99), (PointF)paramList2.get(101));
        for (int i = 0; i < paramList1.size(); i++)
        {
          localArrayList1.add(new PointF(((PointF)paramList1.get(i)).x / f2, ((PointF)paramList1.get(i)).y / f3));
          localArrayList2.add(new PointF(((PointF)paramList2.get(i)).x / f4, ((PointF)paramList2.get(i)).y / f1));
        }
        float f5 = getSimilarityOfValue(distanceOfPoint((PointF)localArrayList1.get(37), (PointF)localArrayList1.get(41)) / distanceOfPoint((PointF)localArrayList1.get(35), (PointF)localArrayList1.get(39)), distanceOfPoint((PointF)localArrayList2.get(37), (PointF)localArrayList2.get(41)) / distanceOfPoint((PointF)localArrayList2.get(35), (PointF)localArrayList2.get(39)), 0.18F, 0.5F);
        f2 = getSimilarityOfValue(distanceOfPoint((PointF)localArrayList1.get(47), (PointF)localArrayList1.get(51)) / distanceOfPoint((PointF)localArrayList1.get(45), (PointF)localArrayList1.get(49)), distanceOfPoint((PointF)localArrayList2.get(47), (PointF)localArrayList2.get(51)) / distanceOfPoint((PointF)localArrayList2.get(45), (PointF)localArrayList2.get(49)), 0.18F, 0.5F);
        float f6 = getSimilarityOfValue(distanceOfPoint((PointF)localArrayList1.get(73), (PointF)localArrayList1.get(81)) / distanceOfPoint((PointF)localArrayList1.get(65), (PointF)localArrayList1.get(66)), distanceOfPoint((PointF)localArrayList2.get(73), (PointF)localArrayList2.get(81)) / distanceOfPoint((PointF)localArrayList2.get(65), (PointF)localArrayList2.get(66)), 0.05F, 0.6F);
        float f7 = getSimilarityOfValue(paramArrayOfFloat1[0], paramArrayOfFloat2[0], -15.0F, 15.0F);
        f4 = getSimilarityOfValue(paramArrayOfFloat1[1], paramArrayOfFloat2[1], -20.0F, 20.0F);
        float f8 = getSimilarityOfValue(paramArrayOfFloat1[2], paramArrayOfFloat2[2], -15.0F, 15.0F);
        float f9 = (((PointF)localArrayList1.get(44)).x - ((PointF)localArrayList1.get(35)).x) / (((PointF)localArrayList1.get(39)).x - ((PointF)localArrayList1.get(35)).x);
        f1 = (((PointF)localArrayList1.get(54)).x - ((PointF)localArrayList1.get(45)).x) / (((PointF)localArrayList1.get(49)).x - ((PointF)localArrayList1.get(45)).x);
        float f10 = (((PointF)localArrayList2.get(44)).x - ((PointF)localArrayList2.get(35)).x) / (((PointF)localArrayList2.get(39)).x - ((PointF)localArrayList2.get(35)).x);
        f3 = (((PointF)localArrayList2.get(54)).x - ((PointF)localArrayList2.get(45)).x) / (((PointF)localArrayList2.get(49)).x - ((PointF)localArrayList2.get(45)).x);
        f10 = getSimilarityOfValue((f9 + f1) / 2.0F, (f3 + f10) / 2.0F, 0.25F, 0.75F);
        f3 = 0.0F;
        f1 = 0.0F;
        for (i = 0; i < 7; i++)
        {
          f3 = (float)(f3 + paramArrayOfDouble[i] * new float[] { f5, f2, f6, f7, f4, f8, f10 }[i]);
          f1 = (float)(f1 + paramArrayOfDouble[i]);
        }
        f1 = f3 / f1 * 100.0F;
        AppMethodBeat.o(83801);
      }
    }
  }

  private static float getSimilarityOfValue(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(83803);
    if (paramFloat1 < paramFloat3)
      paramFloat1 = paramFloat3;
    while (true)
    {
      if (paramFloat1 > paramFloat4);
      for (float f = paramFloat4; ; f = paramFloat1)
      {
        if (paramFloat2 < paramFloat3);
        for (paramFloat1 = paramFloat3; ; paramFloat1 = paramFloat2)
        {
          paramFloat2 = paramFloat1;
          if (paramFloat1 > paramFloat4)
            paramFloat2 = paramFloat4;
          paramFloat2 = Math.abs(f - paramFloat2) * 2.0F / (paramFloat4 - paramFloat3);
          paramFloat1 = paramFloat2;
          if (paramFloat2 > 1.0D)
            paramFloat1 = 1.0F;
          paramFloat1 = smoothStep(paramFloat1);
          AppMethodBeat.o(83803);
          return 1.0F - paramFloat1;
        }
      }
    }
  }

  private static float smoothStep(float paramFloat)
  {
    return paramFloat * paramFloat * paramFloat * paramFloat * (35.0F - 84.0F * paramFloat + 70.0F * paramFloat * paramFloat - 20.0F * paramFloat * paramFloat * paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.ActUtil
 * JD-Core Version:    0.6.2
 */