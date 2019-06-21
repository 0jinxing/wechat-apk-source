package com.tencent.liteav.videoencoder;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.basic.g.b;
import com.tencent.liteav.basic.module.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public class c extends a
{
  protected g mEncodeFilter;
  private boolean mEncodeFirstGOP = false;
  protected Object mGLContextExternal = null;
  protected boolean mInit;
  protected g mInputFilter;
  protected int mInputHeight = 0;
  protected int mInputTextureID = -1;
  protected int mInputWidth = 0;
  protected d mListener = null;
  protected int mOutputHeight = 0;
  protected int mOutputWidth = 0;
  private long mVideoGOPEncode = 0L;

  protected void callDelegate(int paramInt)
  {
    AppMethodBeat.i(67442);
    callDelegate(null, 0, 0L, 0L, 0L, 0L, 0L, 0L, paramInt, null, null);
    AppMethodBeat.o(67442);
  }

  protected void callDelegate(MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(67444);
    if (this.mListener != null)
      this.mListener.a(paramMediaFormat);
    AppMethodBeat.o(67444);
  }

  protected void callDelegate(byte[] paramArrayOfByte, int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt2, ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    AppMethodBeat.i(67443);
    MediaCodec.BufferInfo localBufferInfo;
    if (paramByteBuffer == null)
    {
      paramByteBuffer = null;
      if (paramBufferInfo != null)
        break label239;
      localBufferInfo = null;
      label21: if (localBufferInfo != null)
        localBufferInfo.set(paramBufferInfo.offset, paramBufferInfo.size, paramBufferInfo.presentationTimeUs, paramBufferInfo.flags);
      paramBufferInfo = this.mListener;
      if (paramBufferInfo == null)
        break label283;
      b localb = new b();
      localb.a = paramArrayOfByte;
      localb.b = paramInt1;
      localb.c = paramLong1;
      localb.d = paramLong2;
      localb.e = paramLong3;
      localb.f = paramLong4;
      localb.g = paramLong5;
      localb.h = paramLong6;
      localb.j = paramByteBuffer;
      if (localBufferInfo != null)
        localb.k = localBufferInfo;
      paramBufferInfo.a(localb, paramInt2);
      setStatusValue(4002, Long.valueOf(getRealBitrate()));
      setStatusValue(4001, Double.valueOf(getRealFPS()));
      if (paramInt1 != 0)
        break label251;
      if (this.mVideoGOPEncode != 0L)
      {
        this.mEncodeFirstGOP = true;
        setStatusValue(4003, Long.valueOf(this.mVideoGOPEncode));
      }
      this.mVideoGOPEncode = 1L;
      AppMethodBeat.o(67443);
    }
    while (true)
    {
      return;
      paramByteBuffer = paramByteBuffer.asReadOnlyBuffer();
      break;
      label239: localBufferInfo = new MediaCodec.BufferInfo();
      break label21;
      label251: this.mVideoGOPEncode += 1L;
      if (!this.mEncodeFirstGOP)
        setStatusValue(4003, Long.valueOf(this.mVideoGOPEncode));
      label283: AppMethodBeat.o(67443);
    }
  }

  public long getRealBitrate()
  {
    return 0L;
  }

  public long getRealFPS()
  {
    return 0L;
  }

  public int getVideoHeight()
  {
    return this.mOutputHeight;
  }

  public int getVideoWidth()
  {
    return this.mOutputWidth;
  }

  public long pushVideoFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    return 10000002L;
  }

  public long pushVideoFrameSync(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    return 10000002L;
  }

  public void setBitrate(int paramInt)
  {
  }

  public void setFPS(int paramInt)
  {
  }

  public void setListener(d paramd)
  {
    this.mListener = paramd;
  }

  public void signalEOSAndFlush()
  {
  }

  public int start(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    if (paramTXSVideoEncoderParam != null)
    {
      this.mOutputWidth = paramTXSVideoEncoderParam.width;
      this.mOutputHeight = paramTXSVideoEncoderParam.height;
      this.mInputWidth = paramTXSVideoEncoderParam.width;
      this.mInputHeight = paramTXSVideoEncoderParam.height;
      this.mGLContextExternal = paramTXSVideoEncoderParam.glContext;
    }
    this.mVideoGOPEncode = 0L;
    this.mEncodeFirstGOP = false;
    return 10000002;
  }

  public void stop()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videoencoder.c
 * JD-Core Version:    0.6.2
 */