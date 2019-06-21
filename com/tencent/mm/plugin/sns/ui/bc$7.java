package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

final class bc$7
  implements View.OnClickListener
{
  bc$7(bc parambc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39868);
    ab.i("MicroMsg.TimeLineClickEvent", "noteLinkRedirectListener");
    q localq;
    gh localgh;
    String str;
    if ((paramView.getTag() instanceof q))
    {
      localq = (q)paramView.getTag();
      if (localq.rin.xfI.wbJ == 26)
      {
        if (bo.isNullOrNil(localq.rin.xfI.wbM))
        {
          AppMethodBeat.o(39868);
          return;
        }
        localgh = new gh();
        localgh.cAH.type = 37;
        localgh.cAH.desc = localq.rin.xfI.wbM;
        str = "";
        paramView = str;
        if (localq.rin.xfI.wbK != null)
        {
          paramView = str;
          if (localq.rin.xfI.wbK.size() > 0)
          {
            str = an.fZ(af.getAccSnsPath(), ((bau)localq.rin.xfI.wbK.get(0)).Id);
            paramView = i.e((bau)localq.rin.xfI.wbK.get(0));
            if (!e.ct(str + paramView))
              break label283;
          }
        }
      }
    }
    label283: for (paramView = str + paramView; ; paramView = "")
    {
      localgh.cAH.path = paramView;
      localgh.cAH.title = localq.cwT;
      localgh.cAH.context = this.rDG.context;
      a.xxA.m(localgh);
      AppMethodBeat.o(39868);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.bc.7
 * JD-Core Version:    0.6.2
 */