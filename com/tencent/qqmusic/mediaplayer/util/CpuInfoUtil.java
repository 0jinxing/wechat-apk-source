package com.tencent.qqmusic.mediaplayer.util;

public class CpuInfoUtil
{
  private static final String CUR_CPU_FREQ = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq";
  private static final String TAG = "CpuInfoUtil";
  private static CpuInfoUtil.OutputCpuThread mCurrThread = null;

  public static void outputCpuHZToLog()
  {
  }

  public static void outputThreadInfoToLog()
  {
  }

  public static void startProcessInfoOutput()
  {
  }

  public static void stopProcessInfoOutput()
  {
    try
    {
      mCurrThread = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.util.CpuInfoUtil
 * JD-Core Version:    0.6.2
 */