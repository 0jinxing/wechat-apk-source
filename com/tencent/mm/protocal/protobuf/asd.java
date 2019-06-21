package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class asd extends com.tencent.mm.bt.a
{
  public cgv vCN;
  public LinkedList<bzy> vCQ;
  public String vJS;

  public asd()
  {
    AppMethodBeat.i(48861);
    this.vCQ = new LinkedList();
    AppMethodBeat.o(48861);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48862);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vCN != null)
      {
        paramArrayOfObject.iy(1, this.vCN.computeSize());
        this.vCN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.vCQ);
      if (this.vJS != null)
        paramArrayOfObject.e(3, this.vJS);
      AppMethodBeat.o(48862);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vCN == null)
        break label535;
    label535: for (paramInt = e.a.a.a.ix(1, this.vCN.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.vCQ);
      paramInt = i;
      if (this.vJS != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vJS);
      AppMethodBeat.o(48862);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vCQ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48862);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        asd localasd = (asd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48862);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasd.vCN = ((cgv)localObject1);
          }
          AppMethodBeat.o(48862);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localasd.vCQ.add(localObject1);
          }
          AppMethodBeat.o(48862);
          paramInt = i;
          break;
        case 3:
          localasd.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48862);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48862);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.asd
 * JD-Core Version:    0.6.2
 */