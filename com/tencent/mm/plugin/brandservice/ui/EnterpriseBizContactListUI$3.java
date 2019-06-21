package com.tencent.mm.plugin.brandservice.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.List;

final class EnterpriseBizContactListUI$3 extends ak
{
  EnterpriseBizContactListUI$3(EnterpriseBizContactListUI paramEnterpriseBizContactListUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(13946);
    if ((paramMessage != null) && (paramMessage.what == 1) && (this.jLR != null) && (!this.jLR.isFinishing()))
    {
      z.afd().qB(this.jLR.jLN);
      z.aeR();
      paramMessage = e.qS(this.jLR.jLN);
      for (int i = 0; i < paramMessage.size(); i++)
      {
        String str = (String)paramMessage.get(i);
        if ((t.mY(str)) && ((f.rd(str)) || (f.kq(str))))
          z.afd().qB(str);
      }
    }
    AppMethodBeat.o(13946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI.3
 * JD-Core Version:    0.6.2
 */