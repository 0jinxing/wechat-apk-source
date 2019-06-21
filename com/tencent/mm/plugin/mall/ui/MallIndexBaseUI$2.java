package com.tencent.mm.plugin.mall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class MallIndexBaseUI$2
  implements b.d
{
  MallIndexBaseUI$2(MallIndexBaseUI paramMallIndexBaseUI)
  {
  }

  public final void a(int paramInt, MallFunction paramMallFunction)
  {
    AppMethodBeat.i(43167);
    String str;
    int i;
    if (paramMallFunction != null)
    {
      str = paramMallFunction.pFP;
      if (bo.isNullOrNil(str))
        i = 1;
    }
    while (true)
    {
      if ((i == 0) && (!bo.isNullOrNil(paramMallFunction.tDo)))
      {
        ab.i("MicroMsg.MallIndexBaseUI", "onFunctionItemClick show disclaimer funcId=%s", new Object[] { paramMallFunction.pFP });
        com.tencent.mm.ui.base.h.a(this.omG.mController.ylL, paramMallFunction.tDo, this.omG.getString(2131301397), this.omG.getString(2131302434), new MallIndexBaseUI.2.1(this, paramMallFunction, paramInt));
        label103: ab.d("MicroMsg.MallIndexBaseUI", "type: %s", new Object[] { Integer.valueOf(paramMallFunction.type) });
        com.tencent.mm.plugin.report.service.h.pYm.e(14419, new Object[] { this.omG.eCq, Integer.valueOf(4), Integer.valueOf(paramMallFunction.type) });
        AppMethodBeat.o(43167);
      }
      while (true)
      {
        return;
        g.RQ();
        Object localObject = (String)g.RP().Ry().get(ac.a.xMB, null);
        if (bo.isNullOrNil((String)localObject))
        {
          i = 0;
          break;
        }
        localObject = ((String)localObject).split(",");
        if ((localObject == null) || (localObject.length == 0))
        {
          i = 0;
          break;
        }
        for (i = 0; ; i++)
        {
          if (i >= localObject.length)
            break label305;
          if (localObject[i].equals(str))
          {
            i = 1;
            break;
          }
        }
        this.omG.a(paramMallFunction, paramInt);
        break label103;
        ab.w("MicroMsg.MallIndexBaseUI", "onFunctionItemClick functionItem null; pos=%d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(43167);
      }
      label305: i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexBaseUI.2
 * JD-Core Version:    0.6.2
 */