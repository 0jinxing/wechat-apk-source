package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class kp extends bsr
{
  public String ProductID;
  public int Scene;
  public String vNG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11715);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ProductID != null)
        paramArrayOfObject.e(2, this.ProductID);
      paramArrayOfObject.iz(3, this.Scene);
      if (this.vNG != null)
        paramArrayOfObject.e(4, this.vNG);
      AppMethodBeat.o(11715);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label506;
    label506: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ProductID != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ProductID);
      i += e.a.a.b.b.a.bs(3, this.Scene);
      paramInt = i;
      if (this.vNG != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vNG);
      AppMethodBeat.o(11715);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11715);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        kp localkp = (kp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11715);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localkp.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11715);
          paramInt = i;
          break;
        case 2:
          localkp.ProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11715);
          paramInt = i;
          break;
        case 3:
          localkp.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(11715);
          paramInt = i;
          break;
        case 4:
          localkp.vNG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11715);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11715);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kp
 * JD-Core Version:    0.6.2
 */