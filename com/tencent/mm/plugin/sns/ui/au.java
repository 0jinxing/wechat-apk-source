package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.ScaleAnimation;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.plugin.sns.ui.item.a.a;
import com.tencent.mm.plugin.sns.ui.item.c.a;
import com.tencent.mm.plugin.sns.ui.item.g.a;
import com.tencent.mm.plugin.sns.ui.item.h.a;
import com.tencent.mm.plugin.sns.ui.item.i.b;
import com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;

public final class au
  implements x
{
  public com.tencent.mm.ui.tools.j contextMenuHelper;
  public MMActivity crP;
  private ListView gKd;
  com.tencent.mm.sdk.b.c hAA;
  protected ak handler;
  public com.tencent.mm.ui.widget.b.a jMO;
  public com.tencent.mm.plugin.sns.ui.d.b qOL;
  protected int requestType;
  protected HashMap<String, Integer> rhW;
  public View.OnTouchListener riQ;
  protected ScaleAnimation rpR;
  protected ScaleAnimation rpS;
  public aq rpY;
  public boolean rps;
  com.tencent.mm.sdk.b.c rqA;
  private int rqb;
  public j rqd;
  public bc rqg;
  com.tencent.mm.sdk.b.c rqy;
  com.tencent.mm.sdk.b.c rqz;
  protected w rxO;
  public i rxP;
  protected LinkedList<SnsCommentCollapseLayout> rxQ;
  public HashMap<Integer, WeakReference<View>> rxR;
  View rxS;
  public int rxT;
  int rxU;
  protected HashMap<Integer, View> rxV;
  public HashMap<String, String> rxW;
  private HashMap<Integer, Class<? extends BaseTimeLineItem.BaseViewHolder>> rxX;
  public View.OnClickListener rxY;
  public View.OnClickListener rxZ;
  public View.OnClickListener rya;
  private HashMap<String, Boolean> ryb;
  private au.c ryc;

  public au(MMActivity paramMMActivity, ListView paramListView, com.tencent.mm.plugin.sns.ui.d.b paramb, i parami, w paramw)
  {
    AppMethodBeat.i(39422);
    this.rxQ = new LinkedList();
    this.rxR = new HashMap();
    this.rps = false;
    this.rqb = 0;
    this.rxT = -1;
    this.rxU = 0;
    this.rhW = new HashMap();
    this.rxV = new HashMap();
    this.requestType = 0;
    this.handler = new ak();
    this.rxW = new HashMap();
    this.rqz = new au.1(this);
    this.rqy = new au.3(this);
    this.rqA = new au.4(this);
    this.rxX = new HashMap();
    this.rxX.put(Integer.valueOf(6), h.a.class);
    this.rxX.put(Integer.valueOf(2), g.a.class);
    this.rxX.put(Integer.valueOf(3), g.a.class);
    this.rxX.put(Integer.valueOf(4), g.a.class);
    this.rxX.put(Integer.valueOf(5), g.a.class);
    this.rxX.put(Integer.valueOf(0), g.a.class);
    this.rxX.put(Integer.valueOf(1), g.a.class);
    this.rxX.put(Integer.valueOf(7), g.a.class);
    this.rxX.put(Integer.valueOf(8), g.a.class);
    this.rxX.put(Integer.valueOf(9), g.a.class);
    this.rxX.put(Integer.valueOf(11), i.b.class);
    this.rxX.put(Integer.valueOf(13), a.a.class);
    this.rxX.put(Integer.valueOf(14), c.a.class);
    this.rxX.put(Integer.valueOf(10), g.a.class);
    this.rxX.put(Integer.valueOf(12), g.a.class);
    this.rxY = new au.5(this);
    this.rxZ = new au.6(this);
    this.rya = new au.7(this);
    this.riQ = bo.dpE();
    this.ryb = new HashMap();
    this.ryc = new au.c();
    this.hAA = new au.2(this);
    this.rxO = paramw;
    this.rxP = parami;
    ab.d("MicroMsg.SnsTimeLineBaseAdapter", "SnsTimeLineAdapter 2");
    this.gKd = paramListView;
    af.cnC();
    this.crP = paramMMActivity;
    this.qOL = paramb;
    this.contextMenuHelper = new com.tencent.mm.ui.tools.j(paramMMActivity);
    this.jMO = new com.tencent.mm.ui.widget.b.a(paramMMActivity);
    this.rpY = new aq(paramMMActivity);
    this.rpR = new ScaleAnimation(0.0F, 1.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.rpR.setDuration(150L);
    this.rpS = new ScaleAnimation(1.0F, 0.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.rpS.setDuration(150L);
    this.rqd = new j(paramMMActivity, 0, parami.rhn);
    this.requestType = 10;
    this.rqg = new bc(paramMMActivity, new au.8(this, paramw), 0, parami.rhn);
    com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
    AppMethodBeat.o(39422);
  }

  public static int E(n paramn)
  {
    AppMethodBeat.i(138386);
    int i = b(paramn, true);
    AppMethodBeat.o(138386);
    return i;
  }

  public static String ZI(String paramString)
  {
    AppMethodBeat.i(39428);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(39428);
    while (true)
    {
      return paramString;
      int i = paramString.indexOf("://");
      String str = paramString;
      if (i != -1)
        str = paramString.substring(i + 3);
      i = str.indexOf("/");
      paramString = str;
      if (i != -1)
        paramString = str.substring(0, i);
      AppMethodBeat.o(39428);
    }
  }

  public static String ZJ(String paramString)
  {
    AppMethodBeat.i(39430);
    ab.d("MicroMsg.SnsTimeLineBaseAdapter", "url:".concat(String.valueOf(paramString)));
    paramString = com.tencent.mm.plugin.sns.c.a.gkF.B(paramString, "timeline");
    AppMethodBeat.o(39430);
    return paramString;
  }

  public static String a(TimeLineObject paramTimeLineObject, Context paramContext)
  {
    AppMethodBeat.i(39429);
    paramTimeLineObject = com.tencent.mm.plugin.sns.c.a.gkF.f(paramContext, paramTimeLineObject.xfH.Id, "timeline");
    AppMethodBeat.o(39429);
    return paramTimeLineObject;
  }

  protected static int b(n paramn, boolean paramBoolean)
  {
    int i = 13;
    AppMethodBeat.i(39426);
    TimeLineObject localTimeLineObject = paramn.cqu();
    if (localTimeLineObject.xfI.wbJ == 1)
      if ((paramBoolean) && (localTimeLineObject.dtW == 1))
      {
        i = 12;
        AppMethodBeat.o(39426);
      }
    while (true)
    {
      return i;
      if ((paramn.DI(32)) && (paramn.cqo() != null))
      {
        if (paramn.cqo().coP())
        {
          AppMethodBeat.o(39426);
        }
        else if (paramn.coQ())
        {
          AppMethodBeat.o(39426);
          i = 14;
        }
      }
      else
      {
        i = localTimeLineObject.xfI.wbK.size();
        if (i <= 1)
        {
          i = 2;
          AppMethodBeat.o(39426);
        }
        else if (i <= 3)
        {
          AppMethodBeat.o(39426);
          i = 3;
        }
        else if (i <= 6)
        {
          i = 4;
          AppMethodBeat.o(39426);
        }
        else
        {
          i = 5;
          AppMethodBeat.o(39426);
          continue;
          switch (localTimeLineObject.xfI.wbJ)
          {
          default:
            AppMethodBeat.o(39426);
            i = 1;
            break;
          case 4:
            i = 0;
            AppMethodBeat.o(39426);
            break;
          case 5:
            if ((paramn.DI(32)) && (paramn.cqo() != null))
            {
              if (paramn.cqo().coP())
              {
                AppMethodBeat.o(39426);
              }
              else if (paramn.coQ())
              {
                AppMethodBeat.o(39426);
                i = 14;
              }
            }
            else
            {
              AppMethodBeat.o(39426);
              i = 1;
            }
            break;
          case 2:
            i = 6;
            AppMethodBeat.o(39426);
            break;
          case 8:
            AppMethodBeat.o(39426);
            i = 3;
            break;
          case 7:
            i = 2;
            AppMethodBeat.o(39426);
            break;
          case 14:
            i = 7;
            AppMethodBeat.o(39426);
            break;
          case 15:
            if ((paramBoolean) && (localTimeLineObject.xfP == 1))
            {
              i = 12;
              AppMethodBeat.o(39426);
            }
            else if ((paramn.DI(32)) && (paramn.cqo() != null))
            {
              if (paramn.cqo().coP())
              {
                AppMethodBeat.o(39426);
              }
              else if (paramn.coQ())
              {
                AppMethodBeat.o(39426);
                i = 14;
              }
            }
            else
            {
              i = 9;
              AppMethodBeat.o(39426);
            }
            break;
          case 21:
            i = 10;
            AppMethodBeat.o(39426);
            break;
          case 27:
            i = 11;
            AppMethodBeat.o(39426);
          }
        }
      }
    }
  }

  public final n DP(int paramInt)
  {
    AppMethodBeat.i(39433);
    n localn = this.rxO.DP(paramInt);
    AppMethodBeat.o(39433);
    return localn;
  }

  public final boolean DQ(int paramInt)
  {
    AppMethodBeat.i(39435);
    boolean bool;
    if ((paramInt < this.gKd.getFirstVisiblePosition() - 1) || (paramInt > this.gKd.getLastVisiblePosition() - 1))
    {
      bool = false;
      AppMethodBeat.o(39435);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(39435);
    }
  }

  public final void Z(Runnable paramRunnable)
  {
    AppMethodBeat.i(39431);
    this.rxO.crP();
    paramRunnable.run();
    AppMethodBeat.o(39431);
  }

  public final void a(SnsCommentCollapseLayout paramSnsCommentCollapseLayout)
  {
    AppMethodBeat.i(39418);
    this.rxQ.add(paramSnsCommentCollapseLayout);
    AppMethodBeat.o(39418);
  }

  public final void ctW()
  {
    AppMethodBeat.i(39416);
    this.rhW.clear();
    AppMethodBeat.o(39416);
  }

  public final t ctX()
  {
    if ((this.crP instanceof t));
    for (t localt = (t)this.crP; ; localt = null)
      return localt;
  }

  public final SnsCommentCollapseLayout ctY()
  {
    AppMethodBeat.i(39417);
    SnsCommentCollapseLayout localSnsCommentCollapseLayout;
    if (this.rxQ.size() == 0)
    {
      localSnsCommentCollapseLayout = new SnsCommentCollapseLayout(this.crP);
      AppMethodBeat.o(39417);
    }
    while (true)
    {
      return localSnsCommentCollapseLayout;
      localSnsCommentCollapseLayout = (SnsCommentCollapseLayout)this.rxQ.removeFirst();
      AppMethodBeat.o(39417);
    }
  }

  public final boolean ctZ()
  {
    AppMethodBeat.i(39419);
    if (this.rxQ != null)
      this.rxQ.clear();
    if (this.rxX != null)
      this.rxX.clear();
    com.tencent.mm.pluginsdk.ui.e.j.clearCache();
    com.tencent.mm.kiss.widget.textview.c.eNj.SN();
    AppMethodBeat.o(39419);
    return true;
  }

  public final void cua()
  {
    AppMethodBeat.i(39421);
    this.rxO.crP();
    AppMethodBeat.o(39421);
  }

  public final void cub()
  {
    AppMethodBeat.i(39423);
    int i = this.gKd.getFirstVisiblePosition() - this.gKd.getHeaderViewsCount();
    int j = this.gKd.getLastVisiblePosition() - this.gKd.getHeaderViewsCount();
    ab.i("MicroMsg.SnsTimeLineBaseAdapter", "reConverItem start ~ end" + i + " " + j);
    int k = this.rxO.getCount();
    if ((i <= j) && (i < k))
    {
      n localn = DP(i);
      Object localObject = (View)this.rxV.get(Integer.valueOf(i));
      if ((localObject == null) || (localn == null) || (((View)localObject).getTag() == null))
        ab.e("MicroMsg.SnsTimeLineBaseAdapter", " passe ".concat(String.valueOf(i)));
      while (true)
      {
        i++;
        break;
        localObject = (BaseTimeLineItem.BaseViewHolder)((View)localObject).getTag();
        ab.i("MicroMsg.SnsTimeLineBaseAdapter", "reConverItem " + i + " " + ((BaseTimeLineItem.BaseViewHolder)localObject).position);
        ((BaseTimeLineItem.BaseViewHolder)localObject).rIu.a((BaseTimeLineItem.BaseViewHolder)localObject, i, localn);
      }
    }
    AppMethodBeat.o(39423);
  }

  public final w cuc()
  {
    return this.rxO;
  }

  public final void dO(View paramView)
  {
    AppMethodBeat.i(39432);
    if (!(paramView.getTag() instanceof BaseTimeLineItem.BaseViewHolder))
      AppMethodBeat.o(39432);
    while (true)
    {
      return;
      ab.d("MicroMsg.SnsTimeLineBaseAdapter", "close comment v");
      if ((this.rxS != null) && (this.rxS.getVisibility() == 0))
      {
        this.rxS.startAnimation(this.rpS);
        this.rpS.setAnimationListener(new au.10(this));
      }
      AppMethodBeat.o(39432);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(39434);
    int i = this.rxO.getCount();
    AppMethodBeat.o(39434);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(39425);
    paramInt = b(this.rxO.DP(paramInt), true);
    AppMethodBeat.o(39425);
    return paramInt;
  }

  // ERROR //
  public final View h(int paramInt, View paramView)
  {
    // Byte code:
    //   0: ldc_w 625
    //   3: invokestatic 87	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 192	com/tencent/mm/plugin/sns/ui/au:rxO	Lcom/tencent/mm/plugin/sns/ui/w;
    //   10: iload_1
    //   11: invokeinterface 474 2 0
    //   16: astore_3
    //   17: aload_3
    //   18: invokevirtual 409	com/tencent/mm/plugin/sns/storage/n:cqu	()Lcom/tencent/mm/protocal/protobuf/TimeLineObject;
    //   21: astore 4
    //   23: aload_3
    //   24: iconst_1
    //   25: invokestatic 294	com/tencent/mm/plugin/sns/ui/au:b	(Lcom/tencent/mm/plugin/sns/storage/n;Z)I
    //   28: istore 5
    //   30: aconst_null
    //   31: astore 6
    //   33: aconst_null
    //   34: astore 7
    //   36: aload 6
    //   38: astore 8
    //   40: aload 7
    //   42: astore 9
    //   44: aload_2
    //   45: ifnull +61 -> 106
    //   48: aload_2
    //   49: ldc_w 626
    //   52: invokevirtual 629	android/view/View:getTag	(I)Ljava/lang/Object;
    //   55: astore 9
    //   57: aload 9
    //   59: instanceof 139
    //   62: ifeq +357 -> 419
    //   65: aload 9
    //   67: checkcast 139	java/lang/Integer
    //   70: invokevirtual 632	java/lang/Integer:intValue	()I
    //   73: istore 10
    //   75: aload 6
    //   77: astore 8
    //   79: aload 7
    //   81: astore 9
    //   83: iload 10
    //   85: iload 5
    //   87: if_icmpne +19 -> 106
    //   90: aload_2
    //   91: invokevirtual 571	android/view/View:getTag	()Ljava/lang/Object;
    //   94: checkcast 579	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder
    //   97: astore 9
    //   99: aload 9
    //   101: getfield 588	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder:rIu	Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem;
    //   104: astore 8
    //   106: aload 9
    //   108: astore 6
    //   110: aload_2
    //   111: astore 7
    //   113: aload 9
    //   115: ifnonnull +197 -> 312
    //   118: iload 5
    //   120: tableswitch	default:+76 -> 196, 0:+365->485, 1:+377->497, 2:+317->437, 3:+329->449, 4:+341->461, 5:+353->473, 6:+305->425, 7:+389->509, 8:+401->521, 9:+413->533, 10:+425->545, 11:+437->557, 12:+449->569, 13:+461->581, 14:+473->593
    //   197: iconst_m1
    //   198: ishr
    //   199: dup
    //   200: invokespecial 635	com/tencent/mm/plugin/sns/ui/item/f:<init>	()V
    //   203: astore 7
    //   205: aload_0
    //   206: getfield 137	com/tencent/mm/plugin/sns/ui/au:rxX	Ljava/util/HashMap;
    //   209: iload 5
    //   211: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   214: invokevirtual 392	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   217: ifnull +388 -> 605
    //   220: aload_0
    //   221: getfield 137	com/tencent/mm/plugin/sns/ui/au:rxX	Ljava/util/HashMap;
    //   224: iload 5
    //   226: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   229: invokevirtual 392	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   232: checkcast 637	java/lang/Class
    //   235: invokevirtual 640	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   238: checkcast 579	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder
    //   241: astore 6
    //   243: aload 6
    //   245: astore 9
    //   247: aload_2
    //   248: astore 6
    //   250: aload 9
    //   252: aload 7
    //   254: putfield 588	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder:rIu	Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem;
    //   257: aload_2
    //   258: astore 6
    //   260: aload 9
    //   262: aload 4
    //   264: putfield 644	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder:timeLineObject	Lcom/tencent/mm/protocal/protobuf/TimeLineObject;
    //   267: aload_2
    //   268: astore 6
    //   270: aload 7
    //   272: aload_0
    //   273: getfield 214	com/tencent/mm/plugin/sns/ui/au:crP	Lcom/tencent/mm/ui/MMActivity;
    //   276: aload 9
    //   278: iload 5
    //   280: aload_0
    //   281: aload_3
    //   282: invokevirtual 647	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem:a	(Landroid/app/Activity;Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/au;Lcom/tencent/mm/plugin/sns/storage/n;)Landroid/view/View;
    //   285: astore_2
    //   286: aload_2
    //   287: astore 6
    //   289: aload_2
    //   290: ldc_w 626
    //   293: iload 5
    //   295: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   298: invokevirtual 651	android/view/View:setTag	(ILjava/lang/Object;)V
    //   301: aload 7
    //   303: astore 8
    //   305: aload_2
    //   306: astore 7
    //   308: aload 9
    //   310: astore 6
    //   312: aload 8
    //   314: aload_0
    //   315: getfield 99	com/tencent/mm/plugin/sns/ui/au:rps	Z
    //   318: invokevirtual 655	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem:setIsFromMainTimeline	(Z)V
    //   321: aload_3
    //   322: invokevirtual 658	com/tencent/mm/plugin/sns/storage/n:cqA	()Ljava/lang/String;
    //   325: astore 9
    //   327: new 660	java/util/ArrayList
    //   330: dup
    //   331: invokespecial 661	java/util/ArrayList:<init>	()V
    //   334: astore 11
    //   336: invokestatic 665	com/tencent/mm/plugin/sns/model/ap:coh	()Ljava/util/HashMap;
    //   339: invokevirtual 666	java/util/HashMap:size	()I
    //   342: ifle +309 -> 651
    //   345: invokestatic 665	com/tencent/mm/plugin/sns/model/ap:coh	()Ljava/util/HashMap;
    //   348: invokevirtual 670	java/util/HashMap:keySet	()Ljava/util/Set;
    //   351: invokeinterface 676 1 0
    //   356: astore_2
    //   357: aload_2
    //   358: invokeinterface 681 1 0
    //   363: ifeq +288 -> 651
    //   366: aload_2
    //   367: invokeinterface 684 1 0
    //   372: checkcast 305	java/lang/String
    //   375: astore 12
    //   377: aload 12
    //   379: aload 9
    //   381: invokevirtual 687	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   384: ifeq -27 -> 357
    //   387: invokestatic 665	com/tencent/mm/plugin/sns/model/ap:coh	()Ljava/util/HashMap;
    //   390: aload 12
    //   392: invokevirtual 392	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   395: checkcast 689	com/tencent/mm/plugin/sns/model/ap$b
    //   398: astore 12
    //   400: aload 12
    //   402: invokestatic 692	com/tencent/mm/plugin/sns/model/ap:c	(Lcom/tencent/mm/plugin/sns/model/ap$b;)Z
    //   405: ifeq -48 -> 357
    //   408: aload 11
    //   410: aload 12
    //   412: invokevirtual 693	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   415: pop
    //   416: goto -59 -> 357
    //   419: iconst_m1
    //   420: istore 10
    //   422: goto -347 -> 75
    //   425: new 695	com/tencent/mm/plugin/sns/ui/item/h
    //   428: dup
    //   429: invokespecial 696	com/tencent/mm/plugin/sns/ui/item/h:<init>	()V
    //   432: astore 7
    //   434: goto -229 -> 205
    //   437: new 698	com/tencent/mm/plugin/sns/ui/item/g
    //   440: dup
    //   441: invokespecial 699	com/tencent/mm/plugin/sns/ui/item/g:<init>	()V
    //   444: astore 7
    //   446: goto -241 -> 205
    //   449: new 698	com/tencent/mm/plugin/sns/ui/item/g
    //   452: dup
    //   453: invokespecial 699	com/tencent/mm/plugin/sns/ui/item/g:<init>	()V
    //   456: astore 7
    //   458: goto -253 -> 205
    //   461: new 698	com/tencent/mm/plugin/sns/ui/item/g
    //   464: dup
    //   465: invokespecial 699	com/tencent/mm/plugin/sns/ui/item/g:<init>	()V
    //   468: astore 7
    //   470: goto -265 -> 205
    //   473: new 698	com/tencent/mm/plugin/sns/ui/item/g
    //   476: dup
    //   477: invokespecial 699	com/tencent/mm/plugin/sns/ui/item/g:<init>	()V
    //   480: astore 7
    //   482: goto -277 -> 205
    //   485: new 701	com/tencent/mm/plugin/sns/ui/item/e
    //   488: dup
    //   489: invokespecial 702	com/tencent/mm/plugin/sns/ui/item/e:<init>	()V
    //   492: astore 7
    //   494: goto -289 -> 205
    //   497: new 634	com/tencent/mm/plugin/sns/ui/item/f
    //   500: dup
    //   501: invokespecial 635	com/tencent/mm/plugin/sns/ui/item/f:<init>	()V
    //   504: astore 7
    //   506: goto -301 -> 205
    //   509: new 634	com/tencent/mm/plugin/sns/ui/item/f
    //   512: dup
    //   513: invokespecial 635	com/tencent/mm/plugin/sns/ui/item/f:<init>	()V
    //   516: astore 7
    //   518: goto -313 -> 205
    //   521: new 634	com/tencent/mm/plugin/sns/ui/item/f
    //   524: dup
    //   525: invokespecial 635	com/tencent/mm/plugin/sns/ui/item/f:<init>	()V
    //   528: astore 7
    //   530: goto -325 -> 205
    //   533: new 704	com/tencent/mm/plugin/sns/ui/item/j
    //   536: dup
    //   537: invokespecial 705	com/tencent/mm/plugin/sns/ui/item/j:<init>	()V
    //   540: astore 7
    //   542: goto -337 -> 205
    //   545: new 707	com/tencent/mm/plugin/sns/ui/item/d
    //   548: dup
    //   549: invokespecial 708	com/tencent/mm/plugin/sns/ui/item/d:<init>	()V
    //   552: astore 7
    //   554: goto -349 -> 205
    //   557: new 710	com/tencent/mm/plugin/sns/ui/item/i
    //   560: dup
    //   561: invokespecial 711	com/tencent/mm/plugin/sns/ui/item/i:<init>	()V
    //   564: astore 7
    //   566: goto -361 -> 205
    //   569: new 713	com/tencent/mm/plugin/sns/ui/item/b
    //   572: dup
    //   573: invokespecial 714	com/tencent/mm/plugin/sns/ui/item/b:<init>	()V
    //   576: astore 7
    //   578: goto -373 -> 205
    //   581: new 716	com/tencent/mm/plugin/sns/ui/item/a
    //   584: dup
    //   585: invokespecial 717	com/tencent/mm/plugin/sns/ui/item/a:<init>	()V
    //   588: astore 7
    //   590: goto -385 -> 205
    //   593: new 719	com/tencent/mm/plugin/sns/ui/item/c
    //   596: dup
    //   597: invokespecial 720	com/tencent/mm/plugin/sns/ui/item/c:<init>	()V
    //   600: astore 7
    //   602: goto -397 -> 205
    //   605: new 151	com/tencent/mm/plugin/sns/ui/item/g$a
    //   608: dup
    //   609: invokespecial 721	com/tencent/mm/plugin/sns/ui/item/g$a:<init>	()V
    //   612: astore 6
    //   614: aload 6
    //   616: astore 9
    //   618: goto -371 -> 247
    //   621: astore 8
    //   623: ldc 196
    //   625: aload 8
    //   627: ldc_w 723
    //   630: iconst_0
    //   631: anewarray 4	java/lang/Object
    //   634: invokestatic 727	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   637: aload 7
    //   639: astore 8
    //   641: aload 9
    //   643: astore 6
    //   645: aload_2
    //   646: astore 7
    //   648: goto -336 -> 312
    //   651: aload 8
    //   653: aload 11
    //   655: putfield 731	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem:rHq	Ljava/util/ArrayList;
    //   658: aload 8
    //   660: aload 6
    //   662: iload_1
    //   663: aload_3
    //   664: aload 4
    //   666: iload 5
    //   668: aload_0
    //   669: invokevirtual 734	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem:a	(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/storage/n;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/au;)V
    //   672: aload_3
    //   673: invokevirtual 658	com/tencent/mm/plugin/sns/storage/n:cqA	()Ljava/lang/String;
    //   676: iconst_2
    //   677: invokestatic 738	com/tencent/mm/plugin/sns/model/ap:db	(Ljava/lang/String;I)Z
    //   680: ifeq +103 -> 783
    //   683: aload_3
    //   684: invokevirtual 658	com/tencent/mm/plugin/sns/storage/n:cqA	()Ljava/lang/String;
    //   687: invokestatic 742	com/tencent/mm/plugin/sns/model/ap:Ye	(Ljava/lang/String;)Lcom/tencent/mm/plugin/sns/model/ap$b;
    //   690: astore_2
    //   691: aload_3
    //   692: getfield 746	com/tencent/mm/plugin/sns/storage/n:field_snsId	J
    //   695: lconst_0
    //   696: lcmp
    //   697: ifne +11 -> 708
    //   700: new 689	com/tencent/mm/plugin/sns/model/ap$b
    //   703: dup
    //   704: invokespecial 747	com/tencent/mm/plugin/sns/model/ap$b:<init>	()V
    //   707: astore_2
    //   708: aload_2
    //   709: getfield 750	com/tencent/mm/plugin/sns/model/ap$b:foa	Z
    //   712: ifeq +63 -> 775
    //   715: aload_2
    //   716: getfield 753	com/tencent/mm/plugin/sns/model/ap$b:aAR	Z
    //   719: ifne +40 -> 759
    //   722: aload_2
    //   723: aload 6
    //   725: aload_2
    //   726: getfield 756	com/tencent/mm/plugin/sns/model/ap$b:result	Ljava/lang/String;
    //   729: aload_2
    //   730: getfield 759	com/tencent/mm/plugin/sns/model/ap$b:fwM	Ljava/lang/String;
    //   733: invokestatic 762	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem:a	(Lcom/tencent/mm/plugin/sns/model/ap$b;Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;Ljava/lang/String;Ljava/lang/String;)V
    //   736: aload_0
    //   737: getfield 109	com/tencent/mm/plugin/sns/ui/au:rxV	Ljava/util/HashMap;
    //   740: iload_1
    //   741: invokestatic 143	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   744: aload 7
    //   746: invokevirtual 149	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   749: pop
    //   750: ldc_w 625
    //   753: invokestatic 286	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   756: aload 7
    //   758: areturn
    //   759: aload 6
    //   761: invokestatic 765	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem:f	(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V
    //   764: aload_2
    //   765: getfield 768	com/tencent/mm/plugin/sns/model/ap$b:id	Ljava/lang/String;
    //   768: iconst_2
    //   769: invokestatic 464	com/tencent/mm/plugin/sns/model/ap:da	(Ljava/lang/String;I)V
    //   772: goto -36 -> 736
    //   775: aload 6
    //   777: invokestatic 770	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem:e	(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V
    //   780: goto -44 -> 736
    //   783: aload 6
    //   785: invokestatic 765	com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem:f	(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V
    //   788: goto -52 -> 736
    //   791: astore 8
    //   793: aload 6
    //   795: astore_2
    //   796: goto -173 -> 623
    //
    // Exception table:
    //   from	to	target	type
    //   205	243	621	java/lang/Exception
    //   605	614	621	java/lang/Exception
    //   250	257	791	java/lang/Exception
    //   260	267	791	java/lang/Exception
    //   270	286	791	java/lang/Exception
    //   289	301	791	java/lang/Exception
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(39420);
    this.rxO.notifyDataSetChanged();
    AppMethodBeat.o(39420);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.au
 * JD-Core Version:    0.6.2
 */