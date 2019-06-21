package com.tencent.mm.plugin.profile.ui;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.o;
import java.util.ArrayList;
import java.util.List;

public final class a extends o
  implements com.tencent.mm.plugin.fts.a.l
{
  ad ehM;
  ak handler;
  private List<com.tencent.mm.plugin.fts.a.a.l> mFf;

  public a(com.tencent.mm.ui.contact.l paraml, int paramInt, ad paramad)
  {
    super(paraml, new ArrayList(), true, false, paramInt);
    AppMethodBeat.i(23330);
    this.handler = new ak(Looper.getMainLooper());
    this.ehM = paramad;
    AppMethodBeat.o(23330);
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(23333);
    if (paramj.bFZ == 0)
      this.mFf = paramj.mEy;
    notifyDataSetChanged();
    AppMethodBeat.o(23333);
  }

  public final int getCount()
  {
    AppMethodBeat.i(23332);
    int i;
    if (this.mFf == null)
    {
      i = 0;
      AppMethodBeat.o(23332);
    }
    while (true)
    {
      return i;
      i = this.mFf.size();
      AppMethodBeat.o(23332);
    }
  }

  public final com.tencent.mm.ui.contact.a.a mP(int paramInt)
  {
    AppMethodBeat.i(23331);
    d locald = new d(paramInt, this.ehM);
    aw.ZK();
    locald.ehM = c.XM().aoO(((com.tencent.mm.plugin.fts.a.a.l)this.mFf.get(paramInt)).mDx);
    AppMethodBeat.o(23331);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.a
 * JD-Core Version:    0.6.2
 */