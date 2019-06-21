package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.MulticastLock;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.exdevice.d.a;
import com.tencent.mm.plugin.exdevice.model.j;
import com.tencent.mm.plugin.exdevice.model.j.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

public class ExdeviceConnectWifiUI extends MMActivity
{
  private TextWatcher arx;
  private EditText gBJ;
  private String kWl;
  private ExdeviceConnectWifiUI.b lAa;
  private n lAb;
  private j.a lAc;
  private WifiManager.MulticastLock lAd;
  private Runnable lAe;
  private View lzG;
  private TextView lzH;
  private View lzI;
  private View lzJ;
  private p lzK;
  private String lzL;
  private a lzM;
  private boolean lzN;
  private boolean lzO;
  private boolean lzP;
  private int lzQ;
  private byte[] lzR;
  private int lzS;
  private int lzT;
  private int lzU;
  private String lzV;
  private int lzW;
  private long lzX;
  boolean lzY;
  private com.tencent.mm.plugin.exdevice.d.b lzZ;

  public ExdeviceConnectWifiUI()
  {
    AppMethodBeat.i(19896);
    this.lzV = "";
    this.kWl = "";
    this.lzY = false;
    this.lAe = new ExdeviceConnectWifiUI.1(this);
    AppMethodBeat.o(19896);
  }

  private a au(int paramInt, String paramString)
  {
    AppMethodBeat.i(19903);
    if ((bo.isNullOrNil(paramString)) || (this.lzZ == null))
    {
      ab.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "ssid or wifiInfoList is null or nil.");
      AppMethodBeat.o(19903);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      int i = 0;
      if (i < this.lzZ.luI.size())
      {
        a locala = (a)this.lzZ.luI.get(i);
        int j;
        if (locala == null)
        {
          this.lzZ.luI.remove(i);
          this.lzN = true;
          j = i - 1;
        }
        do
        {
          do
          {
            i = j + 1;
            break;
            j = i;
          }
          while (locala.luF != paramInt);
          j = i;
        }
        while (!paramString.equals(locala.luG));
        AppMethodBeat.o(19903);
        paramString = locala;
      }
      else
      {
        AppMethodBeat.o(19903);
        paramString = null;
      }
    }
  }

  private void bpD()
  {
    AppMethodBeat.i(19909);
    runOnUiThread(new ExdeviceConnectWifiUI.6(this));
    if (this.lAd.isHeld())
      this.lAd.release();
    AppMethodBeat.o(19909);
  }

  private void bpG()
  {
    AppMethodBeat.i(19904);
    this.lzM.luH = "";
    this.lzM.luG = "";
    String str = this.lzL;
    a locala = au(this.lzQ, str);
    if ((locala == null) || (bo.isNullOrNil(str)))
      AppMethodBeat.o(19904);
    while (true)
    {
      return;
      if (bo.isNullOrNil(locala.luH))
      {
        ab.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Do not have a local password to fill for the current wifi.");
        this.lzZ.luI.remove(locala);
        this.lzN = true;
        AppMethodBeat.o(19904);
      }
      else
      {
        this.lzM.luH = com.tencent.mm.plugin.base.model.b.da(locala.luH, ExdeviceConnectWifiUI.a.av(this.lzQ, locala.luG));
        this.lzM.luG = locala.luG;
        al.d(this.lAe);
        AppMethodBeat.o(19904);
      }
    }
  }

  private void bpH()
  {
    AppMethodBeat.i(19908);
    runOnUiThread(new ExdeviceConnectWifiUI.5(this));
    AppMethodBeat.o(19908);
  }

  private void g(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(19910);
    View localView = this.lzG;
    int i;
    if (paramBoolean1)
    {
      i = 0;
      localView.setVisibility(i);
      if (!paramBoolean2)
        break label68;
      bpH();
    }
    while (true)
    {
      if (paramBoolean3)
        Toast.makeText(this.mController.ylL, 2131299300, 0).show();
      AppMethodBeat.o(19910);
      return;
      i = 8;
      break;
      label68: bpD();
    }
  }

  private void gO(boolean paramBoolean)
  {
    AppMethodBeat.i(19906);
    ExdeviceConnectWifiUI.b localb;
    if (paramBoolean)
    {
      localb = ExdeviceConnectWifiUI.b.lAo;
      if (at.getNetType(this) == 0)
        break label45;
      localb = ExdeviceConnectWifiUI.b.lAp;
    }
    while (true)
    {
      a(localb);
      AppMethodBeat.o(19906);
      return;
      localb = this.lAa;
      break;
      label45: this.lzL = at.gE(ah.getContext());
      ab.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Get SSID(%s)", new Object[] { this.lzL });
      if (!bo.isNullOrNil(this.lzL))
        this.lzH.setText(this.lzL);
      else
        this.lzH.setText("");
    }
  }

  private String getPassword()
  {
    AppMethodBeat.i(19905);
    String str;
    if (this.gBJ.getText() != null)
    {
      str = this.gBJ.getText().toString();
      AppMethodBeat.o(19905);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(19905);
    }
  }

  private void uP(int paramInt)
  {
    AppMethodBeat.i(19902);
    long l = 0L;
    if (paramInt == 4)
      l = System.currentTimeMillis() - this.lzX;
    h.pYm.e(13503, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lzU), Long.valueOf(l), this.lzV, this.kWl, Integer.valueOf(this.lzW) });
    AppMethodBeat.o(19902);
  }

  public final void a(ExdeviceConnectWifiUI.b paramb)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(19907);
        if (paramb == null)
        {
          ab.e("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Status is null.");
          AppMethodBeat.o(19907);
          return;
        }
        this.lAa = paramb;
        switch (ExdeviceConnectWifiUI.7.lAk[paramb.ordinal()])
        {
        default:
          if (paramb != ExdeviceConnectWifiUI.b.lAo)
          {
            this.gBJ.clearFocus();
            aqX();
          }
          AppMethodBeat.o(19907);
          continue;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      }
      finally
      {
      }
      g(true, false, false);
      continue;
      g(true, true, false);
      continue;
      g(false, false, false);
    }
    uP(5);
    this.lzP = true;
    setResult(1);
    while (true)
    {
      finish();
      break;
      uP(4);
      g(true, false, true);
      this.lzP = true;
      setResult(-1);
      Object localObject = aw.RS();
      ExdeviceConnectWifiUI.4 local4 = new com/tencent/mm/plugin/exdevice/ui/ExdeviceConnectWifiUI$4;
      local4.<init>(this);
      ((al)localObject).aa(local4);
      if (getIntent().getBooleanExtra("jumpToBindDevice", false))
      {
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>();
        ((Intent)localObject).putExtra("device_scan_mode", getIntent().getStringExtra("device_scan_mode"));
        ((Intent)localObject).putExtra("device_scan_conn_proto", getIntent().getStringExtra("device_scan_conn_proto"));
        ((Intent)localObject).putExtra("device_id", getIntent().getStringExtra("device_id"));
        ((Intent)localObject).putExtra("device_type", getIntent().getStringExtra("device_type"));
        ((Intent)localObject).putExtra("device_title", getIntent().getStringExtra("device_title"));
        ((Intent)localObject).putExtra("device_desc", getIntent().getStringExtra("device_desc"));
        ((Intent)localObject).putExtra("device_icon_url", getIntent().getStringExtra("device_icon_url"));
        ((Intent)localObject).putExtra("device_category_id", getIntent().getStringExtra("device_category_id"));
        ((Intent)localObject).putExtra("device_brand_name", getIntent().getStringExtra("device_brand_name"));
        ((Intent)localObject).putExtra("bind_ticket", getIntent().getStringExtra("bind_ticket"));
        d.b(this.mController.ylL, "exdevice", ".ui.ExdeviceBindDeviceUI", (Intent)localObject);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969416;
  }

  public final void initView()
  {
    AppMethodBeat.i(19901);
    setMMTitle(2131299297);
    setBackBtn(new ExdeviceConnectWifiUI.10(this));
    this.lzG = findViewById(2131823643);
    this.lzH = ((TextView)findViewById(2131823625));
    this.lzI = findViewById(2131823645);
    this.gBJ = ((EditText)findViewById(2131823644));
    this.lzJ = findViewById(2131823648);
    this.arx = new ExdeviceConnectWifiUI.11(this);
    this.lzG.setOnTouchListener(new ExdeviceConnectWifiUI.12(this));
    this.lzJ.setOnClickListener(new ExdeviceConnectWifiUI.13(this));
    this.gBJ.setTransformationMethod(new PasswordTransformationMethod());
    this.gBJ.addTextChangedListener(this.arx);
    this.gBJ.setOnEditorActionListener(new ExdeviceConnectWifiUI.14(this));
    this.gBJ.setOnKeyListener(new ExdeviceConnectWifiUI.15(this));
    this.gBJ.requestFocus();
    AppMethodBeat.o(19901);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(19897);
    super.onCreate(paramBundle);
    this.lAb = new ExdeviceConnectWifiUI.8(this);
    this.lAa = ExdeviceConnectWifiUI.b.lAo;
    if (!aw.RK())
    {
      finish();
      AppMethodBeat.o(19897);
    }
    while (true)
    {
      return;
      this.lzZ = new com.tencent.mm.plugin.exdevice.d.b();
      this.lzM = new a();
      aw.ZK();
      this.lzQ = c.QF();
      paramBundle = getIntent().getStringExtra("encryptKey");
      this.lzS = getIntent().getIntExtra("procInterval", 0);
      this.lzT = getIntent().getIntExtra("dataInterval", 0);
      ab.d("MicroMsg.exdevice.ExdeviceConnectWifiUI", "Process interval:" + this.lzS + " Data interval:" + this.lzT);
      if (!bo.isNullOrNil(paramBundle))
      {
        this.lzR = Base64.decode(paramBundle, 0);
        this.lzW = 1;
      }
      this.lzY = false;
      this.lzU = getIntent().getExtras().getInt("exdevice_airkiss_open_type");
      if (this.lzU == 2)
      {
        this.lzV = getIntent().getStringExtra("device_brand_name");
        this.kWl = getIntent().getStringExtra("device_category_id");
      }
      this.lAc = new ExdeviceConnectWifiUI.9(this);
      j.boN().a(0, this.lAc);
      initView();
      aw.RS().aa(new ExdeviceConnectWifiUI.3(this));
      uP(1);
      this.lAd = ((WifiManager)getApplicationContext().getSystemService("wifi")).createMulticastLock("localWifi");
      AppMethodBeat.o(19897);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(19899);
    super.onDestroy();
    if (!this.lzY)
      uP(2);
    j.boN().b(0, this.lAc);
    AppMethodBeat.o(19899);
  }

  public void onResume()
  {
    AppMethodBeat.i(19898);
    super.onResume();
    gO(false);
    aw.a(this.lAb);
    if (this.lzO)
    {
      bpG();
      this.lzO = false;
    }
    AppMethodBeat.o(19898);
  }

  public void onStop()
  {
    AppMethodBeat.i(19900);
    super.onStop();
    aw.b(this.lAb);
    AppMethodBeat.o(19900);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI
 * JD-Core Version:    0.6.2
 */