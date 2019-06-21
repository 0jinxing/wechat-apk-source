package a.i.b.a.c.k;

import a.f.a.a;
import a.i.b.a.c.n.c;
import a.i.b.a.c.n.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.locks.Lock;

class b$e<T>
  implements g<T>
{
  private final b BIQ;
  private final a<? extends T> BIR;
  private volatile Object value = b.i.BIU;

  public b$e(b paramb, a<? extends T> parama)
  {
    this.BIQ = paramb;
    this.BIR = parama;
  }

  protected void dS(T paramT)
  {
  }

  public final boolean ekf()
  {
    if ((this.value != b.i.BIU) && (this.value != b.i.BIV));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public T invoke()
  {
    AppMethodBeat.i(122444);
    Object localObject = this.value;
    if (!(localObject instanceof b.i))
    {
      localObject = j.dY(localObject);
      AppMethodBeat.o(122444);
    }
    while (true)
    {
      return localObject;
      this.BIQ.aCZ.lock();
      try
      {
        localObject = this.value;
        if (!(localObject instanceof b.i))
        {
          localObject = j.dY(localObject);
          this.BIQ.aCZ.unlock();
          AppMethodBeat.o(122444);
        }
        else if (localObject == b.i.BIV)
        {
          this.value = b.i.BIW;
          b.j localj = rZ(true);
          if (!localj.BIY)
          {
            localObject = localj.getValue();
            this.BIQ.aCZ.unlock();
            AppMethodBeat.o(122444);
          }
        }
        else if (localObject == b.i.BIW)
        {
          localObject = rZ(false);
          if (!((b.j)localObject).BIY)
          {
            localObject = ((b.j)localObject).getValue();
            this.BIQ.aCZ.unlock();
            AppMethodBeat.o(122444);
          }
        }
        else
        {
          this.value = b.i.BIV;
          try
          {
            localObject = this.BIR.invoke();
            this.value = localObject;
            dS(localObject);
          }
          catch (Throwable localThrowable1)
          {
            if (!c.r(localThrowable1))
              break;
          }
          this.value = b.i.BIU;
          RuntimeException localRuntimeException1 = (RuntimeException)localThrowable1;
          AppMethodBeat.o(122444);
          throw localRuntimeException1;
        }
      }
      finally
      {
        this.BIQ.aCZ.unlock();
        AppMethodBeat.o(122444);
      }
    }
    if (this.value == b.i.BIV)
      this.value = j.s(localThrowable2);
    RuntimeException localRuntimeException2 = b.a(this.BIQ).q(localThrowable2);
    AppMethodBeat.o(122444);
    throw localRuntimeException2;
  }

  protected b.j<T> rZ(boolean paramBoolean)
  {
    AppMethodBeat.i(122445);
    b.j localj = this.BIQ.ekd();
    AppMethodBeat.o(122445);
    return localj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.k.b.e
 * JD-Core Version:    0.6.2
 */