package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.network.c;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.platformtools.z;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public final class g
{
  private String account = "";
  private String cOG;
  boolean gDc = false;
  private String gDl = "";
  private g.a gDm;
  private String username = "";

  public g(g.a parama, String paramString1, String paramString2, String paramString3)
  {
    this.username = paramString1;
    this.account = paramString3;
    this.gDl = paramString2;
    this.gDm = parama;
  }

  public final void a(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(125084);
    Object localObject = this.account;
    if (bo.isNullOrNil(this.account))
      localObject = this.username;
    localObject = new q((String)localObject, this.gDl, 0, "", "", "", 0, "", false, true);
    com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    g.a locala = this.gDm;
    paramMMActivity.getString(2131297061);
    locala.a(com.tencent.mm.ui.base.h.b(paramMMActivity, paramMMActivity.getString(2131301031), true, new g.1(this, (q)localObject)));
    AppMethodBeat.o(125084);
  }

  public final void a(MMActivity paramMMActivity, int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(125085);
    if ((paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      com.tencent.mm.kernel.g.Rg().a(new bk(new bk.a()
      {
        public final void a(com.tencent.mm.network.e paramAnonymouse)
        {
          AppMethodBeat.i(125082);
          if (paramAnonymouse == null)
            AppMethodBeat.o(125082);
          while (true)
          {
            return;
            paramAnonymouse = paramAnonymouse.adg();
            com.tencent.mm.kernel.g.RN();
            int i = com.tencent.mm.kernel.a.QF();
            paramAnonymouse.a(new byte[0], new byte[0], new byte[0], i);
            AppMethodBeat.o(125082);
          }
        }
      }), 0);
    for (int i = 1; ; i = 0)
    {
      if ((paramm instanceof q))
        this.cOG = ((q)paramm).ajm();
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        com.tencent.mm.kernel.a.unhold();
        w.cm(paramMMActivity);
        z.vx(this.account);
        z.showAddrBookUploadConfirm(paramMMActivity, new g.3(this, paramMMActivity), false, 2);
        if (this.gDc)
        {
          paramMMActivity = ah.getContext().getSharedPreferences("randomid_prefs", com.tencent.mm.compatible.util.h.Mu()).getString("randomID", "");
          com.tencent.mm.plugin.report.service.h.pYm.e(11930, new Object[] { paramMMActivity, Integer.valueOf(4) });
        }
        AppMethodBeat.o(125085);
      }
      while (true)
      {
        return;
        if (paramInt2 == -106)
        {
          z.f(paramMMActivity, paramString, 0);
          AppMethodBeat.o(125085);
        }
        else if (paramInt2 == -217)
        {
          z.a(paramMMActivity, com.tencent.mm.platformtools.e.a((q)paramm), paramInt2);
          AppMethodBeat.o(125085);
        }
        else
        {
          if (com.tencent.mm.plugin.account.a.a.gkF.a(paramMMActivity, paramInt1, paramInt2, paramString))
            i = 1;
          while (true)
          {
            if (i == 0)
              break label516;
            AppMethodBeat.o(125085);
            break;
            if (paramInt1 == 4);
            switch (paramInt2)
            {
            default:
              i = 0;
              break;
            case -1:
              if (com.tencent.mm.kernel.g.Rg().acS() == 5)
              {
                com.tencent.mm.ui.base.h.g(paramMMActivity, 2131301656, 2131301655);
                i = 1;
              }
              break;
            case -4:
            case -3:
              com.tencent.mm.ui.base.h.g(paramMMActivity, 2131299241, 2131301017);
              i = 1;
              break;
            case -9:
              com.tencent.mm.ui.base.h.g(paramMMActivity, 2131301016, 2131301017);
              i = 1;
              break;
            case -72:
              com.tencent.mm.ui.base.h.g(paramMMActivity, 2131302315, 2131297061);
              i = 1;
              break;
            case -75:
              com.tencent.mm.ui.base.h.g(paramMMActivity, 2131296515, 2131297061);
              i = 1;
              break;
            case -100:
              com.tencent.mm.kernel.a.hold();
              com.tencent.mm.kernel.g.RN();
              if (TextUtils.isEmpty(com.tencent.mm.kernel.a.QH()));
              for (paramString = com.tencent.mm.bz.a.an(paramMMActivity, 2131301294); ; paramString = com.tencent.mm.kernel.a.QH())
              {
                com.tencent.mm.ui.base.h.a(paramMMActivity, paramString, paramMMActivity.getString(2131297061), new g.4(this), new g.5(this));
                i = 1;
                break;
                com.tencent.mm.kernel.g.RN();
              }
            case -140:
              if (!bo.isNullOrNil(this.cOG))
                z.o(paramMMActivity, paramString, this.cOG);
              i = 1;
            }
          }
          label516: Toast.makeText(paramMMActivity, paramMMActivity.getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          AppMethodBeat.o(125085);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.g
 * JD-Core Version:    0.6.2
 */