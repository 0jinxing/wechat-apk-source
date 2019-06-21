package android.support.v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

final class SearchView$2
  implements TextWatcher
{
  SearchView$2(SearchView paramSearchView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.ary.m(paramCharSequence);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView.2
 * JD-Core Version:    0.6.2
 */