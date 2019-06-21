package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ba;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.f.a.c;
import java.util.ArrayList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WelcomeActivity extends MMFragmentActivity
{
  private static final String[] gAu = { "public_profile" };
  private com.tencent.mm.ui.f.a.d gAT;
  private c gBj;
  private ba gBm;
  private WelcomeSelectView gIt;

  public WelcomeActivity()
  {
    AppMethodBeat.i(125650);
    this.gBm = new ba();
    AppMethodBeat.o(125650);
  }

  private void arM()
  {
    AppMethodBeat.i(125653);
    if (q.u(this, "com.facebook.katana"))
    {
      this.gAT.a("name,picture.type(large)", new WelcomeActivity.10(this));
      AppMethodBeat.o(125653);
    }
    while (true)
    {
      return;
      g.RS().a(new WelcomeActivity.11(this));
      AppMethodBeat.o(125653);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(125656);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null);
    while (true)
    {
      ab.i("MicroMsg.WelcomeActivity", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (this.gAT != null)
        this.gAT.h(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(125656);
      return;
      bool = false;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125651);
    super.onCreate(paramBundle);
    getSupportActionBar().hide();
    getWindow().getDecorView().setSystemUiVisibility(1024);
    this.gIt = new WelcomeSelectView(this);
    setContentView(this.gIt);
    this.gIt.arN();
    this.gIt.gIx.setOnClickListener(new WelcomeActivity.1(this));
    this.gIt.gIv.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(125641);
        paramAnonymousView = new Intent(WelcomeActivity.this, MobileInputUI.class);
        paramAnonymousView.putExtra("mobile_input_purpose", 1);
        WelcomeActivity.this.startActivity(paramAnonymousView);
        AppMethodBeat.o(125641);
      }
    });
    paramBundle = new ArrayList();
    m localm = new m(this, 1001, 0);
    localm.setTitle(2131302252);
    paramBundle.add(localm);
    localm = new m(this, 1002, 0);
    if (com.tencent.mm.au.b.ahL())
    {
      localm.setTitle(2131302250);
      paramBundle.add(localm);
    }
    if (paramBundle.size() > 1)
    {
      com.tencent.mm.ui.widget.a.d locald = new com.tencent.mm.ui.widget.a.d(this, 1, false);
      locald.rBl = new WelcomeActivity.5(this, paramBundle);
      locald.rBm = new n.d()
      {
        public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          AppMethodBeat.i(125643);
          switch (paramAnonymousMenuItem.getItemId())
          {
          default:
          case 1001:
          case 1002:
          }
          while (true)
          {
            AppMethodBeat.o(125643);
            while (true)
            {
              return;
              paramAnonymousMenuItem = new Intent(WelcomeActivity.this, RegByMobileRegAIOUI.class);
              WelcomeActivity.this.startActivity(paramAnonymousMenuItem);
              AppMethodBeat.o(125643);
            }
            WelcomeActivity.a(WelcomeActivity.this).daR = 1L;
            WelcomeActivity.a(WelcomeActivity.this).cVS = 2L;
            WelcomeActivity.a(WelcomeActivity.this).ajK();
            WelcomeActivity.b(WelcomeActivity.this);
          }
        }
      };
      locald.zQf = new WelcomeActivity.7(this);
      this.gIt.gIw.setOnClickListener(new WelcomeActivity.8(this, locald, paramBundle, localm));
      AppMethodBeat.o(125651);
    }
    while (true)
    {
      return;
      this.gIt.gIw.setOnClickListener(new WelcomeActivity.9(this));
      AppMethodBeat.o(125651);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125654);
    super.onDestroy();
    this.gBm.ajK();
    if (this.gAT != null)
      this.gAT.logout();
    AppMethodBeat.o(125654);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125655);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
      com.tencent.mm.ui.base.b.hM(this);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(125655);
    return bool;
  }

  public void onResume()
  {
    AppMethodBeat.i(125652);
    super.onResume();
    this.gIt.init();
    AppMethodBeat.o(125652);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.WelcomeActivity
 * JD-Core Version:    0.6.2
 */