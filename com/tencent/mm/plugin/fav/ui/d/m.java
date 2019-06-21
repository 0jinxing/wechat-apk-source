package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;

public final class m extends a
{
  public m(l paraml)
  {
    super(paraml);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74651);
    Context localContext = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate(localContext, 2130969515, null), paramViewGroup, paramg);
      paramViewGroup.ene = ((TextView)paramView.findViewById(2131823926));
      a(paramViewGroup, paramg);
      if ((paramg.field_favProto.desc != null) && (paramg.field_favProto.desc.length() > 0))
        break label107;
      paramViewGroup.ene.setText("");
      AppMethodBeat.o(74651);
    }
    while (true)
    {
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label107: paramViewGroup.ene.setText(j.b(paramViewGroup.ene.getContext(), paramg.field_favProto.desc, paramViewGroup.ene.getTextSize()));
      AppMethodBeat.o(74651);
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74652);
    a locala = (a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74652);
  }

  public static final class a extends a.b
  {
    TextView ene;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.m
 * JD-Core Version:    0.6.2
 */