package a.i.b.a.c.k;

import a.i.b.a.c.n.c;
import a.i.b.a.c.n.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;

class b$g<K, V>
  implements d<K, V>
{
  final b BIQ;
  private final ConcurrentMap<K, Object> BIS;
  private final a.f.a.b<? super K, ? extends V> BIT;

  public b$g(b paramb, ConcurrentMap<K, Object> paramConcurrentMap, a.f.a.b<? super K, ? extends V> paramb1)
  {
    this.BIQ = paramb;
    this.BIS = paramConcurrentMap;
    this.BIT = paramb1;
  }

  private AssertionError J(K paramK, Object paramObject)
  {
    AppMethodBeat.i(122449);
    paramK = (AssertionError)b.p(new AssertionError("Race condition detected on input " + paramK + ". Old value is " + paramObject + " under " + this.BIQ));
    AppMethodBeat.o(122449);
    return paramK;
  }

  public V am(K paramK)
  {
    AppMethodBeat.i(122448);
    Object localObject1 = this.BIS.get(paramK);
    if ((localObject1 != null) && (localObject1 != b.i.BIV))
    {
      paramK = j.dX(localObject1);
      AppMethodBeat.o(122448);
    }
    while (true)
    {
      return paramK;
      this.BIQ.aCZ.lock();
      AssertionError localAssertionError;
      try
      {
        localObject1 = this.BIS.get(paramK);
        if (localObject1 == b.i.BIV)
        {
          localAssertionError = new java/lang/AssertionError;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("Recursion detected on input: ");
          localAssertionError.<init>(paramK + " under " + this.BIQ);
          paramK = (AssertionError)b.p(localAssertionError);
          AppMethodBeat.o(122448);
          throw paramK;
        }
      }
      finally
      {
        this.BIQ.aCZ.unlock();
        AppMethodBeat.o(122448);
      }
      if (localObject1 != null)
      {
        paramK = j.dX(localObject1);
        this.BIQ.aCZ.unlock();
        AppMethodBeat.o(122448);
      }
      else
      {
        localAssertionError = null;
        localObject1 = localAssertionError;
        try
        {
          this.BIS.put(paramK, b.i.BIV);
          localObject1 = localAssertionError;
          localObject2 = this.BIT.am(paramK);
          localObject1 = localAssertionError;
          Object localObject3 = this.BIS.put(paramK, j.dW(localObject2));
          localObject1 = localAssertionError;
          if (localObject3 != b.i.BIV)
          {
            localObject1 = localAssertionError;
            localAssertionError = J(paramK, localObject3);
            localObject1 = localAssertionError;
            AppMethodBeat.o(122448);
            localObject1 = localAssertionError;
            throw localAssertionError;
          }
        }
        catch (Throwable localThrowable)
        {
          Object localObject2;
          if (c.r(localThrowable))
          {
            this.BIS.remove(paramK);
            paramK = (RuntimeException)localThrowable;
            AppMethodBeat.o(122448);
            throw paramK;
            this.BIQ.aCZ.unlock();
            AppMethodBeat.o(122448);
            paramK = localObject2;
          }
          else
          {
            if (localThrowable == localObject1)
            {
              paramK = b.a(this.BIQ).q(localThrowable);
              AppMethodBeat.o(122448);
              throw paramK;
            }
            localObject1 = this.BIS.put(paramK, j.s(localThrowable));
            if (localObject1 != b.i.BIV)
            {
              paramK = J(paramK, localObject1);
              AppMethodBeat.o(122448);
              throw paramK;
            }
            paramK = b.a(this.BIQ).q(localThrowable);
            AppMethodBeat.o(122448);
          }
        }
      }
    }
    throw paramK;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.k.b.g
 * JD-Core Version:    0.6.2
 */