package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ac extends com.tencent.mm.bt.a
{
  public int jBT;
  public int jBh;
  public q jCL;
  public p jCM;
  public r jCN;
  public s jCO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18078);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jBh);
      paramArrayOfObject.iz(2, this.jBT);
      if (this.jCL != null)
      {
        paramArrayOfObject.iy(3, this.jCL.computeSize());
        this.jCL.writeFields(paramArrayOfObject);
      }
      if (this.jCM != null)
      {
        paramArrayOfObject.iy(4, this.jCM.computeSize());
        this.jCM.writeFields(paramArrayOfObject);
      }
      if (this.jCN != null)
      {
        paramArrayOfObject.iy(5, this.jCN.computeSize());
        this.jCN.writeFields(paramArrayOfObject);
      }
      if (this.jCO != null)
      {
        paramArrayOfObject.iy(6, this.jCO.computeSize());
        this.jCO.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(18078);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.jBh) + 0 + e.a.a.b.b.a.bs(2, this.jBT);
        paramInt = i;
        if (this.jCL != null)
          paramInt = i + e.a.a.a.ix(3, this.jCL.computeSize());
        i = paramInt;
        if (this.jCM != null)
          i = paramInt + e.a.a.a.ix(4, this.jCM.computeSize());
        paramInt = i;
        if (this.jCN != null)
          paramInt = i + e.a.a.a.ix(5, this.jCN.computeSize());
        i = paramInt;
        if (this.jCO != null)
          i = paramInt + e.a.a.a.ix(6, this.jCO.computeSize());
        AppMethodBeat.o(18078);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(18078);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ac localac = (ac)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18078);
          break;
        case 1:
          localac.jBh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18078);
          paramInt = 0;
          break;
        case 2:
          localac.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(18078);
          paramInt = 0;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new q();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((q)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localac.jCL = ((q)localObject1);
          }
          AppMethodBeat.o(18078);
          paramInt = 0;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new p();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localac.jCM = paramArrayOfObject;
          }
          AppMethodBeat.o(18078);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new r();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((r)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localac.jCN = ((r)localObject1);
          }
          AppMethodBeat.o(18078);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new s();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localac.jCO = paramArrayOfObject;
          }
          AppMethodBeat.o(18078);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(18078);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.ac
 * JD-Core Version:    0.6.2
 */