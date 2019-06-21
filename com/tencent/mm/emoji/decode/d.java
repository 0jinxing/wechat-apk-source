package com.tencent.mm.emoji.decode;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.plugin.gif.MMGIFJNI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.InputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/decode/MMGIFDecoder;", "Lcom/tencent/mm/emoji/decode/IGIFDecoder;", "bytes", "", "([B)V", "stream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "TAG", "", "gifPointer", "", "lastValidFrame", "Landroid/graphics/Bitmap;", "metadata", "", "startPerformance", "", "decodeNextFrame", "", "destroy", "drawFrameBitmap", "", "bitmap", "frameHeight", "frameTime", "frameWidth", "getFrame", "plugin-emojisdk_release"})
public final class d
  implements b
{
  private final String TAG;
  private int ehv;
  private Bitmap exl;
  private long exm;
  private final int[] exn;

  public d(InputStream paramInputStream)
  {
    AppMethodBeat.i(63144);
    this.TAG = "MicroMsg.GIF.MMGIFDecoder";
    this.exn = new int[6];
    boolean bool = WXHardCoderJNI.hcGifEnable;
    int i = WXHardCoderJNI.hcGifDelay;
    int j = WXHardCoderJNI.hcGifCPU;
    int k = WXHardCoderJNI.hcGifIO;
    if (WXHardCoderJNI.hcGifThr);
    for (int m = Process.myTid(); ; m = 0)
    {
      this.ehv = WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcGifTimeout, 602, WXHardCoderJNI.hcGifAction, this.TAG);
      this.exm = MMGIFJNI.openByInputStrem(paramInputStream, this.exn);
      if ((this.exn[0] > 1024) || (this.exn[1] > 1024))
      {
        ab.w(this.TAG, "emoji width or height over size. Width:%d Height:%d", new Object[] { Integer.valueOf(this.exn[0]), Integer.valueOf(this.exn[1]) });
        h.pYm.a(401L, 2L, 1L, false);
      }
      paramInputStream = Bitmap.createBitmap(this.exn[0], this.exn[1], Bitmap.Config.ARGB_8888);
      j.o(paramInputStream, "Bitmap.createBitmap(fram… Bitmap.Config.ARGB_8888)");
      this.exl = paramInputStream;
      AppMethodBeat.o(63144);
      return;
    }
  }

  public d(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(63143);
    this.TAG = "MicroMsg.GIF.MMGIFDecoder";
    this.exn = new int[6];
    boolean bool = WXHardCoderJNI.hcGifEnable;
    int i = WXHardCoderJNI.hcGifDelay;
    int j = WXHardCoderJNI.hcGifCPU;
    int k = WXHardCoderJNI.hcGifIO;
    if (WXHardCoderJNI.hcGifThr);
    for (int m = Process.myTid(); ; m = 0)
    {
      this.ehv = WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcGifTimeout, 602, WXHardCoderJNI.hcGifAction, this.TAG);
      this.exm = MMGIFJNI.openByByteArray(paramArrayOfByte, this.exn);
      if ((this.exn[0] > 1024) || (this.exn[1] > 1024))
      {
        ab.w(this.TAG, "emoji width or height over size. Width:%d Height:%d", new Object[] { Integer.valueOf(this.exn[0]), Integer.valueOf(this.exn[1]) });
        h.pYm.a(401L, 2L, 1L, false);
      }
      paramArrayOfByte = Bitmap.createBitmap(this.exn[0], this.exn[1], Bitmap.Config.ARGB_8888);
      j.o(paramArrayOfByte, "Bitmap.createBitmap(fram… Bitmap.Config.ARGB_8888)");
      this.exl = paramArrayOfByte;
      AppMethodBeat.o(63143);
      return;
    }
  }

  public final void Or()
  {
    AppMethodBeat.i(63141);
    MMGIFJNI.drawFrameBitmap(this.exm, this.exl, this.exn);
    AppMethodBeat.o(63141);
  }

  public final Bitmap Os()
  {
    return this.exl;
  }

  public final int Ot()
  {
    if (this.exn[2] == 1);
    for (int i = 2147483647; ; i = this.exn[4])
      return i;
  }

  public final int Ou()
  {
    return this.exn[0];
  }

  public final int Ov()
  {
    return this.exn[1];
  }

  public final void destroy()
  {
    AppMethodBeat.i(63142);
    if (this.ehv != 0)
      if ((!WXHardCoderJNI.hcGifEnable) && (!WXHardCoderJNI.hcGifFrameEnable))
        break label60;
    label60: for (boolean bool = true; ; bool = false)
    {
      WXHardCoderJNI.stopPerformance(bool, this.ehv);
      this.ehv = 0;
      long l = this.exm;
      this.exm = 0L;
      MMGIFJNI.recycle(l);
      AppMethodBeat.o(63142);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.decode.d
 * JD-Core Version:    0.6.2
 */