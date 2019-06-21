package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bo;

public final class g$a extends m.b
{
  public g$a(g paramg)
  {
    super(paramg);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(61986);
    View localView = LayoutInflater.from(paramContext).inflate(2130969635, paramViewGroup, false);
    paramViewGroup = (m.a)this.mKA.mLb;
    paramViewGroup.ejo = ((ImageView)localView.findViewById(2131821183));
    paramViewGroup.ejp = ((TextView)localView.findViewById(2131823149));
    paramViewGroup.ene = ((TextView)localView.findViewById(2131822913));
    paramViewGroup.contentView = localView.findViewById(2131821182);
    paramViewGroup.enf = ((TextView)localView.findViewById(2131820988));
    paramViewGroup.ejo.getLayoutParams().width = com.tencent.mm.bz.a.al(paramContext, 2131427848);
    paramViewGroup.ejo.getLayoutParams().height = com.tencent.mm.bz.a.al(paramContext, 2131427848);
    localView.setTag(paramViewGroup);
    AppMethodBeat.o(61986);
    return localView;
  }

  public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.a.d.a.a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61987);
    paramContext = (g)parama1;
    parama = (m.a)parama;
    com.tencent.mm.plugin.fts.ui.m.p(parama.contentView, this.mKA.mFk);
    if (bo.isNullOrNil(paramContext.hpS.talker))
      a.b.b(parama.ejo, paramContext.hpS.mDx);
    while (true)
    {
      com.tencent.mm.plugin.fts.ui.m.a(paramContext.mKz, parama.ejp);
      com.tencent.mm.plugin.fts.ui.m.a(paramContext.gny, parama.ene);
      com.tencent.mm.plugin.fts.ui.m.a(paramContext.mKZ, parama.enf);
      AppMethodBeat.o(61987);
      return;
      a.b.b(parama.ejo, paramContext.hpS.talker);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.g.a
 * JD-Core Version:    0.6.2
 */