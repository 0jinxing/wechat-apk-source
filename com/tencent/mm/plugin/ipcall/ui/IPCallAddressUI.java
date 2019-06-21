package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.d.g;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class IPCallAddressUI extends MMActivity
  implements f
{
  private View nAU;
  private ListView nBg;
  private e nBh;
  private int nBi;
  private boolean nBj;
  private boolean nBk;
  private boolean nBl;
  private com.tencent.mm.sdk.b.c nBm;
  private Runnable nBn;

  public IPCallAddressUI()
  {
    AppMethodBeat.i(22055);
    this.nBh = null;
    this.nBi = 0;
    this.nBj = false;
    this.nBk = true;
    this.nBl = false;
    this.nBm = new IPCallAddressUI.1(this);
    this.nBn = new IPCallAddressUI.3(this);
    AppMethodBeat.o(22055);
  }

  private void bIj()
  {
    AppMethodBeat.i(22057);
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    ab.i("MicroMsg.IPCallAddressUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
    if (bool)
      com.tencent.mm.sdk.g.d.post(this.nBn, "IPCallAddressUI_LoadSystemAddressBook");
    AppMethodBeat.o(22057);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969881;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(22062);
    if (this.nBi == 1)
    {
      com.tencent.mm.plugin.ipcall.b.gkE.p(new Intent(), this);
      AppMethodBeat.o(22062);
    }
    while (true)
    {
      return;
      super.onBackPressed();
      AppMethodBeat.o(22062);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22056);
    super.onCreate(paramBundle);
    aw.ZK();
    if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLR, Boolean.FALSE)).booleanValue())
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xLR, Boolean.FALSE);
      paramBundle = new Intent();
      paramBundle.setClass(this.mController.ylL, IPCallAcitivityUI.class);
      this.mController.ylL.startActivity(paramBundle);
      overridePendingTransition(2131034265, 2131034262);
      this.nBk = false;
    }
    setBackBtn(new IPCallAddressUI.2(this));
    if (this.nBk)
    {
      this.nBl = true;
      bIj();
    }
    aw.ZK();
    this.nBj = ((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLn, Boolean.TRUE)).booleanValue();
    setMMTitle(2131300730);
    this.nBg = ((ListView)findViewById(2131825036));
    this.nAU = findViewById(2131825037);
    this.nBh = new e(this, this.nBg, this.nAU);
    paramBundle = this.nBh;
    paramBundle.nAT = new h(paramBundle.nAV);
    ViewGroup localViewGroup = (ViewGroup)View.inflate(paramBundle.nAV, 2130969893, null);
    paramBundle.nAS.addHeaderView(localViewGroup, null, false);
    paramBundle.nAS.setAdapter(paramBundle.nAT);
    paramBundle.nAX = ((TextView)localViewGroup.findViewById(2131825121));
    paramBundle.nAY = ((TextView)localViewGroup.findViewById(2131825122));
    paramBundle.nAZ = ((LinearLayout)localViewGroup.findViewById(2131825123));
    paramBundle.nBa = ((TextView)localViewGroup.findViewById(2131825125));
    paramBundle.nBb = ((ImageView)localViewGroup.findViewById(2131825124));
    localViewGroup.findViewById(2131825120).setOnClickListener(new e.1(paramBundle));
    localViewGroup.findViewById(2131825127).setOnClickListener(new e.2(paramBundle));
    localViewGroup.findViewById(2131825128).setOnClickListener(new e.3(paramBundle));
    paramBundle.nAS.setOnItemClickListener(new e.4(paramBundle));
    paramBundle.nAS.setOnItemLongClickListener(new e.5(paramBundle));
    aw.ZK();
    if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLn, Boolean.TRUE)).booleanValue())
    {
      com.tencent.mm.plugin.ipcall.a.d.bHg().ii(true);
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xLn, Boolean.FALSE);
      if (paramBundle.nAT.getCount() <= 0)
        break label555;
      paramBundle.nAU.setVisibility(8);
    }
    while (true)
    {
      paramBundle.bIi();
      paramBundle.bIh();
      paramBundle.nAW = true;
      aw.Rg().a(257, this);
      a.xxA.c(this.nBm);
      this.nBi = getIntent().getIntExtra("IPCallAddressUI_KFrom", 0);
      com.tencent.mm.plugin.report.service.h.pYm.a(257L, 0L, 1L, true);
      AppMethodBeat.o(22056);
      return;
      com.tencent.mm.plugin.ipcall.a.d.bHg().ii(false);
      break;
      label555: paramBundle.nAU.setVisibility(0);
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(22061);
    ab.d("MicroMsg.IPCallAddressUI", "onCreateOptionsMenu");
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    AppMethodBeat.o(22061);
    return bool;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22058);
    super.onDestroy();
    if (this.nBh != null)
    {
      Object localObject = this.nBh;
      ((e)localObject).nAS.setOnItemClickListener(null);
      ((e)localObject).nAS.setOnItemLongClickListener(null);
      localObject = ((e)localObject).nAT;
      o.acd().b((d.a)localObject);
    }
    aw.Rg().b(257, this);
    a.xxA.d(this.nBm);
    AppMethodBeat.o(22058);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(22063);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.IPCallAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(22063);
      return;
    }
    ab.i("MicroMsg.IPCallAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    }
    while (true)
    {
      AppMethodBeat.o(22063);
      break;
      if ((paramArrayOfInt[0] != 0) && (this.nBj))
      {
        this.nBj = false;
        com.tencent.mm.ui.base.h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131297773), false, new IPCallAddressUI.4(this), new IPCallAddressUI.5(this));
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(22059);
    super.onResume();
    e locale;
    if (this.nBh != null)
    {
      locale = this.nBh;
      if ((locale.nAT != null) && (!locale.nAW))
      {
        locale.nAT.notifyDataSetChanged();
        if (locale.nAT.getCount() <= 0)
          break label101;
        locale.nAU.setVisibility(8);
      }
    }
    while (true)
    {
      locale.nAW = false;
      supportInvalidateOptionsMenu();
      com.tencent.mm.plugin.ipcall.a.f.b.bHU().it(true);
      if (!this.nBl)
      {
        this.nBl = true;
        bIj();
      }
      AppMethodBeat.o(22059);
      return;
      label101: locale.nAU.setVisibility(0);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22060);
    if (((paramm instanceof g)) && (paramInt1 == 0) && (paramInt2 == 0) && (this.nBh != null))
      this.nBh.bIi();
    AppMethodBeat.o(22060);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI
 * JD-Core Version:    0.6.2
 */