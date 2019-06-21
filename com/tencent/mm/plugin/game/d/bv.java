package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bv extends com.tencent.mm.bt.a
{
  public String Title;
  public String ncA;
  public String ncB;
  public LinkedList<bw> ncE;

  public bv()
  {
    AppMethodBeat.i(111628);
    this.ncE = new LinkedList();
    AppMethodBeat.o(111628);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111629);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(111629);
        throw paramArrayOfObject;
      }
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      paramArrayOfObject.e(2, 8, this.ncE);
      if (this.ncA != null)
        paramArrayOfObject.e(3, this.ncA);
      if (this.ncB != null)
        paramArrayOfObject.e(4, this.ncB);
      AppMethodBeat.o(111629);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label552;
    label552: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.ncE);
      paramInt = i;
      if (this.ncA != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ncA);
      i = paramInt;
      if (this.ncB != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ncB);
      AppMethodBeat.o(111629);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.ncE.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(111629);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111629);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bv localbv = (bv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111629);
          break;
        case 1:
          localbv.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111629);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbv.ncE.add(paramArrayOfObject);
          }
          AppMethodBeat.o(111629);
          paramInt = i;
          break;
        case 3:
          localbv.ncA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111629);
          paramInt = i;
          break;
        case 4:
          localbv.ncB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111629);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111629);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.bv
 * JD-Core Version:    0.6.2
 */