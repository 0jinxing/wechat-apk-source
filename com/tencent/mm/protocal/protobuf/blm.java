package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class blm extends btd
{
  public String wOv;
  public String wOw;
  public String wOx;
  public String wOy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56932);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56932);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wOv != null)
        paramArrayOfObject.e(2, this.wOv);
      if (this.wOw != null)
        paramArrayOfObject.e(3, this.wOw);
      if (this.wOx != null)
        paramArrayOfObject.e(4, this.wOx);
      if (this.wOy != null)
        paramArrayOfObject.e(5, this.wOy);
      AppMethodBeat.o(56932);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label627;
    label627: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wOv != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wOv);
      i = paramInt;
      if (this.wOw != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wOw);
      paramInt = i;
      if (this.wOx != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wOx);
      i = paramInt;
      if (this.wOy != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wOy);
      AppMethodBeat.o(56932);
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
          AppMethodBeat.o(56932);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56932);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        blm localblm = (blm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56932);
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
            localblm.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56932);
          paramInt = i;
          break;
        case 2:
          localblm.wOv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56932);
          paramInt = i;
          break;
        case 3:
          localblm.wOw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56932);
          paramInt = i;
          break;
        case 4:
          localblm.wOx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56932);
          paramInt = i;
          break;
        case 5:
          localblm.wOy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56932);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56932);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.blm
 * JD-Core Version:    0.6.2
 */