package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class buf extends bsr
{
  public int Scene;
  public bkt wVW;
  public float wVX;
  public float wVY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80173);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wVW == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserPos");
        AppMethodBeat.o(80173);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wVW != null)
      {
        paramArrayOfObject.iy(2, this.wVW.computeSize());
        this.wVW.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.Scene);
      paramArrayOfObject.r(4, this.wVX);
      paramArrayOfObject.r(5, this.wVY);
      AppMethodBeat.o(80173);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label669;
    label669: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wVW != null)
        i = paramInt + e.a.a.a.ix(2, this.wVW.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.Scene) + (e.a.a.b.b.a.fv(4) + 4) + (e.a.a.b.b.a.fv(5) + 4);
      AppMethodBeat.o(80173);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wVW == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserPos");
          AppMethodBeat.o(80173);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80173);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        buf localbuf = (buf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80173);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(80173);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bkt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuf.wVW = paramArrayOfObject;
          }
          AppMethodBeat.o(80173);
          paramInt = i;
          break;
        case 3:
          localbuf.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80173);
          paramInt = i;
          break;
        case 4:
          localbuf.wVX = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(80173);
          paramInt = i;
          break;
        case 5:
          localbuf.wVY = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(80173);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80173);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.buf
 * JD-Core Version:    0.6.2
 */