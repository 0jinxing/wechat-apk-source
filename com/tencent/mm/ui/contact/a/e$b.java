package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.storage.ad;

public class e$b extends a.b
{
  public e$b(e parame)
  {
    super(parame);
  }

  public View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(105279);
    if (com.tencent.mm.bz.a.ga(paramContext));
    for (paramContext = LayoutInflater.from(paramContext).inflate(2130970606, paramViewGroup, false); ; paramContext = LayoutInflater.from(paramContext).inflate(2130970605, paramViewGroup, false))
    {
      paramViewGroup = (e.a)this.zpT.clJ();
      paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
      paramViewGroup.gnB = ((TextView)paramContext.findViewById(2131821185));
      paramViewGroup.gnC = ((TextView)paramContext.findViewById(2131820991));
      paramViewGroup.contentView = paramContext.findViewById(2131826213);
      paramViewGroup.gnD = ((CheckBox)paramContext.findViewById(2131821593));
      paramViewGroup.zpS = ((CheckBox)paramContext.findViewById(2131827336));
      paramViewGroup.zjV = ((TextView)paramContext.findViewById(2131821087));
      paramContext.setTag(paramViewGroup);
      AppMethodBeat.o(105279);
      return paramContext;
    }
  }

  public void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105280);
    parama = (e.a)parama;
    parama1 = (e)parama1;
    if ((parama1.username != null) && (parama1.username.length() > 0))
    {
      com.tencent.mm.pluginsdk.ui.a.b.a(parama.ejo, parama1.username, 0.1F, false);
      m.a(parama1.gnx, parama.gnB);
      m.a(parama1.gny, parama.gnC);
      if (!this.zpT.zmW)
        break label253;
      parama.gnD.setBackgroundResource(2130839523);
      if (!paramBoolean1)
        break label233;
      parama.gnD.setChecked(true);
      parama.gnD.setEnabled(false);
      label110: parama.gnD.setVisibility(0);
      label118: if (!this.zpT.jLx)
        break label383;
      parama.contentView.setBackgroundResource(2130838398);
      label137: if (parama1.ehM.field_deleteFlag == 1)
      {
        parama.gnC.setVisibility(0);
        parama.gnC.setText(paramContext.getString(2131302868));
      }
      if ((this.zpT.zpP) || (parama.zjV == null))
        break label404;
      if (!ad.aox(parama1.username))
        break label395;
      parama.zjV.setText(parama1.zpO);
      parama.zjV.setVisibility(0);
      AppMethodBeat.o(105280);
    }
    while (true)
    {
      return;
      parama.ejo.setImageResource(2130838444);
      break;
      label233: parama.gnD.setChecked(paramBoolean2);
      parama.gnD.setEnabled(true);
      break label110;
      label253: if (this.zpT.zpB)
      {
        parama.gnD.setBackgroundResource(2130840056);
        if (paramBoolean1)
        {
          parama.gnD.setChecked(true);
          parama.gnD.setEnabled(false);
        }
        while (true)
        {
          parama.gnD.setVisibility(0);
          break;
          parama.gnD.setChecked(paramBoolean2);
          parama.gnD.setEnabled(true);
        }
      }
      if (this.zpT.zmX)
      {
        parama.gnD.setVisibility(8);
        parama.zpS.setChecked(paramBoolean2);
        parama.zpS.setEnabled(true);
        parama.zpS.setVisibility(0);
        break label118;
      }
      parama.gnD.setVisibility(8);
      break label118;
      label383: parama.contentView.setBackgroundResource(2130838396);
      break label137;
      label395: parama.zjV.setVisibility(8);
      label404: AppMethodBeat.o(105280);
    }
  }

  public final boolean aov()
  {
    AppMethodBeat.i(105281);
    if (this.zpT.hpS != null)
      ((n)g.M(n.class)).updateTopHitsRank(this.zpT.query, this.zpT.hpS, 1);
    AppMethodBeat.o(105281);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.e.b
 * JD-Core Version:    0.6.2
 */