package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bln extends com.tencent.mm.bt.a
{
  public String vJS;
  public bzy wOA;
  public bzy wOB;
  public boolean wOz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48926);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.aO(1, this.wOz);
      if (this.wOA != null)
      {
        paramArrayOfObject.iy(2, this.wOA.computeSize());
        this.wOA.writeFields(paramArrayOfObject);
      }
      if (this.wOB != null)
      {
        paramArrayOfObject.iy(3, this.wOB.computeSize());
        this.wOB.writeFields(paramArrayOfObject);
      }
      if (this.vJS != null)
        paramArrayOfObject.e(4, this.vJS);
      AppMethodBeat.o(48926);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.fv(1) + 1 + 0;
        paramInt = i;
        if (this.wOA != null)
          paramInt = i + e.a.a.a.ix(2, this.wOA.computeSize());
        i = paramInt;
        if (this.wOB != null)
          i = paramInt + e.a.a.a.ix(3, this.wOB.computeSize());
        paramInt = i;
        if (this.vJS != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.vJS);
        AppMethodBeat.o(48926);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48926);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bln localbln = (bln)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48926);
          break;
        case 1:
          localbln.wOz = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48926);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzy)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbln.wOA = ((bzy)localObject1);
          }
          AppMethodBeat.o(48926);
          paramInt = 0;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bzy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbln.wOB = paramArrayOfObject;
          }
          AppMethodBeat.o(48926);
          paramInt = 0;
          break;
        case 4:
          localbln.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48926);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48926);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bln
 * JD-Core Version:    0.6.2
 */