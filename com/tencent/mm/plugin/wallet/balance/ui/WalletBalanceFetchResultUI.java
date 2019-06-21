package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo;
import com.tencent.mm.plugin.wallet_core.model.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

@a(19)
public class WalletBalanceFetchResultUI extends WalletBaseUI
{
  private LinearLayout nsy;
  private ImageView pNb;
  private ImageView pNc;
  private ImageView pNd;
  private TextView pNe;
  private TextView pNf;
  private TextView pNg;
  private TextView pNh;
  private TextView pNi;
  private TextView pNj;
  private Orders pWy;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130968816;
  }

  public final void initView()
  {
    AppMethodBeat.i(45351);
    this.pNb = ((ImageView)findViewById(2131821647));
    this.pNc = ((ImageView)findViewById(2131821651));
    this.pNd = ((ImageView)findViewById(2131821655));
    this.pNb.setImageResource(2130837843);
    this.pNc.setScaleType(ImageView.ScaleType.CENTER_CROP);
    this.pNc.setImageResource(2131231871);
    this.pNd.setImageResource(2130837844);
    this.pNe = ((TextView)findViewById(2131821648));
    this.pNf = ((TextView)findViewById(2131821652));
    this.pNg = ((TextView)findViewById(2131821656));
    this.pNe.setText(2131304547);
    this.pNf.setText(2131304545);
    this.pNf.setTextColor(getResources().getColor(2131690316));
    this.pNg.setText(2131304542);
    this.pNh = ((TextView)findViewById(2131821649));
    this.pNi = ((TextView)findViewById(2131821653));
    this.pNj = ((TextView)findViewById(2131821657));
    this.pNh.setVisibility(8);
    Object localObject1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    this.pNi.setText(getString(2131304533, new Object[] { ((SimpleDateFormat)localObject1).format(new Date(this.pWy.tAk)) }));
    this.pNi.setVisibility(0);
    this.pNj.setVisibility(8);
    this.nsy = ((LinearLayout)findViewById(2131821660));
    this.nsy.setBackgroundResource(2130837842);
    Object localObject2 = this.mBundle.getString("key_fetch_result_show_info");
    localObject1 = new ArrayList();
    if (!bo.isNullOrNil((String)localObject2))
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject2);
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          localObject2 = j.a.az(localJSONArray.optJSONObject(i));
          if (localObject2 != null)
            ((List)localObject1).add(localObject2);
        }
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.WalletBalanceFetchResultUI", localJSONException, "", new Object[0]);
      }
    ab.d("MicroMsg.WalletBalanceFetchResultUI", "show info: %s", new Object[] { Integer.valueOf(((List)localObject1).size()) });
    Object localObject3;
    if (!((List)localObject1).isEmpty())
    {
      localObject3 = ((List)localObject1).iterator();
      j.a locala;
      do
      {
        if (!((Iterator)localObject3).hasNext())
          break;
        locala = (j.a)((Iterator)localObject3).next();
      }
      while (locala.tzj == null);
      label465: String str1;
      String str2;
      String str3;
      if (locala.id != 3)
      {
        bool = true;
        localObject2 = new WalletBalanceFetchResultItemView(this, bool);
        localObject1 = locala.tzj.name;
        str1 = locala.tzj.value;
        str2 = locala.tzj.mVA;
        str3 = locala.tzj.tBF;
        if (locala.id != 3)
          break label557;
      }
      label557: for (boolean bool = true; ; bool = false)
      {
        ((WalletBalanceFetchResultItemView)localObject2).a((String)localObject1, str1, str2, str3, bool);
        this.nsy.addView((View)localObject2);
        break;
        bool = false;
        break label465;
      }
    }
    localObject1 = new WalletBalanceFetchResultItemView(this, true);
    ((WalletBalanceFetchResultItemView)localObject1).b(2131304569, e.e(this.pWy.pTN, this.pWy.pcl));
    this.nsy.addView((View)localObject1);
    if (this.pWy.pPp > 0.0D)
    {
      localObject1 = new WalletBalanceFetchResultItemView(this, true);
      ((WalletBalanceFetchResultItemView)localObject1).b(2131304561, e.e(this.pWy.pPp, this.pWy.pcl));
      this.nsy.addView((View)localObject1);
    }
    if ((this.pWy.tAq != null) && (this.pWy.tAq.size() > 0))
    {
      localObject3 = (Orders.Commodity)this.pWy.tAq.get(0);
      localObject1 = ((Orders.Commodity)localObject3).pcj;
      if (bo.isNullOrNil(((Orders.Commodity)localObject3).tAT))
        break label830;
      localObject1 = (String)localObject1 + " " + getString(2131305177) + ((Orders.Commodity)localObject3).tAT;
    }
    label830: 
    while (true)
    {
      localObject3 = new WalletBalanceFetchResultItemView(this);
      ((WalletBalanceFetchResultItemView)localObject3).b(2131304529, (CharSequence)localObject1);
      this.nsy.addView((View)localObject3);
      ((Button)findViewById(2131821663)).setOnClickListener(new WalletBalanceFetchResultUI.2(this));
      findViewById(2131821658).setVisibility(8);
      findViewById(2131821661).setVisibility(8);
      AppMethodBeat.o(45351);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45350);
    super.onCreate(paramBundle);
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131690691)));
    View localView = getSupportActionBar().getCustomView();
    if (localView != null)
    {
      paramBundle = localView.findViewById(2131821128);
      if (paramBundle != null)
        paramBundle.setBackgroundColor(getResources().getColor(2131690157));
      paramBundle = localView.findViewById(16908308);
      if ((paramBundle != null) && ((paramBundle instanceof TextView)))
        ((TextView)paramBundle).setTextColor(getResources().getColor(2131689761));
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(-2147483648);
      paramBundle.setStatusBarColor(getResources().getColor(2131690691));
      if (Build.VERSION.SDK_INT >= 23)
        getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    this.mController.contentView.setFitsSystemWindows(true);
    this.pWy = ((Orders)this.mBundle.getParcelable("key_orders"));
    if (this.pWy == null)
    {
      ab.w("MicroMsg.WalletBalanceFetchResultUI", "order is null!");
      finish();
      AppMethodBeat.o(45350);
    }
    while (true)
    {
      return;
      initView();
      setMMTitle((String)dOE().Au(0));
      setBackBtn(new WalletBalanceFetchResultUI.1(this));
      AppMethodBeat.o(45350);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI
 * JD-Core Version:    0.6.2
 */