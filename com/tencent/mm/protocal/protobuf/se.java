package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class se extends btd
{
  public String biC;
  public String ixJ;
  public int status;
  public String vZw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96216);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96216);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.status);
      if (this.ixJ != null)
        paramArrayOfObject.e(3, this.ixJ);
      if (this.biC != null)
        paramArrayOfObject.e(4, this.biC);
      if (this.vZw != null)
        paramArrayOfObject.e(5, this.vZw);
      AppMethodBeat.o(96216);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label611;
    label611: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.status);
      i = paramInt;
      if (this.ixJ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ixJ);
      paramInt = i;
      if (this.biC != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.biC);
      i = paramInt;
      if (this.vZw != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vZw);
      AppMethodBeat.o(96216);
      paramInt = i;
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
          AppMethodBeat.o(96216);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96216);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        se localse = (se)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96216);
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
            localse.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(96216);
          paramInt = i;
          break;
        case 2:
          localse.status = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96216);
          paramInt = i;
          break;
        case 3:
          localse.ixJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96216);
          paramInt = i;
          break;
        case 4:
          localse.biC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96216);
          paramInt = i;
          break;
        case 5:
          localse.vZw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96216);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96216);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.se
 * JD-Core Version:    0.6.2
 */