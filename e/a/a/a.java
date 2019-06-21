package e.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class a
{
  public static int Vg(int paramInt)
  {
    AppMethodBeat.i(51860);
    paramInt = e.a.a.b.b.a.fv(paramInt);
    AppMethodBeat.o(51860);
    return paramInt + 1;
  }

  public static int c(int paramInt1, int paramInt2, LinkedList<?> paramLinkedList)
  {
    AppMethodBeat.i(51862);
    int i;
    if (paramLinkedList != null)
      switch (paramInt2)
      {
      default:
        paramLinkedList = new IllegalArgumentException("The data type was not found, the id used was ".concat(String.valueOf(paramInt2)));
        AppMethodBeat.o(51862);
        throw paramLinkedList;
      case 6:
        paramInt2 = 0;
        i = 0;
        if (i < paramLinkedList.size())
          break;
      case 4:
      case 5:
      case 2:
      case 3:
      case 1:
      case 7:
      case 8:
      }
    while (true)
    {
      AppMethodBeat.o(51862);
      return paramInt2;
      int j = e.a.a.b.b.a.b(paramInt1, (b)paramLinkedList.get(i));
      i++;
      paramInt2 = j + paramInt2;
      break;
      i = 0;
      j = 0;
      while (true)
      {
        paramInt2 = i;
        if (j >= paramLinkedList.size())
          break;
        ((Double)paramLinkedList.get(j)).doubleValue();
        paramInt2 = e.a.a.b.b.a.fv(paramInt1);
        j++;
        i = paramInt2 + 8 + i;
      }
      i = 0;
      j = 0;
      while (true)
      {
        paramInt2 = i;
        if (j >= paramLinkedList.size())
          break;
        ((Float)paramLinkedList.get(j)).floatValue();
        paramInt2 = e.a.a.b.b.a.fv(paramInt1);
        j++;
        i = paramInt2 + 4 + i;
      }
      i = 0;
      j = 0;
      while (true)
      {
        paramInt2 = i;
        if (j >= paramLinkedList.size())
          break;
        paramInt2 = e.a.a.b.b.a.bs(paramInt1, ((Integer)paramLinkedList.get(j)).intValue());
        j++;
        i = paramInt2 + i;
      }
      i = 0;
      j = 0;
      while (true)
      {
        paramInt2 = i;
        if (j >= paramLinkedList.size())
          break;
        paramInt2 = e.a.a.b.b.a.o(paramInt1, ((Long)paramLinkedList.get(j)).longValue());
        j++;
        i = paramInt2 + i;
      }
      i = 0;
      j = 0;
      while (true)
      {
        paramInt2 = i;
        if (j >= paramLinkedList.size())
          break;
        paramInt2 = e.a.a.b.b.a.f(paramInt1, (String)paramLinkedList.get(j));
        j++;
        i = paramInt2 + i;
      }
      i = 0;
      j = 0;
      while (true)
      {
        paramInt2 = i;
        if (j >= paramLinkedList.size())
          break;
        ((Boolean)paramLinkedList.get(j)).booleanValue();
        paramInt2 = e.a.a.b.b.a.fv(paramInt1);
        j++;
        i = paramInt2 + 1 + i;
      }
      i = 0;
      j = 0;
      while (true)
      {
        paramInt2 = i;
        if (j >= paramLinkedList.size())
          break;
        paramInt2 = ix(paramInt1, ((com.tencent.mm.bt.a)paramLinkedList.get(j)).computeSize());
        j++;
        i = paramInt2 + i;
      }
      paramInt2 = 0;
    }
  }

  public static int d(int paramInt1, int paramInt2, LinkedList<?> paramLinkedList)
  {
    int i = 0;
    AppMethodBeat.i(51863);
    int j = i;
    if (paramLinkedList != null)
      switch (paramInt2)
      {
      default:
        paramLinkedList = new IllegalArgumentException("The data type was not found, the id used was ".concat(String.valueOf(paramInt2)));
        AppMethodBeat.o(51863);
        throw paramLinkedList;
      case 2:
        j = i;
        if (paramLinkedList.size() > 0)
        {
          j = 0;
          paramInt2 = 0;
          if (paramInt2 < paramLinkedList.size())
            break label106;
          j = e.a.a.b.b.a.fx(j) + j + e.a.a.b.b.a.fv(paramInt1);
        }
        break;
      case 3:
      }
    label106: 
    do
    {
      AppMethodBeat.o(51863);
      return j;
      i = e.a.a.b.b.a.fx(((Integer)paramLinkedList.get(paramInt2)).intValue());
      paramInt2++;
      j = i + j;
      break;
      j = i;
    }
    while (paramLinkedList.size() <= 0);
    j = 0;
    paramInt2 = 0;
    while (true)
    {
      if (paramInt2 >= paramLinkedList.size())
      {
        j = e.a.a.b.b.a.fx(j) + j + e.a.a.b.b.a.fv(paramInt1);
        break;
      }
      i = e.a.a.b.b.a.aw(((Long)paramLinkedList.get(paramInt2)).longValue());
      paramInt2++;
      j = i + j;
    }
  }

  public static int d(int paramInt, LinkedList<?> paramLinkedList)
  {
    int i = 0;
    AppMethodBeat.i(51864);
    int j = i;
    if (paramLinkedList != null)
      switch (paramInt)
      {
      default:
        paramLinkedList = new IllegalArgumentException("The data type was not found, the id used was ".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(51864);
        throw paramLinkedList;
      case 2:
        j = i;
        if (paramLinkedList.size() > 0)
        {
          paramInt = 0;
          j = 0;
          if (j < paramLinkedList.size())
            break label90;
          j = paramInt;
        }
        break;
      case 3:
      }
    label90: 
    do
    {
      AppMethodBeat.o(51864);
      return j;
      i = e.a.a.b.b.a.fx(((Integer)paramLinkedList.get(j)).intValue());
      j++;
      paramInt = i + paramInt;
      break;
      j = i;
    }
    while (paramLinkedList.size() <= 0);
    paramInt = 0;
    j = 0;
    while (true)
    {
      if (j >= paramLinkedList.size())
      {
        j = paramInt;
        break;
      }
      i = e.a.a.b.b.a.aw(((Long)paramLinkedList.get(j)).longValue());
      j++;
      paramInt = i + paramInt;
    }
  }

  public static int f(int paramInt, String paramString)
  {
    AppMethodBeat.i(138404);
    paramInt = e.a.a.b.b.a.f(paramInt, paramString);
    AppMethodBeat.o(138404);
    return paramInt;
  }

  public static int iw(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138403);
    paramInt1 = e.a.a.b.b.a.bs(paramInt1, paramInt2);
    AppMethodBeat.o(138403);
    return paramInt1;
  }

  public static int ix(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51861);
    int i = e.a.a.b.b.a.fv(paramInt1);
    paramInt1 = e.a.a.b.b.a.fx(paramInt2);
    AppMethodBeat.o(51861);
    return i + paramInt1 + paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     e.a.a.a
 * JD-Core Version:    0.6.2
 */