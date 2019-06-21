package com.tencent.mm.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.foundation.a.a.m;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.ui.contact.e;

final class SingleChatInfoUI$5
  implements ContactListExpandPreference.a
{
  SingleChatInfoUI$5(SingleChatInfoUI paramSingleChatInfoUI)
  {
  }

  public final void JT()
  {
    AppMethodBeat.i(29871);
    if (SingleChatInfoUI.c(this.yqm) != null)
      SingleChatInfoUI.c(this.yqm).djD();
    AppMethodBeat.o(29871);
  }

  public final void iA(int paramInt)
  {
  }

  public final void iB(int paramInt)
  {
    AppMethodBeat.i(29870);
    String str = SingleChatInfoUI.c(this.yqm).KX(paramInt);
    Object localObject1 = ah.nullAsNil(SingleChatInfoUI.c(this.yqm).KZ(paramInt));
    Object localObject2 = localObject1;
    if (ah.isNullOrNil((String)localObject1))
    {
      aw.ZK();
      bv localbv = c.XN().RB(str);
      localObject2 = localObject1;
      if (localbv != null)
      {
        localObject2 = localObject1;
        if (!ah.isNullOrNil(localbv.field_encryptUsername))
          localObject2 = localbv.field_conRemark;
      }
    }
    if (ah.isNullOrNil(str))
      AppMethodBeat.o(29870);
    while (true)
    {
      return;
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("Contact_User", str);
      ((Intent)localObject1).putExtra("Contact_RemarkName", (String)localObject2);
      ((Intent)localObject1).putExtra("Contact_Nick", ah.nullAsNil(SingleChatInfoUI.c(this.yqm).KY(paramInt)));
      ((Intent)localObject1).putExtra("Contact_RoomMember", true);
      ((Intent)localObject1).putExtra("CONTACT_INFO_UI_SOURCE", 2);
      localObject2 = ((j)g.K(j.class)).XM().aoO(str);
      if ((localObject2 != null) && ((int)((a)localObject2).ewQ > 0) && (a.jh(((ap)localObject2).field_type)))
        e.a((Intent)localObject1, str);
      ((Intent)localObject1).putExtra("Kdel_from", 0);
      ((Intent)localObject1).putExtra("CONTACT_INFO_UI_SOURCE", 2);
      d.b(this.yqm, "profile", ".ui.ContactInfoUI", (Intent)localObject1, 0);
      AppMethodBeat.o(29870);
    }
  }

  public final void iC(int paramInt)
  {
    AppMethodBeat.i(29872);
    SingleChatInfoUI.d(this.yqm);
    AppMethodBeat.o(29872);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SingleChatInfoUI.5
 * JD-Core Version:    0.6.2
 */