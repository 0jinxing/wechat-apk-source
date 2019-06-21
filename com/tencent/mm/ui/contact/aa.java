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

public final class aa extends o
{
  private Cursor gnQ;
  private String zjx;

  public aa(MMBaseSelectContactUI paramMMBaseSelectContactUI, String paramString)
  {
    super(paramMMBaseSelectContactUI, new ArrayList(), false, false);
    AppMethodBeat.i(105265);
    this.zjx = paramString;
    g.RQ();
    this.gnQ = ((j)g.K(j.class)).XM().d(this.zjx, "", this.elZ);
    AppMethodBeat.o(105265);
  }

  public final void finish()
  {
    AppMethodBeat.i(105268);
    super.finish();
    ab.i("MicroMsg.SpecialContactAdapter", "finish!");
    if (this.gnQ != null)
    {
      this.gnQ.close();
      this.gnQ = null;
    }
    AppMethodBeat.o(105268);
  }

  public final int getCount()
  {
    AppMethodBeat.i(105266);
    int i = this.gnQ.getCount();
    AppMethodBeat.o(105266);
    return i;
  }

  protected final a mP(int paramInt)
  {
    AppMethodBeat.i(105267);
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
      AppMethodBeat.o(105267);
      return locale;
      ab.e("MicroMsg.SpecialContactAdapter", "create Data Item Error position=%d", new Object[] { Integer.valueOf(paramInt) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.aa
 * JD-Core Version:    0.6.2
 */