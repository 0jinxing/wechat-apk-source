package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.b.a.a;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class h
  implements a
{
  private static final int[] abo = { 1, 4, 5, 3, 2, 0 };
  Drawable abA;
  View abB;
  private boolean abC = false;
  private boolean abD = false;
  private boolean abE = false;
  boolean abF = false;
  private boolean abG = false;
  private ArrayList<j> abH = new ArrayList();
  private CopyOnWriteArrayList<WeakReference<o>> abI = new CopyOnWriteArrayList();
  j abJ;
  public boolean abK;
  private boolean abp;
  private boolean abq;
  public a abr;
  private ArrayList<j> abs;
  private boolean abt;
  public ArrayList<j> abu;
  private ArrayList<j> abv;
  private boolean abw;
  public int abx = 0;
  private ContextMenu.ContextMenuInfo aby;
  CharSequence abz;
  protected final Context mContext;
  ArrayList<j> mItems;
  private final Resources mResources;

  public h(Context paramContext)
  {
    this.mContext = paramContext;
    this.mResources = paramContext.getResources();
    this.mItems = new ArrayList();
    this.abs = new ArrayList();
    this.abt = true;
    this.abu = new ArrayList();
    this.abv = new ArrayList();
    this.abw = true;
    if ((this.mResources.getConfiguration().keyboard != 1) && (this.mResources.getBoolean(2131558403)));
    while (true)
    {
      this.abq = bool;
      return;
      bool = false;
    }
  }

  private j a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = this.abH;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    if (localArrayList.isEmpty())
      paramKeyEvent = null;
    while (true)
    {
      return paramKeyEvent;
      int i = paramKeyEvent.getMetaState();
      KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
      paramKeyEvent.getKeyData(localKeyData);
      int j = localArrayList.size();
      if (j == 1)
      {
        paramKeyEvent = (j)localArrayList.get(0);
      }
      else
      {
        boolean bool = gv();
        int k = 0;
        label82: if (k < j)
        {
          j localj = (j)localArrayList.get(k);
          if (bool);
          for (int m = localj.getAlphabeticShortcut(); ; m = localj.getNumericShortcut())
          {
            if (m == localKeyData.meta[0])
            {
              paramKeyEvent = localj;
              if ((i & 0x2) == 0)
                break;
            }
            if (m == localKeyData.meta[2])
            {
              paramKeyEvent = localj;
              if ((i & 0x2) != 0)
                break;
            }
            if ((bool) && (m == 8))
            {
              paramKeyEvent = localj;
              if (paramInt == 67)
                break;
            }
            k++;
            break label82;
          }
        }
        paramKeyEvent = null;
      }
    }
  }

  private void a(List<j> paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = gv();
    int i = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67))
      return;
    int j = this.mItems.size();
    int k = 0;
    label49: j localj;
    int m;
    if (k < j)
    {
      localj = (j)this.mItems.get(k);
      if (localj.hasSubMenu())
        ((h)localj.getSubMenu()).a(paramList, paramInt, paramKeyEvent);
      if (!bool)
        break label207;
      m = localj.getAlphabeticShortcut();
      label104: if (!bool)
        break label217;
      n = localj.getAlphabeticModifiers();
      label116: if ((i & 0x1100F) != (n & 0x1100F))
        break label227;
    }
    label207: label217: label227: for (int n = 1; ; n = 0)
    {
      if ((n != 0) && (m != 0) && ((m == localKeyData.meta[0]) || (m == localKeyData.meta[2]) || ((bool) && (m == 8) && (paramInt == 67))) && (localj.isEnabled()))
        paramList.add(localj);
      k++;
      break label49;
      break;
      m = localj.getNumericShortcut();
      break label104;
      n = localj.getNumericModifiers();
      break label116;
    }
  }

  private boolean a(u paramu, o paramo)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (this.abI.isEmpty())
      return bool2;
    bool2 = bool1;
    if (paramo != null)
      bool2 = paramo.a(paramu);
    Iterator localIterator = this.abI.iterator();
    label43: 
    while (localIterator.hasNext())
    {
      paramo = (WeakReference)localIterator.next();
      o localo = (o)paramo.get();
      if (localo == null)
      {
        this.abI.remove(paramo);
      }
      else
      {
        if (bool2)
          break label111;
        bool2 = localo.a(paramu);
      }
    }
    label111: 
    while (true)
    {
      break label43;
      break;
    }
  }

  private static int b(ArrayList<j> paramArrayList, int paramInt)
  {
    int i = paramArrayList.size() - 1;
    if (i >= 0)
      if (((j)paramArrayList.get(i)).ZO > paramInt);
    for (paramInt = i + 1; ; paramInt = 0)
    {
      return paramInt;
      i--;
      break;
    }
  }

  private void dispatchSaveInstanceState(Bundle paramBundle)
  {
    if (this.abI.isEmpty());
    while (true)
    {
      return;
      SparseArray localSparseArray = new SparseArray();
      Iterator localIterator = this.abI.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        Object localObject = (o)localWeakReference.get();
        if (localObject == null)
        {
          this.abI.remove(localWeakReference);
        }
        else
        {
          int i = ((o)localObject).getId();
          if (i > 0)
          {
            localObject = ((o)localObject).onSaveInstanceState();
            if (localObject != null)
              localSparseArray.put(i, localObject);
          }
        }
      }
      paramBundle.putSparseParcelableArray("android:menu:presenters", localSparseArray);
    }
  }

  private void l(int paramInt, boolean paramBoolean)
  {
    if ((paramInt < 0) || (paramInt >= this.mItems.size()));
    while (true)
    {
      return;
      this.mItems.remove(paramInt);
      if (paramBoolean)
        p(true);
    }
  }

  public final void U(boolean paramBoolean)
  {
    if (this.abG);
    while (true)
    {
      return;
      this.abG = true;
      Iterator localIterator = this.abI.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        o localo = (o)localWeakReference.get();
        if (localo == null)
          this.abI.remove(localWeakReference);
        else
          localo.a(this, paramBoolean);
      }
      this.abG = false;
    }
  }

  protected MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i = (0xFFFF0000 & paramInt3) >> 16;
    if ((i < 0) || (i >= abo.length))
      throw new IllegalArgumentException("order does not contain a valid category.");
    i = abo[i] << 16 | 0xFFFF & paramInt3;
    paramCharSequence = new j(this, paramInt1, paramInt2, paramInt3, i, paramCharSequence, this.abx);
    if (this.aby != null)
      paramCharSequence.abV = this.aby;
    this.mItems.add(b(this.mItems, i), paramCharSequence);
    p(true);
    return paramCharSequence;
  }

  final void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Resources localResources = this.mResources;
    if (paramView != null)
    {
      this.abB = paramView;
      this.abz = null;
      this.abA = null;
      p(false);
      return;
    }
    if (paramInt1 > 0)
    {
      this.abz = localResources.getText(paramInt1);
      label47: if (paramInt2 <= 0)
        break label83;
      this.abA = android.support.v4.content.b.g(this.mContext, paramInt2);
    }
    while (true)
    {
      this.abB = null;
      break;
      if (paramCharSequence == null)
        break label47;
      this.abz = paramCharSequence;
      break label47;
      label83: if (paramDrawable != null)
        this.abA = paramDrawable;
    }
  }

  public void a(a parama)
  {
    this.abr = parama;
  }

  public final void a(o paramo)
  {
    a(paramo, this.mContext);
  }

  public final void a(o paramo, Context paramContext)
  {
    this.abI.add(new WeakReference(paramo));
    paramo.a(paramContext, this);
    this.abw = true;
  }

  public final boolean a(MenuItem paramMenuItem, o paramo, int paramInt)
  {
    boolean bool1 = false;
    Object localObject = (j)paramMenuItem;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      if (((j)localObject).isEnabled())
        break label33;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label33: bool2 = ((j)localObject).gF();
      paramMenuItem = ((j)localObject).abS;
      if ((paramMenuItem != null) && (paramMenuItem.hasSubMenu()));
      for (int i = 1; ; i = 0)
      {
        if (!((j)localObject).gN())
          break label105;
        bool1 = ((j)localObject).expandActionView() | bool2;
        bool2 = bool1;
        if (!bool1)
          break;
        U(true);
        bool2 = bool1;
        break;
      }
      label105: if ((((j)localObject).hasSubMenu()) || (i != 0))
      {
        if ((paramInt & 0x4) == 0)
          U(false);
        if (!((j)localObject).hasSubMenu())
          ((j)localObject).b(new u(this.mContext, this, (j)localObject));
        localObject = (u)((j)localObject).getSubMenu();
        if (i != 0)
          paramMenuItem.onPrepareSubMenu((SubMenu)localObject);
        bool1 = a((u)localObject, paramo) | bool2;
        bool2 = bool1;
        if (!bool1)
        {
          U(true);
          bool2 = bool1;
        }
      }
      else if ((paramInt & 0x1) == 0)
      {
        U(true);
      }
    }
  }

  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, this.mResources.getString(paramInt));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, this.mResources.getString(paramInt4));
  }

  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }

  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }

  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = this.mContext.getPackageManager();
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i;
    label52: ResolveInfo localResolveInfo;
    if (localList != null)
    {
      i = localList.size();
      if ((paramInt4 & 0x1) == 0)
        removeGroup(paramInt1);
      paramInt4 = 0;
      if (paramInt4 >= i)
        break label211;
      localResolveInfo = (ResolveInfo)localList.get(paramInt4);
      if (localResolveInfo.specificIndex >= 0)
        break label198;
    }
    label198: for (paramComponentName = paramIntent; ; paramComponentName = paramArrayOfIntent[localResolveInfo.specificIndex])
    {
      paramComponentName = new Intent(paramComponentName);
      paramComponentName.setComponent(new ComponentName(localResolveInfo.activityInfo.applicationInfo.packageName, localResolveInfo.activityInfo.name));
      paramComponentName = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(paramComponentName);
      if ((paramArrayOfMenuItem != null) && (localResolveInfo.specificIndex >= 0))
        paramArrayOfMenuItem[localResolveInfo.specificIndex] = paramComponentName;
      paramInt4++;
      break label52;
      i = 0;
      break;
    }
    label211: return i;
  }

  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, this.mResources.getString(paramInt));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, this.mResources.getString(paramInt4));
  }

  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    paramCharSequence = (j)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    u localu = new u(this.mContext, this, paramCharSequence);
    paramCharSequence.b(localu);
    return localu;
  }

  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }

  public final void b(o paramo)
  {
    Iterator localIterator = this.abI.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      o localo = (o)localWeakReference.get();
      if ((localo == null) || (localo == paramo))
        this.abI.remove(localWeakReference);
    }
  }

  public final void c(Bundle paramBundle)
  {
    dispatchSaveInstanceState(paramBundle);
  }

  public void clear()
  {
    if (this.abJ != null)
      h(this.abJ);
    this.mItems.clear();
    p(true);
  }

  public void clearHeader()
  {
    this.abA = null;
    this.abz = null;
    this.abB = null;
    p(false);
  }

  public void close()
  {
    U(true);
  }

  public final void d(Bundle paramBundle)
  {
    Object localObject1 = null;
    int i = size();
    int j = 0;
    while (j < i)
    {
      MenuItem localMenuItem = getItem(j);
      View localView = localMenuItem.getActionView();
      Object localObject2 = localObject1;
      if (localView != null)
      {
        localObject2 = localObject1;
        if (localView.getId() != -1)
        {
          Object localObject3 = localObject1;
          if (localObject1 == null)
            localObject3 = new SparseArray();
          localView.saveHierarchyState((SparseArray)localObject3);
          localObject2 = localObject3;
          if (localMenuItem.isActionViewExpanded())
          {
            paramBundle.putInt("android:menu:expandedactionview", localMenuItem.getItemId());
            localObject2 = localObject3;
          }
        }
      }
      if (localMenuItem.hasSubMenu())
        ((u)localMenuItem.getSubMenu()).d(paramBundle);
      j++;
      localObject1 = localObject2;
    }
    if (localObject1 != null)
      paramBundle.putSparseParcelableArray(gu(), localObject1);
  }

  boolean d(h paramh, MenuItem paramMenuItem)
  {
    if ((this.abr != null) && (this.abr.a(paramh, paramMenuItem)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void dispatchRestoreInstanceState(Bundle paramBundle)
  {
    SparseArray localSparseArray = paramBundle.getSparseParcelableArray("android:menu:presenters");
    if ((localSparseArray == null) || (this.abI.isEmpty()));
    while (true)
    {
      return;
      paramBundle = this.abI.iterator();
      while (paramBundle.hasNext())
      {
        Object localObject = (WeakReference)paramBundle.next();
        o localo = (o)((WeakReference)localObject).get();
        if (localo == null)
        {
          this.abI.remove(localObject);
        }
        else
        {
          int i = localo.getId();
          if (i > 0)
          {
            localObject = (Parcelable)localSparseArray.get(i);
            if (localObject != null)
              localo.onRestoreInstanceState((Parcelable)localObject);
          }
        }
      }
    }
  }

  public final void e(Bundle paramBundle)
  {
    if (paramBundle == null);
    while (true)
    {
      return;
      SparseArray localSparseArray = paramBundle.getSparseParcelableArray(gu());
      int i = size();
      for (int j = 0; j < i; j++)
      {
        MenuItem localMenuItem = getItem(j);
        View localView = localMenuItem.getActionView();
        if ((localView != null) && (localView.getId() != -1))
          localView.restoreHierarchyState(localSparseArray);
        if (localMenuItem.hasSubMenu())
          ((u)localMenuItem.getSubMenu()).e(paramBundle);
      }
      j = paramBundle.getInt("android:menu:expandedactionview");
      if (j > 0)
      {
        paramBundle = findItem(j);
        if (paramBundle != null)
          paramBundle.expandActionView();
      }
    }
  }

  public MenuItem findItem(int paramInt)
  {
    int i = size();
    int j = 0;
    Object localObject;
    if (j < i)
    {
      localObject = (j)this.mItems.get(j);
      if (((j)localObject).getItemId() != paramInt);
    }
    while (true)
    {
      return localObject;
      if (((j)localObject).hasSubMenu())
      {
        MenuItem localMenuItem = ((j)localObject).getSubMenu().findItem(paramInt);
        localObject = localMenuItem;
        if (localMenuItem != null);
      }
      else
      {
        j++;
        break;
        localObject = null;
      }
    }
  }

  public boolean g(j paramj)
  {
    boolean bool1 = false;
    if (this.abI.isEmpty())
      return bool1;
    gx();
    Iterator localIterator = this.abI.iterator();
    boolean bool2 = false;
    while (true)
      label29: if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        o localo = (o)localWeakReference.get();
        if (localo == null)
        {
          this.abI.remove(localWeakReference);
        }
        else
        {
          bool2 = localo.b(paramj);
          if (!bool2)
            break;
        }
      }
    while (true)
    {
      gy();
      bool1 = bool2;
      if (!bool2)
        break;
      this.abJ = paramj;
      bool1 = bool2;
      break;
      break label29;
    }
  }

  final void gA()
  {
    this.abw = true;
    p(true);
  }

  public final ArrayList<j> gB()
  {
    if (!this.abt);
    for (Object localObject = this.abs; ; localObject = this.abs)
    {
      return localObject;
      this.abs.clear();
      int i = this.mItems.size();
      for (int j = 0; j < i; j++)
      {
        localObject = (j)this.mItems.get(j);
        if (((j)localObject).isVisible())
          this.abs.add(localObject);
      }
      this.abt = false;
      this.abw = true;
    }
  }

  public final void gC()
  {
    ArrayList localArrayList = gB();
    if (!this.abw);
    while (true)
    {
      return;
      Iterator localIterator = this.abI.iterator();
      int i = 0;
      Object localObject;
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        localObject = (o)localWeakReference.get();
        if (localObject == null)
          this.abI.remove(localWeakReference);
        else
          i = ((o)localObject).bt() | i;
      }
      if (i != 0)
      {
        this.abu.clear();
        this.abv.clear();
        int j = localArrayList.size();
        i = 0;
        if (i < j)
        {
          localObject = (j)localArrayList.get(i);
          if (((j)localObject).gJ())
            this.abu.add(localObject);
          while (true)
          {
            i++;
            break;
            this.abv.add(localObject);
          }
        }
      }
      else
      {
        this.abu.clear();
        this.abv.clear();
        this.abv.addAll(gB());
      }
      this.abw = false;
    }
  }

  public final ArrayList<j> gD()
  {
    gC();
    return this.abv;
  }

  public h gE()
  {
    return this;
  }

  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)this.mItems.get(paramInt);
  }

  protected String gu()
  {
    return "android:menu:actionviewstates";
  }

  boolean gv()
  {
    return this.abp;
  }

  public boolean gw()
  {
    return this.abq;
  }

  public final void gx()
  {
    if (!this.abC)
    {
      this.abC = true;
      this.abD = false;
      this.abE = false;
    }
  }

  public final void gy()
  {
    this.abC = false;
    if (this.abD)
    {
      this.abD = false;
      p(this.abE);
    }
  }

  final void gz()
  {
    this.abt = true;
    p(true);
  }

  public boolean h(j paramj)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (!this.abI.isEmpty())
    {
      if (this.abJ != paramj)
        bool2 = bool1;
    }
    else
      return bool2;
    gx();
    Iterator localIterator = this.abI.iterator();
    bool1 = false;
    while (true)
      label41: if (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        o localo = (o)localWeakReference.get();
        if (localo == null)
        {
          this.abI.remove(localWeakReference);
        }
        else
        {
          bool1 = localo.c(paramj);
          if (!bool1)
            break;
        }
      }
    while (true)
    {
      gy();
      bool2 = bool1;
      if (!bool1)
        break;
      this.abJ = null;
      bool2 = bool1;
      break;
      break label41;
    }
  }

  public boolean hasVisibleItems()
  {
    boolean bool;
    if (this.abK)
      bool = true;
    while (true)
    {
      return bool;
      int i = size();
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label51;
        if (((j)this.mItems.get(j)).isVisible())
        {
          bool = true;
          break;
        }
      }
      label51: bool = false;
    }
  }

  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    if (a(paramInt, paramKeyEvent) != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void p(boolean paramBoolean)
  {
    if (!this.abC)
    {
      if (paramBoolean)
      {
        this.abt = true;
        this.abw = true;
      }
      if (!this.abI.isEmpty())
      {
        gx();
        Iterator localIterator = this.abI.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          o localo = (o)localWeakReference.get();
          if (localo == null)
            this.abI.remove(localWeakReference);
          else
            localo.n(paramBoolean);
        }
        gy();
      }
    }
    while (true)
    {
      return;
      this.abD = true;
      if (paramBoolean)
        this.abE = true;
    }
  }

  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), null, paramInt2);
  }

  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    paramKeyEvent = a(paramInt1, paramKeyEvent);
    boolean bool = false;
    if (paramKeyEvent != null)
      bool = a(paramKeyEvent, null, paramInt2);
    if ((paramInt2 & 0x2) != 0)
      U(true);
    return bool;
  }

  public void removeGroup(int paramInt)
  {
    int i = size();
    int j = 0;
    if (j < i)
      if (((j)this.mItems.get(j)).getGroupId() != paramInt);
    while (true)
      label30: if (j >= 0)
      {
        int k = this.mItems.size();
        i = 0;
        while (true)
          if ((i < k - j) && (((j)this.mItems.get(j)).getGroupId() == paramInt))
          {
            l(j, false);
            i++;
            continue;
            j++;
            break;
            j = -1;
            break label30;
          }
        p(true);
      }
  }

  public void removeItem(int paramInt)
  {
    int i = size();
    int j = 0;
    if (j < i)
      if (((j)this.mItems.get(j)).getItemId() != paramInt);
    for (paramInt = j; ; paramInt = -1)
    {
      l(paramInt, true);
      return;
      j++;
      break;
    }
  }

  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = this.mItems.size();
    for (int j = 0; j < i; j++)
    {
      j localj = (j)this.mItems.get(j);
      if (localj.getGroupId() == paramInt)
      {
        localj.V(paramBoolean2);
        localj.setCheckable(paramBoolean1);
      }
    }
  }

  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i = this.mItems.size();
    for (int j = 0; j < i; j++)
    {
      j localj = (j)this.mItems.get(j);
      if (localj.getGroupId() == paramInt)
        localj.setEnabled(paramBoolean);
    }
  }

  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i = this.mItems.size();
    int j = 0;
    int k = 0;
    if (j < i)
    {
      j localj = (j)this.mItems.get(j);
      if ((localj.getGroupId() != paramInt) || (!localj.X(paramBoolean)))
        break label72;
      k = 1;
    }
    label72: 
    while (true)
    {
      j++;
      break;
      if (k != 0)
        p(true);
      return;
    }
  }

  public void setQwertyMode(boolean paramBoolean)
  {
    this.abp = paramBoolean;
    p(false);
  }

  public int size()
  {
    return this.mItems.size();
  }

  public static abstract interface a
  {
    public abstract boolean a(h paramh, MenuItem paramMenuItem);

    public abstract void b(h paramh);
  }

  public static abstract interface b
  {
    public abstract boolean f(j paramj);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.h
 * JD-Core Version:    0.6.2
 */