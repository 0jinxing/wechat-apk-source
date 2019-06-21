package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class gt extends com.tencent.mm.bt.a
  implements bzw
{
  public String ID;
  public int Ret;
  public String vIS;
  public SKBuiltinBuffer_t vIT;
  public String vIU;
  public int vIV;
  public String vIW;
  public String vIX;
  public SKBuiltinBuffer_t vIn;

  public final int getRet()
  {
    return this.Ret;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28332);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vIT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QRCodeBuffer");
        AppMethodBeat.o(28332);
        throw paramArrayOfObject;
      }
      if (this.vIn == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Key");
        AppMethodBeat.o(28332);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.Ret);
      if (this.vIT != null)
      {
        paramArrayOfObject.iy(2, this.vIT.computeSize());
        this.vIT.writeFields(paramArrayOfObject);
      }
      if (this.vIU != null)
        paramArrayOfObject.e(3, this.vIU);
      if (this.vIn != null)
      {
        paramArrayOfObject.iy(4, this.vIn.computeSize());
        this.vIn.writeFields(paramArrayOfObject);
      }
      if (this.vIW != null)
        paramArrayOfObject.e(5, this.vIW);
      if (this.vIX != null)
        paramArrayOfObject.e(6, this.vIX);
      paramArrayOfObject.iz(7, this.vIV);
      if (this.ID != null)
        paramArrayOfObject.e(8, this.ID);
      if (this.vIS != null)
        paramArrayOfObject.e(9, this.vIS);
      AppMethodBeat.o(28332);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.Ret) + 0;
        paramInt = i;
        if (this.vIT != null)
          paramInt = i + e.a.a.a.ix(2, this.vIT.computeSize());
        i = paramInt;
        if (this.vIU != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.vIU);
        int j = i;
        if (this.vIn != null)
          j = i + e.a.a.a.ix(4, this.vIn.computeSize());
        paramInt = j;
        if (this.vIW != null)
          paramInt = j + e.a.a.b.b.a.f(5, this.vIW);
        i = paramInt;
        if (this.vIX != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.vIX);
        i += e.a.a.b.b.a.bs(7, this.vIV);
        paramInt = i;
        if (this.ID != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.ID);
        i = paramInt;
        if (this.vIS != null)
          i = paramInt + e.a.a.b.b.a.f(9, this.vIS);
        AppMethodBeat.o(28332);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vIT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QRCodeBuffer");
          AppMethodBeat.o(28332);
          throw paramArrayOfObject;
        }
        if (this.vIn == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Key");
          AppMethodBeat.o(28332);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28332);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gt localgt = (gt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28332);
          break;
        case 1:
          localgt.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28332);
          paramInt = 0;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgt.vIT = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28332);
          paramInt = 0;
          break;
        case 3:
          localgt.vIU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28332);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgt.vIn = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28332);
          paramInt = 0;
          break;
        case 5:
          localgt.vIW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28332);
          paramInt = 0;
          break;
        case 6:
          localgt.vIX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28332);
          paramInt = 0;
          break;
        case 7:
          localgt.vIV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28332);
          paramInt = 0;
          break;
        case 8:
          localgt.ID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28332);
          paramInt = 0;
          break;
        case 9:
          localgt.vIS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28332);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28332);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gt
 * JD-Core Version:    0.6.2
 */