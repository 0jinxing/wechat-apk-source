package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.ui.b.c;
import com.tencent.mm.sdk.platformtools.bo;

public final class i extends a
{
  public String mEp;
  public boolean mKF;
  public CharSequence mKG;
  private i.b mKH;
  private i.a mKI;

  public i(int paramInt)
  {
    super(19, paramInt);
    AppMethodBeat.i(61998);
    this.mKH = new i.b(this);
    this.mKI = new i.a(this);
    this.mFk = false;
    AppMethodBeat.o(61998);
  }

  public final a.b Ps()
  {
    return this.mKH;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61999);
    parama = TextUtils.ellipsize(this.mDz.mEb[0], b.c.mHz, 200.0F, TextUtils.TruncateAt.MIDDLE);
    paramArrayOfObject = TextUtils.ellipsize(this.mDz.mEb[1], b.c.mHz, 400.0F, TextUtils.TruncateAt.MIDDLE);
    if (bo.isNullOrNil(this.mEp))
    {
      this.mKG = TextUtils.concat(new CharSequence[] { paramContext.getString(2131302860), f.j(parama, parama.length()), paramContext.getString(2131302861), f.j(paramArrayOfObject, paramArrayOfObject.length()), paramContext.getString(2131302862) });
      AppMethodBeat.o(61999);
    }
    while (true)
    {
      return;
      this.mKG = TextUtils.concat(new CharSequence[] { paramContext.getString(2131302863), f.j(parama, parama.length()), paramContext.getString(2131302861), f.j(paramArrayOfObject, paramArrayOfObject.length()), paramContext.getString(2131302862) });
      AppMethodBeat.o(61999);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.i
 * JD-Core Version:    0.6.2
 */