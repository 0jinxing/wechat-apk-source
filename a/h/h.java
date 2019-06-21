package a.h;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "downTo", "Lkotlin/ranges/IntProgression;", "to", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "random", "Lkotlin/random/Random;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, dWr=1)
public class h extends g
{
  public static final boolean a(a<Integer> parama, float paramFloat)
  {
    AppMethodBeat.i(55984);
    j.p(parama, "receiver$0");
    Integer localInteger = e.bx(paramFloat);
    boolean bool;
    if (localInteger != null)
    {
      bool = parama.contains((Comparable)localInteger);
      AppMethodBeat.o(55984);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(55984);
    }
  }

  public static final int aQ(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(55987);
    if (paramInt2 > paramInt3)
    {
      Throwable localThrowable = (Throwable)new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + paramInt3 + " is less than minimum " + paramInt2 + '.');
      AppMethodBeat.o(55987);
      throw localThrowable;
    }
    if (paramInt1 < paramInt2)
      AppMethodBeat.o(55987);
    while (true)
    {
      return paramInt2;
      if (paramInt1 > paramInt3)
      {
        AppMethodBeat.o(55987);
        paramInt2 = paramInt3;
      }
      else
      {
        AppMethodBeat.o(55987);
        paramInt2 = paramInt1;
      }
    }
  }

  public static final long ai(long paramLong1, long paramLong2)
  {
    if (paramLong1 < paramLong2);
    while (true)
    {
      return paramLong2;
      paramLong2 = paramLong1;
    }
  }

  public static final long aj(long paramLong1, long paramLong2)
  {
    if (paramLong1 > paramLong2);
    while (true)
    {
      return paramLong2;
      paramLong2 = paramLong1;
    }
  }

  public static final Integer bx(float paramFloat)
  {
    AppMethodBeat.i(55985);
    Integer localInteger;
    if ((paramFloat >= -2.147484E+009F) && (paramFloat <= 2.147484E+009F))
    {
      localInteger = Integer.valueOf((int)paramFloat);
      AppMethodBeat.o(55985);
    }
    while (true)
    {
      return localInteger;
      localInteger = null;
      AppMethodBeat.o(55985);
    }
  }

  public static final d il(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55986);
    Object localObject;
    if (paramInt2 <= -2147483648)
    {
      localObject = d.AVQ;
      localObject = d.dWN();
      AppMethodBeat.o(55986);
    }
    while (true)
    {
      return localObject;
      localObject = new d(paramInt1, paramInt2 - 1);
      AppMethodBeat.o(55986);
    }
  }

  public static final int im(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2);
    while (true)
    {
      return paramInt2;
      paramInt2 = paramInt1;
    }
  }

  public static final int in(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2)
      paramInt1 = paramInt2;
    while (true)
      return paramInt1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.h.h
 * JD-Core Version:    0.6.2
 */