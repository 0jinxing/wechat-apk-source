package com.tencent.ttpic.util.youtu;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.manager.FeatureManager;
import com.tencent.ttpic.model.HandActionCounter;
import com.tencent.ttpic.util.ResourcePathMapper;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GestureDetector
{
  private static final float[] CLASSIFY_THRESHOLD;
  private static final float DETECT_THRESHOLD = 0.9F;
  public static int THREAD_NUM = 0;
  protected static final int TOP_K = 61;
  private static boolean mIS_BUSY;
  private static GestureDetector mInstance;
  public final String COLLECT_PATH;
  public Bitmap mBitmapCollect;
  protected float[] mClassifyOutputConfidence;
  public FileWriter mCollectInfoOut;
  private Handler mDetectHandler;
  private YtHandLabel mDetectedGestureLabel;
  private YtHandBox mDetectedHandBox;
  protected float[] mDetectorOutputConfidence;
  protected float[] mDetectorOutputXMax;
  protected float[] mDetectorOutputXMin;
  protected float[] mDetectorOutputYMax;
  protected float[] mDetectorOutputYMin;
  private boolean mEnableInterpolation;
  protected final Map<Integer, HandActionCounter> mHandActionCounter;
  private int mImageHeight;
  private int mImageWidth;
  private volatile boolean mInited;
  protected int[] mLabelIndex;
  protected boolean mUpdateActionCounter;

  static
  {
    AppMethodBeat.i(84364);
    THREAD_NUM = 2;
    mIS_BUSY = false;
    CLASSIFY_THRESHOLD = new float[] { 0.95F, 0.6F, 0.6F, 0.7F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.6F, 0.7F };
    if (FeatureManager.isGestureDetectionReady());
    while (true)
    {
      try
      {
        System.loadLibrary("XGestureSDK");
        System.loadLibrary("pt_handdetector");
        AppMethodBeat.o(84364);
        return;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        AppMethodBeat.o(84364);
        continue;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(84364);
    }
  }

  public GestureDetector()
  {
    AppMethodBeat.i(84349);
    this.COLLECT_PATH = (Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "Collect");
    this.mCollectInfoOut = null;
    this.mInited = false;
    this.mDetectedGestureLabel = new YtHandLabel();
    this.mDetectedHandBox = new YtHandBox();
    this.mEnableInterpolation = true;
    this.mHandActionCounter = new HashMap();
    AppMethodBeat.o(84349);
  }

  public static boolean copyAsset(AssetManager paramAssetManager, String paramString1, String paramString2)
  {
    AppMethodBeat.i(84355);
    try
    {
      System.out.println(paramString2);
      paramAssetManager = paramAssetManager.open(paramString1);
      paramString1 = new java/io/File;
      paramString1.<init>(paramString2);
      paramString1.createNewFile();
      paramString1 = new java/io/FileOutputStream;
      paramString1.<init>(paramString2);
      FileUtils.copyFile(paramAssetManager, paramString1);
      paramAssetManager.close();
      paramString1.flush();
      paramString1.close();
      bool = true;
      AppMethodBeat.o(84355);
      return bool;
    }
    catch (Exception paramAssetManager)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(84355);
      }
    }
  }

  private void deleteDirectory(File paramFile)
  {
    AppMethodBeat.i(84354);
    if (paramFile.isDirectory())
    {
      paramFile = paramFile.listFiles();
      for (int i = 0; i < paramFile.length; i++)
        paramFile[i].delete();
    }
    AppMethodBeat.o(84354);
  }

  public static GestureDetector getInstance()
  {
    try
    {
      AppMethodBeat.i(84350);
      if (mInstance == null)
      {
        localGestureDetector = new com/tencent/ttpic/util/youtu/GestureDetector;
        localGestureDetector.<init>();
        mInstance = localGestureDetector;
      }
      if (!mInstance.mInited)
        mInstance.init();
      GestureDetector localGestureDetector = mInstance;
      AppMethodBeat.o(84350);
      return localGestureDetector;
    }
    finally
    {
    }
  }

  private PointF getMidPoint(PointF paramPointF1, PointF paramPointF2)
  {
    AppMethodBeat.i(84363);
    paramPointF1 = new PointF((paramPointF1.x + paramPointF2.x) / 2.0F, (paramPointF1.y + paramPointF2.y) / 2.0F);
    AppMethodBeat.o(84363);
    return paramPointF1;
  }

  public native boolean Gesture(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, float[] paramArrayOfFloat4, float[] paramArrayOfFloat5, int[] paramArrayOfInt1, int[] paramArrayOfInt2, float[] paramArrayOfFloat6);

  public native int Init(String paramString1, String paramString2, int paramInt);

  public native boolean Uninit();

  public void clearActionCounter()
  {
    AppMethodBeat.i(84362);
    this.mUpdateActionCounter = true;
    Iterator localIterator = this.mHandActionCounter.values().iterator();
    while (localIterator.hasNext())
      ((HandActionCounter)localIterator.next()).clear();
    AppMethodBeat.o(84362);
  }

  public void clearPicture()
  {
    AppMethodBeat.i(84353);
    deleteDirectory(new File(this.COLLECT_PATH));
    AppMethodBeat.o(84353);
  }

  public void destroy()
  {
    AppMethodBeat.i(84356);
    if (this.mInited)
    {
      Uninit();
      if (this.mDetectHandler != null)
        this.mDetectHandler.getLooper().quit();
      this.mInited = false;
      mInstance = null;
    }
    if (this.mBitmapCollect != null)
      this.mBitmapCollect.recycle();
    if (this.mCollectInfoOut != null);
    while (true)
    {
      try
      {
        this.mCollectInfoOut.close();
        AppMethodBeat.o(84356);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(84356);
    }
  }

  public void detectHand(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84357);
    if ((!this.mInited) || (mIS_BUSY))
      AppMethodBeat.o(84357);
    while (true)
    {
      return;
      this.mDetectHandler.post(new GestureDetector.1(this, paramArrayOfByte, paramInt1, paramInt2));
      this.mImageWidth = paramInt1;
      this.mImageHeight = paramInt2;
      AppMethodBeat.o(84357);
    }
  }

  public Map<Integer, HandActionCounter> getHandActionCounter()
  {
    return this.mHandActionCounter;
  }

  public List<float[]> getHandAngles()
  {
    AppMethodBeat.i(84360);
    Object localObject;
    if (!this.mInited)
    {
      localObject = null;
      AppMethodBeat.o(84360);
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      for (int i = 0; i <= 0; i++)
        ((List)localObject).add(new float[] { 0.0F, 0.0F, 0.0F });
      AppMethodBeat.o(84360);
    }
  }

  public List<PointF> getHandPoints()
  {
    AppMethodBeat.i(84359);
    Object localObject;
    if (!this.mInited)
    {
      localObject = null;
      AppMethodBeat.o(84359);
    }
    while (true)
    {
      return localObject;
      if (this.mDetectorOutputXMin[0] < 0.0F)
        this.mDetectorOutputXMin[0] = 0.0F;
      if (this.mDetectorOutputYMin[0] < 0.0F)
        this.mDetectorOutputYMin[0] = 0.0F;
      if (this.mDetectorOutputXMax[0] > this.mImageWidth)
        this.mDetectorOutputXMax[0] = (this.mImageWidth - 1);
      if (this.mDetectorOutputYMax[0] > this.mImageHeight)
        this.mDetectorOutputYMax[0] = (this.mImageHeight - 1);
      localObject = new ArrayList();
      PointF localPointF1 = new PointF(this.mDetectorOutputXMin[0], this.mDetectorOutputYMin[0]);
      PointF localPointF2 = new PointF(this.mDetectorOutputXMax[0], this.mDetectorOutputYMin[0]);
      PointF localPointF3 = new PointF(this.mDetectorOutputXMin[0], this.mDetectorOutputYMax[0]);
      PointF localPointF4 = new PointF(this.mDetectorOutputXMax[0], this.mDetectorOutputYMax[0]);
      PointF localPointF5 = getMidPoint(localPointF1, localPointF3);
      PointF localPointF6 = getMidPoint(localPointF1, localPointF2);
      PointF localPointF7 = getMidPoint(localPointF2, localPointF4);
      PointF localPointF8 = getMidPoint(localPointF3, localPointF4);
      ((List)localObject).add(getMidPoint(localPointF5, localPointF7));
      ((List)localObject).add(localPointF1);
      ((List)localObject).add(localPointF6);
      ((List)localObject).add(localPointF2);
      ((List)localObject).add(localPointF5);
      ((List)localObject).add(localPointF7);
      ((List)localObject).add(localPointF3);
      ((List)localObject).add(localPointF8);
      ((List)localObject).add(localPointF4);
      this.mDetectedHandBox.x = this.mDetectorOutputXMin[0];
      this.mDetectedHandBox.y = this.mDetectorOutputYMin[0];
      this.mDetectedHandBox.width = (this.mDetectorOutputXMax[0] - this.mDetectorOutputXMin[0]);
      this.mDetectedHandBox.height = (this.mDetectorOutputYMax[0] - this.mDetectorOutputYMin[0]);
      AppMethodBeat.o(84359);
    }
  }

  public void init()
  {
    AppMethodBeat.i(84351);
    if ((this.mInited) || (!FeatureManager.isGestureDetectionReady()))
      AppMethodBeat.o(84351);
    while (true)
    {
      return;
      String str1 = VideoGlobalContext.getContext().getFilesDir().getAbsolutePath();
      Object localObject1 = str1 + "/" + "cls.xnet";
      Object localObject2 = str1 + "/" + "det.xnet";
      if (!new File((String)localObject1).exists())
      {
        String str2 = ResourcePathMapper.getModelResPath("cls.xnet");
        LogUtils.e("resPath", "resPath = ".concat(String.valueOf(str2)));
        if ((str2 != null) && (!str2.startsWith("assets://")))
          FileUtils.copyFile(str2 + "cls.xnet", (String)localObject1);
      }
      else
      {
        label171: if (!new File((String)localObject2).exists())
        {
          localObject1 = ResourcePathMapper.getModelResPath("det.xnet");
          if ((localObject1 == null) || (((String)localObject1).startsWith("assets://")))
            break label338;
          FileUtils.copyFile((String)localObject1 + "det.xnet", (String)localObject2);
        }
      }
      int i;
      label338: Object localObject3;
      try
      {
        while (true)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject1 = str1 + "/" + "cls.xnet";
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          i = Init((String)localObject1, str1 + "/" + "det.xnet", THREAD_NUM);
          if (i == 0)
            break label455;
          AppMethodBeat.o(84351);
          break;
          copyAsset(VideoGlobalContext.getContext().getAssets(), "xlabHandmodel/".concat(String.valueOf("cls.xnet")), (String)localObject1);
          break label171;
          copyAsset(VideoGlobalContext.getContext().getAssets(), "xlabHandmodel/".concat(String.valueOf("det.xnet")), (String)localObject2);
        }
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        try
        {
          System.loadLibrary("XGestureSDK");
          System.loadLibrary("pt_handdetector");
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = str1 + "/" + "cls.xnet";
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          i = Init((String)localObject3, str1 + "/" + "det.xnet", THREAD_NUM);
        }
        catch (Exception localException)
        {
          AppMethodBeat.o(84351);
        }
      }
      continue;
      label455: HandlerThread localHandlerThread = new HandlerThread("HandDetectThread");
      localHandlerThread.start();
      this.mDetectHandler = new Handler(localHandlerThread.getLooper());
      this.mDetectorOutputConfidence = new float[61];
      this.mDetectorOutputXMin = new float[61];
      this.mDetectorOutputYMin = new float[61];
      this.mDetectorOutputXMax = new float[61];
      this.mDetectorOutputYMax = new float[61];
      this.mClassifyOutputConfidence = new float[61];
      this.mLabelIndex = new int[1];
      for (localHandlerThread : PTFaceAttr.PTExpression.values())
        this.mHandActionCounter.put(Integer.valueOf(localHandlerThread.value), new HandActionCounter(0, -1L));
      this.mInited = true;
      AppMethodBeat.o(84351);
    }
  }

  public void initWriteFile()
  {
    AppMethodBeat.i(84352);
    Object localObject = new File(this.COLLECT_PATH);
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    try
    {
      localObject = new java/io/FileWriter;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      ((FileWriter)localObject).<init>(this.COLLECT_PATH + File.separator + "xlabCollect.txt", true);
      this.mCollectInfoOut = ((FileWriter)localObject);
      AppMethodBeat.o(84352);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        AppMethodBeat.o(84352);
    }
  }

  public boolean isGestureTriggered(int paramInt)
  {
    AppMethodBeat.i(84358);
    boolean bool;
    if ((this.mDetectedGestureLabel.value == paramInt) || ((this.mDetectedHandBox.isValid()) && (paramInt == PTFaceAttr.PTExpression.HAND_LABEL_HAND.value)) || (paramInt == PTFaceAttr.PTExpression.ALWAYS.value) || (this.mEnableInterpolation))
    {
      bool = true;
      AppMethodBeat.o(84358);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(84358);
    }
  }

  public void lockActionCounter()
  {
    this.mUpdateActionCounter = false;
  }

  public void setConfig(int paramInt)
  {
    if ((paramInt & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.mEnableInterpolation = bool;
      return;
    }
  }

  public void unlockActionCounter()
  {
    this.mUpdateActionCounter = true;
  }

  protected void updateActionCount()
  {
    AppMethodBeat.i(84361);
    if (!this.mUpdateActionCounter)
      AppMethodBeat.o(84361);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      for (Object localObject : PTFaceAttr.PTExpression.values())
        if (this.mDetectedGestureLabel.value == ((PTFaceAttr.PTExpression)localObject).value)
        {
          localObject = (HandActionCounter)this.mHandActionCounter.get(Integer.valueOf(((PTFaceAttr.PTExpression)localObject).value));
          if (l - ((HandActionCounter)localObject).updateTime > 1000L)
          {
            ((HandActionCounter)localObject).count += 1;
            ((HandActionCounter)localObject).updateTime = l;
          }
        }
      AppMethodBeat.o(84361);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.GestureDetector
 * JD-Core Version:    0.6.2
 */