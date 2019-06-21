package com.tencent.mm.plugin.radar.ui;

import a.f.b.y;
import a.k.m;
import a.l;
import a.v;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.radar.b.c;
import com.tencent.mm.plugin.radar.b.c.e;
import com.tencent.mm.plugin.radar.b.d;
import com.tencent.mm.plugin.radar.b.e;
import com.tencent.mm.plugin.radar.b.e.a;
import com.tencent.mm.plugin.radar.b.e.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bpb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter;", "Lcom/tencent/mm/plugin/radar/ui/GridDataAdapter;", "radarGridView", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "context", "Landroid/content/Context;", "(Lcom/tencent/mm/plugin/radar/ui/RadarViewController;Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;Landroid/content/Context;)V", "animSize", "", "animator", "Lcom/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator;", "Lcom/tencent/mm/plugin/radar/ui/RadarViewController;", "count", "getCount", "()I", "hideView", "", "memberReqMap", "Ljava/util/HashMap;", "", "getMemberReqMap", "()Ljava/util/HashMap;", "setMemberReqMap", "(Ljava/util/HashMap;)V", "needAnim", "getNeedAnim", "setNeedAnim", "radarSearchMember", "", "Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "getRadarSearchMember", "()[Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "setRadarSearchMember", "([Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;)V", "[Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "newMembers", "Ljava/util/LinkedList;", "radarSearchMemberList", "getRadarSearchMemberList", "()Ljava/util/LinkedList;", "setRadarSearchMemberList", "(Ljava/util/LinkedList;)V", "viewTable", "Landroid/view/View;", "getViewTable", "setViewTable", "addMemberReq", "", "member", "clearAll", "clearData", "doInit", "getChanged", "position", "getItem", "", "getView", "convertView", "isMemReqContainsSearchMem", "sm", "makePlaceHolderView", "makeView", "radarStatus", "Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;", "removeMemberReq", "setRadarChatRoomMemberList", "radarChatMember", "Lcom/tencent/mm/protocal/protobuf/RadarChatRoomMember;", "ViewHolder", "plugin-radar_release"})
public final class RadarViewController$c extends a
{
  private final Context context;
  bpb[] pEi;
  HashMap<String, String> pEj;
  HashMap<String, Integer> pEk;
  private final RadarViewController.a pEl;
  private int pEm;
  HashMap<String, View> pEn;
  private boolean pEo;

  public RadarViewController$c(RadarSpecialGridView paramRadarSpecialGridView, Context paramContext)
  {
    super(paramContext, localObject);
    AppMethodBeat.i(103092);
    this.context = localObject;
    this.pEi = new bpb[12];
    this.pEj = new HashMap();
    this.pEk = new HashMap();
    this.pEn = new HashMap();
    this.pEl = new RadarViewController.a(paramRadarSpecialGridView);
    AppMethodBeat.o(103092);
  }

  private final View Z(View paramView, int paramInt)
  {
    AppMethodBeat.i(103090);
    View localView = paramView;
    if (paramView == null)
    {
      localView = View.inflate(this.context, 2130970439, null);
      if (localView == null)
        a.f.b.j.dWJ();
      localView.setTag(RadarViewController.a(this.pEg), Integer.valueOf(this.pEl.cdT()));
      localView.setTag(RadarViewController.b(this.pEg), this.pEl.getInAnimation());
    }
    paramView = localView.findViewById(2131826793);
    a.f.b.j.o(paramView, "anotherConvertView.findV…ar_result_item_avatar_iv)");
    paramView.setVisibility(8);
    paramView = localView.findViewById(2131826794);
    a.f.b.j.o(paramView, "anotherConvertView.findV…sult_item_avatar_mask_iv)");
    paramView.setVisibility(8);
    paramView = localView.findViewById(2131826796);
    a.f.b.j.o(paramView, "anotherConvertView.findV…_result_item_username_tv)");
    paramView.setVisibility(4);
    paramView = localView.findViewById(2131826792);
    a.f.b.j.o(paramView, "anotherConvertView.findV….radar_member_state_view)");
    paramView.setVisibility(4);
    paramView = localView.findViewById(2131826795);
    a.f.b.j.o(paramView, "anotherConvertView.findV…member_state_choose_view)");
    paramView.setVisibility(4);
    if ((paramInt == 7) || (paramInt % 3 == 1))
    {
      paramView = localView.findViewById(2131826797);
      a.f.b.j.o(paramView, "anotherConvertView.findV…d<View>(R.id.bottom_stub)");
      paramView.setVisibility(0);
      paramView = localView.findViewById(2131826791);
      a.f.b.j.o(paramView, "anotherConvertView.findV…ById<View>(R.id.top_stub)");
      paramView.setVisibility(8);
    }
    while (true)
    {
      AppMethodBeat.o(103090);
      return localView;
      paramView = localView.findViewById(2131826791);
      a.f.b.j.o(paramView, "anotherConvertView.findV…ById<View>(R.id.top_stub)");
      paramView.setVisibility(0);
      paramView = localView.findViewById(2131826797);
      a.f.b.j.o(paramView, "anotherConvertView.findV…d<View>(R.id.bottom_stub)");
      paramView.setVisibility(8);
    }
  }

  public final View Y(View paramView, int paramInt)
  {
    AppMethodBeat.i(103088);
    ab.d(RadarViewController.access$getTAG$cp(), "getview RadarStatus%s", new Object[] { this.pEg.getRadarStatus() });
    bpb localbpb = (bpb)this.pEi[paramInt];
    Object localObject1;
    int i;
    label96: label104: String str;
    Object localObject2;
    if (localbpb != null)
    {
      localObject1 = (CharSequence)localbpb.jBB;
      if ((localObject1 == null) || (m.ar((CharSequence)localObject1)))
      {
        i = 1;
        if (i == 0)
          break label238;
        localObject1 = (CharSequence)localbpb.wfK;
        if ((localObject1 != null) && (!m.ar((CharSequence)localObject1)))
          break label232;
        i = 1;
        if (i == 0)
          break label238;
        i = 1;
        if (i != 0)
          break label1614;
        localObject1 = g.pDK;
        str = g.b(localbpb);
        localObject2 = this.pEg.getRadarStatus();
        if (paramView != null)
          break label1624;
        localObject1 = View.inflate(this.context, 2130970439, null);
        if (localObject1 == null)
          a.f.b.j.dWJ();
        ((View)localObject1).setTag(RadarViewController.a(this.pEg), Integer.valueOf(this.pEl.cdT()));
        ((View)localObject1).setTag(RadarViewController.b(this.pEg), this.pEl.getInAnimation());
      }
    }
    while (true)
    {
      Object localObject3 = ((View)localObject1).findViewById(2131826793);
      if (localObject3 == null)
      {
        paramView = new v("null cannot be cast to non-null type android.widget.ImageView");
        AppMethodBeat.o(103088);
        throw paramView;
        i = 0;
        break;
        label232: i = 0;
        break label96;
        label238: i = 0;
        break label104;
      }
      localObject3 = (ImageView)localObject3;
      Object localObject4 = ((View)localObject1).findViewById(2131826792);
      if (localObject4 == null)
      {
        paramView = new v("null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarStateView");
        AppMethodBeat.o(103088);
        throw paramView;
      }
      localObject4 = (RadarStateView)localObject4;
      Object localObject5 = ((View)localObject1).findViewById(2131826796);
      if (localObject5 == null)
      {
        paramView = new v("null cannot be cast to non-null type android.widget.TextView");
        AppMethodBeat.o(103088);
        throw paramView;
      }
      localObject5 = (TextView)localObject5;
      Object localObject6 = ((View)localObject1).findViewById(2131826794);
      if (localObject6 == null)
      {
        paramView = new v("null cannot be cast to non-null type android.widget.ImageView");
        AppMethodBeat.o(103088);
        throw paramView;
      }
      localObject6 = (ImageView)localObject6;
      Object localObject7 = ((View)localObject1).findViewById(2131826795);
      if (localObject7 == null)
      {
        paramView = new v("null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarStateChooseView");
        AppMethodBeat.o(103088);
        throw paramView;
      }
      localObject7 = (RadarStateChooseView)localObject7;
      ((ImageView)localObject3).setVisibility(0);
      ((RadarStateView)localObject4).setVisibility(0);
      ((TextView)localObject5).setVisibility(0);
      ((ImageView)localObject6).setVisibility(0);
      if ((localObject2 == e.e.pBM) || (localObject2 == e.e.pBN))
      {
        ((RadarStateView)localObject4).setVisibility(0);
        ((RadarStateChooseView)localObject7).setVisibility(8);
        ((View)localObject1).setTag(new RadarViewController.c.a(this, (TextView)localObject5, (ImageView)localObject3, (RadarStateView)localObject4, (RadarStateChooseView)localObject7, (ImageView)localObject6));
        if ((paramInt != 7) && (paramInt % 3 != 1))
          break label609;
        localObject2 = ((View)localObject1).findViewById(2131826797);
        a.f.b.j.o(localObject2, "anotherConvertView.findV…d<View>(R.id.bottom_stub)");
        ((View)localObject2).setVisibility(0);
        localObject2 = ((View)localObject1).findViewById(2131826791);
        a.f.b.j.o(localObject2, "anotherConvertView.findV…ById<View>(R.id.top_stub)");
        ((View)localObject2).setVisibility(8);
      }
      while (true)
      {
        if ((paramView == null) || (localObject1 != paramView))
          this.pEn.put(str, localObject1);
        localObject2 = ((View)localObject1).getTag();
        if (localObject2 != null)
          break label657;
        paramView = new v("null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarViewController.RadarSearchAdapter.ViewHolder");
        AppMethodBeat.o(103088);
        throw paramView;
        ((RadarStateView)localObject4).setVisibility(8);
        ((RadarStateChooseView)localObject7).setVisibility(0);
        break;
        label609: localObject2 = ((View)localObject1).findViewById(2131826791);
        a.f.b.j.o(localObject2, "anotherConvertView.findV…ById<View>(R.id.top_stub)");
        ((View)localObject2).setVisibility(0);
        localObject2 = ((View)localObject1).findViewById(2131826797);
        a.f.b.j.o(localObject2, "anotherConvertView.findV…d<View>(R.id.bottom_stub)");
        ((View)localObject2).setVisibility(8);
      }
      label657: localObject4 = (RadarViewController.c.a)localObject2;
      ((RadarViewController.c.a)localObject4).pEp.setText((CharSequence)com.tencent.mm.pluginsdk.ui.e.j.b(this.pEg.getContext(), (CharSequence)localbpb.jCH, ((RadarViewController.c.a)localObject4).pEp.getTextSize()));
      localObject2 = b.a.pCd;
      b.a.b(((RadarViewController.c.a)localObject4).pEq, str);
      localObject2 = ((View)localObject1).findViewById(2131826788);
      a.f.b.j.o(localObject2, "view.findViewById(R.id.radar_avatar_container)");
      ((View)localObject2).setTag(new RadarViewController.d(this.pEg, localbpb));
      boolean bool;
      if ((this.pEg.getRadarStatus() == e.e.pBM) || (this.pEg.getRadarStatus() == e.e.pBN))
      {
        ((RadarViewController.c.a)localObject4).pEt.setBackgroundResource(2130840106);
        paramView = ((RadarViewController.c.a)localObject4).pEr;
        paramView.pDb = true;
        paramView.cdK();
        paramView = ((RadarViewController.c.a)localObject4).pEs;
        paramView.pCV = false;
        paramView.setVisibility(8);
        localObject2 = e.a(RadarViewController.c(this.pEg), localbpb);
        paramView = (View)localObject2;
        if (localObject2 == null)
        {
          paramView = RadarViewController.e(this.pEg).Vx(str);
          localObject2 = RadarViewController.c(this.pEg);
          a.f.b.j.p(localbpb, "member");
          a.f.b.j.p(paramView, "state");
          localObject3 = localbpb.jBB;
          a.f.b.j.o(localObject3, "member.UserName");
          ((e)localObject2).b((String)localObject3, paramView);
          localObject3 = localbpb.wfK;
          a.f.b.j.o(localObject3, "member.EncodeUserName");
          ((e)localObject2).b((String)localObject3, paramView);
        }
        localObject3 = RadarViewController.c(this.pEg).a(localbpb, true);
        localObject5 = ((RadarViewController.c.a)localObject4).pEr;
        localObject2 = localObject3;
        if (localObject3 == null)
          localObject2 = c.e.pAW;
        a.f.b.j.p(localObject2, "state");
        ((RadarStateView)localObject5).init();
        ((RadarStateView)localObject5).pDc.removeMessages(0);
        ((RadarStateView)localObject5).clearAnimation();
        ((RadarStateView)localObject5).pBL = ((c.e)localObject2);
        ((RadarStateView)localObject5).pCS = false;
        ((RadarStateView)localObject5).cdK();
        localObject2 = ((RadarViewController.c.a)localObject4).pEr;
        a.f.b.j.p(paramView, "state");
        ((RadarStateView)localObject2).init();
        ab.d(RadarStateView.TAG, " turnToState : ".concat(String.valueOf(paramView)));
        bool = false;
        if (((RadarStateView)localObject2).pBL == paramView)
        {
          ((RadarStateView)localObject2).cdK();
          paramView = RadarViewController.c(this.pEg);
          a.f.b.j.p(localbpb, "member");
          localObject2 = localbpb.jBB;
          a.f.b.j.o(localObject2, "member.UserName");
          paramView.a((String)localObject2, null);
          localObject2 = localbpb.wfK;
          a.f.b.j.o(localObject2, "member.EncodeUserName");
          paramView.a((String)localObject2, null);
          if (paramInt == 0)
            this.pEm = this.pEk.size();
          paramView = (View)localObject1;
          if (this.pEk.remove(str) != null)
          {
            this.pEl.g(this.pEm - this.pEk.size(), (View)localObject1);
            paramView = (View)localObject1;
          }
        }
      }
      while (true)
      {
        AppMethodBeat.o(103088);
        return paramView;
        if (((RadarStateView)localObject2).getVisibility() == 0);
        for (i = 1; ; i = 0)
        {
          if (i != 0)
          {
            ((RadarStateView)localObject2).cdM();
            bool = true;
          }
          ab.d(RadarStateView.TAG, " delay : ".concat(String.valueOf(bool)));
          ((RadarStateView)localObject2).pBL = paramView;
          if (((RadarStateView)localObject2).pBL == c.e.pAW)
            break;
          if (bool)
            break label1252;
          ((RadarStateView)localObject2).pDc.sendEmptyMessage(0);
          break;
        }
        label1252: ((RadarStateView)localObject2).pDc.sendEmptyMessageDelayed(0, RadarStateView.pDe + 20);
        break;
        localObject3 = RadarViewController.c(this.pEg).pBv;
        localObject2 = g.pDK;
        if (!bo.isNullOrNil((String)((Map)localObject3).get(g.c(localbpb))))
        {
          paramView = ((RadarViewController.c.a)localObject4).pEr;
          paramView.pDb = false;
          paramView.setVisibility(8);
          paramView = ((RadarViewController.c.a)localObject4).pEs;
          paramView.pCV = true;
          paramView.cdK();
          paramView = RadarViewController.c(this.pEg);
          if (localbpb != null)
          {
            localObject2 = g.pDK;
            localObject2 = g.b(localbpb);
            localObject2 = (e.a)paramView.pBz.get(localObject2);
            paramView = (View)localObject2;
            if (localObject2 == null)
              paramView = e.a.pBI;
            localObject2 = paramView;
            if (paramView != null);
          }
          else
          {
            localObject2 = e.a.pBI;
          }
          if (localObject2 != e.a.pBI)
            ((RadarViewController.c.a)localObject4).pEt.setBackgroundDrawable(null);
          paramView = ((RadarViewController.c.a)localObject4).pEs;
          a.f.b.j.p(localObject2, "status");
          if (paramView.pCW != localObject2)
          {
            paramView.pCW = ((e.a)localObject2);
            localObject2 = paramView.pCW;
            switch (e.pCY[localObject2.ordinal()])
            {
            default:
            case 1:
            case 2:
            }
          }
          while (true)
          {
            if (paramInt == 0)
              this.pEm = this.pEk.size();
            localObject2 = this.pEk;
            paramView = g.pDK;
            paramView = (View)localObject1;
            if (((HashMap)localObject2).remove(g.c(localbpb)) == null)
              break;
            this.pEl.g(this.pEm - this.pEk.size(), (View)localObject1);
            paramView = (View)localObject1;
            break;
            if (paramView.pCV)
            {
              paramView.cdK();
              paramView.pCS = true;
              paramView.startAnimation(paramView.getSlideOutAnim());
              continue;
              if (paramView.pCV)
              {
                paramView.cdK();
                paramView.startAnimation(paramView.getSlideInAnim());
              }
            }
          }
        }
        paramView = Z(paramView, paramInt);
        continue;
        label1614: paramView = Z(paramView, paramInt);
      }
      label1624: localObject1 = paramView;
    }
  }

  public final void al(LinkedList<bpb> paramLinkedList)
  {
    AppMethodBeat.i(103087);
    if (((paramLinkedList != null) && (paramLinkedList.size() == 0)) || (paramLinkedList == null))
      AppMethodBeat.o(103087);
    while (true)
    {
      return;
      Object localObject1 = (c)this;
      int i = ((c)localObject1).pEi.length;
      Object localObject3;
      Object localObject4;
      for (int j = 0; j < i; j++)
      {
        localObject2 = paramLinkedList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (bpb)((Iterator)localObject2).next();
          localObject4 = g.pDK;
          String str = g.c((bpb)localObject3);
          localObject4 = g.pDK;
          if (a.f.b.j.j(str, g.c(localObject1.pEi[j])))
            paramLinkedList.remove(localObject3);
        }
      }
      Object localObject2 = paramLinkedList.iterator();
      label173: label330: label335: if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (bpb)((Iterator)localObject2).next();
        int k = Math.abs((int)System.currentTimeMillis() % 6);
        int m = this.pEi.length;
        j = 0;
        int n;
        if (j < m)
        {
          n = (j + k) % 12;
          if ((n != 4) && (n != 7))
            break label209;
        }
        label209: label340: label343: 
        while (true)
        {
          j++;
          break label173;
          break;
          localObject3 = this.pEi[n];
          if (localObject3 != null)
          {
            localObject4 = (CharSequence)((bpb)localObject3).jBB;
            if ((localObject4 != null) && (!m.ar((CharSequence)localObject4)))
              break label330;
            i = 1;
            label248: if (i == 0)
              break label340;
            localObject3 = (CharSequence)((bpb)localObject3).wfK;
            if ((localObject3 != null) && (!m.ar((CharSequence)localObject3)))
              break label335;
            i = 1;
            if (i == 0)
              break label340;
          }
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label343;
            this.pEi[n] = localObject1;
            localObject3 = this.pEk;
            localObject4 = g.pDK;
            a.f.b.j.o(localObject1, "member");
            ((HashMap)localObject3).put(g.b((bpb)localObject1), Integer.valueOf(0));
            break;
            i = 0;
            break label248;
            i = 0;
            break label277;
          }
        }
      }
      label277: if (paramLinkedList.size() > 0)
      {
        aPw();
        localObject2 = d.pBq;
        j = paramLinkedList.size();
        if ((d.cEX == 0) && (j > 0))
        {
          float f = (float)(d.cdz() - d.pBm) * 1.0F / 1000.0F;
          ab.d(d.TAG, "FoundFirstFriendTimeSpent %s", new Object[] { Float.valueOf(f) });
          paramLinkedList = h.pYm;
          localObject2 = y.AVH;
          localObject2 = String.format("%s", Arrays.copyOf(new Object[] { Float.valueOf(f) }, 1));
          a.f.b.j.o(localObject2, "java.lang.String.format(format, *args)");
          paramLinkedList.X(10682, (String)localObject2);
        }
        d.cEX += j;
        d.pBn = j + d.pBn;
      }
      AppMethodBeat.o(103087);
    }
  }

  public final void clearAll()
  {
    AppMethodBeat.i(103089);
    this.pEk.clear();
    this.pEn.clear();
    Iterator localIterator = this.pEn.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (View)this.pEn.get(localObject);
      if (localObject != null)
      {
        RadarViewController.a locala = this.pEl;
        a.f.b.j.o(localObject, "it");
        locala.cf((View)localObject);
      }
    }
    aPw();
    AppMethodBeat.o(103089);
  }

  public final void d(bpb parambpb)
  {
    AppMethodBeat.i(103091);
    Object localObject;
    int i;
    if (parambpb != null)
    {
      localObject = (CharSequence)parambpb.jBB;
      if ((localObject == null) || (m.ar((CharSequence)localObject)))
      {
        i = 1;
        if (i == 0)
          break label83;
        localObject = (CharSequence)parambpb.wfK;
        if ((localObject != null) && (!m.ar((CharSequence)localObject)))
          break label78;
        i = 1;
        label56: if (i == 0)
          break label83;
      }
    }
    else
    {
      i = 1;
      label62: if (i == 0)
        break label88;
      AppMethodBeat.o(103091);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label78: i = 0;
      break label56;
      label83: i = 0;
      break label62;
      label88: localObject = g.pDK;
      if (parambpb == null)
        a.f.b.j.dWJ();
      localObject = g.b(parambpb);
      parambpb = (bpb)localObject;
      if (RadarViewController.c(this.pEg).pBv.containsKey(localObject))
      {
        parambpb = RadarViewController.c(this.pEg).pBv.get(localObject);
        if (parambpb == null)
        {
          parambpb = new v("null cannot be cast to non-null type kotlin.String");
          AppMethodBeat.o(103091);
          throw parambpb;
        }
        parambpb = (String)parambpb;
      }
      this.pEj.put(parambpb, parambpb);
      AppMethodBeat.o(103091);
    }
  }

  public final int getCount()
  {
    if (this.pEo);
    for (int i = 0; ; i = this.pEi.length)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarViewController.c
 * JD-Core Version:    0.6.2
 */