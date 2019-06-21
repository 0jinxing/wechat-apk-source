package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.wallet.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.widget.a.d;

abstract class NormalUserFooterPreference$a
  implements f
{
  boolean isDeleteCancel = false;
  private d pki = null;

  public NormalUserFooterPreference$a(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
  }

  protected final void F(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (paramBoolean2));
    while (true)
    {
      return;
      NormalUserFooterPreference.b(this.poR).addIconOptionMenu(0, 2130839555, new NormalUserFooterPreference.a.11(this, paramBoolean1, paramBoolean2));
    }
  }

  final void UU(String paramString)
  {
    if (bo.isNullOrNil(paramString))
      ab.w("MicroMsg.NormalUserFooterPreference", "mod stranger remark, username is null");
    while (true)
    {
      return;
      paramString = new Intent();
      paramString.putExtra("Contact_Scene", NormalUserFooterPreference.l(this.poR));
      paramString.putExtra("Contact_mode_name_type", 0);
      paramString.putExtra("Contact_ModStrangerRemark", true);
      paramString.putExtra("Contact_User", NormalUserFooterPreference.a(this.poR).field_username);
      paramString.putExtra("Contact_Nick", NormalUserFooterPreference.a(this.poR).field_nickname);
      paramString.putExtra("Contact_RemarkName", NormalUserFooterPreference.a(this.poR).field_conRemark);
      com.tencent.mm.plugin.profile.b.gkE.n(paramString, this.poR.mContext);
    }
  }

  protected void Xy()
  {
    cbn();
    cbp();
    NormalUserFooterPreference.f(this.poR).setOnClickListener(new NormalUserFooterPreference.a.12(this));
    NormalUserFooterPreference.g(this.poR).setOnClickListener(new NormalUserFooterPreference.a.13(this));
    NormalUserFooterPreference.h(this.poR).setOnClickListener(new NormalUserFooterPreference.a.14(this));
    NormalUserFooterPreference.i(this.poR).setOnClickListener(new NormalUserFooterPreference.a.15(this));
    NormalUserFooterPreference.j(this.poR).setOnClickListener(new NormalUserFooterPreference.a.16(this));
    NormalUserFooterPreference.k(this.poR).setOnClickListener(new NormalUserFooterPreference.a.17(this));
  }

  protected abstract void cbn();

  protected final void cbo()
  {
    NormalUserFooterPreference.b(this.poR).addIconOptionMenu(0, 2130839555, new NormalUserFooterPreference.a.1(this));
  }

  protected void cbp()
  {
    if (NormalUserFooterPreference.d(this.poR))
      NormalUserFooterPreference.b(this.poR).showOptionMenu(false);
    while (true)
    {
      return;
      if (!r.Yz().equals(NormalUserFooterPreference.a(this.poR).field_username))
        if (com.tencent.mm.n.a.jh(NormalUserFooterPreference.a(this.poR).field_type))
        {
          if (!t.nB(NormalUserFooterPreference.a(this.poR).field_username))
            cbo();
        }
        else
          F(false, false);
    }
  }

  final void cbq()
  {
    this.pki = new d(NormalUserFooterPreference.b(this.poR), 1, false);
    this.pki.rBl = new NormalUserFooterPreference.a.4(this);
    this.pki.rBm = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(23680);
        switch (paramAnonymousMenuItem.getItemId())
        {
        default:
        case 1:
        case 2:
        }
        while (true)
        {
          AppMethodBeat.o(23680);
          while (true)
          {
            return;
            NormalUserFooterPreference.a.this.poR.cbl();
            AppMethodBeat.o(23680);
          }
          NormalUserFooterPreference.a.this.poR.cbm();
        }
      }
    };
    this.pki.cpD();
  }

  protected final void cbr()
  {
    com.tencent.mm.plugin.report.service.h.pYm.e(14553, new Object[] { Integer.valueOf(2), Integer.valueOf(2), NormalUserFooterPreference.a(this.poR).field_username });
    String str = NormalUserFooterPreference.a(this.poR).field_username;
    if (t.mW(str))
    {
      NormalUserFooterPreference.a(this.poR).NC();
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.c(str));
      aw.ZK();
      com.tencent.mm.model.c.XM().aoU(str);
      aw.ZK();
      com.tencent.mm.model.c.XV().og(str);
      return;
    }
    this.isDeleteCancel = false;
    Object localObject = this.poR.mContext;
    this.poR.mContext.getString(2131297061);
    p localp = com.tencent.mm.ui.base.h.b((Context)localObject, this.poR.mContext.getString(2131297086), true, new NormalUserFooterPreference.a.6(this));
    if (!this.isDeleteCancel);
    for (localObject = e.akq(NormalUserFooterPreference.a(this.poR).field_username); ; localObject = null)
    {
      if (!bo.isNullOrNil((String)localObject))
      {
        localp.dismiss();
        com.tencent.mm.ui.base.h.a(this.poR.mContext, false, this.poR.mContext.getString(2131304775, new Object[] { localObject }), null, this.poR.mContext.getString(2131300420), this.poR.mContext.getString(2131298866), new NormalUserFooterPreference.a.7(this), new NormalUserFooterPreference.a.8(this, localp, str), -1, 2131689665);
        break;
      }
      zq(str);
      break;
    }
  }

  protected void onDetach()
  {
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    ab.i("MicroMsg.NormalUserFooterPreference", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " " + paramm.getType());
  }

  final void zq(String paramString)
  {
    NormalUserFooterPreference.a(this.poR).NC();
    if (ad.aox(paramString))
    {
      ((com.tencent.mm.openim.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.a.class)).ve(paramString);
      ao.a.flu.os(paramString);
      bf.a(paramString, new NormalUserFooterPreference.a.9(this));
      aw.ZK();
      com.tencent.mm.model.c.XM().b(paramString, NormalUserFooterPreference.a(this.poR));
      aw.ZK();
      com.tencent.mm.model.c.XR().aoX(paramString);
      com.tencent.mm.bi.c.e(0L, paramString);
      com.tencent.mm.bi.c.e(0L, NormalUserFooterPreference.a(this.poR).field_encryptUsername);
      switch (NormalUserFooterPreference.l(this.poR))
      {
      default:
        label180: if (NormalUserFooterPreference.l(this.poR) == 9)
          ab.i("MicroMsg.NormalUserFooterPreference", "add scene unkown, check the contact getsource: " + NormalUserFooterPreference.a(this.poR).getSource());
        switch (NormalUserFooterPreference.a(this.poR).getSource())
        {
        case 11:
        case 12:
        default:
          label264: if (NormalUserFooterPreference.o(this.poR) == 0)
          {
            paramString = new Intent();
            paramString.addFlags(67108864);
            com.tencent.mm.plugin.profile.b.gkE.p(paramString, this.poR.mContext);
          }
          break;
        case 10:
        case 13:
        }
        break;
      case 12:
      case 13:
      case 10:
      case 31:
      case 58:
      case 59:
      case 60:
      }
    }
    while (true)
    {
      return;
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.c(paramString));
      break;
      Object localObject = com.tencent.mm.plugin.account.a.getQQListStg().wj(paramString);
      if (localObject == null)
        break label180;
      ((ao)localObject).gwD = 1;
      com.tencent.mm.plugin.account.a.getQQListStg().a(((ao)localObject).gwC, (ao)localObject);
      break label180;
      localObject = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(paramString);
      if ((localObject != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.account.friend.a.a)localObject).guM)))
      {
        ((com.tencent.mm.plugin.account.friend.a.a)localObject).status = 1;
        com.tencent.mm.plugin.account.a.getAddrUploadStg().a(((com.tencent.mm.plugin.account.friend.a.a)localObject).Aq(), (com.tencent.mm.plugin.account.friend.a.a)localObject);
      }
      w.J(this.poR.mContext, paramString);
      break label180;
      w.J(this.poR.mContext, paramString);
      break label180;
      localObject = com.tencent.mm.plugin.account.a.getFacebookFrdStg().wb(paramString);
      if (localObject == null)
        break label180;
      ((com.tencent.mm.plugin.account.friend.a.g)localObject).status = 100;
      com.tencent.mm.plugin.account.a.getFacebookFrdStg().a((com.tencent.mm.plugin.account.friend.a.g)localObject);
      break label180;
      com.tencent.mm.plugin.account.a.getGoogleFriendStorage().ak(paramString, 2);
      break label180;
      ab.i("MicroMsg.NormalUserFooterPreference", "delete the system contact info added by wechat");
      w.J(this.poR.mContext, paramString);
      break label264;
      NormalUserFooterPreference.b(this.poR).setResult(-1, NormalUserFooterPreference.b(this.poR).getIntent().putExtra("_delete_ok_", true));
      ((Activity)this.poR.mContext).finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a
 * JD-Core Version:    0.6.2
 */