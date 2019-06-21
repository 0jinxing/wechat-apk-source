package android.support.v7.widget;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

final class SearchView$a
{
  private Method arA;
  private Method arB;
  private Method arz;

  SearchView$a()
  {
    try
    {
      this.arz = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
      this.arz.setAccessible(true);
      try
      {
        label27: this.arA = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
        this.arA.setAccessible(true);
        try
        {
          label50: this.arB = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
          this.arB.setAccessible(true);
          label79: return;
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          break label79;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        break label50;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException3)
    {
      break label27;
    }
  }

  final void a(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.arz != null);
    try
    {
      this.arz.invoke(paramAutoCompleteTextView, new Object[0]);
      label20: return;
    }
    catch (Exception paramAutoCompleteTextView)
    {
      break label20;
    }
  }

  final void b(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.arA != null);
    try
    {
      this.arA.invoke(paramAutoCompleteTextView, new Object[0]);
      label20: return;
    }
    catch (Exception paramAutoCompleteTextView)
    {
      break label20;
    }
  }

  final void c(AutoCompleteTextView paramAutoCompleteTextView)
  {
    if (this.arB != null);
    try
    {
      this.arB.invoke(paramAutoCompleteTextView, new Object[] { Boolean.TRUE });
      label26: return;
    }
    catch (Exception paramAutoCompleteTextView)
    {
      break label26;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView.a
 * JD-Core Version:    0.6.2
 */