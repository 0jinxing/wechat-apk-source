package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.p;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.a.j;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.plugin.scanner.util.o.a.a;
import com.tencent.mm.plugin.scanner.util.o.a.a.a;
import com.tencent.mm.plugin.scanner.util.o.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMPageControlView;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductFurtherInfoUI extends MMPreference
{
  private ViewPager MI;
  protected f iFE;
  private MMPageControlView qcC;
  private o.a.a qcD;
  private String qcE;

  public final int JC()
  {
    return 2131165258;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    return false;
  }

  public final int aWi()
  {
    return 2130970383;
  }

  public final int getLayoutId()
  {
    return 2130970382;
  }

  public final void initView()
  {
    int i = 0;
    AppMethodBeat.i(81057);
    setMMTitle(getIntent().getStringExtra("key_title"));
    setBackBtn(new ProductFurtherInfoUI.1(this));
    addIconOptionMenu(0, 2130839555, new ProductFurtherInfoUI.2(this));
    this.iFE = this.yCw;
    Object localObject1 = new ArrayList();
    Object localObject2 = this.qcD.qiN.iterator();
    while (((Iterator)localObject2).hasNext())
      ((List)localObject1).add(((o.a.a.a)((Iterator)localObject2).next()).link);
    this.MI = ((ViewPager)findViewById(2131823829));
    this.qcC = ((MMPageControlView)findViewById(2131821395));
    this.qcC.setIndicatorLayoutRes(2130970342);
    this.qcC.setVisibility(0);
    this.MI.setOnTouchListener(new ProductFurtherInfoUI.3(this));
    this.MI.setOnPageChangeListener(new ProductFurtherInfoUI.4(this));
    localObject2 = new ProductFurtherInfoUI.a(this, this);
    this.MI.setAdapter((p)localObject2);
    int j = i;
    if (((List)localObject1).size() > 0)
    {
      ((ProductFurtherInfoUI.a)localObject2).cW((List)localObject1);
      this.MI.setVisibility(0);
    }
    for (j = i; j < this.qcD.qiO.size(); j++)
    {
      localObject1 = (o.a.a.b)this.qcD.qiO.get(j);
      localObject2 = new Preference(this);
      ((Preference)localObject2).setKey(String.valueOf(j));
      ((Preference)localObject2).setLayoutResource(2130970264);
      ((Preference)localObject2).setTitle(((o.a.a.b)localObject1).title);
      ((Preference)localObject2).setSummary(((o.a.a.b)localObject1).desc);
      this.iFE.b((Preference)localObject2);
    }
    this.iFE.notifyDataSetChanged();
    AppMethodBeat.o(81057);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(81056);
    super.onCreate(paramBundle);
    paramBundle = j.cV(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
    if ((paramBundle == null) || (paramBundle.qiM == null))
    {
      ab.e("MicroMsg.ProductFurtherInfoUI", "initView(), product or product field detail null -> finish");
      finish();
      AppMethodBeat.o(81056);
    }
    while (true)
    {
      return;
      this.qcD = paramBundle.qiM;
      this.qcE = paramBundle.field_feedbackurl;
      initView();
      AppMethodBeat.o(81056);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI
 * JD-Core Version:    0.6.2
 */