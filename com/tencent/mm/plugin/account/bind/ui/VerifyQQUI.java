package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.y;
import com.tencent.mm.g.a.hy;
import com.tencent.mm.g.a.hy.b;
import com.tencent.mm.g.a.hz;
import com.tencent.mm.g.a.hz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.jr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.a;
import com.tencent.mm.ui.applet.SecurityImage.b;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

public class VerifyQQUI extends MMWizardActivity
  implements f
{
  private String cCU;
  private String cCW;
  private byte[] frt;
  private SecurityImage gue;
  private long gut;
  private String guu;
  private String guv;
  private String guw;
  private VerifyQQUI.b gux;
  private com.tencent.mm.ui.base.p tipDialog;

  public VerifyQQUI()
  {
    AppMethodBeat.i(13786);
    this.tipDialog = null;
    this.gut = 0L;
    this.guu = "";
    this.frt = null;
    this.guv = "";
    this.gue = null;
    this.gux = new VerifyQQUI.b(this);
    AppMethodBeat.o(13786);
  }

  public final boolean apx()
  {
    AppMethodBeat.i(13790);
    aqX();
    finish();
    AppMethodBeat.o(13790);
    return true;
  }

  public final int getLayoutId()
  {
    return 2130968849;
  }

  public final void initView()
  {
    AppMethodBeat.i(13791);
    Object localObject = new hy();
    ((hy)localObject).cCS.context = this;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    this.cCU = ((hy)localObject).cCT.cCU;
    localObject = new hz();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    this.cCW = ((hz)localObject).cCV.cCW;
    setMMTitle(2131297624);
    setBackBtn(new VerifyQQUI.1(this));
    findViewById(2131821782);
    findViewById(2131821783);
    addTextOptionMenu(0, getString(2131296944), this.gux);
    AppMethodBeat.o(13791);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13787);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Rg().a(144, this);
    AppMethodBeat.o(13787);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13788);
    super.onDestroy();
    com.tencent.mm.kernel.g.Rg().b(144, this);
    AppMethodBeat.o(13788);
  }

  public void onResume()
  {
    AppMethodBeat.i(13789);
    super.onResume();
    initView();
    AppMethodBeat.o(13789);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(13792);
    ab.i("MicroMsg.VerifyQQUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    com.tencent.mm.plugin.account.bind.a.b localb = (com.tencent.mm.plugin.account.bind.a.b)paramm;
    byte[] arrayOfByte = com.tencent.mm.kernel.g.RN().QR().fs(localb.fPN);
    ab.i("MicroMsg.NetSceneBindQQ", "getRespImgBuf getWtloginMgr getVerifyImg:%d  uin:%d", new Object[] { Integer.valueOf(bo.l(arrayOfByte, new byte[0]).length), Long.valueOf(localb.fPN) });
    if (bo.cb(arrayOfByte))
      arrayOfByte = aa.a(((jr)localb.ehh.fsH.fsP).vEF);
    while (true)
    {
      this.frt = arrayOfByte;
      this.guv = ((jr)((com.tencent.mm.plugin.account.bind.a.b)paramm).ehh.fsH.fsP).vLX;
      if (this.frt != null)
        ab.d("MicroMsg.VerifyQQUI", "imgSid:" + this.guv + " img len" + this.frt.length + " " + com.tencent.mm.compatible.util.g.Mq());
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.account.a.a.gkF.BS();
        h.a(this.mController.ylL, 2131297619, 2131297620, new VerifyQQUI.2(this));
        AppMethodBeat.o(13792);
      }
      while (true)
      {
        return;
        int i;
        if (paramInt1 == 4)
          switch (paramInt2)
          {
          default:
            paramString = com.tencent.mm.h.a.jY(paramString);
            if (paramString != null)
            {
              paramString.a(this, null, null);
              i = 1;
            }
            break;
          case -4:
          case -3:
          case -12:
          case -72:
          case -5:
          case -311:
          case -310:
          case -6:
          case -34:
          }
        while (true)
        {
          if (i == 0)
            break label760;
          AppMethodBeat.o(13792);
          break;
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString != null)
          {
            paramString.a(this, null, null);
            i = 1;
          }
          else
          {
            h.g(this.mController.ylL, 2131297621, 2131297616);
            i = 1;
            continue;
            h.g(this.mController.ylL, 2131297612, 2131297616);
            i = 1;
            continue;
            h.g(this.mController.ylL, 2131297615, 2131297061);
            i = 1;
            continue;
            h.g(this.mController.ylL, 2131297613, 2131297061);
            i = 1;
            continue;
            ab.d("MicroMsg.VerifyQQUI", "imgSid:" + this.guv + " img len" + this.frt.length + " " + com.tencent.mm.compatible.util.g.Mq());
            if (!com.tencent.mm.kernel.g.RK())
            {
              i = 1;
            }
            else
            {
              if (this.gue == null)
                this.gue = SecurityImage.a.a(this.mController.ylL, 0, this.frt, this.guv, this.guw, new VerifyQQUI.3(this), null, new VerifyQQUI.4(this), new a());
              while (true)
              {
                i = 1;
                break;
                ab.d("MicroMsg.VerifyQQUI", "imgSid:" + this.guv + " img len" + this.frt.length + " " + com.tencent.mm.compatible.util.g.Mq());
                this.gue.b(0, this.frt, this.guv, this.guw);
              }
              h.g(this.mController.ylL, 2131297614, 2131297061);
              i = 1;
              continue;
              i = 0;
            }
          }
        }
        label760: Toast.makeText(this, getString(2131299925, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(13792);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends SecurityImage.b
  {
    a()
    {
    }

    public final void apw()
    {
      AppMethodBeat.i(13782);
      com.tencent.mm.plugin.account.bind.a.b localb = new com.tencent.mm.plugin.account.bind.a.b(VerifyQQUI.c(VerifyQQUI.this), VerifyQQUI.d(VerifyQQUI.this), VerifyQQUI.i(VerifyQQUI.this), "", VerifyQQUI.j(VerifyQQUI.this), 2, true);
      com.tencent.mm.kernel.g.Rg().a(localb, 0);
      AppMethodBeat.o(13782);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.VerifyQQUI
 * JD-Core Version:    0.6.2
 */