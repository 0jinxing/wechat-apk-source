package android.support.v7.widget;

import android.support.v4.f.k.a;
import android.support.v4.f.k.b;

final class bj$a
{
  static k.a<a> avc = new k.b(20);
  RecyclerView.f.c ava;
  RecyclerView.f.c avb;
  int flags;

  static void a(a parama)
  {
    parama.flags = 0;
    parama.ava = null;
    parama.avb = null;
    avc.release(parama);
  }

  static a ly()
  {
    a locala1 = (a)avc.aA();
    a locala2 = locala1;
    if (locala1 == null)
      locala2 = new a();
    return locala2;
  }

  static void lz()
  {
    while (avc.aA() != null);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.bj.a
 * JD-Core Version:    0.6.2
 */