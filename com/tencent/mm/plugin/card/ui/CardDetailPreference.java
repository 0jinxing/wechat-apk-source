package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.widget.CardTextPreference;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CardDetailPreference extends MMPreference
{
  private final String TAG;
  f iFE;
  private com.tencent.mm.plugin.card.base.b kaS;
  private List<com.tencent.mm.plugin.card.model.b> kaW;
  private TextView kiK;

  public CardDetailPreference()
  {
    AppMethodBeat.i(88257);
    this.TAG = "MicroMsg.CardDetailPreference";
    this.kaW = new ArrayList();
    AppMethodBeat.o(88257);
  }

  private void GP(String paramString)
  {
    AppMethodBeat.i(88266);
    PreferenceTitleCategory localPreferenceTitleCategory = new PreferenceTitleCategory(this);
    if (TextUtils.isEmpty(paramString))
      localPreferenceTitleCategory.setTitle(" ");
    while (true)
    {
      this.iFE.b(localPreferenceTitleCategory);
      AppMethodBeat.o(88266);
      return;
      localPreferenceTitleCategory.setTitle(paramString);
    }
  }

  private void bbC()
  {
    AppMethodBeat.i(88260);
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(this.kaS.aZV().kdf))
      localStringBuilder.append(this.kaS.aZV().kdf);
    localStringBuilder.append(getString(2131297833));
    setMMTitle(localStringBuilder.toString());
    AppMethodBeat.o(88260);
  }

  private void bca()
  {
    AppMethodBeat.i(88261);
    this.kaW.clear();
    if ((this.kaS.aZW().vRX != null) && (this.kaS.aZW().vRX.size() > 0))
      this.kaW.addAll(l.bj(this.kaS.aZW().vRX));
    if ((this.kaS.aZW().vRY != null) && (this.kaS.aZW().vRY.size() > 0))
    {
      List localList = l.bj(this.kaS.aZW().vRY);
      ((com.tencent.mm.plugin.card.model.b)localList.get(0)).kch = true;
      this.kaW.addAll(localList);
    }
    AppMethodBeat.o(88261);
  }

  private void bcb()
  {
    AppMethodBeat.i(88262);
    bce();
    bcd();
    bcc();
    bcf();
    bcg();
    AppMethodBeat.o(88262);
  }

  private void bcc()
  {
    AppMethodBeat.i(88263);
    for (int i = 0; i < this.kaW.size(); i++)
    {
      com.tencent.mm.plugin.card.model.b localb = (com.tencent.mm.plugin.card.model.b)this.kaW.get(i);
      Preference localPreference = new Preference(this);
      localPreference.setLayoutResource(2130970127);
      localPreference.setKey(localb.title);
      localPreference.setTitle(localb.title);
      if (!TextUtils.isEmpty(localb.kbW))
        localPreference.setSummary(localb.kbW);
      if (localb.kch)
        bce();
      this.iFE.b(localPreference);
    }
    AppMethodBeat.o(88263);
  }

  private void bcd()
  {
    AppMethodBeat.i(88264);
    if ((this.kaS.aZV().vTX != null) && (this.kaS.aZV().vTX != null))
    {
      for (int i = 0; i < this.kaS.aZV().vTX.size(); i++)
      {
        tm localtm = (tm)this.kaS.aZV().vTX.get(i);
        if (!TextUtils.isEmpty(localtm.kbW))
        {
          CardTextPreference localCardTextPreference = new CardTextPreference(this);
          localCardTextPreference.setLayoutResource(2130970127);
          localCardTextPreference.setTitle(localtm.kbW);
          localCardTextPreference.beH();
          GP(localtm.title);
          this.iFE.b(localCardTextPreference);
        }
      }
      bce();
    }
    AppMethodBeat.o(88264);
  }

  private void bce()
  {
    AppMethodBeat.i(88265);
    PreferenceSmallCategory localPreferenceSmallCategory = new PreferenceSmallCategory(this);
    this.iFE.b(localPreferenceSmallCategory);
    AppMethodBeat.o(88265);
  }

  private void bcf()
  {
    AppMethodBeat.i(88267);
    if (!TextUtils.isEmpty(this.kaS.aZV().vTY))
    {
      CardTextPreference localCardTextPreference = new CardTextPreference(this);
      localCardTextPreference.setLayoutResource(2130970127);
      localCardTextPreference.setTitle(getString(2131297938));
      localCardTextPreference.setKey("key_pic_detail");
      localCardTextPreference.beH();
      bce();
      this.iFE.b(localCardTextPreference);
    }
    AppMethodBeat.o(88267);
  }

  private void bcg()
  {
    AppMethodBeat.i(88268);
    if (!TextUtils.isEmpty(this.kaS.aZV().vTV))
    {
      bce();
      CardTextPreference localCardTextPreference = new CardTextPreference(this);
      localCardTextPreference.setLayoutResource(2130970127);
      localCardTextPreference.setKey("card_phone");
      localCardTextPreference.setTitle(2131297914);
      localCardTextPreference.setSummary(this.kaS.aZV().vTV);
      localCardTextPreference.tp(getResources().getColor(2131690208));
      this.iFE.b(localCardTextPreference);
      GP("");
    }
    AppMethodBeat.o(88268);
  }

  private void bch()
  {
    AppMethodBeat.i(88270);
    if ((this.kaS.aZV() != null) && (!TextUtils.isEmpty(this.kaS.aZV().source)) && (this.kiK != null))
    {
      this.kiK.setText(this.kaS.aZV().source);
      this.kiK.setVisibility(0);
    }
    AppMethodBeat.o(88270);
  }

  public final int JC()
  {
    return 2131165199;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(88269);
    if (paramPreference.mKey.equals("card_phone"))
    {
      String str = this.kaS.aZV().vTV;
      paramf = new Intent("android.intent.action.DIAL");
      paramf.setFlags(268435456);
      paramf.setData(Uri.parse("tel:".concat(String.valueOf(str))));
      startActivity(paramf);
    }
    if (paramPreference.mKey.equals("key_pic_detail"))
      com.tencent.mm.plugin.card.d.b.a(this, this.kaS.aZV().vTY, 0);
    label222: 
    while (true)
    {
      AppMethodBeat.o(88269);
      return false;
      for (int i = 0; ; i++)
      {
        if (i >= this.kaW.size())
          break label222;
        paramf = (com.tencent.mm.plugin.card.model.b)this.kaW.get(i);
        if ((paramf.title != null) && (paramf.title.equals(paramPreference.mKey)) && (!TextUtils.isEmpty(paramf.url)))
        {
          if (com.tencent.mm.plugin.card.d.b.d(this.kaS.aZZ(), paramf.vTL, paramf.vTM, 1028, 0))
          {
            AppMethodBeat.o(88269);
            break;
          }
          com.tencent.mm.plugin.card.d.b.a(this, paramf.url, 1);
        }
      }
    }
  }

  public final View aWz()
  {
    AppMethodBeat.i(88271);
    View localView = getLayoutInflater().inflate(2130970843, null);
    this.kiK = ((TextView)localView.findViewById(2131826911));
    this.kiK.setVisibility(8);
    AppMethodBeat.o(88271);
    return localView;
  }

  public final void initView()
  {
    AppMethodBeat.i(88259);
    this.kaS = ((com.tencent.mm.plugin.card.base.b)getIntent().getParcelableExtra("key_card_info_data"));
    if ((this.kaS == null) || (this.kaS.aZV() == null) || (this.kaS.aZW() == null))
    {
      ab.e("MicroMsg.CardDetailPreference", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
      finish();
      AppMethodBeat.o(88259);
    }
    while (true)
    {
      return;
      bbC();
      setBackBtn(new CardDetailPreference.1(this));
      this.iFE = this.yCw;
      bca();
      bcb();
      bch();
      AppMethodBeat.o(88259);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88258);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(88258);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardDetailPreference
 * JD-Core Version:    0.6.2
 */