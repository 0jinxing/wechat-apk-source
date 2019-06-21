package a.i.b.a.c.e.a;

import a.i.b.a.c.e.a.w;
import a.i.b.a.c.e.a.w.b;
import a.i.b.a.c.e.a.w.b.b;
import a.i.b.a.c.e.a.y;
import a.t;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements c
{
  private final a.y Bxg;
  private final a.w Bxh;

  public d(a.y paramy, a.w paramw)
  {
    AppMethodBeat.i(121080);
    this.Bxg = paramy;
    this.Bxh = paramw;
    AppMethodBeat.o(121080);
  }

  private final t<List<String>, List<String>, Boolean> Uj(int paramInt)
  {
    AppMethodBeat.i(121079);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    boolean bool = false;
    if (paramInt != -1)
    {
      localObject1 = this.Bxh.Ty(paramInt);
      Object localObject2 = this.Bxg;
      a.f.b.j.o(localObject1, "proto");
      localObject2 = ((a.y)localObject2).getString(((a.w.b)localObject1).BuR);
      a.w.b.b localb = ((a.w.b)localObject1).BuS;
      if (localb == null)
        a.f.b.j.dWJ();
      switch (e.eQZ[localb.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        paramInt = ((a.w.b)localObject1).BuQ;
        break;
        localLinkedList2.addFirst(localObject2);
        continue;
        localLinkedList1.addFirst(localObject2);
        continue;
        localLinkedList2.addFirst(localObject2);
        bool = true;
      }
    }
    Object localObject1 = new t(localLinkedList1, localLinkedList2, Boolean.valueOf(bool));
    AppMethodBeat.o(121079);
    return localObject1;
  }

  public final String Uh(int paramInt)
  {
    AppMethodBeat.i(121077);
    Object localObject = Uj(paramInt);
    List localList = (List)((t)localObject).first;
    localObject = a.a.j.a((Iterable)((t)localObject).second, (CharSequence)".", null, null, 0, null, null, 62);
    if (localList.isEmpty())
      AppMethodBeat.o(121077);
    while (true)
    {
      return localObject;
      localObject = a.a.j.a((Iterable)localList, (CharSequence)"/", null, null, 0, null, null, 62) + '/' + (String)localObject;
      AppMethodBeat.o(121077);
    }
  }

  public final boolean Ui(int paramInt)
  {
    AppMethodBeat.i(121078);
    boolean bool = ((Boolean)Uj(paramInt).AUw).booleanValue();
    AppMethodBeat.o(121078);
    return bool;
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(121076);
    String str = this.Bxg.getString(paramInt);
    a.f.b.j.o(str, "strings.getString(index)");
    AppMethodBeat.o(121076);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.d
 * JD-Core Version:    0.6.2
 */