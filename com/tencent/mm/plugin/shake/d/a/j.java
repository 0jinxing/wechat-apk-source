package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.shake.b.d;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public final class j extends l.b
{
  public static boolean isInited = false;
  public static j qtV;
  private boolean csi;
  private long iQb;
  public a qtU;

  private j(l.a parama)
  {
    super(parama);
    AppMethodBeat.i(24640);
    this.csi = false;
    this.qtU = new a();
    AppMethodBeat.o(24640);
  }

  public static j a(l.a parama)
  {
    AppMethodBeat.i(24639);
    if ((qtV == null) || (qtV.qrT == null))
      qtV = new j(parama);
    parama = qtV;
    AppMethodBeat.o(24639);
    return parama;
  }

  private void c(List<d> paramList, long paramLong)
  {
    AppMethodBeat.i(24644);
    if (this.qrT != null)
      this.qrT.b(paramList, paramLong);
    AppMethodBeat.o(24644);
  }

  public final void cjw()
  {
    AppMethodBeat.i(24643);
    this.qtU.EB();
    super.cjw();
    AppMethodBeat.o(24643);
  }

  public final void init()
  {
    AppMethodBeat.i(24642);
    if (!isInited)
      if (!this.qtU.ckt())
      {
        ab.e("Micromsg.ShakeMusicMgr", "init MusicFingerPrintRecorder false");
        AppMethodBeat.o(24642);
      }
    while (true)
    {
      return;
      isInited = true;
      AppMethodBeat.o(24642);
    }
  }

  public final void pause()
  {
  }

  public final void reset()
  {
  }

  public final void resume()
  {
  }

  public final void start()
  {
    AppMethodBeat.i(24641);
    if (this.qrT == null)
    {
      ab.w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
      AppMethodBeat.o(24641);
    }
    while (true)
    {
      return;
      this.iQb = System.currentTimeMillis();
      this.qtU.a(367, new j.1(this));
      AppMethodBeat.o(24641);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.j
 * JD-Core Version:    0.6.2
 */