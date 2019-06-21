package com.tencent.mm.plugin.mall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vw;
import com.tencent.mm.g.a.vw.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class MallIndexUI$10 extends c<vw>
{
  MallIndexUI$10(MallIndexUI paramMallIndexUI)
  {
    AppMethodBeat.i(43214);
    this.xxI = vw.class.getName().hashCode();
    AppMethodBeat.o(43214);
  }

  private static boolean a(vw paramvw)
  {
    AppMethodBeat.i(43215);
    paramvw = paramvw.cTd.cBp;
    ab.i("MicorMsg.MallIndexUI", "get result %s", new Object[] { paramvw });
    if ("agree_privacy".equals(paramvw))
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xVC, Boolean.TRUE);
    }
    AppMethodBeat.o(43215);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI.10
 * JD-Core Version:    0.6.2
 */