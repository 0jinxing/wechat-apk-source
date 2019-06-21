package kotlinx.coroutines.a;

import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"})
public final class j$a
{
  public static long K(long paramLong, int paramInt)
  {
    return 0xC0000000 & paramLong | paramInt << 0;
  }

  public static long L(long paramLong, int paramInt)
  {
    return 0x3FFFFFFF & paramLong | paramInt << 30;
  }

  public static int ob(long paramLong)
  {
    if ((0x0 & paramLong) != 0L);
    for (int i = 2; ; i = 1)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.j.a
 * JD-Core Version:    0.6.2
 */