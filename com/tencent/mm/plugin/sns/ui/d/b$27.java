package com.tencent.mm.plugin.sns.ui.d;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.storage.a.b;
import com.tencent.mm.plugin.sns.storage.a.b.a;
import com.tencent.mm.plugin.sns.storage.b.a;
import com.tencent.mm.plugin.sns.storage.b.b;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.bb;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class b$27
  implements AdapterView.OnItemClickListener
{
  b$27(b paramb)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(40283);
    ab.i("MicroMsg.TimelineClickListener", "unlike click");
    if (!(paramAdapterView.getAdapter() instanceof com.tencent.mm.plugin.sns.ui.c))
    {
      ab.w("MicroMsg.TimelineClickListener", "unknown unlike adapter click");
      AppMethodBeat.o(40283);
    }
    while (true)
    {
      return;
      Object localObject1 = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
      com.tencent.mm.plugin.sns.storage.n localn = af.cnF().YT(((com.tencent.mm.plugin.sns.data.b)localObject1).cwT);
      if (localn == null)
      {
        AppMethodBeat.o(40283);
        continue;
      }
      Object localObject2;
      if (paramInt == 0)
      {
        if (localn.DI(32))
        {
          localObject2 = b.a(this.rKt, localn);
          if (localObject2 == null)
          {
            localObject2 = "";
            label104: ((com.tencent.mm.plugin.sns.b.c)g.K(com.tencent.mm.plugin.sns.b.c.class)).a(11855, localn.cre(), new Object[] { Integer.valueOf(3), localObject2, Integer.valueOf(localn.cre()) });
          }
        }
        else
        {
          if (((com.tencent.mm.plugin.sns.data.b)localObject1).qFH.rDn.qTP.coJ().size() <= 0)
            break label299;
        }
        label299: for (paramInt = 1; ; paramInt = 0)
        {
          if (paramInt == 0)
            break label304;
          paramView = (com.tencent.mm.plugin.sns.ui.c)paramAdapterView.getAdapter();
          paramView.hzv += 1;
          paramView.notifyDataSetChanged();
          paramAdapterView.setOnItemClickListener(this.rKt.rKk);
          this.rKt.crF();
          paramAdapterView = new a.b.a();
          paramAdapterView.qUc = a.b.a.qTY;
          paramAdapterView.qFI = ((com.tencent.mm.plugin.sns.data.b)localObject1).qFI;
          paramAdapterView.qUd = 0L;
          paramAdapterView = new r(localn.field_snsId, 8, paramAdapterView);
          g.RQ();
          g.RO().eJo.a(paramAdapterView, 0);
          AppMethodBeat.o(40283);
          break;
          localObject2 = ((com.tencent.mm.plugin.sns.storage.a)localObject2).hnw;
          break label104;
        }
        label304: if (((com.tencent.mm.plugin.sns.data.b)localObject1).qFH.rDn.qTT)
        {
          AppMethodBeat.o(40283);
          continue;
        }
        this.rKt.dL(paramView);
        paramAdapterView = new a.b.a();
        paramAdapterView.qFI = ((com.tencent.mm.plugin.sns.data.b)localObject1).qFI;
        paramAdapterView.qUd = System.currentTimeMillis();
        paramAdapterView = new r(localn.field_snsId, 8, paramAdapterView);
        g.RQ();
        g.RO().eJo.a(paramAdapterView, 0);
        AppMethodBeat.o(40283);
        continue;
      }
      if (((com.tencent.mm.plugin.sns.data.b)localObject1).qFH.rDm.qUZ == null)
      {
        ab.e("MicroMsg.TimelineClickListener", "click feedback item but no report url");
        AppMethodBeat.o(40283);
        continue;
      }
      paramAdapterView = ((com.tencent.mm.plugin.sns.data.b)localObject1).qFH.rDm.qUZ;
      paramInt--;
      if (paramInt < paramAdapterView.list.size())
        paramAdapterView = ((b.b)paramAdapterView.list.get(paramInt)).url;
      try
      {
        paramView = String.format("snsid=%s", new Object[] { localn.cqu().Id });
        localObject2 = String.format("aid=%s", new Object[] { localn.cqZ() });
        localObject1 = String.format("traceid=%s", new Object[] { localn.cra() });
        g.RN();
        paramView = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.m(paramAdapterView, new String[] { paramView, localObject2, localObject1, String.format("uin=%s", new Object[] { com.tencent.mm.kernel.a.QG() }) });
        paramAdapterView = paramView;
        label581: paramView = new Intent();
        paramView.putExtra("rawUrl", paramAdapterView);
        paramView.putExtra("useJs", true);
        paramView.putExtra("KPublisherId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId));
        paramView.putExtra("pre_username", localn.field_userName);
        paramView.putExtra("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(localn.field_snsId));
        paramView.putExtra("preUsername", localn.field_userName);
        com.tencent.mm.plugin.sns.c.a.gkE.i(paramView, this.rKt.activity);
        AppMethodBeat.o(40283);
      }
      catch (Exception paramView)
      {
        break label581;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.27
 * JD-Core Version:    0.6.2
 */