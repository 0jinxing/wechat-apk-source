package com.tencent.mm.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.oh;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bp;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.VoipAddressUI;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.tools.p;

public final class aa extends p
{
  private static final int[] ypK = { 2, 1, 4, 10, 3, 2147483647 };
  private Context mContext;
  private LayoutInflater mInflater;
  private SparseArray<aa.c> ypG;
  private aa.a ypI;
  z ypJ;

  public aa(AppCompatActivity paramAppCompatActivity)
  {
    super(paramAppCompatActivity);
    AppMethodBeat.i(29845);
    this.ypJ = null;
    this.mContext = paramAppCompatActivity;
    this.mInflater = LayoutInflater.from(paramAppCompatActivity);
    qR(false);
    this.ypJ = z.dyZ();
    AppMethodBeat.o(29845);
  }

  public static aa.d Nu(int paramInt)
  {
    AppMethodBeat.i(29848);
    Object localObject = ah.getContext();
    switch (paramInt)
    {
    default:
      localObject = null;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 2147483647:
    case 2147483645:
    case 22:
    case 2147483646:
    }
    while (true)
    {
      AppMethodBeat.o(29848);
      return localObject;
      if (HomeUI.yiE.booleanValue())
      {
        localObject = new aa.d(1, ((Context)localObject).getString(2131301424), "", 2131231748, 2131690683);
      }
      else
      {
        localObject = new aa.d(1, ((Context)localObject).getString(2131301424), "", 2131231749, 0);
        continue;
        if (HomeUI.yiF.booleanValue())
        {
          localObject = new aa.d(2, ((Context)localObject).getString(2131301427), "", 2131231761, 2131690683);
        }
        else
        {
          localObject = new aa.d(2, ((Context)localObject).getString(2131301427), "", 2131231762, 0);
          continue;
          localObject = new aa.d(3, ((Context)localObject).getString(2131301428), "", 2131231044, 0);
          continue;
          if (1 == bo.getInt(com.tencent.mm.m.g.Nu().getValue("VOIPCallType"), 0))
          {
            localObject = new aa.d(4, ((Context)localObject).getString(2131301429), "", 2131231773, 0);
          }
          else
          {
            localObject = new aa.d(4, ((Context)localObject).getString(2131301425), "", 2131231750, 0);
            continue;
            localObject = new aa.d(5, ((Context)localObject).getString(2131303160), "", 2131231767, 0);
            continue;
            localObject = new aa.d(6, ((Context)localObject).getString(2131303139), "", 2131231758, 0);
            continue;
            localObject = new aa.d(7, ((Context)localObject).getString(2131303141), "", 2131231753, 0);
            continue;
            localObject = new aa.d(8, ((Context)localObject).getString(2131299091), "", 2131231756, 0);
            continue;
            localObject = new aa.d(9, ((Context)localObject).getString(2131303164), "", 2131231765, 0);
            continue;
            localObject = new aa.d(10, ((Context)localObject).getString(2131299813), "", 2131231768, 0);
            continue;
            localObject = new aa.d(11, ((Context)localObject).getString(2131303621), "", 2131231764, 0);
            continue;
            localObject = new aa.d(12, ((Context)localObject).getString(2131300334), "", 2131231760, 0);
            continue;
            localObject = new aa.d(13, ((Context)localObject).getString(2131303452), "", 2131231772, 0);
            continue;
            localObject = new aa.d(14, ((Context)localObject).getString(2131301639), "", 2131231766, 0);
            continue;
            localObject = new aa.d(16, ((Context)localObject).getString(2131303020), "", 2131231775, 0);
            continue;
            localObject = new aa.d(17, ((Context)localObject).getString(2131301406), "", 2131231763, 0);
            continue;
            localObject = new aa.d(18, ((Context)localObject).getString(2131299815), "", 2131231769, 0);
            continue;
            localObject = new aa.d(19, ((Context)localObject).getString(2131299818), "", 2131230731, 0);
            continue;
            aw.ZK();
            if (((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue() > 1)
              break;
            localObject = new aa.d(20, ((Context)localObject).getString(2131296483), "", 2131231856, 0);
            continue;
            localObject = new aa.d(2147483647, ((Context)localObject).getString(2131303091), "", 2131231759, 0);
            continue;
            localObject = new aa.d(2147483645, ((Context)localObject).getString(2131303069), "", 2131231759, 0);
            continue;
            aw.ZK();
            if (((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue() != 8)
              break;
            localObject = new aa.d(22, ((Context)localObject).getString(2131302012), "", 2131231740, 0);
            continue;
            localObject = new aa.d(2147483646, "TIT", "", 2131231753, 0);
          }
        }
      }
    }
  }

  public final BaseAdapter Kw()
  {
    AppMethodBeat.i(29849);
    if (this.ypI == null)
      this.ypI = new aa.a(this, (byte)0);
    aa.a locala = this.ypI;
    AppMethodBeat.o(29849);
    return locala;
  }

  public final boolean gP()
  {
    int i = 0;
    AppMethodBeat.i(29846);
    this.ypJ.pY(false);
    if (this.ypJ.ypG.size() != 0)
      this.ypG = this.ypJ.ypG;
    try
    {
      aw.ZK();
      if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLT, Boolean.FALSE)).booleanValue())
      {
        int j = i;
        Object localObject;
        while (j < this.ypG.size())
        {
          i = ((aa.c)this.ypG.get(j)).ypP.ypS;
          if (i != 2147483646)
          {
            j++;
            continue;
            ab.d("MicroMsg.PlusSubMenuHelper", "dyna plus config is null, we use default one");
            if (this.ypG != null)
              this.ypG.clear();
            while (true)
            {
              for (j = 0; j < ypK.length; j++)
              {
                localObject = new aa.c(Nu(ypK[j]));
                this.ypG.put(j, localObject);
              }
              this.ypG = new SparseArray();
            }
          }
        }
        if (j == this.ypG.size())
        {
          localObject = this.ypG;
          j = this.ypG.size();
          aa.c localc = new com/tencent/mm/ui/aa$c;
          localc.<init>(Nu(2147483646));
          ((SparseArray)localObject).put(j, localc);
        }
      }
      label231: if (this.ypI != null)
        this.ypI.notifyDataSetChanged();
      boolean bool = super.gP();
      AppMethodBeat.o(29846);
      return bool;
    }
    catch (Exception localException)
    {
      break label231;
    }
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = 1;
    boolean bool1 = false;
    AppMethodBeat.i(29847);
    if ((this.mContext instanceof AppCompatActivity))
      ((AppCompatActivity)this.mContext).supportInvalidateOptionsMenu();
    int j = ((aa.c)this.ypG.get(paramInt)).ypP.ypS;
    com.tencent.mm.plugin.report.service.h.pYm.e(11104, new Object[] { Integer.valueOf(j) });
    if (com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.widget.recentview.d.class) != null)
      ((com.tencent.mm.plugin.appbrand.widget.recentview.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.widget.recentview.d.class)).aOC();
    switch (j)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
      while (true)
      {
        this.ypJ.Nt(j);
        dismiss();
        AppMethodBeat.o(29847);
        return;
        new Intent().putExtra("invite_friend_scene", 2);
        com.tencent.mm.bp.d.b(this.mContext, "subapp", ".ui.pluginapp.AddMoreFriendsUI", new Intent());
        continue;
        paramAdapterView = new Intent(this.mContext, SelectContactUI.class);
        paramAdapterView.putExtra("titile", this.mContext.getString(2131296484));
        paramAdapterView.putExtra("list_type", 0);
        paramAdapterView.putExtra("list_attr", s.C(new int[] { s.znG, 256, 512 }));
        paramAdapterView.putExtra("scene", 7);
        this.mContext.startActivity(paramAdapterView);
        continue;
        paramAdapterView = new Intent();
        paramAdapterView.setClassName(this.mContext, "com.tencent.mm.ui.tools.ShareImageRedirectUI");
        this.mContext.startActivity(paramAdapterView);
        continue;
        paramAdapterView = new sz();
        paramAdapterView.cPf.cPh = true;
        com.tencent.mm.sdk.b.a.xxA.m(paramAdapterView);
        paramAdapterView = paramAdapterView.cPg.cPj;
        if (!bo.isNullOrNil(paramAdapterView))
        {
          ab.v("MicroMsg.PlusSubMenuHelper", "Talkroom is on: ".concat(String.valueOf(paramAdapterView)));
          com.tencent.mm.ui.base.h.d(this.mContext, this.mContext.getString(2131303996), "", this.mContext.getString(2131296994), this.mContext.getString(2131296868), new aa.1(this), new aa.2(this));
        }
        else
        {
          VoipAddressUI.hX(this.mContext);
          continue;
          aw.ZK();
          if (!com.tencent.mm.model.c.isSDCardAvailable())
          {
            t.hO(this.mContext);
          }
          else
          {
            aw.ZK();
            paramView = (String)com.tencent.mm.model.c.Ry().get(2, null);
            paramAdapterView = new Intent();
            paramAdapterView.putExtra("sns_userName", paramView);
            paramAdapterView.setFlags(536870912);
            paramAdapterView.addFlags(67108864);
            aw.ZK();
            paramInt = bo.a((Integer)com.tencent.mm.model.c.Ry().get(68389, null), 0);
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(68389, Integer.valueOf(paramInt + 1));
            paramAdapterView.putExtra("sns_adapter_type", 1);
            com.tencent.mm.bp.d.b(this.mContext, "sns", ".ui.SnsTimeLineUserPagerUI", paramAdapterView);
            continue;
            b.b(this.mContext, ".ui.FavoriteIndexUI", new Intent());
            continue;
            com.tencent.mm.bp.d.b(this.mContext, "mall", ".ui.MallIndexUI", new Intent());
            continue;
            paramAdapterView = new Intent();
            paramAdapterView.putExtra("preceding_scence", 2);
            com.tencent.mm.bp.d.b(this.mContext, "emoji", ".ui.v2.EmojiStoreV2UI", paramAdapterView);
            continue;
            com.tencent.mm.bp.d.b(this.mContext, "setting", ".ui.setting.SelfQRCodeUI", new Intent());
            continue;
            com.tencent.mm.plugin.report.service.h.pYm.e(11265, new Object[] { Integer.valueOf(3) });
            if ((!com.tencent.mm.r.a.bI(this.mContext)) && (!com.tencent.mm.bg.e.akI()))
            {
              com.tencent.mm.bp.d.H(this.mContext, "scanner", ".ui.BaseScanUI");
              continue;
              aw.ZK();
              if (com.tencent.mm.model.c.isSDCardAvailable())
                break;
              t.hO(this.mContext);
            }
          }
        }
      }
      com.tencent.mm.plugin.report.service.g.BN(10);
      aw.ZK();
      paramView = (String)com.tencent.mm.model.c.Ry().get(68377, null);
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(68377, "");
      paramAdapterView = new Intent();
      paramAdapterView.putExtra("sns_timeline_NeedFirstLoadint", true);
      if (bo.isNullOrNil(paramView))
        break;
    case 12:
    case 13:
    case 14:
    case 16:
    case 17:
    case 18:
    case 19:
    case 2147483647:
    case 2147483645:
    case 20:
    case 22:
    case 2147483646:
    }
    for (boolean bool2 = false; ; bool2 = true)
    {
      if (n.qFz != null)
        if (n.qFz.baS() > 0)
          bool2 = bool1;
      while (true)
      {
        paramAdapterView.putExtra("sns_resume_state", bool2);
        com.tencent.mm.bp.d.b(this.mContext, "sns", ".ui.SnsTimeLineUI", paramAdapterView);
        break;
        continue;
        aw.ZK();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          t.hO(this.mContext);
          break;
        }
        com.tencent.mm.bp.d.H(this.mContext, "game", ".ui.GameCenterUI");
        new ak().postDelayed(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(29841);
            com.tencent.mm.cj.c.aNX();
            AppMethodBeat.o(29841);
          }
        }
        , 100L);
        break;
        com.tencent.mm.sdk.b.a.xxA.m(new oh());
        com.tencent.mm.bp.d.H(this.mContext, "shake", ".ui.ShakeReportUI");
        break;
        aw.ZK();
        if (!bo.e((Boolean)com.tencent.mm.model.c.Ry().get(4103, null)))
        {
          com.tencent.mm.bp.d.H(this.mContext, "nearby", ".ui.NearbyFriendsIntroUI");
          break;
        }
        paramAdapterView = bp.aap();
        if (paramAdapterView == null)
        {
          com.tencent.mm.bp.d.H(this.mContext, "nearby", ".ui.NearbyPersonalInfoUI");
          break;
        }
        paramView = bo.nullAsNil(paramAdapterView.getProvince());
        paramInt = bo.a(Integer.valueOf(paramAdapterView.dtS), 0);
        if ((bo.isNullOrNil(paramView)) || (paramInt == 0))
        {
          com.tencent.mm.bp.d.H(this.mContext, "nearby", ".ui.NearbyPersonalInfoUI");
          break;
        }
        aw.ZK();
        paramAdapterView = (Boolean)com.tencent.mm.model.c.Ry().get(4104, null);
        if ((paramAdapterView == null) || (!paramAdapterView.booleanValue()))
        {
          paramAdapterView = LauncherUI.getInstance();
          if (paramAdapterView != null)
            paramAdapterView.yjJ.getMainTabUI().aqG("tab_find_friend");
          com.tencent.mm.bn.a.fy(this.mContext);
          break;
        }
        paramAdapterView = View.inflate(this.mContext, 2130969930, null);
        paramView = (CheckBox)paramAdapterView.findViewById(2131825250);
        paramView.setChecked(false);
        com.tencent.mm.ui.base.h.a(this.mContext, this.mContext.getString(2131297061), paramAdapterView, new aa.4(this, paramView), null);
        break;
        aw.ZK();
        if (com.tencent.mm.model.c.XI())
        {
          com.tencent.mm.bp.d.H(this.mContext, "webwx", ".ui.WebWXLogoutUI");
          break;
        }
        com.tencent.mm.bp.d.H(this.mContext, "webwx", ".ui.WebWeiXinIntroductionUI");
        break;
        if ((r.YK() & 0x10000) == 0);
        for (paramInt = i; ; paramInt = 0)
        {
          if (paramInt == 0)
            break label1421;
          com.tencent.mm.bp.d.H(this.mContext, "masssend", ".ui.MassSendHistoryUI");
          break;
        }
        label1421: com.tencent.mm.bp.d.b(this.mContext, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", "masssendapp"));
        break;
        com.tencent.mm.bp.d.H(this.mContext, "radar", ".ui.RadarSearchUI");
        break;
        com.tencent.mm.bp.d.H(this.mContext, "pwdgroup", ".ui.FacingCreateChatRoomAllInOneUI");
        break;
        com.tencent.mm.plugin.report.service.h.pYm.X(10919, "1-6");
        com.tencent.mm.pluginsdk.e.fC(this.mContext);
        break;
        paramAdapterView = new Intent();
        aw.ZK();
        paramView = (String)com.tencent.mm.model.c.Ry().get(ac.a.xRH, "");
        if (!bo.isNullOrNil(paramView))
        {
          paramAdapterView.putExtra("rawUrl", paramView);
          paramAdapterView.putExtra("showShare", true);
          paramAdapterView.putExtra("show_bottom", false);
          com.tencent.mm.bp.d.b(this.mContext, "webview", ".ui.tools.WebViewUI", paramAdapterView);
          break;
        }
        com.tencent.mm.pluginsdk.e.fC(this.mContext);
        break;
        paramView = this.mContext;
        paramAdapterView = new Intent();
        paramAdapterView.putExtra("key_from_scene", 2);
        com.tencent.mm.bp.d.b(paramView, "offline", ".ui.WalletOfflineEntranceUI", paramAdapterView);
        if (!com.tencent.mm.x.c.PK().bY(262159, 266248))
          break;
        com.tencent.mm.x.c.PK().bZ(262159, 266248);
        com.tencent.mm.plugin.report.service.h.pYm.e(14396, new Object[] { Integer.valueOf(2) });
        break;
        com.tencent.mm.pluginsdk.wallet.h.ai(this.mContext, 1);
        break;
        paramAdapterView = new Intent();
        paramAdapterView.putExtra("key_from_scene", 2);
        com.tencent.mm.bp.d.b(this.mContext, "offline", ".ui.WalletOfflineEntranceUI", paramAdapterView);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.aa
 * JD-Core Version:    0.6.2
 */