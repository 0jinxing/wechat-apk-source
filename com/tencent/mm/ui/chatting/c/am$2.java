package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.c;

final class am$2
  implements ChatFooter.c
{
  am$2(am paramam)
  {
  }

  public final void a(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    AppMethodBeat.i(31740);
    if (paramBoolean1.booleanValue())
      if (paramBoolean2.booleanValue())
      {
        paramBoolean2 = this.ySz;
        paramBoolean1 = Boolean.TRUE;
        am.a(paramBoolean2, paramBoolean1, paramBoolean1);
        AppMethodBeat.o(31740);
      }
    while (true)
    {
      return;
      am.a(this.ySz, Boolean.FALSE, Boolean.TRUE);
      AppMethodBeat.o(31740);
    }
  }

  public final void b(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    AppMethodBeat.i(31741);
    if (paramBoolean1.booleanValue())
      if (paramBoolean2.booleanValue())
      {
        am.a(this.ySz, Boolean.TRUE, Boolean.FALSE);
        AppMethodBeat.o(31741);
      }
    while (true)
    {
      return;
      paramBoolean1 = this.ySz;
      paramBoolean2 = Boolean.FALSE;
      am.a(paramBoolean1, paramBoolean2, paramBoolean2);
      AppMethodBeat.o(31741);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.am.2
 * JD-Core Version:    0.6.2
 */