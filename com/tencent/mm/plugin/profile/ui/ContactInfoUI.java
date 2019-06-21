package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bp;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.story.api.AbsStoryGallery;
import com.tencent.mm.plugin.story.api.AbsStoryMuteView;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.e.b;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.statusbar.c.a;
import com.tencent.mm.ui.widget.listview.PullDownListView;
import com.tencent.mm.ui.widget.listview.PullDownListView.a;
import java.io.IOException;
import java.util.List;

@com.tencent.mm.kernel.i
public class ContactInfoUI extends MMPreference
  implements com.tencent.mm.ai.f, com.tencent.mm.plugin.messenger.foundation.a.a.m.a, com.tencent.mm.plugin.story.api.g, k.a, n.b
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private ad ehM;
  private String ehq;
  private boolean fdb;
  private int gwP;
  private String mGZ;
  private com.tencent.mm.pluginsdk.b.a plh;
  private boolean pli;
  private boolean plj;
  private byte[] plk;
  private boolean pll;
  String plm;
  private String pln;
  private PullDownListView plo;
  private boolean plp;
  private AbsStoryGallery plq;
  private AbsStoryMuteView plr;
  private boolean pls;
  private View.OnClickListener plt;
  private PullDownListView.a plu;
  private View plv;
  private View plw;
  private c.a plx;
  private boolean ply;

  public ContactInfoUI()
  {
    AppMethodBeat.i(23358);
    this.pll = false;
    this.plm = null;
    this.pln = "";
    this.ehq = "";
    this.plo = null;
    this.plp = false;
    this.plq = null;
    this.plr = null;
    this.pls = false;
    this.fdb = false;
    this.plt = null;
    this.plu = new PullDownListView.a()
    {
      public final void AU(int paramAnonymousInt)
      {
        AppMethodBeat.i(23346);
        if (ContactInfoUI.a(ContactInfoUI.this) != null)
          ContactInfoUI.a(ContactInfoUI.this).EF(paramAnonymousInt);
        AppMethodBeat.o(23346);
      }

      public final void AV(int paramAnonymousInt)
      {
        AppMethodBeat.i(23347);
        if (ContactInfoUI.a(ContactInfoUI.this) != null)
          ContactInfoUI.a(ContactInfoUI.this).EG(paramAnonymousInt);
        AppMethodBeat.o(23347);
      }

      public final void AW(int paramAnonymousInt)
      {
      }

      public final void caI()
      {
        AppMethodBeat.i(23341);
        if (ContactInfoUI.a(ContactInfoUI.this) != null)
        {
          ab.i("MicroMsg.ContactInfoUI", "story_cat onPostClose");
          ContactInfoUI.a(ContactInfoUI.this).lr(true);
          ContactInfoUI.this.mController.showTitleView();
          ContactInfoUI.c(ContactInfoUI.this);
        }
        AppMethodBeat.o(23341);
      }

      public final void caJ()
      {
        AppMethodBeat.i(23342);
        if (ContactInfoUI.a(ContactInfoUI.this) != null)
          ContactInfoUI.a(ContactInfoUI.this).cwK();
        AppMethodBeat.o(23342);
      }

      public final void caK()
      {
        AppMethodBeat.i(23343);
        if (ContactInfoUI.a(ContactInfoUI.this) != null)
          ContactInfoUI.a(ContactInfoUI.this).cwL();
        AppMethodBeat.o(23343);
      }

      public final void caL()
      {
        AppMethodBeat.i(23344);
        ab.i("MicroMsg.ContactInfoUI", "story_cat onMuteIn");
        ContactInfoUI.d(ContactInfoUI.this).cwM();
        AppMethodBeat.o(23344);
      }

      public final void caM()
      {
        AppMethodBeat.i(23345);
        ContactInfoUI.d(ContactInfoUI.this).cwN();
        AppMethodBeat.o(23345);
      }

      public final void jM(boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(23340);
        if (ContactInfoUI.a(ContactInfoUI.this) != null)
        {
          ab.i("MicroMsg.ContactInfoUI", "story_cat onPostOpen");
          ContactInfoUI.a(ContactInfoUI.this).K(paramAnonymousBoolean, true);
          ContactInfoUI.this.mController.hideTitleView();
          ContactInfoUI.b(ContactInfoUI.this);
        }
        AppMethodBeat.o(23340);
      }
    };
    this.ply = false;
    AppMethodBeat.o(23358);
  }

  private void UO(String paramString)
  {
    AppMethodBeat.i(23373);
    Object localObject;
    int i;
    label143: int j;
    label153: String str;
    if (com.tencent.mm.model.t.mU(this.ehM.field_username))
    {
      this.plh = com.tencent.mm.bp.d.ac(this, "sport");
      if (this.plh != null)
      {
        this.plh.a(this.ehK, this.ehM, this.pli, this.gwP);
        localObject = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(this.ehM.field_username);
        paramString = "";
        if (localObject != null)
          paramString = bo.nullAsNil(((com.tencent.mm.plugin.account.friend.a.a)localObject).apG()).replace(" ", "");
        if ((!this.ply) && (com.tencent.mm.n.a.jh(this.ehM.field_type)) && ((this.plh instanceof k)))
        {
          if (!bo.isNullOrNil(this.ehM.dur))
            break label1158;
          i = 0;
          if (!bo.isNullOrNil(paramString))
            break label1176;
          j = 0;
          j = i + j;
          localObject = com.tencent.mm.plugin.report.service.h.pYm;
          str = this.ehM.field_username;
          if (!bo.isNullOrNil(paramString))
            break label1182;
          i = 0;
          label181: if (j < 5)
            break label1187;
          j = 5;
        }
      }
    }
    label1055: label1187: 
    while (true)
    {
      while (true)
      {
        ((com.tencent.mm.plugin.report.service.h)localObject).e(12040, new Object[] { str, Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(j) });
        this.ply = true;
        if ((!(this.plh instanceof k)) && (!(this.plh instanceof c)) && (!(this.plh instanceof com.tencent.mm.plugin.profile.ui.newbizinfo.b)))
        {
          aw.ZK();
          paramString = (String)com.tencent.mm.model.c.Ry().get(ac.a.xRJ, "");
          if (paramString.contains(this.ehM.field_username))
          {
            paramString = paramString.replaceAll(this.ehM.field_username + ",*", "");
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xRJ, paramString);
            ab.i("MicroMsg.ContactInfoUI", "mark plugin read, userName:%s, newVal:%s", new Object[] { this.ehM.field_username, paramString });
            if (bo.isNullOrNil(paramString))
              com.tencent.mm.x.c.PK().y(262158, false);
          }
        }
        if (this.ehK != null)
        {
          paramString = (NormalProfileHeaderPreference)this.ehK.aqO("contact_profile_header_normal");
          if (paramString != null)
            paramString.A(this.pls, this.plw.getHeight());
        }
        AppMethodBeat.o(23373);
        return;
        if (com.tencent.mm.model.t.nc(this.ehM.field_username))
        {
          this.plh = com.tencent.mm.bp.d.ac(this, "qqmail");
          break;
        }
        if (com.tencent.mm.model.t.nd(this.ehM.field_username))
        {
          this.plh = new e(this);
          break;
        }
        if (com.tencent.mm.model.t.ne(this.ehM.field_username))
        {
          this.plh = com.tencent.mm.bp.d.ac(this, "tmessage");
          break;
        }
        if (com.tencent.mm.model.t.nq(this.ehM.field_username))
        {
          this.plh = new com.tencent.mm.plugin.topstory.ui.widget.a(this);
          break;
        }
        if (com.tencent.mm.model.t.mW(this.ehM.field_username))
        {
          this.plh = new h(this);
          break;
        }
        if (com.tencent.mm.model.t.nk(this.ehM.field_username))
        {
          this.plh = new m(this);
          break;
        }
        if (ad.mR(this.ehM.field_username))
        {
          this.plh = new d(this);
          break;
        }
        if (com.tencent.mm.model.t.nm(this.ehM.field_username))
        {
          this.plh = com.tencent.mm.bp.d.ac(this, "nearby");
          break;
        }
        if (com.tencent.mm.model.t.nn(this.ehM.field_username))
        {
          this.plh = com.tencent.mm.bp.d.ac(this, "shake");
          break;
        }
        if (com.tencent.mm.model.t.no(this.ehM.field_username))
        {
          this.plh = new j(this);
          break;
        }
        if (com.tencent.mm.model.t.np(this.ehM.field_username))
        {
          this.plh = com.tencent.mm.bp.d.I(this, "readerapp", "widget_type_news");
          break;
        }
        if (com.tencent.mm.model.t.nx(this.ehM.field_username))
        {
          this.plh = com.tencent.mm.bp.d.I(this, "readerapp", "widget_type_weibo");
          break;
        }
        if (com.tencent.mm.model.t.nh(this.ehM.field_username))
        {
          this.plh = new f(this);
          break;
        }
        if (com.tencent.mm.model.t.ni(this.ehM.field_username))
        {
          this.plh = com.tencent.mm.bp.d.ac(this, "masssend");
          break;
        }
        if (com.tencent.mm.model.t.nj(this.ehM.field_username))
        {
          this.plh = new g(this);
          break;
        }
        if ((!this.ehM.dsf()) && (!getIntent().getBooleanExtra("key_use_new_contact_profile", false)))
          break label1055;
        try
        {
          localObject = this.plk;
          if (localObject == null);
          for (localObject = null; ; localObject = (uy)((uy)localObject).parseFrom(this.plk))
          {
            boolean bool = a(this.ehM.field_username, (uy)localObject);
            ab.i("MicroMsg.ContactInfoUI", "username:%s, isUseNewProfileUI:%b", new Object[] { this.ehM.field_username, Boolean.valueOf(bool) });
            if (!bool)
              break label1018;
            paramString = new com.tencent.mm.plugin.profile.ui.newbizinfo.b(this, paramString, (uy)localObject);
            if (!bo.isNullOrNil(this.mGZ))
              paramString.mGZ = this.mGZ;
            this.plh = paramString;
            break;
            localObject = new com/tencent/mm/protocal/protobuf/uy;
            ((uy)localObject).<init>();
          }
        }
        catch (IOException localIOException)
        {
          uy localuy;
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.ContactInfoUI", localIOException, "", new Object[0]);
            localuy = null;
          }
          label1018: paramString = new c(this, paramString, localuy);
          if (!bo.isNullOrNil(this.mGZ))
            paramString.mGZ = this.mGZ;
          this.plh = paramString;
        }
      }
      break;
      if (com.tencent.mm.model.t.nt(this.ehM.field_username))
      {
        this.plh = new n(this);
        break;
      }
      if (com.tencent.mm.model.t.nu(this.ehM.field_username))
      {
        this.plh = new i(this);
        break;
      }
      if (com.tencent.mm.model.t.mV(this.ehM.field_username))
      {
        this.plh = new com.tencent.mm.plugin.downloader_app.e.a(this);
        break;
      }
      this.plh = new com.tencent.mm.plugin.profile.a(this);
      caF();
      break;
      i = this.ehM.dur.split(",").length;
      break label143;
      j = 1;
      break label153;
      i = 1;
      break label181;
    }
  }

  private boolean a(String paramString, uy paramuy)
  {
    boolean bool = false;
    AppMethodBeat.i(23374);
    if (!ah.doB().getBoolean("use_new_profile", true))
      AppMethodBeat.o(23374);
    while (true)
    {
      return bool;
      if (com.tencent.mm.model.t.nQ(paramString))
      {
        AppMethodBeat.o(23374);
      }
      else if (com.tencent.mm.model.t.nl(paramString))
      {
        AppMethodBeat.o(23374);
      }
      else if (com.tencent.mm.model.t.nw(paramString))
      {
        AppMethodBeat.o(23374);
      }
      else if (com.tencent.mm.aj.f.qY(paramString))
      {
        AppMethodBeat.o(23374);
        bool = true;
      }
      else if (com.tencent.mm.aj.f.qZ(paramString))
      {
        AppMethodBeat.o(23374);
        bool = true;
      }
      else if (paramuy != null)
      {
        paramString = new com.tencent.mm.aj.d();
        paramString.field_extInfo = paramuy.gvc;
        paramString.field_type = paramString.cJ(false).getServiceType();
        if (paramString.adN())
        {
          AppMethodBeat.o(23374);
          bool = true;
        }
        else if (paramString.adM())
        {
          AppMethodBeat.o(23374);
          bool = true;
        }
      }
      else if (getIntent().getBooleanExtra("key_use_new_contact_profile", false))
      {
        AppMethodBeat.o(23374);
        bool = true;
      }
      else if (com.tencent.mm.aj.f.rc(this.ehM.field_username))
      {
        AppMethodBeat.o(23374);
      }
      else if (com.tencent.mm.aj.f.rb(this.ehM.field_username))
      {
        AppMethodBeat.o(23374);
      }
      else if (((int)this.ehM.ewQ <= 0) && (this.ehM.dsf()) && ((this.gwP == 17) || (this.gwP == 41)))
      {
        AppMethodBeat.o(23374);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(23374);
      }
    }
  }

  private void caD()
  {
    AppMethodBeat.i(23363);
    if ((this.plv == null) || (!com.tencent.mm.ui.statusbar.c.zzP))
      AppMethodBeat.o(23363);
    while (true)
    {
      return;
      com.tencent.mm.ui.statusbar.c localc = com.tencent.mm.ui.statusbar.c.az(this);
      c.a local4 = new c.a()
      {
        public final void pO(int paramAnonymousInt)
        {
          AppMethodBeat.i(23350);
          ContactInfoUI.e(ContactInfoUI.this).setPadding(0, paramAnonymousInt, 0, 0);
          com.tencent.mm.ui.statusbar.d.a(ContactInfoUI.this.getWindow());
          AppMethodBeat.o(23350);
        }
      };
      this.plx = local4;
      localc.a(local4);
      getWindow().getDecorView().requestApplyInsets();
      com.tencent.mm.ui.statusbar.d.a(getWindow());
      AppMethodBeat.o(23363);
    }
  }

  private void caE()
  {
    AppMethodBeat.i(23382);
    if (com.tencent.mm.compatible.util.d.iW(19))
    {
      getWindow().clearFlags(201327616);
      AppMethodBeat.o(23382);
    }
    while (true)
    {
      return;
      getWindow().clearFlags(1024);
      AppMethodBeat.o(23382);
    }
  }

  private void caF()
  {
    AppMethodBeat.i(23383);
    if (!((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).isShowStoryCheck())
      AppMethodBeat.o(23383);
    while (true)
    {
      return;
      if (!this.plp)
        break;
      AppMethodBeat.o(23383);
    }
    ab.i("MicroMsg.ContactInfoUI", "setupStory %s stack %s", new Object[] { this, bo.dpG().toString() });
    this.plp = true;
    this.plo = ((PullDownListView)this.nDp);
    this.plo.setBackgroundResource(2130839494);
    this.plo.zRr = this.plu;
    int i = -com.tencent.mm.ui.ak.hy(this.mController.ylL).y / 10;
    Object localObject = (RelativeLayout)findViewById(2131826068);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, com.tencent.mm.ui.ak.hy(this.mController.ylL).y);
    localLayoutParams.topMargin = i;
    localLayoutParams.bottomMargin = (-com.tencent.mm.ui.ak.fr(this.mController.ylL));
    if (this.ehM.field_username.equals(r.Yz()));
    for (this.plq = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().a(this, com.tencent.mm.plugin.story.api.m.a.rQE, this.ehq); ; this.plq = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().a(this, com.tencent.mm.plugin.story.api.m.a.rQF, this.ehq))
    {
      this.plo.x(this.plq, com.tencent.mm.bz.a.am(this.mController.ylL, 2131428603), i);
      this.plq.setStoryBrowseUIListener(this);
      this.plq.setDataSeed(this.ehM.field_username);
      this.plq.a(this.plo);
      ((RelativeLayout)localObject).addView(this.plq, 0, localLayoutParams);
      com.tencent.mm.kernel.g.RQ();
      this.plr = ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUIFactory().eV(this);
      localLayoutParams = new RelativeLayout.LayoutParams(com.tencent.mm.bz.a.am(this.mController.ylL, 2131428602), com.tencent.mm.bz.a.am(this.mController.ylL, 2131428602));
      localLayoutParams.addRule(9);
      localLayoutParams.addRule(12);
      ((RelativeLayout)localObject).addView(this.plr, 0, localLayoutParams);
      this.plo.setMuteView(this.plr);
      this.plo.setNavigationBarHeight(com.tencent.mm.ui.ak.fr(this.mController.ylL));
      this.plt = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(23348);
          ab.i("MicroMsg.ContactInfoUI", "onClick: NormalProfileHeaderPreference");
          ContactInfoUI.j(ContactInfoUI.this);
          AppMethodBeat.o(23348);
        }
      };
      localObject = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAs().cYQ = 3L;
      AppMethodBeat.o(23383);
      break;
    }
  }

  private void caG()
  {
    AppMethodBeat.i(23386);
    if (this.fdb)
    {
      com.tencent.mm.ui.base.t.makeText(this.mController.ylL, getResources().getString(2131303947), 0).show();
      AppMethodBeat.o(23386);
    }
    while (true)
    {
      return;
      if ((this.pls) && (this.plo != null))
        this.plo.dLg();
      AppMethodBeat.o(23386);
    }
  }

  private void caH()
  {
    boolean bool = true;
    AppMethodBeat.i(23387);
    ab.i("MicroMsg.ContactInfoUI", "updateUIByStory: %s %s", new Object[] { Boolean.valueOf(this.plp), Boolean.valueOf(this.pls) });
    NormalProfileHeaderPreference localNormalProfileHeaderPreference;
    if ((this.pls) && (!this.fdb))
    {
      caD();
      xE(this.mController.ylL.getResources().getColor(2131690597));
      setMMTitle("");
      if (this.plo != null)
      {
        this.plo.setBackgroundResource(2130839495);
        this.plo.setSupportOverscroll(true);
      }
      if (this.plw != null)
        this.plw.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(23349);
            ab.i("MicroMsg.ContactInfoUI", "onClick: actionBarClick action_bar_root");
            ContactInfoUI.j(ContactInfoUI.this);
            AppMethodBeat.o(23349);
          }
        });
      if (this.ehK != null)
      {
        localNormalProfileHeaderPreference = (NormalProfileHeaderPreference)this.ehK.aqO("contact_profile_header_normal");
        if (localNormalProfileHeaderPreference != null)
          if ((!this.pls) || (this.fdb))
            break label246;
      }
    }
    while (true)
    {
      localNormalProfileHeaderPreference.A(bool, this.plw.getHeight());
      AppMethodBeat.o(23387);
      return;
      xE(this.mController.ylL.getResources().getColor(2131689613));
      setMMTitle("");
      if (this.plo == null)
        break;
      this.plo.setBackgroundResource(2130839497);
      this.plo.setSupportOverscroll(false);
      break;
      label246: bool = false;
    }
  }

  private void fD(String paramString1, String paramString2)
  {
    AppMethodBeat.i(23380);
    if (this.ehM == null)
    {
      ab.e("MicroMsg.ContactInfoUI", "contact = null");
      AppMethodBeat.o(23380);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(paramString2))
      {
        aw.ZK();
        paramString2 = com.tencent.mm.model.c.XN().RB(paramString2);
        if ((paramString2 != null) && (!bo.isNullOrNil(paramString2.field_encryptUsername)))
        {
          this.ehM.iz(paramString2.field_conRemark);
          AppMethodBeat.o(23380);
        }
      }
      else if (!bo.isNullOrNil(paramString1))
      {
        aw.ZK();
        paramString1 = com.tencent.mm.model.c.XN().RB(paramString1);
        if ((paramString1 != null) && (!bo.isNullOrNil(paramString1.field_encryptUsername)))
        {
          this.ehM.iz(paramString1.field_conRemark);
          AppMethodBeat.o(23380);
        }
      }
      else
      {
        AppMethodBeat.o(23380);
      }
    }
  }

  public final int JC()
  {
    return 2131165229;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(23377);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.i("MicroMsg.ContactInfoUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(23377);
    }
    while (true)
    {
      return;
      a((String)paramObject, null);
      AppMethodBeat.o(23377);
    }
  }

  public final void a(bv parambv)
  {
    AppMethodBeat.i(23379);
    al.d(new ContactInfoUI.8(this, parambv));
    AppMethodBeat.o(23379);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(23378);
    new com.tencent.mm.sdk.platformtools.ak().post(new ContactInfoUI.7(this, paramString));
    AppMethodBeat.o(23378);
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(23376);
    paramf = paramPreference.mKey;
    ab.i("MicroMsg.ContactInfoUI", paramf + " item has been clicked!");
    if (this.plh != null)
      this.plh.IO(paramf);
    if (paramPreference != null)
    {
      if (!paramPreference.mKey.equals("contact_info_sns"))
        break label124;
      com.tencent.mm.plugin.report.service.h.pYm.e(16055, new Object[] { Integer.valueOf(com.tencent.mm.plugin.profile.c.am(getIntent())), Integer.valueOf(3) });
    }
    while (true)
    {
      if ((paramPreference instanceof NormalProfileHeaderPreference))
        caG();
      AppMethodBeat.o(23376);
      return false;
      label124: if (paramPreference.mKey.equals("contact_info_more"))
        com.tencent.mm.plugin.report.service.h.pYm.e(16055, new Object[] { Integer.valueOf(com.tencent.mm.plugin.profile.c.am(getIntent())), Integer.valueOf(6) });
    }
  }

  public final String bJj()
  {
    AppMethodBeat.i(23371);
    String str;
    if ((this.ehM == null) || ((int)this.ehM.ewQ == 0) || (bo.isNullOrNil(this.ehM.field_username)))
    {
      str = "";
      AppMethodBeat.o(23371);
    }
    while (true)
    {
      return str;
      ab.i("MicroMsg.ContactInfoUI", "getIdentityString %s", new Object[] { this.ehM.field_username });
      if (com.tencent.mm.aj.f.kq(this.ehM.field_username))
      {
        str = "_EnterpriseChat";
        AppMethodBeat.o(23371);
      }
      else if (com.tencent.mm.aj.f.rc(this.ehM.field_username))
      {
        str = "_EnterpriseFatherBiz";
        AppMethodBeat.o(23371);
      }
      else if (com.tencent.mm.aj.f.rb(this.ehM.field_username))
      {
        str = "_EnterpriseChildBiz";
        AppMethodBeat.o(23371);
      }
      else if (this.ehM.dsf())
      {
        str = "_bizContact";
        AppMethodBeat.o(23371);
      }
      else if (com.tencent.mm.model.t.kH(this.ehM.field_username))
      {
        str = "_chatroom";
        AppMethodBeat.o(23371);
      }
      else if (com.tencent.mm.model.t.mR(this.ehM.field_username))
      {
        str = "_bottle";
        AppMethodBeat.o(23371);
      }
      else if (com.tencent.mm.model.t.mS(this.ehM.field_username))
      {
        str = "_QQ";
        AppMethodBeat.o(23371);
      }
      else if (com.tencent.mm.model.t.nI(this.ehM.field_username))
      {
        str = "_" + this.ehM.field_username;
        AppMethodBeat.o(23371);
      }
      else
      {
        str = "";
        AppMethodBeat.o(23371);
      }
    }
  }

  public final void caA()
  {
    AppMethodBeat.i(23359);
    ab.i("MicroMsg.ContactInfoUI", "story_cat storyUINoStory");
    this.pls = false;
    if ((this.plo != null) && (!this.plo.isVisible))
    {
      this.mController.showTitleView();
      caE();
      this.plo.dLf();
    }
    caH();
    AppMethodBeat.o(23359);
  }

  public final void caB()
  {
    AppMethodBeat.i(23360);
    ab.i("MicroMsg.ContactInfoUI", "story_cat storyUIHasStory");
    this.pls = true;
    if ((this.plo != null) && (this.plo.isVisible))
      caH();
    AppMethodBeat.o(23360);
  }

  public final void caC()
  {
    AppMethodBeat.i(23361);
    ab.i("MicroMsg.ContactInfoUI", "story_cat storyUIBackPressed");
    this.plo.dLf();
    AppMethodBeat.o(23361);
  }

  public void finish()
  {
    AppMethodBeat.i(23388);
    com.tencent.mm.plugin.story.g.h localh = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAs().cYQ = 0L;
    super.finish();
    AppMethodBeat.o(23388);
  }

  public final void initView()
  {
    AppMethodBeat.i(23372);
    this.ehK = this.yCw;
    this.ehK.removeAll();
    this.gwP = getIntent().getIntExtra("Contact_Scene", 9);
    this.mGZ = getIntent().getStringExtra("Verify_ticket");
    this.pli = getIntent().getBooleanExtra("Chat_Readonly", false);
    this.plj = getIntent().getBooleanExtra("User_Verify", false);
    this.ehq = getIntent().getStringExtra("Contact_ChatRoomId");
    String str1 = bo.nullAsNil(getIntent().getStringExtra("Contact_User"));
    Object localObject1 = bo.nullAsNil(getIntent().getStringExtra("Contact_Alias"));
    Object localObject2 = bo.nullAsNil(getIntent().getStringExtra("Contact_Encryptusername"));
    if (str1.endsWith("@stranger"))
      localObject2 = str1;
    aw.ZK();
    this.ehM = com.tencent.mm.model.c.XM().aoO(str1);
    if (this.ehM != null)
      this.ehM.xXc = str1;
    com.tencent.mm.plugin.profile.b.gkF.a(this.ehM);
    Object localObject3 = getIntent().getStringExtra("Contact_Nick");
    int i = getIntent().getIntExtra("Contact_Sex", 0);
    String str2 = getIntent().getStringExtra("Contact_Province");
    Object localObject4 = getIntent().getStringExtra("Contact_City");
    String str3 = getIntent().getStringExtra("Contact_Signature");
    int j = getIntent().getIntExtra("Contact_VUser_Info_Flag", 0);
    String str4 = getIntent().getStringExtra("Contact_VUser_Info");
    String str5 = getIntent().getStringExtra("Contact_Distance");
    int k = getIntent().getIntExtra("Contact_KWeibo_flag", 0);
    String str6 = getIntent().getStringExtra("Contact_KWeibo");
    String str7 = getIntent().getStringExtra("Contact_KWeiboNick");
    String str8 = getIntent().getStringExtra("Contact_KFacebookName");
    long l = getIntent().getLongExtra("Contact_KFacebookId", 0L);
    this.pln = getIntent().getStringExtra("Contact_BrandIconURL");
    String str9 = getIntent().getStringExtra("Contact_RegionCode");
    this.plk = getIntent().getByteArrayExtra("Contact_customInfo");
    int m = getIntent().getIntExtra("Contact_Ext_Flag", 0);
    boolean bool1 = getIntent().getBooleanExtra("force_get_contact", false);
    ab.i("MicroMsg.ContactInfoUI", "dkverify forceAddContact:%s  user:%s  roomid:%s ", new Object[] { Boolean.valueOf(bool1), str1, this.ehq });
    Object localObject5;
    Object localObject6;
    Object localObject7;
    label750: int n;
    label770: int i1;
    label1218: int i2;
    label1284: boolean bool2;
    if (bool1)
    {
      ab.d("MicroMsg.ContactInfoUI", "initView, forceAddContact, user = ".concat(String.valueOf(str1)));
      if ((this.ehM != null) && (com.tencent.mm.n.a.jh(this.ehM.field_type)))
        ao.a.flu.ai(str1, this.ehq);
    }
    else
    {
      if (((this.ehM == null) || ((int)this.ehM.ewQ == 0)) && (ad.aox(str1)) && (this.gwP != 15))
      {
        localObject5 = bo.nullAsNil(getIntent().getStringExtra(e.b.yfT));
        localObject6 = localObject5;
        if (bo.isNullOrNil((String)localObject5))
          localObject6 = this.mGZ;
        com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.openim.b.h(str1, bo.nullAsNil(this.ehq), (String)localObject6), 0);
      }
      if ((this.ehM != null) && ((int)this.ehM.ewQ > 0) && ((!com.tencent.mm.model.t.nJ(this.ehM.field_username)) || ((ad.aow(this.ehM.field_username)) && (!com.tencent.mm.model.t.mX(this.ehM.field_username)))))
      {
        if ((!this.ehM.dsi()) || (!ad.aox(this.ehM.field_username)))
          break label1986;
        localObject5 = bo.nullAsNil(getIntent().getStringExtra(e.b.yfT));
        localObject6 = localObject5;
        if (bo.isNullOrNil((String)localObject5))
          localObject6 = this.mGZ;
        localObject7 = com.tencent.mm.kernel.g.RO().eJo;
        String str10 = this.ehM.field_username;
        if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
          break label1974;
        localObject5 = "";
        ((p)localObject7).a(new com.tencent.mm.openim.b.h(str10, (String)localObject5, (String)localObject6), 0);
      }
      n = getIntent().getIntExtra("Contact_verify_Scene", 9);
      getIntent().getIntExtra("key_add_contact_match_type", 0);
      localObject5 = getIntent().getStringExtra("key_add_contact_openim_appid");
      i1 = getIntent().getIntExtra("key_add_contact_custom_detail_visible", 0);
      localObject6 = getIntent().getStringExtra("key_add_contact_custom_detail");
      getIntent().getStringExtra("key_add_contact_desc_wording_id");
      getIntent().getStringExtra("key_add_contact_desc_icon");
      if ((this.ehM != null) && ((int)this.ehM.ewQ != 0) && (bo.nullAsNil(this.ehM.field_username).length() > 0))
        break label2231;
      this.ehM = new ad();
      this.ehM.setUsername(str1);
      this.ehM.iy((String)localObject1);
      this.ehM.iB((String)localObject3);
      this.ehM.iC(getIntent().getStringExtra("Contact_PyInitial"));
      this.ehM.iD(getIntent().getStringExtra("Contact_QuanPin"));
      this.ehM.hA(i);
      this.ehM.iR(str2);
      this.ehM.iS((String)localObject4);
      this.ehM.iQ(str3);
      this.ehM.hw(j);
      this.ehM.iV(str4);
      this.ehM.iT(str5);
      this.ehM.hG(n);
      this.ehM.iU(str6);
      this.ehM.hv(k);
      this.ehM.iE(str7);
      this.ehM.eC(l);
      this.ehM.iL(str8);
      this.ehM.iW(str9);
      this.ehM.hJ(m);
      if ((!bo.isNullOrNil(this.plm)) && (this.gwP == 15))
      {
        aw.ZK();
        localObject3 = com.tencent.mm.model.c.XN().RB(str1);
        localObject1 = new bv(str1);
        ((bv)localObject1).field_conRemark = ((bv)localObject3).field_conRemark;
        ((bv)localObject1).field_conDescription = ((bv)localObject3).field_conDescription;
        ((bv)localObject1).field_contactLabels = ((bv)localObject3).field_contactLabels;
        ((bv)localObject1).field_conPhone = this.plm;
        aw.ZK();
        com.tencent.mm.model.c.XN().a((com.tencent.mm.sdk.e.c)localObject1);
        this.plm = null;
      }
      this.ehM.jf((String)localObject6);
      this.ehM.hK(i1);
      this.ehM.iK((String)localObject5);
      if ((ad.aox(this.ehM.field_username)) && ((this.gwP == 30) || (this.gwP == 45) || (this.gwP == 17)))
      {
        localObject6 = com.tencent.mm.plugin.report.service.h.pYm;
        localObject5 = this.ehM.field_openImAppid;
        if (this.gwP != 17)
          break label2863;
        i2 = 2;
        ((com.tencent.mm.plugin.report.service.h)localObject6).e(15320, new Object[] { localObject5, Integer.valueOf(i2) });
      }
      if (!bo.isNullOrNil((String)localObject2))
        this.ehM.iH((String)localObject2);
      fD(str1, (String)localObject2);
      getIntent().putExtra("Contact_User", this.ehM.field_username);
      if ((!bool1) && ((int)this.ehM.ewQ <= 0) && (this.ehM.dsf()) && ((this.gwP == 17) || (this.gwP == 41)))
      {
        ab.d("MicroMsg.ContactInfoUI", "come from card, getContact %s", new Object[] { this.ehM.field_username });
        ao.a.flu.ai(this.ehM.field_username, "");
        com.tencent.mm.ah.b.pY(this.ehM.field_username);
      }
      if (this.ehM.dul != null)
        break label2869;
      bool2 = true;
      label1455: if (this.ehM.dul != null)
        break label2875;
      i2 = 0;
      label1468: if (this.ehM.dul != null)
        break label2890;
      localObject2 = "";
      label1481: ab.i("MicroMsg.ContactInfoUI", "contact.getRemarkDesc() (%s, %s, %s)", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(i2), localObject2 });
      if ((!bool1) && ((int)this.ehM.ewQ <= 0) && (this.gwP == 96))
      {
        ab.i("MicroMsg.ContactInfoUI", "come from chatroom accessverify, getContact %s", new Object[] { this.ehM.field_username });
        ao.a.flu.aj(this.ehM.field_username, getIntent().getStringExtra("key_add_contact_verify_ticket"));
        com.tencent.mm.ah.b.U(this.ehM.field_username, 3);
      }
      if (this.ehM.field_username.equals(r.Yz()))
      {
        aw.ZK();
        l = bo.getLong((String)com.tencent.mm.model.c.Ry().get(65825, null), 0L);
        if (l > 0L)
        {
          this.ehM.eC(l);
          localObject2 = this.ehM;
          aw.ZK();
          ((ad)localObject2).iL((String)com.tencent.mm.model.c.Ry().get(65826, null));
        }
        localObject2 = this.ehM;
        aw.ZK();
        ((ad)localObject2).iZ((String)com.tencent.mm.model.c.Ry().get(286721, null));
        localObject2 = this.ehM;
        aw.ZK();
        ((ad)localObject2).ja((String)com.tencent.mm.model.c.Ry().get(286722, null));
        localObject2 = this.ehM;
        aw.ZK();
        ((ad)localObject2).jb((String)com.tencent.mm.model.c.Ry().get(286723, null));
      }
      if ((this.ehM.field_username != null) && (this.ehM.field_username.equals(ad.aoC(r.Yz()))))
      {
        localObject6 = bp.aao();
        localObject5 = bo.nullAsNil(((bp)localObject6).getProvince());
        localObject2 = bo.nullAsNil(((bp)localObject6).getCity());
        if (!bo.isNullOrNil((String)localObject5))
          this.ehM.iR((String)localObject5);
        if (!bo.isNullOrNil((String)localObject2))
          this.ehM.iS((String)localObject2);
        if (!bo.isNullOrNil(((bp)localObject6).countryCode))
          this.ehM.iW(RegionCodeDecoder.aC(((bp)localObject6).countryCode, ((bp)localObject6).fnp, ((bp)localObject6).fno));
        i2 = bo.a(Integer.valueOf(((bp)localObject6).dtS), 0);
        localObject2 = bo.nullAsNil(((bp)localObject6).signature);
        this.ehM.hA(i2);
        this.ehM.iQ((String)localObject2);
      }
      if (!bo.isNullOrNil(this.ehM.field_username))
        break label2904;
      ab.e("MicroMsg.ContactInfoUI", "username is null %s", new Object[] { str1 });
      finish();
      AppMethodBeat.o(23372);
    }
    while (true)
    {
      return;
      ao.a.flu.ai(str1, "");
      break;
      label1974: localObject5 = bo.nullAsNil(this.ehq);
      break label750;
      label1986: localObject6 = com.tencent.mm.aj.f.qX(this.ehM.field_username);
      if ((this.ehM.dsf()) && (com.tencent.mm.aj.a.adG()))
      {
        i2 = 1;
        label2017: if ((localObject6 != null) && ((!((com.tencent.mm.aj.d)localObject6).adJ()) || (i2 != 0)))
          break label2126;
        ab.d("MicroMsg.ContactInfoUI", "update contact, verifyFlag %d.", new Object[] { Integer.valueOf(j) });
        localObject5 = ao.a.flu;
        localObject7 = this.ehM.field_username;
        if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
          break label2117;
      }
      label2117: for (localObject6 = ""; ; localObject6 = this.ehq)
      {
        ((ao.b)localObject5).ai((String)localObject7, (String)localObject6);
        com.tencent.mm.ah.b.pY(this.ehM.field_username);
        break;
        i2 = 0;
        break label2017;
      }
      label2126: if ((!this.ehM.dsi()) || (i2 != 0))
        break label770;
      ab.d("MicroMsg.ContactInfoUI", "update contact, last check time=%d", new Object[] { Integer.valueOf(this.ehM.duj) });
      localObject7 = ao.a.flu;
      localObject5 = this.ehM.field_username;
      if (com.tencent.mm.n.a.jh(this.ehM.field_type));
      for (localObject6 = ""; ; localObject6 = this.ehq)
      {
        ((ao.b)localObject7).ai((String)localObject5, (String)localObject6);
        com.tencent.mm.ah.b.pY(this.ehM.field_username);
        break;
      }
      label2231: if (this.ehM.dtS == 0)
        this.ehM.hA(i);
      if ((str2 != null) && (!str2.equals("")))
        this.ehM.iR(str2);
      if ((localObject4 != null) && (!((String)localObject4).equals("")))
        this.ehM.iS((String)localObject4);
      if ((str9 != null) && (!str9.equals("")))
        this.ehM.iW(str9);
      if ((bo.isNullOrNil(this.ehM.signature)) && (str3 != null) && (!str3.equals("")))
        this.ehM.iQ(str3);
      if (j != 0)
        this.ehM.hw(j);
      if ((bo.isNullOrNil(this.ehM.duh)) && (str4 != null) && (!str4.equals("")))
        this.ehM.iV(str4);
      if ((bo.isNullOrNil(this.ehM.field_nickname)) && (localObject3 != null) && (!((String)localObject3).equals("")))
        this.ehM.iB((String)localObject3);
      ab.i("MicroMsg.ContactInfoUI", "searchMobilePhone:%s", new Object[] { bo.nullAsNil(this.plm) });
      if ((!bo.isNullOrNil(this.plm)) && (this.gwP == 15))
      {
        i2 = 1;
        k = 1;
        str4 = this.ehM.dur;
        if (str4 != null)
        {
          localObject4 = this.ehM.dur.split(",");
          m = localObject4.length;
          j = 0;
          i2 = k;
          if (j < m)
          {
            if (localObject4[j].equals(this.plm));
            for (i2 = 0; ; i2 = 1)
            {
              j++;
              break;
            }
          }
        }
        if (i2 != 0)
        {
          this.ehM.jd(str4 + this.plm + ",");
          this.plm = null;
        }
        ab.i("MicroMsg.ContactInfoUI", "contact PhoneList:%s", new Object[] { bo.nullAsNil(this.ehM.dur) });
        this.ehM.setSource(15);
      }
      this.ehM.iT(str5);
      this.ehM.hG(n);
      this.ehM.eC(l);
      this.ehM.iL(str8);
      if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
      {
        if (!bo.isNullOrNil((String)localObject1))
          this.ehM.iy((String)localObject1);
        if (!bo.isNullOrNil((String)localObject3))
          this.ehM.iB((String)localObject3);
        localObject1 = getIntent().getStringExtra("Contact_PyInitial");
        if (!bo.isNullOrNil((String)localObject1))
          this.ehM.iC((String)localObject1);
        localObject1 = getIntent().getStringExtra("Contact_QuanPin");
        if (!bo.isNullOrNil((String)localObject1))
          this.ehM.iD((String)localObject1);
      }
      if ((!com.tencent.mm.n.a.jh(this.ehM.field_type)) && (!bo.isNullOrNil((String)localObject6)))
        this.ehM.jf((String)localObject6);
      if ((!com.tencent.mm.n.a.jh(this.ehM.field_type)) && (i1 != 0))
        this.ehM.hK(i1);
      if (bo.isNullOrNil((String)localObject5))
        break label1218;
      this.ehM.iK((String)localObject5);
      break label1218;
      label2863: i2 = 1;
      break label1284;
      label2869: bool2 = false;
      break label1455;
      label2875: i2 = this.ehM.dul.length();
      break label1468;
      label2890: localObject2 = bo.anv(this.ehM.dul);
      break label1481;
      label2904: setMMTitle("");
      UO(this.pln);
      setBackBtn(new ContactInfoUI.6(this));
      o.acv().qa(this.ehM.field_username);
      if (((com.tencent.mm.model.t.no(this.ehM.field_username)) && (r.YT())) || ((com.tencent.mm.model.t.ng(this.ehM.field_username)) && (r.YP())) || ((com.tencent.mm.model.t.ni(this.ehM.field_username)) && (r.YY())) || ((com.tencent.mm.model.t.nc(this.ehM.field_username)) && (r.Zb())))
      {
        this.pll = true;
        AppMethodBeat.o(23372);
      }
      else
      {
        this.pll = false;
        AppMethodBeat.o(23372);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(23375);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null)
      getIntent().putExtra("CONTACT_INFO_UI_SOURCE", paramIntent.getIntExtra("CONTACT_INFO_UI_SOURCE", -1));
    if (this.plh != null)
      this.plh.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(23375);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(23385);
    if (((this.plq == null) || (!this.plq.wY())) && (!getSupportFragmentManager().isDestroyed()))
      super.onBackPressed();
    AppMethodBeat.o(23385);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(23364);
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 1)
      this.fdb = false;
    while (true)
    {
      if ((this.plo != null) && (!this.plo.isVisible))
        this.plo.dLf();
      caH();
      AppMethodBeat.o(23364);
      return;
      if (paramConfiguration.orientation == 2)
        this.fdb = true;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(23362);
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.XM().aoO(bo.nullAsNil(getIntent().getStringExtra("Contact_User")));
    boolean bool;
    if (localObject != null)
    {
      com.tencent.mm.kernel.g.RQ();
      if (((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).isStoryExist(((ap)localObject).field_username))
      {
        this.pls = true;
        if (this.pls)
          this.ylm = true;
        super.onCreate(paramBundle);
        if (getResources().getConfiguration().orientation != 2)
          break label221;
        bool = true;
        label99: this.fdb = bool;
        this.plv = findViewById(2131820940);
        this.plw = this.plv.findViewById(2131820936);
        caH();
        paramBundle = getWindow().getDecorView();
        paramBundle.setSystemUiVisibility(paramBundle.getSystemUiVisibility() | 0x400 | 0x100);
        ab.i("MicroMsg.ContactInfoUI", "onCreate MMCore.accHasReady[%b]", new Object[] { Boolean.valueOf(aw.RK()) });
        this.plm = getIntent().getStringExtra("Contact_Search_Mobile");
        if (com.tencent.mm.kernel.g.RN().QY())
          break label226;
        finish();
        AppMethodBeat.o(23362);
      }
    }
    while (true)
    {
      return;
      this.pls = false;
      break;
      label221: bool = false;
      break label99;
      label226: aw.ZK();
      com.tencent.mm.model.c.XM().a(this);
      aw.ZK();
      com.tencent.mm.model.c.XN().a(this);
      initView();
      dyb();
      if ((this.plh instanceof com.tencent.mm.plugin.profile.ui.newbizinfo.b))
      {
        localObject = (com.tencent.mm.plugin.profile.ui.newbizinfo.b)this.plh;
        if ((((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ehM != null) && (((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).pkW != null))
          break label361;
        ab.w("MicroMsg.ContactWidgetNewBizInfo", "reportStart fail, err");
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(16055, new Object[] { Integer.valueOf(com.tencent.mm.plugin.profile.c.am(getIntent())), Integer.valueOf(1) });
      paramBundle = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.cAs().cZK = com.tencent.mm.plugin.profile.c.am(getIntent());
      AppMethodBeat.o(23362);
    }
    label361: ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).edh = System.currentTimeMillis();
    paramBundle = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ehM.field_username;
    int i = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).gwP;
    int j = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).pkW.field_type;
    long l = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).edh;
    if (com.tencent.mm.n.a.jh(((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ehM.field_type));
    for (int k = 1; ; k = 0)
    {
      com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.a(paramBundle, i, j, l, k);
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(23365);
    Object localObject = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAs().cZK = 0L;
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      aw.ZK();
      com.tencent.mm.model.c.XM().b(this);
      aw.ZK();
      com.tencent.mm.model.c.XN().b(this);
    }
    if (this.plh != null)
      this.plh.biV();
    if ((this.plh instanceof com.tencent.mm.plugin.profile.ui.newbizinfo.b))
    {
      localObject = (com.tencent.mm.plugin.profile.ui.newbizinfo.b)this.plh;
      if ((((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ehM == null) || (((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).pkW == null) || (((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ppN == null))
        ab.w("MicroMsg.ContactWidgetNewBizInfo", "reportEnd fail, err");
    }
    else
    {
      if (com.tencent.mm.plugin.sns.b.n.qFx != null)
        com.tencent.mm.plugin.sns.b.n.qFx.ab(this);
      super.onDestroy();
      if (this.plq != null)
        this.plq.onDestroy();
      AppMethodBeat.o(23365);
      return;
    }
    ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).endTime = System.currentTimeMillis();
    String str = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ehM.field_username;
    int i = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).gwP;
    int j = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).pkW.field_type;
    long l1 = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).edh;
    long l2 = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).endTime;
    int k;
    label214: int m;
    int n;
    if (com.tencent.mm.n.a.jh(((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ehM.field_type))
    {
      k = 1;
      m = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ppN.field_originalArticleCount;
      n = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ppN.field_friendSubscribeCount;
      if (((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).pmy == null)
        break label305;
    }
    label305: for (int i1 = ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).pmy.size(); ; i1 = 0)
    {
      com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.a(str, i, j, l1, l2, k, m, n, i1, com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.cE(((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ppN.cbL()), com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.cF(((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ppN.cbM()), ((com.tencent.mm.plugin.profile.ui.newbizinfo.b)localObject).ppN.field_decryptUserName);
      break;
      k = 0;
      break label214;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(23369);
    com.tencent.mm.modelstat.d.b(4, "ContactInfoUI" + bJj(), hashCode());
    com.tencent.mm.aj.z.aeR().d(this);
    super.onPause();
    aw.RS().ae(new ContactInfoUI.5(this));
    if (getIntent().getBooleanExtra("key_from_wesport_right_newtips", false))
    {
      com.tencent.mm.plugin.r.a.bVt();
      com.tencent.mm.ax.d.u(com.tencent.mm.ax.b.fKF, dyi());
    }
    while (true)
    {
      caE();
      if (this.plq != null)
        this.plq.onPause();
      if (((this.plh instanceof c)) || ((this.plh instanceof com.tencent.mm.plugin.profile.ui.newbizinfo.b)))
        this.plh.biV();
      AppMethodBeat.o(23369);
      return;
      if (getIntent().getBooleanExtra("key_from_wesport_plugin_newtips", false))
      {
        com.tencent.mm.plugin.r.a.bVt();
        com.tencent.mm.ax.d.u(com.tencent.mm.ax.b.fKD, dyi());
      }
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(23381);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.ContactInfoUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(23381);
      return;
    }
    ab.i("MicroMsg.ContactInfoUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 19:
    case 82:
    }
    while (true)
    {
      AppMethodBeat.o(23381);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        paramArrayOfString = (NormalUserFooterPreference)this.ehK.aqO("contact_info_footer_normal");
        if (paramArrayOfString != null)
          paramArrayOfString.cbm();
        AppMethodBeat.o(23381);
        break;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0]));
      for (paramInt = 2131301920; ; paramInt = 2131301928)
      {
        if (paramArrayOfInt[0] != 0)
          com.tencent.mm.ui.base.h.a(this, getString(paramInt), getString(2131301936), getString(2131300878), getString(2131297773), false, new ContactInfoUI.9(this), new ContactInfoUI.10(this));
        AppMethodBeat.o(23381);
        break;
      }
      if (paramArrayOfInt[0] == 0)
      {
        paramArrayOfString = (NormalUserFooterPreference)this.ehK.aqO("contact_info_footer_normal");
        if (paramArrayOfString != null)
          paramArrayOfString.cbl();
        AppMethodBeat.o(23381);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(23357);
          ContactInfoUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          AppMethodBeat.o(23357);
        }
      }
      , null);
    }
  }

  protected void onRestart()
  {
    AppMethodBeat.i(23368);
    super.onRestart();
    this.ply = false;
    AppMethodBeat.o(23368);
  }

  public void onResume()
  {
    AppMethodBeat.i(23366);
    com.tencent.mm.modelstat.d.b(3, "ContactInfoUI" + bJj(), hashCode());
    com.tencent.mm.aj.z.aeR().c(this);
    super.onResume();
    Object localObject = ((ViewGroup)this.mController.contentView).getFocusedChild();
    if (localObject != null)
    {
      ((View)localObject).clearFocus();
      ab.i("MicroMsg.ContactInfoUI", "try to clear focus. id:%s", new Object[] { Integer.valueOf(((View)localObject).getId()) });
    }
    this.plo = ((PullDownListView)this.nDp);
    if (this.plq != null)
      this.plq.onResume();
    if (this.ehK != null)
    {
      localObject = (NormalProfileHeaderPreference)this.ehK.aqO("contact_profile_header_normal");
      if (localObject != null)
        ((NormalProfileHeaderPreference)localObject).A(this.pls, this.plw.getHeight());
    }
    if (((this.plh instanceof c)) || ((this.plh instanceof com.tencent.mm.plugin.profile.ui.newbizinfo.b)))
      this.plh.a(this.ehK, this.ehM, this.pli, this.gwP);
    AppMethodBeat.o(23366);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(23384);
    ab.d("MicroMsg.ContactInfoUI", "onSceneEnd errType[%s] errCode[%s] errMsg[%s] sceneType[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramm.getType()) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      paramm.getType();
    AppMethodBeat.o(23384);
  }

  public void onStart()
  {
    AppMethodBeat.i(23367);
    super.onStart();
    if (this.plq != null)
      this.plq.onStart();
    AppMethodBeat.o(23367);
  }

  public void onStop()
  {
    AppMethodBeat.i(23370);
    super.onStop();
    if (this.plq != null)
      this.plq.onStop();
    AppMethodBeat.o(23370);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactInfoUI
 * JD-Core Version:    0.6.2
 */