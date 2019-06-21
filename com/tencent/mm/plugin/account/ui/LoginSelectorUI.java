package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.q;

@Deprecated
public class LoginSelectorUI extends MMActivity
  implements View.OnClickListener
{
  private TextView gCN;
  private View gCO;

  public final int getLayoutId()
  {
    return 2130970595;
  }

  public final void initView()
  {
    AppMethodBeat.i(125010);
    Button localButton1 = (Button)findViewById(2131827314);
    Button localButton2 = (Button)findViewById(2131827313);
    this.gCN = ((TextView)findViewById(2131827316));
    this.gCO = findViewById(2131827315);
    localButton1.setOnClickListener(this);
    localButton2.setOnClickListener(this);
    this.gCN.setText(aa.gx(this.mController.ylL));
    this.gCO.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(125007);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("not_auth_setting", true);
        com.tencent.mm.plugin.account.a.a.gkE.o(paramAnonymousView, LoginSelectorUI.this.mController.ylL);
        AppMethodBeat.o(125007);
      }
    });
    if (com.tencent.mm.sdk.platformtools.g.xyf)
    {
      com.tencent.mm.plugin.account.a.a.gkF.p(this);
      AppMethodBeat.o(125010);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.account.a.a.gkF.bc(this);
      AppMethodBeat.o(125010);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(125012);
    if (2131827314 == paramView.getId())
    {
      paramView = new Intent(this, MobileInputUI.class);
      paramView.putExtra("mobile_input_purpose", 1);
      startActivity(paramView);
      AppMethodBeat.o(125012);
    }
    while (true)
    {
      return;
      if (2131827313 == paramView.getId())
      {
        if (d.vxr)
        {
          String str = getString(2131298802, new Object[] { "0x" + Integer.toHexString(d.vxo), aa.dor() });
          paramView = new Intent();
          paramView.putExtra("rawUrl", str);
          paramView.putExtra("showShare", false);
          paramView.putExtra("show_bottom", false);
          paramView.putExtra("needRedirect", false);
          paramView.putExtra("neverGetA8Key", true);
          paramView.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
          paramView.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
          com.tencent.mm.plugin.account.a.a.gkE.i(paramView, this);
          AppMethodBeat.o(125012);
        }
        else
        {
          startActivity(new Intent(this, RegByMobileRegAIOUI.class));
        }
      }
      else
        AppMethodBeat.o(125012);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125008);
    super.onCreate(paramBundle);
    setTitleVisibility(8);
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.kernel.a.Rc();
    initView();
    AppMethodBeat.o(125008);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(125011);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      Intent localIntent = com.tencent.mm.plugin.account.a.a.gkE.bh(this);
      localIntent.addFlags(67108864);
      localIntent.putExtra("can_finish", true);
      startActivity(localIntent);
      finish();
      b.hM(this);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(125011);
    return bool;
  }

  public void onResume()
  {
    AppMethodBeat.i(125009);
    super.onResume();
    com.tencent.mm.kernel.g.RN();
    com.tencent.mm.kernel.a.Rc();
    AppMethodBeat.o(125009);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginSelectorUI
 * JD-Core Version:    0.6.2
 */