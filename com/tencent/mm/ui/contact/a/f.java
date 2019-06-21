package com.tencent.mm.ui.contact.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;

public class f extends a
{
  public CharSequence gnx;
  public String username;
  public CharSequence zpU;
  public int zpV;
  private f.b zpW;
  f.a zpX;

  public f(int paramInt)
  {
    super(4, paramInt);
    AppMethodBeat.i(105287);
    this.zpV = 0;
    this.zpW = new f.b(this);
    this.zpX = new f.a(this);
    AppMethodBeat.o(105287);
  }

  public void a(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(105288);
    if ((this.zpV != 0) && (this.zpU != null))
      AppMethodBeat.o(105288);
    while (true)
    {
      return;
      if (this.ehM == null)
      {
        this.gnx = "";
        this.username = "";
        AppMethodBeat.o(105288);
      }
      else
      {
        this.gnx = j.b(paramContext, ((b)g.K(b.class)).c(this.ehM), com.tencent.mm.bz.a.al(paramContext, 2131427813));
        this.username = this.ehM.field_username;
        AppMethodBeat.o(105288);
      }
    }
  }

  public a.b aou()
  {
    return this.zpW;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.f
 * JD-Core Version:    0.6.2
 */