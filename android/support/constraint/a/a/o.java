package android.support.constraint.a.a;

import java.util.HashSet;
import java.util.Iterator;

public class o
{
  HashSet<o> kt = new HashSet(2);
  public int state = 0;

  public final void a(o paramo)
  {
    this.kt.add(paramo);
  }

  public void aE()
  {
  }

  public final void bf()
  {
    this.state = 1;
    Iterator localIterator = this.kt.iterator();
    while (localIterator.hasNext())
      ((o)localIterator.next()).aE();
  }

  public final boolean bg()
  {
    boolean bool = true;
    if (this.state == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void invalidate()
  {
    this.state = 0;
    Iterator localIterator = this.kt.iterator();
    while (localIterator.hasNext())
      ((o)localIterator.next()).invalidate();
  }

  public void reset()
  {
    this.state = 0;
    this.kt.clear();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.o
 * JD-Core Version:    0.6.2
 */