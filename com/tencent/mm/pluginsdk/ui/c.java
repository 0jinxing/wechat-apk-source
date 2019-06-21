package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.sdk.platformtools.d;

public final class c extends i
  implements d.a
{
  private c.a vgP;
  private int vgQ;

  public c(String paramString)
  {
    this(paramString, (byte)0);
  }

  private c(String paramString, byte paramByte)
  {
    super(new c.a(a.b.diS()), paramString, (byte)0);
    AppMethodBeat.i(79674);
    this.vgP = ((c.a)this.pqK);
    AppMethodBeat.o(79674);
  }

  private void af(Bitmap paramBitmap)
  {
    if (this.vgP != null)
      this.vgP.jMX = paramBitmap;
  }

  public final void KL(int paramInt)
  {
    AppMethodBeat.i(79675);
    if ((this.vgQ == paramInt) && (this.vgP != null) && (this.vgP.jMX != null) && (!this.vgP.jMX.isRecycled()))
      AppMethodBeat.o(79675);
    while (true)
    {
      return;
      this.vgQ = paramInt;
      af(d.LV(paramInt));
      AppMethodBeat.o(79675);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.c
 * JD-Core Version:    0.6.2
 */