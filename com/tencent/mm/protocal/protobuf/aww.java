package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aww extends bsr
{
  public String wAZ;
  public LinkedList<String> wBc;

  public aww()
  {
    AppMethodBeat.i(11782);
    this.wBc = new LinkedList();
    AppMethodBeat.o(11782);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11783);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wAZ != null)
        paramArrayOfObject.e(2, this.wAZ);
      paramArrayOfObject.e(3, 1, this.wBc);
      AppMethodBeat.o(11783);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label458;
    label458: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wAZ != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wAZ);
      paramInt = i + e.a.a.a.c(3, 1, this.wBc);
      AppMethodBeat.o(11783);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wBc.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11783);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aww localaww = (aww)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11783);
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
            localaww.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(11783);
          paramInt = i;
          break;
        case 2:
          localaww.wAZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(11783);
          paramInt = i;
          break;
        case 3:
          localaww.wBc.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(11783);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11783);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aww
 * JD-Core Version:    0.6.2
 */