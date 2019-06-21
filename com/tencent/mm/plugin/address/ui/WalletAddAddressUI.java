package com.tencent.mm.plugin.address.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.plugin.address.model.RcptItem;
import com.tencent.mm.plugin.address.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WalletAddAddressUI extends MMActivity
  implements f, AddrEditView.b
{
  private String cJo;
  private Dialog gII;
  private int gJi;
  private AddrEditView gKO;
  private AddrEditView gKP;
  private AddrEditView gKQ;
  private AddrEditView gKR;
  private AddrEditView gKS;
  private com.tencent.mm.plugin.address.d.b gKT;
  private com.tencent.mm.plugin.address.d.b gKU;

  public WalletAddAddressUI()
  {
    AppMethodBeat.i(16944);
    this.gJi = 0;
    this.gKT = null;
    this.gKU = new com.tencent.mm.plugin.address.d.b();
    this.gII = null;
    this.cJo = "";
    AppMethodBeat.o(16944);
  }

  private static void a(com.tencent.mm.plugin.address.d.b paramb1, com.tencent.mm.plugin.address.d.b paramb2)
  {
    if ((paramb1 != null) && (paramb2 != null))
    {
      paramb2.id = paramb1.id;
      paramb2.gJa = paramb1.gJa;
      paramb2.gJb = paramb1.gJb;
      paramb2.gJc = paramb1.gJc;
      paramb2.gJe = paramb1.gJe;
      paramb2.gJf = paramb1.gJf;
      paramb2.gJg = paramb1.gJg;
      paramb2.gJd = paramb1.gJd;
      paramb2.gJh = paramb1.gJh;
    }
  }

  private boolean arW()
  {
    boolean bool1 = false;
    AppMethodBeat.i(16950);
    boolean bool2 = true;
    if (!this.gKO.asa())
      bool2 = false;
    if (!this.gKQ.asa())
      bool2 = false;
    if (!this.gKP.asa())
      bool2 = false;
    if (!this.gKR.asa())
      bool2 = false;
    if (!this.gKS.asa())
      bool2 = bool1;
    while (true)
    {
      enableOptionMenu(bool2);
      AppMethodBeat.o(16950);
      return bool2;
    }
  }

  private void arY()
  {
    int i = 1;
    AppMethodBeat.i(16953);
    int j = 2131296438;
    if (this.gJi == 0)
      j = 2131296437;
    if (this.gKO.asb());
    for (int k = 1; ; k = 0)
    {
      if (this.gKQ.asb())
        k = 1;
      if (this.gKP.asb())
        k = 1;
      if (this.gKR.asb())
        k = 1;
      if (this.gKS.asb())
        k = i;
      while (true)
      {
        if (k != 0)
        {
          h.a(this, j, 2131297061, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(16943);
              WalletAddAddressUI.this.setResult(0);
              WalletAddAddressUI.this.finish();
              AppMethodBeat.o(16943);
            }
          }
          , null);
          AppMethodBeat.o(16953);
        }
        while (true)
        {
          return;
          setResult(0);
          finish();
          AppMethodBeat.o(16953);
        }
      }
    }
  }

  private void asf()
  {
    AppMethodBeat.i(16954);
    Intent localIntent = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
    if (bo.k(this, localIntent))
    {
      startActivityForResult(localIntent, 2);
      AppMethodBeat.o(16954);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.WalletAddAddressUI", "intent not available");
      AppMethodBeat.o(16954);
    }
  }

  private void asg()
  {
    AppMethodBeat.i(16955);
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(this.gKP.getText()))
      localStringBuilder.append(this.gKP.getText());
    if (!TextUtils.isEmpty(this.gKQ.getText()))
      localStringBuilder.append(this.gKQ.getText());
    Intent localIntent = new Intent();
    localIntent.putExtra("wallet_address", localStringBuilder.toString());
    localIntent.putExtra("map_view_type", 8);
    d.b(this, "location", ".ui.RedirectUI", localIntent, 3);
    AppMethodBeat.o(16955);
  }

  public final void arX()
  {
    AppMethodBeat.i(16951);
    arW();
    AppMethodBeat.o(16951);
  }

  public final int getLayoutId()
  {
    return 2130971039;
  }

  public final void initView()
  {
    AppMethodBeat.i(16946);
    com.tencent.mm.plugin.address.a.a.arS().arT();
    Object localObject = (MMScrollView)findViewById(2131823366);
    ((MMScrollView)localObject).a((ViewGroup)localObject, (View.OnFocusChangeListener)localObject);
    this.gKO = ((AddrEditView)findViewById(2131828580));
    this.gKP = ((AddrEditView)findViewById(2131828582));
    this.gKQ = ((AddrEditView)findViewById(2131828583));
    this.gKR = ((AddrEditView)findViewById(2131828584));
    this.gKS = ((AddrEditView)findViewById(2131828581));
    this.gKO.setOnInputValidChangeListener(this);
    this.gKP.setOnInputValidChangeListener(this);
    this.gKQ.setOnInputValidChangeListener(this);
    this.gKR.setOnInputValidChangeListener(this);
    this.gKS.setOnInputValidChangeListener(this);
    this.gKO.setInfoIvOnClickListener(new WalletAddAddressUI.1(this));
    this.gKP.setInfoIvOnClickListener(new AddrEditView.a()
    {
      public final void onClick()
      {
        AppMethodBeat.i(16937);
        boolean bool = com.tencent.mm.pluginsdk.permission.b.a(WalletAddAddressUI.this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
        ab.i("MicroMsg.WalletAddAddressUI", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
          AppMethodBeat.o(16937);
        while (true)
        {
          return;
          WalletAddAddressUI.b(WalletAddAddressUI.this);
          AppMethodBeat.o(16937);
        }
      }
    });
    this.gKP.setOnClickListener(new WalletAddAddressUI.9(this));
    if (this.gJi != 0)
    {
      this.gKT = com.tencent.mm.plugin.address.a.a.arS().ne(this.gJi);
      this.gKO.setValStr(this.gKT.gJf);
      localObject = new StringBuilder();
      if (!TextUtils.isEmpty(this.gKT.gJa))
        ((StringBuilder)localObject).append(this.gKT.gJa);
      if (!TextUtils.isEmpty(this.gKT.gJb))
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.gKT.gJb);
      }
      if (!TextUtils.isEmpty(this.gKT.gJc))
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.gKT.gJc);
      }
      this.gKP.setValStr(((StringBuilder)localObject).toString());
      this.gKQ.setValStr(this.gKT.gJe);
      this.gKR.setValStr(this.gKT.gJd);
      this.gKS.setValStr(this.gKT.gJg);
    }
    setBackBtn(new WalletAddAddressUI.10(this));
    a(0, getString(2131297038), new WalletAddAddressUI.11(this), q.b.ymu);
    arW();
    AppMethodBeat.o(16946);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(16948);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(16948);
      Object localObject;
      while (true)
      {
        return;
        if (paramInt2 != -1)
          break;
        localObject = paramIntent.getStringExtra("karea_result");
        if (!bo.isNullOrNil((String)localObject))
        {
          ab.d("MicroMsg.WalletAddAddressUI", "AREA_RESULT:".concat(String.valueOf(localObject)));
          this.gKP.setValStr((String)localObject);
        }
        localObject = paramIntent.getStringExtra("kpost_code");
        if (!bo.isNullOrNil((String)localObject))
        {
          ab.d("MicroMsg.WalletAddAddressUI", "post:".concat(String.valueOf(localObject)));
          this.gKR.setValStr((String)localObject);
        }
        this.cJo = paramIntent.getStringExtra("kwcode");
        AppMethodBeat.o(16948);
        continue;
        if (paramInt2 != -1)
          break;
        paramIntent = paramIntent.getData();
        if (paramIntent == null)
        {
          ab.d("MicroMsg.WalletAddAddressUI", "uri == null");
          AppMethodBeat.o(16948);
        }
        else
        {
          paramIntent = com.tencent.mm.pluginsdk.a.f(getBaseContext(), paramIntent);
          if ((paramIntent != null) && (paramIntent.length == 2))
            localObject = paramIntent[0];
          for (paramIntent = paramIntent[1]; ; paramIntent = null)
          {
            this.gKO.setValStr((String)localObject);
            this.gKS.setValStr(paramIntent);
            if (!PhoneNumberUtils.isGlobalPhoneNumber(paramIntent))
              break label268;
            arW();
            AppMethodBeat.o(16948);
            break;
            h.b(this, getString(2131296495), "", true);
            localObject = null;
          }
          label268: h.b(this, getString(2131296495), "", true);
          AppMethodBeat.o(16948);
        }
      }
      if (paramInt2 == -1)
      {
        paramIntent = (Addr)paramIntent.getParcelableExtra("key_pick_addr");
        if (paramIntent != null)
        {
          ab.d("MicroMsg.WalletAddAddressUI", "addr: " + paramIntent.toString());
          if (paramIntent != null)
          {
            if (!com.tencent.mm.plugin.address.a.a.arS().z(paramIntent.fBh, paramIntent.fBj, paramIntent.fBk))
              break label621;
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append(paramIntent.fBh);
            ((StringBuilder)localObject).append(" ");
            ((StringBuilder)localObject).append(paramIntent.fBj);
            if (!TextUtils.isEmpty(paramIntent.fBk))
            {
              ((StringBuilder)localObject).append(" ");
              ((StringBuilder)localObject).append(paramIntent.fBk);
            }
            this.gKP.setValStr(((StringBuilder)localObject).toString());
            label441: localObject = new StringBuilder();
            if (!TextUtils.isEmpty(paramIntent.fBl))
              ((StringBuilder)localObject).append(paramIntent.fBl);
            if (!TextUtils.isEmpty(paramIntent.fBm))
              ((StringBuilder)localObject).append(paramIntent.fBm);
            if (!TextUtils.isEmpty(paramIntent.fBn))
              ((StringBuilder)localObject).append(paramIntent.fBn);
            if (!TextUtils.isEmpty(paramIntent.fBp))
            {
              ((StringBuilder)localObject).append(" ");
              ((StringBuilder)localObject).append(paramIntent.fBp);
            }
            if ((!bo.isNullOrNil(paramIntent.fBp)) || (bo.isNullOrNil(paramIntent.fBg)))
              break label633;
            this.gKQ.setValStr(paramIntent.fBg);
          }
        }
        while (true)
        {
          paramIntent = com.tencent.mm.plugin.address.a.a.arS().y(paramIntent.fBh, paramIntent.fBj, paramIntent.fBk);
          if (paramIntent != null)
          {
            this.gKR.setValStr(paramIntent.gIO);
            this.cJo = paramIntent.code;
          }
          AppMethodBeat.o(16948);
          break;
          label621: this.gKP.setValStr("");
          break label441;
          label633: this.gKQ.setValStr(((StringBuilder)localObject).toString());
        }
      }
      ab.i("MicroMsg.WalletAddAddressUI", "MallRecharge pay result : cancel");
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(16945);
    super.onCreate(paramBundle);
    aw.Rg().a(415, this);
    aw.Rg().a(418, this);
    ab.d("MicroMsg.WalletAddAddressUI", "index Oncreate");
    ab.LZ(0);
    this.gJi = getIntent().getIntExtra("address_id", 0);
    if (this.gJi == 0)
      setMMTitle(2131296435);
    while (true)
    {
      initView();
      AppMethodBeat.o(16945);
      return;
      setMMTitle(2131296464);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(16947);
    super.onDestroy();
    aw.Rg().b(415, this);
    aw.Rg().b(418, this);
    l locall = com.tencent.mm.plugin.address.a.a.arS();
    ab.i("MicroMsg.WalletAddrMgr", "clean data");
    Iterator localIterator = locall.gIS.values().iterator();
    while (localIterator.hasNext())
      ((List)localIterator.next()).clear();
    localIterator = locall.gIT.values().iterator();
    while (localIterator.hasNext())
      ((List)localIterator.next()).clear();
    locall.gIR.clear();
    locall.gIS.clear();
    locall.gIT.clear();
    AppMethodBeat.o(16947);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(16952);
    boolean bool;
    if (paramInt == 4)
    {
      arY();
      bool = true;
      AppMethodBeat.o(16952);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(16952);
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(16956);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.WalletAddAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(16956);
      return;
    }
    ab.i("MicroMsg.WalletAddAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(16956);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        asf();
        AppMethodBeat.o(16956);
        break;
      }
      h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131297773), false, new WalletAddAddressUI.4(this), new WalletAddAddressUI.5(this));
      AppMethodBeat.o(16956);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        asg();
        AppMethodBeat.o(16956);
        break;
      }
      h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new WalletAddAddressUI.6(this), new WalletAddAddressUI.7(this));
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(16949);
    if (this.gII != null)
      this.gII.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = com.tencent.mm.plugin.address.a.a.arS().gIQ;
      if (paramString.gIY.size() > 0)
      {
        a(this.gKU, this.gKT);
        paramString = (com.tencent.mm.plugin.address.d.b)paramString.gIY.getFirst();
        if (paramString != null)
        {
          setResult(-1, com.tencent.mm.plugin.address.e.a.b(paramString));
          finish();
          AppMethodBeat.o(16949);
        }
      }
    }
    while (true)
    {
      return;
      setResult(0);
      break;
      setResult(0);
      break;
      switch (paramInt2)
      {
      case -3101:
      default:
        h.a(this, 2131296432, 0, false, new WalletAddAddressUI.14(this));
        AppMethodBeat.o(16949);
        break;
      case -3100:
        h.a(this, 2131296434, 0, false, new WalletAddAddressUI.12(this));
        AppMethodBeat.o(16949);
        break;
      case -3104:
      case -3103:
      case -3102:
        h.a(this, paramString, "", new WalletAddAddressUI.13(this));
        AppMethodBeat.o(16949);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletAddAddressUI
 * JD-Core Version:    0.6.2
 */