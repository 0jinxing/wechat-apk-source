package a.i.b.a.c.k;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

final class e
  implements Lock
{
  public static final Lock BIZ;

  static
  {
    AppMethodBeat.i(122478);
    BIZ = new e();
    AppMethodBeat.o(122478);
  }

  public final void lock()
  {
  }

  public final void lockInterruptibly()
  {
    AppMethodBeat.i(122474);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Should not be called");
    AppMethodBeat.o(122474);
    throw localUnsupportedOperationException;
  }

  public final Condition newCondition()
  {
    AppMethodBeat.i(122477);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Should not be called");
    AppMethodBeat.o(122477);
    throw localUnsupportedOperationException;
  }

  public final boolean tryLock()
  {
    AppMethodBeat.i(122475);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Should not be called");
    AppMethodBeat.o(122475);
    throw localUnsupportedOperationException;
  }

  public final boolean tryLock(long paramLong, TimeUnit paramTimeUnit)
  {
    AppMethodBeat.i(122476);
    paramTimeUnit = new UnsupportedOperationException("Should not be called");
    AppMethodBeat.o(122476);
    throw paramTimeUnit;
  }

  public final void unlock()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.k.e
 * JD-Core Version:    0.6.2
 */