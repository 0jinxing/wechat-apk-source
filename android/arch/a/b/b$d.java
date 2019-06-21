package android.arch.a.b;

import java.util.Iterator;
import java.util.Map.Entry;

public final class b$d
  implements b.f<K, V>, Iterator<Map.Entry<K, V>>
{
  private b.c<K, V> bY;
  private boolean bZ = true;

  private b$d(b paramb)
  {
  }

  public final void c(b.c<K, V> paramc)
  {
    if (paramc == this.bY)
    {
      this.bY = this.bY.bX;
      if (this.bY != null)
        break label34;
    }
    label34: for (boolean bool = true; ; bool = false)
    {
      this.bZ = bool;
      return;
    }
  }

  public final boolean hasNext()
  {
    boolean bool = true;
    if (this.bZ)
      if (b.a(this.ca) == null);
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if ((this.bY == null) || (this.bY.bW == null))
        bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.arch.a.b.b.d
 * JD-Core Version:    0.6.2
 */