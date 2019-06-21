package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class gs extends com.tencent.mm.bt.a
{
  public String ID;
  public int Ret;
  public SKBuiltinBuffer_t vIT;
  public String vIU;
  public int vIV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28331);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vIT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QRCodeBuffer");
        AppMethodBeat.o(28331);
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
      paramArrayOfObject.iz(4, this.vIV);
      if (this.ID != null)
        paramArrayOfObject.e(5, this.ID);
      AppMethodBeat.o(28331);
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
        i += e.a.a.b.b.a.bs(4, this.vIV);
        paramInt = i;
        if (this.ID != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.ID);
        AppMethodBeat.o(28331);
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
          AppMethodBeat.o(28331);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28331);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gs localgs = (gs)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28331);
          break;
        case 1:
          localgs.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28331);
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
            localgs.vIT = paramArrayOfObject;
          }
          AppMethodBeat.o(28331);
          paramInt = 0;
          break;
        case 3:
          localgs.vIU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28331);
          paramInt = 0;
          break;
        case 4:
          localgs.vIV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28331);
          paramInt = 0;
          break;
        case 5:
          localgs.ID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28331);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28331);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gs
 * JD-Core Version:    0.6.2
 */