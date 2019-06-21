package com.tencent.mm.plugin.fav.ui.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.a;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.ui.MMImageView;

public final class a$b extends com.tencent.mm.plugin.fts.a.d.a.a.b
{
  public a$b(a parama)
  {
    super(parama);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(74489);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130969621, paramViewGroup, false);
    paramContext = (a.a)this.mnB.mnx;
    paramContext.mny = ((MMImageView)paramViewGroup.findViewById(2131821183));
    paramContext.gnB = ((TextView)paramViewGroup.findViewById(2131821185));
    paramContext.mnz = ((TextView)paramViewGroup.findViewById(2131824201));
    paramContext.mnA = ((TextView)paramViewGroup.findViewById(2131824202));
    paramContext.contentView = paramViewGroup.findViewById(2131821182);
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(74489);
    return paramViewGroup;
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a.a parama, com.tencent.mm.plugin.fts.a.d.a.a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(74490);
    parama = (a.a)parama;
    parama1 = (a)parama1;
    m.p(parama.contentView, this.mnB.mFk);
    m.a(paramContext, parama.mny, parama1.gEl, parama1.mnu, parama1.mnv, false, parama.mny.getMeasuredWidth(), parama.mny.getMeasuredHeight());
    a.a(parama.gnB, parama.mnz, this.mnB.mnr, this.mnB.mns);
    m.a(this.mnB.mnt, parama.mnA);
    AppMethodBeat.o(74490);
  }

  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(74491);
    a locala = (a)parama;
    parama = new gh();
    parama.cAH.type = 10;
    parama.cAH.cvv = locala.hpS.mEB;
    parama.cAH.context = paramContext;
    parama.cAH.cAS = new abh();
    if (this.mnB.pageType == 1);
    for (parama.cAH.cAS.scene = 3; ; parama.cAH.cAS.scene = 4)
    {
      parama.cAH.cAS.jSW = 3;
      parama.cAH.cAS.index = this.mnB.mFn;
      com.tencent.mm.sdk.b.a.xxA.m(parama);
      AppMethodBeat.o(74491);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.b.a.b
 * JD-Core Version:    0.6.2
 */