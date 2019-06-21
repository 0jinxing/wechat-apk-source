package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bzo;
import com.tencent.mm.protocal.protobuf.gd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;

@a(3)
public class AppBrandIDCardUI extends MMActivity
{
  public static final int iKc = 2131820557;
  private String appId;
  private int flQ;
  private AppBrandIDCardUI.a iJN;
  public MMFragment iKd;
  private bzo iKe;
  private gd iKf;
  private LinkedList<Integer> iKg;
  private String iKh;
  private String iKi;
  private p ifC;

  public AppBrandIDCardUI()
  {
    AppMethodBeat.i(133238);
    this.iJN = new AppBrandIDCardUI.1(this);
    AppMethodBeat.o(133238);
  }

  private static LinkedList<Integer> D(Bundle paramBundle)
  {
    AppMethodBeat.i(133244);
    LinkedList localLinkedList = new LinkedList();
    try
    {
      paramBundle = paramBundle.getString("intent_category_id");
      ab.i("MicroMsg.AppBrandIDCardUI", "[processCategoryId] categoryIdStr:%s", new Object[] { paramBundle });
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramBundle);
      for (int i = 0; i < localJSONArray.length(); i++)
        localLinkedList.add(Integer.valueOf(localJSONArray.optInt(i)));
      AppMethodBeat.o(133244);
      paramBundle = localLinkedList;
      return paramBundle;
    }
    catch (JSONException paramBundle)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandIDCardUI", paramBundle, "", new Object[0]);
        paramBundle = null;
        AppMethodBeat.o(133244);
      }
    }
  }

  private void aMD()
  {
    AppMethodBeat.i(133245);
    ab.i("MicroMsg.AppBrandIDCardUI", "switchToShowFragment");
    this.iKd = new AppBrandIDCardShowFrag();
    ((AppBrandIDCardShowFrag)this.iKd).iJN = this.iJN;
    getSupportFragmentManager().beginTransaction().b(iKc, this.iKd).commitAllowingStateLoss();
    AppMethodBeat.o(133245);
  }

  private void back()
  {
    AppMethodBeat.i(133242);
    if ((this.iKd instanceof AppBrandIDCardVerifyPwdFrag))
    {
      aMD();
      AppMethodBeat.o(133242);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(133242);
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final boolean noActionBar()
  {
    return true;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(133241);
    back();
    AppMethodBeat.o(133241);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(133240);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getExtras();
    if (paramBundle == null)
    {
      ab.e("MicroMsg.AppBrandIDCardUI", "bundle is null, return");
      finish();
      AppMethodBeat.o(133240);
    }
    while (true)
    {
      return;
      this.appId = paramBundle.getString("intent_appid", "");
      if (bo.isNullOrNil(this.appId))
      {
        ab.e("MicroMsg.AppBrandIDCardUI", "appId is null, return");
        finish();
        AppMethodBeat.o(133240);
      }
      else
      {
        this.iKg = D(paramBundle);
        if ((bo.ek(this.iKg)) || (this.iKg.size() <= 0))
        {
          ab.e("MicroMsg.AppBrandIDCardUI", "categoryId is null, return");
          paramBundle = new Intent();
          paramBundle.putExtra("intent_err_code", 40003);
          paramBundle.putExtra("intent_err_msg", "category_id is null");
          setResult(1, paramBundle);
          finish();
          AppMethodBeat.o(133240);
        }
        else
        {
          this.flQ = paramBundle.getInt("intent_auth_type", 1);
          this.mController.contentView.setBackgroundColor(getResources().getColor(2131690310));
          ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
          paramBundle = new FrameLayout(this);
          paramBundle.setId(iKc);
          ((ViewGroup)this.mController.contentView).addView(paramBundle, localLayoutParams);
          setBackBtn(new AppBrandIDCardUI.2(this));
          getString(2131297061);
          this.ifC = h.b(this, getString(2131300968), true, new AppBrandIDCardUI.3(this));
          this.ifC.show();
          this.iJN.aME();
          if (isSupportNavigationSwipeBack())
            getSwipeBackLayout().setEnableGesture(false);
          AppMethodBeat.o(133240);
        }
      }
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(133239);
    super.onCreateBeforeSetContentView();
    getWindow().requestFeature(10);
    getWindow().getDecorView().setFitsSystemWindows(true);
    supportRequestWindowFeature(10);
    supportRequestWindowFeature(1);
    AppMethodBeat.o(133239);
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(133243);
    back();
    AppMethodBeat.o(133243);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI
 * JD-Core Version:    0.6.2
 */