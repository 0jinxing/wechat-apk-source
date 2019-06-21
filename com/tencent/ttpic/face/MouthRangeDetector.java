package com.tencent.ttpic.face;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.util.AlgoUtils;
import java.util.List;

public class MouthRangeDetector
  implements RangeDetector
{
  private static MouthRangeDetector detector;

  static
  {
    AppMethodBeat.i(81898);
    detector = new MouthRangeDetector();
    AppMethodBeat.o(81898);
  }

  public static MouthRangeDetector getInstance()
  {
    return detector;
  }

  public float detectRange(List<PointF> paramList)
  {
    AppMethodBeat.i(81897);
    if ((paramList == null) || (paramList.size() < 90))
    {
      AppMethodBeat.o(81897);
      f = 0.0F;
      return f;
    }
    float f = AlgoUtils.getDistance((PointF)paramList.get(69), (PointF)paramList.get(73));
    if (f > 0.0F);
    for (f = AlgoUtils.getDistance((PointF)paramList.get(81), (PointF)paramList.get(73)) / (f / 2.0F); ; f = 5.0F)
    {
      f = Math.min(f / 5.0F, 1.0F);
      AppMethodBeat.o(81897);
      break;
    }
  }

  public static enum RANGE
  {
    public final int value;

    static
    {
      AppMethodBeat.i(81896);
      CLOSE_MOUTH = new RANGE("CLOSE_MOUTH", 0, 0);
      OPEN_MOUTH_20 = new RANGE("OPEN_MOUTH_20", 1, 1);
      OPEN_MOUTH_40 = new RANGE("OPEN_MOUTH_40", 2, 2);
      OPEN_MOUTH_60 = new RANGE("OPEN_MOUTH_60", 3, 3);
      OPEN_MOUTH_80 = new RANGE("OPEN_MOUTH_80", 4, 4);
      OPEN_MOUTH_100 = new RANGE("OPEN_MOUTH_100", 5, 5);
      $VALUES = new RANGE[] { CLOSE_MOUTH, OPEN_MOUTH_20, OPEN_MOUTH_40, OPEN_MOUTH_60, OPEN_MOUTH_80, OPEN_MOUTH_100 };
      AppMethodBeat.o(81896);
    }

    private RANGE(int paramInt)
    {
      this.value = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.face.MouthRangeDetector
 * JD-Core Version:    0.6.2
 */