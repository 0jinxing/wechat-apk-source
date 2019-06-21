package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.au.b;
import com.tencent.mm.au.b.a;
import com.tencent.mm.bp.d;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.plugin.account.friend.ui.i;
import com.tencent.mm.protocal.protobuf.sa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

public class BindMContactIntroUI extends MMWizardActivity
  implements f
{
  private String cFl;
  private boolean gqB = false;
  private ImageView gri;
  private TextView grj;
  private TextView grk;
  private Button grl;
  private Button grm;
  private l.a grn;
  private i gro;
  private String grp = null;
  private String grq = null;
  private int grr;
  private int grs = 0;
  private com.tencent.mm.ui.base.p tipDialog = null;

  private void aoZ()
  {
    AppMethodBeat.i(13444);
    aqX();
    if (this.grr == 2)
    {
      cancel();
      finish();
      AppMethodBeat.o(13444);
    }
    while (true)
    {
      return;
      Ni(1);
      AppMethodBeat.o(13444);
    }
  }

  private void cu()
  {
    AppMethodBeat.i(13442);
    switch (BindMContactIntroUI.20.grv[this.grn.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(13442);
      while (true)
      {
        return;
        showOptionMenu(1, false);
        this.gri.setImageResource(2131231609);
        this.grk.setVisibility(0);
        this.grm.setVisibility(8);
        this.grj.setText(2131297548);
        this.grk.setText(2131297547);
        this.grl.setText(2131297522);
        AppMethodBeat.o(13442);
        continue;
        showOptionMenu(1, false);
        this.gri.setImageResource(2131231609);
        this.grk.setVisibility(0);
        this.grm.setVisibility(0);
        this.grj.setText(String.format(getString(2131297586), new Object[] { this.cFl }));
        this.grk.setText(2131297576);
        this.grl.setText(2131297580);
        this.grm.setText(2131297533);
        AppMethodBeat.o(13442);
        continue;
        showOptionMenu(1, true);
        this.gri.setImageResource(2131231608);
        this.grk.setVisibility(0);
        this.grm.setVisibility(0);
        this.grj.setText(String.format(getString(2131297586), new Object[] { this.cFl }));
        this.grk.setText(2131297529);
        this.grl.setText(2131297577);
        this.grm.setText(2131297531);
        AppMethodBeat.o(13442);
      }
      showOptionMenu(1, true);
      this.gri.setImageResource(2131231608);
      this.grk.setVisibility(0);
      this.grm.setVisibility(0);
      this.grj.setText(String.format(getString(2131297586), new Object[] { this.cFl }));
      this.grk.setText(2131297529);
      this.grl.setText(2131297546);
      this.grm.setText(2131297531);
    }
  }

  private void dj(boolean paramBoolean)
  {
    AppMethodBeat.i(13445);
    Intent localIntent = new Intent(this, BindMContactUI.class);
    if (paramBoolean)
      localIntent.putExtra("bind_scene", 3);
    while (true)
    {
      Object localObject = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = b.k(this, (String)localObject, getString(2131298789));
        if (localObject != null)
        {
          localIntent.putExtra("country_name", ((b.a)localObject).fHE);
          localIntent.putExtra("couttry_code", ((b.a)localObject).fHD);
        }
      }
      J(this, localIntent);
      AppMethodBeat.o(13445);
      return;
      localIntent.putExtra("bind_scene", 0);
    }
  }

  public final int getLayoutId()
  {
    return 2130968842;
  }

  public final void initView()
  {
    AppMethodBeat.i(13441);
    this.grr = getIntent().getIntExtra("bind_scene", 0);
    this.gqB = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.grs = getIntent().getIntExtra("key_upload_scene", 0);
    this.grn = l.apS();
    ab.d("MicroMsg.BindMContactIntroUI", "state " + this.grn);
    this.cFl = ((String)com.tencent.mm.kernel.g.RP().Ry().get(6, null));
    if ((this.cFl == null) || (this.cFl.equals("")))
      this.cFl = ((String)com.tencent.mm.kernel.g.RP().Ry().get(4097, null));
    this.gri = ((ImageView)findViewById(2131821763));
    this.grj = ((TextView)findViewById(2131821764));
    this.grk = ((TextView)findViewById(2131821765));
    this.grl = ((Button)findViewById(2131821766));
    this.grm = ((Button)findViewById(2131821767));
    this.grl.setOnClickListener(new BindMContactIntroUI.1(this));
    this.grm.setOnClickListener(new BindMContactIntroUI.12(this));
    if (getIntent().getBooleanExtra("skip", false))
      addTextOptionMenu(0, getString(2131296958), new BindMContactIntroUI.21(this));
    while (true)
    {
      if ((this.grn == l.a.gvA) || (this.grn == l.a.gvz))
      {
        String str = com.tencent.mm.m.g.Nu().getValue("ShowUnbindPhone");
        int i = 2;
        if (!bo.isNullOrNil(str))
          i = bo.ank(str);
        if (i != 0)
          addIconOptionMenu(1, 2130839555, new BindMContactIntroUI.23(this, i));
      }
      cu();
      AppMethodBeat.o(13441);
      return;
      setBackBtn(new BindMContactIntroUI.22(this));
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(13447);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.d("MicroMsg.BindMContactIntroUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(13447);
      return;
      if (paramInt2 == -1)
      {
        ab.i("MicroMsg.BindMContactIntroUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again mobile: " + this.cFl);
        paramIntent = new y(y.gvW);
        com.tencent.mm.kernel.g.Rg().a(paramIntent, 0);
        getString(2131297061);
        this.tipDialog = h.b(this, getString(2131296965), true, new BindMContactIntroUI.19(this));
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13438);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Rg().a(132, this);
    com.tencent.mm.kernel.g.Rg().a(255, this);
    com.tencent.mm.kernel.g.Rg().a(254, this);
    setMMTitle(2131297565);
    AppMethodBeat.o(13438);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13439);
    com.tencent.mm.kernel.g.Rg().b(132, this);
    com.tencent.mm.kernel.g.Rg().b(255, this);
    com.tencent.mm.kernel.g.Rg().b(254, this);
    if (this.gro != null)
      this.gro.recycle();
    super.onDestroy();
    AppMethodBeat.o(13439);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(13443);
    boolean bool;
    if (paramInt == 4)
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(13443);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13443);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(13440);
    super.onResume();
    initView();
    AppMethodBeat.o(13440);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, final com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(13446);
    ab.i("MicroMsg.BindMContactIntroUI", "summerunbind onSceneEnd type: " + paramm.getType() + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramm.getType() == 132) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      if (((x)paramm).Ah() == 3)
      {
        ((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).removeSelfAccount(this);
        if (!bo.isNullOrNil(this.grq))
        {
          h.a(this, this.grq, "", getString(2131296955), new BindMContactIntroUI.26(this));
          AppMethodBeat.o(13446);
        }
      }
    }
    label668: 
    while (true)
    {
      return;
      J(this, new Intent(this, BindMContactStatusUI.class));
      AppMethodBeat.o(13446);
      continue;
      int i;
      if (com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
        i = 1;
      while (true)
      {
        if (i == 0)
          break label419;
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
        AppMethodBeat.o(13446);
        break;
        i = 0;
        switch (paramInt2)
        {
        default:
          break;
        case -214:
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString != null)
            paramString.a(this, null, null);
          i = 1;
          break;
        case -34:
          Toast.makeText(this, 2131297538, 0).show();
          i = 1;
          break;
        case -43:
          Toast.makeText(this, 2131297535, 0).show();
          i = 1;
          break;
        case -41:
          Toast.makeText(this, 2131297537, 0).show();
          i = 1;
          break;
        case -35:
          Toast.makeText(this, 2131297536, 0).show();
          i = 1;
          break;
        case -36:
          Toast.makeText(this, 2131297540, 0).show();
          i = 1;
        }
      }
      label419: if (paramm.getType() == 254)
      {
        if (this.tipDialog != null)
        {
          this.tipDialog.dismiss();
          this.tipDialog = null;
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.grq = ((y)paramm).aqe().vZs;
          this.grp = ((y)paramm).aqd();
          if (!bo.isNullOrNil(this.grq))
          {
            paramm = new x(this.cFl, 3, "", 0, "");
            com.tencent.mm.kernel.g.Rg().a(paramm, 0);
            paramString = this.mController.ylL;
            getString(2131297061);
            this.tipDialog = h.b(paramString, getString(2131297575), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                AppMethodBeat.i(13437);
                com.tencent.mm.kernel.g.Rg().c(paramm);
                AppMethodBeat.o(13437);
              }
            });
            AppMethodBeat.o(13446);
          }
          else
          {
            paramString = new r(2);
            com.tencent.mm.kernel.g.Rg().a(paramString, 0);
            AppMethodBeat.o(13446);
          }
        }
        else if (paramInt2 == -3)
        {
          ab.d("MicroMsg.BindMContactIntroUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
          h.a(this.mController.ylL, getString(2131303327), null, getString(2131303328), getString(2131303326), true, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(13423);
              paramAnonymousDialogInterface = new Intent();
              paramAnonymousDialogInterface.putExtra("kintent_hint", BindMContactIntroUI.this.getString(2131303325));
              paramAnonymousDialogInterface.putExtra("from_unbind", true);
              d.b(BindMContactIntroUI.this, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", paramAnonymousDialogInterface, 1);
              AppMethodBeat.o(13423);
            }
          }
          , new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
            }
          });
        }
      }
      else
      {
        if (paramm.getType() == 255)
        {
          if (this.tipDialog != null)
          {
            this.tipDialog.dismiss();
            this.tipDialog = null;
          }
          if (paramInt2 != 0)
            break label1018;
          paramString = new x(this.cFl, 3, "", 0, "");
          com.tencent.mm.kernel.g.Rg().a(paramString, 0);
          AppCompatActivity localAppCompatActivity = this.mController.ylL;
          getString(2131297061);
          this.tipDialog = h.b(localAppCompatActivity, getString(2131297575), true, new BindMContactIntroUI.10(this, paramString));
        }
        while (true)
          if (paramm.getType() == 132)
          {
            if (this.tipDialog != null)
            {
              this.tipDialog.dismiss();
              this.tipDialog = null;
            }
            if (((x)paramm).Ah() == 3)
            {
              if (paramInt2 == -82)
              {
                h.a(this, 2131303005, 2131297061, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                  }
                });
                AppMethodBeat.o(13446);
                break;
                if (paramInt2 == -81)
                {
                  h.a(this, 2131303004, 2131297061, new BindMContactIntroUI.4(this));
                  break label668;
                }
                if (paramInt2 == -82)
                {
                  h.a(this, 2131303005, 2131297061, new BindMContactIntroUI.5(this));
                  break label668;
                }
                if (paramInt2 == -83)
                {
                  h.a(this, 2131303002, 2131297061, new BindMContactIntroUI.6(this));
                  break label668;
                }
                if (paramInt2 == -84)
                {
                  h.a(this, 2131303003, 2131297061, new BindMContactIntroUI.7(this));
                  break label668;
                }
                if (paramInt2 == -85)
                {
                  h.a(this, 2131302999, 2131297061, new BindMContactIntroUI.8(this));
                  break label668;
                }
                if (paramInt2 != -86)
                  break label668;
                h.a(this, 2131303007, 2131297061, new BindMContactIntroUI.9(this));
                break label668;
                label1018: ab.i("MicroMsg.BindMContactIntroUI", "summerunbind old err_password");
                h.a(this.mController.ylL, getString(2131303327), null, getString(2131303328), getString(2131303326), true, new BindMContactIntroUI.11(this), new BindMContactIntroUI.13(this));
                continue;
              }
              if (paramInt2 == -83)
              {
                h.a(this, 2131303002, 2131297061, new BindMContactIntroUI.15(this));
                AppMethodBeat.o(13446);
                break;
              }
              if (paramInt2 == -84)
              {
                h.a(this, 2131303003, 2131297061, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                  }
                });
                AppMethodBeat.o(13446);
                break;
              }
              if (paramInt2 == -85)
              {
                h.a(this, 2131302999, 2131297061, new DialogInterface.OnClickListener()
                {
                  public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                  {
                  }
                });
                AppMethodBeat.o(13446);
                break;
              }
              Toast.makeText(this, getString(2131297571, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
            }
          }
        AppMethodBeat.o(13446);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI
 * JD-Core Version:    0.6.2
 */