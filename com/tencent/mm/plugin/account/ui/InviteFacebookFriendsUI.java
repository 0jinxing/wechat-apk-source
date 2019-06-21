package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.o;

public class InviteFacebookFriendsUI extends MMActivity
  implements f
{
  private ProgressDialog ehJ = null;
  InviteFacebookFriendsUI.a gBv;
  private ListView gtT;
  private View gtV;
  String gtX;
  private final int gyc = 5;

  private void bj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(124898);
    com.tencent.mm.ui.base.h.a(this, paramString2, paramString1, new InviteFacebookFriendsUI.2(this), null);
    AppMethodBeat.o(124898);
  }

  public final int getLayoutId()
  {
    return 2130969545;
  }

  public final void initView()
  {
    AppMethodBeat.i(124897);
    this.gtT = ((ListView)findViewById(2131824012));
    Object localObject1 = (TextView)findViewById(2131821807);
    ((TextView)localObject1).setText(2131299539);
    Object localObject2 = new o((byte)0);
    ((o)localObject2).zHa = new InviteFacebookFriendsUI.1(this);
    a((o)localObject2);
    this.gBv = new InviteFacebookFriendsUI.a(this, new InviteFacebookFriendsUI.3(this, (TextView)localObject1));
    this.gtT.setAdapter(this.gBv);
    this.gtV = findViewById(2131824014);
    this.gtT.setOnItemClickListener(new InviteFacebookFriendsUI.4(this));
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.InviteFacebookFriendsUI", "isBindForFacebookApp:" + r.Za());
    final com.tencent.mm.plugin.account.friend.a.ab localab;
    if (r.Za())
    {
      this.gtT.setVisibility(0);
      this.gtV.setVisibility(8);
      long l = bo.c((Long)g.RP().Ry().get(65831, null));
      localObject1 = bo.nullAsNil((String)g.RP().Ry().get(65830, null));
      if ((bo.gb(l) > 86400000L) && (((String)localObject1).length() > 0))
      {
        localObject2 = new c(getString(2131305891));
        ((c)localObject2).arX((String)localObject1);
        new com.tencent.mm.plugin.account.model.h((c)localObject2, new InviteFacebookFriendsUI.5(this)).apm();
      }
      localab = new com.tencent.mm.plugin.account.friend.a.ab();
      localab.aqg();
      localObject2 = new ap(new InviteFacebookFriendsUI.6(this, localab), false);
      if (bo.h((Integer)g.RP().Ry().get(65829, null)) <= 0)
        break label430;
      g.RP().Ry().set(65829, Integer.valueOf(1));
      g.Rg().a(localab, 0);
    }
    while (true)
    {
      localObject1 = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject1, getString(2131302046), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(124878);
          this.gBi.stopTimer();
          g.Rg().c(localab);
          AppMethodBeat.o(124878);
        }
      });
      setBackBtn(new InviteFacebookFriendsUI.8(this));
      new InviteFacebookFriendsUI.9(this);
      addTextOptionMenu(0, getString(2131299543), new InviteFacebookFriendsUI.10(this));
      showOptionMenu(false);
      AppMethodBeat.o(124897);
      return;
      label430: ((ap)localObject2).ae(5000L, 5000L);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(124895);
    super.onCreate(paramBundle);
    setMMTitle(2131299546);
    g.Rg().a(32, this);
    initView();
    AppMethodBeat.o(124895);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(124896);
    g.Rg().b(32, this);
    this.gBv.bIf();
    super.onDestroy();
    AppMethodBeat.o(124896);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(124899);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.InviteFacebookFriendsUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramm.getType() != 32)
      AppMethodBeat.o(124899);
    while (true)
    {
      return;
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      if ((paramInt1 == 4) && (paramInt2 == -68))
      {
        paramm = paramString;
        if (bo.isNullOrNil(paramString))
          paramm = "error";
        bj(getString(2131297061), paramm);
        AppMethodBeat.o(124899);
      }
      else if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.gBv.a(null, null);
        AppMethodBeat.o(124899);
      }
      else
      {
        Toast.makeText(this, 2131301454, 0).show();
        AppMethodBeat.o(124899);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.InviteFacebookFriendsUI
 * JD-Core Version:    0.6.2
 */