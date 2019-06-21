package com.tencent.mm.plugin.card.model;

import a.k.d;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ik;
import com.tencent.mm.g.a.ik.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.plugin.card.model.a.f;
import com.tencent.mm.plugin.card.model.a.f.a;
import com.tencent.mm.plugin.card.ui.CardHomePageUI;
import com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ny;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;

final class am$4 extends c<ik>
{
  am$4(am paramam)
  {
    AppMethodBeat.i(87933);
    this.xxI = ik.class.getName().hashCode();
    AppMethodBeat.o(87933);
  }

  private static boolean a(ik paramik)
  {
    AppMethodBeat.i(87934);
    int i = ((Integer)g.RP().Ry().get(ac.a.xWl, Integer.valueOf(0))).intValue();
    int j = ((Integer)g.RP().Ry().get(ac.a.xWo, Integer.valueOf(1))).intValue();
    ab.i("MicroMsg.SubCoreCard", "goto card version: %s, trade area: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    Object localObject;
    if (j == 2)
    {
      localObject = (String)g.RP().Ry().get(ac.a.xWp, "");
      if (bo.isNullOrNil((String)localObject));
    }
    while (true)
    {
      try
      {
        paramik = new com/tencent/mm/protocal/protobuf/ny;
        paramik.<init>();
        paramik = (ny)paramik.parseFrom(((String)localObject).getBytes(d.ISO_8859_1));
        b.t(paramik.tzW, paramik.ttg, paramik.tIE);
        paramik = f.kfh;
        f.a.fF(false);
        AppMethodBeat.o(87934);
        return true;
      }
      catch (IOException paramik)
      {
        ab.printErrStackTrace("MicroMsg.SubCoreCard", paramik, "", new Object[0]);
        continue;
      }
      if (i == 1)
      {
        if (paramik.cDz.context != null)
        {
          localObject = new Intent(paramik.cDz.context, CardHomePageNewUI.class);
          paramik.cDz.context.startActivity((Intent)localObject);
          k.baK();
          if (paramik.cDz.cDB == 1)
            h.pYm.e(16322, new Object[] { Integer.valueOf(3) });
        }
      }
      else
      {
        if (paramik.cDz.context != null)
        {
          localObject = new Intent(paramik.cDz.context, CardHomePageUI.class);
          ((Intent)localObject).putExtra("key_from_scene", 22);
          ((Intent)localObject).putExtra("key_home_page_from_scene", paramik.cDz.scene);
          paramik.cDz.context.startActivity((Intent)localObject);
          k.baK();
          if (paramik.cDz.cDB == 1)
            h.pYm.e(16322, new Object[] { Integer.valueOf(2) });
        }
        paramik.cDA.targetActivity = "com.tencent.mm.plugin.card.ui.CardHomePageUI";
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.am.4
 * JD-Core Version:    0.6.2
 */