package com.tencent.mm.plugin.sight.draft.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.j;
import com.tencent.mm.modelvideo.k;
import com.tencent.mm.modelvideo.l;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class b extends p<j>
{
  private int itemHeight;
  private int itemWidth;
  a qzA;
  int qzB;
  int qzC;
  private int qzD;
  private int qzE;
  private c qzF;
  b.e qzG;
  b.a qzv;
  private b.b qzw;
  private b.c qzx;
  private Set<b.e> qzy;
  private b.d qzz;

  public b(Context paramContext, a parama)
  {
    super(paramContext, null);
    AppMethodBeat.i(25005);
    this.qzv = new b.a(this, (byte)0);
    this.qzw = new b.b(this, (byte)0);
    this.qzx = new b.c(this, (byte)0);
    this.qzy = new HashSet();
    this.qzz = b.d.qzI;
    this.qzB = 2131303539;
    this.qzC = 0;
    this.qzF = new b.1(this);
    this.qzA = parama;
    int i = paramContext.getResources().getDimensionPixelSize(2131428642) * 2;
    this.qzD = (paramContext.getResources().getDisplayMetrics().widthPixels / 3);
    this.itemWidth = (this.qzD - i);
    this.itemHeight = (this.itemWidth * 3 / 4);
    this.qzE = (i + this.itemHeight);
    AppMethodBeat.o(25005);
  }

  public final void KC()
  {
    AppMethodBeat.i(25010);
    KD();
    super.notifyDataSetChanged();
    AppMethodBeat.o(25010);
  }

  public final void KD()
  {
    AppMethodBeat.i(25011);
    setCursor(o.alp().alg());
    AppMethodBeat.o(25011);
  }

  final void a(b.e parame)
  {
    AppMethodBeat.i(25007);
    if (parame == null)
    {
      parame = this.qzy.iterator();
      while (parame.hasNext())
        ((b.e)parame.next()).qzN.setVisibility(8);
      AppMethodBeat.o(25007);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.qzy.iterator();
      if (localIterator.hasNext())
      {
        b.e locale = (b.e)localIterator.next();
        View localView = locale.qzN;
        if (parame == locale);
        for (int i = 8; ; i = 0)
        {
          localView.setVisibility(i);
          break;
        }
      }
      AppMethodBeat.o(25007);
    }
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(25009);
    this.qzy.clear();
    super.a(paramString, paramm);
    AppMethodBeat.o(25009);
  }

  public final boolean a(b.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(25008);
    if (paramd == this.qzz)
    {
      if ((paramBoolean) && (this.qzA != null))
        this.qzA.clv();
      paramBoolean = false;
      AppMethodBeat.o(25008);
    }
    while (true)
    {
      return paramBoolean;
      this.qzz = paramd;
      this.qzv.clw();
      notifyDataSetChanged();
      if ((paramBoolean) && (this.qzA != null))
        this.qzA.clv();
      paramBoolean = true;
      AppMethodBeat.o(25008);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(25012);
    int i = super.getCount() / 3;
    AppMethodBeat.o(25012);
    return i + 1;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(25006);
    Object localObject1;
    int i;
    Object localObject3;
    Object localObject4;
    if (paramView == null)
    {
      localObject1 = new b.f((byte)0);
      paramView = new LinearLayout(paramViewGroup.getContext());
      paramView.setOrientation(0);
      for (i = 0; i < 3; i++)
      {
        localObject2 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970686, paramView, false);
        localObject3 = new b.e((byte)0);
        ((b.e)localObject3).gbS = ((View)localObject2);
        ((b.e)localObject3).gbS.setTag(localObject3);
        ((b.e)localObject3).qzL = ((View)localObject2).findViewById(2131827565);
        ((b.e)localObject3).qzM = ((com.tencent.mm.plugin.sight.decode.a.a)((View)localObject2).findViewById(2131827566));
        ((b.e)localObject3).moR = ((ImageView)((View)localObject2).findViewById(2131827567));
        ((b.e)localObject3).qzN = ((View)localObject2).findViewById(2131827569);
        ((b.e)localObject3).iqU = ((TextView)((View)localObject2).findViewById(2131827568));
        ((b.e)localObject3).iqU.setText(this.qzB);
        ((b.e)localObject3).qpr = ((ImageView)((View)localObject2).findViewById(2131827570));
        ((b.f)localObject1).qzP.add(localObject3);
        localObject4 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject4).weight = 1.0F;
        ((LinearLayout.LayoutParams)localObject4).height = this.qzE;
        paramView.addView((View)localObject2);
        ((View)localObject2).setOnClickListener(this.qzv);
        ((b.e)localObject3).qpr.setTag(localObject3);
        ((b.e)localObject3).qpr.setOnClickListener(this.qzx);
      }
      paramView.setTag(localObject1);
    }
    int j;
    for (paramViewGroup = (ViewGroup)localObject1; ; paramViewGroup = (b.f)paramView.getTag())
      for (i = 0; ; i++)
      {
        if (i >= paramViewGroup.qzP.size())
          break label659;
        j = paramInt * 3 + i;
        localObject1 = (b.e)paramViewGroup.qzP.get(i);
        this.qzy.add(localObject1);
        ((b.e)localObject1).qzN.setVisibility(8);
        ((b.e)localObject1).iqU.setVisibility(8);
        ((b.e)localObject1).moR.setBackgroundResource(2130840200);
        ((b.e)localObject1).qzM.bf(null, false);
        ((b.e)localObject1).qzM.setCanPlay(false);
        ((b.e)localObject1).qzM.setForceRecordState(false);
        ((ImageView)((b.e)localObject1).qzM).setBackgroundResource(0);
        if (j < getRealCount())
          break;
        ((b.e)localObject1).qzO = null;
        ((b.e)localObject1).gbS.setVisibility(4);
        h.r(((b.e)localObject1).qzL, 1.0F);
      }
    this.qzC -= 1;
    Object localObject2 = (j)getItem(j);
    aw.ZK();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      ((b.e)localObject1).qzO = null;
      ((b.e)localObject1).qzM.ckX();
      if (b.d.qzJ != this.qzz)
        break label637;
      ((b.e)localObject1).qpr.setVisibility(0);
      h.r(((b.e)localObject1).qzL, 0.95F);
    }
    while (true)
    {
      ((b.e)localObject1).gbS.setVisibility(0);
      break;
      ((b.e)localObject1).qzO = ((j)localObject2);
      localObject3 = this.qzF;
      localObject4 = ((j)localObject2).field_fileName;
      localObject2 = k.tY(((j)localObject2).field_fileName);
      if (this.qzC <= 0);
      for (boolean bool = true; ; bool = false)
      {
        localObject4 = ((c)localObject3).x((String)localObject4, (String)localObject2, bool);
        ((ImageView)((b.e)localObject1).qzM).setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((b.e)localObject1).qzM.setThumbBmp((Bitmap)localObject4);
        break;
      }
      label637: ((b.e)localObject1).qpr.setVisibility(8);
      h.r(((b.e)localObject1).qzL, 1.0F);
    }
    label659: AppMethodBeat.o(25006);
    return paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.b
 * JD-Core Version:    0.6.2
 */