package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.ui.b.c;

public final class l extends a
{
  CharSequence mKU;
  private a.b mKV;
  a.a mKW;

  public l(int paramInt)
  {
    super(18, paramInt);
    AppMethodBeat.i(62011);
    this.mKV = new l.b(this);
    this.mKW = new l.a(this);
    AppMethodBeat.o(62011);
  }

  public final a.b Ps()
  {
    return this.mKV;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62012);
    parama = TextUtils.ellipsize(this.mDz.mDY, b.c.mHz, 400.0F, TextUtils.TruncateAt.MIDDLE).toString();
    this.mKU = f.a(paramContext.getString(2131302819), paramContext.getString(2131302818), d.b(parama, parama)).mDR;
    AppMethodBeat.o(62012);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.l
 * JD-Core Version:    0.6.2
 */