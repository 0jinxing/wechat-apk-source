package com.tencent.mm.plugin.appbrand.game.b;

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

public final class c$b extends a.b
{
  public c$b(c paramc)
  {
    super(paramc);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(130077);
    paramContext = LayoutInflater.from(paramContext).inflate(2130970085, paramViewGroup, false);
    paramViewGroup = (c.a)this.hrh.hrf;
    paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
    paramViewGroup.gnB = ((TextView)paramContext.findViewById(2131821185));
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramViewGroup.hpW = ((TextView)paramContext.findViewById(2131821186));
    paramViewGroup.hrg = ((TextView)paramContext.findViewById(2131820991));
    paramViewGroup.hpX = ((TextView)paramContext.findViewById(2131821153));
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(130077);
    return paramContext;
  }

  public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.a.d.a.a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(130078);
    paramContext = (c)parama1;
    parama = (c.a)parama;
    if (paramContext.hrd == null)
    {
      parama.contentView.setVisibility(8);
      AppMethodBeat.o(130078);
      return;
    }
    parama.contentView.setVisibility(0);
    parama.gnB.setText(this.hrh.eoj);
    parama.hpX.setVisibility(8);
    parama.hrg.setVisibility(8);
    parama.hpW.setVisibility(8);
    if (paramContext.hrc != null)
    {
      parama1 = com.tencent.mm.plugin.appbrand.appcache.b.no(paramContext.hrc.gVs);
      if (bo.isNullOrNil(parama1))
        parama.hpX.setVisibility(8);
    }
    while (true)
    {
      com.tencent.mm.modelappbrand.a.b.abR().a(parama.ejo, paramContext.hrd.field_IconUrl, com.tencent.mm.modelappbrand.a.a.abQ(), f.fqH);
      AppMethodBeat.o(130078);
      break;
      parama.hpX.setText(parama1);
      parama.hpX.setVisibility(0);
      continue;
      parama1 = paramContext.hrd.field_BriefIntro;
      if (bo.isNullOrNil(parama1))
      {
        parama.hrg.setVisibility(8);
      }
      else
      {
        parama.hrg.setText(parama1);
        parama.hrg.setVisibility(0);
      }
    }
  }

  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(130079);
    parama = (c)parama;
    paramContext = new se();
    paramContext.cOf.userName = parama.hrd.field_UserName;
    paramContext.cOf.cOi = 0;
    if (parama.hrc != null)
      paramContext.cOf.cOi = parama.hrc.gVs;
    paramContext.cOf.cOl = true;
    paramContext.cOf.scene = 1027;
    com.tencent.mm.sdk.b.a.xxA.m(paramContext);
    AppMethodBeat.o(130079);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.c.b
 * JD-Core Version:    0.6.2
 */