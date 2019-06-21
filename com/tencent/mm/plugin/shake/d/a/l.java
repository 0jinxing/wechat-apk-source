package com.tencent.mm.plugin.shake.d.a;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.d;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.l.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public final class l extends l.b
{
  private static boolean isInited = false;
  private static boolean isRunning = false;
  private Context context;
  private boolean csi;
  private long iQb;
  private a qtU;

  public l(Context paramContext, l.a parama)
  {
    super(parama);
    AppMethodBeat.i(24657);
    this.csi = false;
    this.qtU = new a();
    this.context = paramContext;
    isRunning = false;
    AppMethodBeat.o(24657);
  }

  private void c(List<d> paramList, long paramLong)
  {
    AppMethodBeat.i(24661);
    if (this.qrT != null)
      this.qrT.b(paramList, paramLong);
    AppMethodBeat.o(24661);
  }

  public final void cjw()
  {
    AppMethodBeat.i(24660);
    super.cjw();
    this.qtU.EB();
    if (isRunning)
    {
      long l = System.currentTimeMillis() - this.iQb;
      ab.d("Micromsg.ShakeTVService", "a%s, isRunning=%s", new Object[] { Long.valueOf(l), Boolean.valueOf(isRunning) });
      h.pYm.e(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(2), Integer.valueOf((int)l) });
      h.pYm.k(835L, 1L, 1L);
      isRunning = false;
    }
    AppMethodBeat.o(24660);
  }

  public final void init()
  {
    AppMethodBeat.i(24659);
    if (!isInited)
      if (!this.qtU.ckt())
      {
        ab.e("Micromsg.ShakeTVService", "init MusicFingerPrintRecorder false");
        AppMethodBeat.o(24659);
      }
    while (true)
    {
      return;
      isInited = true;
      AppMethodBeat.o(24659);
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
    AppMethodBeat.i(24658);
    ab.v("Micromsg.ShakeTVService", "hy: start shake tv!");
    if (this.qrT == null)
    {
      ab.w("Micromsg.ShakeTVService", "shakeGetListener == null");
      AppMethodBeat.o(24658);
    }
    while (true)
    {
      return;
      if (!(this.context instanceof Activity))
      {
        ab.e("Micromsg.ShakeTVService", "context not an Activity");
        this.qrT.b(new ArrayList(), 0L);
        AppMethodBeat.o(24658);
      }
      else
      {
        isRunning = true;
        this.iQb = System.currentTimeMillis();
        this.qtU.a(408, new l.1(this));
        h.pYm.k(835L, 5L, 1L);
        AppMethodBeat.o(24658);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.l
 * JD-Core Version:    0.6.2
 */