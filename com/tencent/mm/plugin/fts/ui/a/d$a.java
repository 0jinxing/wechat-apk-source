package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bo;

public final class d$a extends m.b
{
  public d$a(d paramd)
  {
    super(paramd);
  }

  public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61975);
    paramContext = (d)parama1;
    parama = (m.a)parama;
    m.p(parama.contentView, this.mKg.mFk);
    if (bo.isNullOrNil(paramContext.hpS.talker))
      a.b.b(parama.ejo, paramContext.hpS.mDx);
    while (true)
    {
      m.a(paramContext.mKe, parama.ejp);
      m.a(paramContext.gny, parama.ene);
      m.a(paramContext.mKZ, parama.enf);
      AppMethodBeat.o(61975);
      return;
      a.b.b(parama.ejo, paramContext.hpS.talker);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.d.a
 * JD-Core Version:    0.6.2
 */