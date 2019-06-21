package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class qe extends com.tencent.mm.bt.a
{
  public int ehB;
  public LinkedList<qf> vXi;
  public int vXj;
  public bts vXk;

  public qe()
  {
    AppMethodBeat.i(60025);
    this.vXi = new LinkedList();
    AppMethodBeat.o(60025);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(60026);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ehB);
      paramArrayOfObject.e(2, 8, this.vXi);
      paramArrayOfObject.iz(3, this.vXj);
      if (this.vXk != null)
      {
        paramArrayOfObject.iy(4, this.vXk.computeSize());
        this.vXk.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(60026);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ehB) + 0 + e.a.a.a.c(2, 8, this.vXi) + e.a.a.b.b.a.bs(3, this.vXj);
        paramInt = i;
        if (this.vXk != null)
          paramInt = i + e.a.a.a.ix(4, this.vXk.computeSize());
        AppMethodBeat.o(60026);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vXi.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(60026);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qe localqe = (qe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(60026);
          break;
        case 1:
          localqe.ehB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60026);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new qf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((qf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localqe.vXi.add(localObject1);
          }
          AppMethodBeat.o(60026);
          paramInt = 0;
          break;
        case 3:
          localqe.vXj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(60026);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localqe.vXk = ((bts)localObject1);
          }
          AppMethodBeat.o(60026);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(60026);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qe
 * JD-Core Version:    0.6.2
 */