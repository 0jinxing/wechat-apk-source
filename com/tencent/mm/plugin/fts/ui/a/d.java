package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.b.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;

public final class d extends m
{
  public u mIy;
  public CharSequence mKe;
  private d.a mKf;

  public d(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(61976);
    this.mKf = new d.a(this);
    AppMethodBeat.o(61976);
  }

  public final a.b Ps()
  {
    return this.mKf;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61977);
    super.a(paramContext, parama, paramArrayOfObject);
    ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.hpS.talker);
    if (localad == null)
      parama = com.tencent.mm.plugin.fts.a.d.LC(this.hpS.mDx);
    while (true)
    {
      if (!bo.isNullOrNil(parama))
        this.mKe = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, parama, b.c.mHy);
      AppMethodBeat.o(61977);
      return;
      if (bo.isNullOrNil(localad.field_conRemark))
      {
        if (this.mIy != null)
        {
          paramArrayOfObject = this.mIy.mJ(this.hpS.talker);
          parama = paramArrayOfObject;
          if (bo.isNullOrNil(paramArrayOfObject))
            parama = localad.field_nickname;
        }
        else
        {
          parama = localad.field_nickname;
        }
      }
      else
        parama = localad.field_conRemark;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.d
 * JD-Core Version:    0.6.2
 */