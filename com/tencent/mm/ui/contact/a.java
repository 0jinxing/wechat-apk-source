package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.m;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bq;
import com.tencent.mm.ui.AddressView;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.chatting.view.AvatarImageView;
import com.tencent.mm.ui.f.b;
import com.tencent.mm.ui.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class a extends com.tencent.mm.ui.f<String, com.tencent.mm.storage.f>
  implements n.b
{
  public static final ColorStateList nIp;
  public static final ColorStateList nIq;
  protected List<String> elZ;
  private WeakReference<Context> gWO;
  private String gtX;
  private com.tencent.mm.ui.applet.b gvm;
  protected MMSlideDelView.g jJO;
  protected MMSlideDelView.c jJP;
  protected MMSlideDelView.d jJR;
  private boolean jLC;
  View.OnClickListener mjE;
  protected MMSlideDelView.f oQS;
  StringBuilder sb;
  private int type;
  private String[] yDL;
  private List<String> zjA;
  private int zjB;
  protected int[] zjC;
  String[] zjD;
  protected AddressUI.AddressUIFragment zjE;
  private Set<Integer> zjF;
  private int zjG;
  private boolean zjH;
  a.a zjI;
  private boolean zjJ;
  boolean zjK;
  private String zjL;
  LinkedList<View> zjM;
  boolean zjN;
  HashMap<View, ViewStub> zjO;
  private SparseArray<String> zjP;
  private SparseArray<Integer> zjQ;
  private HashSet<String> zjR;
  public HashMap<String, com.tencent.mm.storage.f> zjw;
  protected String zjx;
  protected String zjy;
  private List<Object> zjz;

  static
  {
    AppMethodBeat.i(33482);
    nIp = com.tencent.mm.bz.a.h(com.tencent.mm.sdk.platformtools.ah.getContext(), 2131690750);
    nIq = com.tencent.mm.bz.a.h(com.tencent.mm.sdk.platformtools.ah.getContext(), 2131690164);
    AppMethodBeat.o(33482);
  }

  public a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    super(paramContext);
    AppMethodBeat.i(33461);
    this.zjx = null;
    this.zjy = null;
    this.elZ = null;
    this.zjB = 0;
    this.gtX = "";
    this.yDL = null;
    this.jJR = MMSlideDelView.getItemStatusCallBack();
    this.zjF = new HashSet();
    this.zjG = 0;
    this.zjH = true;
    this.gvm = null;
    this.jLC = false;
    this.zjJ = false;
    this.zjK = false;
    this.zjM = new LinkedList();
    this.zjO = new HashMap();
    this.mjE = new a.2(this);
    this.sb = new StringBuilder(32);
    this.zjP = new SparseArray();
    this.zjQ = new SparseArray();
    this.zjR = new HashSet();
    this.zjw = new HashMap();
    this.gWO = new WeakReference(paramContext);
    this.context = com.tencent.mm.sdk.platformtools.ah.getContext();
    this.zjx = paramString1;
    this.zjy = paramString2;
    this.type = paramInt;
    this.zjJ = true;
    this.zjz = new LinkedList();
    this.zjA = new LinkedList();
    this.zjL = r.Yz();
    this.TAG = "MiscroMsg.AddressDrawWithCacheAdapter";
    AppMethodBeat.o(33461);
  }

  private boolean dHu()
  {
    AppMethodBeat.i(33464);
    boolean bool;
    if ((this.zjx.equals("@micromsg.qq.com")) || (this.zjx.equals("@all.contact.without.chatroom")) || (this.zjx.equals("@all.contact.without.chatroom.without.openim")))
    {
      bool = true;
      AppMethodBeat.o(33464);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33464);
    }
  }

  private String getString(int paramInt)
  {
    AppMethodBeat.i(33473);
    String str1 = (String)this.zjP.get(paramInt);
    String str2 = str1;
    if (str1 == null)
    {
      str2 = this.context.getString(paramInt);
      this.zjP.put(paramInt, str2);
    }
    AppMethodBeat.o(33473);
    return str2;
  }

  private static void t(Cursor paramCursor)
  {
    AppMethodBeat.i(33479);
    if ((paramCursor instanceof com.tencent.mm.cd.a.e))
    {
      ArrayList localArrayList = new ArrayList();
      com.tencent.mm.cd.a.d locald = ((com.tencent.mm.cd.a.e)paramCursor).ycs[0];
      int i = locald.getPosition();
      if (locald != null)
      {
        while (locald.moveToNext())
        {
          paramCursor = new com.tencent.mm.storage.f();
          paramCursor.d(locald);
          localArrayList.add(paramCursor.field_username);
          ab.d("MicroMsg.AddressAdapter", "mStarUserList add %s %s", new Object[] { paramCursor.field_username, paramCursor.field_conRemark });
        }
        locald.moveToPosition(i);
      }
      ((com.tencent.mm.plugin.story.api.e)g.M(com.tencent.mm.plugin.story.api.e.class)).getFavourUserChecker().dE(localArrayList);
    }
    AppMethodBeat.o(33479);
  }

  protected int a(com.tencent.mm.storage.f paramf, int paramInt)
  {
    AppMethodBeat.i(33470);
    if (paramInt < this.zjG)
    {
      paramInt = 32;
      AppMethodBeat.o(33470);
    }
    while (true)
    {
      return paramInt;
      if (paramf == null)
      {
        ab.e("MicroMsg.AddressAdapter", "contact is null, position:%d", new Object[] { Integer.valueOf(paramInt) });
        paramInt = -1;
        AppMethodBeat.o(33470);
      }
      else
      {
        paramInt = paramf.field_showHead;
        AppMethodBeat.o(33470);
      }
    }
  }

  public void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(33478);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.d("MicroMsg.AddressAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(33478);
    }
    while (true)
    {
      return;
      aw.ZK();
      if (paramn == c.XM())
      {
        if ((!t.mX((String)paramObject)) && (!this.zjR.contains((String)paramObject)))
        {
          super.j((String)paramObject, 2);
          if ((this.zjK) && (this.zjE != null))
          {
            this.zjE.zks = true;
            ab.d("MicroMsg.AddressAdapter", "ADDRESS onNotifyChange");
            AppMethodBeat.o(33478);
          }
        }
        else
        {
          ab.d("MicroMsg.AddressAdapter", "newcursor is stranger ，return");
        }
      }
      else
        AppMethodBeat.o(33478);
    }
  }

  protected void a(com.tencent.mm.storage.f paramf, a.b paramb)
  {
    AppMethodBeat.i(33469);
    try
    {
      paramb.zjV.setText(null);
      paramb.zjV.setVisibility(8);
      if (ad.aox(paramf.field_username))
      {
        String str = paramf.field_descWordingId;
        paramf = ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).ba(paramf.field_openImAppid, str);
        if ((paramf != null) && (paramf.length() > 0))
        {
          paramb.zjV.setVisibility(0);
          paramb.zjV.setText(paramf);
        }
      }
      AppMethodBeat.o(33469);
      return;
    }
    catch (Throwable paramf)
    {
      while (true)
        AppMethodBeat.o(33469);
    }
  }

  public final void a(MMSlideDelView.f paramf)
  {
    this.oQS = paramf;
  }

  public final SparseArray<String>[] a(HashSet<f.b<String, com.tencent.mm.storage.f>> paramHashSet, SparseArray<String>[] paramArrayOfSparseArray)
  {
    AppMethodBeat.i(33476);
    paramHashSet = new SparseArray[paramArrayOfSparseArray.length];
    paramArrayOfSparseArray = new LinkedList();
    paramArrayOfSparseArray.add("weixin");
    long l = System.currentTimeMillis();
    aw.ZK();
    paramArrayOfSparseArray = c.XM().b(this.zjx, this.zjy, this.elZ, paramArrayOfSparseArray, dHu(), this.zjJ);
    int j;
    if ((paramArrayOfSparseArray instanceof com.tencent.mm.cd.a.e))
    {
      com.tencent.mm.cd.a.d[] arrayOfd = ((com.tencent.mm.cd.a.e)paramArrayOfSparseArray).ycs;
      int i = arrayOfd.length;
      for (j = 0; j < i; j++)
      {
        arrayOfd[j].MH(5000);
        paramHashSet[j] = new SparseArray();
        for (int k = 0; arrayOfd[j].moveToNext(); k++)
          paramHashSet[j].put(k, arrayOfd[j].getString(0));
      }
      this.zjG = arrayOfd[0].getCount();
    }
    while (true)
    {
      paramArrayOfSparseArray.close();
      ab.d("MicroMsg.AddressAdapter", "refreshPosistion last :" + (System.currentTimeMillis() - l));
      AppMethodBeat.o(33476);
      return paramHashSet;
      paramHashSet[0] = new SparseArray();
      for (j = 0; paramArrayOfSparseArray.moveToNext(); j++)
        paramHashSet[0].put(j, paramArrayOfSparseArray.getString(0));
    }
  }

  public final ArrayList<com.tencent.mm.storage.f> ao(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(33475);
    long l = System.currentTimeMillis();
    Object localObject = new ArrayList();
    for (int i = 0; i < paramArrayList.size(); i++)
      ((List)localObject).add((String)paramArrayList.get(i));
    paramArrayList = new ArrayList(((List)localObject).size());
    aw.ZK();
    Cursor localCursor = c.XM().ev((List)localObject);
    while (localCursor.moveToNext())
    {
      localObject = new com.tencent.mm.storage.f();
      ((com.tencent.mm.storage.f)localObject).d(localCursor);
      paramArrayList.add(localObject);
    }
    localCursor.close();
    ab.d("MicroMsg.AddressAdapter", "rebulidAllChangeData :" + (System.currentTimeMillis() - l));
    AppMethodBeat.o(33475);
    return paramArrayList;
  }

  protected String b(com.tencent.mm.storage.f paramf, int paramInt)
  {
    AppMethodBeat.i(33471);
    if (paramInt < this.zjG)
    {
      paramf = getString(2131296455);
      AppMethodBeat.o(33471);
    }
    while (true)
    {
      return paramf;
      if (paramf.field_showHead == 31)
      {
        paramf = "";
        AppMethodBeat.o(33471);
      }
      else if (paramf.field_showHead == 123)
      {
        paramf = "#";
        AppMethodBeat.o(33471);
      }
      else if (paramf.field_showHead == 33)
      {
        paramf = getString(2131296436);
        AppMethodBeat.o(33471);
      }
      else if (paramf.field_showHead == 43)
      {
        paramf = getString(2131302552);
        AppMethodBeat.o(33471);
      }
      else if (paramf.field_showHead == 32)
      {
        paramf = getString(2131296455);
        AppMethodBeat.o(33471);
      }
      else
      {
        String str = (String)this.zjP.get(paramf.field_showHead);
        if (str != null)
        {
          AppMethodBeat.o(33471);
          paramf = str;
        }
        else
        {
          str = String.valueOf((char)paramf.field_showHead);
          this.zjP.put(paramf.field_showHead, str);
          AppMethodBeat.o(33471);
          paramf = str;
        }
      }
    }
  }

  protected Cursor dHv()
  {
    AppMethodBeat.i(33465);
    long l = System.currentTimeMillis();
    Object localObject = new LinkedList();
    ((LinkedList)localObject).add("weixin");
    aw.ZK();
    localObject = c.XM().a(this.zjx, this.zjy, this.elZ, (List)localObject, dHu(), this.zjJ);
    t((Cursor)localObject);
    ab.d("MicroMsg.AddressAdapter", "kevin setCursor : " + (System.currentTimeMillis() - l));
    AppMethodBeat.o(33465);
    return localObject;
  }

  protected final void dHw()
  {
    AppMethodBeat.i(33466);
    int i = getCount();
    if (i == 0)
      AppMethodBeat.o(33466);
    while (true)
    {
      return;
      this.zjG = dwy();
      if (this.yDL != null)
      {
        this.zjC = t.a(this.zjx, this.zjy, this.elZ, this.yDL);
        this.zjD = t.a(this.zjx, this.zjy, this.yDL, this.elZ);
      }
      while (true)
      {
        this.zjF.clear();
        if (this.zjC == null)
          break;
        for (i : this.zjC)
          this.zjF.add(Integer.valueOf(i - 1));
        long l;
        if (dvr())
        {
          l = System.currentTimeMillis();
          ??? = new HashSet();
          this.zjC = new int[30];
          this.zjD = new String[30];
          ??? = this.zjG;
          ??? = 0;
          if (??? < i)
          {
            Object localObject2 = (com.tencent.mm.storage.f)MG(???);
            if (localObject2 != null)
            {
              localObject2 = b((com.tencent.mm.storage.f)localObject2, ???);
              if (!((HashSet)???).add(localObject2))
                break label266;
              this.zjC[???] = (??? - this.zjG);
              this.zjD[???] = localObject2;
              ???++;
            }
            label266: 
            while (true)
            {
              ???++;
              break;
              ab.d("MicroMsg.AddressAdapter", "newCursor getItem is null");
            }
          }
          ab.d("MicroMsg.AddressAdapter", "newCursor resetShowHead by Memory : " + (System.currentTimeMillis() - l) + "favourCount : " + this.zjG);
        }
        else
        {
          l = System.currentTimeMillis();
          this.zjC = t.a(this.zjx, this.zjy, this.elZ, this.gtX);
          this.zjD = t.a(this.zjx, this.zjy, this.gtX, this.elZ);
          ab.d("MicroMsg.AddressAdapter", "kevin resetShowHead part1 : " + (System.currentTimeMillis() - l));
        }
      }
      AppMethodBeat.o(33466);
    }
  }

  public final void dHx()
  {
    AppMethodBeat.i(33467);
    this.jJR.bIq();
    AppMethodBeat.o(33467);
  }

  public final void dHy()
  {
    AppMethodBeat.i(33477);
    super.j(null, 1);
    AppMethodBeat.o(33477);
  }

  public final void detach()
  {
    AppMethodBeat.i(33462);
    if (this.gvm != null)
    {
      this.gvm.detach();
      this.gvm = null;
    }
    AppMethodBeat.o(33462);
  }

  public final com.tencent.mm.cd.a.d<String> dwz()
  {
    AppMethodBeat.i(33474);
    com.tencent.mm.cd.a.d locald = (com.tencent.mm.cd.a.d)dHv();
    AppMethodBeat.o(33474);
    return locald;
  }

  public final void eE(String paramString, int paramInt)
  {
    AppMethodBeat.i(33458);
    if (paramInt == 5)
      this.zjR.add(paramString);
    super.j(paramString, paramInt);
    AppMethodBeat.o(33458);
  }

  public final void fl(List<String> paramList)
  {
    AppMethodBeat.i(33463);
    if (this.type != 2)
      paramList.add(r.Yz());
    aw.ZK();
    Object localObject = c.XU().RA("@t.qq.com");
    if (localObject != null)
      paramList.add(((bq)localObject).name);
    if ((this.type == 3) || (this.type == 5) || (this.type == 4) || (this.type == 1) || (this.type == 0))
    {
      localObject = t.Zh().iterator();
      while (((Iterator)localObject).hasNext())
        paramList.add((String)((Iterator)localObject).next());
    }
    paramList.add("blogapp");
    this.elZ = paramList;
    AppMethodBeat.o(33463);
  }

  public int getCount()
  {
    AppMethodBeat.i(33472);
    int i = super.getCount();
    AppMethodBeat.o(33472);
    return i;
  }

  public final int getPositionForSection(int paramInt)
  {
    int i = paramInt;
    if (this.zjC != null)
    {
      i = paramInt;
      if (paramInt >= 0)
      {
        i = paramInt;
        if (paramInt < this.zjC.length)
          i = this.zjC[paramInt];
      }
    }
    return this.zjG + i;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(33468);
    paramViewGroup = (Context)this.gWO.get();
    if (paramViewGroup == null)
    {
      AppMethodBeat.o(33468);
      return paramView;
    }
    int i;
    if (!this.zjN)
    {
      for (i = 0; i < 8; i++)
        this.zjM.add(v.hu(paramViewGroup).inflate(2130968642, null));
      this.zjN = true;
    }
    com.tencent.mm.storage.f localf = (com.tencent.mm.storage.f)MG(paramInt);
    label119: a.b localb;
    label332: Object localObject;
    if (paramView == null)
      if (this.zjM.size() > 0)
      {
        paramView = (View)this.zjM.getFirst();
        this.zjM.removeFirst();
        localb = new a.b();
        localb.nBN = ((TextView)paramView.findViewById(2131821069));
        localb.nBO = ((TextView)paramView.findViewById(2131821075));
        localb.nIu = ((AddressView)paramView.findViewById(2131821089));
        localb.eks = ((ImageView)paramView.findViewById(2131821088));
        localb.zjT = ((TextView)paramView.findViewById(2131821086));
        localb.zjU = paramView.findViewById(2131821085);
        localb.zjV = ((TextView)paramView.findViewById(2131821087));
        localb.zjW = ((CategoryTipView)paramView.findViewById(2131821084));
        localb.zjX = ((ViewGroup)paramView.findViewById(2131821083));
        paramViewGroup = localb.zjU.getLayoutParams();
        paramViewGroup.height = ((int)(com.tencent.mm.bz.a.am(this.context, 2131427553) * com.tencent.mm.bz.a.fZ(this.context)));
        localb.zjU.setLayoutParams(paramViewGroup);
        if (this.zjE != null)
          this.zjE.ein.a(localb.nIu);
        paramView.setTag(localb);
        paramViewGroup = paramView;
        if (localf != null)
        {
          aw.ZK();
          paramView = c.XM().aoO(localf.field_username);
          ab.d("MicroMsg.AddressAdapter", "user:%s, remark:%s", new Object[] { paramView.field_username, paramView.field_conRemark });
          localObject = (com.tencent.mm.storage.f)MG(paramInt - 1);
          paramView = (com.tencent.mm.storage.f)MG(paramInt + 1);
          if (localObject != null)
            break label954;
          i = -1;
          label413: int j = a(localf, paramInt);
          if (paramView != null)
            a(paramView, paramInt + 1);
          localb.zjW.setTag(Integer.valueOf(j));
          if ((!this.zjH) || (paramInt < 0) || (j == i))
            break label968;
          localObject = b(localf, paramInt);
          if (com.tencent.mm.platformtools.ah.isNullOrNil((String)localObject))
            break label968;
          localb.zjX.setVisibility(0);
          localb.nBN.setVisibility(0);
          localb.nBN.setText((CharSequence)localObject);
          localb.zjW.Pm(((com.tencent.mm.plugin.story.api.e)g.M(com.tencent.mm.plugin.story.api.e.class)).getFavourUserChecker().cwR());
          label538: localObject = b(localf, paramInt);
          if (paramView != null)
            break label1001;
          paramView = null;
          label553: paramInt = localb.zjU.getPaddingLeft();
          if ((localObject == null) || (((String)localObject).equals(paramView)))
            break label1013;
          localb.nIu.setBackground(null);
          localb.zjU.setBackgroundResource(2130839162);
          label596: localb.zjU.setPadding(paramInt, 0, 0, 0);
          com.tencent.mm.pluginsdk.ui.a.b.b(localb.eks, localf.field_username);
          if (localf.field_verifyFlag == 0)
            break label1060;
          if (ao.a.flw == null)
            break label1048;
          paramView = ao.a.flw.kz(localf.field_verifyFlag);
          if (paramView == null)
            break label1036;
          paramView = m.rk(paramView);
          localb.nIu.setMaskBitmap(paramView);
          label667: localb.nIu.updateTextColors();
          paramView = localf.xHQ;
          if (paramView != null)
            break label1224;
        }
      }
    while (true)
    {
      try
      {
        if (ad.aox(localf.field_username))
        {
          paramView = ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).e(com.tencent.mm.sdk.platformtools.ah.getContext(), localf.Oj(), com.tencent.mm.bz.a.al(this.context, 2131427813));
          localObject = paramView;
          if (paramView == null)
            localObject = "";
          localb.nIu.setName((CharSequence)localObject);
          localb.nIu.setDescription(com.tencent.mm.platformtools.ah.nullAsNil(localf.field_remarkDesc));
          a(localf, localb);
          com.tencent.mm.plugin.sns.ui.e.a.b(0, (String)localb.eks.getTag(), (AvatarImageView)localb.eks);
          ((AvatarImageView)localb.eks).dk(localf.field_username, 0);
          ((AvatarImageView)localb.eks).setTag(localf.field_username);
          com.tencent.mm.plugin.sns.ui.e.a.a(0, localf.field_username, (AvatarImageView)localb.eks);
          ((AvatarImageView)localb.eks).setShowStoryHint(com.tencent.mm.plugin.sns.e.a.Xt(localf.field_username));
          localb.nIu.updatePositionFlag();
          localObject = localb.nIu;
          if (localb.nIu.getNickName() != null)
            break label1236;
          paramView = "";
          ((AddressView)localObject).setContentDescription(paramView);
          localb.eks.setOnClickListener(new a.1(this));
          AppMethodBeat.o(33468);
          paramView = paramViewGroup;
          break;
          paramView = View.inflate(paramViewGroup, 2130968642, null);
          break label119;
          localb = (a.b)paramView.getTag();
          paramViewGroup = paramView;
          break label332;
          label954: i = a((com.tencent.mm.storage.f)localObject, paramInt - 1);
          break label413;
          label968: localb.zjX.setVisibility(8);
          localb.nBN.setVisibility(8);
          localb.zjW.setVisibility(8);
          break label538;
          label1001: paramView = b(paramView, paramInt + 1);
          break label553;
          label1013: localb.nIu.setBackgroundResource(2130839162);
          localb.zjU.setBackground(null);
          break label596;
          label1036: localb.nIu.setMaskBitmap(null);
          break label667;
          label1048: localb.nIu.setMaskBitmap(null);
          break label667;
          label1060: localb.nIu.setMaskBitmap(null);
          break label667;
        }
        Context localContext = this.context;
        paramView = localf.Oj();
        localObject = localf.field_username;
        if ((paramView != null) && (paramView.length() > 0))
        {
          localObject = paramView;
          if ("".length() > 0)
          {
            localObject = paramView;
            if (!"".equals(paramView))
            {
              this.sb.append(paramView);
              this.sb.append("(");
              this.sb.append("");
              this.sb.append(")");
              localObject = this.sb.toString();
              this.sb.delete(0, this.sb.length());
            }
          }
          paramView = j.b(localContext, (CharSequence)localObject, com.tencent.mm.bz.a.al(this.context, 2131427813));
          continue;
        }
        paramView = (View)localObject;
        continue;
      }
      catch (Exception paramView)
      {
        paramView = null;
        continue;
      }
      label1224: localb.nIu.setName(paramView);
      continue;
      label1236: paramView = localb.nIu.getNickName().toString();
    }
  }

  public void notifyDataSetChanged()
  {
    AppMethodBeat.i(33460);
    this.zjL = r.Yz();
    if (this.zjC == null)
      dHw();
    if (getCount() == 0)
    {
      super.notifyDataSetChanged();
      AppMethodBeat.o(33460);
    }
    while (true)
    {
      return;
      this.zjG = dwy();
      ab.i("MicroMsg.AddressAdapter", "newcursor favourCount %d", new Object[] { Integer.valueOf(this.zjG) });
      super.notifyDataSetChanged();
      AppMethodBeat.o(33460);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(33459);
    this.zjR.clear();
    super.pause();
    AppMethodBeat.o(33459);
  }

  public final void setFragment(Fragment paramFragment)
  {
    this.zjE = ((AddressUI.AddressUIFragment)paramFragment);
  }

  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.jJP = paramc;
  }

  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.jJO = paramg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a
 * JD-Core Version:    0.6.2
 */