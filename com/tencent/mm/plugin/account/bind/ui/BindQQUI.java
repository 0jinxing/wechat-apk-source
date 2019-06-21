package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

public class BindQQUI extends MMWizardActivity
  implements f
{
  private String grp = null;
  private String grq = null;
  com.tencent.mm.ui.base.p tipDialog;
  private int type = 0;

  private void apf()
  {
    AppMethodBeat.i(13558);
    setMMTitle(2131297609);
    Object localObject = (TextView)findViewById(2131821780);
    ((TextView)localObject).setVisibility(8);
    ((TextView)localObject).setText(2131297607);
    ((TextView)findViewById(2131821779)).setVisibility(8);
    localObject = (Button)findViewById(2131821781);
    ((Button)localObject).setVisibility(0);
    ((Button)localObject).setText(2131297606);
    ((Button)localObject).setOnClickListener(new BindQQUI.5(this));
    removeOptionMenu(1);
    AppMethodBeat.o(13558);
  }

  private void gd(long paramLong)
  {
    AppMethodBeat.i(13559);
    setMMTitle(2131297605);
    Object localObject = (TextView)findViewById(2131821780);
    ((TextView)localObject).setVisibility(8);
    ((TextView)localObject).setText(2131297603);
    localObject = (TextView)findViewById(2131821779);
    ((TextView)localObject).setVisibility(0);
    ((TextView)localObject).setText(getString(2131297604) + paramLong);
    localObject = (Button)findViewById(2131821781);
    ((Button)localObject).setVisibility(8);
    ((Button)localObject).setText(2131300486);
    ((Button)localObject).setOnClickListener(new BindQQUI.6(this));
    addIconOptionMenu(1, 2130839555, new BindQQUI.7(this));
    AppMethodBeat.o(13559);
  }

  public final int getLayoutId()
  {
    return 2130968847;
  }

  public final void initView()
  {
    AppMethodBeat.i(13557);
    long l = new com.tencent.mm.a.p(bo.h((Integer)g.RP().Ry().get(9, null))).longValue();
    if (l == 0L)
    {
      apf();
      if (this.type != 1)
        break label87;
      addTextOptionMenu(0, getString(2131296958), new BindQQUI.1(this));
      AppMethodBeat.o(13557);
    }
    while (true)
    {
      return;
      gd(l);
      break;
      label87: setBackBtn(new BindQQUI.4(this));
      AppMethodBeat.o(13557);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(13561);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.d("MicroMsg.BindQQUI", "summerunbind onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(13561);
      return;
      if (paramInt2 == -1)
      {
        ab.i("MicroMsg.BindQQUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again qq");
        paramIntent = new y(y.gvV);
        g.Rg().a(paramIntent, 0);
        getString(2131297061);
        this.tipDialog = h.b(this, getString(2131296965), true, new BindQQUI.3(this));
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13554);
    super.onCreate(paramBundle);
    this.type = getIntent().getIntExtra("bindqq_regbymobile", 0);
    g.Rg().a(254, this);
    g.Rg().a(255, this);
    AppMethodBeat.o(13554);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13555);
    g.Rg().b(254, this);
    g.Rg().b(255, this);
    super.onDestroy();
    AppMethodBeat.o(13555);
  }

  public void onResume()
  {
    AppMethodBeat.i(13556);
    super.onResume();
    initView();
    AppMethodBeat.o(13556);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(13560);
    ab.d("MicroMsg.BindQQUI", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramm.getType());
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if (paramm.getType() == 254)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.grp = ((y)paramm).aqd();
        if ((this.grp != null) && (this.grp.length() > 0))
          g.RP().Ry().set(102407, this.grp);
        if (!bo.isNullOrNil(this.grq))
        {
          paramString = new Intent(this, StartUnbindQQ.class);
          paramString.putExtra("notice", this.grq);
          J(this, paramString);
          AppMethodBeat.o(13560);
        }
      }
    while (true)
    {
      return;
      paramString = new r(2);
      g.Rg().a(paramString, 0);
      AppMethodBeat.o(13560);
      continue;
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      if (paramInt2 == -3)
      {
        ab.d("MicroMsg.BindQQUI", "summerunbind MMFunc_QueryHasPasswd err and set psw");
        h.a(this.mController.ylL, getString(2131303327), null, getString(2131303328), getString(2131303326), true, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(13552);
            paramAnonymousDialogInterface = new Intent();
            paramAnonymousDialogInterface.putExtra("kintent_hint", BindQQUI.this.getString(2131303325));
            paramAnonymousDialogInterface.putExtra("from_unbind", true);
            d.b(BindQQUI.this, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", paramAnonymousDialogInterface, 1);
            AppMethodBeat.o(13552);
          }
        }
        , new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
          }
        });
        AppMethodBeat.o(13560);
      }
      else if (paramInt2 == -81)
      {
        h.a(this, 2131303004, 2131297061, null);
        AppMethodBeat.o(13560);
      }
      else if (paramInt2 == -82)
      {
        h.a(this, 2131303005, 2131297061, null);
        AppMethodBeat.o(13560);
      }
      else if (paramInt2 == -83)
      {
        h.a(this, 2131303002, 2131297061, null);
        AppMethodBeat.o(13560);
      }
      else if (paramInt2 == -84)
      {
        h.a(this, 2131303003, 2131297061, null);
        AppMethodBeat.o(13560);
      }
      else if (paramInt2 == -85)
      {
        h.a(this, 2131303001, 2131297061, null);
        AppMethodBeat.o(13560);
      }
      else if (paramInt2 == -86)
      {
        h.a(this, 2131303007, 2131297061, null);
        AppMethodBeat.o(13560);
        continue;
        if (paramm.getType() == 255)
        {
          if (paramInt2 == 0)
          {
            J(this, new Intent(this, StartUnbindQQ.class));
            AppMethodBeat.o(13560);
            continue;
          }
          h.a(this.mController.ylL, getString(2131303327), null, getString(2131303328), getString(2131303326), true, new BindQQUI.10(this), new BindQQUI.11(this));
        }
      }
      else
      {
        AppMethodBeat.o(13560);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindQQUI
 * JD-Core Version:    0.6.2
 */