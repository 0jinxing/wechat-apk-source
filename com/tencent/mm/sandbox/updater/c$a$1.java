package com.tencent.mm.sandbox.updater;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class c$a$1 extends OutputStream
{
  private ak handler;
  private ByteArrayOutputStream xwh;

  c$a$1(c.a parama)
  {
    AppMethodBeat.i(28863);
    this.handler = new ak(Looper.getMainLooper());
    this.xwh = new ByteArrayOutputStream();
    AppMethodBeat.o(28863);
  }

  public final void write(int paramInt)
  {
    AppMethodBeat.i(28865);
    IOException localIOException = new IOException("unexpected operation");
    AppMethodBeat.o(28865);
    throw localIOException;
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(28864);
    this.xwh.write(paramArrayOfByte, paramInt1, paramInt2);
    if ((this.xwh.size() < 131072) && (c.a.a(this.xwi) + this.xwh.size() < c.a.b(this.xwi)))
      AppMethodBeat.o(28864);
    while (true)
    {
      return;
      paramInt1 = this.xwh.size();
      paramInt2 = e.a(this.xwi.xwc.alN(), this.xwh.toByteArray(), paramInt1);
      this.xwh.reset();
      if (paramInt2 != 0)
      {
        paramArrayOfByte = new IOException("appendToFile failed :".concat(String.valueOf(paramInt2)));
        AppMethodBeat.o(28864);
        throw paramArrayOfByte;
      }
      c.a.a(this.xwi, c.a.a(this.xwi) + paramInt1);
      this.handler.post(new c.a.1.1(this, paramInt1));
      if (c.a(this.xwi.xwc))
      {
        paramArrayOfByte = new IOException("manual force cancel!");
        AppMethodBeat.o(28864);
        throw paramArrayOfByte;
      }
      AppMethodBeat.o(28864);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.c.a.1
 * JD-Core Version:    0.6.2
 */