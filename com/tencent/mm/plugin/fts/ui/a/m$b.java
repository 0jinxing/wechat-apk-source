package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public class m$b extends com.tencent.mm.plugin.fts.a.d.a.a.b
{
  public m$b(m paramm)
  {
    super(paramm);
  }

  public View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62013);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969635, paramViewGroup, false);
    paramViewGroup = (m.a)this.mLc.mLb;
    paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
    paramViewGroup.ejp = ((TextView)paramContext.findViewById(2131823149));
    paramViewGroup.ene = ((TextView)paramContext.findViewById(2131822913));
    paramViewGroup.enf = ((TextView)paramContext.findViewById(2131820988));
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(62013);
    return paramContext;
  }

  public void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62014);
    parama1 = (m)parama1;
    parama = (m.a)parama;
    com.tencent.mm.plugin.fts.ui.m.p(parama.contentView, this.mLc.mFk);
    com.tencent.mm.pluginsdk.ui.a.b.b(parama.ejo, parama1.username);
    com.tencent.mm.plugin.fts.ui.m.a(parama1.gny, parama.ene);
    com.tencent.mm.plugin.fts.ui.m.a(parama1.mKZ, parama.enf);
    if (t.mP(parama1.username))
    {
      com.tencent.mm.plugin.fts.ui.m.a(((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).a(paramContext, parama1.gnx), parama.ejp);
      AppMethodBeat.o(62014);
    }
    while (true)
    {
      return;
      if (ad.aox(parama1.username))
      {
        g.RQ();
        paramContext = ((j)g.K(j.class)).XM().aoO(parama1.username);
        ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).a(parama.ejp.getContext(), parama.ejp, parama1.gnx, paramContext.field_openImAppid, paramContext.field_descWordingId, (int)parama.ejp.getTextSize());
        AppMethodBeat.o(62014);
      }
      else
      {
        com.tencent.mm.plugin.fts.ui.m.a(parama1.gnx, parama.ejp);
        AppMethodBeat.o(62014);
      }
    }
  }

  public boolean a(Context paramContext, a parama)
  {
    AppMethodBeat.i(62015);
    boolean bool = ((n)g.M(n.class)).getItemClickHandler(this.mLc.klY).a(paramContext, parama);
    AppMethodBeat.o(62015);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.m.b
 * JD-Core Version:    0.6.2
 */