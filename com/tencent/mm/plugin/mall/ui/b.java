package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mall.a.j;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.plugin.wallet_core.model.mall.d;
import com.tencent.mm.plugin.wallet_core.model.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends BaseAdapter
{
  private Context mContext;
  private LayoutInflater mInflater;
  private SparseArray<String> okS;
  private int okT;
  b.d olA;
  private boolean olB;
  private int olC;
  private int olD;
  private boolean olE;
  private boolean olF;
  private final int olw;
  private final int olx;
  private final int oly;
  List<ArrayList<b.c>> olz;

  public b(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(43137);
    this.olw = 3;
    this.olx = 9;
    this.oly = 3;
    this.olz = new ArrayList();
    this.okS = null;
    this.olB = true;
    this.olC = 0;
    this.olD = 0;
    this.olE = false;
    this.olF = false;
    this.mContext = paramContext;
    this.okT = paramInt;
    this.mInflater = LayoutInflater.from(this.mContext);
    AppMethodBeat.o(43137);
  }

  private void a(int paramInt1, b.b paramb, int paramInt2)
  {
    AppMethodBeat.i(43142);
    List localList = (List)this.olz.get(paramInt1);
    localList.get(0);
    int i;
    Object localObject;
    int j;
    int k;
    int m;
    if (localList.size() > 0)
    {
      i = ((b.c)localList.get(0)).omd.type;
      localObject = yo(i);
      j = 0;
      k = 0;
      if (bo.isNullOrNil((String)localObject))
        break label677;
      if (paramInt1 == 0)
      {
        m = 1;
        if (paramInt1 != this.olz.size() - 1)
          break label352;
        paramInt1 = 1;
      }
    }
    while (true)
    {
      label104: if (m != 0)
      {
        paramb.olV.setText((CharSequence)localObject);
        paramb.olV.setVisibility(0);
        paramb.olW.setVisibility(8);
        paramb.olX.setVisibility(0);
        paramb.olV.setMinHeight(a.bMY());
        paramb.olX.setBackgroundColor(c.bNr());
        localObject = paramb.olU;
        ((LinearLayout)localObject).setFocusable(true);
        m = 0;
        if (m >= 3)
          break label671;
        if ((m >= ((LinearLayout)localObject).getChildCount()) || (((LinearLayout)localObject).getChildAt(m) == null))
          break label520;
        paramb = ((LinearLayout)localObject).getChildAt(m);
        paramb.setVisibility(0);
        if (m >= localList.size())
          break label456;
        a(paramb, (b.c)localList.get(m), m, paramInt2);
        label249: if ((paramInt2 != 0) || (paramInt1 == 0))
          break label652;
        if (m != 0)
          break label627;
        paramb.setBackground(this.mContext.getResources().getDrawable(2130839465));
      }
      label520: label652: 
      while (true)
      {
        label163: label178: m++;
        break label178;
        m = k;
        if (((ArrayList)this.olz.get(paramInt1 - 1)).size() <= 0)
          break;
        m = k;
        if (i == ((b.c)((ArrayList)this.olz.get(paramInt1 - 1)).get(0)).omd.type)
          break;
        m = 1;
        break;
        label352: j = m;
        if (i == ((b.c)((ArrayList)this.olz.get(paramInt1 + 1)).get(0)).omd.type)
          break label677;
        paramInt1 = 1;
        break label104;
        paramb.olV.setVisibility(8);
        paramb.olW.setVisibility(8);
        paramb.olX.setVisibility(8);
        break label163;
        paramb.olV.setVisibility(8);
        paramb.olW.setVisibility(8);
        paramb.olX.setVisibility(8);
        paramInt1 = 0;
        break label163;
        label456: ((LinearLayout)localObject).getChildAt(m).setFocusable(true);
        ((LinearLayout)localObject).getChildAt(m).setOnClickListener(null);
        a locala = (a)((LinearLayout)localObject).getChildAt(m).getTag();
        locala.olJ.setVisibility(4);
        paramb.setEnabled(false);
        paramb.setClickable(false);
        a(locala);
        break label249;
        paramb = p((ViewGroup)localObject);
        if (m < localList.size())
          a(paramb, (b.c)localList.get(m), m, paramInt2);
        while (true)
        {
          ((LinearLayout)localObject).addView(paramb, new LinearLayout.LayoutParams(-2, a.bMW(), 1.0F));
          break;
          paramb.setFocusable(true);
          locala = (a)paramb.getTag();
          locala.olJ.setVisibility(4);
          paramb.setOnClickListener(null);
          paramb.setEnabled(false);
          paramb.setClickable(false);
          a(locala);
        }
        label627: if (m != 1)
          paramb.setBackground(this.mContext.getResources().getDrawable(2130839466));
        else
          paramb.setBackground(this.mContext.getResources().getDrawable(2130839467));
      }
      label671: AppMethodBeat.o(43142);
      return;
      label677: paramInt1 = 0;
      m = j;
    }
  }

  private void a(View paramView, b.c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(43148);
    if (paramView == null)
    {
      AppMethodBeat.o(43148);
      return;
    }
    a locala = (a)paramView.getTag();
    MallFunction localMallFunction = paramc.omd;
    int i = paramc.ome;
    locala.olP = localMallFunction.olP;
    locala.olO = localMallFunction.olO;
    com.tencent.mm.plugin.mall.b.a.d(locala.olK, locala.olO, 2131231562);
    locala.olM.setText(localMallFunction.cOI);
    locala.olL.setVisibility(8);
    if ((localMallFunction.tDn != null) && (!bo.isNullOrNil(localMallFunction.tDn.tDv)) && (b(localMallFunction)))
    {
      if (d.cQX().acK(localMallFunction.pFP) != null)
      {
        ab.w("MicroMsg.FunctionListAdapter", "show the news : " + d.cQX().acK(localMallFunction.pFP).tDv);
        locala.olN.setText(localMallFunction.tDn.tDv);
        locala.olN.setVisibility(0);
      }
      while (true)
      {
        com.tencent.mm.plugin.mall.b.a.n(locala.olL, locala.olP);
        locala.olL.setVisibility(0);
        paramView.setOnClickListener(new b.2(this, i, localMallFunction));
        locala.olJ.setVisibility(0);
        paramView.setEnabled(true);
        paramView.setClickable(true);
        a(locala, paramInt1, paramInt2);
        AppMethodBeat.o(43148);
        break;
        locala.olN.setVisibility(4);
      }
    }
    if ((localMallFunction.tDn != null) && (localMallFunction.tDn.tDA == 1))
    {
      locala.olN.setText(localMallFunction.tDn.tDv);
      locala.olN.setVisibility(0);
    }
    while (true)
    {
      locala.olL.setImageBitmap(null);
      locala.olL.setVisibility(8);
      break;
      locala.olN.setText("");
      locala.olN.setVisibility(4);
    }
  }

  private static void a(a parama)
  {
    AppMethodBeat.i(43144);
    parama.olQ.setVisibility(0);
    parama.olR.setVisibility(4);
    parama.olS.setVisibility(4);
    parama.olT.setVisibility(4);
    AppMethodBeat.o(43144);
  }

  private static void a(a parama, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(43145);
    parama.olT.setVisibility(4);
    if (paramInt1 == 0)
    {
      parama.olR.setVisibility(0);
      if (paramInt2 != 0)
        break label85;
      parama.olQ.setVisibility(0);
      parama.olS.setVisibility(4);
      AppMethodBeat.o(43145);
    }
    while (true)
    {
      return;
      if (paramInt1 == 1)
      {
        parama.olR.setVisibility(0);
        break;
      }
      if (paramInt1 != 2)
        break;
      parama.olR.setVisibility(4);
      break;
      label85: if (paramInt2 == 1)
      {
        parama.olQ.setVisibility(4);
        parama.olS.setVisibility(0);
        AppMethodBeat.o(43145);
      }
      else
      {
        parama.olQ.setVisibility(0);
        parama.olS.setVisibility(0);
        AppMethodBeat.o(43145);
      }
    }
  }

  public static boolean a(MallFunction paramMallFunction)
  {
    AppMethodBeat.i(43147);
    boolean bool;
    if ((paramMallFunction.tDn != null) && (!bo.isNullOrNil(paramMallFunction.tDn.tDv)) && (b(paramMallFunction)) && (d.cQX().acK(paramMallFunction.pFP) != null))
    {
      bool = true;
      AppMethodBeat.o(43147);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(43147);
    }
  }

  private static boolean b(MallFunction paramMallFunction)
  {
    boolean bool = false;
    AppMethodBeat.i(43149);
    MallNews localMallNews = d.cQX().acK(paramMallFunction.pFP);
    if ((localMallNews == null) || (bo.isNullOrNil(localMallNews.ssr)) || (!localMallNews.ssr.equals(paramMallFunction.tDn.ssr)))
    {
      ab.d("MicroMsg.FunctionListAdapter", "old news null or should be replaced %s %s", new Object[] { paramMallFunction.tDn.ssr, paramMallFunction.cOI });
      d.cQX().b(paramMallFunction.tDn);
      AppMethodBeat.o(43149);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (localMallNews != null)
      {
        if (!"0".equals(localMallNews.tDt))
        {
          ab.d("MicroMsg.FunctionListAdapter", "still old news or clicked, then should not show");
          AppMethodBeat.o(43149);
        }
        else
        {
          ab.d("MicroMsg.FunctionListAdapter", "still old news and should show");
          AppMethodBeat.o(43149);
          bool = true;
        }
      }
      else
        AppMethodBeat.o(43149);
    }
  }

  private boolean bMZ()
  {
    AppMethodBeat.i(43146);
    boolean bool;
    if (this.olz.size() > 3)
    {
      Object localObject = (ArrayList)this.olz.get(3);
      if ((localObject != null) && (((ArrayList)localObject).size() > 0))
      {
        int i = ((b.c)((ArrayList)localObject).get(0)).omd.type;
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          b.c localc = (b.c)((Iterator)localObject).next();
          if (localc.omd.type == i)
            if (a(localc.omd))
            {
              bool = true;
              AppMethodBeat.o(43146);
            }
        }
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(43146);
      bool = false;
    }
  }

  private View p(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43143);
    a locala = new a();
    paramViewGroup = this.mInflater.inflate(2130970030, paramViewGroup, false);
    locala.olJ = paramViewGroup.findViewById(2131825759);
    locala.olK = ((ImageView)paramViewGroup.findViewById(2131825762));
    locala.olM = ((TextView)paramViewGroup.findViewById(2131825763));
    locala.olN = ((TextView)paramViewGroup.findViewById(2131825764));
    locala.olL = ((ImageView)paramViewGroup.findViewById(2131825760));
    locala.olQ = ((ImageView)paramViewGroup.findViewById(2131825086));
    locala.olR = ((ImageView)paramViewGroup.findViewById(2131825766));
    locala.olS = ((ImageView)paramViewGroup.findViewById(2131825132));
    locala.olT = ((ImageView)paramViewGroup.findViewById(2131825765));
    paramViewGroup.setTag(locala);
    AppMethodBeat.o(43143);
    return paramViewGroup;
  }

  private boolean yn(int paramInt)
  {
    AppMethodBeat.i(43140);
    int i;
    boolean bool;
    if (this.olC > 9)
    {
      i = 0;
      int j = 0;
      while (i <= paramInt)
      {
        j += ((ArrayList)this.olz.get(i)).size();
        i++;
      }
      if (this.olD > 3)
      {
        i = 3;
        if (j < 9)
          break label118;
        if ((!this.olB) || (paramInt != i))
          break label97;
        bool = true;
      }
    }
    while (true)
    {
      AppMethodBeat.o(43140);
      return bool;
      i = this.olD;
      break;
      label97: if ((paramInt == this.olD) && (!this.olB))
        bool = true;
      else
        label118: bool = false;
    }
  }

  private String yo(int paramInt)
  {
    AppMethodBeat.i(43150);
    String str;
    if (this.okS == null)
    {
      str = null;
      AppMethodBeat.o(43150);
    }
    while (true)
    {
      return str;
      str = (String)this.okS.get(paramInt);
      AppMethodBeat.o(43150);
    }
  }

  public final void J(ArrayList<MallFunction> paramArrayList)
  {
    AppMethodBeat.i(43138);
    this.olz.clear();
    if (paramArrayList != null)
    {
      int i = 0;
      ArrayList localArrayList;
      while (i < paramArrayList.size())
      {
        localArrayList = new ArrayList();
        for (int j = 0; (j < 3) && (i + j < paramArrayList.size()); j++)
        {
          if (j > 0)
          {
            int k = i + j - 1;
            if ((k >= 0) && (((MallFunction)paramArrayList.get(k)).type != ((MallFunction)paramArrayList.get(i + j)).type))
              break;
          }
          b.c localc = new b.c(this);
          localc.ome = (i + j);
          localc.omd = ((MallFunction)paramArrayList.get(i + j));
          localArrayList.add(localc);
        }
        if (localArrayList.size() > 0)
          this.olz.add(localArrayList);
        i += j;
      }
      this.olC = 0;
      this.olD = 0;
      paramArrayList = this.olz.iterator();
      i = -1;
      if (paramArrayList.hasNext())
      {
        localArrayList = (ArrayList)paramArrayList.next();
        if (localArrayList.size() <= 0)
          break label359;
        if ((i == -1) || (i == ((b.c)localArrayList.get(0)).omd.type))
        {
          this.olC += localArrayList.size();
          this.olD += 1;
          i = ((b.c)localArrayList.get(0)).omd.type;
        }
      }
    }
    label359: 
    while (true)
    {
      break;
      this.olD -= 1;
      this.okS = j.bMV().yl(this.okT).okS;
      this.olE = bMZ();
      ab.i("MicroMsg.FunctionListAdapter", "hasMoreNewAtFirstSectionBottom: %s", new Object[] { Boolean.valueOf(this.olE) });
      notifyDataSetChanged();
      AppMethodBeat.o(43138);
      return;
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(43139);
    int i = this.olz.size();
    AppMethodBeat.o(43139);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 3;
    AppMethodBeat.i(43141);
    boolean bool1 = yn(paramInt);
    if (this.olC > 9)
      if (this.olD <= 3);
    for (int j = i; ; j = -1)
    {
      if ((!bool1) && (paramInt + 1 < this.olz.size()));
      for (boolean bool2 = yn(paramInt + 1); ; bool2 = false)
      {
        if (bool1)
          i = 1;
        while (true)
        {
          label74: Object localObject;
          if (paramView == null)
          {
            paramView = new b.b(this);
            paramViewGroup = this.mInflater.inflate(2130970024, paramViewGroup, false);
            paramView.olU = ((LinearLayout)paramViewGroup.findViewById(2131825740));
            paramView.olV = ((TextView)paramViewGroup.findViewById(2131825739));
            paramView.olW = paramViewGroup.findViewById(2131821128);
            paramView.olX = paramViewGroup.findViewById(2131825738);
            paramView.olY = paramViewGroup.findViewById(2131825741);
            paramView.oma = ((TextView)paramViewGroup.findViewById(2131825742));
            paramView.olZ = ((ImageView)paramViewGroup.findViewById(2131825743));
            paramView.omb = paramViewGroup.findViewById(2131825744);
            paramView.omc = paramViewGroup.findViewById(2131825745);
            paramView.olY.setOnClickListener(new b.1(this));
            paramViewGroup.setTag(paramView);
            localObject = paramView;
            label234: if (!bool1)
              break label500;
            ((b.b)localObject).olV.setVisibility(8);
            ((b.b)localObject).olW.setVisibility(8);
            ((b.b)localObject).olX.setVisibility(8);
            ((b.b)localObject).olY.setVisibility(0);
            ((b.b)localObject).olZ.setImageResource(2131232120);
            ((b.b)localObject).oma.setText(this.mContext.getString(2131301320));
            if ((!this.olE) || (this.olF))
              break label437;
            ((b.b)localObject).omb.setVisibility(0);
            label330: if (!this.olB)
              break label450;
            ((b.b)localObject).olU.setVisibility(8);
            ((b.b)localObject).oma.setText(this.mContext.getString(2131301320));
            label365: if (paramInt != getCount() - 1)
              break label630;
            ((b.b)localObject).omc.setBackgroundColor(c.bNr());
            ((b.b)localObject).omc.setVisibility(0);
          }
          while (true)
          {
            AppMethodBeat.o(43141);
            return paramViewGroup;
            i = this.olD;
            break;
            if (!bool2)
              break label643;
            i = 2;
            break label74;
            localObject = (b.b)paramView.getTag();
            paramViewGroup = paramView;
            break label234;
            label437: ((b.b)localObject).omb.setVisibility(8);
            break label330;
            label450: ((b.b)localObject).olU.setVisibility(0);
            a(paramInt, (b.b)localObject, i);
            ((b.b)localObject).olZ.setImageResource(2131232121);
            ((b.b)localObject).oma.setText(this.mContext.getString(2131301319));
            break label365;
            label500: if ((j > 0) && (this.olB) && (paramInt >= j) && (paramInt <= this.olD))
            {
              ((b.b)localObject).olU.setVisibility(8);
              ((b.b)localObject).olY.setVisibility(8);
              ((b.b)localObject).omb.setVisibility(8);
              ((b.b)localObject).olV.setVisibility(8);
              ((b.b)localObject).olW.setVisibility(8);
              ((b.b)localObject).olX.setVisibility(8);
              break label365;
            }
            ((b.b)localObject).olU.setVisibility(0);
            a(paramInt, (b.b)localObject, i);
            ((b.b)localObject).olY.setVisibility(8);
            ((b.b)localObject).omb.setVisibility(8);
            break label365;
            label630: ((b.b)localObject).omc.setVisibility(8);
          }
          label643: i = 0;
        }
      }
    }
  }

  final class a
  {
    public View olJ = null;
    public ImageView olK = null;
    public ImageView olL = null;
    public TextView olM = null;
    public TextView olN = null;
    public String olO = null;
    public String olP = null;
    public ImageView olQ = null;
    public ImageView olR = null;
    public ImageView olS = null;
    public ImageView olT = null;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.b
 * JD-Core Version:    0.6.2
 */