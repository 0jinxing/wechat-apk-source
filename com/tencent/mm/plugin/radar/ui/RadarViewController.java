package com.tencent.mm.plugin.radar.ui;

import a.f;
import a.f.a.a;
import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.i.k;
import a.l;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.plugin.radar.b.c;
import com.tencent.mm.plugin.radar.b.c.c;
import com.tencent.mm.plugin.radar.b.c.e;
import com.tencent.mm.plugin.radar.b.e;
import com.tencent.mm.plugin.radar.b.e.c;
import com.tencent.mm.plugin.radar.b.e.d;
import com.tencent.mm.plugin.radar.b.e.e;
import com.tencent.mm.protocal.protobuf.boy;
import com.tencent.mm.protocal.protobuf.boz;
import com.tencent.mm.protocal.protobuf.bpb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarViewController;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarDelegate;", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$IOnAddContact;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TagAnimation", "", "TagBase", "TagIndex", "adapter", "Lcom/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter;", "addContact", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact;", "canCreateGroup", "", "grid", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "getGrid", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "grid$delegate", "Lkotlin/Lazy;", "hasShowGpsAlert", "mOnQuitActionButtonListener", "Landroid/view/View$OnClickListener;", "memberDetailView", "Lcom/tencent/mm/plugin/radar/ui/RadarMemberView;", "getMemberDetailView", "()Lcom/tencent/mm/plugin/radar/ui/RadarMemberView;", "memberDetailView$delegate", "newRadarTip", "Landroid/widget/TextView;", "getNewRadarTip", "()Landroid/widget/TextView;", "newRadarTip$delegate", "newRadarTipLoading", "Landroid/widget/ProgressBar;", "getNewRadarTipLoading", "()Landroid/widget/ProgressBar;", "newRadarTipLoading$delegate", "quitBtn", "Landroid/widget/Button;", "getQuitBtn", "()Landroid/widget/Button;", "quitBtn$delegate", "radarBgMask", "Landroid/view/View;", "getRadarBgMask", "()Landroid/view/View;", "radarBgMask$delegate", "radarManager", "Lcom/tencent/mm/plugin/radar/model/RadarManager;", "<set-?>", "Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;", "radarStatus", "getRadarStatus", "()Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;", "setRadarStatus", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "radarTips", "Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;", "getRadarTips", "()Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;", "radarTips$delegate", "waveView", "Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;", "getWaveView", "()Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;", "waveView$delegate", "buildMember", "Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "username", "", "encyptUsername", "distance", "nickname", "smallImgUrl", "initView", "", "mapRadarSearchMembersState", "radarSearchMembers", "Ljava/util/LinkedList;", "onAddContactReturn", "ok", "hasSentVerify", "errMsg", "timeStamp", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onLocationGot", "isOk", "location", "Lcom/tencent/mm/pluginsdk/model/lbs/Location;", "onPause", "onRadarMemberReturn", "errType", "errCode", "radarMembers", "count", "onRadarRelationChainReturn", "redarChatMember", "Lcom/tencent/mm/protocal/protobuf/RadarChatRoomMember;", "onRecvFriendAdded", "contact", "Lcom/tencent/mm/storage/Contact;", "onRecvFriendVerify", "onResume", "onVerifyContactReturn", "prepareGrid", "processRadarSearchMembers", "radarBackgroundFadeIn", "startRadarSearch", "startWaves", "stopRadarSearch", "stopWaves", "switchRadarContactState", "state", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$Status;", "swithcRadarUI", "status", "updateActionButton", "AvatarAnimator", "Companion", "RadarSearchAdapter", "TagItem", "plugin-radar_release"})
public final class RadarViewController extends RelativeLayout
  implements c.c, e.d
{
  private static final String TAG = "MicroMsg.Radar.RadarViewController";
  public static final b pEc;
  private boolean nPX;
  private final f pDL;
  private final f pDM;
  private final f pDN;
  private final f pDO;
  private final f pDP;
  private final f pDQ;
  private final f pDR;
  private final f pDS;
  e pDT;
  c pDU;
  RadarViewController.c pDV;
  private e.e pDW;
  private final boolean pDX;
  final View.OnClickListener pDY;
  private final int pDZ;
  private final int pEa;
  private final int pEb;

  static
  {
    AppMethodBeat.i(103102);
    eQB = new k[] { (k)v.a(new t(v.aN(RadarViewController.class), "waveView", "getWaveView()Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;")), (k)v.a(new t(v.aN(RadarViewController.class), "memberDetailView", "getMemberDetailView()Lcom/tencent/mm/plugin/radar/ui/RadarMemberView;")), (k)v.a(new t(v.aN(RadarViewController.class), "grid", "getGrid()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;")), (k)v.a(new t(v.aN(RadarViewController.class), "radarTips", "getRadarTips()Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;")), (k)v.a(new t(v.aN(RadarViewController.class), "newRadarTip", "getNewRadarTip()Landroid/widget/TextView;")), (k)v.a(new t(v.aN(RadarViewController.class), "newRadarTipLoading", "getNewRadarTipLoading()Landroid/widget/ProgressBar;")), (k)v.a(new t(v.aN(RadarViewController.class), "quitBtn", "getQuitBtn()Landroid/widget/Button;")), (k)v.a(new t(v.aN(RadarViewController.class), "radarBgMask", "getRadarBgMask()Landroid/view/View;")) };
    pEc = new b((byte)0);
    TAG = "MicroMsg.Radar.RadarViewController";
    AppMethodBeat.o(103102);
  }

  public RadarViewController(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(103126);
    this.pDL = a.g.g((a)new RadarViewController.i(this));
    this.pDM = i.aa(this, 2131826780);
    this.pDN = i.aa(this, 2131826810);
    this.pDO = i.aa(this, 2131826812);
    this.pDP = i.aa(this, 2131826808);
    this.pDQ = i.aa(this, 2131826807);
    this.pDR = i.aa(this, 2131826811);
    this.pDS = i.aa(this, 2131826802);
    this.pDW = e.e.pBM;
    this.pDY = ((View.OnClickListener)new RadarViewController.f(this));
    this.pDZ = 33554432;
    this.pEa = (this.pDZ + 1);
    this.pEb = (this.pDZ + 2);
    paramAttributeSet = (e.d)this;
    Context localContext = paramContext.getApplicationContext();
    j.o(localContext, "mContext.getApplicationContext()");
    this.pDT = new e(paramAttributeSet, localContext);
    this.pDU = new c((e.d)this, paramContext);
    AppMethodBeat.o(103126);
  }

  private final void a(e.e parame)
  {
    AppMethodBeat.i(103124);
    this.pDW = parame;
    switch (h.pEv[parame.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(103124);
      while (true)
      {
        return;
        getRadarBgMask().setVisibility(8);
        getQuitBtn().setText(2131302120);
        getNewRadarTipLoading().setVisibility(8);
        getNewRadarTip().setText((CharSequence)"");
        getWaveView().cdU();
        getWaveView().setVisibility(0);
        parame = this.pDT;
        if (parame == null)
          j.avw("radarManager");
        parame.cdA();
        AppMethodBeat.o(103124);
        continue;
        getRadarBgMask().setVisibility(8);
        getNewRadarTipLoading().setVisibility(8);
        getNewRadarTip().setText((CharSequence)"");
        AppMethodBeat.o(103124);
        continue;
        cdR();
        getQuitBtn().setText(2131296868);
        parame = this.pDT;
        if (parame == null)
          j.avw("radarManager");
        parame.cdB();
        getNewRadarTipLoading().setVisibility(0);
        getNewRadarTip().setText(2131302122);
        getWaveView().cdV();
        getWaveView().setVisibility(4);
        getGrid().setVisibility(4);
        parame = this.pDV;
        if (parame == null)
          j.avw("adapter");
        parame.clearAll();
        AppMethodBeat.o(103124);
        continue;
        getRadarBgMask().setVisibility(0);
        parame = this.pDT;
        if (parame == null)
          j.avw("radarManager");
        parame.cdB();
        getNewRadarTipLoading().setVisibility(8);
        getNewRadarTip().setText(2131302111);
        getGrid().setVisibility(0);
        AppMethodBeat.o(103124);
      }
      getRadarBgMask().setVisibility(8);
      parame = this.pDT;
      if (parame == null)
        j.avw("radarManager");
      parame.cdB();
      getNewRadarTipLoading().setVisibility(0);
      getNewRadarTip().setText(2131302112);
    }
  }

  private final void aj(LinkedList<bpb> paramLinkedList)
  {
    AppMethodBeat.i(103122);
    if (paramLinkedList == null)
      j.dWJ();
    RadarViewController.c localc;
    if (paramLinkedList.size() == 0)
    {
      localc = this.pDV;
      if (localc == null)
        j.avw("adapter");
      if (localc.getCount() == 0)
        getRadarTips().setNoMember(true);
    }
    while (true)
    {
      ab.d(TAG, "members got, size : " + paramLinkedList.size());
      boolean bool = ak(paramLinkedList);
      ab.d(TAG, "has friend:%s", new Object[] { String.valueOf(bool) });
      localc = this.pDV;
      if (localc == null)
        j.avw("adapter");
      localc.al(paramLinkedList);
      if ((this.pDX) && (bool))
        a(e.e.pBN);
      AppMethodBeat.o(103122);
      return;
      getRadarTips().setNoMember(false);
    }
  }

  private final boolean ak(LinkedList<bpb> paramLinkedList)
  {
    AppMethodBeat.i(103123);
    boolean bool = false;
    if (paramLinkedList == null)
      j.dWJ();
    Iterator localIterator = paramLinkedList.iterator();
    if (localIterator.hasNext())
    {
      Object localObject = (bpb)localIterator.next();
      paramLinkedList = this.pDT;
      if (paramLinkedList == null)
        j.avw("radarManager");
      j.o(localObject, "member");
      paramLinkedList = e.a(paramLinkedList, (bpb)localObject);
      if (paramLinkedList != null)
        break label143;
      paramLinkedList = g.pDK;
      localObject = g.b((bpb)localObject);
      paramLinkedList = this.pDU.Vx((String)localObject);
      e locale = this.pDT;
      if (locale == null)
        j.avw("radarManager");
      locale.b((String)localObject, paramLinkedList);
    }
    label143: 
    while (true)
    {
      if (paramLinkedList == c.e.pAY)
        bool = true;
      while (true)
      {
        break;
        AppMethodBeat.o(103123);
        return bool;
      }
    }
  }

  private final void cdR()
  {
    AppMethodBeat.i(103125);
    if (getRadarBgMask().getVisibility() != 0)
    {
      getRadarBgMask().setAnimation(AnimationUtils.loadAnimation(getContext(), 2131034231));
      getRadarBgMask().setVisibility(0);
    }
    AppMethodBeat.o(103125);
  }

  private final void d(String paramString, c.e parame)
  {
    AppMethodBeat.i(103114);
    Object localObject = this.pDT;
    if (localObject == null)
      j.avw("radarManager");
    if (paramString == null)
      j.dWJ();
    localObject = ((e)localObject).Vy(paramString);
    if ((localObject != null) && (localObject != parame))
    {
      localObject = this.pDT;
      if (localObject == null)
        j.avw("radarManager");
      ((e)localObject).b(paramString, parame);
      paramString = this.pDV;
      if (paramString == null)
        j.avw("adapter");
      paramString.aPw();
    }
    AppMethodBeat.o(103114);
  }

  private final TextView getNewRadarTip()
  {
    AppMethodBeat.i(103107);
    TextView localTextView = (TextView)this.pDP.getValue();
    AppMethodBeat.o(103107);
    return localTextView;
  }

  private final ProgressBar getNewRadarTipLoading()
  {
    AppMethodBeat.i(103108);
    ProgressBar localProgressBar = (ProgressBar)this.pDQ.getValue();
    AppMethodBeat.o(103108);
    return localProgressBar;
  }

  private final View getRadarBgMask()
  {
    AppMethodBeat.i(103110);
    View localView = (View)this.pDS.getValue();
    AppMethodBeat.o(103110);
    return localView;
  }

  private final void setRadarStatus(e.e parame)
  {
    this.pDW = parame;
  }

  public final void Q(ad paramad)
  {
    AppMethodBeat.i(103118);
    j.p(paramad, "contact");
    if (getMemberDetailView().isShowing())
    {
      RadarMemberView localRadarMemberView = getMemberDetailView();
      String str = paramad.Hv();
      j.o(str, "contact.encryptUsername");
      localRadarMemberView.c(str, c.e.pAY);
    }
    d(paramad.getUsername(), c.e.pAY);
    d(paramad.Hv(), c.e.pAY);
    AppMethodBeat.o(103118);
  }

  public final void R(ad paramad)
  {
    AppMethodBeat.i(103117);
    j.p(paramad, "contact");
    Object localObject1 = this.pDT;
    if (localObject1 == null)
      j.avw("radarManager");
    Object localObject2 = paramad.getUsername();
    j.o(localObject2, "contact.username");
    if (((e)localObject1).Vy((String)localObject2) == null)
    {
      localObject2 = this.pDT;
      if (localObject2 == null)
        j.avw("radarManager");
      localObject1 = paramad.Hv();
      j.o(localObject1, "contact.encryptUsername");
      if (((e)localObject2).Vy((String)localObject1) == null)
      {
        localObject1 = new LinkedList();
        localObject2 = paramad.getUsername();
        j.o(localObject2, "contact.username");
        String str1 = paramad.Hv();
        j.o(str1, "contact.encryptUsername");
        String str2 = paramad.Hs();
        j.o(str2, "contact.nickname");
        bpb localbpb = new bpb();
        localbpb.wRw = 100;
        localbpb.jBB = ((String)localObject2);
        localbpb.jCH = str2;
        localbpb.SmallImgUrl = "";
        localbpb.wfK = str1;
        ((LinkedList)localObject1).add(localbpb);
        aj((LinkedList)localObject1);
      }
    }
    if (getMemberDetailView().isShowing())
    {
      localObject2 = getMemberDetailView();
      localObject1 = paramad.Hv();
      j.o(localObject1, "contact.encryptUsername");
      ((RadarMemberView)localObject2).c((String)localObject1, c.e.pAZ);
    }
    d(paramad.getUsername(), c.e.pAZ);
    d(paramad.Hv(), c.e.pAZ);
    AppMethodBeat.o(103117);
  }

  public final void a(int paramInt1, int paramInt2, LinkedList<bpb> paramLinkedList)
  {
    AppMethodBeat.i(103120);
    Object localObject;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e(TAG, "radar member return error : %s, type : %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      if (2 == paramInt1)
      {
        localObject = getRadarTips();
        paramLinkedList = getContext().getString(2131301654);
        j.o(paramLinkedList, "context.getString(R.string.net_warn_no_network)");
        ((RadarTipsView)localObject).Vz(paramLinkedList);
        AppMethodBeat.o(103120);
      }
    }
    while (true)
    {
      return;
      paramLinkedList = getRadarTips();
      localObject = getContext().getString(2131302126);
      j.o(localObject, "context.getString(R.string.radar_tips_network_err)");
      paramLinkedList.Vz((String)localObject);
      AppMethodBeat.o(103120);
      continue;
      aj(paramLinkedList);
      AppMethodBeat.o(103120);
    }
  }

  public final void a(boolean paramBoolean, String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(103116);
    if (paramBoolean)
      d(paramString2, c.e.pAY);
    while (true)
    {
      paramString1 = this.pDT;
      if (paramString1 == null)
        j.avw("radarManager");
      paramString1.pBy.remove(Long.valueOf(paramLong));
      AppMethodBeat.o(103116);
      return;
      RadarTipsView localRadarTipsView = getRadarTips();
      paramString2 = paramString1;
      if (paramString1 == null)
        paramString2 = "";
      localRadarTipsView.Vz(paramString2);
      paramString1 = this.pDT;
      if (paramString1 == null)
        j.avw("radarManager");
      paramString1 = (e.c)paramString1.pBy.get(Long.valueOf(paramLong));
      if (paramString1 != null)
      {
        paramString2 = g.pDK;
        d(g.b(paramString1.pBK), paramString1.pBL);
      }
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(103115);
    if (paramBoolean1)
      d(paramString2, c.e.pAY);
    while (true)
    {
      paramString1 = this.pDT;
      if (paramString1 == null)
        j.avw("radarManager");
      paramString1.pBy.remove(Long.valueOf(paramLong));
      AppMethodBeat.o(103115);
      return;
      if (paramBoolean2)
      {
        d(paramString2, c.e.pAX);
      }
      else
      {
        RadarTipsView localRadarTipsView = getRadarTips();
        paramString2 = paramString1;
        if (paramString1 == null)
          paramString2 = "";
        localRadarTipsView.Vz(paramString2);
        paramString1 = this.pDT;
        if (paramString1 == null)
          j.avw("radarManager");
        paramString1 = (e.c)paramString1.pBy.get(Long.valueOf(paramLong));
        if (paramString1 != null)
        {
          paramString2 = g.pDK;
          d(g.b(paramString1.pBK), paramString1.pBL);
          paramString2 = g.pDK;
          d(g.c(paramString1.pBK), paramString1.pBL);
        }
      }
    }
  }

  public final void b(int paramInt1, int paramInt2, LinkedList<boy> paramLinkedList)
  {
    int i = 0;
    AppMethodBeat.i(103121);
    Object localObject2;
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramLinkedList != null))
    {
      a(e.e.pBP);
      RadarViewController.c localc = this.pDV;
      if (localc == null)
        j.avw("adapter");
      c(localc.pEg).pBz.clear();
      c(localc.pEg).pBv.clear();
      localc.pEj.clear();
      localc.pEk.clear();
      Object localObject1 = null;
      localObject2 = localObject1;
      if (paramLinkedList != null)
      {
        localObject2 = localObject1;
        if (paramLinkedList.size() > 0)
        {
          localObject2 = new LinkedList();
          paramInt2 = paramLinkedList.size();
          Object localObject3;
          for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
          {
            localObject1 = paramLinkedList.get(paramInt1);
            j.o(localObject1, "radarChatMember[i]");
            localObject1 = (boy)localObject1;
            localObject3 = new boz();
            ((boz)localObject3).wRv = ((boy)localObject1).jBB;
            ((LinkedList)localObject2).add(localObject3);
            localObject3 = c(localc.pEg).pBv;
            String str = ((boy)localObject1).wfK;
            j.o(str, "radarchatroomMember.EncodeUserName");
            Object localObject4 = ((boy)localObject1).jBB;
            j.o(localObject4, "radarchatroomMember.UserName");
            ((Map)localObject3).put(str, localObject4);
            localObject4 = localc.pEk;
            localObject3 = g.pDK;
            ((HashMap)localObject4).put(g.a((boy)localObject1), Integer.valueOf(0));
          }
          paramInt2 = localc.pEi.length;
          for (paramInt1 = i; paramInt1 < paramInt2; paramInt1++)
          {
            paramLinkedList = localc.pEi[paramInt1];
            localObject1 = c(localc.pEg).pBv;
            localObject3 = g.pDK;
            if (!bo.isNullOrNil((String)((Map)localObject1).get(g.c(paramLinkedList))))
            {
              d(localc.pEg).d(paramLinkedList);
              c(localc.pEg).a(paramLinkedList);
            }
          }
        }
      }
      c(localc.pEg).pBu = ((LinkedList)localObject2);
      paramLinkedList = this.pDV;
      if (paramLinkedList == null)
        j.avw("adapter");
      paramLinkedList.aPw();
      AppMethodBeat.o(103121);
    }
    while (true)
    {
      return;
      a(e.e.pBM);
      localObject2 = getRadarTips();
      paramLinkedList = getContext().getString(2131302126);
      j.o(paramLinkedList, "context.getString(R.string.radar_tips_network_err)");
      ((RadarTipsView)localObject2).Vz(paramLinkedList);
      AppMethodBeat.o(103121);
    }
  }

  public final void cdA()
  {
    AppMethodBeat.i(103112);
    e locale = this.pDT;
    if (locale == null)
      j.avw("radarManager");
    locale.cdA();
    AppMethodBeat.o(103112);
  }

  final RadarSpecialGridView getGrid()
  {
    AppMethodBeat.i(103105);
    RadarSpecialGridView localRadarSpecialGridView = (RadarSpecialGridView)this.pDN.getValue();
    AppMethodBeat.o(103105);
    return localRadarSpecialGridView;
  }

  final RadarMemberView getMemberDetailView()
  {
    AppMethodBeat.i(103104);
    RadarMemberView localRadarMemberView = (RadarMemberView)this.pDM.getValue();
    AppMethodBeat.o(103104);
    return localRadarMemberView;
  }

  final Button getQuitBtn()
  {
    AppMethodBeat.i(103109);
    Button localButton = (Button)this.pDR.getValue();
    AppMethodBeat.o(103109);
    return localButton;
  }

  public final e.e getRadarStatus()
  {
    return this.pDW;
  }

  final RadarTipsView getRadarTips()
  {
    AppMethodBeat.i(103106);
    RadarTipsView localRadarTipsView = (RadarTipsView)this.pDO.getValue();
    AppMethodBeat.o(103106);
    return localRadarTipsView;
  }

  final RadarWaveView getWaveView()
  {
    AppMethodBeat.i(103103);
    RadarWaveView localRadarWaveView = (RadarWaveView)this.pDL.getValue();
    AppMethodBeat.o(103103);
    return localRadarWaveView;
  }

  public final void ka(boolean paramBoolean)
  {
    AppMethodBeat.i(103119);
    if (!paramBoolean)
    {
      RadarTipsView localRadarTipsView = getRadarTips();
      String str = getContext().getString(2131302125);
      j.o(str, "context.getString(R.stri….radar_tips_location_err)");
      localRadarTipsView.Vz(str);
      if ((!this.nPX) && (!d.agA()))
      {
        this.nPX = true;
        h.a(getContext(), getContext().getString(2131300421), getContext().getString(2131297061), getContext().getString(2131300878), getContext().getString(2131296868), false, (DialogInterface.OnClickListener)new RadarViewController.g(this), null);
      }
    }
    AppMethodBeat.o(103119);
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(103113);
    j.p(paramKeyEvent, "event");
    if ((paramInt == 4) && (getMemberDetailView().isShowing() == true))
    {
      getMemberDetailView().dismiss();
      AppMethodBeat.o(103113);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(103113);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(103111);
    e locale = this.pDT;
    if (locale == null)
      j.avw("radarManager");
    locale.onResume();
    AppMethodBeat.o(103111);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator;", "", "(Lcom/tencent/mm/plugin/radar/ui/RadarViewController;)V", "AvatarTagIndex", "", "delayShowHandler", "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator$delayShowHandler$1", "Lcom/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator$delayShowHandler$1;", "inAnimation", "Landroid/view/animation/Animation;", "getInAnimation", "()Landroid/view/animation/Animation;", "isNotXHDPI", "", "uniqueTag", "getUniqueTag", "()I", "calcDelay", "index", "cancel", "", "view", "Landroid/view/View;", "getAnimationTag", "init", "show", "plugin-radar_release"})
  final class a
  {
    private int pEd;
    final boolean pEe;
    private final RadarViewController.a.a pEf;

    public a()
    {
      AppMethodBeat.i(103085);
      g localg = g.pDK;
      this$1 = this$1.getContext();
      j.o(this$1, "context");
      this.pEe = g.eJ(this$1);
      this.pEf = new RadarViewController.a.a(this);
      AppMethodBeat.o(103085);
    }

    private final int dr(View paramView)
    {
      AppMethodBeat.i(103084);
      Object localObject = paramView.getTag(RadarViewController.a(this.pEg));
      paramView = localObject;
      if (!(localObject instanceof Integer))
        paramView = null;
      paramView = (Integer)paramView;
      int i;
      if (paramView != null)
      {
        i = paramView.intValue();
        AppMethodBeat.o(103084);
      }
      while (true)
      {
        return i;
        i = -1;
        AppMethodBeat.o(103084);
      }
    }

    public final int cdT()
    {
      this.pEd += 1;
      return this.pEd;
    }

    public final void cf(View paramView)
    {
      AppMethodBeat.i(103083);
      j.p(paramView, "view");
      int i = dr(paramView);
      if (i > 0)
        this.pEf.removeMessages(i);
      paramView.clearAnimation();
      AppMethodBeat.o(103083);
    }

    public final void g(int paramInt, View paramView)
    {
      AppMethodBeat.i(103082);
      j.p(paramView, "view");
      Message localMessage = this.pEf.obtainMessage();
      localMessage.what = dr(paramView);
      localMessage.obj = paramView;
      paramView.setVisibility(4);
      this.pEf.sendMessageDelayed(localMessage, (paramInt + 1) * 500);
      AppMethodBeat.o(103082);
    }

    public final Animation getInAnimation()
    {
      AppMethodBeat.i(103081);
      Animation localAnimation = AnimationUtils.loadAnimation(this.pEg.getContext(), 2131034238);
      j.o(localAnimation, "AnimationUtils.loadAnima…anim.radar_user_turn_out)");
      AppMethodBeat.o(103081);
      return localAnimation;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarViewController$Companion;", "", "()V", "TAG", "", "plugin-radar_release"})
  public static final class b
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarViewController
 * JD-Core Version:    0.6.2
 */