package android.support.v7.widget;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

final class GridLayout$c<K, V> extends ArrayList<Pair<K, V>>
{
  private final Class<K> ajO;
  private final Class<V> ajP;

  private GridLayout$c(Class<K> paramClass, Class<V> paramClass1)
  {
    this.ajO = paramClass;
    this.ajP = paramClass1;
  }

  public static <K, V> c<K, V> a(Class<K> paramClass, Class<V> paramClass1)
  {
    return new c(paramClass, paramClass1);
  }

  public final void f(K paramK, V paramV)
  {
    add(Pair.create(paramK, paramV));
  }

  public final GridLayout.h<K, V> ip()
  {
    int i = size();
    Object[] arrayOfObject1 = (Object[])Array.newInstance(this.ajO, i);
    Object[] arrayOfObject2 = (Object[])Array.newInstance(this.ajP, i);
    for (int j = 0; j < i; j++)
    {
      arrayOfObject1[j] = ((Pair)get(j)).first;
      arrayOfObject2[j] = ((Pair)get(j)).second;
    }
    return new GridLayout.h(arrayOfObject1, arrayOfObject2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayout.c
 * JD-Core Version:    0.6.2
 */