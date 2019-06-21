package com.tencent.ttpic.manager;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.fabby.FabbyManager;
import com.tencent.ttpic.util.ResourcePathMapper;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.youtu.GestureDetector;
import java.io.FileInputStream;
import java.io.InputStream;

public class FeatureManager
{
  public static final int INIT_FAIL = -1;
  public static final int INIT_NOFILE = -2;
  public static final int INIT_SUCC = 1;
  private static final String TAG;
  private static final String[] bodyDetectionResNms;
  private static final String[] filterResNms;
  private static final String[] gameplayResNms;
  private static final String[] gestureDetectionResNms;
  private static boolean isBodyDetectionReady;
  private static boolean isFilterReady;
  private static boolean isGameplayReady;
  private static boolean isGestureDetectionReady;
  private static boolean isLipsLutReady;
  private static boolean isSegmentationReady;
  private static final String[] lipslutResNms;
  private static final String[] segmentationResNms;

  static
  {
    AppMethodBeat.i(83432);
    TAG = FeatureManager.class.getSimpleName();
    isSegmentationReady = false;
    isGestureDetectionReady = false;
    isGameplayReady = false;
    isBodyDetectionReady = false;
    isLipsLutReady = false;
    isFilterReady = false;
    segmentationResNms = new String[] { "model5", "so3", "so4" };
    gestureDetectionResNms = new String[] { "model1", "so1", "so2" };
    gameplayResNms = new String[] { "so5" };
    bodyDetectionResNms = new String[] { "model6", "so6", "so7" };
    lipslutResNms = new String[] { "so8" };
    filterResNms = new String[] { "so9" };
    checkFeaturesReady();
    AppMethodBeat.o(83432);
  }

  public static void checkFeaturesReady()
  {
    AppMethodBeat.i(83425);
    Object localObject1 = segmentationResNms;
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    if (j < i)
    {
      localObject2 = ResourcePathMapper.getResPath(localObject1[j]);
      if ((localObject2 == null) || (((String)localObject2).equals("")))
        setIsSegmentationReady(false);
    }
    else
    {
      localObject1 = gestureDetectionResNms;
      i = localObject1.length;
      j = 0;
      label52: if (j < i)
      {
        localObject2 = ResourcePathMapper.getResPath(localObject1[j]);
        if ((localObject2 != null) && (!((String)localObject2).equals("")))
          break label249;
        setIsGestureDetectionReady(false);
      }
      localObject2 = gameplayResNms;
      i = localObject2.length;
      j = 0;
      label90: if (j < i)
      {
        localObject1 = ResourcePathMapper.getResPath(localObject2[j]);
        if ((localObject1 != null) && (!((String)localObject1).equals("")))
          break label259;
        setIsGameplayReady(false);
      }
      localObject1 = bodyDetectionResNms;
      i = localObject1.length;
      j = 0;
      label128: if (j < i)
      {
        localObject2 = ResourcePathMapper.getResPath(localObject1[j]);
        if ((localObject2 != null) && (!((String)localObject2).equals("")))
          break label269;
        setIsBodyDetectionReady(false);
      }
      localObject1 = lipslutResNms;
      i = localObject1.length;
      j = 0;
      label166: if (j < i)
      {
        localObject2 = ResourcePathMapper.getResPath(localObject1[j]);
        if ((localObject2 != null) && (!((String)localObject2).equals("")))
          break label279;
        setisLutLipsReady(false);
      }
      localObject1 = filterResNms;
      i = localObject1.length;
      j = 0;
      label204: if (j >= i)
        break label299;
      localObject2 = ResourcePathMapper.getResPath(localObject1[j]);
      if ((localObject2 != null) && (!((String)localObject2).equals("")))
        break label289;
      setisFilterReady(false);
      AppMethodBeat.o(83425);
    }
    while (true)
    {
      return;
      setIsSegmentationReady(true);
      j++;
      break;
      label249: setIsGestureDetectionReady(true);
      j++;
      break label52;
      label259: setIsGameplayReady(true);
      j++;
      break label90;
      label269: setIsBodyDetectionReady(true);
      j++;
      break label128;
      label279: setisLutLipsReady(true);
      j++;
      break label166;
      label289: setisFilterReady(true);
      j++;
      break label204;
      label299: AppMethodBeat.o(83425);
    }
  }

  public static InputStream getModelStream(String paramString)
  {
    AppMethodBeat.i(83431);
    String str = ResourcePathMapper.getModelResPath(paramString);
    if (str != null);
    try
    {
      StringBuilder localStringBuilder;
      if (!str.equals(""))
        if (str.startsWith("assets://"))
        {
          AssetManager localAssetManager = VideoGlobalContext.getContext().getAssets();
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramString = localAssetManager.open(str.substring(9) + paramString);
          AppMethodBeat.o(83431);
        }
      while (true)
      {
        return paramString;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        paramString = new FileInputStream(str + paramString);
        AppMethodBeat.o(83431);
        continue;
        AppMethodBeat.o(83431);
        paramString = null;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        AppMethodBeat.o(83431);
        paramString = null;
      }
    }
  }

  public static int init3DGameplay()
  {
    int i = 1;
    AppMethodBeat.i(83428);
    try
    {
      loadLibrary("gameplay");
      setIsGameplayReady(true);
      AppMethodBeat.o(83428);
      return i;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
      {
        AppMethodBeat.o(83428);
        i = -1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(83428);
        i = -1;
      }
    }
  }

  public static int initBodyDetection()
  {
    int i = 1;
    AppMethodBeat.i(83429);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("android.os.Build.VERSION.SDK_INT = ");
      localStringBuilder.append(Build.VERSION.SDK_INT);
      if (Build.VERSION.SDK_INT <= 17)
        System.load("/data/data/com.tencent.xnet/lib/libxnet.so");
      while (true)
      {
        loadLibrary("bodydetector");
        setIsBodyDetectionReady(true);
        AppMethodBeat.o(83429);
        return i;
        loadLibrary("xnet");
      }
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
      {
        AppMethodBeat.o(83429);
        i = -1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(83429);
        i = -1;
      }
    }
  }

  public static int initGestureDetection()
  {
    int i = 1;
    AppMethodBeat.i(83426);
    int j = 0;
    String str1 = ResourcePathMapper.getModelResPath("libXGestureSDK.so");
    String str2 = ResourcePathMapper.getModelResPath("libpt_handdetector.so");
    if ((str1 != null) && (!str1.equals("")) && (str2 != null) && (!str2.equals("")));
    try
    {
      loadLibrary("XGestureSDK");
      loadLibrary("pt_handdetector");
      j = 1;
      label59: if (j == 0)
      {
        j = -1;
        AppMethodBeat.o(83426);
      }
      while (true)
      {
        return j;
        j = -2;
        AppMethodBeat.o(83426);
        continue;
        GestureDetector.getInstance();
        setIsGestureDetectionReady(true);
        AppMethodBeat.o(83426);
        j = i;
      }
    }
    catch (Exception localException)
    {
      break label59;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      break label59;
    }
  }

  public static int initSegmentation()
  {
    int i = 1;
    AppMethodBeat.i(83427);
    while (true)
    {
      int j;
      try
      {
        System.loadLibrary("YTCommon");
        System.loadLibrary("nnpack");
        loadLibrary("segmentern");
        j = 1;
        if (j == 0)
        {
          j = -1;
          AppMethodBeat.o(83427);
          return j;
        }
      }
      catch (Exception localException1)
      {
        localException1 = localException1;
        LogUtils.e(localException1);
        try
        {
          loadLibrary("segmentern");
          j = 1;
        }
        catch (Exception localException2)
        {
          j = 0;
        }
        continue;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        localUnsatisfiedLinkError = localUnsatisfiedLinkError;
        LogUtils.e(localUnsatisfiedLinkError);
        try
        {
          loadLibrary("segmentern");
          j = 1;
        }
        catch (Exception localException3)
        {
          j = 0;
        }
        continue;
      }
      finally
      {
      }
      try
      {
        loadLibrary("segmentern");
        label85: AppMethodBeat.o(83427);
        throw localObject;
        FabbyManager.init();
        setIsSegmentationReady(true);
        AppMethodBeat.o(83427);
        j = i;
      }
      catch (Exception localException4)
      {
        break label85;
      }
    }
  }

  public static boolean isBodyDetectionReady()
  {
    return isBodyDetectionReady;
  }

  public static boolean isFilterReady()
  {
    return isFilterReady;
  }

  public static boolean isGameplayReady()
  {
    return isGameplayReady;
  }

  public static boolean isGestureDetectionReady()
  {
    return isGestureDetectionReady;
  }

  public static boolean isLutLipsReady()
  {
    return isLipsLutReady;
  }

  public static boolean isSegmentationReady()
  {
    return isSegmentationReady;
  }

  public static void loadLibrary(String paramString)
  {
    AppMethodBeat.i(83430);
    String str1 = "lib" + paramString + ".so";
    String str2 = ResourcePathMapper.getModelResPath(str1);
    if ((str2 != null) && (!str2.equals("")))
    {
      if (str2.startsWith("assets://"))
      {
        System.loadLibrary(paramString);
        AppMethodBeat.o(83430);
      }
      while (true)
      {
        return;
        System.load(str2 + str1);
        AppMethodBeat.o(83430);
      }
    }
    paramString = new Exception("Load Library " + str1 + "failed.");
    AppMethodBeat.o(83430);
    throw paramString;
  }

  private static void setIsBodyDetectionReady(boolean paramBoolean)
  {
    isBodyDetectionReady = paramBoolean;
  }

  private static void setIsGameplayReady(boolean paramBoolean)
  {
    isGameplayReady = paramBoolean;
  }

  private static void setIsGestureDetectionReady(boolean paramBoolean)
  {
    isGestureDetectionReady = paramBoolean;
  }

  private static void setIsSegmentationReady(boolean paramBoolean)
  {
    isSegmentationReady = paramBoolean;
  }

  private static void setisFilterReady(boolean paramBoolean)
  {
    isFilterReady = paramBoolean;
  }

  private static void setisLutLipsReady(boolean paramBoolean)
  {
    isLipsLutReady = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.manager.FeatureManager
 * JD-Core Version:    0.6.2
 */