package android.support.v7.widget;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

final class SearchView$7
  implements View.OnKeyListener
{
  SearchView$7(SearchView paramSearchView)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = false;
    boolean bool2;
    if (this.ary.aro == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if ((this.ary.aqC.isPopupShowing()) && (this.ary.aqC.getListSelection() != -1))
      {
        bool2 = this.ary.b(paramInt, paramKeyEvent);
      }
      else
      {
        bool2 = bool1;
        if (!SearchView.SearchAutoComplete.a(this.ary.aqC))
        {
          bool2 = bool1;
          if (paramKeyEvent.hasNoModifiers())
          {
            bool2 = bool1;
            if (paramKeyEvent.getAction() == 1)
            {
              bool2 = bool1;
              if (paramInt == 66)
              {
                paramView.cancelLongPress();
                this.ary.U(this.ary.aqC.getText().toString());
                bool2 = true;
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView.7
 * JD-Core Version:    0.6.2
 */