package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class fc extends com.tencent.mm.bt.a
{
  public int OpCode;
  public String fKh;
  public int vHa;
  public int vHb;
  public fh vHc;
  public fb vHd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28314);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fKh == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppId");
        AppMethodBeat.o(28314);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.OpCode);
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      paramArrayOfObject.iz(3, this.vHa);
      paramArrayOfObject.iz(4, this.vHb);
      if (this.vHc != null)
      {
        paramArrayOfObject.iy(5, this.vHc.computeSize());
        this.vHc.writeFields(paramArrayOfObject);
      }
      if (this.vHd != null)
      {
        paramArrayOfObject.iy(6, this.vHd.computeSize());
        this.vHd.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28314);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.OpCode) + 0;
        paramInt = i;
        if (this.fKh != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
        i = paramInt + e.a.a.b.b.a.bs(3, this.vHa) + e.a.a.b.b.a.bs(4, this.vHb);
        paramInt = i;
        if (this.vHc != null)
          paramInt = i + e.a.a.a.ix(5, this.vHc.computeSize());
        i = paramInt;
        if (this.vHd != null)
          i = paramInt + e.a.a.a.ix(6, this.vHd.computeSize());
        AppMethodBeat.o(28314);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.fKh == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppId");
          AppMethodBeat.o(28314);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28314);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fc localfc = (fc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28314);
          break;
        case 1:
          localfc.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28314);
          paramInt = 0;
          break;
        case 2:
          localfc.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28314);
          paramInt = 0;
          break;
        case 3:
          localfc.vHa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28314);
          paramInt = 0;
          break;
        case 4:
          localfc.vHb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28314);
          paramInt = 0;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new fh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfc.vHc = paramArrayOfObject;
          }
          AppMethodBeat.o(28314);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new fb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfc.vHd = paramArrayOfObject;
          }
          AppMethodBeat.o(28314);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28314);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fc
 * JD-Core Version:    0.6.2
 */