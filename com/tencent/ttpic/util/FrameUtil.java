package com.tencent.ttpic.util;

import android.opengl.GLES20;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.util.a;
import java.util.ArrayList;
import java.util.List;

public class FrameUtil
{
  private static final h EMPTY_FRAME;
  private static final String TAG;

  static
  {
    AppMethodBeat.i(50270);
    TAG = FrameUtil.class.getSimpleName();
    EMPTY_FRAME = new h();
    AppMethodBeat.o(50270);
  }

  public static void clearFrame(h paramh, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50267);
    if (paramh == null)
      AppMethodBeat.o(50267);
    while (true)
    {
      return;
      paramh.a(-1, paramInt1, paramInt2, 0.0D);
      GLES20.glClearColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      GLES20.glClear(16384);
      AppMethodBeat.o(50267);
    }
  }

  public static void clearTailFrame(BaseFilter paramBaseFilter, h paramh)
  {
    AppMethodBeat.i(50265);
    for (int i = getLength(paramBaseFilter); (i > 0) && (paramh != null); i--)
      paramh = paramh.bJA;
    if (paramh != null)
      paramh.clear();
    AppMethodBeat.o(50265);
  }

  public static List<BaseFilter> filterChain2List(BaseFilter paramBaseFilter)
  {
    AppMethodBeat.i(50268);
    ArrayList localArrayList = new ArrayList();
    while (paramBaseFilter != null)
    {
      BaseFilter localBaseFilter = paramBaseFilter.getmNextFilter();
      paramBaseFilter.setNextFilter(null, null);
      localArrayList.add(paramBaseFilter);
      paramBaseFilter = localBaseFilter;
    }
    AppMethodBeat.o(50268);
    return localArrayList;
  }

  public static void filterList2Chain(List<BaseFilter> paramList)
  {
    AppMethodBeat.i(50269);
    if (BaseUtils.isEmpty(paramList))
      AppMethodBeat.o(50269);
    while (true)
    {
      return;
      BaseFilter localBaseFilter = (BaseFilter)paramList.get(0);
      for (int i = 1; i < paramList.size(); i++)
      {
        localBaseFilter.setNextFilter((BaseFilter)paramList.get(i), null);
        localBaseFilter = (BaseFilter)paramList.get(i);
      }
      AppMethodBeat.o(50269);
    }
  }

  public static h getLastRenderFrame(h paramh)
  {
    AppMethodBeat.i(50263);
    h localh1;
    if (!isValid(paramh))
    {
      localh1 = EMPTY_FRAME;
      AppMethodBeat.o(50263);
    }
    while (true)
    {
      return localh1;
      localh1 = paramh;
      while (isValid(paramh))
      {
        h localh2 = paramh.bJA;
        localh1 = paramh;
        paramh = localh2;
      }
      AppMethodBeat.o(50263);
    }
  }

  public static int getLength(BaseFilter paramBaseFilter)
  {
    AppMethodBeat.i(50260);
    int i = 0;
    while (paramBaseFilter != null)
    {
      i++;
      paramBaseFilter = paramBaseFilter.getmNextFilter();
    }
    AppMethodBeat.o(50260);
    return i;
  }

  public static int getLength(h paramh)
  {
    int i = 0;
    while ((paramh != null) && (paramh.texture[0] > 0))
    {
      i++;
      paramh = paramh.bJA;
    }
    return i;
  }

  public static h getSecondLastRenderFrame(h paramh)
  {
    AppMethodBeat.i(50262);
    h localh1;
    if ((!isValid(paramh)) || (!isValid(paramh.bJA)))
    {
      localh1 = EMPTY_FRAME;
      AppMethodBeat.o(50262);
    }
    while (true)
    {
      return localh1;
      localh1 = paramh;
      while ((isValid(paramh)) && (isValid(paramh.bJA)))
      {
        h localh2 = paramh.bJA;
        localh1 = paramh;
        paramh = localh2;
      }
      AppMethodBeat.o(50262);
    }
  }

  public static boolean isValid(h paramh)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramh != null)
    {
      bool2 = bool1;
      if (paramh.texture[0] != 0)
        bool2 = true;
    }
    return bool2;
  }

  public static void printFilterList(BaseFilter paramBaseFilter)
  {
    AppMethodBeat.i(50261);
    for (int i = 0; paramBaseFilter != null; i++)
    {
      new StringBuilder("[FILTER] ").append(i).append(" ").append(paramBaseFilter);
      paramBaseFilter = paramBaseFilter.getmNextFilter();
    }
    AppMethodBeat.o(50261);
  }

  public static h renderProcessBySwitchFbo(int paramInt1, int paramInt2, int paramInt3, BaseFilter paramBaseFilter, h paramh1, h paramh2)
  {
    AppMethodBeat.i(50264);
    if (paramh1.texture[0] == paramInt1);
    while (true)
    {
      paramBaseFilter.RenderProcess(paramInt1, paramInt2, paramInt3, -1, 0.0D, paramh2);
      AppMethodBeat.o(50264);
      return paramh2;
      paramh2 = paramh1;
    }
  }

  public static h rotateCorrect(h paramh1, int paramInt1, int paramInt2, int paramInt3, BaseFilter paramBaseFilter, h paramh2)
  {
    AppMethodBeat.i(50266);
    if (paramInt3 == 0)
    {
      AppMethodBeat.o(50266);
      return paramh1;
    }
    int i = (paramInt3 + 360) % 360;
    if ((i == 90) || (i == 270))
    {
      paramInt3 = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
    }
    while (true)
    {
      a.benchStart("[VideoFilterList] mRotationFilter before");
      paramBaseFilter.nativeSetRotationAndFlip(i, 0, 0);
      paramBaseFilter.RenderProcess(paramh1.texture[0], paramInt1, paramInt2, -1, 0.0D, paramh2);
      a.auz("[VideoFilterList] mRotationFilter before");
      AppMethodBeat.o(50266);
      paramh1 = paramh2;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.FrameUtil
 * JD-Core Version:    0.6.2
 */