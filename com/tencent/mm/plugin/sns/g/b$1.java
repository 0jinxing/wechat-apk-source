package com.tencent.mm.plugin.sns.g;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.model.u;
import com.tencent.mm.plugin.sns.storage.a;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.i;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class b$1
  implements View.OnClickListener
{
  b$1(b paramb, int paramInt, com.tencent.mm.plugin.sns.data.b paramb1, View paramView1, View paramView2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(36757);
    b localb = this.qPe;
    int i = this.qPb;
    paramView = this.qPc;
    Object localObject = this.qPd;
    AbsoluteLayout localAbsoluteLayout = this.qPe.qON;
    ab.d("MicroMsg.AdNotLikeAbTestHelper", "processFristButtonClick " + i + " " + paramView.cND);
    b.b localb1 = (b.b)localb.qOW.get(Long.valueOf(paramView.cND));
    if (localb1 != null)
      if (i != 4)
        break label431;
    label423: label431: for (int j = 3; ; j = i)
    {
      localb1.YA("1:" + j + ":" + localb.mContext.getString(localb.qOR[(i - 1)]));
      if (i == 1)
      {
        localObject = af.cnF().YT(paramView.cwT);
        if (localObject == null)
          break label423;
        if (((n)localObject).DI(32))
        {
          paramView = ((n)localObject).cqq();
          if (paramView == null)
          {
            paramView = "";
            ((c)g.K(c.class)).a(11855, ((n)localObject).cre(), new Object[] { Integer.valueOf(3), paramView, Integer.valueOf(((n)localObject).cre()) });
          }
        }
        else
        {
          af.cnI().delete(((n)localObject).field_snsId);
          af.cnK().ky(((n)localObject).field_snsId);
          i.kx(((n)localObject).field_snsId);
          paramView = new r(((n)localObject).field_snsId, 8);
          g.RQ();
          g.RO().eJo.a(paramView, 0);
          localb.a(localb1);
          localb.cox();
          AppMethodBeat.o(36757);
        }
      }
      while (true)
      {
        return;
        paramView = paramView.hnw;
        break;
        if (i == 2)
        {
          localb.a((View)localObject, localAbsoluteLayout, paramView);
          AppMethodBeat.o(36757);
        }
        else if (i == 3)
        {
          if (!u.ki(paramView.cND))
            u.kg(paramView.cND);
          localb.a(localb1);
          localb.cox();
          AppMethodBeat.o(36757);
        }
        else
        {
          if (i == 4)
          {
            if (u.ki(paramView.cND))
              u.kh(paramView.cND);
            localb.a(localb1);
            localb.cox();
          }
          AppMethodBeat.o(36757);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.b.1
 * JD-Core Version:    0.6.2
 */