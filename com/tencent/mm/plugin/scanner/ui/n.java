package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.graphics.Point;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.pp;
import com.tencent.mm.plugin.scanner.util.k;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
{
  public n(i.b paramb, Point paramPoint, DisplayMetrics paramDisplayMetrics, int paramInt)
  {
    super(paramb, paramPoint, paramDisplayMetrics, paramInt);
  }

  public final void b(int paramInt1, String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(81184);
    ab.d("MicroMsg.ScanModeLicenceForIdCardPayAuth", "onDecodeSuccess");
    paramString = ((k)this.qen).qir;
    paramArrayOfByte1 = new pp();
    paramArrayOfByte1.cLM.cardType = "identity";
    paramArrayOfByte1.cLM.cLN = 1;
    if ((this.qen instanceof k))
      paramArrayOfByte1.cLM.cLP = paramString;
    a.xxA.a(paramArrayOfByte1, Looper.getMainLooper());
    this.qet.getContext().finish();
    AppMethodBeat.o(81184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.n
 * JD-Core Version:    0.6.2
 */