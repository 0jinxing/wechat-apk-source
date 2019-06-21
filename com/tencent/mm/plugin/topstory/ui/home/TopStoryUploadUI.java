package com.tencent.mm.plugin.topstory.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.d;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.sns.ui.SnsEditText;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.tools.i;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.tj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q.b;

public class TopStoryUploadUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  public static c sCQ;
  private String appVersion;
  private String businessType;
  private String csB;
  private String desc;
  private String extInfo;
  private TextView nDX;
  private long rCN = 0L;
  private String sCR;
  private String sCS;
  private ImageView sCT;
  private TextView sCU;
  private TextView sCV;
  private TextView sCW;
  private SnsEditText sCX;
  private TextView sCY;
  private boolean sCZ = false;
  private String thumbUrl;
  protected com.tencent.mm.ui.base.p tipDialog = null;
  private String title;

  static
  {
    AppMethodBeat.i(1699);
    c.a locala = new c.a();
    locala.ePH = true;
    locala.ePG = true;
    locala.eQf = false;
    locala.ePT = 2131690151;
    sCQ = locala.ahG();
    AppMethodBeat.o(1699);
  }

  protected static boolean bBL()
  {
    AppMethodBeat.i(1686);
    int i;
    boolean bool;
    if (((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).SG())
    {
      i = com.tencent.mm.kernel.g.Rg().acS();
      if ((i == 4) || (i == 6))
      {
        AppMethodBeat.o(1686);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(1686);
      bool = false;
      continue;
      if (at.isConnected(ah.getContext()));
      for (i = 6; ; i = 0)
      {
        if (i != 6)
          break label94;
        AppMethodBeat.o(1686);
        bool = true;
        break;
      }
      label94: AppMethodBeat.o(1686);
      bool = false;
    }
  }

  private void cFI()
  {
    AppMethodBeat.i(1688);
    i.c(this.businessType, "", this.csB, 0, "");
    finish();
    this.sCZ = true;
    AppMethodBeat.o(1688);
  }

  public static String cFJ()
  {
    AppMethodBeat.i(1690);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RN();
    localObject = com.tencent.mm.a.p.getString(com.tencent.mm.kernel.a.QF()) + "_" + System.currentTimeMillis();
    AppMethodBeat.o(1690);
    return localObject;
  }

  private void cFK()
  {
    AppMethodBeat.i(1694);
    int i = this.sCX.getText().toString().length();
    if (i < 180)
    {
      this.nDX.setVisibility(8);
      this.sCW.setVisibility(8);
      AppMethodBeat.o(1694);
      return;
    }
    this.nDX.setVisibility(0);
    this.sCW.setVisibility(0);
    if (i <= 200);
    for (int j = getResources().getColor(2131690592); ; j = getResources().getColor(2131690384))
    {
      this.nDX.setText(String.valueOf(i));
      this.nDX.setTextColor(j);
      AppMethodBeat.o(1694);
      break;
    }
  }

  private void exit()
  {
    AppMethodBeat.i(1687);
    com.tencent.mm.plugin.report.service.h.pYm.e(17080, new Object[] { Integer.valueOf(3), Integer.valueOf(2), this.csB });
    if (this.sCX.getText().toString().length() > 0)
    {
      com.tencent.mm.ui.base.h.a(this, 2131306047, 0, 2131297088, 2131296990, true, new TopStoryUploadUI.5(this), new TopStoryUploadUI.6(this), 2131689776);
      AppMethodBeat.o(1687);
    }
    while (true)
    {
      return;
      cFI();
      AppMethodBeat.o(1687);
    }
  }

  public final int a(long paramLong, String paramString1, String paramString2, String paramString3, com.tencent.mm.pluginsdk.model.app.f paramf, String paramString4)
  {
    AppMethodBeat.i(1691);
    paramString1 = new com.tencent.mm.plugin.topstory.a.c.g(paramLong, paramString1, paramString2, paramString3, paramf, paramString4);
    com.tencent.mm.kernel.g.Rg().a(paramString1, 0);
    getString(2131297061);
    this.tipDialog = com.tencent.mm.ui.base.h.b(this, getString(2131306052), false, null);
    AppMethodBeat.o(1691);
    return 0;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(1693);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      exit();
      bool = true;
      AppMethodBeat.o(1693);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(1693);
    }
  }

  public final int getLayoutId()
  {
    return 2130970962;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1685);
    ab.i("micromsg.topstory.TopStoryUploadUI", "onCreate");
    super.onCreate(paramBundle);
    setMMTitle(2131306051);
    a(0, getString(2131297041), new TopStoryUploadUI.4(this), q.b.ymE);
    setBackBtn(new TopStoryUploadUI.1(this));
    com.tencent.mm.kernel.g.Rg().a(2534, this);
    this.businessType = getIntent().getStringExtra("KEY_BIZTYPE");
    this.csB = getIntent().getStringExtra("KEY_APPID");
    this.extInfo = getIntent().getStringExtra("KEY_EXTINFO");
    this.title = getIntent().getStringExtra("KEY_TITLE");
    this.desc = getIntent().getStringExtra("KEY_DESC");
    this.thumbUrl = getIntent().getStringExtra("KEY_THUMBURL");
    this.appVersion = getIntent().getStringExtra("KEY_APPVERSION");
    this.sCR = getIntent().getStringExtra("KEY_MEDIANAME");
    this.sCS = getIntent().getStringExtra("KEY_MEDIAHEADURL");
    this.sCT = ((ImageView)findViewById(2131828344));
    this.sCU = ((TextView)findViewById(2131828345));
    this.sCV = ((TextView)findViewById(2131824506));
    this.sCX = ((SnsEditText)findViewById(2131828264));
    this.sCY = ((TextView)findViewById(2131828348));
    this.nDX = ((TextView)findViewById(2131828347));
    this.sCW = ((TextView)findViewById(2131828346));
    this.sCU.setText(this.title);
    this.sCV.setText(this.sCR);
    o.ahp().a(this.thumbUrl, this.sCT, sCQ, new TopStoryUploadUI.2(this));
    this.sCY.setText(String.format("<a href='%s'>%s</a>", new Object[] { "https://search.weixin.qq.com/cgi-bin/recweb/clientjump?tag=colikefirstsight#wechat_redirect", getString(2131306049) }));
    j.h(this.sCY, 1);
    cFK();
    this.sCX.addTextChangedListener(new TopStoryUploadUI.3(this));
    com.tencent.mm.plugin.report.service.h.pYm.e(17080, new Object[] { Integer.valueOf(6), Integer.valueOf(1), this.csB });
    AppMethodBeat.o(1685);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(1692);
    ab.i("micromsg.topstory.TopStoryUploadUI", "onDestroy");
    super.onDestroy();
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    com.tencent.mm.kernel.g.Rg().b(2534, this);
    if (!this.sCZ)
      com.tencent.mm.plugin.report.service.h.pYm.e(17080, new Object[] { Integer.valueOf(3), Integer.valueOf(2), this.csB });
    AppMethodBeat.o(1692);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(1689);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
      paramInt1 = 1;
    while (true)
      if (paramInt1 != 0)
        if ((paramm instanceof com.tencent.mm.plugin.topstory.a.c.g))
        {
          paramString = ((tj)((com.tencent.mm.plugin.topstory.a.c.g)paramm).ehh.fsH.fsP).BaseResponse;
          if (paramString.Ret == 0)
          {
            cFI();
            AppMethodBeat.o(1689);
            return;
            paramInt1 = 0;
            continue;
          }
          if ((paramString.ErrMsg == null) || (bo.isNullOrNil(paramString.ErrMsg.wVI)))
            break label154;
          com.tencent.mm.ui.base.h.b(this, paramString.ErrMsg.wVI, getString(2131306048), true);
        }
    while (true)
    {
      e.pXa.a(1032L, 2L, 1L, false);
      AppMethodBeat.o(1689);
      break;
      label154: com.tencent.mm.ui.base.h.b(this, getString(2131306050), getString(2131306048), true);
      continue;
      if (bo.isNullOrNil(paramString))
        com.tencent.mm.ui.base.h.b(this, getString(2131304103), getString(2131306048), true);
      else
        com.tencent.mm.ui.base.h.b(this, paramString, getString(2131306048), true);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI
 * JD-Core Version:    0.6.2
 */