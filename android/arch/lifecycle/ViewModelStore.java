package android.arch.lifecycle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ViewModelStore
{
  final HashMap<String, ViewModel> cS = new HashMap();

  final void a(String paramString, ViewModel paramViewModel)
  {
    ViewModel localViewModel = (ViewModel)this.cS.get(paramString);
    if (localViewModel != null)
      localViewModel.ao();
    this.cS.put(paramString, paramViewModel);
  }

  public final void clear()
  {
    Iterator localIterator = this.cS.values().iterator();
    while (localIterator.hasNext())
      ((ViewModel)localIterator.next()).ao();
    this.cS.clear();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.arch.lifecycle.ViewModelStore
 * JD-Core Version:    0.6.2
 */