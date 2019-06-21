package com.tencent.mm.plugin.mmsight.segment;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.media.Image;
import android.media.Image.Plane;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;

@TargetApi(21)
public final class j extends i
{
  public static String TAG = "MicroMsg.MediaCodecTranscodeDecoder21";

  public j(MediaExtractor paramMediaExtractor, MediaFormat paramMediaFormat, int paramInt)
  {
    super(paramMediaExtractor, paramMediaFormat, paramInt);
    AppMethodBeat.i(3674);
    ab.i(TAG, "init ");
    AppMethodBeat.o(3674);
  }

  private static byte[] a(Image paramImage)
  {
    AppMethodBeat.i(3677);
    int i = paramImage.getFormat();
    int j = paramImage.getWidth();
    int k = paramImage.getHeight();
    int m = 0;
    paramImage = paramImage.getPlanes();
    int n = j * k * ImageFormat.getBitsPerPixel(i) / 8;
    ab.i(TAG, "planes len %d, datalen: %s width %d height %d format %d", new Object[] { Integer.valueOf(paramImage.length), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i) });
    byte[] arrayOfByte1 = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(n));
    for (i = 0; i < paramImage.length; i++)
    {
      ByteBuffer localByteBuffer = paramImage[i].getBuffer();
      int i1 = paramImage[i].getRowStride();
      int i2 = paramImage[i].getPixelStride();
      int i3;
      if (i == 0)
      {
        i3 = j;
        if (i != 0)
          break label304;
      }
      byte[] arrayOfByte2;
      int i5;
      label304: for (int i4 = k; ; i4 = k / 2)
      {
        ab.v(TAG, "row planes rowStride %d w %d h %d pixelStride %d", new Object[] { Integer.valueOf(i1), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2) });
        arrayOfByte2 = com.tencent.mm.plugin.mmsight.model.a.j.owk.g(Integer.valueOf(i1));
        i5 = 0;
        while (true)
        {
          if (i5 >= i4)
            break label387;
          n = ImageFormat.getBitsPerPixel(35) / 8;
          if (i2 != n)
            break;
          n *= i3;
          localByteBuffer.get(arrayOfByte1, m, n);
          if (i4 - i5 != 1)
            localByteBuffer.position(localByteBuffer.position() + i1 - n);
          n = m + n;
          i5++;
          m = n;
        }
        i3 = j / 2;
        break;
      }
      if (i4 - i5 == 1)
        localByteBuffer.get(arrayOfByte2, 0, j - i2 + 1);
      while (true)
      {
        int i6 = 0;
        while (true)
        {
          n = m;
          if (i6 >= i3)
            break;
          arrayOfByte1[m] = ((byte)arrayOfByte2[(i6 * i2)]);
          i6++;
          m++;
        }
        localByteBuffer.get(arrayOfByte2, 0, i1);
      }
      label387: com.tencent.mm.plugin.mmsight.model.a.j.owk.g(arrayOfByte2);
    }
    AppMethodBeat.o(3677);
    return arrayOfByte1;
  }

  protected final boolean UF()
  {
    boolean bool = true;
    AppMethodBeat.i(3676);
    if (this.eTq == null)
    {
      ab.e(TAG, "drainDecoder, decoder is null");
      AppMethodBeat.o(3676);
    }
    int i;
    while (true)
    {
      return bool;
      i = this.eTq.dequeueOutputBuffer(this.eTy, 60000L);
      ab.i(TAG, "outputBufferIndex-->".concat(String.valueOf(i)));
      label61: if (i != -1)
        break;
      ab.i(TAG, "no output from decoder available, break");
      label74: AppMethodBeat.o(3676);
      bool = false;
    }
    if (i == -3)
      ab.i(TAG, "decoder output buffers changed");
    while (true)
    {
      while (true)
      {
        int j = this.eTq.dequeueOutputBuffer(this.eTy, 60000L);
        i = j;
        if (j >= 0)
          break label61;
        break label74;
        if (i == -2)
        {
          this.fYc = this.eTq.getOutputFormat();
          ab.i(TAG, "decoder output format changed: " + this.fYc);
        }
        else if (i < 0)
        {
          ab.w(TAG, "unexpected result from decoder.dequeueOutputBuffer: ".concat(String.valueOf(i)));
        }
        else
        {
          ab.v(TAG, "perform decoding");
          long l = bo.yz();
          byte[] arrayOfByte = a(this.eTq.getOutputImage(i));
          ab.v(TAG, "perform decoding costImage %s", new Object[] { Long.valueOf(bo.az(l)) });
          if (arrayOfByte == null)
            break label74;
          if (arrayOfByte.length == 0)
            break label477;
          MediaCodec.BufferInfo localBufferInfo = this.eTy;
          if (arrayOfByte == null)
            ab.e(TAG, "processDecodeOutputBuffer error! byteBuffer is null");
          while (true)
          {
            this.eTq.releaseOutputBuffer(i, false);
            l = this.eTy.presentationTimeUs;
            if ((this.eTA == 1L) || (l < this.eTA * 1000L))
              break label392;
            ab.e(TAG, "exceed endTimeMs");
            AppMethodBeat.o(3676);
            break;
            ab.i(TAG, "processDecodeOutputBuffer, byteBuffer: %s, bufferInfo: %s, size: %d", new Object[] { arrayOfByte, localBufferInfo, Integer.valueOf(localBufferInfo.size) });
            this.fYc = this.eTq.getOutputFormat();
            if (this.oxF != null)
              this.oxF.ba(arrayOfByte);
          }
          label392: if ((this.eTy.flags & 0x4) != 0)
          {
            ab.i(TAG, "receive end of stream");
            try
            {
              this.eTq.stop();
              this.eTq.release();
              this.eTq = null;
              AppMethodBeat.o(3676);
            }
            catch (Exception localException)
            {
              while (true)
                ab.e(TAG, "stop and release decoder error: %s", new Object[] { localException.getMessage() });
            }
          }
        }
      }
      AppMethodBeat.o(3676);
      bool = false;
      break;
      label477: this.eTq.releaseOutputBuffer(i, false);
    }
  }

  protected final int a(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    AppMethodBeat.i(3675);
    ab.i(TAG, "selectColorFormat, mimeType: %s, codecInfo: %s", new Object[] { paramString, paramMediaCodecInfo });
    long l = bo.yz();
    paramString = paramMediaCodecInfo.getCapabilitiesForType(paramString);
    ab.i(TAG, "getCapabilitiesForType used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    ab.i(TAG, "color format length: %s", new Object[] { Integer.valueOf(paramString.colorFormats.length) });
    int i = 0;
    int m;
    for (int j = 0; i < paramString.colorFormats.length; j = m)
    {
      int k = paramString.colorFormats[i];
      ab.i(TAG, "capabilities colorFormat: %s", new Object[] { Integer.valueOf(k) });
      m = j;
      if (mr(k))
        if (k <= j)
        {
          m = j;
          if (k != 2135033992);
        }
        else
        {
          m = k;
        }
      i++;
    }
    ab.i(TAG, "codec: %s, colorFormat: %s", new Object[] { paramMediaCodecInfo.getName(), Integer.valueOf(j) });
    AppMethodBeat.o(3675);
    return j;
  }

  public final int alK()
  {
    return 2;
  }

  protected final boolean mr(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 2135033992:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.j
 * JD-Core Version:    0.6.2
 */