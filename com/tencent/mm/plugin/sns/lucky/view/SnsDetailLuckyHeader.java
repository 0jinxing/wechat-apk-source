package com.tencent.mm.plugin.sns.lucky.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.sns.lucky.a.m;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI;
import com.tencent.mm.plugin.sns.ui.TouchImageView;
import com.tencent.mm.plugin.sns.ui.d.b;
import com.tencent.mm.plugin.sns.ui.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.cbb;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbu;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class SnsDetailLuckyHeader extends LinearLayout
{
  private View iym;
  private TextView qHh;
  private LinearLayout qHi;
  private LinearLayout qHj;

  public SnsDetailLuckyHeader(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(35905);
    this.iym = null;
    init();
    AppMethodBeat.o(35905);
  }

  public SnsDetailLuckyHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(35906);
    this.iym = null;
    init();
    AppMethodBeat.o(35906);
  }

  public SnsDetailLuckyHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(35904);
    this.iym = null;
    init();
    AppMethodBeat.o(35904);
  }

  private void init()
  {
    AppMethodBeat.i(35907);
    View localView = View.inflate(getContext(), 2130970006, this);
    this.iym = localView.findViewById(2131825678);
    this.qHh = ((TextView)localView.findViewById(2131825679));
    this.qHi = ((LinearLayout)localView.findViewById(2131825681));
    this.qHj = getLinearSeparator();
    AppMethodBeat.o(35907);
  }

  public final void a(n paramn, b paramb)
  {
    AppMethodBeat.i(35910);
    Object localObject1 = aj.q(paramn);
    Object localObject2 = ((cbf)localObject1).xaE;
    if ((localObject2 == null) || (((cbu)localObject2).xbh.size() == 0))
    {
      setVisibility(8);
      AppMethodBeat.o(35910);
      return;
    }
    setVisibility(0);
    double d = m.b(paramn, (cbf)localObject1);
    localObject1 = getContext().getString(2131303707, new Object[] { Integer.valueOf(((cbf)localObject1).xaE.xbg), bo.F(d * 1.0D / 100.0D) });
    this.qHh.setText((CharSequence)localObject1);
    this.iym.setTag(paramn);
    this.iym.setOnClickListener(paramb.rJT);
    paramn = ((cbu)localObject2).xbh;
    boolean bool = ((cbu)localObject2).xbh.isEmpty();
    int i = BackwardSupportUtil.b.b(getContext(), 32.0F);
    int j = BackwardSupportUtil.b.b(getContext(), 6.0F);
    int k = BackwardSupportUtil.b.b(getContext(), 10.0F);
    int m = BackwardSupportUtil.b.b(getContext(), 17.0F);
    int n;
    float f;
    if (this.qHi != null)
    {
      n = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getWidth();
      f = getResources().getDimension(2131427812);
      ab.d("MicroMsg.SnsDetailLuckyHeader", "guess size %d %f", new Object[] { Integer.valueOf(n), Float.valueOf(f) });
      f = n - f * 2.0F;
      if (paramn.size() > 0)
        break label327;
      if (this.qHi.getParent() != null)
        this.qHi.setVisibility(8);
      this.qHi.removeAllViews();
      this.qHi.setVisibility(8);
      paramn = this.qHi;
      n = 8;
    }
    while (true)
    {
      paramn.setVisibility(n);
      AppMethodBeat.o(35910);
      break;
      label327: this.qHi.getParent();
      this.qHi.removeAllViews();
      this.qHi.setVisibility(0);
      this.qHi.setPadding(0, j, 0, j);
      localObject1 = new ImageView(getContext());
      ((ImageView)localObject1).setImageResource(2131231330);
      ((ImageView)localObject1).setPadding(k, m, k, 0);
      localObject2 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject2).gravity = 49;
      ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
      ((ImageView)localObject1).setClickable(false);
      ((ImageView)localObject1).setFocusable(false);
      this.qHi.addView((View)localObject1);
      m = a.fromDPToPix(getContext(), SnsCommentDetailUI.rqk);
      k = (int)(f - m) / (j + i);
      n = k;
      if ((int)(f - m) % (j + i) > i)
        n = k + 1;
      ab.d("MicroMsg.SnsDetailLuckyHeader", "guess size %d", new Object[] { Integer.valueOf(n) });
      localObject2 = new h(getContext());
      ((h)localObject2).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      ((h)localObject2).setLineMaxCounte(n);
      for (n = 0; n < paramn.size(); n++)
      {
        localObject1 = (cbb)paramn.get(n);
        TouchImageView localTouchImageView = new TouchImageView(getContext());
        localTouchImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        localTouchImageView.setImageResource(2130838865);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(i, i);
        localLayoutParams.setMargins(0, j, j, 0);
        localTouchImageView.setLayoutParams(localLayoutParams);
        localTouchImageView.setTag(((cbb)localObject1).vHl);
        a.b.t(localTouchImageView, ((cbb)localObject1).vHl);
        localTouchImageView.setOnClickListener(paramb.rJI);
        ((h)localObject2).addView(localTouchImageView);
      }
      this.qHi.addView((View)localObject2);
      paramn = this.qHj;
      if (bool)
        n = 8;
      else
        n = 0;
    }
  }

  public LinearLayout getLinearSeparator()
  {
    AppMethodBeat.i(35908);
    BackwardSupportUtil.b.b(getContext(), 2.0F);
    AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, 1);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    localLinearLayout.setBackgroundResource(2130840270);
    localLinearLayout.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(35908);
    return localLinearLayout;
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(35909);
    super.setVisibility(paramInt);
    if (this.iym != null)
      this.iym.setVisibility(paramInt);
    AppMethodBeat.o(35909);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.view.SnsDetailLuckyHeader
 * JD-Core Version:    0.6.2
 */