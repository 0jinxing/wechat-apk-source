package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.cth;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class bc$4
  implements View.OnClickListener
{
  bc$4(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39865);
    ab.i("MicroMsg.TimeLineClickEvent", "appbrandHomeRedirectListener");
    if (!(paramView.getTag() instanceof TimeLineObject))
      AppMethodBeat.o(39865);
    while (true)
    {
      return;
      paramView = (TimeLineObject)paramView.getTag();
      if (paramView.xfO == null)
      {
        ab.e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener username is null");
        AppMethodBeat.o(39865);
      }
      else
      {
        String str = paramView.xfO.username;
        se localse = new se();
        ab.i("MicroMsg.TimeLineClickEvent", "username: ".concat(String.valueOf(str)));
        localse.cOf.userName = str;
        localse.cOf.scene = 1009;
        localse.cOf.cst = (paramView.Id + ":" + paramView.jBB);
        a.xxA.m(localse);
        AppMethodBeat.o(39865);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.4
 * JD-Core Version:    0.6.2
 */