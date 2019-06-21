package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ags extends btd
{
  public LinkedList<String> kaF;
  public int kaH;
  public int kaI;
  public int kaJ;

  public ags()
  {
    AppMethodBeat.i(89085);
    this.kaF = new LinkedList();
    AppMethodBeat.o(89085);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89086);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(89086);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 1, this.kaF);
      paramArrayOfObject.iz(3, this.kaH);
      paramArrayOfObject.iz(4, this.kaI);
      paramArrayOfObject.iz(5, this.kaJ);
      AppMethodBeat.o(89086);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label572;
    label572: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 1, this.kaF) + e.a.a.b.b.a.bs(3, this.kaH) + e.a.a.b.b.a.bs(4, this.kaI) + e.a.a.b.b.a.bs(5, this.kaJ);
      AppMethodBeat.o(89086);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.kaF.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(89086);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(89086);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ags localags = (ags)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89086);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localags.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(89086);
          paramInt = i;
          break;
        case 2:
          localags.kaF.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(89086);
          paramInt = i;
          break;
        case 3:
          localags.kaH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89086);
          paramInt = i;
          break;
        case 4:
          localags.kaI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89086);
          paramInt = i;
          break;
        case 5:
          localags.kaJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89086);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89086);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ags
 * JD-Core Version:    0.6.2
 */