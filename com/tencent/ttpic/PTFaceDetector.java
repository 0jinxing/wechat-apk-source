package com.tencent.ttpic;

import android.graphics.PointF;
import android.opengl.EGL14;
import android.util.Pair;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.ApiHelper;
import com.tencent.ttpic.gles.SegmentDataPipe;
import com.tencent.ttpic.thread.FaceGestureDetGLThread;
import com.tencent.ttpic.thread.FaceGestureDetGLThread.OnFaceDetListener;
import com.tencent.ttpic.util.AlgoUtils;
import com.tencent.ttpic.util.FrameUtil;
import com.tencent.ttpic.util.RetrieveDataManager;
import com.tencent.ttpic.util.youtu.VideoPreviewFaceOutlineDetector;
import com.tencent.ttpic.util.youtu.bodydetector.BodyDetectResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class PTFaceDetector
{
  private static final String TAG;
  public static AtomicInteger activeRefCount;
  private boolean firstDet;
  private volatile SegmentDataPipe mDetDataPipe;
  private FaceGestureDetGLThread mDetGLThread;
  private final Object mFaceDetLock;
  private VideoPreviewFaceOutlineDetector mFaceDetector;
  private h mLastInputFrame;
  private h mLastOriginLargeFrame;
  private BaseFilter mRotateFilter;
  private h mRotateFrame;

  static
  {
    AppMethodBeat.i(81587);
    TAG = PTFaceDetector.class.getSimpleName();
    activeRefCount = new AtomicInteger(0);
    AppMethodBeat.o(81587);
  }

  public PTFaceDetector()
  {
    AppMethodBeat.i(81575);
    this.mRotateFilter = new BaseFilter(GLSLRender.bJB);
    this.mRotateFrame = new h();
    this.mFaceDetLock = new Object();
    AppMethodBeat.o(81575);
  }

  private void setDataPipe(SegmentDataPipe paramSegmentDataPipe)
  {
    AppMethodBeat.i(81578);
    synchronized (this.mFaceDetLock)
    {
      this.mDetDataPipe = paramSegmentDataPipe;
      this.mFaceDetLock.notifyAll();
      AppMethodBeat.o(81578);
      return;
    }
  }

  public void destroy()
  {
    AppMethodBeat.i(81579);
    if (this.mFaceDetector != null)
      this.mDetGLThread.postFaceDetectorDestroy();
    RetrieveDataManager.getInstance().clear();
    this.mRotateFilter.ClearGLSL();
    this.mRotateFrame.clear();
    if (this.mDetGLThread != null)
    {
      this.mDetGLThread.destroy();
      activeRefCount.getAndDecrement();
      this.mDetGLThread = null;
    }
    AppMethodBeat.o(81579);
  }

  public PTFaceAttr detectFrame(h paramh1, h paramh2, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, double paramDouble)
  {
    AppMethodBeat.i(81580);
    paramh1 = detectFrame(paramh1, paramh2, paramInt, paramBoolean1, paramBoolean2, paramBoolean3, paramDouble, false, false);
    AppMethodBeat.o(81580);
    return paramh1;
  }

  public PTFaceAttr detectFrame(h paramh1, h paramh2, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, double paramDouble, boolean paramBoolean4)
  {
    AppMethodBeat.i(81581);
    paramh1 = detectFrame(paramh1, paramh2, paramInt, paramBoolean1, paramBoolean2, paramBoolean3, paramDouble, paramBoolean4, false);
    AppMethodBeat.o(81581);
    return paramh1;
  }

  public PTFaceAttr detectFrame(h paramh1, h paramh2, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, double paramDouble, boolean paramBoolean4, boolean paramBoolean5)
  {
    AppMethodBeat.i(81582);
    h localh = FrameUtil.rotateCorrect(paramh1, paramh1.width, paramh1.height, paramInt, this.mRotateFilter, this.mRotateFrame);
    int i = (int)(localh.width * paramDouble);
    int j = (int)(localh.height * paramDouble);
    Object localObject1 = new ArrayList();
    Object localObject2 = new ArrayList();
    Object localObject3 = new ArrayList();
    Object localObject4 = new ArrayList();
    Object localObject5 = new ArrayList();
    Object localObject6 = new ArrayList();
    Object localObject7 = new HashSet();
    ((Set)localObject7).add(Integer.valueOf(1));
    Object localObject8 = new ArrayList();
    byte[] arrayOfByte = new byte[0];
    Object localObject9 = null;
    Object localObject10 = null;
    Object localObject11 = Pair.create(Integer.valueOf(255), null);
    Object localObject12 = new HashMap();
    if ((this.mDetGLThread != null) && (this.mDetGLThread.isInitReady()))
    {
      Object localObject13 = null;
      if (paramBoolean4)
      {
        this.firstDet = false;
        this.mDetGLThread.postFaceGestureDet(localh, paramBoolean1, paramBoolean2, paramBoolean3, paramDouble, paramBoolean5);
      }
      if (this.firstDet);
    }
    while (true)
    {
      synchronized (this.mFaceDetLock)
      {
        try
        {
          if (this.mDetDataPipe == null)
          {
            this.mFaceDetLock.wait();
            continue;
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          localObject14 = this.mDetDataPipe;
          this.mDetDataPipe = null;
        }
        this.firstDet = false;
        if ((localObject14 == null) || (((SegmentDataPipe)localObject14).mTexFrame.width != localh.width))
          break label638;
        localObject1 = ((SegmentDataPipe)localObject14).allFacePoints;
        localObject2 = ((SegmentDataPipe)localObject14).allIrisPoints;
        localObject3 = ((SegmentDataPipe)localObject14).allFaceAngles;
        localObject7 = ((SegmentDataPipe)localObject14).mTriggeredExpressionType;
        localObject4 = ((SegmentDataPipe)localObject14).allHandPoints;
        localObject5 = ((SegmentDataPipe)localObject14).allHandAngles;
        localObject11 = ((SegmentDataPipe)localObject14).faceStatus;
        localObject6 = ((SegmentDataPipe)localObject14).bodyDetectResults;
        arrayOfByte = ((SegmentDataPipe)localObject14).mData;
        localObject8 = ((SegmentDataPipe)localObject14).brightnessAdjustmentCurve;
        localObject12 = ((SegmentDataPipe)localObject14).faceActionCounter;
        ??? = this.mLastInputFrame;
        localObject16 = this.mLastOriginLargeFrame;
        localObject10 = ((SegmentDataPipe)localObject14).histogram;
        localObject14 = localObject11;
        localObject11 = localObject10;
        if (!paramBoolean4)
          this.mDetGLThread.postFaceGestureDet(localh, paramBoolean1, paramBoolean2, paramBoolean3, paramDouble, paramBoolean5);
        this.mLastInputFrame = paramh1;
        this.mLastOriginLargeFrame = paramh2;
        paramh1 = (h)localObject7;
        paramh2 = (h)localObject4;
        localObject4 = localObject3;
        localObject3 = paramh2;
        localObject7 = localObject2;
        localObject10 = localObject1;
        localObject2 = localObject5;
        localObject1 = localObject6;
        localObject5 = AlgoUtils.rotatePointsForList((List)localObject10, i, j, paramInt);
        localObject6 = AlgoUtils.rotatePointsForList((List)localObject7, i, j, paramInt);
        localObject4 = AlgoUtils.rotateAngles((List)localObject4, -paramInt);
        localObject3 = AlgoUtils.rotatePoints((List)localObject3, i, j, paramInt);
        paramh2 = AlgoUtils.rotateAngles((List)localObject2, -paramInt);
        localObject14 = AlgoUtils.rotateFaceStatusFor3D((List)localObject14, i, j, paramInt);
        localObject1 = rotateBodyDetectResults((List)localObject1, i, j, paramInt);
        if ((paramh2 != null) && (paramh2.size() > 0))
        {
          paramh2 = (float[])paramh2.get(0);
          paramh1 = PTFaceAttr.genFaceAttr((List)localObject5, (List)localObject6, (List)localObject4, paramh1, (List)localObject3, paramh2, (List)localObject14, (List)localObject1, paramDouble, arrayOfByte, false, (h)???, (h)localObject16, localh, paramInt, (int[])localObject8, (Map)localObject12, (Pair)localObject11, this.mFaceDetector);
          AppMethodBeat.o(81582);
          return paramh1;
        }
      }
      paramh2 = new float[] { 0.0F, 0.0F, 0.0F };
      continue;
      label638: Object localObject16 = paramh2;
      ??? = paramh1;
      Object localObject14 = localObject8;
      localObject8 = localObject10;
      continue;
      ??? = paramh1;
      localObject14 = localObject8;
      paramh1 = (h)localObject7;
      localObject16 = localObject4;
      localObject7 = localObject2;
      localObject10 = localObject1;
      localObject1 = localObject6;
      localObject2 = localObject5;
      localObject4 = localObject3;
      localObject3 = localObject16;
      localObject16 = paramh2;
      localObject8 = localObject9;
    }
  }

  public VideoPreviewFaceOutlineDetector getFaceDetector()
  {
    return this.mFaceDetector;
  }

  public String getHistogramInfo()
  {
    AppMethodBeat.i(81584);
    String str;
    if (this.mDetGLThread != null)
    {
      str = this.mDetGLThread.getHistogramInfo();
      AppMethodBeat.o(81584);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(81584);
    }
  }

  public void init()
  {
    AppMethodBeat.i(81576);
    init(false);
    AppMethodBeat.o(81576);
  }

  public void init(boolean paramBoolean)
  {
    AppMethodBeat.i(81577);
    if ((ApiHelper.hasJellyBeanMR1()) && (this.mDetGLThread == null))
    {
      this.mDetGLThread = new FaceGestureDetGLThread(EGL14.eglGetCurrentContext());
      activeRefCount.getAndIncrement();
      this.mDetGLThread.setOnFaceDetListener(new FaceGestureDetGLThread.OnFaceDetListener()
      {
        public void onDataReady(SegmentDataPipe paramAnonymousSegmentDataPipe)
        {
          AppMethodBeat.i(81574);
          PTFaceDetector.access$000(PTFaceDetector.this, paramAnonymousSegmentDataPipe);
          AppMethodBeat.o(81574);
        }
      });
      this.mFaceDetector = this.mDetGLThread.getDetector();
      if (!paramBoolean)
        this.mFaceDetector.setDoTrackHandler(this.mDetGLThread.getHandler());
    }
    this.mRotateFilter.ApplyGLSLFilter();
    this.firstDet = true;
    AppMethodBeat.o(81577);
  }

  public void resetBodyDetector()
  {
    AppMethodBeat.i(81585);
    if (this.mDetGLThread != null)
    {
      this.mDetGLThread.resetBodyDetector();
      if (this.mDetDataPipe != null)
        this.mDetDataPipe.bodyDetectResults = new ArrayList();
    }
    AppMethodBeat.o(81585);
  }

  public List<BodyDetectResult> rotateBodyDetectResults(List<BodyDetectResult> paramList, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(81583);
    if ((paramList == null) || (paramInt3 != 180))
      AppMethodBeat.o(81583);
    while (true)
    {
      return paramList;
      for (int i = 0; i < paramList.size(); i++)
      {
        ArrayList localArrayList = new ArrayList();
        BodyDetectResult localBodyDetectResult = (BodyDetectResult)paramList.get(i);
        for (int j = 0; j < localBodyDetectResult.bodyPoints.size(); j++)
          localArrayList.add(localBodyDetectResult.bodyPoints.get(j));
        AlgoUtils.rotatePoints(localArrayList, paramInt1, paramInt2, paramInt3);
        for (j = 0; j < localArrayList.size(); j++)
        {
          ((PointF)localBodyDetectResult.bodyPoints.get(j)).x = ((PointF)localArrayList.get(j)).x;
          ((PointF)localBodyDetectResult.bodyPoints.get(j)).y = ((PointF)localArrayList.get(j)).y;
        }
      }
      AppMethodBeat.o(81583);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.PTFaceDetector
 * JD-Core Version:    0.6.2
 */