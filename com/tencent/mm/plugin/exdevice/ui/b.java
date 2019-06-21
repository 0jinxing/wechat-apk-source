package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class b extends BaseAdapter
{
  private String igi;
  List<e> lCD;
  Map<String, String> lCE;
  String lCF;
  d lCG;
  private String lCH;
  private boolean lCI;
  private e.a lCJ;
  private View.OnClickListener lCK;
  private View.OnClickListener lCL;
  private View.OnClickListener lCM;
  private Context mContext;

  public b(Context paramContext, String paramString)
  {
    AppMethodBeat.i(20097);
    this.lCI = false;
    this.lCJ = new e.a();
    this.lCK = new b.2(this);
    this.lCL = new b.3(this);
    this.lCM = new b.4(this);
    this.igi = r.Yz();
    this.mContext = paramContext;
    this.lCH = paramString;
    AppMethodBeat.o(20097);
  }

  private List<e> a(ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> paramArrayList, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList1, boolean paramBoolean)
  {
    AppMethodBeat.i(20100);
    Object localObject1 = new LinkedList(paramArrayList);
    paramArrayList = new ArrayList();
    Object localObject2 = h(this.igi, paramArrayList1);
    Object localObject3;
    if (localObject2 != null)
    {
      localObject3 = this.lCJ;
      ((e.a)localObject3).lFy = ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2);
      ((e.a)localObject3).lFz = 3;
      if (((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2).field_score == 0)
        ((com.tencent.mm.plugin.sport.a.b)g.K(com.tencent.mm.plugin.sport.a.b.class)).d((Activity)this.mContext, this.igi);
      if (!paramBoolean)
        break label357;
    }
    Object localObject4;
    label357: for (this.lCJ.auo = 2; ; this.lCJ.auo = 1)
    {
      paramArrayList.add(this.lCJ.bqg());
      localObject2 = this.lCJ;
      ((e.a)localObject2).auo = 0;
      paramArrayList.add(((e.a)localObject2).bqg());
      d((LinkedList)localObject1, this.igi);
      localObject2 = new ArrayList();
      ab.d("MicroMsg.ExdeviceRankAdapter", "ap: follow size %s, %s", new Object[] { Integer.valueOf(((LinkedList)localObject1).size()), ((LinkedList)localObject1).toString() });
      localObject3 = paramArrayList1.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (com.tencent.mm.plugin.exdevice.f.b.a.d)((Iterator)localObject3).next();
        e.a locala = this.lCJ;
        locala.lFy = ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject4);
        locala.auo = 1;
        locala.lFz = 4;
        ((ArrayList)localObject2).add(locala.bqg());
        if ((((LinkedList)localObject1).size() > 0) && (e((LinkedList)localObject1, ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject4).field_username)))
        {
          locala = this.lCJ;
          locala.lFy = ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject4);
          locala.auo = 1;
          locala.lFz = 2;
          paramArrayList.add(locala.bqg());
          d((LinkedList)localObject1, ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject4).field_username);
        }
      }
      localObject2 = this.lCJ;
      ((e.a)localObject2).lFy = null;
      ((e.a)localObject2).lCH = this.lCH;
      ((e.a)localObject2).username = this.igi;
      ((e.a)localObject2).lFz = 7;
      break;
    }
    if (((LinkedList)localObject1).size() > 0)
    {
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (com.tencent.mm.plugin.exdevice.f.b.a.c)((Iterator)localObject1).next();
        localObject3 = this.lCJ;
        ((e.a)localObject3).username = ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject4).field_username;
        ((e.a)localObject3).lCH = this.lCH;
        ((e.a)localObject3).lFy = null;
        ((e.a)localObject3).auo = 1;
        ((e.a)localObject3).lFz = 6;
        paramArrayList.add(((e.a)localObject3).bqg());
      }
    }
    if (paramArrayList.size() > 2)
    {
      ((e)paramArrayList.get(paramArrayList.size() - 1)).lFz = (((e)paramArrayList.get(paramArrayList.size() - 1)).lFz | 0x2 | 0x1);
      localObject1 = this.lCJ;
      ((e.a)localObject1).auo = 0;
      ((e.a)localObject1).lFy = null;
      paramArrayList.add(((e.a)localObject1).bqg());
    }
    if (((ArrayList)localObject2).size() > 1)
      ((e)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1)).lFz = 5;
    paramArrayList.addAll((Collection)localObject2);
    ab.d("MicroMsg.ExdeviceRankAdapter", "rank: %d %s", new Object[] { Integer.valueOf(paramArrayList1.size()), paramArrayList1.toString() });
    ab.d("MicroMsg.ExdeviceRankAdapter", "all: %s %s", new Object[] { Integer.valueOf(paramArrayList.size()), paramArrayList.toString() });
    AppMethodBeat.o(20100);
    return paramArrayList;
  }

  private static void d(LinkedList<com.tencent.mm.plugin.exdevice.f.b.a.c> paramLinkedList, String paramString)
  {
    AppMethodBeat.i(20098);
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      com.tencent.mm.plugin.exdevice.f.b.a.c localc = (com.tencent.mm.plugin.exdevice.f.b.a.c)paramLinkedList.next();
      if (localc.field_username.equalsIgnoreCase(paramString))
      {
        ab.d("MicroMsg.ExdeviceRankAdapter", "username: %s remove", new Object[] { localc.toString() });
        paramLinkedList.remove();
      }
    }
    AppMethodBeat.o(20098);
  }

  private static boolean e(LinkedList<com.tencent.mm.plugin.exdevice.f.b.a.c> paramLinkedList, String paramString)
  {
    AppMethodBeat.i(20099);
    try
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        bool = ((com.tencent.mm.plugin.exdevice.f.b.a.c)paramLinkedList.next()).field_username.equalsIgnoreCase(paramString);
        if (bool)
        {
          bool = true;
          AppMethodBeat.o(20099);
        }
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(20099);
        bool = false;
      }
    }
    catch (Exception paramLinkedList)
    {
      while (true)
      {
        ab.d("MicroMsg.ExdeviceRankAdapter", paramLinkedList.toString());
        AppMethodBeat.o(20099);
        boolean bool = false;
      }
    }
  }

  public static void finish()
  {
    AppMethodBeat.i(20106);
    ((com.tencent.mm.plugin.sport.a.b)g.K(com.tencent.mm.plugin.sport.a.b.class)).cwa();
    AppMethodBeat.o(20106);
  }

  public static com.tencent.mm.plugin.exdevice.f.b.a.d h(String paramString, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList)
  {
    AppMethodBeat.i(20102);
    if (paramArrayList == null)
    {
      AppMethodBeat.o(20102);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = paramArrayList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramArrayList = (com.tencent.mm.plugin.exdevice.f.b.a.d)localIterator.next();
          if (paramString.equalsIgnoreCase(paramArrayList.field_username))
          {
            AppMethodBeat.o(20102);
            paramString = paramArrayList;
            break;
          }
        }
      AppMethodBeat.o(20102);
      paramString = null;
    }
  }

  public final List<e> b(ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> paramArrayList, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList1, boolean paramBoolean)
  {
    AppMethodBeat.i(20101);
    Object localObject = paramArrayList;
    if (paramArrayList == null);
    try
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      paramArrayList = paramArrayList1;
      if (paramArrayList1 == null)
      {
        paramArrayList = new java/util/ArrayList;
        paramArrayList.<init>();
      }
      paramArrayList = a((ArrayList)localObject, paramArrayList, paramBoolean);
      AppMethodBeat.o(20101);
      return paramArrayList;
    }
    catch (Exception paramArrayList)
    {
      while (true)
      {
        ab.w("MicroMsg.ExdeviceRankAdapter", "ap: rank exception,null info");
        paramArrayList = new ArrayList();
        AppMethodBeat.o(20101);
      }
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(20103);
    int i;
    if (this.lCD == null)
    {
      i = 0;
      AppMethodBeat.o(20103);
    }
    while (true)
    {
      return i;
      i = this.lCD.size();
      AppMethodBeat.o(20103);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(20105);
    paramInt = uU(paramInt).auo;
    AppMethodBeat.o(20105);
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(20107);
    com.tencent.mm.plugin.exdevice.f.b.a.d locald = uU(paramInt).lFy;
    Object localObject1 = uU(paramInt);
    int i = getItemViewType(paramInt);
    int j = ((e)localObject1).lFz;
    Object localObject2;
    if (paramView == null)
    {
      localObject1 = LayoutInflater.from(this.mContext);
      switch (i)
      {
      default:
        localObject1 = null;
        paramViewGroup = paramView;
        paramView = (View)localObject1;
        localObject1 = paramView;
        localObject2 = paramViewGroup;
        if (paramView != null)
        {
          paramView.gbS = paramViewGroup.findViewById(2131821064);
          paramView.jOT = paramViewGroup.findViewById(2131823475);
          paramView.ltX = ((TextView)paramViewGroup.findViewById(2131823719));
          paramView.lCP = ((ImageView)paramViewGroup.findViewById(2131823720));
          paramView.lCQ = ((NoMeasuredTextView)paramViewGroup.findViewById(2131823723));
          paramView.lCS = ((TextView)paramViewGroup.findViewById(2131823673));
          paramView.lCT = ((ExdeviceLikeView)paramViewGroup.findViewById(2131823722));
          paramView.lCU = paramViewGroup.findViewById(2131823725);
          paramView.lCW = paramViewGroup.findViewById(2131823721);
          paramView.lCV = paramViewGroup.findViewById(2131823717);
          paramView.lCX = ((TextView)paramViewGroup.findViewById(2131823726));
          if (paramView.lCQ != null)
          {
            paramView.lCQ.setTextSize(0, this.mContext.getResources().getDimension(2131427632));
            paramView.lCQ.setTextColor(this.mContext.getResources().getColor(2131690006));
            paramView.lCQ.setSingleLine(true);
            paramView.lCQ.setShouldEllipsize(true);
          }
          paramViewGroup.setTag(paramView);
          localObject2 = paramViewGroup;
          localObject1 = paramView;
        }
        if ((locald != null) && (localObject1 != null))
          if (!this.igi.equalsIgnoreCase(locald.field_username))
            break label572;
        break;
      case 0:
      case 1:
      case 2:
      }
    }
    label572: for (this.lCI = true; ; this.lCI = false)
    {
      if (i != 2)
        break label580;
      ((b)localObject1).ltX.setText(String.valueOf(locald.field_ranknum));
      ((b)localObject1).lCS.setText(String.valueOf(locald.field_score));
      a.b.r(((b)localObject1).lCP, locald.field_username);
      ((b)localObject1).gbS.setOnClickListener(this.lCL);
      ((b)localObject1).lCX.setOnClickListener(this.lCM);
      AppMethodBeat.o(20107);
      return localObject2;
      paramViewGroup = ((LayoutInflater)localObject1).inflate(2130969445, paramViewGroup, false);
      paramView = new b.a();
      paramView.goc = paramViewGroup.findViewById(2131823725);
      paramViewGroup.setTag(paramView);
      paramView = null;
      break;
      paramViewGroup = ((LayoutInflater)localObject1).inflate(2130969444, paramViewGroup, false);
      paramView = new b();
      paramView.lCR = ((TextView)paramViewGroup.findViewById(2131823724));
      break;
      paramViewGroup = ((LayoutInflater)localObject1).inflate(2130969446, paramViewGroup, false);
      paramView = new b();
      break;
      switch (i)
      {
      default:
        localObject1 = null;
        localObject2 = paramView;
        break;
      case 1:
      case 2:
        localObject1 = (b)paramView.getTag();
        localObject2 = paramView;
        break;
      }
    }
    label580: if (((b)localObject1).lCR != null)
    {
      if ((j & 0x4) != 4)
      {
        ((b)localObject1).lCR.setVisibility(0);
        ((b)localObject1).lCR.setText(this.mContext.getResources().getString(2131299367, new Object[] { Integer.valueOf(locald.field_ranknum) }));
      }
    }
    else
    {
      if (((j & 0x2) == 2) || (!locald.field_username.equalsIgnoreCase(this.lCF)) || (this.igi.equalsIgnoreCase(this.lCF)))
        break label1070;
      ((b)localObject1).jOT.setBackgroundColor(this.mContext.getResources().getColor(2131690000));
      if ((j & 0x1) != 1)
        break label1094;
      ((b)localObject1).lCU.setVisibility(8);
      label717: if (locald.field_ranknum < 100)
        break label1106;
      ((b)localObject1).ltX.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(2131427634));
      label750: if ((j & 0x2) != 2)
        break label1132;
      ((b)localObject1).ltX.setText("");
      if (locald.field_score < 10000)
        break label1161;
      ((b)localObject1).lCS.setTextColor(this.mContext.getResources().getColor(2131690005));
      ((b)localObject1).lCS.setText(String.valueOf(locald.field_score));
      a.b.r(((b)localObject1).lCP, locald.field_username);
      if (this.lCI)
        break label1185;
      aw.ZK();
      if ((com.tencent.mm.model.c.XM().aoJ(locald.field_username)) || (this.lCE == null) || (bo.isNullOrNil((String)this.lCE.get(locald.field_username))))
        break label1185;
      ((b)localObject1).lCQ.setText(j.b(this.mContext, (CharSequence)this.lCE.get(locald.field_username), ((b)localObject1).lCQ.getTextSize()));
      ((b)localObject1).lCT.setLikeNum(locald.field_likecount);
      if (!this.lCI)
        break label1231;
      if (locald.field_likecount == 0)
        break label1219;
      ((b)localObject1).lCT.setSelfLikeState(1);
      label964: if ((locald.field_score <= 0) && (!this.lCI))
        break label1247;
      ((b)localObject1).lCT.setClickable(true);
      ((b)localObject1).lCT.setOnLikeViewClickListener(new b.1(this, locald));
    }
    while (true)
    {
      label641: label699: ((b)localObject1).lCV.setTag(Integer.valueOf(paramInt));
      label769: label801: ((b)localObject1).lCV.setOnClickListener(this.lCK);
      label927: ((b)localObject1).lCW.setTag(Integer.valueOf(paramInt));
      ((b)localObject1).lCW.setOnClickListener(this.lCK);
      break;
      ((b)localObject1).lCR.setVisibility(8);
      break label641;
      label1070: ((b)localObject1).jOT.setBackgroundColor(this.mContext.getResources().getColor(2131689999));
      break label699;
      label1094: ((b)localObject1).lCU.setVisibility(0);
      break label717;
      label1106: ((b)localObject1).ltX.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(2131427633));
      break label750;
      label1132: ((b)localObject1).ltX.setText(locald.field_ranknum);
      break label769;
      label1161: ((b)localObject1).lCS.setTextColor(this.mContext.getResources().getColor(2131690004));
      break label801;
      label1185: ((b)localObject1).lCQ.setText(j.b(this.mContext, s.mJ(locald.field_username), ((b)localObject1).lCQ.getTextSize()));
      break label927;
      label1219: ((b)localObject1).lCT.setSelfLikeState(0);
      break label964;
      label1231: ((b)localObject1).lCT.setSelfLikeState(locald.field_selfLikeState);
      break label964;
      label1247: ((b)localObject1).lCT.setClickable(false);
    }
  }

  public final int getViewTypeCount()
  {
    return 3;
  }

  public final boolean isEnabled(int paramInt)
  {
    return false;
  }

  public final e uU(int paramInt)
  {
    AppMethodBeat.i(20104);
    e locale = (e)this.lCD.get(paramInt);
    AppMethodBeat.o(20104);
    return locale;
  }

  static final class b
  {
    public View gbS;
    public View jOT;
    public ImageView lCP;
    public NoMeasuredTextView lCQ;
    public TextView lCR;
    public TextView lCS;
    public ExdeviceLikeView lCT;
    public View lCU;
    public View lCV;
    public View lCW;
    public TextView lCX;
    public TextView ltX;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.b
 * JD-Core Version:    0.6.2
 */