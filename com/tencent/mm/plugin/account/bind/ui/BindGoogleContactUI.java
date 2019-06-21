package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.w;
import com.tencent.mm.plugin.account.friend.a.w.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.b;
import com.tencent.xweb.c;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public class BindGoogleContactUI extends MMActivity
  implements f
{
  private boolean eVT = false;
  private MMWebView fow;
  private w gqA;
  private boolean gqB = false;
  private boolean gql = false;
  String gqn;
  private ProgressDialog gqo;
  private int gqq;
  private TextView gqv;
  private boolean gqw = false;
  private String gqx;
  String gqy;
  String gqz;

  private void aoQ()
  {
    AppMethodBeat.i(13371);
    this.fow.setVisibility(8);
    AppMethodBeat.o(13371);
  }

  private void aoR()
  {
    AppMethodBeat.i(13372);
    this.gqv.setVisibility(4);
    this.fow.setVisibility(0);
    AppMethodBeat.o(13372);
  }

  private void aoS()
  {
    AppMethodBeat.i(13373);
    startActivityForResult(new Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT"), 1003);
    AppMethodBeat.o(13373);
  }

  private void aoT()
  {
    AppMethodBeat.i(13374);
    aoW();
    this.fow.getSettings().setJavaScriptEnabled(true);
    this.fow.setWebViewClient(new BindGoogleContactUI.2(this));
    this.fow.setWebChromeClient(new BindGoogleContactUI.3(this));
    this.fow.loadUrl(com.tencent.mm.plugin.account.friend.a.m.aqc());
    AppMethodBeat.o(13374);
  }

  private void aoV()
  {
    AppMethodBeat.i(13378);
    try
    {
      c.jx(this);
      b.dTR().removeAllCookie();
      AppMethodBeat.o(13378);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.d("Google Login", "Clear cookie failed");
        AppMethodBeat.o(13378);
      }
    }
  }

  private void aoW()
  {
    AppMethodBeat.i(13379);
    if ((this.gqo == null) || (!this.gqo.isShowing()))
    {
      getString(2131297061);
      this.gqo = com.tencent.mm.ui.base.h.b(this, getString(2131297086), true, new BindGoogleContactUI.8(this));
    }
    AppMethodBeat.o(13379);
  }

  private void cu()
  {
    AppMethodBeat.i(13365);
    if (this.gql)
    {
      aoQ();
      aoW();
      aoS();
      AppMethodBeat.o(13365);
    }
    while (true)
    {
      return;
      aoR();
      aoT();
      AppMethodBeat.o(13365);
    }
  }

  private void mR(int paramInt)
  {
    AppMethodBeat.i(13375);
    this.gqA = new w(w.a.gvS, this.gqn, paramInt);
    g.Rg().a(this.gqA, 0);
    ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "doScene mAppToken:%s, mWebToke:%s", new Object[] { this.gqx, this.gqy });
    AppMethodBeat.o(13375);
  }

  final void ai(String paramString, int paramInt)
  {
    AppMethodBeat.i(13376);
    this.gqn = paramString;
    mR(paramInt);
    AppMethodBeat.o(13376);
  }

  final void aoU()
  {
    AppMethodBeat.i(13377);
    if (this.fow != null)
      this.fow.setVisibility(4);
    if (this.gqv != null)
      this.gqv.setVisibility(0);
    if (!at.isConnected(this));
    for (String str = getString(2131300374); ; str = getString(2131300366))
    {
      this.gqv.setText(str);
      AppMethodBeat.o(13377);
      return;
    }
  }

  final void aoX()
  {
    AppMethodBeat.i(13380);
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    AppMethodBeat.o(13380);
  }

  public final int getLayoutId()
  {
    return 2130968838;
  }

  public final void initView()
  {
    AppMethodBeat.i(13368);
    setMMTitle(2131300365);
    setBackBtn(new BindGoogleContactUI.1(this));
    this.fow = MMWebView.a.n(this, 2131821748);
    this.gqv = ((TextView)findViewById(2131821749));
    AppMethodBeat.o(13368);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(13369);
    ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1)
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(13369);
      case 1005:
      case 1003:
      case 1004:
      }
    while (true)
    {
      return;
      this.gql = paramIntent.getBooleanExtra("gpservices", false);
      cu();
      AppMethodBeat.o(13369);
      continue;
      paramInt1 = paramIntent.getIntExtra("error_code", -1);
      ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d ", new Object[] { Integer.valueOf(paramInt1) });
      if (paramInt1 == 0)
      {
        this.gqn = paramIntent.getStringExtra("account");
        if (this.eVT)
        {
          aoX();
          AppMethodBeat.o(13369);
        }
        else
        {
          ab.d("MicroMsg.GoogleContact.BindGoogleContactUI", "startAcitivtyForGetToken");
          paramIntent = new Intent("com.tencent.mm.gms.ACTION_GET_TOKEN");
          paramIntent.putExtra("gmail", this.gqn);
          paramIntent.putExtra("scope", "oauth2:https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds");
          startActivityForResult(paramIntent, 1004);
          AppMethodBeat.o(13369);
        }
      }
      else
      {
        aoX();
        aoU();
        AppMethodBeat.o(13369);
        continue;
        paramInt1 = paramIntent.getIntExtra("error_code", -1);
        ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d errorMsg:%s", new Object[] { Integer.valueOf(paramInt1), paramIntent.getStringExtra("error_msg") });
        if (paramInt1 == 0)
        {
          this.gqx = paramIntent.getStringExtra("token");
          mR(w.gvL);
          AppMethodBeat.o(13369);
        }
        else
        {
          aoX();
          aoU();
          break;
          if (paramInt1 == 1005)
          {
            this.gql = paramIntent.getBooleanExtra("gpservices", false);
            cu();
            AppMethodBeat.o(13369);
          }
          else
          {
            aoX();
            aoU();
            AppMethodBeat.o(13369);
          }
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13364);
    super.onCreate(paramBundle);
    this.gqq = getIntent().getIntExtra("enter_scene", 0);
    this.gqB = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.gql = com.tencent.mm.plugin.account.friend.a.m.cx(this);
    this.gqn = ((String)g.RP().Ry().get(208903, null));
    initView();
    if (this.gql)
    {
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 1005);
      AppMethodBeat.o(13364);
    }
    while (true)
    {
      return;
      cu();
      AppMethodBeat.o(13364);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(13367);
    super.onPause();
    g.Rg().b(487, this);
    AppMethodBeat.o(13367);
  }

  public void onResume()
  {
    AppMethodBeat.i(13366);
    super.onResume();
    g.Rg().a(487, this);
    this.gqw = ((Boolean)g.RP().Ry().get(208905, Boolean.FALSE)).booleanValue();
    if (this.gqw)
    {
      aoV();
      this.gqw = false;
      g.RP().Ry().set(208905, Boolean.FALSE);
    }
    AppMethodBeat.o(13366);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(13370);
    paramm = paramString;
    if (TextUtils.isEmpty(paramString))
      paramm = "";
    ab.i("MicroMsg.GoogleContact.BindGoogleContactUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramm });
    aoX();
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (this.gql)
      {
        g.RP().Ry().set(208903, this.gqn);
        g.RP().Ry().set(208901, this.gqx);
        g.RP().Ry().dsb();
        paramString = new Intent(this, GoogleFriendUI.class);
        paramString.putExtra("enter_scene", this.gqq);
        startActivity(paramString);
        finish();
        if (this.gqB)
          com.tencent.mm.plugin.report.service.h.pYm.e(11002, new Object[] { Integer.valueOf(6), Integer.valueOf(6) });
        AppMethodBeat.o(13370);
      }
    while (true)
    {
      return;
      g.RP().Ry().set(208903, this.gqn);
      g.RP().Ry().set(208902, this.gqy);
      g.RP().Ry().set(208904, this.gqz);
      break;
      if (paramInt2 == w.gvN)
      {
        com.tencent.mm.ui.base.h.a(this, getString(2131300372), "", new BindGoogleContactUI.6(this), new BindGoogleContactUI.7(this));
        AppMethodBeat.o(13370);
      }
      else
      {
        aoU();
        AppMethodBeat.o(13370);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI
 * JD-Core Version:    0.6.2
 */