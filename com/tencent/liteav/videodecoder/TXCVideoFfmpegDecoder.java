package com.tencent.liteav.videodecoder;

import android.view.Surface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

public class TXCVideoFfmpegDecoder
  implements a
{
  private boolean mFirstDec;
  private d mListener;
  private long mNativeDecoder;
  private long mNativeNotify;
  private ByteBuffer mPps;
  private byte[] mRawData;
  private ByteBuffer mSps;
  private int mVideoHeight;
  private int mVideoWidth;

  static
  {
    AppMethodBeat.i(67802);
    com.tencent.liteav.basic.util.b.e();
    nativeClassInit();
    AppMethodBeat.o(67802);
  }

  private static native void nativeClassInit();

  private native boolean nativeDecode(byte[] paramArrayOfByte, long paramLong1, long paramLong2);

  private native void nativeInit(WeakReference<TXCVideoFfmpegDecoder> paramWeakReference, boolean paramBoolean);

  private native void nativeLoadRawData(byte[] paramArrayOfByte, long paramLong, int paramInt);

  private native void nativeRelease();

  private static void postEventFromNative(WeakReference<TXCVideoFfmpegDecoder> paramWeakReference, long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(67800);
    paramWeakReference = (TXCVideoFfmpegDecoder)paramWeakReference.get();
    if (paramWeakReference != null)
    {
      d locald = paramWeakReference.mListener;
      if (locald != null)
      {
        locald.a(paramLong1, paramInt1, paramInt2, paramLong2, paramLong3);
        if ((paramWeakReference.mVideoWidth != paramInt1) || (paramWeakReference.mVideoHeight != paramInt2))
        {
          paramWeakReference.mVideoWidth = paramInt1;
          paramWeakReference.mVideoHeight = paramInt2;
          locald.a(paramWeakReference.mVideoWidth, paramWeakReference.mVideoHeight);
        }
      }
    }
    AppMethodBeat.o(67800);
  }

  public int config(Surface paramSurface)
  {
    return 0;
  }

  public void decode(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(67797);
    if (this.mFirstDec)
    {
      if ((this.mSps != null) && (this.mPps != null))
      {
        byte[] arrayOfByte1 = this.mSps.array();
        byte[] arrayOfByte2 = this.mPps.array();
        byte[] arrayOfByte3 = new byte[arrayOfByte1.length + arrayOfByte2.length];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte1.length);
        System.arraycopy(arrayOfByte2, 0, arrayOfByte3, arrayOfByte1.length, arrayOfByte2.length);
        nativeDecode(arrayOfByte3, paramb.g - 1L, paramb.h - 1L);
      }
      this.mFirstDec = false;
    }
    nativeDecode(paramb.a, paramb.g, paramb.h);
    AppMethodBeat.o(67797);
  }

  public boolean isHevc()
  {
    return false;
  }

  public void loadNativeData(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    AppMethodBeat.i(67801);
    nativeLoadRawData(paramArrayOfByte, paramLong, paramInt);
    AppMethodBeat.o(67801);
  }

  public void setListener(d paramd)
  {
    this.mListener = paramd;
  }

  public void setNotifyListener(WeakReference<com.tencent.liteav.basic.d.a> paramWeakReference)
  {
  }

  public int start(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(67798);
    this.mSps = paramByteBuffer1;
    this.mPps = paramByteBuffer2;
    this.mFirstDec = true;
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    nativeInit(new WeakReference(this), paramBoolean1);
    AppMethodBeat.o(67798);
    return 0;
  }

  public void stop()
  {
    AppMethodBeat.i(67799);
    nativeRelease();
    AppMethodBeat.o(67799);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videodecoder.TXCVideoFfmpegDecoder
 * JD-Core Version:    0.6.2
 */