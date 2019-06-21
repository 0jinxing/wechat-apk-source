package com.tencent.mm.ui;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.c;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AllRemindMsgUI$1 extends RecyclerView.c
{
  AllRemindMsgUI$1(AllRemindMsgUI paramAllRemindMsgUI)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(29112);
    super.onChanged();
    ab.i("MicroMsg.emoji.AllRemindMsgUI", "[onChanged] size:%s", new Object[] { Integer.valueOf(AllRemindMsgUI.a(this.yex).getItemCount()) });
    if (AllRemindMsgUI.a(this.yex).getItemCount() == 0)
    {
      AllRemindMsgUI.b(this.yex).setVisibility(0);
      AllRemindMsgUI.c(this.yex).setVisibility(8);
      AppMethodBeat.o(29112);
    }
    while (true)
    {
      return;
      AllRemindMsgUI.b(this.yex).setVisibility(8);
      AllRemindMsgUI.c(this.yex).setVisibility(0);
      AppMethodBeat.o(29112);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AllRemindMsgUI.1
 * JD-Core Version:    0.6.2
 */