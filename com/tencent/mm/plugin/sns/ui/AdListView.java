package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelstat.p.a;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.f;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.protocal.protobuf.cdh;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;

public class AdListView extends ListView
{
  com.tencent.mm.plugin.sns.a.b.b rfN;
  f rfO;
  private com.tencent.mm.plugin.sns.model.e rfP;
  private boolean rfQ;
  private HashSet<String> rfR;

  public AdListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38054);
    this.rfQ = true;
    this.rfR = new HashSet();
    AppMethodBeat.o(38054);
  }

  public AdListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38053);
    this.rfQ = true;
    this.rfR = new HashSet();
    AppMethodBeat.o(38053);
  }

  protected void attachViewToParent(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(38059);
    super.attachViewToParent(paramView, paramInt, paramLayoutParams);
    String str1 = "";
    paramLayoutParams = str1;
    BaseTimeLineItem.BaseViewHolder localBaseViewHolder;
    boolean bool1;
    com.tencent.mm.plugin.sns.i.e locale;
    String str2;
    if (paramView.getTag() != null)
    {
      paramLayoutParams = str1;
      if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
      {
        localBaseViewHolder = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
        str1 = localBaseViewHolder.position + " " + localBaseViewHolder.cwT;
        if ((localBaseViewHolder.timeLineObject.xfP != 1) && (localBaseViewHolder.timeLineObject.dtW != 1))
          break label494;
        bool1 = true;
        com.tencent.mm.plugin.sns.i.e.qTd.bl(localBaseViewHolder.timeLineObject.Id, bool1);
        locale = com.tencent.mm.plugin.sns.i.e.qTd;
        str2 = localBaseViewHolder.timeLineObject.Id;
        if (localBaseViewHolder.timeLineObject.xfH != null)
          break label500;
      }
    }
    label494: label500: for (paramLayoutParams = ""; ; paramLayoutParams = localBaseViewHolder.timeLineObject.xfH.Id)
    {
      locale.gh(str2, paramLayoutParams);
      com.tencent.mm.plugin.sns.i.e.qTd.kr(localBaseViewHolder.rHt);
      if ((this.rfN != null) && (localBaseViewHolder.qFG))
        this.rfN.a(localBaseViewHolder.position, localBaseViewHolder.cwT, localBaseViewHolder.mVC, paramView, localBaseViewHolder.rHt, localBaseViewHolder.qCX, localBaseViewHolder.klY, 1);
      if ((!this.rfR.contains(localBaseViewHolder.cFc)) && (((localBaseViewHolder.qFG) && (localBaseViewHolder.timeLineObject.xfI.wbJ == 15)) || (localBaseViewHolder.timeLineObject.xfI.wbJ == 18)))
      {
        boolean bool2 = false;
        bool1 = bool2;
        if (localBaseViewHolder.timeLineObject.xfI.wbJ == 15)
        {
          bool1 = bool2;
          if ((localBaseViewHolder.rGD.qzM instanceof SightPlayImageView))
            bool1 = ((SightPlayImageView)localBaseViewHolder.rGD.qzM).qyA.cla();
        }
        j.a(af.cnF().YS(localBaseViewHolder.cFc), false, bool1, 0);
        this.rfR.add(localBaseViewHolder.cFc);
      }
      if (this.rfO != null)
        this.rfO.a(localBaseViewHolder.cwT, localBaseViewHolder.timeLineObject);
      if (this.rfP != null)
        this.rfP.a(localBaseViewHolder.position, localBaseViewHolder.cwT, localBaseViewHolder.rHt, localBaseViewHolder.timeLineObject, localBaseViewHolder.qFG, localBaseViewHolder.qFH);
      paramLayoutParams = str1;
      if (ae.giZ)
        ab.d("MicroMsg.AdListView", "3childview  onAdded " + paramLayoutParams + " count:" + getChildCount());
      AppMethodBeat.o(38059);
      return;
      bool1 = false;
      break;
    }
  }

  protected void detachViewFromParent(int paramInt)
  {
    AppMethodBeat.i(38058);
    if (ae.giZ)
      ab.d("MicroMsg.AdListView", "2childview  onRemoved " + paramInt + " count:" + getChildCount());
    super.detachViewFromParent(paramInt);
    AppMethodBeat.o(38058);
  }

  protected void detachViewFromParent(View paramView)
  {
    AppMethodBeat.i(38057);
    String str = "";
    Object localObject = str;
    if (paramView.getTag() != null)
    {
      localObject = str;
      if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
      {
        localObject = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
        localObject = ((BaseTimeLineItem.BaseViewHolder)localObject).position + " " + ((BaseTimeLineItem.BaseViewHolder)localObject).cwT;
      }
    }
    if (ae.giZ)
      ab.d("MicroMsg.AdListView", "1childview  onRemoved " + (String)localObject + " count:" + getChildCount());
    super.detachViewFromParent(paramView);
    AppMethodBeat.o(38057);
  }

  protected void detachViewsFromParent(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38064);
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++)
    {
      View localView = getChildAt(i);
      String str = "";
      Object localObject = str;
      if (localView.getTag() != null)
      {
        localObject = str;
        if ((localView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
        {
          localObject = (BaseTimeLineItem.BaseViewHolder)localView.getTag();
          if ((this.rfN != null) && (((BaseTimeLineItem.BaseViewHolder)localObject).qFG))
            this.rfN.j(((BaseTimeLineItem.BaseViewHolder)localObject).position, ((BaseTimeLineItem.BaseViewHolder)localObject).cwT, 1);
          if (this.rfO != null)
            this.rfO.XJ(((BaseTimeLineItem.BaseViewHolder)localObject).cwT);
          if (this.rfP != null)
            this.rfP.a(((BaseTimeLineItem.BaseViewHolder)localObject).position, ((BaseTimeLineItem.BaseViewHolder)localObject).cwT, ((BaseTimeLineItem.BaseViewHolder)localObject).rHt, ((BaseTimeLineItem.BaseViewHolder)localObject).timeLineObject, ((BaseTimeLineItem.BaseViewHolder)localObject).qFG);
          localObject = ((BaseTimeLineItem.BaseViewHolder)localObject).position + " " + ((BaseTimeLineItem.BaseViewHolder)localObject).cwT;
        }
      }
      if (ae.giZ)
        ab.d("MicroMsg.AdListView", "8removeView  detachViewsFromParent " + (String)localObject + " count:" + getChildCount());
    }
    super.detachViewsFromParent(paramInt1, paramInt2);
    AppMethodBeat.o(38064);
  }

  protected void layoutChildren()
  {
    AppMethodBeat.i(38055);
    super.layoutChildren();
    AppMethodBeat.o(38055);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(38056);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(38056);
  }

  public void onViewAdded(View paramView)
  {
    AppMethodBeat.i(38060);
    String str1 = "";
    String str2 = str1;
    BaseTimeLineItem.BaseViewHolder localBaseViewHolder;
    boolean bool1;
    com.tencent.mm.plugin.sns.i.e locale;
    String str3;
    if (paramView.getTag() != null)
    {
      str2 = str1;
      if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
      {
        localBaseViewHolder = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
        str1 = localBaseViewHolder.position + " " + localBaseViewHolder.cwT;
        if ((localBaseViewHolder.timeLineObject.xfP != 1) && (localBaseViewHolder.timeLineObject.dtW != 1))
          break label485;
        bool1 = true;
        com.tencent.mm.plugin.sns.i.e.qTd.bl(localBaseViewHolder.timeLineObject.Id, bool1);
        locale = com.tencent.mm.plugin.sns.i.e.qTd;
        str3 = localBaseViewHolder.timeLineObject.Id;
        if (localBaseViewHolder.timeLineObject.xfH != null)
          break label491;
      }
    }
    label485: label491: for (str2 = ""; ; str2 = localBaseViewHolder.timeLineObject.xfH.Id)
    {
      locale.gh(str3, str2);
      com.tencent.mm.plugin.sns.i.e.qTd.kr(localBaseViewHolder.rHt);
      if ((this.rfN != null) && (localBaseViewHolder.qFG))
        this.rfN.a(localBaseViewHolder.position, localBaseViewHolder.cwT, localBaseViewHolder.mVC, paramView, localBaseViewHolder.rHt, localBaseViewHolder.qCX, localBaseViewHolder.klY, 1);
      if ((!this.rfR.contains(localBaseViewHolder.cFc)) && (((localBaseViewHolder.qFG) && (localBaseViewHolder.timeLineObject.xfI.wbJ == 15)) || (localBaseViewHolder.timeLineObject.xfI.wbJ == 18)))
      {
        boolean bool2 = false;
        bool1 = bool2;
        if (localBaseViewHolder.timeLineObject.xfI.wbJ == 15)
        {
          bool1 = bool2;
          if ((localBaseViewHolder.rGD.qzM instanceof SightPlayImageView))
            bool1 = ((SightPlayImageView)localBaseViewHolder.rGD.qzM).qyA.cla();
        }
        j.a(af.cnF().YS(localBaseViewHolder.cFc), false, bool1, 0);
        this.rfR.add(localBaseViewHolder.cFc);
      }
      if (this.rfO != null)
        this.rfO.a(localBaseViewHolder.cwT, localBaseViewHolder.timeLineObject);
      if (this.rfP != null)
        this.rfP.a(localBaseViewHolder.position, localBaseViewHolder.cwT, localBaseViewHolder.rHt, localBaseViewHolder.timeLineObject, localBaseViewHolder.qFG, localBaseViewHolder.qFH);
      str2 = str1;
      if (ae.giZ)
        ab.d("MicroMsg.AdListView", "4childview  onViewAdded " + str2 + " count:" + getChildCount());
      AppMethodBeat.o(38060);
      return;
      bool1 = false;
      break;
    }
  }

  public void onViewRemoved(View paramView)
  {
    AppMethodBeat.i(38061);
    Object localObject1 = "";
    Object localObject2 = localObject1;
    int i;
    p.a locala;
    String str1;
    String str2;
    if (paramView.getTag() != null)
    {
      localObject2 = localObject1;
      if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
      {
        localObject2 = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
        paramView = ((BaseTimeLineItem.BaseViewHolder)localObject2).position + " " + ((BaseTimeLineItem.BaseViewHolder)localObject2).cwT;
        if ((this.rfN != null) && (((BaseTimeLineItem.BaseViewHolder)localObject2).qFG))
          this.rfN.j(((BaseTimeLineItem.BaseViewHolder)localObject2).position, ((BaseTimeLineItem.BaseViewHolder)localObject2).cwT, 1);
        if (this.rfO != null)
          this.rfO.XJ(((BaseTimeLineItem.BaseViewHolder)localObject2).cwT);
        if (this.rfP != null)
          this.rfP.a(((BaseTimeLineItem.BaseViewHolder)localObject2).position, ((BaseTimeLineItem.BaseViewHolder)localObject2).cwT, ((BaseTimeLineItem.BaseViewHolder)localObject2).rHt, ((BaseTimeLineItem.BaseViewHolder)localObject2).timeLineObject, ((BaseTimeLineItem.BaseViewHolder)localObject2).qFG);
        if (((BaseTimeLineItem.BaseViewHolder)localObject2).timeLineObject.xfI.wbJ != 3)
          break label466;
        localObject1 = af.cnF().YS(((BaseTimeLineItem.BaseViewHolder)localObject2).cFc);
        if (localObject1 != null)
          break label304;
        i = 0;
        locala = p.a.fUi;
        str1 = ((BaseTimeLineItem.BaseViewHolder)localObject2).timeLineObject.rjC;
        str2 = i.jV(((BaseTimeLineItem.BaseViewHolder)localObject2).rHt);
        if (bo.isNullOrNil(str1))
          break label466;
      }
    }
    label304: View localView;
    label466: for (localObject2 = new byte[0]; ; localView = paramView)
      try
      {
        localObject1 = Base64.decode(str1, 0);
        localObject2 = localObject1;
        localObject1 = new cdg();
      }
      catch (Exception localException1)
      {
        try
        {
          ((cdg)localObject1).parseFrom((byte[])localObject2);
          localObject2 = ((cdg)localObject1).xcS;
          if (localObject2 == null)
          {
            localObject2 = paramView;
            if (ae.giZ)
              ab.d("MicroMsg.AdListView", "5childview  onViewRemoved " + (String)localObject2 + " count:" + getChildCount());
            AppMethodBeat.o(38061);
            return;
            i = ((n)localObject1).cre();
            break;
            localException1 = localException1;
            ab.printErrStackTrace("MicroMsg.SnsStatExtUtil", localException1, null, new Object[0]);
          }
        }
        catch (Exception localException2)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.SnsStatExtUtil", localException2, "", new Object[0]);
            localView = paramView;
          }
          ab.i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235): scene(%d), statExtStr:%s(id=%s, uxinfo=%s)", new Object[] { Integer.valueOf(locala.value), str1, localException1.xcS.xcV, localException1.xcS.xcW });
          ((c)g.K(c.class)).a(13235, i, new Object[] { locala.value, localException1.xcS.xcV, localException1.xcS.xcW, str2 });
        }
      }
  }

  public void removeView(View paramView)
  {
    AppMethodBeat.i(38063);
    super.removeView(paramView);
    String str1 = "";
    String str2 = str1;
    if (paramView.getTag() != null)
    {
      str2 = str1;
      if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
      {
        paramView = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
        str2 = paramView.position + " " + paramView.cwT;
      }
    }
    if (ae.giZ)
      ab.d("MicroMsg.AdListView", "7removeView  onViewRemoved " + str2 + " count:" + getChildCount());
    AppMethodBeat.o(38063);
  }

  public void removeViewInLayout(View paramView)
  {
    AppMethodBeat.i(38062);
    String str = "";
    Object localObject = str;
    if (paramView.getTag() != null)
    {
      localObject = str;
      if ((paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
      {
        localObject = (BaseTimeLineItem.BaseViewHolder)paramView.getTag();
        localObject = ((BaseTimeLineItem.BaseViewHolder)localObject).position + " " + ((BaseTimeLineItem.BaseViewHolder)localObject).cwT;
      }
    }
    if (ae.giZ)
      ab.d("MicroMsg.AdListView", "6removeViewInLayout  onViewRemoved " + (String)localObject + " count:" + getChildCount());
    super.removeViewInLayout(paramView);
    AppMethodBeat.o(38062);
  }

  public void setTimelineEvent(com.tencent.mm.plugin.sns.model.e parame)
  {
    this.rfP = parame;
  }

  public void setTimelineStat(f paramf)
  {
    this.rfO = paramf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.AdListView
 * JD-Core Version:    0.6.2
 */