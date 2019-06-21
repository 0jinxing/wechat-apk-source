package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class h extends BaseAdapter
  implements f
{
  private final Context context;
  private final SharedPreferences ehZ;
  private ListView gGW;
  private Preference.a yBv;
  private final i yCE;
  private final LinkedList<String> yCF;
  private final HashMap<String, Preference> yCG;
  private final HashSet<String> yCH;
  private final LinkedList<String> yCI;
  private final HashMap<String, Integer> yCJ;
  private final HashMap<String, String> yCK;
  private int[] yCL;
  private boolean yCM;
  private boolean yCN;

  public h(Context paramContext, ListView paramListView, SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(107214);
    this.yCF = new LinkedList();
    this.yCG = new HashMap();
    this.yCH = new HashSet();
    this.yCI = new LinkedList();
    this.yCJ = new HashMap();
    this.yCK = new HashMap();
    this.yCL = new int[0];
    this.yCM = false;
    this.yCN = false;
    this.yCE = new i(paramContext);
    this.context = paramContext;
    this.gGW = paramListView;
    this.ehZ = paramSharedPreferences;
    AppMethodBeat.o(107214);
  }

  private static boolean NU(int paramInt)
  {
    if ((paramInt == 2130970127) || (paramInt == 2130970204) || (paramInt == 2130970207));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static void a(Preference paramPreference, SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(107231);
    Object localObject;
    if ((paramPreference instanceof CheckBoxPreference))
    {
      localObject = (CheckBoxPreference)paramPreference;
      if (((Preference)localObject).yDf)
        ((CheckBoxPreference)localObject).uOT = paramSharedPreferences.getBoolean(paramPreference.mKey, ((CheckBoxPreference)paramPreference).isChecked());
    }
    if ((paramPreference instanceof DialogPreference))
    {
      localObject = (DialogPreference)paramPreference;
      if (((Preference)localObject).yDf)
        ((DialogPreference)localObject).setValue(paramSharedPreferences.getString(paramPreference.mKey, null));
    }
    if ((paramPreference instanceof EditPreference))
    {
      localObject = (EditPreference)paramPreference;
      if (((Preference)localObject).yDf)
      {
        ((EditPreference)localObject).value = paramSharedPreferences.getString(paramPreference.mKey, null);
        ((EditPreference)localObject).setSummary(((EditPreference)localObject).value);
      }
    }
    AppMethodBeat.o(107231);
  }

  private void b(Preference paramPreference, int paramInt)
  {
    AppMethodBeat.i(107222);
    String str = f(paramPreference);
    this.yCG.put(str, paramPreference);
    LinkedList localLinkedList = this.yCF;
    int i = paramInt;
    if (paramInt == -1)
      i = this.yCF.size();
    localLinkedList.add(i, str);
    if ((!this.yCJ.containsKey(e(paramPreference))) && (this.yCM))
      this.yCJ.put(e(paramPreference), Integer.valueOf(this.yCJ.size()));
    if (paramPreference.yDg != null)
      this.yCK.put(paramPreference.yDg + "|" + paramPreference.mKey, paramPreference.mKey);
    AppMethodBeat.o(107222);
  }

  private static String e(Preference paramPreference)
  {
    AppMethodBeat.i(107215);
    paramPreference = paramPreference.getClass().getName() + "L" + paramPreference.getLayoutResource() + "W" + paramPreference.yDl;
    AppMethodBeat.o(107215);
    return paramPreference;
  }

  private static String f(Preference paramPreference)
  {
    AppMethodBeat.i(107216);
    if ((paramPreference.mKey != null) && (paramPreference.mKey.length() > 0))
    {
      paramPreference = paramPreference.mKey;
      AppMethodBeat.o(107216);
    }
    while (true)
    {
      return paramPreference;
      paramPreference = "_anonymous_pref@" + paramPreference.hashCode();
      AppMethodBeat.o(107216);
    }
  }

  public final void a(Preference paramPreference, int paramInt)
  {
    AppMethodBeat.i(107221);
    b(paramPreference, paramInt);
    if (!this.yCM)
      notifyDataSetChanged();
    AppMethodBeat.o(107221);
  }

  public final void addPreferencesFromResource(int paramInt)
  {
    AppMethodBeat.i(107228);
    this.yCM = true;
    this.yCE.a(paramInt, this);
    this.yCM = false;
    if (this.gGW != null)
      this.gGW.setAdapter(this);
    notifyDataSetChanged();
    AppMethodBeat.o(107228);
  }

  public final Preference aqO(String paramString)
  {
    AppMethodBeat.i(107223);
    paramString = (Preference)this.yCG.get(paramString);
    AppMethodBeat.o(107223);
    return paramString;
  }

  public final boolean aqP(String paramString)
  {
    AppMethodBeat.i(107226);
    boolean bool = d(aqO(paramString));
    AppMethodBeat.o(107226);
    return bool;
  }

  public final int aqQ(String paramString)
  {
    AppMethodBeat.i(107218);
    int i;
    if (this.yCI == null)
    {
      i = -1;
      AppMethodBeat.o(107218);
    }
    while (true)
    {
      return i;
      i = this.yCI.indexOf(paramString);
      AppMethodBeat.o(107218);
    }
  }

  public final void b(Preference.a parama)
  {
    AppMethodBeat.i(107229);
    this.yBv = parama;
    notifyDataSetChanged();
    AppMethodBeat.o(107229);
  }

  public final void b(Preference paramPreference)
  {
    AppMethodBeat.i(138366);
    a(paramPreference, -1);
    AppMethodBeat.o(138366);
  }

  public final void c(Preference paramPreference)
  {
    AppMethodBeat.i(107220);
    b(paramPreference, -1);
    AppMethodBeat.o(107220);
  }

  public final void ce(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(107224);
    if (paramBoolean)
      if (!this.yCH.contains(paramString))
      {
        this.yCH.add(paramString);
        notifyDataSetChanged();
        AppMethodBeat.o(107224);
      }
    while (true)
    {
      return;
      AppMethodBeat.o(107224);
      continue;
      if (this.yCH.remove(paramString))
        break;
      AppMethodBeat.o(107224);
    }
  }

  public final boolean d(Preference paramPreference)
  {
    AppMethodBeat.i(107225);
    boolean bool;
    if (paramPreference == null)
    {
      bool = false;
      AppMethodBeat.o(107225);
    }
    while (true)
    {
      return bool;
      String str = f(paramPreference);
      this.yCF.remove(str);
      this.yCG.remove(str);
      this.yCH.remove(paramPreference.mKey);
      notifyDataSetChanged();
      bool = true;
      AppMethodBeat.o(107225);
    }
  }

  public int getCount()
  {
    AppMethodBeat.i(107232);
    int i = this.yCI.size();
    AppMethodBeat.o(107232);
    return i;
  }

  public Object getItem(int paramInt)
  {
    AppMethodBeat.i(107233);
    Object localObject = this.yCG.get(this.yCI.get(paramInt));
    AppMethodBeat.o(107233);
    return localObject;
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(107235);
    if (paramInt > this.yCI.size())
    {
      AppMethodBeat.o(107235);
      paramInt = -1;
    }
    while (true)
    {
      return paramInt;
      Object localObject = (Preference)this.yCG.get(this.yCI.get(paramInt));
      localObject = (Integer)this.yCJ.get(e((Preference)localObject));
      if (localObject == null)
      {
        AppMethodBeat.o(107235);
        paramInt = -1;
      }
      else
      {
        paramInt = ((Integer)localObject).intValue();
        AppMethodBeat.o(107235);
      }
    }
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107236);
    if (paramInt > this.yCI.size())
      AppMethodBeat.o(107236);
    Object localObject;
    int i;
    View localView;
    while (true)
    {
      return paramView;
      localObject = (Preference)this.yCG.get(this.yCI.get(paramInt));
      if ((localObject instanceof CheckBoxPreference))
        ((Preference)localObject).a(this.yBv);
      if (!this.yCJ.containsKey(e((Preference)localObject)))
        paramView = null;
      paramView = ((Preference)localObject).getView(paramView, paramViewGroup);
      i = this.yCL[paramInt];
      localObject = paramView.findViewById(2131821019);
      localView = paramView.findViewById(2131826013);
      if (localObject != null)
        break;
      ab.d("MicroMsg.MMPreferenceAdapter", "find content view error");
      AppMethodBeat.o(107236);
    }
    paramViewGroup = ((View)localObject).findViewById(2131820982);
    paramView.findViewById(16908312);
    ((View)localObject).getPaddingLeft();
    ((View)localObject).getPaddingRight();
    ((View)localObject).getPaddingTop();
    ((View)localObject).getPaddingBottom();
    int j = paramView.getPaddingLeft();
    int k = paramView.getPaddingRight();
    paramInt = paramView.getPaddingTop();
    int m = paramView.getPaddingBottom();
    int n;
    if ((i & 0x2) != 0)
    {
      n = ((View)localObject).getPaddingLeft();
      ((View)localObject).setBackgroundResource(2130839162);
      ((View)localObject).setPadding(n, 0, 0, 0);
      if ((paramViewGroup != null) && (paramViewGroup.getBackground() != null))
        paramViewGroup.setBackground(null);
    }
    while (true)
    {
      paramView.setBackgroundResource(2130840123);
      paramView.setPadding(j, paramInt, k, m);
      if (((i & 0x1) != 0) && (localView != null))
        localView.setBackgroundResource(2130840828);
      AppMethodBeat.o(107236);
      break;
      if (paramViewGroup != null)
      {
        n = paramViewGroup.getPaddingTop();
        int i1 = paramViewGroup.getPaddingBottom();
        paramViewGroup.setBackgroundResource(2130839162);
        paramViewGroup.setPadding(0, n, 0, i1);
        if ((localObject != null) && (((View)localObject).getBackground() != null))
          ((View)localObject).setBackground(null);
      }
    }
  }

  public int getViewTypeCount()
  {
    AppMethodBeat.i(107234);
    if (!this.yCN)
      this.yCN = true;
    int i = Math.max(1, this.yCJ.size());
    AppMethodBeat.o(107234);
    return i;
  }

  public final int indexOf(String paramString)
  {
    AppMethodBeat.i(107217);
    int i = this.yCF.indexOf(paramString);
    AppMethodBeat.o(107217);
    return i;
  }

  public void notifyDataSetChanged()
  {
    int i = 0;
    AppMethodBeat.i(107230);
    this.yCI.clear();
    Object localObject1 = this.yCF.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      if (!this.yCH.contains(localObject2))
        if (this.yCG.get(localObject2) == null)
          ab.e("MicroMsg.MMPreferenceAdapter", "not found pref by key ".concat(String.valueOf(localObject2)));
        else
          this.yCI.add(localObject2);
    }
    if (!this.yCI.isEmpty())
      this.yCG.get(this.yCI.get(0));
    localObject1 = new HashSet();
    int j = 0;
    if (j < this.yCI.size())
    {
      localObject2 = (Preference)this.yCG.get(this.yCI.get(j));
      if (((localObject2 instanceof PreferenceCategory)) && (bo.isNullOrNil(((Preference)localObject2).mKey)) && (j != 0))
      {
        Preference localPreference = (Preference)this.yCG.get(this.yCI.get(j - 1));
        if ((localPreference instanceof PreferenceCategory))
        {
          if ((!bo.isNullOrNil(localPreference.mKey)) || ((localPreference.getTitle() != null) && (localPreference.getTitle().toString().trim().length() > 0)))
            break label273;
          ((Set)localObject1).add(f(localPreference));
        }
      }
      while (true)
      {
        j++;
        break;
        label273: if ((bo.isNullOrNil(((Preference)localObject2).mKey)) && ((((Preference)localObject2).getTitle() == null) || (((Preference)localObject2).getTitle().toString().trim().length() <= 0)))
          ((Set)localObject1).add(f((Preference)localObject2));
      }
    }
    this.yCI.removeAll((Collection)localObject1);
    this.yCL = new int[this.yCI.size()];
    if (this.yCL.length <= 0)
      AppMethodBeat.o(107230);
    while (true)
    {
      return;
      j = i;
      if (this.yCL.length == 1)
      {
        j = ((Preference)this.yCG.get(this.yCI.get(0))).getLayoutResource();
        localObject1 = (Preference)this.yCG.get(this.yCI.get(0));
        if (NU(j))
          if ((localObject1 instanceof CheckBoxPreference))
          {
            localObject1 = this.yCL;
            localObject1[0] |= 8;
            localObject1 = this.yCL;
            localObject1[0] |= 1;
          }
        while (true)
        {
          a((Preference)this.yCG.get(this.yCI.get(0)), this.ehZ);
          super.notifyDataSetChanged();
          AppMethodBeat.o(107230);
          break;
          this.yCL[0] = 3;
          continue;
          this.yCL[0] = 4;
        }
      }
      if (j < this.yCI.size())
      {
        a((Preference)this.yCG.get(this.yCI.get(j)), this.ehZ);
        localObject1 = (Preference)this.yCG.get(this.yCI.get(j));
        i = ((Preference)localObject1).getLayoutResource();
        if (NU(i))
        {
          if ((localObject1 instanceof CheckBoxPreference))
          {
            localObject1 = this.yCL;
            localObject1[j] |= 8;
          }
          if (j == 0)
          {
            localObject1 = this.yCL;
            localObject1[j] |= 1;
            localObject1 = this.yCL;
            localObject1[j] |= 16;
          }
        }
        while (true)
        {
          j++;
          break;
          if (j == this.yCI.size() - 1)
          {
            localObject1 = this.yCL;
            localObject1[j] |= 2;
          }
          i = ((Preference)this.yCG.get(this.yCI.get(j - 1))).getLayoutResource();
          if ((i != 2130970127) || (i == 2130970204) || (i == 2130970207))
          {
            localObject1 = this.yCL;
            localObject1[j] |= 1;
            continue;
            if (i == 2130970184)
            {
              if (j == 0)
              {
                localObject1 = this.yCL;
                localObject1[j] |= 4;
                localObject1 = this.yCL;
                localObject1[j] |= 16;
              }
              else
              {
                i = ((Preference)this.yCG.get(this.yCI.get(j - 1))).getLayoutResource();
                if ((i == 2130970127) || (i == 2130970204) || (i == 2130970207))
                {
                  localObject1 = this.yCL;
                  i = j - 1;
                  localObject1[i] |= 2;
                }
              }
            }
            else
            {
              localObject1 = this.yCL;
              localObject1[j] |= 4;
              if (j == 0)
              {
                localObject1 = this.yCL;
                localObject1[j] |= 16;
              }
              else
              {
                i = ((Preference)this.yCG.get(this.yCI.get(j - 1))).getLayoutResource();
                if ((NU(i)) || (i == 2130970184))
                {
                  localObject1 = this.yCL;
                  i = j - 1;
                  localObject1[i] |= 2;
                }
              }
            }
          }
        }
      }
      super.notifyDataSetChanged();
      AppMethodBeat.o(107230);
    }
  }

  public final void removeAll()
  {
    AppMethodBeat.i(107227);
    this.yCI.clear();
    this.yCG.clear();
    this.yCF.clear();
    this.yCH.clear();
    notifyDataSetChanged();
    AppMethodBeat.o(107227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.h
 * JD-Core Version:    0.6.2
 */