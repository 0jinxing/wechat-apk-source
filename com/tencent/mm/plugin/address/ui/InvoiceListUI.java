package com.tencent.mm.plugin.address.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.address.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;

public class InvoiceListUI extends MMActivity
  implements f
{
  private TextView gJn;
  private boolean gJy;
  private com.tencent.mm.plugin.j.a.b gKb;
  private InvoiceListUI.a gKc;
  private ListView gKd;
  private com.tencent.mm.plugin.address.b.b.a gKe;
  private TextView gKf;
  private LinkedList<com.tencent.mm.plugin.j.a.b> gKg;
  private boolean gKh;
  private boolean gKi;
  private Object lockObj;

  public InvoiceListUI()
  {
    AppMethodBeat.i(16869);
    this.gKe = null;
    this.lockObj = new Object();
    this.gKf = null;
    this.gJn = null;
    this.gKg = new LinkedList();
    this.gJy = false;
    this.gKh = false;
    this.gKi = false;
    AppMethodBeat.o(16869);
  }

  private void asc()
  {
    AppMethodBeat.i(16873);
    synchronized (this.lockObj)
    {
      com.tencent.mm.plugin.address.a.a.arQ();
      this.gKg = com.tencent.mm.plugin.address.a.a.arR().gIF.nuG;
      this.gKc.items = this.gKg;
      this.gKg.size();
      this.gKc.notifyDataSetChanged();
      AppMethodBeat.o(16873);
      return;
    }
  }

  private void nh(int paramInt)
  {
    AppMethodBeat.i(16876);
    Intent localIntent = new Intent();
    if (paramInt != 0)
    {
      localIntent.setClass(this, QrcodeInvoiceUI.class);
      localIntent.putExtra("invoice_id", paramInt);
    }
    while (true)
    {
      startActivity(localIntent);
      AppMethodBeat.o(16876);
      return;
      localIntent.setClass(this, AddInvoiceUI.class);
      localIntent.putExtra("launch_from_invoicelist_webview", this.gJy);
      localIntent.putExtra("invoice_id", paramInt);
    }
  }

  public final int getLayoutId()
  {
    return 2130969876;
  }

  public final void initView()
  {
    AppMethodBeat.i(16874);
    this.gKf = ((TextView)findViewById(2131825031));
    if (this.gKf != null)
      this.gKf.setVisibility(8);
    if (this.gJy)
    {
      this.gJn = ((TextView)findViewById(2131825032));
      if (this.gJn != null)
        this.gJn.setVisibility(0);
    }
    while (true)
    {
      this.gKf.setOnClickListener(new InvoiceListUI.1(this));
      this.gKd = ((ListView)findViewById(2131825029));
      this.gKc = new InvoiceListUI.a(this, this);
      this.gKd.setAdapter(this.gKc);
      this.gKd.setOnItemClickListener(new InvoiceListUI.2(this));
      this.gKd.setOnItemLongClickListener(new InvoiceListUI.3(this));
      this.gKc.notifyDataSetChanged();
      setBackBtn(new InvoiceListUI.4(this));
      addIconOptionMenu(0, 2131303033, 2131230736, new InvoiceListUI.5(this));
      AppMethodBeat.o(16874);
      return;
      this.gJn = ((TextView)findViewById(2131825032));
      if (this.gJn != null)
        this.gJn.setVisibility(8);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(16877);
    Object localObject;
    if (paramInt1 == 1)
    {
      if (-1 != paramInt2)
        break label209;
      if (paramIntent != null)
        break label71;
      ab.e("MicroMsg.InvoiceUtil", "intent is null");
      paramIntent = null;
      localObject = new Intent();
      ((Intent)localObject).putExtra("choose_invoice_title_info", e.a(paramIntent));
      setResult(-1, (Intent)localObject);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(16877);
      return;
      label71: localObject = new com.tencent.mm.plugin.j.a.b();
      ((com.tencent.mm.plugin.j.a.b)localObject).type = paramIntent.getStringExtra("type");
      if ((((com.tencent.mm.plugin.j.a.b)localObject).type != null) && (((com.tencent.mm.plugin.j.a.b)localObject).type.equals("1")))
      {
        ((com.tencent.mm.plugin.j.a.b)localObject).nuI = paramIntent.getStringExtra("title");
        paramIntent = (Intent)localObject;
        break;
      }
      ((com.tencent.mm.plugin.j.a.b)localObject).title = paramIntent.getStringExtra("title");
      ((com.tencent.mm.plugin.j.a.b)localObject).nuJ = paramIntent.getStringExtra("tax_number");
      ((com.tencent.mm.plugin.j.a.b)localObject).nuP = paramIntent.getStringExtra("company_address");
      ((com.tencent.mm.plugin.j.a.b)localObject).nuN = paramIntent.getStringExtra("telephone");
      ((com.tencent.mm.plugin.j.a.b)localObject).nuL = paramIntent.getStringExtra("bank_name");
      ((com.tencent.mm.plugin.j.a.b)localObject).nuK = paramIntent.getStringExtra("bank_account");
      paramIntent = (Intent)localObject;
      break;
      label209: setResult(0);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(16870);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    this.gJy = paramBundle.getBooleanExtra("launch_from_webview", false);
    this.gKh = paramBundle.getBooleanExtra("launch_from_appbrand", false);
    if ((this.gJy) || (this.gKh))
      this.gJy = true;
    if (this.gJy)
    {
      aw.ZK();
      boolean bool = ((Boolean)c.Ry().get(ac.a.xOK, Boolean.TRUE)).booleanValue();
      ab.i("MicroMsg.InvoiceListUI", "showDisclaimerDailog..isShowDisclaimerDialog ".concat(String.valueOf(bool)));
      if (bool)
      {
        ab.i("MicroMsg.InvoiceListUI", "showDisclaimerDialog");
        h.a(this, getString(2131300694), getString(2131300695), getString(2131296322), false, new InvoiceListUI.6(this));
        aw.ZK();
        c.Ry().set(ac.a.xOK, Boolean.FALSE);
      }
    }
    setMMTitle(2131303163);
    aw.Rg().a(1194, this);
    aw.Rg().a(1191, this);
    initView();
    asc();
    AppMethodBeat.o(16870);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(16871);
    aw.Rg().b(1194, this);
    aw.Rg().b(1191, this);
    super.onDestroy();
    AppMethodBeat.o(16871);
  }

  public void onResume()
  {
    AppMethodBeat.i(16872);
    com.tencent.mm.plugin.address.model.b localb = new com.tencent.mm.plugin.address.model.b();
    aw.Rg().a(localb, 0);
    super.onResume();
    AppMethodBeat.o(16872);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(16875);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramm.getType() == 1191)
      {
        asc();
        if (!this.gJy)
          break label133;
        com.tencent.mm.plugin.address.a.a.arQ();
        if ((com.tencent.mm.plugin.address.a.a.arR().gIF.nuG.size() != 0) || (this.gKi))
          break label133;
        paramString = new Intent();
        paramString.setClass(this, AddInvoiceUI.class);
        paramString.putExtra("launch_from_webview", true);
        startActivityForResult(paramString, 1);
        AppMethodBeat.o(16875);
      }
    while (true)
    {
      return;
      if (paramm.getType() == 1194)
      {
        paramString = new com.tencent.mm.plugin.address.model.b();
        aw.Rg().a(paramString, 0);
        this.gKi = true;
      }
      label133: AppMethodBeat.o(16875);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceListUI
 * JD-Core Version:    0.6.2
 */