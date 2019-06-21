package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.bankcard.TenpaySegmentEditText;

public class WalletConfirmCardIDUI extends WalletBaseUI
{
  private Button nhX;
  private TenpaySegmentEditText tHx;
  private boolean tHy = true;

  private void cRB()
  {
    AppMethodBeat.i(47373);
    this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
    this.nTi = findViewById(2131822356);
    View localView = findViewById(2131822358);
    if ((this.mKeyboard == null) || (this.nTi == null))
      AppMethodBeat.o(47373);
    while (true)
    {
      return;
      localView.setOnClickListener(new WalletConfirmCardIDUI.4(this));
      AppMethodBeat.o(47373);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool1 = true;
    AppMethodBeat.i(47372);
    paramString = new Bundle();
    boolean bool2 = this.mBundle.getBoolean("key_is_reset_with_new_card", false);
    boolean bool3;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof t))
      {
        paramm = (t)paramm;
        paramString.putBoolean("key_need_area", paramm.cOU());
        paramString.putBoolean("key_need_profession", paramm.cOV());
        paramString.putParcelableArray("key_profession_list", paramm.tur);
        if (paramm.tus == 1)
        {
          bool3 = true;
          paramString.putBoolean("key_need_country", bool3);
          paramString.putStringArray("key_country_excludes", paramm.tut);
          if (paramm.tun == null)
            break label236;
          if ((!paramm.tun.tyC) || (!paramm.tun.isError()))
            break label172;
          h.g(this, 2131304582, 2131297061);
          AppMethodBeat.o(47372);
          bool3 = bool1;
        }
      }
    while (true)
    {
      return bool3;
      bool3 = false;
      break;
      label172: paramString.putBoolean("key_is_reset_with_new_card", bool2);
      paramString.putString("bank_name", paramm.tun.nuL);
      paramString.putParcelable("elemt_query", paramm.tun);
      paramString.putString("key_card_id", this.tHx.getEncryptDataWithHash(false));
      a.j(this, paramString);
      AppMethodBeat.o(47372);
      bool3 = bool1;
      continue;
      label236: paramString.putBoolean("key_is_reset_with_new_card", bool2);
      paramString.putString("bank_name", "");
      paramString.putParcelable("elemt_query", new ElementQuery());
      paramString.putString("key_card_id", this.tHx.getEncryptDataWithHash(false));
      a.j(this, paramString);
      do
      {
        AppMethodBeat.o(47372);
        bool3 = false;
        break;
      }
      while ((paramInt2 != 1) || (!(paramm instanceof t)));
      paramString.putString("bank_name", "");
      paramString.putBoolean("key_is_reset_with_new_card", bool2);
      paramString.putParcelable("elemt_query", new ElementQuery());
      paramString.putString("key_card_id", this.tHx.getEncryptDataWithHash(false));
      a.j(this, paramString);
      AppMethodBeat.o(47372);
      bool3 = bool1;
    }
  }

  public final int getLayoutId()
  {
    return 2130971084;
  }

  public final void initView()
  {
    AppMethodBeat.i(47371);
    String str1 = this.mBundle.getString("key_bankcard_id");
    String str2 = this.mBundle.getString("key_bankcard_des");
    Object localObject = (Bitmap)this.mBundle.getParcelable("key_bankcard_cropimg");
    if (TextUtils.isEmpty(str1))
    {
      ab.e("MicroMsg.WalletConfirmCardIDUI", "cardID is empty");
      finish();
      AppMethodBeat.o(47371);
    }
    while (true)
    {
      return;
      if (localObject == null)
      {
        ab.e("MicroMsg.WalletConfirmCardIDUI", "cardID bitmap is null");
        finish();
        AppMethodBeat.o(47371);
      }
      else
      {
        setMMTitle(2131304754);
        this.nhX = ((Button)findViewById(2131822846));
        this.tHx = ((TenpaySegmentEditText)findViewById(2131828760));
        this.tHx.setText(str1, str2);
        this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
        this.nTi = findViewById(2131822356);
        ((ImageView)findViewById(2131828759)).setImageBitmap((Bitmap)localObject);
        this.tHx.setKeyboard(this.mKeyboard);
        this.mKeyboard.setXMode(0);
        ((InputMethodManager)this.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(this.tHx.getWindowToken(), 0);
        this.nTi.setVisibility(8);
        this.tHx.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(47366);
            if ((!WalletConfirmCardIDUI.a(WalletConfirmCardIDUI.this).isShown()) && (!WalletConfirmCardIDUI.b(WalletConfirmCardIDUI.this)))
            {
              WalletConfirmCardIDUI.c(WalletConfirmCardIDUI.this).setVisibility(0);
              WalletConfirmCardIDUI.d(WalletConfirmCardIDUI.this).setVisibility(0);
            }
            WalletConfirmCardIDUI.e(WalletConfirmCardIDUI.this);
            AppMethodBeat.o(47366);
          }
        });
        localObject = this.tHx.get3DesEncrptData();
        this.nhX.setOnClickListener(new WalletConfirmCardIDUI.3(this, (String)localObject));
        cRB();
        this.tHx.setFocusable(false);
        this.tHx.setFocusableInTouchMode(true);
        AppMethodBeat.o(47371);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47369);
    super.onCreate(paramBundle);
    initView();
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(47365);
        x.dNV();
        WalletConfirmCardIDUI.this.finish();
        AppMethodBeat.o(47365);
        return false;
      }
    });
    AppMethodBeat.o(47369);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47370);
    super.onDestroy();
    AppMethodBeat.o(47370);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI
 * JD-Core Version:    0.6.2
 */