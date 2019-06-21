package com.tencent.weui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class b extends BaseAdapter
  implements a
{
  final c ALw;
  boolean ALx;
  Preference.OnPreferenceChangeListener ALy;
  private final Context context;
  private final SharedPreferences ehZ;
  private final LinkedList<String> yCF;
  private final HashMap<String, Preference> yCG;
  private final HashSet<String> yCH;
  private final LinkedList<String> yCI;
  private final HashMap<String, Integer> yCJ;
  private final HashMap<String, String> yCK;
  private int[] yCL;
  private boolean yCN;

  public b(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(113264);
    this.yCF = new LinkedList();
    this.yCG = new HashMap();
    this.yCH = new HashSet();
    this.yCI = new LinkedList();
    this.yCJ = new HashMap();
    this.yCK = new HashMap();
    this.yCL = new int[0];
    this.ALx = false;
    this.yCN = false;
    this.ALw = new c(paramContext);
    this.context = paramContext;
    this.ehZ = paramSharedPreferences;
    AppMethodBeat.o(113264);
  }

  private static boolean NU(int paramInt)
  {
    if ((paramInt == 2130970127) || (paramInt == 2130970204) || (paramInt == 2130970207));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void a(Preference paramPreference, int paramInt)
  {
    AppMethodBeat.i(113269);
    String str = c(paramPreference);
    this.yCG.put(str, paramPreference);
    LinkedList localLinkedList = this.yCF;
    int i = paramInt;
    if (paramInt == -1)
      i = this.yCF.size();
    localLinkedList.add(i, str);
    if ((!this.yCJ.containsKey(b(paramPreference))) && (!this.yCN))
      this.yCJ.put(b(paramPreference), Integer.valueOf(this.yCJ.size()));
    if (paramPreference.getDependency() != null)
      this.yCK.put(paramPreference.getDependency() + "|" + paramPreference.getKey(), paramPreference.getKey());
    AppMethodBeat.o(113269);
  }

  private static void a(Preference paramPreference, SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(113267);
    if ((paramPreference instanceof CheckBoxPreference))
    {
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)paramPreference;
      if (localCheckBoxPreference.isPersistent())
        localCheckBoxPreference.uOT = paramSharedPreferences.getBoolean(paramPreference.getKey(), ((CheckBoxPreference)paramPreference).isChecked());
    }
    AppMethodBeat.o(113267);
  }

  private static String b(Preference paramPreference)
  {
    AppMethodBeat.i(113265);
    paramPreference = paramPreference.getClass().getName() + "L" + paramPreference.getLayoutResource() + "W" + paramPreference.getWidgetLayoutResource();
    AppMethodBeat.o(113265);
    return paramPreference;
  }

  private static String c(Preference paramPreference)
  {
    AppMethodBeat.i(113266);
    if ((paramPreference.getKey() != null) && (paramPreference.getKey().length() > 0))
    {
      paramPreference = paramPreference.getKey();
      AppMethodBeat.o(113266);
    }
    while (true)
    {
      return paramPreference;
      paramPreference = "_anonymous_pref@" + paramPreference.hashCode();
      AppMethodBeat.o(113266);
    }
  }

  public final void a(Preference paramPreference)
  {
    AppMethodBeat.i(113268);
    a(paramPreference, -1);
    if (!this.ALx)
      notifyDataSetChanged();
    AppMethodBeat.o(113268);
  }

  public final int getCount()
  {
    AppMethodBeat.i(113271);
    int i = this.yCI.size();
    AppMethodBeat.o(113271);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(113272);
    Object localObject = this.yCG.get(this.yCI.get(paramInt));
    AppMethodBeat.o(113272);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(113274);
    if (paramInt > this.yCI.size())
    {
      AppMethodBeat.o(113274);
      paramInt = -1;
    }
    while (true)
    {
      return paramInt;
      Object localObject = (Preference)this.yCG.get(this.yCI.get(paramInt));
      localObject = (Integer)this.yCJ.get(b((Preference)localObject));
      if (localObject == null)
      {
        AppMethodBeat.o(113274);
        paramInt = -1;
      }
      else
      {
        paramInt = ((Integer)localObject).intValue();
        AppMethodBeat.o(113274);
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(113275);
    if (paramInt > this.yCI.size())
      AppMethodBeat.o(113275);
    Object localObject;
    int i;
    while (true)
    {
      return paramView;
      localObject = (Preference)this.yCG.get(this.yCI.get(paramInt));
      if ((localObject instanceof CheckBoxPreference))
        ((Preference)localObject).setOnPreferenceChangeListener(this.ALy);
      if (!this.yCJ.containsKey(b((Preference)localObject)))
        paramView = null;
      paramView = ((Preference)localObject).getView(paramView, paramViewGroup);
      i = this.yCL[paramInt];
      localObject = paramView.findViewById(2131821019);
      if (localObject != null)
        break;
      ai.d("MicroMsg.WeUIPreferenceAdapter", "find content view error", new Object[0]);
      AppMethodBeat.o(113275);
    }
    paramViewGroup = paramView.findViewById(16908312);
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    if ((i & 0x4) == 0)
    {
      j = 0;
      k = ((View)localObject).getPaddingLeft();
      m = ((View)localObject).getPaddingRight();
      n = ((View)localObject).getPaddingTop();
      i1 = ((View)localObject).getPaddingBottom();
      i2 = paramView.getPaddingLeft();
      i3 = paramView.getPaddingRight();
      i4 = paramView.getPaddingTop();
      i5 = paramView.getPaddingBottom();
      if ((i & 0x8) == 0)
        break label339;
      if ((paramInt != this.yCI.size() - 1) && ((paramInt != this.yCI.size() - 2) || (!(getItem(this.yCI.size() - 1) instanceof PreferenceCategory))))
        break label318;
      paramInt = 2130839563;
      label252: i = 2131690691;
      j = paramInt;
      paramInt = i;
    }
    while (true)
    {
      ((View)localObject).setBackgroundResource(j);
      ((View)localObject).setPadding(k, n, m, i1);
      if (paramViewGroup != null)
        paramViewGroup.setBackgroundResource(j);
      paramView.setBackgroundResource(paramInt);
      paramView.setPadding(i2, i4, i3, i5);
      AppMethodBeat.o(113275);
      break;
      label318: if ((i & 0x2) != 0)
      {
        paramInt = 2130839563;
        break label252;
      }
      paramInt = 2130839162;
      break label252;
      label339: if (((i & 0x10) != 0) || ((i & 0x2) == 0))
      {
        j = 2130839162;
        paramInt = 2130840123;
      }
      else
      {
        paramInt = 2130840123;
      }
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(113273);
    if (!this.yCN)
      this.yCN = true;
    int i = Math.max(1, this.yCJ.size());
    AppMethodBeat.o(113273);
    return i;
  }

  public final void notifyDataSetChanged()
  {
    int i = 0;
    AppMethodBeat.i(113270);
    this.yCI.clear();
    Iterator localIterator = this.yCF.iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      if (!this.yCH.contains(localObject))
        if (this.yCG.get(localObject) == null)
          ai.e("MicroMsg.WeUIPreferenceAdapter", "not found pref by key ".concat(String.valueOf(localObject)), new Object[0]);
        else
          this.yCI.add(localObject);
    }
    if ((!this.yCI.isEmpty()) && (NU(((Preference)this.yCG.get(this.yCI.get(0))).getLayoutResource())))
      a(new PreferenceSmallCategory(this.context), 0);
    Object localObject = new HashSet();
    for (int j = 0; j < this.yCI.size(); j++)
    {
      this.yCG.get(this.yCI.get(j));
      if (j != 0)
        this.yCG.get(this.yCI.get(j - 1));
    }
    this.yCI.removeAll((Collection)localObject);
    this.yCL = new int[this.yCI.size()];
    if (this.yCL.length <= 0)
      AppMethodBeat.o(113270);
    while (true)
    {
      return;
      j = i;
      if (this.yCL.length == 1)
      {
        j = ((Preference)this.yCG.get(this.yCI.get(0))).getLayoutResource();
        localObject = (Preference)this.yCG.get(this.yCI.get(0));
        if (NU(j))
          if ((localObject instanceof CheckBoxPreference))
          {
            localObject = this.yCL;
            localObject[0] |= 8;
          }
        while (true)
        {
          a((Preference)this.yCG.get(this.yCI.get(0)), this.ehZ);
          super.notifyDataSetChanged();
          AppMethodBeat.o(113270);
          break;
          this.yCL[0] = 3;
          continue;
          this.yCL[0] = 4;
        }
      }
      if (j < this.yCI.size())
      {
        a((Preference)this.yCG.get(this.yCI.get(j)), this.ehZ);
        localObject = (Preference)this.yCG.get(this.yCI.get(j));
        i = ((Preference)localObject).getLayoutResource();
        if (NU(i))
          if ((localObject instanceof CheckBoxPreference))
          {
            localObject = this.yCL;
            localObject[j] |= 8;
          }
        while (true)
        {
          j++;
          break;
          if (j == 0)
          {
            localObject = this.yCL;
            localObject[j] |= 1;
          }
          else
          {
            if (j == this.yCI.size() - 1)
            {
              localObject = this.yCL;
              localObject[j] |= 2;
            }
            i = ((Preference)this.yCG.get(this.yCI.get(j - 1))).getLayoutResource();
            if ((i != 2130970127) || (i == 2130970204) || (i == 2130970207))
            {
              localObject = this.yCL;
              localObject[j] |= 1;
              continue;
              if (i == 2130970184)
              {
                if (j == 0)
                {
                  localObject = this.yCL;
                  localObject[j] |= 4;
                }
                else
                {
                  localObject = this.yCL;
                  localObject[j] |= 16;
                  i = ((Preference)this.yCG.get(this.yCI.get(j - 1))).getLayoutResource();
                  if ((i == 2130970127) || (i == 2130970204) || (i == 2130970207))
                  {
                    localObject = this.yCL;
                    i = j - 1;
                    localObject[i] |= 2;
                  }
                }
              }
              else
              {
                localObject = this.yCL;
                localObject[j] |= 4;
                if (j != 0)
                {
                  i = ((Preference)this.yCG.get(this.yCI.get(j - 1))).getLayoutResource();
                  if ((NU(i)) || (i == 2130970184))
                  {
                    localObject = this.yCL;
                    i = j - 1;
                    localObject[i] |= 2;
                  }
                }
              }
            }
          }
        }
      }
      super.notifyDataSetChanged();
      AppMethodBeat.o(113270);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.b
 * JD-Core Version:    0.6.2
 */