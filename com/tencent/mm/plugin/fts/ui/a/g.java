package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.b.c;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends m
{
  private g.a mKy;
  CharSequence mKz;

  public g(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(61988);
    this.mKy = new g.a(this);
    AppMethodBeat.o(61988);
  }

  public final a.b Ps()
  {
    return this.mKy;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61989);
    super.a(paramContext, parama, paramArrayOfObject);
    paramArrayOfObject = d.LC(this.hpS.talker);
    parama = paramArrayOfObject;
    if (bo.isNullOrNil(paramArrayOfObject))
      parama = d.LC(this.hpS.mDx);
    this.mKz = j.d(paramContext, parama, b.c.mHy);
    AppMethodBeat.o(61989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.g
 * JD-Core Version:    0.6.2
 */