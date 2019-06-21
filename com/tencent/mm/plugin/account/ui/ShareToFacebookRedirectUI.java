package com.tencent.mm.plugin.account.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.e.a;

@a(3)
public class ShareToFacebookRedirectUI extends MMActivity
  implements f
{
  private static String TAG = "MicroMsg.ShareToFacebookRedirectUI";
  private com.tencent.mm.ui.base.p eir;
  private String gId;
  private String gIe;
  private String gIf;
  private String gIg;

  private void arK()
  {
    AppMethodBeat.i(125579);
    ab.i(TAG, "refreshFacebookToken");
    long l = bo.c((Long)g.RP().Ry().get(65831, null));
    String str = bo.nullAsNil((String)g.RP().Ry().get(65830, null));
    if ((bo.gb(l) > 86400000L) && (str.length() > 0))
    {
      c localc = new c(getString(2131305891));
      localc.arX(str);
      new com.tencent.mm.plugin.account.model.h(localc, new ShareToFacebookRedirectUI.3(this)).apm();
      AppMethodBeat.o(125579);
    }
    while (true)
    {
      return;
      arj();
      AppMethodBeat.o(125579);
    }
  }

  private void arj()
  {
    AppMethodBeat.i(125580);
    ab.i(TAG, "doSend");
    e.a locala = new e.a(this);
    locala.al(this.gId).asM(this.gIf).am(this.gIe).asN(getString(2131296873)).Qg(2131297047).c(new ShareToFacebookRedirectUI.4(this, locala)).show();
    AppMethodBeat.o(125580);
  }

  private void bj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(125581);
    com.tencent.mm.ui.base.h.a(this.mController.ylL, paramString2, paramString1, new ShareToFacebookRedirectUI.5(this), null);
    AppMethodBeat.o(125581);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(125582);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    String str = TAG;
    boolean bool;
    if (paramIntent == null)
    {
      bool = true;
      ab.i(str, "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if ((paramInt1 != 0) || (paramInt2 != -1) || (paramIntent == null))
        break label124;
      bool = paramIntent.getBooleanExtra("bind_facebook_succ", false);
      ab.i(TAG, "bind facebooksucc %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        break label124;
      arK();
      arj();
      AppMethodBeat.o(125582);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label124: finish();
      AppMethodBeat.o(125582);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(125576);
    super.onCreate(paramBundle);
    g.Rg().a(433, this);
    this.gId = getIntent().getStringExtra("title");
    this.gIe = getIntent().getStringExtra("digest");
    this.gIf = getIntent().getStringExtra("img");
    this.gIg = getIntent().getStringExtra("link");
    ab.i(TAG, "title %s, digest:%s, img:%s, link:%s", new Object[] { this.gId, this.gIe, this.gIf, this.gIg });
    if (!r.Za())
    {
      paramBundle = new Intent(this, FacebookAuthUI.class);
      paramBundle.putExtra("is_force_unbind", true);
      startActivityForResult(paramBundle, 0);
      AppMethodBeat.o(125576);
    }
    while (true)
    {
      return;
      arK();
      arj();
      AppMethodBeat.o(125576);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(125577);
    g.Rg().b(433, this);
    super.onDestroy();
    AppMethodBeat.o(125577);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(125578);
    ab.i(TAG, "type:%d, code:%d, msg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    aqX();
    this.eir.dismiss();
    if ((paramInt1 == 4) && (paramInt2 == -68))
    {
      paramm = paramString;
      if (bo.isNullOrNil(paramString))
        paramm = "error";
      bj(getString(2131297061), paramm);
      AppMethodBeat.o(125578);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = getString(2131303493);
        new ShareToFacebookRedirectUI.1(this);
        com.tencent.mm.ui.base.h.bQ(this, paramString);
        finish();
        AppMethodBeat.o(125578);
      }
      else
      {
        com.tencent.mm.ui.base.h.a(this.mController.ylL, "err(" + paramInt2 + "," + paramInt1 + ")", getString(2131297061), new ShareToFacebookRedirectUI.2(this), null);
        AppMethodBeat.o(125578);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI
 * JD-Core Version:    0.6.2
 */