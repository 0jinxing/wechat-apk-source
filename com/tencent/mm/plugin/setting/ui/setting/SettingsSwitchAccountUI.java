package com.tencent.mm.plugin.setting.ui.setting;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.gj;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.bx;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.account.ui.LoginPasswordUI;
import com.tencent.mm.plugin.account.ui.LoginVoiceUI;
import com.tencent.mm.plugin.account.ui.MobileInputUI;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.4;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.5;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.6;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.a;
import com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.ayx;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class SettingsSwitchAccountUI extends MMActivity
  implements f
{
  private String gCZ;
  private TextView gqX;
  private SwitchAccountGridView qkN;
  private Map<String, SwitchAccountModel> qkR;
  private boolean qnu;
  private TextView qpa;
  private View qpb;
  private View qpc;
  private TextView qpd;
  private ValueAnimator qpe;
  private ap qpf;
  private boolean qpg;
  private boolean qph;
  private int scene;
  private TextView titleView;

  public SettingsSwitchAccountUI()
  {
    AppMethodBeat.i(127509);
    this.qkR = new HashMap();
    AppMethodBeat.o(127509);
  }

  private void Wx(String paramString)
  {
    AppMethodBeat.i(127514);
    Object localObject = (SwitchAccountModel)this.qkR.get(paramString);
    if ((localObject != null) && (!this.qpg))
    {
      this.qpg = true;
      localObject = new com.tencent.mm.modelsimple.q(paramString, ((SwitchAccountModel)localObject).username, ((SwitchAccountModel)localObject).qjL, "");
      g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
      this.qkN.setSwitchToWxUsername(paramString);
      this.qkN.cjt();
      cjc();
    }
    AppMethodBeat.o(127514);
  }

  private static void aa(Map<String, SwitchAccountModel> paramMap)
  {
    AppMethodBeat.i(127512);
    if (paramMap.size() == 2)
    {
      String[] arrayOfString = new String[2];
      Iterator localIterator = paramMap.values().iterator();
      for (int i = 0; localIterator.hasNext(); i++)
        arrayOfString[i] = ((SwitchAccountModel)localIterator.next()).username;
      if ((!bo.Q(new String[] { arrayOfString[0], arrayOfString[1] })) && (arrayOfString[0].equals(arrayOfString[1])))
      {
        localIterator = paramMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          paramMap = (String)localIterator.next();
          bx.fnB.oK(paramMap);
        }
        paramMap = new NullPointerException(String.format("tow accounts have the same username!!! , %s, %s", new Object[] { arrayOfString[0], arrayOfString[1] }));
        AppMethodBeat.o(127512);
        throw paramMap;
      }
    }
    AppMethodBeat.o(127512);
  }

  private void cjb()
  {
    AppMethodBeat.i(138712);
    this.qpe = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.qpe.addUpdateListener(new SettingsSwitchAccountUI.5(this));
    this.qpe.addListener(new SettingsSwitchAccountUI.6(this));
    this.qpe.setDuration(500L);
    AppMethodBeat.o(138712);
  }

  private void cjc()
  {
    AppMethodBeat.i(127515);
    if (this.qpg)
    {
      this.qpa.setVisibility(8);
      AppMethodBeat.o(127515);
    }
    while (true)
    {
      return;
      if ((this.qkR.size() <= 1) && (this.scene == 0))
      {
        this.qpa.setVisibility(8);
        this.qnu = false;
        this.qkN.setDeleteState(false);
        AppMethodBeat.o(127515);
      }
      else if (!this.qnu)
      {
        this.titleView.setText(2131303294);
        this.qpd.setVisibility(8);
        this.qpa.setText(getString(2131303292));
        this.qpa.setOnClickListener(new SettingsSwitchAccountUI.7(this));
        AppMethodBeat.o(127515);
      }
      else
      {
        this.titleView.setText(2131303292);
        this.qpd.setVisibility(0);
        if (this.qph)
        {
          this.qpa.setText(getString(2131296944));
          this.qpa.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(127506);
              SettingsSwitchAccountUI.b(SettingsSwitchAccountUI.this, false);
              SettingsSwitchAccountUI.a(SettingsSwitchAccountUI.this, false);
              SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).setDeleteState(false);
              SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).cjt();
              SettingsSwitchAccountUI.e(SettingsSwitchAccountUI.this);
              if (SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).getAccountCount() == 0)
              {
                if (bx.fnB.aat().size() <= 1)
                  break label172;
                com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(11), bx.fnB.aau() });
              }
              while (true)
              {
                paramAnonymousView = com.tencent.mm.plugin.account.a.a.gkE.bh(SettingsSwitchAccountUI.this);
                paramAnonymousView.addFlags(67108864);
                SettingsSwitchAccountUI.this.startActivity(paramAnonymousView);
                SettingsSwitchAccountUI.this.finish();
                com.tencent.mm.ui.base.b.hM(SettingsSwitchAccountUI.this);
                SettingsSwitchAccountUI.g(SettingsSwitchAccountUI.this);
                AppMethodBeat.o(127506);
                return;
                label172: com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(11), bx.fnB.aau() });
              }
            }
          });
          AppMethodBeat.o(127515);
        }
        else
        {
          this.qpa.setText(getString(2131296868));
          this.qpa.setOnClickListener(new SettingsSwitchAccountUI.9(this));
          AppMethodBeat.o(127515);
        }
      }
    }
  }

  private void cjd()
  {
    AppMethodBeat.i(127523);
    if (com.tencent.mm.kernel.a.jP(g.RN().eIV))
    {
      localObject = new com.tencent.mm.modelsimple.ab(2);
      g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    }
    Object localObject = new com.tencent.mm.modelsimple.p();
    g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    this.qkN.setLogoutState(true);
    this.qkN.cjt();
    if (this.qpf == null)
    {
      this.qpf = new ap(Looper.getMainLooper(), new ap.a()
      {
        public final boolean BI()
        {
          AppMethodBeat.i(138705);
          SettingsSwitchAccountUI.i(SettingsSwitchAccountUI.this);
          AppMethodBeat.o(138705);
          return false;
        }
      }
      , false);
      this.qpf.ae(8000L, 8000L);
    }
    AppMethodBeat.o(127523);
  }

  private void cje()
  {
    AppMethodBeat.i(127524);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "switch account logout");
    com.tencent.mm.plugin.setting.b.gkF.BY();
    this.gqX.setVisibility(8);
    this.qpa.setVisibility(8);
    Object localObject = new jl();
    ((jl)localObject).cEK.status = 0;
    ((jl)localObject).cEK.boZ = 0;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new com.tencent.mm.g.a.z();
    ((com.tencent.mm.g.a.z)localObject).csU.csV = true;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    aj.amB("show_whatsnew");
    com.tencent.mm.kernel.l.m(this, true);
    w.I(this, null);
    if (g.RK())
    {
      localObject = com.tencent.mm.ah.b.pX(com.tencent.mm.model.r.Yz());
      av.fly.ou((String)localObject);
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "last login username in sp %s", new Object[] { av.fly.T("login_user_name", "") });
    localObject = com.tencent.mm.model.r.Zg();
    if (bo.isNullOrNil((String)((Map)localObject).get("login_user_name")))
      ((Map)localObject).put("login_user_name", av.fly.T("login_user_name", ""));
    bx.fnB.g(com.tencent.mm.model.r.Yz(), (Map)localObject);
    ah.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", true).commit();
    localObject = new Intent();
    ((Intent)localObject).addFlags(67108864);
    ((Intent)localObject).putExtra("Intro_Switch", true);
    ((Intent)localObject).putExtra("key_transit_to_switch_account", true);
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.qkR.values());
    ((Intent)localObject).putParcelableArrayListExtra("key_switch_account_users", localArrayList);
    com.tencent.mm.plugin.setting.b.gkE.p((Intent)localObject, this);
    finish();
    com.tencent.mm.ui.base.b.hN(this);
    AppMethodBeat.o(127524);
  }

  private void goBack()
  {
    AppMethodBeat.i(127519);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "go back");
    if ((this.scene == 2) || (this.scene == 1))
    {
      Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
      com.tencent.mm.ui.base.b.hM(this);
      this.qpg = false;
      AppMethodBeat.o(127519);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(127519);
    }
  }

  private static void logout()
  {
    AppMethodBeat.i(127522);
    if ((g.Rg() != null) && (g.Rg().ftA != null))
      g.Rg().ftA.cG(false);
    Object localObject = new gj();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    g.RN();
    com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SettingsSwitchAccountUI", "dklogout User LOGOUT Now uin:%d , clear cookie", new Object[] { Integer.valueOf(com.tencent.mm.kernel.a.QF()) });
    com.tencent.mm.modelstat.c.akc().commitNow();
    ((com.tencent.mm.plugin.expt.a.c)g.K(com.tencent.mm.plugin.expt.a.c.class)).logout();
    localObject = new com.tencent.mm.modelsimple.r(2);
    ((com.tencent.mm.modelsimple.r)localObject).fPr = 1;
    g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    AppMethodBeat.o(127522);
  }

  public final int getLayoutId()
  {
    return 2130970644;
  }

  public final void initView()
  {
    AppMethodBeat.i(127511);
    setMMTitle("");
    dyf();
    getSupportActionBar().hide();
    this.scene = getIntent().getIntExtra("key_scene", 0);
    this.qpb = findViewById(2131827429);
    this.qpc = findViewById(2131827428);
    this.titleView = ((TextView)findViewById(2131827432));
    this.qpd = ((TextView)findViewById(2131827431));
    this.qpa = ((TextView)findViewById(2131827434));
    this.gqX = ((TextView)findViewById(2131827427));
    this.qkN = ((SwitchAccountGridView)findViewById(2131827433));
    this.qkN.setRowCount(1);
    this.qkN.setOnClickAvatarListener(new SwitchAccountGridView.b()
    {
      public final void Wy(String paramAnonymousString)
      {
        AppMethodBeat.i(138704);
        if (!bo.isNullOrNil(paramAnonymousString))
          if (SettingsSwitchAccountUI.a(SettingsSwitchAccountUI.this) == 0)
          {
            SettingsSwitchAccountUI.a(SettingsSwitchAccountUI.this, paramAnonymousString);
            AppMethodBeat.o(138704);
          }
        while (true)
        {
          return;
          SettingsSwitchAccountUI.b(SettingsSwitchAccountUI.this, paramAnonymousString);
          AppMethodBeat.o(138704);
          continue;
          ah.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putString("last_switch_account_to_wx_username", "").commit();
          if (SettingsSwitchAccountUI.a(SettingsSwitchAccountUI.this) == 0)
          {
            SettingsSwitchAccountUI.cjf();
            AppMethodBeat.o(138704);
          }
          else
          {
            paramAnonymousString = new Intent(SettingsSwitchAccountUI.this, MobileInputUI.class);
            paramAnonymousString.putExtra("mobile_input_purpose", 1);
            paramAnonymousString.putExtra("from_switch_account", true);
            SettingsSwitchAccountUI.this.startActivity(paramAnonymousString);
            com.tencent.mm.ui.base.b.hK(SettingsSwitchAccountUI.this);
            AppMethodBeat.o(138704);
          }
        }
      }
    });
    Object localObject1;
    label210: Object localObject2;
    Object localObject3;
    if (this.scene == 0)
    {
      this.gqX.setOnClickListener(new SettingsSwitchAccountUI.3(this));
      localObject1 = bx.fnB.aat();
      g.RN();
      if (!com.tencent.mm.kernel.a.QX())
        break label543;
      this.gCZ = ((String)g.RP().Ry().get(2, null));
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "scene %d， lastLoginWxUsername %s", new Object[] { Integer.valueOf(this.scene), this.gCZ });
      if ((bo.isNullOrNil(this.gCZ)) || (((Set)localObject1).contains(this.gCZ)))
        break label561;
      if ((this.scene != 2) || (bx.fnB.oM(this.gCZ)))
      {
        localObject1 = av.fly.T("login_user_name", "");
        localObject2 = av.fly.ZC();
        localObject3 = av.fly.T("last_login_use_voice", "");
        localObject1 = new SwitchAccountModel(this.gCZ, (String)localObject1, (String)localObject2, "", bo.ank((String)localObject3));
        this.qkR.put(this.gCZ, localObject1);
      }
      label349: if (this.qkR.size() == 0)
      {
        localObject1 = new Intent(this, MobileInputUI.class);
        ((Intent)localObject1).putExtra("mobile_input_purpose", 1);
        ((Intent)localObject1).putExtra("can_finish", true);
        startActivity((Intent)localObject1);
        finish();
        com.tencent.mm.ui.base.b.hN(this);
      }
      aa(this.qkR);
      this.qkN.ab(this.qkR);
      if (this.scene != 1)
        break label718;
      localObject1 = ah.getContext().getSharedPreferences("switch_account_preferences", 0).getString("last_switch_account_to_wx_username", "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "switch to %s", new Object[] { localObject1 });
      if (bo.isNullOrNil((String)localObject1))
        break label671;
      g.RN();
      if (!com.tencent.mm.kernel.a.QX())
        break label663;
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.SettingsSwitchAccountUI", "already login ,quit");
      finish();
    }
    while (true)
    {
      this.qkN.cjt();
      cjc();
      this.qkN.setOnDeleteAvatarListener(new SettingsSwitchAccountUI.4(this));
      cjb();
      AppMethodBeat.o(127511);
      return;
      this.gqX.setVisibility(8);
      break;
      label543: this.gCZ = av.fly.T("login_weixin_username", "");
      break label210;
      label561: if (((Set)localObject1).isEmpty())
        break label349;
      localObject3 = ((Set)localObject1).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = (String)((Iterator)localObject3).next();
        localObject2 = new SwitchAccountModel((String)localObject1, bx.fnB.getString((String)localObject1, "login_user_name"), bx.fnB.getString((String)localObject1, "last_avatar_path"), bx.fnB.getString((String)localObject1, "last_logout_no_pwd_ticket"), bo.ank(bx.fnB.getString((String)localObject1, "last_login_use_voice")));
        this.qkR.put(localObject1, localObject2);
      }
      break label349;
      label663: Wx((String)localObject1);
      continue;
      label671: this.qpg = false;
      localObject1 = new Intent(this, MobileInputUI.class);
      ((Intent)localObject1).putExtra("mobile_input_purpose", 1);
      ((Intent)localObject1).putExtra("from_switch_account", true);
      startActivity((Intent)localObject1);
      com.tencent.mm.ui.base.b.hK(this);
      continue;
      label718: if (this.scene == 0)
        this.qkN.setLastLoginWxUsername(this.gCZ);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(127521);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 701) && (paramInt2 == -1))
      cjd();
    AppMethodBeat.o(127521);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127510);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127510);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(127513);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(127513);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(127513);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(127516);
    super.onResume();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "onResume");
    if ((this.scene == 1) || (this.scene == 2))
    {
      g.Rg().a(701, this);
      g.Rg().a(252, this);
    }
    if (this.scene == 0)
    {
      g.Rg().a(281, this);
      g.Rg().a(282, this);
      g.Rg().a(255, this);
    }
    this.qkN.cjt();
    cjc();
    if (((this.scene == 1) || (this.scene == 2)) && (g.RK()) && (g.RN().eJb))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "account initialized");
      this.qpg = true;
      Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
      localIntent.addFlags(67108864);
      startActivity(localIntent);
      finish();
      com.tencent.mm.ui.base.b.hM(this);
    }
    AppMethodBeat.o(127516);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(127518);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "errCode %d, errMsg %s, scene %s, type  %d, this %s", new Object[] { Integer.valueOf(paramInt2), paramString, paramm, Integer.valueOf(paramm.getType()), this });
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((paramm.getType() == 252) || (paramm.getType() == 701))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label456;
      this.qpb.setVisibility(4);
      this.qpc.setVisibility(4);
      localObject1 = this.qkN;
      if (!((SwitchAccountGridView)localObject1).qrd)
      {
        if ((((SwitchAccountGridView)localObject1).qre == null) && (!bo.isNullOrNil(((SwitchAccountGridView)localObject1).qrc)))
        {
          int i = Math.min(2, ((SwitchAccountGridView)localObject1).qrf.size());
          localObject2 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
          ((ValueAnimator)localObject2).addUpdateListener(new SwitchAccountGridView.4((SwitchAccountGridView)localObject1, i));
          ((ValueAnimator)localObject2).setDuration(200L);
          localObject3 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
          ((ValueAnimator)localObject2).addUpdateListener(new SwitchAccountGridView.5((SwitchAccountGridView)localObject1, i));
          ((ValueAnimator)localObject3).setDuration(300L);
          ((SwitchAccountGridView)localObject1).qre = new AnimatorSet();
          ((SwitchAccountGridView)localObject1).qre.addListener(new SwitchAccountGridView.6((SwitchAccountGridView)localObject1));
          ((SwitchAccountGridView)localObject1).qre.playSequentially(new Animator[] { localObject2, localObject3 });
        }
        if (((SwitchAccountGridView)localObject1).qre != null)
        {
          ((SwitchAccountGridView)localObject1).qrd = true;
          ((SwitchAccountGridView)localObject1).qre.start();
        }
      }
      com.tencent.mm.kernel.a.unhold();
      com.tencent.mm.plugin.account.friend.a.l.apX();
      w.cm(this);
      if (bx.fnB.aat().size() > 1)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(0), bx.fnB.aau() });
        this.qkN.setOnAnimatorEndListener(new SwitchAccountGridView.a()
        {
          public final void cjg()
          {
            AppMethodBeat.i(138711);
            String str = com.tencent.mm.model.r.Yz();
            SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).setLastLoginWxUsername(str);
            SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).setSwitchToWxUsername("");
            SettingsSwitchAccountUI.d(SettingsSwitchAccountUI.this).cjt();
            SettingsSwitchAccountUI.h(SettingsSwitchAccountUI.this).start();
            AppMethodBeat.o(138711);
          }
        });
      }
    }
    else
    {
      label375: if (paramm.getType() != 255)
        break label893;
      if (((com.tencent.mm.modelsimple.r)paramm).fPs != 2)
        break label1037;
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label716;
      cjd();
      AppMethodBeat.o(127518);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(0), bx.fnB.aau() });
      break;
      label456: this.qkN.setSwitchToWxUsername("");
      this.qpg = false;
      com.tencent.mm.ui.base.h.bQ(this, getString(2131303293));
      localObject3 = ((com.tencent.mm.modelsimple.q)paramm).fPk;
      if ((!bo.isNullOrNil((String)localObject3)) && (this.qkR.containsKey(localObject3)))
      {
        localObject2 = new Intent();
        localObject1 = (SwitchAccountModel)this.qkR.get(localObject3);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "wxID %s, plugSwitch: %d", new Object[] { localObject3, Integer.valueOf(((SwitchAccountModel)localObject1).qjM) });
        if ((((SwitchAccountModel)localObject1).qjM & 0x20000) == 0)
          break label664;
        ((Intent)localObject2).setClass(this, LoginVoiceUI.class);
      }
      while (true)
      {
        ((Intent)localObject2).putExtra("switch_login_wx_id", (String)localObject3);
        startActivity((Intent)localObject2);
        com.tencent.mm.ui.base.b.hN(this);
        if (bx.fnB.aat().size() <= 1)
          break label677;
        com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(1), bx.fnB.aau() });
        break;
        label664: ((Intent)localObject2).setClass(this, LoginPasswordUI.class);
      }
      label677: com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(1), bx.fnB.aau() });
      break label375;
      label716: if ((paramInt2 == -3) && (paramInt1 == 4))
      {
        if (bx.fnB.aat().size() > 1)
          com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(7), bx.fnB.aau() });
        while (true)
        {
          paramString = new Intent(this.mController.ylL, RegByMobileSetPwdUI.class);
          paramString.putExtra("kintent_hint", getString(2131302301));
          startActivityForResult(paramString, 701);
          AppMethodBeat.o(127518);
          break;
          com.tencent.mm.plugin.report.service.h.pYm.e(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(7), bx.fnB.aau() });
        }
      }
      if (!com.tencent.mm.plugin.setting.b.gkF.a(this, paramInt1, paramInt2, paramString))
        break label1037;
      AppMethodBeat.o(127518);
    }
    label893: if (paramm.getType() == 282)
    {
      g.RN();
      if (com.tencent.mm.kernel.a.QX())
      {
        paramString = ((ayx)((com.tencent.mm.modelsimple.p)paramm).ehh.fsH.fsP).wCM;
        if (paramString != null)
          break label1046;
      }
    }
    label1037: label1046: for (paramInt1 = -1; ; paramInt1 = paramString.length())
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.SettingsSwitchAccountUI", "logout return noPwdTicket[%s]", new Object[] { Integer.valueOf(paramInt1) });
      if (bo.isNullOrNil(paramString))
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "no pwd ticket is null!");
      paramm = com.tencent.mm.model.r.Yz();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "logout return username[%s]", new Object[] { paramm });
      bx.fnB.n(paramm, "last_logout_no_pwd_ticket", paramString);
      if ((this.qpf != null) && (!this.qpf.doT()))
      {
        this.qpf.stopTimer();
        cje();
      }
      AppMethodBeat.o(127518);
      break;
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(127517);
    super.onStop();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SettingsSwitchAccountUI", "onStop");
    if (this.scene == 1)
    {
      SwitchAccountGridView localSwitchAccountGridView = this.qkN;
      if (localSwitchAccountGridView.qrd)
      {
        localSwitchAccountGridView.qrd = false;
        if (localSwitchAccountGridView.qre != null)
          localSwitchAccountGridView.qre.end();
      }
    }
    g.Rg().b(701, this);
    g.Rg().b(252, this);
    g.Rg().b(281, this);
    g.Rg().b(282, this);
    g.Rg().b(255, this);
    AppMethodBeat.o(127517);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI
 * JD-Core Version:    0.6.2
 */