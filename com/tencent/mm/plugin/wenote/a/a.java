package com.tencent.mm.plugin.wenote.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.g.a.ld.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.wenote.model.d;
import com.tencent.mm.plugin.wenote.model.f;
import com.tencent.mm.plugin.wenote.model.g;
import com.tencent.mm.plugin.wenote.model.g.1;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c.1;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONException;

public final class a extends com.tencent.mm.sdk.b.c<ld>
{
  public a()
  {
    AppMethodBeat.i(26585);
    this.xxI = ld.class.getName().hashCode();
    AppMethodBeat.o(26585);
  }

  private static boolean a(ld paramld)
  {
    AppMethodBeat.i(26586);
    g localg;
    label295: Context localContext;
    abf localabf;
    boolean bool;
    Object localObject;
    long l;
    switch (paramld.cGU.type)
    {
    case 1:
    case 4:
    case 5:
    case 6:
    default:
    case 0:
    case 2:
      while (true)
      {
        AppMethodBeat.o(26586);
        return false;
        com.tencent.mm.plugin.wenote.model.c.ddG().uMN.b(paramld);
        continue;
        localg = new g();
        com.tencent.mm.plugin.wenote.model.c.ddG().uMN = localg;
        if (paramld.cGU.cHa == 4)
          break;
        com.tencent.mm.plugin.report.service.h.pYm.e(14789, new Object[] { Integer.valueOf(1) });
        ab.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_FAV");
        if (paramld.cGU.cHa == 5);
        for (int i = 1; ; i = 0)
        {
          if ((paramld.cGU.field_favProto != null) && (paramld.cGU.field_favProto.wit != null))
            localg.uNm = paramld.cGU.field_favProto.wit.cvp;
          if (paramld.cGU.cGZ != null)
            localg.uNn = paramld.cGU.cGZ.getLong("edittime", 0L);
          if (i == 0)
            break label295;
          localg.uNq = true;
          localg.a(paramld.cGU.field_localId, paramld.cGU.context, Boolean.valueOf(paramld.cGU.cHc), 0, 0, paramld.cGU.cHd, paramld.cGU.field_favProto);
          break;
        }
        localg.a(paramld.cGU.field_localId, paramld.cGU.context, Boolean.valueOf(paramld.cGU.cHc), 0, 0, paramld.cGU.cHd, null);
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(14789, new Object[] { Integer.valueOf(4) });
      ab.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_SNS");
      localContext = paramld.cGU.context;
      localabf = paramld.cGU.field_favProto;
      Bundle localBundle = paramld.cGU.cGZ;
      bool = paramld.cGU.cHc;
      localObject = "";
      paramld = "";
      if (localBundle != null)
      {
        localObject = localBundle.getString("noteauthor", "");
        paramld = localBundle.getString("noteeditor", "");
        l = localBundle.getLong("edittime", 0L);
        localg.uNg = localBundle.getString("snslocalid");
        localg.uNh = localBundle.getString("notexml", "");
        localg.uNo = localBundle.getString("snsthumbpath", "");
        localg.uNp = localBundle.getString("snsnotelinkxml", "");
      }
      break;
    case 9:
    case 3:
    case 7:
    case 8:
    case 10:
    case 11:
    case 12:
    }
    while (true)
    {
      while (true)
      {
        localg.cHh = System.currentTimeMillis();
        localg.cHc = bool;
        localg.uMY = false;
        localg.uNl = ((String)localObject + ";" + paramld + ";" + l);
        localg.ab(localContext, 4);
        aw.RS().aa(new g.1(localg, localabf));
        break;
        ab.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_ADD");
        localObject = new g();
        ((g)localObject).cHh = paramld.cGU.field_localId;
        com.tencent.mm.plugin.wenote.model.c.ddG().uMN = ((d)localObject);
        paramld = paramld.cGU.context;
        ((g)localObject).uMY = true;
        ((g)localObject).ab(paramld, 2);
        break;
        paramld.cGV.path = an.bvj();
        break;
        switch (paramld.cGU.itemType)
        {
        default:
          break;
        case 2:
          com.tencent.mm.plugin.wenote.model.h.ae(paramld.cGU.cHb);
          break;
        case 4:
          com.tencent.mm.plugin.wenote.model.h.q(paramld.cGU.context, paramld.cGU.path, paramld.cGU.cHa);
          break;
        case 5:
          com.tencent.mm.plugin.wenote.model.h.agY(paramld.cGU.path);
          break;
        case 3:
          try
          {
            com.tencent.mm.plugin.wenote.model.h.agZ(paramld.cGU.cGX);
          }
          catch (JSONException paramld)
          {
            ab.printErrStackTrace("MicroMsg.NotifyWNNoteOperationListener", paramld, "", new Object[0]);
          }
        }
      }
      break;
      com.tencent.mm.plugin.wenote.model.h.bq(paramld.cGU.context, paramld.cGU.path);
      break;
      f.y(paramld.cGU.field_localId, paramld.cGU.path);
      break;
      f.ad(paramld.cGU.cHb);
      break;
      paramld = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem();
      aw.RS().m(new c.1(paramld), 700L);
      break;
      l = 0L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.a.a
 * JD-Core Version:    0.6.2
 */