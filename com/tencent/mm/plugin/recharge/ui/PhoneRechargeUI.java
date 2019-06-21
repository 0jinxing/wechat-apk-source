package com.tencent.mm.plugin.recharge.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.telephony.PhoneNumberUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.recharge.ui.form.InstantAutoCompleteTextView;
import com.tencent.mm.plugin.recharge.ui.form.MallFormView;
import com.tencent.mm.plugin.recharge.ui.form.c.b;
import com.tencent.mm.plugin.recharge.ui.form.c.b.1;
import com.tencent.mm.plugin.recharge.ui.form.c.b.2;
import com.tencent.mm.plugin.recharge.ui.form.c.b.3;
import com.tencent.mm.plugin.recharge.ui.form.c.b.4;
import com.tencent.mm.plugin.recharge.ui.form.c.b.5;
import com.tencent.mm.plugin.recharge.ui.form.d;
import com.tencent.mm.plugin.recharge.ui.form.d.a;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.v;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhoneRechargeUI extends MMActivity
  implements com.tencent.mm.ai.f, d.a
{
  private String aIm;
  private String desc;
  private int errCode;
  protected Dialog gII;
  private String mAppId;
  private View pGT;
  private ImageView pGU;
  private TextView pGV;
  private MallFormView pGW;
  private TextView pGX;
  private TextView pGY;
  private GridView pGZ;
  private ArrayList<com.tencent.mm.plugin.wallet.a.q> pGh;
  private ArrayList<com.tencent.mm.plugin.wallet.a.q> pGi;
  private com.tencent.mm.plugin.wallet.a.e pGj;
  private com.tencent.mm.plugin.wallet.a.e pGk;
  private com.tencent.mm.plugin.wallet.a.e pGl;
  private com.tencent.mm.plugin.wallet.a.e pGm;
  private com.tencent.mm.plugin.wallet.a.e pGn;
  private GridView pHa;
  private TextView pHb;
  private TextView pHc;
  private TextView pHd;
  private TextView pHe;
  private TextView pHf;
  private TextView pHg;
  private b pHh;
  private b pHi;
  private MallFunction pHj;
  private String pHk;
  private int pHl;
  private String pHm;
  private String pHn;
  private c.b pHo;
  private com.tencent.mm.plugin.wallet.a.p pHp;
  private boolean pHq;
  private List<String[]> pHr;
  private boolean piJ;
  private com.tencent.mm.sdk.b.c piM;

  public PhoneRechargeUI()
  {
    AppMethodBeat.i(44276);
    this.pGT = null;
    this.pGU = null;
    this.pGV = null;
    this.pGW = null;
    this.pGX = null;
    this.pGY = null;
    this.pGZ = null;
    this.pHa = null;
    this.pHb = null;
    this.pHc = null;
    this.pHd = null;
    this.pHe = null;
    this.pHf = null;
    this.pHg = null;
    this.pHh = null;
    this.pHi = null;
    this.gII = null;
    this.pHj = null;
    this.mAppId = "";
    this.pGh = null;
    this.pGi = null;
    this.pGj = null;
    this.pGk = null;
    this.pGl = null;
    this.pGm = null;
    this.pGn = null;
    this.errCode = 0;
    this.aIm = "";
    this.pHk = "";
    this.desc = "";
    this.pHm = "";
    this.pHn = "";
    this.piJ = false;
    this.pHo = null;
    this.pHp = null;
    this.pHq = false;
    this.piM = new PhoneRechargeUI.14(this);
    AppMethodBeat.o(44276);
  }

  private void G(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(44285);
    label103: String str;
    if ((this.pHp != null) && (!cei()))
    {
      this.pGT.setVisibility(0);
      this.pGV.setText(this.pHp.name);
      ab.d("MicroMsg.PhoneRechargeUI", "hy: Show banner!");
      com.tencent.mm.protocal.g.gu(6, 0);
      this.pHh.pGL = this.pGh;
      this.pHh.notifyDataSetChanged();
      this.pHi.pGL = this.pGi;
      this.pHi.notifyDataSetChanged();
      if (paramBoolean1)
        break label414;
      this.pHf.setVisibility(8);
      this.pHg.setVisibility(8);
      if (paramBoolean2)
        addTextOptionMenu(0, this.pGn.name, new PhoneRechargeUI.3(this));
      TextView localTextView = this.pGX;
      if ((this.pGh == null) || (this.pGh.size() <= 0) || (bo.isNullOrNil(((com.tencent.mm.plugin.wallet.a.q)this.pGh.get(0)).tnt)))
        break label459;
      str = ((com.tencent.mm.plugin.wallet.a.q)this.pGh.get(0)).tnt;
      label194: localTextView.setText(str);
      localTextView = this.pGY;
      if ((this.pGi == null) || (this.pGi.size() <= 0) || (bo.isNullOrNil(((com.tencent.mm.plugin.wallet.a.q)this.pGi.get(0)).tnt)))
        break label471;
      str = ((com.tencent.mm.plugin.wallet.a.q)this.pGi.get(0)).tnt;
      label258: localTextView.setText(str);
      if ((this.pGm != null) && (!bo.isNullOrNil(this.pGm.name)))
        break label483;
      this.pHc.setVisibility(8);
      label293: if ((this.pGj != null) && (!bo.isNullOrNil(this.pGj.name)))
        break label523;
      this.pHb.setVisibility(8);
      label322: if ((this.pGk != null) && (!bo.isNullOrNil(this.pGk.name)))
        break label563;
      this.pHd.setVisibility(8);
      label351: if ((this.pGl != null) && (!bo.isNullOrNil(this.pGl.name)))
        break label603;
      this.pHe.setVisibility(8);
    }
    while (true)
    {
      d(this.pHj);
      AppMethodBeat.o(44285);
      return;
      this.pGT.setVisibility(8);
      ab.d("MicroMsg.PhoneRechargeUI", "hy: dismiss banner!");
      break;
      label414: if (cek())
        this.pHf.setVisibility(0);
      while (true)
      {
        if (!cej())
          break label457;
        this.pHg.setVisibility(0);
        break;
        this.pHf.setVisibility(8);
      }
      label457: break label103;
      label459: str = getString(2131305273);
      break label194;
      label471: str = getString(2131305274);
      break label258;
      label483: this.pHc.setVisibility(0);
      this.pHc.setText(this.pGm.name);
      this.pHc.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(44255);
          if (!PhoneRechargeUI.a(PhoneRechargeUI.this, PhoneRechargeUI.j(PhoneRechargeUI.this).tmN, PhoneRechargeUI.j(PhoneRechargeUI.this).fjD))
          {
            paramAnonymousView = PhoneRechargeUI.b(PhoneRechargeUI.this, PhoneRechargeUI.j(PhoneRechargeUI.this).url);
            ab.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
            PhoneRechargeUI.c(PhoneRechargeUI.this, paramAnonymousView);
          }
          AppMethodBeat.o(44255);
        }
      });
      break label293;
      label523: this.pHb.setVisibility(0);
      this.pHb.setText(this.pGj.name);
      this.pHb.setOnClickListener(new PhoneRechargeUI.5(this));
      break label322;
      label563: this.pHd.setVisibility(0);
      this.pHd.setText(this.pGk.name);
      this.pHd.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(44257);
          if (!PhoneRechargeUI.a(PhoneRechargeUI.this, PhoneRechargeUI.l(PhoneRechargeUI.this).tmN, PhoneRechargeUI.l(PhoneRechargeUI.this).fjD))
          {
            paramAnonymousView = PhoneRechargeUI.b(PhoneRechargeUI.this, PhoneRechargeUI.l(PhoneRechargeUI.this).url);
            ab.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
            PhoneRechargeUI.c(PhoneRechargeUI.this, paramAnonymousView);
          }
          AppMethodBeat.o(44257);
        }
      });
      break label351;
      label603: this.pHe.setVisibility(0);
      this.pHe.setText(this.pGl.name);
      this.pHe.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(44258);
          if (!PhoneRechargeUI.a(PhoneRechargeUI.this, PhoneRechargeUI.m(PhoneRechargeUI.this).tmN, PhoneRechargeUI.m(PhoneRechargeUI.this).fjD))
          {
            paramAnonymousView = PhoneRechargeUI.b(PhoneRechargeUI.this, PhoneRechargeUI.m(PhoneRechargeUI.this).url);
            ab.d("MicroMsg.PhoneRechargeUI", "go to h5: %s", new Object[] { paramAnonymousView });
            PhoneRechargeUI.c(PhoneRechargeUI.this, paramAnonymousView);
          }
          AppMethodBeat.o(44258);
        }
      });
    }
  }

  private String VC(String paramString)
  {
    AppMethodBeat.i(44279);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(44279);
    }
    while (true)
    {
      return paramString;
      Object localObject1 = "";
      Object localObject2 = localObject1;
      String str1 = paramString;
      try
      {
        if (this.pHo != null)
        {
          localObject2 = localObject1;
          str1 = paramString;
          if (this.pHo.pGx != null)
          {
            localObject2 = localObject1;
            str1 = paramString;
            if (!bo.isNullOrNil(this.pHo.pGx.name))
            {
              str1 = paramString;
              localObject2 = this.pHo.pGx.name;
            }
          }
        }
        localObject1 = localObject2;
        str1 = paramString;
        if (((String)localObject2).equals(getString(2131305280)))
          localObject1 = "WeChatAccountBindNumber";
        str1 = paramString;
        String str2 = this.pGW.getText();
        str1 = paramString;
        localObject2 = URLEncoder.encode(URLEncoder.encode((String)localObject1, "utf-8"), "utf-8");
        str1 = paramString;
        if (!paramString.startsWith("http://"))
        {
          str1 = paramString;
          if (!paramString.startsWith("https://"));
        }
        else
        {
          str1 = paramString;
          ab.i("MicroMsg.PhoneRechargeUI", "new url");
          str1 = paramString;
          if (paramString.indexOf("%7Bphone%7D") > 0)
          {
            str1 = paramString;
            paramString = paramString.replace("%7Bphone%7D", str2);
            label204: str1 = paramString;
            if (paramString.indexOf("%7Bremark%7D") <= 0)
              break label254;
            str1 = paramString;
          }
          for (paramString = paramString.replace("%7Bremark%7D", (CharSequence)localObject2); ; paramString = paramString.replace("{remark}", (CharSequence)localObject2))
          {
            AppMethodBeat.o(44279);
            break;
            str1 = paramString;
            paramString = paramString.replace("{phone}", str2);
            break label204;
            label254: str1 = paramString;
          }
        }
        str1 = paramString;
        ab.i("MicroMsg.PhoneRechargeUI", "old url");
        str1 = paramString;
        String str3 = URLDecoder.decode(paramString, "utf-8");
        str1 = paramString;
        localObject1 = new java/lang/StringBuilder;
        str1 = paramString;
        ((StringBuilder)localObject1).<init>();
        str1 = paramString;
        paramString = str3 + String.format("?phone=%s&remark=%s", new Object[] { str2, localObject2 });
        AppMethodBeat.o(44279);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        paramString = str1;
        ab.printErrStackTrace("MicroMsg.PhoneRechargeUI", localUnsupportedEncodingException, "", new Object[0]);
        AppMethodBeat.o(44279);
      }
    }
  }

  private void VD(String paramString)
  {
    AppMethodBeat.i(44289);
    View localView = v.hu(this).inflate(2130970479, null);
    com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131305289), localView, getString(2131305290), getString(2131305288), new PhoneRechargeUI.8(this, paramString), new PhoneRechargeUI.9(this));
    AppMethodBeat.o(44289);
  }

  private void VE(String paramString)
  {
    AppMethodBeat.i(44291);
    com.tencent.mm.ui.base.h.a(this, paramString, "", false, new PhoneRechargeUI.10(this));
    AppMethodBeat.o(44291);
  }

  private void c(final m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(44282);
    if ((this.gII == null) || ((this.gII != null) && (!this.gII.isShowing())))
      if (!paramBoolean)
        break label74;
    label74: for (this.gII = com.tencent.mm.wallet_core.ui.g.a(this.mController.ylL, true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(44275);
        com.tencent.mm.kernel.g.Rg().c(paramm);
        AppMethodBeat.o(44275);
      }
    }); ; this.gII = com.tencent.mm.wallet_core.ui.g.b(this.mController.ylL, true, new PhoneRechargeUI.2(this, paramm)))
    {
      com.tencent.mm.kernel.g.Rg().a(paramm, 0);
      AppMethodBeat.o(44282);
      return;
    }
  }

  private void ceh()
  {
    AppMethodBeat.i(44277);
    this.mAppId = "";
    cel();
    this.errCode = 0;
    this.aIm = "";
    this.desc = "";
    AppMethodBeat.o(44277);
  }

  private boolean cei()
  {
    AppMethodBeat.i(44280);
    int j;
    boolean bool;
    if (this.pHp != null)
    {
      String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJV, "");
      if (!bo.isNullOrNil(str))
      {
        String[] arrayOfString = str.split(";");
        if (arrayOfString != null)
        {
          int i = arrayOfString.length;
          j = 0;
          if (j < i)
          {
            str = arrayOfString[j];
            if ((str != null) && (str.equals(String.valueOf(this.pHp.id))))
            {
              ab.i("MicroMsg.PhoneRechargeUI", "hy: found closed. ");
              AppMethodBeat.o(44280);
              bool = true;
            }
          }
        }
      }
    }
    while (true)
    {
      return bool;
      j++;
      break;
      ab.i("MicroMsg.PhoneRechargeUI", "hy: not found closed banner.");
      AppMethodBeat.o(44280);
      bool = false;
      continue;
      ab.i("MicroMsg.PhoneRechargeUI", "hy: no banner before, show");
      AppMethodBeat.o(44280);
      bool = false;
      continue;
      ab.e("MicroMsg.PhoneRechargeUI", "hy: no banner");
      AppMethodBeat.o(44280);
      bool = true;
    }
  }

  private boolean cej()
  {
    AppMethodBeat.i(44286);
    Iterator localIterator = this.pGi.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (((com.tencent.mm.plugin.wallet.a.q)localIterator.next()).status != 0)
      {
        bool = false;
        AppMethodBeat.o(44286);
      }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(44286);
    }
  }

  private boolean cek()
  {
    AppMethodBeat.i(44287);
    Iterator localIterator = this.pGh.iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (((com.tencent.mm.plugin.wallet.a.q)localIterator.next()).status != 0)
      {
        bool = false;
        AppMethodBeat.o(44287);
      }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(44287);
    }
  }

  private void cel()
  {
    AppMethodBeat.i(44290);
    this.pGh = new ArrayList();
    com.tencent.mm.plugin.wallet.a.q localq1 = new com.tencent.mm.plugin.wallet.a.q();
    localq1.name = getString(2131305263);
    localq1.status = 0;
    com.tencent.mm.plugin.wallet.a.q localq2 = new com.tencent.mm.plugin.wallet.a.q();
    localq2.name = getString(2131305264);
    localq2.status = 0;
    com.tencent.mm.plugin.wallet.a.q localq3 = new com.tencent.mm.plugin.wallet.a.q();
    localq3.name = getString(2131305265);
    localq3.status = 0;
    com.tencent.mm.plugin.wallet.a.q localq4 = new com.tencent.mm.plugin.wallet.a.q();
    localq4.name = getString(2131305266);
    localq4.status = 0;
    com.tencent.mm.plugin.wallet.a.q localq5 = new com.tencent.mm.plugin.wallet.a.q();
    localq5.name = getString(2131305267);
    localq5.status = 0;
    com.tencent.mm.plugin.wallet.a.q localq6 = new com.tencent.mm.plugin.wallet.a.q();
    localq6.name = getString(2131305268);
    localq6.status = 0;
    this.pGh.add(localq1);
    this.pGh.add(localq2);
    this.pGh.add(localq3);
    this.pGh.add(localq4);
    this.pGh.add(localq5);
    this.pGh.add(localq6);
    this.pGi = new ArrayList();
    localq2 = new com.tencent.mm.plugin.wallet.a.q();
    localq2.name = getString(2131305269);
    localq2.status = 0;
    localq4 = new com.tencent.mm.plugin.wallet.a.q();
    localq4.name = getString(2131305270);
    localq4.status = 0;
    localq5 = new com.tencent.mm.plugin.wallet.a.q();
    localq5.name = getString(2131305271);
    localq5.status = 0;
    this.pGi.add(localq2);
    this.pGi.add(localq4);
    this.pGi.add(localq5);
    AppMethodBeat.o(44290);
  }

  private void cem()
  {
    AppMethodBeat.i(44294);
    com.tencent.mm.kernel.g.Rg().a(new com.tencent.mm.plugin.recharge.model.f(this.pGW.getText()), 0);
    AppMethodBeat.o(44294);
  }

  private void d(MallFunction paramMallFunction)
  {
    AppMethodBeat.i(44288);
    if (com.tencent.mm.plugin.recharge.model.b.c(paramMallFunction))
    {
      com.tencent.mm.plugin.recharge.model.b.ced();
      ab.d("MicroMsg.PhoneRechargeUI", this.pHj.tDn.toString());
      VD(this.pHj.tDn.tDC);
    }
    AppMethodBeat.o(44288);
  }

  private void o(m paramm)
  {
    AppMethodBeat.i(44281);
    if ((this.gII != null) && (this.gII.isShowing()) && (paramm.getType() != 497))
    {
      this.gII.dismiss();
      this.gII = null;
    }
    AppMethodBeat.o(44281);
  }

  public final void cen()
  {
    AppMethodBeat.i(44295);
    com.tencent.mm.plugin.recharge.model.f localf = new com.tencent.mm.plugin.recharge.model.f("", 1);
    com.tencent.mm.kernel.g.Rg().a(localf, 0);
    AppMethodBeat.o(44295);
  }

  public final int getLayoutId()
  {
    return 2130970361;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(44293);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(44293);
      Object localObject1;
      Object localObject3;
      ArrayList localArrayList;
      while (true)
      {
        return;
        if (paramInt2 != -1)
          break;
        this.pHq = true;
        localObject1 = null;
        localObject3 = null;
        localArrayList = new ArrayList();
        localObject4 = paramIntent.getData();
        if (localObject4 == null)
        {
          ab.e("MicroMsg.PhoneRechargeUI", "hy: uri == null");
          AppMethodBeat.o(44293);
        }
        else
        {
          if (android.support.v4.content.b.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0)
            break label122;
          ab.e("MicroMsg.PhoneRechargeUI", "no contact permission");
          AppMethodBeat.o(44293);
        }
      }
      label122: Cursor localCursor1;
      Cursor localCursor2;
      try
      {
        localCursor1 = getContentResolver().query((Uri)localObject4, null, null, null, null);
        localObject4 = localObject1;
        if (localCursor1 == null)
          break label503;
        localObject4 = localObject1;
        if (localCursor1.getCount() <= 0)
          break label503;
        localCursor1.moveToFirst();
        int i = localCursor1.getColumnIndex("has_phone_number");
        if (i > 0)
        {
          localObject4 = localObject1;
          if (localCursor1.getInt(i) <= 0)
            break label503;
        }
        localObject1 = localCursor1.getString(localCursor1.getColumnIndex("_id"));
        localCursor2 = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ".concat(String.valueOf(localObject1)), null, null);
        localObject1 = localObject3;
        if (localCursor2 == null)
          break label483;
        localObject1 = localObject3;
        if (!localCursor2.moveToFirst())
          break label483;
        localObject1 = null;
        while (!localCursor2.isAfterLast())
        {
          int j = localCursor2.getColumnIndex("data1");
          i = localCursor2.getColumnIndex("display_name");
          localObject4 = localCursor2.getString(j);
          localObject1 = localCursor2.getString(i);
          ab.d("MicroMsg.PhoneRechargeUI", "hy: username : ".concat(String.valueOf(localObject1)));
          if (localObject4 != null)
          {
            ab.d("MicroMsg.PhoneRechargeUI", "hy: phoneNumber : ".concat(String.valueOf(localObject4)));
            localObject4 = com.tencent.mm.plugin.recharge.model.b.ws((String)localObject4);
            ab.d("MicroMsg.PhoneRechargeUI", "hy: phoneNumber : ".concat(String.valueOf(localObject4)));
            if ((PhoneNumberUtils.isGlobalPhoneNumber((String)localObject4)) && (((String)localObject4).length() == 11))
              localArrayList.add(localObject4);
            ab.d("MicroMsg.PhoneRechargeUI", "hy: phoneResult : ".concat(String.valueOf(localObject4)));
          }
          localCursor2.moveToNext();
        }
      }
      catch (SecurityException localSecurityException)
      {
        ab.e("MicroMsg.PhoneRechargeUI", "hy: permission denied: %s", new Object[] { localSecurityException.toString() });
        com.tencent.mm.ui.base.h.b(this, getString(2131301394), "", true);
      }
      continue;
      label483: Object localObject4 = localSecurityException;
      if (localCursor2 != null)
      {
        localCursor2.close();
        localObject4 = localSecurityException;
      }
      label503: if ((localCursor1 != null) && (!localCursor1.isClosed()))
        localCursor1.close();
      Object localObject2;
      if (localArrayList.size() > 1)
      {
        localObject2 = com.tencent.mm.ui.base.h.a(this, getString(2131305283), localArrayList, -1, new PhoneRechargeUI.13(this, localArrayList, (String)localObject4));
        if (localObject2 != null)
          ((com.tencent.mm.ui.widget.a.c)localObject2).setCanceledOnTouchOutside(true);
      }
      else if (localArrayList.size() == 1)
      {
        this.pHo.setInput(new com.tencent.mm.plugin.recharge.model.a((String)localArrayList.get(0), (String)localObject4, 1));
        cem();
      }
      else
      {
        com.tencent.mm.ui.base.h.b(this, getString(2131301392), "", true);
        continue;
        if (paramInt2 == -1)
        {
          if (!this.piJ)
          {
            ab.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : ok");
            localObject2 = new com.tencent.mm.plugin.recharge.model.a(this.pGW.getText(), this.pGW.getTipsTv().getText().toString(), 0);
            com.tencent.mm.plugin.recharge.a.a.cea().a((com.tencent.mm.plugin.recharge.model.a)localObject2);
            finish();
            this.piJ = true;
          }
        }
        else
          ab.i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : cancel");
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44278);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(this.mController.dyj());
    com.tencent.mm.kernel.g.Rg().a(1571, this);
    com.tencent.mm.kernel.g.Rg().a(498, this);
    this.pHj = ((MallFunction)getIntent().getParcelableExtra("key_func_info"));
    if (this.pHj == null)
    {
      ab.e("MicroMsg.PhoneRechargeUI", "hy: function info is null");
      t.makeText(this, "function info is null", 1).show();
      finish();
    }
    cel();
    setMMTitle(this.pHj.cOI);
    setBackBtn(new PhoneRechargeUI.1(this));
    this.pGn = new com.tencent.mm.plugin.wallet.a.e();
    this.pGn.name = getString(2131305276);
    this.pGn.url = getString(2131305277);
    this.pGT = findViewById(2131826525);
    this.pGU = ((ImageView)findViewById(2131826527));
    this.pGV = ((TextView)findViewById(2131826526));
    this.pGW = ((MallFormView)findViewById(2131826529));
    com.tencent.mm.plugin.recharge.ui.form.c.b(this.pGW);
    this.pHo = new c.b(this.pGW);
    paramBundle = this.pHo;
    ab.d(com.tencent.mm.plugin.recharge.ui.form.c.access$100(), "hy: setMobileEditTv");
    MallFormView localMallFormView = paramBundle.pIg;
    Object localObject = new c.b.1(paramBundle);
    if (localMallFormView.pIm != null)
      localMallFormView.pIm.addTextChangedListener((TextWatcher)localObject);
    localObject = (InstantAutoCompleteTextView)paramBundle.pIg.getContentEditText();
    paramBundle.pGw = com.tencent.mm.pluginsdk.a.cJ(paramBundle.pIg.getContext());
    paramBundle.pIh = new d(paramBundle.pIg, paramBundle.pGw);
    paramBundle.pIh.pIU = new c.b.2(paramBundle);
    paramBundle.pIh.pIV = this;
    paramBundle.kd(true);
    ((InstantAutoCompleteTextView)localObject).setShowAlways(true);
    ((InstantAutoCompleteTextView)localObject).setAdapter(paramBundle.pIh);
    ((InstantAutoCompleteTextView)localObject).setOnItemClickListener(new c.b.3(paramBundle, (InstantAutoCompleteTextView)localObject));
    paramBundle.pIg.setOnFocusChangeListener(new c.b.4(paramBundle, (InstantAutoCompleteTextView)localObject));
    ((InstantAutoCompleteTextView)localObject).setOnClickListener(new c.b.5(paramBundle, (InstantAutoCompleteTextView)localObject));
    this.pGZ = ((GridView)findViewById(2131826533));
    this.pHb = ((TextView)findViewById(2131826540));
    this.pHc = ((TextView)findViewById(2131826539));
    this.pHd = ((TextView)findViewById(2131826541));
    this.pHe = ((TextView)findViewById(2131826538));
    this.pGX = ((TextView)findViewById(2131826531));
    this.pGY = ((TextView)findViewById(2131826534));
    this.pHa = ((GridView)findViewById(2131826536));
    this.pHf = ((TextView)findViewById(2131826532));
    this.pHg = ((TextView)findViewById(2131826535));
    this.pGW.setOnInputValidChangeListener(new PhoneRechargeUI.12(this));
    this.pGW.getInfoIv().setOnClickListener(new PhoneRechargeUI.15(this));
    this.pHh = new b();
    this.pHh.pGM = new PhoneRechargeUI.16(this);
    this.pHi = new b();
    this.pHi.pGM = new PhoneRechargeUI.17(this);
    this.pGZ.setAdapter(this.pHh);
    this.pHa.setAdapter(this.pHi);
    this.pGU.setOnClickListener(new PhoneRechargeUI.18(this));
    this.pGV.setOnClickListener(new PhoneRechargeUI.19(this));
    this.pGW.cew();
    int i = com.tencent.mm.bz.a.gd(this) / 4 - 20;
    ab.i("MicroMsg.PhoneRechargeUI", "max width: %s", new Object[] { Integer.valueOf(i) });
    this.pHb.setMaxWidth(i);
    this.pHc.setMaxWidth(i);
    this.pHd.setMaxWidth(i);
    this.pHe.setMaxWidth(i);
    this.pHl = getResources().getColor(2131690316);
    if ((this.pHo.pGx != null) && (!bo.isNullOrNil(this.pHo.pGx.name)))
      this.desc = this.pHo.pGx.name;
    this.pGW.getContentEditText().setHintTextColor(getResources().getColor(2131690373));
    if (bo.isNullOrNil(this.pGW.getText()))
    {
      c(new com.tencent.mm.plugin.recharge.model.f(""), false);
      AppMethodBeat.o(44278);
    }
    while (true)
    {
      return;
      c(new com.tencent.mm.plugin.recharge.model.f(this.pGW.getText()), false);
      AppMethodBeat.o(44278);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44284);
    super.onDestroy();
    com.tencent.mm.kernel.g.Rg().b(1571, this);
    com.tencent.mm.kernel.g.Rg().b(498, this);
    com.tencent.mm.sdk.b.a.xxA.d(this.piM);
    AppMethodBeat.o(44284);
  }

  public void onResume()
  {
    AppMethodBeat.i(44283);
    super.onResume();
    G(false, true);
    AppMethodBeat.o(44283);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44292);
    if ((paramm instanceof com.tencent.mm.plugin.recharge.model.f))
    {
      paramString = (com.tencent.mm.plugin.recharge.model.f)paramm;
      if (paramString.cmdId == 0)
      {
        if ((!bo.isNullOrNil(paramString.gDV)) && (!paramString.gDV.equals(this.pGW.getText())))
        {
          ab.i("MicroMsg.PhoneRechargeUI", "hy: mobiel num not match.abourt, %s, %s", new Object[] { paramString.gDV, this.pGW.getText() });
          AppMethodBeat.o(44292);
        }
        while (true)
        {
          return;
          o(paramm);
          if (!paramString.pGg)
            break;
          ab.e("MicroMsg.PhoneRechargeUI", "hy: cgi failed.");
          VE(paramString.aIm);
          ceh();
          AppMethodBeat.o(44292);
        }
        this.mAppId = paramString.appId;
        this.pGh = paramString.pGh;
        this.pGj = paramString.pGj;
        this.pGk = paramString.pGk;
        this.pGl = paramString.pGl;
        this.pGm = paramString.pGm;
        this.errCode = paramString.errCode;
        this.aIm = paramString.aIm;
        this.pHk = paramString.desc;
        ab.i("MicroMsg.PhoneRechargeUI", "desc: %s, mobile: %s", new Object[] { this.pHk, this.pGW.getText() });
        if (bo.isNullOrNil(this.pHk))
        {
          this.desc = "";
          this.pHl = getResources().getColor(2131690316);
        }
        while (true)
        {
          this.pHp = paramString.pGo;
          this.pGi = paramString.pGi;
          if (this.pGi == null)
            break;
          for (paramInt1 = this.pGi.size() - 1; paramInt1 >= 0; paramInt1--)
          {
            paramm = (com.tencent.mm.plugin.wallet.a.q)this.pGi.get(paramInt1);
            if (paramm.name.isEmpty())
              this.pGi.remove(paramm);
          }
          if ((this.pHo.pGx != null) && (this.pHo.pGx.pFM.trim().equals(this.pGW.getText())))
          {
            this.pHo.pGx.pFN = this.pHk;
            this.pHo.setInput(this.pHo.pGx);
          }
        }
        if ((paramString.pGn == null) || ((paramString.pGn.name.equals(this.pGn.name)) && (paramString.pGn.url.equals(this.pGn.url)) && (paramString.pGn.tmN.equals(this.pGn.tmN)) && (paramString.pGn.fjD.equals(this.pGn.fjD))))
          break label800;
        ab.i("MicroMsg.PhoneRechargeUI", "need to update head");
        this.pGn = paramString.pGn;
      }
    }
    label528: label800: for (boolean bool1 = true; ; bool1 = false)
    {
      boolean bool2;
      if (this.pHk.equals(""))
      {
        bool2 = false;
        G(bool2, bool1);
        paramm = paramString.pGp;
        if (paramm != null)
        {
          ab.d("MicroMsg.PhoneRechargeUI", "update record history");
          com.tencent.mm.plugin.recharge.a.a.cea().cK(paramm);
          if (this.pHo != null)
          {
            if (!paramString.pGq)
              break label619;
            this.pHo.kd(true);
          }
        }
      }
      while (true)
      {
        this.pGW.postDelayed(new PhoneRechargeUI.11(this), 300L);
        AppMethodBeat.o(44292);
        break;
        bool2 = true;
        break label528;
        label619: this.pHo.kd(false);
      }
      ab.i("MicroMsg.PhoneRechargeUI", "do delete phone number");
      AppMethodBeat.o(44292);
      break;
      if ((paramm instanceof com.tencent.mm.plugin.recharge.model.g))
      {
        o(paramm);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramm = ((com.tencent.mm.plugin.recharge.model.g)paramm).pGr;
          paramm.cIf = 6;
          paramm.vwe = 100;
          paramm.kck = this.pGW.getText();
          if (this.pHo.pGx != null);
          for (paramString = this.pHo.pGx.name; ; paramString = "")
          {
            paramm.hHV = paramString;
            com.tencent.mm.pluginsdk.wallet.h.a(this, paramm, 2);
            com.tencent.mm.sdk.b.a.xxA.c(this.piM);
            AppMethodBeat.o(44292);
            break;
          }
        }
        paramm = paramString;
        if (bo.isNullOrNil(paramString))
          paramm = getString(2131305389);
        VE(paramm);
      }
      AppMethodBeat.o(44292);
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI
 * JD-Core Version:    0.6.2
 */