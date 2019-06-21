package com.tencent.mm.ui.widget.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.c;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.a;
import com.tencent.mm.ui.base.n.b;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.base.n.d;

public class d
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private ViewTreeObserver aaM;
  private RecyclerView aiB;
  public View iym;
  public Context mContext;
  private BottomSheetBehavior nA;
  public boolean pIf;
  private View pP;
  public n.c rBl;
  public n.d rBm;
  private l rBn;
  private boolean uEM;
  private boolean uEN;
  public boolean uEO;
  public boolean uEP;
  public n.a zFT;
  public n.b zFU;
  public int zQA;
  private boolean zQB;
  private int zQC;
  private int zQD;
  public d.a zQf;
  private Dialog zQg;
  private n.d zQh;
  private l zQi;
  public Boolean zQj;
  private LinearLayout zQk;
  private LinearLayout zQl;
  private d.b zQm;
  private boolean zQn;
  private boolean zQo;
  private boolean zQp;
  private int zQq;
  public ImageView zQr;
  private int zQs;
  private int zQt;
  private int zQu;
  private int zQv;
  private boolean zQw;
  private boolean zQx;
  public boolean zQy;
  private boolean zQz;
  private int zaX;

  public d(Context paramContext)
  {
    AppMethodBeat.i(112657);
    this.zQj = Boolean.FALSE;
    this.zQn = false;
    this.zQo = false;
    this.zQp = false;
    this.uEM = false;
    this.zQs = 4;
    this.zQt = (this.zQs * 3);
    this.zQu = 6;
    this.pIf = false;
    this.zQx = false;
    this.uEP = false;
    this.zQy = false;
    this.zQz = false;
    this.zQA = 0;
    this.zQB = false;
    this.zQC = 0;
    this.zQD = 0;
    this.zQv = 1;
    this.mContext = paramContext;
    this.zQB = true;
    if ((this.mContext instanceof Activity))
      this.pP = ((ViewGroup)((Activity)this.mContext).getWindow().getDecorView()).findViewById(16908290);
    cA(this.mContext);
    AppMethodBeat.o(112657);
  }

  public d(Context paramContext, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(112656);
    this.zQj = Boolean.FALSE;
    this.zQn = false;
    this.zQo = false;
    this.zQp = false;
    this.uEM = false;
    this.zQs = 4;
    this.zQt = (this.zQs * 3);
    this.zQu = 6;
    this.pIf = false;
    this.zQx = false;
    this.uEP = false;
    this.zQy = false;
    this.zQz = false;
    this.zQA = 0;
    this.zQB = false;
    this.zQC = 0;
    this.zQD = 0;
    this.zQv = paramInt;
    this.mContext = paramContext;
    this.zQw = paramBoolean;
    this.zQz = false;
    if ((this.mContext instanceof Activity))
      this.pP = ((ViewGroup)((Activity)this.mContext).getWindow().getDecorView()).findViewById(16908290);
    cA(this.mContext);
    AppMethodBeat.o(112656);
  }

  private void cA(Context paramContext)
  {
    AppMethodBeat.i(112660);
    this.rBn = new l(paramContext);
    this.zQi = new l(paramContext);
    label192: label217: int j;
    if (this.zQB)
    {
      this.zQg = new b(paramContext);
      this.iym = View.inflate(paramContext, 2130970097, null);
      this.zQk = ((LinearLayout)this.iym.findViewById(2131825987));
      this.zQl = ((LinearLayout)this.iym.findViewById(2131825990));
      this.zQr = ((ImageView)this.iym.findViewById(2131825988));
      this.aiB = ((RecyclerView)this.iym.findViewById(2131825989));
      this.aiB.setHasFixedSize(true);
      this.uEM = isLandscape();
      if (this.zQv != 0)
        break label488;
      if (!this.uEM)
        break label461;
      this.zQs = 7;
      this.zQt = (this.zQs * 2);
      this.zaX = (aj.am(this.mContext, 2131427513) + aj.am(this.mContext, 2131428432));
      if (this.zQw)
        this.zaX += aj.am(this.mContext, 2131428432);
      if ((this.zQw) && (this.zQr != null) && (this.zQz))
        this.zQr.setVisibility(0);
      if (this.zQv != 0)
        break label741;
      this.aiB.setLayoutManager(new GridLayoutManager(this.zQs));
      int i = aj.am(this.mContext, 2131428431);
      j = aj.am(this.mContext, 2131428432);
      if (this.zQw)
        j = aj.fromDPToPix(this.mContext, 0);
      this.aiB.setPadding(i, j, i, 0);
    }
    while (true)
    {
      this.zQm = new d.b(this);
      this.zQm.amz = new d.1(this);
      this.aiB.setAdapter(this.zQm);
      this.aiB.setOverScrollMode(1);
      this.zQg.setContentView(this.iym);
      if (!this.zQB)
      {
        this.nA = BottomSheetBehavior.j((View)this.iym.getParent());
        this.nA.K(this.zaX);
        this.nA.ns = new d.2(this);
      }
      this.zQg.setOnDismissListener(new d.3(this));
      AppMethodBeat.o(112660);
      return;
      this.zQg = new c(paramContext);
      break;
      label461: this.zaX = (aj.am(this.mContext, 2131427512) + aj.am(this.mContext, 2131428432));
      break label192;
      label488: if (this.zQv == 2)
      {
        this.zQo = true;
        j = aj.am(this.mContext, 2131428135);
        if (this.uEM)
          this.zQu = 2;
        for (this.zaX = ((int)(j * 2.5D) + aj.am(this.mContext, 2131428131)); ; this.zaX = ((int)(j * 3.5D) + aj.am(this.mContext, 2131428131)))
        {
          if (!this.zQw)
            break label602;
          this.zaX += aj.fromDPToPix(this.mContext, 88);
          break;
          this.zQu = 3;
        }
        break label217;
      }
      label602: this.zQp = true;
      j = aj.am(this.mContext, 2131428138);
      if (this.uEM)
        this.zQu = 4;
      for (this.zaX = ((int)(j * 4.5D) + aj.am(this.mContext, 2131428131)); ; this.zaX = ((int)(j * 6.5D) + aj.am(this.mContext, 2131428131)))
      {
        if (this.zQw)
          this.zaX += aj.am(this.mContext, 2131428432);
        if (!this.zQB)
          break;
        j = aj.fromDPToPix(this.mContext, 24);
        this.zQr.setPadding(j, 0, j, 0);
        break;
        this.zQu = 6;
      }
      label741: this.aiB.setLayoutManager(new LinearLayoutManager());
    }
  }

  private void dKY()
  {
    AppMethodBeat.i(112668);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.iym.getLayoutParams();
    int i = this.rBn.size();
    int j;
    int k;
    label110: Rect localRect;
    if (this.zQn)
    {
      j = i + 1;
      if (this.zQB)
      {
        k = aj.am(this.mContext, 2131428138);
        if (!this.zQw)
          break label327;
        i = aj.am(this.mContext, 2131428141);
        if (this.zQC != 0)
          i = this.zQC;
        this.zaX = (i + (int)(k * 4.5D) + aj.am(this.mContext, 2131428131));
      }
      if (this.zQv != 0)
        break label422;
      if (this.zQm.getItemCount() <= this.zQt)
        break label342;
      localLayoutParams.height = this.zaX;
      label139: label272: if ((this.uEM) && (this.pP != null))
      {
        localRect = new Rect();
        this.pP.getWindowVisibleDisplayFrame(localRect);
        if (!this.zQB)
          break label498;
        localLayoutParams.width = ((int)(localRect.right * 1.0F / 2.0F));
        if (this.zQD != 0)
          localLayoutParams.width = this.zQD;
        if (!ak.hG(this.mContext))
          break label441;
        localLayoutParams.height = (localRect.bottom - ak.hF(this.mContext));
        label235: if (this.zQw)
        {
          k = aj.am(this.mContext, 2131428138);
          if (j > this.zQu)
            break label453;
          j = localLayoutParams.height - j * k;
          if (this.zQk != null)
            this.zQk.setMinimumHeight(j);
        }
      }
    }
    while (true)
    {
      this.iym.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(112668);
      return;
      j = i;
      if (this.zQi.size() <= 0)
        break;
      j = i + this.zQi.size();
      break;
      label327: this.zaX = ((int)(k * 6.5D));
      break label110;
      label342: localLayoutParams.height = ((aj.am(this.mContext, 2131428133) + aj.am(this.mContext, 2131428432)) * (int)Math.ceil(this.zQm.getItemCount() / this.zQs) + ak.fr(this.mContext));
      if (!this.zQw)
        break label139;
      localLayoutParams.height += aj.am(this.mContext, 2131428432);
      break label139;
      label422: if (j <= this.zQu)
        break label139;
      localLayoutParams.height = this.zaX;
      break label139;
      label441: localLayoutParams.height = localRect.bottom;
      break label235;
      label453: i = localLayoutParams.height - (int)(k * (this.zQu + 0.5D));
      j = i;
      if (i <= aj.fromDPToPix(this.mContext, 150))
        break label272;
      j = i - k;
      break label272;
      label498: localLayoutParams.width = localRect.right;
    }
  }

  @TargetApi(23)
  private void dcd()
  {
    AppMethodBeat.i(112663);
    if ((Build.VERSION.SDK_INT >= 23) && (this.zQg != null))
    {
      this.zQg.getWindow().getDecorView().setSystemUiVisibility(9216);
      this.zQg.getWindow().setStatusBarColor(0);
    }
    AppMethodBeat.o(112663);
  }

  @SuppressLint({"WrongConstant"})
  private int getRotation()
  {
    AppMethodBeat.i(112659);
    int i = 0;
    if ((this.mContext instanceof Activity))
      i = ((Activity)this.mContext).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    AppMethodBeat.o(112659);
    return i;
  }

  private boolean isLandscape()
  {
    AppMethodBeat.i(112669);
    boolean bool;
    if (this.mContext.getResources().getConfiguration().orientation == 2)
    {
      bool = true;
      AppMethodBeat.o(112669);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112669);
    }
  }

  public final void F(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(112661);
    if (paramView == null)
    {
      AppMethodBeat.o(112661);
      return;
    }
    this.zQw = true;
    ImageView localImageView;
    if (this.zQr != null)
    {
      localImageView = this.zQr;
      if (!paramBoolean)
        break label98;
    }
    label98: for (int i = 4; ; i = 0)
    {
      localImageView.setVisibility(i);
      if (this.zQk != null)
      {
        this.zQk.setVisibility(0);
        this.zQk.removeAllViews();
        this.zQk.setGravity(17);
        this.zQk.addView(paramView, -1, -2);
      }
      AppMethodBeat.o(112661);
      break;
    }
  }

  public final void a(n.c paramc)
  {
    this.rBl = paramc;
  }

  public final void a(n.d paramd)
  {
    this.rBm = paramd;
  }

  public final void cpD()
  {
    int i = 0;
    AppMethodBeat.i(112664);
    this.uEM = isLandscape();
    this.zQq = getRotation();
    if (this.rBl != null)
      this.rBl.a(this.rBn);
    if (this.zQg != null)
    {
      dKY();
      if ((this.zQi != null) && (this.zQm != null))
        this.zQm.aop.notifyChanged();
      if (Build.VERSION.SDK_INT >= 21)
        this.zQg.getWindow().addFlags(-2147483648);
      if (this.uEN)
        dcd();
      if (this.uEO)
        this.zQg.getWindow().addFlags(1024);
      if (!this.uEP)
        break label293;
      this.zQg.getWindow().setFlags(8, 8);
      this.zQg.getWindow().addFlags(131200);
      this.zQg.getWindow().getDecorView().setSystemUiVisibility(6);
    }
    while (true)
    {
      if (this.nA != null)
        this.nA.nj = false;
      if (this.zQf != null)
        this.zQg.setOnDismissListener(new d.4(this));
      if (this.pP != null)
      {
        if (this.aaM == null)
          i = 1;
        this.aaM = this.pP.getViewTreeObserver();
        if (i != 0)
          this.aaM.addOnGlobalLayoutListener(this);
      }
      if (((this.mContext instanceof Activity)) && (!((Activity)this.mContext).isFinishing()))
        this.zQg.show();
      AppMethodBeat.o(112664);
      return;
      label293: this.zQg.getWindow().clearFlags(8);
      this.zQg.getWindow().clearFlags(131072);
      this.zQg.getWindow().clearFlags(128);
      this.zQg.getWindow().getDecorView().setSystemUiVisibility(0);
    }
  }

  public final void cpE()
  {
    AppMethodBeat.i(112666);
    if (this.zQg != null)
    {
      if (this.nA != null)
        this.nA.nj = true;
      this.zQg.dismiss();
    }
    AppMethodBeat.o(112666);
  }

  public final void dKX()
  {
    AppMethodBeat.i(112665);
    if (this.zQg != null)
    {
      if ((this.zQi != null) && (this.zQm != null))
        this.zQm.aop.notifyChanged();
      this.zQg.show();
    }
    AppMethodBeat.o(112665);
  }

  public final boolean isShowing()
  {
    AppMethodBeat.i(112667);
    boolean bool;
    if ((this.zQg != null) && (this.zQg.isShowing()))
    {
      bool = true;
      AppMethodBeat.o(112667);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112667);
    }
  }

  public void onGlobalLayout()
  {
    AppMethodBeat.i(112658);
    if (isShowing())
    {
      View localView = this.pP;
      if ((localView == null) || (!localView.isShown()))
      {
        cpE();
        AppMethodBeat.o(112658);
      }
    }
    while (true)
    {
      return;
      if ((isShowing()) && ((this.uEM != isLandscape()) || (this.zQq != getRotation())))
        cpE();
      AppMethodBeat.o(112658);
    }
  }

  public final void q(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(112662);
    if ((this.zQk != null) && (this.zQw))
    {
      this.zQk.setVisibility(0);
      this.zQk.removeAllViews();
      this.zQk.setGravity(paramInt);
      View localView = LayoutInflater.from(this.mContext).inflate(2130970101, null);
      TextView localTextView = (TextView)localView.findViewById(2131822938);
      localTextView.setText(paramCharSequence);
      localTextView.setGravity(paramInt | 0x50);
      this.zQk.addView(localView, -1, -2);
    }
    AppMethodBeat.o(112662);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.d
 * JD-Core Version:    0.6.2
 */