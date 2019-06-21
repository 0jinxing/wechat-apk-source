package com.tencent.mm.plugin.exdevice.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.d.a.e.a;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.e;
import com.tencent.mm.plugin.exdevice.model.e.b;
import com.tencent.mm.plugin.exdevice.model.h;
import com.tencent.mm.plugin.exdevice.model.j;
import com.tencent.mm.plugin.exdevice.model.j.a;
import com.tencent.mm.plugin.exdevice.model.t;
import com.tencent.mm.plugin.exdevice.model.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;
import junit.framework.Assert;

@SuppressLint({"Assert"})
public class ExdeviceBindDeviceUI extends MMActivity
  implements f, e.b
{
  private ProgressDialog ehJ;
  private ScrollView hJh;
  private TextView klD;
  private String lst;
  private j.a ltg;
  private String lxI;
  private ExdeviceBindDeviceUI.a lyS;
  private View lyT;
  private TextView lyU;
  private ImageView lyV;
  private View lyW;
  private ExdeviceBindDeviceUI.e lyX;
  private String lyY;
  private String lyZ;
  private TextView lyf;
  private TextView lyg;
  private boolean lza = false;
  private j.a lzb;
  private boolean lzc = false;
  private boolean lzd = false;
  private ListView mListView;

  static
  {
    AppMethodBeat.i(19870);
    if (!ExdeviceBindDeviceUI.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(19870);
      return;
    }
  }

  private void uM(int paramInt)
  {
    AppMethodBeat.i(19866);
    switch (paramInt)
    {
    default:
      switch (paramInt)
      {
      default:
        label72: switch (paramInt)
        {
        default:
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
      break;
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(19866);
      while (true)
      {
        return;
        Object localObject1 = getString(2131299263);
        Object localObject2 = new SpannableString((CharSequence)localObject1);
        ((SpannableString)localObject2).setSpan(new ForegroundColorSpan(2131690208), 0, ((String)localObject1).length(), 33);
        ((SpannableString)localObject2).setSpan(new ExdeviceBindDeviceUI.9(this), 0, ((String)localObject1).length(), 33);
        this.lyU.setMovementMethod(LinkMovementMethod.getInstance());
        this.lyU.setText((CharSequence)localObject2);
        break;
        String str = getString(2131299267);
        localObject2 = getString(2131299264);
        localObject1 = new SpannableString(str + (String)localObject2);
        ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(2131690208), str.length(), str.length() + ((String)localObject2).length(), 33);
        ((SpannableString)localObject1).setSpan(new ExdeviceBindDeviceUI.10(this), str.length(), str.length() + ((String)localObject2).length(), 33);
        this.lyU.setMovementMethod(LinkMovementMethod.getInstance());
        this.lyU.setText((CharSequence)localObject1);
        break;
        localObject2 = getString(2131299268);
        str = getString(2131299297);
        localObject1 = new SpannableString((String)localObject2 + str);
        ((SpannableString)localObject1).setSpan(new ForegroundColorSpan(2131690208), ((String)localObject2).length(), ((String)localObject2).length() + str.length(), 33);
        ((SpannableString)localObject1).setSpan(new ExdeviceBindDeviceUI.2(this), ((String)localObject2).length(), ((String)localObject2).length() + str.length(), 33);
        this.lyU.setMovementMethod(LinkMovementMethod.getInstance());
        this.lyU.setText((CharSequence)localObject1);
        break;
        this.lyV.setImageResource(2131230978);
        this.lyf.setText(2131299276);
        this.lyg.setText(2131299260);
        break label72;
        this.lyV.setImageResource(2131230978);
        this.lyf.setText(2131299274);
        this.lyg.setText("");
        break label72;
        this.lyV.setImageResource(2131232181);
        this.lyf.setText(2131299276);
        this.lyg.setText(2131299271);
        break label72;
        this.lyT.setVisibility(0);
        this.mListView.setVisibility(0);
        this.lyU.setVisibility(0);
        this.lyV.setVisibility(8);
        this.lyf.setVisibility(8);
        this.lyg.setVisibility(8);
        AppMethodBeat.o(19866);
        continue;
        this.hJh.setVisibility(8);
        this.lyT.setVisibility(8);
        this.mListView.setVisibility(8);
        this.lyU.setVisibility(8);
        this.lyV.setVisibility(0);
        this.lyf.setVisibility(0);
        if (paramInt != 4)
          break label679;
        this.lyg.setVisibility(8);
        AppMethodBeat.o(19866);
      }
      label679: this.lyg.setVisibility(0);
    }
  }

  final void a(ExdeviceBindDeviceUI.f paramf)
  {
    AppMethodBeat.i(19864);
    Object localObject = paramf.getKey();
    if (this.lyS.KB((String)localObject))
      AppMethodBeat.o(19864);
    while (true)
    {
      return;
      ab.d("MicroMsg.ExdeviceBindDeviceUI", "Add device: " + paramf.bpF());
      localObject = this.lyS;
      if ((paramf != null) && (!((ExdeviceBindDeviceUI.a)localObject).KB(paramf.getKey())))
      {
        paramf.lzx = ((ExdeviceBindDeviceUI.a)localObject).c(paramf);
        ((ExdeviceBindDeviceUI.a)localObject).lzl.add(paramf);
      }
      this.lyS.notifyDataSetChanged();
      if (paramf.lzy == ExdeviceBindDeviceUI.b.lzq)
      {
        ab.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchBLEHardDevice doScene, mac(%s), brandName(%s),categoryId(%s)", new Object[] { paramf.lzz.cbq, this.lst, this.lyY });
        aw.Rg().a(new t(paramf.lzz.cbq, this.lst, this.lyY), 0);
        AppMethodBeat.o(19864);
      }
      else if (paramf.lzy == ExdeviceBindDeviceUI.b.lzp)
      {
        ab.i("MicroMsg.ExdeviceBindDeviceUI", "NetSceneSearchWiFiHardDevice doScene, deviceType(%s), deviceId(%s)", new Object[] { paramf.lzA.lxI, paramf.lzA.lsu });
        aw.Rg().a(new v(paramf.lzA.lxI, paramf.lzA.lsu, paramf.lzF), 0);
        AppMethodBeat.o(19864);
      }
      else
      {
        Assert.assertTrue(false);
        AppMethodBeat.o(19864);
      }
    }
  }

  public final void b(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
  }

  public final void c(String paramString, int paramInt, long paramLong)
  {
  }

  public final int getLayoutId()
  {
    return 2130969413;
  }

  public final void initView()
  {
    AppMethodBeat.i(19859);
    this.mListView = ((ListView)findViewById(2131821698));
    Object localObject = View.inflate(this, 2130969415, null);
    this.lyW = View.inflate(this, 2130969448, null);
    this.lyT = this.lyW.findViewById(2131823631);
    this.klD = ((TextView)this.lyW.findViewById(2131823632));
    this.lyU = ((TextView)findViewById(2131823630));
    this.lyV = ((ImageView)findViewById(2131823626));
    this.lyf = ((TextView)findViewById(2131823627));
    this.lyg = ((TextView)findViewById(2131823628));
    this.hJh = ((ScrollView)findViewById(2131823642));
    this.mListView.addHeaderView((View)localObject, null, false);
    this.mListView.addFooterView(this.lyW, null, false);
    this.lyS = new ExdeviceBindDeviceUI.a(this.lst, this.lyX, this.lyY);
    this.mListView.setAdapter(this.lyS);
    this.mListView.setOnItemClickListener(new ExdeviceBindDeviceUI.5(this));
    if ((this.lzd) && (!this.lzc))
      if (!a.dv(this.mController.ylL))
      {
        ab.i("MicroMsg.ExdeviceBindDeviceUI", "now sdk version not support ble device : %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        uM(4);
        AppMethodBeat.o(19859);
      }
    while (true)
    {
      return;
      if (!a.aVH())
      {
        ab.i("MicroMsg.ExdeviceBindDeviceUI", "Bluetooth is not open, Just leave");
        uM(3);
        AppMethodBeat.o(19859);
      }
      else if ((!this.lzd) && (this.lzc) && (!at.isWifi(this.mController.ylL)))
      {
        ab.i("MicroMsg.ExdeviceBindDeviceUI", "wifi is not open, Just leave");
        uM(5);
        AppMethodBeat.o(19859);
      }
      else if (this.lyX == ExdeviceBindDeviceUI.e.lzu)
      {
        uM(0);
        AppMethodBeat.o(19859);
      }
      else if (this.lyX == ExdeviceBindDeviceUI.e.lzv)
      {
        if ((this.lzd) && (this.lzc))
        {
          Assert.assertTrue(false);
          uM(1);
          AppMethodBeat.o(19859);
        }
        else if (this.lzd)
        {
          uM(2);
          AppMethodBeat.o(19859);
        }
        else if (this.lzc)
        {
          uM(1);
          AppMethodBeat.o(19859);
        }
      }
      else
      {
        localObject = ExdeviceBindDeviceUI.e.lzt;
        Assert.assertTrue(false);
        AppMethodBeat.o(19859);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(19865);
    this.lyS.bpE();
    this.lyS.notifyDataSetChanged();
    AppMethodBeat.o(19865);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(19857);
    super.onCreate(paramBundle);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(19824);
        ExdeviceBindDeviceUI.this.finish();
        AppMethodBeat.o(19824);
        return true;
      }
    });
    Object localObject = getIntent();
    this.lyY = ((Intent)localObject).getStringExtra("device_category_id");
    this.lst = ((Intent)localObject).getStringExtra("device_brand_name");
    this.lxI = ((Intent)localObject).getStringExtra("device_type");
    if ((this.lxI == null) || (this.lxI.length() == 0))
      this.lxI = this.lst;
    String str1 = ((Intent)localObject).getStringExtra("device_scan_conn_proto");
    String str2 = ((Intent)localObject).getStringExtra("device_scan_mode");
    paramBundle = "";
    String str3 = ((Intent)localObject).getStringExtra("device_title");
    localObject = str3;
    if (bo.isNullOrNil(str3))
      localObject = this.mController.ylL.getString(2131299312);
    if (str2.contains("SCAN_MY_DEVICE"))
    {
      this.lyX = ExdeviceBindDeviceUI.e.lzu;
      paramBundle = this.mController.ylL.getString(2131299250);
      setMMTitle(paramBundle);
      if (this.lyX != ExdeviceBindDeviceUI.e.lzv)
        break label438;
      this.lzc = str1.contains("wifi");
      this.lzd = str1.contains("blue");
      ab.i("MicroMsg.ExdeviceBindDeviceUI", "mIsScanWifi(%b), mIsScanBlue(%b)", new Object[] { Boolean.valueOf(this.lzc), Boolean.valueOf(this.lzd) });
    }
    while (true)
    {
      this.ltg = new ExdeviceBindDeviceUI.3(this);
      this.lzb = new ExdeviceBindDeviceUI.4(this);
      initView();
      this.klD.setText(this.mController.ylL.getString(2131299377, new Object[] { localObject }));
      aw.Rg().a(1264, this);
      aw.Rg().a(1706, this);
      aw.Rg().a(1270, this);
      aw.Rg().a(1719, this);
      if (this.lzd)
        ad.bph().a(this);
      if (this.lzc)
      {
        j.boN().a(10, this.ltg);
        j.boN().a(11, this.lzb);
        Java2CExDevice.initWCLanDeviceLib();
      }
      AppMethodBeat.o(19857);
      return;
      if (str2.compareTo("SCAN_CATALOG") == 0)
      {
        this.lyX = ExdeviceBindDeviceUI.e.lzv;
        paramBundle = this.mController.ylL.getString(2131299248);
        break;
      }
      Assert.assertTrue(false);
      break;
      label438: if (this.lyX == ExdeviceBindDeviceUI.e.lzu)
      {
        this.lzd = true;
        this.lzc = true;
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(19861);
    super.onDestroy();
    if (this.lzc)
    {
      aw.RS().aa(new ExdeviceBindDeviceUI.6(this));
      j.boN().b(10, this.ltg);
      j.boN().b(11, this.lzb);
    }
    if (this.lzd)
    {
      ad.bph().b(this);
      ad.bpi().stopScan();
    }
    aw.Rg().b(1264, this);
    aw.Rg().b(1706, this);
    aw.Rg().b(1270, this);
    aw.Rg().b(1719, this);
    AppMethodBeat.o(19861);
  }

  public void onPause()
  {
    AppMethodBeat.i(19860);
    super.onPause();
    ab.i("MicroMsg.ExdeviceBindDeviceUI", "onPause stop scan.");
    if (this.lzc)
      Java2CExDevice.stopScanWCLanDevice();
    if (this.lzd)
      ad.bpi().stopScan();
    AppMethodBeat.o(19860);
  }

  public void onResume()
  {
    AppMethodBeat.i(19858);
    super.onResume();
    ab.i("MicroMsg.ExdeviceBindDeviceUI", "onResume start scan.");
    if (this.lzd)
    {
      ad.bph();
      e.boJ();
    }
    if (this.lzc)
      Java2CExDevice.startScanWCLanDevice(new byte[0], 1000);
    this.lyS.bpE();
    this.lyS.notifyDataSetChanged();
    AppMethodBeat.o(19858);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(19863);
    ab.i("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, errType(%d) errCode(%d) errMsg(%s).", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramm == null)
    {
      ab.e("MicroMsg.ExdeviceBindDeviceUI", "onSceneEnd, scene is null.");
      AppMethodBeat.o(19863);
    }
    while (true)
    {
      return;
      al.d(new ExdeviceBindDeviceUI.8(this, paramInt1, paramInt2, paramString, paramm));
      AppMethodBeat.o(19863);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void p(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(19862);
    ab.d("MicroMsg.ExdeviceBindDeviceUI", "onScanResult, broadcastName(%s), mac(%s), isCompleted(%b).", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
    if (bo.isNullOrNil(paramString2))
    {
      ab.e("MicroMsg.ExdeviceBindDeviceUI", "onScanResult failed, broadcastName(%s), mac(%s), isCompleted(%b).", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(19862);
    }
    while (true)
    {
      return;
      ExdeviceBindDeviceUI.f localf = new ExdeviceBindDeviceUI.f(this, (byte)0);
      localf.lzy = ExdeviceBindDeviceUI.b.lzq;
      localf.lzz = new ExdeviceBindDeviceUI.c(this, (byte)0);
      localf.lzz.lzs = paramString1;
      localf.lzz.cbq = b.jdMethod_if(b.KK(paramString2));
      al.d(new ExdeviceBindDeviceUI.7(this, localf));
      AppMethodBeat.o(19862);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI
 * JD-Core Version:    0.6.2
 */