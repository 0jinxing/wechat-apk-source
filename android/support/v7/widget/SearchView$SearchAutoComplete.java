package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;

public class SearchView$SearchAutoComplete extends AppCompatAutoCompleteTextView
{
  private SearchView arD;
  private boolean arE;
  final Runnable arF = new SearchView.SearchAutoComplete.1(this);
  private int mThreshold = getThreshold();

  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130772219);
  }

  public SearchView$SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private int getSearchViewTextMinWidthDp()
  {
    Configuration localConfiguration = getResources().getConfiguration();
    int i = localConfiguration.screenWidthDp;
    int j = localConfiguration.screenHeightDp;
    if ((i >= 960) && (j >= 720) && (localConfiguration.orientation == 2))
      i = 256;
    while (true)
    {
      return i;
      if ((i >= 600) || ((i >= 640) && (j >= 480)))
        i = 192;
      else
        i = 160;
    }
  }

  private void setImeVisibility(boolean paramBoolean)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
    if (!paramBoolean)
    {
      this.arE = false;
      removeCallbacks(this.arF);
      localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }
    while (true)
    {
      return;
      if (localInputMethodManager.isActive(this))
      {
        this.arE = false;
        removeCallbacks(this.arF);
        localInputMethodManager.showSoftInput(this, 0);
      }
      else
      {
        this.arE = true;
      }
    }
  }

  public boolean enoughToFilter()
  {
    if ((this.mThreshold <= 0) || (super.enoughToFilter()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    paramEditorInfo = super.onCreateInputConnection(paramEditorInfo);
    if (this.arE)
    {
      removeCallbacks(this.arF);
      post(this.arF);
    }
    return paramEditorInfo;
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), localDisplayMetrics));
  }

  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    this.arD.kL();
  }

  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    KeyEvent.DispatcherState localDispatcherState;
    boolean bool2;
    if (paramInt == 4)
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        localDispatcherState = getKeyDispatcherState();
        bool2 = bool1;
        if (localDispatcherState != null)
        {
          localDispatcherState.startTracking(paramKeyEvent, this);
          bool2 = bool1;
        }
      }
    while (true)
    {
      return bool2;
      if (paramKeyEvent.getAction() == 1)
      {
        localDispatcherState = getKeyDispatcherState();
        if (localDispatcherState != null)
          localDispatcherState.handleUpEvent(paramKeyEvent);
        if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
        {
          this.arD.clearFocus();
          setImeVisibility(false);
          bool2 = bool1;
        }
      }
      else
      {
        bool2 = super.onKeyPreIme(paramInt, paramKeyEvent);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if ((paramBoolean) && (this.arD.hasFocus()) && (getVisibility() == 0))
    {
      this.arE = true;
      if (SearchView.ac(getContext()))
        SearchView.arq.c(this);
    }
  }

  public void performCompletion()
  {
  }

  protected void replaceText(CharSequence paramCharSequence)
  {
  }

  void setSearchView(SearchView paramSearchView)
  {
    this.arD = paramSearchView;
  }

  public void setThreshold(int paramInt)
  {
    super.setThreshold(paramInt);
    this.mThreshold = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView.SearchAutoComplete
 * JD-Core Version:    0.6.2
 */