package com.tencent.mm.ui.contact.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.f;

public final class i extends a
{
  private CharSequence mKU;
  private i.b zqf;
  a.a zqg;

  public i(int paramInt)
  {
    super(6, paramInt);
    AppMethodBeat.i(105298);
    this.zqf = new i.b(this);
    this.zqg = new i.a(this);
    AppMethodBeat.o(105298);
  }

  public final void a(Context paramContext, a.a parama)
  {
    AppMethodBeat.i(105299);
    this.mKU = f.a(paramContext.getString(2131302819), paramContext.getString(2131302818), d.b(this.query, this.query)).mDR;
    AppMethodBeat.o(105299);
  }

  public final a.b aou()
  {
    return this.zqf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.i
 * JD-Core Version:    0.6.2
 */