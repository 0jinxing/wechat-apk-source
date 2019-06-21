package com.tencent.mm.view.a;

import a.f.b.j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel.RecommendView;
import com.tencent.mm.pluginsdk.ui.chat.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.view.SmileyGrid;
import com.tencent.mm.view.SmileySubGrid;
import com.tencent.mm.view.f.a.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

public final class i extends com.tencent.mm.ui.base.x
{
  com.tencent.mm.view.f.a Aaj;
  WeakReference<h> AbA;
  public boolean Abw;
  public int Abx;
  public boolean Aby;
  public f Abz;
  private final String TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelViewPagerAdapter";
  Context mContext;
  public int mCount;

  public i(com.tencent.mm.view.f.a parama, Context paramContext)
  {
    this.mContext = paramContext;
    this.Aaj = parama;
  }

  public final void aJ(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(63006);
    this.Abx = paramInt;
    if ((this.Abx != 0) || (paramBoolean))
    {
      this.Aaj.dNy();
      if (this.AbA == null)
        break label89;
      h localh = (h)this.AbA.get();
      if (localh != null)
      {
        ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelViewPagerAdapter", "update at page " + this.Abx);
        localh.update();
      }
      AppMethodBeat.o(63006);
    }
    while (true)
    {
      return;
      this.Aby = true;
      label89: AppMethodBeat.o(63006);
    }
  }

  public final int getCount()
  {
    return this.mCount;
  }

  public final int getItemPosition(Object paramObject)
  {
    AppMethodBeat.i(63004);
    int i;
    if (this.Abw)
    {
      ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelViewPagerAdapter", "get item position always changed");
      i = -2;
      AppMethodBeat.o(63004);
    }
    while (true)
    {
      return i;
      i = super.getItemPosition(paramObject);
      AppMethodBeat.o(63004);
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(63001);
    Object localObject = this.Aaj.QI(paramInt);
    String str = ((com.tencent.mm.view.c.a)localObject).kWz;
    boolean bool = ((com.tencent.mm.view.c.a)localObject).Adm;
    if ("TAG_DEFAULT_TAB".equals(str))
    {
      localObject = a.a.AeL;
      switch (i.1.AbB[localObject.ordinal()])
      {
      default:
        paramInt = super.getItemViewType(paramInt);
        AppMethodBeat.o(63001);
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      }
    }
    while (true)
    {
      return paramInt;
      if ((String.valueOf(EmojiGroupInfo.yad).equals(str)) || (String.valueOf(EmojiGroupInfo.yac).equals(str)))
      {
        localObject = a.a.AeM;
        break;
      }
      if (!bool)
      {
        localObject = a.a.AeK;
        break;
      }
      if ("capture".equals(str))
      {
        localObject = a.a.AeN;
        break;
      }
      localObject = a.a.AeO;
      break;
      paramInt = 0;
      AppMethodBeat.o(63001);
      continue;
      if ((this.Aaj.dNx()) && (paramInt == 0))
      {
        paramInt = 3;
        AppMethodBeat.o(63001);
      }
      else
      {
        paramInt = 1;
        AppMethodBeat.o(63001);
        continue;
        paramInt = 4;
        AppMethodBeat.o(63001);
        continue;
        paramInt = 5;
        AppMethodBeat.o(63001);
        continue;
        paramInt = 6;
        AppMethodBeat.o(63001);
      }
    }
  }

  public final float getPageWidth(int paramInt)
  {
    AppMethodBeat.i(63002);
    float f;
    if ((this.Aaj.dNx()) && (paramInt == 0))
    {
      f = 4.0F / this.Aaj.QI(paramInt).tVB;
      AppMethodBeat.o(63002);
    }
    while (true)
    {
      return f;
      f = super.getPageWidth(paramInt);
      AppMethodBeat.o(63002);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(63003);
    int i = getItemViewType(paramInt);
    int j;
    com.tencent.mm.view.c.a locala;
    Object localObject1;
    if ((this.Aaj.dNx()) && (paramInt > 0))
    {
      j = paramInt - 1;
      locala = this.Aaj.QI(paramInt);
      if (paramView != null)
        break label261;
      localObject1 = null;
      label48: if (!(localObject1 instanceof Integer))
        break label2101;
    }
    label152: label180: label2101: for (int k = ((Integer)localObject1).intValue(); ; k = -1)
    {
      Object localObject2;
      int m;
      if ((paramView == null) || (paramView.getTag() == null) || (k != i))
        switch (i)
        {
        case 1:
        case 2:
        case 4:
        default:
          localObject1 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970706, null);
          paramView = new i.c(this, (View)localObject1, i);
          ((View)localObject1).setTag(paramView);
          ((View)localObject1).setTag(2131820665, Integer.valueOf(i));
          localObject2 = paramView;
          paramView = (View)localObject1;
          localObject1 = localObject2;
          k = this.Aaj.atl(locala.kWz).Adk;
          m = locala.Adl;
          switch (i)
          {
          case 2:
          default:
          case 0:
          case 3:
          case 1:
          case 4:
          case 6:
          case 5:
          }
          break;
        case 0:
        case 3:
        case 5:
        }
      while (true)
      {
        AppMethodBeat.o(63003);
        return paramView;
        j = paramInt;
        break;
        localObject1 = paramView.getTag(2131820665);
        break label48;
        localObject1 = com.tencent.mm.pluginsdk.ui.chat.e.von.t(this.mContext, com.tencent.mm.sdk.platformtools.x.gu(this.Aaj.Gn));
        paramView = new i.c(this, (View)localObject1, i);
        break label152;
        localObject1 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970707, null);
        paramView = new i.b(this, (View)localObject1, i);
        break label152;
        localObject1 = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130969342, null);
        paramView = new i.a(this, (View)localObject1, i);
        break label152;
        localObject1 = (i.c)paramView.getTag();
        paramView.setTag(2131820665, Integer.valueOf(i));
        break label180;
        ((i.c)localObject1).AbK.setProductID(locala.kWz);
        continue;
        if ((localObject1 instanceof i.b))
        {
          localObject1 = (i.b)localObject1;
          k = paramViewGroup.getWidth();
          j = ((i.b)localObject1).AbG.Aaj.atl(locala.kWz).Adk;
          paramInt = locala.Adl;
          paramViewGroup = (RelativeLayout.LayoutParams)((i.b)localObject1).AbL.getLayoutParams();
          paramViewGroup.width = (k / locala.tVB * 3);
          paramViewGroup.topMargin = paramInt;
          paramViewGroup.height = (((i.b)localObject1).AbG.Aaj.Aee * locala.tVA + (locala.tVA - 1) * j);
          ((i.b)localObject1).AbL.setLayoutParams(paramViewGroup);
          paramViewGroup = (RelativeLayout.LayoutParams)((i.b)localObject1).AbJ.getLayoutParams();
          paramViewGroup.height = paramInt;
          ((i.b)localObject1).AbJ.setLayoutParams(paramViewGroup);
          paramViewGroup = (RelativeLayout.LayoutParams)((i.b)localObject1).goc.getLayoutParams();
          paramViewGroup.leftMargin = (k / locala.tVB / 2);
          paramViewGroup.topMargin = (((i.b)localObject1).AbG.Aaj.Aee / 4);
          paramViewGroup.bottomMargin = (((i.b)localObject1).AbG.Aaj.Aee / 4);
          ((i.b)localObject1).goc.setLayoutParams(paramViewGroup);
          localObject2 = new h(((i.b)localObject1).AbG.mContext, ((i.b)localObject1).AbG.Aaj);
          ((i.b)localObject1).AbL.setAdapter((ListAdapter)localObject2);
          ((i.b)localObject1).AbL.setNumColumns(3);
          ((i.b)localObject1).AbL.setColumnWidth(locala.getColumnWidth());
          ((i.b)localObject1).AbL.setVerticalSpacing(j);
          ((i.b)localObject1).AbL.setOnTextOperationListener(locala.Adi.dNe());
          paramViewGroup = ((i.b)localObject1).AbL;
          paramViewGroup.setOnItemClickListener(paramViewGroup.Aae);
          ((i.b)localObject1).AbL.setLongClickable(true);
          ((i.b)localObject1).AbL.setIsShowPopWin(true);
          ((i.b)localObject1).AbL.setVerticalScrollBarEnabled(false);
          ((i.b)localObject1).AbL.setScene(((i.b)localObject1).AbG.Aaj.gOW);
          ((i.b)localObject1).AbL.setScrollbarFadingEnabled(false);
          ((i.b)localObject1).AbL.setSelector(2130839563);
          ((i.b)localObject1).AbL.setHorizontalScrollBarEnabled(false);
          ((i.b)localObject1).AbL.setViewParent(locala.Adi.Adt);
          ((h)localObject2).b(com.tencent.mm.view.f.a.ati(locala.kWz), locala.Adj, locala.aRz(), locala.dMX() * locala.tVB, locala.jis, locala.tVA, 3);
          ((h)localObject2).update();
          ((i.b)localObject1).AbG.AbA = new WeakReference(localObject2);
          continue;
          if ((this.Aaj.dNx()) && (paramInt == 1))
            this.Abz = new f(this.mContext, this.Aaj);
          for (paramViewGroup = this.Abz; ; paramViewGroup = new d(this.mContext, this.Aaj))
          {
            ((i.c)localObject1).AbL.setAdapter(paramViewGroup);
            ((i.c)localObject1).AbL.dMI();
            ((i.c)localObject1).AbL.setCallback(locala.Adi.getSmileyPanelCallback());
            ((i.c)localObject1).AbL.setOnTextOperationListener(locala.Adi.dNe());
            ((i.c)localObject1).AbL.setNumColumns(locala.tVB);
            ((i.c)localObject1).AbL.setColumnWidth(locala.getColumnWidth());
            ((i.c)localObject1).AbL.setScrollbarFadingEnabled(false);
            ((i.c)localObject1).AbL.setVerticalScrollBarEnabled(false);
            ((i.c)localObject1).AbL.setSelector(2130839563);
            ((i.c)localObject1).AbL.setHorizontalScrollBarEnabled(false);
            ((i.c)localObject1).AbL.setLongClickable(false);
            ((i.c)localObject1).AbL.setViewParent(locala.Adi.Adt);
            ((i.c)localObject1).AbL.setPadding(0, m, 0, 0);
            ((i.c)localObject1).AbL.setVerticalSpacing(k);
            ((i.c)localObject1).AbL.j(com.tencent.mm.view.f.a.ati(locala.kWz), j - locala.jis, locala.Adj, locala.aRz(), locala.dMX());
            ((i.c)localObject1).AbL.setIsShowPopWin(true);
            ((i.c)localObject1).AbL.setScene(this.Aaj.gOW);
            paramViewGroup.b(com.tencent.mm.view.f.a.ati(locala.kWz), locala.Adj, locala.aRz(), locala.dMX(), j - locala.jis, locala.tVA, locala.tVB);
            paramViewGroup.Abf = locala.kWz;
            break;
          }
          paramViewGroup = new e(this.mContext, this.Aaj);
          ((i.c)localObject1).AbL.setAdapter(paramViewGroup);
          ((i.c)localObject1).AbL.dMI();
          ((i.c)localObject1).AbL.setNumColumns(locala.tVB);
          ((i.c)localObject1).AbL.setColumnWidth(locala.getColumnWidth());
          ((i.c)localObject1).AbL.setScrollbarFadingEnabled(false);
          ((i.c)localObject1).AbL.setHorizontalScrollBarEnabled(false);
          ((i.c)localObject1).AbL.setVerticalScrollBarEnabled(false);
          ((i.c)localObject1).AbL.setCallback(locala.Adi.getSmileyPanelCallback());
          ((i.c)localObject1).AbL.setFastScrollEnabled(false);
          ((i.c)localObject1).AbL.setViewParent(locala.Adi.Adt);
          ((i.c)localObject1).AbL.setPadding(0, m, 0, 0);
          ((i.c)localObject1).AbL.setVerticalSpacing(k / 2);
          ((i.c)localObject1).AbL.setIsShowPopWin(true);
          ((i.c)localObject1).AbL.setScene(this.Aaj.gOW);
          ((i.c)localObject1).AbL.j(com.tencent.mm.view.f.a.ati(locala.kWz), paramInt - locala.jis, locala.Adj, locala.aRz(), locala.dMX());
          paramViewGroup.b(com.tencent.mm.view.f.a.ati(locala.kWz), locala.Adj, locala.dMW(), locala.dMX(), paramInt - locala.jis, locala.tVA, locala.tVB);
          paramViewGroup.Abf = locala.kWz;
          if (paramViewGroup.zZZ == 23)
            paramViewGroup.lbH = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().kS(paramViewGroup.Abf);
          else if (paramViewGroup.zZZ == 25)
            if ((paramViewGroup.Aal != null) && (!bo.isNullOrNil(paramViewGroup.Aal.vmL)) && ((ad.aox(paramViewGroup.Aal.vmL)) || (t.mP(paramViewGroup.Aal.vmL))))
            {
              paramViewGroup.lbH = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().OC();
            }
            else if (ChatFooterPanel.vhl == paramViewGroup.scene)
            {
              paramViewGroup.lbH = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().bY(true);
            }
            else
            {
              paramViewGroup.lbH = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getProvider().bY(false);
              continue;
              if ((localObject1 instanceof i.a))
              {
                localObject2 = (i.a)localObject1;
                if (((i.a)localObject2).AbG.Aaj.gOW == ChatFooterPanel.vhi);
                for (boolean bool = true; ; bool = false)
                {
                  paramViewGroup = com.tencent.mm.emoji.a.a.OB().bZ(bool);
                  if (!bo.ek(paramViewGroup))
                    break label1757;
                  ((i.a)localObject2).AbL.setVisibility(8);
                  ((i.a)localObject2).AbC.setVisibility(0);
                  break;
                }
                label1757: ((i.a)localObject2).AbL.setVisibility(0);
                ((i.a)localObject2).AbC.setVisibility(8);
                k = ((i.a)localObject2).AbG.Aaj.atl(locala.kWz).Adk;
                j = locala.Adl;
                localObject1 = new b(((i.a)localObject2).AbG.mContext, ((i.a)localObject2).AbG.Aaj);
                ((i.a)localObject2).AbL.setAdapter((ListAdapter)localObject1);
                ((i.a)localObject2).AbL.dMI();
                ((i.a)localObject2).AbL.setNumColumns(locala.tVB);
                ((i.a)localObject2).AbL.setColumnWidth(locala.getColumnWidth());
                ((i.a)localObject2).AbL.setScrollbarFadingEnabled(false);
                ((i.a)localObject2).AbL.setHorizontalScrollBarEnabled(false);
                ((i.a)localObject2).AbL.setVerticalScrollBarEnabled(false);
                ((i.a)localObject2).AbL.setCallback(locala.Adi.getSmileyPanelCallback());
                ((i.a)localObject2).AbL.setViewParent(locala.Adi.Adt);
                ((i.a)localObject2).AbL.setPadding(0, j, 0, 0);
                ((i.a)localObject2).AbL.setVerticalSpacing(k / 2);
                ((i.a)localObject2).AbL.setIsShowPopWin(true);
                ((i.a)localObject2).AbL.setScene(((i.a)localObject2).AbG.Aaj.gOW);
                ((i.a)localObject2).AbL.j(com.tencent.mm.view.f.a.ati(locala.kWz), paramInt - locala.jis, locala.Adj, locala.aRz(), locala.dMX());
                ((b)localObject1).b(com.tencent.mm.view.f.a.ati(locala.kWz), locala.Adj, locala.dMW(), locala.dMX(), paramInt - locala.jis, locala.tVA, locala.tVB);
                ((a)localObject1).Abf = locala.kWz;
                j.p(paramViewGroup, "emoji");
                ((b)localObject1).Abh.addAll((Collection)paramViewGroup);
              }
            }
        }
      }
    }
  }

  public final void refreshData()
  {
    AppMethodBeat.i(63005);
    this.mCount = this.Aaj.dNs();
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelViewPagerAdapter", "refresh data mCount:%d", new Object[] { Integer.valueOf(this.mCount) });
    AppMethodBeat.o(63005);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.i
 * JD-Core Version:    0.6.2
 */