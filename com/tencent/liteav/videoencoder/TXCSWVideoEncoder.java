package com.tencent.liteav.videoencoder;

import android.opengl.GLES20;
import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.b;
import com.tencent.liteav.beauty.b.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class TXCSWVideoEncoder extends c
{
  private static final boolean DEBUG = false;
  private static final String TAG;
  private int mBitrate = 0;
  private long mNativeX264Encoder = 0L;
  private long mPTS = 0L;
  private int mPopIdx = 0;
  private int mPushIdx = 0;
  private g mRawFrameFilter;
  private int mRendIdx = 0;
  private g mResizeFilter;

  static
  {
    AppMethodBeat.i(67409);
    TAG = TXCSWVideoEncoder.class.getSimpleName();
    b.e();
    nativeClassInit();
    AppMethodBeat.o(67409);
  }

  private static native void nativeClassInit();

  private native int nativeEncode(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2);

  private native int nativeEncodeSync(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2);

  private native long nativeGetRealFPS(long paramLong);

  private native long nativeInit(WeakReference<TXCSWVideoEncoder> paramWeakReference);

  private native void nativeRelease(long paramLong);

  private native void nativeSetBitrate(long paramLong, int paramInt);

  private native void nativeSignalEOSAndFlush(long paramLong);

  private native int nativeStart(long paramLong, TXSVideoEncoderParam paramTXSVideoEncoderParam);

  private native void nativeStop(long paramLong);

  private native long nativegetRealBitrate(long paramLong);

  private static void postEventFromNative(WeakReference<TXCSWVideoEncoder> paramWeakReference, byte[] paramArrayOfByte, int paramInt1, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt2)
  {
    AppMethodBeat.i(67405);
    paramWeakReference = (TXCSWVideoEncoder)paramWeakReference.get();
    if (paramWeakReference != null)
      paramWeakReference.callDelegate(paramArrayOfByte, paramInt1, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramInt2, null, null);
    AppMethodBeat.o(67405);
  }

  private long pushVideoFrameInternal(int paramInt1, int paramInt2, int paramInt3, long paramLong, boolean paramBoolean)
  {
    long l = 10000004L;
    AppMethodBeat.i(67406);
    int[] arrayOfInt;
    if (this.mGLContextExternal != null)
    {
      if ((this.mInputWidth != paramInt2) || (this.mInputHeight != paramInt3))
      {
        this.mInputWidth = paramInt2;
        this.mInputHeight = paramInt3;
        if (this.mResizeFilter == null)
        {
          this.mResizeFilter = new g();
          this.mResizeFilter.a();
          this.mResizeFilter.a(true);
        }
        this.mResizeFilter.a(this.mOutputWidth, this.mOutputHeight);
      }
      GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
      if (this.mResizeFilter != null)
        this.mResizeFilter.b(paramInt1);
      if (this.mResizeFilter != null)
        paramInt1 = this.mResizeFilter.l();
      arrayOfInt = new int[1];
      this.mPTS = paramLong;
      if (this.mRawFrameFilter == null)
      {
        this.mRawFrameFilter = new n(1);
        this.mRawFrameFilter.a(true);
        if (!this.mRawFrameFilter.a())
        {
          this.mRawFrameFilter = null;
          AppMethodBeat.o(67406);
          paramLong = l;
        }
      }
    }
    while (true)
    {
      return paramLong;
      this.mRawFrameFilter.a(this.mOutputWidth, this.mOutputHeight);
      this.mRawFrameFilter.a(new TXCSWVideoEncoder.1(this, paramBoolean, paramInt1));
      if (this.mRawFrameFilter == null)
      {
        AppMethodBeat.o(67406);
        paramLong = l;
      }
      else
      {
        GLES20.glViewport(0, 0, this.mOutputWidth, this.mOutputHeight);
        this.mRawFrameFilter.b(paramInt1);
        paramInt1 = arrayOfInt[0];
        if (paramInt1 != 0)
          callDelegate(paramInt1);
        paramLong = 0L;
        AppMethodBeat.o(67406);
      }
    }
  }

  public long getRealBitrate()
  {
    AppMethodBeat.i(67401);
    long l = nativegetRealBitrate(this.mNativeX264Encoder);
    AppMethodBeat.o(67401);
    return l;
  }

  public long getRealFPS()
  {
    AppMethodBeat.i(67400);
    long l = nativeGetRealFPS(this.mNativeX264Encoder);
    AppMethodBeat.o(67400);
    return l;
  }

  public long pushVideoFrame(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(67402);
    paramLong = pushVideoFrameInternal(paramInt1, paramInt2, paramInt3, paramLong, false);
    AppMethodBeat.o(67402);
    return paramLong;
  }

  public long pushVideoFrameSync(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(67403);
    paramLong = pushVideoFrameInternal(paramInt1, paramInt2, paramInt3, paramLong, true);
    AppMethodBeat.o(67403);
    return paramLong;
  }

  public void setBitrate(int paramInt)
  {
    AppMethodBeat.i(67399);
    this.mBitrate = paramInt;
    nativeSetBitrate(this.mNativeX264Encoder, paramInt);
    AppMethodBeat.o(67399);
  }

  public void setFPS(int paramInt)
  {
  }

  public void signalEOSAndFlush()
  {
    AppMethodBeat.i(67404);
    nativeSignalEOSAndFlush(this.mNativeX264Encoder);
    AppMethodBeat.o(67404);
  }

  public int start(TXSVideoEncoderParam paramTXSVideoEncoderParam)
  {
    AppMethodBeat.i(67397);
    super.start(paramTXSVideoEncoderParam);
    int i = (paramTXSVideoEncoderParam.width + 7) / 8 * 8;
    int j = (paramTXSVideoEncoderParam.height + 1) / 2 * 2;
    if ((i != paramTXSVideoEncoderParam.width) || (j != paramTXSVideoEncoderParam.height))
    {
      TXCLog.w(TAG, "Encode Resolution not supportted, transforming...");
      TXCLog.w(TAG, paramTXSVideoEncoderParam.width + "x" + paramTXSVideoEncoderParam.height + "-> " + i + "x" + j);
    }
    paramTXSVideoEncoderParam.width = i;
    paramTXSVideoEncoderParam.height = j;
    this.mOutputWidth = i;
    this.mOutputHeight = j;
    this.mInputWidth = i;
    this.mInputHeight = j;
    this.mNativeX264Encoder = nativeInit(new WeakReference(this));
    nativeSetBitrate(this.mNativeX264Encoder, this.mBitrate);
    nativeStart(this.mNativeX264Encoder, paramTXSVideoEncoderParam);
    AppMethodBeat.o(67397);
    return 0;
  }

  public void stop()
  {
    AppMethodBeat.i(67398);
    this.mGLContextExternal = null;
    nativeStop(this.mNativeX264Encoder);
    nativeRelease(this.mNativeX264Encoder);
    this.mNativeX264Encoder = 0L;
    if (this.mRawFrameFilter != null)
    {
      this.mRawFrameFilter.d();
      this.mRawFrameFilter = null;
    }
    if (this.mResizeFilter != null)
    {
      this.mResizeFilter.d();
      this.mResizeFilter = null;
    }
    super.stop();
    AppMethodBeat.o(67398);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videoencoder.TXCSWVideoEncoder
 * JD-Core Version:    0.6.2
 */