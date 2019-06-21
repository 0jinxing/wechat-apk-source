package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bfj extends com.tencent.mm.bt.a
{
  public com.tencent.mm.bt.b vKc;
  public int wJh;
  public String wJi;
  public SKBuiltinBuffer_t wJj;
  public int wJk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28562);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wJj == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: ClientKey");
        AppMethodBeat.o(28562);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wJh);
      if (this.vKc != null)
        paramArrayOfObject.c(2, this.vKc);
      if (this.wJi != null)
        paramArrayOfObject.e(3, this.wJi);
      if (this.wJj != null)
      {
        paramArrayOfObject.iy(4, this.wJj.computeSize());
        this.wJj.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wJk);
      AppMethodBeat.o(28562);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wJh) + 0;
        i = paramInt;
        if (this.vKc != null)
          i = paramInt + e.a.a.b.b.a.b(2, this.vKc);
        paramInt = i;
        if (this.wJi != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.wJi);
        i = paramInt;
        if (this.wJj != null)
          i = paramInt + e.a.a.a.ix(4, this.wJj.computeSize());
        paramInt = i + e.a.a.b.b.a.bs(5, this.wJk);
        AppMethodBeat.o(28562);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wJj == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: ClientKey");
          AppMethodBeat.o(28562);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28562);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bfj localbfj = (bfj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28562);
          break;
        case 1:
          localbfj.wJh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28562);
          paramInt = 0;
          break;
        case 2:
          localbfj.vKc = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(28562);
          paramInt = 0;
          break;
        case 3:
          localbfj.wJi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28562);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfj.wJj = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28562);
          paramInt = 0;
          break;
        case 5:
          localbfj.wJk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28562);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28562);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfj
 * JD-Core Version:    0.6.2
 */