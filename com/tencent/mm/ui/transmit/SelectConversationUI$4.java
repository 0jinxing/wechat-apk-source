package com.tencent.mm.ui.transmit;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.h;

final class SelectConversationUI$4
  implements q.a
{
  SelectConversationUI$4(SelectConversationUI paramSelectConversationUI, e parame)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(35127);
    this.zKj.aqX();
    e locale = this.zKk;
    locale.iHj = true;
    locale.iHl = paramBoolean;
    locale.text = paramString;
    locale.iHm = paramInt;
    if (locale.oC())
    {
      locale.aMl();
      AppMethodBeat.o(35127);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        locale.tipDialog = h.b(locale.context, locale.context.getString(2131302958), true, null);
        al.n(locale.hEw, 5000L);
      }
      AppMethodBeat.o(35127);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.4
 * JD-Core Version:    0.6.2
 */