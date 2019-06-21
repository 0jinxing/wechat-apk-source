package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.honey_pay.a.b;
import com.tencent.mm.plugin.honey_pay.model.HoneyPayCardType;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.asi;
import com.tencent.mm.protocal.protobuf.asj;
import com.tencent.mm.protocal.protobuf.ask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HoneyPaySelectCardTypeUI extends HoneyPayBaseUI
{
  private LinearLayout ntf;
  private List<asj> ntg;
  private int nth;
  private ask nti;

  private void refreshView()
  {
    AppMethodBeat.i(41961);
    this.ntf.removeAllViews();
    if ((this.ntg == null) || (this.ntg.isEmpty()))
      AppMethodBeat.o(41961);
    while (true)
    {
      return;
      Iterator localIterator = this.ntg.iterator();
      if (localIterator.hasNext())
      {
        asj localasj = (asj)localIterator.next();
        HoneyPaySelectCardTypeUI.a locala = new HoneyPaySelectCardTypeUI.a(this, (byte)0);
        Object localObject1;
        Object localObject2;
        if (localasj.wpr == null)
        {
          localObject1 = this.mController.ylL;
          localObject2 = this.ntf;
          localObject1 = LayoutInflater.from((Context)localObject1).inflate(2130969836, (ViewGroup)localObject2, false);
          locala.a((View)localObject1, localasj);
        }
        while (true)
        {
          this.ntf.addView((View)localObject1);
          break;
          localObject2 = this.mController.ylL;
          localObject1 = this.ntf;
          localObject1 = LayoutInflater.from((Context)localObject2).inflate(2130969837, (ViewGroup)localObject1, false);
          locala.a((View)localObject1, localasj);
          locala.nrl = ((CdnImageView)((View)localObject1).findViewById(2131824946));
          locala.ntm = ((TextView)((View)localObject1).findViewById(2131824947));
          locala.nrl.setUrl(localasj.wpr.cIY);
          SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
          localSpannableStringBuilder.append(localasj.wpr.wvU);
          localSpannableStringBuilder.append(localasj.wpr.wvV);
          localSpannableStringBuilder.setSpan(new o(new HoneyPaySelectCardTypeUI.a.1(locala, localasj, (Context)localObject2)), localasj.wpr.wvU.length(), localSpannableStringBuilder.length(), 34);
          locala.ntm.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.e.m((Context)localObject2));
          locala.ntm.setClickable(true);
          locala.ntm.setText(localSpannableStringBuilder);
        }
      }
      AppMethodBeat.o(41961);
    }
  }

  public final boolean aoE()
  {
    return false;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(41959);
    if ((paramm instanceof b))
    {
      paramString = (b)paramm;
      paramString.a(new HoneyPaySelectCardTypeUI.3(this, paramString)).b(new HoneyPaySelectCardTypeUI.2(this)).c(new HoneyPaySelectCardTypeUI.1(this));
    }
    AppMethodBeat.o(41959);
    return true;
  }

  public final int getLayoutId()
  {
    return 2130969838;
  }

  public final void initView()
  {
    AppMethodBeat.i(41957);
    this.ntf = ((LinearLayout)findViewById(2131824948));
    AppMethodBeat.o(41957);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41960);
    if (paramInt1 == 1)
    {
      if (paramInt2 != -1)
        break label102;
      Object localObject = paramIntent.getStringExtra("Select_Conv_User");
      ab.i("MicroMsg.HoneyPaySelectCardTypeUI", "select friend: %s", new Object[] { localObject });
      ab.i("MicroMsg.HoneyPaySelectCardTypeUI", "do check user: %s", new Object[] { localObject });
      localObject = new b((String)localObject, this.nth);
      ((b)localObject).o(this);
      a((com.tencent.mm.ai.m)localObject, true, false);
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(41960);
      return;
      label102: ab.i("MicroMsg.HoneyPaySelectCardTypeUI", "cancel add friend");
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41956);
    this.nqT = 2131690166;
    super.onCreate(paramBundle);
    nf(2618);
    nf(2926);
    setMMTitle(2131300592);
    paramBundle = getIntent().getParcelableArrayListExtra("key_card_type_list");
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      this.ntg = new ArrayList();
      try
      {
        Iterator localIterator = paramBundle.iterator();
        while (localIterator.hasNext())
        {
          HoneyPayCardType localHoneyPayCardType = (HoneyPayCardType)localIterator.next();
          paramBundle = new com/tencent/mm/protocal/protobuf/asj;
          paramBundle.<init>();
          paramBundle.parseFrom(localHoneyPayCardType.wR);
          this.ntg.add(paramBundle);
        }
      }
      catch (IOException paramBundle)
      {
        ab.printErrStackTrace("MicroMsg.HoneyPaySelectCardTypeUI", paramBundle, "", new Object[0]);
      }
    }
    initView();
    refreshView();
    AppMethodBeat.o(41956);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41958);
    ng(2618);
    ng(2926);
    super.onDestroy();
    AppMethodBeat.o(41958);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI
 * JD-Core Version:    0.6.2
 */