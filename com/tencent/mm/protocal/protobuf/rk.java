package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class rk extends btd
{
  public int jCt;
  public int vYE;
  public int vYF;
  public int vYG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(50528);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(50528);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jCt);
      paramArrayOfObject.iz(3, this.vYE);
      paramArrayOfObject.iz(4, this.vYF);
      paramArrayOfObject.iz(5, this.vYG);
      AppMethodBeat.o(50528);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label555;
    label555: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.jCt) + e.a.a.b.b.a.bs(3, this.vYE) + e.a.a.b.b.a.bs(4, this.vYF) + e.a.a.b.b.a.bs(5, this.vYG);
      AppMethodBeat.o(50528);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(50528);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(50528);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        rk localrk = (rk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(50528);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrk.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(50528);
          paramInt = i;
          break;
        case 2:
          localrk.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50528);
          paramInt = i;
          break;
        case 3:
          localrk.vYE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50528);
          paramInt = i;
          break;
        case 4:
          localrk.vYF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50528);
          paramInt = i;
          break;
        case 5:
          localrk.vYG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50528);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(50528);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rk
 * JD-Core Version:    0.6.2
 */