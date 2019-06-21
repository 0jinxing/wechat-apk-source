package com.tencent.mm.plugin.translate;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.translate.a.c.a;
import com.tencent.mm.plugin.translate.a.c.b;
import com.tencent.mm.plugin.translate.a.d;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.az;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public final class a
  implements at
{
  ak handler;
  com.tencent.mm.plugin.translate.a.c sKl;
  az sKm;
  private c.a sKn;
  private com.tencent.mm.sdk.b.c sKo;
  private com.tencent.mm.sdk.b.c sKp;

  public a()
  {
    AppMethodBeat.i(26055);
    this.sKl = c.b.sKz;
    this.sKm = new az(5, "ProcessTranslatedMessage", 1, Looper.getMainLooper());
    this.sKn = new a.1(this);
    this.handler = new ak(Looper.getMainLooper());
    this.sKo = new a.2(this);
    this.sKp = new a.3(this);
    AppMethodBeat.o(26055);
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(26056);
    com.tencent.mm.plugin.translate.a.c localc = this.sKl;
    c.a locala = this.sKn;
    if ((locala == null) || (localc.eES.contains(locala)));
    while (true)
    {
      com.tencent.mm.sdk.b.a.xxA.c(this.sKo);
      com.tencent.mm.sdk.b.a.xxA.c(this.sKp);
      AppMethodBeat.o(26056);
      return;
      localc.eES.add(locala);
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(26057);
    com.tencent.mm.sdk.b.a.xxA.d(this.sKo);
    com.tencent.mm.sdk.b.a.xxA.d(this.sKp);
    com.tencent.mm.plugin.translate.a.c localc = this.sKl;
    Object localObject = this.sKn;
    if ((localObject == null) || (!localc.eES.contains(localObject)));
    while (true)
    {
      localc = this.sKl;
      if (localc.sKw == null)
        break;
      for (f localf : localc.sKw)
        if (localf != null)
        {
          aw.Rg().b(631, localf);
          if (localf.sKG != null)
          {
            localf.sKI.stopTimer();
            aw.Rg().c(localf.sKG);
          }
          localf.cHJ();
          localf.sKE = null;
        }
      localc.eES.remove(localObject);
    }
    localc.sKy.clear();
    localc.sKx.clear();
    localc.eES.clear();
    localc.exv = 0;
    AppMethodBeat.o(26057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.translate.a
 * JD-Core Version:    0.6.2
 */