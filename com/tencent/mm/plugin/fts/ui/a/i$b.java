package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.sdk.platformtools.bo;

public final class i$b extends a.b
{
  public i$b(i parami)
  {
    super(parami);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(61995);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969617, paramViewGroup, false);
    paramViewGroup = new i.a(this.mKJ);
    paramViewGroup.mJS = ((TextView)paramContext.findViewById(2131821051));
    paramViewGroup.iqT = ((ImageView)paramContext.findViewById(2131821226));
    paramViewGroup.mKk = paramContext.findViewById(2131820896);
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(61995);
    return paramContext;
  }

  public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61996);
    paramContext = (i.a)parama;
    parama = (i)parama1;
    m.p(paramContext.contentView, this.mKJ.mFk);
    paramContext.mJS.setText(parama.mKG);
    paramContext.iqT.setImageResource(2131231340);
    if ((this.mKJ.position != 0) && (this.mKJ.mKF))
    {
      paramContext.mKk.setVisibility(0);
      AppMethodBeat.o(61996);
    }
    while (true)
    {
      return;
      paramContext.mKk.setVisibility(8);
      AppMethodBeat.o(61996);
    }
  }

  public final boolean a(Context paramContext, a parama)
  {
    AppMethodBeat.i(61997);
    parama = new Intent();
    parama.putExtra("key_talker_query", this.mKJ.mDz.mEb[0]);
    parama.putExtra("key_query", this.mKJ.mDz.mEb[1]);
    parama.putExtra("Search_Scene", this.mKJ.mFa);
    if (!bo.isNullOrNil(this.mKJ.mEp))
    {
      parama.putExtra("key_conv", this.mKJ.mEp);
      parama.putExtra("detail_type", 1);
      d.c(paramContext, ".ui.FTSConvTalkerMessageUI", parama);
    }
    while (true)
    {
      AppMethodBeat.o(61997);
      return true;
      d.c(paramContext, ".ui.FTSTalkerMessageUI", parama);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.i.b
 * JD-Core Version:    0.6.2
 */