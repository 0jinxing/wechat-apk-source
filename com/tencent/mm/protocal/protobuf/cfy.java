package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cfy extends com.tencent.mm.bt.a
{
  public String vJS;
  public int wRi;
  public int xeY;
  public xc xeZ;
  public xc xfa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48964);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wRi);
      paramArrayOfObject.iz(2, this.xeY);
      if (this.vJS != null)
        paramArrayOfObject.e(3, this.vJS);
      if (this.xeZ != null)
      {
        paramArrayOfObject.iy(4, this.xeZ.computeSize());
        this.xeZ.writeFields(paramArrayOfObject);
      }
      if (this.xfa != null)
      {
        paramArrayOfObject.iy(5, this.xfa.computeSize());
        this.xfa.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48964);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wRi) + 0 + e.a.a.b.b.a.bs(2, this.xeY);
        paramInt = i;
        if (this.vJS != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vJS);
        i = paramInt;
        if (this.xeZ != null)
          i = paramInt + e.a.a.a.ix(4, this.xeZ.computeSize());
        paramInt = i;
        if (this.xfa != null)
          paramInt = i + e.a.a.a.ix(5, this.xfa.computeSize());
        AppMethodBeat.o(48964);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48964);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cfy localcfy = (cfy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48964);
          break;
        case 1:
          localcfy.wRi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48964);
          paramInt = 0;
          break;
        case 2:
          localcfy.xeY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48964);
          paramInt = 0;
          break;
        case 3:
          localcfy.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48964);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfy.xeZ = ((xc)localObject1);
          }
          AppMethodBeat.o(48964);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new xc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfy.xfa = paramArrayOfObject;
          }
          AppMethodBeat.o(48964);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48964);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cfy
 * JD-Core Version:    0.6.2
 */