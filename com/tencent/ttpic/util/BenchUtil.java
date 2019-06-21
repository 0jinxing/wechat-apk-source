package com.tencent.ttpic.util;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.cache.VideoMemoryManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BenchUtil
{
  private static final int COUNT = 10;
  public static boolean ENABLE_LOG = false;
  public static boolean ENABLE_MEMINFO = false;
  public static boolean ENABLE_PERFORMANCE_RECORD = false;
  private static final String PREFIX = "[time]";
  public static String SHOWPREVIEW_BENCH_TAG;
  private static final String TAG;
  private static Map<String, Long> lastTimeMap;
  private static BenchUtil.LoggerAgent sLogger;
  private static Map<String, Long> startTimeMap;
  private static Map<String, List<Long>> totalTimeMap;

  static
  {
    AppMethodBeat.i(83822);
    TAG = BenchUtil.class.getSimpleName();
    startTimeMap = new HashMap();
    totalTimeMap = new HashMap();
    lastTimeMap = new HashMap();
    sLogger = new BenchUtil.LoggerAgent();
    ENABLE_LOG = false;
    ENABLE_PERFORMANCE_RECORD = false;
    SHOWPREVIEW_BENCH_TAG = "showPreview_";
    ENABLE_MEMINFO = false;
    AppMethodBeat.o(83822);
  }

  public static long benchEnd(String paramString)
  {
    AppMethodBeat.i(83812);
    long l1;
    if ((!ENABLE_LOG) || (TextUtils.isEmpty(paramString)) || (startTimeMap == null))
    {
      AppMethodBeat.o(83812);
      l1 = 0L;
    }
    while (true)
    {
      return l1;
      Long localLong = (Long)startTimeMap.get(paramString);
      if (localLong == null)
      {
        AppMethodBeat.o(83812);
        l1 = 0L;
      }
      else
      {
        if ((ENABLE_PERFORMANCE_RECORD) && (paramString.startsWith(SHOWPREVIEW_BENCH_TAG)))
          GLES20.glFinish();
        List localList = (List)totalTimeMap.get(paramString);
        Object localObject = localList;
        if (localList == null)
        {
          localObject = new ArrayList();
          totalTimeMap.put(paramString, localObject);
        }
        l1 = System.currentTimeMillis() - localLong.longValue();
        ((List)localObject).add(Long.valueOf(l1));
        if (((List)localObject).size() >= 10)
        {
          long l2 = getTotalTime((List)localObject) / ((List)localObject).size();
          LogUtils.d(TAG, "[time]" + paramString + ": " + l2 + "ms");
          lastTimeMap.put(paramString, Long.valueOf(l2));
          ((List)localObject).clear();
        }
        AppMethodBeat.o(83812);
      }
    }
  }

  public static void benchEnd(String paramString, int paramInt)
  {
    AppMethodBeat.i(83815);
    if (!ENABLE_LOG)
      AppMethodBeat.o(83815);
    while (true)
    {
      return;
      if ((!TextUtils.isEmpty(paramString)) && (startTimeMap.get(paramString) != null))
        break;
      AppMethodBeat.o(83815);
    }
    Object localObject = (List)totalTimeMap.get(paramString);
    if (localObject == null)
    {
      localObject = new ArrayList();
      totalTimeMap.put(paramString, localObject);
    }
    while (true)
    {
      ((List)localObject).add(Long.valueOf(System.currentTimeMillis() - ((Long)startTimeMap.get(paramString)).longValue()));
      if (((List)localObject).size() >= 10)
      {
        sLogger.d(TAG, "[time]" + paramString + ": " + getTotalTime((List)localObject) / (((List)localObject).size() / paramInt) + "ms");
        ((List)localObject).clear();
      }
      AppMethodBeat.o(83815);
      break;
    }
  }

  public static void benchEndReverse(String paramString, int paramInt)
  {
    AppMethodBeat.i(83816);
    if ((TextUtils.isEmpty(paramString)) || (startTimeMap.get(paramString) == null))
    {
      AppMethodBeat.o(83816);
      return;
    }
    Object localObject = (List)totalTimeMap.get(paramString);
    if (localObject == null)
    {
      localObject = new ArrayList();
      totalTimeMap.put(paramString, localObject);
    }
    while (true)
    {
      ((List)localObject).add(Long.valueOf(System.currentTimeMillis() - ((Long)startTimeMap.get(paramString)).longValue()));
      if (((List)localObject).size() >= 10)
      {
        sLogger.d(TAG, "[time]" + paramString + ": " + ((List)localObject).size() * paramInt / getTotalTime((List)localObject) + "fps");
        ((List)localObject).clear();
      }
      AppMethodBeat.o(83816);
      break;
    }
  }

  public static long benchEndTotal(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(83813);
    if (!ENABLE_LOG)
      AppMethodBeat.o(83813);
    while (true)
    {
      return l;
      if ((!TextUtils.isEmpty(paramString)) && (startTimeMap.get(paramString) != null))
        break;
      AppMethodBeat.o(83813);
    }
    Object localObject = (List)totalTimeMap.get(paramString);
    if (localObject == null)
    {
      localObject = new ArrayList();
      totalTimeMap.put(paramString, localObject);
    }
    while (true)
    {
      l = System.currentTimeMillis() - ((Long)startTimeMap.get(paramString)).longValue();
      ((List)localObject).add(Long.valueOf(l));
      AppMethodBeat.o(83813);
      break;
    }
  }

  public static void benchStart(String paramString)
  {
    AppMethodBeat.i(83811);
    if (!ENABLE_LOG)
      AppMethodBeat.o(83811);
    while (true)
    {
      return;
      if (TextUtils.isEmpty(paramString))
      {
        AppMethodBeat.o(83811);
      }
      else
      {
        if ((ENABLE_PERFORMANCE_RECORD) && (paramString.startsWith(SHOWPREVIEW_BENCH_TAG)))
          GLES20.glFinish();
        startTimeMap.put(paramString, Long.valueOf(System.currentTimeMillis()));
        AppMethodBeat.o(83811);
      }
    }
  }

  public static void calcFps()
  {
    AppMethodBeat.i(83818);
    benchEnd("bench_fps");
    benchStart("bench_fps");
    AppMethodBeat.o(83818);
  }

  public static long elapsed(String paramString)
  {
    AppMethodBeat.i(83819);
    long l;
    if (!lastTimeMap.containsKey(paramString))
    {
      l = 0L;
      AppMethodBeat.o(83819);
    }
    while (true)
    {
      return l;
      l = ((Long)lastTimeMap.get(paramString)).longValue();
      AppMethodBeat.o(83819);
    }
  }

  public static void flush()
  {
    AppMethodBeat.i(83814);
    Iterator localIterator = totalTimeMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      sLogger.d(TAG, "[time]" + (String)localEntry.getKey() + ": " + getTotalTime((List)localEntry.getValue()) + "ms");
    }
    totalTimeMap.clear();
    AppMethodBeat.o(83814);
  }

  public static String getLastBenchAverage()
  {
    AppMethodBeat.i(83820);
    Object localObject;
    if (!ENABLE_LOG)
    {
      localObject = null;
      AppMethodBeat.o(83820);
    }
    while (true)
    {
      return localObject;
      localObject = new StringBuffer();
      long l = elapsed("bench_fps");
      if (l != 0L)
        ((StringBuffer)localObject).append("fps : " + Math.round((float)(1000L / l)) + "\n");
      ((StringBuffer)localObject).append("frame elapsed : " + l + "\n");
      ((StringBuffer)localObject).append("yuv2rgba : " + elapsed("mPreviewFilter") + "\n");
      ((StringBuffer)localObject).append("beauty-filter : " + elapsed("mBeautyFilter") + "\n");
      ((StringBuffer)localObject).append("filter : " + elapsed("mFilter") + "\n");
      ((StringBuffer)localObject).append("arFilter : " + elapsed("arFilter") + "\n");
      ((StringBuffer)localObject).append("gpu2cpu : " + elapsed("gpu2cpu") + "\n");
      ((StringBuffer)localObject).append("doTrack : " + elapsed("doTrack") + "\n");
      ((StringBuffer)localObject).append("faceDetect : " + elapsed("faceDetect") + "\n");
      ((StringBuffer)localObject).append("beautyTransform : " + elapsed("mBeautyTransformList") + "\n");
      ((StringBuffer)localObject).append("sticker : " + elapsed("updateAndRender") + "\n");
      ((StringBuffer)localObject).append("flip : " + elapsed("mFlipFilter") + "\n");
      ((StringBuffer)localObject).append("viewFilter : " + elapsed("mViewFilter") + "\n");
      ((StringBuffer)localObject).append("onDrawFrame : " + elapsed("onDrawFrame") + "\n");
      localObject = ((StringBuffer)localObject).toString();
      AppMethodBeat.o(83820);
    }
  }

  public static String getLastBenchAveragePitu(int paramInt)
  {
    AppMethodBeat.i(83821);
    Object localObject = new StringBuffer();
    long l = elapsed("bench_fps");
    if (l != 0L)
      ((StringBuffer)localObject).append("fps : " + Math.round((float)(1000L / l)) + "\n");
    ((StringBuffer)localObject).append("frame elapsed : " + l + "\n");
    ((StringBuffer)localObject).append("onDrawFrame : " + elapsed("onDrawFrame") + "\n");
    ((StringBuffer)localObject).append("materialSize : " + VideoMemoryManager.getInstance().getMaterialSizeInMB() + " MB\n");
    ((StringBuffer)localObject).append("ratation : " + paramInt + "\n");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(83821);
    return localObject;
  }

  private static long getTotalTime(List<Long> paramList)
  {
    long l = 0L;
    AppMethodBeat.i(83817);
    if (!ENABLE_LOG)
      AppMethodBeat.o(83817);
    while (true)
    {
      return l;
      if (BaseUtils.isEmpty(paramList))
      {
        AppMethodBeat.o(83817);
      }
      else
      {
        paramList = paramList.iterator();
        for (l = 0L; paramList.hasNext(); l = ((Long)paramList.next()).longValue() + l);
        AppMethodBeat.o(83817);
      }
    }
  }

  public static void init()
  {
    AppMethodBeat.i(83810);
    startTimeMap.clear();
    totalTimeMap.clear();
    lastTimeMap.clear();
    AppMethodBeat.o(83810);
  }

  public static void setLoggerAgent(BenchUtil.LoggerAgent paramLoggerAgent)
  {
    sLogger = paramLoggerAgent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.BenchUtil
 * JD-Core Version:    0.6.2
 */