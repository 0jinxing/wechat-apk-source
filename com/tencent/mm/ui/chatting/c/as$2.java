package com.tencent.mm.ui.chatting.c;

import android.view.View;
import android.view.ViewStub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.d;
import com.tencent.mm.ui.chatting.d.a;

final class as$2
  implements ChatFooter.d
{
  as$2(as paramas)
  {
  }

  public final void i(Boolean paramBoolean)
  {
    AppMethodBeat.i(31867);
    if (paramBoolean.booleanValue())
    {
      if (as.a(this.yTi) == null)
        as.a(this.yTi, ((ViewStub)this.yTi.cgL.findViewById(2131822387)).inflate());
      as.a(this.yTi).setVisibility(0);
      AppMethodBeat.o(31867);
    }
    while (true)
    {
      return;
      if ((as.a(this.yTi) != null) && (as.a(this.yTi).getVisibility() == 0))
        as.a(this.yTi).setVisibility(8);
      AppMethodBeat.o(31867);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.as.2
 * JD-Core Version:    0.6.2
 */