package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.d.a.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import junit.framework.Assert;

public class ExdeviceBindDeviceGuideUI extends MMActivity
  implements f
{
  private String Fd;
  private Button gHn;
  BroadcastReceiver jIA;
  private String kWC;
  private String lst;
  private String lsu;
  private String lxI;
  private ScrollView lyA;
  private ImageView lyB;
  private TextView lyC;
  private String lyD;
  private String lyE;
  private String lyF;
  private String lyG;
  private long lyH;
  private ArrayList<String> lyI;
  private String lyJ;
  private boolean lyK;
  private boolean lyL;
  private String lya;
  private TextView lyf;
  private LocationManager lyi;
  private boolean lyj;
  private a lyx;
  private Button lyy;
  private TextView lyz;
  private ListView mListView;
  private String mTitle;

  public ExdeviceBindDeviceGuideUI()
  {
    AppMethodBeat.i(19819);
    this.lyK = false;
    this.lyL = false;
    this.lyj = false;
    this.jIA = new ExdeviceBindDeviceGuideUI.4(this);
    AppMethodBeat.o(19819);
  }

  private void uM(int paramInt)
  {
    AppMethodBeat.i(19822);
    switch (paramInt)
    {
    default:
      switch (paramInt)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
      break;
    case 2:
    case 1:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(19822);
      while (true)
      {
        return;
        this.lyy.setText(this.mController.ylL.getString(2131299289));
        this.gHn.setVisibility(8);
        this.lyz.setText(this.mController.ylL.getString(2131299288));
        break;
        this.lyy.setText(this.mController.ylL.getString(2131299297));
        this.gHn.setText(this.mController.ylL.getString(2131299256));
        this.lyz.setText(this.mController.ylL.getString(2131299298));
        break;
        this.lyB.setImageResource(2131230978);
        this.lyf.setText(2131299276);
        this.lyC.setText(2131299260);
        break;
        this.lyB.setImageResource(2131230978);
        this.lyf.setText(2131299274);
        this.lyC.setText("");
        break;
        this.lyB.setImageResource(2131232181);
        this.lyf.setText(2131299276);
        this.lyC.setText(2131299271);
        break;
        this.lyB.setImageResource(2131230978);
        this.lyf.setText(2131299276);
        this.lyC.setText(2131299324);
        break;
        this.lyB.setVisibility(8);
        this.lyf.setVisibility(8);
        this.lyC.setVisibility(8);
        this.mListView.setVisibility(0);
        this.lyA.setVisibility(0);
        AppMethodBeat.o(19822);
        continue;
        this.lyB.setVisibility(0);
        this.lyf.setVisibility(0);
        this.mListView.setVisibility(8);
        this.lyA.setVisibility(8);
        if (paramInt != 4)
          break label430;
        this.lyC.setVisibility(8);
        AppMethodBeat.o(19822);
      }
      label430: this.lyC.setVisibility(0);
    }
  }

  public final int getLayoutId()
  {
    return 2130969411;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(19820);
    super.onCreate(paramBundle);
    setBackBtn(new ExdeviceBindDeviceGuideUI.1(this));
    if ((com.tencent.mm.compatible.util.d.iW(23)) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0")))
    {
      ab.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Bluetooth limited version(%s)", new Object[] { Build.VERSION.RELEASE });
      this.lyj = true;
    }
    paramBundle = getIntent();
    this.lyD = paramBundle.getStringExtra("device_scan_mode");
    this.lyE = paramBundle.getStringExtra("device_scan_conn_proto");
    this.lsu = paramBundle.getStringExtra("device_id");
    this.lxI = paramBundle.getStringExtra("device_type");
    this.lyF = paramBundle.getStringExtra("device_title");
    this.lya = paramBundle.getStringExtra("device_desc");
    this.kWC = paramBundle.getStringExtra("device_icon_url");
    this.Fd = paramBundle.getStringExtra("device_category_id");
    this.lst = paramBundle.getStringExtra("device_brand_name");
    this.lyG = paramBundle.getStringExtra("bind_ticket");
    this.lyH = paramBundle.getLongExtra("device_ble_simple_proto", -1L);
    this.lyI = paramBundle.getStringArrayListExtra("device_airkiss_steps");
    this.lyJ = paramBundle.getStringExtra("device_airkiss_key");
    this.mTitle = paramBundle.getStringExtra("device_airkiss_title");
    ab.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Category config guide steps(%d)", new Object[] { Integer.valueOf(this.lyI.size()) });
    this.lyi = ((LocationManager)this.mController.ylL.getSystemService("location"));
    this.mListView = ((ListView)findViewById(2131823638));
    paramBundle = View.inflate(this, 2130969405, null);
    this.lyz = ((TextView)paramBundle.findViewById(2131823623));
    this.lyx = new a(this.lyI);
    this.mListView.addHeaderView(paramBundle);
    this.mListView.setDividerHeight(0);
    this.mListView.setClickable(false);
    this.mListView.setFooterDividersEnabled(false);
    this.mListView.setAdapter(this.lyx);
    this.lyB = ((ImageView)findViewById(2131823626));
    this.lyA = ((ScrollView)findViewById(2131823637));
    this.lyy = ((Button)findViewById(2131823639));
    this.gHn = ((Button)findViewById(2131823640));
    this.lyf = ((TextView)findViewById(2131823627));
    this.lyC = ((TextView)findViewById(2131823628));
    paramBundle = "";
    if (this.lyD.compareTo("SCAN_CATALOG") == 0)
      if (this.lyE.contains("wifi"))
      {
        this.lyK = true;
        paramBundle = this.mController.ylL.getString(2131299297);
        setMMTitle(paramBundle);
        if ((!this.lyL) || (this.lyK))
          break label762;
        if (a.dv(this.mController.ylL))
          break label696;
        ab.i("MicroMsg.ExdeviceBindDeviceGuideUI", "now sdk version not support ble device : %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        uM(4);
      }
    while (true)
    {
      this.lyy.setOnClickListener(new ExdeviceBindDeviceGuideUI.2(this));
      this.gHn.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(19813);
          if ((ExdeviceBindDeviceGuideUI.n(ExdeviceBindDeviceGuideUI.this)) && (!ExdeviceBindDeviceGuideUI.m(ExdeviceBindDeviceGuideUI.this)))
          {
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("device_scan_mode", ExdeviceBindDeviceGuideUI.a(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_scan_conn_proto", ExdeviceBindDeviceGuideUI.b(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_id", ExdeviceBindDeviceGuideUI.c(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_type", ExdeviceBindDeviceGuideUI.d(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_title", ExdeviceBindDeviceGuideUI.e(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_desc", ExdeviceBindDeviceGuideUI.f(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_icon_url", ExdeviceBindDeviceGuideUI.g(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_category_id", ExdeviceBindDeviceGuideUI.h(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("device_brand_name", ExdeviceBindDeviceGuideUI.i(ExdeviceBindDeviceGuideUI.this));
            paramAnonymousView.putExtra("bind_ticket", ExdeviceBindDeviceGuideUI.j(ExdeviceBindDeviceGuideUI.this));
            com.tencent.mm.bp.d.b(ExdeviceBindDeviceGuideUI.this.mController.ylL, "exdevice", ".ui.ExdeviceBindDeviceUI", paramAnonymousView);
          }
          AppMethodBeat.o(19813);
        }
      });
      paramBundle = new IntentFilter();
      paramBundle.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
      paramBundle.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      paramBundle.addAction("android.location.MODE_CHANGED");
      this.mController.ylL.registerReceiver(this.jIA, paramBundle);
      AppMethodBeat.o(19820);
      return;
      if (this.lyE.contains("blue"))
      {
        this.lyL = true;
        paramBundle = this.mController.ylL.getString(2131299264);
        break;
      }
      Assert.assertTrue(false);
      break;
      Assert.assertTrue(false);
      break;
      label696: if (!a.aVH())
      {
        ab.i("MicroMsg.ExdeviceBindDeviceGuideUI", "Bluetooth is not open, Just leave");
        uM(3);
      }
      else if ((this.lyi != null) && (this.lyj) && (!this.lyi.isProviderEnabled("gps")))
      {
        ab.i("MicroMsg.ExdeviceBindDeviceGuideUI", "BLE limited version, GPS do not open");
        uM(6);
      }
      else
      {
        label762: if ((!this.lyL) && (this.lyK) && (!at.isWifi(this.mController.ylL)))
        {
          ab.i("MicroMsg.ExdeviceBindDeviceGuideUI", "wifi is not open, Just leave");
          uM(5);
        }
        else if ((this.lyK) && (!this.lyL))
        {
          uM(1);
        }
        else if ((this.lyL) && (!this.lyK))
        {
          uM(2);
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(19821);
    super.onDestroy();
    this.mController.ylL.unregisterReceiver(this.jIA);
    AppMethodBeat.o(19821);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class a extends BaseAdapter
  {
    private ArrayList<String> lyN;

    public a(ArrayList<String> paramArrayList)
    {
      this.lyN = paramArrayList;
    }

    private String getItem(int paramInt)
    {
      AppMethodBeat.i(19816);
      String str;
      if ((this.lyN != null) && (this.lyN.size() > 0))
      {
        str = (String)this.lyN.get(paramInt);
        AppMethodBeat.o(19816);
      }
      while (true)
      {
        return str;
        str = null;
        AppMethodBeat.o(19816);
      }
    }

    public final int getCount()
    {
      AppMethodBeat.i(19815);
      int i;
      if (this.lyN != null)
      {
        i = this.lyN.size();
        AppMethodBeat.o(19815);
      }
      while (true)
      {
        return i;
        i = 0;
        AppMethodBeat.o(19815);
      }
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(19817);
      if ((this.lyN == null) || (this.lyN.size() <= 0))
      {
        AppMethodBeat.o(19817);
        paramView = null;
        return paramView;
      }
      String str = getItem(paramInt);
      if (paramView == null)
      {
        ExdeviceBindDeviceGuideUI.a.a locala = new ExdeviceBindDeviceGuideUI.a.a((byte)0);
        paramView = View.inflate(paramViewGroup.getContext(), 2130969410, null);
        locala.lyP = ((TextView)paramView.findViewById(2131823636));
        locala.lyO = ((TextView)paramView.findViewById(2131823634));
        locala.lyQ = paramView.findViewById(2131823633);
        locala.lyR = paramView.findViewById(2131823635);
        paramView.setTag(locala);
        paramViewGroup = locala;
        label124: paramViewGroup.lyO.setText(Integer.toString(paramInt + 1));
        paramViewGroup.lyP.setText(str);
        if ((paramInt != 0) || (this.lyN.size() != 1))
          break label197;
        paramViewGroup.lyQ.setVisibility(4);
        paramViewGroup.lyR.setVisibility(4);
      }
      while (true)
      {
        AppMethodBeat.o(19817);
        break;
        paramViewGroup = (ExdeviceBindDeviceGuideUI.a.a)paramView.getTag();
        break label124;
        label197: if (paramInt == 0)
        {
          paramViewGroup.lyQ.setVisibility(4);
          paramViewGroup.lyR.setVisibility(0);
        }
        else if (paramInt == this.lyN.size() - 1)
        {
          paramViewGroup.lyR.setVisibility(4);
          paramViewGroup.lyQ.setVisibility(0);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceGuideUI
 * JD-Core Version:    0.6.2
 */