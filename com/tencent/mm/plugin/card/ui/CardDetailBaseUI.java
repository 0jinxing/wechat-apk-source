package com.tencent.mm.plugin.card.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.statusbar.a;
import com.tencent.mm.ui.v;

public abstract class CardDetailBaseUI extends MMActivity
{
  private TextView iDT;
  private View iJO;
  private ImageView kiE;
  private TextView kiF;
  ImageView kiG;
  private View kiH;

  public final void O(int paramInt, boolean paramBoolean)
  {
    this.iJO.setBackgroundColor(paramInt);
    if (paramBoolean)
    {
      this.iDT.setTextColor(getResources().getColor(2131689761));
      this.kiF.setTextColor(getResources().getColor(2131689761));
      this.kiE.setImageResource(2131230737);
      this.kiG.setImageResource(2130838107);
      this.kiH.setBackgroundColor(getResources().getColor(2131689645));
    }
    while (true)
    {
      a.d(this.mController.contentView, paramInt, paramBoolean);
      return;
      this.iDT.setTextColor(getResources().getColor(2131690691));
      this.kiF.setTextColor(getResources().getColor(2131690691));
      this.kiE.setImageResource(2131230737);
      this.kiG.setImageResource(2130839555);
      this.kiH.setBackgroundColor(getResources().getColor(2131690157));
    }
  }

  public final void fH(boolean paramBoolean)
  {
    ImageView localImageView = this.kiG;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      return;
    }
  }

  public final boolean noActionBar()
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iJO = v.hu(this.mController.ylL).inflate(2130968911, null);
    this.iJO.setBackgroundColor(getResources().getColor(2131689639));
    this.iDT = ((TextView)this.iJO.findViewById(2131820965));
    this.kiF = ((TextView)this.iJO.findViewById(2131820966));
    this.kiE = ((ImageView)this.iJO.findViewById(2131820964));
    this.kiG = ((ImageView)this.iJO.findViewById(2131822006));
    this.kiH = this.iJO.findViewById(2131821128);
    LinearLayout localLinearLayout;
    Object localObject;
    if ((this.mController.contentView != null) && (((ViewGroup)this.mController.contentView).getChildCount() > 0))
    {
      paramBundle = ((ViewGroup)this.mController.contentView).getChildAt(0);
      ((ViewGroup)this.mController.contentView).removeView(paramBundle);
      localLinearLayout = new LinearLayout(this);
      localLinearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      localLinearLayout.setOrientation(1);
      localObject = getResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject).widthPixels <= ((DisplayMetrics)localObject).heightPixels)
        break label270;
    }
    label270: for (int i = getResources().getDimensionPixelSize(2131427562); ; i = getResources().getDimensionPixelSize(2131427563))
    {
      localObject = new LinearLayout.LayoutParams(-1, i);
      localLinearLayout.addView(this.iJO, (ViewGroup.LayoutParams)localObject);
      localLinearLayout.addView(paramBundle);
      ((ViewGroup)this.mController.contentView).addView(localLinearLayout);
      return;
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    super.onCreateBeforeSetContentView();
    supportRequestWindowFeature(10);
    supportRequestWindowFeature(1);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.kiE.setOnClickListener(new CardDetailBaseUI.1(this, paramOnMenuItemClickListener));
  }

  public final void setMMSubTitle(String paramString)
  {
    this.kiF.setText(paramString);
  }

  public final void setMMTitle(String paramString)
  {
    this.iDT.setText(paramString);
  }

  public final void ta(int paramInt)
  {
    this.iDT.setTextColor(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardDetailBaseUI
 * JD-Core Version:    0.6.2
 */