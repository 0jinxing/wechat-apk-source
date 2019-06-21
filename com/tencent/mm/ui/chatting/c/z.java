package com.tencent.mm.ui.chatting.c;

import android.content.Intent;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bn;
import com.tencent.mm.g.a.jj;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.chatting.c.b.af;
import com.tencent.mm.ui.chatting.c.b.u;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=u.class)
public class z extends a
  implements u
{
  public final boolean bb(bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(31572);
    if (parambi.bAC())
    {
      ak.aV(parambi);
      this.cgL.qp(true);
      AppMethodBeat.o(31572);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31572);
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31577);
    super.dDh();
    jj localjj = new jj();
    localjj.cEF.cEA = 2;
    com.tencent.mm.sdk.b.a.xxA.m(localjj);
    AppMethodBeat.o(31577);
  }

  public final void dEH()
  {
    AppMethodBeat.i(31573);
    int i;
    if ((ad.aox(this.cgL.getTalkerUserName())) || (t.mP(this.cgL.sRl.field_username)))
      if ((((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).vi(this.cgL.sRl.field_openImAppid) & 0x1000) == 0)
        i = 1;
    while (true)
    {
      int j;
      label150: String[] arrayOfString;
      if ((!this.cgL.sRl.dsf()) && (!t.nF(this.cgL.getTalkerUserName())) && (!ad.aou(this.cgL.getTalkerUserName())) && (!ad.aow(this.cgL.getTalkerUserName())) && (!ad.mR(this.cgL.getTalkerUserName())) && (!this.cgL.getTalkerUserName().equals(r.Yz())))
      {
        j = 1;
        if ((j != 0) && (i == 0))
          break label223;
        arrayOfString = new String[1];
        arrayOfString[0] = this.cgL.yTx.getMMResources().getString(2131300990);
      }
      while (true)
      {
        com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), null, arrayOfString, null, new z.1(this));
        AppMethodBeat.o(31573);
        return;
        i = 0;
        break;
        j = 0;
        break label150;
        label223: arrayOfString = new String[2];
        arrayOfString[0] = this.cgL.yTx.getMMResources().getString(2131300990);
        arrayOfString[1] = this.cgL.yTx.getMMResources().getString(2131300991);
      }
      i = 0;
    }
  }

  public final void dEI()
  {
    AppMethodBeat.i(31574);
    Intent localIntent = new Intent();
    com.tencent.mm.plugin.report.service.h.pYm.e(12809, new Object[] { Integer.valueOf(1), "" });
    localIntent.putExtra("map_view_type", 0);
    localIntent.putExtra("map_sender_name", this.cgL.dFu());
    localIntent.putExtra("map_talker_name", this.cgL.getTalkerUserName());
    com.tencent.mm.bp.d.b(this.cgL.yTx.getContext(), "location", ".ui.RedirectUI", localIntent);
    AppMethodBeat.o(31574);
  }

  public final void dEJ()
  {
    int i = 1;
    AppMethodBeat.i(31575);
    Object localObject1;
    Object localObject2;
    if ((!com.tencent.mm.r.a.bJ(this.cgL.yTx.getContext())) && (!com.tencent.mm.r.a.bH(this.cgL.yTx.getContext())))
    {
      if (((com.tencent.mm.plugin.multitalk.model.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.multitalk.model.a.class)).RV(this.cgL.getTalkerUserName()))
      {
        ab.i("MicroMsg.ChattingUI.LocationComponent", "click share location, but now is in multitalk!");
        com.tencent.mm.ui.base.h.g(this.cgL.yTx.getContext(), 2131301542, 2131297061);
        AppMethodBeat.o(31575);
        return;
      }
      localObject1 = null;
      sz localsz = new sz();
      localObject2 = localObject1;
      if (com.tencent.mm.bg.g.fUs != null)
      {
        localsz.cPf.cPh = true;
        com.tencent.mm.sdk.b.a.xxA.m(localsz);
        if (!bo.isNullOrNil(localsz.cPg.cPj))
          localObject2 = this.cgL.yTx.getMMResources().getString(2131299208);
      }
      else
      {
        label161: if (bo.isNullOrNil((String)localObject2))
          break label341;
        if ((com.tencent.mm.bh.d.fUu == null) || (!com.tencent.mm.bh.d.fUu.tQ(this.cgL.sRl.field_username)))
          break label371;
        localObject1 = com.tencent.mm.bh.d.fUu.tP(this.cgL.sRl.field_username);
        if ((localObject1 == null) || (!((List)localObject1).contains(this.cgL.dFu())))
          break label371;
      }
    }
    while (true)
    {
      if (i == 0)
      {
        localObject1 = new c.a(this.cgL.yTx.getContext());
        ((c.a)localObject1).asE((String)localObject2);
        ((c.a)localObject1).Qc(2131300601).a(new z.2(this));
        ((c.a)localObject1).aMb().show();
        AppMethodBeat.o(31575);
        break;
        localObject2 = localObject1;
        if (!com.tencent.mm.bg.g.fUs.tN(this.cgL.getTalkerUserName()))
          break label161;
        localObject2 = this.cgL.yTx.getMMResources().getString(2131299209);
        break label161;
      }
      label341: ((af)this.cgL.aF(af.class)).arr("fromPluginLocation");
      AppMethodBeat.o(31575);
      break;
      label371: i = 0;
    }
  }

  public final void dxC()
  {
    AppMethodBeat.i(31579);
    bn localbn = new bn();
    com.tencent.mm.sdk.b.a.xxA.m(localbn);
    AppMethodBeat.o(31579);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31578);
    jj localjj = new jj();
    localjj.cEF.cEA = 0;
    localjj.cEF.aOt = aa.dor();
    if (t.kH(this.cgL.sRl.field_username));
    for (localjj.cEF.cEH = true; ; localjj.cEF.cEH = false)
    {
      com.tencent.mm.sdk.b.a.xxA.m(localjj);
      AppMethodBeat.o(31578);
      return;
    }
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(31576);
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    switch (paramInt)
    {
    default:
    case 67:
    case 68:
    }
    while (true)
    {
      AppMethodBeat.o(31576);
      while (true)
      {
        return;
        if (paramArrayOfInt[0] != 0)
          break;
        if (paramInt == 67)
        {
          dEI();
          AppMethodBeat.o(31576);
        }
        else
        {
          dEJ();
          AppMethodBeat.o(31576);
        }
      }
      com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131301926), this.cgL.yTx.getMMResources().getString(2131301936), this.cgL.yTx.getMMResources().getString(2131300878), this.cgL.yTx.getMMResources().getString(2131297773), false, new z.3(this), null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.z
 * JD-Core Version:    0.6.2
 */