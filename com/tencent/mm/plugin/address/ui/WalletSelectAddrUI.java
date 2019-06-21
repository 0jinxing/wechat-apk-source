package com.tencent.mm.plugin.address.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ba.k;
import com.tencent.mm.g.a.ki;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.address.model.d;
import com.tencent.mm.plugin.address.model.e;
import com.tencent.mm.plugin.address.model.f;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;

public class WalletSelectAddrUI extends MMActivity
  implements com.tencent.mm.plugin.address.c.a
{
  private boolean gJy;
  private ListView gKd;
  private List<com.tencent.mm.plugin.address.d.b> gLa;
  private com.tencent.mm.plugin.address.d.b gLb;
  private WalletSelectAddrUI.a gLc;
  private com.tencent.mm.plugin.address.c.b gLd;
  private View gLe;
  private TextView gLf;
  private com.tencent.mm.a.p gLg;
  private boolean gLh;
  private boolean gLi;
  private com.tencent.mm.ui.widget.a.c gLj;
  private Object lockObj;

  public WalletSelectAddrUI()
  {
    AppMethodBeat.i(16994);
    this.gLa = new LinkedList();
    this.gLd = null;
    this.gLf = null;
    this.lockObj = new Object();
    this.gJy = false;
    this.gLh = false;
    this.gLi = false;
    this.gLj = null;
    AppMethodBeat.o(16994);
  }

  private void asc()
  {
    AppMethodBeat.i(16998);
    synchronized (this.lockObj)
    {
      com.tencent.mm.plugin.address.a.a.arQ();
      this.gLa = com.tencent.mm.plugin.address.a.a.arS().gIQ.gIY;
      this.gLc.items = this.gLa;
      this.gLa.size();
      this.gLe.setVisibility(8);
      this.gLc.notifyDataSetChanged();
      AppMethodBeat.o(16998);
      return;
    }
  }

  private void asj()
  {
    AppMethodBeat.i(17002);
    ki localki = new ki();
    localki.cFO.czX = this;
    localki.cFO.cFQ = new WalletSelectAddrUI.9(this, localki);
    com.tencent.mm.sdk.b.a.xxA.a(localki, Looper.myLooper());
    AppMethodBeat.o(17002);
  }

  private void bn(String paramString1, String paramString2)
  {
    AppMethodBeat.i(17001);
    paramString1 = new d(paramString1, paramString2, this.gLg);
    this.gLd.g(paramString1);
    AppMethodBeat.o(17001);
  }

  private void nj(int paramInt)
  {
    AppMethodBeat.i(17003);
    Intent localIntent = new Intent();
    localIntent.setClass(this, WalletAddAddressUI.class);
    localIntent.putExtra("address_id", paramInt);
    startActivity(localIntent);
    AppMethodBeat.o(17003);
  }

  public final void d(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17000);
    this.gLd.onSceneEnd(paramInt1, paramInt2, paramString, paramm);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramm.getType() == 417)
      {
        if (((e)paramm).gIJ)
        {
          asc();
          this.mController.contentView.setVisibility(0);
          if ((this.gJy) && (this.gLa.size() == 0))
          {
            paramString = new Intent();
            paramString.setClass(this, WalletAddAddressUI.class);
            startActivityForResult(paramString, 1);
          }
        }
        AppMethodBeat.o(17000);
      }
    while (true)
    {
      return;
      if (paramm.getType() == 416)
      {
        paramString = (f)paramm;
        com.tencent.mm.plugin.address.a.a.arQ();
        paramString = com.tencent.mm.plugin.address.a.a.arS().ne(paramString.gIK);
        if (paramString != null)
        {
          com.tencent.mm.plugin.address.a.a.arQ();
          ab.d("MicroMsg.WalletSelectAddrUI", "delte addr ".concat(String.valueOf(com.tencent.mm.plugin.address.a.a.arS().a(paramString))));
        }
        asc();
        AppMethodBeat.o(17000);
      }
      else if (paramm.getType() == 419)
      {
        if (this.gLb != null)
        {
          setResult(-1, com.tencent.mm.plugin.address.e.a.b(this.gLb));
          finish();
          AppMethodBeat.o(17000);
        }
      }
      else if (paramm.getType() == 582)
      {
        paramString = getString(2131296492);
        switch (((d)paramm).status)
        {
        default:
        case 1:
        case 2:
        case 0:
          while (true)
          {
            if (this.gLj != null)
              this.gLj.dismiss();
            this.gLj = h.a(this, paramString, null, true, null);
            AppMethodBeat.o(17000);
            break;
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(196657, Boolean.TRUE);
            this.gLf.setVisibility(8);
            paramString = getString(2131296493);
            continue;
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(196657, Boolean.TRUE);
            this.gLf.setVisibility(8);
            asc();
            this.mController.contentView.setVisibility(0);
            paramString = getString(2131296494);
          }
        case 3:
        }
        asj();
        AppMethodBeat.o(17000);
        continue;
        if ((paramm.getType() == 419) && (paramInt2 == -3103))
          h.a(this, true, paramString, "", getString(2131296439), getString(2131296868), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(16988);
              paramAnonymousDialogInterface.dismiss();
              WalletSelectAddrUI.a(WalletSelectAddrUI.this, WalletSelectAddrUI.g(WalletSelectAddrUI.this).id);
              AppMethodBeat.o(16988);
            }
          }
          , new WalletSelectAddrUI.2(this));
      }
      else
      {
        AppMethodBeat.o(17000);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130971042;
  }

  public final void initView()
  {
    AppMethodBeat.i(16999);
    this.gLf = ((TextView)findViewById(2131828590));
    this.gLf.setVisibility(8);
    this.gLf.setOnClickListener(new WalletSelectAddrUI.3(this));
    this.gKd = ((ListView)findViewById(2131828588));
    this.gLc = new WalletSelectAddrUI.a(this, this);
    this.gLe = findViewById(2131828589);
    this.gLe.findViewById(2131828586).setVisibility(8);
    ((TextView)this.gLe.findViewById(2131828585)).setText(2131296433);
    this.gKd.setAdapter(this.gLc);
    this.gKd.setOnItemClickListener(new WalletSelectAddrUI.4(this));
    this.gKd.setOnItemLongClickListener(new WalletSelectAddrUI.5(this));
    asc();
    this.gLe.setOnClickListener(new WalletSelectAddrUI.6(this));
    this.gLc.notifyDataSetChanged();
    setBackBtn(new WalletSelectAddrUI.7(this));
    addIconOptionMenu(0, 2131296435, 2131230736, new WalletSelectAddrUI.8(this));
    AppMethodBeat.o(16999);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(17004);
    if (paramInt1 == 1)
    {
      if (-1 != paramInt2)
        break label162;
      if (paramIntent != null)
        break label51;
      ab.e("MicroMsg.AddrUtil", "intent == null");
      paramIntent = null;
      setResult(-1, com.tencent.mm.plugin.address.e.a.b(paramIntent));
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(17004);
      return;
      label51: com.tencent.mm.plugin.address.d.b localb = new com.tencent.mm.plugin.address.d.b();
      localb.gJh = paramIntent.getStringExtra("nationalCode");
      localb.gJf = paramIntent.getStringExtra("userName");
      localb.gJg = paramIntent.getStringExtra("telNumber");
      localb.gJd = paramIntent.getStringExtra("addressPostalCode");
      localb.gJa = paramIntent.getStringExtra("proviceFirstStageName");
      localb.gJb = paramIntent.getStringExtra("addressCitySecondStageName");
      localb.gJc = paramIntent.getStringExtra("addressCountiesThirdStageName");
      localb.gJe = paramIntent.getStringExtra("addressDetailInfo");
      paramIntent = localb;
      break;
      label162: setResult(0);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(16995);
    super.onCreate(paramBundle);
    this.gLd = new com.tencent.mm.plugin.address.c.b(this, this);
    paramBundle = getIntent();
    this.gLh = paramBundle.getBooleanExtra("launch_from_appbrand", false);
    this.gLi = paramBundle.getBooleanExtra("launch_from_remittance", false);
    if ((paramBundle.getBooleanExtra("launch_from_webview", false)) || (this.gLh))
    {
      this.gJy = true;
      this.mController.contentView.setVisibility(8);
      if (this.gLh)
        getWindow().setBackgroundDrawableResource(2131690304);
      ab.i("MicroMsg.WalletSelectAddrUI", "showDisclaimerDailog()");
      aw.ZK();
      if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xOJ, Boolean.TRUE)).booleanValue())
      {
        ab.i("MicroMsg.WalletSelectAddrUI", "isShowDisclaimerDialog");
        h.a(this, getString(2131296479), getString(2131296480), getString(2131296322), new WalletSelectAddrUI.1(this));
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xOJ, Boolean.FALSE);
      }
    }
    setMMTitle(2131296478);
    this.gLd.nf(417);
    this.gLd.nf(416);
    this.gLd.nf(419);
    this.gLd.nf(582);
    paramBundle = new e(paramBundle.getStringExtra("req_url"), paramBundle.getStringExtra("req_app_id"), 2);
    this.gLd.g(paramBundle);
    aw.ZK();
    this.gLg = new com.tencent.mm.a.p(bo.a((Integer)com.tencent.mm.model.c.Ry().get(9, null), 0));
    initView();
    aw.ZK();
    if (com.tencent.mm.model.c.isSDCardAvailable())
    {
      paramBundle = new k(12);
      aw.Rg().a(paramBundle, 0);
    }
    AppMethodBeat.o(16995);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(16996);
    super.onDestroy();
    this.gLd.ng(417);
    this.gLd.ng(416);
    this.gLd.ng(419);
    this.gLd.ng(582);
    AppMethodBeat.o(16996);
  }

  public void onResume()
  {
    AppMethodBeat.i(16997);
    super.onResume();
    asc();
    AppMethodBeat.o(16997);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI
 * JD-Core Version:    0.6.2
 */