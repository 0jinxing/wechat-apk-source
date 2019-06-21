package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.a.l;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.bos;
import com.tencent.mm.protocal.protobuf.kh;
import com.tencent.mm.protocal.protobuf.ki;
import com.tencent.mm.protocal.protobuf.kj;
import com.tencent.mm.protocal.protobuf.kk;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class BizChatSearchUI$a extends BaseAdapter
  implements com.tencent.mm.ai.f
{
  public static int yEC = 3;
  private int afg;
  private Context context;
  String ema;
  private com.tencent.mm.at.a.a.c fGS;
  String jMp;
  private int scene;
  private int yED;
  boolean yEE;
  boolean yEF;
  private ArrayList<com.tencent.mm.aj.a.c> yEG;
  private ArrayList<Object> yEH;
  private ArrayList<com.tencent.mm.aj.a.c> yEI;
  private BizChatSearchUI.g yEJ;
  private ArrayList<BizChatSearchUI.g> yEK;
  private BizChatSearchUI.g yEL;
  private BizChatSearchUI.g yEM;
  private ArrayList<BizChatSearchUI.g> yEN;
  private BizChatSearchUI.g yEO;
  public boolean yEP;
  public boolean yEQ;
  public boolean yER;
  private boolean yES;
  private int yET;
  public boolean yEU;
  int yEV;

  public BizChatSearchUI$a(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(30138);
    this.yEG = new ArrayList();
    this.yEH = new ArrayList();
    this.yEI = new ArrayList();
    this.yEK = new ArrayList();
    this.yEN = new ArrayList();
    this.yEP = true;
    this.yEQ = false;
    this.yER = false;
    this.yES = true;
    this.yET = 0;
    this.afg = 0;
    this.yEU = false;
    this.yEV = 0;
    this.context = paramContext;
    this.jMp = paramString;
    this.scene = paramInt;
    boolean bool2;
    if ((this.scene == 1) || (this.scene == 2))
    {
      bool2 = true;
      this.yEE = bool2;
      if (this.scene != 1)
      {
        bool2 = bool1;
        if (this.scene != 3);
      }
      else
      {
        bool2 = true;
      }
      this.yEF = bool2;
      if (this.scene != 1)
        break label267;
    }
    label267: for (paramInt = yEC; ; paramInt = 2147483647)
    {
      this.yED = paramInt;
      paramContext = new c.a();
      paramContext.ePK = e.cC(this.jMp);
      paramContext.ePH = true;
      paramContext.ePZ = true;
      paramContext.ePT = 2131231172;
      this.fGS = paramContext.ahG();
      if (this.yEE)
        aw.Rg().a(1364, this);
      AppMethodBeat.o(30138);
      return;
      bool2 = false;
      break;
    }
  }

  private static SpannableString a(Context paramContext, Spannable paramSpannable, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(30144);
    SpannableString localSpannableString = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, paramSpannable, paramInt);
    ForegroundColorSpan[] arrayOfForegroundColorSpan = (ForegroundColorSpan[])paramSpannable.getSpans(0, paramSpannable.length(), ForegroundColorSpan.class);
    if (arrayOfForegroundColorSpan != null)
    {
      int j = arrayOfForegroundColorSpan.length;
      for (paramInt = i; paramInt < j; paramInt++)
      {
        paramContext = arrayOfForegroundColorSpan[paramInt];
        localSpannableString.setSpan(paramContext, paramSpannable.getSpanStart(paramContext), paramSpannable.getSpanEnd(paramContext), paramSpannable.getSpanFlags(paramContext));
      }
    }
    AppMethodBeat.o(30144);
    return localSpannableString;
  }

  private void dAQ()
  {
    AppMethodBeat.i(30143);
    if (dAS())
    {
      this.yEQ = false;
      this.yEU = true;
      dAW();
    }
    AppMethodBeat.o(30143);
  }

  private boolean dAR()
  {
    boolean bool = true;
    if (this.scene == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  private boolean dAT()
  {
    if (this.scene == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void dAU()
  {
    int i = 1;
    AppMethodBeat.i(30147);
    int j = this.yEH.size();
    int k = this.yEI.size();
    boolean bool;
    label72: int m;
    if (this.scene != 2)
    {
      if (this.yEH.size() > this.yED)
      {
        bool = true;
        this.yEP = bool;
      }
    }
    else
    {
      if (this.yEI.size() <= this.yED)
        break label197;
      bool = true;
      this.yES = bool;
      if ((j <= 0) && (!this.yEQ))
        break label219;
      m = Math.min(j, this.yED) + 1;
      if (!dAR())
        break label213;
      if ((!this.yEQ) && (!this.yEP))
        break label203;
      j = 1;
      label124: j += m;
    }
    while (true)
    {
      this.yET = j;
      m = j;
      if (k > 0)
      {
        k = j + 1 + Math.min(k, this.yED);
        m = k;
        if (dAR())
          if (!this.yES)
            break label208;
      }
      label197: label203: label208: for (j = i; ; j = 0)
      {
        m = k + j;
        this.afg = m;
        AppMethodBeat.o(30147);
        return;
        bool = false;
        break;
        bool = false;
        break label72;
        j = 0;
        break label124;
      }
      label213: j = m;
      continue;
      label219: j = 0;
    }
  }

  private void dAV()
  {
    int i = 0;
    AppMethodBeat.i(30150);
    this.yEK.clear();
    this.yEN.clear();
    int k;
    for (int j = 0; ; j++)
    {
      k = i;
      if (j >= Math.min(this.yED, this.yEH.size()))
        break;
      this.yEK.add(new BizChatSearchUI.g(BizChatSearchUI.g.yEZ, this.yEH.get(j)));
    }
    while (k < Math.min(this.yED, this.yEI.size()))
    {
      this.yEN.add(new BizChatSearchUI.g(BizChatSearchUI.g.yFa, this.yEI.get(k)));
      k++;
    }
    AppMethodBeat.o(30150);
  }

  public final BizChatSearchUI.g NZ(int paramInt)
  {
    AppMethodBeat.i(30140);
    BizChatSearchUI.g localg;
    if (paramInt < this.yET)
      if (paramInt == 0)
      {
        if (this.yEJ == null)
          this.yEJ = new BizChatSearchUI.g(BizChatSearchUI.g.yFd, Integer.valueOf(BizChatSearchUI.g.yFf));
        localg = this.yEJ;
        AppMethodBeat.o(30140);
      }
    while (true)
    {
      return localg;
      if ((paramInt == this.yET - 1) && (this.yEQ) && (dAR()))
      {
        if (this.yEL == null)
          this.yEL = new BizChatSearchUI.g();
        this.yEL.klY = BizChatSearchUI.g.yFc;
        this.yEL.data = Integer.valueOf(BizChatSearchUI.g.yFf);
        localg = this.yEL;
        AppMethodBeat.o(30140);
      }
      else if ((paramInt == this.yET - 1) && (this.yEP) && (dAR()))
      {
        if (this.yEL == null)
          this.yEL = new BizChatSearchUI.g();
        this.yEL.klY = BizChatSearchUI.g.yFb;
        this.yEL.data = Integer.valueOf(BizChatSearchUI.g.yFf);
        localg = this.yEL;
        AppMethodBeat.o(30140);
      }
      else
      {
        paramInt--;
        if ((paramInt >= 0) && (paramInt < this.yEK.size()))
        {
          localg = (BizChatSearchUI.g)this.yEK.get(paramInt);
          AppMethodBeat.o(30140);
          continue;
          if (paramInt == this.yET)
          {
            if (this.yEM == null)
              this.yEM = new BizChatSearchUI.g(BizChatSearchUI.g.yFd, Integer.valueOf(BizChatSearchUI.g.yFg));
            localg = this.yEM;
            AppMethodBeat.o(30140);
          }
          else if ((paramInt == this.afg - 1) && (this.yES) && (dAR()))
          {
            if (this.yEO == null)
              this.yEO = new BizChatSearchUI.g(BizChatSearchUI.g.yFb, Integer.valueOf(BizChatSearchUI.g.yFg));
            localg = this.yEO;
            AppMethodBeat.o(30140);
          }
          else
          {
            paramInt = paramInt - this.yET - 1;
            if ((paramInt >= 0) && (paramInt < this.yEN.size()))
            {
              localg = (BizChatSearchUI.g)this.yEN.get(paramInt);
              AppMethodBeat.o(30140);
            }
          }
        }
        else
        {
          localg = new BizChatSearchUI.g();
          AppMethodBeat.o(30140);
        }
      }
    }
  }

  final void aqW(String paramString)
  {
    AppMethodBeat.i(30146);
    if (!this.yEE)
      AppMethodBeat.o(30146);
    while (true)
    {
      return;
      al.n(new BizChatSearchUI.a.1(this, paramString), 200L);
      AppMethodBeat.o(30146);
    }
  }

  final void cf(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(30145);
    paramString = z.aeU().aC(this.jMp, paramString);
    clearData();
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      com.tencent.mm.aj.a.c localc = (com.tencent.mm.aj.a.c)paramString.next();
      bool = localc.isGroup();
      if ((bool) && (this.yEF))
      {
        this.yEI.add(localc);
      }
      else if ((!bool) && (this.yEE))
      {
        this.yEH.add(localc);
        this.yEG.add(localc);
      }
    }
    if (this.yEE)
      if (this.yEH.size() > this.yED)
        break label153;
    label153: for (boolean bool = true; ; bool = false)
    {
      this.yEQ = bool;
      qm(paramBoolean);
      AppMethodBeat.o(30145);
      return;
    }
  }

  final void clearData()
  {
    AppMethodBeat.i(30148);
    this.yEV = 0;
    this.yEH.clear();
    this.yEG.clear();
    this.yEI.clear();
    AppMethodBeat.o(30148);
  }

  final boolean dAS()
  {
    if (this.scene == 2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void dAW()
  {
    AppMethodBeat.i(30151);
    ((BizChatSearchUI)this.context).a(this);
    AppMethodBeat.o(30151);
  }

  public final int getCount()
  {
    return this.afg;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(30139);
    BizChatSearchUI.g localg = NZ(paramInt);
    if (localg != null)
    {
      paramInt = localg.klY;
      AppMethodBeat.o(30139);
    }
    while (true)
    {
      return paramInt;
      paramInt = BizChatSearchUI.g.yEY;
      AppMethodBeat.o(30139);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30141);
    BizChatSearchUI.g localg = NZ(paramInt);
    View localView;
    int j;
    BizChatSearchUI.f localf;
    boolean bool1;
    Object localObject1;
    Object localObject2;
    if ((localg.klY == BizChatSearchUI.g.yEZ) || (localg.klY == BizChatSearchUI.g.yFa))
    {
      localView = paramView;
      if (paramView == null)
      {
        localView = LayoutInflater.from(this.context).inflate(2130969613, paramViewGroup, false);
        int i = paramViewGroup.getPaddingLeft();
        j = paramViewGroup.getPaddingRight();
        localView.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(paramViewGroup.getWidth(), 1073741824), i + j, -1), View.MeasureSpec.makeMeasureSpec(-2, 1073741824));
        paramView = new BizChatSearchUI.f((byte)0);
        paramView.ejo = ((ImageView)localView.findViewById(2131821183));
        paramView.gnB = ((TextView)localView.findViewById(2131821185));
        paramView.gnC = ((TextView)localView.findViewById(2131820991));
        paramView.contentView = localView.findViewById(2131821182);
        localView.setTag(paramView);
      }
      localf = (BizChatSearchUI.f)localView.getTag();
      paramViewGroup = "";
      bool1 = false;
      localObject1 = "";
      if ((localg.data instanceof com.tencent.mm.aj.a.c))
      {
        paramView = (com.tencent.mm.aj.a.c)localg.data;
        if (paramView == null)
          break label1231;
        if (!paramView.isGroup())
        {
          localObject2 = z.aeV().cH(paramView.field_bizChatServId);
          if (localObject2 != null)
          {
            paramViewGroup = ((com.tencent.mm.aj.a.j)localObject2).field_userName;
            paramView = ((com.tencent.mm.aj.a.j)localObject2).field_headImageUrl;
          }
        }
      }
    }
    while (true)
    {
      bool1 = false;
      j = 1;
      while (true)
      {
        if (j != 0)
        {
          paramViewGroup = com.tencent.mm.plugin.fts.a.f.a(paramViewGroup, this.ema);
          paramViewGroup = a(this.context, paramViewGroup, com.tencent.mm.plugin.fts.ui.b.c.mHw);
          label289: if (!bool1)
            break label563;
          localObject2 = this.context.getString(2131297702);
          localObject1 = com.tencent.mm.plugin.fts.a.f.a((CharSequence)localObject1, this.ema);
        }
        label563: for (localObject1 = TextUtils.concat(new CharSequence[] { localObject2, a(this.context, (Spannable)localObject1, com.tencent.mm.plugin.fts.ui.b.c.mHw) }); ; localObject1 = "")
        {
          boolean bool2 = true;
          bool1 = bool2;
          if (localg.klY == BizChatSearchUI.g.yEZ)
          {
            bool1 = bool2;
            if (paramInt == this.yET - 1)
            {
              bool1 = bool2;
              if (this.yET != this.afg)
                bool1 = false;
            }
          }
          com.tencent.mm.plugin.fts.ui.m.p(localf.contentView, bool1);
          o.ahp().a(paramView, localf.ejo, this.fGS);
          com.tencent.mm.plugin.fts.ui.m.a(paramViewGroup, localf.gnB);
          com.tencent.mm.plugin.fts.ui.m.a((CharSequence)localObject1, localf.gnC);
          AppMethodBeat.o(30141);
          paramView = localView;
          return paramView;
          paramViewGroup = paramView.field_chatName;
          paramView = paramView.field_headImageUrl;
          break;
          if (!(localg.data instanceof kh))
            break label1217;
          localObject1 = (kh)localg.data;
          paramView = ((kh)localObject1).vNe;
          paramViewGroup = paramView.kfT;
          paramView = paramView.vMW;
          bool1 = "userid".equals(((kh)localObject1).vNf);
          if (!bool1);
          for (j = 1; ; j = 0)
          {
            localObject1 = ((kh)localObject1).vNg;
            break;
          }
          paramViewGroup = a(this.context, new SpannableString(paramViewGroup), com.tencent.mm.plugin.fts.ui.b.c.mHw);
          break label289;
        }
        if (localg.klY == BizChatSearchUI.g.yFd)
        {
          localView = paramView;
          if (paramView == null)
          {
            localView = LayoutInflater.from(this.context).inflate(2130969624, paramViewGroup, false);
            paramView = new BizChatSearchUI.b((byte)0);
            paramView.kxr = ((TextView)localView.findViewById(2131822768));
            paramView.mKk = localView.findViewById(2131820896);
            paramView.contentView = localView.findViewById(2131821182);
            localView.setTag(paramView);
          }
          paramViewGroup = (BizChatSearchUI.b)localView.getTag();
          if (((Integer)localg.data).intValue() == BizChatSearchUI.g.yFf)
            paramView = this.context.getResources().getString(2131297700);
        }
        while (true)
        {
          label700: com.tencent.mm.plugin.fts.ui.m.b(paramView, paramViewGroup.kxr);
          if (paramInt == 0)
            paramViewGroup.mKk.setVisibility(8);
          while (true)
          {
            paramViewGroup.contentView.setBackgroundResource(2130839171);
            AppMethodBeat.o(30141);
            paramView = localView;
            break;
            if (((Integer)localg.data).intValue() != BizChatSearchUI.g.yFg)
              break label1210;
            paramView = this.context.getResources().getString(2131297693);
            break label700;
            paramViewGroup.mKk.setVisibility(0);
          }
          if (localg.klY == BizChatSearchUI.g.yFb)
          {
            localView = paramView;
            if (paramView == null)
            {
              localView = LayoutInflater.from(this.context).inflate(2130969636, paramViewGroup, false);
              paramView = new BizChatSearchUI.e((byte)0);
              paramView.mJS = ((TextView)localView.findViewById(2131821051));
              paramView.iqT = ((ImageView)localView.findViewById(2131821226));
              paramView.contentView = localView.findViewById(2131821182);
              localView.setTag(paramView);
            }
            paramViewGroup = (BizChatSearchUI.e)localView.getTag();
            paramView = "";
            if (((Integer)localg.data).intValue() == BizChatSearchUI.g.yFf)
            {
              paramView = this.context.getResources().getString(2131297699);
              label925: if ((((Integer)localg.data).intValue() != BizChatSearchUI.g.yFf) || (this.yET == this.afg))
                break label1204;
            }
          }
          label1198: label1204: for (bool1 = false; ; bool1 = true)
          {
            com.tencent.mm.plugin.fts.ui.m.p(paramViewGroup.contentView, bool1);
            paramViewGroup.mJS.setText(paramView);
            paramViewGroup.iqT.setImageResource(2131231340);
            AppMethodBeat.o(30141);
            paramView = localView;
            break;
            if (((Integer)localg.data).intValue() != BizChatSearchUI.g.yFg)
              break label925;
            paramView = this.context.getResources().getString(2131297698);
            break label925;
            if (localg.klY == BizChatSearchUI.g.yFc)
            {
              localView = paramView;
              if (paramView == null)
              {
                localView = LayoutInflater.from(this.context).inflate(2130969627, paramViewGroup, false);
                paramView = new BizChatSearchUI.d((byte)0);
                paramView.mJS = ((TextView)localView.findViewById(2131821051));
                paramView.contentView = localView.findViewById(2131821182);
                localView.setTag(paramView);
              }
              paramView = (BizChatSearchUI.d)localView.getTag();
              if ((((Integer)localg.data).intValue() != BizChatSearchUI.g.yFf) || (this.yET == this.afg))
                break label1198;
            }
            for (bool1 = false; ; bool1 = true)
            {
              com.tencent.mm.plugin.fts.ui.m.p(paramView.contentView, bool1);
              paramView.mJS.setText(this.context.getResources().getString(2131297695));
              AppMethodBeat.o(30141);
              paramView = localView;
              break;
              paramView = null;
              AppMethodBeat.o(30141);
              break;
            }
          }
          label1210: paramView = "";
        }
        label1217: j = 0;
        paramView = "";
        paramViewGroup = "";
      }
      label1231: paramView = "";
    }
  }

  public final int getViewTypeCount()
  {
    return BizChatSearchUI.g.yFe;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(30142);
    Object localObject1;
    Object localObject2;
    if ((this.yEE) && (paramm.getType() == 1364) && ((paramm instanceof l)))
    {
      this.yER = false;
      localObject1 = (l)paramm;
      if ((((l)localObject1).ehh != null) && (((l)localObject1).ehh.fsG.fsP != null))
      {
        paramString = (ki)((l)localObject1).ehh.fsG.fsP;
        paramm = paramString.ctj;
        localObject2 = paramString.vNb;
        if ((paramm.equals(this.ema)) && (((String)localObject2).equals(this.jMp)) && (this.yEV == paramString.offset))
          break label140;
        AppMethodBeat.o(30142);
      }
      label140: label237: boolean bool;
      while (true)
      {
        return;
        paramString = null;
        break;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          dAQ();
          AppMethodBeat.o(30142);
        }
        else
        {
          if ((((l)localObject1).ehh != null) && (((l)localObject1).ehh.fsH.fsP != null));
          for (paramString = (kj)((l)localObject1).ehh.fsH.fsP; ; paramString = null)
          {
            if ((paramString != null) && (paramString.vNh != null) && (paramString.vNh.ret == 0))
              break label237;
            dAQ();
            AppMethodBeat.o(30142);
            break;
          }
          localObject1 = paramString.vNi;
          bool = paramString.vNj;
          if (!paramm.equals(this.ema))
            break label476;
          this.yEQ = false;
          this.yEV += ((List)localObject1).size();
          if (!dAR())
            break label339;
          if (this.yEH.size() >= this.yEG.size())
            break label322;
          cf(paramm, true);
          AppMethodBeat.o(30142);
        }
      }
      label322: if (this.yEH.size() <= this.yEG.size())
      {
        label339: if (dAS())
          this.yEP = bool;
        if (dAT())
          break label476;
        paramm = ((List)localObject1).iterator();
      }
    }
    label476: label488: 
    while (true)
      label368: if (paramm.hasNext())
      {
        localObject2 = (kh)paramm.next();
        localObject1 = ((kh)localObject2).vNe;
        if (!bo.isNullOrNil(((kk)localObject1).vNc))
        {
          paramString = this.yEG.iterator();
          com.tencent.mm.aj.a.c localc;
          do
          {
            if (!paramString.hasNext())
              break;
            localc = (com.tencent.mm.aj.a.c)paramString.next();
          }
          while (!((kk)localObject1).vNc.equals(localc.field_bizChatServId));
        }
      }
      else
      {
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          if (paramInt1 != 0)
            break label488;
          this.yEH.add(localObject2);
          break label368;
          qm(true);
          AppMethodBeat.o(30142);
          break;
        }
      }
  }

  final void qm(boolean paramBoolean)
  {
    AppMethodBeat.i(30149);
    dAV();
    dAU();
    if (paramBoolean)
    {
      notifyDataSetChanged();
      dAW();
    }
    AppMethodBeat.o(30149);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatSearchUI.a
 * JD-Core Version:    0.6.2
 */