package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bdw extends com.tencent.mm.bt.a
{
  public cgv vCN;
  public String vJS;
  public LinkedList<cgv> vTB;
  public String wHC;

  public bdw()
  {
    AppMethodBeat.i(48901);
    this.vTB = new LinkedList();
    AppMethodBeat.o(48901);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48902);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vCN != null)
      {
        paramArrayOfObject.iy(1, this.vCN.computeSize());
        this.vCN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.vTB);
      if (this.vJS != null)
        paramArrayOfObject.e(3, this.vJS);
      if (this.wHC != null)
        paramArrayOfObject.e(4, this.wHC);
      AppMethodBeat.o(48902);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vCN == null)
        break label596;
    label596: for (paramInt = e.a.a.a.ix(1, this.vCN.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.vTB);
      paramInt = i;
      if (this.vJS != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vJS);
      i = paramInt;
      if (this.wHC != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wHC);
      AppMethodBeat.o(48902);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vTB.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48902);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bdw localbdw = (bdw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48902);
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
            localbdw.vCN = paramArrayOfObject;
          }
          AppMethodBeat.o(48902);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbdw.vTB.add(paramArrayOfObject);
          }
          AppMethodBeat.o(48902);
          paramInt = i;
          break;
        case 3:
          localbdw.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48902);
          paramInt = i;
          break;
        case 4:
          localbdw.wHC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48902);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48902);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdw
 * JD-Core Version:    0.6.2
 */