package com.tencent.mm.plugin.sns.ui.item;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.b.e;
import com.tencent.mm.plugin.sns.storage.b.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
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

public final class i extends BaseTimeLineItem
{
  private static int[] rHh = { 2131827917, 2131827918 };
  private static int[] rIW = { 2131827919 };
  private static int[][] rIX = { { 2131827924, 2131827925 }, { 2131827921, 2131827922 }, { 2131827921, 2131827925 } };
  public int mScreenHeight = 0;
  private int mScreenWidth = 0;
  private int rIV = 0;

  private static void a(i.a parama)
  {
    AppMethodBeat.i(40165);
    parama.rJd.rGQ.setVisibility(8);
    parama.rJd.rGR.setVisibility(8);
    ((TextView)parama.rJd.rJf.findViewById(2131827921)).setText(null);
    ((TextView)parama.rJd.rJf.findViewById(2131827924)).setText(null);
    ((TextView)parama.rJd.rJf.findViewById(2131827922)).setText(null);
    ((TextView)parama.rJd.rJf.findViewById(2131827925)).setText(null);
    Object localObject = parama.ros.cqo();
    TextView localTextView;
    if ((((com.tencent.mm.plugin.sns.storage.b)localObject).qUX != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject).qUX.qVt != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject).qUX.qVt.size() >= 2))
    {
      localObject = (b.h)((com.tencent.mm.plugin.sns.storage.b)localObject).qUX.qVt.get(parama.index);
      if ((((b.h)localObject).qVk >= 0) && (((b.h)localObject).qVk < rIX.length))
      {
        int[] arrayOfInt = rIX[localObject.qVk];
        localTextView = (TextView)parama.rJd.rJf.findViewById(arrayOfInt[0]);
        parama = (TextView)parama.rJd.rJf.findViewById(arrayOfInt[1]);
        if (!bo.isNullOrNil(((b.h)localObject).title))
          break label287;
        localTextView.setVisibility(8);
        if (!bo.isNullOrNil(((b.h)localObject).desc))
          break label303;
        parama.setVisibility(8);
      }
    }
    while (true)
    {
      ((View)localTextView.getParent()).setVisibility(0);
      ((View)parama.getParent()).setVisibility(0);
      AppMethodBeat.o(40165);
      return;
      label287: localTextView.setVisibility(0);
      localTextView.setText(((b.h)localObject).title);
      break;
      label303: parama.setVisibility(0);
      parama.setText(((b.h)localObject).desc);
    }
  }

  public static View u(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(40164);
    if (paramInt2 == 6)
    {
      paramView = paramView.findViewById(rIW[0]);
      AppMethodBeat.o(40164);
    }
    while (true)
    {
      return paramView;
      paramView = paramView.findViewById(rHh[paramInt1]);
      AppMethodBeat.o(40164);
    }
  }

  @TargetApi(16)
  public final void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, final int paramInt2, final au paramau)
  {
    AppMethodBeat.i(40163);
    ab.i("MiroMsg.TurnMediaTimeLineItem", "fill turn card ad item %d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramBaseViewHolder.eBB)
    {
      ab.i("MiroMsg.TurnMediaTimeLineItem", "holder is busy");
      AppMethodBeat.o(40163);
      return;
    }
    final i.b localb = (i.b)paramBaseViewHolder;
    localb.rJf.setTag(localb);
    localb.rJf.setVisibility(0);
    localb.rJf.setLayerType(2, null);
    Object localObject1 = (i.b)localb;
    int k;
    Object localObject3;
    for (k : rHh)
    {
      localObject3 = ((i.b)localObject1).rJf.findViewById(k);
      if (localObject3 != null)
        ((View)localObject3).setVisibility(8);
      if ((localObject3 instanceof MaskImageView))
        ((MaskImageView)localObject3).setScaleType(QImageView.a.zNT);
    }
    for (k : rIW)
    {
      ??? = ((i.b)localObject1).rJf.findViewById(k);
      if (??? != null)
      {
        ((View)???).setBackground(null);
        ((View)???).setVisibility(8);
        if ((??? instanceof ViewGroup))
          ((ViewGroup)???).setClipChildren(false);
      }
    }
    localObject1 = new LinearLayout.LayoutParams(((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 54) - this.mActivity.getResources().getDimensionPixelSize(2131427786) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427858), -2);
    paramBaseViewHolder.rHB.setLayoutParams((ViewGroup.LayoutParams)localObject1);
    label392: label401: bau localbau;
    View localView;
    Object localObject4;
    label536: boolean bool1;
    label572: long l;
    Object localObject5;
    label677: Object localObject6;
    boolean bool2;
    if ((paramav.rgZ) && (paramInt2 == 11))
      if ((paramTimeLineObject.xfI != null) && (paramTimeLineObject.xfI.wbK != null) && (paramTimeLineObject.xfI.wbK.size() >= 2))
        if (localb.rHu == 1)
        {
          paramInt2 = 1;
          ??? = null;
          localObject1 = null;
          ??? = 0;
          if (??? >= Math.min(paramTimeLineObject.xfI.wbK.size(), 2))
            break label1941;
          localbau = (bau)paramTimeLineObject.xfI.wbK.get(???);
          localView = u(localb.rJf, ???, 2);
          localView.setVisibility(4);
          if (localView == null)
            break label2050;
          localView.setTag(paramBaseViewHolder);
          localView.setOnClickListener(paramau.qOL.rKn);
          if (localbau.jCt != 2)
            break label1292;
          localObject4 = af.cnC();
          ??? = this.mActivity.hashCode();
          localObject3 = az.dtg();
          ((az)localObject3).oyB = paramTimeLineObject.pcX;
          ((com.tencent.mm.plugin.sns.model.g)localObject4).a(localbau, localView, -1, ???, (az)localObject3, 3);
          localObject4 = null;
          localObject3 = localObject4;
          if (localbau.jCt == 6)
          {
            localObject3 = localObject4;
            if (paramInt2 == ???)
            {
              if (paramInt2 <= 0)
                break label1337;
              bool1 = true;
              l = paramav.rAt;
              localObject5 = localb.rJi;
              localObject4 = paramav.qBY;
              localObject3 = ((aj)localObject5).rns;
              ((aj)localObject5).rnr = paramTimeLineObject;
              ((aj)localObject5).qzM.setOnCompletionListener(new i.1(this, paramau, l, bool1));
              if (paramau.rxP.rhm.jO(??? + l))
                break label1343;
              ((aj)localObject5).qzM.setOnDecodeDurationListener(new i.2(this, paramau, l, bool1, ???, (aj)localObject5));
              ((aj)localObject5).a(paramTimeLineObject, paramInt1, paramav.riA, paramav.rgZ);
              ((aj)localObject5).raQ.setVisibility(8);
              localObject6 = af.cnC();
              l = System.nanoTime();
              bool2 = com.tencent.mm.plugin.sns.model.g.t(localbau);
              ab.i("MiroMsg.TurnMediaTimeLineItem", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool2), Long.valueOf(System.nanoTime() - l) });
              if (bool2)
                break label1566;
              if (!((com.tencent.mm.plugin.sns.model.g)localObject6).w(localbau))
                break label1388;
              ((aj)localObject5).raP.setVisibility(8);
              ((aj)localObject5).rnu.setVisibility(0);
              ((aj)localObject5).rnu.dKB();
              label794: Object localObject7 = ((aj)localObject5).rnv.getLayoutParams();
              ((ViewGroup.LayoutParams)localObject7).width = this.rIV;
              ((ViewGroup.LayoutParams)localObject7).height = this.rIV;
              ((aj)localObject5).rnv.setLayoutParams((ViewGroup.LayoutParams)localObject7);
              ((aj)localObject5).qzM.setTagObject(localObject5);
              localObject7 = ((aj)localObject5).qzM;
              ??? = this.mActivity.hashCode();
              az localaz = az.dtg();
              localaz.oyB = paramTimeLineObject.pcX;
              ((com.tencent.mm.plugin.sns.model.g)localObject6).a((n)localObject4, localbau, (com.tencent.mm.plugin.sight.decode.a.a)localObject7, ???, paramInt1, localaz, paramav.rgZ, true);
              ((View)localObject3).setVisibility(0);
              ((aj)localObject5).rnt.setTag(paramBaseViewHolder);
              ((aj)localObject5).rnt.setOnClickListener(new View.OnClickListener()
              {
                public final void onClick(View paramAnonymousView)
                {
                  AppMethodBeat.i(40158);
                  if (paramInt2 > 0)
                    paramau.rxP.rhm.jQ(localb.rHt);
                  paramau.qOL.rKn.onClick(paramAnonymousView);
                  AppMethodBeat.o(40158);
                }
              });
              localObject6 = an.fZ(af.getAccSnsPath(), localbau.Id);
              localObject5 = com.tencent.mm.plugin.sns.data.i.j(localbau);
              if (!e.ct((String)localObject6 + (String)localObject5))
                break label1906;
              paramau.rxP.rhm.a(paramav.rAt, 0, true, bool1);
              label999: if (af.cnC().b((n)localObject4, null) != 5)
                break label1928;
              bool2 = true;
              label1015: paramau.rxP.rhm.c(paramav.rAt, bool2, bool1);
            }
          }
          localObject4 = localView.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject4).width = this.rIV;
          ((ViewGroup.LayoutParams)localObject4).height = this.rIV;
          localView.setLayoutParams((ViewGroup.LayoutParams)localObject4);
          if (localObject3 != null)
          {
            localObject4 = ((View)localObject3).getLayoutParams();
            ((ViewGroup.LayoutParams)localObject4).width = this.rIV;
            ((ViewGroup.LayoutParams)localObject4).height = this.rIV;
            ((View)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          }
          if ((paramInt2 == ???) && (localbau.jCt == 2))
          {
            localView.setVisibility(0);
            localView.setOnTouchListener(new i.4(this));
          }
          localObject4 = new i.a();
          ((i.a)localObject4).index = ???;
          localObject5 = localObject3;
          if (localObject3 == null)
            localObject5 = localView;
          ((i.a)localObject4).view = ((View)localObject5);
          ((i.a)localObject4).rJc = localView;
          ((i.a)localObject4).rJd = localb;
          ((i.a)localObject4).qJh = localbau;
          ((i.a)localObject4).ros = paramav.qBY;
          if (??? == null)
            break label1934;
          ((i.a)???).rJe = ((i.a)localObject4);
          label1216: if (??? == paramTimeLineObject.xfI.wbK.size() - 1)
            ((i.a)localObject4).rJe = ((i.a)localObject1);
          if (??? == paramInt2)
          {
            localb.rJh = ((i.a)localObject4);
            a((i.a)localObject4);
          }
          ??? = localObject4;
        }
    label2050: 
    while (true)
    {
      ???++;
      break label401;
      paramInt2 = 0;
      break label392;
      ab.e("MiroMsg.TurnMediaTimeLineItem", "not enough medias!");
      AppMethodBeat.o(40163);
      break;
      label1292: localObject4 = af.cnC();
      ??? = this.mActivity.hashCode();
      localObject3 = az.dtg();
      ((az)localObject3).oyB = paramTimeLineObject.pcX;
      ((com.tencent.mm.plugin.sns.model.g)localObject4).a(localbau, localView, ???, (az)localObject3);
      break label536;
      label1337: bool1 = false;
      break label572;
      label1343: if ((paramau == null) || (paramau.rxP == null) || (paramau.rxP.rhm == null))
        break label677;
      paramau.rxP.rhm.c(l, bo.yz(), bool1);
      break label677;
      label1388: if (((com.tencent.mm.plugin.sns.model.g)localObject6).b((n)localObject4, null) == 5)
      {
        ((com.tencent.mm.plugin.sns.model.g)localObject6).A(localbau);
        ((aj)localObject5).raP.setVisibility(8);
        ((aj)localObject5).rnu.setVisibility(0);
        ((aj)localObject5).rnu.dKB();
        break label794;
      }
      if (((com.tencent.mm.plugin.sns.model.g)localObject6).x(localbau))
      {
        ((aj)localObject5).rnu.setVisibility(8);
        ((aj)localObject5).raP.setImageResource(2130840197);
        ((aj)localObject5).raP.setVisibility(0);
        break label794;
      }
      ((com.tencent.mm.plugin.sns.model.g)localObject6).y(localbau);
      ((aj)localObject5).raP.setVisibility(0);
      ((aj)localObject5).rnu.setVisibility(8);
      ((aj)localObject5).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
      ((aj)localObject5).raP.setContentDescription(this.mActivity.getString(2131301953));
      if (((com.tencent.mm.plugin.sns.model.g)localObject6).b((n)localObject4, null) != 4)
        break label794;
      ((aj)localObject5).raQ.setVisibility(0);
      break label794;
      label1566: if (((com.tencent.mm.plugin.sns.model.g)localObject6).u(localbau))
      {
        ((aj)localObject5).raP.setVisibility(0);
        ((aj)localObject5).rnu.setVisibility(8);
        ((aj)localObject5).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
        ((aj)localObject5).raP.setContentDescription(this.mActivity.getString(2131301953));
      }
      while (true)
      {
        if (!((aj)localObject5).qzM.ckY())
          break label1904;
        ab.d("MiroMsg.TurnMediaTimeLineItem", "play video error " + localbau.Id + " " + localbau.Url + " " + localbau.wEH + " " + paramInt1);
        ((com.tencent.mm.plugin.sns.model.g)localObject6).y(localbau);
        ((aj)localObject5).raP.setVisibility(0);
        ((aj)localObject5).rnu.setVisibility(8);
        ((aj)localObject5).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
        ((aj)localObject5).raP.setContentDescription(this.mActivity.getString(2131301953));
        break;
        if (((com.tencent.mm.plugin.sns.model.g)localObject6).v(localbau))
        {
          ((aj)localObject5).raP.setVisibility(8);
          ((aj)localObject5).rnu.setVisibility(8);
        }
        else if (((com.tencent.mm.plugin.sns.model.g)localObject6).b((n)localObject4, null) <= 5)
        {
          ((aj)localObject5).raP.setVisibility(8);
          ((aj)localObject5).rnu.setVisibility(8);
        }
        else
        {
          ((com.tencent.mm.plugin.sns.model.g)localObject6).y(localbau);
          ((aj)localObject5).raP.setVisibility(0);
          ((aj)localObject5).rnu.setVisibility(8);
          ((aj)localObject5).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
          ((aj)localObject5).raP.setContentDescription(this.mActivity.getString(2131301953));
        }
      }
      label1904: break label794;
      label1906: paramau.rxP.rhm.a(paramav.rAt, 0, false, bool1);
      break label999;
      label1928: bool2 = false;
      break label1015;
      label1934: localObject1 = localObject4;
      break label1216;
      label1941: if ((localb.mRR != null) && ((localb.mRR instanceof FrameLayout)))
        ((FrameLayout)localb.mRR).setClipChildren(false);
      if (localb.rHB != null)
        localb.rHB.setClipChildren(false);
      if ((localb.rIt != null) && ((localb.rIt instanceof LinearLayout)))
        ((LinearLayout)localb.rIt).setClipChildren(false);
      localb.rJf.setOnClickListener(new i.5(this, paramau, paramInt2, localb));
      AppMethodBeat.o(40163);
      break;
    }
  }

  public final void d(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40162);
    Object localObject;
    if (this.mActivity != null)
    {
      localObject = new DisplayMetrics();
      this.mActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
      this.mScreenWidth = ((DisplayMetrics)localObject).widthPixels;
      this.mScreenHeight = ((DisplayMetrics)localObject).heightPixels;
      this.rIV = (Math.min(this.mScreenWidth, this.mScreenHeight) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 54) - this.mActivity.getResources().getDimensionPixelSize(2131427786) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427858));
    }
    paramBaseViewHolder = (i.b)paramBaseViewHolder;
    if ((paramBaseViewHolder.rHC != null) && (!paramBaseViewHolder.rJg))
    {
      paramBaseViewHolder.rHC.setLayoutResource(2130970822);
      if (!paramBaseViewHolder.rJg)
      {
        paramBaseViewHolder.rJf = paramBaseViewHolder.rHC.inflate();
        paramBaseViewHolder.rJg = true;
      }
    }
    while (true)
    {
      localObject = paramBaseViewHolder.rJf.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = this.rIV;
      ((ViewGroup.LayoutParams)localObject).height = this.rIV;
      ((RoundedCornerRelativeLayout)paramBaseViewHolder.rJf).setRadius(8.0F);
      localObject = paramBaseViewHolder.rJi;
      ((aj)localObject).rnt = u(paramBaseViewHolder.rJf, 0, 6);
      ((aj)localObject).rns = ((aj)localObject).rnt;
      ((aj)localObject).qzM = ((com.tencent.mm.plugin.sight.decode.a.a)((aj)localObject).rnt.findViewById(2131820629));
      ((aj)localObject).raP = ((ImageView)((aj)localObject).rnt.findViewById(2131820981));
      ((aj)localObject).rnu = ((MMPinProgressBtn)((aj)localObject).rnt.findViewById(2131821370));
      ((aj)localObject).rnv = ((TextView)((aj)localObject).rnt.findViewById(2131827571));
      ((aj)localObject).raQ = ((TextView)((aj)localObject).rnt.findViewById(2131827572));
      ((SightPlayImageView)((aj)localObject).qzM).qyI = true;
      ((SightPlayImageView)((aj)localObject).qzM).setScaleType(QImageView.a.zNT);
      ((aj)localObject).qzM.fi(this.rIV, this.rIV);
      paramBaseViewHolder.rGQ = paramBaseViewHolder.rJf.findViewById(2131827920);
      paramBaseViewHolder.rGR = paramBaseViewHolder.rJf.findViewById(2131827923);
      AppMethodBeat.o(40162);
      return;
      if (!paramBaseViewHolder.rJg)
      {
        paramBaseViewHolder.rJf = paramBaseViewHolder.mRR.findViewById(2131827916);
        paramBaseViewHolder.rJg = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.i
 * JD-Core Version:    0.6.2
 */