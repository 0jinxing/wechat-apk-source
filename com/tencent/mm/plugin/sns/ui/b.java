package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.sns.g.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.v;

public final class b
{
  boolean iXr;
  private Context mContext;
  private int qDY;
  private com.tencent.mm.plugin.sns.ui.d.b qOL;
  private FrameLayout qOM;
  AbsoluteLayout qON;
  protected Animation qOO;
  protected Animation qOP;
  boolean qOQ;
  private com.tencent.mm.plugin.sns.g.b rfS;
  TextView rfT;
  ListView rfU;
  View rfV;

  public b(Context paramContext, com.tencent.mm.plugin.sns.ui.d.b paramb, FrameLayout paramFrameLayout, com.tencent.mm.plugin.sns.g.b paramb1)
  {
    AppMethodBeat.i(38068);
    this.qON = null;
    this.qOQ = false;
    this.iXr = false;
    this.qDY = -1;
    this.mContext = paramContext;
    this.rfS = paramb1;
    this.qOL = paramb;
    this.qOM = paramFrameLayout;
    this.qOO = new ScaleAnimation(1.0F, 1.0F, 0.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.qOO = AnimationUtils.loadAnimation(paramContext, 2131034160);
    this.qOP = new ScaleAnimation(1.0F, 1.0F, 1.0F, 0.0F, 1, 1.0F, 1, 0.0F);
    this.qOP = AnimationUtils.loadAnimation(paramContext, 2131034161);
    AppMethodBeat.o(38068);
  }

  public final boolean cox()
  {
    boolean bool = false;
    AppMethodBeat.i(38070);
    if ((this.rfS != null) && (af.cnx().coA()))
      this.rfS.cox();
    if (this.qON != null)
    {
      this.qOM.removeView(this.qON);
      this.qON = null;
      bool = true;
      AppMethodBeat.o(38070);
    }
    while (true)
    {
      return bool;
      this.qOQ = false;
      this.rfU = null;
      this.rfV = null;
      AppMethodBeat.o(38070);
    }
  }

  public final boolean crv()
  {
    AppMethodBeat.i(38071);
    int i = this.rfT.getHeight();
    this.rfT.setVisibility(8);
    int j = 0;
    Object localObject = null;
    int k = 0;
    while (j < this.rfU.getAdapter().getCount())
    {
      localObject = this.rfU.getAdapter().getView(j, (View)localObject, null);
      ((View)localObject).measure(this.rfV.getWidth(), -2);
      k += ((View)localObject).getMeasuredHeight();
      j++;
    }
    ((RelativeLayout.LayoutParams)this.rfU.getLayoutParams()).bottomMargin = (i - k);
    this.rfU.setVisibility(0);
    localObject = new b.4(this, i, k);
    ((Animation)localObject).setDuration(250L);
    this.rfU.startAnimation((Animation)localObject);
    AppMethodBeat.o(38071);
    return true;
  }

  public final boolean dF(View paramView)
  {
    AppMethodBeat.i(38069);
    boolean bool;
    if ((af.cnx().coA()) && (this.rfS != null))
    {
      i = this.rfS.dC(paramView);
      if ((i == 0) || (i == 1))
      {
        AppMethodBeat.o(38069);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.AdNotLikeHelper", "abtest error return 2");
      if (this.qOQ)
      {
        AppMethodBeat.o(38069);
        bool = false;
      }
      else
      {
        if (this.qON != null)
        {
          if ((this.qON.getTag() instanceof b.a))
          {
            paramView = ((b.a)this.qON.getTag()).qCZ;
            this.qOQ = true;
            paramView.startAnimation(this.qOP);
            this.qOP.setAnimationListener(new b.3(this, paramView));
          }
          while (true)
          {
            AppMethodBeat.o(38069);
            bool = false;
            break;
            cox();
          }
        }
        if ((paramView.getTag() != null) && ((paramView.getTag() instanceof com.tencent.mm.plugin.sns.data.b)))
          break;
        AppMethodBeat.o(38069);
        bool = false;
      }
    }
    com.tencent.mm.plugin.sns.data.b localb = (com.tencent.mm.plugin.sns.data.b)paramView.getTag();
    Object localObject1 = localb.cwT;
    this.qON = new AbsoluteLayout(this.mContext);
    this.qON.setId(2131820733);
    new FrameLayout.LayoutParams(-1, -1);
    this.qOM.addView(this.qON);
    int j = BackwardSupportUtil.b.b(this.mContext, 150.0F);
    int k = BackwardSupportUtil.b.b(this.mContext, 17.0F);
    BackwardSupportUtil.b.b(this.mContext, 40.0F);
    View localView = v.hu(this.mContext).inflate(2130968632, null);
    TextView localTextView = (TextView)localView.findViewById(2131821029);
    String str = aa.gw(ah.getContext());
    Object localObject2 = localb.qFH.rDm;
    if (localObject2 != null)
    {
      if (!"zh_CN".equals(str))
        break label588;
      localObject2 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUw;
      label353: if (!bo.isNullOrNil((String)localObject2))
        localTextView.setText((CharSequence)localObject2);
    }
    new Rect();
    int i = f.fD(this.mContext);
    localObject2 = localb.qFH.cuI();
    ab.d("MicroMsg.AdNotLikeHelper", "addCommentView getLocationInWindow " + localObject2[0] + "  " + localObject2[1] + " height: " + i);
    this.qDY = ae.hA(this.mContext);
    if (this.iXr)
    {
      i = a.fromDPToPix(this.mContext, 2);
      this.qDY = 0;
    }
    while (true)
    {
      localObject2 = new AbsoluteLayout.LayoutParams(-2, -2, localObject2[0] - j, localObject2[1] - this.qDY - i + k);
      localObject1 = new b.a(this, (String)localObject1, localView);
      this.qON.setTag(localObject1);
      this.qON.addView(localView, (ViewGroup.LayoutParams)localObject2);
      localView.setVisibility(8);
      this.qOQ = true;
      new ak().post(new b.1(this, paramView, localView));
      AppMethodBeat.o(38069);
      bool = true;
      break;
      label588: if (("zh_TW".equals(str)) || ("zh_HK".equals(str)))
      {
        localObject2 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUy;
        break label353;
      }
      localObject2 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUx;
      break label353;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.b
 * JD-Core Version:    0.6.2
 */