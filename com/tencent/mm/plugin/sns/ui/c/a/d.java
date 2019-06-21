package com.tencent.mm.plugin.sns.ui.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.b.e;
import com.tencent.mm.plugin.sns.storage.b.h;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.QImageView.a;
import com.tencent.mm.ui.widget.RoundedCornerRelativeLayout;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;
import java.util.List;

public final class d extends a
{
  Context context;
  public int currentIndex;
  boolean rEC;
  public View rHf;
  public View rHg;
  private int[] rHh;
  private final int rHi;
  com.tencent.mm.plugin.sns.a.b.g rqn;

  public d(TimeLineObject paramTimeLineObject, n paramn, com.tencent.mm.plugin.sns.ui.d.b paramb, com.tencent.mm.plugin.sns.a.b.g paramg)
  {
    AppMethodBeat.i(40109);
    this.rEC = false;
    this.rHh = new int[] { 2131827917, 2131827918 };
    this.rHi = 2131827919;
    this.timeLineObject = paramTimeLineObject;
    this.ros = paramn;
    this.rqo = paramb;
    this.rqn = paramg;
    AppMethodBeat.o(40109);
  }

  private View a(bau parambau, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(40113);
    int[] arrayOfInt = new int[2];
    int[] tmp12_10 = arrayOfInt;
    tmp12_10[0] = 2131827917;
    int[] tmp17_12 = tmp12_10;
    tmp17_12[1] = 2131827918;
    tmp17_12;
    if (paramBoolean)
    {
      parambau = this.contentView.findViewById(arrayOfInt[paramInt]);
      AppMethodBeat.o(40113);
    }
    while (true)
    {
      return parambau;
      if (parambau.jCt == 6)
      {
        parambau = this.contentView.findViewById(2131827919);
        AppMethodBeat.o(40113);
      }
      else if (parambau.jCt == 2)
      {
        parambau = this.contentView.findViewById(arrayOfInt[paramInt]);
        AppMethodBeat.o(40113);
      }
      else
      {
        parambau = null;
        AppMethodBeat.o(40113);
      }
    }
  }

  final void Eq(int paramInt)
  {
    AppMethodBeat.i(40111);
    if ((this.rHg == null) || (this.rHf == null))
    {
      AppMethodBeat.o(40111);
      return;
    }
    this.currentIndex = paramInt;
    this.rHg.setVisibility(8);
    this.rHf.setVisibility(8);
    ((TextView)this.contentView.findViewById(2131827921)).setText(null);
    ((TextView)this.contentView.findViewById(2131827924)).setText(null);
    ((TextView)this.contentView.findViewById(2131827922)).setText(null);
    ((TextView)this.contentView.findViewById(2131827925)).setText(null);
    Object localObject1 = { 2131827924, 2131827925 };
    Object localObject2 = { 2131827921, 2131827922 };
    int[] arrayOfInt = { 2131827921, 2131827925 };
    Object localObject3 = this.ros.cqo();
    if ((((com.tencent.mm.plugin.sns.storage.b)localObject3).qUX != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUX.qVt != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUX.qVt.size() >= 2))
    {
      localObject3 = (b.h)((com.tencent.mm.plugin.sns.storage.b)localObject3).qUX.qVt.get(paramInt);
      if ((((b.h)localObject3).qVk >= 0) && (((b.h)localObject3).qVk < 3))
      {
        paramInt = ((b.h)localObject3).qVk;
        localObject2 = new int[][] { localObject1, localObject2, arrayOfInt }[paramInt];
        localObject1 = (TextView)this.contentView.findViewById(localObject2[0]);
        localObject2 = (TextView)this.contentView.findViewById(localObject2[1]);
        if (!bo.isNullOrNil(((b.h)localObject3).title))
          break label354;
        ((TextView)localObject1).setVisibility(8);
        label307: if (!bo.isNullOrNil(((b.h)localObject3).desc))
          break label371;
        ((TextView)localObject2).setVisibility(8);
      }
    }
    while (true)
    {
      ((View)((TextView)localObject1).getParent()).setVisibility(0);
      ((View)((TextView)localObject2).getParent()).setVisibility(0);
      AppMethodBeat.o(40111);
      break;
      label354: ((TextView)localObject1).setVisibility(0);
      ((TextView)localObject1).setText(((b.h)localObject3).title);
      break label307;
      label371: ((TextView)localObject2).setVisibility(0);
      ((TextView)localObject2).setText(((b.h)localObject3).desc);
    }
  }

  public final void cuV()
  {
    AppMethodBeat.i(40112);
    int i;
    Object localObject1;
    label126: int j;
    label132: label148: Object localObject2;
    Object localObject3;
    float f1;
    float f2;
    if (this.timeLineObject.xfI.wbK.size() >= 2)
    {
      long l;
      if (this.ros.field_likeFlag == 1)
      {
        i = 1;
        if ((this.rqn != null) && (((bau)this.timeLineObject.xfI.wbK.get(i)).jCt == 6))
        {
          localObject1 = this.rqn;
          l = this.ros.field_snsId;
          if (this.ros.field_likeFlag != 1)
            break label126;
        }
      }
      for (boolean bool = true; ; bool = false)
      {
        ((com.tencent.mm.plugin.sns.a.b.g)localObject1).x(l, bool);
        if (!this.rEC)
          break label132;
        ab.i("MicroMsg.TurnCardAdDetailItem", "isPlayAnimation, return");
        AppMethodBeat.o(40112);
        return;
        i = 0;
        break;
      }
      if (this.ros.field_likeFlag != 1)
        break label401;
      i = 0;
      j = 1;
      localObject1 = (bau)this.timeLineObject.xfI.wbK.get(j);
      localObject2 = (bau)this.timeLineObject.xfI.wbK.get(i);
      localObject1 = a((bau)localObject1, j, false);
      localObject2 = a((bau)localObject2, i, true);
      j = ((WindowManager)this.context.getSystemService("window")).getDefaultDisplay().getWidth();
      localObject3 = new int[2];
      this.contentView.getLocationOnScreen((int[])localObject3);
      f1 = j / 2 - localObject3[1];
      this.contentView.setPivotY(f1);
      this.contentView.setCameraDistance(8000.0F);
      f2 = this.contentView.getWidth() / 2.0F;
      f1 = this.contentView.getHeight() / 2.0F;
      if (this.ros.field_likeFlag != 1)
        break label409;
      j = -90;
    }
    for (int k = 90; ; k = -90)
    {
      localObject3 = new com.tencent.mm.plugin.sns.ui.widget.a(this.context, 0.0F, k, f2, f1, true);
      ((com.tencent.mm.plugin.sns.ui.widget.a)localObject3).setDuration(187L);
      ((com.tencent.mm.plugin.sns.ui.widget.a)localObject3).setInterpolator(new AccelerateInterpolator());
      ((com.tencent.mm.plugin.sns.ui.widget.a)localObject3).setAnimationListener(new d.2(this, (View)localObject2, (View)localObject1, i, j, f2, f1));
      this.contentView.startAnimation((Animation)localObject3);
      this.rEC = true;
      AppMethodBeat.o(40112);
      break;
      label401: i = 1;
      j = 0;
      break label148;
      label409: j = 90;
    }
  }

  public final void g(View paramView1, View paramView2)
  {
    AppMethodBeat.i(40110);
    this.contentView = paramView1;
    this.rpP = paramView2;
    this.context = paramView1.getContext();
    paramView2 = (WindowManager)this.context.getSystemService("window");
    int i = Math.min(paramView2.getDefaultDisplay().getWidth(), paramView2.getDefaultDisplay().getHeight()) - com.tencent.mm.bz.a.al(this.context, 2131428663) - com.tencent.mm.bz.a.al(this.context, 2131427865) - this.context.getResources().getDimensionPixelSize(2131427812) - this.context.getResources().getDimensionPixelSize(2131427812) - this.context.getResources().getDimensionPixelSize(2131427858);
    paramView2 = (LinearLayout.LayoutParams)paramView1.getLayoutParams();
    paramView2.topMargin = this.context.getResources().getDimensionPixelOffset(2131427796);
    paramView2.bottomMargin = 0;
    paramView2.width = i;
    paramView2.height = i;
    paramView1.setLayoutParams(paramView2);
    ((RoundedCornerRelativeLayout)paramView1).setRadius(8.0F);
    if ((paramView1.getParent() instanceof ViewGroup))
    {
      ((ViewGroup)paramView1.getParent()).setClipChildren(false);
      ((ViewGroup)paramView1.getParent()).setClipToPadding(false);
    }
    int[] arrayOfInt = this.rHh;
    int j = arrayOfInt.length;
    for (int k = 0; k < j; k++)
    {
      paramView2 = (MaskImageView)paramView1.findViewById(arrayOfInt[k]);
      paramView2.setVisibility(8);
      paramView2.setOnTouchListener(new d.1(this));
    }
    paramView2 = paramView1.findViewById(this.rHi);
    paramView2.setBackground(null);
    paramView2.setVisibility(8);
    ((ViewGroup)paramView2).setClipChildren(false);
    this.rGD = new aj();
    this.rGD.rnt = paramView2;
    this.rGD.rns = this.rGD.rnt;
    this.rGD.qzM = ((com.tencent.mm.plugin.sight.decode.a.a)this.rGD.rnt.findViewById(2131820629));
    this.rGD.raP = ((ImageView)this.rGD.rnt.findViewById(2131820981));
    this.rGD.rnu = ((MMPinProgressBtn)this.rGD.rnt.findViewById(2131821370));
    this.rGD.rnv = ((TextView)this.rGD.rnt.findViewById(2131827571));
    this.rGD.raQ = ((TextView)this.rGD.rnt.findViewById(2131827572));
    this.rGD.rnt.setTag(this);
    this.rGD.rnt.setOnClickListener(null);
    ((SightPlayImageView)this.rGD.qzM).qyI = true;
    ((SightPlayImageView)this.rGD.qzM).setScaleType(QImageView.a.zNT);
    this.rGD.qzM.fi(i, i);
    paramView1.setLayerType(2, null);
    this.rHg = paramView1.findViewById(2131827920);
    this.rHf = paramView1.findViewById(2131827923);
    Eq(0);
    AppMethodBeat.o(40110);
  }

  public final void refreshView()
  {
    AppMethodBeat.i(40114);
    this.ros = h.YS(this.ros.cqA());
    ab.i("MicroMsg.TurnCardAdDetailItem", "refresh view");
    int i = ((WindowManager)this.context.getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bz.a.fromDPToPix(this.context, 50) - this.context.getResources().getDimensionPixelSize(2131427812) - this.context.getResources().getDimensionPixelSize(2131427812) - this.context.getResources().getDimensionPixelSize(2131427858);
    label141: label306: label567: label704: label1473: if (this.ros.cqu().xfI.wbK.size() >= 2)
    {
      int j;
      final int k;
      Object localObject1;
      MaskImageView localMaskImageView;
      Object localObject2;
      com.tencent.mm.plugin.sns.model.g localg;
      int m;
      az localaz;
      label252: boolean bool1;
      label328: final long l1;
      if (this.ros.field_likeFlag == 1)
      {
        j = 1;
        Eq(j);
        k = 0;
        if (k >= 2)
          break label1497;
        localObject1 = (bau)this.ros.cqu().xfI.wbK.get(k);
        localMaskImageView = (MaskImageView)this.contentView.findViewById(this.rHh[k]);
        localObject2 = localMaskImageView.getLayoutParams();
        localMaskImageView.setTag(this);
        if (((bau)localObject1).jCt != 2)
          break label814;
        localg = af.cnC();
        m = hashCode();
        localaz = az.dtk();
        localaz.oyB = this.timeLineObject.pcX;
        localg.a((bau)localObject1, localMaskImageView, -1, m, localaz, 3);
        localMaskImageView.setScaleType(QImageView.a.zNT);
        ((ViewGroup.LayoutParams)localObject2).width = i;
        ((ViewGroup.LayoutParams)localObject2).height = i;
        if ((j != k) || (((bau)localObject1).jCt != 2))
          break label858;
        localMaskImageView.setVisibility(0);
        localMaskImageView.setOnClickListener(new d.3(this, j));
        if ((((bau)localObject1).jCt == 6) && (j == k))
        {
          if (j <= 0)
            break label874;
          bool1 = true;
          l1 = this.ros.field_snsId;
          localObject2 = this.rGD.rns.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject2).width = i;
          ((ViewGroup.LayoutParams)localObject2).height = i;
          this.rGD.qzM.fi(i, i);
          this.rGD.rns.setVisibility(0);
          af.cnC().a(this.ros, (bau)localObject1, this.rGD.qzM, this.context.hashCode(), 0, az.xYT, this.ros.DI(32), true);
          this.rGD.rnw = true;
          this.rGD.rnx = k;
          this.rGD.rnr = this.timeLineObject;
          this.rGD.position = 0;
          this.rGD.cwT = this.ros.cqU();
          this.rGD.rnt.setOnClickListener(new d.4(this, bool1));
          this.rGD.qzM.setOnCompletionListener(new d.5(this, l1, bool1));
          if (this.rqn != null)
          {
            if (this.rqn.jO(k + l1))
              break label880;
            this.rGD.qzM.setOnDecodeDurationListener(new b.f()
            {
              public final void b(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, long paramAnonymousLong)
              {
                AppMethodBeat.i(40108);
                if (paramAnonymousLong >= 3L)
                {
                  int i = (int)paramAnonymousb.cle();
                  if (d.this.rqn != null)
                  {
                    d.this.rqn.c(l1, bo.yz(), k);
                    d.this.rqn.f(l1, i, k);
                    d.this.rqn.T(l1, l1 + this.val$index);
                  }
                  d.this.rGD.qzM.setOnDecodeDurationListener(null);
                }
                AppMethodBeat.o(40108);
              }
            });
          }
          this.rGD.a(this.timeLineObject, 0, this.ros.cqU(), this.ros.DI(32));
          this.rGD.raQ.setVisibility(8);
          localObject2 = af.cnC();
          long l2 = System.nanoTime();
          bool2 = com.tencent.mm.plugin.sns.model.g.t((bau)localObject1);
          ab.i("MicroMsg.TurnCardAdDetailItem", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool2), Long.valueOf(System.nanoTime() - l2) });
          if (bool2)
            break label1101;
          if (!((com.tencent.mm.plugin.sns.model.g)localObject2).w((bau)localObject1))
            break label897;
          this.rGD.raP.setVisibility(8);
          this.rGD.rnu.setVisibility(0);
          this.rGD.rnu.dKB();
          if (this.rqn != null)
          {
            localObject2 = an.fZ(af.getAccSnsPath(), ((bau)localObject1).Id);
            localObject1 = i.j((bau)localObject1);
            if (!e.ct((String)localObject2 + (String)localObject1))
              break label1473;
            this.rqn.v(this.ros.field_snsId, true);
            if (af.cnC().b(this.ros, null) != 5)
              break label1491;
          }
        }
      }
      label1101: label1491: for (boolean bool2 = true; ; bool2 = false)
      {
        this.rqn.c(l1, bool2, bool1);
        k++;
        break label141;
        j = 0;
        break;
        localg = af.cnC();
        m = hashCode();
        localaz = az.dtk();
        localaz.oyB = this.timeLineObject.pcX;
        localg.a((bau)localObject1, localMaskImageView, m, localaz);
        break label252;
        label858: localMaskImageView.setVisibility(8);
        localMaskImageView.setOnClickListener(null);
        break label306;
        label874: bool1 = false;
        break label328;
        label880: this.rqn.c(l1, bo.yz(), bool1);
        break label567;
        if (((com.tencent.mm.plugin.sns.model.g)localObject2).b(this.ros, null) == 5)
        {
          ((com.tencent.mm.plugin.sns.model.g)localObject2).A((bau)localObject1);
          this.rGD.raP.setVisibility(8);
          this.rGD.rnu.setVisibility(0);
          this.rGD.rnu.dKB();
          break label704;
        }
        if (((com.tencent.mm.plugin.sns.model.g)localObject2).x((bau)localObject1))
        {
          this.rGD.rnu.setVisibility(8);
          this.rGD.raP.setImageResource(2130840197);
          this.rGD.raP.setVisibility(0);
          break label704;
        }
        ((com.tencent.mm.plugin.sns.model.g)localObject2).y((bau)localObject1);
        this.rGD.raP.setVisibility(0);
        this.rGD.rnu.setVisibility(8);
        this.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
        this.rGD.raP.setContentDescription(this.context.getString(2131301953));
        if (((com.tencent.mm.plugin.sns.model.g)localObject2).b(this.ros, null) != 4)
          break label704;
        this.rGD.raQ.setVisibility(0);
        break label704;
        if (((com.tencent.mm.plugin.sns.model.g)localObject2).u((bau)localObject1))
        {
          this.rGD.raP.setVisibility(0);
          this.rGD.rnu.setVisibility(8);
          this.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
          this.rGD.raP.setContentDescription(this.context.getString(2131301953));
        }
        while (true)
        {
          if (!this.rGD.qzM.ckY())
            break label1471;
          ab.d("MicroMsg.TurnCardAdDetailItem", "play video error " + ((bau)localObject1).Id + " " + ((bau)localObject1).Url + " " + ((bau)localObject1).wEH + " 0");
          ((com.tencent.mm.plugin.sns.model.g)localObject2).y((bau)localObject1);
          this.rGD.raP.setVisibility(0);
          this.rGD.rnu.setVisibility(8);
          this.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
          this.rGD.raP.setContentDescription(this.context.getString(2131301953));
          break;
          if (((com.tencent.mm.plugin.sns.model.g)localObject2).v((bau)localObject1))
          {
            this.rGD.raP.setVisibility(8);
            this.rGD.rnu.setVisibility(8);
          }
          else if (((com.tencent.mm.plugin.sns.model.g)localObject2).b(this.ros, null) <= 5)
          {
            this.rGD.raP.setVisibility(8);
            this.rGD.rnu.setVisibility(8);
          }
          else
          {
            ((com.tencent.mm.plugin.sns.model.g)localObject2).y((bau)localObject1);
            this.rGD.raP.setVisibility(0);
            this.rGD.rnu.setVisibility(8);
            this.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231923));
            this.rGD.raP.setContentDescription(this.context.getString(2131301953));
          }
        }
        break label704;
        this.rqn.v(this.ros.field_snsId, false);
        break label772;
      }
    }
    label772: label814: label1471: label1497: AppMethodBeat.o(40114);
    label897:
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.d
 * JD-Core Version:    0.6.2
 */