package com.tencent.ttpic.recorder;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.filter.h;
import com.tencent.filter.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.gles.GLConfig;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.VideoGlobalContext;
import com.tencent.util.i;
import com.tencent.view.g;
import java.io.IOException;
import java.nio.ByteBuffer;

@TargetApi(18)
public class ActVideoDecoder
{
  private static final String TAG;
  private static final int TIMEOUT_MS = 2500;
  private static final int TIMEOUT_US = 10000;
  private MediaCodec.BufferInfo info;
  private ByteBuffer[] inputBuffers;
  private volatile boolean isDecoding;
  private boolean isEOS;
  private long mCurFrameIndex;
  private MediaCodec mDecoder;
  private Surface mDecoderSurface;
  private int mDstTex;
  private long mDuration;
  private MediaExtractor mExtractor;
  private String mFilename;
  private h mFrame;
  private boolean mFrameAvailable;
  private Handler mHandler;
  private boolean mHasNewFrame;
  private int mHeight;
  private final Object mInitLock;
  private boolean mInited;
  private long mLastFrameIndex;
  private o mSurfaceTexFilter;
  private SurfaceTexture mSurfaceTexture;
  private int mTempTex;
  private final float[] mTransformMatrix;
  private final Object mUpdateFrameLock;
  private int mWidth;

  static
  {
    AppMethodBeat.i(83692);
    TAG = ActVideoDecoder.class.getSimpleName();
    AppMethodBeat.o(83692);
  }

  public ActVideoDecoder(String arg1, int paramInt)
  {
    AppMethodBeat.i(83681);
    this.mLastFrameIndex = -1L;
    this.mCurFrameIndex = -1L;
    this.isEOS = false;
    this.info = new MediaCodec.BufferInfo();
    this.mSurfaceTexFilter = new o();
    this.mTransformMatrix = new float[16];
    this.mFrame = new h();
    this.mUpdateFrameLock = new Object();
    this.mInitLock = new Object();
    this.mFilename = ???;
    this.mDstTex = paramInt;
    this.mTempTex = g.dSO();
    this.mSurfaceTexFilter.ApplyGLSLFilter();
    this.mSurfaceTexFilter.nativeSetRotationAndFlip(0, 0, 1);
    ??? = new HandlerThread("ActVideoDecoder rt");
    ???.start();
    this.mHandler = new Handler(???.getLooper());
    this.mHandler.post(new ActVideoDecoder.1(this));
    synchronized (this.mInitLock)
    {
      while (true)
      {
        boolean bool = this.mInited;
        if (bool)
          break;
        try
        {
          this.mInitLock.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      }
      this.mDecoderSurface = new Surface(this.mSurfaceTexture);
      this.mExtractor = new MediaExtractor();
    }
    try
    {
      setExtractorDataSource(this.mExtractor, this.mFilename);
      prepare();
      AppMethodBeat.o(83681);
      return;
      localObject = finally;
      AppMethodBeat.o(83681);
      throw localObject;
    }
    catch (IOException )
    {
      while (true)
        AppMethodBeat.o(83681);
    }
  }

  private int decodeNext()
  {
    AppMethodBeat.i(83684);
    Object localObject;
    if (this.mDecoder == null)
    {
      if (GLConfig.DEBUG)
      {
        localObject = new RuntimeException("ActVideoDecoder init fail!");
        AppMethodBeat.o(83684);
        throw ((Throwable)localObject);
      }
      i = -1;
      AppMethodBeat.o(83684);
      return i;
    }
    int i = 0;
    label46: int j;
    int k;
    if (!Thread.interrupted())
    {
      BenchUtil.benchStart("[decodeNext] dequeueInputBuffer");
      if (!this.isEOS)
      {
        j = this.mDecoder.dequeueInputBuffer(10000L);
        if (j >= 0)
        {
          localObject = this.inputBuffers[j];
          k = this.mExtractor.readSampleData((ByteBuffer)localObject, 0);
          if (k >= 0)
            break label251;
          i.k(TAG, "extractor read sample to EOS");
          this.mDecoder.queueInputBuffer(j, 0, 0, 0L, 4);
          this.isEOS = true;
        }
      }
      label129: BenchUtil.benchEnd("[decodeNext] dequeueInputBuffer");
      BenchUtil.benchStart("[decodeNext] wait");
      k = this.mDecoder.dequeueOutputBuffer(this.info, 10000L);
      BenchUtil.benchEnd("[decodeNext] wait");
      if ((this.info.flags & 0x4) == 0)
        switch (k)
        {
        case -3:
        case -2:
        default:
          this.mCurFrameIndex += 1L;
          if (this.mCurFrameIndex == this.mLastFrameIndex)
          {
            this.mHasNewFrame = true;
            this.mDecoder.releaseOutputBuffer(k, true);
            i = 0;
          }
          break;
        case -1:
        }
    }
    while (true)
    {
      AppMethodBeat.o(83684);
      break;
      label251: this.mDecoder.queueInputBuffer(j, 0, k, this.mExtractor.getSampleTime(), 0);
      this.mExtractor.advance();
      break label129;
      k = i + 1;
      i = k;
      if (k > 10)
      {
        new StringBuilder("dequeueOutputBuffer timed out! eos = ").append(this.isEOS);
        i = -1;
        continue;
        this.mDecoder.releaseOutputBuffer(k, false);
      }
      else
      {
        break label46;
        i = 0;
      }
    }
  }

  private void prepare()
  {
    AppMethodBeat.i(83683);
    int i = 0;
    if (i < this.mExtractor.getTrackCount())
    {
      MediaFormat localMediaFormat = this.mExtractor.getTrackFormat(i);
      String str = localMediaFormat.getString("mime");
      if (str.startsWith("video/"))
      {
        this.mExtractor.selectTrack(i);
        i.k(TAG, "extractor video track selected");
        this.mWidth = localMediaFormat.getInteger("width");
        this.mHeight = localMediaFormat.getInteger("height");
        this.mDuration = (localMediaFormat.getLong("durationUs") / 1000L);
        i.k(TAG, "width = " + this.mWidth + ", height = " + this.mHeight + ", mDuration = " + this.mDuration);
        this.mDecoder = MediaCodec.createDecoderByType(str);
        localMediaFormat.setInteger("max-input-size", 0);
        this.mDecoder.configure(localMediaFormat, this.mDecoderSurface, null, 0);
      }
    }
    else
    {
      if (this.mDecoder != null)
        break label214;
      i.m(TAG, "Can't find video info!");
      AppMethodBeat.o(83683);
    }
    while (true)
    {
      return;
      i++;
      break;
      try
      {
        label214: this.mDecoder.start();
        this.inputBuffers = this.mDecoder.getInputBuffers();
        label232: this.isEOS = false;
        AppMethodBeat.o(83683);
      }
      catch (Exception localException)
      {
        break label232;
      }
    }
  }

  private static void setExtractorDataSource(MediaExtractor paramMediaExtractor, String paramString)
  {
    AppMethodBeat.i(83682);
    if (paramString.startsWith("assets://"))
    {
      paramString = paramString.substring(9);
      paramString = VideoGlobalContext.getContext().getAssets().openFd(paramString);
      paramMediaExtractor.setDataSource(paramString.getFileDescriptor(), paramString.getStartOffset(), paramString.getLength());
      paramString.close();
      AppMethodBeat.o(83682);
    }
    while (true)
    {
      return;
      paramMediaExtractor.setDataSource(paramString);
      AppMethodBeat.o(83682);
    }
  }

  public void decodeFrame(long paramLong)
  {
    AppMethodBeat.i(83685);
    Object localObject;
    if (this.mDecoderSurface == null)
    {
      localObject = new RuntimeException("You haven't set surfaceTexture?!");
      AppMethodBeat.o(83685);
      throw ((Throwable)localObject);
    }
    if (paramLong <= this.mLastFrameIndex)
      AppMethodBeat.o(83685);
    while (true)
    {
      return;
      this.mLastFrameIndex = paramLong;
      try
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        BenchUtil.benchStart(TAG + "[decodeNext]");
        decodeNext();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        BenchUtil.benchEnd(TAG + "[decodeNext]");
        AppMethodBeat.o(83685);
      }
      catch (Exception localException)
      {
        i.a(TAG, "decodeNext error: ", localException);
        AppMethodBeat.o(83685);
      }
    }
  }

  public void decodeFrameAsync(long paramLong)
  {
    AppMethodBeat.i(83686);
    if (this.mDecoderSurface == null)
    {
      RuntimeException localRuntimeException = new RuntimeException("You haven't set surfaceTexture?!");
      AppMethodBeat.o(83686);
      throw localRuntimeException;
    }
    if ((this.isDecoding) || (paramLong <= this.mLastFrameIndex))
      AppMethodBeat.o(83686);
    while (true)
    {
      return;
      this.isDecoding = true;
      this.mLastFrameIndex = paramLong;
      this.mHandler.post(new ActVideoDecoder.2(this));
      AppMethodBeat.o(83686);
    }
  }

  public long getDuration()
  {
    return this.mDuration;
  }

  public int getHeight()
  {
    return this.mHeight;
  }

  public int getWidth()
  {
    return this.mWidth;
  }

  public boolean isLive()
  {
    if (this.mDecoder != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void release()
  {
    AppMethodBeat.i(83690);
    g.Sk(this.mTempTex);
    this.mSurfaceTexFilter.clearGLSLSelf();
    this.mFrame.clear();
    if (this.mDecoderSurface != null)
      this.mDecoderSurface.release();
    if (this.mExtractor != null)
      this.mExtractor.release();
    if (this.mDecoder != null)
    {
      this.mDecoder.stop();
      this.mDecoder.release();
      i.j(TAG, "mDecoder stop and release");
      this.mDecoder = null;
    }
    if (this.mHandler != null)
    {
      this.mHandler.removeCallbacksAndMessages(null);
      this.mHandler.post(new ActVideoDecoder.4(this));
    }
    AppMethodBeat.o(83690);
  }

  public void reset()
  {
    AppMethodBeat.i(83688);
    try
    {
      if (this.mExtractor != null)
        this.mExtractor.seekTo(0L, 0);
      if (this.mDecoder != null)
        this.mDecoder.flush();
      this.isEOS = false;
      this.mCurFrameIndex = -1L;
      this.mLastFrameIndex = -1L;
      AppMethodBeat.o(83688);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        if (!TextUtils.isEmpty(localException.getMessage()))
          i.k(TAG, localException.getMessage());
    }
  }

  public void resetAsync()
  {
    AppMethodBeat.i(83689);
    if (this.mHandler != null)
      this.mHandler.post(new ActVideoDecoder.3(this));
    AppMethodBeat.o(83689);
  }

  public boolean updateFrame()
  {
    boolean bool1 = false;
    AppMethodBeat.i(83687);
    boolean bool2 = this.mHasNewFrame;
    if (this.mHasNewFrame)
      BenchUtil.benchStart(TAG + "[updateFrame] wait");
    while (true)
    {
      synchronized (this.mUpdateFrameLock)
      {
        boolean bool3 = this.mFrameAvailable;
        if (!bool3)
          try
          {
            this.mUpdateFrameLock.wait(2500L);
            if (this.mFrameAvailable)
              continue;
            LogUtils.e(TAG, "frame wait timed out");
            AppMethodBeat.o(83687);
            return bool1;
          }
          catch (InterruptedException localInterruptedException)
          {
            RuntimeException localRuntimeException = new java/lang/RuntimeException;
            localRuntimeException.<init>(localInterruptedException);
            AppMethodBeat.o(83687);
            throw localRuntimeException;
          }
      }
      this.mFrameAvailable = false;
      BenchUtil.benchEnd(TAG + "[updateFrame] wait");
      BenchUtil.benchStart(TAG + "[updateFrame] render");
      try
      {
        this.mSurfaceTexture.updateTexImage();
        label200: this.mSurfaceTexture.getTransformMatrix(this.mTransformMatrix);
        this.mSurfaceTexFilter.nativeUpdateMatrix(this.mTransformMatrix);
        this.mSurfaceTexFilter.RenderProcess(this.mTempTex, getWidth(), getHeight(), this.mDstTex, 0.0D, this.mFrame);
        this.mHasNewFrame = false;
        BenchUtil.benchEnd(TAG + "[updateFrame] render");
        AppMethodBeat.o(83687);
        bool1 = bool2;
      }
      catch (Exception localException)
      {
        break label200;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.recorder.ActVideoDecoder
 * JD-Core Version:    0.6.2
 */