package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bdq extends com.tencent.mm.bt.a
{
  public cgv vCN;
  public bds wHr;
  public bdr wHs;
  public bdr wHt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48898);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vCN != null)
      {
        paramArrayOfObject.iy(1, this.vCN.computeSize());
        this.vCN.writeFields(paramArrayOfObject);
      }
      if (this.wHr != null)
      {
        paramArrayOfObject.iy(2, this.wHr.computeSize());
        this.wHr.writeFields(paramArrayOfObject);
      }
      if (this.wHs != null)
      {
        paramArrayOfObject.iy(3, this.wHs.computeSize());
        this.wHs.writeFields(paramArrayOfObject);
      }
      if (this.wHt != null)
      {
        paramArrayOfObject.iy(4, this.wHt.computeSize());
        this.wHt.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48898);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vCN == null)
        break label797;
    label797: for (i = e.a.a.a.ix(1, this.vCN.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wHr != null)
        paramInt = i + e.a.a.a.ix(2, this.wHr.computeSize());
      i = paramInt;
      if (this.wHs != null)
        i = paramInt + e.a.a.a.ix(3, this.wHs.computeSize());
      paramInt = i;
      if (this.wHt != null)
        paramInt = i + e.a.a.a.ix(4, this.wHt.computeSize());
      AppMethodBeat.o(48898);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48898);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bdq localbdq = (bdq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48898);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbdq.vCN = paramArrayOfObject;
          }
          AppMethodBeat.o(48898);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bds();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bds)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbdq.wHr = ((bds)localObject1);
          }
          AppMethodBeat.o(48898);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bdr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbdq.wHs = paramArrayOfObject;
          }
          AppMethodBeat.o(48898);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bdr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbdq.wHt = paramArrayOfObject;
          }
          AppMethodBeat.o(48898);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48898);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdq
 * JD-Core Version:    0.6.2
 */