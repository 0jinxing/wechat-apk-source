package com.tencent.mm.plugin.label.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.plugin.label.e;
import com.tencent.mm.plugin.label.ui.widget.MMLabelPanel;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

final class ContactLabelUI$12
  implements Runnable
{
  ContactLabelUI$12(ContactLabelUI paramContactLabelUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22676);
    ContactLabelUI.g(this.nIU).clear();
    ContactLabelUI.h(this.nIU).clear();
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3;
    if (ContactLabelUI.b(this.nIU) != null)
    {
      if (ContactLabelUI.d(this.nIU))
      {
        localObject1 = null;
        aw.ZK();
        localObject2 = c.XN().RB(ContactLabelUI.i(this.nIU));
        if (localObject2 != null)
          localObject1 = ((bv)localObject2).field_contactLabels;
        localObject3 = localObject1;
        if (bo.isNullOrNil((String)localObject1))
        {
          aw.ZK();
          ad localad = c.XM().aoO(ContactLabelUI.i(this.nIU));
          localObject3 = localad.field_encryptUsername;
          localObject2 = localObject1;
          if (!bo.isNullOrNil((String)localObject3))
          {
            aw.ZK();
            localObject3 = c.XN().RB((String)localObject3);
            localObject2 = localObject1;
            if (localObject3 != null)
              localObject2 = ((bv)localObject3).field_contactLabels;
          }
          localObject3 = localObject2;
          if (bo.isNullOrNil((String)localObject2))
          {
            localObject1 = localad.field_username;
            aw.ZK();
            localObject1 = c.XN().RB((String)localObject1);
            localObject3 = localObject2;
            if (localObject1 != null)
              localObject3 = ((bv)localObject1).field_contactLabels;
          }
        }
        localObject1 = (ArrayList)a.bJa().PF((String)localObject3);
        ContactLabelUI.b(this.nIU).a((Collection)localObject1, (List)localObject1);
        ContactLabelUI.a(this.nIU, (ArrayList)localObject1);
      }
    }
    else if (ContactLabelUI.c(this.nIU) != null)
    {
      ContactLabelUI.b(this.nIU, e.bIZ().dsm());
      if ((ContactLabelUI.j(this.nIU) == null) || (ContactLabelUI.j(this.nIU).size() <= 0))
        break label415;
      ContactLabelUI.d(this.nIU);
      ContactLabelUI.c(this.nIU).a((Collection)localObject1, ContactLabelUI.j(this.nIU));
      if (ContactLabelUI.k(this.nIU))
      {
        h.pYm.e(11346, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
        ContactLabelUI.l(this.nIU);
      }
    }
    while (true)
    {
      ContactLabelUI.a(this.nIU, ContactLabelUI.a.nIW);
      AppMethodBeat.o(22676);
      return;
      aw.ZK();
      localObject3 = c.XM().aoO(ContactLabelUI.i(this.nIU));
      localObject1 = localObject2;
      if (localObject3 == null)
        break;
      localObject3 = ((ap)localObject3).field_contactLabelIds;
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject3))
        break;
      localObject1 = (ArrayList)a.bJa().PG((String)localObject3);
      break;
      label415: if (ContactLabelUI.k(this.nIU))
      {
        h.pYm.e(11346, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
        ContactLabelUI.l(this.nIU);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelUI.12
 * JD-Core Version:    0.6.2
 */