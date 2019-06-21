package com.tencent.mm.plugin.gif;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class g
  implements a
{
  private int height;
  private String lis;
  private long npo;
  private long npp;
  private int width;

  public g(String paramString, int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(62421);
    this.npo = 0L;
    this.lis = paramString;
    this.width = paramInt1;
    this.height = paramInt2;
    this.npp = paramLong;
    ab.i("MicroMsg.MMGifEncoder", "create MMGifEncoder, width: %s, height: %s, frameDurationMs: %s, outputPath: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong), paramString });
    AppMethodBeat.o(62421);
  }

  public final boolean EK()
  {
    boolean bool = false;
    AppMethodBeat.i(62422);
    this.npo = MMWXGFJNI.nativeInitGifEncode(this.width, this.height, this.npp);
    if (this.npo == 0L)
    {
      h.pYm.k(852L, 11L, 1L);
      ab.e("MicroMsg.MMGifEncoder", "init gif encoder failed! %s", new Object[] { Long.valueOf(this.npo) });
      AppMethodBeat.o(62422);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.MMGifEncoder", "successfully init wxam encoder: %s", new Object[] { Long.valueOf(this.npo) });
      AppMethodBeat.o(62422);
      bool = true;
    }
  }

  public final boolean bFM()
  {
    boolean bool = true;
    AppMethodBeat.i(62424);
    byte[] arrayOfByte;
    if (this.npo != 0L)
    {
      arrayOfByte = MMWXGFJNI.nativeFinishGifEncode(this.npo);
      if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
      {
        ab.i("MicroMsg.MMGifEncoder", "finish encode error, buf: %s", new Object[] { Arrays.toString(arrayOfByte) });
        AppMethodBeat.o(62424);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.MMGifEncoder", "encoder buffer size: %s", new Object[] { Integer.valueOf(arrayOfByte.length) });
      if (!bo.isNullOrNil(this.lis))
      {
        FileOp.q(this.lis, arrayOfByte);
        AppMethodBeat.o(62424);
      }
      else
      {
        AppMethodBeat.o(62424);
        bool = false;
      }
    }
  }

  public final boolean c(byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(62423);
    boolean bool;
    if ((this.npo != 0L) && (!bo.cb(paramArrayOfByte)) && (paramArrayOfByte.length == this.width * this.height * 4))
    {
      long l = this.npp;
      if (paramLong >= 0L)
        l = paramLong;
      int i = MMWXGFJNI.nativeAddGifEncodeRgbaFrame(this.npo, this.width, this.height, paramArrayOfByte, l);
      if (i < 0)
      {
        ab.e("MicroMsg.MMGifEncoder", "add rgba frame failed: %s", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(62423);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(62423);
      bool = true;
      continue;
      ab.i("MicroMsg.MMGifEncoder", "add rgba frame failed, frame size or encoder ptr is not match");
      AppMethodBeat.o(62423);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.g
 * JD-Core Version:    0.6.2
 */