package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.ui.m;

public final class e$a extends com.tencent.mm.plugin.fts.a.d.a.a.b
{
  public e$a(e parame)
  {
    super(parame);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(61978);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969614, paramViewGroup, false);
    paramViewGroup = (e.b)this.mKj.mKi;
    paramViewGroup.kxr = ((TextView)paramContext.findViewById(2131822768));
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramViewGroup.mKk = paramContext.findViewById(2131820896);
    paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(61978);
    return paramContext;
  }

  public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61979);
    paramContext = (e.b)parama;
    m.b(this.mKj.mKQ, paramContext.kxr);
    paramContext.contentView.setBackgroundResource(2130839171);
    com.tencent.mm.pluginsdk.ui.a.b.b(paramContext.ejo, this.mKj.talker);
    if (this.mKj.position == 0)
    {
      paramContext.mKk.setVisibility(8);
      AppMethodBeat.o(61979);
    }
    while (true)
    {
      return;
      paramContext.mKk.setVisibility(0);
      AppMethodBeat.o(61979);
    }
  }

  public final boolean a(Context paramContext, a parama)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.e.a
 * JD-Core Version:    0.6.2
 */