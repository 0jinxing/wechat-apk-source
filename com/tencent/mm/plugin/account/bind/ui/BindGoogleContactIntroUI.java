package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

public class BindGoogleContactIntroUI extends MMActivity
  implements f
{
  private ImageView gqh;
  private TextView gqi;
  private Button gqj;
  private Button gqk;
  private boolean gql;
  private boolean gqm;
  private String gqn;
  private ProgressDialog gqo;
  private w gqp;
  private int gqq;
  private View.OnClickListener gqr;
  private View.OnClickListener gqs;

  public BindGoogleContactIntroUI()
  {
    AppMethodBeat.i(13337);
    this.gql = false;
    this.gqm = false;
    this.gqr = new BindGoogleContactIntroUI.1(this);
    this.gqs = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(13334);
        h.a(BindGoogleContactIntroUI.this.mController.ylL, true, BindGoogleContactIntroUI.this.getString(2131304139), "", BindGoogleContactIntroUI.this.getString(2131304138), BindGoogleContactIntroUI.this.getString(2131296868), new BindGoogleContactIntroUI.2.1(this), new BindGoogleContactIntroUI.2.2(this));
        AppMethodBeat.o(13334);
      }
    };
    AppMethodBeat.o(13337);
  }

  private void aoP()
  {
    AppMethodBeat.i(13343);
    this.gqk.setVisibility(8);
    this.gqj.setVisibility(0);
    this.gqh.setVisibility(0);
    this.gqi.setVisibility(0);
    this.gqi.setText(2131297517);
    this.gqj.setText(2131297515);
    this.gqj.setOnClickListener(this.gqr);
    AppMethodBeat.o(13343);
  }

  public final int getLayoutId()
  {
    return 2130968839;
  }

  public final void initView()
  {
    AppMethodBeat.i(13342);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(13335);
        BindGoogleContactIntroUI.this.finish();
        AppMethodBeat.o(13335);
        return true;
      }
    });
    this.gqh = ((ImageView)findViewById(2131821750));
    this.gqi = ((TextView)findViewById(2131821751));
    this.gqj = ((Button)findViewById(2131821752));
    this.gqk = ((Button)findViewById(2131821753));
    AppMethodBeat.o(13342);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(13344);
    ab.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1)
    {
      if (paramInt1 != 2005)
        break label79;
      this.gql = paramIntent.getBooleanExtra("gpservices", false);
      AppMethodBeat.o(13344);
    }
    while (true)
    {
      return;
      if (paramInt1 == 2005)
        this.gql = paramIntent.getBooleanExtra("gpservices", false);
      label79: AppMethodBeat.o(13344);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13338);
    super.onCreate(paramBundle);
    setMMTitle(2131297518);
    this.gqq = getIntent().getIntExtra("enter_scene", 0);
    this.gql = com.tencent.mm.plugin.account.friend.a.m.cx(this);
    if (this.gql)
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 2005);
    AppMethodBeat.o(13338);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13341);
    super.onDestroy();
    AppMethodBeat.o(13341);
  }

  public void onResume()
  {
    AppMethodBeat.i(13339);
    super.onResume();
    this.gqn = ((String)g.RP().Ry().get(208903, null));
    if (TextUtils.isEmpty(this.gqn))
    {
      this.gqm = false;
      initView();
      if (!this.gqm)
        break label140;
      this.gqk.setVisibility(0);
      this.gqj.setVisibility(8);
      this.gqi.setVisibility(0);
      this.gqi.setText(getString(2131297516, new Object[] { this.gqn }));
      this.gqk.setOnClickListener(this.gqs);
    }
    while (true)
    {
      g.Rg().a(487, this);
      AppMethodBeat.o(13339);
      return;
      this.gqm = true;
      break;
      label140: aoP();
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(13345);
    paramm = paramString;
    if (TextUtils.isEmpty(paramString))
      paramm = "";
    ab.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramm });
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      g.RP().Ry().set(208903, "");
      g.RP().Ry().set(208901, "");
      g.RP().Ry().set(208902, "");
      g.RP().Ry().set(208905, Boolean.TRUE);
      g.RP().Ry().dsb();
      aoP();
      h.bQ(this, getString(2131304140));
      AppMethodBeat.o(13345);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "unbind failed");
      Toast.makeText(this, 2131300377, 0).show();
      AppMethodBeat.o(13345);
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(13340);
    super.onStop();
    g.Rg().b(487, this);
    AppMethodBeat.o(13340);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI
 * JD-Core Version:    0.6.2
 */