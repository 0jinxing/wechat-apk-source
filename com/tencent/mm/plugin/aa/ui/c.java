package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.contact.a.a.a;
import com.tencent.mm.ui.contact.a.a.b;
import java.util.regex.Pattern;

public final class c extends com.tencent.mm.ui.contact.a.a
{
  private static final Pattern gnw;
  c.a gnA;
  public CharSequence gnx;
  public CharSequence gny;
  private c.b gnz;
  public String username;

  static
  {
    AppMethodBeat.i(40747);
    gnw = Pattern.compile(",");
    AppMethodBeat.o(40747);
  }

  public c(int paramInt)
  {
    super(2, paramInt);
    AppMethodBeat.i(40745);
    this.gnz = new c.b(this);
    this.gnA = new c.a(this);
    AppMethodBeat.o(40745);
  }

  public final void a(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(40746);
    if (this.ehM == null)
    {
      ab.i("MicroMsg.ContactDataItem", "filling dataItem Occur Error Contact is null, position=%d", new Object[] { Integer.valueOf(this.position) });
      AppMethodBeat.o(40746);
      return;
    }
    this.username = this.ehM.field_username;
    if (bo.isNullOrNil(this.cuP));
    for (parama = ((b)g.K(b.class)).c(this.ehM); ; parama = ((b)g.K(b.class)).getDisplayName(this.ehM.field_username, this.cuP))
    {
      Object localObject = parama;
      if (r.Yz().equals(this.username))
        localObject = parama + paramContext.getString(2131296365);
      this.gnx = j.b(paramContext, (CharSequence)localObject, com.tencent.mm.bz.a.al(paramContext, 2131427813));
      AppMethodBeat.o(40746);
      break;
    }
  }

  public final a.b aou()
  {
    return this.gnz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.c
 * JD-Core Version:    0.6.2
 */