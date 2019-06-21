package com.tencent.mm.plugin.card.ui.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.aci;
import com.tencent.mm.protocal.protobuf.ax;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public final class b extends i
{
  private MMActivity jiE;
  private com.tencent.mm.plugin.card.base.b kaS;
  private View kqs;
  private TextView kqt;
  private g kqu;

  public final void bes()
  {
    AppMethodBeat.i(88735);
    this.kqs.setVisibility(8);
    AppMethodBeat.o(88735);
  }

  public final void destroy()
  {
    AppMethodBeat.i(88733);
    super.destroy();
    this.jiE = null;
    this.kqu = null;
    AppMethodBeat.o(88733);
  }

  public final void initView()
  {
    AppMethodBeat.i(88732);
    this.jiE = this.kqK.bcy();
    this.kqu = this.kqK.bcA();
    AppMethodBeat.o(88732);
  }

  public final void update()
  {
    AppMethodBeat.i(88734);
    if (this.kqs == null)
    {
      this.kqs = ((ViewStub)findViewById(2131822025)).inflate();
      this.kqs.findViewById(2131821929).setOnClickListener(this.kqK.bcz());
    }
    this.kaS = this.kqK.bcv();
    this.kqu = this.kqK.bcA();
    boolean bool1 = this.kqu.bdE();
    boolean bool2 = this.kqu.bdF();
    Object localObject1;
    Object localObject2;
    int i;
    Object localObject3;
    ShapeDrawable localShapeDrawable;
    if (bool1)
    {
      this.kqs.setVisibility(0);
      ab.i("MicroMsg.CardAcceptView", "updateAcceptView() acceptViewVisible:" + bool1 + " acceptViewEnabled:" + bool2);
      localObject1 = (Button)this.kqs.findViewById(2131821929);
      localObject2 = this.kqs.findViewById(2131821928);
      ((View)localObject2).setBackgroundDrawable(null);
      ((View)localObject2).setOnClickListener(null);
      i = this.jiE.getResources().getDimensionPixelSize(2131428180);
      if (!bool2)
        break label1108;
      if (!TextUtils.isEmpty(this.kaS.aZV().vUf))
        ((Button)localObject1).setText(this.kaS.aZV().vUf);
      if (!this.kaS.aZD())
        break label837;
      ((Button)localObject1).setTextColor(l.Hn(this.kaS.aZV().color));
      localObject3 = l.b(this.jiE, l.Hn(this.kaS.aZV().color), i);
      localShapeDrawable = l.dI(l.Hn(this.kaS.aZV().color), i);
      localObject2 = new StateListDrawable();
      ((StateListDrawable)localObject2).addState(new int[] { 16842919 }, localShapeDrawable);
      ((StateListDrawable)localObject2).addState(new int[0], (Drawable)localObject3);
      int j = this.jiE.getResources().getColor(2131690691);
      i = l.Hn(this.kaS.aZV().color);
      localObject3 = new int[0];
      ((Button)localObject1).setBackgroundDrawable((Drawable)localObject2);
      ((Button)localObject1).setTextColor(new ColorStateList(new int[][] { { 16842919, 16842910 }, localObject3 }, new int[] { j, i }));
      localObject2 = (LinearLayout.LayoutParams)this.kqs.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject2).topMargin = this.jiE.getResources().getDimensionPixelSize(2131428153);
      this.kqs.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      this.kqs.findViewById(2131821938).setVisibility(8);
      localObject2 = this.kqK.bcD();
      localObject1 = (CheckBox)this.kqs.findViewById(2131821939);
      if ((((f)localObject2).baz() == null) || (!((f)localObject2).baz().kci))
        break label820;
      ab.i("MicroMsg.CardAcceptView", "updateFollowBox() show followbox");
      ((CheckBox)localObject1).setVisibility(0);
      localObject3 = this.kaS.aZV().vUq;
      if ((localObject3 == null) || (TextUtils.isEmpty(((aci)localObject3).text)))
        break label805;
      ((CheckBox)localObject1).setText(((aci)localObject3).text);
      ((CheckBox)localObject1).setChecked(((f)localObject2).baz().kcj);
      ((CheckBox)localObject1).setOnClickListener(new b.1(this, (f)localObject2));
      label601: if ((this.kaS.aZE()) || (this.kaS.aZC()))
        break label1453;
      if ((this.kaS.aZV().vUr == null) || (bo.isNullOrNil(this.kaS.aZV().vUr.text)))
        break label1437;
      if (this.kqt == null)
        this.kqt = ((TextView)this.kqs.findViewById(2131821937));
      this.kqt.setText(this.kaS.aZV().vUr.text);
      if (!bo.isNullOrNil(this.kaS.aZV().vUr.url))
      {
        this.kqt.setOnClickListener(this.kqK.bcz());
        this.kqt.setTextColor(l.Hn(this.kaS.aZV().color));
      }
      this.kqt.setVisibility(0);
      AppMethodBeat.o(88734);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardAcceptView", "updateAcceptView(), mAcceptCardView is Gone");
      this.kqs.setVisibility(8);
      AppMethodBeat.o(88734);
      continue;
      label805: ((CheckBox)localObject1).setText(((f)localObject2).baz().title);
      break;
      label820: ab.i("MicroMsg.CardAcceptView", "updateFollowBox() not show followbox");
      ((CheckBox)localObject1).setVisibility(8);
      break label601;
      label837: if ((this.kaS.aZE()) || (this.kaS.aZC()) || (this.kaS.aZF()))
      {
        localObject3 = l.dI(l.Hn(this.kaS.aZV().color), i);
        localShapeDrawable = l.dI(l.bS(this.kaS.aZV().color, 175), i);
        localObject2 = new StateListDrawable();
        ((StateListDrawable)localObject2).addState(new int[] { 16842919 }, localShapeDrawable);
        ((StateListDrawable)localObject2).addState(new int[0], (Drawable)localObject3);
        ((Button)localObject1).setBackgroundDrawable((Drawable)localObject2);
        ((Button)localObject1).setTextColor(this.jiE.getResources().getColor(2131690780));
        localObject2 = (LinearLayout.LayoutParams)((Button)localObject1).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).width = -1;
        ((Button)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        break label601;
      }
      localObject3 = l.dI(l.Hn(this.kaS.aZV().color), i);
      localShapeDrawable = l.dI(l.bS(this.kaS.aZV().color, 175), i);
      localObject2 = new StateListDrawable();
      ((StateListDrawable)localObject2).addState(new int[] { 16842919 }, localShapeDrawable);
      ((StateListDrawable)localObject2).addState(new int[0], (Drawable)localObject3);
      ((Button)localObject1).setBackgroundDrawable((Drawable)localObject2);
      ((Button)localObject1).setTextColor(this.jiE.getResources().getColor(2131690780));
      break label601;
      label1108: this.kqs.setEnabled(false);
      ((View)localObject2).setEnabled(false);
      ((Button)localObject1).setEnabled(false);
      if (this.kaS.aZD());
      for (localObject2 = this.kaS.aZV().vUf; ; localObject2 = this.kqu.bdx())
      {
        ((Button)localObject1).setText((CharSequence)localObject2);
        if (!this.kaS.aZD())
          break label1292;
        ((Button)localObject1).setTextColor(l.bS(this.kaS.aZV().color, 125));
        ((Button)localObject1).setBackgroundDrawable(l.b(this.jiE, l.bS(this.kaS.aZV().color, 125), i));
        localObject2 = (LinearLayout.LayoutParams)this.kqs.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).topMargin = this.jiE.getResources().getDimensionPixelSize(2131428154);
        this.kqs.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        this.kqs.findViewById(2131821938).setVisibility(8);
        break;
      }
      label1292: if ((this.kaS.aZE()) || (this.kaS.aZC()) || (this.kaS.aZF()))
      {
        ((Button)localObject1).setTextColor(this.jiE.getResources().getColor(2131690139));
        ((Button)localObject1).setBackgroundDrawable(l.H(this.jiE, this.jiE.getResources().getColor(2131689819)));
        localObject2 = (LinearLayout.LayoutParams)((Button)localObject1).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).width = -1;
        ((Button)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
        break label601;
      }
      ((Button)localObject1).setTextColor(this.jiE.getResources().getColor(2131690139));
      ((Button)localObject1).setBackgroundDrawable(l.H(this.jiE, this.jiE.getResources().getColor(2131689819)));
      break label601;
      label1437: if (this.kqt != null)
        this.kqt.setVisibility(8);
      label1453: AppMethodBeat.o(88734);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.b
 * JD-Core Version:    0.6.2
 */