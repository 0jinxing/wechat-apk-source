package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.config.MediaConfig;
import com.tencent.util.i;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FrameRateUtil
{
  private static final int BASE_COUNT = 6;
  private static int FPS_LIST_MAX_COUNT = 0;
  public static final int MAX_FPS = 18;
  private static final String TAG;
  private static final long TIME_INTERVAL = 55L;
  private static int count;
  private static List<Long> fpsList;
  private static List<Long> fpsListForDG;
  private static FrameRateUtil.DowngradeListener listener;
  private static FrameRateUtil.DOWNGRADE_LEVEL mDowngradeLevel;
  public static int mFrameCount;
  public static long mRecordStartTime;
  private static long start;

  static
  {
    AppMethodBeat.i(83927);
    TAG = FrameRateUtil.class.getSimpleName();
    fpsList = new LinkedList();
    fpsListForDG = new LinkedList();
    FPS_LIST_MAX_COUNT = 500;
    mDowngradeLevel = FrameRateUtil.DOWNGRADE_LEVEL.MEDIUM;
    AppMethodBeat.o(83927);
  }

  public static void checkFps(long paramLong)
  {
    try
    {
      AppMethodBeat.i(83923);
      if (55L - paramLong > 0L);
      while (true)
      {
        try
        {
          Thread.sleep(100L);
          AppMethodBeat.o(83923);
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
        }
        AppMethodBeat.o(83923);
      }
    }
    finally
    {
    }
  }

  public static void clearFpsList()
  {
    try
    {
      AppMethodBeat.i(83922);
      i.k(TAG, "clearFpsList");
      fpsList.clear();
      AppMethodBeat.o(83922);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static void downgrade()
  {
    AppMethodBeat.i(83925);
    if ((mDowngradeLevel == null) || (listener == null))
    {
      AppMethodBeat.o(83925);
      return;
    }
    if (mDowngradeLevel.equals(FrameRateUtil.DOWNGRADE_LEVEL.HIGH))
    {
      mDowngradeLevel = FrameRateUtil.DOWNGRADE_LEVEL.MEDIUM;
      listener.downgrade(MediaConfig.INTERMIDIATE_IMAGE_WIDTH_MEDIUM);
    }
    while (true)
    {
      new StringBuilder("[downgrade] ").append(mDowngradeLevel.value);
      VideoPrefsUtil.setDowngradeLevel(mDowngradeLevel.value);
      AppMethodBeat.o(83925);
      break;
      if (mDowngradeLevel.equals(FrameRateUtil.DOWNGRADE_LEVEL.MEDIUM))
      {
        mDowngradeLevel = FrameRateUtil.DOWNGRADE_LEVEL.LOW;
        listener.downgrade(MediaConfig.INTERMIDIATE_IMAGE_WIDTH_LOW);
      }
    }
  }

  public static List<Long> getFpsList()
  {
    return fpsListForDG;
  }

  public static FrameRateUtil.DOWNGRADE_LEVEL getRenderLevel()
  {
    return mDowngradeLevel;
  }

  public static void recordFps(boolean paramBoolean)
  {
    int i = 0;
    try
    {
      AppMethodBeat.i(83921);
      count += 1;
      if (fpsListForDG.size() >= FPS_LIST_MAX_COUNT)
        fpsListForDG.clear();
      if (count >= 6)
      {
        long l1 = System.currentTimeMillis();
        long l2 = 6000L / (l1 - start);
        if (fpsList.size() >= FPS_LIST_MAX_COUNT)
          fpsList.remove(0);
        fpsList.add(Long.valueOf(l2));
        fpsListForDG.add(Long.valueOf(l2));
        start = l1;
        count = 0;
      }
      if (paramBoolean)
        if (mDowngradeLevel.equals(FrameRateUtil.DOWNGRADE_LEVEL.LOW))
          AppMethodBeat.o(83921);
      while (true)
      {
        return;
        if (fpsListForDG.size() >= 12)
        {
          Collections.sort(fpsListForDG);
          for (int j = 4; j < fpsListForDG.size() - 4; j++)
            i = (int)(i + ((Long)fpsListForDG.get(j)).longValue());
          if (i / (fpsListForDG.size() - 8) < 10)
            downgrade();
          fpsListForDG.clear();
        }
        AppMethodBeat.o(83921);
      }
    }
    finally
    {
    }
  }

  public static void setDowngradeLevel(int paramInt)
  {
    AppMethodBeat.i(83926);
    FrameRateUtil.DOWNGRADE_LEVEL[] arrayOfDOWNGRADE_LEVEL = FrameRateUtil.DOWNGRADE_LEVEL.values();
    int i = arrayOfDOWNGRADE_LEVEL.length;
    int j = 0;
    if (j < i)
    {
      FrameRateUtil.DOWNGRADE_LEVEL localDOWNGRADE_LEVEL = arrayOfDOWNGRADE_LEVEL[j];
      if (paramInt == localDOWNGRADE_LEVEL.value)
      {
        mDowngradeLevel = localDOWNGRADE_LEVEL;
        AppMethodBeat.o(83926);
      }
    }
    while (true)
    {
      return;
      j++;
      break;
      AppMethodBeat.o(83926);
    }
  }

  public static void setListener(FrameRateUtil.DowngradeListener paramDowngradeListener)
  {
    listener = paramDowngradeListener;
  }

  public static void upgrade()
  {
    AppMethodBeat.i(83924);
    if (mDowngradeLevel == null)
      mDowngradeLevel = FrameRateUtil.DOWNGRADE_LEVEL.MEDIUM;
    if (mDowngradeLevel.equals(FrameRateUtil.DOWNGRADE_LEVEL.MEDIUM))
      mDowngradeLevel = FrameRateUtil.DOWNGRADE_LEVEL.MEDIUM;
    while (true)
    {
      VideoPrefsUtil.setDowngradeLevel(mDowngradeLevel.value);
      AppMethodBeat.o(83924);
      return;
      if (mDowngradeLevel.equals(FrameRateUtil.DOWNGRADE_LEVEL.LOW))
        mDowngradeLevel = FrameRateUtil.DOWNGRADE_LEVEL.MEDIUM;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.FrameRateUtil
 * JD-Core Version:    0.6.2
 */