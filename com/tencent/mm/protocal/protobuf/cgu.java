package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cgu extends com.tencent.mm.bt.a
{
  public int eUv;
  public String text;
  public int textColor;
  public cnw wCL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(2533);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.text == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: text");
        AppMethodBeat.o(2533);
        throw paramArrayOfObject;
      }
      if (this.wCL == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: matrix");
        AppMethodBeat.o(2533);
        throw paramArrayOfObject;
      }
      if (this.text != null)
        paramArrayOfObject.e(1, this.text);
      paramArrayOfObject.iz(2, this.textColor);
      paramArrayOfObject.iz(3, this.eUv);
      if (this.wCL != null)
      {
        paramArrayOfObject.iy(4, this.wCL.computeSize());
        this.wCL.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(2533);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.text == null)
        break label590;
    label590: for (paramInt = e.a.a.b.b.a.f(1, this.text) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.textColor) + e.a.a.b.b.a.bs(3, this.eUv);
      paramInt = i;
      if (this.wCL != null)
        paramInt = i + e.a.a.a.ix(4, this.wCL.computeSize());
      AppMethodBeat.o(2533);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.text == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: text");
          AppMethodBeat.o(2533);
          throw paramArrayOfObject;
        }
        if (this.wCL == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: matrix");
          AppMethodBeat.o(2533);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(2533);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cgu localcgu = (cgu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(2533);
          break;
        case 1:
          localcgu.text = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(2533);
          paramInt = i;
          break;
        case 2:
          localcgu.textColor = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(2533);
          paramInt = i;
          break;
        case 3:
          localcgu.eUv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(2533);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cnw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgu.wCL = paramArrayOfObject;
          }
          AppMethodBeat.o(2533);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(2533);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgu
 * JD-Core Version:    0.6.2
 */