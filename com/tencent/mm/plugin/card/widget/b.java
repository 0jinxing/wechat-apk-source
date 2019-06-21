package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.protobuf.cma;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class b extends a
{
  private final String TAG = "MicroMsg.CardWidgetCommon";
  protected TextView gsf;
  private boolean kok = false;
  protected TextView ksh;
  protected TextView ksi;
  protected Button ksj;
  protected LinearLayout ksk;
  protected TextView ksl;
  protected ImageView ksm;
  protected View ksn;
  protected ImageView kso;

  public b(Context paramContext)
  {
    super(paramContext);
  }

  private void beM()
  {
    AppMethodBeat.i(88967);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.ksk.getLayoutParams();
    if (this.kaS.aZB())
    {
      this.ksg.setVisibility(0);
      this.ksm.setVisibility(8);
      localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(2131428157);
    }
    while (true)
    {
      this.ksk.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(88967);
      return;
      if ((this.kaS.aZC()) && (this.kok))
      {
        this.ksg.setVisibility(8);
        this.ksm.setVisibility(8);
        localLayoutParams.topMargin = 0;
      }
      else if (this.kaS.aZC())
      {
        this.ksg.setVisibility(0);
        this.ksm.setVisibility(8);
        localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(2131428157);
      }
    }
  }

  private void beN()
  {
    AppMethodBeat.i(88969);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.ksj.getLayoutParams();
    if ((this.kaS.aZW().vSj != null) && (!TextUtils.isEmpty(this.kaS.aZW().vSj.kbX)))
      localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(2131427812);
    while (true)
    {
      this.ksj.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(88969);
      return;
      if ((this.kaS.aZW().vSk != null) && (!TextUtils.isEmpty(this.kaS.aZW().vSk.kbW)))
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(2131427812);
      else if ((this.kaS.aZV().vTW != null) && (this.kaS.aZV().vTW.size() > 0))
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(2131427812);
      else
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(2131427779);
    }
  }

  public final void bcN()
  {
    AppMethodBeat.i(88972);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.ksk.getLayoutParams();
    if (this.kaS.aZC())
    {
      this.ksg.setVisibility(0);
      localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(2131428157);
    }
    this.ksk.setLayoutParams(localLayoutParams);
    this.ksk.invalidate();
    AppMethodBeat.o(88972);
  }

  protected final void beJ()
  {
    AppMethodBeat.i(88965);
    this.gsf = ((TextView)this.ksf.findViewById(2131822004));
    this.ksh = ((TextView)this.ksf.findViewById(2131822005));
    this.ksi = ((TextView)this.ksf.findViewById(2131822333));
    this.ksj = ((Button)this.ksf.findViewById(2131822332));
    this.ksk = ((LinearLayout)this.ksf.findViewById(2131822001));
    this.ksm = ((ImageView)this.ksk.findViewById(2131822331));
    this.ksn = this.ksf.findViewById(2131822002);
    this.kso = ((ImageView)this.ksf.findViewById(2131822003));
    this.ksl = ((TextView)this.ksf.findViewById(2131822247));
    AppMethodBeat.o(88965);
  }

  protected final void beK()
  {
    AppMethodBeat.i(88966);
    Object localObject1;
    Object localObject2;
    if ((this.kaS.aZV().vTW != null) && (this.kaS.aZV().vTW.size() > 0))
    {
      localObject1 = (tm)this.kaS.aZV().vTW.get(0);
      if (!bo.isNullOrNil(((tm)localObject1).title))
        this.gsf.setText(((tm)localObject1).title);
      if (!bo.isNullOrNil(((tm)localObject1).kbW))
      {
        this.ksh.setText(((tm)localObject1).kbW);
        this.ksh.setVisibility(0);
        localObject2 = (LinearLayout.LayoutParams)this.ksh.getLayoutParams();
        if (bo.isNullOrNil(((tm)localObject1).kbX))
          break label241;
        this.ksi.setText(((tm)localObject1).kbX);
        this.ksi.setVisibility(0);
        ((LinearLayout.LayoutParams)localObject2).bottomMargin = 0;
        label153: this.ksh.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        this.ksh.invalidate();
      }
    }
    else
    {
      if ((this.ksj != null) && (this.kso != null))
        break label269;
      ab.e("MicroMsg.CardWidgetCommon", "consumeBtn == null || mCardCodeImg == null");
    }
    label1282: 
    while (true)
    {
      beM();
      this.ksk.setBackgroundDrawable(this.mContext.getResources().getDrawable(2130838137));
      beN();
      this.ksf.invalidate();
      AppMethodBeat.o(88966);
      return;
      this.ksh.setVisibility(8);
      break;
      label241: this.ksi.setVisibility(8);
      ((LinearLayout.LayoutParams)localObject2).bottomMargin = this.mContext.getResources().getDimensionPixelSize(2131427779);
      break label153;
      label269: if (this.kaS.aZW() == null)
      {
        ab.e("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo() == null");
        this.ksj.setVisibility(8);
        this.kso.setVisibility(8);
      }
      else
      {
        if (this.kaS.aZW().vSj != null)
        {
          ab.i("MicroMsg.CardWidgetCommon", "operate_field.title is " + this.kaS.aZW().vSj.title);
          ab.d("MicroMsg.CardWidgetCommon", "operate_field.url is " + this.kaS.aZW().vSj.url);
          ab.i("MicroMsg.CardWidgetCommon", "operate_field.aux_title is " + this.kaS.aZW().vSj.kbX);
        }
        localObject2 = this.kaS.aZW().vSk;
        if (localObject2 != null)
        {
          ab.i("MicroMsg.CardWidgetCommon", "limit_field.title is " + ((tm)localObject2).title);
          ab.i("MicroMsg.CardWidgetCommon", "limit_field.show_flag is " + ((tm)localObject2).vUW);
          ab.i("MicroMsg.CardWidgetCommon", "limit_field.aux_title is " + ((tm)localObject2).kbX);
        }
        Object localObject3 = this.kaS.aZV().vUp;
        localObject1 = (LinearLayout)this.ksk.findViewById(2131822334);
        Iterator localIterator;
        if ((localObject3 != null) && (!bo.ek(((cma)localObject3).xjM)))
        {
          ((LinearLayout)localObject1).setVisibility(0);
          ((LinearLayout)localObject1).removeAllViews();
          localIterator = ((cma)localObject3).xjM.iterator();
        }
        while (localIterator.hasNext())
        {
          tm localtm = (tm)localIterator.next();
          localObject3 = LayoutInflater.from(this.mContext).inflate(2130968912, null);
          TextView localTextView1 = (TextView)((View)localObject3).findViewById(2131822007);
          TextView localTextView2 = (TextView)((View)localObject3).findViewById(2131822008);
          localTextView1.setText(localtm.title);
          localTextView2.setText(localtm.kbW);
          ((LinearLayout)localObject1).addView((View)localObject3);
          continue;
          ((LinearLayout)localObject1).setVisibility(8);
        }
        if ((localObject2 != null) && (!TextUtils.isEmpty(((tm)localObject2).title)) && (((tm)localObject2).vUW != 0L) && (this.kaS.isNormal()))
        {
          this.ksj.setClickable(false);
          this.ksj.setVisibility(0);
          this.ksj.setTextColor(this.mContext.getResources().getColor(2131690780));
          this.ksj.setText(((tm)localObject2).title);
          if ((localObject2 != null) && (!TextUtils.isEmpty(((tm)localObject2).kbW)))
          {
            this.ksl.setText(((tm)localObject2).kbW);
            this.ksl.setVisibility(0);
          }
          while (true)
          {
            this.kso.setVisibility(8);
            if ((((tm)localObject2).vUW & 0x2) <= 0L)
              break label884;
            this.ksj.setBackgroundDrawable(l.H(this.mContext, l.bS(this.kaS.aZV().color, 150)));
            this.ksl.setTextColor(l.Hn(this.kaS.aZV().color));
            break;
            this.ksl.setVisibility(8);
          }
          label884: if ((((tm)localObject2).vUW & 0x4) > 0L)
          {
            this.ksj.setBackgroundDrawable(l.H(this.mContext, this.mContext.getResources().getColor(2131690201)));
            this.ksl.setTextColor(this.mContext.getResources().getColor(2131690312));
          }
          else
          {
            this.ksj.setBackgroundDrawable(l.H(this.mContext, l.Hn(this.kaS.aZV().color)));
            this.ksl.setTextColor(this.mContext.getResources().getColor(2131690312));
          }
        }
        else if ((this.kaS.aZW().vSj != null) && (!TextUtils.isEmpty(this.kaS.aZW().vSj.title)) && (!TextUtils.isEmpty(this.kaS.aZW().vSj.url)) && (this.kaS.isNormal()))
        {
          this.ksj.setClickable(true);
          this.ksj.setVisibility(0);
          this.ksj.setBackgroundDrawable(l.H(this.mContext, l.Hn(this.kaS.aZV().color)));
          this.ksj.setTextColor(this.mContext.getResources().getColorStateList(2131690780));
          this.ksj.setText(this.kaS.aZW().vSj.title);
          if ((this.kaS.aZW().vSj != null) && (!TextUtils.isEmpty(this.kaS.aZW().vSj.kbX)))
          {
            this.ksl.setTextColor(this.mContext.getResources().getColor(2131690312));
            this.ksl.setText(this.kaS.aZW().vSj.kbX);
            this.ksl.setVisibility(0);
          }
          while (true)
          {
            if (TextUtils.isEmpty(this.kaS.aZW().code))
              break label1282;
            this.kso.setVisibility(0);
            break;
            this.ksl.setVisibility(8);
          }
          this.kso.setVisibility(8);
        }
        else if ((!TextUtils.isEmpty(this.kaS.aZW().code)) && (this.kaS.isNormal()))
        {
          ab.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().code is valid");
          this.kso.setVisibility(8);
          this.ksl.setVisibility(8);
          this.ksj.setClickable(true);
          this.ksj.setVisibility(0);
          this.ksj.setBackgroundDrawable(l.H(this.mContext, l.Hn(this.kaS.aZV().color)));
          this.ksj.setTextColor(this.mContext.getResources().getColorStateList(2131690780));
          this.ksj.setText(2131297995);
        }
        else if (!this.kaS.isNormal())
        {
          ab.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().status is " + this.kaS.aZW().status);
          this.kso.setVisibility(8);
          this.ksl.setVisibility(8);
          this.ksj.setClickable(true);
          this.ksj.setVisibility(0);
          this.ksj.setTextColor(this.mContext.getResources().getColor(2131690139));
          this.ksj.setBackgroundDrawable(l.H(this.mContext, this.mContext.getResources().getColor(2131689819)));
          if (!TextUtils.isEmpty(this.kaS.aZV().vUu))
            this.ksj.setText(this.kaS.aZV().vUu);
          else
            m.c(this.ksj, this.kaS.aZW().status);
        }
        else
        {
          ab.i("MicroMsg.CardWidgetCommon", "operate_field and code is empty!");
          this.ksj.setVisibility(8);
          this.ksl.setVisibility(8);
          this.kso.setVisibility(8);
        }
      }
    }
  }

  public final void fM(boolean paramBoolean)
  {
    AppMethodBeat.i(88973);
    this.kok = paramBoolean;
    if (paramBoolean)
    {
      this.ksn.setVisibility(0);
      AppMethodBeat.o(88973);
    }
    while (true)
    {
      return;
      this.ksn.setVisibility(8);
      AppMethodBeat.o(88973);
    }
  }

  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(88970);
    super.setOnClickListener(paramOnClickListener);
    if (this.ksj != null)
      this.ksj.setOnClickListener(paramOnClickListener);
    if (this.kso != null)
      this.kso.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(88970);
  }

  public final void tq(int paramInt)
  {
    AppMethodBeat.i(88968);
    this.ksk.setBackgroundResource(paramInt);
    this.ksm.setVisibility(8);
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramInt == 0)
    {
      localLayoutParams = (RelativeLayout.LayoutParams)this.ksk.getLayoutParams();
      if (this.kaS.aZB())
      {
        this.ksg.setVisibility(8);
        localLayoutParams.topMargin = 0;
        this.ksm.setVisibility(0);
        int i = this.mContext.getResources().getDimensionPixelSize(2131428151);
        m.a(this.ksm, this.kaS.aZV().kbV, i, 2130839644, false);
        this.ksk.setLayoutParams(localLayoutParams);
        this.ksk.invalidate();
        label125: beN();
        localLayoutParams = (RelativeLayout.LayoutParams)this.ksn.getLayoutParams();
        if (paramInt != 0)
          break label226;
        localLayoutParams.leftMargin = 0;
      }
    }
    for (localLayoutParams.rightMargin = 0; ; localLayoutParams.rightMargin = this.mContext.getResources().getDimensionPixelSize(2131427510))
    {
      this.ksn.setLayoutParams(localLayoutParams);
      this.ksn.invalidate();
      this.ksf.invalidate();
      AppMethodBeat.o(88968);
      return;
      if ((!this.kaS.aZC()) || (!this.kok))
        break;
      this.ksg.setVisibility(8);
      localLayoutParams.topMargin = 0;
      break;
      beM();
      break label125;
      label226: localLayoutParams.leftMargin = this.mContext.getResources().getDimensionPixelSize(2131427510);
    }
  }

  public final void x(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(88971);
    if (this.ksj != null)
    {
      tm localtm = this.kaS.aZW().vSk;
      if ((localtm != null) && (!TextUtils.isEmpty(localtm.title)) && (localtm.vUW != 0L) && (this.kaS.isNormal()))
      {
        this.ksj.setClickable(false);
        this.ksj.setVisibility(0);
        this.kso.setVisibility(8);
        AppMethodBeat.o(88971);
      }
    }
    while (true)
    {
      return;
      if ((this.kaS.aZW().vSj != null) && (!TextUtils.isEmpty(this.kaS.aZW().vSj.title)) && (!TextUtils.isEmpty(this.kaS.aZW().vSj.url)) && (this.kaS.isNormal()))
      {
        this.ksj.setVisibility(0);
        this.ksj.setEnabled(true);
        if ((!TextUtils.isEmpty(this.kaS.aZW().code)) && (this.kaS.aZW().vSb != 0))
        {
          this.kso.setVisibility(0);
          AppMethodBeat.o(88971);
        }
        else
        {
          this.kso.setVisibility(8);
          AppMethodBeat.o(88971);
        }
      }
      else if ((paramBoolean1) && (!TextUtils.isEmpty(this.kaS.aZW().code)) && (this.kaS.isNormal()))
      {
        this.ksj.setVisibility(0);
        this.ksj.setEnabled(paramBoolean2);
        this.kso.setVisibility(8);
        AppMethodBeat.o(88971);
      }
      else if ((paramBoolean1) && (!this.kaS.isNormal()))
      {
        this.ksj.setVisibility(0);
        this.ksj.setEnabled(false);
        this.kso.setVisibility(8);
        AppMethodBeat.o(88971);
      }
      else
      {
        this.ksj.setVisibility(8);
        this.kso.setVisibility(8);
        AppMethodBeat.o(88971);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.widget.b
 * JD-Core Version:    0.6.2
 */