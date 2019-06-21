package com.tencent.mm.plugin.appbrand.media.record.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class b
  implements c
{
  String ilX = "audio/mp4a-latm";
  String ilY = "audio/mpeg";
  c.a ilZ = null;
  int ima = 0;
  int imb = 0;
  byte[] imc;
  int imd = 0;

  public final void a(c.a parama)
  {
    this.ilZ = parama;
  }

  public boolean a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    return false;
  }

  public void close()
  {
  }

  public final void e(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(105651);
    if (this.ilZ == null)
    {
      ab.e("MicroMsg.Record.AudioEncoder", "mEncodeListener is null, return");
      AppMethodBeat.o(105651);
    }
    while (true)
    {
      return;
      if (this.imb != 0.0D)
        break;
      ab.e("MicroMsg.Record.AudioEncoder", "no frameSize, return");
      AppMethodBeat.o(105651);
    }
    if (paramInt > this.imb)
      ab.w("MicroMsg.Record.AudioEncoder", "buffSize:%d frameSize:%d, buffSize > frameSize ", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.imb) });
    ab.d("MicroMsg.Record.AudioEncoder", "bufferedSize:%d, buffSize:%d", new Object[] { Integer.valueOf(this.imd), Integer.valueOf(paramInt) });
    int i = this.imd + paramInt;
    if ((i >= this.imb) && (paramArrayOfByte != null))
    {
      ab.d("MicroMsg.Record.AudioEncoder", "flush all, currentBufferedSize:%d", new Object[] { Integer.valueOf(i) });
      if (i > this.imc.length)
      {
        ab.i("MicroMsg.Record.AudioEncoder", "expand the end codeBuffer:%d", new Object[] { Integer.valueOf(i) });
        byte[] arrayOfByte = this.imc;
        this.imc = new byte[i];
        System.arraycopy(arrayOfByte, 0, this.imc, 0, this.imd);
      }
      System.arraycopy(paramArrayOfByte, 0, this.imc, this.imd, paramInt);
      this.ilZ.d(this.imc, i, false);
      this.imd = 0;
    }
    while (true)
    {
      if (paramBoolean)
      {
        ab.i("MicroMsg.Record.AudioEncoder", "isEnd is true, flush the buffer, bufferedSize:%d", new Object[] { Integer.valueOf(this.imd) });
        this.ilZ.d(this.imc, this.imd, paramBoolean);
        this.imd = 0;
      }
      AppMethodBeat.o(105651);
      break;
      if (paramArrayOfByte != null)
      {
        System.arraycopy(paramArrayOfByte, 0, this.imc, this.imd, paramInt);
        this.imd = i;
        ab.d("MicroMsg.Record.AudioEncoder", "append buff, currentBufferedSize:%d", new Object[] { Integer.valueOf(this.imd) });
      }
    }
  }

  public void flush()
  {
  }

  public boolean h(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return false;
  }

  public final void pl(int paramInt)
  {
    AppMethodBeat.i(105649);
    ab.i("MicroMsg.Record.AudioEncoder", "mMinBufferSize:%d", new Object[] { Integer.valueOf(this.ima) });
    this.ima = paramInt;
    AppMethodBeat.o(105649);
  }

  public final void t(double paramDouble)
  {
    AppMethodBeat.i(105650);
    this.imb = ((int)(1024.0D * paramDouble));
    ab.i("MicroMsg.Record.AudioEncoder", "setEncodeBuffFrameSize frameKbSize:%b frameByteSize:%d", new Object[] { Double.valueOf(paramDouble), Integer.valueOf(this.imb) });
    this.imc = new byte[this.imb];
    AppMethodBeat.o(105650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.a.b
 * JD-Core Version:    0.6.2
 */