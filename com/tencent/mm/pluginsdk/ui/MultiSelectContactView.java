package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.b.c;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultiSelectContactView extends LinearLayout
{
  private LayoutInflater ezi;
  private View jWH;
  private LinearLayout jXw;
  private int padding;
  private HorizontalScrollView vhW;
  private View vhX;
  public MMEditText vhY;
  private List<String> vhZ;
  private Animation vib;
  private int vic;
  private MultiSelectContactView.a vid;
  private MultiSelectContactView.b vie;
  private MultiSelectContactView.c vif;
  private List<View> vig;
  boolean vih;

  public MultiSelectContactView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105165);
    this.vic = 0;
    this.padding = 0;
    this.vih = false;
    this.padding = getResources().getDimensionPixelSize(2131427500);
    this.ezi = LayoutInflater.from(paramContext);
    this.ezi.inflate(2130970276, this, true);
    this.vhW = ((HorizontalScrollView)findViewById(2131826271));
    this.vhY = ((MMEditText)findViewById(2131823253));
    this.jXw = ((LinearLayout)findViewById(2131826272));
    this.vhX = findViewById(2131823252);
    this.vhZ = new LinkedList();
    this.vib = AnimationUtils.loadAnimation(paramContext, 2131034180);
    c.d(this.vhY).PM(100).a(null);
    this.jWH = findViewById(2131820987);
    this.vhY.addTextChangedListener(new MultiSelectContactView.1(this));
    this.vhY.setOnKeyListener(new MultiSelectContactView.2(this));
    this.vig = new ArrayList();
    this.vhY.clearFocus();
    this.vhY.setOnFocusChangeListener(new MultiSelectContactView.3(this));
    setBackgroundColor(-201326593);
    setOnClickListener(new MultiSelectContactView.4(this));
    AppMethodBeat.o(105165);
  }

  private void KN(int paramInt)
  {
    AppMethodBeat.i(105175);
    int j;
    if (this.vic <= 0)
    {
      this.vic += getResources().getDimensionPixelSize(2131427779);
      int i = BackwardSupportUtil.b.b(getContext(), 40.0F);
      j = (int)this.vhY.getPaint().measureText(getContext().getString(2131297040));
      int k = this.vic;
      this.vic = (Math.max(i, j) + k);
    }
    if (this.vic <= 0)
      AppMethodBeat.o(105175);
    while (true)
    {
      return;
      j = this.jWH.getWidth();
      paramInt *= (getResources().getDimensionPixelSize(2131427550) + getResources().getDimensionPixelSize(2131427500));
      ab.v("MicroMsg.MultiSeclectContactView", "parentWidth:%d, avatarWidth:%d, minInputAreaWidth:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(this.vic) });
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.vhW.getLayoutParams();
      if (j - paramInt > this.vic)
      {
        localLayoutParams.width = -2;
        AppMethodBeat.o(105175);
      }
      else
      {
        localLayoutParams.width = (j - this.vic);
        AppMethodBeat.o(105175);
      }
    }
  }

  private View ajs(String paramString)
  {
    AppMethodBeat.i(105178);
    int i = this.jXw.getChildCount();
    int j = 0;
    if (j < i)
    {
      View localView = this.jXw.getChildAt(j);
      if (paramString.equals(localView.getTag()))
      {
        AppMethodBeat.o(105178);
        paramString = localView;
      }
    }
    while (true)
    {
      return paramString;
      j++;
      break;
      paramString = null;
      AppMethodBeat.o(105178);
    }
  }

  private void c(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(105173);
    if ((paramBoolean1) && (this.vid != null))
      this.vid.vI(paramView.getTag().toString());
    if (paramBoolean2)
    {
      Animation localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034181);
      localAnimation.setAnimationListener(new MultiSelectContactView.6(this, paramView));
      paramView.startAnimation(localAnimation);
      AppMethodBeat.o(105173);
    }
    while (true)
    {
      return;
      this.jXw.removeView(paramView);
      djh();
      KN(this.jXw.getChildCount());
      AppMethodBeat.o(105173);
    }
  }

  private void djf()
  {
    AppMethodBeat.i(105171);
    if (this.jXw.getChildCount() == 0)
      AppMethodBeat.o(105171);
    while (true)
    {
      return;
      if (this.vih)
      {
        View localView = this.jXw.getChildAt(this.jXw.getChildCount() - 1);
        this.vih = false;
        localView.findViewById(2131827308).setVisibility(8);
      }
      AppMethodBeat.o(105171);
    }
  }

  private void djg()
  {
    AppMethodBeat.i(105174);
    this.jXw.post(new MultiSelectContactView.7(this));
    AppMethodBeat.o(105174);
  }

  private void djh()
  {
    AppMethodBeat.i(105176);
    if (this.jXw.getChildCount() == 0)
    {
      this.vhX.setVisibility(0);
      AppMethodBeat.o(105176);
    }
    while (true)
    {
      return;
      this.vhX.setVisibility(8);
      AppMethodBeat.o(105176);
    }
  }

  public final void ajq(String paramString)
  {
    AppMethodBeat.i(105169);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(105169);
    while (true)
    {
      return;
      if (this.vhZ.contains(paramString))
      {
        ab.i("MicroMsg.MultiSeclectContactView", "fixed user cant change");
        AppMethodBeat.o(105169);
      }
      else
      {
        djf();
        View localView = ajs(paramString);
        if (localView != null)
        {
          c(localView, false, false);
          AppMethodBeat.o(105169);
        }
        else
        {
          bU(paramString, true);
          AppMethodBeat.o(105169);
        }
      }
    }
  }

  public final void ajr(String paramString)
  {
    AppMethodBeat.i(105170);
    paramString = ajs(paramString);
    if (paramString != null)
    {
      c(paramString, false, false);
      AppMethodBeat.o(105170);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(105170);
    }
  }

  public final void bU(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105172);
    KN(this.jXw.getChildCount() + 1);
    View localView = this.ezi.inflate(2130970584, null, true);
    ImageView localImageView = (ImageView)localView.findViewById(2131823704);
    a.b.b(localImageView, paramString);
    localImageView.setContentDescription(((b)g.K(b.class)).mJ(paramString));
    localView.setTag(paramString);
    localView.setOnClickListener(new MultiSelectContactView.5(this));
    if (paramBoolean)
      localView.startAnimation(this.vib);
    this.jXw.addView(localView);
    djh();
    paramString = (LinearLayout.LayoutParams)localView.getLayoutParams();
    paramString.height = getResources().getDimensionPixelSize(2131427550);
    paramString.width = getResources().getDimensionPixelSize(2131427550);
    paramString.rightMargin = getResources().getDimensionPixelSize(2131427500);
    localView.setLayoutParams(paramString);
    djg();
    AppMethodBeat.o(105172);
  }

  public void clearFocus()
  {
    AppMethodBeat.i(105168);
    this.vhY.clearFocus();
    djf();
    AppMethodBeat.o(105168);
  }

  public EditText getInputText()
  {
    return this.vhY;
  }

  public String getSearchContent()
  {
    AppMethodBeat.i(105177);
    String str = this.vhY.getText().toString();
    AppMethodBeat.o(105177);
    return str;
  }

  public int getSelectedCount()
  {
    AppMethodBeat.i(105166);
    int i = this.jXw.getChildCount();
    AppMethodBeat.o(105166);
    return i;
  }

  public void setFixedUserList(List<String> paramList)
  {
    AppMethodBeat.i(105167);
    if (paramList == null)
      AppMethodBeat.o(105167);
    while (true)
    {
      return;
      this.vhZ.addAll(paramList);
      AppMethodBeat.o(105167);
    }
  }

  public void setOnContactDeselectListener(MultiSelectContactView.a parama)
  {
    this.vid = parama;
  }

  public void setOnSearchTextChangeListener(MultiSelectContactView.b paramb)
  {
    this.vie = paramb;
  }

  public void setOnSearchTextFouceChangeListener(MultiSelectContactView.c paramc)
  {
    this.vif = paramc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MultiSelectContactView
 * JD-Core Version:    0.6.2
 */