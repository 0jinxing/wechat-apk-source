package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j extends BaseAdapter
{
  public static int MAX_COUNT = 44;
  public static int vkC = 5;
  private boolean cEH;
  private List<String> cFX;
  u eih;
  boolean ekq;
  private com.tencent.mm.at.a.a.c elH;
  private Context mContext;
  boolean mgP;
  private List<ad> sBb;
  private String username;
  j.a vkD;
  private ArrayList<ad> vkE;
  boolean vkF;
  boolean vkG;
  private List<Object> vkH;
  int vkI;
  int vkJ;
  d vkK;
  public boolean vkL;
  public boolean vkM;
  public boolean vkN;
  private boolean vkO;
  boolean vkP;
  int vkQ;
  String vkR;
  private final int vkS;
  public boolean vkT;
  private boolean vkU;
  boolean vkV;
  public boolean vkW;

  public j(Context paramContext)
  {
    AppMethodBeat.i(79744);
    this.cFX = new ArrayList();
    this.vkE = new ArrayList();
    this.mgP = false;
    this.vkF = false;
    this.vkG = false;
    this.sBb = new ArrayList();
    this.vkH = new ArrayList();
    this.vkI = 0;
    this.vkJ = 0;
    this.vkL = false;
    this.vkM = false;
    this.vkN = false;
    this.vkO = true;
    this.vkP = false;
    this.vkQ = 12;
    this.vkT = false;
    this.elH = null;
    this.vkU = true;
    this.vkV = true;
    this.vkW = false;
    this.mContext = paramContext;
    this.ekq = false;
    this.vkS = paramContext.getResources().getDimensionPixelSize(2131427500);
    AppMethodBeat.o(79744);
  }

  private void KV(int paramInt)
  {
    AppMethodBeat.i(79751);
    if (paramInt < this.vkJ)
    {
      this.ekq = true;
      dfM();
    }
    AppMethodBeat.o(79751);
  }

  private void dfM()
  {
    AppMethodBeat.i(79752);
    if (this.vkD != null)
      this.vkD.dfM();
    AppMethodBeat.o(79752);
  }

  private void djA()
  {
    AppMethodBeat.i(79745);
    if ((this.mgP) && (p.a.vlj != null))
      this.elH = p.a.vlj.ajA(this.username);
    AppMethodBeat.o(79745);
  }

  private void djC()
  {
    AppMethodBeat.i(79749);
    if (this.vkE == null)
      AppMethodBeat.o(79749);
    while (true)
    {
      return;
      ab.d("MicroMsg.ContactsListArchAdapter", "initData memberContactList.size %d", new Object[] { Integer.valueOf(this.vkE.size()) });
      this.sBb.clear();
      if (this.vkE.size() > 0)
      {
        Iterator localIterator = this.vkE.iterator();
        while (localIterator.hasNext())
        {
          ad localad = (ad)localIterator.next();
          this.sBb.add(localad);
        }
      }
      this.vkJ = this.sBb.size();
      AppMethodBeat.o(79749);
    }
  }

  private j.c ew(View paramView)
  {
    AppMethodBeat.i(79753);
    j.c localc = new j.c(this);
    localc.vkZ = ((ImageView)paramView.findViewById(2131822732));
    localc.ejo = ((ImageView)paramView.findViewById(2131827163));
    localc.qpr = ((ImageView)paramView.findViewById(2131827164));
    localc.ejp = ((TextView)paramView.findViewById(2131827167));
    localc.elJ = ((TextView)paramView.findViewById(2131827168));
    localc.elK = ((TextView)paramView.findViewById(2131827169));
    localc.iYg = ((ImageView)paramView.findViewById(2131827165));
    localc.ejo.setScaleType(ImageView.ScaleType.CENTER_CROP);
    paramView.setTag(localc);
    AppMethodBeat.o(79753);
    return localc;
  }

  public final boolean KU(int paramInt)
  {
    AppMethodBeat.i(79750);
    boolean bool;
    if (!this.ekq)
    {
      KV(paramInt);
      bool = true;
      AppMethodBeat.o(79750);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79750);
    }
  }

  public final boolean KW(int paramInt)
  {
    if (paramInt < this.vkJ);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void Kh()
  {
    AppMethodBeat.i(79748);
    if ((this.cFX == null) && (this.vkE == null))
    {
      AppMethodBeat.o(79748);
      return;
    }
    int i;
    if (this.vkO)
      if (this.cFX != null)
      {
        ab.d("MicroMsg.ContactsListArchAdapter", "initData memberList.size %d", new Object[] { Integer.valueOf(this.cFX.size()) });
        this.sBb.clear();
        this.vkH.clear();
        Object localObject = new LinkedList();
        if (this.cFX.size() > 0)
        {
          Iterator localIterator = this.cFX.iterator();
          i = 1;
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            if (this.mgP)
            {
              this.vkH.add(p.a.vlj.ajz(str));
            }
            else
            {
              ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str);
              if ((this.eih != null) && (str.equals(this.eih.field_roomowner)))
              {
                ((LinkedList)localObject).add(new j.b(this, localad, 0));
              }
              else if ((this.eih != null) && (this.eih.aoo(localad.field_username)))
              {
                ((LinkedList)localObject).add(new j.b(this, localad, i));
                i++;
              }
              else
              {
                ((LinkedList)localObject).add(new j.b(this, localad, 100));
              }
            }
          }
          if (this.vkU)
            Collections.sort((List)localObject, new j.1(this));
          if (!this.mgP)
          {
            localIterator = ((LinkedList)localObject).iterator();
            while (localIterator.hasNext())
            {
              localObject = (j.b)localIterator.next();
              this.sBb.add((ad)((j.b)localObject).vkY);
            }
          }
        }
        if (this.mgP)
          this.vkJ = this.vkH.size();
      }
      else
      {
        label386: if (this.vkJ != 0)
          break label582;
        this.vkI = vkC;
      }
    while (true)
    {
      ab.d("MicroMsg.ContactsListArchAdapter", "Number Size  contactSize :" + this.vkJ + " realySize : " + this.vkI);
      dfM();
      AppMethodBeat.o(79748);
      break;
      if (this.cEH)
      {
        if ((this.eih != null) && (!this.eih.JR()))
        {
          if (this.sBb.size() >= MAX_COUNT);
          for (i = MAX_COUNT; ; i = this.sBb.size())
          {
            this.vkJ = i;
            break;
          }
        }
        if (this.sBb.size() >= MAX_COUNT - 1);
        for (i = MAX_COUNT - 1; ; i = this.sBb.size())
        {
          this.vkJ = i;
          break;
        }
      }
      this.vkJ = this.sBb.size();
      break label386;
      djC();
      break label386;
      label582: if ((this.vkM) && (this.vkL) && (this.vkN))
        this.vkI = (((this.vkJ + 2) / vkC + 1) * vkC);
      else if (((this.vkM) && (this.vkL) && (!this.vkN)) || ((this.vkM) && (!this.vkL) && (this.vkN)) || ((!this.vkM) && (this.vkL) && (this.vkN)))
        this.vkI = (((this.vkJ + 1) / vkC + 1) * vkC);
      else if (((this.vkM) && (!this.vkL) && (!this.vkN)) || ((!this.vkM) && (this.vkL) && (!this.vkN)) || ((!this.vkM) && (!this.vkL) && (this.vkN)))
        this.vkI = ((this.vkJ / vkC + 1) * vkC);
      else if ((!this.vkM) && (!this.vkL) && (!this.vkN))
        this.vkI = (((this.vkJ - 1) / vkC + 1) * vkC);
    }
  }

  public final void ah(ArrayList<ad> paramArrayList)
  {
    this.vkO = false;
    this.vkE = paramArrayList;
  }

  public final void ci(List<String> paramList)
  {
    AppMethodBeat.i(79756);
    jdMethod_do(paramList);
    Kh();
    AppMethodBeat.o(79756);
  }

  public final boolean djB()
  {
    AppMethodBeat.i(79747);
    boolean bool;
    if (this.mgP)
    {
      bool = this.vkG;
      AppMethodBeat.o(79747);
    }
    while (true)
    {
      return bool;
      bool = t.kH(this.username);
      AppMethodBeat.o(79747);
    }
  }

  public final void djD()
  {
    AppMethodBeat.i(79755);
    this.ekq = false;
    Kh();
    AppMethodBeat.o(79755);
  }

  public final void jdMethod_do(List<String> paramList)
  {
    this.vkO = true;
    this.cFX = paramList;
  }

  public final int getCount()
  {
    AppMethodBeat.i(79757);
    int i;
    if (this.vkP)
    {
      i = Math.min(this.vkQ, this.vkI);
      AppMethodBeat.o(79757);
    }
    while (true)
    {
      return i;
      i = this.vkI;
      AppMethodBeat.o(79757);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(79758);
    Object localObject;
    if (paramInt < this.vkJ)
      if (this.mgP)
      {
        localObject = this.vkH.get(paramInt);
        AppMethodBeat.o(79758);
      }
    while (true)
    {
      return localObject;
      localObject = this.sBb.get(paramInt);
      AppMethodBeat.o(79758);
      continue;
      localObject = null;
      AppMethodBeat.o(79758);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(79754);
    ad localad;
    int i;
    if (paramInt < this.vkJ)
      if (this.mgP)
      {
        paramViewGroup = getItem(paramInt);
        localad = null;
        i = 0;
      }
    while (true)
    {
      View localView;
      j.c localc;
      if (paramView == null)
      {
        localView = View.inflate(this.mContext, 2130970531, null);
        localc = ew(localView);
      }
      label257: label280: label1179: 
      while (true)
      {
        label58: int j;
        if ((vkC == 4) || (this.vkW))
        {
          j = this.mContext.getResources().getDimensionPixelSize(2131427806);
          localc.ejo.getLayoutParams().height = j;
          localc.ejo.getLayoutParams().width = j;
          label113: localc.vkZ.setVisibility(8);
          localc.elK.setVisibility(8);
          if (i != 0)
            break label927;
          localc.ejo.setVisibility(0);
          if (!this.cEH)
            break label660;
          if (bo.isNullOrNil(localad.field_conRemark))
            break label630;
          paramView = localad.field_conRemark;
          label171: Object localObject = paramView;
          if (bo.isNullOrNil(paramView))
            localObject = localad.field_conRemark;
          paramView = (View)localObject;
          if (bo.isNullOrNil((String)localObject))
            paramView = localad.Oi();
          paramView = com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, paramView, localc.ejp.getTextSize());
          label222: if (!(paramView instanceof SpannableString))
            break label765;
          localc.ejp.setVisibility(8);
          localc.elJ.setVisibility(0);
          localc.elJ.setText(paramView);
          paramView = com.tencent.mm.openim.room.a.a.A(localad);
          if (!TextUtils.isEmpty(paramView))
            break label796;
          localc.elK.setVisibility(8);
          localc.ejo.setContentDescription("");
          if (!this.mgP)
            break label817;
          o.ahp().a(p.a.vlj.cv(paramViewGroup), localc.ejo, this.elH);
          localc.ejo.setBackgroundDrawable(null);
          label331: if (!this.mgP)
            break label873;
          if ((!this.ekq) || ((this.vkR != null) && (this.vkR.equals(p.a.vlj.cw(paramViewGroup)))))
            break label860;
          localc.qpr.setVisibility(0);
        }
        label796: label817: label947: label1107: 
        while (true)
        {
          if ((!this.mgP) || (paramViewGroup == null))
            localc.iYg.setVisibility(8);
          localc.klY = i;
          AppMethodBeat.o(79754);
          return localView;
          localad = (ad)getItem(paramInt);
          paramViewGroup = null;
          i = 0;
          break;
          if ((paramInt == this.vkJ) && (this.vkM))
          {
            paramViewGroup = null;
            localad = null;
            i = 3;
            break;
          }
          if ((paramInt == this.vkJ + 1) && (this.vkL))
          {
            paramViewGroup = null;
            localad = null;
            i = 4;
            break;
          }
          if ((paramInt == this.vkJ + 1) && (this.vkN) && (!this.vkL))
          {
            paramViewGroup = null;
            localad = null;
            i = 5;
            break;
          }
          if ((paramInt != this.vkJ + 2) || (!this.vkN) || (!this.vkL))
            break label1512;
          paramViewGroup = null;
          localad = null;
          i = 5;
          break;
          localc = (j.c)paramView.getTag();
          if (localc != null)
            break label1506;
          localc = ew(paramView);
          localView = paramView;
          break label58;
          j = this.mContext.getResources().getDimensionPixelSize(2131427804);
          localc.ejo.getLayoutParams().height = j;
          localc.ejo.getLayoutParams().width = j;
          break label113;
          label630: paramView = localad.field_username;
          if (this.eih == null)
          {
            paramView = null;
            break label171;
          }
          paramView = this.eih.mJ(paramView);
          break label171;
          if (this.mgP)
          {
            paramView = com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, p.a.vlj.cu(paramViewGroup), localc.ejp.getTextSize());
            break label222;
          }
          if (ad.aox(localad.field_username))
          {
            paramView = ((b)g.K(b.class)).e(ah.getContext(), localad.Oj(), (int)localc.ejp.getTextSize());
            break label222;
          }
          paramView = com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, localad.Oj(), localc.ejp.getTextSize());
          break label222;
          label765: localc.ejp.setVisibility(0);
          localc.elJ.setVisibility(8);
          localc.ejp.setText(paramView);
          break label257;
          localc.elK.setVisibility(0);
          localc.elK.setText(paramView);
          break label280;
          a.b.b(localc.ejo, localad.field_username);
          paramView = (com.tencent.mm.pluginsdk.ui.a)localc.ejo.getDrawable();
          if (this.vkK == null)
            break label331;
          this.vkK.a(paramView);
          break label331;
          label860: localc.qpr.setVisibility(8);
          continue;
          label873: if ((this.ekq) && ((this.vkR == null) || (!this.vkR.equals(localad.field_username))))
          {
            localc.qpr.setVisibility(0);
          }
          else
          {
            localc.qpr.setVisibility(8);
            continue;
            if (i == 3)
            {
              paramView = localc.ejp;
              if (paramInt == 0)
              {
                j = 8;
                paramView.setVisibility(j);
                paramView = localc.elJ;
                if (paramInt != 0)
                  break label1006;
              }
              label1006: for (paramInt = 8; ; paramInt = 4)
              {
                paramView.setVisibility(paramInt);
                localc.qpr.setVisibility(8);
                if (!this.ekq)
                  break label1011;
                localc.ejo.setVisibility(4);
                break;
                j = 4;
                break label947;
              }
              label1011: localc.ejo.setVisibility(0);
              if (this.mgP)
              {
                o.ahp().a("", localc.ejo, this.elH);
                localc.ejo.setBackgroundDrawable(null);
              }
              localc.ejo.setImageResource(2130837886);
              localc.ejo.setContentDescription(this.mContext.getString(2131296418));
            }
            else if (i == 4)
            {
              paramView = localc.ejp;
              if (1 == paramInt)
              {
                j = 8;
                paramView.setVisibility(j);
                paramView = localc.elJ;
                if (1 != paramInt)
                  break label1174;
              }
              for (paramInt = 8; ; paramInt = 4)
              {
                paramView.setVisibility(paramInt);
                localc.qpr.setVisibility(8);
                if ((!this.ekq) && (this.vkJ != 0))
                  break label1179;
                localc.ejo.setVisibility(4);
                break;
                j = 4;
                break label1107;
              }
              localc.ejo.setVisibility(0);
              if (this.mgP)
              {
                o.ahp().a("", localc.ejo, this.elH);
                localc.ejo.setBackgroundDrawable(null);
              }
              localc.ejo.setImageResource(2130837887);
              localc.ejo.setContentDescription(this.mContext.getString(2131298861));
            }
            else if (i == 5)
            {
              paramView = localc.ejp;
              if (paramInt == 0)
              {
                j = 8;
                label1274: paramView.setVisibility(j);
                paramView = localc.elJ;
                if (paramInt != 0)
                  break label1333;
              }
              for (paramInt = 8; ; paramInt = 4)
              {
                paramView.setVisibility(paramInt);
                localc.qpr.setVisibility(8);
                if (!this.ekq)
                  break label1338;
                localc.ejo.setVisibility(4);
                break;
                j = 4;
                break label1274;
              }
              localc.ejo.setVisibility(0);
              if (this.mgP)
              {
                o.ahp().a("", localc.ejo, this.elH);
                localc.ejo.setBackgroundDrawable(null);
              }
              localc.ejo.setImageResource(2130837888);
              localc.ejo.setContentDescription(this.mContext.getString(2131301503));
            }
            else if (i == 2)
            {
              if (this.mgP)
                o.ahp().a("", localc.ejo, this.elH);
              localc.ejp.setVisibility(4);
              localc.elJ.setVisibility(4);
              localc.qpr.setVisibility(8);
              localc.ejo.setVisibility(4);
              localc.ejo.setImageResource(2130839563);
              localc.ejo.setBackgroundResource(2130839563);
            }
          }
        }
        label927: label1333: label1338: label1506: localView = paramView;
      }
      label660: label1174: label1512: paramViewGroup = null;
      localad = null;
      i = 2;
    }
  }

  public final void setUsername(String paramString)
  {
    AppMethodBeat.i(79746);
    this.username = paramString;
    this.cEH = t.kH(paramString);
    if ((!this.cEH) && (p.a.vlj != null))
      this.mgP = p.a.vlj.ajy(paramString);
    if (!this.mgP)
      this.eih = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().oa(paramString);
    djA();
    AppMethodBeat.o(79746);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.j
 * JD-Core Version:    0.6.2
 */