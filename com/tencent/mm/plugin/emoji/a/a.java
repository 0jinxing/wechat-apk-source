package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.plugin.emoji.a.a.e;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.model.i.a;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class a
{
  private final String TAG = "MicroMsg.emoji.BaseEmojiItemHolder";
  protected TextView iDT;
  private int kRA = -1;
  public f kRB;
  protected View kRC;
  protected ImageView kRD;
  protected ImageView kRE;
  protected TextView kRF;
  protected TextView kRG;
  protected ProgressBar kRH;
  protected ViewGroup kRI;
  protected View kRJ;
  protected TextView kRK;
  protected ImageView kRL;
  protected View kRM;
  protected ProgressBar kRN;
  protected TextView kRO;
  protected TextView kRP;
  protected FrameLayout kRQ;
  protected View kRR;
  private View kRv;
  private final int kRw = 2130969337;
  private final int kRx = 2130969363;
  private final int kRy = 2130969364;
  private int[] kRz = { -1, -1 };
  Context mContext;
  private LayoutInflater mLayoutInflater;
  public int mPosition;

  public a(Context paramContext, View paramView)
  {
    this(paramContext, paramView, a.a.kRV);
  }

  private a(Context paramContext, View paramView, a.a parama)
  {
    this.mContext = paramContext;
    this.mLayoutInflater = LayoutInflater.from(this.mContext);
    paramContext = paramView;
    if (paramView == null);
    label433: int i;
    switch (a.2.kRU[parama.ordinal()])
    {
    default:
      paramContext = tR(this.kRw);
      this.kRR = paramContext;
      if (paramContext != null)
      {
        this.kRv = paramContext;
        this.kRC = this.kRv.findViewById(2131823473);
        this.kRE = ((ImageView)this.kRv.findViewById(2131823485));
        this.kRD = ((ImageView)this.kRv.findViewById(2131823474));
        this.iDT = ((TextView)this.kRv.findViewById(2131823322));
        this.kRF = ((TextView)this.kRv.findViewById(2131823478));
        this.kRG = ((TextView)this.kRv.findViewById(2131823477));
        this.kRH = ((ProgressBar)this.kRv.findViewById(2131823482));
        this.kRJ = this.kRv.findViewById(2131823476);
        this.kRI = ((ViewGroup)this.kRv.findViewById(2131823479));
        this.kRK = ((TextView)this.kRv.findViewById(2131823480));
        this.kRL = ((ImageView)this.kRv.findViewById(2131823481));
        this.kRM = this.kRv.findViewById(2131823483);
        this.kRN = ((ProgressBar)this.kRv.findViewById(2131823484));
        this.kRO = ((TextView)this.kRv.findViewById(2131823471));
        this.kRP = ((TextView)this.kRv.findViewById(2131823557));
        this.kRQ = ((FrameLayout)this.kRv.findViewById(2131823472));
      }
      bje();
      if (parama == a.a.kRV)
      {
        parama = bjf();
        if ((this.kRD != null) && (parama[0] >= 0) && (parama[1] >= 0) && ((parama[0] != this.kRz[0]) || (parama[1] != this.kRz[1])))
          break label502;
        i = bjg();
        if ((this.kRv != null) && (i >= 0) && (this.kRA != i))
          break label540;
      }
      break;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      paramContext.setTag(this);
      return;
      paramContext = tR(this.kRw);
      break;
      paramContext = tR(this.kRy);
      break;
      paramContext = tR(this.kRx);
      break;
      label502: paramView = this.kRD.getLayoutParams();
      paramView.width = parama[0];
      paramView.height = parama[1];
      this.kRD.setLayoutParams(paramView);
      this.kRz = parama;
      break label433;
      label540: this.kRv.setMinimumHeight(i);
      if (this.kRC != null)
        this.kRC.setMinimumHeight(i);
    }
  }

  private void bjr()
  {
    this.kRH.setVisibility(8);
    this.kRI.setBackgroundResource(2130838000);
    this.kRI.setVisibility(0);
    this.kRJ.setEnabled(true);
    this.kRK.setText("");
    if (this.kRM == null)
      this.kRN.setVisibility(4);
    while (true)
    {
      this.kRK.setVisibility(0);
      this.kRK.setText(2131299103);
      this.kRK.setTextColor(this.mContext.getResources().getColorStateList(2131690780));
      this.kRL.setVisibility(8);
      return;
      this.kRM.setVisibility(4);
    }
  }

  private View tR(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (this.mLayoutInflater != null)
      if (paramInt > 0)
        break label19;
    label19: for (localObject2 = localObject1; ; localObject2 = this.mLayoutInflater.inflate(paramInt, null))
      return localObject2;
  }

  public final void IQ(String paramString)
  {
    this.kRF.setText(paramString);
  }

  public final void IR(String paramString)
  {
    if (bo.isNullOrNil(paramString))
      this.kRG.setVisibility(8);
    while (true)
    {
      return;
      this.kRG.setVisibility(0);
      this.kRG.setText(paramString);
    }
  }

  public final void a(i.a parama)
  {
    if (this.kRJ != null)
      this.kRJ.setOnClickListener(new a.1(this, parama));
  }

  protected boolean a(i.a parama, View paramView)
  {
    return true;
  }

  protected void b(i.a parama, View paramView)
  {
    if (parama != null)
      parama.a(this);
  }

  protected abstract void bje();

  protected abstract int[] bjf();

  protected abstract int bjg();

  public final void bjh()
  {
    this.iDT.setText(2131299169);
  }

  public final ImageView bji()
  {
    return this.kRD;
  }

  public final void bjj()
  {
    this.kRD.setImageResource(2130839049);
  }

  public final ImageView bjk()
  {
    return this.kRE;
  }

  public final void bjl()
  {
    this.kRE.setImageResource(2130838603);
  }

  public final void bjm()
  {
    this.kRF.setVisibility(8);
    this.kRG.setVisibility(8);
  }

  public final int bjn()
  {
    if (this.kRB == null);
    for (Integer localInteger = null; ; localInteger = Integer.valueOf(this.kRB.mStatus))
      return localInteger.intValue();
  }

  public final String bjo()
  {
    String str = null;
    if (this.kRB == null);
    while (true)
    {
      return str;
      if (this.kRB.kTb != null)
        str = this.kRB.kTb.PackPrice;
    }
  }

  protected abstract boolean bjp();

  protected final void bjq()
  {
    this.kRH.setVisibility(8);
    this.kRI.setVisibility(8);
    this.kRJ.setEnabled(false);
    this.kRL.setVisibility(8);
    this.kRN.setVisibility(0);
    this.kRN.setProgress(getProgress());
    if (this.kRM == null)
      this.kRN.setVisibility(0);
    while (true)
    {
      return;
      this.kRM.setVisibility(0);
    }
  }

  public void bjs()
  {
    if (this.kRB == null);
    while (true)
    {
      return;
      if (bjp())
      {
        this.kRK.setVisibility(8);
        this.kRK.setTextColor(this.mContext.getResources().getColorStateList(2131690723));
        switch (bjn())
        {
        case 1:
        case 2:
        case 5:
        case 9:
        default:
          ab.w("MicroMsg.emoji.BaseEmojiItemHolder", "unknow product status:%d", new Object[] { Integer.valueOf(bjn()) });
          break;
        case 8:
          this.kRH.setVisibility(8);
          this.kRI.setBackgroundDrawable(null);
          this.kRI.setVisibility(0);
          this.kRJ.setEnabled(false);
          this.kRK.setVisibility(0);
          this.kRK.setText(2131299106);
          this.kRL.setVisibility(4);
          if (this.kRM == null)
            this.kRN.setVisibility(4);
          else
            this.kRM.setVisibility(4);
          break;
        case 0:
          bjr();
          break;
        case 6:
          bjq();
          break;
        case 7:
          if (this.kRB.kTf)
          {
            ab.d("MicroMsg.emoji.BaseEmojiItemHolder", "jacks use emoji");
            this.kRH.setVisibility(8);
            this.kRI.setBackgroundResource(2130838000);
            this.kRI.setVisibility(0);
            this.kRI.setTag(getProductId());
            this.kRJ.setEnabled(true);
            this.kRK.setVisibility(0);
            this.kRK.setText(2131299171);
            this.kRK.setTextColor(this.mContext.getResources().getColorStateList(2131690780));
            this.kRL.setVisibility(4);
            if (this.kRM == null)
              this.kRN.setVisibility(4);
            else
              this.kRM.setVisibility(4);
          }
          else if ((this.kRB.kTh) && (e.dR(this.kRB.kTb.PackFlag, 64)))
          {
            this.kRI.setVisibility(0);
            this.kRI.setBackgroundResource(2130838003);
            this.kRK.setVisibility(0);
            this.kRK.setText(2131299136);
            this.kRK.setTextColor(this.mContext.getResources().getColorStateList(2131690780));
            this.kRL.setVisibility(4);
            this.kRJ.setEnabled(true);
            if (this.kRM == null)
              this.kRN.setVisibility(4);
            else
              this.kRM.setVisibility(4);
          }
          else
          {
            this.kRH.setVisibility(8);
            this.kRI.setVisibility(0);
            this.kRI.setBackgroundResource(2130838005);
            this.kRK.setVisibility(0);
            this.kRK.setText(2131299105);
            this.kRK.setTextColor(this.mContext.getResources().getColorStateList(2131689765));
            this.kRL.setVisibility(4);
            this.kRJ.setEnabled(false);
            if (this.kRM == null)
              this.kRN.setVisibility(4);
            else
              this.kRM.setVisibility(4);
          }
          break;
        case 3:
          bjr();
          break;
        case 4:
        case 12:
          this.kRH.setVisibility(8);
          this.kRI.setBackgroundResource(2130838005);
          this.kRI.setVisibility(0);
          if (this.kRM == null)
            this.kRN.setVisibility(4);
          while (true)
          {
            this.kRJ.setEnabled(true);
            this.kRL.setVisibility(4);
            this.kRK.setVisibility(0);
            if (this.kRB.kTb == null)
              break;
            this.kRK.setText(this.kRB.kTb.PackPrice);
            break;
            this.kRM.setVisibility(4);
          }
        case 10:
          this.kRH.setVisibility(8);
          this.kRI.setBackgroundResource(2130838005);
          this.kRI.setVisibility(0);
          this.kRK.setVisibility(0);
          this.kRK.setText(2131299127);
          this.kRL.setVisibility(4);
          this.kRJ.setEnabled(true);
          if (this.kRM == null)
            this.kRN.setVisibility(4);
          else
            this.kRM.setVisibility(4);
          break;
        case 11:
          this.kRH.setVisibility(0);
          this.kRI.setBackgroundResource(2130838005);
          this.kRI.setVisibility(0);
          this.kRK.setVisibility(0);
          this.kRK.setText("");
          this.kRJ.setEnabled(false);
          this.kRL.setVisibility(4);
          if (this.kRM == null)
            this.kRN.setVisibility(4);
          else
            this.kRM.setVisibility(4);
          break;
        }
      }
    }
  }

  public final View bjt()
  {
    return this.kRR;
  }

  public final String getProductId()
  {
    String str = null;
    if (this.kRB == null);
    while (true)
    {
      return str;
      if (this.kRB.kTb != null)
        str = this.kRB.kTb.ProductID;
    }
  }

  public final int getProgress()
  {
    if (this.kRB == null);
    for (int i = 0; ; i = this.kRB.EV)
      return i;
  }

  public final void setTitle(String paramString)
  {
    this.iDT.setText(paramString);
  }

  public final void tS(int paramInt)
  {
    this.kRE.setVisibility(paramInt);
  }

  public final void tT(int paramInt)
  {
    this.kRJ.setVisibility(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.a
 * JD-Core Version:    0.6.2
 */