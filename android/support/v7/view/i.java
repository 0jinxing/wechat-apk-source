package android.support.v7.view;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class i
  implements Window.Callback
{
  final Window.Callback ZL;

  public i(Window.Callback paramCallback)
  {
    if (paramCallback == null)
      throw new IllegalArgumentException("Window callback may not be null");
    this.ZL = paramCallback;
  }

  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return this.ZL.dispatchGenericMotionEvent(paramMotionEvent);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return this.ZL.dispatchKeyEvent(paramKeyEvent);
  }

  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    return this.ZL.dispatchKeyShortcutEvent(paramKeyEvent);
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return this.ZL.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.ZL.dispatchTouchEvent(paramMotionEvent);
  }

  public boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    return this.ZL.dispatchTrackballEvent(paramMotionEvent);
  }

  public void onActionModeFinished(ActionMode paramActionMode)
  {
    this.ZL.onActionModeFinished(paramActionMode);
  }

  public void onActionModeStarted(ActionMode paramActionMode)
  {
    this.ZL.onActionModeStarted(paramActionMode);
  }

  public void onAttachedToWindow()
  {
    this.ZL.onAttachedToWindow();
  }

  public void onContentChanged()
  {
    this.ZL.onContentChanged();
  }

  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    return this.ZL.onCreatePanelMenu(paramInt, paramMenu);
  }

  public View onCreatePanelView(int paramInt)
  {
    return this.ZL.onCreatePanelView(paramInt);
  }

  public void onDetachedFromWindow()
  {
    this.ZL.onDetachedFromWindow();
  }

  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return this.ZL.onMenuItemSelected(paramInt, paramMenuItem);
  }

  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return this.ZL.onMenuOpened(paramInt, paramMenu);
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    this.ZL.onPanelClosed(paramInt, paramMenu);
  }

  public void onPointerCaptureChanged(boolean paramBoolean)
  {
    this.ZL.onPointerCaptureChanged(paramBoolean);
  }

  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    return this.ZL.onPreparePanel(paramInt, paramView, paramMenu);
  }

  public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
  {
    this.ZL.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
  }

  public boolean onSearchRequested()
  {
    return this.ZL.onSearchRequested();
  }

  public boolean onSearchRequested(SearchEvent paramSearchEvent)
  {
    return this.ZL.onSearchRequested(paramSearchEvent);
  }

  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    this.ZL.onWindowAttributesChanged(paramLayoutParams);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    this.ZL.onWindowFocusChanged(paramBoolean);
  }

  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return this.ZL.onWindowStartingActionMode(paramCallback);
  }

  public ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    return this.ZL.onWindowStartingActionMode(paramCallback, paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.i
 * JD-Core Version:    0.6.2
 */