package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.sdk.platformtools.bo;

public final class d$b extends a.b
{
  public d$b(d paramd)
  {
    super(paramd);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(129970);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130968681, paramViewGroup, false);
    paramContext = (d.a)this.hpY.hpV;
    paramContext.ejo = ((ImageView)paramViewGroup.findViewById(2131821183));
    paramContext.gnB = ((TextView)paramViewGroup.findViewById(2131821185));
    paramContext.contentView = paramViewGroup.findViewById(2131821182);
    paramContext.hpW = ((TextView)paramViewGroup.findViewById(2131821186));
    paramContext.hpX = ((TextView)paramViewGroup.findViewById(2131821153));
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(129970);
    return paramViewGroup;
  }

  public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.a.d.a.a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(129971);
    paramContext = (d)parama1;
    parama1 = (d.a)parama;
    if (paramContext.hpT == null)
    {
      parama1.contentView.setVisibility(8);
      AppMethodBeat.o(129971);
      return;
    }
    parama1.contentView.setVisibility(0);
    parama1.gnB.setText(this.hpY.eoj);
    parama = com.tencent.mm.plugin.appbrand.appcache.b.no(this.hpY.hpT.gVs);
    if (bo.isNullOrNil(parama))
      parama1.hpX.setVisibility(8);
    while (true)
    {
      com.tencent.mm.modelappbrand.a.b.abR().a(parama1.ejo, paramContext.hpT.hac, com.tencent.mm.modelappbrand.a.a.abQ(), f.fqH);
      AppMethodBeat.o(129971);
      break;
      parama1.hpX.setText(parama);
      parama1.hpX.setVisibility(0);
    }
  }

  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(129972);
    parama = (d)parama;
    paramContext = new se();
    paramContext.cOf.userName = parama.hpT.csl;
    paramContext.cOf.cOi = parama.hpT.gVs;
    paramContext.cOf.cOl = true;
    paramContext.cOf.scene = 1027;
    com.tencent.mm.sdk.b.a.xxA.m(paramContext);
    AppMethodBeat.o(129972);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.d.b
 * JD-Core Version:    0.6.2
 */