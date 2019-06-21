package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bhe extends bsr
{
  public String cDo;
  public String signature;
  public String tuu;
  public String wKv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51768);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wKv != null)
        paramArrayOfObject.e(2, this.wKv);
      if (this.signature != null)
        paramArrayOfObject.e(3, this.signature);
      if (this.tuu != null)
        paramArrayOfObject.e(4, this.tuu);
      if (this.cDo != null)
        paramArrayOfObject.e(5, this.cDo);
      AppMethodBeat.o(51768);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label580;
    label580: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wKv != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wKv);
      i = paramInt;
      if (this.signature != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.signature);
      paramInt = i;
      if (this.tuu != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.tuu);
      i = paramInt;
      if (this.cDo != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.cDo);
      AppMethodBeat.o(51768);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51768);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bhe localbhe = (bhe)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51768);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbhe.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(51768);
          paramInt = i;
          break;
        case 2:
          localbhe.wKv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51768);
          paramInt = i;
          break;
        case 3:
          localbhe.signature = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51768);
          paramInt = i;
          break;
        case 4:
          localbhe.tuu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51768);
          paramInt = i;
          break;
        case 5:
          localbhe.cDo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51768);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51768);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bhe
 * JD-Core Version:    0.6.2
 */