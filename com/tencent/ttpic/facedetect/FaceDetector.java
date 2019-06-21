package com.tencent.ttpic.facedetect;

import android.content.Context;
import android.graphics.PointF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.PTFaceAttr.PTExpression;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.face.FaceRangeStatus;
import com.tencent.ttpic.face.LeftEyeRangeDetector;
import com.tencent.ttpic.face.MouthRangeDetector;
import com.tencent.ttpic.face.RightEyeRangeDetector;
import com.tencent.ttpic.model.FabbyFaceActionCounter;
import com.tencent.ttpic.model.FaceActionCounter;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.FaceActionCallback;
import com.tencent.ttpic.util.RetrieveDataManager.DATA_TYPE;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.ttpic.util.youtu.ExpressionDetector;
import com.tencent.ttpic.util.youtu.YoutuPointsUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class FaceDetector
{
  public static final float FACE_DETECT_WIDTH = 180.0F;
  protected static final int FACE_DET_INTERVAL = 7;
  private static final String TAG = FaceDetector.class.getSimpleName();
  protected static final Object mDetectLock = new Object();
  private Sensor accelerometer;
  private double angle = 0.0D;
  protected List<FaceDetector.FaceDetectListener> faceDetectListeners = new ArrayList();
  protected List<FaceInfo> faceInfos = new ArrayList();
  private long factor = 0L;
  private boolean isFaceActionCounterInited = false;
  protected Handler mDetectorThreadHandler;
  protected final SparseArray<Set<FaceActionCallback>> mFaceActionCallbacks = new SparseArray();
  protected final Map<Integer, FaceActionCounter> mFaceActionCounter = new HashMap();
  protected final Map<Integer, Boolean> mFaceActionStatus = new HashMap();
  private SensorEventListener mSensorEventListener = new SensorEventListener()
  {
    public void onAccuracyChanged(Sensor paramAnonymousSensor, int paramAnonymousInt)
    {
    }

    public void onSensorChanged(SensorEvent paramAnonymousSensorEvent)
    {
      AppMethodBeat.i(81908);
      if (paramAnonymousSensorEvent.sensor != FaceDetector.this.accelerometer)
        AppMethodBeat.o(81908);
      while (true)
      {
        return;
        float f1 = paramAnonymousSensorEvent.values[0];
        float f2 = paramAnonymousSensorEvent.values[1];
        FaceDetector.access$102(FaceDetector.this, Math.atan2(f1, f2));
        AppMethodBeat.o(81908);
      }
    }
  };
  public int mTrackFrameCount;
  protected Set<Integer> mTriggeredExpressionType = new HashSet();
  protected boolean mUpdateActionCounter;
  private SensorManager sensorManager;

  public void addFaceActionCallback(int paramInt, FaceActionCallback paramFaceActionCallback)
  {
    if (paramFaceActionCallback == null);
    while (true)
    {
      return;
      Set localSet = (Set)this.mFaceActionCallbacks.get(paramInt);
      Object localObject = localSet;
      if (localSet == null)
      {
        localObject = new HashSet();
        this.mFaceActionCallbacks.put(paramInt, localObject);
      }
      ((Set)localObject).add(paramFaceActionCallback);
    }
  }

  public void clear()
  {
    try
    {
      this.faceInfos.clear();
      this.mTriggeredExpressionType.clear();
      return;
    }
    finally
    {
    }
  }

  public void clearActionCounter()
  {
    if (!this.isFaceActionCounterInited);
    while (true)
    {
      return;
      this.mUpdateActionCounter = true;
      Iterator localIterator = this.mFaceActionCounter.values().iterator();
      while (localIterator.hasNext())
        ((FaceActionCounter)localIterator.next()).clear();
    }
  }

  public void clearSavedTriggeredExpression()
  {
    this.mTriggeredExpressionType.clear();
  }

  public void destroy()
  {
    synchronized (mDetectLock)
    {
      if (this.mDetectorThreadHandler != null)
      {
        this.mFaceActionStatus.clear();
        this.mFaceActionCallbacks.clear();
        this.mDetectorThreadHandler.getLooper().quit();
        this.mDetectorThreadHandler = null;
        this.sensorManager.unregisterListener(this.mSensorEventListener);
      }
      this.faceDetectListeners.clear();
      return;
    }
  }

  public boolean detectExpression(int paramInt)
  {
    if ((this.mTriggeredExpressionType.contains(Integer.valueOf(paramInt))) || (paramInt == PTFaceAttr.PTExpression.ALWAYS.value));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public FaceRangeStatus detectFaceRangeStatus(List<PointF> paramList)
  {
    FaceRangeStatus localFaceRangeStatus = new FaceRangeStatus();
    if ((paramList == null) || (paramList.size() < 90))
      return localFaceRangeStatus;
    localFaceRangeStatus.leftEye = LeftEyeRangeDetector.getInstance().detectRange(paramList);
    localFaceRangeStatus.rightEye = RightEyeRangeDetector.getInstance().detectRange(paramList);
    localFaceRangeStatus.mouth = MouthRangeDetector.getInstance().detectRange(paramList);
    if (AlgoUtils.getDistance((PointF)paramList.get(77), (PointF)paramList.get(69)) / AlgoUtils.getDistance((PointF)paramList.get(65), (PointF)paramList.get(66)) >= 0.6F);
    for (boolean bool = true; ; bool = false)
    {
      localFaceRangeStatus.isKiss = bool;
      break;
    }
  }

  public abstract void doFaceDetect(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract void doTrackByRGBA(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract byte[] doTrackByTexture(int paramInt1, int paramInt2, int paramInt3);

  public List<float[]> getAllFaceAngles()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < getFaceCount(); i++)
      localArrayList.add(getFaceAngles(i));
    return localArrayList;
  }

  public List<List<PointF>> getAllFaces()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < getFaceCount(); i++)
      localArrayList.add(getAllPoints(i));
    return localArrayList;
  }

  public List<List<PointF>> getAllIris()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < getFaceCount(); i++)
      localArrayList.add(getIrisPoints(i));
    return localArrayList;
  }

  public List<PointF> getAllPoints(int paramInt)
  {
    try
    {
      Object localObject1;
      if (BaseUtils.indexOutOfBounds(this.faceInfos, paramInt))
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
      }
      while (true)
      {
        return localObject1;
        localObject1 = ((FaceInfo)this.faceInfos.get(paramInt)).points;
      }
    }
    finally
    {
    }
  }

  public abstract RetrieveDataManager.DATA_TYPE getDataType();

  public Map<Integer, FaceActionCounter> getFaceActionCounter()
  {
    if (this.isFaceActionCounterInited);
    for (HashMap localHashMap = new HashMap(this.mFaceActionCounter); ; localHashMap = new HashMap())
      return localHashMap;
  }

  public float[] getFaceAngles(int paramInt)
  {
    try
    {
      float[] arrayOfFloat;
      if (BaseUtils.indexOutOfBounds(this.faceInfos, paramInt))
        arrayOfFloat = new float[0];
      while (true)
      {
        return arrayOfFloat;
        arrayOfFloat = ((FaceInfo)this.faceInfos.get(paramInt)).angles;
      }
    }
    finally
    {
    }
  }

  public int getFaceCount()
  {
    return this.faceInfos.size();
  }

  public List<FaceStatus> getFaceStatus3Ds()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.faceInfos.iterator();
    while (localIterator.hasNext())
    {
      FaceInfo localFaceInfo = (FaceInfo)localIterator.next();
      FaceStatus localFaceStatus = new FaceStatus();
      localFaceStatus.pitch = localFaceInfo.pitch;
      localFaceStatus.yaw = localFaceInfo.yaw;
      localFaceStatus.roll = localFaceInfo.roll;
      localFaceStatus.tx = localFaceInfo.tx;
      localFaceStatus.ty = localFaceInfo.ty;
      localFaceStatus.scale = localFaceInfo.scale;
      localFaceStatus.denseFaceModel = localFaceInfo.denseFaceModel;
      localFaceStatus.transform = localFaceInfo.transform;
      localArrayList.add(localFaceStatus);
    }
    return localArrayList;
  }

  public List<PointF> getIrisPoints(int paramInt)
  {
    try
    {
      Object localObject1;
      if (BaseUtils.indexOutOfBounds(this.faceInfos, paramInt))
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
      }
      while (true)
      {
        return localObject1;
        localObject1 = ((FaceInfo)this.faceInfos.get(paramInt)).irisPoints;
      }
    }
    finally
    {
    }
  }

  public float getPhotoAngle()
  {
    return (float)this.angle;
  }

  public Set<Integer> getTriggeredExpression()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.mTriggeredExpressionType.iterator();
    while (localIterator.hasNext())
      localHashSet.add(Integer.valueOf(((Integer)localIterator.next()).intValue()));
    return localHashSet;
  }

  public int init()
  {
    if (this.mDetectorThreadHandler == null)
    {
      synchronized (mDetectLock)
      {
        if (this.mDetectorThreadHandler != null)
          break label261;
        Object localObject3;
        for (localObject3 : PTFaceAttr.PTExpression.values())
          this.mFaceActionStatus.put(Integer.valueOf(((PTFaceAttr.PTExpression)localObject3).value), Boolean.FALSE);
        ??? = PTFaceAttr.PTExpression.values();
        ??? = ???.length;
        ??? = 0;
        while (??? < ???)
        {
          localObject3 = ???[???];
          Map localMap = this.mFaceActionCounter;
          int k = ((PTFaceAttr.PTExpression)localObject3).value;
          if (((PTFaceAttr.PTExpression)localObject3).value != PTFaceAttr.PTExpression.MV_PART_INDEX.value)
          {
            localObject3 = new com/tencent/ttpic/model/FaceActionCounter;
            ((FaceActionCounter)localObject3).<init>(0, -1L);
            localMap.put(Integer.valueOf(k), localObject3);
            ???++;
          }
          else
          {
            localObject3 = new FabbyFaceActionCounter(0, -1L);
          }
        }
      }
      this.isFaceActionCounterInited = true;
      this.sensorManager = ((SensorManager)VideoGlobalContext.getContext().getSystemService("sensor"));
      this.accelerometer = this.sensorManager.getDefaultSensor(1);
      this.sensorManager.registerListener(this.mSensorEventListener, this.accelerometer, 3);
      ??? = new android/os/HandlerThread;
      ((HandlerThread)???).<init>("VideoPreviewFaceOutlineDetector");
      ((HandlerThread)???).start();
      Handler localHandler = new android/os/Handler;
      localHandler.<init>(((HandlerThread)???).getLooper());
      this.mDetectorThreadHandler = localHandler;
    }
    label261: return 0;
  }

  public void lockActionCounter()
  {
    this.mUpdateActionCounter = false;
  }

  public boolean needDetectFace(boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean)
    {
      this.factor = 0L;
      if (this.mTrackFrameCount > 7)
        paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      continue;
      paramBoolean = bool;
      if (this.factor <= 7L)
      {
        this.factor += 1L;
        paramBoolean = bool;
      }
    }
  }

  public void postJob(Runnable paramRunnable)
  {
    if ((paramRunnable == null) || (this.mDetectorThreadHandler == null));
    while (true)
    {
      return;
      this.mDetectorThreadHandler.post(paramRunnable);
    }
  }

  public void registerFaceDetectListeners(FaceDetector.FaceDetectListener paramFaceDetectListener)
  {
    this.faceDetectListeners.add(paramFaceDetectListener);
  }

  public void removeFaceActionCallback(FaceActionCallback paramFaceActionCallback)
  {
    if (paramFaceActionCallback == null);
    while (true)
    {
      return;
      for (int i = 0; i < this.mFaceActionCallbacks.size(); i++)
      {
        Set localSet = (Set)this.mFaceActionCallbacks.valueAt(i);
        if (localSet != null)
          localSet.remove(paramFaceActionCallback);
      }
    }
  }

  public void unlockActionCounter()
  {
    this.mUpdateActionCounter = true;
  }

  public void unregisterFaceDetectListener(FaceDetector.FaceDetectListener paramFaceDetectListener)
  {
    this.faceDetectListeners.remove(paramFaceDetectListener);
  }

  protected void updateActionCount()
  {
    if (!this.mUpdateActionCounter);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      for (Object localObject : PTFaceAttr.PTExpression.values())
        if (this.mTriggeredExpressionType.contains(Integer.valueOf(((PTFaceAttr.PTExpression)localObject).value)))
        {
          localObject = (FaceActionCounter)this.mFaceActionCounter.get(Integer.valueOf(((PTFaceAttr.PTExpression)localObject).value));
          if (l - ((FaceActionCounter)localObject).updateTime > 1000L)
          {
            ((FaceActionCounter)localObject).count += 1;
            ((FaceActionCounter)localObject).updateTime = l;
          }
        }
    }
  }

  protected void updateActionStatusChanged()
  {
    for (int i = 0; i < this.mFaceActionCallbacks.size(); i++)
    {
      int j = this.mFaceActionCallbacks.keyAt(i);
      boolean bool1 = ((Boolean)this.mFaceActionStatus.get(Integer.valueOf(j))).booleanValue();
      boolean bool2 = detectExpression(j);
      if (bool1 != bool2)
      {
        Iterator localIterator = ((Set)this.mFaceActionCallbacks.valueAt(i)).iterator();
        while (localIterator.hasNext())
          ((FaceActionCallback)localIterator.next()).onActionDetected(j, bool2);
      }
      this.mFaceActionStatus.put(Integer.valueOf(j), Boolean.valueOf(bool2));
    }
  }

  protected void updatePointsAndAngles(FaceStatus[] paramArrayOfFaceStatus, boolean paramBoolean)
  {
    int i = 0;
    try
    {
      this.faceInfos.clear();
      if (paramArrayOfFaceStatus == null);
      while (true)
      {
        return;
        int j = paramArrayOfFaceStatus.length;
        while (i < j)
        {
          FaceStatus localFaceStatus = paramArrayOfFaceStatus[i];
          FaceInfo localFaceInfo = new com/tencent/ttpic/facedetect/FaceInfo;
          localFaceInfo.<init>();
          localFaceInfo.points = YoutuPointsUtil.transformYTPointsToPtuPoints(localFaceStatus.xys);
          localFaceInfo.irisPoints = YoutuPointsUtil.getIrisPoints(localFaceStatus.xys);
          localFaceInfo.angles[0] = ((float)(localFaceStatus.pitch * 3.141592653589793D / 180.0D) * -1.0F);
          localFaceInfo.angles[1] = ((float)(localFaceStatus.yaw * 3.141592653589793D / 180.0D) * -1.0F);
          localFaceInfo.angles[2] = ((float)(localFaceStatus.roll * 3.141592653589793D / 180.0D) * -1.0F);
          localFaceInfo.scale = localFaceStatus.scale;
          localFaceInfo.pitch = localFaceStatus.pitch;
          localFaceInfo.yaw = localFaceStatus.yaw;
          localFaceInfo.roll = localFaceStatus.roll;
          localFaceInfo.tx = localFaceStatus.tx;
          localFaceInfo.ty = localFaceStatus.ty;
          localFaceInfo.denseFaceModel = localFaceStatus.denseFaceModel;
          localFaceInfo.transform = localFaceStatus.transform;
          this.faceInfos.add(localFaceInfo);
          i++;
        }
      }
    }
    finally
    {
    }
    throw paramArrayOfFaceStatus;
  }

  protected void updateTriggerExpression()
  {
    PTFaceAttr.PTExpression[] arrayOfPTExpression = PTFaceAttr.PTExpression.values();
    int i = arrayOfPTExpression.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      PTFaceAttr.PTExpression localPTExpression = arrayOfPTExpression[j];
      m = k;
      if (ExpressionDetector.getInstance().detectExpression(localPTExpression.value))
      {
        this.mTriggeredExpressionType.add(Integer.valueOf(localPTExpression.value));
        m = k;
        if (ExpressionDetector.needSaveDetectedExpression(localPTExpression.value))
          m = 1;
      }
      j++;
    }
    if (k != 0)
      ExpressionDetector.getInstance().clearFaceQueue();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.facedetect.FaceDetector
 * JD-Core Version:    0.6.2
 */