package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class amk extends com.tencent.mm.bt.a
{
  public int DesignerUin;
  public SKBuiltinBuffer_t ReqBuf;
  public int Scene;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62569);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ReqBuf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReqBuf");
        AppMethodBeat.o(62569);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.DesignerUin);
      if (this.ReqBuf != null)
      {
        paramArrayOfObject.iy(2, this.ReqBuf.computeSize());
        this.ReqBuf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.Scene);
      AppMethodBeat.o(62569);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.DesignerUin) + 0;
        paramInt = i;
        if (this.ReqBuf != null)
          paramInt = i + e.a.a.a.ix(2, this.ReqBuf.computeSize());
        paramInt += e.a.a.b.b.a.bs(3, this.Scene);
        AppMethodBeat.o(62569);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ReqBuf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ReqBuf");
          AppMethodBeat.o(62569);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62569);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        amk localamk = (amk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62569);
          break;
        case 1:
          localamk.DesignerUin = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62569);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localamk.ReqBuf = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(62569);
          paramInt = 0;
          break;
        case 3:
          localamk.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(62569);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(62569);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.amk
 * JD-Core Version:    0.6.2
 */