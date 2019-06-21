package com.tencent.mm.ui.contact.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.bd;

public final class b extends f
{
  public String bCu;
  public int resId = 0;
  private boolean zpE;

  public b(int paramInt)
  {
    super(paramInt);
  }

  public final void a(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(105269);
    if ((this.resId != 0) && (this.bCu != null))
    {
      this.zpV = this.resId;
      this.zpU = this.bCu;
      AppMethodBeat.o(105269);
    }
    while (true)
    {
      return;
      parama = this.ehM;
      if (!this.zpE)
      {
        g.RQ();
        parama = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.username);
        this.ehM = parama;
        this.zpE = true;
      }
      if (parama == null)
      {
        this.gnx = "";
        AppMethodBeat.o(105269);
      }
      else
      {
        this.gnx = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, ((com.tencent.mm.plugin.messenger.a.b)g.K(com.tencent.mm.plugin.messenger.a.b.class)).c(parama), com.tencent.mm.bz.a.al(paramContext, 2131427813));
        this.username = parama.field_username;
        AppMethodBeat.o(105269);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.b
 * JD-Core Version:    0.6.2
 */