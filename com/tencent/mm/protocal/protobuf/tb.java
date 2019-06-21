package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class tb extends com.tencent.mm.bt.a
{
  public int wat;
  public SKBuiltinBuffer_t wau;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58902);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wau == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CmdBuf");
        AppMethodBeat.o(58902);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wat);
      if (this.wau != null)
      {
        paramArrayOfObject.iy(2, this.wau.computeSize());
        this.wau.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58902);
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
        AppMethodBeat.o(58902);
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
          AppMethodBeat.o(58902);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58902);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        tb localtb = (tb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(58902);
          paramInt = -1;
          break;
        case 1:
          localtb.wat = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58902);
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
            localtb.wau = paramArrayOfObject;
          }
          AppMethodBeat.o(58902);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(58902);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.tb
 * JD-Core Version:    0.6.2
 */