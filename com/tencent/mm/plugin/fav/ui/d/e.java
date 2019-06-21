package com.tencent.mm.plugin.fav.ui.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.k;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends a
{
  public e(l paraml)
  {
    super(paraml);
  }

  @SuppressLint({"ResourceType"})
  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74623);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new e.a();
      paramView = a(View.inflate((Context)localObject, 2130969507, null), paramViewGroup, paramg);
      paramViewGroup.iqT = ((ImageView)paramView.findViewById(2131821479));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131820619));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131820603));
      a(paramViewGroup, paramg);
      paramViewGroup.iqT.setImageResource(2131230798);
      localObject = paramg.field_favProto.why;
      paramg = paramg.field_favProto.hHV;
      if (!bo.isNullOrNil(paramg))
        break label193;
      if (!k.Md(((aay)localObject).cIK))
        break label169;
      paramViewGroup.gnB.setText(((aay)localObject).cIK);
      label139: paramViewGroup.gnC.setText(((aay)localObject).label);
    }
    while (true)
    {
      AppMethodBeat.o(74623);
      return paramView;
      paramViewGroup = (e.a)paramView.getTag();
      break;
      label169: paramViewGroup.gnB.setText(((aay)localObject).label);
      paramViewGroup.gnC.setVisibility(8);
      continue;
      label193: paramViewGroup.gnB.setText(j.b(paramViewGroup.gnB.getContext(), paramg, paramViewGroup.gnB.getTextSize()));
      if (!k.Md(((aay)localObject).cIK))
        break label139;
      paramViewGroup.gnC.setText(((aay)localObject).cIK);
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74624);
    e.a locala = (e.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74624);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.e
 * JD-Core Version:    0.6.2
 */