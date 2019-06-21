package com.tencent.mm.pluginsdk.ui.applet;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.n.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;

final class b$4
  implements com.tencent.mm.ai.f
{
  b$4(b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(27627);
    if (this.vjV.gqo != null)
      this.vjV.gqo.dismiss();
    if (this.vjV.vjT != null)
    {
      g.RQ();
      g.RO().eJo.b(106, this.vjV.vjT);
    }
    if (this.vjV.gqo == null)
    {
      ab.e("MicroMsg.AddContactDialog", "has cancel the loading dialog");
      this.vjV.kx(0);
      AppMethodBeat.o(27627);
    }
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.AddContactDialog", "searchContact onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        this.vjV.kx(-1);
        AppMethodBeat.o(27627);
      }
      else if (this.vjV.mContext == null)
      {
        ab.e("MicroMsg.AddContactDialog", "searchContact, context is null, msghandler has already been detached!");
        this.vjV.kx(-1);
        AppMethodBeat.o(27627);
      }
      else if (((this.vjV.mContext instanceof Activity)) && (((Activity)this.vjV.mContext).isFinishing()))
      {
        ab.e("MicroMsg.AddContactDialog", "searchContact, context isFinishing");
        this.vjV.kx(-1);
        AppMethodBeat.o(27627);
      }
      else
      {
        paramm = ((com.tencent.mm.plugin.messenger.a.f)paramm).bOj();
        paramString = aa.a(paramm.wcB);
        if (!bo.isNullOrNil(paramString))
          break;
        ab.e("MicroMsg.AddContactDialog", "searchContact, user is null");
        h.bQ(this.vjV.mContext, this.vjV.mContext.getResources().getString(2131305705));
        this.vjV.kx(-1);
        AppMethodBeat.o(27627);
      }
    }
    if ((this.vjV.igi == null) || (!this.vjV.igi.equals(paramString)))
      ab.w("MicroMsg.AddContactDialog", "user not the same, %s, %s", new Object[] { this.vjV.igi, paramString });
    b localb = this.vjV;
    g.RQ();
    localb.ldh = ((j)g.K(j.class)).XM().aoO(paramString);
    if ((this.vjV.ldh == null) || ((int)this.vjV.ldh.ewQ == 0))
    {
      ab.i("MicroMsg.AddContactDialog", "searchContact, no contact with username = " + paramString + ", try get by alias");
      localb = this.vjV;
      g.RQ();
      localb.ldh = ((j)g.K(j.class)).XM().aoK(paramString);
      if ((this.vjV.ldh == null) || ((int)this.vjV.ldh.ewQ == 0))
      {
        ab.i("MicroMsg.AddContactDialog", "searchContact, no contact with alias, new Contact");
        this.vjV.ldh = new ad(paramString);
        this.vjV.ldh.iy(paramm.guS);
        this.vjV.ldh.iB(aa.a(paramm.wyX));
        this.vjV.ldh.iC(aa.a(paramm.wce));
        this.vjV.ldh.iD(aa.a(paramm.wcf));
        this.vjV.ldh.hA(paramm.guN);
        this.vjV.ldh.iW(RegionCodeDecoder.aC(paramm.guW, paramm.guO, paramm.guP));
        this.vjV.ldh.iQ(paramm.guQ);
        this.vjV.ldh.hw(paramm.wBT);
        this.vjV.ldh.iV(paramm.wBU);
        this.vjV.ldh.hv(paramm.wBX);
        this.vjV.ldh.iE(paramm.wBW);
        this.vjV.ldh.iU(paramm.wBV);
      }
    }
    while (true)
    {
      this.vjV.U(this.vjV.ldh);
      AppMethodBeat.o(27627);
      break;
      ab.i("MicroMsg.AddContactDialog", "searchContact, contact in db, %s", new Object[] { paramString });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.b.4
 * JD-Core Version:    0.6.2
 */