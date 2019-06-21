package com.tencent.mm.ui.contact.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.u;

public final class d extends f
{
  public ad ehM;
  public CharSequence zpK;
  public boolean zpL;
  private d.a zpM;

  public d(int paramInt, ad paramad)
  {
    super(paramInt);
    AppMethodBeat.i(105277);
    this.zpM = new d.a(this);
    this.ehM = paramad;
    if (paramad.dtS == 1);
    while (true)
    {
      this.zpL = bool;
      AppMethodBeat.o(105277);
      return;
      bool = false;
    }
  }

  public final void a(Context paramContext, a.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(105278);
    super.a(paramContext, parama);
    if (this.ehM.dtS == 1);
    while (true)
    {
      this.zpL = bool;
      this.zpK = ((c)g.K(c.class)).XV().ob(this.ehM.field_username).mJ(this.ehM.field_username);
      AppMethodBeat.o(105278);
      return;
      bool = false;
    }
  }

  public final a.b aou()
  {
    return this.zpM;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.d
 * JD-Core Version:    0.6.2
 */