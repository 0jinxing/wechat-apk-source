package com.tencent.mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.id_verify.model.b;
import com.tencent.mm.plugin.wallet_core.ui.s;
import com.tencent.mm.plugin.wallet_core.ui.s.a;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.k;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import org.json.JSONException;
import org.json.JSONObject;

public class SwitchRealnameVerifyModeUI extends WalletBaseUI
  implements View.OnClickListener
{
  private int gwj;
  private s onl;
  private boolean ttQ;
  private int tuT;
  private long tuU;
  private View tuV;
  private View tuW;
  private View tuX;
  private TextView tuY;
  private TextView tuZ;
  private TextView tva;
  private TextView tvb;
  private TextView tvc;
  private TextView tvd;
  private TextView tve;
  private TextView tvf;
  private String tvg;
  private String tvh;
  private String tvi;
  private boolean tvj;
  private boolean tvk;

  public SwitchRealnameVerifyModeUI()
  {
    AppMethodBeat.i(46598);
    this.tuT = 500;
    this.tuU = 0L;
    this.gwj = 0;
    this.tvk = false;
    this.onl = new s();
    this.ttQ = false;
    AppMethodBeat.o(46598);
  }

  private void cOY()
  {
    AppMethodBeat.i(46608);
    b localb = new b();
    nf(1666);
    a(localb, true, true);
    AppMethodBeat.o(46608);
  }

  private static JSONObject cOZ()
  {
    AppMethodBeat.i(46609);
    g.RQ();
    Object localObject1 = g.RP().Ry().get(ac.a.xNA, "");
    Object localObject3;
    if (localObject1 != null)
    {
      localObject3 = (String)localObject1;
      if (bo.isNullOrNil((String)localObject3));
    }
    while (true)
    {
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>((String)localObject3);
        long l1 = System.currentTimeMillis() / 1000L;
        long l2 = ((JSONObject)localObject1).getLong("timestamp");
        long l3 = ((JSONObject)localObject1).getLong("cache_time");
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>(" dddd time=");
        ab.i("MicroMsg.SwitchRealnameVerifyModeUI", l1 + ";timestamp=" + l2 + ";cachetime=" + l3);
        if (l1 - l2 > l3)
        {
          ab.e("MicroMsg.SwitchRealnameVerifyModeUI", "wording data from cache is out of date");
          AppMethodBeat.o(46609);
          localObject1 = null;
          return localObject1;
        }
        AppMethodBeat.o(46609);
        continue;
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.SwitchRealnameVerifyModeUI", localJSONException, "", new Object[0]);
        ab.e("MicroMsg.SwitchRealnameVerifyModeUI", "parse wording data form cache error");
        AppMethodBeat.o(46609);
        localObject2 = null;
        continue;
      }
      ab.i("MicroMsg.SwitchRealnameVerifyModeUI", "cache is null");
      AppMethodBeat.o(46609);
      Object localObject2 = null;
    }
  }

  private boolean nd(boolean paramBoolean)
  {
    AppMethodBeat.i(46610);
    Object localObject1 = cOZ();
    if ((paramBoolean) && (localObject1 == null))
      localObject1 = new JSONObject();
    while (true)
    {
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = bo.bc(((JSONObject)localObject1).optString("cache_header_titles", getString(2131303977)), getString(2131303977));
        if (this.tvk)
        {
          ((TextView)findViewById(2131829031)).setText(2131305258);
          if (!((JSONObject)localObject1).optBoolean("isShowBindCardVerify", false))
            break label553;
          this.tve.setText(((JSONObject)localObject1).optString("bindCardVerifyTitle"));
          this.tvf.setText(((JSONObject)localObject1).optString("bindCardVerifySubtitle"));
          this.tuX.setVisibility(0);
          label116: if (!((JSONObject)localObject1).optBoolean("isShowBindCard", false))
            break label565;
          this.tuY.setText(((JSONObject)localObject1).optString("bindcardTitle", getString(2131303978)));
          this.tuZ.setText(((JSONObject)localObject1).optString("bindcardSubTitle", getString(2131303979)));
          this.tuV.setVisibility(0);
          label176: if (!((JSONObject)localObject1).optBoolean("isShowBindId", false))
            break label577;
          this.tva.setText(((JSONObject)localObject1).optString("bindIdTitle", getString(2131303980)));
          this.tvb.setText(((JSONObject)localObject1).optString("bindIdSubTitle", getString(2131303981)));
          this.tuW.setVisibility(0);
          label237: this.tvh = ((JSONObject)localObject1).optString("bindCardVerifyAlertViewRightBtnTxt", "");
          this.tvi = ((JSONObject)localObject1).optString("bindCardVerifyAlertViewContent", "");
          this.tvj = ((JSONObject)localObject1).optBoolean("isShowBindCardVerifyAlertView", false);
          localObject2 = ((JSONObject)localObject1).optString("extral_wording", "");
          if (bo.isNullOrNil((String)localObject2))
            break label589;
          this.tvc.setText((CharSequence)localObject2);
          this.tvc.setVisibility(0);
          label308: this.tvh = ((JSONObject)localObject1).optString("bindCardVerifyAlertViewRightBtnTxt", "");
          this.tvi = ((JSONObject)localObject1).optString("bindCardVerifyAlertViewContent");
          this.tvj = ((JSONObject)localObject1).optBoolean("isShowBindCardVerifyAlertView", false);
          paramBoolean = ((JSONObject)localObject1).optBoolean("question_answer_switch", false);
          this.tvg = ((JSONObject)localObject1).optString("question_answer_url", "");
          if ((paramBoolean) && (!bo.isNullOrNil(this.tvg)))
            addIconOptionMenu(0, 2130840734, new SwitchRealnameVerifyModeUI.7(this));
          if (!((JSONObject)localObject1).optBoolean("isShowCapitalSecurity", false))
            break label601;
          localObject1 = new SpannableString("#  " + this.mController.ylL.getResources().getString(2131305031));
          localObject2 = this.mController.ylL.getResources().getDrawable(2130839082);
          ((Drawable)localObject2).setBounds(0, 0, ((Drawable)localObject2).getIntrinsicWidth(), ((Drawable)localObject2).getIntrinsicHeight());
          ((SpannableString)localObject1).setSpan(new ImageSpan((Drawable)localObject2), 0, 1, 18);
          this.tvd.setText((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
          this.tvd.setOnClickListener(new SwitchRealnameVerifyModeUI.8(this));
          this.tvd.setVisibility(0);
          label528: AppMethodBeat.o(46610);
          paramBoolean = true;
        }
      }
      while (true)
      {
        return paramBoolean;
        ((TextView)findViewById(2131829031)).setText((CharSequence)localObject2);
        break;
        label553: this.tuX.setVisibility(8);
        break label116;
        label565: this.tuV.setVisibility(8);
        break label176;
        label577: this.tuW.setVisibility(8);
        break label237;
        label589: this.tvc.setVisibility(8);
        break label308;
        label601: this.tvd.setVisibility(8);
        break label528;
        AppMethodBeat.o(46610);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(46604);
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label160;
      f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
      ng(580);
      paramString = dOD();
      if (paramString != null)
      {
        paramString = paramString.mqu;
        paramString.putInt("real_name_verify_mode", 1);
        com.tencent.mm.wallet_core.a.j(this, paramString);
      }
      AppMethodBeat.o(46604);
    }
    while (true)
    {
      return bool;
      if ((paramm instanceof b))
      {
        ng(1666);
        nd(true);
        paramString = (b)paramm;
        this.ttQ = paramString.ttQ;
        if (paramString.nYe == null);
        for (paramInt1 = 0; ; paramInt1 = 1)
        {
          if ((paramInt1 == 0) || (!paramString.nYe.a(this, new SwitchRealnameVerifyModeUI.3(this))))
            break label160;
          AppMethodBeat.o(46604);
          break;
        }
      }
      label160: AppMethodBeat.o(46604);
      bool = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130971160;
  }

  public final void initView()
  {
    AppMethodBeat.i(46603);
    setMMTitle("");
    this.tuV = findViewById(2131829036);
    this.tuW = findViewById(2131829040);
    this.tuX = findViewById(2131829032);
    this.tuW.setOnClickListener(this);
    this.tuV.setOnClickListener(this);
    this.tuX.setOnClickListener(this);
    this.tuY = ((TextView)findViewById(2131829037));
    this.tuZ = ((TextView)findViewById(2131829038));
    this.tva = ((TextView)findViewById(2131829041));
    this.tvb = ((TextView)findViewById(2131829042));
    this.tvc = ((TextView)findViewById(2131829043));
    this.tvd = ((TextView)findViewById(2131828918));
    this.tve = ((TextView)findViewById(2131829033));
    this.tvf = ((TextView)findViewById(2131829034));
    if (this.tvk)
      ((TextView)findViewById(2131829031)).setText(2131305258);
    nd(false);
    cOY();
    setBackBtn(new SwitchRealnameVerifyModeUI.2(this));
    AppMethodBeat.o(46603);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(46605);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        this.onl.bNo();
        AppMethodBeat.o(46605);
      }
    while (true)
    {
      return;
      this.onl.cancel();
      AppMethodBeat.o(46605);
    }
  }

  public void onClick(final View paramView)
  {
    AppMethodBeat.i(46606);
    if (System.currentTimeMillis() - this.tuU <= this.tuT)
    {
      ab.e("MicroMsg.SwitchRealnameVerifyModeUI", "process pass");
      AppMethodBeat.o(46606);
    }
    while (true)
    {
      return;
      this.tuU = System.currentTimeMillis();
      this.onl.a(new s.a()
      {
        public final void bNo()
        {
          AppMethodBeat.i(46591);
          SwitchRealnameVerifyModeUI.this.onClickImp(paramView);
          SwitchRealnameVerifyModeUI.b(SwitchRealnameVerifyModeUI.this);
          AppMethodBeat.o(46591);
        }

        public final void bNp()
        {
          AppMethodBeat.i(46593);
          SwitchRealnameVerifyModeUI.this.onClickImp(paramView);
          AppMethodBeat.o(46593);
        }

        public final void cancel()
        {
          AppMethodBeat.i(46592);
          SwitchRealnameVerifyModeUI.c(SwitchRealnameVerifyModeUI.this).cui = false;
          AppMethodBeat.o(46592);
        }
      }
      , this.ttQ);
      AppMethodBeat.o(46606);
    }
  }

  public void onClickImp(View paramView)
  {
    AppMethodBeat.i(46607);
    int i = paramView.getId();
    c localc = dOD();
    if (localc != null)
    {
      paramView = localc.mqu;
      if (i != 2131829036)
        break label241;
      com.tencent.mm.wallet_core.ui.e.a(15, bo.anT(), this.gwj);
      if (paramView.getInt("realname_scene") == 1)
      {
        if (getIntent() == null)
        {
          paramView = "";
          if (bo.isNullOrNil(""))
            paramView = getString(2131305389);
          h.a(this, paramView, null, false, new SwitchRealnameVerifyModeUI.6(this));
          AppMethodBeat.o(46607);
        }
        while (true)
        {
          return;
          nf(580);
          a(new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 8, "idCardRealnameVerify", getIntent().getIntExtra("pay_channel", 0)), true, false);
          AppMethodBeat.o(46607);
        }
      }
      paramView.putInt("real_name_verify_mode", 1);
    }
    while (true)
    {
      com.tencent.mm.wallet_core.a.j(this, paramView);
      AppMethodBeat.o(46607);
      break;
      label241: if (i == 2131829040)
      {
        com.tencent.mm.wallet_core.ui.e.a(17, bo.anT(), this.gwj);
        paramView.putInt("real_name_verify_mode", 2);
      }
      else if (i == 2131829032)
      {
        com.tencent.mm.wallet_core.ui.e.a(16, bo.anT(), this.gwj);
        if ((this.tvj) && (!bo.isNullOrNil(this.tvi)))
        {
          h.a(this, this.tvi, "", this.tvh, false, new SwitchRealnameVerifyModeUI.5(this, localc));
          AppMethodBeat.o(46607);
          break;
        }
        paramView.putInt("real_name_verify_mode", 3);
        paramView.putString("verify_card_flag", "1");
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46602);
    super.onCreate(paramBundle);
    this.tvk = this.mBundle.getBoolean("key_from_set_pwd", false);
    initView();
    dOD();
    this.gwj = this.mBundle.getInt("entry_scene", this.gwj);
    com.tencent.mm.wallet_core.ui.e.a(13, bo.anT(), this.gwj);
    if (this.tvk)
      setMMTitle(2131305257);
    this.onl.tLw = new SwitchRealnameVerifyModeUI.1(this);
    AppMethodBeat.o(46602);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46601);
    super.onDestroy();
    AppMethodBeat.o(46601);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(46611);
    boolean bool;
    if (paramInt == 4)
    {
      c localc = dOD();
      if (localc != null)
      {
        com.tencent.mm.wallet_core.ui.e.a(14, bo.anT(), this.gwj);
        localc.c(this, 0);
        bool = true;
        AppMethodBeat.o(46611);
      }
    }
    while (true)
    {
      return bool;
      finish();
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(46611);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(46600);
    super.onPause();
    this.onl.onPause();
    AppMethodBeat.o(46600);
  }

  public void onResume()
  {
    AppMethodBeat.i(46599);
    super.onResume();
    this.onl.onResume();
    AppMethodBeat.o(46599);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI
 * JD-Core Version:    0.6.2
 */