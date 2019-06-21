package com.tencent.mm.plugin.radar.ui;

import a.l;
import a.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.radar.b.c;
import com.tencent.mm.plugin.radar.b.c.a;
import com.tencent.mm.plugin.radar.b.c.d;
import com.tencent.mm.plugin.radar.b.c.e;
import com.tencent.mm.plugin.radar.b.c.m;
import com.tencent.mm.plugin.radar.b.e;
import com.tencent.mm.plugin.radar.b.e.c;
import com.tencent.mm.protocal.protobuf.bpb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.d;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarViewController$initView$1", "Lcom/tencent/mm/plugin/radar/ui/RadarMemberView$OnConfirmBtnClickListener;", "onClick", "", "member", "Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "state", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "onDismissed", "plugin-radar_release"})
public final class RadarViewController$e
  implements RadarMemberView.b
{
  public final void a(bpb parambpb, c.e parame)
  {
    AppMethodBeat.i(103095);
    a.f.b.j.p(parambpb, "member");
    Object localObject1 = g.pDK;
    String str = g.b(parambpb);
    if (parame == null)
      AppMethodBeat.o(103095);
    while (true)
    {
      return;
      switch (h.eQZ[parame.ordinal()])
      {
      default:
        AppMethodBeat.o(103095);
        break;
      case 1:
        l = RadarViewController.e(this.pEg).Vw(str);
        RadarViewController.c(this.pEg).pBy.put(Long.valueOf(l), new e.c(parambpb, parame));
        RadarViewController.a(this.pEg, str, c.e.pAX);
        AppMethodBeat.o(103095);
      case 2:
      }
    }
    Object localObject2 = RadarViewController.e(this.pEg);
    a.f.b.j.p(str, "username");
    localObject1 = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject1, "service(IMessengerStorage::class.java)");
    Object localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject1).XM().aoO(str);
    a.f.b.j.o(localObject3, "contact");
    localObject1 = (CharSequence)((ad)localObject3).getUsername();
    if ((localObject1 == null) || (a.k.m.ar((CharSequence)localObject1)))
    {
      i = 1;
      label208: if (i == 0)
        break label337;
      localObject1 = str;
      label216: localObject3 = (String)((c)localObject2).pAN.get(localObject1);
      localObject4 = (CharSequence)localObject3;
      if ((localObject4 != null) && (!a.k.m.ar((CharSequence)localObject4)))
        break label352;
    }
    label337: label352: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label358;
      ab.e(c.TAG, "Verify Contact username(%s) error, verifyTicket is null", new Object[] { localObject1 });
      ((c)localObject2).Vw((String)localObject1);
      l = -1L;
      RadarViewController.c(this.pEg).pBy.put(Long.valueOf(l), new e.c(parambpb, parame));
      RadarViewController.a(this.pEg, str, c.e.pAX);
      break;
      i = 0;
      break label208;
      localObject1 = ((ad)localObject3).getUsername();
      a.f.b.j.o(localObject1, "contact.username");
      break label216;
    }
    label358: Object localObject4 = bi.d.apF((String)localObject3);
    long l = System.currentTimeMillis();
    localObject2 = new c.a((c)localObject2, (c.d)new c.m((c)localObject2, (String)localObject3, l));
    localObject3 = ((bi.d)localObject4).duc();
    a.f.b.j.o(localObject3, "verify.verifyTicket");
    a.f.b.j.p(localObject3, "verifyTicket");
    if ((localObject1 != null) && (((String)localObject1).length() > 0));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue("username is null", bool);
      ((c.a)localObject2).onStart();
      com.tencent.mm.kernel.g.Rg().d((com.tencent.mm.ai.m)new com.tencent.mm.pluginsdk.model.m((String)localObject1, (String)localObject3, 48, (byte)0));
      break;
    }
  }

  public final void b(bpb parambpb, c.e parame)
  {
    AppMethodBeat.i(103096);
    if (parambpb != null)
      g localg = g.pDK;
    for (parambpb = g.b(parambpb); ; parambpb = null)
    {
      parambpb = (View)((Map)RadarViewController.d(this.pEg).pEn).get(parambpb);
      if (parambpb == null)
        break label96;
      parambpb = parambpb.getTag();
      if (parambpb != null)
        break;
      parambpb = new v("null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarViewController.RadarSearchAdapter.ViewHolder");
      AppMethodBeat.o(103096);
      throw parambpb;
    }
    parambpb = (RadarViewController.c.a)parambpb;
    if (parame != c.e.pAW)
      parambpb.pEr.cdL();
    label96: RadarViewController.f(this.pEg).cdU();
    AppMethodBeat.o(103096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarViewController.e
 * JD-Core Version:    0.6.2
 */