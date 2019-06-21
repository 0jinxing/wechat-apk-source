package com.tencent.ttpic.recorder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.VideoParam;
import com.tencent.ttpic.util.FrameRateUtil;
import com.tencent.ttpic.util.FrameRateUtil.DOWNGRADE_LEVEL;
import java.nio.ByteBuffer;

@TargetApi(18)
public class MyRecorder
{
  private static final String TAG;
  private MediaCodec.BufferInfo mBufferInfo = null;
  private MediaCodec mMediaCodec = null;
  private MediaMuxer mMediaMuxer = null;
  private boolean mMuxerStarted = false;
  private String mOutput;
  private float mPlayRate = 1.0F;
  private Surface mSurface;
  private int mTrackIndex = -1;

  static
  {
    AppMethodBeat.i(83706);
    TAG = MyRecorder.class.getSimpleName();
    AppMethodBeat.o(83706);
  }

  public MyRecorder(String paramString)
  {
    this.mOutput = paramString;
  }

  private void drainEncoder(boolean paramBoolean)
  {
    AppMethodBeat.i(83704);
    if (!isValid())
      AppMethodBeat.o(83704);
    while (true)
    {
      return;
      if (paramBoolean);
      int i;
      label76: label239: 
      do
      {
        Object localObject;
        while (true)
        {
          try
          {
            this.mMediaCodec.signalEndOfInputStream();
            ByteBuffer[] arrayOfByteBuffer = this.mMediaCodec.getOutputBuffers();
            i = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 0L);
            if (i != -1)
              break label76;
            if (paramBoolean)
              continue;
            AppMethodBeat.o(83704);
          }
          catch (RuntimeException localRuntimeException)
          {
            AppMethodBeat.o(83704);
          }
          break;
          if (i != -3)
            if (i == -2)
            {
              if (this.mMuxerStarted)
              {
                this.mMediaCodec.releaseOutputBuffer(i, false);
              }
              else
              {
                localObject = this.mMediaCodec.getOutputFormat();
                this.mTrackIndex = this.mMediaMuxer.addTrack((MediaFormat)localObject);
                this.mMediaMuxer.start();
                this.mMuxerStarted = true;
              }
            }
            else
            {
              localObject = localRuntimeException[i];
              if (localObject == null)
              {
                localObject = new java/lang/StringBuilder;
                ((StringBuilder)localObject).<init>("encoderOutputBuffer ");
                ((StringBuilder)localObject).append(i).append(" was null");
                this.mMediaCodec.releaseOutputBuffer(i, false);
              }
              else
              {
                if ((this.mBufferInfo.flags & 0x2) != 0)
                  this.mBufferInfo.size = 0;
                if (this.mBufferInfo.size == 0)
                  break label322;
                if (this.mMuxerStarted)
                  break label239;
                this.mMediaCodec.releaseOutputBuffer(i, false);
              }
            }
        }
        ((ByteBuffer)localObject).position(this.mBufferInfo.offset);
        ((ByteBuffer)localObject).limit(this.mBufferInfo.offset + this.mBufferInfo.size);
        if (Float.compare(this.mPlayRate, 1.0F) != 0)
          this.mBufferInfo.presentationTimeUs = (()((float)this.mBufferInfo.presentationTimeUs * this.mPlayRate));
        this.mMediaMuxer.writeSampleData(this.mTrackIndex, (ByteBuffer)localObject, this.mBufferInfo);
        this.mMediaCodec.releaseOutputBuffer(i, false);
        i = this.mBufferInfo.flags;
      }
      while ((i & 0x4) == 0);
      label322: AppMethodBeat.o(83704);
    }
  }

  private boolean isValid()
  {
    if ((this.mMediaCodec != null) && (this.mMediaMuxer != null) && (this.mBufferInfo != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public Surface getInputSurface()
  {
    return this.mSurface;
  }

  public String getOutputPath()
  {
    return this.mOutput;
  }

  public boolean isRecording()
  {
    if (this.mMediaCodec != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean prepareEncoder(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(83700);
    if (this.mMediaCodec != null)
      AppMethodBeat.o(83700);
    while (true)
    {
      return bool;
      this.mBufferInfo = new MediaCodec.BufferInfo();
      try
      {
        Object localObject = MediaFormat.createVideoFormat(VideoParam.mMime, paramInt1, paramInt2);
        ((MediaFormat)localObject).setInteger("color-format", 2130708361);
        ((MediaFormat)localObject).setInteger("bitrate", FrameRateUtil.getRenderLevel().bps);
        ((MediaFormat)localObject).setInteger("frame-rate", 18);
        ((MediaFormat)localObject).setInteger("i-frame-interval", VideoParam.mIfi);
        this.mMediaCodec = MediaCodec.createEncoderByType(VideoParam.mMime);
        if (this.mMediaCodec != null)
          this.mMediaCodec.configure((MediaFormat)localObject, null, null, 1);
        localObject = new android/media/MediaMuxer;
        ((MediaMuxer)localObject).<init>(this.mOutput, 0);
        this.mMediaMuxer = ((MediaMuxer)localObject);
        this.mMuxerStarted = false;
        if ((this.mSurface == null) && (this.mMediaCodec != null))
          this.mSurface = this.mMediaCodec.createInputSurface();
        AppMethodBeat.o(83700);
      }
      catch (Exception localException)
      {
        releaseEncoder();
        AppMethodBeat.o(83700);
        bool = false;
      }
    }
  }

  public void releaseEncoder()
  {
    AppMethodBeat.i(83703);
    try
    {
      if (this.mMediaCodec != null)
      {
        this.mMediaCodec.stop();
        this.mMediaCodec.release();
        this.mMediaCodec = null;
      }
      if (this.mMediaMuxer != null)
      {
        this.mMediaMuxer.stop();
        this.mMediaMuxer.release();
        this.mMediaMuxer = null;
      }
      this.mBufferInfo = null;
      AppMethodBeat.o(83703);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
        AppMethodBeat.o(83703);
    }
  }

  public void setPlayRate(float paramFloat)
  {
    this.mPlayRate = paramFloat;
  }

  public void start()
  {
    AppMethodBeat.i(83705);
    if (this.mMediaCodec != null)
      this.mMediaCodec.start();
    AppMethodBeat.o(83705);
  }

  public void stop()
  {
    AppMethodBeat.i(83702);
    drainEncoder(true);
    releaseEncoder();
    AppMethodBeat.o(83702);
  }

  public void swapBuffers()
  {
    AppMethodBeat.i(83701);
    if ((!isRecording()) || (!isValid()))
      AppMethodBeat.o(83701);
    while (true)
    {
      return;
      drainEncoder(false);
      AppMethodBeat.o(83701);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.recorder.MyRecorder
 * JD-Core Version:    0.6.2
 */