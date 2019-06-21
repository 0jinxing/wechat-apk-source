package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.m;
import java.util.List;

public final class b extends m
{
  private ad ehM;
  private ak handler;
  private com.tencent.mm.plugin.fts.a.a.a mEx;
  private List<com.tencent.mm.plugin.fts.a.a.l> mFf;
  private com.tencent.mm.plugin.fts.a.l plf;
  private String query;

  public b(com.tencent.mm.ui.contact.l paraml, int paramInt, ad paramad)
  {
    super(paraml, false, paramInt);
    AppMethodBeat.i(23335);
    this.handler = new ak();
    this.plf = new b.1(this);
    this.ehM = paramad;
    AppMethodBeat.o(23335);
  }

  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    AppMethodBeat.i(23338);
    this.query = paramString;
    paramArrayOfInt = new i();
    paramArrayOfInt.query = paramString;
    paramArrayOfInt.handler = this.handler;
    paramArrayOfInt.mEw = this.plf;
    paramArrayOfInt.mEp = this.ehM.field_username;
    paramArrayOfInt.hbo = 7;
    this.mEx = ((n)g.M(n.class)).search(2, paramArrayOfInt);
    AppMethodBeat.o(23338);
  }

  public final void clearData()
  {
    AppMethodBeat.i(23339);
    this.query = null;
    if (this.mEx != null)
      ((n)g.M(n.class)).cancelSearchTask(this.mEx);
    AppMethodBeat.o(23339);
  }

  public final int getCount()
  {
    AppMethodBeat.i(23337);
    int i;
    if (this.mFf == null)
    {
      i = 0;
      AppMethodBeat.o(23337);
    }
    while (true)
    {
      return i;
      i = this.mFf.size();
      AppMethodBeat.o(23337);
    }
  }

  public final com.tencent.mm.ui.contact.a.a mP(int paramInt)
  {
    AppMethodBeat.i(23336);
    d locald = new d(paramInt, this.ehM);
    aw.ZK();
    locald.ehM = c.XM().aoO(((com.tencent.mm.plugin.fts.a.a.l)this.mFf.get(paramInt)).mDx);
    AppMethodBeat.o(23336);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.b
 * JD-Core Version:    0.6.2
 */