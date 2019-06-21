package com.tencent.mm.plugin.label;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

final class b$1
  implements f
{
  b$1(b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22488);
    ab.e("MicroMsg.Label.ContactLabelManagerImpl", "onSceneEnd");
    switch (paramm.getType())
    {
    case 636:
    case 637:
    default:
      AppMethodBeat.o(22488);
    case 635:
      while (true)
      {
        return;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          b.i(this.nHs.username, this.nHs.nHp);
          AppMethodBeat.o(22488);
        }
        else
        {
          this.nHs.bIW();
          ab.e("MicroMsg.Label.ContactLabelManagerImpl", "add contact lable faild");
          AppMethodBeat.o(22488);
        }
      }
    case 638:
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((this.nHs.nHq == null) || (this.nHs.nHq.isEmpty()))
        break label285;
    label285: for (paramInt1 = this.nHs.nHq.size(); ; paramInt1 = 0)
    {
      if ((this.nHs.nHp != null) && (!this.nHs.nHp.isEmpty()));
      for (paramInt2 = this.nHs.nHp.size() - paramInt1; ; paramInt2 = 0)
      {
        if ((paramInt1 > 0) || (paramInt2 > 0))
        {
          ab.d("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveContact]addLabelNum:%d,updateLabelNum:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          h.pYm.e(11220, new Object[] { r.Yz(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(0) });
        }
        this.nHs.bIW();
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.b.1
 * JD-Core Version:    0.6.2
 */