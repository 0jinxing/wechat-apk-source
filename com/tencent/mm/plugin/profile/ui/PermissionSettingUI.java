package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ic;
import com.tencent.mm.g.a.mo;
import com.tencent.mm.g.a.rd;
import com.tencent.mm.g.a.ro;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

public class PermissionSettingUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private boolean ppf = false;
  private ad ppg = null;
  private boolean pph = false;
  private boolean ppi = false;
  private long ppj = 0L;
  private int scene = 0;
  public com.tencent.mm.ui.base.p tipDialog = null;
  private String userName = "";

  private static boolean UV(String paramString)
  {
    AppMethodBeat.i(23750);
    boolean bool = n.qFA.UV(paramString);
    AppMethodBeat.o(23750);
    return bool;
  }

  private void cbv()
  {
    AppMethodBeat.i(23749);
    g.RQ();
    this.ppg = ((j)g.K(j.class)).XM().aoO(this.userName);
    this.ppg.setUsername(this.userName);
    boolean bool1 = this.ppg.Od();
    boolean bool2 = UV(this.userName);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("star_contact");
    boolean bool3 = this.ppg.Oc();
    Object localObject;
    int i;
    if (bool3)
    {
      localObject = this.mController.ylL.getResources().getString(2131298740);
      localCheckBoxPreference.setTitle((CharSequence)localObject);
      localCheckBoxPreference.uOT = bool3;
      this.ehK.ce("star_contact", true);
      localObject = (CheckBoxPreference)this.ehK.aqO("sns_outside_permiss");
      ((CheckBoxPreference)localObject).uOT = bool1;
      i = this.ppg.dtS;
      ab.d("MicroMsg.SnsPermissionUI", "sex:%d", new Object[] { Integer.valueOf(i) });
      if (i != 1)
        break label292;
      ((CheckBoxPreference)localObject).setTitle(2131303733);
      label196: localObject = (CheckBoxPreference)this.ehK.aqO("sns_black_permiss");
      if (i != 1)
        break label308;
      ((CheckBoxPreference)localObject).setTitle(2131303604);
    }
    while (true)
    {
      ((CheckBoxPreference)localObject).uOT = bool2;
      if (!com.tencent.mm.n.a.jh(this.ppg.field_type))
        this.ehK.aqP("sns_black_permiss");
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(23749);
      return;
      localObject = this.mController.ylL.getResources().getString(2131298524);
      break;
      label292: if (i != 2)
        break label196;
      ((CheckBoxPreference)localObject).setTitle(2131303732);
      break label196;
      label308: if (i == 2)
        ((CheckBoxPreference)localObject).setTitle(2131303603);
    }
  }

  public final int JC()
  {
    return 2131165256;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    AppMethodBeat.i(23752);
    paramf = paramPreference.mKey;
    if (paramf.equals("sns_outside_permiss"))
    {
      paramf = new ro();
      paramf.cNw.cNy = true;
      paramf.cNw.cNx = false;
      paramf.cNw.username = this.userName;
      com.tencent.mm.sdk.b.a.xxA.m(paramf);
      if (this.ppg.Od())
      {
        t.l(this.ppg);
        AppMethodBeat.o(23752);
      }
    }
    while (true)
    {
      return bool1;
      t.k(this.ppg);
      break;
      if (paramf.equals("sns_black_permiss"))
      {
        paramf = new ro();
        paramf.cNw.cNy = false;
        paramf.cNw.cNx = true;
        paramf.cNw.username = this.userName;
        boolean bool2 = UV(this.userName);
        paramf.cNw.cNz = bool2;
        Object localObject = this.userName;
        int i;
        if (bool2)
        {
          i = 2;
          label176: if ((i != 1) || (5L != 5L))
            break label313;
          this.pph = true;
        }
        for (this.ppi = false; ; this.ppi = false)
        {
          paramPreference = new LinkedList();
          paramPreference.add(localObject);
          localObject = new mo();
          ((mo)localObject).cIr.list = paramPreference;
          ((mo)localObject).cIr.czE = i;
          ((mo)localObject).cIr.cIs = 5L;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
          getString(2131297061);
          this.tipDialog = h.b(this, getString(2131298501), true, null);
          com.tencent.mm.sdk.b.a.xxA.m(paramf);
          AppMethodBeat.o(23752);
          break;
          i = 1;
          break label176;
          label313: this.pph = false;
        }
      }
      if (paramf.equals("star_contact"))
      {
        if (this.ppg.Oc())
          t.n(this.ppg);
        while (true)
        {
          AppMethodBeat.o(23752);
          break;
          t.m(this.ppg);
        }
      }
      AppMethodBeat.o(23752);
      bool1 = false;
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(23746);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.SnsPermissionUI", "dispatchKeyEvent");
      setResult(-1, new Intent());
      finish();
      bool = true;
      AppMethodBeat.o(23746);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(23746);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(23748);
    this.ehK = this.yCw;
    setMMTitle(2131303735);
    setBackBtn(new PermissionSettingUI.1(this));
    cbv();
    AppMethodBeat.o(23748);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(23745);
    super.onCreate(paramBundle);
    g.RQ();
    g.RO().eJo.a(291, this);
    this.userName = getIntent().getStringExtra("sns_permission_userName");
    this.ppf = getIntent().getBooleanExtra("sns_permission_anim", false);
    this.ppj = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
    this.scene = getIntent().getIntExtra("sns_permission_block_scene", 0);
    ab.d("MicroMsg.SnsPermissionUI", "SnsPermissionUI, scene:%d", new Object[] { Integer.valueOf(this.scene) });
    g.RQ();
    this.ppg = ((j)g.K(j.class)).XM().aoO(this.userName);
    if (this.ppg == null)
    {
      ab.e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", new Object[] { this.userName });
      finish();
    }
    this.ppg.setUsername(this.userName);
    initView();
    paramBundle = new ic();
    paramBundle.cDb.cAd = 1;
    com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
    AppMethodBeat.o(23745);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(23747);
    super.onDestroy();
    com.tencent.mm.plugin.profile.b.gkF.BS();
    g.RQ();
    g.RO().eJo.b(291, this);
    if ((this.ppj != 0L) && (this.ppj != -1L))
    {
      rd localrd = new rd();
      localrd.cNh.cNi = this.ppi;
      localrd.cNh.cBh = this.ppj;
      com.tencent.mm.sdk.b.a.xxA.m(localrd);
    }
    AppMethodBeat.o(23747);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(23751);
    ab.i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " " + paramm.getType());
    if (paramm.getType() == 291)
    {
      paramString = new StringBuilder("tipDialog ");
      if (this.tipDialog != null)
        break label150;
    }
    label150: for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.SnsPermissionUI", bool);
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      cbv();
      if (this.pph)
        this.ppi = true;
      AppMethodBeat.o(23751);
      return;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.PermissionSettingUI
 * JD-Core Version:    0.6.2
 */