package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.friend.a.v;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.q;

public class BindFacebookUI extends MMWizardActivity
  implements f
{
  private static final String[] gAu = { "public_profile" };
  private ProgressDialog gAr;
  private DialogInterface.OnCancelListener gAs;
  private v gAt;
  private c gyN;

  public final int getLayoutId()
  {
    return 2130968837;
  }

  public final void initView()
  {
    AppMethodBeat.i(124736);
    this.gyN = new c(getString(2131305891));
    this.gAs = new BindFacebookUI.1(this);
    addTextOptionMenu(0, getString(2131296958), new BindFacebookUI.2(this));
    setMMTitle(2131297514);
    Object localObject = (TextView)findViewById(2131821746);
    ((TextView)localObject).setVisibility(4);
    ((TextView)localObject).setText(2131297513);
    localObject = (Button)findViewById(2131821747);
    ((Button)localObject).setVisibility(0);
    ((Button)localObject).setOnClickListener(new BindFacebookUI.3(this));
    AppMethodBeat.o(124736);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124732);
    super.onCreate(paramBundle);
    AppMethodBeat.o(124732);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(124733);
    super.onDestroy();
    AppMethodBeat.o(124733);
  }

  public void onPause()
  {
    AppMethodBeat.i(124735);
    super.onPause();
    g.Rg().b(183, this);
    AppMethodBeat.o(124735);
  }

  public void onResume()
  {
    AppMethodBeat.i(124734);
    super.onResume();
    g.Rg().a(183, this);
    initView();
    AppMethodBeat.o(124734);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(124737);
    if (paramm.getType() != 183)
      AppMethodBeat.o(124737);
    int i;
    while (true)
    {
      return;
      if (this.gAr != null)
        this.gAr.dismiss();
      if (a.gkF.a(this.mController.ylL, paramInt1, paramInt2, paramString))
      {
        AppMethodBeat.o(124737);
      }
      else
      {
        i = ((v)paramm).opType;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (i == 1)
          {
            ((j)g.K(j.class)).XR().aoX("facebookapp");
            ((j)g.K(j.class)).bOr().Rh("facebookapp");
          }
          Ni(1);
          AppMethodBeat.o(124737);
        }
        else
        {
          if ((paramInt1 != 4) || (paramInt2 != -67))
            break;
          Toast.makeText(this, 2131299531, 1).show();
          AppMethodBeat.o(124737);
        }
      }
    }
    if ((paramInt1 == 4) && (paramInt2 == -5))
    {
      if (i == 1);
      for (paramInt1 = 2131299525; ; paramInt1 = 2131299534)
      {
        Toast.makeText(this, paramInt1, 1).show();
        AppMethodBeat.o(124737);
        break;
      }
    }
    if (i == 0);
    for (paramInt1 = 2131298522; ; paramInt1 = 2131298517)
    {
      Toast.makeText(this, paramInt1, 1).show();
      AppMethodBeat.o(124737);
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.BindFacebookUI
 * JD-Core Version:    0.6.2
 */