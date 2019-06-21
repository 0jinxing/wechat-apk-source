package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cia extends bsr
{
  public String jSY;
  public String rOh;
  public int scene;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51773);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.scene);
      if (this.rOh != null)
        paramArrayOfObject.e(3, this.rOh);
      if (this.jSY != null)
        paramArrayOfObject.e(4, this.jSY);
      AppMethodBeat.o(51773);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label500;
    label500: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.scene);
      paramInt = i;
      if (this.rOh != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.rOh);
      i = paramInt;
      if (this.jSY != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.jSY);
      AppMethodBeat.o(51773);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51773);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cia localcia = (cia)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51773);
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
            localcia.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(51773);
          paramInt = i;
          break;
        case 2:
          localcia.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51773);
          paramInt = i;
          break;
        case 3:
          localcia.rOh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51773);
          paramInt = i;
          break;
        case 4:
          localcia.jSY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51773);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51773);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cia
 * JD-Core Version:    0.6.2
 */