package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends a
{
  public c(l paraml)
  {
    super(paraml);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74618);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new c.a();
      paramView = a(View.inflate((Context)localObject, 2130969507, null), paramViewGroup, paramg);
      paramViewGroup.iqT = ((ImageView)paramView.findViewById(2131821479));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131820619));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131820603));
    }
    while (true)
    {
      a(paramViewGroup, paramg);
      aar localaar = b.c(paramg);
      localObject = paramg.field_favProto.title;
      paramg = (com.tencent.mm.plugin.fav.a.g)localObject;
      if (bo.isNullOrNil((String)localObject))
        paramg = localaar.title;
      paramViewGroup.gnB.setText(paramg);
      paramViewGroup.gnC.setText(b.aC((float)localaar.wgu));
      if (localaar.whh == 2)
        paramViewGroup.gnC.setText(">25MB");
      paramViewGroup.iqT.setImageResource(com.tencent.mm.plugin.fav.ui.c.LX(localaar.wgo));
      AppMethodBeat.o(74618);
      return paramView;
      paramViewGroup = (c.a)paramView.getTag();
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74619);
    com.tencent.mm.plugin.fav.a.g localg = ((c.a)paramView.getTag()).mgf;
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, localg, paramabh);
    AppMethodBeat.o(74619);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.c
 * JD-Core Version:    0.6.2
 */