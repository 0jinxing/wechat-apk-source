package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.platformtools.g;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.ipcall.a.g.b;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c extends p<com.tencent.mm.plugin.ipcall.a.g.c>
  implements d.a
{
  static HashMap<String, com.tencent.mm.plugin.ipcall.a.g.c> nzw = null;
  HashMap<String, Integer> emK;
  av gGg;
  private String gtX;
  boolean jLC;
  private Context mContext;
  private View.OnClickListener nAA;
  private d nAw;
  private HashMap<Long, com.tencent.mm.plugin.ipcall.a.g.c> nAx;
  private HashSet<String> nAy;
  private boolean nAz;

  public c(Context paramContext)
  {
    super(paramContext, null);
    AppMethodBeat.i(21997);
    this.nAx = new HashMap();
    this.emK = new HashMap();
    this.nAy = new HashSet();
    this.nAz = false;
    this.jLC = false;
    this.nAA = new c.1(this);
    this.gGg = new av();
    pN(true);
    this.mContext = paramContext;
    this.nAw = new d(paramContext);
    o.acd().a(this);
    AppMethodBeat.o(21997);
  }

  private static String Pc(String paramString)
  {
    AppMethodBeat.i(22007);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(22007);
    }
    while (true)
    {
      return paramString;
      if (paramString.startsWith(b.emJ))
      {
        paramString = "#";
        AppMethodBeat.o(22007);
      }
      else
      {
        paramString = paramString.toUpperCase().substring(0, 1);
        AppMethodBeat.o(22007);
      }
    }
  }

  private static String a(com.tencent.mm.plugin.ipcall.a.g.c paramc, String paramString)
  {
    AppMethodBeat.i(22006);
    if ((paramc != null) && (paramc.nzx != null))
    {
      Iterator localIterator = paramc.nzx.iterator();
      while (localIterator.hasNext())
      {
        paramc = (String)localIterator.next();
        if (paramc.contains(paramString))
          AppMethodBeat.o(22006);
      }
    }
    while (true)
    {
      return paramc;
      paramc = null;
      AppMethodBeat.o(22006);
    }
  }

  private void bIg()
  {
    AppMethodBeat.i(22012);
    if (getCursor() != null)
    {
      Cursor localCursor = getCursor();
      Object localObject1 = null;
      try
      {
        if (!localCursor.moveToFirst())
          break label156;
        int i = 0;
        if (localCursor.isAfterLast())
          break label156;
        Object localObject2 = new com/tencent/mm/plugin/ipcall/a/g/c;
        ((com.tencent.mm.plugin.ipcall.a.g.c)localObject2).<init>();
        ((com.tencent.mm.plugin.ipcall.a.g.c)localObject2).d(localCursor);
        localObject2 = Pc(((com.tencent.mm.plugin.ipcall.a.g.c)localObject2).field_sortKey);
        if (i == 0)
          this.emK.put(localObject2, Integer.valueOf(i));
        while (true)
        {
          i++;
          localCursor.moveToNext();
          localObject1 = localObject2;
          break;
          if ((localObject1 != null) && (!((String)localObject2).equals(localObject1)))
            this.emK.put(localObject2, Integer.valueOf(i));
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.IPCallAddressAdapter", "initSectionPosMap error: %s", new Object[] { localException.getMessage() });
      }
    }
    else
    {
      AppMethodBeat.o(22012);
    }
    while (true)
    {
      return;
      label156: AppMethodBeat.o(22012);
    }
  }

  public final void KC()
  {
    AppMethodBeat.i(22002);
    Cursor localCursor;
    if (!this.nAz)
      localCursor = i.bHw().bHZ();
    while (true)
    {
      if (localCursor != null)
        localCursor.moveToFirst();
      setCursor(localCursor);
      bIg();
      AppMethodBeat.o(22002);
      return;
      this.jLC = true;
      localCursor = i.bHw().OS(this.gtX);
      this.jLC = false;
    }
  }

  public final void KD()
  {
    AppMethodBeat.i(22004);
    super.bIf();
    KC();
    AppMethodBeat.o(22004);
  }

  public final int bIe()
  {
    AppMethodBeat.i(21999);
    int i = super.getCount();
    AppMethodBeat.o(21999);
    return i;
  }

  public final void bIf()
  {
    AppMethodBeat.i(22003);
    super.bIf();
    AppMethodBeat.o(22003);
  }

  public final int getCount()
  {
    AppMethodBeat.i(21998);
    int i = super.getCount();
    AppMethodBeat.o(21998);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(22008);
    paramInt = super.getItemViewType(paramInt);
    AppMethodBeat.o(22008);
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22005);
    View localView = paramView;
    if (paramView == null)
    {
      localView = LayoutInflater.from(this.context).inflate(2130969894, paramViewGroup, false);
      paramView = new c.b(this, (byte)0);
      paramView.nAM = localView.findViewById(2131825131);
      paramView.nAN = localView.findViewById(2131825132);
      paramView.eks = ((ImageView)localView.findViewById(2131821183));
      paramView.gtO = ((TextView)localView.findViewById(2131823149));
      paramView.nAE = ((TextView)localView.findViewById(2131825079));
      paramView.nAF = ((LinearLayout)localView.findViewById(2131825135));
      paramView.nAG = ((TextView)localView.findViewById(2131825136));
      paramView.nAH = ((TextView)localView.findViewById(2131825137));
      paramView.nAI = ((TextView)localView.findViewById(2131825130));
      paramView.nAJ = ((TextView)localView.findViewById(2131825129));
      paramView.nAK = ((ImageView)localView.findViewById(2131825138));
      paramView.nAL = localView.findViewById(2131825134);
      paramView.nAL.setClickable(true);
      paramView.nAO = ((ImageView)localView.findViewById(2131821128));
      localView.setTag(paramView);
    }
    paramViewGroup = (c.b)localView.getTag();
    paramViewGroup.nAL.setClickable(true);
    paramViewGroup.nAL.setTag(Integer.valueOf(paramInt));
    paramViewGroup.nAO.setVisibility(8);
    int i;
    int j;
    if (wK(paramInt))
    {
      paramViewGroup.gtO.setVisibility(8);
      paramViewGroup.nAE.setVisibility(8);
      paramViewGroup.nAF.setVisibility(8);
      paramViewGroup.eks.setVisibility(8);
      paramViewGroup.eks.setTag(null);
      paramViewGroup.nAJ.setVisibility(8);
      paramViewGroup.nAI.setVisibility(8);
      paramViewGroup.nAK.setVisibility(8);
      i = 1;
      j = i;
      if (xn(paramInt + 1) != null)
      {
        j = i;
        if (xn(paramInt) != null)
        {
          j = i;
          if (!Pc(xn(paramInt + 1).field_sortKey).equals(Pc(xn(paramInt).field_sortKey)))
            j = 0;
        }
      }
      if ((paramInt + 1 != getCount()) && (j != 0))
        break label1571;
      paramViewGroup.nAN.setVisibility(8);
    }
    while (true)
    {
      AppMethodBeat.o(22005);
      return localView;
      com.tencent.mm.plugin.ipcall.a.g.c localc = xn(paramInt);
      if (localc != null)
      {
        if (bo.isNullOrNil(localc.field_systemAddressBookUsername))
          break label1418;
        paramViewGroup.gtO.setVisibility(0);
        if (!this.nAz)
          break label919;
        paramViewGroup.nAE.setVisibility(0);
        paramView = (FrameLayout.LayoutParams)paramViewGroup.nAM.getLayoutParams();
        paramView.height = ((int)paramViewGroup.nAE.getContext().getResources().getDimension(2131427493));
        paramViewGroup.nAM.setLayoutParams(paramView);
        paramView = (RelativeLayout.LayoutParams)paramViewGroup.eks.getLayoutParams();
        paramView.height = ((int)paramViewGroup.eks.getContext().getResources().getDimension(2131427404));
        paramView.width = ((int)paramViewGroup.eks.getContext().getResources().getDimension(2131427404));
        paramViewGroup.eks.setLayoutParams(paramView);
        label602: if ((!this.nAz) || (localc.nzx != null) || (nzw == null) || (!nzw.containsKey(localc.field_contactId)))
          break label1032;
        localc.nzx = ((com.tencent.mm.plugin.ipcall.a.g.c)nzw.get(localc.field_contactId)).nzx;
        label659: if ((bo.isNullOrNil(this.gtX)) || ((!bo.A(this.gtX.charAt(0))) && (!this.gtX.startsWith("+"))))
          break label1083;
        paramView = f.a(a(localc, this.gtX), av.amM(this.gtX));
        paramViewGroup.nAE.setText(paramView);
        paramView = f.a(localc.field_systemAddressBookUsername, this.gtX);
        paramViewGroup.gtO.setText(paramView);
        label745: paramView = paramViewGroup.eks;
        if (paramView != null)
        {
          paramView.setVisibility(0);
          paramView.setTag(null);
          paramView.setImageResource(2130839123);
          if (localc != null)
          {
            if ((bo.isNullOrNil(localc.field_contactId)) || (bo.isNullOrNil(localc.field_wechatUsername)))
              break label1439;
            this.nAw.a(localc.field_contactId, localc.field_wechatUsername, paramView);
            label816: if (!bo.isNullOrNil(localc.field_wechatUsername))
              this.nAy.add(localc.field_wechatUsername);
          }
        }
        paramViewGroup.nAF.setVisibility(8);
        paramView = Pc(localc.field_sortKey);
        if (paramInt != 0)
          break label1493;
        paramViewGroup.nAI.setVisibility(0);
        paramViewGroup.nAI.setText(paramView);
        paramViewGroup.nAJ.setVisibility(8);
      }
      while (true)
      {
        paramViewGroup.nAL.setVisibility(8);
        paramViewGroup.nAK.setVisibility(8);
        paramViewGroup.nAK.setOnClickListener(this.nAA);
        break;
        label919: paramViewGroup.nAE.setVisibility(8);
        paramView = (FrameLayout.LayoutParams)paramViewGroup.nAM.getLayoutParams();
        paramView.height = ((int)paramViewGroup.nAE.getContext().getResources().getDimension(2131427405));
        paramViewGroup.nAM.setLayoutParams(paramView);
        paramView = (RelativeLayout.LayoutParams)paramViewGroup.eks.getLayoutParams();
        paramView.height = ((int)paramViewGroup.eks.getContext().getResources().getDimension(2131427491));
        paramView.width = ((int)paramViewGroup.eks.getContext().getResources().getDimension(2131427491));
        paramViewGroup.eks.setLayoutParams(paramView);
        break label602;
        label1032: if ((!this.nAz) || (localc.nzx != null) || ((nzw != null) && (!nzw.containsKey(localc.field_contactId))))
          break label659;
        localc.nzx = b.OP(localc.field_contactId);
        break label659;
        label1083: if ((!bo.isNullOrNil(this.gtX)) && (!bo.A(this.gtX.charAt(0))))
        {
          String str1 = localc.field_systemAddressBookUsername;
          Object localObject = localc.field_systemAddressBookUsername;
          paramView = this.gtX;
          if ((bo.isNullOrNil(paramView)) || (bo.isNullOrNil((String)localObject)))
            paramView = "";
          label1390: 
          while (true)
          {
            paramView = f.a(str1, paramView);
            paramViewGroup.gtO.setText(paramView);
            paramViewGroup.nAE.setText(a(localc, this.gtX));
            break;
            if ((!bo.amT(paramView)) && (bo.amU(paramView)))
            {
              ArrayList localArrayList = new ArrayList();
              String str2;
              for (j = 0; j < ((String)localObject).length(); j++)
              {
                str2 = ((String)localObject).substring(j, j + 1);
                localArrayList.add(new c.a(this, g.vo(str2), str2));
              }
              for (j = 2; j <= ((String)localObject).length(); j++)
                for (i = 0; i <= ((String)localObject).length() - j; i++)
                {
                  str2 = ((String)localObject).substring(i, i + j);
                  localArrayList.add(new c.a(this, g.vo(str2), str2));
                }
              for (j = 0; ; j++)
              {
                if (j >= localArrayList.size())
                  break label1390;
                localObject = (c.a)localArrayList.get(j);
                if (((c.a)localObject).nAC.contains(paramView))
                {
                  paramView = ((c.a)localObject).nAD;
                  break;
                }
              }
            }
          }
        }
        if (!bo.isNullOrNil(this.gtX))
          break label745;
        paramViewGroup.gtO.setText(localc.field_systemAddressBookUsername);
        break label745;
        label1418: paramViewGroup.gtO.setVisibility(8);
        paramViewGroup.nAE.setVisibility(8);
        break label745;
        label1439: if (!bo.isNullOrNil(localc.field_contactId))
        {
          this.nAw.c(localc.field_contactId, paramView);
          break label816;
        }
        if (bo.isNullOrNil(localc.field_wechatUsername))
          break label816;
        this.nAw.e(localc.field_wechatUsername, paramView);
        break label816;
        label1493: if (!Pc(xn(paramInt - 1).field_sortKey).equals(paramView))
        {
          paramViewGroup.nAI.setVisibility(0);
          paramViewGroup.nAI.setText(paramView);
          paramViewGroup.nAJ.setVisibility(8);
        }
        else
        {
          paramViewGroup.nAI.setVisibility(8);
          paramViewGroup.nAI.setText("");
          paramViewGroup.nAJ.setVisibility(8);
        }
      }
      label1571: paramViewGroup.nAN.setVisibility(0);
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(22009);
    int i = super.getViewTypeCount();
    AppMethodBeat.o(22009);
    return i;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(22011);
    this.nAx.clear();
    super.notifyDataSetChanged();
    AppMethodBeat.o(22011);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(22010);
    if (this.nAy.contains(paramString))
      al.d(new c.2(this));
    AppMethodBeat.o(22010);
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(22001);
    this.gtX = paramString;
    if (bo.isNullOrNil(this.gtX));
    for (this.nAz = false; ; this.nAz = true)
    {
      this.yld.clear();
      KC();
      notifyDataSetChanged();
      AppMethodBeat.o(22001);
      return;
    }
  }

  public final com.tencent.mm.plugin.ipcall.a.g.c xn(int paramInt)
  {
    AppMethodBeat.i(22000);
    com.tencent.mm.plugin.ipcall.a.g.c localc = (com.tencent.mm.plugin.ipcall.a.g.c)super.getItem(paramInt);
    AppMethodBeat.o(22000);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.c
 * JD-Core Version:    0.6.2
 */