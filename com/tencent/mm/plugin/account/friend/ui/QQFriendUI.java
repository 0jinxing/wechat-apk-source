package com.tencent.mm.plugin.account.friend.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.mx;
import com.tencent.mm.g.a.mx.b;
import com.tencent.mm.plugin.account.friend.a.ac;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.plugin.account.friend.a.k;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.amw;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class QQFriendUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private int Zb;
  private ProgressDialog ehJ = null;
  private com.tencent.mm.ui.tools.o elS;
  private ListView gtT;
  String gtX;
  private TextView gtY = null;
  d gxU;
  private boolean gxV = false;

  public final int getLayoutId()
  {
    return 2130970419;
  }

  public final void initView()
  {
    AppMethodBeat.i(108624);
    this.gtT = ((ListView)findViewById(2131826675));
    this.gtY = ((TextView)findViewById(2131826676));
    this.gtY.setText(2131302055);
    this.elS = new com.tencent.mm.ui.tools.o((byte)0);
    this.elS.zHa = new QQFriendUI.2(this);
    a(this.elS);
    String str;
    int i;
    if (com.tencent.mm.model.a.g.aaK().oP("2") != null)
    {
      str = com.tencent.mm.model.a.g.aaK().oP("2").value;
      if (str.equals("0"))
      {
        i = 0;
        com.tencent.mm.model.a.f.oT("2");
      }
    }
    while (true)
    {
      if (i == 0);
      for (this.gxU = new e(this, this.Zb); ; this.gxU = new f(this, this.Zb))
      {
        this.gxU.a(new QQFriendUI.3(this));
        this.gtT.setAdapter(this.gxU);
        this.gtT.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            AppMethodBeat.i(108616);
            if (paramAnonymousInt < QQFriendUI.c(QQFriendUI.this).getHeaderViewsCount())
              AppMethodBeat.o(108616);
            while (true)
            {
              return;
              paramAnonymousInt -= QQFriendUI.c(QQFriendUI.this).getHeaderViewsCount();
              ab.i("MicroMsg.QQFriendUI", "realpostion is:%d headerViewscount:%d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(QQFriendUI.c(QQFriendUI.this).getHeaderViewsCount()) });
              paramAnonymousView = (ao)QQFriendUI.d(QQFriendUI.this).getItem(paramAnonymousInt);
              if (QQFriendUI.this.getIntent().getBooleanExtra("qqgroup_sendmessage", false))
              {
                paramAnonymousAdapterView = new mx();
                paramAnonymousAdapterView.cIO.opType = 0;
                paramAnonymousAdapterView.cIO.cIQ = (paramAnonymousView.gwC + "@qqim");
                paramAnonymousAdapterView.cIO.cIR = paramAnonymousView.getDisplayName();
                com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousAdapterView);
                if (paramAnonymousAdapterView.cIP.cvi)
                {
                  paramAnonymousAdapterView = new Intent();
                  paramAnonymousAdapterView.putExtra("Chat_User", paramAnonymousView.gwC + "@qqim");
                  paramAnonymousAdapterView.putExtra("key_need_send_video", false);
                  com.tencent.mm.plugin.account.a.a.gkE.d(paramAnonymousAdapterView, QQFriendUI.this);
                }
                AppMethodBeat.o(108616);
              }
              else if ((paramAnonymousView.gwD == 1) || (paramAnonymousView.gwD == 2))
              {
                paramAnonymousAdapterView = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramAnonymousView.getUsername());
                if ((paramAnonymousAdapterView != null) && (paramAnonymousAdapterView.dsf()))
                  com.tencent.mm.plugin.report.service.h.pYm.X(10298, paramAnonymousView.getUsername() + ",12");
                Intent localIntent = new Intent();
                localIntent.putExtra("Contact_User", paramAnonymousView.getUsername());
                localIntent.putExtra("Contact_Nick", paramAnonymousView.Hs());
                localIntent.putExtra("Contact_Uin", paramAnonymousView.gwC);
                localIntent.putExtra("Contact_QQNick", paramAnonymousView.getDisplayName());
                localIntent.putExtra("Contact_Scene", 12);
                localIntent.putExtra("Contact_RemarkName", paramAnonymousView.aqr());
                paramAnonymousAdapterView = (k)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getFrdExtStg();
                Object localObject = paramAnonymousView.getUsername();
                localObject = "select friend_ext.username,friend_ext.sex,friend_ext.personalcard,friend_ext.province,friend_ext.city,friend_ext.signature from friend_ext   where friend_ext.username = \"" + bo.vA(String.valueOf(localObject)) + "\"";
                localObject = paramAnonymousAdapterView.fni.a((String)localObject, null, 2);
                if (localObject == null)
                  paramAnonymousAdapterView = null;
                while (true)
                {
                  if (paramAnonymousAdapterView != null)
                    localIntent.putExtra("Contact_Sex", paramAnonymousAdapterView.dtS);
                  localIntent.putExtra("Contact_ShowUserName", false);
                  if (!bo.isNullOrNil(paramAnonymousView.getUsername()))
                    break label643;
                  ab.e("MicroMsg.QQFriendUI", "username is null. can't start contact ui. friend is:%s", new Object[] { paramAnonymousView.toString() });
                  AppMethodBeat.o(108616);
                  break;
                  paramAnonymousAdapterView = null;
                  if (((Cursor)localObject).moveToFirst())
                  {
                    paramAnonymousAdapterView = new com.tencent.mm.plugin.account.friend.a.j();
                    paramAnonymousAdapterView.username = ((Cursor)localObject).getString(0);
                    paramAnonymousAdapterView.dtS = ((Cursor)localObject).getInt(1);
                    paramAnonymousAdapterView.dub = ((Cursor)localObject).getInt(2);
                    paramAnonymousAdapterView.duc = ((Cursor)localObject).getString(3);
                    paramAnonymousAdapterView.dud = ((Cursor)localObject).getString(4);
                    paramAnonymousAdapterView.signature = ((Cursor)localObject).getString(5);
                  }
                  ((Cursor)localObject).close();
                }
                label643: com.tencent.mm.plugin.account.a.a.gkE.c(localIntent, QQFriendUI.this);
                AppMethodBeat.o(108616);
              }
              else
              {
                if (paramAnonymousView.gwD == 0)
                {
                  paramAnonymousAdapterView = new Intent(QQFriendUI.this, InviteFriendUI.class);
                  paramAnonymousAdapterView.putExtra("friend_type", 0);
                  paramAnonymousAdapterView.putExtra("friend_user_name", paramAnonymousView.getUsername());
                  paramAnonymousAdapterView.putExtra("friend_num", paramAnonymousView.gwC);
                  paramAnonymousAdapterView.putExtra("friend_nick", paramAnonymousView.getDisplayName());
                  paramAnonymousAdapterView.putExtra("friend_weixin_nick", paramAnonymousView.Hs());
                  paramAnonymousAdapterView.putExtra("friend_scene", 12);
                  QQFriendUI.this.startActivity(paramAnonymousAdapterView);
                }
                AppMethodBeat.o(108616);
              }
            }
          }
        });
        ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a(this.gxU);
        setBackBtn(new QQFriendUI.5(this));
        new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(108618);
            BackwardSupportUtil.c.a(QQFriendUI.c(QQFriendUI.this));
            AppMethodBeat.o(108618);
          }
        };
        AppMethodBeat.o(108624);
        return;
        if (!str.equals("1"))
          break label258;
        i = 1;
        break;
      }
      label258: i = 1;
      break;
      i = 1;
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(108625);
    ab.d("MicroMsg.QQFriendUI", "onConfigurationChanged: orientation = " + paramConfiguration.orientation);
    super.onConfigurationChanged(paramConfiguration);
    AppMethodBeat.o(108625);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(108619);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Rg().a(143, this);
    paramBundle = getIntent().getStringExtra("qqgroup_name");
    this.Zb = getIntent().getIntExtra("qqgroup_id", -1);
    Object localObject1 = (ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg();
    int i = this.Zb;
    ab.d("MicroMsg.QQListStorage", "delete: GroupID:".concat(String.valueOf(i)));
    Object localObject2 = "update qqlist set reserved4=0 where groupid=".concat(String.valueOf(i));
    ((ap)localObject1).fni.hY("qqlist", (String)localObject2);
    if (l.mX(this.Zb))
    {
      localObject2 = new ac(this.Zb);
      com.tencent.mm.kernel.g.Rg().a((m)localObject2, 0);
      localObject1 = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject1, getString(2131302046), true, new QQFriendUI.1(this, (ac)localObject2));
    }
    setMMTitle(paramBundle);
    initView();
    AppMethodBeat.o(108619);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(108621);
    com.tencent.mm.model.a.f.oU("2");
    ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).b(this.gxU);
    com.tencent.mm.kernel.g.Rg().b(143, this);
    this.gxU.bIf();
    com.tencent.mm.ah.o.acv().cancel();
    super.onDestroy();
    AppMethodBeat.o(108621);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(108623);
    ab.v("MicroMsg.QQFriendUI", "qq friend onKeyDown");
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(108623);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(108622);
    com.tencent.mm.ah.o.acd().e(this.gxU);
    super.onPause();
    AppMethodBeat.o(108622);
  }

  public void onResume()
  {
    AppMethodBeat.i(108620);
    super.onResume();
    com.tencent.mm.ah.o.acd().d(this.gxU);
    this.gxU.notifyDataSetChanged();
    AppMethodBeat.o(108620);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(108626);
    ab.i("MicroMsg.QQFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (((amw)((ac)paramm).ehh.fsG.fsP).nbk != 1)
      AppMethodBeat.o(108626);
    while (true)
    {
      return;
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.gxU.KC();
        AppMethodBeat.o(108626);
      }
      else
      {
        Toast.makeText(this, 2131302045, 0).show();
        AppMethodBeat.o(108626);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.QQFriendUI
 * JD-Core Version:    0.6.2
 */