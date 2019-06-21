package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class d extends com.tencent.mm.bt.a
{
  public String kLe;
  public LinkedList<String> kLf;
  public String kLg;
  public String kLh;
  public LinkedList<String> kLi;
  public m kLj;
  public e kLk;

  public d()
  {
    AppMethodBeat.i(35528);
    this.kLf = new LinkedList();
    this.kLi = new LinkedList();
    AppMethodBeat.o(35528);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35529);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kLe != null)
        paramArrayOfObject.e(1, this.kLe);
      paramArrayOfObject.e(2, 1, this.kLf);
      if (this.kLg != null)
        paramArrayOfObject.e(3, this.kLg);
      if (this.kLh != null)
        paramArrayOfObject.e(4, this.kLh);
      paramArrayOfObject.e(5, 1, this.kLi);
      if (this.kLj != null)
      {
        paramArrayOfObject.iy(6, this.kLj.computeSize());
        this.kLj.writeFields(paramArrayOfObject);
      }
      if (this.kLk != null)
      {
        paramArrayOfObject.iy(7, this.kLk.computeSize());
        this.kLk.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(35529);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kLe == null)
        break label798;
    label798: for (paramInt = e.a.a.b.b.a.f(1, this.kLe) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 1, this.kLf);
      paramInt = i;
      if (this.kLg != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kLg);
      i = paramInt;
      if (this.kLh != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.kLh);
      i += e.a.a.a.c(5, 1, this.kLi);
      paramInt = i;
      if (this.kLj != null)
        paramInt = i + e.a.a.a.ix(6, this.kLj.computeSize());
      i = paramInt;
      if (this.kLk != null)
        i = paramInt + e.a.a.a.ix(7, this.kLk.computeSize());
      AppMethodBeat.o(35529);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.kLf.clear();
        this.kLi.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35529);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35529);
          break;
        case 1:
          locald.kLe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35529);
          paramInt = i;
          break;
        case 2:
          locald.kLf.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(35529);
          paramInt = i;
          break;
        case 3:
          locald.kLg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35529);
          paramInt = i;
          break;
        case 4:
          locald.kLh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35529);
          paramInt = i;
          break;
        case 5:
          locald.kLi.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(35529);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new m();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locald.kLj = paramArrayOfObject;
          }
          AppMethodBeat.o(35529);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locald.kLk = ((e)localObject1);
          }
          AppMethodBeat.o(35529);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35529);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.d
 * JD-Core Version:    0.6.2
 */