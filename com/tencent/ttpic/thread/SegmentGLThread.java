package com.tencent.ttpic.thread;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.fabby.FabbyManager;
import com.tencent.ttpic.filter.ExpFilter;
import com.tencent.ttpic.filter.FabbyExtractFilter;
import com.tencent.ttpic.filter.FabbyStrokeFilter;
import com.tencent.ttpic.filter.SimpleGaussionFilter;
import com.tencent.ttpic.gles.EglCore;
import com.tencent.ttpic.gles.GLSegSharedData;
import com.tencent.ttpic.gles.OffscreenSurface;
import com.tencent.ttpic.gles.SegmentDataPipe;

@TargetApi(18)
public class SegmentGLThread
{
  private static final int SEGMENT_HEIGHT;
  private static final int SEGMENT_WIDTH;
  private ExpFilter expFilter;
  private FabbyExtractFilter fabbyExtractFilter;
  private FabbyStrokeFilter fabbyStrokeFilter;
  private BaseFilter mCopyFilter;
  private h mCopyFrame;
  private EglCore mCore;
  private Handler mHandler;
  private boolean mIsInitReady;
  private SegmentGLThread.OnSegDataReadyListener mListener;
  private Bitmap mMaskBitmap;
  private Bitmap mMaskBitmapHorizon;
  private OffscreenSurface mOffscreenSurface;
  private boolean mRunOnCpuForce;
  private Bitmap mSegBitmap;
  private Bitmap mSegBitmapHorizon;
  private h mSegFrame;
  private SimpleGaussionFilter mSimpleBlurFilter;
  private h mTempFrame;
  private int[] mTempTexId;
  private GLSegSharedData sharedData;

  static
  {
    int i = 16;
    boolean bool = FabbyManager.USE_SMALL_IMAGE;
    SEGMENT_WIDTH = 16;
    if (FabbyManager.USE_SMALL_IMAGE);
    while (true)
    {
      SEGMENT_HEIGHT = i;
      return;
      i = 32;
    }
  }

  public SegmentGLThread(EGLContext paramEGLContext)
  {
    AppMethodBeat.i(83779);
    this.mCopyFilter = new BaseFilter(GLSLRender.bJB);
    this.fabbyExtractFilter = new FabbyExtractFilter();
    this.fabbyStrokeFilter = new FabbyStrokeFilter();
    this.mSimpleBlurFilter = new SimpleGaussionFilter();
    this.mTempTexId = new int[2];
    this.expFilter = new ExpFilter();
    HandlerThread localHandlerThread = new HandlerThread("SegmentGLThread");
    localHandlerThread.start();
    this.mHandler = new Handler(localHandlerThread.getLooper());
    this.mHandler.post(new SegmentGLThread.1(this, paramEGLContext));
    AppMethodBeat.o(83779);
  }

  private void setAllRenderMode(int paramInt)
  {
    AppMethodBeat.i(83784);
    this.fabbyExtractFilter.setRenderMode(paramInt);
    this.fabbyStrokeFilter.setRenderMode(paramInt);
    this.expFilter.setRenderMode(paramInt);
    this.mCopyFilter.setRenderMode(paramInt);
    AppMethodBeat.o(83784);
  }

  public void clearSegLig()
  {
    AppMethodBeat.i(83787);
    if (this.mHandler != null)
      this.mHandler.post(new SegmentGLThread.6(this));
    AppMethodBeat.o(83787);
  }

  public void destroy()
  {
    AppMethodBeat.i(83782);
    if (this.mHandler != null)
      this.mHandler.post(new SegmentGLThread.3(this));
    AppMethodBeat.o(83782);
  }

  public SegmentDataPipe getCurrentDataPipe()
  {
    AppMethodBeat.i(83781);
    SegmentDataPipe localSegmentDataPipe;
    if (this.sharedData == null)
    {
      localSegmentDataPipe = null;
      AppMethodBeat.o(83781);
    }
    while (true)
    {
      return localSegmentDataPipe;
      localSegmentDataPipe = this.sharedData.getCurrentTexturePile();
      AppMethodBeat.o(83781);
    }
  }

  public void initSegLig()
  {
    AppMethodBeat.i(83786);
    if (this.mHandler != null)
      this.mHandler.post(new SegmentGLThread.5(this));
    AppMethodBeat.o(83786);
  }

  public boolean isInitReady()
  {
    return this.mIsInitReady;
  }

  public boolean needWait()
  {
    boolean bool = true;
    AppMethodBeat.i(83783);
    if (this.sharedData == null)
      AppMethodBeat.o(83783);
    while (true)
    {
      return bool;
      SegmentDataPipe[] arrayOfSegmentDataPipe = this.sharedData.mTexturePile;
      int i = arrayOfSegmentDataPipe.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label80;
        SegmentDataPipe localSegmentDataPipe = arrayOfSegmentDataPipe[j];
        if ((localSegmentDataPipe.isBusy()) || (localSegmentDataPipe.isReady()))
        {
          AppMethodBeat.o(83783);
          break;
        }
      }
      label80: AppMethodBeat.o(83783);
      bool = false;
    }
  }

  public void postSegJob(h paramh, boolean paramBoolean)
  {
    AppMethodBeat.i(83780);
    if (this.mHandler == null)
      AppMethodBeat.o(83780);
    while (true)
    {
      return;
      this.mHandler.post(new SegmentGLThread.2(this, paramBoolean, paramh));
      AppMethodBeat.o(83780);
    }
  }

  public void reset()
  {
    AppMethodBeat.i(83785);
    if (this.mHandler != null)
      this.mHandler.post(new SegmentGLThread.4(this));
    AppMethodBeat.o(83785);
  }

  public void setOnDataReadyListener(SegmentGLThread.OnSegDataReadyListener paramOnSegDataReadyListener)
  {
    this.mListener = paramOnSegDataReadyListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.thread.SegmentGLThread
 * JD-Core Version:    0.6.2
 */