package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;

public class ProfileEditPhoneNumberView extends ProfileItemView
  implements MMPhoneNumberEditText.a
{
  public String vim;
  public String vin;
  public String[] vio;
  private LinearLayout vip;
  private boolean viq = false;
  public ProfileEditPhoneNumberView.a vir;

  public ProfileEditPhoneNumberView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ProfileEditPhoneNumberView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void bV(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(27520);
    MMPhoneNumberEditText localMMPhoneNumberEditText = (MMPhoneNumberEditText)LayoutInflater.from(getContext()).inflate(2130970405, null);
    localMMPhoneNumberEditText.setHint(ah.getResources().getString(2131296411));
    if (paramBoolean)
      localMMPhoneNumberEditText.diZ();
    localMMPhoneNumberEditText.setCallback(this);
    localMMPhoneNumberEditText.setText(paramString);
    localMMPhoneNumberEditText.setSelection(localMMPhoneNumberEditText.getText().length());
    paramString = new LinearLayout.LayoutParams(-1, -2);
    paramString.setMargins(0, a.fromDPToPix(getContext(), 12), 0, 0);
    this.vip.addView(localMMPhoneNumberEditText, paramString);
    AppMethodBeat.o(27520);
  }

  private void djj()
  {
    AppMethodBeat.i(27515);
    if (this.vir != null)
      this.vir.aVU();
    AppMethodBeat.o(27515);
  }

  private void h(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
    AppMethodBeat.i(27521);
    this.vip.removeView(paramMMPhoneNumberEditText);
    this.vip.getChildAt(this.vip.getChildCount() - 1).requestFocus();
    AppMethodBeat.o(27521);
  }

  public final boolean T(ad paramad)
  {
    this.ldh = paramad;
    return true;
  }

  public final boolean cby()
  {
    AppMethodBeat.i(27513);
    int i;
    if (!bo.isNullOrNil(this.vim))
    {
      bV(this.vim, true);
      i = 1;
    }
    for (int j = 1; ; j = 0)
    {
      int k = j;
      if (!bo.isNullOrNil(this.vin))
      {
        this.vio = this.vin.split(",");
        while (true)
        {
          k = j;
          if (j >= this.vio.length + i)
            break;
          bV(this.vio[(j - i)].trim(), false);
          j++;
        }
      }
      if (k < 5)
        bV(null, false);
      for (this.viq = false; ; this.viq = true)
      {
        AppMethodBeat.o(27513);
        return false;
      }
      i = 0;
    }
  }

  public void clearFocus()
  {
    AppMethodBeat.i(27511);
    for (int i = 1; i < this.vip.getChildCount(); i++)
      this.vip.getChildAt(i).clearFocus();
    AppMethodBeat.o(27511);
  }

  public final void djd()
  {
    AppMethodBeat.i(27518);
    if (this.vip.getChildCount() - 1 < 5)
      bV(null, false);
    while (true)
    {
      djj();
      AppMethodBeat.o(27518);
      return;
      this.viq = true;
    }
  }

  public final void dje()
  {
    AppMethodBeat.i(27517);
    djj();
    AppMethodBeat.o(27517);
  }

  public final void f(final MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
    AppMethodBeat.i(27516);
    if (paramMMPhoneNumberEditText.vhT)
    {
      h.a(getContext(), 2131300531, 0, 2131300530, 2131300529, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(27509);
          ProfileEditPhoneNumberView.this.vim = "";
          ProfileEditPhoneNumberView.this.vir.djk();
          ProfileEditPhoneNumberView.a(ProfileEditPhoneNumberView.this, paramMMPhoneNumberEditText);
          if (!ProfileEditPhoneNumberView.a(ProfileEditPhoneNumberView.this))
            ProfileEditPhoneNumberView.b(ProfileEditPhoneNumberView.this);
          AppMethodBeat.o(27509);
        }
      }
      , null);
      AppMethodBeat.o(27516);
    }
    while (true)
    {
      return;
      h(paramMMPhoneNumberEditText);
      if (this.viq)
      {
        bV(null, false);
        this.viq = false;
      }
      djj();
      AppMethodBeat.o(27516);
    }
  }

  public final void g(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
    AppMethodBeat.i(27519);
    if (this.vip.getChildCount() - 1 == 1)
      AppMethodBeat.o(27519);
    while (true)
    {
      return;
      h(paramMMPhoneNumberEditText);
      if (this.viq)
        bV(null, false);
      this.viq = false;
      djj();
      AppMethodBeat.o(27519);
    }
  }

  public int getLayout()
  {
    return 2130970406;
  }

  public ArrayList<String> getPhoneNumberList()
  {
    AppMethodBeat.i(27514);
    int i = this.vip.getChildCount();
    Object localObject;
    if (i == 1)
    {
      localObject = null;
      AppMethodBeat.o(27514);
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList(i - 1);
      for (int j = 1; j < i; j++)
      {
        String str = ((MMPhoneNumberEditText)this.vip.getChildAt(j)).getText().toString();
        if ((!bo.isNullOrNil(str)) && (!str.trim().equals("")))
          ((ArrayList)localObject).add(str);
      }
      if ((!bo.isNullOrNil(this.vim)) && (((ArrayList)localObject).size() > 0))
        ((ArrayList)localObject).remove(0);
      AppMethodBeat.o(27514);
    }
  }

  public final void hF(String paramString1, String paramString2)
  {
    AppMethodBeat.i(27512);
    this.vim = paramString1;
    this.vin = paramString2;
    cby();
    AppMethodBeat.o(27512);
  }

  public final void init()
  {
    AppMethodBeat.i(27510);
    this.vip = ((LinearLayout)findViewById(2131826653));
    AppMethodBeat.o(27510);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView
 * JD-Core Version:    0.6.2
 */