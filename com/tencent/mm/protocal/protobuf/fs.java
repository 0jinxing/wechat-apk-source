package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class fs extends com.tencent.mm.bt.a
{
  public String ProductID;
  public String vBa;
  public EmotionPrice vHC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62509);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ProductID == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ProductID");
        AppMethodBeat.o(62509);
        throw paramArrayOfObject;
      }
      if (this.vHC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Price");
        AppMethodBeat.o(62509);
        throw paramArrayOfObject;
      }
      if (this.ProductID != null)
        paramArrayOfObject.e(1, this.ProductID);
      if (this.vHC != null)
      {
        paramArrayOfObject.iy(2, this.vHC.computeSize());
        this.vHC.writeFields(paramArrayOfObject);
      }
      if (this.vBa != null)
        paramArrayOfObject.e(3, this.vBa);
      AppMethodBeat.o(62509);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ProductID == null)
        break label549;
    label549: for (i = e.a.a.b.b.a.f(1, this.ProductID) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vHC != null)
        paramInt = i + e.a.a.a.ix(2, this.vHC.computeSize());
      i = paramInt;
      if (this.vBa != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vBa);
      AppMethodBeat.o(62509);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ProductID == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ProductID");
          AppMethodBeat.o(62509);
          throw paramArrayOfObject;
        }
        if (this.vHC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Price");
          AppMethodBeat.o(62509);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62509);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fs localfs = (fs)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62509);
          break;
        case 1:
          localfs.ProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62509);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new EmotionPrice();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfs.vHC = paramArrayOfObject;
          }
          AppMethodBeat.o(62509);
          paramInt = i;
          break;
        case 3:
          localfs.vBa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62509);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62509);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fs
 * JD-Core Version:    0.6.2
 */