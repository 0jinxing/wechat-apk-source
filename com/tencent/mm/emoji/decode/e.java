package com.tencent.mm.emoji.decode;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gif.MMGIFException;
import com.tencent.mm.plugin.gif.MMWXGFJNI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/decode/MMWXGFDecoder;", "Lcom/tencent/mm/emoji/decode/IGIFDecoder;", "bytes", "", "([B)V", "TAG", "", "currFrame", "", "currFrameTime", "frameMetadata", "", "gifHandle", "", "lastValidFrame", "Landroid/graphics/Bitmap;", "metadata", "decodeNextFrame", "", "destroy", "drawFrameBitmap", "", "bitmap", "frameHeight", "frameTime", "frameWidth", "getFrame", "plugin-emojisdk_release"})
public final class e
  implements b
{
  private final String TAG;
  private int currFrame;
  private Bitmap exl;
  private final int[] exn;
  private long exo;
  private final int[] exp;
  private int exq;

  public e(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(63149);
    this.TAG = "MicroMsg.GIF.MMWXGFDecoder";
    this.exn = new int[4];
    this.exp = new int[4];
    this.currFrame = -1;
    this.exq = 100;
    this.exo = MMWXGFJNI.nativeInitWxAMDecoder();
    if ((this.exo == 0L) || (this.exo == -901L))
    {
      ab.w(this.TAG, "Cpan init wxam decoder failed. gifHandle:%d", new Object[] { Long.valueOf(this.exo) });
      if (this.exo == -901L)
        h.pYm.a(711L, 5L, 1L, false);
      h.pYm.a(711L, 4L, 1L, false);
      paramArrayOfByte = (Throwable)new MMGIFException(201);
      AppMethodBeat.o(63149);
      throw paramArrayOfByte;
    }
    int i = MMWXGFJNI.nativeDecodeBufferHeader(this.exo, paramArrayOfByte, paramArrayOfByte.length);
    if (i != 0)
    {
      ab.w(this.TAG, "Cpan WXGF decode buffer header failed. result:%d", new Object[] { Integer.valueOf(i) });
      if (i == -904)
        h.pYm.a(711L, 8L, 1L, false);
      while (true)
      {
        paramArrayOfByte = (Throwable)new MMGIFException(i);
        AppMethodBeat.o(63149);
        throw paramArrayOfByte;
        h.pYm.a(711L, 3L, 1L, false);
      }
    }
    i = MMWXGFJNI.nativeGetOption(this.exo, paramArrayOfByte, paramArrayOfByte.length, this.exn);
    if (i != 0)
    {
      ab.w(this.TAG, "Cpan WXGF get option failed. result:%d", new Object[] { Integer.valueOf(i) });
      if (i == -903)
        h.pYm.a(711L, 7L, 1L, false);
      while (true)
      {
        paramArrayOfByte = (Throwable)new MMGIFException(i);
        AppMethodBeat.o(63149);
        throw paramArrayOfByte;
        h.pYm.a(711L, 3L, 1L, false);
      }
    }
    paramArrayOfByte = Bitmap.createBitmap(this.exn[1], this.exn[2], Bitmap.Config.ARGB_8888);
    j.o(paramArrayOfByte, "Bitmap.createBitmap(fram… Bitmap.Config.ARGB_8888)");
    this.exl = paramArrayOfByte;
    AppMethodBeat.o(63149);
  }

  public final void Or()
  {
    AppMethodBeat.i(63147);
    Bitmap localBitmap = this.exl;
    int i = MMWXGFJNI.nativeDecodeBufferFrame(this.exo, null, 0, localBitmap, this.exp);
    if (i == -904)
    {
      ab.i(this.TAG, "nativeDecodeBufferFrame failed. func is null.");
      h.pYm.a(401L, 8L, 1L, false);
      this.currFrame += 1;
      if ((this.currFrame >= this.exn[0]) || (i == 1))
      {
        this.currFrame = -1;
        if (MMWXGFJNI.nativeRewindBuffer(this.exo) == -905)
        {
          h.pYm.a(711L, 9L, 1L, false);
          ab.w(this.TAG, "Cpan Rewind buffer failed.");
        }
      }
      if (this.exp[0] <= 0)
        break label201;
    }
    label201: for (i = this.exp[0]; ; i = 100)
    {
      this.exq = i;
      AppMethodBeat.o(63147);
      return;
      if (i == -909)
      {
        ab.i(this.TAG, "nativeDecodeBufferFrame failed. frame is null.");
        h.pYm.a(401L, 11L, 1L, false);
        break;
      }
      if (i != -1)
        break;
      ab.i(this.TAG, "nativeDecodeBufferFrame failed.");
      break;
    }
  }

  public final Bitmap Os()
  {
    return this.exl;
  }

  public final int Ot()
  {
    if (this.exn[0] == 1);
    for (int i = 2147483647; ; i = this.exq)
      return i;
  }

  public final int Ou()
  {
    return this.exn[1];
  }

  public final int Ov()
  {
    return this.exn[2];
  }

  public final void destroy()
  {
    AppMethodBeat.i(63148);
    long l = this.exo;
    this.exo = 0L;
    int i = MMWXGFJNI.nativeUninit(l);
    if (i == -906)
      h.pYm.a(401L, 10L, 1L, false);
    ab.d(this.TAG, "nativeUninit result:%d gifHandle:%s", new Object[] { Integer.valueOf(i), Long.valueOf(l) });
    AppMethodBeat.o(63148);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.decode.e
 * JD-Core Version:    0.6.2
 */