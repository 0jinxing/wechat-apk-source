package com.tencent.mm.plugin.gif;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;

public final class j
  implements a
{
  private int height;
  private String lis;
  private long npo;
  private long npp;
  private int npv;
  private int width;

  public j(String paramString, int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(62448);
    this.npo = 0L;
    this.npv = -1;
    this.lis = paramString;
    this.width = paramInt1;
    this.height = paramInt2;
    this.npp = paramLong;
    this.npv = 20;
    ab.i("MicroMsg.MMWxAMEncoder", "create MMWxAMEncoder, width: %s, height: %s, frameDurationMs: %s, qp: %s, outputPath: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong), Integer.valueOf(20), paramString });
    AppMethodBeat.o(62448);
  }

  public final boolean EK()
  {
    boolean bool = false;
    AppMethodBeat.i(62449);
    this.npo = MMWXGFJNI.nativeInitWxAMEncoder(this.width, this.height, this.npp, this.npv);
    if (this.npo == 0L)
    {
      h.pYm.k(852L, 12L, 1L);
      ab.e("MicroMsg.MMWxAMEncoder", "init wxam encoder failed! %s", new Object[] { Long.valueOf(this.npo) });
      AppMethodBeat.o(62449);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.MMWxAMEncoder", "successfully init wxam encoder: %s", new Object[] { Long.valueOf(this.npo) });
      AppMethodBeat.o(62449);
      bool = true;
    }
  }

  public final boolean bFM()
  {
    boolean bool = true;
    AppMethodBeat.i(62451);
    byte[] arrayOfByte;
    if (this.npo != 0L)
    {
      arrayOfByte = MMWXGFJNI.nativeFinishWxAMEncode(this.npo);
      if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
      {
        ab.i("MicroMsg.MMWxAMEncoder", "finish encode error, buf: %s", new Object[] { Arrays.toString(arrayOfByte) });
        AppMethodBeat.o(62451);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.MMWxAMEncoder", "encoder buffer size: %s", new Object[] { Integer.valueOf(arrayOfByte.length) });
      if (!bo.isNullOrNil(this.lis))
      {
        FileOp.q(this.lis, arrayOfByte);
        AppMethodBeat.o(62451);
      }
      else
      {
        AppMethodBeat.o(62451);
        bool = false;
      }
    }
  }

  public final boolean c(byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(62450);
    boolean bool;
    if ((this.npo != 0L) && (!bo.cb(paramArrayOfByte)) && (paramArrayOfByte.length == this.width * this.height * 4))
    {
      long l = this.npp;
      if (paramLong >= 0L)
        l = paramLong;
      int i = MMWXGFJNI.nativeAddWxAMEncodeRgbaFrame(this.npo, this.width, this.height, paramArrayOfByte, l);
      if (i < 0)
      {
        ab.e("MicroMsg.MMWxAMEncoder", "add rgba frame failed: %s", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(62450);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(62450);
      bool = true;
      continue;
      ab.i("MicroMsg.MMWxAMEncoder", "add rgba frame failed, frame size or encoder ptr is not match");
      AppMethodBeat.o(62450);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.j
 * JD-Core Version:    0.6.2
 */