package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public final class b
{
  public final AccessibilityNodeInfo NG;
  public int NH = -1;

  private b(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    this.NG = paramAccessibilityNodeInfo;
  }

  public static b a(b paramb)
  {
    return a(AccessibilityNodeInfo.obtain(paramb.NG));
  }

  public static b a(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return new b(paramAccessibilityNodeInfo);
  }

  public final void H(Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= 19)
      this.NG.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)((c)paramObject).On);
  }

  public final boolean a(a parama)
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (boolean bool = this.NG.removeAction((AccessibilityNodeInfo.AccessibilityAction)parama.Om); ; bool = false)
      return bool;
  }

  public final void addAction(int paramInt)
  {
    this.NG.addAction(paramInt);
  }

  public final void addChild(View paramView)
  {
    this.NG.addChild(paramView);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else if (getClass() != paramObject.getClass())
      {
        bool = false;
      }
      else
      {
        paramObject = (b)paramObject;
        if (this.NG == null)
        {
          if (paramObject.NG != null)
            bool = false;
        }
        else if (!this.NG.equals(paramObject.NG))
          bool = false;
      }
    }
  }

  public final void getBoundsInParent(Rect paramRect)
  {
    this.NG.getBoundsInParent(paramRect);
  }

  public final void getBoundsInScreen(Rect paramRect)
  {
    this.NG.getBoundsInScreen(paramRect);
  }

  public final int hashCode()
  {
    if (this.NG == null);
    for (int i = 0; ; i = this.NG.hashCode())
      return i;
  }

  public final boolean isAccessibilityFocused()
  {
    if (Build.VERSION.SDK_INT >= 16);
    for (boolean bool = this.NG.isAccessibilityFocused(); ; bool = false)
      return bool;
  }

  public final boolean isVisibleToUser()
  {
    if (Build.VERSION.SDK_INT >= 16);
    for (boolean bool = this.NG.isVisibleToUser(); ; bool = false)
      return bool;
  }

  public final void setAccessibilityFocused(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 16)
      this.NG.setAccessibilityFocused(paramBoolean);
  }

  public final void setBoundsInParent(Rect paramRect)
  {
    this.NG.setBoundsInParent(paramRect);
  }

  public final void setBoundsInScreen(Rect paramRect)
  {
    this.NG.setBoundsInScreen(paramRect);
  }

  public final void setCheckable(boolean paramBoolean)
  {
    this.NG.setCheckable(paramBoolean);
  }

  public final void setClassName(CharSequence paramCharSequence)
  {
    this.NG.setClassName(paramCharSequence);
  }

  public final void setClickable(boolean paramBoolean)
  {
    this.NG.setClickable(paramBoolean);
  }

  public final void setContentDescription(CharSequence paramCharSequence)
  {
    this.NG.setContentDescription(paramCharSequence);
  }

  public final void setDismissable(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 19)
      this.NG.setDismissable(paramBoolean);
  }

  public final void setEnabled(boolean paramBoolean)
  {
    this.NG.setEnabled(paramBoolean);
  }

  public final void setFocusable(boolean paramBoolean)
  {
    this.NG.setFocusable(paramBoolean);
  }

  public final void setFocused(boolean paramBoolean)
  {
    this.NG.setFocused(paramBoolean);
  }

  public final void setLongClickable(boolean paramBoolean)
  {
    this.NG.setLongClickable(paramBoolean);
  }

  public final void setPackageName(CharSequence paramCharSequence)
  {
    this.NG.setPackageName(paramCharSequence);
  }

  public final void setParent(View paramView)
  {
    this.NG.setParent(paramView);
  }

  public final void setScrollable(boolean paramBoolean)
  {
    this.NG.setScrollable(paramBoolean);
  }

  public final void setSelected(boolean paramBoolean)
  {
    this.NG.setSelected(paramBoolean);
  }

  public final void setSource(View paramView)
  {
    this.NG.setSource(paramView);
  }

  public final void setText(CharSequence paramCharSequence)
  {
    this.NG.setText(paramCharSequence);
  }

  public final void setVisibleToUser(boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 16)
      this.NG.setVisibleToUser(paramBoolean);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(super.toString());
    Object localObject = new Rect();
    getBoundsInParent((Rect)localObject);
    localStringBuilder1.append("; boundsInParent: ".concat(String.valueOf(localObject)));
    getBoundsInScreen((Rect)localObject);
    localStringBuilder1.append("; boundsInScreen: ".concat(String.valueOf(localObject)));
    localStringBuilder1.append("; packageName: ").append(this.NG.getPackageName());
    localStringBuilder1.append("; className: ").append(this.NG.getClassName());
    localStringBuilder1.append("; text: ").append(this.NG.getText());
    localStringBuilder1.append("; contentDescription: ").append(this.NG.getContentDescription());
    StringBuilder localStringBuilder2 = localStringBuilder1.append("; viewId: ");
    int i;
    if (Build.VERSION.SDK_INT >= 18)
    {
      localObject = this.NG.getViewIdResourceName();
      localStringBuilder2.append((String)localObject);
      localStringBuilder1.append("; checkable: ").append(this.NG.isCheckable());
      localStringBuilder1.append("; checked: ").append(this.NG.isChecked());
      localStringBuilder1.append("; focusable: ").append(this.NG.isFocusable());
      localStringBuilder1.append("; focused: ").append(this.NG.isFocused());
      localStringBuilder1.append("; selected: ").append(this.NG.isSelected());
      localStringBuilder1.append("; clickable: ").append(this.NG.isClickable());
      localStringBuilder1.append("; longClickable: ").append(this.NG.isLongClickable());
      localStringBuilder1.append("; enabled: ").append(this.NG.isEnabled());
      localStringBuilder1.append("; password: ").append(this.NG.isPassword());
      localStringBuilder1.append("; scrollable: " + this.NG.isScrollable());
      localStringBuilder1.append("; [");
      i = this.NG.getActions();
      label360: if (i == 0)
        break label697;
      int j = 1 << Integer.numberOfTrailingZeros(i);
      i = (j ^ 0xFFFFFFFF) & i;
      switch (j)
      {
      default:
        localObject = "ACTION_UNKNOWN";
      case 1:
      case 2:
      case 4:
      case 8:
      case 16:
      case 32:
      case 64:
      case 128:
      case 256:
      case 512:
      case 1024:
      case 2048:
      case 4096:
      case 8192:
      case 65536:
      case 16384:
      case 32768:
      case 131072:
      }
    }
    while (true)
    {
      localStringBuilder1.append((String)localObject);
      if (i != 0)
        localStringBuilder1.append(", ");
      break label360;
      localObject = null;
      break;
      localObject = "ACTION_FOCUS";
      continue;
      localObject = "ACTION_CLEAR_FOCUS";
      continue;
      localObject = "ACTION_SELECT";
      continue;
      localObject = "ACTION_CLEAR_SELECTION";
      continue;
      localObject = "ACTION_CLICK";
      continue;
      localObject = "ACTION_LONG_CLICK";
      continue;
      localObject = "ACTION_ACCESSIBILITY_FOCUS";
      continue;
      localObject = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
      continue;
      localObject = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
      continue;
      localObject = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
      continue;
      localObject = "ACTION_NEXT_HTML_ELEMENT";
      continue;
      localObject = "ACTION_PREVIOUS_HTML_ELEMENT";
      continue;
      localObject = "ACTION_SCROLL_FORWARD";
      continue;
      localObject = "ACTION_SCROLL_BACKWARD";
      continue;
      localObject = "ACTION_CUT";
      continue;
      localObject = "ACTION_COPY";
      continue;
      localObject = "ACTION_PASTE";
      continue;
      localObject = "ACTION_SET_SELECTION";
    }
    label697: localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }

  public static final class a
  {
    public static final a NI;
    public static final a NJ;
    public static final a NK;
    public static final a NL;
    public static final a NM;
    public static final a NN;
    public static final a NO;
    public static final a NP;
    public static final a NQ;
    public static final a NR;
    public static final a NS;
    public static final a NT;
    public static final a NU;
    public static final a NV;
    public static final a NW;
    public static final a NX;
    public static final a NY;
    public static final a NZ;
    public static final a Oa;
    public static final a Ob;
    public static final a Oc;
    public static final a Od;
    public static final a Oe;
    public static final a Of;
    public static final a Og;
    public static final a Oh;
    public static final a Oi;
    public static final a Oj;
    public static final a Ok;
    public static final a Ol;
    final Object Om;

    static
    {
      Object localObject1 = null;
      NI = new a(1);
      NJ = new a(2);
      NK = new a(4);
      NL = new a(8);
      NM = new a(16);
      NN = new a(32);
      NO = new a(64);
      NP = new a(128);
      NQ = new a(256);
      NR = new a(512);
      NS = new a(1024);
      NT = new a(2048);
      NU = new a(4096);
      NV = new a(8192);
      NW = new a(16384);
      NX = new a(32768);
      NY = new a(65536);
      NZ = new a(131072);
      Oa = new a(262144);
      Ob = new a(524288);
      Oc = new a(1048576);
      Od = new a(2097152);
      if (Build.VERSION.SDK_INT >= 23)
      {
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        Oe = new a(localObject2);
        if (Build.VERSION.SDK_INT < 23)
          break label463;
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        label306: Of = new a(localObject2);
        if (Build.VERSION.SDK_INT < 23)
          break label468;
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        label329: Og = new a(localObject2);
        if (Build.VERSION.SDK_INT < 23)
          break label473;
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        label352: Oh = new a(localObject2);
        if (Build.VERSION.SDK_INT < 23)
          break label478;
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        label375: Oi = new a(localObject2);
        if (Build.VERSION.SDK_INT < 23)
          break label483;
        localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        label398: Oj = new a(localObject2);
        if (Build.VERSION.SDK_INT < 23)
          break label488;
      }
      label463: label468: label473: label478: label483: label488: for (Object localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK; ; localObject2 = null)
      {
        Ok = new a(localObject2);
        localObject2 = localObject1;
        if (Build.VERSION.SDK_INT >= 24)
          localObject2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        Ol = new a(localObject2);
        return;
        localObject2 = null;
        break;
        localObject2 = null;
        break label306;
        localObject2 = null;
        break label329;
        localObject2 = null;
        break label352;
        localObject2 = null;
        break label375;
        localObject2 = null;
        break label398;
      }
    }

    private a(int paramInt)
    {
    }

    private a(Object paramObject)
    {
      this.Om = paramObject;
    }
  }

  public static final class b
  {
    public final Object On;

    public b(Object paramObject)
    {
      this.On = paramObject;
    }
  }

  public static final class c
  {
    final Object On;

    private c(Object paramObject)
    {
      this.On = paramObject;
    }

    public static c b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      c localc;
      if (Build.VERSION.SDK_INT >= 21)
        localc = new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, false));
      while (true)
      {
        return localc;
        if (Build.VERSION.SDK_INT >= 19)
          localc = new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean));
        else
          localc = new c(null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.b
 * JD-Core Version:    0.6.2
 */