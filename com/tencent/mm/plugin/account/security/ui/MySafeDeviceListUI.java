package com.tencent.mm.plugin.account.security.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.account.security.a.b;
import com.tencent.mm.plugin.account.security.a.c;
import com.tencent.mm.plugin.account.security.a.d;
import com.tencent.mm.plugin.account.security.a.e;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.anw;
import com.tencent.mm.protocal.protobuf.aza;
import com.tencent.mm.protocal.protobuf.btw;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MySafeDeviceListUI extends MMPreference
  implements com.tencent.mm.ai.f, k.a
{
  private ProgressDialog ehJ;
  private com.tencent.mm.ui.base.preference.f ehK;
  private List<d> gzA;
  private MenuItem.OnMenuItemClickListener gzB;
  private int gzx;
  private List<SafeDeviceListPreference> gzy;
  private a gzz;
  private ak handler;

  public MySafeDeviceListUI()
  {
    AppMethodBeat.i(69881);
    this.gzx = -2;
    this.ehJ = null;
    this.gzB = new MySafeDeviceListUI.1(this);
    this.handler = new MySafeDeviceListUI.3(this);
    AppMethodBeat.o(69881);
  }

  private void aqI()
  {
    AppMethodBeat.i(69887);
    this.gzy.clear();
    this.gzA = com.tencent.mm.plugin.account.security.a.g.aqG().aqD();
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165266);
    if (this.gzA.size() == 0)
    {
      this.ehK.aqP("my_safe_device_list_tip");
      showOptionMenu(false);
      AppMethodBeat.o(69887);
    }
    while (true)
    {
      return;
      if (this.gzx == 1)
      {
        addTextOptionMenu(0, getString(2131302685), this.gzB);
        this.gzx ^= -1;
      }
      SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
      Iterator localIterator = this.gzA.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        SafeDeviceListPreference localSafeDeviceListPreference = new SafeDeviceListPreference(this);
        localSafeDeviceListPreference.setKey("mysafedevice_" + locald.field_uid);
        localSafeDeviceListPreference.setTitle(j.b(this, locald.field_name));
        localSafeDeviceListPreference.setSummary(localSimpleDateFormat.format(new Date(locald.field_createtime * 1000L)));
        localSafeDeviceListPreference.gzJ = this.gzz;
        localSafeDeviceListPreference.gzK = this.gzz;
        localSafeDeviceListPreference.gzG = locald;
        this.ehK.a(localSafeDeviceListPreference, -1);
        this.gzy.add(localSafeDeviceListPreference);
      }
      showOptionMenu(true);
      AppMethodBeat.o(69887);
    }
  }

  public final int JC()
  {
    return -1;
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(69888);
    ab.i("MicroMsg.MySafeDeviceListUI", "notify ".concat(String.valueOf(paramString)));
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(69878);
        MySafeDeviceListUI.g(MySafeDeviceListUI.this);
        AppMethodBeat.o(69878);
      }
    });
    AppMethodBeat.o(69888);
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(69885);
    paramf = paramPreference.mKey;
    boolean bool;
    if (bo.isNullOrNil(paramf))
    {
      ab.e("MicroMsg.MySafeDeviceListUI", "null key");
      bool = false;
      AppMethodBeat.o(69885);
    }
    while (true)
    {
      return bool;
      if (paramf.startsWith("mysafedevice_"))
      {
        paramf = (SafeDeviceListPreference)paramPreference;
        if (paramf != null)
        {
          paramf = paramf.gzG;
          h.a(this.mController.ylL, getString(2131302687), paramf.field_name, getString(2131302690), -1, new MySafeDeviceListUI.4(this, paramf));
        }
      }
      bool = true;
      AppMethodBeat.o(69885);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(69886);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(69877);
        MySafeDeviceListUI.this.finish();
        AppMethodBeat.o(69877);
        return true;
      }
    });
    this.ehK = this.yCw;
    this.gzy = new LinkedList();
    this.gzz = new a((byte)0);
    addTextOptionMenu(0, getString(2131302685), this.gzB);
    setMMTitle(2131303133);
    AppMethodBeat.o(69886);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(69882);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Rg().a(850, this);
    com.tencent.mm.kernel.g.Rg().a(361, this);
    com.tencent.mm.plugin.account.security.a.g.aqG().c(this);
    initView();
    paramBundle = new b();
    com.tencent.mm.kernel.g.Rg().a(paramBundle, 0);
    getString(2131297061);
    this.ehJ = h.b(this, getString(2131297086), true, new MySafeDeviceListUI.2(this, paramBundle));
    AppMethodBeat.o(69882);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(69883);
    super.onDestroy();
    com.tencent.mm.kernel.g.Rg().b(850, this);
    com.tencent.mm.kernel.g.Rg().b(361, this);
    com.tencent.mm.plugin.account.security.a.g.aqG().d(this);
    AppMethodBeat.o(69883);
  }

  public void onResume()
  {
    AppMethodBeat.i(69884);
    super.onResume();
    aqI();
    AppMethodBeat.o(69884);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    Object localObject = null;
    AppMethodBeat.i(69889);
    ab.i("MicroMsg.MySafeDeviceListUI", "errorCode %d, errorMsg %s, scene %s", new Object[] { Integer.valueOf(paramInt2), paramString, paramm });
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if (paramm.getType() == 850)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label346;
      paramm = (b)paramm;
      paramString = localObject;
      if (paramm.gzh != null)
      {
        paramString = localObject;
        if (paramm.gzh.wsr != null)
        {
          paramString = localObject;
          if (paramm.gzh.wsr.wVM != null)
            paramString = paramm.gzh.wsr.wVM;
        }
      }
      if ((paramString != null) && (paramString != null))
      {
        com.tencent.mm.plugin.account.security.a.g.aqG().hY("SafeDeviceInfo", "delete from SafeDeviceInfo");
        paramm = paramString.iterator();
        while (paramm.hasNext())
        {
          paramString = (aza)paramm.next();
          com.tencent.mm.plugin.account.security.a.g.aqG().a(new d(paramString));
        }
      }
      AppMethodBeat.o(69889);
    }
    while (true)
    {
      return;
      if (paramm.getType() == 361)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (c)paramm;
          paramm = new d();
          paramm.field_devicetype = paramString.cws;
          paramm.field_name = paramString.deviceName;
          paramm.field_uid = paramString.ceI;
          paramm.field_createtime = 0L;
          com.tencent.mm.plugin.account.security.a.g.aqG().c(paramm, new String[0]);
          h.bQ(this, com.tencent.mm.bz.a.an(this, 2131302691));
          AppMethodBeat.o(69889);
        }
        else if (com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
        {
          AppMethodBeat.o(69889);
        }
      }
      else
        label346: AppMethodBeat.o(69889);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a
    implements SafeDeviceListPreference.a, SafeDeviceListPreference.b
  {
    private a()
    {
    }

    public final void onFailed(String paramString)
    {
      AppMethodBeat.i(69880);
      ab.e("MicroMsg.MySafeDeviceListUI", "delete safedevice failed".concat(String.valueOf(paramString)));
      AppMethodBeat.o(69880);
    }

    public final void wq(String paramString)
    {
      AppMethodBeat.i(69879);
      MySafeDeviceListUI.b(MySafeDeviceListUI.this).aqP(paramString);
      MySafeDeviceListUI.d(MySafeDeviceListUI.this).sendEmptyMessage(0);
      MySafeDeviceListUI.this.addTextOptionMenu(0, MySafeDeviceListUI.this.getString(2131302685), MySafeDeviceListUI.e(MySafeDeviceListUI.this));
      MySafeDeviceListUI.a(MySafeDeviceListUI.this, MySafeDeviceListUI.f(MySafeDeviceListUI.this) ^ 0xFFFFFFFF);
      MySafeDeviceListUI.g(MySafeDeviceListUI.this);
      AppMethodBeat.o(69879);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI
 * JD-Core Version:    0.6.2
 */