package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.eo;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.e;
import com.tencent.mm.plugin.exdevice.model.e.b;
import com.tencent.mm.plugin.exdevice.model.l;
import com.tencent.mm.plugin.exdevice.model.t;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.asr;
import com.tencent.mm.protocal.protobuf.bbv;
import com.tencent.mm.protocal.protobuf.buq;
import com.tencent.mm.protocal.protobuf.jl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;

public class ExdeviceAddDataSourceUI extends MMActivity
  implements f, e.b
{
  private com.tencent.mm.ui.base.p ejZ;
  private final BroadcastReceiver jIA;
  private View kZq;
  private ExdeviceAddDataSourceUI.a lyc;
  private List<ExdeviceAddDataSourceUI.b> lyd;
  private TextView lye;
  private TextView lyf;
  private TextView lyg;
  private RelativeLayout lyh;
  private LocationManager lyi;
  private boolean lyj;
  private l lyk;
  private ListView mListView;

  public ExdeviceAddDataSourceUI()
  {
    AppMethodBeat.i(19798);
    this.lyj = false;
    this.jIA = new ExdeviceAddDataSourceUI.4(this);
    AppMethodBeat.o(19798);
  }

  private static boolean aC(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(19806);
    eo localeo = new eo();
    localeo.cye.mac = paramString;
    localeo.cye.cwA = paramBoolean;
    if (!com.tencent.mm.sdk.b.a.xxA.m(localeo))
    {
      ab.i("MicroMsg.ExdeviceAddDataSourceUI", "connect failed, mac(%s).", new Object[] { paramString });
      AppMethodBeat.o(19806);
    }
    for (paramBoolean = bool; ; paramBoolean = true)
    {
      return paramBoolean;
      AppMethodBeat.o(19806);
    }
  }

  private void bpD()
  {
    AppMethodBeat.i(19807);
    runOnUiThread(new ExdeviceAddDataSourceUI.2(this));
    AppMethodBeat.o(19807);
  }

  private void uM(int paramInt)
  {
    AppMethodBeat.i(19800);
    switch (paramInt)
    {
    default:
    case 2:
    case 1:
    case 4:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(19800);
      while (true)
      {
        return;
        this.lyh.setVisibility(8);
        this.lyf.setText(2131299274);
        this.lyg.setText("");
        AppMethodBeat.o(19800);
        continue;
        this.lyh.setVisibility(8);
        this.lyf.setText(2131299276);
        this.lyg.setText(2131299260);
        AppMethodBeat.o(19800);
        continue;
        this.lyh.setVisibility(8);
        this.lyf.setText(2131299276);
        this.lyg.setText(2131299324);
        AppMethodBeat.o(19800);
      }
      this.lyh.setVisibility(0);
      this.kZq.setVisibility(0);
    }
  }

  public final void b(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
  }

  public final void c(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(19805);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, mac is null or nil.");
      AppMethodBeat.o(19805);
    }
    while (true)
    {
      return;
      ExdeviceAddDataSourceUI.b localb = this.lyc.KA(paramString);
      if (localb == null)
      {
        ab.w("MicroMsg.ExdeviceAddDataSourceUI", "onConnectStateChanged, info is null.(%s)", new Object[] { paramString });
        AppMethodBeat.o(19805);
      }
      else
      {
        if ((localb.lys == ExdeviceAddDataSourceUI.c.lyu) && (paramInt == 4))
        {
          localb.lys = ExdeviceAddDataSourceUI.c.lyt;
          bpD();
          runOnUiThread(new ExdeviceAddDataSourceUI.10(this, localb));
        }
        while (true)
        {
          runOnUiThread(new ExdeviceAddDataSourceUI.11(this));
          AppMethodBeat.o(19805);
          break;
          if (paramInt == 2)
          {
            if (localb.lys == ExdeviceAddDataSourceUI.c.lyu)
            {
              localb.lys = ExdeviceAddDataSourceUI.c.lyv;
              ab.i("MicroMsg.ExdeviceAddDataSourceUI", "Bind Hard device, mac(%s), name(%s)", new Object[] { localb.mac, localb.name });
              if (localb.cxb != null)
              {
                this.lyk = new l(localb.cxb, 0);
                aw.Rg().a(this.lyk, 0);
              }
            }
            else
            {
              ab.i("MicroMsg.ExdeviceAddDataSourceUI", "try to disconnect, mac : %s.", new Object[] { paramString });
              aC(paramString, false);
            }
          }
          else
          {
            if ((paramInt == 1) || (paramInt == 2))
              break label265;
            localb.lys = ExdeviceAddDataSourceUI.c.lyt;
          }
        }
        label265: AppMethodBeat.o(19805);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969407;
  }

  public final void initView()
  {
    AppMethodBeat.i(19801);
    this.mListView = ((ListView)findViewById(2131821698));
    View localView = View.inflate(this, 2130969409, null);
    this.lyh = ((RelativeLayout)findViewById(2131823629));
    this.kZq = View.inflate(this, 2130969408, null);
    this.lye = ((TextView)findViewById(2131823630));
    this.lyf = ((TextView)findViewById(2131823627));
    this.lyg = ((TextView)findViewById(2131823628));
    String str1 = getString(2131299376);
    String str2 = getString(2131299291);
    SpannableString localSpannableString = new SpannableString(str1 + str2);
    localSpannableString.setSpan(new ForegroundColorSpan(2131690208), str1.length(), str1.length() + str2.length(), 33);
    localSpannableString.setSpan(new ExdeviceAddDataSourceUI.5(this), str1.length(), str1.length() + str2.length(), 33);
    this.lye.setMovementMethod(LinkMovementMethod.getInstance());
    this.lye.setText(localSpannableString);
    this.mListView.addHeaderView(localView, null, false);
    this.mListView.addFooterView(this.kZq, null, false);
    this.lyc = new ExdeviceAddDataSourceUI.a();
    this.mListView.setAdapter(this.lyc);
    this.mListView.setOnItemClickListener(new ExdeviceAddDataSourceUI.6(this));
    AppMethodBeat.o(19801);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(19799);
    super.onCreate(paramBundle);
    setBackBtn(new ExdeviceAddDataSourceUI.1(this));
    setMMTitle(2131299249);
    if ((d.iW(23)) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0")))
      this.lyj = true;
    this.lyd = new LinkedList();
    this.lyi = ((LocationManager)this.mController.ylL.getSystemService("location"));
    initView();
    paramBundle = new IntentFilter();
    paramBundle.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
    paramBundle.addAction("android.location.MODE_CHANGED");
    this.mController.ylL.registerReceiver(this.jIA, paramBundle);
    aw.Rg().a(536, this);
    aw.Rg().a(1706, this);
    ad.bph().a(this);
    if (!com.tencent.mm.plugin.d.a.e.a.dv(this.mController.ylL))
    {
      ab.i("MicroMsg.ExdeviceAddDataSourceUI", "now sdk version not support ble device : %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      uM(2);
      AppMethodBeat.o(19799);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.plugin.d.a.e.a.aVH())
      {
        ab.i("MicroMsg.ExdeviceAddDataSourceUI", "Bluetooth is not open, Just leave");
        uM(1);
        AppMethodBeat.o(19799);
      }
      else if ((this.lyi != null) && (this.lyj) && (!this.lyi.isProviderEnabled("gps")))
      {
        ab.i("MicroMsg.ExdeviceAddDataSourceUI", "Android 6.0.1, gps not open");
        uM(4);
        AppMethodBeat.o(19799);
      }
      else
      {
        ad.bph();
        e.boJ();
        AppMethodBeat.o(19799);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(19802);
    super.onDestroy();
    aw.RS().aa(new ExdeviceAddDataSourceUI.7(this));
    aw.Rg().b(536, this);
    aw.Rg().b(1706, this);
    this.mController.ylL.unregisterReceiver(this.jIA);
    ad.bph().b(this);
    ad.bpi().stopScan();
    AppMethodBeat.o(19802);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(19803);
    ab.i("MicroMsg.ExdeviceAddDataSourceUI", "errType(%d), errCode(%d), errMsg(%s).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramm == null)
    {
      ab.e("MicroMsg.ExdeviceAddDataSourceUI", "netscene is null.");
      AppMethodBeat.o(19803);
    }
    while (true)
    {
      return;
      if (paramm.getType() == 536)
      {
        bpD();
        this.lyk = null;
        paramm = ((l)paramm).boP();
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          paramString = this.lyc.KA(b.KL(paramm.vLj.vKF));
          if (paramString != null)
          {
            paramString.lys = ExdeviceAddDataSourceUI.c.lyt;
            aC(paramString.mac, false);
          }
          ab.e("MicroMsg.ExdeviceAddDataSourceUI", "doScene failed.");
          AppMethodBeat.o(19803);
        }
        else
        {
          paramString = new Intent();
          paramString.putExtra("device_mac", b.KK(b.KL(paramm.vLj.vKF)));
          aC(b.KL(paramm.vLj.vKF), false);
          setResult(-1, paramString);
          finish();
          AppMethodBeat.o(19803);
        }
      }
      else
      {
        if (paramm.getType() != 1706)
          break label502;
        paramm = ((t)paramm).boS();
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          ab.e("MicroMsg.ExdeviceAddDataSourceUI", "NetSceneSearchBLEHardDevice onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
          AppMethodBeat.o(19803);
        }
        else
        {
          ab.i("MicroMsg.ExdeviceAddDataSourceUI", "HardDeviceAttr_bleSimpleProtol(%d)", new Object[] { Long.valueOf(paramm.vLj.dFq) });
          if (0L == (paramm.vLj.dFq & 1L))
            break label502;
          if (ad.boW().dS(paramm.vLi.jBE, paramm.vLi.vIk) == null)
            break;
          ab.i("MicroMsg.ExdeviceAddDataSourceUI", "(%s)has been bound.", new Object[] { paramm.vLj.vKF });
          AppMethodBeat.o(19803);
        }
      }
    }
    ExdeviceAddDataSourceUI.b localb = new ExdeviceAddDataSourceUI.b((byte)0);
    if (paramm.vKL.wyX == null);
    for (paramString = ""; ; paramString = aa.a(paramm.vKL.wyX))
    {
      localb.name = paramString;
      localb.mac = b.KL(paramm.vLj.vKF);
      localb.cxb = paramm.vKK;
      localb.iconUrl = paramm.vLj.IconUrl;
      this.lyd.add(localb);
      ab.i("MicroMsg.ExdeviceAddDataSourceUI", "Add device, mac(%s), name(%s)", new Object[] { localb.mac, localb.name });
      runOnUiThread(new ExdeviceAddDataSourceUI.8(this));
      label502: AppMethodBeat.o(19803);
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void p(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(19804);
    ab.d("MicroMsg.ExdeviceAddDataSourceUI", "onScanResult, broadcastName(%s), mac(%s), isCompleted(%b).", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
      runOnUiThread(new ExdeviceAddDataSourceUI.9(this));
    if (bo.isNullOrNil(paramString2))
    {
      ab.e("MicroMsg.ExdeviceAddDataSourceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(19804);
      return;
    }
    int i = 0;
    label93: if (i < this.lyd.size())
    {
      paramString1 = (ExdeviceAddDataSourceUI.b)this.lyd.get(i);
      if ((paramString1 == null) || (bo.isNullOrNil(paramString1.mac)))
      {
        paramString1 = this.lyd;
        int j = i - 1;
        paramString1.remove(i);
        i = j;
      }
    }
    while (true)
    {
      i++;
      break label93;
      if (paramString1.mac.equalsIgnoreCase(paramString2))
      {
        ab.i("MicroMsg.ExdeviceAddDataSourceUI", "the device(%s) has added into the list before.", new Object[] { paramString2 });
        AppMethodBeat.o(19804);
        break;
        ab.i("MicroMsg.ExdeviceAddDataSourceUI", "SearchBLEHardDevice doScene result(%s), mac(%s)", new Object[] { Boolean.valueOf(aw.Rg().a(new t(paramString2.replaceAll(":", ""), null, null), 0)), paramString2 });
        AppMethodBeat.o(19804);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI
 * JD-Core Version:    0.6.2
 */