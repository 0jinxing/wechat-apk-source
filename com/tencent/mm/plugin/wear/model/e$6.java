package com.tencent.mm.plugin.wear.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.a;
import com.tencent.mm.plugin.wear.model.f.l;
import com.tencent.mm.protocal.protobuf.cpm;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

final class e$6 extends c<ui>
{
  e$6(e parame)
  {
    AppMethodBeat.i(26306);
    this.xxI = ui.class.getName().hashCode();
    AppMethodBeat.o(26306);
  }

  private static boolean a(ui paramui)
  {
    AppMethodBeat.i(26307);
    switch (paramui.cQx.cAd)
    {
    default:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(26307);
      return false;
      Object localObject = paramui.cQx.cQr;
      if ((localObject == null) || (localObject.length < 10) || (localObject[0] != 1))
        continue;
      paramui = new byte[localObject.length - 1];
      System.arraycopy(localObject, 1, paramui, 0, paramui.length);
      try
      {
        localObject = new com/tencent/mm/protocal/protobuf/cpm;
        ((cpm)localObject).<init>();
        paramui = (cpm)((cpm)localObject).parseFrom(paramui);
        if (paramui == null)
          continue;
        localObject = paramui.xmT;
        ab.i("MicroMsg.Wear.WearLogic", "voip invite talker=%s | type=%s", new Object[] { localObject, Integer.valueOf(paramui.xmL) });
        a.cUn().tXz.a(new l(20010, (String)localObject));
      }
      catch (IOException paramui)
      {
        while (true)
          paramui = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.6
 * JD-Core Version:    0.6.2
 */