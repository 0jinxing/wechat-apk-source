package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.friend.a.aj;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.plugin.account.model.d;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.protocal.protobuf.sa;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

public class SettingsModifyEmailAddrUI extends MMActivity
  implements f, n.b
{
  private ProgressDialog ehJ;
  private String grp = null;
  private String grq = null;
  private EditText qnH;
  private String qnI;
  private String qnJ;
  private TextView qnK;
  private TextView qnL;
  private boolean qnM;
  private boolean qnN;
  private boolean qnO;

  private void ciR()
  {
    AppMethodBeat.i(127296);
    if (this.qnM)
    {
      this.qnK.setVisibility(0);
      this.qnK.setText(getString(2131303324));
      this.qnL.setText(getString(2131303146));
      this.qnL.setTextColor(getResources().getColor(2131689638));
      this.qnH.setEnabled(false);
      this.qnH.setFilters(new InputFilter[] { new InputFilter()
      {
        public final CharSequence filter(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, Spanned paramAnonymousSpanned, int paramAnonymousInt3, int paramAnonymousInt4)
        {
          AppMethodBeat.i(127282);
          if (paramAnonymousCharSequence.length() <= 0)
          {
            paramAnonymousCharSequence = paramAnonymousSpanned.subSequence(paramAnonymousInt3, paramAnonymousInt4);
            AppMethodBeat.o(127282);
          }
          while (true)
          {
            return paramAnonymousCharSequence;
            paramAnonymousCharSequence = "";
            AppMethodBeat.o(127282);
          }
        }
      }
       });
      this.qnK.setOnClickListener(new SettingsModifyEmailAddrUI.22(this));
      hideVKB(this.qnH);
      AppMethodBeat.o(127296);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.qnI))
      {
        this.qnK.setVisibility(0);
        this.qnK.setText(getString(2131302986));
        this.qnL.setText(getString(2131302979));
        this.qnL.setTextColor(getResources().getColor(2131690384));
        this.qnH.setEnabled(false);
        this.qnH.setFilters(new InputFilter[] { new SettingsModifyEmailAddrUI.23(this) });
        this.qnK.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(127287);
            final aj localaj = new aj((String)g.RP().Ry().get(2, null));
            g.Rg().a(localaj, 0);
            paramAnonymousView = SettingsModifyEmailAddrUI.this;
            AppCompatActivity localAppCompatActivity = SettingsModifyEmailAddrUI.this.mController.ylL;
            SettingsModifyEmailAddrUI.this.getString(2131297061);
            SettingsModifyEmailAddrUI.a(paramAnonymousView, h.b(localAppCompatActivity, SettingsModifyEmailAddrUI.this.getString(2131303068), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                AppMethodBeat.i(127286);
                g.Rg().c(localaj);
                AppMethodBeat.o(127286);
              }
            }));
            SettingsModifyEmailAddrUI.this.aqX();
            AppMethodBeat.o(127287);
          }
        });
        addTextOptionMenu(0, getString(2131296894), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            AppMethodBeat.i(127288);
            SettingsModifyEmailAddrUI.b(SettingsModifyEmailAddrUI.this);
            AppMethodBeat.o(127288);
            return true;
          }
        });
        hideVKB(this.qnH);
        AppMethodBeat.o(127296);
      }
      else
      {
        ciS();
        AppMethodBeat.o(127296);
      }
    }
  }

  private void ciS()
  {
    AppMethodBeat.i(127297);
    this.qnK.setVisibility(8);
    this.qnK.setText(getString(2131303324));
    this.qnL.setText(getString(2131303146));
    this.qnL.setTextColor(getResources().getColor(2131689638));
    this.qnH.setEnabled(true);
    this.qnH.setFilters(new InputFilter[] { new SettingsModifyEmailAddrUI.26(this) });
    addTextOptionMenu(0, getString(2131297038), new SettingsModifyEmailAddrUI.27(this));
    AppMethodBeat.o(127297);
  }

  private void goBack()
  {
    AppMethodBeat.i(127298);
    aqX();
    finish();
    if (this.qnO)
    {
      setResult(-1);
      AppMethodBeat.o(127298);
    }
    while (true)
    {
      return;
      setResult(0);
      AppMethodBeat.o(127298);
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(127294);
    int i = bo.g(paramObject, 0);
    ab.d("MiroMsg.SettingsModifyEmailAddrUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
    if ((paramn != g.RP().Ry()) || (i <= 0))
    {
      ab.e("MiroMsg.SettingsModifyEmailAddrUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
      AppMethodBeat.o(127294);
      return;
    }
    paramn = (Integer)g.RP().Ry().get(7, null);
    this.qnI = ((String)g.RP().Ry().get(5, null));
    if ((paramn != null) && ((paramn.intValue() & 0x2) != 0));
    for (boolean bool = true; ; bool = false)
    {
      this.qnM = bool;
      this.qnO = this.qnM;
      if (this.qnN)
        ciR();
      AppMethodBeat.o(127294);
      break;
    }
  }

  public final int getLayoutId()
  {
    return 2130970636;
  }

  public final void initView()
  {
    AppMethodBeat.i(127295);
    setMMTitle(2131303145);
    this.qnH = ((EditText)findViewById(2131827396));
    this.qnK = ((TextView)findViewById(2131827398));
    this.qnL = ((TextView)findViewById(2131827397));
    this.qnI = ((String)g.RP().Ry().get(5, null));
    this.qnH.setText(this.qnI);
    Integer localInteger = (Integer)g.RP().Ry().get(7, null);
    if ((localInteger != null) && ((localInteger.intValue() & 0x2) != 0));
    for (boolean bool = true; ; bool = false)
    {
      this.qnM = bool;
      setBackBtn(new SettingsModifyEmailAddrUI.1(this));
      this.qnN = true;
      ciR();
      AppMethodBeat.o(127295);
      return;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(127301);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.d("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(127301);
      return;
      if (paramInt2 == -1)
      {
        ab.i("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again oldEmail: " + this.qnI + " newEmail: " + this.qnJ);
        paramIntent = new y(y.gvY);
        g.Rg().a(paramIntent, 0);
        getString(2131297061);
        this.ehJ = h.b(this, getString(2131303125), true, new SettingsModifyEmailAddrUI.21(this));
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127292);
    super.onCreate(paramBundle);
    initView();
    g.Rg().a(138, this);
    g.Rg().a(254, this);
    g.Rg().a(256, this);
    g.Rg().a(108, this);
    g.Rg().a(255, this);
    g.RP().Ry().a(this);
    AppMethodBeat.o(127292);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(127293);
    g.Rg().b(138, this);
    g.Rg().b(254, this);
    g.Rg().b(256, this);
    g.Rg().b(108, this);
    g.Rg().b(255, this);
    g.RP().Ry().b(this);
    super.onDestroy();
    AppMethodBeat.o(127293);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(127299);
    boolean bool;
    if (paramInt == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(127299);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(127299);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(127300);
    ab.i("MiroMsg.SettingsModifyEmailAddrUI", "onSceneEnd: sceneType = " + paramm.getType() + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (b.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
      AppMethodBeat.o(127300);
    while (true)
    {
      return;
      if (paramm.getType() == 254)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.grq = ((y)paramm).aqe().vZs;
          this.grp = ((y)paramm).aqd();
          if (!bo.isNullOrNil(this.grq))
          {
            paramString = new d(d.gyL, this.qnH.getText().toString().trim());
            g.Rg().a(paramString, 0);
            AppMethodBeat.o(127300);
          }
          else
          {
            paramString = new r(2);
            g.Rg().a(paramString, 0);
            AppMethodBeat.o(127300);
          }
        }
        else
        {
          if (this.ehJ != null)
          {
            this.ehJ.dismiss();
            this.ehJ = null;
          }
          if (paramInt2 == -3)
          {
            ab.d("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
            h.a(this.mController.ylL, getString(2131303327), null, getString(2131303328), getString(2131303326), true, new SettingsModifyEmailAddrUI.28(this), new SettingsModifyEmailAddrUI.2(this));
            AppMethodBeat.o(127300);
          }
          else if (paramInt2 == -82)
          {
            h.a(this, 2131303005, 2131297061, new SettingsModifyEmailAddrUI.3(this));
            AppMethodBeat.o(127300);
          }
          else if (paramInt2 == -83)
          {
            h.a(this, 2131303002, 2131297061, new SettingsModifyEmailAddrUI.4(this));
            AppMethodBeat.o(127300);
          }
          else if (paramInt2 == -84)
          {
            h.a(this, 2131303003, 2131297061, new SettingsModifyEmailAddrUI.5(this));
            AppMethodBeat.o(127300);
          }
          else if (paramInt2 == -85)
          {
            h.a(this, 2131302996, 2131297061, new SettingsModifyEmailAddrUI.6(this));
            AppMethodBeat.o(127300);
          }
        }
      }
      else if (paramm.getType() == 256)
      {
        b.gkF.BS();
        if (((d)paramm).Ah() == d.gyK)
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            h.a(this.mController.ylL, 2131303067, 2131297061, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
              }
            });
            AppMethodBeat.o(127300);
          }
          else
          {
            if (this.ehJ != null)
            {
              this.ehJ.dismiss();
              this.ehJ = null;
            }
            if (paramInt2 == -82)
            {
              h.a(this, 2131303005, 2131297061, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                }
              });
              AppMethodBeat.o(127300);
            }
            else if (paramInt2 == -83)
            {
              h.a(this, 2131303002, 2131297061, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                }
              });
              AppMethodBeat.o(127300);
            }
            else if (paramInt2 == -84)
            {
              h.a(this, 2131303003, 2131297061, new SettingsModifyEmailAddrUI.10(this));
              AppMethodBeat.o(127300);
            }
            else if (paramInt2 == -85)
            {
              h.a(this, 2131302996, 2131297061, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                }
              });
              AppMethodBeat.o(127300);
            }
            else if (paramInt2 == -86)
            {
              h.a(this, 2131303007, 2131297061, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                }
              });
              AppMethodBeat.o(127300);
            }
            else
            {
              h.a(this.mController.ylL, getString(2131303066, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), getString(2131297061), new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                }
              });
              AppMethodBeat.o(127300);
            }
          }
        }
        else if (((d)paramm).Ah() == d.gyL)
        {
          if (this.ehJ != null)
          {
            this.ehJ.dismiss();
            this.ehJ = null;
          }
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paramInt1 = ((Integer)g.RP().Ry().get(7, null)).intValue();
            g.RP().Ry().set(7, Integer.valueOf(paramInt1 | 0x2));
            if (!bo.isNullOrNil(this.grq))
            {
              h.a(this.mController.ylL, this.grq, "", getString(2131296955), new SettingsModifyEmailAddrUI.15(this));
              AppMethodBeat.o(127300);
              continue;
            }
            h.a(this.mController.ylL, 2131302998, 2131297061, new SettingsModifyEmailAddrUI.16(this));
            AppMethodBeat.o(127300);
          }
        }
      }
      else if (paramm.getType() != 138)
      {
        if (paramm.getType() == 108)
        {
          if (this.ehJ != null)
          {
            this.ehJ.dismiss();
            this.ehJ = null;
          }
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            h.a(this.mController.ylL, 2131303067, 2131297061, new SettingsModifyEmailAddrUI.17(this));
            AppMethodBeat.o(127300);
          }
          else
          {
            h.a(this.mController.ylL, getString(2131303066, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), getString(2131297061), new SettingsModifyEmailAddrUI.18(this));
            AppMethodBeat.o(127300);
          }
        }
        else if (paramm.getType() == 255)
        {
          if (paramInt2 == 0)
          {
            paramString = new d(d.gyL, this.qnH.getText().toString().trim());
            g.Rg().a(paramString, 0);
            AppMethodBeat.o(127300);
            continue;
          }
          if (this.ehJ != null)
          {
            this.ehJ.dismiss();
            this.ehJ = null;
          }
          h.a(this.mController.ylL, getString(2131303327), null, getString(2131303328), getString(2131303326), true, new SettingsModifyEmailAddrUI.19(this), new SettingsModifyEmailAddrUI.20(this));
        }
      }
      else
      {
        AppMethodBeat.o(127300);
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
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI
 * JD-Core Version:    0.6.2
 */