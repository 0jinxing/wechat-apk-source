package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.x;
import com.tencent.mm.plugin.account.a.b.a.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.byg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;

public abstract class SetPwdUI extends MMActivity
  implements f
{
  protected ProgressDialog ehJ = null;
  protected String gHW;
  protected String gHX;
  public boolean gHY = true;

  protected ProgressDialog a(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    return com.tencent.mm.ui.base.h.b(paramContext, paramString, true, paramOnCancelListener);
  }

  protected abstract void a(a.a parama);

  protected final void arJ()
  {
    this.gHW = arl();
    this.gHX = arm();
    if (bo.isNullOrNil(this.gHW));
    while (true)
    {
      return;
      if (!this.gHW.equals(this.gHX))
      {
        a(a.a.gzc);
      }
      else if (this.gHW.length() > 16)
      {
        a(a.a.gzd);
      }
      else if (bo.amT(this.gHW))
      {
        com.tencent.mm.ui.base.h.g(this, 2131302256, 2131302287);
      }
      else if (!bo.amY(this.gHW))
      {
        if ((this.gHW.length() >= 8) && (this.gHW.length() < 16))
          a(a.a.gzf);
        else
          a(a.a.gze);
      }
      else
      {
        aqX();
        com.tencent.mm.ai.m localm = ark();
        g.Rg().a(localm, 0);
        getString(2131297061);
        this.ehJ = a(this, getString(2131302220), new SetPwdUI.1(this, localm));
        if ((aru()) && (!this.gHY))
        {
          ab.d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 0");
          com.tencent.mm.plugin.report.service.h.pYm.e(11868, new Object[] { Integer.valueOf(0) });
        }
      }
    }
  }

  protected abstract com.tencent.mm.ai.m ark();

  protected abstract String arl();

  protected abstract String arm();

  protected int arn()
  {
    return 383;
  }

  protected void art()
  {
    arJ();
  }

  public boolean aru()
  {
    return false;
  }

  protected final boolean j(int paramInt1, int paramInt2, String paramString)
  {
    if (com.tencent.mm.plugin.account.a.a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected abstract boolean k(int paramInt1, int paramInt2, String paramString);

  public void onBackPressed()
  {
    if (this.gHY)
    {
      if (aru())
      {
        ab.d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 1");
        com.tencent.mm.plugin.report.service.h.pYm.e(11868, new Object[] { Integer.valueOf(1) });
      }
      super.onBackPressed();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    g.Rg().a(arn(), this);
    super.onCreate(paramBundle);
    a(0, getString(2131296944), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(125567);
        SetPwdUI.this.art();
        AppMethodBeat.o(125567);
        return true;
      }
    }
    , q.b.ymu);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(125568);
        paramAnonymousMenuItem = SetPwdUI.this;
        if ((paramAnonymousMenuItem.aru()) && (paramAnonymousMenuItem.gHY))
        {
          ab.d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 1");
          com.tencent.mm.plugin.report.service.h.pYm.e(11868, new Object[] { Integer.valueOf(1) });
        }
        paramAnonymousMenuItem.aqX();
        paramAnonymousMenuItem.setResult(0);
        paramAnonymousMenuItem.finish();
        AppMethodBeat.o(125568);
        return true;
      }
    });
  }

  public void onDestroy()
  {
    g.Rg().b(arn(), this);
    super.onDestroy();
  }

  public void onSceneEnd(final int paramInt1, final int paramInt2, final String paramString, com.tencent.mm.ai.m paramm)
  {
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (paramm.getType() != arn());
    while (true)
    {
      return;
      if (paramm.getType() == 383)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          String str;
          if (bo.isNullOrNil((String)g.RP().Ry().get(6, null)))
          {
            ab.i("MicroMsg.SetPwdUI", "has not bind mobile");
            str = getString(2131301731);
            label88: paramm = (x)paramm;
            if ((paramm.ehh == null) || (paramm.ehh.fsH.fsP == null))
              break label291;
          }
          label291: for (paramm = (byg)paramm.ehh.fsH.fsP; ; paramm = null)
          {
            if ((paramm != null) && (paramm.vHH != null))
            {
              paramm = paramm.vHH.getBuffer().toByteArray();
              SharedPreferences.Editor localEditor = ah.getContext().getSharedPreferences("auth_info_key_prefs", com.tencent.mm.compatible.util.h.Mu()).edit();
              localEditor.putBoolean("key_auth_info_prefs_created", true);
              localEditor.putInt("key_auth_update_version", d.vxo);
              localEditor.putString("_auth_key", bo.cd(paramm));
              g.RN();
              localEditor.putInt("_auth_uin", com.tencent.mm.kernel.a.QF());
              localEditor.commit();
            }
            com.tencent.mm.ui.base.h.a(this, str, "", false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                AppMethodBeat.i(125569);
                SetPwdUI.this.setResult(-1);
                if (SetPwdUI.this.k(paramInt1, paramInt2, paramString))
                  AppMethodBeat.o(125569);
                while (true)
                {
                  return;
                  AppMethodBeat.o(125569);
                }
              }
            });
            break;
            ab.i("MicroMsg.SetPwdUI", "has bind mobile");
            str = getString(2131297602);
            break label88;
          }
        }
      }
      else if (!k(paramInt1, paramInt2, paramString))
        Toast.makeText(this, getString(2131300002, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SetPwdUI
 * JD-Core Version:    0.6.2
 */