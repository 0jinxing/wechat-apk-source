package com.tencent.ttpic.face;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.util.AlgoUtils;
import java.util.List;

public class RightEyeRangeDetector
  implements RangeDetector
{
  private static RightEyeRangeDetector detector;

  static
  {
    AppMethodBeat.i(81904);
    detector = new RightEyeRangeDetector();
    AppMethodBeat.o(81904);
  }

  public static RightEyeRangeDetector getInstance()
  {
    return detector;
  }

  public float detectRange(List<PointF> paramList)
  {
    AppMethodBeat.i(81903);
    if ((paramList == null) || (paramList.size() < 90))
    {
      AppMethodBeat.o(81903);
      f = 0.0F;
      return f;
    }
    float f = AlgoUtils.getDistance((PointF)paramList.get(37), (PointF)paramList.get(38));
    if (f > 0.0F);
    for (f = AlgoUtils.getDistance((PointF)paramList.get(37), (PointF)paramList.get(41)) / (f / 3.0F); ; f = 5.0F)
    {
      f = Math.min(f / 5.0F, 1.0F);
      AppMethodBeat.o(81903);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.face.RightEyeRangeDetector
 * JD-Core Version:    0.6.2
 */