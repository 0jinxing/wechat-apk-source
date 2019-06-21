package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.model.y;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.protocal.protobuf.ccl;
import com.tencent.mm.protocal.protobuf.cfc;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.e.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SettingsPrivacyUI extends MMPreference
{
  private String ecX;
  private f ehK;
  boolean eio;
  private HashMap<Integer, Integer> gsc;
  private boolean qmw;
  private boolean qop;
  private boolean qoq;
  private boolean qor;
  private boolean qos;
  private boolean qot;
  private boolean qou;
  private boolean qov;
  private cfc qow;
  private int qox;
  private int status;

  public SettingsPrivacyUI()
  {
    AppMethodBeat.i(127411);
    this.gsc = new HashMap();
    this.ecX = "";
    this.qop = true;
    this.qmw = false;
    this.qoq = false;
    this.qor = false;
    this.qos = false;
    this.qot = false;
    this.qou = true;
    this.qov = true;
    this.qow = null;
    this.eio = false;
    this.qox = e.h.yfZ;
    AppMethodBeat.o(127411);
  }

  private boolean Be(int paramInt)
  {
    if ((this.status & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(127419);
    TextView localTextView = (TextView)View.inflate(this.mController.ylL, 2130970442, null);
    localTextView.setText(paramInt1);
    localTextView.setTag(Integer.valueOf(paramInt2));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramBoolean)
      localTextView.setCompoundDrawablesWithIntrinsicBounds(2131231853, 0, 0, 0);
    AppMethodBeat.o(127419);
  }

  private void cbv()
  {
    AppMethodBeat.i(127422);
    Object localObject = new ccl();
    cfc localcfc = ((com.tencent.mm.plugin.story.api.e)g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUserInfo();
    if (com.tencent.mm.plugin.sns.b.n.qFy != null)
      localObject = com.tencent.mm.plugin.sns.b.n.qFy.WX(this.ecX);
    label168: label192: label217: label606: label740: 
    while (true)
    {
      if (localObject == null)
      {
        ab.e("MicroMsg.SettingPrivacy", "userinfo is null");
        AppMethodBeat.o(127422);
        return;
      }
      int i = ((ccl)localObject).xbQ;
      int j = ((ccl)localObject).xbR;
      localObject = (CheckBoxPreference)this.ehK.aqO("timeline_stranger_show");
      boolean bool;
      if (localObject != null)
      {
        ((Preference)localObject).yDf = false;
        if ((i & 0x1) > 0)
        {
          bool = true;
          label107: this.qmw = bool;
          if (this.qmw)
            break label606;
          ((CheckBoxPreference)localObject).uOT = true;
        }
      }
      else
      {
        label125: localObject = (IconPreference)this.ehK.aqO("timeline_recent_show_select");
        if (localObject != null)
        {
          ((Preference)localObject).yDf = false;
          if ((j != 4320) || ((i & 0x1000) <= 0))
            break label614;
          bool = true;
          this.qoq = bool;
          if ((j != 72) || ((i & 0x1000) <= 0))
            break label620;
          bool = true;
          this.qor = bool;
          if ((j != 720) || ((i & 0x1000) <= 0))
            break label626;
          bool = true;
          this.qot = bool;
          if ((i & 0x800) <= 0)
            break label632;
          bool = true;
          label234: this.qos = bool;
          if (!this.qoq)
            break label638;
          ((IconPreference)localObject).setSummary(2131298531);
          label253: j = ((Integer)g.RP().Ry().get(ac.a.xQM, Integer.valueOf(0))).intValue();
          i = ((Integer)g.RP().Ry().get(ac.a.xQN, Integer.valueOf(0))).intValue();
          ab.i("MicroMsg.SettingPrivacy", "willShowRecentRedCodeId  %d, currentRecentRedCodeId %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
          if (j <= i)
            break label682;
          ((IconPreference)localObject).NN(0);
        }
        if ((!d.afj("sns")) || ((r.YK() & 0x8000) != 0))
          break label691;
        bool = true;
        label358: this.qop = bool;
        localObject = new StringBuilder("isSnsOpenEntrance ").append(this.qop).append(", install ").append(d.afj("sns")).append(", flag ");
        if ((r.YK() & 0x8000) != 0)
          break label697;
        bool = true;
        ab.i("MicroMsg.SettingPrivacy", bool);
        if (!this.qop)
          break label703;
        this.ehK.ce("settings_sns_notify", false);
        this.ehK.ce("settings_story_notify", false);
        if (this.qop)
        {
          localObject = (CheckBoxPreference)this.ehK.aqO("settings_sns_notify");
          if (localObject != null)
          {
            ((Preference)localObject).yDf = false;
            this.qou = bo.a((Boolean)g.RP().Ry().get(68384, null), true);
            if (!this.qou)
              break label732;
            ((CheckBoxPreference)localObject).uOT = true;
          }
          localObject = (CheckBoxPreference)this.ehK.aqO("settings_story_notify");
          if (localObject != null)
          {
            ((Preference)localObject).yDf = false;
            if (localcfc.xeE != 0)
              break label740;
            bool = true;
            this.qov = bool;
            if (!this.qov)
              break label746;
          }
        }
      }
      label614: label746: for (((CheckBoxPreference)localObject).uOT = true; ; ((CheckBoxPreference)localObject).uOT = false)
      {
        this.ehK.notifyDataSetChanged();
        AppMethodBeat.o(127422);
        break;
        bool = false;
        break label107;
        ((CheckBoxPreference)localObject).uOT = false;
        break label125;
        bool = false;
        break label168;
        label620: bool = false;
        break label192;
        label626: bool = false;
        break label217;
        label632: bool = false;
        break label234;
        label638: if (this.qor)
        {
          ((IconPreference)localObject).setSummary(2131298532);
          break label253;
        }
        if (this.qot)
        {
          ((IconPreference)localObject).setSummary(2131305861);
          break label253;
        }
        ((IconPreference)localObject).setSummary(2131298530);
        break label253;
        ((IconPreference)localObject).NN(8);
        break label337;
        bool = false;
        break label358;
        bool = false;
        break label415;
        this.ehK.ce("settings_sns_notify", true);
        this.ehK.ce("settings_story_notify", true);
        break label462;
        ((CheckBoxPreference)localObject).uOT = false;
        break label530;
        bool = false;
        break label565;
      }
    }
  }

  private void cja()
  {
    AppMethodBeat.i(127418);
    Object localObject1 = new ccl();
    if (com.tencent.mm.plugin.sns.b.n.qFy != null)
      localObject1 = com.tencent.mm.plugin.sns.b.n.qFy.WX(this.ecX);
    if (localObject1 == null)
    {
      ab.e("MicroMsg.SettingPrivacy", "userinfo is null");
      AppMethodBeat.o(127418);
      return;
    }
    int i = ((Integer)g.RP().Ry().get(ac.a.xQM, Integer.valueOf(0))).intValue();
    if (i > ((Integer)g.RP().Ry().get(ac.a.xQN, Integer.valueOf(0))).intValue())
    {
      g.RP().Ry().set(ac.a.xQN, Integer.valueOf(i));
      cbv();
    }
    Object localObject2 = new c.a(this.mController.ylL);
    ((c.a)localObject2).Qd(2131296868);
    ((c.a)localObject2).PV(2131298529);
    View localView = View.inflate(this.mController.ylL, 2130970095, null);
    localObject1 = (LinearLayout)localView.findViewById(2131825985);
    SettingsPrivacyUI.2 local2 = new SettingsPrivacyUI.2(this, (LinearLayout)localObject1);
    a((LinearLayout)localObject1, 2131298531, 1, this.qoq, local2);
    a((LinearLayout)localObject1, 2131305861, 3, this.qot, local2);
    a((LinearLayout)localObject1, 2131298532, 0, this.qor, local2);
    if ((!this.qoq) && (!this.qor) && (!this.qot));
    for (boolean bool = true; ; bool = false)
    {
      a((LinearLayout)localObject1, 2131298530, 2, bool, local2);
      ((c.a)localObject2).fn(localView);
      localObject2 = ((c.a)localObject2).aMb();
      ((LinearLayout)localObject1).setTag(localObject2);
      ((c)localObject2).show();
      addDialog((Dialog)localObject2);
      AppMethodBeat.o(127418);
      break;
    }
  }

  private boolean g(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(127421);
    ab.d("MicroMsg.SettingPrivacy", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status |= paramInt1;
      if (!paramBoolean)
        break label107;
    }
    label107: for (paramInt1 = 1; ; paramInt1 = 2)
    {
      this.gsc.put(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
      AppMethodBeat.o(127421);
      return true;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }

  public final int JC()
  {
    return 2131165270;
  }

  public final com.tencent.mm.ui.base.preference.h a(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(127412);
    paramSharedPreferences = new com.tencent.mm.ui.base.preference.a(this, this.nDp, paramSharedPreferences);
    AppMethodBeat.o(127412);
    return paramSharedPreferences;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = false;
    AppMethodBeat.i(127417);
    paramPreference = paramPreference.mKey;
    ab.i("MicroMsg.SettingPrivacy", paramPreference + " item has been clicked!");
    if (paramPreference.equals("settings_need_verify"))
    {
      bool3 = g(((CheckBoxPreference)paramf.aqO("settings_need_verify")).isChecked(), 32, 4);
      AppMethodBeat.o(127417);
    }
    while (true)
    {
      return bool3;
      if (paramPreference.equals("settings_recommend_mobilefriends_to_me"))
      {
        if (!((CheckBoxPreference)paramf.aqO("settings_recommend_mobilefriends_to_me")).isChecked());
        for (bool3 = true; ; bool3 = false)
        {
          bool3 = g(bool3, 256, 7);
          AppMethodBeat.o(127417);
          break;
        }
      }
      if (!paramPreference.equals("settings_about_blacklist"))
        break;
      paramf = com.tencent.mm.model.z.nY(getString(2131300423));
      paramPreference = new Intent();
      paramPreference.putExtra("filter_type", paramf.getType());
      paramPreference.putExtra("titile", getString(2131303224));
      paramPreference.putExtra("list_attr", 32768);
      b.gkE.h(this, paramPreference);
      AppMethodBeat.o(127417);
      bool3 = bool2;
    }
    if (paramPreference.equals("timline_outside_permiss"))
    {
      paramf = new Intent();
      paramf.putExtra("k_sns_tag_id", 4L);
      paramf.putExtra("k_sns_from_settings_about_sns", 1);
      d.b(this, "sns", ".ui.SnsBlackDetailUI", paramf);
    }
    label284: label494: label756: 
    do
      while (true)
      {
        AppMethodBeat.o(127417);
        bool3 = false;
        break;
        if (paramPreference.equals("edit_timeline_group"))
        {
          d.H(this, "sns", ".ui.SnsTagPartlyUI");
        }
        else if (paramPreference.equals("timeline_black_permiss"))
        {
          paramf = new Intent();
          paramf.putExtra("k_sns_tag_id", 5L);
          paramf.putExtra("k_sns_from_settings_about_sns", 2);
          paramf.putExtra("k_tag_detail_sns_block_scene", 8);
          d.b(this, "sns", ".ui.SnsTagDetailUI", paramf);
        }
        else if (paramPreference.equals("timeline_stranger_show"))
        {
          if (!this.qmw);
          for (bool3 = bool1; ; bool3 = false)
          {
            this.qmw = bool3;
            if (com.tencent.mm.plugin.sns.b.n.qFy != null)
              com.tencent.mm.plugin.sns.b.n.qFy.bh(this.ecX, this.qmw);
            if (com.tencent.mm.plugin.sns.b.n.qFy == null)
              break label284;
            paramf = com.tencent.mm.plugin.sns.b.n.qFy.bi(this.ecX, this.qmw);
            com.tencent.mm.plugin.sns.b.n.qFy.a(this.ecX, paramf);
            if (paramf != null)
              break label494;
            ab.e("MicroMsg.SettingPrivacy", "userinfo in null !");
            AppMethodBeat.o(127417);
            bool3 = false;
            break;
          }
          ab.d("MicroMsg.SettingPrivacy", "dancy userinfo " + paramf.toString());
          ((j)g.K(j.class)).XL().c(new j.a(51, paramf));
        }
        else
        {
          if (paramPreference.equals("settings_find_google_contact"))
          {
            if (!((CheckBoxPreference)paramf.aqO("settings_find_google_contact")).isChecked())
              bool3 = true;
            g(bool3, 1048576, 29);
            AppMethodBeat.o(127417);
            bool3 = bool2;
            break;
          }
          if (paramPreference.equals("settings_add_me_way"))
          {
            startActivity(new Intent(this, SettingsAddMeUI.class));
            AppMethodBeat.o(127417);
            bool3 = bool2;
            break;
          }
          if (paramPreference.equals("timeline_recent_show_select"))
          {
            cja();
          }
          else
          {
            if (paramPreference.equals("settings_sns_notify"))
            {
              if (!this.qou)
              {
                bool3 = true;
                this.qou = bool3;
                if (!this.qou)
                  break label756;
                com.tencent.mm.plugin.report.service.h.pYm.e(14098, new Object[] { Integer.valueOf(3) });
              }
              while (true)
              {
                g.RP().Ry().set(68384, Boolean.valueOf(this.qou));
                cbv();
                AppMethodBeat.o(127417);
                bool3 = bool2;
                break;
                bool3 = false;
                break label681;
                com.tencent.mm.plugin.report.service.h.pYm.e(14098, new Object[] { Integer.valueOf(4) });
              }
            }
            if (paramPreference.equals("settings_unfamiliar_contact"))
            {
              startActivity(new Intent(this, UnfamiliarContactUI.class));
            }
            else if (paramPreference.equals("settings_privacy_agreements"))
            {
              paramPreference = g.RP().Ry().get(274436, "").toString();
              paramf = paramPreference;
              if (bo.isNullOrNil(paramPreference))
                paramf = aa.doq();
              com.tencent.mm.plugin.account.a.b.a.b(this, getString(2131305909, new Object[] { aa.dor(), paramf, "setting", Integer.valueOf(0), Integer.valueOf(0) }), 0, false);
            }
            else
            {
              if (!paramPreference.equals("settings_auth_manage"))
                break label926;
              startActivity(new Intent(this, SettingsManageAuthUI.class));
            }
          }
        }
      }
    while (!paramPreference.equals("settings_story_notify"));
    label681: if (!this.qov)
    {
      bool3 = true;
      label946: this.qov = bool3;
      if (!this.qov)
        break label1043;
    }
    label926: for (this.qow.xeE = 0; ; this.qow.xeE = 1)
    {
      ((com.tencent.mm.plugin.story.api.e)g.M(com.tencent.mm.plugin.story.api.e.class)).updateStoryUserInfo(this.ecX, this.qow);
      ((j)g.K(j.class)).XL().c(new j.a(71, this.qow));
      cbv();
      AppMethodBeat.o(127417);
      bool3 = bool2;
      break;
      bool3 = false;
      break label946;
    }
  }

  public final void initView()
  {
    boolean bool1 = false;
    AppMethodBeat.i(127420);
    setMMTitle(2131303024);
    setBackBtn(new SettingsPrivacyUI.3(this));
    ab.v("MicroMsg.SettingPrivacy", "init function status: " + Integer.toBinaryString(this.status));
    Object localObject1 = (CheckBoxPreference)this.ehK.aqO("settings_need_verify");
    ((Preference)localObject1).yDf = false;
    ((CheckBoxPreference)localObject1).uOT = Be(32);
    localObject1 = (String)g.RP().Ry().get(6, null);
    Object localObject2 = (CheckBoxPreference)this.ehK.aqO("settings_recommend_mobilefriends_to_me");
    ((Preference)localObject2).yDf = false;
    boolean bool2;
    if ((localObject1 != null) && (((String)localObject1).length() > 0))
      if (!Be(256))
      {
        bool2 = true;
        ((CheckBoxPreference)localObject2).uOT = bool2;
      }
    while (true)
    {
      localObject2 = (CheckBoxPreference)this.ehK.aqO("settings_find_google_contact");
      ((Preference)localObject2).yDf = false;
      bool2 = bool1;
      if (!Be(1048576))
        bool2 = true;
      ((CheckBoxPreference)localObject2).uOT = bool2;
      localObject1 = (String)g.RP().Ry().get(208903, null);
      if ((!bo.gT(this)) || (TextUtils.isEmpty((CharSequence)localObject1)))
        this.ehK.d((Preference)localObject2);
      if ((!((Boolean)g.RP().Ry().get(335873, Boolean.TRUE)).booleanValue()) || (!com.tencent.mm.plugin.sns.b.n.qFA.cmo()))
        this.ehK.ce("edit_timeline_group", true);
      this.ehK.ce("settings_unfamiliar_contact", true);
      localObject1 = this.ehK.aqO("settings_privacy_agreements");
      String str = getString(2131302021);
      localObject2 = Spannable.Factory.getInstance().newSpannable(getString(2131302022) + str);
      ((Spannable)localObject2).setSpan(new ForegroundColorSpan(getResources().getColor(2131690208)), ((Spannable)localObject2).length() - str.length(), ((Spannable)localObject2).length(), 33);
      ((Preference)localObject1).setTitle((CharSequence)localObject2);
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(127420);
      return;
      bool2 = false;
      break;
      this.ehK.d((Preference)localObject2);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = true;
    AppMethodBeat.i(127413);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    this.status = r.YD();
    this.ecX = r.Yz();
    this.qou = bo.a((Boolean)g.RP().Ry().get(68384, null), true);
    this.qow = ((com.tencent.mm.plugin.story.api.e)g.M(com.tencent.mm.plugin.story.api.e.class)).getStoryUserInfo();
    if (this.qow.xeE == 0)
    {
      bool2 = true;
      this.qov = bool2;
      this.qox = getIntent().getIntExtra("enter_scene", e.h.yfZ);
      ab.d("MicroMsg.SettingPrivacy", "sns Notify:%s, story Notify:%s", new Object[] { Boolean.valueOf(this.qou), Boolean.valueOf(this.qov) });
      initView();
      com.tencent.mm.plugin.report.service.h.pYm.e(14098, new Object[] { Integer.valueOf(9) });
      if ((this.qox == e.h.yga) || (this.qox == e.h.ygb))
      {
        paramBundle = new ccl();
        if (com.tencent.mm.plugin.sns.b.n.qFy != null)
          paramBundle = com.tencent.mm.plugin.sns.b.n.qFy.WX(this.ecX);
        if (paramBundle != null)
        {
          int i = paramBundle.xbQ;
          int j = paramBundle.xbR;
          if ((j != 4320) || ((i & 0x1000) <= 0))
            break label333;
          bool2 = true;
          label249: this.qoq = bool2;
          if ((j != 72) || ((i & 0x1000) <= 0))
            break label338;
          bool2 = true;
          label272: this.qor = bool2;
          if ((j != 720) || ((i & 0x1000) <= 0))
            break label343;
          bool2 = true;
          label296: this.qot = bool2;
          if ((i & 0x800) <= 0)
            break label348;
        }
      }
    }
    label333: label338: label343: label348: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.qos = bool2;
      cja();
      AppMethodBeat.o(127413);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label249;
      bool2 = false;
      break label272;
      bool2 = false;
      break label296;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127416);
    super.onDestroy();
    AppMethodBeat.o(127416);
  }

  public void onPause()
  {
    AppMethodBeat.i(127415);
    super.onPause();
    g.RP().Ry().set(7, Integer.valueOf(this.status));
    Iterator localIterator = this.gsc.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      int i = ((Integer)((Map.Entry)localObject).getKey()).intValue();
      int j = ((Integer)((Map.Entry)localObject).getValue()).intValue();
      localObject = new act();
      ((act)localObject).wkw = i;
      ((act)localObject).pvD = j;
      ((j)g.K(j.class)).XL().c(new j.a(23, (com.tencent.mm.bt.a)localObject));
      ab.d("MicroMsg.SettingPrivacy", "switch  " + i + " " + j);
    }
    this.gsc.clear();
    AppMethodBeat.o(127415);
  }

  public void onResume()
  {
    AppMethodBeat.i(127414);
    super.onResume();
    this.status = r.YD();
    cbv();
    if (!this.eio)
    {
      String str = getIntent().getStringExtra("need_matte_high_light_item");
      if (!bo.isNullOrNil(str))
      {
        final int i = this.ehK.aqQ(str);
        setSelection(i - 3);
        new ak().postDelayed(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(127407);
            View localView = ((com.tencent.mm.ui.base.preference.a)SettingsPrivacyUI.a(SettingsPrivacyUI.this)).a(i, SettingsPrivacyUI.this.nDp);
            if (localView != null)
              com.tencent.mm.ui.g.a.a(SettingsPrivacyUI.this.mController.ylL, localView);
            AppMethodBeat.o(127407);
          }
        }
        , 10L);
      }
      this.eio = true;
    }
    AppMethodBeat.o(127414);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI
 * JD-Core Version:    0.6.2
 */