package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.ai.w;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.protocal.protobuf.ru;
import com.tencent.mm.protocal.protobuf.rv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class CheckSmsCanAddCardUI extends MMActivity
  implements f
{
  private b ehh;
  private String yfP;

  private void dwv()
  {
    AppMethodBeat.i(29164);
    Toast.makeText(this, getString(2131304229), 1).show();
    LauncherUI.ho(this);
    finish();
    AppMethodBeat.o(29164);
  }

  protected final int getLayoutId()
  {
    return 2130969910;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29161);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    if ((!aw.ZM()) || (aw.QT()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      AppMethodBeat.o(29161);
    }
    while (true)
    {
      return;
      Uri localUri = getIntent().getData();
      if (localUri != null)
      {
        paramBundle = localUri.getHost();
        if ((!bo.isNullOrNil(paramBundle)) && (paramBundle.equals("cardpackage")))
          break label232;
        ab.e("MicroMsg.CheckSmsCanAddCardUI", "err host, host = %s", new Object[] { paramBundle });
      }
      label107: for (int i = 0; ; i = 1)
      {
        if (i == 0)
          break label275;
        aw.Rg().a(1038, this);
        paramBundle = new b.a();
        paramBundle.fsJ = new ru();
        paramBundle.fsK = new rv();
        paramBundle.fsI = 1038;
        paramBundle.uri = "/cgi-bin/mmbiz-bin/api/checksmscanaddcard";
        this.ehh = paramBundle.acD();
        ((ru)this.ehh.fsG.fsP).vZg = this.yfP;
        ab.i("MicroMsg.CheckSmsCanAddCardUI", "encry value is %s", new Object[] { this.yfP });
        this.ehh = w.b(this.ehh);
        AppMethodBeat.o(29161);
        break;
        this.yfP = localUri.getQueryParameter("encrystr");
        ab.i("MicroMsg.CheckSmsCanAddCardUI", "encryptCardInfo = %s", new Object[] { this.yfP });
        if (bo.isNullOrNil(this.yfP))
          break label107;
      }
      label232: dwv();
      label275: AppMethodBeat.o(29161);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(29162);
    super.onDestroy();
    aw.Rg().b(1038, this);
    AppMethodBeat.o(29162);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(29163);
    ab.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = (rv)this.ehh.fsH.fsP;
      paramString = paramm.cMC;
      paramm = paramm.cMD;
      ab.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd cardid:%s extMsg:%s", new Object[] { paramString, paramm });
      Intent localIntent = new Intent();
      localIntent.putExtra("key_card_id", paramString);
      localIntent.putExtra("key_card_ext", paramm);
      localIntent.putExtra("key_from_scene", 8);
      localIntent.putExtra("key_is_sms_add_card", true);
      d.c(this, "card", ".ui.CardDetailUI", localIntent);
      finish();
      AppMethodBeat.o(29163);
    }
    while (true)
    {
      return;
      dwv();
      AppMethodBeat.o(29163);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.CheckSmsCanAddCardUI
 * JD-Core Version:    0.6.2
 */