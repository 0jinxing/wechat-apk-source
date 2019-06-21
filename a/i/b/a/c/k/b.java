package a.i.b.a.c.k;

import a.f.b.j;
import a.k.m;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class b
  implements i
{
  public static final i BIH;
  private static final String PACKAGE_NAME;
  private final b.c BII;
  private final String BIJ;
  protected final Lock aCZ;

  static
  {
    AppMethodBeat.i(122473);
    boolean bool;
    String str;
    int i;
    if (!b.class.desiredAssertionStatus())
    {
      bool = true;
      $assertionsDisabled = bool;
      str = b.class.getCanonicalName();
      j.p(str, "receiver$0");
      j.p(".", "delimiter");
      j.p("", "missingDelimiterValue");
      i = m.d((CharSequence)str, ".");
      if (i != -1)
        break label96;
      str = "";
    }
    while (true)
    {
      PACKAGE_NAME = str;
      BIH = new b.1("NO_LOCKS", b.c.BIO, e.BIZ);
      AppMethodBeat.o(122473);
      return;
      bool = false;
      break;
      label96: str = str.substring(0, i);
      j.o(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
    }
  }

  public b()
  {
    this("<unknown creating class>", b.c.BIO, new ReentrantLock());
    AppMethodBeat.i(122460);
    AppMethodBeat.o(122460);
  }

  private b(String paramString, b.c paramc, Lock paramLock)
  {
    this.aCZ = paramLock;
    this.BII = paramc;
    this.BIJ = paramString;
  }

  private static <K> ConcurrentMap<K, Object> ekc()
  {
    AppMethodBeat.i(122468);
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap(3, 1.0F, 2);
    AppMethodBeat.o(122468);
    return localConcurrentHashMap;
  }

  private static <T extends Throwable> T o(T paramT)
  {
    AppMethodBeat.i(122470);
    Object localObject = paramT.getStackTrace();
    int i = localObject.length;
    int j = 0;
    if (j < i)
      if (localObject[j].getClassName().startsWith(PACKAGE_NAME));
    while (true)
    {
      if ((!$assertionsDisabled) && (j < 0))
      {
        paramT = new AssertionError("This method should only be called on exceptions created in LockBasedStorageManager");
        AppMethodBeat.o(122470);
        throw paramT;
        j++;
        break;
      }
      localObject = Arrays.asList((Object[])localObject).subList(j, i);
      paramT.setStackTrace((StackTraceElement[])((List)localObject).toArray(new StackTraceElement[((List)localObject).size()]));
      AppMethodBeat.o(122470);
      return paramT;
      j = -1;
    }
  }

  public final <T> f<T> a(a.f.a.a<? extends T> parama, a.f.a.b<? super Boolean, ? extends T> paramb, a.f.a.b<? super T, y> paramb1)
  {
    AppMethodBeat.i(122466);
    parama = new b.3(this, this, parama, paramb, paramb1);
    AppMethodBeat.o(122466);
    return parama;
  }

  public final <T> f<T> a(a.f.a.a<? extends T> parama, T paramT)
  {
    AppMethodBeat.i(122465);
    parama = new b.2(this, this, parama, paramT);
    AppMethodBeat.o(122465);
    return parama;
  }

  protected <T> b.j<T> ekd()
  {
    AppMethodBeat.i(122469);
    IllegalStateException localIllegalStateException = (IllegalStateException)o(new IllegalStateException("Recursive call in a lazy value under ".concat(String.valueOf(this))));
    AppMethodBeat.o(122469);
    throw localIllegalStateException;
  }

  public final <K, V> a<K, V> eke()
  {
    AppMethodBeat.i(122471);
    b.a locala = new b.a(this, ekc(), (byte)0);
    AppMethodBeat.o(122471);
    return locala;
  }

  public final <K, V> c<K, V> f(a.f.a.b<? super K, ? extends V> paramb)
  {
    AppMethodBeat.i(122462);
    paramb = new b.h(this, ekc(), paramb);
    AppMethodBeat.o(122462);
    return paramb;
  }

  public final <K, V> d<K, V> g(a.f.a.b<? super K, ? extends V> paramb)
  {
    AppMethodBeat.i(122463);
    paramb = new b.g(this, ekc(), paramb);
    AppMethodBeat.o(122463);
    return paramb;
  }

  public final <T> f<T> i(a.f.a.a<? extends T> parama)
  {
    AppMethodBeat.i(122464);
    parama = new b.f(this, parama);
    AppMethodBeat.o(122464);
    return parama;
  }

  public final <T> g<T> j(a.f.a.a<? extends T> parama)
  {
    AppMethodBeat.i(122467);
    parama = new b.e(this, parama);
    AppMethodBeat.o(122467);
    return parama;
  }

  public String toString()
  {
    AppMethodBeat.i(122461);
    String str = getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.BIJ + ")";
    AppMethodBeat.o(122461);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.k.b
 * JD-Core Version:    0.6.2
 */