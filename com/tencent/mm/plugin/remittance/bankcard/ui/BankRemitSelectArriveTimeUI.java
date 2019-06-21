package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankRemitSelectArriveTimeUI extends MMPreference
{
  private f ehK;
  private List<EnterTimeParcel> pNZ;
  private List<Preference> pOa;
  private int pOb;

  public final int JC()
  {
    return 2130968824;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(44662);
    paramf = this.pOa.iterator();
    while (paramf.hasNext())
    {
      Preference localPreference = (Preference)paramf.next();
      if (localPreference == paramPreference)
        localPreference.setWidgetLayoutResource(2130970197);
      else
        localPreference.setWidgetLayoutResource(2130970198);
    }
    this.ehK.notifyDataSetChanged();
    paramf = (EnterTimeParcel)paramPreference.getExtras().getParcelable("arrive_time");
    if (paramf == null)
    {
      ab.i("MicroMsg.BankRemitSelectArriveTimeUI", "is header");
      AppMethodBeat.o(44662);
    }
    while (true)
    {
      return false;
      paramPreference = new Intent();
      paramPreference.putExtra("key_enter_time_scene", paramf.pLQ);
      setResult(-1, paramPreference);
      finish();
      AppMethodBeat.o(44662);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(44661);
    this.ehK = this.yCw;
    if ((this.pNZ != null) && (this.pNZ.size() > 0))
    {
      this.pOa = new ArrayList();
      int i = 0;
      if (i < this.pNZ.size())
      {
        EnterTimeParcel localEnterTimeParcel = (EnterTimeParcel)this.pNZ.get(i);
        ab.d("MicroMsg.BankRemitSelectArriveTimeUI", "enter scene: %d", new Object[] { Integer.valueOf(localEnterTimeParcel.pLQ) });
        Preference localPreference = new Preference(this);
        localPreference.setLayoutResource(2130968823);
        localPreference.yDf = false;
        localPreference.setKey(localEnterTimeParcel.pLQ);
        localPreference.setTitle(localEnterTimeParcel.pLR);
        if (localEnterTimeParcel.pLQ == this.pOb)
          localPreference.setWidgetLayoutResource(2130970197);
        while (true)
        {
          if (localEnterTimeParcel.pLT == 0)
          {
            if (!bo.isNullOrNil(localEnterTimeParcel.pLS))
              localPreference.setSummary(localEnterTimeParcel.pLS);
            localPreference.setEnabled(false);
          }
          localPreference.getExtras().putParcelable("arrive_time", localEnterTimeParcel);
          this.ehK.b(localPreference);
          this.pOa.add(localPreference);
          i++;
          break;
          localPreference.setWidgetLayoutResource(2130970198);
        }
      }
    }
    AppMethodBeat.o(44661);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44660);
    super.onCreate(paramBundle);
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131689748)));
    paramBundle = getSupportActionBar().getCustomView();
    if (paramBundle != null)
    {
      View localView = paramBundle.findViewById(2131821128);
      if (localView != null)
        localView.setBackgroundColor(getResources().getColor(2131689761));
      paramBundle = paramBundle.findViewById(16908308);
      if ((paramBundle != null) && ((paramBundle instanceof TextView)))
        ((TextView)paramBundle).setTextColor(getResources().getColor(2131689761));
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(-2147483648);
      paramBundle.setStatusBarColor(getResources().getColor(2131689748));
    }
    BankRemitBaseUI.Y(this);
    this.mController.contentView.setFitsSystemWindows(true);
    setMMTitle(2131297477);
    this.pNZ = getIntent().getParcelableArrayListExtra("key_arrive_time_parcel_list");
    this.pOb = getIntent().getIntExtra("key_select_arrive_time", -1);
    initView();
    findViewById(16908298).setBackgroundColor(getResources().getColor(2131689748));
    setBackBtn(new BankRemitSelectArriveTimeUI.1(this), 2131230737);
    AppMethodBeat.o(44660);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectArriveTimeUI
 * JD-Core Version:    0.6.2
 */