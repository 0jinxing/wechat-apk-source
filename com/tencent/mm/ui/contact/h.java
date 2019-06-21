package com.tencent.mm.ui.contact;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.e;
import java.util.ArrayList;
import java.util.List;

public final class h extends o
{
  private Cursor gnQ;
  private List<String> zmn;

  public h(MMBaseSelectContactUI paramMMBaseSelectContactUI, boolean paramBoolean, List<String> paramList)
  {
    super(paramMMBaseSelectContactUI, new ArrayList(), true, paramBoolean);
    AppMethodBeat.i(105204);
    this.zmn = paramList;
    g.RQ();
    this.gnQ = ((j)g.K(j.class)).XM().ew(this.zmn);
    AppMethodBeat.o(105204);
  }

  public final void finish()
  {
    AppMethodBeat.i(105207);
    super.finish();
    ab.i("MicroMsg.CustomContactAdapter", "finish!");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    AppMethodBeat.o(105207);
  }

  public final int getCount()
  {
    AppMethodBeat.i(105205);
    int i = this.gnQ.getCount();
    AppMethodBeat.o(105205);
    return i;
  }

  protected final a mP(int paramInt)
  {
    AppMethodBeat.i(105206);
    e locale = null;
    if ((paramInt >= 0) && (this.gnQ.moveToPosition(paramInt)))
    {
      locale = new e(paramInt);
      ad localad = new ad();
      localad.d(this.gnQ);
      locale.ehM = localad;
      locale.zmW = clI();
    }
    while (true)
    {
      AppMethodBeat.o(105206);
      return locale;
      ab.e("MicroMsg.CustomContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.h
 * JD-Core Version:    0.6.2
 */