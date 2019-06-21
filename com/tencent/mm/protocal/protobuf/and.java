package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class and extends btd
{
  public String fileid;
  public String nickname;
  public String wrK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10183);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(10183);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.nickname != null)
        paramArrayOfObject.e(2, this.nickname);
      if (this.wrK != null)
        paramArrayOfObject.e(3, this.wrK);
      if (this.fileid != null)
        paramArrayOfObject.e(4, this.fileid);
      AppMethodBeat.o(10183);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label574;
    label574: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nickname != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nickname);
      i = paramInt;
      if (this.wrK != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wrK);
      paramInt = i;
      if (this.fileid != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.fileid);
      AppMethodBeat.o(10183);
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
          AppMethodBeat.o(10183);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(10183);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        and localand = (and)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10183);
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
            localand.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(10183);
          paramInt = i;
          break;
        case 2:
          localand.nickname = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10183);
          paramInt = i;
          break;
        case 3:
          localand.wrK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10183);
          paramInt = i;
          break;
        case 4:
          localand.fileid = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10183);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10183);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.and
 * JD-Core Version:    0.6.2
 */