package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bk;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.pluginsdk.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMBaseActivity;

public class GetQRCodeInfoUI extends MMBaseActivity
  implements com.tencent.mm.ai.f
{
  private ProgressDialog ehJ = null;
  private com.tencent.mm.plugin.messenger.a.f qku;

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(126910);
    b.gkE.p(new Intent(), this);
    finish();
    AppMethodBeat.o(126910);
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(126906);
    super.onCreate(paramBundle);
    setContentView(2130969389);
    Object localObject = getIntent().getData();
    if (localObject == null)
    {
      finish();
      AppMethodBeat.o(126906);
    }
    while (true)
    {
      return;
      paramBundle = bo.nullAsNil(((Uri)localObject).getHost());
      localObject = bo.nullAsNil(((Uri)localObject).getScheme());
      if ((("http".equals(localObject)) && ("weixin.qq.com".equals(paramBundle))) || (("weixin".equals(localObject)) && ("qr".equals(paramBundle))))
      {
        g.Rg().a(new bk(new GetQRCodeInfoUI.1(this)), 0);
        AppMethodBeat.o(126906);
      }
      else
      {
        finish();
        AppMethodBeat.o(126906);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(126908);
    super.onDestroy();
    if (this.qku != null)
      g.Rg().c(this.qku);
    g.Rg().b(106, this);
    AppMethodBeat.o(126908);
  }

  public void onResume()
  {
    AppMethodBeat.i(126907);
    super.onResume();
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131296476), true, new GetQRCodeInfoUI.2(this));
    AppMethodBeat.o(126907);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(126909);
    ab.i("MicroMsg.GetQRCodeInfoUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == -2004))
    {
      com.tencent.mm.ui.base.h.a(this, 2131302090, 2131297061, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(126904);
          GetQRCodeInfoUI.this.finish();
          AppMethodBeat.o(126904);
        }
      });
      AppMethodBeat.o(126909);
    }
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        com.tencent.mm.ui.base.h.a(this, getString(2131299995, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), getString(2131297061), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(126905);
            GetQRCodeInfoUI.this.finish();
            AppMethodBeat.o(126905);
          }
        });
        AppMethodBeat.o(126909);
      }
      else
      {
        paramString = ((com.tencent.mm.plugin.messenger.a.f)paramm).bOj();
        String str = aa.a(paramString.wcB);
        o.acd().n(str, aa.a(paramString.vEF));
        paramm = new Intent();
        ((j)g.K(j.class)).a(paramm, paramString, 30);
        if (bo.nullAsNil(str).length() > 0)
        {
          if ((paramString.wBT & 0x8) > 0)
            com.tencent.mm.plugin.report.service.h.pYm.X(10298, str + ",30");
          com.tencent.mm.bp.d.c(this, "profile", ".ui.ContactInfoUI", 1);
        }
        AppMethodBeat.o(126909);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI
 * JD-Core Version:    0.6.2
 */