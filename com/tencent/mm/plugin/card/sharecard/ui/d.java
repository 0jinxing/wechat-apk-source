package com.tencent.mm.plugin.card.sharecard.ui;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.report.service.h;
import java.util.ArrayList;

public final class d
  implements a
{
  private c kgY;

  public d(c paramc)
  {
    this.kgY = paramc;
  }

  public final void ZZ()
  {
    AppMethodBeat.i(88148);
    if (this.kgY != null)
      this.kgY.a(null, null);
    AppMethodBeat.o(88148);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(88146);
    if (this.kgY != null)
      am.baW().c(this.kgY);
    AppMethodBeat.o(88146);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(88147);
    if (this.kgY != null)
    {
      am.baW().d(this.kgY);
      Object localObject = this.kgY;
      ((c)localObject).kgW.release();
      ((c)localObject).kgW = null;
      ((c)localObject).bIf();
      int i = (int)(((c)localObject).endTime - ((c)localObject).beginTime);
      ArrayList localArrayList = new ArrayList();
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(281);
      localIDKey.SetKey(24);
      localIDKey.SetValue(1L);
      localObject = new IDKey();
      ((IDKey)localObject).SetID(281);
      ((IDKey)localObject).SetKey(25);
      ((IDKey)localObject).SetValue(i);
      localArrayList.add(localIDKey);
      localArrayList.add(localObject);
      h.pYm.b(localArrayList, true);
      this.kgY = null;
    }
    AppMethodBeat.o(88147);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.d
 * JD-Core Version:    0.6.2
 */