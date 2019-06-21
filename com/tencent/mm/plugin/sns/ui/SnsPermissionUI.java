package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rd;
import com.tencent.mm.g.a.ro;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.w;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;
import java.util.List;

public class SnsPermissionUI extends MMPreference
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
    AppMethodBeat.i(39182);
    com.tencent.mm.plugin.sns.storage.t localt = af.cnL().kF(5L);
    boolean bool;
    if (bo.isNullOrNil(localt.field_memberList))
    {
      bool = false;
      AppMethodBeat.o(39182);
    }
    while (true)
    {
      return bool;
      bool = bo.P(localt.field_memberList.split(",")).contains(paramString);
      AppMethodBeat.o(39182);
    }
  }

  private void cbv()
  {
    AppMethodBeat.i(39181);
    g.RQ();
    this.ppg = ((j)g.K(j.class)).XM().aoO(this.userName);
    this.ppg.setUsername(this.userName);
    boolean bool1 = this.ppg.Od();
    boolean bool2 = UV(this.userName);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("sns_outside_permiss");
    localCheckBoxPreference.uOT = bool1;
    int i = this.ppg.dtS;
    ab.d("MicroMsg.SnsPermissionUI", "sex:%d", new Object[] { Integer.valueOf(i) });
    if (i == 1)
    {
      localCheckBoxPreference.setTitle(2131303733);
      localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("sns_black_permiss");
      if (i != 1)
        break label209;
      localCheckBoxPreference.setTitle(2131303604);
    }
    while (true)
    {
      localCheckBoxPreference.uOT = bool2;
      if (!com.tencent.mm.n.a.jh(this.ppg.field_type))
        this.ehK.aqP("sns_black_permiss");
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(39181);
      return;
      if (i != 2)
        break;
      localCheckBoxPreference.setTitle(2131303732);
      break;
      label209: if (i == 2)
        localCheckBoxPreference.setTitle(2131303603);
    }
  }

  public final int JC()
  {
    return 2131165299;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(39184);
    paramf = paramPreference.mKey;
    boolean bool;
    if (paramf.equals("sns_outside_permiss"))
    {
      paramf = new ro();
      paramf.cNw.cNy = true;
      paramf.cNw.cNx = false;
      paramf.cNw.username = this.userName;
      com.tencent.mm.sdk.b.a.xxA.m(paramf);
      if (this.ppg.Od())
      {
        com.tencent.mm.model.t.l(this.ppg);
        AppMethodBeat.o(39184);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      com.tencent.mm.model.t.k(this.ppg);
      break;
      if (paramf.equals("sns_black_permiss"))
      {
        paramf = new ro();
        paramf.cNw.cNy = false;
        paramf.cNw.cNx = true;
        paramf.cNw.username = this.userName;
        com.tencent.mm.sdk.b.a.xxA.m(paramf);
        bool = UV(this.userName);
        paramPreference = this.userName;
        int i;
        if (bool)
        {
          i = 2;
          label170: if ((i != 1) || (5L != 5L))
            break label299;
          this.pph = true;
        }
        for (this.ppi = false; ; this.ppi = false)
        {
          paramf = new LinkedList();
          paramf.add(paramPreference);
          paramf = new w(i, 5L, "", paramf.size(), paramf, this.scene);
          g.RQ();
          g.RO().eJo.a(paramf, 0);
          getString(2131297061);
          this.tipDialog = h.b(this, getString(2131303807), true, new SnsPermissionUI.2(this, paramf));
          AppMethodBeat.o(39184);
          bool = true;
          break;
          i = 1;
          break label170;
          label299: this.pph = false;
        }
      }
      AppMethodBeat.o(39184);
      bool = false;
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(39178);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.SnsPermissionUI", "dispatchKeyEvent");
      setResult(-1, new Intent());
      finish();
      bool = true;
      AppMethodBeat.o(39178);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(39178);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(39180);
    this.ehK = this.yCw;
    setMMTitle(2131303735);
    setBackBtn(new SnsPermissionUI.1(this));
    cbv();
    AppMethodBeat.o(39180);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39177);
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
    AppMethodBeat.o(39177);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39179);
    super.onDestroy();
    com.tencent.mm.plugin.sns.c.a.gkF.BS();
    g.RQ();
    g.RO().eJo.b(291, this);
    if ((this.ppj != 0L) && (this.ppj != -1L))
    {
      rd localrd = new rd();
      localrd.cNh.cNi = this.ppi;
      localrd.cNh.cBh = this.ppj;
      com.tencent.mm.sdk.b.a.xxA.m(localrd);
    }
    AppMethodBeat.o(39179);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(39183);
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
      AppMethodBeat.o(39183);
      return;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsPermissionUI
 * JD-Core Version:    0.6.2
 */