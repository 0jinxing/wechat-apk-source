package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class lp extends com.tencent.mm.bt.a
{
  public LinkedList<abw> vPg;
  public LinkedList<abv> vPh;
  public String vPi;
  public String vPj;
  public String vPk;

  public lp()
  {
    AppMethodBeat.i(56718);
    this.vPg = new LinkedList();
    this.vPh = new LinkedList();
    AppMethodBeat.o(56718);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56719);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.vPg);
      paramArrayOfObject.e(2, 8, this.vPh);
      if (this.vPi != null)
        paramArrayOfObject.e(3, this.vPi);
      if (this.vPj != null)
        paramArrayOfObject.e(4, this.vPj);
      if (this.vPk != null)
        paramArrayOfObject.e(5, this.vPk);
      AppMethodBeat.o(56719);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 8, this.vPg) + 0 + e.a.a.a.c(2, 8, this.vPh);
        i = paramInt;
        if (this.vPi != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.vPi);
        paramInt = i;
        if (this.vPj != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.vPj);
        i = paramInt;
        if (this.vPk != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.vPk);
        AppMethodBeat.o(56719);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vPg.clear();
        this.vPh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56719);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        lp locallp = (lp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56719);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new abw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallp.vPg.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56719);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((abv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallp.vPh.add(localObject1);
          }
          AppMethodBeat.o(56719);
          paramInt = 0;
          break;
        case 3:
          locallp.vPi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56719);
          paramInt = 0;
          break;
        case 4:
          locallp.vPj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56719);
          paramInt = 0;
          break;
        case 5:
          locallp.vPk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56719);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56719);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.lp
 * JD-Core Version:    0.6.2
 */