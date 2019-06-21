package com.tencent.mm.chatroom.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMLoadMoreListView.a;

final class SelectedMemberChattingRecordUI$2
  implements MMLoadMoreListView.a
{
  SelectedMemberChattingRecordUI$2(SelectedMemberChattingRecordUI paramSelectedMemberChattingRecordUI)
  {
  }

  public final void KB()
  {
    AppMethodBeat.i(104437);
    SelectedMemberChattingRecordUI.a locala;
    if (SelectedMemberChattingRecordUI.a(this.emY) != null)
    {
      locala = SelectedMemberChattingRecordUI.a(this.emY);
      locala.ena -= 16;
      if ((bo.isNullOrNil(SelectedMemberChattingRecordUI.c(locala.emY))) || (!r.mG(SelectedMemberChattingRecordUI.c(locala.emY))))
        break label111;
      locala.setCursor(((j)g.K(j.class)).bOr().cB(locala.emo, locala.enb - locala.ena));
    }
    while (true)
    {
      SelectedMemberChattingRecordUI.a(this.emY).notifyDataSetChanged();
      AppMethodBeat.o(104437);
      return;
      label111: if (!r.mG(SelectedMemberChattingRecordUI.c(locala.emY)))
        locala.setCursor(((j)g.K(j.class)).bOr().G(locala.emo, locala.emZ, locala.enb - locala.ena));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI.2
 * JD-Core Version:    0.6.2
 */