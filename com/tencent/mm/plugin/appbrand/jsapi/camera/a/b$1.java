package com.tencent.mm.plugin.appbrand.jsapi.camera.a;

import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.qbar.QbarNative;
import java.util.concurrent.atomic.AtomicBoolean;

final class b$1
  implements Runnable
{
  b$1(b paramb, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, Rect paramRect)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130978);
    if (this.hHr.hHj.compareAndSet(false, true))
    {
      byte[] arrayOfByte1 = this.hHm;
      if ((270 == this.hHn) || (90 == this.hHn))
      {
        byte[] arrayOfByte2 = new byte[this.hHm.length];
        QbarNative.a(arrayOfByte2, this.hHm, this.hHo, this.hHp);
        arrayOfByte1 = new byte[this.hHm.length];
        QbarNative.a(arrayOfByte1, arrayOfByte2, this.hHp, this.hHo);
        QbarNative.nativeRelease();
      }
      this.hHr.b(arrayOfByte1, this.hHo, this.hHp, this.hHn);
      this.hHr.hHj.set(false);
      AppMethodBeat.o(130978);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.appbrand.ScanDecoder", "decode isDecoding");
      AppMethodBeat.o(130978);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.a.b.1
 * JD-Core Version:    0.6.2
 */