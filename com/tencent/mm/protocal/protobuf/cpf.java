package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cpf extends com.tencent.mm.bt.a
{
  public String ndG;
  public int wat;
  public SKBuiltinBuffer_t wau;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5236);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wau == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CmdBuf");
        AppMethodBeat.o(5236);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wat);
      if (this.wau != null)
      {
        paramArrayOfObject.iy(2, this.wau.computeSize());
        this.wau.writeFields(paramArrayOfObject);
      }
      if (this.ndG != null)
        paramArrayOfObject.e(3, this.ndG);
      AppMethodBeat.o(5236);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wat) + 0;
        paramInt = i;
        if (this.wau != null)
          paramInt = i + e.a.a.a.ix(2, this.wau.computeSize());
        i = paramInt;
        if (this.ndG != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.ndG);
        AppMethodBeat.o(5236);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wau == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CmdBuf");
          AppMethodBeat.o(5236);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5236);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cpf localcpf = (cpf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5236);
          break;
        case 1:
          localcpf.wat = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5236);
          paramInt = 0;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcpf.wau = paramArrayOfObject;
          }
          AppMethodBeat.o(5236);
          paramInt = 0;
          break;
        case 3:
          localcpf.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5236);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(5236);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpf
 * JD-Core Version:    0.6.2
 */