package com.tencent.mm.plugin.recharge.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.recharge.model.MallRechargeProduct;
import com.tencent.mm.plugin.recharge.model.d;
import com.tencent.mm.plugin.recharge.model.e;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.protocal.protobuf.acg;
import com.tencent.mm.protocal.protobuf.ake;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RechargeUI extends MMActivity
  implements f, x.a, MallEditText.b
{
  private Button gHn;
  protected Dialog gII;
  private boolean hZP;
  private TextView pHA;
  private TextView pHB;
  private TextView pHC;
  private FrameLayout pHD;
  private ImageView pHE;
  private ImageView pHF;
  private LinearLayout pHG;
  private RechargeUI.a pHH;
  private RechargeUI.a pHI;
  private MallEditText pHJ;
  private TextView pHK;
  private int pHL;
  private MallRechargeProduct pHM;
  private String pHN;
  private MallNews pHO;
  private boolean pHP;
  private Map<String, Integer> pHQ;
  private String pHR;
  public String pHS;
  private String pHT;
  public String pHU;
  private MallFunction pHj;
  private TextView pHz;
  private boolean piJ;
  private com.tencent.mm.sdk.b.c piM;

  public RechargeUI()
  {
    AppMethodBeat.i(44332);
    this.gHn = null;
    this.pHz = null;
    this.pHA = null;
    this.pHB = null;
    this.pHC = null;
    this.pHD = null;
    this.pHE = null;
    this.pHF = null;
    this.pHG = null;
    this.pHH = null;
    this.pHI = null;
    this.gII = null;
    this.pHj = null;
    this.pHM = null;
    this.pHN = null;
    this.pHO = null;
    this.piJ = false;
    this.pHP = false;
    this.hZP = true;
    this.pHQ = new HashMap();
    this.piM = new RechargeUI.10(this);
    AppMethodBeat.o(44332);
  }

  private static String A(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(44344);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append("-");
    localStringBuilder.append(paramString1);
    localStringBuilder.append("-");
    localStringBuilder.append(paramString2);
    paramString1 = localStringBuilder.toString();
    AppMethodBeat.o(44344);
    return paramString1;
  }

  private String a(MallRechargeProduct paramMallRechargeProduct)
  {
    AppMethodBeat.i(44338);
    if (!paramMallRechargeProduct.isValid())
    {
      paramMallRechargeProduct = getString(2131301390);
      AppMethodBeat.o(44338);
    }
    while (true)
    {
      return paramMallRechargeProduct;
      if ((paramMallRechargeProduct.pFR != paramMallRechargeProduct.pFS) || ((ces()) && (this.pHM.pFW)))
      {
        paramMallRechargeProduct = "";
        AppMethodBeat.o(44338);
      }
      else
      {
        paramMallRechargeProduct = String.format(getString(2131301393), new Object[] { Float.valueOf(paramMallRechargeProduct.pFR) });
        AppMethodBeat.o(44338);
      }
    }
  }

  private boolean arW()
  {
    boolean bool = false;
    AppMethodBeat.i(44341);
    if (!this.pHJ.cef());
    for (int i = 0; ; i = 1)
    {
      if ((i != 0) && (this.pHM != null) && (this.pHM.isValid()))
      {
        if ((ces()) && (this.pHM.pFW))
          p(new d(this.pHM.fmR, this.pHj.pFP, this.pHM.cwg, this.pHM.appId, ceq(), cer()));
        aqX();
        this.gHn.setEnabled(true);
        this.gHn.setClickable(true);
        ab.d("MicroMsg.MallRechargeUI", "checkInfo : true");
        AppMethodBeat.o(44341);
        bool = true;
      }
      while (true)
      {
        return bool;
        this.gHn.setEnabled(false);
        this.gHn.setClickable(false);
        ab.d("MicroMsg.MallRechargeUI", "checkInfo : false");
        AppMethodBeat.o(44341);
      }
    }
  }

  private void cM(List<MallRechargeProduct> paramList)
  {
    AppMethodBeat.i(44351);
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      int k;
      for (int j = 0; i < paramList.size(); j = k)
      {
        MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)paramList.get(i);
        k = j;
        if (localMallRechargeProduct.fmR == 2)
        {
          k = j;
          if (this.pHM != null)
          {
            k = j;
            if (localMallRechargeProduct.cwg.equals(this.pHM.cwg))
            {
              localMallRechargeProduct.isDefault = true;
              k = 1;
            }
          }
          localArrayList.add(localMallRechargeProduct);
        }
        i++;
      }
      if ((j == 0) && (localArrayList.size() > 0))
        ((MallRechargeProduct)localArrayList.get(0)).isDefault = true;
      this.pHI.cN(localArrayList);
      AppMethodBeat.o(44351);
    }
    while (true)
    {
      return;
      this.pHI.cN(new ArrayList());
      AppMethodBeat.o(44351);
    }
  }

  private void ceo()
  {
    AppMethodBeat.i(44336);
    String str = getString(2131301382);
    if (!TextUtils.isEmpty(this.pHS))
      str = this.pHS;
    if (!bo.isNullOrNil(this.pHR))
      addTextOptionMenu(0, str, new RechargeUI.18(this));
    AppMethodBeat.o(44336);
  }

  private void cep()
  {
    AppMethodBeat.i(44337);
    if (!bo.isNullOrNil(this.pHT))
      this.pHC.setVisibility(0);
    while (true)
    {
      if (!TextUtils.isEmpty(this.pHU))
        this.pHC.setText(this.pHU);
      AppMethodBeat.o(44337);
      return;
      this.pHC.setVisibility(8);
    }
  }

  private String ceq()
  {
    AppMethodBeat.i(44342);
    String str = "mobile=" + com.tencent.mm.plugin.recharge.model.b.ws(this.pHJ.getText());
    AppMethodBeat.o(44342);
    return str;
  }

  private String cer()
  {
    AppMethodBeat.i(44343);
    String str = com.tencent.mm.plugin.recharge.model.b.ws(this.pHJ.getText());
    AppMethodBeat.o(44343);
    return str;
  }

  private boolean ces()
  {
    AppMethodBeat.i(44345);
    String str = A(this.pHM.fmR, this.pHM.cwg, cer());
    boolean bool;
    if (!this.pHQ.containsKey(str))
    {
      bool = true;
      AppMethodBeat.o(44345);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(44345);
    }
  }

  private void cu()
  {
    AppMethodBeat.i(44335);
    ab.d("MicroMsg.MallRechargeUI", "mCheckedProduct " + this.pHM);
    if (this.pHM != null)
    {
      this.pHK.setText(this.pHM.lcC);
      this.pHB.setText(a(this.pHM));
    }
    if ((this.pHO != null) && (this.pHj.tDn != null) && (this.pHO.equals(this.pHj.tDn)) && (!"1".equals(this.pHO.tDt)))
    {
      this.pHD.setVisibility(8);
      ab.d("MicroMsg.MallRechargeUI", "dismiss banner!, news->" + this.pHO.toString());
      this.pHA.setVisibility(4);
      if (!arW())
        break label331;
      if ((this.pHM != null) && (!ces()))
      {
        this.pHz.setText(this.pHM.pFQ);
        this.pHz.setTextColor(getResources().getColor(2131690164));
      }
    }
    while (true)
    {
      ceo();
      cep();
      AppMethodBeat.o(44335);
      return;
      if ((this.pHj.tDn != null) && (!bo.isNullOrNil(this.pHj.tDn.tDx)))
      {
        this.pHN = this.pHj.tDn.tDx;
        Bitmap localBitmap = x.a(new com.tencent.mm.plugin.recharge.b.a(this.pHN));
        this.pHE.setImageBitmap(localBitmap);
        this.pHD.setVisibility(0);
        ab.d("MicroMsg.MallRechargeUI", "Show banner!");
        break;
      }
      this.pHD.setVisibility(8);
      ab.d("MicroMsg.MallRechargeUI", "dismiss banner!");
      break;
      label331: this.pHz.setText("");
    }
  }

  private static List<MallRechargeProduct> f(int paramInt, List<MallRechargeProduct> paramList)
  {
    AppMethodBeat.i(44339);
    ArrayList localArrayList = new ArrayList();
    if (paramList != null)
    {
      int i = 0;
      int k;
      for (int j = 0; i < paramList.size(); j = k)
      {
        MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)paramList.get(i);
        k = j;
        if (localMallRechargeProduct.fmR == paramInt)
        {
          localArrayList.add(localMallRechargeProduct);
          k = j;
          if (localMallRechargeProduct.isDefault)
          {
            if (j != 0)
              localMallRechargeProduct.isDefault = false;
            k = 1;
          }
        }
        i++;
      }
      if ((j == 0) && (localArrayList.size() > 0))
        ((MallRechargeProduct)localArrayList.get(0)).isDefault = true;
    }
    AppMethodBeat.o(44339);
    return localArrayList;
  }

  private void p(m paramm)
  {
    AppMethodBeat.i(44340);
    if ((paramm.getType() == 497) || (paramm.getType() == 1555))
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(paramm, 0);
      AppMethodBeat.o(44340);
    }
    while (true)
    {
      return;
      if (!this.hZP)
      {
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(paramm, 0);
        AppMethodBeat.o(44340);
      }
      else
      {
        if ((this.gII == null) || ((this.gII != null) && (!this.gII.isShowing())))
          this.gII = com.tencent.mm.wallet_core.ui.g.a(this.mController.ylL, true, new RechargeUI.3(this, paramm));
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(paramm, 0);
        AppMethodBeat.o(44340);
      }
    }
  }

  public final void aqX()
  {
    AppMethodBeat.i(44356);
    ab.d("MicroMsg.MallRechargeUI", "hideVKB");
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null)
      AppMethodBeat.o(44356);
    while (true)
    {
      return;
      Object localObject = getCurrentFocus();
      if (localObject == null)
      {
        AppMethodBeat.o(44356);
      }
      else
      {
        localObject = ((View)localObject).getWindowToken();
        if (localObject == null)
        {
          AppMethodBeat.o(44356);
        }
        else
        {
          localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
          AppMethodBeat.o(44356);
        }
      }
    }
  }

  public final void ceg()
  {
    AppMethodBeat.i(44347);
    if ((bo.isNullOrNil(this.pHJ.getText())) || (this.pHJ.asa()))
    {
      this.pHJ.setInfoTvImageResource(2130840001);
      AppMethodBeat.o(44347);
    }
    while (true)
    {
      return;
      this.pHJ.setInfoTvImageResource(2130839158);
      AppMethodBeat.o(44347);
    }
  }

  public final int getLayoutId()
  {
    return 2130970478;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(44346);
    if (!paramBoolean)
    {
      this.pHQ.clear();
      this.pHz.setText("");
      this.pHA.setVisibility(4);
    }
    arW();
    AppMethodBeat.o(44346);
  }

  public final void initView()
  {
    AppMethodBeat.i(44334);
    setMMTitle(this.pHj.cOI);
    ab.v("MicroMsg.MallRechargeUI", "initView");
    setBackBtn(new RechargeUI.1(this));
    this.pHz = ((TextView)findViewById(2131826638));
    this.pHA = ((TextView)findViewById(2131826903));
    this.pHB = ((TextView)findViewById(2131826902));
    this.gHn = ((Button)findViewById(2131822846));
    this.pHG = ((LinearLayout)findViewById(2131826900));
    this.pHC = ((TextView)findViewById(2131826904));
    this.pHC.setOnClickListener(new RechargeUI.11(this));
    this.gHn.setOnClickListener(new RechargeUI.12(this));
    this.pHJ = ((MallEditText)findViewById(2131826899));
    this.pHJ.setInfoTvOnClickListener(new RechargeUI.13(this));
    this.pHK = ((TextView)findViewById(2131826901));
    Object localObject = getIntent().getParcelableArrayListExtra("key_product_list");
    List localList = f(0, (List)localObject);
    localObject = f(2, (List)localObject);
    if (localList.size() > ((List)localObject).size());
    for (int i = localList.size(); ; i = ((List)localObject).size())
    {
      this.pHL = i;
      this.pHH = new RechargeUI.a(this, (byte)0);
      this.pHH.cN(localList);
      this.pHI = new RechargeUI.a(this, (byte)0);
      this.pHI.cN((List)localObject);
      this.pHG.setOnClickListener(new RechargeUI.14(this));
      this.pHD = ((FrameLayout)findViewById(2131826896));
      this.pHE = ((ImageView)findViewById(2131826897));
      this.pHF = ((ImageView)findViewById(2131826898));
      this.pHF.setOnClickListener(new RechargeUI.15(this));
      this.pHD.setOnClickListener(new RechargeUI.16(this));
      this.pHJ.setOnInputValidChangeListener(this);
      this.pHJ.setOnClickListener(new RechargeUI.17(this));
      ceg();
      x.a(this);
      cu();
      AppMethodBeat.o(44334);
      return;
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(44354);
    if (this.pHN == null)
      AppMethodBeat.o(44354);
    while (true)
    {
      return;
      if (paramString.equals(this.pHN))
        this.pHE.post(new RechargeUI.9(this, paramBitmap));
      AppMethodBeat.o(44354);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(44352);
    label102: Cursor localCursor1;
    Object localObject2;
    label362: label378: String str2;
    switch (paramInt1)
    {
    default:
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(44352);
    case 1:
      while (true)
      {
        return;
        if (paramInt2 != -1)
          break;
        localObject1 = paramIntent.getData();
        if (localObject1 == null)
        {
          ab.e("MicroMsg.MallRechargeUI", "uri == null");
          AppMethodBeat.o(44352);
        }
        else
        {
          if (com.tencent.mm.pluginsdk.permission.b.o(this, "android.permission.READ_CONTACTS"))
            break label102;
          ab.e("MicroMsg.MallRechargeUI", "no contact permission");
          AppMethodBeat.o(44352);
        }
      }
      localCursor1 = getContentResolver().query((Uri)localObject1, null, null, null, null);
      if ((localCursor1 != null) && (localCursor1.getCount() > 0))
      {
        localCursor1.moveToFirst();
        int i = localCursor1.getColumnIndex("has_phone_number");
        if ((i <= 0) || (localCursor1.getInt(i) > 0))
        {
          localObject1 = localCursor1.getString(localCursor1.getColumnIndex("_id"));
          Cursor localCursor2 = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ".concat(String.valueOf(localObject1)), null, null);
          if (localCursor2.moveToFirst())
          {
            str1 = null;
            localObject1 = null;
            while (true)
            {
              localObject2 = localObject1;
              if (localCursor2.isAfterLast())
                break;
              int j = localCursor2.getColumnIndex("data1");
              i = localCursor2.getColumnIndex("display_name");
              localObject2 = localCursor2.getString(j);
              str1 = localCursor2.getString(i);
              ab.d("MicroMsg.MallRechargeUI", "username : ".concat(String.valueOf(str1)));
              if (localObject2 == null)
                break label579;
              ab.d("MicroMsg.MallRechargeUI", "phoneNumber : ".concat(String.valueOf(localObject2)));
              localObject2 = com.tencent.mm.plugin.recharge.model.b.ws((String)localObject2);
              ab.d("MicroMsg.MallRechargeUI", "phoneNumber : ".concat(String.valueOf(localObject2)));
              if (!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject2))
                break label576;
              localObject1 = localObject2;
              ab.d("MicroMsg.MallRechargeUI", "phoneResult : ".concat(String.valueOf(localObject1)));
              localCursor2.moveToNext();
            }
          }
          String str1 = null;
          localObject2 = null;
          localObject1 = localObject2;
          str2 = str1;
          if (!localCursor2.isClosed())
          {
            localCursor2.close();
            str2 = str1;
          }
        }
      }
      break;
    case 2:
    }
    for (Object localObject1 = localObject2; ; localObject1 = null)
    {
      if ((localCursor1 != null) && (!localCursor1.isClosed()))
        localCursor1.close();
      if (PhoneNumberUtils.isGlobalPhoneNumber((String)localObject1))
      {
        this.pHQ.clear();
        this.pHJ.setInput(new com.tencent.mm.plugin.recharge.model.a((String)localObject1, str2, 1));
        this.pHz.setText("");
        this.pHA.setVisibility(4);
        arW();
        break;
      }
      showDialog(2);
      break;
      if (paramInt2 == -1)
      {
        if (this.piJ)
          break;
        ab.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : ok");
        com.tencent.mm.plugin.recharge.a.a.cea().a(this.pHJ.getInputRecord());
        finish();
        this.piJ = true;
        break;
      }
      ab.i("MicroMsg.MallRechargeUI", "MallRecharge pay result : cancel");
      break;
      label576: break label362;
      label579: break label378;
      str2 = null;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44333);
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    this.pHj = ((MallFunction)localIntent.getParcelableExtra("key_func_info"));
    paramBundle = localIntent.getParcelableArrayListExtra("key_product_list");
    if (!localIntent.getBooleanExtra("key_is_hide_progress", false));
    for (boolean bool = true; ; bool = false)
    {
      this.hZP = bool;
      if (this.pHj != null)
        break;
      ab.e("MicroMsg.MallRechargeUI", "function info is null");
      t.makeText(this, "function info is null", 1).show();
      AppMethodBeat.o(44333);
      return;
    }
    if (paramBundle == null)
    {
      ab.d("MicroMsg.MallRechargeUI", "function info : " + this.pHj.cOI);
      p(new e(this.pHj.pFP));
    }
    while (true)
    {
      ab.i("MicroMsg.MallRechargeUI", "onCreate()");
      this.pHO = com.tencent.mm.plugin.wallet_core.model.mall.c.cQT().acI(this.pHj.pFP);
      initView();
      AppMethodBeat.o(44333);
      break;
      this.pHM = a.cL(paramBundle);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44353);
    com.tencent.mm.sdk.b.a.xxA.d(this.piM);
    super.onDestroy();
    AppMethodBeat.o(44353);
  }

  public void onPause()
  {
    AppMethodBeat.i(44350);
    super.onPause();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(496, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(497, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(498, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(1555, this);
    AppMethodBeat.o(44350);
  }

  public void onResume()
  {
    AppMethodBeat.i(44349);
    super.onResume();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(496, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(497, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(498, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1555, this);
    AppMethodBeat.o(44349);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44348);
    ab.d("MicroMsg.MallRechargeUI", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((this.gII != null) && (this.gII.isShowing()) && (paramm.getType() != 497))
    {
      this.gII.dismiss();
      this.gII = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof e))
      {
        paramm = (e)paramm;
        paramString = paramm.pGb;
        if (paramString != null)
        {
          this.pHM = a.cL(paramString);
          ab.d("MicroMsg.MallRechargeUI", "mCheckedProduct again" + this.pHM);
        }
        this.pHR = paramm.pGc;
        this.pHS = paramm.pGd;
        this.pHT = paramm.pGe;
        this.pHU = paramm.pGf;
        ab.d("MicroMsg.MallRechargeUI", "mProductList ".concat(String.valueOf(paramString)));
        cu();
        paramm = f(0, paramString);
        paramString = f(2, paramString);
        if (paramm.size() > paramString.size())
        {
          paramInt1 = paramm.size();
          this.pHL = paramInt1;
          this.pHH.cN(paramm);
          this.pHI.cN(paramString);
          AppMethodBeat.o(44348);
        }
      }
    while (true)
    {
      return;
      paramInt1 = paramString.size();
      break;
      if ((paramm instanceof d))
      {
        ab.d("MicroMsg.MallRechargeUI", "checkProduct: " + this.pHM);
        d locald = (d)paramm;
        if ((this.pHM != null) && (this.pHM.cwg != null) && (locald.pFY != null) && (((this.pHM.cwg.equals(locald.pFY.cwg)) && (cer().equals(locald.gyD))) || (locald.fmR != 2)))
        {
          MallRechargeProduct.a(locald.pFY, this.pHM);
          this.pHM.isDefault = true;
          paramm = A(locald.fmR, locald.pFY.cwg, locald.gyD);
          this.pHQ.put(paramm, Integer.valueOf(1));
          cu();
          this.pHA.setText(paramString);
          this.pHA.setVisibility(0);
          this.pHA.setTextColor(getResources().getColor(2131690138));
        }
        if (locald.fmR == 2)
        {
          if ((this.pHM == null) || (!this.pHM.cwg.equals(locald.pGa)) || (!cer().equals(locald.gyD)))
            break label722;
          if ((((ake)locald.ehh.fsH.fsP).wjY == 0) && (this.pHM.cwg.equals(locald.pFY.cwg)))
            break label679;
          this.gHn.setEnabled(false);
          this.gHn.setClickable(false);
          this.pHA.setText(((ake)locald.ehh.fsH.fsP).wjZ);
          this.pHA.setVisibility(0);
          this.pHA.setTextColor(getResources().getColor(2131690384));
        }
        while (true)
        {
          cM(locald.pFZ);
          ab.d("MicroMsg.MallRechargeUI", "NetSceneGetLatestPayProductInfo  mCheckedProduct " + this.pHM);
          AppMethodBeat.o(44348);
          break;
          label679: p(new com.tencent.mm.plugin.recharge.model.c(this.pHM.pFP, cer(), this.pHM.lcC, this.pHM.appId, ceq()));
          continue;
          label722: this.gHn.setEnabled(true);
          this.gHn.setClickable(true);
          this.pHA.setText(null);
        }
      }
      if ((paramm instanceof com.tencent.mm.plugin.recharge.model.g))
      {
        paramString = ((com.tencent.mm.plugin.recharge.model.g)paramm).pGr;
        paramString.cIf = 6;
        paramString.vwe = 100;
        com.tencent.mm.pluginsdk.wallet.h.a(this, paramString, 2);
        com.tencent.mm.sdk.b.a.xxA.c(this.piM);
        AppMethodBeat.o(44348);
      }
      else if ((paramm instanceof com.tencent.mm.plugin.recharge.model.c))
      {
        paramString = (com.tencent.mm.plugin.recharge.model.c)paramm;
        if ((this.pHM != null) && (this.pHM.lcC.equals(paramString.lcC)) && (cer().equals(paramString.cFl)))
        {
          if (((acg)paramString.ehh.fsH.fsP).wjY != 0)
          {
            this.gHn.setEnabled(false);
            this.gHn.setClickable(false);
            this.pHA.setText(((acg)paramString.ehh.fsH.fsP).wjZ);
            this.pHA.setVisibility(0);
            this.pHA.setTextColor(getResources().getColor(2131690384));
            AppMethodBeat.o(44348);
          }
        }
        else
        {
          this.gHn.setEnabled(true);
          this.gHn.setClickable(true);
          this.pHA.setText(null);
          AppMethodBeat.o(44348);
          continue;
          if (!(paramm instanceof com.tencent.mm.plugin.recharge.model.c))
          {
            if ((paramm instanceof d))
            {
              if (paramInt2 == 100)
              {
                this.gHn.setEnabled(true);
                this.gHn.setClickable(true);
              }
              while (true)
              {
                cM(((d)paramm).pFZ);
                this.pHA.setText(paramString);
                this.pHA.setVisibility(0);
                this.pHA.setTextColor(getResources().getColor(2131690384));
                this.pHz.setText(((d)paramm).pFQ);
                this.pHz.setTextColor(getResources().getColor(2131690384));
                AppMethodBeat.o(44348);
                break;
                this.gHn.setEnabled(false);
                this.gHn.setClickable(false);
              }
            }
            paramm = paramString;
            if (bo.isNullOrNil(paramString))
              paramm = getString(2131305389);
            com.tencent.mm.ui.base.h.a(this, paramm, null, false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
              }
            });
          }
        }
      }
      else
      {
        AppMethodBeat.o(44348);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void showVKB()
  {
    AppMethodBeat.i(44355);
    ab.d("MicroMsg.MallRechargeUI", "showVKB");
    this.pHJ.setInfoTvImageResource(2130839158);
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null)
      AppMethodBeat.o(44355);
    while (true)
    {
      return;
      View localView = getCurrentFocus();
      if (localView == null)
      {
        AppMethodBeat.o(44355);
      }
      else if (localView.getWindowToken() == null)
      {
        AppMethodBeat.o(44355);
      }
      else
      {
        localInputMethodManager.showSoftInput(localView, 2);
        AppMethodBeat.o(44355);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI
 * JD-Core Version:    0.6.2
 */