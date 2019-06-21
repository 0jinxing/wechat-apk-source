package android.support.v4.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.f.n;
import android.support.v4.view.a.b;
import android.support.v4.view.a.c;
import android.support.v4.view.s;
import android.support.v4.view.v;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class j extends android.support.v4.view.a
{
  private static final String DEFAULT_CLASS_NAME = "android.view.View";
  public static final int HOST_ID = -1;
  public static final int INVALID_ID = -2147483648;
  private static final Rect INVALID_PARENT_BOUNDS = new Rect(2147483647, 2147483647, -2147483648, -2147483648);
  private static final k.a<b> NODE_ADAPTER = new j.1();
  private static final k.b<n<b>, b> SPARSE_VALUES_ADAPTER = new j.2();
  private int mAccessibilityFocusedVirtualViewId = -2147483648;
  private final View mHost;
  private int mHoveredVirtualViewId = -2147483648;
  private int mKeyboardFocusedVirtualViewId = -2147483648;
  private final AccessibilityManager mManager;
  private j.a mNodeProvider;
  private final int[] mTempGlobalRect = new int[2];
  private final Rect mTempParentRect = new Rect();
  private final Rect mTempScreenRect = new Rect();
  private final Rect mTempVisibleRect = new Rect();

  public j(View paramView)
  {
    if (paramView == null)
      throw new IllegalArgumentException("View may not be null");
    this.mHost = paramView;
    this.mManager = ((AccessibilityManager)paramView.getContext().getSystemService("accessibility"));
    paramView.setFocusable(true);
    if (s.S(paramView) == 0)
      s.o(paramView, 1);
  }

  private boolean clearAccessibilityFocus(int paramInt)
  {
    if (this.mAccessibilityFocusedVirtualViewId == paramInt)
    {
      this.mAccessibilityFocusedVirtualViewId = -2147483648;
      this.mHost.invalidate();
      sendEventForVirtualView(paramInt, 65536);
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean clickKeyboardFocusedVirtualView()
  {
    if ((this.mKeyboardFocusedVirtualViewId != -2147483648) && (onPerformActionForVirtualView(this.mKeyboardFocusedVirtualViewId, 16, null)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private AccessibilityEvent createEvent(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default:
    case -1:
    }
    for (AccessibilityEvent localAccessibilityEvent = createEventForChild(paramInt1, paramInt2); ; localAccessibilityEvent = createEventForHost(paramInt2))
      return localAccessibilityEvent;
  }

  private AccessibilityEvent createEventForChild(int paramInt1, int paramInt2)
  {
    AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(paramInt2);
    Object localObject = obtainAccessibilityNodeInfo(paramInt1);
    localAccessibilityEvent.getText().add(((b)localObject).NG.getText());
    localAccessibilityEvent.setContentDescription(((b)localObject).NG.getContentDescription());
    localAccessibilityEvent.setScrollable(((b)localObject).NG.isScrollable());
    localAccessibilityEvent.setPassword(((b)localObject).NG.isPassword());
    localAccessibilityEvent.setEnabled(((b)localObject).NG.isEnabled());
    localAccessibilityEvent.setChecked(((b)localObject).NG.isChecked());
    onPopulateEventForVirtualView(paramInt1, localAccessibilityEvent);
    if ((localAccessibilityEvent.getText().isEmpty()) && (localAccessibilityEvent.getContentDescription() == null))
      throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    localAccessibilityEvent.setClassName(((b)localObject).NG.getClassName());
    localObject = this.mHost;
    if (Build.VERSION.SDK_INT >= 16)
      localAccessibilityEvent.setSource((View)localObject, paramInt1);
    localAccessibilityEvent.setPackageName(this.mHost.getContext().getPackageName());
    return localAccessibilityEvent;
  }

  private AccessibilityEvent createEventForHost(int paramInt)
  {
    AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain(paramInt);
    this.mHost.onInitializeAccessibilityEvent(localAccessibilityEvent);
    return localAccessibilityEvent;
  }

  private b createNodeForChild(int paramInt)
  {
    b localb = b.a(AccessibilityNodeInfo.obtain());
    localb.setEnabled(true);
    localb.setFocusable(true);
    localb.setClassName("android.view.View");
    localb.setBoundsInParent(INVALID_PARENT_BOUNDS);
    localb.setBoundsInScreen(INVALID_PARENT_BOUNDS);
    localb.setParent(this.mHost);
    onPopulateNodeForVirtualView(paramInt, localb);
    if ((localb.NG.getText() == null) && (localb.NG.getContentDescription() == null))
      throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
    localb.getBoundsInParent(this.mTempParentRect);
    if (this.mTempParentRect.equals(INVALID_PARENT_BOUNDS))
      throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    int i = localb.NG.getActions();
    if ((i & 0x40) != 0)
      throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    if ((i & 0x80) != 0)
      throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    localb.setPackageName(this.mHost.getContext().getPackageName());
    Object localObject = this.mHost;
    if (Build.VERSION.SDK_INT >= 16)
      localb.NG.setSource((View)localObject, paramInt);
    boolean bool;
    if (this.mAccessibilityFocusedVirtualViewId == paramInt)
    {
      localb.setAccessibilityFocused(true);
      localb.addAction(128);
      if (this.mKeyboardFocusedVirtualViewId != paramInt)
        break label409;
      bool = true;
      label228: if (!bool)
        break label415;
      localb.addAction(2);
    }
    while (true)
    {
      localb.setFocused(bool);
      this.mHost.getLocationOnScreen(this.mTempGlobalRect);
      localb.getBoundsInScreen(this.mTempScreenRect);
      if (!this.mTempScreenRect.equals(INVALID_PARENT_BOUNDS))
        break label476;
      localb.getBoundsInParent(this.mTempScreenRect);
      if (localb.NH == -1)
        break label441;
      localObject = b.a(AccessibilityNodeInfo.obtain());
      for (paramInt = localb.NH; paramInt != -1; paramInt = ((b)localObject).NH)
      {
        View localView = this.mHost;
        ((b)localObject).NH = -1;
        if (Build.VERSION.SDK_INT >= 16)
          ((b)localObject).NG.setParent(localView, -1);
        ((b)localObject).setBoundsInParent(INVALID_PARENT_BOUNDS);
        onPopulateNodeForVirtualView(paramInt, (b)localObject);
        ((b)localObject).getBoundsInParent(this.mTempParentRect);
        this.mTempScreenRect.offset(this.mTempParentRect.left, this.mTempParentRect.top);
      }
      localb.setAccessibilityFocused(false);
      localb.addAction(64);
      break;
      label409: bool = false;
      break label228;
      label415: if (localb.NG.isFocusable())
        localb.addAction(1);
    }
    ((b)localObject).NG.recycle();
    label441: this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
    label476: if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect))
    {
      this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
      if (this.mTempScreenRect.intersect(this.mTempVisibleRect))
      {
        localb.setBoundsInScreen(this.mTempScreenRect);
        if (isVisibleToUser(this.mTempScreenRect))
          localb.setVisibleToUser(true);
      }
    }
    return localb;
  }

  private b createNodeForHost()
  {
    b localb = b.a(AccessibilityNodeInfo.obtain(this.mHost));
    s.onInitializeAccessibilityNodeInfo(this.mHost, localb);
    ArrayList localArrayList = new ArrayList();
    getVisibleVirtualViews(localArrayList);
    if ((localb.NG.getChildCount() > 0) && (localArrayList.size() > 0))
      throw new RuntimeException("Views cannot have both real and virtual children");
    int i = localArrayList.size();
    for (int j = 0; j < i; j++)
    {
      View localView = this.mHost;
      int k = ((Integer)localArrayList.get(j)).intValue();
      if (Build.VERSION.SDK_INT >= 16)
        localb.NG.addChild(localView, k);
    }
    return localb;
  }

  private n<b> getAllNodes()
  {
    ArrayList localArrayList = new ArrayList();
    getVisibleVirtualViews(localArrayList);
    n localn = new n();
    for (int i = 0; i < localArrayList.size(); i++)
      localn.put(i, createNodeForChild(i));
    return localn;
  }

  private void getBoundsInParent(int paramInt, Rect paramRect)
  {
    obtainAccessibilityNodeInfo(paramInt).getBoundsInParent(paramRect);
  }

  private static Rect guessPreviouslyFocusedRect(View paramView, int paramInt, Rect paramRect)
  {
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    case 17:
      paramRect.set(i, 0, i, j);
    case 33:
    case 66:
    case 130:
    }
    while (true)
    {
      return paramRect;
      paramRect.set(0, j, i, j);
      continue;
      paramRect.set(-1, 0, -1, j);
      continue;
      paramRect.set(0, -1, i, -1);
    }
  }

  private boolean isVisibleToUser(Rect paramRect)
  {
    boolean bool;
    if ((paramRect == null) || (paramRect.isEmpty()))
      bool = false;
    while (true)
    {
      return bool;
      if (this.mHost.getWindowVisibility() != 0)
      {
        bool = false;
      }
      else
      {
        for (paramRect = this.mHost.getParent(); ; paramRect = paramRect.getParent())
        {
          if (!(paramRect instanceof View))
            break label79;
          paramRect = (View)paramRect;
          if ((paramRect.getAlpha() <= 0.0F) || (paramRect.getVisibility() != 0))
          {
            bool = false;
            break;
          }
        }
        label79: if (paramRect != null)
          bool = true;
        else
          bool = false;
      }
    }
  }

  private static int keyToDirection(int paramInt)
  {
    switch (paramInt)
    {
    case 20:
    default:
      paramInt = 130;
    case 21:
    case 19:
    case 22:
    }
    while (true)
    {
      return paramInt;
      paramInt = 17;
      continue;
      paramInt = 33;
      continue;
      paramInt = 66;
    }
  }

  private boolean moveFocus(int paramInt, Rect paramRect)
  {
    int i = 0;
    n localn = getAllNodes();
    int j = this.mKeyboardFocusedVirtualViewId;
    if (j == -2147483648);
    for (b localb = null; ; localb = (b)localn.aH(j))
      switch (paramInt)
      {
      default:
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
      case 1:
      case 2:
      case 17:
      case 33:
      case 66:
      case 130:
      }
    if (s.T(this.mHost) == 1);
    Object localObject;
    for (boolean bool = true; ; bool = false)
    {
      k.b localb1 = SPARSE_VALUES_ADAPTER;
      paramRect = NODE_ADAPTER;
      j = localb1.L(localn);
      localObject = new ArrayList(j);
      while (i < j)
      {
        ((ArrayList)localObject).add(localb1.get(localn, i));
        i++;
      }
    }
    Collections.sort((List)localObject, new k.c(bool, paramRect));
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    case 2:
      i = ((ArrayList)localObject).size();
      if (localb == null)
      {
        paramInt = -1;
        paramInt++;
        if (paramInt >= i)
          break label296;
        paramRect = ((ArrayList)localObject).get(paramInt);
        label267: paramRect = (b)paramRect;
        if (paramRect != null)
          break label423;
      }
      break;
    case 1:
    }
    label423: for (paramInt = -2147483648; ; paramInt = localn.keyAt(localn.indexOfValue(paramRect)))
    {
      return requestKeyboardFocusForVirtualView(paramInt);
      paramInt = ((ArrayList)localObject).lastIndexOf(localb);
      break;
      label296: paramRect = null;
      break label267;
      paramInt = ((ArrayList)localObject).size();
      if (localb == null);
      while (true)
      {
        paramInt--;
        if (paramInt < 0)
          break label340;
        paramRect = ((ArrayList)localObject).get(paramInt);
        break;
        paramInt = ((ArrayList)localObject).indexOf(localb);
      }
      label340: paramRect = null;
      break label267;
      localObject = new Rect();
      if (this.mKeyboardFocusedVirtualViewId != -2147483648)
        getBoundsInParent(this.mKeyboardFocusedVirtualViewId, (Rect)localObject);
      while (true)
      {
        paramRect = (b)k.a(localn, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, localb, (Rect)localObject, paramInt);
        break;
        if (paramRect != null)
          ((Rect)localObject).set(paramRect);
        else
          guessPreviouslyFocusedRect(this.mHost, paramInt, (Rect)localObject);
      }
    }
  }

  private boolean performActionForChild(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    boolean bool;
    switch (paramInt2)
    {
    default:
      bool = onPerformActionForVirtualView(paramInt1, paramInt2, paramBundle);
    case 64:
    case 128:
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      bool = requestAccessibilityFocus(paramInt1);
      continue;
      bool = clearAccessibilityFocus(paramInt1);
      continue;
      bool = requestKeyboardFocusForVirtualView(paramInt1);
      continue;
      bool = clearKeyboardFocusForVirtualView(paramInt1);
    }
  }

  private boolean performActionForHost(int paramInt, Bundle paramBundle)
  {
    return s.performAccessibilityAction(this.mHost, paramInt, paramBundle);
  }

  private boolean requestAccessibilityFocus(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.mManager.isEnabled())
    {
      if (this.mManager.isTouchExplorationEnabled())
        break label28;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label28: bool2 = bool1;
      if (this.mAccessibilityFocusedVirtualViewId != paramInt)
      {
        if (this.mAccessibilityFocusedVirtualViewId != -2147483648)
          clearAccessibilityFocus(this.mAccessibilityFocusedVirtualViewId);
        this.mAccessibilityFocusedVirtualViewId = paramInt;
        this.mHost.invalidate();
        sendEventForVirtualView(paramInt, 32768);
        bool2 = true;
      }
    }
  }

  private void updateHoveredVirtualView(int paramInt)
  {
    if (this.mHoveredVirtualViewId == paramInt);
    while (true)
    {
      return;
      int i = this.mHoveredVirtualViewId;
      this.mHoveredVirtualViewId = paramInt;
      sendEventForVirtualView(paramInt, 128);
      sendEventForVirtualView(i, 256);
    }
  }

  public final boolean clearKeyboardFocusForVirtualView(int paramInt)
  {
    boolean bool = false;
    if (this.mKeyboardFocusedVirtualViewId != paramInt);
    while (true)
    {
      return bool;
      this.mKeyboardFocusedVirtualViewId = -2147483648;
      onVirtualViewKeyboardFocusChanged(paramInt, false);
      sendEventForVirtualView(paramInt, 8);
      bool = true;
    }
  }

  public final boolean dispatchHoverEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if ((!this.mManager.isEnabled()) || (!this.mManager.isTouchExplorationEnabled()))
      bool = false;
    while (true)
    {
      return bool;
      switch (paramMotionEvent.getAction())
      {
      case 8:
      default:
        bool = false;
        break;
      case 7:
      case 9:
        int i = getVirtualViewAt(paramMotionEvent.getX(), paramMotionEvent.getY());
        updateHoveredVirtualView(i);
        if (i == -2147483648)
          bool = false;
        break;
      case 10:
        if (this.mAccessibilityFocusedVirtualViewId != -2147483648)
          updateHoveredVirtualView(-2147483648);
        else
          bool = false;
        break;
      }
    }
  }

  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i;
    if (paramKeyEvent.getAction() != 1)
      i = paramKeyEvent.getKeyCode();
    boolean bool1;
    switch (i)
    {
    default:
      bool1 = false;
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 66:
    case 61:
    }
    while (true)
    {
      return bool1;
      if (!paramKeyEvent.hasNoModifiers())
        break;
      int j = keyToDirection(i);
      int k = paramKeyEvent.getRepeatCount();
      i = 0;
      for (boolean bool2 = false; ; bool2 = true)
      {
        bool1 = bool2;
        if (i >= k + 1)
          break;
        bool1 = bool2;
        if (!moveFocus(j, null))
          break;
        i++;
      }
      if ((!paramKeyEvent.hasNoModifiers()) || (paramKeyEvent.getRepeatCount() != 0))
        break;
      clickKeyboardFocusedVirtualView();
      bool1 = true;
      continue;
      if (paramKeyEvent.hasNoModifiers())
      {
        bool1 = moveFocus(2, null);
      }
      else
      {
        if (!paramKeyEvent.hasModifiers(1))
          break;
        bool1 = moveFocus(1, null);
      }
    }
  }

  public final int getAccessibilityFocusedVirtualViewId()
  {
    return this.mAccessibilityFocusedVirtualViewId;
  }

  public c getAccessibilityNodeProvider(View paramView)
  {
    if (this.mNodeProvider == null)
      this.mNodeProvider = new j.a(this);
    return this.mNodeProvider;
  }

  @Deprecated
  public int getFocusedVirtualView()
  {
    return getAccessibilityFocusedVirtualViewId();
  }

  public final int getKeyboardFocusedVirtualViewId()
  {
    return this.mKeyboardFocusedVirtualViewId;
  }

  protected abstract int getVirtualViewAt(float paramFloat1, float paramFloat2);

  protected abstract void getVisibleVirtualViews(List<Integer> paramList);

  public final void invalidateRoot()
  {
    invalidateVirtualView(-1, 1);
  }

  public final void invalidateVirtualView(int paramInt)
  {
    invalidateVirtualView(paramInt, 0);
  }

  public final void invalidateVirtualView(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != -2147483648) && (this.mManager.isEnabled()))
    {
      ViewParent localViewParent = this.mHost.getParent();
      if (localViewParent != null)
      {
        AccessibilityEvent localAccessibilityEvent = createEvent(paramInt1, 2048);
        android.support.v4.view.a.a.a(localAccessibilityEvent, paramInt2);
        v.a(localViewParent, this.mHost, localAccessibilityEvent);
      }
    }
  }

  b obtainAccessibilityNodeInfo(int paramInt)
  {
    if (paramInt == -1);
    for (b localb = createNodeForHost(); ; localb = createNodeForChild(paramInt))
      return localb;
  }

  public final void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    if (this.mKeyboardFocusedVirtualViewId != -2147483648)
      clearKeyboardFocusForVirtualView(this.mKeyboardFocusedVirtualViewId);
    if (paramBoolean)
      moveFocus(paramInt, paramRect);
  }

  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    onPopulateEventForHost(paramAccessibilityEvent);
  }

  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    super.onInitializeAccessibilityNodeInfo(paramView, paramb);
    onPopulateNodeForHost(paramb);
  }

  protected abstract boolean onPerformActionForVirtualView(int paramInt1, int paramInt2, Bundle paramBundle);

  protected void onPopulateEventForHost(AccessibilityEvent paramAccessibilityEvent)
  {
  }

  protected void onPopulateEventForVirtualView(int paramInt, AccessibilityEvent paramAccessibilityEvent)
  {
  }

  protected void onPopulateNodeForHost(b paramb)
  {
  }

  protected abstract void onPopulateNodeForVirtualView(int paramInt, b paramb);

  protected void onVirtualViewKeyboardFocusChanged(int paramInt, boolean paramBoolean)
  {
  }

  boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    switch (paramInt1)
    {
    default:
    case -1:
    }
    for (boolean bool = performActionForChild(paramInt1, paramInt2, paramBundle); ; bool = performActionForHost(paramInt2, paramBundle))
      return bool;
  }

  public final boolean requestKeyboardFocusForVirtualView(int paramInt)
  {
    boolean bool = false;
    if ((!this.mHost.isFocused()) && (!this.mHost.requestFocus()));
    while (true)
    {
      return bool;
      if (this.mKeyboardFocusedVirtualViewId != paramInt)
      {
        if (this.mKeyboardFocusedVirtualViewId != -2147483648)
          clearKeyboardFocusForVirtualView(this.mKeyboardFocusedVirtualViewId);
        this.mKeyboardFocusedVirtualViewId = paramInt;
        onVirtualViewKeyboardFocusChanged(paramInt, true);
        sendEventForVirtualView(paramInt, 8);
        bool = true;
      }
    }
  }

  public final boolean sendEventForVirtualView(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramInt1 != -2147483648)
    {
      if (this.mManager.isEnabled())
        break label27;
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      label27: ViewParent localViewParent = this.mHost.getParent();
      bool2 = bool1;
      if (localViewParent != null)
      {
        AccessibilityEvent localAccessibilityEvent = createEvent(paramInt1, paramInt2);
        bool2 = v.a(localViewParent, this.mHost, localAccessibilityEvent);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.j
 * JD-Core Version:    0.6.2
 */