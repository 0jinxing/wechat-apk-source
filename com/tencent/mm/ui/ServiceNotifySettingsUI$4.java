package com.tencent.mm.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.nx;
import com.tencent.mm.g.a.tz;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.protobuf.cfx;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.t;
import java.util.Iterator;
import java.util.LinkedList;

final class ServiceNotifySettingsUI$4
  implements f
{
  ServiceNotifySettingsUI$4(ServiceNotifySettingsUI paramServiceNotifySettingsUI, boolean paramBoolean1, boolean paramBoolean2, LinkedList paramLinkedList, int paramInt)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(29853);
    aw.Rg().b(1176, this);
    ab.i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(BatchSwitchServiceNotifyOption), errType : %s, errCode : %s, errMsg : %s.", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      t.makeText(this.ypY, 2131301854, 0).show();
      if (this.ypZ)
      {
        aw.ZK();
        c.Ry().set(ac.a.xON, Boolean.valueOf(this.yqa));
        a.xxA.m(new nx());
      }
      paramString = this.elN.iterator();
      while (paramString.hasNext())
      {
        cfx localcfx = (cfx)paramString.next();
        paramm = new tz();
        paramm.cQf.csl = localcfx.xeX;
        paramm.cQf.action = 1;
        paramm.cQf.cQh = this.yqb;
        a.xxA.m(paramm);
      }
      AppMethodBeat.o(29853);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(29853);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ServiceNotifySettingsUI.4
 * JD-Core Version:    0.6.2
 */