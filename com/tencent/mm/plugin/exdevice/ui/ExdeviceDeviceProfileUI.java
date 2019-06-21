package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dc;
import com.tencent.mm.g.a.dc.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.model.l;
import com.tencent.mm.plugin.exdevice.model.x;
import com.tencent.mm.plugin.exdevice.model.y;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.List;

public class ExdeviceDeviceProfileUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private String cbq;
  private com.tencent.mm.ui.base.p ejZ;
  private String lAF;
  private String lAG;
  private boolean lAH;
  private String lAI;
  private boolean lAJ;
  private String lAK;
  private h.b lAL;
  private String lst;
  private String lsu;
  private long ltD;
  private String lxI;
  private String lyF;
  private String lyG;
  private String lya;
  private int lzD;
  private com.tencent.mm.ui.base.p lzK = null;

  private void a(DeviceProfileHeaderPreference paramDeviceProfileHeaderPreference)
  {
    AppMethodBeat.i(19954);
    String str;
    if (bo.isNullOrNil(this.lyF))
    {
      str = this.lst;
      if (bo.isNullOrNil(this.lAG))
        break label98;
      paramDeviceProfileHeaderPreference.setName(this.lAG);
      paramDeviceProfileHeaderPreference.Ky(getString(2131299313, new Object[] { str }));
      paramDeviceProfileHeaderPreference.Q(3, true);
      paramDeviceProfileHeaderPreference.Q(4, true);
      paramDeviceProfileHeaderPreference.Q(1, false);
    }
    while (true)
    {
      paramDeviceProfileHeaderPreference.jo(this.lya);
      AppMethodBeat.o(19954);
      return;
      str = this.lyF;
      break;
      label98: paramDeviceProfileHeaderPreference.setName(str);
      paramDeviceProfileHeaderPreference.Ky("");
      paramDeviceProfileHeaderPreference.Q(3, false);
      paramDeviceProfileHeaderPreference.Q(4, false);
      paramDeviceProfileHeaderPreference.Q(1, this.lAH);
    }
  }

  private void bcb()
  {
    AppMethodBeat.i(19953);
    com.tencent.mm.ui.base.preference.h localh = this.yCw;
    Object localObject = (DeviceProfileHeaderPreference)localh.aqO("device_profile_header");
    ((DeviceProfileHeaderPreference)localObject).a(1, new ExdeviceDeviceProfileUI.8(this));
    ((DeviceProfileHeaderPreference)localObject).a(4, new ExdeviceDeviceProfileUI.9(this));
    a((DeviceProfileHeaderPreference)localObject);
    ((DeviceProfileHeaderPreference)localObject).jl(this.lAI);
    localObject = (KeyValuePreference)localh.aqO("message_manage");
    KeyValuePreference localKeyValuePreference1 = (KeyValuePreference)localh.aqO("connect_setting");
    KeyValuePreference localKeyValuePreference2 = (KeyValuePreference)localh.aqO("user_list");
    ((KeyValuePreference)localObject).qi(true);
    localKeyValuePreference1.qi(true);
    localKeyValuePreference2.qi(true);
    localh.ce("message_manage", true);
    localh.ce("connect_setting", true);
    localh.ce("user_list", true);
    boolean bool;
    if (this.lAJ)
    {
      localh.ce("sub_device_desc", false);
      localh.aqO("sub_device_desc").setTitle(getResources().getString(2131299392, new Object[] { this.lAK }));
      localh.ce("bind_device", true);
      bool = true;
    }
    while (true)
    {
      localh.ce("unbind_device", bool);
      if (bo.isNullOrNil(this.lAF))
        localh.ce("open_device_panel", true);
      AppMethodBeat.o(19953);
      return;
      localh.ce("sub_device_desc", true);
      localh.ce("bind_device", this.lAH);
      if (!this.lAH)
        bool = true;
      else
        bool = false;
    }
  }

  private void bpD()
  {
    AppMethodBeat.i(19959);
    runOnUiThread(new ExdeviceDeviceProfileUI.2(this));
    AppMethodBeat.o(19959);
  }

  private void bpJ()
  {
    AppMethodBeat.i(19960);
    runOnUiThread(new ExdeviceDeviceProfileUI.3(this));
    AppMethodBeat.o(19960);
  }

  private void bpK()
  {
    AppMethodBeat.i(19961);
    runOnUiThread(new ExdeviceDeviceProfileUI.4(this));
    AppMethodBeat.o(19961);
  }

  private void f(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    AppMethodBeat.i(19958);
    if (paramb != null)
    {
      this.lsu = paramb.field_deviceID;
      this.lxI = paramb.field_deviceType;
      this.lAG = bo.nullAsNil(paramb.dFl);
      this.lyF = bo.nullAsNil(paramb.dFm);
      this.lst = bo.nullAsNil(paramb.field_brandName);
      this.lya = bo.nullAsNil(paramb.dFn);
      this.lAI = bo.nullAsNil(paramb.iconUrl);
      this.lAF = bo.nullAsNil(paramb.jumpUrl);
    }
    AppMethodBeat.o(19958);
  }

  private void k(com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(19962);
    runOnUiThread(new ExdeviceDeviceProfileUI.5(this, paramm));
    AppMethodBeat.o(19962);
  }

  public final int JC()
  {
    return 2131165234;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool = false;
    AppMethodBeat.i(19955);
    ab.d("MicroMsg.ExdeviceDeviceProfileUI", "onPreferenceTreeClcik.(key : %s)", new Object[] { paramPreference.mKey });
    if ("bind_device".equals(paramPreference.mKey))
      if (bo.isNullOrNil(this.lyG))
      {
        ab.i("MicroMsg.ExdeviceDeviceProfileUI", "Do unauth bind device.");
        paramf = new com.tencent.mm.plugin.exdevice.model.m(com.tencent.mm.plugin.exdevice.j.b.KK(this.cbq), this.lst, "3", this.ltD);
        k(paramf);
        aw.Rg().a(1262, this);
        aw.Rg().a(paramf, 0);
        AppMethodBeat.o(19955);
        bool = true;
      }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.ExdeviceDeviceProfileUI", "Do normal bind device.");
      paramPreference = this.lyG;
      int i = this.lzD;
      aw.Rg().a(536, this);
      paramf = new dc();
      paramf.cwj.cwl = paramPreference;
      paramf.cwj.opType = 1;
      paramf.cwj.cwm = i;
      com.tencent.mm.sdk.b.a.xxA.m(paramf);
      paramf = paramf.cwk.cwn;
      getString(2131297061);
      this.lzK = com.tencent.mm.ui.base.h.b(this, getString(2131299272), true, new ExdeviceDeviceProfileUI.10(this, paramf));
      break;
      if ("unbind_device".equals(paramPreference.mKey))
      {
        paramf = new asq();
        paramf.jBE = this.lsu;
        paramf.vIk = this.lxI;
        paramPreference = com.tencent.mm.plugin.exdevice.model.ad.boW().dS(this.lsu, this.lxI);
        if (paramPreference != null)
        {
          paramPreference = paramPreference.dFu;
          if ((paramPreference != null) && (paramPreference.length() > 0))
          {
            paramPreference = paramPreference.split(",");
            for (i = 0; i < paramPreference.length; i++)
              com.tencent.mm.plugin.exdevice.model.ad.boW().dU(paramPreference[i], this.lxI);
          }
        }
        paramf = new x(paramf, 2);
        k(paramf);
        aw.Rg().a(537, this);
        aw.Rg().a(paramf, 0);
        break;
      }
      if ("open_device_panel".equals(paramPreference.mKey))
      {
        com.tencent.mm.plugin.exdevice.model.f.ao(this.mController.ylL, this.lAF);
        break;
      }
      if ("contact_info_biz_go_chatting".equals(paramPreference.mKey))
      {
        aw.ZK();
        paramPreference = com.tencent.mm.model.c.XM().aoO(this.lst);
        paramf = new Intent();
        paramf.putExtra("device_id", this.lsu);
        paramf.putExtra("device_type", this.lxI);
        paramf.putExtra("KIsHardDevice", true);
        paramf.putExtra("KHardDeviceBindTicket", this.lyG);
        if (paramPreference == null)
          break;
        if ((com.tencent.mm.n.a.jh(paramPreference.field_type)) && (paramPreference.dsf()))
        {
          z.aeR().qP(paramPreference.field_username);
          paramf.putExtra("Chat_User", this.lst);
          paramf.putExtra("finish_direct", true);
          com.tencent.mm.plugin.exdevice.a.lqt.d(paramf, this.mController.ylL);
          break;
        }
        paramf.putExtra("Contact_User", this.lst);
        paramf.putExtra("force_get_contact", true);
        d.b(this.mController.ylL, "profile", ".ui.ContactInfoUI", paramf);
        break;
      }
      if (("message_manage".equals(paramPreference.mKey)) || ("connect_setting".equals(paramPreference.mKey)) || ("user_list".equals(paramPreference.mKey)))
        break;
      AppMethodBeat.o(19955);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(19952);
    super.onCreate(paramBundle);
    setBackBtn(new ExdeviceDeviceProfileUI.1(this));
    setMMTitle(2131299269);
    xE(this.mController.ylL.getResources().getColor(2131689613));
    this.lAL = new ExdeviceDeviceProfileUI.7(this);
    paramBundle = getIntent();
    this.cbq = paramBundle.getStringExtra("device_mac");
    this.ltD = paramBundle.getLongExtra("device_ble_simple_proto", 0L);
    this.lAF = paramBundle.getStringExtra("device_jump_url");
    this.lst = paramBundle.getStringExtra("device_brand_name");
    this.lsu = paramBundle.getStringExtra("device_id");
    this.lxI = paramBundle.getStringExtra("device_type");
    this.lyG = paramBundle.getStringExtra("bind_ticket");
    this.lzD = paramBundle.getIntExtra("subscribe_flag", 0);
    this.lAH = paramBundle.getBooleanExtra("device_has_bound", false);
    this.lyF = paramBundle.getStringExtra("device_title");
    this.lAG = paramBundle.getStringExtra("device_alias");
    this.lya = paramBundle.getStringExtra("device_desc");
    this.lAI = paramBundle.getStringExtra("device_icon_url");
    if ((bo.isNullOrNil(this.lsu)) || (bo.isNullOrNil(this.lxI)))
    {
      ab.e("MicroMsg.ExdeviceDeviceProfileUI", "deviceId or deviceType is null.", new Object[] { this.lsu, this.lxI });
      if (i != 0)
        break label632;
      Toast.makeText(this.mController.ylL, 2131299328, 1).show();
      finish();
      AppMethodBeat.o(19952);
    }
    while (true)
    {
      return;
      paramBundle = com.tencent.mm.plugin.exdevice.model.ad.boW().dS(this.lsu, this.lxI);
      if (paramBundle != null)
      {
        this.lAH = true;
        if (bo.isNullOrNil(this.lAG))
          this.lAG = bo.nullAsNil(paramBundle.dFl);
        if (bo.isNullOrNil(this.lyF))
          this.lyF = bo.nullAsNil(paramBundle.dFm);
        if (bo.isNullOrNil(this.lst))
          this.lst = bo.nullAsNil(paramBundle.field_brandName);
        if (bo.isNullOrNil(this.lya))
          this.lya = bo.nullAsNil(paramBundle.dFn);
        if (bo.isNullOrNil(this.lAI))
          this.lAI = bo.nullAsNil(paramBundle.iconUrl);
        if (bo.isNullOrNil(this.lAF))
          this.lAF = bo.nullAsNil(paramBundle.jumpUrl);
        if (paramBundle.dFp == 2)
        {
          this.lAJ = true;
          this.lAK = this.lyF;
          Iterator localIterator = com.tencent.mm.plugin.exdevice.model.ad.boW().bpB().iterator();
          do
          {
            do
            {
              if (!localIterator.hasNext())
                break;
              paramBundle = (com.tencent.mm.plugin.exdevice.h.b)localIterator.next();
            }
            while (!paramBundle.field_deviceType.equals(this.lxI));
            localObject = paramBundle.dFu;
          }
          while ((localObject == null) || (((String)localObject).length() <= 0));
          Object localObject = ((String)localObject).split(",");
          i = 0;
          label541: if (i < localObject.length)
            if (localObject[i].equals(this.lsu))
              if (!bo.isNullOrNil(paramBundle.dFl))
                break label606;
          label606: for (this.lAK = paramBundle.dFm; ; this.lAK = paramBundle.dFl)
          {
            ab.i("MicroMsg.ExdeviceDeviceProfileUI", "mGateWayTitle %s", new Object[] { this.lAK });
            i++;
            break label541;
            break;
          }
        }
      }
      else
      {
        if (bo.isNullOrNil(this.lyG))
          break;
      }
      i = 1;
      break;
      label632: bcb();
      AppMethodBeat.o(19952);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(19957);
    aw.Rg().b(537, this);
    super.onDestroy();
    AppMethodBeat.o(19957);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(19956);
    ab.d("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramm == null)
    {
      ab.e("MicroMsg.ExdeviceDeviceProfileUI", "scene is null.");
      AppMethodBeat.o(19956);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.ExdeviceDeviceProfileUI", "type = %s", new Object[] { Integer.valueOf(paramm.getType()) });
      if ((paramm instanceof l))
      {
        bpD();
        aw.Rg().b(paramm.getType(), this);
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramm.getType()) });
          bpJ();
          AppMethodBeat.o(19956);
        }
        else
        {
          bpK();
          f(com.tencent.mm.plugin.exdevice.model.ad.boW().dS(this.lsu, this.lxI));
          runOnUiThread(new ExdeviceDeviceProfileUI.11(this));
          AppMethodBeat.o(19956);
        }
      }
      else if ((paramm instanceof com.tencent.mm.plugin.exdevice.model.m))
      {
        bpD();
        aw.Rg().b(paramm.getType(), this);
        com.tencent.mm.plugin.exdevice.h.b localb = com.tencent.mm.plugin.exdevice.model.ad.boW().id(com.tencent.mm.plugin.exdevice.j.b.KK(this.cbq));
        if ((paramInt1 != 0) || (paramInt2 != 0) || (localb == null))
        {
          ab.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramm.getType()) });
          bpJ();
          AppMethodBeat.o(19956);
        }
        else
        {
          f(localb);
          runOnUiThread(new ExdeviceDeviceProfileUI.12(this));
          bpK();
          AppMethodBeat.o(19956);
        }
      }
      else if ((paramm instanceof y))
      {
        bpD();
        aw.Rg().b(1263, this);
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramm.getType()) });
          Toast.makeText(this.mController.ylL, getString(2131299318), 1).show();
          AppMethodBeat.o(19956);
        }
        else
        {
          this.lAG = ((y)paramm).dFl;
          runOnUiThread(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(19950);
              ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, (DeviceProfileHeaderPreference)ExdeviceDeviceProfileUI.this.yCw.aqO("device_profile_header"));
              AppMethodBeat.o(19950);
            }
          });
          paramString = com.tencent.mm.plugin.exdevice.model.ad.boW().dS(this.lsu, this.lxI);
          if (paramString == null)
          {
            ab.i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", new Object[] { this.lsu, this.lxI });
            AppMethodBeat.o(19956);
          }
          else
          {
            paramString.iy(this.lAG);
            com.tencent.mm.plugin.exdevice.model.ad.boW().c(paramString, new String[0]);
            AppMethodBeat.o(19956);
          }
        }
      }
      else if ((paramm instanceof x))
      {
        bpD();
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd, unbind failed (%d, %d, %s).(type : %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramm.getType()) });
          runOnUiThread(new ExdeviceDeviceProfileUI.6(this));
          AppMethodBeat.o(19956);
        }
        else
        {
          runOnUiThread(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(19951);
              ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, null);
              ExdeviceDeviceProfileUI.a(ExdeviceDeviceProfileUI.this, false);
              ExdeviceDeviceProfileUI.f(ExdeviceDeviceProfileUI.this);
              ExdeviceDeviceProfileUI.this.yCw.notifyDataSetChanged();
              AppMethodBeat.o(19951);
            }
          });
          finish();
        }
      }
      else
      {
        AppMethodBeat.o(19956);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI
 * JD-Core Version:    0.6.2
 */