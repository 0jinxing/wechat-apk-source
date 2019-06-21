package com.tencent.mm.wallet_core.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.wallet_core.c.j;
import com.tencent.mm.wallet_core.c.l;
import com.tencent.mm.wallet_core.c.w;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.e.a.b;
import com.tencent.mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class WalletBaseUI extends MMActivity
  implements com.tencent.mm.wallet_core.c.h, com.tencent.mm.wallet_core.d.f
{
  private static com.tencent.mm.wallet_core.c.q Aht = null;
  private static Set<String> Ahx = new HashSet();
  public static final int gnS = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 270);
  private com.tencent.mm.wallet_core.c Ahq = null;
  public i Ahr = null;
  private com.tencent.mm.wallet_core.d.g Ahs = null;
  private MenuItem.OnMenuItemClickListener Ahu;
  protected WcPayKeyboard Ahv;
  public int Ahw = 0;
  public boolean Ahy = false;
  public boolean Ahz = false;
  public Bundle mBundle = new Bundle();
  public MyKeyboardWindow mKeyboard;
  private Dialog msu;
  public View nTi;
  protected a obM;
  private LinkedList<j> ocA = new LinkedList();
  private MenuItem.OnMenuItemClickListener yQu;

  public static void dOB()
  {
    f.dOB();
  }

  private void dOH()
  {
    com.tencent.mm.wallet_core.c localc = dOD();
    if (localc != null)
      this.Ahr.mBundle = localc.mqu;
  }

  private void dOI()
  {
    Iterator localIterator = ((List)this.ocA.clone()).iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }

  public void AM(int paramInt)
  {
    super.AM(paramInt);
  }

  public final void QP(int paramInt)
  {
    this.mKeyboard.setXMode(paramInt);
  }

  protected void a(View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramView, paramInt, paramBoolean1, true, paramBoolean2);
  }

  @TargetApi(14)
  protected final void a(View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    a(paramView, null, paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
  }

  protected final void a(final View paramView, final EditText paramEditText, final int paramInt, final boolean paramBoolean1, final boolean paramBoolean2, boolean paramBoolean3)
  {
    this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
    this.nTi = findViewById(2131822356);
    View localView = findViewById(2131822358);
    if (paramEditText == null)
      paramEditText = (EditText)paramView.findViewById(2131820687);
    while (true)
    {
      if ((this.mKeyboard == null) || (paramEditText == null) || (this.nTi == null));
      while (true)
      {
        return;
        final View.OnFocusChangeListener localOnFocusChangeListener = null;
        if (paramBoolean3)
          localOnFocusChangeListener = paramEditText.getOnFocusChangeListener();
        e.setNoSystemInputOnEditText(paramEditText);
        paramEditText.setOnFocusChangeListener(new View.OnFocusChangeListener()
        {
          public final void onFocusChange(final View paramAnonymousView, boolean paramAnonymousBoolean)
          {
            AppMethodBeat.i(49253);
            if ((paramAnonymousView.isFocused()) && (!paramBoolean1))
            {
              ((InputMethodManager)WalletBaseUI.this.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
              new ak().postDelayed(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(49251);
                  if ((!WalletBaseUI.this.nTi.isShown()) && (paramAnonymousView.isShown()) && ((WalletBaseUI.11.this.gnU) || (WalletBaseUI.this.Ahz)))
                  {
                    WalletBaseUI.this.Ahz = true;
                    WalletBaseUI.this.dOC();
                  }
                  Object localObject;
                  if (((WalletBaseUI.11.this.gnW instanceof WalletFormView)) && (Build.VERSION.SDK_INT >= 14))
                  {
                    localObject = (WalletFormView)WalletBaseUI.11.this.gnW;
                    if (((r.YM()) || (((WalletFormView)localObject).getEncrptType() == 100)) && ((!r.YM()) || (((WalletFormView)localObject).getEncrptType() == 0)))
                      break label298;
                    localObject = new com.tencent.mm.ui.a.c();
                    WalletBaseUI.this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
                    WalletBaseUI.11.this.gnV.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
                  }
                  while (true)
                  {
                    if (((WalletBaseUI.11.this.gnW instanceof EditHintPasswdView)) && (Build.VERSION.SDK_INT >= 14))
                    {
                      localObject = new com.tencent.mm.ui.a.c();
                      WalletBaseUI.this.mKeyboard.setSecureAccessibility((View.AccessibilityDelegate)localObject);
                      WalletBaseUI.11.this.gnV.setAccessibilityDelegate((View.AccessibilityDelegate)localObject);
                    }
                    WalletBaseUI.this.QP(WalletBaseUI.11.this.gnX);
                    WalletBaseUI.this.mKeyboard.setInputEditText((EditText)paramAnonymousView);
                    ((InputMethodManager)WalletBaseUI.this.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(paramAnonymousView.getWindowToken(), 0);
                    AppMethodBeat.o(49251);
                    return;
                    label298: WalletBaseUI.this.mKeyboard.resetSecureAccessibility();
                    WalletBaseUI.11.this.gnV.setAccessibilityDelegate(null);
                  }
                }
              }
              , 300L);
            }
            while (true)
            {
              if (localOnFocusChangeListener != null)
                localOnFocusChangeListener.onFocusChange(paramAnonymousView, paramAnonymousBoolean);
              AppMethodBeat.o(49253);
              return;
              new ak().postDelayed(new WalletBaseUI.11.2(this), 200L);
            }
          }
        });
        paramEditText.setOnClickListener(new WalletBaseUI.12(this, paramBoolean1, paramInt, paramEditText));
        localView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(49255);
            WalletBaseUI.this.aoB();
            AppMethodBeat.o(49255);
          }
        });
      }
    }
  }

  public final void a(m paramm, boolean paramBoolean1, boolean paramBoolean2)
  {
    a(paramm, paramBoolean1, paramBoolean2, 0);
  }

  public final void a(m paramm, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    dOH();
    int i = 1;
    if (!paramBoolean2)
      i = 2;
    this.Ahr.a(paramm, paramBoolean1, i, paramInt);
  }

  public final void a(j paramj)
  {
    if (!this.ocA.contains(paramj))
      this.ocA.add(paramj);
  }

  public final void a(String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, q.b paramb)
  {
    this.Ahu = paramOnMenuItemClickListener;
    super.a(0, paramString, paramOnMenuItemClickListener, paramb);
  }

  public final void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.Ahu = paramOnMenuItemClickListener;
    super.addTextOptionMenu(paramInt, paramString, paramOnMenuItemClickListener);
  }

  public void aoB()
  {
    if ((this.nTi != null) && (this.nTi.isShown()))
    {
      this.nTi.setVisibility(8);
      if (this.obM != null)
        this.obM.ic(false);
    }
  }

  protected boolean aoE()
  {
    return true;
  }

  public final boolean apx()
  {
    boolean bool = true;
    if (this.yQu != null)
      this.yQu.onMenuItemClick(null);
    while (true)
    {
      return bool;
      if (this.Ahu != null)
        this.Ahu.onMenuItemClick(null);
      else
        bool = super.apx();
    }
  }

  public void b(int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    ab.d("MicroMsg.WalletBaseUI", "errType = " + paramInt1 + ", errCode = " + paramInt2 + ", errMsg = " + paramString);
    TenpaySecureEditText.setSalt(w.dNR());
    if ((paramm instanceof com.tencent.mm.wallet_core.c.q))
    {
      com.tencent.mm.wallet_core.c.q localq = (com.tencent.mm.wallet_core.c.q)paramm;
      Aht = localq;
      if (this.mBundle != null)
      {
        if (localq.tyd > 0)
          this.mBundle.putInt("key_is_gen_cert", localq.tyd);
        if (localq.tyf > 0)
          this.mBundle.putInt("key_is_hint_crt", localq.tyf);
        if (localq.tyh > 0)
          this.mBundle.putInt("key_is_ignore_cert", localq.tyh);
        if (!bo.isNullOrNil(localq.tye))
          this.mBundle.putString("key_crt_token", localq.tye);
        if (!bo.isNullOrNil(localq.tyg))
          this.mBundle.putString("key_crt_wording", localq.tyg);
      }
    }
    i(paramInt1, paramInt2, paramString, paramm);
    f.a(this, paramInt1, paramInt2, paramString, paramm, paramBoolean);
  }

  public final void b(View paramView1, View paramView2, int paramInt)
  {
    if (paramView1 != null)
    {
      int[] arrayOfInt = new int[2];
      paramView2.getLocationInWindow(arrayOfInt);
      int i = arrayOfInt[1] + paramView2.getHeight();
      int j = com.tencent.mm.bz.a.ge(this);
      paramInt = j - i - com.tencent.mm.bz.a.fromDPToPix(this, paramInt);
      ab.d("MicroMsg.WalletBaseUI", "scrollToFormEditPosAfterShowTenPay, editText locationY: %s, height: %s, diff: %s, hardcodeKeyboardHeight: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(gnS) });
      if ((paramInt > 0) && (paramInt < gnS))
      {
        paramInt = gnS - paramInt;
        ab.d("MicroMsg.WalletBaseUI", "scrollToFormEditPosAfterShowTenPay, scrollDistance: %s", new Object[] { Integer.valueOf(paramInt) });
        paramView1.post(new WalletBaseUI.5(this, paramView1, paramInt));
      }
    }
  }

  public void bLz()
  {
    ab.d("MicroMsg.WalletBaseUI", "cancelforceScene");
    this.Ahr.bLz();
    finish();
  }

  public boolean bNf()
  {
    return true;
  }

  public final void bgj()
  {
    if ((this.msu == null) || ((this.msu != null) && (!this.msu.isShowing())))
    {
      if (this.msu != null)
        this.msu.dismiss();
      this.msu = g.b(this, false, new WalletBaseUI.4(this));
    }
  }

  public final void bgk()
  {
    if (this.msu != null)
      this.msu.dismiss();
  }

  protected void bht()
  {
    xE(this.mController.dyj());
  }

  public boolean bwP()
  {
    boolean bool = true;
    if (getLayoutId() <= 0);
    while (true)
    {
      return bool;
      if (!this.Ahr.bLA())
        bool = false;
    }
  }

  protected boolean bwQ()
  {
    return false;
  }

  public abstract boolean c(int paramInt1, int paramInt2, String paramString, m paramm);

  public final String cNH()
  {
    Object localObject;
    if (this.mBundle == null)
      localObject = "";
    while (true)
    {
      return localObject;
      localObject = (PayInfo)this.mBundle.getParcelable("key_pay_info");
      if (localObject != null)
        localObject = ((PayInfo)localObject).czZ;
      else
        localObject = "";
    }
  }

  public boolean cNR()
  {
    return false;
  }

  protected boolean cfN()
  {
    return false;
  }

  public final void dOA()
  {
    if ((this.Ahv != null) && (!this.Ahv.isShown()))
    {
      this.Ahv.setVisibility(0);
      if (this.obM != null)
        this.obM.ic(true);
    }
  }

  public final void dOC()
  {
    if ((this.nTi != null) && (!this.nTi.isShown()))
    {
      this.nTi.setVisibility(0);
      if (this.obM != null)
        this.obM.ic(true);
    }
  }

  public final com.tencent.mm.wallet_core.c dOD()
  {
    if (this.Ahq == null)
      this.Ahq = com.tencent.mm.wallet_core.a.aE(this);
    return this.Ahq;
  }

  public final com.tencent.mm.wallet_core.d.g dOE()
  {
    if (this.Ahs == null)
    {
      com.tencent.mm.wallet_core.c localc = dOD();
      if (localc != null)
        this.Ahs = localc.a(this, this.Ahr);
      if (this.Ahs == null)
        this.Ahs = new WalletBaseUI.2(this, this, this.Ahr);
    }
    return this.Ahs;
  }

  public final CharSequence dOF()
  {
    if (this.Ahs == null);
    for (CharSequence localCharSequence = null; ; localCharSequence = this.Ahs.Au(0))
      return localCharSequence;
  }

  public final void dOG()
  {
    if ((this.msu == null) || ((this.msu != null) && (!this.msu.isShowing())))
    {
      if (this.msu != null)
        this.msu.dismiss();
      this.msu = g.a(this, false, new WalletBaseUI.3(this));
    }
  }

  protected final void dOy()
  {
    PayInfo localPayInfo1 = (PayInfo)this.mBundle.getParcelable("key_pay_info");
    PayInfo localPayInfo2 = localPayInfo1;
    if (localPayInfo1 == null)
      localPayInfo2 = (PayInfo)getIntent().getParcelableExtra("key_pay_info");
    if ((localPayInfo2 != null) && (!bo.isNullOrNil(localPayInfo2.eCq)))
    {
      this.Ahr.a(new l(localPayInfo2.eCq, localPayInfo2.czZ), true, 1);
      localPayInfo2.eCq = null;
    }
  }

  public final void dOz()
  {
    if ((this.Ahv != null) && (this.Ahv.isShown()))
    {
      this.Ahv.setVisibility(8);
      if (this.obM != null)
        this.obM.ic(false);
    }
  }

  public void dY()
  {
    dOD().a(this, 0, this.mBundle);
  }

  protected final void e(View paramView, int paramInt, boolean paramBoolean)
  {
    a(paramView, paramInt, paramBoolean, true);
  }

  protected final void e(EditText paramEditText)
  {
    this.Ahv = ((WcPayKeyboard)findViewById(2131829144));
    if ((this.Ahv == null) || (paramEditText == null));
    while (true)
    {
      return;
      e.setNoSystemInputOnEditText(paramEditText);
      paramEditText.setOnFocusChangeListener(new WalletBaseUI.9(this, paramEditText));
      paramEditText.setOnClickListener(new WalletBaseUI.10(this));
    }
  }

  public void finish()
  {
    super.finish();
    this.Ahy = true;
  }

  public boolean i(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return true;
  }

  public final void nf(int paramInt)
  {
    this.Ahr.nf(paramInt);
  }

  public final void ng(int paramInt)
  {
    this.Ahr.ng(paramInt);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    dOE().onActivityResult(paramInt1, paramInt2, paramIntent);
    paramIntent = ((List)this.ocA.clone()).iterator();
    while (paramIntent.hasNext())
      ((j)paramIntent.next()).dNL();
  }

  public void onCreate(Bundle paramBundle)
  {
    String str;
    if (cfN())
    {
      str = getClass().getSimpleName();
      if (Ahx.contains(str))
      {
        ab.w("MicroMsg.WalletBaseUI", "has contain lock key: %s", new Object[] { str });
        finish();
      }
    }
    else
    {
      super.onCreate(paramBundle);
      bht();
      if (!com.tencent.mm.kernel.g.RK())
      {
        ab.e("MicroMsg.WalletBaseUI", "hy: account not ready. finish now");
        com.tencent.mm.ui.base.h.a(this, getString(2131304507), "", false, new WalletBaseUI.1(this));
      }
      this.Ahr = new i(this, this);
      this.Ahr.nf(385);
      this.Ahr.nf(1518);
      ab.d("MicroMsg.WalletBaseUI", "current process:" + getIntent().getIntExtra("process_id", 0));
      paramBundle = com.tencent.mm.wallet_core.a.aE(this);
      if (paramBundle != null)
      {
        this.Ahr.eHT = paramBundle.bxP();
        paramBundle.a(this);
      }
      ab.d("MicroMsg.WalletBaseUI", "proc ".concat(String.valueOf(paramBundle)));
      this.mBundle = com.tencent.mm.wallet_core.a.aD(this);
      if (this.mBundle == null)
        this.mBundle = new Bundle();
      this.Ahr.mBundle = this.mBundle;
      if ((bNf()) && (!com.tencent.mm.wallet_core.a.aC(this)))
        ab.e("MicroMsg.WalletBaseUI", "Activity extends WalletBaseUI but not in process!!!");
      if ((getLayoutId() > 0) && (!bo.isNullOrNil("")))
        setMMSubTitle("");
      setBackBtn(new WalletBaseUI.6(this));
      this.Ahs = dOE();
      if ((this.Ahs == null) || (!this.Ahs.w(new Object[0])))
        break label350;
      AM(4);
    }
    while (true)
    {
      dOI();
      return;
      Ahx.add(str);
      break;
      label350: if (getLayoutId() <= 0)
        AM(4);
      else if (bwP())
        AM(4);
      else
        AM(0);
    }
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    ab.i("MicroMsg.WalletBaseUI", "onCreateDialog id = ".concat(String.valueOf(paramInt)));
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
      return localObject;
    case 1000:
    }
    Object localObject = com.tencent.mm.wallet_core.a.aE(this);
    if (localObject != null);
    for (int i = ((com.tencent.mm.wallet_core.c)localObject).a(this, 1); ; i = -1)
    {
      if (i != -1)
      {
        localObject = com.tencent.mm.ui.base.h.a(this, true, getString(i), "", getString(2131297088), getString(2131296990), new WalletBaseUI.7(this), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(49246);
            if (WalletBaseUI.c(WalletBaseUI.this) == null);
            for (paramAnonymousDialogInterface = null; ; paramAnonymousDialogInterface = WalletBaseUI.d(WalletBaseUI.this).findFocus())
            {
              if ((paramAnonymousDialogInterface != null) && ((paramAnonymousDialogInterface instanceof EditText)))
                WalletBaseUI.this.showVKB();
              AppMethodBeat.o(49246);
              return;
            }
          }
        });
        break;
      }
      if (localObject != null)
        ((com.tencent.mm.wallet_core.c)localObject).b(this, this.mBundle);
      while (true)
      {
        localObject = super.onCreateDialog(paramInt);
        break;
        this.Ahw = 4;
        finish();
      }
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.Ahr.ng(385);
    this.Ahr.ng(1518);
    Object localObject = dOD();
    if (localObject != null)
      ((com.tencent.mm.wallet_core.c)localObject).b(this);
    Ahx.remove(getClass().getSimpleName());
    localObject = ((List)this.ocA.clone()).iterator();
    while (((Iterator)localObject).hasNext())
      ((j)((Iterator)localObject).next()).onDestroy();
    this.ocA.clear();
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if (paramInt == 4)
      if ((this.nTi != null) && (this.nTi.isShown()))
        aoB();
    while (true)
    {
      return bool;
      if (cNR())
      {
        aqX();
        showDialog(1000);
      }
      else if ((this.yQu != null) && (aoE()))
      {
        this.yQu.onMenuItemClick(null);
      }
      else if (this.Ahu != null)
      {
        this.Ahu.onMenuItemClick(null);
      }
      else
      {
        bool = super.onKeyUp(paramInt, paramKeyEvent);
      }
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    int i;
    if ((paramIntent.getBooleanExtra("key_process_is_end", false)) && (!paramIntent.getBooleanExtra("key_process_is_stay", true)))
    {
      setIntent(paramIntent);
      paramIntent = getIntent().getExtras();
      if ((paramIntent == null) || (!paramIntent.containsKey("key_process_result_code")))
        break label91;
      i = paramIntent.getInt("key_process_result_code", 0);
      if (i != -1)
        break label96;
      ab.i("MicroMsg.WalletBaseUI", "process end ok!");
      setResult(-1, getIntent());
    }
    while (true)
    {
      finish();
      return;
      label91: i = 0;
      break;
      label96: ab.i("MicroMsg.WalletBaseUI", "process end with user cancel or err! resultCode : ".concat(String.valueOf(i)));
      setResult(0, getIntent());
    }
  }

  public void onPause()
  {
    super.onPause();
  }

  public void onResume()
  {
    super.onResume();
    if (w.dNQ())
      if (r.YM())
        break label34;
    label34: for (Object localObject = new com.tencent.mm.wallet_core.tenpay.model.q(); ; localObject = new b())
    {
      this.Ahr.a((m)localObject, false);
      return;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final boolean rl(boolean paramBoolean)
  {
    boolean bool = true;
    if ((Aht != null) && ((Aht.bXl()) || (paramBoolean)))
      this.Ahr.a(Aht, true);
    for (paramBoolean = bool; ; paramBoolean = false)
      return paramBoolean;
  }

  public final void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.yQu = paramOnMenuItemClickListener;
    super.setBackBtn(paramOnMenuItemClickListener);
  }

  public void wU(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletBaseUI
 * JD-Core Version:    0.6.2
 */