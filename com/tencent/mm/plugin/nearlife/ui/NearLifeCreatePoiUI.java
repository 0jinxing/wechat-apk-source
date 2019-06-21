package com.tencent.mm.plugin.nearlife.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.plugin.nearlife.b.b;
import com.tencent.mm.protocal.protobuf.axx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;

public class NearLifeCreatePoiUI extends MMActivity
  implements f
{
  private TextWatcher arx;
  private com.tencent.mm.ui.base.p ejZ;
  private String hlm;
  private TextView oSA;
  private com.tencent.mm.modelgeo.c oSB;
  private b oSC;
  private View.OnClickListener oSD;
  private View.OnClickListener oSE;
  private View.OnClickListener oSF;
  private MenuItem.OnMenuItemClickListener oSG;
  private c.a oSH;
  private MenuItem.OnMenuItemClickListener oSI;
  private axx oSs;
  private String oSt;
  private String oSu;
  private Addr oSv;
  private String oSw;
  private EditText oSx;
  private EditText oSy;
  private TextView oSz;

  public NearLifeCreatePoiUI()
  {
    AppMethodBeat.i(22980);
    this.oSD = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(22971);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("ui_title", 2131301721);
        if (NearLifeCreatePoiUI.a(NearLifeCreatePoiUI.this) != null)
        {
          paramAnonymousView.putExtra("extra_province", NearLifeCreatePoiUI.a(NearLifeCreatePoiUI.this).fBh);
          paramAnonymousView.putExtra("extra_city", NearLifeCreatePoiUI.a(NearLifeCreatePoiUI.this).fBi);
        }
        d.b(NearLifeCreatePoiUI.this.mController.ylL, "address", ".ui.WalletMultiRcptSelectUI", paramAnonymousView, 1);
        AppMethodBeat.o(22971);
      }
    };
    this.oSE = new NearLifeCreatePoiUI.2(this);
    this.oSF = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(22973);
        NearLifeCreatePoiUI.this.findViewById(2131826282).setVisibility(8);
        NearLifeCreatePoiUI.this.findViewById(2131826283).setVisibility(0);
        NearLifeCreatePoiUI.this.findViewById(2131826285).setVisibility(0);
        AppMethodBeat.o(22973);
      }
    };
    this.oSG = new NearLifeCreatePoiUI.4(this);
    this.oSH = new NearLifeCreatePoiUI.5(this);
    this.oSI = new NearLifeCreatePoiUI.6(this);
    this.arx = new NearLifeCreatePoiUI.7(this);
    AppMethodBeat.o(22980);
  }

  private void bVq()
  {
    AppMethodBeat.i(22986);
    h.a(this, 2131301705, 2131301711, new NearLifeCreatePoiUI.8(this), null);
    AppMethodBeat.o(22986);
  }

  public final int getLayoutId()
  {
    return 2130970282;
  }

  public final void initView()
  {
    AppMethodBeat.i(22982);
    setMMTitle(2131301711);
    ((ViewGroup)findViewById(2131826279)).setOnClickListener(this.oSD);
    ((ViewGroup)findViewById(2131826283)).setOnClickListener(this.oSE);
    ((TextView)findViewById(2131826282)).setOnClickListener(this.oSF);
    findViewById(2131826282).setVisibility(8);
    findViewById(2131826283).setVisibility(0);
    findViewById(2131826285).setVisibility(0);
    this.oSx = ((EditText)findViewById(2131826278));
    this.oSy = ((EditText)findViewById(2131826281));
    this.oSz = ((TextView)findViewById(2131826280));
    this.oSA = ((TextView)findViewById(2131826284));
    this.oSx.addTextChangedListener(this.arx);
    this.oSy.addTextChangedListener(this.arx);
    this.oSz.addTextChangedListener(this.arx);
    String str = bo.bc(getIntent().getStringExtra("get_poi_name"), "");
    if (str.length() != 0)
    {
      this.oSx.setText(str);
      this.oSx.setSelection(str.length());
    }
    com.tencent.mm.ui.tools.b.c.d(this.oSx).PM(100).a(null);
    com.tencent.mm.ui.tools.b.c.d(this.oSy).PM(400).a(null);
    com.tencent.mm.ui.tools.b.c.d((EditText)findViewById(2131826286)).PM(100).a(null);
    a(0, getString(2131296944), this.oSG, q.b.ymu);
    enableOptionMenu(0, false);
    setBackBtn(this.oSI);
    AppMethodBeat.o(22982);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(22983);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(22983);
      while (true)
      {
        return;
        paramIntent = paramIntent.getStringExtra("karea_result");
        if (bo.isNullOrNil(paramIntent))
          break;
        ((TextView)findViewById(2131826280)).setText(paramIntent.replace(" ", ""));
        AppMethodBeat.o(22983);
      }
      if ((-1 == paramInt2) && (paramIntent != null))
      {
        paramIntent = bo.nullAsNil(paramIntent.getStringExtra("poi_category"));
        this.oSA.setText(paramIntent);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22981);
    super.onCreate(paramBundle);
    aw.Rg().a(650, this);
    this.oSs = new axx();
    this.oSs.vRq = getIntent().getFloatExtra("get_lat", -85.0F);
    this.oSs.vRp = getIntent().getFloatExtra("get_lng", -1000.0F);
    this.oSs.wfG = getIntent().getIntExtra("get_preci", 0);
    this.oSs.wfI = "";
    this.oSs.wfJ = 0;
    this.oSs.wfH = "";
    this.oSB = com.tencent.mm.modelgeo.c.agw();
    if (this.oSB != null)
      this.oSB.a(this.oSs.vRq, this.oSs.vRp, this.oSH);
    this.hlm = getIntent().getStringExtra("search_id");
    ab.d("MicroMsg.NearLifeCreatePoiUI", "tofuliutest searchid: %s", new Object[] { this.hlm });
    initView();
    AppMethodBeat.o(22981);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22984);
    super.onDestroy();
    aw.Rg().b(650, this);
    AppMethodBeat.o(22984);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(22985);
    boolean bool;
    if (4 == paramKeyEvent.getKeyCode())
    {
      bVq();
      bool = true;
      AppMethodBeat.o(22985);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(22985);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22987);
    ab.i("MicroMsg.NearLifeCreatePoiUI", "errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.ejZ.dismiss();
      paramm = (b)paramm;
      paramString = new Intent();
      if (this.oSs != null)
      {
        paramString.putExtra("get_lat", this.oSs.vRq);
        paramString.putExtra("get_lng", this.oSs.vRp);
      }
      if (this.oSv != null)
        paramString.putExtra("get_city", this.oSv.fBi);
      paramString.putExtra("get_poi_address", this.oSu);
      paramString.putExtra("get_poi_classify_id", paramm.oRf);
      paramString.putExtra("get_poi_name", this.oSt);
      paramString.putExtra("get_poi_classify_type", 1);
      setResult(-1, paramString);
      finish();
      AppMethodBeat.o(22987);
    }
    while (true)
    {
      return;
      this.ejZ.dismiss();
      Toast.makeText(this.mController.ylL, getString(2131301709), 1).show();
      this.oSC = null;
      AppMethodBeat.o(22987);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI
 * JD-Core Version:    0.6.2
 */