package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.as;
import com.tencent.mm.plugin.game.d.aw;
import com.tencent.mm.plugin.game.d.bc;
import com.tencent.mm.plugin.game.d.cs;
import com.tencent.mm.plugin.game.d.y;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class ad extends x
{
  public static void a(bc parambc)
  {
    AppMethodBeat.i(111377);
    if ((parambc == null) || (bo.ek(parambc.nbU)))
      AppMethodBeat.o(111377);
    while (true)
    {
      return;
      parambc = parambc.nbU.iterator();
      while (parambc.hasNext())
      {
        Object localObject = (com.tencent.mm.plugin.game.d.ad)parambc.next();
        if ((((com.tencent.mm.plugin.game.d.ad)localObject).naE != null) && (((com.tencent.mm.plugin.game.d.ad)localObject).naE.mZk != null))
        {
          d.a(a(((com.tencent.mm.plugin.game.d.ad)localObject).naE.mZk));
        }
        else if ((((com.tencent.mm.plugin.game.d.ad)localObject).naG != null) && (!bo.ek(((com.tencent.mm.plugin.game.d.ad)localObject).naG.mZK)))
        {
          localObject = ((com.tencent.mm.plugin.game.d.ad)localObject).naG.mZK.iterator();
          while (((Iterator)localObject).hasNext())
            d.a(a(((y)((Iterator)localObject).next()).mZk));
        }
        else if ((((com.tencent.mm.plugin.game.d.ad)localObject).naF != null) && (((com.tencent.mm.plugin.game.d.ad)localObject).naF.mZk != null))
        {
          d.a(a(((com.tencent.mm.plugin.game.d.ad)localObject).naF.mZk));
        }
      }
      AppMethodBeat.o(111377);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ad
 * JD-Core Version:    0.6.2
 */