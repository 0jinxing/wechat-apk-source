package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bd extends com.tencent.mm.bt.a
{
  public be vDb;
  public be vDc;
  public be vDd;
  public be vDe;
  public be vDf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73643);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vDb != null)
      {
        paramArrayOfObject.iy(1, this.vDb.computeSize());
        this.vDb.writeFields(paramArrayOfObject);
      }
      if (this.vDc != null)
      {
        paramArrayOfObject.iy(2, this.vDc.computeSize());
        this.vDc.writeFields(paramArrayOfObject);
      }
      if (this.vDd != null)
      {
        paramArrayOfObject.iy(3, this.vDd.computeSize());
        this.vDd.writeFields(paramArrayOfObject);
      }
      if (this.vDe != null)
      {
        paramArrayOfObject.iy(4, this.vDe.computeSize());
        this.vDe.writeFields(paramArrayOfObject);
      }
      if (this.vDf != null)
      {
        paramArrayOfObject.iy(5, this.vDf.computeSize());
        this.vDf.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(73643);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vDb == null)
        break label958;
    label958: for (i = e.a.a.a.ix(1, this.vDb.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vDc != null)
        paramInt = i + e.a.a.a.ix(2, this.vDc.computeSize());
      i = paramInt;
      if (this.vDd != null)
        i = paramInt + e.a.a.a.ix(3, this.vDd.computeSize());
      paramInt = i;
      if (this.vDe != null)
        paramInt = i + e.a.a.a.ix(4, this.vDe.computeSize());
      i = paramInt;
      if (this.vDf != null)
        i = paramInt + e.a.a.a.ix(5, this.vDf.computeSize());
      AppMethodBeat.o(73643);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73643);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bd localbd = (bd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73643);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new be();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbd.vDb = paramArrayOfObject;
          }
          AppMethodBeat.o(73643);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new be();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((be)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbd.vDc = ((be)localObject1);
          }
          AppMethodBeat.o(73643);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new be();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbd.vDd = paramArrayOfObject;
          }
          AppMethodBeat.o(73643);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new be();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((be)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbd.vDe = ((be)localObject1);
          }
          AppMethodBeat.o(73643);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new be();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((be)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbd.vDf = ((be)localObject1);
          }
          AppMethodBeat.o(73643);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73643);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bd
 * JD-Core Version:    0.6.2
 */