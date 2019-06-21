package com.tencent.mm.plugin.sns.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.h.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.g.a;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.aao;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.QFadeImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UseSparseArrays"})
public final class as extends BaseAdapter
{
  private String country;
  private Activity czX;
  boolean czr;
  String lQD;
  List<n> list;
  private String nJy;
  Map<Integer, Integer> rgf;
  Map<Integer, Integer> rgg;
  int rgh;
  int rgi;
  String rmL;
  private bd rqa;
  private long rvA;
  private long rvB;
  int rvC;
  protected View.OnClickListener rvD;
  private az rvs;
  Map<Integer, Integer> rvt;
  private as.f rvu;
  boolean rvv;
  at rvw;
  private as.c rvx;
  int rvy;
  int rvz;
  private String userName;

  public as(Activity paramActivity, as.f paramf, String paramString, as.c paramc)
  {
    AppMethodBeat.i(39218);
    this.userName = "";
    this.list = new ArrayList();
    this.rgf = new HashMap();
    this.rgg = new HashMap();
    this.rvt = new HashMap();
    this.rgh = 0;
    this.rgi = 0;
    this.czr = false;
    this.rmL = "";
    this.rvv = false;
    this.lQD = "";
    this.rqa = null;
    this.nJy = "";
    this.rvy = 2147483647;
    this.rvz = 0;
    this.rvA = 0L;
    this.rvB = 0L;
    this.rvC = 0;
    this.rvD = new as.6(this);
    this.userName = paramString;
    this.czX = paramActivity;
    this.rvu = paramf;
    this.rvx = paramc;
    this.rqa = af.cnt();
    paramf = com.tencent.mm.sdk.platformtools.aa.g(this.czX.getSharedPreferences(ah.doA(), 0));
    ab.d("MicroMsg.SnsphotoAdapter", "filterLan temp ".concat(String.valueOf(paramf)));
    paramActivity = paramf;
    if (!paramf.equals("zh_CN"))
    {
      paramActivity = paramf;
      if (!paramf.equals("en"))
      {
        if (!paramf.equals("zh_TW"))
          break label380;
        paramActivity = paramf;
      }
    }
    this.nJy = paramActivity;
    this.country = com.tencent.mm.sdk.platformtools.aa.g(this.czX.getSharedPreferences(ah.doA(), 0));
    com.tencent.mm.kernel.g.RQ();
    paramActivity = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, null);
    if (this.userName.equals(paramActivity))
      this.czr = true;
    ab.d("MicroMsg.SnsphotoAdapter", "SnsphotoAdapter : userName : " + this.userName + " country: " + this.country);
    if (this.czr)
      this.rvs = az.dti();
    while (true)
    {
      this.rvw = new at(new as.1(this, paramc), paramString, this.czr);
      kJ(0L);
      ll(false);
      AppMethodBeat.o(39218);
      return;
      label380: if (paramf.equals("zh_HK"))
      {
        paramActivity = "zh_TW";
        break;
      }
      paramActivity = "en";
      break;
      com.tencent.mm.kernel.g.RQ();
      paramActivity = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
      if ((paramActivity != null) && (com.tencent.mm.n.a.jh(paramActivity.field_type)))
        this.rvs = az.dth();
      else
        this.rvs = az.dtj();
    }
  }

  protected static boolean ZH(String paramString)
  {
    AppMethodBeat.i(39232);
    com.tencent.mm.aw.e locale = com.tencent.mm.aw.a.aih();
    boolean bool;
    if ((locale != null) && (com.tencent.mm.aw.a.d(locale)) && (paramString.equals(locale.fJU)) && (com.tencent.mm.aw.a.aie()))
    {
      bool = true;
      AppMethodBeat.o(39232);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(39232);
    }
  }

  private void a(int paramInt1, QFadeImageView paramQFadeImageView, TextView paramTextView1, TextView paramTextView2, TextView paramTextView3, TextView paramTextView4, int paramInt2, as.d paramd, int paramInt3)
  {
    AppMethodBeat.i(39224);
    n localn = (n)getItem(paramInt1);
    TimeLineObject localTimeLineObject = localn.cqu();
    cbf localcbf = aj.q(localn);
    int i = 0;
    paramInt1 = i;
    if (localcbf != null)
      if (((localcbf.wGz & 0x2) != 2) || (localcbf.xaB == null))
      {
        paramInt1 = i;
        if ((localcbf.wGz & 0x4) == 4)
        {
          paramInt1 = i;
          if (localcbf.wFp == null);
        }
      }
      else
      {
        paramInt1 = 1;
      }
    if ((this.czr) && (localcbf != null) && (paramInt1 != 0) && (this.userName != null) && (this.userName.equals(localn.field_userName)))
    {
      paramTextView3.setBackgroundResource(2130839822);
      paramTextView3.setVisibility(0);
    }
    Object localObject;
    if (paramInt2 == 1)
    {
      if (aj.ab(localn.field_localPrivate, this.czr))
      {
        paramTextView3.setVisibility(0);
        paramTextView3.setBackgroundResource(2130839816);
        localObject = this.rqa.aoO(localn.field_userName);
        if (localObject != null)
          break label571;
        localObject = "";
        if ((!((String)localObject).equals("")) && (!this.userName.equals(localn.field_userName)))
        {
          paramTextView1.setVisibility(0);
          paramTextView1.setText((CharSequence)localObject);
        }
      }
      label235: paramInt1 = localn.reX;
      paramTextView1 = new f.a();
      paramTextView1.cNE = paramInt1;
      if (this.rvt.get(Integer.valueOf(paramInt3)) == null)
        break label689;
      paramTextView1.position = ((Integer)this.rvt.get(Integer.valueOf(paramInt3))).intValue();
      label295: paramQFadeImageView.setTag(paramTextView1);
      paramTextView1 = new az(this.rvs.tag);
      paramTextView1.oyB = localn.field_createTime;
      if (localTimeLineObject.xfI.wbJ != 1)
        break label697;
      paramQFadeImageView.setVisibility(0);
      af.cnC().a(localTimeLineObject.xfI.wbK, paramQFadeImageView, this.czX.hashCode(), g.a.qIG, paramTextView1);
      label367: if ((localn.cnn()) && (localn.cqW()))
      {
        paramTextView3.setVisibility(0);
        paramTextView3.setBackgroundResource(2130839814);
        paramQFadeImageView.setLongClickable(true);
      }
      if (paramInt2 == 1)
      {
        if ((localTimeLineObject.xfI.wbK == null) || (localTimeLineObject.xfI.wbK.size() <= 1))
          break label820;
        paramd.rwa.setVisibility(0);
        paramTextView2.setVisibility(0);
        paramInt1 = localTimeLineObject.xfI.wbK.size();
        paramTextView2.setText(this.czX.getResources().getQuantityString(2131361820, paramInt1, new Object[] { Integer.valueOf(paramInt1) }));
      }
    }
    while (true)
    {
      paramQFadeImageView = localTimeLineObject.xfF;
      if ((paramQFadeImageView != null) && (!paramQFadeImageView.equals("")))
      {
        paramd.rwa.setVisibility(0);
        paramd.qZb.setVisibility(0);
        paramd.qZb.setText(String.valueOf(paramQFadeImageView));
        paramd.qZb.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.czX, paramQFadeImageView, paramd.qZb.getTextSize()));
      }
      AppMethodBeat.o(39224);
      return;
      label571: localObject = ((com.tencent.mm.n.a)localObject).Oj();
      break;
      if (!aj.ab(localn.field_localPrivate, this.czr))
        break label235;
      paramTextView3.setVisibility(0);
      paramTextView3.setBackgroundResource(2130839816);
      localObject = this.rqa.aoO(localn.field_userName);
      if (localObject == null);
      for (localObject = ""; ; localObject = ((com.tencent.mm.n.a)localObject).Oj())
      {
        if ((localObject == null) || (((String)localObject).equals("")) || (this.userName.equals(localn.field_userName)))
          break label687;
        paramTextView1.setVisibility(0);
        paramTextView1.setText((CharSequence)localObject);
        break;
      }
      label687: break label235;
      label689: paramTextView1.position = 0;
      break label295;
      label697: if (localTimeLineObject.xfI.wbJ == 2)
      {
        paramTextView4.setText(bo.bc(localTimeLineObject.xfI.Desc, ""));
        paramTextView4.setVisibility(0);
        break label367;
      }
      if (localTimeLineObject.xfI.wbJ != 21)
        break label367;
      localn.cqM();
      boolean bool = true;
      if (this.czr)
        bool = true;
      while (true)
      {
        paramQFadeImageView.setVisibility(0);
        af.cnC().a(localTimeLineObject.xfI.wbK, paramQFadeImageView, this.czX.hashCode(), g.a.qIG, paramTextView1, bool);
        break;
        if (com.tencent.mm.plugin.sns.lucky.a.m.a(localn, localcbf))
          bool = false;
      }
      label820: paramTextView2.setVisibility(8);
    }
  }

  private void a(TextView paramTextView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39221);
    int i = paramInt1 / 10000;
    paramInt2 /= 10000;
    ab.d("MicroMsg.SnsphotoAdapter", "preHead: %d, preYear: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
    if ((i == 0) || (paramInt2 != i))
    {
      dN(paramTextView);
      paramTextView.setText(String.format(this.czX.getResources().getString(2131303851), new Object[] { Integer.valueOf(paramInt2) }));
      paramTextView.setVisibility(0);
    }
    AppMethodBeat.o(39221);
  }

  private void a(TextView paramTextView1, TextView paramTextView2, long paramLong)
  {
    AppMethodBeat.i(39220);
    Object localObject = this.czX;
    boolean bool;
    if (!this.nJy.equals("en"))
    {
      bool = true;
      localObject = (String)aw.a((Context)localObject, 1000L * paramLong, bool);
      if (((String)localObject).indexOf(":") <= 0)
        break label139;
      localObject = ((String)localObject).split(":");
      if (localObject[1].length() < 2)
        localObject[1] = ("0" + localObject[1]);
      paramTextView1.setText(localObject[0]);
      paramTextView2.setText(localObject[1]);
      paramTextView2.setVisibility(0);
      paramTextView1.setVisibility(0);
      AppMethodBeat.o(39220);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label139: if (((String)localObject).indexOf("/") > 0)
      {
        localObject = ((String)localObject).split("/");
        if (localObject[1].length() < 2)
          localObject[1] = ("0" + localObject[1]);
        localObject[0] = aw.x(this.czX, localObject[0], this.nJy);
        paramTextView1.setText(localObject[0]);
        paramTextView2.setText(localObject[1]);
        paramTextView2.setVisibility(0);
        paramTextView1.setVisibility(0);
        AppMethodBeat.o(39220);
      }
      else
      {
        paramTextView2.setVisibility(0);
        paramTextView2.setText(String.valueOf(localObject));
        AppMethodBeat.o(39220);
      }
    }
  }

  private void dN(View paramView)
  {
    AppMethodBeat.i(39222);
    int i = ((Integer)paramView.getTag()).intValue();
    LinearLayout.LayoutParams localLayoutParams;
    if ((paramView.getLayoutParams() instanceof LinearLayout.LayoutParams))
    {
      localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
      if (i == 0)
      {
        localLayoutParams.topMargin = 0;
        paramView.setLayoutParams(localLayoutParams);
        AppMethodBeat.o(39222);
      }
    }
    while (true)
    {
      return;
      localLayoutParams.topMargin = this.czX.getResources().getDimensionPixelSize(2131428687);
      paramView.setLayoutParams(localLayoutParams);
      AppMethodBeat.o(39222);
    }
  }

  private void kJ(long paramLong)
  {
    AppMethodBeat.i(39229);
    Object localObject = i.jW(af.cnF().a(paramLong, af.cnv().Yc(this.userName), this.userName, this.czr));
    if (this.rmL.equals(""))
    {
      this.lQD = ((String)localObject);
      localObject = af.cnJ().YX(this.userName).cqL();
      if (((aao)localObject).wfM != 0L)
        break label104;
      AppMethodBeat.o(39229);
    }
    while (true)
    {
      label81: return;
      if (((String)localObject).compareTo(this.rmL) < 0)
        break label161;
      localObject = this.rmL;
      break;
      label104: localObject = i.jW(((aao)localObject).wfM);
      if (!this.lQD.equals(""))
        break label138;
      this.lQD = ((String)localObject);
      AppMethodBeat.o(39229);
    }
    label138: if (((String)localObject).compareTo(this.lQD) > 0);
    while (true)
    {
      this.lQD = ((String)localObject);
      AppMethodBeat.o(39229);
      break label81;
      label161: break;
      localObject = this.lQD;
    }
  }

  private void ll(boolean paramBoolean)
  {
    AppMethodBeat.i(39225);
    ab.d("MicroMsg.SnsphotoAdapter", "limitSeq " + this.lQD);
    if (this.rvw != null)
      this.rvw.g(this.lQD, this.rvv, paramBoolean);
    AppMethodBeat.o(39225);
  }

  public final void crP()
  {
    AppMethodBeat.i(39227);
    ll(true);
    notifyDataSetChanged();
    AppMethodBeat.o(39227);
  }

  public final void ctK()
  {
    AppMethodBeat.i(39228);
    ab.d("MicroMsg.SnsphotoAdapter", "i addSize ");
    if (this.list.isEmpty());
    for (long l = 0L; ; l = ((n)this.list.get(this.list.size() - 1)).field_snsId)
    {
      kJ(l);
      AppMethodBeat.o(39228);
      return;
    }
  }

  public final ArrayList<b> fv(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39231);
    ArrayList localArrayList = new ArrayList();
    this.rvC = paramInt2;
    for (paramInt2 = 0; paramInt2 < this.list.size(); paramInt2++)
    {
      n localn = (n)this.list.get(paramInt2);
      int i = localn.reX;
      if ((localn.cqu() != null) && (localn.cqu().xfI != null) && (localn.cqu().xfI.wbK.size() != 0) && ((localn.cqu().xfI.wbJ == 1) || (localn.cqu().xfI.wbJ == 15)))
      {
        if (i == paramInt1)
          this.rvC = localArrayList.size();
        Iterator localIterator = localn.cqu().xfI.wbK.iterator();
        for (int j = 0; localIterator.hasNext(); j++)
        {
          bau localbau = (bau)localIterator.next();
          b localb = new b();
          localb.cNr = localbau;
          localb.qQd = com.tencent.mm.plugin.sns.storage.v.ap("sns_table_", i);
          localb.fDG = localn.field_createTime;
          localb.qQe = j;
          localArrayList.add(localb);
        }
      }
    }
    AppMethodBeat.o(39231);
    return localArrayList;
  }

  public final int getCount()
  {
    return this.rgh;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(39230);
    Object localObject = this.list.get(paramInt);
    AppMethodBeat.o(39230);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(39223);
    if ((this.czr) && (paramInt == 0))
    {
      ab.d("MicroMsg.SnsphotoAdapter", "position isSelf " + paramInt + " - 0");
      AppMethodBeat.o(39223);
      paramInt = 0;
      return paramInt;
    }
    if (this.rgf.get(Integer.valueOf(paramInt)) != null);
    for (int i = ((Integer)this.rgf.get(Integer.valueOf(paramInt))).intValue(); ; i = -1)
    {
      if (i == -1)
      {
        ab.e("MicroMsg.SnsphotoAdapter", "unknow error ".concat(String.valueOf(i)));
        AppMethodBeat.o(39223);
        paramInt = 0;
        break;
      }
      n localn = (n)getItem(i);
      if (localn.cqu().xfI.wbJ == 1)
      {
        ab.d("MicroMsg.SnsphotoAdapter", "position " + paramInt + " - 0");
        AppMethodBeat.o(39223);
        paramInt = 0;
        break;
      }
      if (localn.cqu().xfI.wbJ == 15)
      {
        ab.d("MicroMsg.SnsphotoAdapter", "position " + paramInt + " - 2");
        paramInt = 2;
        AppMethodBeat.o(39223);
        break;
      }
      if (localn.cqu().xfI.wbJ == 21)
      {
        paramInt = 3;
        AppMethodBeat.o(39223);
        break;
      }
      AppMethodBeat.o(39223);
      paramInt = 1;
      break;
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(39219);
    int i = getItemViewType(paramInt);
    ab.i("MicroMsg.SnsphotoAdapter", "position ".concat(String.valueOf(i)));
    Object localObject1;
    int j;
    if (i == 0)
    {
      if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof as.d)))
      {
        paramViewGroup = new as.d(this);
        paramView = com.tencent.mm.ui.v.hu(this.czX).inflate(2130970788, null);
        paramViewGroup.rvI = ((TextView)paramView.findViewById(2131827945));
        paramViewGroup.rvH = ((TextView)paramView.findViewById(2131827946));
        paramViewGroup.rvJ = ((TextView)paramView.findViewById(2131827947));
        paramViewGroup.rvS = ((MaskImageView)paramView.findViewById(2131827686));
        paramViewGroup.rvT = ((QFadeImageView)paramView.findViewById(2131827823));
        paramViewGroup.rvU = ((MaskImageView)paramView.findViewById(2131827687));
        paramViewGroup.rvV = ((MaskImageView)paramView.findViewById(2131827688));
        paramViewGroup.qZb = ((TextView)paramView.findViewById(2131821095));
        paramViewGroup.rvW = ((TextView)paramView.findViewById(2131827824));
        paramViewGroup.rvX = ((TextView)paramView.findViewById(2131827829));
        paramViewGroup.rvY = ((TextView)paramView.findViewById(2131827832));
        paramViewGroup.rvZ = ((TextView)paramView.findViewById(2131827827));
        paramViewGroup.rwa = paramView.findViewById(2131827826);
        paramViewGroup.rvM = ((TextView)paramView.findViewById(2131820733));
        paramViewGroup.rvK = ((LinearLayout)paramView.findViewById(2131827819));
        paramViewGroup.rvL = ((ImageView)paramView.findViewById(2131827820));
        paramViewGroup.rgx = ((LinearLayout)paramView.findViewById(2131827683));
        paramViewGroup.rgy = paramView.findViewById(2131827682);
        paramViewGroup.rvT.setOnClickListener(this.rvu.rgo);
        paramViewGroup.rvS.setOnClickListener(this.rvu.rgo);
        paramViewGroup.rvU.setOnClickListener(this.rvu.rgp);
        paramViewGroup.rvV.setOnClickListener(this.rvu.rgq);
        paramViewGroup.rvS.setOnLongClickListener(this.rvu.rwl);
        paramViewGroup.rvU.setOnLongClickListener(this.rvu.rwl);
        paramViewGroup.rvV.setOnLongClickListener(this.rvu.rwl);
        paramViewGroup.rwb = ((TextView)paramView.findViewById(2131827825));
        paramViewGroup.rwc = ((TextView)paramView.findViewById(2131827830));
        paramViewGroup.rwd = ((TextView)paramView.findViewById(2131827833));
        paramViewGroup.rwe = ((TextView)paramView.findViewById(2131827822));
        paramViewGroup.rwf = ((TextView)paramView.findViewById(2131827828));
        paramViewGroup.rwg = ((TextView)paramView.findViewById(2131827831));
        paramViewGroup.rwh = ((MaskLinearLayout)paramView.findViewById(2131827821));
        paramViewGroup.rwh.b(paramViewGroup.rvS);
        paramViewGroup.rvN = ((LinearLayout)paramView.findViewById(2131827817));
        paramViewGroup.rvO = ((TextView)paramView.findViewById(2131827818));
        paramViewGroup.rvO.setOnClickListener(new as.3(this));
        paramView.setTag(paramViewGroup);
      }
      while (true)
      {
        af.cnC().dz(paramViewGroup.rvS);
        af.cnC().dz(paramViewGroup.rvU);
        af.cnC().dz(paramViewGroup.rvV);
        i = -1;
        if (this.rgf.get(Integer.valueOf(paramInt)) != null)
          i = ((Integer)this.rgf.get(Integer.valueOf(paramInt))).intValue();
        paramViewGroup.init();
        paramViewGroup.rvJ.setTag(Integer.valueOf(paramInt));
        paramViewGroup.rwh.settouchEnable(false);
        paramViewGroup.rwh.setBackgroundResource(0);
        paramViewGroup.rwh.setDescendantFocusability(131072);
        paramViewGroup.rwh.setClickable(false);
        paramViewGroup.rvS.settouchEnable(true);
        paramViewGroup.rvS.setClickable(true);
        paramViewGroup.rvS.setLongClickable(false);
        paramViewGroup.rvU.setLongClickable(false);
        paramViewGroup.rvV.setLongClickable(false);
        paramViewGroup.rwh.setOnClickListener(null);
        paramViewGroup.rwh.setOnLongClickListener(null);
        paramViewGroup.rwh.setLongClickable(false);
        if ((i < this.rgi) && (i != -1))
          break;
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
        paramView.setVisibility(8);
        AppMethodBeat.o(39219);
        return paramView;
        paramViewGroup = (as.d)paramView.getTag();
      }
      if (i - 1 < 0)
        break label6105;
      localObject1 = (n)getItem(i - 1);
      j = ((n)localObject1).field_head;
      aj.ab(((n)localObject1).field_localPrivate, this.czr);
    }
    label1318: label1325: label3501: label5557: 
    while (true)
    {
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
      paramView.setVisibility(0);
      if (this.rgg.get(Integer.valueOf(paramInt)) != null);
      label1082: label4543: label6081: for (int k = ((Integer)this.rgg.get(Integer.valueOf(paramInt))).intValue(); ; k = 1)
      {
        localObject1 = (n)getItem(i);
        Object localObject2 = ((n)localObject1).cqu();
        long l;
        if (((this.czr) && (paramInt == 0)) || (j == -1) || (((n)localObject1).field_head != j))
        {
          l = ((n)localObject1).field_createTime;
          a(paramViewGroup.rvH, paramViewGroup.rvI, l);
          if (((TimeLineObject)localObject2).xfG != null)
          {
            localObject2 = ((TimeLineObject)localObject2).xfG.guP;
            if ((localObject2 != null) && (!((String)localObject2).equals("")))
            {
              paramViewGroup.rvM.setText((CharSequence)localObject2);
              paramViewGroup.rvM.setVisibility(0);
            }
          }
          paramViewGroup.rgy.setVisibility(0);
        }
        a(paramViewGroup.rvJ, j, ((n)localObject1).field_head);
        if ((this.rvB != 0L) && (((n)localObject1).field_snsId == this.rvB))
        {
          paramViewGroup.rvN.setVisibility(0);
          paramViewGroup.rvK.setVisibility(0);
          if ((!this.czr) || (paramInt != 0))
            break label1325;
          paramViewGroup.rvT.setVisibility(0);
          paramViewGroup.rvT.setContentDescription(this.czX.getString(2131303814));
          paramViewGroup.rvS.setVisibility(8);
          localObject2 = paramViewGroup.qZb;
          if (this.rgh != 1)
            break label1318;
        }
        for (localObject1 = this.czX.getString(2131303852); ; localObject1 = "")
        {
          ((TextView)localObject2).setText((CharSequence)localObject1);
          paramViewGroup.qZb.setVisibility(0);
          paramViewGroup.rwa.setVisibility(0);
          paramViewGroup.rvZ.setVisibility(8);
          af.cnC().a(paramViewGroup.rvT, 2131690507, 2130840301, this.czX.hashCode());
          localObject1 = new f.a();
          ((f.a)localObject1).cNE = -1;
          ((f.a)localObject1).position = -1;
          paramViewGroup.rvT.setTag(localObject1);
          AppMethodBeat.o(39219);
          break;
          if ((this.rvB == 0L) && (this.rvA != 0L) && (((n)localObject1).field_snsId <= this.rvA))
          {
            paramViewGroup.rvN.setVisibility(0);
            this.rvB = ((n)localObject1).field_snsId;
            break label1082;
          }
          paramViewGroup.rvN.setVisibility(8);
          break label1082;
        }
        if (k > 0)
          a(i, paramViewGroup.rvS, paramViewGroup.rvW, paramViewGroup.rvZ, paramViewGroup.rwb, paramViewGroup.rwe, 1, paramViewGroup, paramInt);
        if (k >= 2)
          a(i + 1, paramViewGroup.rvU, paramViewGroup.rvX, paramViewGroup.rvZ, paramViewGroup.rwc, paramViewGroup.rwf, 2, paramViewGroup, paramInt);
        if (k >= 3)
          a(i + 2, paramViewGroup.rvV, paramViewGroup.rvY, paramViewGroup.rvZ, paramViewGroup.rwd, paramViewGroup.rwg, 3, paramViewGroup, paramInt);
        if (k == 1)
        {
          localObject2 = (n)getItem(i);
          if ((!bo.isNullOrNil(((n)localObject2).cqu().xfF)) && (((n)localObject2).field_type == 1))
          {
            paramViewGroup.rwh.setDescendantFocusability(393216);
            paramViewGroup.rwh.setClickable(true);
            paramViewGroup.rvS.setClickable(false);
            paramViewGroup.rvS.settouchEnable(false);
            paramViewGroup.rwh.setOnClickListener(this.rvu.rgo);
            paramViewGroup.rwh.settouchEnable(true);
            i = ((n)localObject1).reX;
            localObject1 = new f.a();
            ((f.a)localObject1).cNE = i;
            if (this.rvt.get(Integer.valueOf(paramInt)) == null)
              break label1645;
          }
        }
        label1645: for (((f.a)localObject1).position = ((Integer)this.rvt.get(Integer.valueOf(paramInt))).intValue(); ; ((f.a)localObject1).position = 0)
        {
          if ((((n)localObject2).cnn()) && (((n)localObject2).cqW()))
            paramViewGroup.rwh.setOnLongClickListener(this.rvu.rwl);
          paramViewGroup.rwh.setTag(localObject1);
          paramView.setDrawingCacheEnabled(false);
          AppMethodBeat.o(39219);
          break;
        }
        if (i == 2)
          if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof as.e)))
          {
            paramViewGroup = new as.e(this);
            paramView = com.tencent.mm.ui.v.hu(this.czX).inflate(2130970800, null);
            paramViewGroup.rvI = ((TextView)paramView.findViewById(2131827945));
            paramViewGroup.rvH = ((TextView)paramView.findViewById(2131827946));
            paramViewGroup.rvJ = ((TextView)paramView.findViewById(2131827947));
            paramViewGroup.rvS = ((MaskImageView)paramView.findViewById(2131827686));
            paramViewGroup.rvM = ((TextView)paramView.findViewById(2131820733));
            paramViewGroup.rvK = ((LinearLayout)paramView.findViewById(2131827819));
            paramViewGroup.rvL = ((ImageView)paramView.findViewById(2131827820));
            paramViewGroup.rgx = ((LinearLayout)paramView.findViewById(2131827683));
            paramViewGroup.rgy = paramView.findViewById(2131827682);
            paramViewGroup.rvS.setOnClickListener(this.rvu.rwk);
            paramViewGroup.rwb = ((TextView)paramView.findViewById(2131827825));
            paramViewGroup.rwh = ((MaskLinearLayout)paramView.findViewById(2131827821));
            paramViewGroup.rwh.b(paramViewGroup.rvS);
            paramViewGroup.qZb = ((TextView)paramView.findViewById(2131821095));
            paramViewGroup.rwa = paramView.findViewById(2131827826);
            paramViewGroup.rvN = ((LinearLayout)paramView.findViewById(2131827817));
            paramViewGroup.rvO = ((TextView)paramView.findViewById(2131827818));
            paramViewGroup.rvO.setOnClickListener(new as.2(this));
            paramView.setTag(paramViewGroup);
            af.cnC().dz(paramViewGroup.rvS);
            if (this.rgf.get(Integer.valueOf(paramInt)) == null)
              break label6093;
          }
        label5569: label5828: label6093: for (i = ((Integer)this.rgf.get(Integer.valueOf(paramInt))).intValue(); ; i = -1)
        {
          paramViewGroup.init();
          paramViewGroup.rvJ.setTag(Integer.valueOf(paramInt));
          paramViewGroup.rwh.settouchEnable(false);
          paramViewGroup.rwh.setBackgroundResource(0);
          paramViewGroup.rwh.setDescendantFocusability(131072);
          paramViewGroup.rwh.setClickable(false);
          paramViewGroup.rvS.settouchEnable(true);
          paramViewGroup.rvS.setClickable(true);
          paramViewGroup.rwh.setOnClickListener(null);
          if ((i >= this.rgi) || (i == -1))
          {
            paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
            paramView.setVisibility(8);
            AppMethodBeat.o(39219);
            break;
            paramViewGroup = (as.e)paramView.getTag();
            break label1954;
          }
          if (i - 1 >= 0)
          {
            localObject1 = (n)getItem(i - 1);
            j = ((n)localObject1).field_head;
            aj.ab(((n)localObject1).field_localPrivate, this.czr);
          }
          while (true)
          {
            paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            paramView.setVisibility(0);
            if (this.rgg.get(Integer.valueOf(paramInt)) != null)
              ((Integer)this.rgg.get(Integer.valueOf(paramInt))).intValue();
            localObject1 = (n)getItem(i);
            localObject2 = ((n)localObject1).cqu();
            Object localObject3;
            if (((this.czr) && (paramInt == 0)) || (j == -1) || (((n)localObject1).field_head != j))
            {
              l = ((n)localObject1).field_createTime;
              a(paramViewGroup.rvH, paramViewGroup.rvI, l);
              if (((TimeLineObject)localObject2).xfG != null)
              {
                localObject3 = ((TimeLineObject)localObject2).xfG.guP;
                if ((localObject3 != null) && (!((String)localObject3).equals("")))
                {
                  paramViewGroup.rvM.setText((CharSequence)localObject3);
                  paramViewGroup.rvM.setVisibility(0);
                }
              }
              paramViewGroup.rgy.setVisibility(0);
            }
            a(paramViewGroup.rvJ, j, ((n)localObject1).field_head);
            if ((this.rvB != 0L) && (((n)localObject1).field_snsId == this.rvB))
            {
              paramViewGroup.rvN.setVisibility(0);
              label2393: paramViewGroup.rvK.setVisibility(0);
              localObject3 = new az(this.rvs.tag);
              ((az)localObject3).oyB = ((n)localObject1).field_createTime;
              paramViewGroup.rvS.setVisibility(0);
              af.cnC().a(((TimeLineObject)localObject2).xfI.wbK, paramViewGroup.rvS, this.czX.hashCode(), g.a.qIG, (az)localObject3);
              if (aj.ab(((n)localObject1).field_localPrivate, this.czr))
              {
                paramViewGroup.rwb.setVisibility(0);
                paramViewGroup.rwb.setBackgroundResource(2130839816);
                localObject2 = this.rqa.aoO(((n)localObject1).field_userName);
                if (localObject2 != null)
                  ((com.tencent.mm.n.a)localObject2).Oj();
              }
              localObject2 = ((n)getItem(i)).cqu().xfF;
              if ((localObject2 != null) && (!((String)localObject2).equals("")))
              {
                paramViewGroup.rwa.setVisibility(0);
                paramViewGroup.qZb.setVisibility(0);
                paramViewGroup.qZb.setText(String.valueOf(localObject2));
                paramViewGroup.qZb.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.czX, (CharSequence)localObject2, paramViewGroup.qZb.getTextSize()));
              }
              paramViewGroup.rwh.setDescendantFocusability(393216);
              paramViewGroup.rwh.setClickable(true);
              paramViewGroup.rvS.setClickable(false);
              paramViewGroup.rvS.settouchEnable(false);
              paramViewGroup.rwh.setOnClickListener(this.rvu.rwk);
              paramViewGroup.rwh.settouchEnable(true);
              i = ((n)localObject1).reX;
              localObject1 = new f.a();
              ((f.a)localObject1).cNE = i;
              if (this.rvt.get(Integer.valueOf(paramInt)) == null)
                break label2813;
            }
            label2813: for (((f.a)localObject1).position = ((Integer)this.rvt.get(Integer.valueOf(paramInt))).intValue(); ; ((f.a)localObject1).position = 0)
            {
              paramViewGroup.rwh.setTag(localObject1);
              paramView.setDrawingCacheEnabled(false);
              AppMethodBeat.o(39219);
              break;
              if ((this.rvB == 0L) && (this.rvA != 0L) && (((n)localObject1).field_snsId <= this.rvA))
              {
                paramViewGroup.rvN.setVisibility(0);
                this.rvB = ((n)localObject1).field_snsId;
                break label2393;
              }
              paramViewGroup.rvN.setVisibility(8);
              break label2393;
            }
            if (i == 3)
            {
              if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof as.d)))
              {
                paramViewGroup = new as.d(this);
                paramView = com.tencent.mm.ui.v.hu(this.czX).inflate(2130970788, null);
                paramViewGroup.rvI = ((TextView)paramView.findViewById(2131827945));
                paramViewGroup.rvH = ((TextView)paramView.findViewById(2131827946));
                paramViewGroup.rvJ = ((TextView)paramView.findViewById(2131827947));
                paramViewGroup.rvS = ((MaskImageView)paramView.findViewById(2131827686));
                paramViewGroup.rvT = ((QFadeImageView)paramView.findViewById(2131827823));
                paramViewGroup.rvU = ((MaskImageView)paramView.findViewById(2131827687));
                paramViewGroup.rvV = ((MaskImageView)paramView.findViewById(2131827688));
                paramViewGroup.qZb = ((TextView)paramView.findViewById(2131821095));
                paramViewGroup.rvW = ((TextView)paramView.findViewById(2131827824));
                paramViewGroup.rvX = ((TextView)paramView.findViewById(2131827829));
                paramViewGroup.rvY = ((TextView)paramView.findViewById(2131827832));
                paramViewGroup.rvZ = ((TextView)paramView.findViewById(2131827827));
                paramViewGroup.rwa = paramView.findViewById(2131827826);
                paramViewGroup.rvM = ((TextView)paramView.findViewById(2131820733));
                paramViewGroup.rvK = ((LinearLayout)paramView.findViewById(2131827819));
                paramViewGroup.rvL = ((ImageView)paramView.findViewById(2131827820));
                paramViewGroup.rgx = ((LinearLayout)paramView.findViewById(2131827683));
                paramViewGroup.rgy = paramView.findViewById(2131827682);
                paramViewGroup.rvT.setOnClickListener(this.rvu.rwj);
                paramViewGroup.rvS.setOnClickListener(this.rvu.rwj);
                paramViewGroup.rwb = ((TextView)paramView.findViewById(2131827825));
                paramViewGroup.rwc = ((TextView)paramView.findViewById(2131827830));
                paramViewGroup.rwd = ((TextView)paramView.findViewById(2131827833));
                paramViewGroup.rwe = ((TextView)paramView.findViewById(2131827822));
                paramViewGroup.rwf = ((TextView)paramView.findViewById(2131827828));
                paramViewGroup.rwg = ((TextView)paramView.findViewById(2131827831));
                paramViewGroup.rwh = ((MaskLinearLayout)paramView.findViewById(2131827821));
                paramViewGroup.rwh.b(paramViewGroup.rvS);
                paramViewGroup.rvN = ((LinearLayout)paramView.findViewById(2131827817));
                paramViewGroup.rvO = ((TextView)paramView.findViewById(2131827818));
                paramViewGroup.rvO.setOnClickListener(new as.5(this));
                paramView.setTag(paramViewGroup);
              }
              while (true)
              {
                af.cnC().dz(paramViewGroup.rvS);
                af.cnC().dz(paramViewGroup.rvU);
                af.cnC().dz(paramViewGroup.rvV);
                i = -1;
                if (this.rgf.get(Integer.valueOf(paramInt)) != null)
                  i = ((Integer)this.rgf.get(Integer.valueOf(paramInt))).intValue();
                paramViewGroup.init();
                paramViewGroup.rvJ.setTag(Integer.valueOf(paramInt));
                paramViewGroup.rwh.settouchEnable(false);
                paramViewGroup.rwh.setBackgroundResource(0);
                paramViewGroup.rwh.setDescendantFocusability(131072);
                paramViewGroup.rwh.setClickable(false);
                paramViewGroup.rvS.settouchEnable(true);
                paramViewGroup.rvS.setClickable(true);
                paramViewGroup.rwh.setOnClickListener(null);
                if ((i < this.rgi) && (i != -1))
                  break label3501;
                paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
                paramView.setVisibility(8);
                AppMethodBeat.o(39219);
                break;
                paramViewGroup = (as.d)paramView.getTag();
              }
              if (i - 1 < 0)
                break label6081;
              localObject1 = (n)getItem(i - 1);
              j = ((n)localObject1).field_head;
              aj.ab(((n)localObject1).field_localPrivate, this.czr);
            }
            while (true)
            {
              paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
              paramView.setVisibility(0);
              localObject1 = (n)getItem(i);
              localObject2 = ((n)localObject1).cqu();
              if (((this.czr) && (paramInt == 0)) || (j == -1) || (((n)localObject1).field_head != j))
              {
                l = ((n)localObject1).field_createTime;
                a(paramViewGroup.rvH, paramViewGroup.rvI, l);
                if (((TimeLineObject)localObject2).xfG != null)
                {
                  localObject2 = ((TimeLineObject)localObject2).xfG.guP;
                  if ((localObject2 != null) && (!((String)localObject2).equals("")))
                  {
                    paramViewGroup.rvM.setText((CharSequence)localObject2);
                    paramViewGroup.rvM.setVisibility(0);
                  }
                }
                paramViewGroup.rgy.setVisibility(0);
              }
              a(paramViewGroup.rvJ, j, ((n)localObject1).field_head);
              if ((this.rvB != 0L) && (((n)localObject1).field_snsId == this.rvB))
              {
                paramViewGroup.rvN.setVisibility(0);
                paramViewGroup.rvK.setVisibility(0);
                if ((!this.czr) || (paramInt != 0))
                  break label3973;
                paramViewGroup.rvT.setVisibility(0);
                paramViewGroup.rvT.setContentDescription(this.czX.getString(2131303814));
                paramViewGroup.rvS.setVisibility(8);
                localObject2 = paramViewGroup.qZb;
                if (this.rgh != 1)
                  break label3966;
              }
              label3966: for (localObject1 = this.czX.getString(2131303852); ; localObject1 = "")
              {
                ((TextView)localObject2).setText((CharSequence)localObject1);
                paramViewGroup.qZb.setVisibility(0);
                paramViewGroup.rwa.setVisibility(0);
                paramViewGroup.rvZ.setVisibility(8);
                af.cnC().a(paramViewGroup.rvT, 2131690507, 2130840301, this.czX.hashCode());
                localObject1 = new f.a();
                ((f.a)localObject1).cNE = -1;
                ((f.a)localObject1).position = -1;
                paramViewGroup.rvT.setTag(localObject1);
                AppMethodBeat.o(39219);
                break;
                if ((this.rvB == 0L) && (this.rvA != 0L) && (((n)localObject1).field_snsId <= this.rvA))
                {
                  paramViewGroup.rvN.setVisibility(0);
                  this.rvB = ((n)localObject1).field_snsId;
                  break label3730;
                }
                paramViewGroup.rvN.setVisibility(8);
                break label3730;
              }
              a(i, paramViewGroup.rvS, paramViewGroup.rvW, paramViewGroup.rvZ, paramViewGroup.rwb, paramViewGroup.rwe, 1, paramViewGroup, paramInt);
              localObject2 = (n)getItem(i);
              if ((!bo.isNullOrNil(((n)localObject2).cqu().xfF)) && (((n)localObject2).field_type == 1))
              {
                paramViewGroup.rwh.setDescendantFocusability(393216);
                paramViewGroup.rwh.setClickable(true);
                paramViewGroup.rvS.setClickable(false);
                paramViewGroup.rvS.settouchEnable(false);
                paramViewGroup.rwh.setOnClickListener(this.rvu.rwj);
                paramViewGroup.rwh.settouchEnable(true);
                i = ((n)localObject1).reX;
                localObject1 = new f.a();
                ((f.a)localObject1).cNE = i;
                if (this.rvt.get(Integer.valueOf(paramInt)) == null)
                  break label4178;
              }
              label4178: for (((f.a)localObject1).position = ((Integer)this.rvt.get(Integer.valueOf(paramInt))).intValue(); ; ((f.a)localObject1).position = 0)
              {
                paramViewGroup.rwh.setTag(localObject1);
                paramView.setDrawingCacheEnabled(false);
                AppMethodBeat.o(39219);
                break;
              }
              if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof as.b)))
              {
                localObject2 = new as.b(this);
                paramView = com.tencent.mm.ui.v.hu(this.czX).inflate(2130970787, null);
                ((as.b)localObject2).rvG = paramView.findViewById(2131821839);
                ((as.b)localObject2).rvI = ((TextView)paramView.findViewById(2131827945));
                ((as.b)localObject2).rvH = ((TextView)paramView.findViewById(2131827946));
                ((as.b)localObject2).rvJ = ((TextView)paramView.findViewById(2131827947));
                ((as.b)localObject2).rvM = ((TextView)paramView.findViewById(2131820733));
                ((as.b)localObject2).rgy = paramView.findViewById(2131827682);
                ((as.b)localObject2).rvM = ((TextView)paramView.findViewById(2131820733));
                ((as.b)localObject2).rvK = ((LinearLayout)paramView.findViewById(2131827819));
                ((as.b)localObject2).rvL = ((ImageView)paramView.findViewById(2131827820));
                ((as.b)localObject2).rgx = ((LinearLayout)paramView.findViewById(2131827683));
                ((as.b)localObject2).hrg = ((TextView)paramView.findViewById(2131820991));
                ((as.b)localObject2).rvP = ((TagImageView)paramView.findViewById(2131825687));
                ((as.b)localObject2).rhd = ((ImageView)paramView.findViewById(2131824637));
                ((as.b)localObject2).gne = ((TextView)paramView.findViewById(2131825689));
                ((as.b)localObject2).rvQ = ((TextView)paramView.findViewById(2131825690));
                ((as.b)localObject2).rvG.setOnClickListener(this.rvu.rwi);
                ((as.b)localObject2).rvR = paramView.findViewById(2131827798);
                ((as.b)localObject2).rvN = ((LinearLayout)paramView.findViewById(2131827817));
                ((as.b)localObject2).rvO = ((TextView)paramView.findViewById(2131827818));
                ((as.b)localObject2).rvO.setOnClickListener(new as.4(this));
                paramView.setTag(localObject2);
                i.b(((as.b)localObject2).rvP, this.czX);
                ((as.b)localObject2).rvJ.setTag(Integer.valueOf(paramInt));
                if (this.rgf.get(Integer.valueOf(paramInt)) == null)
                  break label6075;
              }
              for (i = ((Integer)this.rgf.get(Integer.valueOf(paramInt))).intValue(); ; i = -1)
              {
                ((as.b)localObject2).init();
                if ((i >= this.rgi) || (i == -1))
                {
                  paramView.setLayoutParams(new AbsListView.LayoutParams(-1, 1));
                  paramView.setVisibility(8);
                  AppMethodBeat.o(39219);
                  break;
                  localObject2 = (as.b)paramView.getTag();
                  break label4543;
                }
                paramView.setVisibility(0);
                if (i - 1 >= 0)
                {
                  paramViewGroup = (n)getItem(i - 1);
                  j = paramViewGroup.field_head;
                  aj.ab(paramViewGroup.field_localPrivate, this.czr);
                }
                while (true)
                {
                  paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                  paramView.setVisibility(0);
                  if (this.rgg.get(Integer.valueOf(paramInt)) != null)
                    ((Integer)this.rgg.get(Integer.valueOf(paramInt))).intValue();
                  Object localObject4 = (n)getItem(i);
                  localObject3 = ((n)localObject4).cqu();
                  if (((this.czr) && (paramInt == 0)) || (j == -1) || (((n)localObject4).field_head != j))
                  {
                    l = ((n)localObject4).field_createTime;
                    a(((as.b)localObject2).rvH, ((as.b)localObject2).rvI, l);
                    if (((TimeLineObject)localObject3).xfG != null)
                    {
                      paramViewGroup = ((TimeLineObject)localObject3).xfG.guP;
                      if ((paramViewGroup != null) && (!paramViewGroup.equals("")))
                      {
                        ((as.b)localObject2).rvM.setText(paramViewGroup);
                        ((as.b)localObject2).rvM.setVisibility(0);
                      }
                    }
                    ((as.b)localObject2).rgy.setVisibility(0);
                  }
                  a(((as.b)localObject2).rvJ, j, ((n)localObject4).field_head);
                  if ((this.rvB != 0L) && (((n)localObject4).field_snsId == this.rvB))
                  {
                    ((as.b)localObject2).rvN.setVisibility(0);
                    paramViewGroup = new f.a();
                    paramViewGroup.cNE = ((n)localObject4).reX;
                    if (this.rvt.get(Integer.valueOf(paramInt)) == null)
                      break label5233;
                    paramViewGroup.position = ((Integer)this.rvt.get(Integer.valueOf(paramInt))).intValue();
                    label4978: ((as.b)localObject2).rvG.setTag(paramViewGroup);
                    if (bo.isNullOrNil(((TimeLineObject)localObject3).xfF))
                      break label5241;
                    ((as.b)localObject2).hrg.setVisibility(0);
                    ((as.b)localObject2).hrg.setText(((TimeLineObject)localObject3).xfF);
                    ((as.b)localObject2).hrg.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.czX, ((TimeLineObject)localObject3).xfF, ((as.b)localObject2).hrg.getTextSize()));
                  }
                  az localaz;
                  while (true)
                  {
                    ((as.b)localObject2).rvK.setVisibility(0);
                    ((as.b)localObject2).hrg.setSingleLine(true);
                    ((as.b)localObject2).rvR.setVisibility(0);
                    paramInt = ((TimeLineObject)localObject3).xfI.wbJ;
                    localaz = new az(this.rvs.tag);
                    localaz.oyB = ((n)localObject4).field_createTime;
                    if (paramInt != 2)
                      break label5254;
                    ((as.b)localObject2).hrg.setVisibility(0);
                    ((as.b)localObject2).hrg.setSingleLine(false);
                    ((as.b)localObject2).hrg.setMaxLines(2);
                    ((as.b)localObject2).rvR.setVisibility(8);
                    break;
                    if ((this.rvB == 0L) && (this.rvA != 0L) && (((n)localObject4).field_snsId <= this.rvA))
                    {
                      ((as.b)localObject2).rvN.setVisibility(0);
                      this.rvB = ((n)localObject4).field_snsId;
                      break label4922;
                    }
                    ((as.b)localObject2).rvN.setVisibility(8);
                    break label4922;
                    label5233: paramViewGroup.position = 0;
                    break label4978;
                    label5241: ((as.b)localObject2).hrg.setVisibility(8);
                  }
                  if (paramInt == 4)
                  {
                    if (!((TimeLineObject)localObject3).xfI.wbK.isEmpty())
                    {
                      ((as.b)localObject2).rvP.setVisibility(0);
                      ((as.b)localObject2).rhd.setVisibility(0);
                      ((as.b)localObject2).rvR.setVisibility(0);
                      ((as.b)localObject2).gne.setMaxLines(1);
                      ((as.b)localObject2).gne.setTextColor(this.czX.getResources().getColor(2131690481));
                      localObject1 = (bau)((TimeLineObject)localObject3).xfI.wbK.get(0);
                      af.cnC().a((bau)localObject1, ((as.b)localObject2).rvP, 2131230800, this.czX.hashCode(), g.a.qIG, localaz);
                      ((as.b)localObject2).rhd.setPressed(false);
                      if (ZH(((TimeLineObject)localObject3).Id))
                      {
                        ((as.b)localObject2).rhd.setImageResource(2130839637);
                        ((as.b)localObject2).rvP.setTag(localObject3);
                        ((as.b)localObject2).rvP.setOnClickListener(this.rvD);
                        ((bau)localObject1).cNE = ((n)localObject4).reX;
                        ((as.b)localObject2).rvR.setTag(localObject3);
                        localObject3 = ((bau)localObject1).Desc;
                        if (bo.isNullOrNil((String)localObject3))
                          break label5557;
                        ((as.b)localObject2).rvQ.setVisibility(0);
                        ((as.b)localObject2).rvQ.setText((CharSequence)localObject3);
                      }
                      while (true)
                      {
                        localObject1 = ((bau)localObject1).Title;
                        if (bo.isNullOrNil((String)localObject1))
                          break label5569;
                        ((as.b)localObject2).gne.setVisibility(0);
                        ((as.b)localObject2).gne.setTag(paramViewGroup);
                        ((as.b)localObject2).gne.setOnTouchListener(new aa());
                        ((as.b)localObject2).gne.setText((CharSequence)localObject1);
                        break;
                        ((as.b)localObject2).rhd.setImageResource(2130839639);
                        break label5406;
                        ((as.b)localObject2).rvQ.setVisibility(4);
                      }
                      ((as.b)localObject2).gne.setVisibility(8);
                      break;
                    }
                    ((as.b)localObject2).rvR.setVisibility(8);
                    break;
                  }
                  ((as.b)localObject2).gne.setTextColor(this.czX.getResources().getColor(2131690427));
                  if ((am.a.coe() & 0x1) <= 0)
                  {
                    paramInt = 1;
                    label5626: if (paramInt == 0)
                      break label5932;
                    paramViewGroup = au.ZI(((TimeLineObject)localObject3).xfI.Url);
                    localObject1 = ((TimeLineObject)localObject3).xfI.Title;
                    if ((localObject1 == null) || (((String)localObject1).length() <= 40))
                      break label6066;
                    localObject1 = ((String)localObject1).substring(0, 40) + "...";
                  }
                  while (true)
                  {
                    if (((as.b)localObject2).rvP != null)
                      ((as.b)localObject2).rvP.setOnClickListener(null);
                    ((as.b)localObject2).rhd.setVisibility(8);
                    if (!((TimeLineObject)localObject3).xfI.wbK.isEmpty())
                    {
                      ((as.b)localObject2).rvP.setVisibility(0);
                      localObject4 = (bau)((TimeLineObject)localObject3).xfI.wbK.get(0);
                      if (((TimeLineObject)localObject3).xfI.wbJ == 5)
                      {
                        paramViewGroup = au.ZI(((bau)localObject4).Url);
                        localObject1 = ((bau)localObject4).Title;
                        ((as.b)localObject2).rhd.setVisibility(0);
                        af.cnC().a((bau)localObject4, ((as.b)localObject2).rvP, 2131230817, this.czX.hashCode(), g.a.qIG, localaz);
                        if (bo.isNullOrNil(paramViewGroup))
                          break label6015;
                        ((as.b)localObject2).rvQ.setVisibility(0);
                        ((as.b)localObject2).rvQ.setText(paramViewGroup);
                        label5853: if (bo.isNullOrNil((String)localObject1))
                          break label6053;
                        if (((as.b)localObject2).rvQ.getVisibility() != 8)
                          break label6028;
                        ((as.b)localObject2).gne.setMaxLines(2);
                      }
                    }
                    while (true)
                    {
                      ((as.b)localObject2).gne.setVisibility(0);
                      if ((((TimeLineObject)localObject3).fgt & 0x1) <= 0)
                        break label6040;
                      ((as.b)localObject2).gne.setText(i.a((String)localObject1, this.czX, ((as.b)localObject2).gne));
                      break;
                      paramInt = 0;
                      break label5626;
                      paramViewGroup = "";
                      break label5642;
                      af.cnC().a((bau)localObject4, ((as.b)localObject2).rvP, this.czX.hashCode(), g.a.qIG, localaz);
                      break label5828;
                      if (((TimeLineObject)localObject3).xfI.wbJ != 26)
                      {
                        ((as.b)localObject2).rvP.setVisibility(8);
                        break label5828;
                      }
                      ((as.b)localObject2).rvP.setVisibility(0);
                      ((as.b)localObject2).rvP.setImageResource(2131231726);
                      break label5828;
                      label6015: ((as.b)localObject2).rvQ.setVisibility(8);
                      break label5853;
                      ((as.b)localObject2).gne.setMaxLines(1);
                    }
                    ((as.b)localObject2).gne.setText((CharSequence)localObject1);
                    break;
                    ((as.b)localObject2).gne.setVisibility(8);
                    break;
                  }
                  j = -1;
                }
              }
              j = -1;
            }
            j = -1;
          }
        }
      }
      label4922: label6075: label6105: j = -1;
    }
  }

  public final int getViewTypeCount()
  {
    return 4;
  }

  public final void kI(long paramLong)
  {
    if (0L != this.rvA);
    while (true)
    {
      return;
      this.rvA = paramLong;
      this.rvB = 0L;
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(39226);
    super.notifyDataSetChanged();
    AppMethodBeat.o(39226);
  }

  public static final class f$a
  {
    public int cNE;
    public int position;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as
 * JD-Core Version:    0.6.2
 */