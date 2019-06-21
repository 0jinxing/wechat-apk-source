package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class kh extends com.tencent.mm.bt.a
{
  public kk vNe;
  public String vNf;
  public String vNg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11705);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vNe != null)
      {
        paramArrayOfObject.iy(1, this.vNe.computeSize());
        this.vNe.writeFields(paramArrayOfObject);
      }
      if (this.vNf != null)
        paramArrayOfObject.e(2, this.vNf);
      if (this.vNg != null)
        paramArrayOfObject.e(3, this.vNg);
      AppMethodBeat.o(11705);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vNe == null)
        break label462;
    label462: for (i = e.a.a.a.ix(1, this.vNe.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vNf != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vNf);
      i = paramInt;
      if (this.vNg != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vNg);
      AppMethodBeat.o(11705);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11705);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        kh localkh = (kh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11705);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new kk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localkh.vNe = paramArrayOfObject;
          }
          AppMethodBeat.o(11705);
          paramInt = i;
          break;
        case 2:
          localkh.vNf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11705);
          paramInt = i;
          break;
        case 3:
          localkh.vNg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11705);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11705);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.kh
 * JD-Core Version:    0.6.2
 */