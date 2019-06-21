package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.a.b;
import android.support.v4.view.a.c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public class a
{
  private static final View.AccessibilityDelegate DEFAULT_DELEGATE;
  private static final b IMPL;
  final View.AccessibilityDelegate mBridge = IMPL.a(this);

  static
  {
    if (Build.VERSION.SDK_INT >= 16);
    for (IMPL = new a(); ; IMPL = new b())
    {
      DEFAULT_DELEGATE = new View.AccessibilityDelegate();
      return;
    }
  }

  public boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return DEFAULT_DELEGATE.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public c getAccessibilityNodeProvider(View paramView)
  {
    return IMPL.a(DEFAULT_DELEGATE, paramView);
  }

  View.AccessibilityDelegate getBridge()
  {
    return this.mBridge;
  }

  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    DEFAULT_DELEGATE.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public void onInitializeAccessibilityNodeInfo(View paramView, b paramb)
  {
    DEFAULT_DELEGATE.onInitializeAccessibilityNodeInfo(paramView, paramb.NG);
  }

  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    DEFAULT_DELEGATE.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }

  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return DEFAULT_DELEGATE.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return IMPL.a(DEFAULT_DELEGATE, paramView, paramInt, paramBundle);
  }

  public void sendAccessibilityEvent(View paramView, int paramInt)
  {
    DEFAULT_DELEGATE.sendAccessibilityEvent(paramView, paramInt);
  }

  public void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    DEFAULT_DELEGATE.sendAccessibilityEventUnchecked(paramView, paramAccessibilityEvent);
  }

  static final class a extends a.b
  {
    public final c a(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView)
    {
      paramAccessibilityDelegate = paramAccessibilityDelegate.getAccessibilityNodeProvider(paramView);
      if (paramAccessibilityDelegate != null);
      for (paramAccessibilityDelegate = new c(paramAccessibilityDelegate); ; paramAccessibilityDelegate = null)
        return paramAccessibilityDelegate;
    }

    public final View.AccessibilityDelegate a(final a parama)
    {
      return new View.AccessibilityDelegate()
      {
        public final boolean dispatchPopulateAccessibilityEvent(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          return parama.dispatchPopulateAccessibilityEvent(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View paramAnonymousView)
        {
          paramAnonymousView = parama.getAccessibilityNodeProvider(paramAnonymousView);
          if (paramAnonymousView != null);
          for (paramAnonymousView = (AccessibilityNodeProvider)paramAnonymousView.Oo; ; paramAnonymousView = null)
            return paramAnonymousView;
        }

        public final void onInitializeAccessibilityEvent(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          parama.onInitializeAccessibilityEvent(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View paramAnonymousView, AccessibilityNodeInfo paramAnonymousAccessibilityNodeInfo)
        {
          parama.onInitializeAccessibilityNodeInfo(paramAnonymousView, b.a(paramAnonymousAccessibilityNodeInfo));
        }

        public final void onPopulateAccessibilityEvent(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          parama.onPopulateAccessibilityEvent(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup paramAnonymousViewGroup, View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          return parama.onRequestSendAccessibilityEvent(paramAnonymousViewGroup, paramAnonymousView, paramAnonymousAccessibilityEvent);
        }

        public final boolean performAccessibilityAction(View paramAnonymousView, int paramAnonymousInt, Bundle paramAnonymousBundle)
        {
          return parama.performAccessibilityAction(paramAnonymousView, paramAnonymousInt, paramAnonymousBundle);
        }

        public final void sendAccessibilityEvent(View paramAnonymousView, int paramAnonymousInt)
        {
          parama.sendAccessibilityEvent(paramAnonymousView, paramAnonymousInt);
        }

        public final void sendAccessibilityEventUnchecked(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          parama.sendAccessibilityEventUnchecked(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
      };
    }

    public final boolean a(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView, int paramInt, Bundle paramBundle)
    {
      return paramAccessibilityDelegate.performAccessibilityAction(paramView, paramInt, paramBundle);
    }
  }

  static class b
  {
    public c a(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView)
    {
      return null;
    }

    public View.AccessibilityDelegate a(final a parama)
    {
      return new View.AccessibilityDelegate()
      {
        public final boolean dispatchPopulateAccessibilityEvent(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          return parama.dispatchPopulateAccessibilityEvent(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }

        public final void onInitializeAccessibilityEvent(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          parama.onInitializeAccessibilityEvent(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }

        public final void onInitializeAccessibilityNodeInfo(View paramAnonymousView, AccessibilityNodeInfo paramAnonymousAccessibilityNodeInfo)
        {
          parama.onInitializeAccessibilityNodeInfo(paramAnonymousView, b.a(paramAnonymousAccessibilityNodeInfo));
        }

        public final void onPopulateAccessibilityEvent(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          parama.onPopulateAccessibilityEvent(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup paramAnonymousViewGroup, View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          return parama.onRequestSendAccessibilityEvent(paramAnonymousViewGroup, paramAnonymousView, paramAnonymousAccessibilityEvent);
        }

        public final void sendAccessibilityEvent(View paramAnonymousView, int paramAnonymousInt)
        {
          parama.sendAccessibilityEvent(paramAnonymousView, paramAnonymousInt);
        }

        public final void sendAccessibilityEventUnchecked(View paramAnonymousView, AccessibilityEvent paramAnonymousAccessibilityEvent)
        {
          parama.sendAccessibilityEventUnchecked(paramAnonymousView, paramAnonymousAccessibilityEvent);
        }
      };
    }

    public boolean a(View.AccessibilityDelegate paramAccessibilityDelegate, View paramView, int paramInt, Bundle paramBundle)
    {
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.a
 * JD-Core Version:    0.6.2
 */