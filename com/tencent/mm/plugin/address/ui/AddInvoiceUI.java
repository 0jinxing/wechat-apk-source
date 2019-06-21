package com.tencent.mm.plugin.address.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.address.model.i;
import com.tencent.mm.protocal.protobuf.asa;
import com.tencent.mm.protocal.protobuf.btz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.util.LinkedList;

public class AddInvoiceUI extends MMActivity
  implements f, InvoiceEditView.c
{
  private int Zb;
  private String cJo;
  private TextView exj;
  private Dialog gII;
  private int gJi;
  private Button gJj;
  private Button gJk;
  private TextView gJl;
  private TextView gJm;
  private TextView gJn;
  private InvoiceEditView gJo;
  private InvoiceEditView gJp;
  private InvoiceEditView gJq;
  private InvoiceEditView gJr;
  private InvoiceEditView gJs;
  private InvoiceEditView gJt;
  private InvoiceEditView gJu;
  private InvoiceEditView gJv;
  private com.tencent.mm.plugin.j.a.b gJw;
  private com.tencent.mm.plugin.j.a.b gJx;
  private boolean gJy;
  private boolean gJz;

  public AddInvoiceUI()
  {
    AppMethodBeat.i(16792);
    this.gJi = 0;
    this.gJj = null;
    this.gJk = null;
    this.gJn = null;
    this.gJw = null;
    this.gJx = new com.tencent.mm.plugin.j.a.b();
    this.gII = null;
    this.gJy = false;
    this.gJz = false;
    this.cJo = "";
    this.Zb = 0;
    AppMethodBeat.o(16792);
  }

  private void al(String paramString, int paramInt)
  {
    AppMethodBeat.i(16802);
    h.a(this, getString(2131300673, new Object[] { paramString, Integer.valueOf(paramInt) }), getString(2131297061), false, null);
    AppMethodBeat.o(16802);
  }

  private boolean arW()
  {
    boolean bool1 = false;
    AppMethodBeat.i(16798);
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    if (((this.gJk != null) && (this.gJk.isActivated())) || ((this.gJw != null) && (this.gJw.type != null) && (this.gJw.type.equals("0"))))
    {
      this.gJr.setVisibility(0);
      this.gJs.setVisibility(0);
      this.gJt.setVisibility(0);
      this.gJu.setVisibility(0);
      this.gJv.setVisibility(0);
      this.gJp.setVisibility(0);
      this.gJq.setVisibility(8);
      bool2 = bool4;
      if (!this.gJk.isActivated())
      {
        bool2 = bool4;
        if (!this.gJw.type.equals("0"))
          bool2 = false;
      }
      if (!this.gJp.asa())
      {
        if (this.gJp.getText().length() > 100)
          al(getString(2131300696), 100);
        bool2 = false;
      }
      if ((this.gJk == null) || (!this.gJk.isActivated()) || (this.gJp.getText().length() != 0))
        break label917;
      bool2 = false;
    }
    label914: label917: 
    while (true)
    {
      enableOptionMenu(bool2);
      if (!this.gJr.asa())
      {
        if (this.gJr.getText().length() > 0)
        {
          ViewStub localViewStub = (ViewStub)findViewById(2131825956);
          if (localViewStub != null)
          {
            localViewStub.inflate();
            this.gJl = ((TextView)findViewById(2131828440));
          }
          if (this.gJl != null)
            this.gJl.setVisibility(0);
        }
        if (!this.gJs.asa())
        {
          if (this.gJs.getText().length() > 100)
            al(getString(2131300675), 100);
          bool2 = false;
        }
        if (!this.gJt.asa())
        {
          if (this.gJt.getText().length() > 100)
            al(getString(2131300686), 100);
          bool2 = false;
        }
        if (!this.gJu.asa())
        {
          if (this.gJu.getText().length() > 100)
            al(getString(2131300668), 100);
          bool2 = false;
        }
        if (this.gJv.asa())
          break label914;
        bool2 = bool1;
        if (this.gJv.getText().length() > 48)
        {
          al(getString(2131300670), 39);
          bool2 = bool1;
        }
      }
      while (true)
      {
        AppMethodBeat.o(16798);
        return bool2;
        if (this.gJl == null)
          break;
        this.gJl.setVisibility(8);
        break;
        if (((this.gJj != null) && (this.gJj.isActivated())) || ((this.gJw != null) && (this.gJw.type != null) && (this.gJw.type.equals("1"))))
        {
          this.gJr.setVisibility(8);
          this.gJs.setVisibility(8);
          this.gJt.setVisibility(8);
          this.gJu.setVisibility(8);
          this.gJv.setVisibility(8);
          this.gJp.setVisibility(8);
          this.gJq.setVisibility(0);
          bool4 = bool2;
          if (!this.gJj.isActivated())
          {
            bool4 = bool2;
            if (!this.gJw.type.equals("1"))
              bool4 = false;
          }
          if (!this.gJq.asa())
          {
            if (this.gJq.getText().length() > 100)
              al(getString(2131300696), 100);
            bool4 = false;
          }
          bool2 = bool4;
          if (this.gJj != null)
          {
            bool2 = bool4;
            if (this.gJj.isActivated())
            {
              bool2 = bool4;
              if (this.gJq.getText().length() == 0)
                bool2 = false;
            }
          }
          enableOptionMenu(bool2);
        }
        else
        {
          this.gJr.setVisibility(0);
          this.gJs.setVisibility(0);
          this.gJt.setVisibility(0);
          this.gJu.setVisibility(0);
          this.gJv.setVisibility(0);
          this.gJq.setVisibility(8);
          this.gJp.setVisibility(0);
          this.gJq.setVisibility(8);
          bool2 = bool3;
          if (this.gJj != null)
          {
            bool2 = bool3;
            if (!this.gJj.isActivated())
            {
              bool2 = bool3;
              if (this.gJk != null)
              {
                bool2 = bool3;
                if (!this.gJk.isActivated())
                  bool2 = false;
              }
            }
          }
          if (!this.gJp.asa())
            bool2 = false;
          if (!this.gJr.asa())
            bool2 = false;
          if (!this.gJs.asa())
            bool2 = false;
          if (!this.gJt.asa())
            bool2 = false;
          bool4 = bool2;
          if (!this.gJu.asa())
            bool4 = false;
          bool2 = bool1;
          if (this.gJv.asa())
            bool2 = bool4;
        }
      }
    }
  }

  private void arY()
  {
    int i = 1;
    AppMethodBeat.i(16801);
    if (((this.gJi != 0) && (this.gJw != null) && (this.gJx.type != null) && (!this.gJx.type.equals("")) && (!this.gJx.type.equals(this.gJw.type))) || ((this.gJi == 0) && (this.gJx.type != null) && (!this.gJx.type.equals(""))));
    for (int j = 1; ; j = 0)
    {
      int k = j;
      if (this.gJj != null)
      {
        k = j;
        if (this.gJk != null)
        {
          k = j;
          if (!this.gJj.isActivated())
          {
            k = j;
            if (!this.gJk.isActivated())
            {
              k = j;
              if (this.gJw == null)
                k = 1;
            }
          }
        }
      }
      j = k;
      if (this.gJp.asb())
        j = 1;
      if (this.gJq.asb())
        j = 1;
      if (this.gJr.asb())
        j = 1;
      if (this.gJs.asb())
        j = 1;
      if (this.gJt.asb())
        j = 1;
      if (this.gJu.asb())
        j = 1;
      if (this.gJv.asb())
        j = i;
      while (true)
      {
        if (j != 0)
        {
          h.a(this, false, this.mController.ylL.getString(2131300667), "", this.mController.ylL.getString(2131300666), this.mController.ylL.getString(2131300665), new AddInvoiceUI.5(this), null);
          AppMethodBeat.o(16801);
        }
        while (true)
        {
          return;
          setResult(0);
          finish();
          AppMethodBeat.o(16801);
        }
      }
    }
  }

  public final void arX()
  {
    AppMethodBeat.i(16799);
    arW();
    AppMethodBeat.o(16799);
  }

  public final void arZ()
  {
    AppMethodBeat.i(16803);
    h.a(this, getString(2131300697), getString(2131297061), false, null);
    AppMethodBeat.o(16803);
  }

  public final int getLayoutId()
  {
    return 2130970088;
  }

  public final void initView()
  {
    AppMethodBeat.i(16794);
    this.Zb = 0;
    MMScrollView localMMScrollView = (MMScrollView)findViewById(2131825955);
    if (localMMScrollView != null)
      localMMScrollView.a(localMMScrollView, localMMScrollView);
    this.gJj = ((Button)findViewById(2131825958));
    if (this.gJj != null)
      this.gJj.setVisibility(0);
    this.gJk = ((Button)findViewById(2131825959));
    if (this.gJk != null)
      this.gJk.setVisibility(0);
    if ((this.gJi == 0) && (this.gJk != null))
      this.gJk.setActivated(true);
    if (this.gJk != null)
      this.gJk.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          boolean bool = true;
          AppMethodBeat.i(16787);
          if (paramAnonymousMotionEvent.getAction() == 0)
            AppMethodBeat.o(16787);
          while (true)
          {
            return bool;
            if (paramAnonymousMotionEvent.getAction() != 1)
            {
              AppMethodBeat.o(16787);
              bool = false;
            }
            else
            {
              if (!AddInvoiceUI.a(AddInvoiceUI.this).isActivated())
                AddInvoiceUI.a(AddInvoiceUI.this).setActivated(true);
              if (AddInvoiceUI.a(AddInvoiceUI.this).isActivated())
              {
                AddInvoiceUI.b(AddInvoiceUI.this).setActivated(false);
                AddInvoiceUI.c(AddInvoiceUI.this).type = "0";
              }
              AddInvoiceUI.d(AddInvoiceUI.this);
              AppMethodBeat.o(16787);
            }
          }
        }
      });
    if (this.gJj != null)
      this.gJj.setOnTouchListener(new AddInvoiceUI.2(this));
    this.gJo = ((InvoiceEditView)findViewById(2131825960));
    this.gJp = ((InvoiceEditView)findViewById(2131822290));
    this.gJq = ((InvoiceEditView)findViewById(2131825961));
    this.gJr = ((InvoiceEditView)findViewById(2131825962));
    this.gJs = ((InvoiceEditView)findViewById(2131825963));
    this.gJt = ((InvoiceEditView)findViewById(2131825964));
    this.gJu = ((InvoiceEditView)findViewById(2131825965));
    this.gJv = ((InvoiceEditView)findViewById(2131825966));
    this.gJr.gJU = true;
    this.gJr.gJN = true;
    this.gJr.setOnInputValidChangeListener(this);
    this.gJo.setOnInputValidChangeListener(this);
    this.gJp.setOnInputValidChangeListener(this);
    this.gJq.setOnInputValidChangeListener(this);
    this.gJs.setOnInputValidChangeListener(this);
    this.gJt.setOnInputValidChangeListener(this);
    this.gJu.setOnInputValidChangeListener(this);
    this.gJv.setOnInputValidChangeListener(this);
    if (this.gJi != 0)
    {
      this.exj = ((TextView)findViewById(2131821051));
      this.exj.setVisibility(8);
      this.gJm = ((TextView)findViewById(2131825957));
      this.gJw = com.tencent.mm.plugin.address.a.a.arR().nd(this.gJi);
      if ((this.gJw == null) || (this.gJw.type == null) || (!this.gJw.type.equals("0")))
        break label692;
      this.gJm.setText(getString(2131300678));
      this.gJm.setVisibility(0);
      this.gJk.setVisibility(8);
      this.gJj.setVisibility(8);
      if (this.gJw != null)
      {
        this.gJo.setValStr(this.gJw.type);
        this.gJp.setValStr(this.gJw.title);
        this.gJq.setValStr(this.gJw.nuI);
        this.gJr.setValStr(this.gJw.nuJ);
        this.gJs.setValStr(this.gJw.nuP);
        this.gJt.setValStr(this.gJw.nuN);
        this.gJu.setValStr(this.gJw.nuL);
        this.gJv.setValStr(this.gJw.nuK);
      }
    }
    if ((this.gJz) || (this.gJy))
    {
      this.gJn = ((TextView)findViewById(2131825032));
      if (this.gJn != null)
        this.gJn.setVisibility(0);
    }
    while (true)
    {
      setBackBtn(new AddInvoiceUI.3(this));
      a(0, getString(2131297038), new AddInvoiceUI.4(this), q.b.ymu);
      enableOptionMenu(false);
      arW();
      AppMethodBeat.o(16794);
      return;
      label692: if ((this.gJw == null) || (this.gJw.type == null) || (!this.gJw.type.equals("1")))
        break;
      this.gJm.setText(getString(2131300684));
      break;
      this.gJn = ((TextView)findViewById(2131825032));
      if (this.gJn != null)
        this.gJn.setVisibility(8);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(16796);
    switch (paramInt1)
    {
    case 2:
    default:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(16796);
      while (true)
      {
        return;
        if (paramInt2 != -1)
          break;
        String str = paramIntent.getStringExtra("karea_result");
        if (!bo.isNullOrNil(str))
        {
          ab.d("MicroMsg.AddInvoiceUI", "AREA_RESULT:".concat(String.valueOf(str)));
          this.gJt.setValStr(str);
        }
        str = paramIntent.getStringExtra("kpost_code");
        if (!bo.isNullOrNil(str))
        {
          ab.d("MicroMsg.AddInvoiceUI", "post:".concat(String.valueOf(str)));
          this.gJt.setValStr(str);
        }
        this.cJo = paramIntent.getStringExtra("kwcode");
        AppMethodBeat.o(16796);
      }
      if (paramInt2 != -1)
        ab.i("MicroMsg.AddInvoiceUI", "MallRecharge pay result : cancel");
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(16793);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.gJy = paramBundle.getBooleanExtra("launch_from_webview", false);
    this.gJz = paramBundle.getBooleanExtra("launch_from_invoicelist_webview", false);
    aw.Rg().a(1191, this);
    ab.d("MicroMsg.AddInvoiceUI", "index Oncreate");
    this.gJx = new com.tencent.mm.plugin.j.a.b();
    this.gJi = getIntent().getIntExtra("invoice_id", 0);
    if (this.gJi == 0)
      setMMTitle(2131303033);
    while (true)
    {
      initView();
      AppMethodBeat.o(16793);
      return;
      setMMTitle(2131303147);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(16795);
    aw.Rg().b(1180, this);
    aw.Rg().b(1191, this);
    getWindow().setSoftInputMode(3);
    super.onDestroy();
    AppMethodBeat.o(16795);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(16800);
    boolean bool;
    if (paramInt == 4)
    {
      arY();
      bool = true;
      AppMethodBeat.o(16800);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(16800);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    Object localObject = null;
    AppMethodBeat.i(16797);
    ab.i("MicroMsg.AddInvoiceUI", "errType " + paramInt1 + ",errCode " + paramInt2 + ",errMsg " + paramString);
    if (this.gII != null)
      this.gII.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramm.getType() == 1180)
      {
        paramString = ((i)paramm).gIL;
        if ((paramString != null) && (paramString.wVS != null) && (paramString.wVS.size() > 0) && (paramString.wVS.get(0) != null))
          this.Zb = ((asa)paramString.wVS.get(0)).wcR;
        aw.Rg().b(1180, this);
        paramString = new com.tencent.mm.plugin.address.model.b();
        aw.Rg().a(paramString, 0);
        AppMethodBeat.o(16797);
      }
    while (true)
    {
      return;
      if (paramm.getType() == 1191)
      {
        aw.Rg().b(1191, this);
        if (this.gJy)
        {
          ab.i("MicroMsg.AddInvoiceUI", "isLaunchFromWebview true...");
          paramm = this.gJx;
          if (paramm == null)
          {
            ab.e("MicroMsg.InvoiceUtil", "invoiceObj == null");
            paramString = localObject;
          }
          while (true)
          {
            setResult(-1, paramString);
            finish();
            AppMethodBeat.o(16797);
            break;
            paramString = new Intent();
            paramString.putExtra("type", paramm.type);
            if ((paramm.type != null) && (paramm.type.equals("1")))
            {
              paramString.putExtra("title", paramm.nuI);
            }
            else
            {
              paramString.putExtra("title", paramm.title);
              paramString.putExtra("tax_number", paramm.nuJ);
              paramString.putExtra("company_address", paramm.nuP);
              paramString.putExtra("telephone", paramm.nuN);
              paramString.putExtra("bank_name", paramm.nuL);
              paramString.putExtra("bank_account", paramm.nuK);
            }
          }
        }
        if ((this.gJi == 0) && (this.Zb != 0))
        {
          paramString = new Intent();
          paramString.setClass(this, QrcodeInvoiceUI.class);
          paramString.putExtra("invoice_id", this.Zb);
          startActivity(paramString);
          this.Zb = 0;
        }
        finish();
        AppMethodBeat.o(16797);
        continue;
        h.a(this, getString(2131300690), getString(2131297061), false, null);
      }
      else
      {
        AppMethodBeat.o(16797);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.AddInvoiceUI
 * JD-Core Version:    0.6.2
 */