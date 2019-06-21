package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class avd extends com.tencent.mm.bt.a
{
  public LinkedList<cgv> fjr;
  public cgv vCN;
  public String vJS;

  public avd()
  {
    AppMethodBeat.i(48877);
    this.fjr = new LinkedList();
    AppMethodBeat.o(48877);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48878);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vCN != null)
      {
        paramArrayOfObject.iy(1, this.vCN.computeSize());
        this.vCN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.fjr);
      if (this.vJS != null)
        paramArrayOfObject.e(3, this.vJS);
      AppMethodBeat.o(48878);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vCN == null)
        break label534;
    label534: for (paramInt = e.a.a.a.ix(1, this.vCN.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.fjr);
      paramInt = i;
      if (this.vJS != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vJS);
      AppMethodBeat.o(48878);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.fjr.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48878);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avd localavd = (avd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48878);
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
            localavd.vCN = ((cgv)localObject1);
          }
          AppMethodBeat.o(48878);
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
            localavd.fjr.add(paramArrayOfObject);
          }
          AppMethodBeat.o(48878);
          paramInt = i;
          break;
        case 3:
          localavd.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48878);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48878);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avd
 * JD-Core Version:    0.6.2
 */