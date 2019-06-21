package com.tencent.ttpic.util.youtu;

import android.graphics.Point;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.facedetect.FaceDetector;
import com.tencent.ttpic.facedetect.FaceDetector.DETECT_TYPE;
import com.tencent.ttpic.facedetect.FaceDetector.FaceDetectListener;
import com.tencent.ttpic.facedetect.FaceInfo;
import com.tencent.ttpic.gameplaysdk.GamePlaySDK;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.RetrieveDataManager;
import com.tencent.ttpic.util.RetrieveDataManager.DATA_TYPE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class VideoPreviewFaceOutlineDetector extends FaceDetector
{
  private static final String TAG;
  private final int FACEINFO_BUFFER_LIFE;
  private Handler doTrackHandler;
  private int faceinfo_outdate;
  private boolean isRunning;
  private Point lastDoTrackSize;
  private List<FaceInfo> lastFaceInfos;
  private int mDetectType;
  private VideoFaceDetector mFaceDetect;
  private boolean mInitSuccess;
  private boolean mIsLastFaceDetected;

  static
  {
    AppMethodBeat.i(84397);
    TAG = VideoPreviewFaceOutlineDetector.class.getSimpleName();
    AppMethodBeat.o(84397);
  }

  public VideoPreviewFaceOutlineDetector()
  {
    AppMethodBeat.i(84382);
    this.mDetectType = FaceDetector.DETECT_TYPE.DETECT_TYPE_NONE.value;
    this.mInitSuccess = false;
    this.mIsLastFaceDetected = false;
    this.lastDoTrackSize = new Point(0, 0);
    this.lastFaceInfos = new ArrayList(3);
    this.FACEINFO_BUFFER_LIFE = 3;
    this.faceinfo_outdate = 0;
    this.isRunning = false;
    this.mFaceDetect = new VideoFaceDetector();
    AppMethodBeat.o(84382);
  }

  private void bufferFaceInfos()
  {
    AppMethodBeat.i(84386);
    if (!BaseUtils.isEmpty(this.faceInfos))
    {
      this.lastFaceInfos.clear();
      this.lastFaceInfos.addAll(this.faceInfos);
      this.faceinfo_outdate = 0;
      AppMethodBeat.o(84386);
    }
    while (true)
    {
      return;
      if ((BaseUtils.isEmpty(this.faceInfos)) && (this.faceinfo_outdate < 3))
      {
        this.faceInfos.addAll(this.lastFaceInfos);
        this.faceinfo_outdate += 1;
      }
      AppMethodBeat.o(84386);
    }
  }

  private float getFakeFaceValues(int paramInt)
  {
    AppMethodBeat.i(84391);
    float f;
    switch (paramInt)
    {
    case 3:
    case 5:
    case 6:
    case 7:
    default:
      f = 0.0F;
      AppMethodBeat.o(84391);
    case 1:
    case 2:
    case 4:
    case 8:
    }
    while (true)
    {
      return f;
      f = 0.18F + new Random().nextFloat() * 0.12F;
      AppMethodBeat.o(84391);
      continue;
      f = new Random().nextFloat();
      AppMethodBeat.o(84391);
      continue;
      f = new Random().nextFloat() * 0.2F + 0.8F;
      AppMethodBeat.o(84391);
      continue;
      f = new Random().nextFloat() * 0.2F + 0.8F;
      AppMethodBeat.o(84391);
    }
  }

  private void notifyFaceDetectListener()
  {
    AppMethodBeat.i(84387);
    if ((this.faceDetectListeners != null) && (!this.faceDetectListeners.isEmpty()))
    {
      List localList = getAllFaces();
      Iterator localIterator = this.faceDetectListeners.iterator();
      while (localIterator.hasNext())
      {
        FaceDetector.FaceDetectListener localFaceDetectListener = (FaceDetector.FaceDetectListener)localIterator.next();
        if (localFaceDetectListener != null)
          localFaceDetectListener.onFaceDetectResult(localList);
      }
    }
    AppMethodBeat.o(84387);
  }

  public void destroy()
  {
    AppMethodBeat.i(84384);
    super.destroy();
    synchronized (mDetectLock)
    {
      if (this.mFaceDetect != null)
      {
        this.mDetectType = FaceDetector.DETECT_TYPE.DETECT_TYPE_NONE.value;
        this.mFaceDetect.destroy();
        this.mFaceDetect = null;
        this.doTrackHandler = null;
        Point localPoint = this.lastDoTrackSize;
        this.lastDoTrackSize.y = 0;
        localPoint.x = 0;
      }
      AppMethodBeat.o(84384);
      return;
    }
  }

  public void doDectectTrackByRGBA(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84394);
    doFaceDetect(paramArrayOfByte, paramInt1, paramInt2);
    doTrack(paramArrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(84394);
  }

  public void doFaceDetect(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84388);
    if ((!this.mInitSuccess) || (paramArrayOfByte == null) || (paramArrayOfByte.length != paramInt1 * paramInt2 * 4))
      AppMethodBeat.o(84388);
    while (true)
    {
      return;
      synchronized (mDetectLock)
      {
        if (this.mFaceDetect != null)
          this.mFaceDetect.doFaceDetect(paramArrayOfByte, paramInt1, paramInt2);
        AppMethodBeat.o(84388);
      }
    }
  }

  public void doFaceDetectByY(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84389);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length != paramInt1 * paramInt2))
      AppMethodBeat.o(84389);
    while (true)
    {
      return;
      synchronized (mDetectLock)
      {
        if (this.mFaceDetect != null)
          this.mFaceDetect.doFaceDetectByY(paramArrayOfByte, paramInt1, paramInt2);
        AppMethodBeat.o(84389);
      }
    }
  }

  public boolean doTrack(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84385);
    boolean bool1;
    if ((!this.mInitSuccess) || (this.mFaceDetect == null))
    {
      AppMethodBeat.o(84385);
      bool1 = false;
      return bool1;
    }
    this.lastDoTrackSize.x = paramInt1;
    this.lastDoTrackSize.y = paramInt2;
    this.mTrackFrameCount += 1;
    boolean bool2 = GamePlaySDK.getInstance().hasGame();
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length == paramInt1 * paramInt2 * 4))
    {
      BenchUtil.benchStart("only doTrack");
      if (bool2)
      {
        paramArrayOfByte = this.mFaceDetect.doTrack3D(paramArrayOfByte, paramInt1, paramInt2, GamePlaySDK.getInstance().getFov());
        label105: BenchUtil.benchEnd("only doTrack");
      }
    }
    while (true)
    {
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0));
      for (bool1 = true; ; bool1 = false)
      {
        this.mIsLastFaceDetected = bool1;
        updatePointsAndAngles(paramArrayOfByte, bool2);
        bufferFaceInfos();
        ExpressionDetector.getInstance().addFaces(this.faceInfos);
        updateTriggerExpression();
        updateActionCount();
        updateActionStatusChanged();
        notifyFaceDetectListener();
        AppMethodBeat.o(84385);
        break;
        paramArrayOfByte = this.mFaceDetect.doTrack(paramArrayOfByte, paramInt1, paramInt2);
        break label105;
      }
      paramArrayOfByte = null;
    }
  }

  public void doTrackByRGBA(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84393);
    if ((needDetectFace(doTrack(paramArrayOfByte, paramInt1, paramInt2))) && (!this.isRunning))
    {
      this.isRunning = true;
      postJob(new VideoPreviewFaceOutlineDetector.2(this, paramArrayOfByte, paramInt1, paramInt2));
    }
    AppMethodBeat.o(84393);
  }

  public byte[] doTrackByTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(84392);
    byte[] arrayOfByte = RetrieveDataManager.getInstance().retrieveData(RetrieveDataManager.DATA_TYPE.RGBA.value, paramInt1, paramInt2, paramInt3);
    if (needDetectFace(doTrack(arrayOfByte, paramInt2, paramInt3)))
      postJob(new VideoPreviewFaceOutlineDetector.1(this, arrayOfByte, paramInt2, paramInt3));
    AppMethodBeat.o(84392);
    return arrayOfByte;
  }

  public RetrieveDataManager.DATA_TYPE getDataType()
  {
    return RetrieveDataManager.DATA_TYPE.RGBA;
  }

  public float getFaceValues(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(84390);
    float f = getFakeFaceValues(paramInt2);
    AppMethodBeat.o(84390);
    return f;
  }

  public Point getLastDoTrackSize()
  {
    return this.lastDoTrackSize;
  }

  public int init()
  {
    boolean bool = false;
    int i = 0;
    int j = 0;
    AppMethodBeat.i(84383);
    if (this.mInitSuccess)
      AppMethodBeat.o(84383);
    while (true)
    {
      return j;
      super.init();
      j = i;
      if (this.mFaceDetect != null)
      {
        j = this.mFaceDetect.init();
        if (j == 0)
          bool = true;
        this.mInitSuccess = bool;
      }
      AppMethodBeat.o(84383);
    }
  }

  public boolean isLastFrameDetectFaces()
  {
    return this.mIsLastFaceDetected;
  }

  public boolean needDetectFaceValue()
  {
    if (this.mDetectType != FaceDetector.DETECT_TYPE.DETECT_TYPE_NONE.value);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void postDoTrack(Runnable paramRunnable)
  {
    AppMethodBeat.i(84396);
    synchronized (mDetectLock)
    {
      if (this.doTrackHandler != null)
      {
        this.doTrackHandler.post(paramRunnable);
        AppMethodBeat.o(84396);
        return;
      }
      paramRunnable.run();
    }
  }

  public void setDoTrackHandler(Handler paramHandler)
  {
    this.doTrackHandler = paramHandler;
  }

  public void setFaceValueDetectType(int paramInt)
  {
    this.mDetectType = paramInt;
  }

  public void setRefine(boolean paramBoolean)
  {
    AppMethodBeat.i(84395);
    init();
    YTFaceDetectorBase.getInstance().nativeSetRefine(paramBoolean);
    AppMethodBeat.o(84395);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.youtu.VideoPreviewFaceOutlineDetector
 * JD-Core Version:    0.6.2
 */