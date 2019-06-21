package com.tencent.mm.plugin.sns.g;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.lb;
import com.tencent.mm.g.a.lc;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.r;
import com.tencent.mm.plugin.sns.model.w;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.bb;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.o;
import com.tencent.mm.pluginsdk.ui.e.o.a;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
  implements com.tencent.mm.ai.f, com.tencent.mm.plugin.sns.model.e
{
  public static final Pattern qPw;
  public static final Pattern qPx;
  public com.tencent.mm.plugin.sns.h.c qJD;
  public final int qOK;
  public final int qPo;
  public List<d> qPp;
  public ListView qPq;
  public au qPr;
  public Map<Long, Integer> qPs;
  public HashSet<Long> qPt;
  public HashSet<Long> qPu;
  public HashMap<Long, c.a> qPv;
  private o.a qPy;

  static
  {
    AppMethodBeat.i(36800);
    qPw = Pattern.compile("\\{richtext:([\\s\\S]*?)\\}");
    qPx = Pattern.compile("\\{sex:([\\s\\S]*?):([\\s\\S]*?):([\\s\\S]*?)\\}");
    AppMethodBeat.o(36800);
  }

  public c()
  {
    AppMethodBeat.i(36783);
    this.qOK = 14;
    this.qPo = 500;
    this.qPs = new HashMap();
    this.qPt = new HashSet();
    this.qPu = new HashSet();
    this.qPv = new HashMap();
    this.qPy = new c.6(this);
    AppMethodBeat.o(36783);
  }

  private SpannableString a(Context paramContext, TextView paramTextView, String paramString, cbf paramcbf, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, d.a parama, d.b paramb, d paramd)
  {
    AppMethodBeat.i(36795);
    Object localObject = qPw.matcher(paramString);
    if ((((Matcher)localObject).find()) && (((Matcher)localObject).groupCount() == 1))
    {
      String str = ((Matcher)localObject).group();
      localObject = ((Matcher)localObject).group(1);
      int i = paramString.indexOf(str);
      paramString = paramString.replace(str, (CharSequence)localObject);
      paramTextView.setOnClickListener(null);
      paramTextView.setClickable(true);
      paramString = new SpannableString(paramString);
      paramTextView.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.aa());
      paramString.setSpan(new o(paramcbf.vHl, new c.5(this, paramContext, paramcbf, parama, paramb, paramBaseViewHolder, paramd)), i, ((String)localObject).length() + i, 33);
      AppMethodBeat.o(36795);
      paramContext = paramString;
    }
    while (true)
    {
      return paramContext;
      paramContext = j.b(paramContext, paramString);
      AppMethodBeat.o(36795);
    }
  }

  // ERROR //
  private static String a(String paramString, cbf paramcbf)
  {
    // Byte code:
    //   0: ldc 182
    //   2: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: astore_2
    //   7: aload_0
    //   8: invokestatic 188	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   11: ifeq +13 -> 24
    //   14: ldc 190
    //   16: astore_0
    //   17: ldc 182
    //   19: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: aload_0
    //   23: areturn
    //   24: aload_0
    //   25: astore_2
    //   26: aload_1
    //   27: getfield 157	com/tencent/mm/protocal/protobuf/cbf:vHl	Ljava/lang/String;
    //   30: astore_1
    //   31: aload_0
    //   32: astore_2
    //   33: invokestatic 196	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   36: pop
    //   37: aload_0
    //   38: astore_2
    //   39: ldc 198
    //   41: invokestatic 202	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   44: checkcast 198	com/tencent/mm/plugin/messenger/foundation/a/j
    //   47: invokeinterface 206 1 0
    //   52: aload_1
    //   53: invokeinterface 212 2 0
    //   58: astore_3
    //   59: aload_0
    //   60: astore_1
    //   61: aload_0
    //   62: astore_2
    //   63: aload_0
    //   64: ldc 214
    //   66: invokevirtual 218	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   69: ifeq +16 -> 85
    //   72: aload_0
    //   73: astore_2
    //   74: aload_0
    //   75: ldc 214
    //   77: aload_3
    //   78: invokevirtual 223	com/tencent/mm/n/a:Oj	()Ljava/lang/String;
    //   81: invokevirtual 127	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   84: astore_1
    //   85: aload_1
    //   86: astore_2
    //   87: aload_3
    //   88: getfield 228	com/tencent/mm/g/c/ap:dtS	I
    //   91: istore 4
    //   93: iload 4
    //   95: iconst_1
    //   96: if_icmpne +59 -> 155
    //   99: iconst_0
    //   100: istore 4
    //   102: aload_1
    //   103: astore_0
    //   104: getstatic 60	com/tencent/mm/plugin/sns/g/c:qPx	Ljava/util/regex/Pattern;
    //   107: aload_0
    //   108: invokevirtual 100	java/util/regex/Pattern:matcher	(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   111: astore_1
    //   112: aload_1
    //   113: invokevirtual 106	java/util/regex/Matcher:find	()Z
    //   116: ifeq +93 -> 209
    //   119: aload_1
    //   120: invokevirtual 110	java/util/regex/Matcher:groupCount	()I
    //   123: iconst_3
    //   124: if_icmpne +85 -> 209
    //   127: aload_1
    //   128: invokevirtual 114	java/util/regex/Matcher:group	()Ljava/lang/String;
    //   131: astore_2
    //   132: iload 4
    //   134: ifne +51 -> 185
    //   137: aload_1
    //   138: iconst_1
    //   139: invokevirtual 117	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   142: astore_1
    //   143: aload_0
    //   144: aload_2
    //   145: aload_1
    //   146: invokevirtual 127	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   149: astore_1
    //   150: aload_1
    //   151: astore_0
    //   152: goto -48 -> 104
    //   155: aload_1
    //   156: astore_2
    //   157: aload_3
    //   158: getfield 228	com/tencent/mm/g/c/ap:dtS	I
    //   161: istore 4
    //   163: iload 4
    //   165: iconst_2
    //   166: if_icmpne +11 -> 177
    //   169: iconst_1
    //   170: istore 4
    //   172: aload_1
    //   173: astore_0
    //   174: goto -70 -> 104
    //   177: iconst_2
    //   178: istore 4
    //   180: aload_1
    //   181: astore_0
    //   182: goto -78 -> 104
    //   185: iload 4
    //   187: iconst_1
    //   188: if_icmpne +12 -> 200
    //   191: aload_1
    //   192: iconst_2
    //   193: invokevirtual 117	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   196: astore_1
    //   197: goto -54 -> 143
    //   200: aload_1
    //   201: iconst_3
    //   202: invokevirtual 117	java/util/regex/Matcher:group	(I)Ljava/lang/String;
    //   205: astore_1
    //   206: goto -63 -> 143
    //   209: ldc 182
    //   211: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   214: goto -192 -> 22
    //   217: astore_0
    //   218: aload_0
    //   219: astore_1
    //   220: aload_2
    //   221: astore_0
    //   222: ldc 230
    //   224: aload_1
    //   225: ldc 232
    //   227: iconst_0
    //   228: anewarray 4	java/lang/Object
    //   231: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: ldc 182
    //   236: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: goto -217 -> 22
    //   242: astore_1
    //   243: goto -21 -> 222
    //
    // Exception table:
    //   from	to	target	type
    //   7	14	217	java/lang/Exception
    //   26	31	217	java/lang/Exception
    //   33	37	217	java/lang/Exception
    //   39	59	217	java/lang/Exception
    //   63	72	217	java/lang/Exception
    //   74	85	217	java/lang/Exception
    //   87	93	217	java/lang/Exception
    //   157	163	217	java/lang/Exception
    //   104	132	242	java/lang/Exception
    //   137	143	242	java/lang/Exception
    //   143	150	242	java/lang/Exception
    //   191	197	242	java/lang/Exception
    //   200	206	242	java/lang/Exception
  }

  private void a(Context paramContext, cbf paramcbf, d.a parama, d.b paramb, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, d paramd)
  {
    AppMethodBeat.i(36792);
    ab.i("MicroMsg.SnSABTestMgr", "processButtonClick snsobj " + paramcbf.vHl + " " + paramcbf.vQE);
    int i = parama.qPS - 1;
    c.a locala = (c.a)this.qPv.get(Long.valueOf(paramcbf.vQE));
    if (locala != null)
    {
      locala.E(paramb.showType, paramb.hhZ.size(), parama.index, parama.actionType);
      locala.qPJ = -1;
      locala.qPK = -1;
    }
    if (parama.actionType == 3)
    {
      this.qPt.add(Long.valueOf(paramcbf.vQE));
      this.qPs.put(Long.valueOf(paramcbf.vQE), Integer.valueOf(i));
    }
    while (true)
    {
      if ((i == 4) || (i == 1))
        a(paramContext, paramcbf, paramBaseViewHolder);
      AppMethodBeat.o(36792);
      while (true)
      {
        return;
        if (parama.actionType == 1)
        {
          this.qPs.put(Long.valueOf(paramcbf.vQE), Integer.valueOf(i));
          kq(paramcbf.vQE);
          b(paramBaseViewHolder);
          break;
        }
        if (parama.actionType == 5)
        {
          if (this.qPt.contains(Long.valueOf(paramcbf.vQE)))
          {
            this.qPt.remove(Long.valueOf(paramcbf.vQE));
            kq(paramcbf.vQE);
            b(paramBaseViewHolder);
            if (this.qPv.containsKey(Long.valueOf(paramcbf.vQE)))
              a((c.a)this.qPv.remove(Long.valueOf(paramcbf.vQE)));
          }
          this.qPs.put(Long.valueOf(paramcbf.vQE), Integer.valueOf(-1));
          a(paramBaseViewHolder);
          AppMethodBeat.o(36792);
        }
        else
        {
          if (parama.actionType == 7)
          {
            if (i >= paramd.qPP.size())
              break;
            parama = (d.b)paramd.qPP.get(i);
            if (parama.showType == 2)
            {
              b(paramContext, paramcbf, paramBaseViewHolder, parama, paramd);
              AppMethodBeat.o(36792);
              continue;
            }
            if (parama.showType != 5)
              break;
            t.makeText(paramContext, bo.bc(parama.title, ""), 0).show();
            kq(paramcbf.vQE);
            b(paramBaseViewHolder);
            AppMethodBeat.o(36792);
            continue;
          }
          if (parama.actionType == 6)
          {
            t.makeText(paramContext, bo.bc(paramContext.getString(2131303559), ""), 0).show();
            this.qPu.add(Long.valueOf(paramcbf.vQE));
            b(paramBaseViewHolder);
            paramContext = new lc();
            com.tencent.mm.sdk.b.a.xxA.m(paramContext);
            a(paramBaseViewHolder);
            AppMethodBeat.o(36792);
          }
          else if (parama.actionType == 2)
          {
            parama = parama.jumpUrl;
            ab.i("MicroMsg.SnSABTestMgr", "jump url ".concat(String.valueOf(parama)));
            paramb = new Intent();
            paramb.putExtra("rawUrl", parama);
            paramb.putExtra("useJs", true);
            com.tencent.mm.plugin.sns.c.a.gkE.i(paramb, paramContext);
            kq(paramcbf.vQE);
            b(paramBaseViewHolder);
            a(paramBaseViewHolder);
            AppMethodBeat.o(36792);
          }
          else
          {
            if (parama.actionType != 8)
              break label660;
            AppMethodBeat.o(36792);
          }
        }
      }
      label660: if (parama.actionType == 4)
      {
        parama = paramcbf.vHl;
        paramb = new LinkedList();
        paramb.add(parama);
        parama = new w(1, 5L, "", paramb.size(), paramb, 0);
        g.RQ();
        g.RO().eJo.a(parama, 0);
      }
    }
  }

  private static void a(c.a parama)
  {
    AppMethodBeat.i(36797);
    Object localObject = parama.qPI;
    if (localObject == null)
      AppMethodBeat.o(36797);
    while (true)
    {
      return;
      String str1 = ((d)localObject).qPn;
      String str2 = ((d)localObject).qPm;
      String str3 = parama.qPN;
      parama.E(parama.qPJ, parama.qPK, 0, 0);
      String str4 = parama.qPM;
      localObject = str4;
      if (bo.isNullOrNil(str4))
        localObject = parama.qPJ + ":" + parama.qPK + ":0:0";
      long l1 = parama.mStartTime / 1000L;
      if (parama.mEndTime == -1L)
        parama.mEndTime = System.currentTimeMillis();
      long l2 = parama.mEndTime / 1000L;
      if (parama != null)
      {
        ab.i("MicroMsg.SnSABTestMgr", "report layerId: " + str1 + " expid " + str2 + " acton " + (String)localObject + " starttime " + l1 + " timelineId: " + str3);
        com.tencent.mm.plugin.report.service.h.pYm.e(11917, new Object[] { str1, str2, "", "", Integer.valueOf(1), str3, localObject, Long.valueOf(l1), Long.valueOf(l2) });
      }
      AppMethodBeat.o(36797);
    }
  }

  private void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(36791);
    if (paramBaseViewHolder == null)
      AppMethodBeat.o(36791);
    while (true)
    {
      return;
      Context localContext = paramBaseViewHolder.mRR.getContext();
      if (localContext == null)
      {
        AppMethodBeat.o(36791);
      }
      else
      {
        if (paramBaseViewHolder.mRR.getBackground() == null)
        {
          paramBaseViewHolder.mRR.setBackgroundResource(2130838396);
          paramBaseViewHolder.mRR.setPadding(com.tencent.mm.bz.a.fromDPToPix(localContext, 12), com.tencent.mm.bz.a.fromDPToPix(localContext, 12), com.tencent.mm.bz.a.fromDPToPix(localContext, 12), com.tencent.mm.bz.a.fromDPToPix(localContext, 8));
        }
        int i = paramBaseViewHolder.position;
        if (this.qPr != null)
        {
          paramBaseViewHolder = (WeakReference)this.qPr.rxR.get(Integer.valueOf(i - 1));
          if ((paramBaseViewHolder == null) || (paramBaseViewHolder.get() == null))
          {
            AppMethodBeat.o(36791);
          }
          else
          {
            ((View)paramBaseViewHolder.get()).setBackgroundResource(2130838396);
            ((View)paramBaseViewHolder.get()).setPadding(com.tencent.mm.bz.a.fromDPToPix(localContext, 12), com.tencent.mm.bz.a.fromDPToPix(localContext, 12), com.tencent.mm.bz.a.fromDPToPix(localContext, 12), com.tencent.mm.bz.a.fromDPToPix(localContext, 8));
          }
        }
        else
        {
          AppMethodBeat.o(36791);
        }
      }
    }
  }

  private boolean a(Context paramContext, cbf paramcbf, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, d.b paramb, d paramd)
  {
    AppMethodBeat.i(36789);
    paramBaseViewHolder.mRR.setBackgroundDrawable(null);
    int i = paramBaseViewHolder.position;
    Object localObject1;
    if (this.qPr != null)
    {
      localObject1 = (WeakReference)this.qPr.rxR.get(Integer.valueOf(i - 1));
      if ((localObject1 != null) && (((WeakReference)localObject1).get() != null))
        break label257;
    }
    Object localObject2;
    while (true)
    {
      if (!paramBaseViewHolder.rIi)
      {
        paramBaseViewHolder.rIj = paramBaseViewHolder.rIh.inflate();
        paramBaseViewHolder.rIi = true;
        paramBaseViewHolder.rIk = ((LinearLayout)paramBaseViewHolder.rIj.findViewById(2131827602));
      }
      paramBaseViewHolder.rIj.setVisibility(0);
      paramBaseViewHolder.rIt.setVisibility(8);
      paramBaseViewHolder.rHv.setVisibility(8);
      localObject1 = paramb.hhZ;
      if (((List)localObject1).size() == paramBaseViewHolder.rIk.getChildCount())
        break;
      paramBaseViewHolder.rIk.removeAllViews();
      int j = com.tencent.mm.bz.a.fromDPToPix(paramContext, 10);
      for (i = 0; i < ((List)localObject1).size(); i++)
      {
        localObject2 = new TextView(paramContext);
        ((TextView)localObject2).setBackgroundResource(2130837665);
        ((TextView)localObject2).setPadding(j, j, j, j);
        ((TextView)localObject2).setTextSize(1, 14.0F * com.tencent.mm.bz.a.dm(paramContext));
        ((TextView)localObject2).setTextColor(paramContext.getResources().getColor(2131689761));
        paramBaseViewHolder.rIk.addView((View)localObject2);
      }
      label257: ((View)((WeakReference)localObject1).get()).setBackgroundDrawable(null);
    }
    for (i = 0; i < ((List)localObject1).size(); i++)
    {
      d.a locala = (d.a)((List)localObject1).get(i);
      TextView localTextView = (TextView)paramBaseViewHolder.rIk.getChildAt(i);
      localTextView.setText(locala.qPQ);
      localTextView.setTag(paramcbf);
      localObject2 = a(f.a(locala), paramcbf);
      localTextView.setOnClickListener(new c.2(this, paramContext, locala, paramb, paramBaseViewHolder, paramd));
      localTextView.setText(a(paramContext, localTextView, (String)localObject2, paramcbf, paramBaseViewHolder, locala, paramb, paramd), TextView.BufferType.SPANNABLE);
      if (locala.actionType != 5)
      {
        localTextView.setCompoundDrawablePadding(com.tencent.mm.bz.a.fromDPToPix(paramContext, 5));
        localTextView.setCompoundDrawablesWithIntrinsicBounds(paramContext.getResources().getDrawable(2131230768), null, null, null);
      }
    }
    AppMethodBeat.o(36789);
    return true;
  }

  private static void b(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(36793);
    if (paramBaseViewHolder == null)
      AppMethodBeat.o(36793);
    while (true)
    {
      return;
      if (paramBaseViewHolder.rIc != null)
        paramBaseViewHolder.rIc.setVisibility(8);
      if (paramBaseViewHolder.rIe != null)
        paramBaseViewHolder.rIe.setVisibility(8);
      if (paramBaseViewHolder.rIh != null)
        paramBaseViewHolder.rIh.setVisibility(8);
      if (paramBaseViewHolder.rIj != null)
        paramBaseViewHolder.rIj.setVisibility(8);
      if (paramBaseViewHolder.rIt.getVisibility() == 8)
        paramBaseViewHolder.rIt.setVisibility(0);
      if (paramBaseViewHolder.rHv.getVisibility() == 8)
        paramBaseViewHolder.rHv.setVisibility(0);
      if (paramBaseViewHolder.mRR.getVisibility() == 8)
        paramBaseViewHolder.mRR.setVisibility(0);
      AppMethodBeat.o(36793);
    }
  }

  private boolean b(Context paramContext, cbf paramcbf, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, d.b paramb, d paramd)
  {
    AppMethodBeat.i(36790);
    boolean bool;
    if (paramb.hhZ.size() == 2)
    {
      d.a locala1 = (d.a)paramb.hhZ.get(0);
      d.a locala2 = (d.a)paramb.hhZ.get(1);
      String str1 = a(f.a(locala1), paramcbf);
      String str2 = a(f.a(locala2), paramcbf);
      com.tencent.mm.ui.base.h.d(paramContext, a(paramb.title, paramcbf), paramContext.getString(2131297061), str1, str2, new c.3(this, paramContext, paramcbf, locala1, paramb, paramBaseViewHolder, paramd), new c.4(this, paramContext, paramcbf, locala2, paramb, paramBaseViewHolder, paramd));
      bool = true;
      AppMethodBeat.o(36790);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(36790);
    }
  }

  public static void c(View paramView, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(36787);
    paramBaseViewHolder.rId = false;
    paramBaseViewHolder.rIc = ((ViewStub)paramView.findViewById(2131827907));
    paramBaseViewHolder.rIc.setVisibility(8);
    paramBaseViewHolder.rIh = ((ViewStub)paramView.findViewById(2131827914));
    paramBaseViewHolder.rIh.setVisibility(8);
    AppMethodBeat.o(36787);
  }

  private void kq(long paramLong)
  {
    AppMethodBeat.i(36785);
    if (this.qJD == null)
      this.qJD = new com.tencent.mm.plugin.sns.h.c();
    if (this.qJD.qQf.size() > 500)
      this.qJD.qQf.remove(0);
    this.qJD.qQf.add(Long.valueOf(paramLong));
    AppMethodBeat.o(36785);
  }

  public final void a(int paramInt, String paramString, long paramLong, TimeLineObject paramTimeLineObject, boolean paramBoolean)
  {
    AppMethodBeat.i(36796);
    if (this.qPv.containsKey(Long.valueOf(paramLong)))
    {
      paramString = (c.a)this.qPv.get(Long.valueOf(paramLong));
      if (paramString.mEndTime == -1L)
        paramString.mEndTime = System.currentTimeMillis();
      paramString.E(paramString.qPJ, paramString.qPK, 0, 0);
    }
    AppMethodBeat.o(36796);
  }

  public final void a(int paramInt, String paramString, long paramLong, TimeLineObject paramTimeLineObject, boolean paramBoolean, bb parambb)
  {
  }

  public final void a(Context paramContext, cbf paramcbf, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(36788);
    if (!com.tencent.mm.sdk.platformtools.aa.doo())
    {
      b(paramBaseViewHolder);
      AppMethodBeat.o(36788);
    }
    while (true)
    {
      return;
      if ((this.qPp == null) || (this.qPp.size() == 0))
      {
        b(paramBaseViewHolder);
        AppMethodBeat.o(36788);
      }
      else if (this.qPu.contains(Long.valueOf(paramcbf.vQE)))
      {
        b(paramBaseViewHolder);
        paramBaseViewHolder.rIt.setVisibility(8);
        paramBaseViewHolder.rHv.setVisibility(8);
        paramBaseViewHolder.mRR.setVisibility(8);
        AppMethodBeat.o(36788);
      }
      else if ((paramcbf.vHl == null) || (paramcbf.vHl.equals(af.cnk())))
      {
        b(paramBaseViewHolder);
        AppMethodBeat.o(36788);
      }
      else
      {
        if ((this.qJD == null) || (!this.qJD.qQf.contains(Long.valueOf(paramcbf.vQE))))
          break;
        b(paramBaseViewHolder);
        AppMethodBeat.o(36788);
      }
    }
    if (paramcbf != null);
    while (true)
    {
      try
      {
        localObject1 = com.tencent.mm.platformtools.aa.a(paramcbf.xaD);
        boolean bool = bo.cb((byte[])localObject1);
        if (bool)
        {
          i = 0;
          j = 0;
          if (!this.qPs.containsKey(Long.valueOf(paramcbf.vQE)))
            continue;
          int k = ((Integer)this.qPs.get(Long.valueOf(paramcbf.vQE))).intValue();
          j = k;
          if (k != -1)
            continue;
          b(paramBaseViewHolder);
          AppMethodBeat.o(36788);
          break;
        }
        cbn localcbn = new com/tencent/mm/protocal/protobuf/cbn;
        localcbn.<init>();
        i = ((cbn)localcbn.parseFrom((byte[])localObject1)).xaO;
        continue;
      }
      catch (Exception localException)
      {
        i = 0;
        continue;
        Object localObject1 = null;
        Object localObject3 = this.qPp.iterator();
        Object localObject2 = localObject1;
        if (((Iterator)localObject3).hasNext())
        {
          localObject2 = (d)((Iterator)localObject3).next();
          if (localObject2 == null)
          {
            b(paramBaseViewHolder);
            AppMethodBeat.o(36788);
            break;
          }
          if (((d)localObject2).qPO != i)
            continue;
        }
        if (localObject2 == null)
        {
          b(paramBaseViewHolder);
          AppMethodBeat.o(36788);
          break;
        }
        if (j >= ((d)localObject2).qPP.size())
        {
          b(paramBaseViewHolder);
          AppMethodBeat.o(36788);
          break;
        }
        localObject1 = (d.b)((d)localObject2).qPP.get(j);
        int j = ((d.b)localObject1).showType;
        b(paramBaseViewHolder);
        if (i > 0)
        {
          Object localObject4;
          Object localObject5;
          if (!this.qPv.containsKey(Long.valueOf(paramcbf.vQE)))
          {
            localObject3 = new c.a(System.currentTimeMillis(), paramcbf.vQE, i.jV(paramcbf.vQE), (d)localObject2);
            ((c.a)localObject3).fl(j, ((d.b)localObject1).hhZ.size());
            this.qPv.put(Long.valueOf(paramcbf.vQE), localObject3);
            if (j != 1)
              continue;
            localObject3 = ((d.b)localObject1).title;
            if (!paramBaseViewHolder.rId)
            {
              paramBaseViewHolder.rIe = paramBaseViewHolder.rIc.inflate();
              paramBaseViewHolder.rId = true;
              paramBaseViewHolder.rIg = ((TextView)paramBaseViewHolder.rIe.findViewById(2131827600));
              paramBaseViewHolder.rIf = ((LinearLayout)paramBaseViewHolder.rIe.findViewById(2131827601));
            }
            paramBaseViewHolder.rIe.setVisibility(0);
            paramBaseViewHolder.rIg.setText((CharSequence)localObject3);
            localObject3 = ((d.b)localObject1).hhZ;
            if (((List)localObject3).size() != paramBaseViewHolder.rIf.getChildCount())
            {
              paramBaseViewHolder.rIf.removeAllViews();
              i = 0;
              if (i < ((List)localObject3).size())
              {
                localObject4 = (d.a)((List)localObject3).get(i);
                localObject5 = new TextView(paramBaseViewHolder.rIf.getContext());
                ((TextView)localObject5).setText(((d.a)localObject4).qPQ);
                ((TextView)localObject5).setPadding(0, 0, com.tencent.mm.bz.a.fromDPToPix(paramContext, 10), 0);
                ((TextView)localObject5).setVisibility(0);
                ((TextView)localObject5).setTextSize(1, 14.0F * com.tencent.mm.bz.a.dm(paramContext));
                ((TextView)localObject5).setTextColor(paramContext.getResources().getColor(2131690481));
                paramBaseViewHolder.rIf.addView((View)localObject5);
                i++;
                continue;
              }
            }
          }
          else
          {
            ((c.a)this.qPv.get(Long.valueOf(paramcbf.vQE))).fl(j, ((d.b)localObject1).hhZ.size());
            continue;
          }
          i = 0;
          if (i < ((List)localObject3).size())
          {
            localObject5 = (d.a)((List)localObject3).get(i);
            localObject4 = (TextView)paramBaseViewHolder.rIf.getChildAt(i);
            ((TextView)localObject4).setText(a(paramContext, (TextView)localObject4, a(f.a((d.a)localObject5), paramcbf), paramcbf, paramBaseViewHolder, (d.a)localObject5, (d.b)localObject1, (d)localObject2));
            ((TextView)localObject4).setTag(paramcbf);
            ((TextView)localObject4).setOnClickListener(new c.1(this, paramContext, (d.a)localObject5, (d.b)localObject1, paramBaseViewHolder, (d)localObject2));
            i++;
            continue;
          }
          AppMethodBeat.o(36788);
          break;
          if (j == 4)
          {
            a(paramContext, paramcbf, paramBaseViewHolder, (d.b)localObject1, (d)localObject2);
            AppMethodBeat.o(36788);
            break;
          }
          if (j == 2)
          {
            if (b(paramContext, paramcbf, paramBaseViewHolder, (d.b)localObject1, (d)localObject2))
            {
              AppMethodBeat.o(36788);
              break;
            }
            AppMethodBeat.o(36788);
            break;
          }
        }
        b(paramBaseViewHolder);
        AppMethodBeat.o(36788);
      }
      break;
      int i = 0;
    }
  }

  public final void clean()
  {
    AppMethodBeat.i(36786);
    this.qPq = null;
    this.qPr = null;
    Object localObject1;
    Object localObject2;
    if (this.qPt != null)
    {
      localObject1 = this.qPt.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Long)((Iterator)localObject1).next();
        r localr = new r(((Long)localObject2).longValue(), 0, 0, null);
        g.RQ();
        g.RO().eJo.a(localr, 0);
        ab.i("MicroMsg.SnSABTestMgr", "report id ".concat(String.valueOf(localObject2)));
      }
    }
    if (this.qPv != null)
    {
      localObject2 = this.qPv.values().iterator();
      while (((Iterator)localObject2).hasNext())
        a((c.a)((Iterator)localObject2).next());
      this.qPv.clear();
    }
    if ((this.qPp.size() == 0) || (this.qJD == null))
      AppMethodBeat.o(36786);
    while (true)
    {
      return;
      long l = System.currentTimeMillis();
      localObject2 = new StringBuilder();
      g.RQ();
      localObject2 = g.RP().cachePath + "ws_1100004";
      ab.i("MicroMsg.SnSABTestMgr", "listToFile to list  ".concat(String.valueOf(localObject2)));
      try
      {
        localObject1 = this.qJD.toByteArray();
        com.tencent.mm.vfs.e.b((String)localObject2, (byte[])localObject1, localObject1.length);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("listTofile ");
        ab.i("MicroMsg.SnSABTestMgr", System.currentTimeMillis() - l + " igNoreAbTestId " + this.qJD.qQf.size());
        AppMethodBeat.o(36786);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.SnSABTestMgr", localException, "listToFile failed: ".concat(String.valueOf(localObject2)), new Object[0]);
        AppMethodBeat.o(36786);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(36784);
    ab.i("MicroMsg.SnSABTestMgr", "onSceneend " + paramInt1 + " errCode " + paramInt2);
    paramString = new lb();
    com.tencent.mm.sdk.b.a.xxA.m(paramString);
    AppMethodBeat.o(36784);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.c
 * JD-Core Version:    0.6.2
 */