package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.t;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

public class AppBrandOpenWeRunSettingUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private ad ehM = null;
  private ImageView eks;
  private TextView gne;
  private TextView gnh;
  private TextView gtO;
  private TextView iGX;
  com.tencent.mm.ui.base.p iGY;

  private void aMk()
  {
    AppMethodBeat.i(132999);
    a.b.b(this.eks, this.ehM.field_username);
    this.gtO.setText(this.ehM.Oj());
    if (a.jh(this.ehM.field_type))
    {
      this.gnh.setTextColor(com.tencent.mm.ui.tools.q.ii(this.mController.ylL));
      this.gnh.setText(2131303211);
      this.gnh.setCompoundDrawablesWithIntrinsicBounds(2130840329, 0, 0, 0);
      this.iGX.setText(2131303211);
      this.iGX.setClickable(false);
      AppMethodBeat.o(132999);
    }
    while (true)
    {
      return;
      this.gnh.setTextColor(com.tencent.mm.ui.tools.q.ij(this.mController.ylL));
      this.gnh.setText(2131303219);
      this.gnh.setCompoundDrawablesWithIntrinsicBounds(2130840328, 0, 0, 0);
      this.iGX.setText(2131303209);
      this.iGX.setClickable(true);
      AppMethodBeat.o(132999);
    }
  }

  public final int getLayoutId()
  {
    return 2130968697;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(132998);
    super.onCreate(paramBundle);
    setMMTitle(getString(2131296733));
    this.eks = ((ImageView)findViewById(2131821239));
    this.gtO = ((TextView)findViewById(2131821240));
    this.gnh = ((TextView)findViewById(2131821241));
    this.gne = ((TextView)findViewById(2131821242));
    this.iGX = ((TextView)findViewById(2131821244));
    this.iGX.setOnClickListener(new AppBrandOpenWeRunSettingUI.1(this));
    setBackBtn(new AppBrandOpenWeRunSettingUI.2(this));
    paramBundle = bo.nullAsNil(getIntent().getStringExtra("OpenWeRunSettingName"));
    this.ehM = ((j)g.K(j.class)).XM().aoO("gh_43f2581f6fd6");
    if ((this.ehM == null) || ((int)this.ehM.ewQ == 0))
    {
      getString(2131297061);
      this.iGY = h.b(this, getString(2131297086), true, null);
      this.iGY.show();
      ao.a.flu.a("gh_43f2581f6fd6", "", new AppBrandOpenWeRunSettingUI.3(this));
    }
    this.gne.setText(getString(2131296735, new Object[] { paramBundle }));
    aMk();
    AppMethodBeat.o(132998);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(133000);
    if ((paramm instanceof com.tencent.mm.pluginsdk.model.m))
    {
      g.RO().eJo.b(30, this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break label122;
      ab.e("MicroMsg.AppBrandOpenWeRunSettingUI", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 == 4) && (paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
        Toast.makeText(ah.getContext(), paramString, 1).show();
      setResult(1);
    }
    label122: String str1;
    while (true)
    {
      if (this.iGY != null)
        this.iGY.dismiss();
      aMk();
      AppMethodBeat.o(133000);
      return;
      str1 = ((com.tencent.mm.pluginsdk.model.m)paramm).dhl();
      ab.i("MicroMsg.AppBrandOpenWeRunSettingUI", "bind fitness contact %s success", new Object[] { str1 });
      this.ehM = ((j)g.K(j.class)).XM().aoO("gh_43f2581f6fd6");
      paramm = this.ehM;
      if ((paramm != null) && (!bo.isNullOrNil(str1)))
        break;
      ab.e("MicroMsg.AppBrandOpenWeRunSettingUI", "respUsername == " + str1 + ", contact = " + paramm);
      paramString = com.tencent.mm.aj.z.aeR().qP(this.ehM.field_username);
      com.tencent.mm.aj.z.aeR().e(paramString);
      g.RP().Ry().set(327825, Boolean.TRUE);
      setResult(-1);
      al.n(new AppBrandOpenWeRunSettingUI.4(this), 1500L);
    }
    if (t.mX(paramm.field_username))
    {
      String str2 = bo.nullAsNil(paramm.field_username);
      paramString = com.tencent.mm.aj.f.qX(str2);
      if (paramString != null)
        paramString.field_username = str1;
      com.tencent.mm.aj.z.aeR().delete(str2);
      paramm.iH(str2);
    }
    while (true)
    {
      paramm.setUsername(str1);
      if ((int)paramm.ewQ == 0)
        ((j)g.K(j.class)).XM().aa(paramm);
      if ((int)paramm.ewQ <= 0)
      {
        ab.e("MicroMsg.AppBrandOpenWeRunSettingUI", "addContact : insert contact failed");
        break;
      }
      t.q(paramm);
      paramm = ((j)g.K(j.class)).XM().aoO(paramm.field_username);
      if (paramString != null)
      {
        com.tencent.mm.aj.z.aeR().d(paramString);
        break;
      }
      paramString = com.tencent.mm.aj.f.qX(paramm.field_username);
      if ((paramString == null) || (paramString.adJ()))
      {
        ab.d("MicroMsg.AppBrandOpenWeRunSettingUI", "shouldUpdate");
        ao.a.flu.ai(paramm.field_username, "");
        com.tencent.mm.ah.b.pY(paramm.field_username);
        break;
      }
      if (!paramm.dsi())
        break;
      ab.d("MicroMsg.AppBrandOpenWeRunSettingUI", "update contact, last check time=%d", new Object[] { Integer.valueOf(paramm.duj) });
      ao.a.flu.ai(paramm.field_username, "");
      com.tencent.mm.ah.b.pY(paramm.field_username);
      break;
      paramString = null;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI
 * JD-Core Version:    0.6.2
 */