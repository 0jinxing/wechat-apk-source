package com.tencent.mm.plugin.mmsight.segment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public class RecyclerThumbSeekBar extends RelativeLayout
  implements c
{
  private int fPW;
  private int fgI;
  private int fgJ;
  private RecyclerView iJP;
  private VideoTransPara ouc;
  private int oyo;
  private c.a oyp;
  private c.b oyq;
  private RecyclerThumbSeekBar.c oyr;
  private n oys;
  private int oyt;
  private d.a oyu;
  private Runnable oyv;
  private RecyclerView.m oyw;
  private n.a oyx;
  private String path;

  public RecyclerThumbSeekBar(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(54996);
    this.fPW = -1;
    this.oyu = new d.a(4, new RecyclerThumbSeekBar.1(this));
    this.oyv = new RecyclerThumbSeekBar.2(this);
    this.oyw = new RecyclerThumbSeekBar.5(this);
    this.oyx = new RecyclerThumbSeekBar.6(this);
    init();
    AppMethodBeat.o(54996);
  }

  public RecyclerThumbSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(54997);
    this.fPW = -1;
    this.oyu = new d.a(4, new RecyclerThumbSeekBar.1(this));
    this.oyv = new RecyclerThumbSeekBar.2(this);
    this.oyw = new RecyclerThumbSeekBar.5(this);
    this.oyx = new RecyclerThumbSeekBar.6(this);
    init();
    AppMethodBeat.o(54997);
  }

  public RecyclerThumbSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(54998);
    this.fPW = -1;
    this.oyu = new d.a(4, new RecyclerThumbSeekBar.1(this));
    this.oyv = new RecyclerThumbSeekBar.2(this);
    this.oyw = new RecyclerThumbSeekBar.5(this);
    this.oyx = new RecyclerThumbSeekBar.6(this);
    init();
    AppMethodBeat.o(54998);
  }

  private float Z(int paramInt, boolean paramBoolean)
  {
    float f = 0.0F;
    AppMethodBeat.i(55007);
    if ((this.oyr == null) || (this.iJP == null))
      AppMethodBeat.o(55007);
    while (true)
    {
      return f;
      View localView = this.iJP.x(paramInt, 0.0F);
      if (localView == null)
      {
        ab.w("RecyclerThumbSeekBar", "getPositionInTotalRange x[%d] isEnd[%b], view is null.", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
        AppMethodBeat.o(55007);
      }
      else
      {
        int i = RecyclerView.bo(localView);
        int j = this.oyr.getItemCount();
        if (i <= 1)
        {
          AppMethodBeat.o(55007);
        }
        else if (i >= j - 1)
        {
          f = 1.0F;
          AppMethodBeat.o(55007);
        }
        else
        {
          f = (i - 1 + (paramInt - localView.getLeft()) / localView.getWidth()) / (j - 2);
          AppMethodBeat.o(55007);
        }
      }
    }
  }

  private void bQl()
  {
    AppMethodBeat.i(55003);
    al.d(new RecyclerThumbSeekBar.4(this));
    AppMethodBeat.o(55003);
  }

  private void init()
  {
    AppMethodBeat.i(54999);
    this.iJP = new RecyclerView(getContext());
    getContext();
    Object localObject = new LinearLayoutManager(0);
    this.iJP.setLayoutManager((RecyclerView.i)localObject);
    this.iJP.setHasFixedSize(true);
    int i = a.al(getContext(), 2131428734);
    this.oyt = a.al(getContext(), 2131428733);
    localObject = new RelativeLayout.LayoutParams(-1, i);
    addView(this.iJP, (ViewGroup.LayoutParams)localObject);
    this.oys = new n(getContext());
    localObject = new RelativeLayout.LayoutParams(-1, -1);
    addView(this.oys, (ViewGroup.LayoutParams)localObject);
    this.oys.setOnSliderTouchListener(this.oyx);
    this.iJP.a(this.oyw);
    AppMethodBeat.o(54999);
  }

  private void setViewWidth(int paramInt)
  {
    AppMethodBeat.i(55002);
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    localLayoutParams.width = paramInt;
    setLayoutParams(localLayoutParams);
    AppMethodBeat.o(55002);
  }

  public final void RO(String paramString)
  {
    AppMethodBeat.i(55001);
    if ((bo.isNullOrNil(paramString)) || (!e.ct(paramString)))
    {
      bQl();
      AppMethodBeat.o(55001);
    }
    while (true)
    {
      return;
      this.path = paramString;
      post(this.oyv);
      AppMethodBeat.o(55001);
    }
  }

  public final float bQa()
  {
    AppMethodBeat.i(55005);
    float f;
    if (this.oys == null)
    {
      f = 0.0F;
      AppMethodBeat.o(55005);
    }
    while (true)
    {
      return f;
      f = Z(this.oys.getLeftSliderBound(), false);
      ab.d("RecyclerThumbSeekBar", "computeStartPercent x : [%d] ret[%f] seekLoopStartTime[%d] durationMs[%d]", new Object[] { Integer.valueOf(this.oys.getLeftSliderBound()), Float.valueOf(f), Integer.valueOf(Math.round(this.fPW * f)), Integer.valueOf(this.fPW) });
      AppMethodBeat.o(55005);
    }
  }

  public final float bQb()
  {
    AppMethodBeat.i(55006);
    float f;
    if (this.oys == null)
    {
      f = 0.0F;
      AppMethodBeat.o(55006);
    }
    while (true)
    {
      return f;
      f = Z(this.oys.getRightSliderBound(), true);
      ab.d("RecyclerThumbSeekBar", "computeEndPercent x : [%d] ret[%f] seekLoopEndTime[%d]", new Object[] { Integer.valueOf(this.oys.getRightSliderBound()), Float.valueOf(f), Integer.valueOf(Math.round(this.fPW * f)) });
      AppMethodBeat.o(55006);
    }
  }

  public int getDurationMs()
  {
    return this.fPW;
  }

  public final void iX(boolean paramBoolean)
  {
    if (paramBoolean);
    for (this.oys.oyN = true; ; this.oys.oyN = false)
      return;
  }

  public final void release()
  {
    AppMethodBeat.i(55004);
    this.fPW = -1;
    this.path = null;
    if (this.oyu != null)
      this.oyu.destroy();
    Object localObject;
    if ((this.oyr != null) && (this.oyr.oyD != null))
    {
      localObject = this.oyr.oyD;
      if ((((RecyclerThumbSeekBar.d)localObject).oyI != null) && (((RecyclerThumbSeekBar.d)localObject).oyI.length != 0))
        for (int i = 0; i < ((RecyclerThumbSeekBar.d)localObject).oyI.length; i++)
          if (localObject.oyI[i] != null)
          {
            localObject.oyI[i].quit();
            ((RecyclerThumbSeekBar.d)localObject).oyI[i] = null;
          }
      this.oyr.oyD = null;
      this.oyr = null;
    }
    if (this.oys != null)
    {
      localObject = this.oys;
      if ((((n)localObject).ozg != null) && (((n)localObject).ozh != null))
      {
        ((n)localObject).oyQ.setBounds(((n)localObject).ozg);
        ((n)localObject).oyR.setBounds(((n)localObject).ozh);
        ((n)localObject).oyV = -1.0F;
        ((n)localObject).postInvalidate();
      }
    }
    AppMethodBeat.o(55004);
  }

  public void setCurrentCursorPosition(float paramFloat)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(55000);
    n localn = this.oys;
    float f2 = f1;
    if (this.oyr != null)
    {
      if (this.iJP != null)
        break label46;
      f2 = f1;
    }
    while (true)
    {
      localn.setCursorPos(f2);
      AppMethodBeat.o(55000);
      return;
      label46: float f3 = this.oyr.getItemCount() * paramFloat;
      int i = (int)Math.floor(f3);
      paramFloat = i;
      Object localObject = this.iJP.cf(i + 1);
      f2 = f1;
      if (localObject != null)
      {
        localObject = ((RecyclerView.v)localObject).apJ;
        f2 = ((View)localObject).getLeft();
        f2 = (((View)localObject).getWidth() * (f3 - paramFloat) + f2) / getWidth();
      }
    }
  }

  public void setOnPreparedListener(c.a parama)
  {
    this.oyp = parama;
  }

  public void setThumbBarSeekListener(c.b paramb)
  {
    this.oyq = paramb;
  }

  public void setVideoTransPara(VideoTransPara paramVideoTransPara)
  {
    this.ouc = paramVideoTransPara;
  }

  final class e extends RecyclerView.v
  {
    ImageView cAw;

    e(View paramInt, int arg3)
    {
      super();
      AppMethodBeat.i(54995);
      int i;
      if (i == 0)
        this.cAw = ((ImageView)((LinearLayout)paramInt).getChildAt(0));
      AppMethodBeat.o(54995);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar
 * JD-Core Version:    0.6.2
 */