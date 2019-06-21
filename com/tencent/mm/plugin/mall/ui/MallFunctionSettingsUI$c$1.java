package com.tencent.mm.plugin.mall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.plugin.mall.a.a;
import com.tencent.mm.protocal.protobuf.biu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;
import java.util.LinkedList;

final class MallFunctionSettingsUI$c$1
  implements MMSwitchBtn.a
{
  MallFunctionSettingsUI$c$1(MallFunctionSettingsUI.c paramc, biu parambiu)
  {
  }

  public final void di(boolean paramBoolean)
  {
    AppMethodBeat.i(43158);
    ab.i("MicroMsg.MallFunctionSettingsUI", "click switch: %s, id: %s", new Object[] { Boolean.valueOf(paramBoolean), this.omr.wMe });
    if (paramBoolean);
    for (this.omr.jBT = 0; ; this.omr.jBT = 1)
    {
      Object localObject = new LinkedList();
      ((LinkedList)localObject).add(this.omr);
      MallFunctionSettingsUI localMallFunctionSettingsUI = this.oms.oml;
      ab.i("MicroMsg.MallFunctionSettingsUI", "do batch function operate");
      localObject = new a((LinkedList)localObject, localMallFunctionSettingsUI.cQG);
      ((a)localObject).acy().b(new MallFunctionSettingsUI.2(localMallFunctionSettingsUI, (a)localObject));
      AppMethodBeat.o(43158);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI.c.1
 * JD-Core Version:    0.6.2
 */