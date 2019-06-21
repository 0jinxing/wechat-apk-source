package com.tencent.mm.ui.widget.a;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ag;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.widget.edittext.PasterEditText;

public class c extends Dialog
  implements DialogInterface
{
  CheckBox aaY;
  private boolean gHY;
  private TextView jao;
  private Button lWE;
  private Context mContext;
  private boolean needEdit;
  private View sQ;
  public Button tJz;
  private EditText tc;
  private LinearLayout ykT;
  public TextView ykU;
  private TextView ykV;
  public LinearLayout ykW;
  private LinearLayout ykX;
  private TextView zPF;
  private TextView zPG;
  private TextView zPH;
  public ImageView zPI;
  private View zPJ;
  private LinearLayout zPK;
  private ViewStub zPL;
  private ViewGroup zPM;
  private ViewGroup zPN;
  private View zPO;
  private boolean zPP;
  private Animation zPQ;
  private Animation zPR;
  private Animation zPS;
  private Animation zPT;
  private c.a.d zPU;
  public DialogInterface.OnDismissListener zPV;

  public c(Context paramContext)
  {
    super(paramContext, 2131493867);
    AppMethodBeat.i(112622);
    this.zPP = false;
    this.needEdit = false;
    this.mContext = paramContext;
    this.ykT = ((LinearLayout)View.inflate(this.mContext, 2130970091, null));
    this.tJz = ((Button)this.ykT.findViewById(2131822912));
    this.lWE = ((Button)this.ykT.findViewById(2131822911));
    this.jao = ((TextView)this.ykT.findViewById(2131825974));
    this.zPF = ((TextView)this.ykT.findViewById(2131825975));
    this.ykU = ((TextView)this.ykT.findViewById(2131825979));
    this.ykV = ((TextView)this.ykT.findViewById(2131822917));
    this.zPG = ((TextView)this.ykT.findViewById(2131822918));
    this.zPH = ((TextView)this.ykT.findViewById(2131822924));
    this.tc = ((EditText)this.ykT.findViewById(2131822921));
    this.aaY = ((CheckBox)this.ykT.findViewById(2131825981));
    this.zPI = ((ImageView)this.ykT.findViewById(2131822916));
    this.zPK = ((LinearLayout)this.ykT.findViewById(2131825973));
    this.zPL = ((ViewStub)this.ykT.findViewById(2131825976));
    this.ykW = ((LinearLayout)this.ykT.findViewById(2131824516));
    this.zPM = ((ViewGroup)this.ykT.findViewById(2131825982));
    this.zPO = this.ykT.findViewById(2131825983);
    this.ykX = ((LinearLayout)this.ykT.findViewById(2131825980));
    this.zPN = ((ViewGroup)this.ykT.findViewById(2131825977));
    setCanceledOnTouchOutside(true);
    this.zPQ = AnimationUtils.loadAnimation(this.mContext, 2131034125);
    this.zPR = AnimationUtils.loadAnimation(this.mContext, 2131034125);
    this.zPS = AnimationUtils.loadAnimation(this.mContext, 2131034126);
    this.zPT = AnimationUtils.loadAnimation(this.mContext, 2131034126);
    AppMethodBeat.o(112622);
  }

  private void PS(int paramInt)
  {
    AppMethodBeat.i(112631);
    if (this.ykW != null)
      this.ykW.setVisibility(paramInt);
    if (this.ykX != null)
      this.ykX.setVisibility(paramInt);
    if ((this.zPH != null) && (this.zPP))
      this.zPH.setVisibility(paramInt);
    if (this.tc != null)
      if (!this.needEdit)
      {
        this.tc.setVisibility(8);
        AppMethodBeat.o(112631);
      }
    while (true)
    {
      return;
      this.tc.setVisibility(paramInt);
      AppMethodBeat.o(112631);
    }
  }

  private void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(112641);
    this.zPO.setVisibility(8);
    this.zPM.removeAllViews();
    this.zPM.addView(paramView, paramLayoutParams);
    AppMethodBeat.o(112641);
  }

  private void ao(View paramView, int paramInt)
  {
    AppMethodBeat.i(112632);
    this.sQ = paramView;
    if (this.sQ != null)
    {
      this.ykW.setVisibility(0);
      this.ykX.setVisibility(0);
      this.ykX.removeAllViews();
      this.ykX.setGravity(1);
      this.ykX.addView(this.sQ, new LinearLayout.LayoutParams(paramInt, paramInt));
    }
    AppMethodBeat.o(112632);
  }

  private void dxO()
  {
    AppMethodBeat.i(112626);
    if (this.ykU != null)
      this.ykU.setTextColor(this.ykU.getContext().getResources().getColor(2131689953));
    AppMethodBeat.o(112626);
  }

  private void qY(boolean paramBoolean)
  {
    AppMethodBeat.i(112628);
    if (paramBoolean)
    {
      int i = aj.fromDPToPix(this.mContext, 8);
      this.ykW.setVisibility(0);
      this.ykW.setPadding(i, i, i, i);
      this.ykW.setBackgroundResource(2130838491);
    }
    AppMethodBeat.o(112628);
  }

  public final void PT(int paramInt)
  {
    AppMethodBeat.i(112634);
    this.tJz.setTextColor(paramInt);
    AppMethodBeat.o(112634);
  }

  public final void PU(int paramInt)
  {
    AppMethodBeat.i(112635);
    this.lWE.setTextColor(paramInt);
    AppMethodBeat.o(112635);
  }

  public final void a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(112636);
    a(this.mContext.getString(paramInt), true, paramOnClickListener);
    AppMethodBeat.o(112636);
  }

  public final void a(final a parama)
  {
    AppMethodBeat.i(112642);
    int i;
    if ((parama.title != null) && (parama.title.length() > 0))
    {
      i = parama.yCn;
      if (this.jao != null)
        this.jao.setGravity(i);
      setTitle(parama.title);
    }
    Object localObject1;
    Object localObject2;
    if ((parama.zOM != null) && (parama.zOM.length() > 0))
    {
      localObject1 = parama.zOM;
      this.zPK.setVisibility(0);
      this.zPF.setVisibility(0);
      localObject2 = localObject1;
      if (this.zPU != null)
        localObject2 = this.zPU.a(((CharSequence)localObject1).toString(), this.jao.getTextSize());
      this.zPF.setText((CharSequence)localObject2);
    }
    if (parama.vfK != 0)
    {
      i = parama.vfK;
      this.jao.setTextColor(ColorStateList.valueOf(i));
    }
    if (parama.zPu != 0)
    {
      i = parama.zPu;
      this.jao.setMaxLines(i);
    }
    if (parama.zPv != 0)
    {
      i = parama.zPv;
      this.ykU.setMaxLines(i);
    }
    if (parama.uvN != null)
      ao(parama.uvN, -1);
    if (parama.zPs != null)
    {
      localObject1 = parama.zPs;
      this.zPK.setVisibility(0);
      this.zPL.setLayoutResource(2130969177);
    }
    try
    {
      localObject2 = (LinearLayout)this.zPL.inflate();
      ((LinearLayout)localObject2).addView((View)localObject1);
      if (parama.zPt != null)
      {
        this.zPJ = parama.zPt;
        if (this.zPJ != null)
        {
          this.ykW.setVisibility(8);
          this.zPH.setVisibility(8);
          this.tc.setVisibility(8);
          this.zPN.removeAllViews();
          this.zPN.addView(this.zPJ, new LinearLayout.LayoutParams(-1, -1));
          this.zPN.setVisibility(8);
        }
      }
      if (parama.zOZ != null)
      {
        localObject2 = parama.zOZ;
        if (this.sQ == null)
        {
          this.ykW.setVisibility(0);
          this.zPI.setVisibility(0);
          this.zPI.setBackgroundDrawable((Drawable)localObject2);
        }
      }
      if ((parama.zPc != null) && (parama.zPc.length() > 0))
        setMessage(parama.zPc);
      qY(parama.zPl);
      if (parama.thumbPath != null)
      {
        localObject2 = parama.thumbPath;
        i = aj.fromDPToPix(this.mContext, 120);
        this.ykW.setVisibility(0);
        this.zPI.setVisibility(0);
        if ((this.zPI instanceof com.tencent.mm.ui.e.a))
          ((com.tencent.mm.ui.e.a)this.zPI).am((String)localObject2, i, i);
        i = parama.zPy;
        this.ykW.setVisibility(i);
        this.zPI.setVisibility(i);
      }
      if ((!parama.zPC) && (!parama.zPD))
      {
        if ((parama.zPc != null) && (parama.zPc.length() > 0))
          setMessage(parama.zPc);
        if ((parama.zPd == null) || (parama.zPd.length() <= 0))
          break label2281;
        localObject2 = parama.zPd;
        this.ykW.setVisibility(0);
        this.ykV.setVisibility(0);
        this.ykV.setMaxLines(2);
        this.ykV.setText((CharSequence)localObject2);
        if ((parama.zPe != null) && (parama.zPe.length() > 0))
        {
          localObject1 = parama.zPe;
          if (localObject1 != null)
          {
            this.ykW.setVisibility(0);
            this.zPG.setVisibility(0);
            localObject2 = localObject1;
            if (this.zPU != null)
            {
              localObject2 = this.zPU;
              this.zPG.getContext();
              localObject2 = ((c.a.d)localObject2).a(((CharSequence)localObject1).toString(), this.zPG.getTextSize());
            }
            this.zPG.setText((CharSequence)localObject2);
          }
        }
        if (parama.zPa != null)
        {
          localObject2 = parama.zPa;
          if (this.sQ == null)
          {
            this.ykW.setVisibility(0);
            this.zPI.setVisibility(0);
            this.zPI.setImageBitmap((Bitmap)localObject2);
          }
        }
      }
      if (parama.zPC)
      {
        localObject4 = parama.zPa;
        localObject5 = parama.zPd;
        localObject1 = parama.zPe;
        localObject6 = View.inflate(this.mContext, 2130969180, null);
        if (localObject4 != null)
        {
          localObject2 = (ImageView)((View)localObject6).findViewById(2131822916);
          ((ImageView)localObject2).setVisibility(0);
          ((ImageView)localObject2).setImageBitmap((Bitmap)localObject4);
        }
        if (localObject5 != null)
        {
          localObject4 = (TextView)((View)localObject6).findViewById(2131822917);
          ((TextView)localObject4).setVisibility(0);
          localObject2 = localObject5;
          if (this.zPU != null)
            localObject2 = this.zPU.a(((CharSequence)localObject5).toString(), ((TextView)localObject4).getTextSize());
          ((TextView)localObject4).setText((CharSequence)localObject2);
        }
        if (localObject1 != null)
        {
          localObject5 = (TextView)((View)localObject6).findViewById(2131822918);
          ((TextView)localObject5).setVisibility(0);
          if (this.zPU == null)
            break label2694;
          localObject2 = this.zPU.a(((CharSequence)localObject1).toString(), ((TextView)localObject5).getTextSize());
          ((TextView)localObject5).setText((CharSequence)localObject2);
        }
        ao((View)localObject6, -1);
        if ((parama.zOR != null) || (parama.zOS != null))
        {
          str = parama.zOR;
          localObject5 = parama.zOS;
          bool = parama.zOT;
          localObject6 = parama.zOV;
          localObject4 = parama.zOW;
          this.zPL.setLayoutResource(2130969190);
          localObject2 = null;
        }
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        try
        {
          Object localObject4;
          Object localObject5;
          Object localObject6;
          String str;
          boolean bool;
          localObject1 = (LinearLayout)this.zPL.inflate();
          localObject2 = localObject1;
          if ((localObject2 != null) && (str != null))
          {
            localObject1 = (ImageView)((LinearLayout)localObject2).findViewById(2131822937);
            ((ImageView)localObject1).setVisibility(0);
            if (localObject4 != null)
              ((c.a.a)localObject4).u((ImageView)localObject1, str);
          }
          if ((localObject2 != null) && (localObject5 != null))
          {
            localObject4 = (TextView)((LinearLayout)localObject2).findViewById(2131822938);
            ((TextView)localObject4).setVisibility(0);
            localObject1 = localObject5;
            if (this.zPU != null)
              localObject1 = this.zPU.a(((CharSequence)localObject5).toString(), this.jao.getTextSize());
            ((TextView)localObject4).setText((CharSequence)localObject1);
          }
          if ((Boolean.valueOf(bool).booleanValue()) && (localObject2 != null))
          {
            localObject1 = (ImageView)((LinearLayout)localObject2).findViewById(2131822939);
            ((ImageView)localObject1).setVisibility(0);
            PS(0);
            ((LinearLayout)localObject2).setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                AppMethodBeat.i(112605);
                if (this.zPW != null)
                  this.zPW.djv();
                if (this.zPX.isSelected())
                {
                  c.c(c.this).startAnimation(c.b(c.this));
                  c.b(c.this).setAnimationListener(new Animation.AnimationListener()
                  {
                    public final void onAnimationEnd(Animation paramAnonymous2Animation)
                    {
                      AppMethodBeat.i(112602);
                      c.c(c.this).setVisibility(8);
                      c.a(c.this, 0);
                      AppMethodBeat.o(112602);
                    }

                    public final void onAnimationRepeat(Animation paramAnonymous2Animation)
                    {
                    }

                    public final void onAnimationStart(Animation paramAnonymous2Animation)
                    {
                      AppMethodBeat.i(112601);
                      c.a(c.this, c.d(c.this));
                      AppMethodBeat.o(112601);
                    }
                  });
                  ObjectAnimator.ofFloat(this.zPX, "rotation", new float[] { 180.0F, 0.0F }).setDuration(200L).start();
                  this.zPX.setSelected(false);
                  AppMethodBeat.o(112605);
                }
                while (true)
                {
                  return;
                  c.c(c.this).startAnimation(c.e(c.this));
                  c.e(c.this).setAnimationListener(new Animation.AnimationListener()
                  {
                    public final void onAnimationEnd(Animation paramAnonymous2Animation)
                    {
                      AppMethodBeat.i(112604);
                      c.c(c.this).setVisibility(0);
                      c.a(c.this, 8);
                      AppMethodBeat.o(112604);
                    }

                    public final void onAnimationRepeat(Animation paramAnonymous2Animation)
                    {
                    }

                    public final void onAnimationStart(Animation paramAnonymous2Animation)
                    {
                      AppMethodBeat.i(112603);
                      c.a(c.this, c.f(c.this));
                      AppMethodBeat.o(112603);
                    }
                  });
                  ObjectAnimator.ofFloat(this.zPX, "rotation", new float[] { 0.0F, 180.0F }).setDuration(200L).start();
                  this.zPX.setSelected(true);
                  AppMethodBeat.o(112605);
                }
              }
            });
          }
          if (parama.zOX != null)
          {
            localObject2 = parama.zOX;
            if ((this.ykW != null) && (this.ykW.getVisibility() == 0))
              this.ykW.setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymousView)
                {
                  AppMethodBeat.i(112606);
                  if (this.zQa != null)
                    this.zQa.bwF();
                  AppMethodBeat.o(112606);
                }
              });
          }
          else
          {
            if ((parama.zPb != null) && (!parama.zPb.isRecycled()))
            {
              localObject1 = parama.zPb;
              bool = parama.zPm;
              j = parama.zPx;
              if (localObject1 != null)
              {
                qY(false);
                this.ykW.setVisibility(0);
                this.ykW.setGravity(1);
                this.ykW.setPadding(0, 0, 0, 0);
                localObject6 = View.inflate(this.mContext, 2130969182, null);
                localObject4 = (ImageView)((View)localObject6).findViewById(2131822916);
                if (!bool)
                  continue;
                k = ((Bitmap)localObject1).getWidth();
                i = ((Bitmap)localObject1).getHeight();
                localObject5 = null;
                f = i / k;
                m = 0;
                n = 0;
                i1 = aj.am(this.mContext, 2131427571);
                i = aj.am(this.mContext, 2131427570);
                i2 = 0;
                k = 0;
                if ((f <= 0.0F) || (f >= 0.5D))
                  continue;
                n = (int)(i1 / f);
                k = i1;
                m = i1;
                i2 = i;
                localObject2 = localObject5;
                if (m > 0)
                {
                  localObject2 = localObject5;
                  if (n > 0)
                  {
                    localObject2 = localObject5;
                    if (localObject1 != null)
                    {
                      localObject2 = Bitmap.createScaledBitmap((Bitmap)localObject1, n, m, true);
                      ((ImageView)localObject4).setLayoutParams(new FrameLayout.LayoutParams(i2, k));
                    }
                  }
                }
                localObject2 = ag.d((Bitmap)localObject2, aj.fromDPToPix(this.mContext, 3));
                ((ImageView)localObject4).setImageBitmap((Bitmap)localObject2);
                localObject2 = (ImageView)((View)localObject6).findViewById(2131822919);
                if (j != 0)
                  continue;
                ((ImageView)localObject2).setVisibility(8);
                ao((View)localObject6, -2);
              }
            }
            if ((parama.zON != null) && (parama.zON.length() > 0))
            {
              localObject2 = parama.zON;
              if (localObject2 != null)
              {
                this.zPH.setVisibility(0);
                this.zPH.setText((CharSequence)localObject2);
              }
              this.zPP = true;
              i = parama.zPw;
              if (this.zPH != null)
                this.zPH.setGravity(i);
            }
            if ((parama.zOO != null) && (parama.zOO.length() > 0))
            {
              localObject2 = parama.zOO;
              this.tc.setVisibility(0);
              this.tc.setHint((CharSequence)localObject2);
            }
            if ((parama.zOP != null) && (parama.zOP.length() > 0))
            {
              localObject2 = parama.zOP;
              this.aaY.setVisibility(0);
              this.aaY.setText((CharSequence)localObject2);
            }
            if (parama.zOQ)
            {
              this.needEdit = parama.zOQ;
              if (!parama.zOQ)
                continue;
              this.tc.setVisibility(0);
            }
            if ((parama.zPf != null) && (parama.zPf.length() > 0))
              a(parama.zPf, parama.zPB, parama.zPn);
            if ((parama.zPg != null) && (parama.zPg.length() > 0))
              b(parama.zPg, true, parama.zPo);
            if (parama.zPA != 0)
              PT(parama.zPA);
            if (parama.zPz != 0)
              PU(parama.zPz);
            if (parama.Ue != null)
              setOnCancelListener(parama.Ue);
            if (parama.Uf != null)
            {
              this.zPV = parama.Uf;
              setOnDismissListener(parama.Uf);
            }
            if (parama.zOY != null)
              this.zPU = parama.zOY;
            setCancelable(parama.gHY);
            this.gHY = parama.gHY;
            if (!this.gHY)
              super.setCancelable(parama.zPk);
            if ((parama.zPh != null) || (parama.zPi != null) || (parama.zPj != null))
            {
              localObject6 = View.inflate(this.mContext, 2130969189, null);
              localObject1 = (Button)((View)localObject6).findViewById(2131822934);
              localObject2 = (Button)((View)localObject6).findViewById(2131822935);
              localObject5 = (Button)((View)localObject6).findViewById(2131822936);
              if (parama.zPh != null)
              {
                ((Button)localObject1).setVisibility(0);
                ((Button)localObject1).setText(parama.zPh);
                ((Button)localObject1).setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    AppMethodBeat.i(112610);
                    if (parama.zPp != null)
                      parama.zPp.onClick(c.this, -1);
                    c.this.dismiss();
                    AppMethodBeat.o(112610);
                  }
                });
              }
              if (parama.zPi != null)
              {
                ((Button)localObject2).setVisibility(0);
                ((Button)localObject2).setText(parama.zPi);
                ((Button)localObject2).setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    AppMethodBeat.i(112611);
                    if (parama.zPq != null)
                      parama.zPq.onClick(c.this, -2);
                    c.this.dismiss();
                    AppMethodBeat.o(112611);
                  }
                });
              }
              if (parama.zPj != null)
              {
                ((Button)localObject5).setVisibility(0);
                ((Button)localObject5).setText(parama.zPj);
                ((Button)localObject5).setOnClickListener(new View.OnClickListener()
                {
                  public final void onClick(View paramAnonymousView)
                  {
                    AppMethodBeat.i(112612);
                    if (parama.zPr != null)
                      parama.zPr.onClick(c.this, -3);
                    c.this.dismiss();
                    AppMethodBeat.o(112612);
                  }
                });
              }
              a((View)localObject6, new LinearLayout.LayoutParams(-1, -1));
            }
            if (parama.zOU)
            {
              localObject2 = View.inflate(this.mContext, 2130969176, null);
              this.lWE = ((Button)((View)localObject2).findViewById(2131822911));
              this.tJz = ((Button)((View)localObject2).findViewById(2131822912));
              if (parama.zPA != 0)
                PT(parama.zPA);
              if (parama.zPz != 0)
                PU(parama.zPz);
              if ((parama.zPf != null) && (parama.zPf.length() > 0))
                a(parama.zPf, parama.zPB, parama.zPn);
              if ((parama.zPg != null) && (parama.zPg.length() > 0))
                b(parama.zPg, true, parama.zPo);
              a((View)localObject2, new LinearLayout.LayoutParams(-1, -1));
            }
            AppMethodBeat.o(112642);
            return;
            localException2 = localException2;
            this.zPL.setVisibility(0);
            localObject3 = null;
            continue;
            label2281: qY(false);
            continue;
            if (!parama.zPD)
              continue;
            localObject3 = parama.zPa;
            localObject5 = parama.zPd;
            localObject1 = parama.zPe;
            localObject6 = View.inflate(this.mContext, 2130969181, null);
            if (localObject3 != null)
            {
              localObject4 = (ImageView)((View)localObject6).findViewById(2131822916);
              ((ImageView)localObject4).setVisibility(0);
              ((ImageView)localObject4).setImageBitmap((Bitmap)localObject3);
            }
            if (localObject5 != null)
            {
              localObject4 = (TextView)((View)localObject6).findViewById(2131822917);
              ((TextView)localObject4).setVisibility(0);
              localObject3 = localObject5;
              if (this.zPU != null)
                localObject3 = this.zPU.a(((CharSequence)localObject5).toString(), ((TextView)localObject4).getTextSize());
              ((TextView)localObject4).setText((CharSequence)localObject3);
            }
            if (localObject1 != null)
            {
              localObject5 = (TextView)((View)localObject6).findViewById(2131822918);
              ((TextView)localObject5).setVisibility(0);
              if (this.zPU == null)
                continue;
              localObject3 = this.zPU.a(((CharSequence)localObject1).toString(), ((TextView)localObject5).getTextSize());
              ((TextView)localObject5).setText((CharSequence)localObject3);
            }
            ao((View)localObject6, -1);
          }
        }
        catch (Exception localException1)
        {
          int j;
          float f;
          int i1;
          this.zPL.setVisibility(0);
          continue;
          if (this.ykX == null)
            continue;
          this.ykX.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(112607);
              if (this.zQa != null)
                this.zQa.bwF();
              AppMethodBeat.o(112607);
            }
          });
          continue;
          if ((f >= 0.5D) && (f < 1.0F))
          {
            m = (int)(i * f);
            k = m;
            i2 = i;
            n = i;
            continue;
          }
          if ((f >= 1.0F) && (f < 2.0F))
          {
            n = (int)(i / f);
            k = i;
            i2 = n;
            m = i;
            continue;
          }
          if (f < 2.0F)
            continue;
          int m = (int)(i1 * f);
          int i2 = i1;
          int n = i1;
          int k = i;
          continue;
          ((ImageView)localObject3).setVisibility(0);
          if (j == 1)
          {
            ((ImageView)localObject3).setImageResource(2131231931);
            continue;
          }
          if (j != 2)
            continue;
          ((ImageView)localObject3).setImageResource(2131232094);
          continue;
          this.tc.setVisibility(8);
          continue;
          localObject3 = localException1;
          continue;
          localObject3 = localException1;
          continue;
        }
        label2694: Object localObject3 = localException1;
      }
    }
  }

  public final void a(CharSequence paramCharSequence, final boolean paramBoolean, final DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(112633);
    if (this.tJz == null)
      AppMethodBeat.o(112633);
    while (true)
    {
      return;
      this.tJz.setVisibility(0);
      this.tJz.setText(paramCharSequence);
      this.tJz.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(112608);
          if (paramOnClickListener != null)
            paramOnClickListener.onClick(c.this, -1);
          if (paramBoolean)
            c.this.dismiss();
          AppMethodBeat.o(112608);
        }
      });
      AppMethodBeat.o(112633);
    }
  }

  public final void b(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(112638);
    b(this.mContext.getString(paramInt), true, paramOnClickListener);
    AppMethodBeat.o(112638);
  }

  public final void b(CharSequence paramCharSequence, final boolean paramBoolean, final DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(112637);
    if (this.lWE == null)
      AppMethodBeat.o(112637);
    while (true)
    {
      return;
      this.lWE.setVisibility(0);
      this.lWE.setText(paramCharSequence);
      this.lWE.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(112609);
          if (paramOnClickListener != null)
            paramOnClickListener.onClick(c.this, -2);
          if (paramBoolean)
            c.this.cancel();
          AppMethodBeat.o(112609);
        }
      });
      AppMethodBeat.o(112637);
    }
  }

  public final String dKV()
  {
    AppMethodBeat.i(112629);
    String str;
    if (this.tc == null)
    {
      str = null;
      AppMethodBeat.o(112629);
    }
    while (true)
    {
      return str;
      str = this.tc.getText().toString();
      AppMethodBeat.o(112629);
    }
  }

  public final int dKW()
  {
    AppMethodBeat.i(112630);
    int i;
    if ((this.tc instanceof PasterEditText))
    {
      i = ((PasterEditText)this.tc).getPasterLen();
      AppMethodBeat.o(112630);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(112630);
    }
  }

  public void dismiss()
  {
    AppMethodBeat.i(112644);
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      new Handler(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(112613);
          c.this.dismiss();
          AppMethodBeat.o(112613);
        }
      });
      ai.e("MicroMsg.MMAlertDialog", "dialog dismiss error!", new Object[0]);
      AppMethodBeat.o(112644);
    }
    while (true)
    {
      return;
      try
      {
        super.dismiss();
        AppMethodBeat.o(112644);
      }
      catch (Exception localException)
      {
        ai.e("MicroMsg.MMAlertDialog", "dismiss exception, e = " + localException.getMessage(), new Object[0]);
        AppMethodBeat.o(112644);
      }
    }
  }

  public final Button getButton(int paramInt)
  {
    Button localButton;
    switch (paramInt)
    {
    default:
      localButton = null;
    case -1:
    case -2:
    }
    while (true)
    {
      return localButton;
      localButton = this.tJz;
      continue;
      localButton = this.lWE;
    }
  }

  public View getContentView()
  {
    return this.ykT;
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112623);
    super.onCreate(paramBundle);
    setContentView(this.ykT);
    AppMethodBeat.o(112623);
  }

  public final void qZ(boolean paramBoolean)
  {
    AppMethodBeat.i(112640);
    super.setCancelable(paramBoolean);
    AppMethodBeat.o(112640);
  }

  public void setCancelable(boolean paramBoolean)
  {
    AppMethodBeat.i(112639);
    super.setCancelable(paramBoolean);
    this.gHY = paramBoolean;
    setCanceledOnTouchOutside(this.gHY);
    AppMethodBeat.o(112639);
  }

  public final void setMessage(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(112627);
    this.ykW.setVisibility(0);
    this.ykU.setVisibility(0);
    Object localObject = paramCharSequence;
    if (this.zPU != null)
    {
      localObject = this.zPU;
      this.ykU.getContext();
      localObject = ((c.a.d)localObject).a(paramCharSequence.toString(), this.ykU.getTextSize());
    }
    this.ykU.setText((CharSequence)localObject);
    AppMethodBeat.o(112627);
  }

  public void setTitle(int paramInt)
  {
    AppMethodBeat.i(112625);
    this.zPK.setVisibility(0);
    this.jao.setVisibility(0);
    this.jao.setMaxLines(2);
    this.jao.setText(paramInt);
    this.jao.getPaint().setFakeBoldText(true);
    dxO();
    AppMethodBeat.o(112625);
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(112624);
    this.zPK.setVisibility(0);
    this.jao.setVisibility(0);
    CharSequence localCharSequence = paramCharSequence;
    if (this.zPU != null)
      localCharSequence = this.zPU.a(paramCharSequence.toString(), this.jao.getTextSize());
    this.jao.setMaxLines(2);
    this.jao.setText(localCharSequence);
    this.jao.getPaint().setFakeBoldText(true);
    dxO();
    AppMethodBeat.o(112624);
  }

  public void show()
  {
    AppMethodBeat.i(112643);
    try
    {
      super.show();
      AppMethodBeat.o(112643);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ai.printErrStackTrace("MicroMsg.MMAlertDialog", localException, "", new Object[0]);
        AppMethodBeat.o(112643);
      }
    }
  }

  public static class a
  {
    public Context mContext;
    public a zQe;

    public a(Context paramContext)
    {
      AppMethodBeat.i(112614);
      this.mContext = paramContext;
      this.zQe = new a();
      AppMethodBeat.o(112614);
    }

    public final a PV(int paramInt)
    {
      AppMethodBeat.i(112615);
      this.zQe.title = this.mContext.getString(paramInt);
      AppMethodBeat.o(112615);
      return this;
    }

    public final a PW(int paramInt)
    {
      this.zQe.vfK = paramInt;
      return this;
    }

    public final a PX(int paramInt)
    {
      this.zQe.zPu = paramInt;
      return this;
    }

    public final a PY(int paramInt)
    {
      this.zQe.yCn = paramInt;
      return this;
    }

    public final a PZ(int paramInt)
    {
      AppMethodBeat.i(112616);
      this.zQe.zPc = this.mContext.getString(paramInt);
      AppMethodBeat.o(112616);
      return this;
    }

    public final a Qa(int paramInt)
    {
      this.zQe.zPv = paramInt;
      return this;
    }

    public final a Qb(int paramInt)
    {
      this.zQe.zPw = paramInt;
      return this;
    }

    public final a Qc(int paramInt)
    {
      AppMethodBeat.i(112618);
      this.zQe.zPf = this.mContext.getString(paramInt);
      AppMethodBeat.o(112618);
      return this;
    }

    public final a Qd(int paramInt)
    {
      AppMethodBeat.i(112619);
      this.zQe.zPg = this.mContext.getString(paramInt);
      AppMethodBeat.o(112619);
      return this;
    }

    public final a Qe(int paramInt)
    {
      this.zQe.zPA = paramInt;
      return this;
    }

    public final a Qf(int paramInt)
    {
      this.zQe.zPz = paramInt;
      return this;
    }

    public final a a(DialogInterface.OnClickListener paramOnClickListener)
    {
      this.zQe.zPn = paramOnClickListener;
      return this;
    }

    public final a a(DialogInterface.OnDismissListener paramOnDismissListener)
    {
      this.zQe.Uf = paramOnDismissListener;
      return this;
    }

    public final a a(Bitmap paramBitmap, boolean paramBoolean, int paramInt)
    {
      this.zQe.zPb = paramBitmap;
      this.zQe.zPm = paramBoolean;
      this.zQe.zPx = paramInt;
      return this;
    }

    public final a a(d paramd)
    {
      this.zQe.zOY = paramd;
      return this;
    }

    public final a a(String paramString, CharSequence paramCharSequence, Boolean paramBoolean, c paramc, a parama)
    {
      AppMethodBeat.i(112617);
      this.zQe.zOR = paramString;
      this.zQe.zOS = paramCharSequence;
      this.zQe.zOT = paramBoolean.booleanValue();
      this.zQe.zOV = paramc;
      this.zQe.zOW = parama;
      AppMethodBeat.o(112617);
      return this;
    }

    public final a a(boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
    {
      this.zQe.zPn = paramOnClickListener;
      this.zQe.zPB = paramBoolean;
      return this;
    }

    public c aMb()
    {
      AppMethodBeat.i(112620);
      c localc = new c(this.mContext);
      localc.a(this.zQe);
      AppMethodBeat.o(112620);
      return localc;
    }

    public final a ai(CharSequence paramCharSequence)
    {
      this.zQe.title = paramCharSequence;
      return this;
    }

    public final a aj(CharSequence paramCharSequence)
    {
      this.zQe.zOM = paramCharSequence;
      return this;
    }

    public final a ak(CharSequence paramCharSequence)
    {
      this.zQe.zPd = paramCharSequence;
      return this;
    }

    public final a ar(Bitmap paramBitmap)
    {
      this.zQe.zPa = paramBitmap;
      return this;
    }

    public final a asD(String paramString)
    {
      this.zQe.title = paramString;
      return this;
    }

    public final a asE(String paramString)
    {
      this.zQe.zPc = paramString;
      return this;
    }

    public final a asF(String paramString)
    {
      this.zQe.thumbPath = paramString;
      return this;
    }

    public final a asG(String paramString)
    {
      this.zQe.zON = paramString;
      return this;
    }

    public final a asH(String paramString)
    {
      this.zQe.zOO = paramString;
      return this;
    }

    public final a asI(String paramString)
    {
      this.zQe.zOP = paramString;
      return this;
    }

    public final a asJ(String paramString)
    {
      this.zQe.zPf = paramString;
      return this;
    }

    public final a asK(String paramString)
    {
      this.zQe.zPg = paramString;
      return this;
    }

    public final a b(DialogInterface.OnClickListener paramOnClickListener)
    {
      this.zQe.zPo = paramOnClickListener;
      return this;
    }

    public final a b(b paramb)
    {
      this.zQe.zOX = paramb;
      return this;
    }

    public final a f(DialogInterface.OnCancelListener paramOnCancelListener)
    {
      this.zQe.Ue = paramOnCancelListener;
      return this;
    }

    public final a fn(View paramView)
    {
      this.zQe.uvN = paramView;
      return this;
    }

    public final a ra(boolean paramBoolean)
    {
      this.zQe.zPl = paramBoolean;
      return this;
    }

    public final a rb(boolean paramBoolean)
    {
      this.zQe.zOQ = paramBoolean;
      return this;
    }

    public final a rc(boolean paramBoolean)
    {
      this.zQe.gHY = paramBoolean;
      return this;
    }

    public final a rd(boolean paramBoolean)
    {
      this.zQe.zPk = paramBoolean;
      return this;
    }

    public final void show()
    {
      AppMethodBeat.i(138670);
      aMb().show();
      AppMethodBeat.o(138670);
    }

    public static abstract interface a
    {
      public abstract void u(ImageView paramImageView, String paramString);
    }

    public static abstract interface b
    {
      public abstract void bwF();
    }

    public static abstract interface c
    {
      public abstract void djv();
    }

    public static abstract interface d
    {
      public abstract CharSequence a(CharSequence paramCharSequence, float paramFloat);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.c
 * JD-Core Version:    0.6.2
 */