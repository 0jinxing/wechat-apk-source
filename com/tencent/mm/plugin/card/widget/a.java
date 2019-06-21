package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class a
  implements g
{
  private final String TAG = "MicroMsg.CardWidgetCouponBase";
  protected View.OnClickListener gKK;
  protected TextView iPD;
  protected b kaS;
  protected View ksf;
  protected ImageView ksg;
  protected Context mContext;
  protected LayoutInflater mInflater;

  public a(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private void beL()
  {
    int i;
    if (!bo.isNullOrNil(this.kaS.aZV().kbV))
    {
      i = this.mContext.getResources().getDimensionPixelSize(2131428160);
      if ((!this.kaS.aZB()) || (!this.kaS.aZE()))
        break label133;
      i = this.mContext.getResources().getDimensionPixelSize(2131428158);
    }
    while (true)
    {
      if (i > 0)
        m.a(this.ksg, this.kaS.aZV().kbV, i, 2130839644, true);
      if (!bo.isNullOrNil(this.kaS.aZV().kdg))
        this.iPD.setText(this.kaS.aZV().kdg);
      return;
      label133: if ((this.kaS.aZB()) && (this.kaS.aZD()))
        i = this.mContext.getResources().getDimensionPixelSize(2131428184);
      else if ((this.kaS.aZB()) && (this.kaS.aZF()))
        i = this.mContext.getResources().getDimensionPixelSize(2131428196);
      else if (this.kaS.aZH())
        i = 0;
    }
  }

  private void refreshView()
  {
    if ((this.kaS == null) || (this.kaS.aZV() == null))
      ab.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
    while (true)
    {
      return;
      beL();
      beK();
    }
  }

  public void a(ShapeDrawable paramShapeDrawable)
  {
  }

  protected final View beI()
  {
    return this.ksf;
  }

  protected abstract void beJ();

  protected abstract void beK();

  public final void d(b paramb)
  {
    this.kaS = paramb;
    refreshView();
  }

  public void fL(boolean paramBoolean)
  {
  }

  public void fM(boolean paramBoolean)
  {
  }

  public final View hS()
  {
    if ((this.kaS == null) || (this.kaS.aZV() == null))
    {
      ab.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
      localObject = null;
      return localObject;
    }
    this.mInflater = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    Object localObject = this.mInflater;
    int i;
    if (!this.kaS.aZE())
      if (this.kaS.aZF())
        i = 2130968992;
    while (true)
    {
      this.ksf = ((LayoutInflater)localObject).inflate(i, null);
      this.ksg = ((ImageView)this.ksf.findViewById(2131821978));
      this.iPD = ((TextView)this.ksf.findViewById(2131821434));
      beJ();
      refreshView();
      localObject = this.ksf;
      break;
      if (this.kaS.aZD())
        i = 2130968954;
      else if (this.kaS.aZG())
        i = 2130968916;
      else if (this.kaS.aZH())
        i = 2130968945;
      else
        i = 2130968909;
    }
  }

  public final void i(b paramb)
  {
    this.kaS = paramb;
  }

  public final void release()
  {
    this.gKK = null;
    this.mContext = null;
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.gKK = paramOnClickListener;
  }

  public void tq(int paramInt)
  {
  }

  public void x(boolean paramBoolean1, boolean paramBoolean2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.widget.a
 * JD-Core Version:    0.6.2
 */