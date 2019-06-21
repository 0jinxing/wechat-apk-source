package com.tencent.mm.plugin.fav.ui.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.abh;

public final class n extends a
{
  public n(l paraml)
  {
    super(paraml);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, g paramg)
  {
    AppMethodBeat.i(74653);
    paramView = new View(paramViewGroup.getContext());
    AppMethodBeat.o(74653);
    return paramView;
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74654);
    if (paramView != null)
      Toast.makeText(paramView.getContext(), 2131299758, 0).show();
    AppMethodBeat.o(74654);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.n
 * JD-Core Version:    0.6.2
 */