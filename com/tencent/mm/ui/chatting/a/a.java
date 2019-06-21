package com.tencent.mm.ui.chatting.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ba.r;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.u;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.pluginsdk.ui.chat.l;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ae;
import com.tencent.mm.ui.chatting.ag;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.s.f;
import com.tencent.mm.ui.chatting.s.g;
import com.tencent.mm.ui.chatting.viewitems.ad.a;
import com.tencent.mm.ui.chatting.viewitems.ad.b;
import com.tencent.mm.ui.chatting.viewitems.az;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public final class a extends BaseAdapter
  implements com.tencent.mm.ui.chatting.c.b.h
{
  private boolean ceU;
  public com.tencent.mm.at.a.a.c elH;
  private int emW;
  private LayoutInflater ezi;
  private HashSet jNF;
  private ListView mListView;
  private com.tencent.mm.pluginsdk.ui.e.g yGy;
  public s.g yMW;
  private s.g yMX;
  public s.f yMY;
  private s.f yMZ;
  public l yNa;
  private l yNb;
  public x yNc;
  private x yNd;
  public com.tencent.mm.ui.chatting.c yNe;
  private com.tencent.mm.ui.chatting.c yNf;
  private View.OnClickListener yNg;
  private final int yNh;
  private final int yNi;
  public SparseArray<bi> yNj;
  private HashSet<Long> yNk;
  public SparseIntArray yNl;
  public long yNm;
  private TreeSet<Long> yNn;
  private Map<Long, Integer> yNo;
  private Map<Long, WeakReference<View>> yNp;
  private boolean yNq;
  private boolean yNr;
  private final ap yNs;
  public com.tencent.mm.ui.chatting.l.a.a yNt;
  private boolean yNu;
  private int yNv;
  protected h.a yNw;
  private t.a yNx;
  private long yNy;
  private com.tencent.mm.ui.chatting.d.a yod;

  public a(com.tencent.mm.ui.chatting.d.a parama, ListView paramListView)
  {
    AppMethodBeat.i(31100);
    this.yNg = null;
    this.yNj = new SparseArray();
    this.yNk = new HashSet();
    this.yNl = new SparseIntArray();
    this.yNm = -1L;
    this.yNn = new TreeSet();
    this.yNo = new HashMap();
    this.yNp = new HashMap();
    this.yNq = false;
    this.yNr = false;
    this.yNs = new ap(new a.1(this), true);
    this.emW = -1;
    this.yNu = false;
    this.yNv = 0;
    this.yNw = new a.3(this);
    this.yNx = new a.4(this);
    this.yNy = -1L;
    this.elH = null;
    this.jNF = new HashSet();
    parama.a(com.tencent.mm.ui.chatting.c.b.h.class, this);
    this.mListView = paramListView;
    this.yod = parama;
    this.ezi = v.hu(parama.yTx.getContext());
    this.yNh = parama.yTx.getMMResources().getDimensionPixelSize(2131427865);
    this.yNi = parama.yTx.getMMResources().getDimensionPixelSize(2131427786);
    paramListView = new s.g();
    this.yMX = paramListView;
    this.yMW = paramListView;
    paramListView = new s.f(parama);
    this.yMZ = paramListView;
    this.yMY = paramListView;
    paramListView = new l(parama.yTx.getContext());
    this.yNb = paramListView;
    this.yNa = paramListView;
    paramListView = new x(parama);
    this.yNd = paramListView;
    this.yNc = paramListView;
    paramListView = new com.tencent.mm.ui.chatting.c(parama);
    this.yNf = paramListView;
    this.yNe = paramListView;
    this.yGy = new ag(parama);
    if (this.elH == null)
    {
      parama = new com.tencent.mm.at.a.a.c.a();
      parama.ePK = com.tencent.mm.aj.a.e.rz(this.yod.getTalkerUserName());
      parama.ePH = true;
      parama.ePZ = true;
      parama.ePT = 2131231172;
      this.elH = parama.ahG();
    }
    AppMethodBeat.o(31100);
  }

  private void dCO()
  {
    AppMethodBeat.i(31105);
    ab.d("MicroMsg.ChattingDataAdapter", "disable clickListener");
    this.yMW = null;
    this.yMY = null;
    this.yNa = null;
    this.yNc = null;
    this.yNe = null;
    AppMethodBeat.o(31105);
  }

  public final void B(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(31124);
    if ((!this.yNp.containsKey(Long.valueOf(paramLong))) || (!this.yNo.containsKey(Long.valueOf(paramLong))))
    {
      ab.d("MicroMsg.ChattingDataAdapter", "msg not display, ".concat(String.valueOf(paramLong)));
      AppMethodBeat.o(31124);
      return;
    }
    Object localObject = (WeakReference)this.yNp.get(Long.valueOf(paramLong));
    if (localObject != null);
    for (localObject = (View)((WeakReference)localObject).get(); ; localObject = null)
    {
      if (localObject != null)
        ad.b.a((com.tencent.mm.ui.chatting.viewitems.c.a)((View)localObject).getTag(), paramBoolean);
      AppMethodBeat.o(31124);
      break;
    }
  }

  public final bi Ou(int paramInt)
  {
    AppMethodBeat.i(31110);
    bi localbi = (bi)this.yNj.get(paramInt);
    AppMethodBeat.o(31110);
    return localbi;
  }

  public final void Ov(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(31118);
    bi localbi = Ou(paramInt);
    if (localbi == null)
      bool = true;
    ab.i("MicroMsg.ChattingDataAdapter", "[setShowHistoryMsgTipId] pos:%s msg is null? %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
    if ((localbi != null) && (localbi.field_msgId != 0L))
      this.yNm = localbi.field_msgId;
    notifyDataSetChanged();
    AppMethodBeat.o(31118);
  }

  public final void Ow(int paramInt)
  {
    AppMethodBeat.i(31126);
    bi localbi = Ou(paramInt);
    if ((localbi != null) && (localbi.field_msgId != 0L))
      this.yNk.add(Long.valueOf(localbi.field_msgId));
    AppMethodBeat.o(31126);
  }

  public final void a(int paramInt, d.a parama)
  {
    AppMethodBeat.i(31120);
    ab.i("MicroMsg.ChattingDataAdapter", "[locationByMsgId] position:%s mode:%s", new Object[] { Integer.valueOf(paramInt), parama });
    Bundle localBundle = new Bundle();
    localBundle.putInt("MSG_POSITION", paramInt);
    localBundle.putInt("SCENE", 2);
    this.yNt.a(parama, false, localBundle);
    AppMethodBeat.o(31120);
  }

  public final void a(long paramLong, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(31125);
    if ((!this.yNp.containsKey(Long.valueOf(paramLong))) || (!this.yNo.containsKey(Long.valueOf(paramLong))))
    {
      ab.d("MicroMsg.ChattingDataAdapter", "msg not display, ".concat(String.valueOf(paramLong)));
      AppMethodBeat.o(31125);
      return;
    }
    Object localObject = (WeakReference)this.yNp.get(Long.valueOf(paramLong));
    if (localObject != null);
    for (localObject = (View)((WeakReference)localObject).get(); ; localObject = null)
    {
      if (localObject != null)
      {
        localObject = (com.tencent.mm.ui.chatting.viewitems.c.a)((View)localObject).getTag();
        ad.a.a(this.yod.yTx.getContext(), (com.tencent.mm.ui.chatting.viewitems.c.a)localObject, parambi, paramBoolean);
      }
      AppMethodBeat.o(31125);
      break;
    }
  }

  public final void a(long paramLong, boolean paramBoolean, d.a parama)
  {
    AppMethodBeat.i(31119);
    ab.i("MicroMsg.ChattingDataAdapter", "[locationByMsgId] messageId:%s loadAllBottomMsg:%s mode:%s", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(paramBoolean), parama });
    Bundle localBundle = new Bundle();
    localBundle.putLong("MSG_ID", paramLong);
    localBundle.putInt("SCENE", 1);
    localBundle.putBoolean("IS_LOAD_ALL", paramBoolean);
    this.yNt.a(parama, true, localBundle);
    AppMethodBeat.o(31119);
  }

  public final void bvQ()
  {
    AppMethodBeat.i(31114);
    this.yNq = false;
    notifyDataSetChanged();
    ab.d("MicroMsg.ChattingDataAdapter", "enable ClickListener");
    this.yMW = this.yMX;
    this.yMY = this.yMZ;
    this.yNa = this.yNb;
    this.yNc = this.yNd;
    this.yNe = this.yNf;
    AppMethodBeat.o(31114);
  }

  public final void c(View.OnClickListener paramOnClickListener)
  {
    this.yNg = paramOnClickListener;
  }

  public final int cdf()
  {
    AppMethodBeat.i(31112);
    int i = this.yNn.size();
    AppMethodBeat.o(31112);
    return i;
  }

  public final int dCP()
  {
    AppMethodBeat.i(31109);
    if (-1 == this.emW)
    {
      aw.ZK();
      this.emW = com.tencent.mm.model.c.XO().Rp(this.yod.getTalkerUserName());
    }
    int i = this.emW;
    AppMethodBeat.o(31109);
    return i;
  }

  public final Set<Long> dCQ()
  {
    return this.yNn;
  }

  public final void dCR()
  {
    AppMethodBeat.i(31113);
    if (this.yNn != null)
      this.yNn.clear();
    AppMethodBeat.o(31113);
  }

  public final void dCS()
  {
    AppMethodBeat.i(31115);
    this.yNq = true;
    notifyDataSetChanged();
    dCO();
    AppMethodBeat.o(31115);
  }

  public final void dCT()
  {
    AppMethodBeat.i(31117);
    if (this.yNu)
    {
      this.yNv += 1;
      ab.i("MicroMsg.ChattingDataAdapter", "[handleMsgChange] isLockNotify:" + this.yNv);
      AppMethodBeat.o(31117);
    }
    while (true)
    {
      return;
      if (!this.ceU)
      {
        ab.i("MicroMsg.ChattingDataAdapter", "[handleMsgChange] is not resumeState ");
        AppMethodBeat.o(31117);
      }
      else
      {
        this.yNt.a(d.a.yYu, false, null);
        AppMethodBeat.o(31117);
      }
    }
  }

  public final void dCU()
  {
    AppMethodBeat.i(31121);
    ab.i("MicroMsg.ChattingDataAdapter", "[lockNotify] isLockNotify:%s notifyCountWhileLock:%s", new Object[] { Boolean.valueOf(this.yNu), Integer.valueOf(this.yNv) });
    if (this.yNu)
      AppMethodBeat.o(31121);
    while (true)
    {
      return;
      this.yNu = true;
      this.yNv = 0;
      AppMethodBeat.o(31121);
    }
  }

  public final void dCV()
  {
    AppMethodBeat.i(31122);
    ab.i("MicroMsg.ChattingDataAdapter", "[unLockNotify] isLockNotify:%s notifyCountWhileLock:%s", new Object[] { Boolean.valueOf(this.yNu), Integer.valueOf(this.yNv) });
    if (!this.yNu)
      AppMethodBeat.o(31122);
    while (true)
    {
      return;
      this.yNu = false;
      if (this.yNv > 0)
        this.yNt.a(d.a.yYu, false, null);
      this.yNv = 0;
      AppMethodBeat.o(31122);
    }
  }

  public final void dCW()
  {
    AppMethodBeat.i(31127);
    this.yNr = true;
    dCO();
    AppMethodBeat.o(31127);
  }

  public final t.a dCX()
  {
    return this.yNx;
  }

  public final s.f dCY()
  {
    return this.yMY;
  }

  public final s.g dCZ()
  {
    return this.yMW;
  }

  public final void dD(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(31129);
    if (this.yod == null)
      AppMethodBeat.o(31129);
    Object localObject1;
    while (true)
    {
      return;
      localObject1 = this.yod.sRl;
      if (localObject1 == null)
      {
        AppMethodBeat.o(31129);
      }
      else
      {
        if (!((ad)localObject1).dsf())
          break;
        localObject2 = new ArrayList();
        while (paramInt1 <= paramInt2)
        {
          localObject1 = (bi)this.yNj.get(paramInt1);
          if ((localObject1 != null) && (((bi)localObject1).getType() == 285212721) && (!this.jNF.contains(Long.valueOf(((cy)localObject1).field_msgId))))
          {
            ab.v("MicroMsg.ChattingDataAdapter", "terry checkpreload:" + ((cy)localObject1).field_msgId);
            this.jNF.add(Long.valueOf(((cy)localObject1).field_msgId));
            ((List)localObject2).add(new String[] { String.valueOf(((cy)localObject1).field_msgId), ((cy)localObject1).field_content, "-1" });
          }
          paramInt1++;
        }
        if (((List)localObject2).size() > 0)
          ((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aU((List)localObject2);
        AppMethodBeat.o(31129);
      }
    }
    Object localObject2 = new LinkedList();
    label231: Object localObject3;
    Object localObject4;
    int i;
    Object localObject5;
    if (paramInt1 <= paramInt2)
    {
      localObject1 = (bi)this.yNj.get(paramInt1);
      if ((localObject1 != null) && ((((bi)localObject1).getType() & 0x31) != 0) && (!this.jNF.contains(Long.valueOf(((cy)localObject1).field_msgSvrId))))
      {
        this.jNF.add(Long.valueOf(((cy)localObject1).field_msgSvrId));
        localObject3 = az.bM((bi)localObject1);
        if (localObject3 != null)
        {
          localObject3 = ((com.tencent.mm.ui.chatting.viewitems.c)localObject3).b(this.yod, (bi)localObject1);
          if (localObject3 != null)
          {
            localObject4 = ((cy)localObject1).field_content;
            if (localObject4 != null)
            {
              localObject4 = j.b.X((String)localObject4, ((cy)localObject1).field_reserved);
              if (localObject4 != null)
              {
                i = u.ad((String)localObject3, this.yod.getTalkerUserName());
                localObject5 = (com.tencent.mm.af.e)((j.b)localObject4).X(com.tencent.mm.af.e.class);
                if (localObject5 == null)
                  break label519;
              }
            }
          }
        }
      }
    }
    label519: for (int j = ((com.tencent.mm.af.e)localObject5).ffZ; ; j = -1)
    {
      localObject5 = new ArrayList();
      ((List)localObject5).add(String.valueOf(((cy)localObject1).field_msgSvrId));
      ((List)localObject5).add(bo.bc(((j.b)localObject4).url, ""));
      ((List)localObject5).add(String.valueOf(j));
      ((List)localObject5).add(localObject3);
      ((List)localObject5).add(String.valueOf(i));
      ((List)localObject2).add(localObject5);
      paramInt1++;
      break label231;
      if (((List)localObject2).size() > 0)
        ((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).i((List)localObject2, 1);
      AppMethodBeat.o(31129);
      break;
    }
  }

  public final x dDa()
  {
    return this.yNc;
  }

  public final l dDb()
  {
    return this.yNa;
  }

  public final com.tencent.mm.ui.chatting.c dDc()
  {
    return this.yNe;
  }

  public final long dDd()
  {
    AppMethodBeat.i(31128);
    long l;
    if (this.yNy != -1L)
    {
      l = this.yNy;
      AppMethodBeat.o(31128);
      return l;
    }
    this.yNy = 0L;
    for (int i = getCount() - 1; ; i--)
      if (i >= 0)
      {
        bi localbi = Ou(i);
        if ((localbi.field_isSend == 1) && ((localbi.dqI & 0x4) != 4))
          this.yNy = localbi.field_msgId;
      }
      else
      {
        l = this.yNy;
        AppMethodBeat.o(31128);
        break;
      }
  }

  public final com.tencent.mm.at.a.a.c dDe()
  {
    return this.elH;
  }

  public final void dhG()
  {
    AppMethodBeat.i(31108);
    com.tencent.mm.ui.chatting.d.a.dFz().post(new a.2(this));
    AppMethodBeat.o(31108);
  }

  public final int getCount()
  {
    AppMethodBeat.i(31101);
    int i = this.yNj.size();
    AppMethodBeat.o(31101);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(31102);
    paramInt = az.bN(Ou(paramInt));
    AppMethodBeat.o(31102);
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(31104);
    bi localbi = Ou(paramInt);
    ab.i("MicroMsg.ChattingDataAdapter", "[getView] position:" + paramInt + " msgId:" + localbi.field_msgId + " svrId:" + localbi.field_msgSvrId + " type:" + localbi.getType() + " send:" + localbi.field_isSend + " talker:" + localbi.field_talker + " msgSep:" + localbi.field_msgSeq + " time:" + localbi.field_createTime);
    if (paramInt == 0)
    {
      paramViewGroup = this.yod;
      ab.i("MicroMsg.ChattingContext", "[scrollToLastProtect]");
      paramViewGroup.yTy.dCD();
    }
    int i;
    int j;
    label227: label246: boolean bool;
    label295: label311: int k;
    label358: Object localObject;
    if ((paramInt != 0) && (this.yNl.get(paramInt) == 0))
    {
      long l1 = Ou(paramInt - 1).field_createTime;
      long l2 = localbi.field_createTime;
      if (l2 - l1 < 60000L)
      {
        i = 1;
        if ((l2 - l1) / 180000L >= 1L)
          break label1116;
        j = 1;
        if ((i == 0) && (j == 0))
          break label1122;
        this.yNl.put(paramInt, 2);
      }
    }
    else
    {
      if (((this.yNl.get(paramInt) != 1) && (paramInt != 0) && (!this.yNk.contains(Long.valueOf(localbi.field_msgId)))) || (localbi.field_createTime <= 1000L))
        break label1134;
      i = 1;
      if (localbi.field_msgId != this.yNm)
        break label1140;
      j = 1;
      paramViewGroup = r.aiy().sU(this.yod.getTalkerUserName());
      bool = true;
      if (paramViewGroup != null)
        break label1146;
      aw.ZK();
      k = ((Integer)com.tencent.mm.model.c.Ry().get(12311, Integer.valueOf(-2))).intValue();
      if (k != -2)
        bool = false;
      if (paramView != null)
        break label1155;
      localObject = az.bM(localbi);
      paramView = ((com.tencent.mm.ui.chatting.viewitems.c)localObject).a(this.ezi, paramView);
      paramViewGroup = (com.tencent.mm.ui.chatting.viewitems.c.a)paramView.getTag();
      paramViewGroup.zbA = ((com.tencent.mm.ui.chatting.viewitems.c)localObject);
      paramViewGroup.setChattingBG(bool);
      label410: ab.d("MicroMsg.ChattingDataAdapter", "dealItemView() ChattingItem:%s", new Object[] { paramViewGroup.zbA });
      if (i == 0)
        break label1172;
      paramViewGroup.enf.setVisibility(0);
      paramViewGroup.enf.setText(com.tencent.mm.pluginsdk.f.h.c(this.yod.yTx.getContext(), localbi.field_createTime, false));
      if (paramViewGroup.enf.getTextSize() > com.tencent.mm.bz.a.fromDPToPix(this.yod.yTx.getContext(), 25))
        ab.e("MicroMsg.ChattingDataAdapter", "WDF!!! TextSize:%s", new Object[] { Float.valueOf(paramViewGroup.enf.getTextSize()) });
      label522: if (paramViewGroup.zbx != null)
      {
        if (j == 0)
          break label1184;
        paramViewGroup.zbx.setVisibility(0);
      }
      label542: com.tencent.mm.ui.chatting.viewitems.c localc = paramViewGroup.zbA;
      paramViewGroup.zbz = null;
      localObject = com.tencent.mm.aw.a.aih();
      if ((localObject != null) && (((com.tencent.mm.aw.e)localObject).fJU != null) && (((com.tencent.mm.aw.e)localObject).fJS == 0) && (com.tencent.mm.aw.a.aie()))
        paramViewGroup.zbz = ((com.tencent.mm.aw.e)localObject).fJU;
      localc.a(paramViewGroup, paramInt, this.yod, localbi);
      localObject = ((com.tencent.mm.ui.chatting.c.b.c)this.yod.aF(com.tencent.mm.ui.chatting.c.b.c.class)).dDJ();
      if ((paramViewGroup.enf.getVisibility() == 0) && (localObject != null))
      {
        paramViewGroup.enf.setTextColor(((com.tencent.mm.pluginsdk.ui.e)localObject).vgW);
        if (!((com.tencent.mm.pluginsdk.ui.e)localObject).vgX)
          break label1196;
        paramViewGroup.enf.setShadowLayer(2.0F, 1.2F, 1.2F, ((com.tencent.mm.pluginsdk.ui.e)localObject).vgY);
        label681: if (!((com.tencent.mm.pluginsdk.ui.e)localObject).vgZ)
          break label1223;
        if (!((com.tencent.mm.pluginsdk.ui.e)localObject).vha)
          break label1210;
        paramViewGroup.enf.setBackgroundResource(2130838200);
        label707: paramViewGroup.enf.setPadding(this.yNi, this.yNh, this.yNi, this.yNh);
      }
      label730: if ((paramViewGroup.qkY != null) && (paramViewGroup.qkY.getVisibility() == 0) && (localObject != null) && (!this.yod.getTalkerUserName().equals("qqmail")) && (localbi.getType() != 318767153))
      {
        if (!((com.tencent.mm.pluginsdk.ui.e)localObject).vha)
          break label1234;
        paramViewGroup.qkY.setTextColor(-1);
        paramViewGroup.qkY.setShadowLayer(com.tencent.mm.bz.a.fromDPToPix(paramViewGroup.qkY.getContext(), 2), 0.0F, com.tencent.mm.bz.a.fromDPToPix(paramViewGroup.qkY.getContext(), 1), this.yod.yTx.getMMResources().getColor(2131689485));
      }
      label843: if (paramViewGroup.iVh != null)
        paramViewGroup.iVh.setTag(Long.valueOf(localbi.field_msgId));
      if (this.yNq)
      {
        if (!localbi.isSystem())
          break label1260;
        paramInt = 0;
        label882: if (paramInt != 0);
      }
      else
      {
        if (!this.yNr)
          break label1265;
      }
      if (paramViewGroup.moo != null)
        paramViewGroup.moo.setChecked(this.yNn.contains(Long.valueOf(localbi.field_msgId)));
      if (paramViewGroup.iVh != null)
        paramViewGroup.iVh.setOnClickListener(this.yNg);
      paramViewGroup.qy(true);
    }
    while (true)
    {
      localObject = this.yNp.entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramViewGroup = (Map.Entry)((Iterator)localObject).next();
        if ((paramViewGroup.getValue() != null) && ((View)((WeakReference)paramViewGroup.getValue()).get() == paramView))
        {
          this.yNp.remove(paramViewGroup.getKey());
          this.yNo.remove(paramViewGroup.getKey());
        }
      }
      this.yNp.put(Long.valueOf(localbi.field_msgId), new WeakReference(paramView));
      if (localbi.drE())
        this.yNo.put(Long.valueOf(localbi.field_msgId), Integer.valueOf(localbi.field_isSend));
      AppMethodBeat.o(31104);
      return paramView;
      i = 0;
      break;
      label1116: j = 0;
      break label227;
      label1122: this.yNl.put(paramInt, 1);
      break label246;
      label1134: i = 0;
      break label295;
      label1140: j = 0;
      break label311;
      label1146: k = paramViewGroup.fLV;
      break label358;
      label1155: paramViewGroup = (com.tencent.mm.ui.chatting.viewitems.c.a)paramView.getTag();
      paramViewGroup.setChattingBG(bool);
      break label410;
      label1172: paramViewGroup.enf.setVisibility(8);
      break label522;
      label1184: paramViewGroup.zbx.setVisibility(8);
      break label542;
      label1196: paramViewGroup.enf.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
      break label681;
      label1210: paramViewGroup.enf.setBackgroundResource(2130838199);
      break label707;
      label1223: paramViewGroup.enf.setBackgroundColor(0);
      break label730;
      label1234: paramViewGroup.qkY.setTextColor(((com.tencent.mm.pluginsdk.ui.e)localObject).vgW);
      paramViewGroup.qkY.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
      break label843;
      label1260: paramInt = 1;
      break label882;
      label1265: paramViewGroup.qy(false);
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(31103);
    int i = az.dHt();
    AppMethodBeat.o(31103);
    return i;
  }

  public final boolean isInEditMode()
  {
    return this.yNq;
  }

  public final boolean nf(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(31111);
    int i;
    label64: Object localObject;
    if (this.yNn.contains(Long.valueOf(paramLong)))
    {
      ab.d("MicroMsg.ChattingDataAdapter", "remove select item, msgId = %d", new Object[] { Long.valueOf(paramLong) });
      this.yNn.remove(Long.valueOf(paramLong));
      if (this.mListView == null)
        break label300;
      i = 0;
      if (i >= this.mListView.getChildCount())
        break label300;
      localObject = this.mListView.getChildAt(i);
      com.tencent.mm.ui.chatting.viewitems.c.a locala = (com.tencent.mm.ui.chatting.viewitems.c.a)((View)localObject).getTag();
      if ((locala == null) || (locala.iVh == null) || (((Long)locala.iVh.getTag()).longValue() != paramLong))
        break label294;
      label129: if (localObject == null)
        break label306;
      localObject = (com.tencent.mm.ui.chatting.viewitems.c.a)((View)localObject).getTag();
      if ((((com.tencent.mm.ui.chatting.viewitems.c.a)localObject).moo != null) && (((com.tencent.mm.ui.chatting.viewitems.c.a)localObject).moo.getVisibility() == 0))
        ((com.tencent.mm.ui.chatting.viewitems.c.a)localObject).moo.setChecked(this.yNn.contains(Long.valueOf(paramLong)));
    }
    while (true)
    {
      AppMethodBeat.o(31111);
      bool = true;
      while (true)
      {
        return bool;
        ab.d("MicroMsg.ChattingDataAdapter", "add select item, msgId = %d", new Object[] { Long.valueOf(paramLong) });
        if (this.yNn.size() < 100)
          break;
        com.tencent.mm.ui.base.h.b(this.yod.yTx.getContext(), this.yod.yTx.getMMResources().getString(2131299244, new Object[] { Integer.valueOf(100) }), "", true);
        AppMethodBeat.o(31111);
      }
      this.yNn.add(Long.valueOf(paramLong));
      break;
      label294: i++;
      break label64;
      label300: localObject = null;
      break label129;
      label306: notifyDataSetChanged();
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(31116);
    super.notifyDataSetChanged();
    this.yNl.clear();
    AppMethodBeat.o(31116);
  }

  public final void o(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(31123);
    if ((!this.yNp.containsKey(Long.valueOf(paramLong))) || (!this.yNo.containsKey(Long.valueOf(paramLong))))
    {
      ab.d("MicroMsg.ChattingDataAdapter", "msg not display, ".concat(String.valueOf(paramLong)));
      AppMethodBeat.o(31123);
      return;
    }
    Object localObject = (WeakReference)this.yNp.get(Long.valueOf(paramLong));
    if (localObject != null);
    for (localObject = (View)((WeakReference)localObject).get(); ; localObject = null)
    {
      if (localObject != null)
        ad.b.a((com.tencent.mm.ui.chatting.viewitems.c.a)((View)localObject).getTag(), paramInt1, paramInt2);
      AppMethodBeat.o(31123);
      break;
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(31107);
    this.ceU = false;
    aw.ZK();
    com.tencent.mm.model.c.XO().a(this.yNw);
    j.b(this.yGy);
    ab.i("MicroMsg.ChattingDataAdapter", "adapter pause");
    this.yNs.stopTimer();
    AppMethodBeat.o(31107);
  }

  public final void resume()
  {
    AppMethodBeat.i(31106);
    this.ceU = true;
    ab.i("MicroMsg.ChattingDataAdapter", "adapter resume");
    aw.ZK();
    com.tencent.mm.model.c.XO().a(this.yNw, Looper.getMainLooper());
    j.a(this.yGy);
    this.yNs.ae(300000L, 300000L);
    if (this.yNt != null)
      this.yNt.a(d.a.yYu, false, null);
    AppMethodBeat.o(31106);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.a
 * JD-Core Version:    0.6.2
 */