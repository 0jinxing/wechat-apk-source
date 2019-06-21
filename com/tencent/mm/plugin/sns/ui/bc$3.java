package com.tencent.mm.plugin.sns.ui;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.b;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.cth;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class bc$3
  implements View.OnClickListener
{
  bc$3(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39864);
    ab.i("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener");
    if (!(paramView.getTag() instanceof q))
      AppMethodBeat.o(39864);
    while (true)
    {
      return;
      paramView = (q)paramView.getTag();
      Object localObject = paramView.rin;
      paramView = af.cnF().YT(paramView.cwT);
      if (this.rDG.rhQ != null)
        this.rDG.rhQ.cnj().x(paramView);
      if (((TimeLineObject)localObject).xfO == null)
      {
        ab.e("MicroMsg.TimeLineClickEvent", "appbrandRedirectListener weappInfo is null");
        AppMethodBeat.o(39864);
      }
      else
      {
        String str1 = ((TimeLineObject)localObject).xfO.username;
        String str2 = ((TimeLineObject)localObject).xfO.path;
        ab.i("MicroMsg.TimeLineClickEvent", "username: " + str1 + "pagepath: " + str2);
        se localse = new se();
        localse.cOf.userName = str1;
        localse.cOf.cOh = str2;
        localse.cOf.scene = 1009;
        localse.cOf.cst = (((TimeLineObject)localObject).Id + ":" + ((TimeLineObject)localObject).jBB);
        localObject = new Bundle();
        ((Bundle)localObject).putString("stat_send_msg_user", paramView.field_userName);
        ((Bundle)localObject).putString("stat_msg_id", "sns_" + i.jV(paramView.field_snsId));
        a.xxA.m(localse);
        AppMethodBeat.o(39864);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.3
 * JD-Core Version:    0.6.2
 */