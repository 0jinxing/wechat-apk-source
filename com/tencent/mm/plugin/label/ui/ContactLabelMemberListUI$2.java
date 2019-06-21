package com.tencent.mm.plugin.label.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class ContactLabelMemberListUI$2
  implements n.b
{
  ContactLabelMemberListUI$2(ContactLabelMemberListUI paramContactLabelMemberListUI)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(22640);
    ab.d("MicroMsg.Label.ContactLabelMemberListUI", "event:%d, obj:%s", new Object[] { Integer.valueOf(paramInt), paramObject });
    if (ContactLabelMemberListUI.b(this.nIz) != null)
    {
      ContactLabelMemberListUI.b(this.nIz).removeMessages(5001);
      ContactLabelMemberListUI.b(this.nIz).sendEmptyMessageDelayed(5001, 300L);
    }
    AppMethodBeat.o(22640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelMemberListUI.2
 * JD-Core Version:    0.6.2
 */