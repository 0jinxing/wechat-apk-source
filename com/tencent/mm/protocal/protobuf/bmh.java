package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bmh extends bsr
{
  public int jBT;
  public String ndG;
  public long wOP;
  public long wOS;
  public int wem;
  public long wen;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28591);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FromUserName");
        AppMethodBeat.o(28591);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ndG != null)
        paramArrayOfObject.e(2, this.ndG);
      paramArrayOfObject.iz(3, this.wem);
      paramArrayOfObject.ai(4, this.wen);
      paramArrayOfObject.ai(5, this.wOP);
      paramArrayOfObject.ai(6, this.wOS);
      paramArrayOfObject.iz(7, this.jBT);
      AppMethodBeat.o(28591);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label682;
    label682: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ndG != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ndG);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wem) + e.a.a.b.b.a.o(4, this.wen) + e.a.a.b.b.a.o(5, this.wOP) + e.a.a.b.b.a.o(6, this.wOS) + e.a.a.b.b.a.bs(7, this.jBT);
      AppMethodBeat.o(28591);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ndG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FromUserName");
          AppMethodBeat.o(28591);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28591);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmh localbmh = (bmh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28591);
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
            localbmh.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28591);
          paramInt = i;
          break;
        case 2:
          localbmh.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28591);
          paramInt = i;
          break;
        case 3:
          localbmh.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28591);
          paramInt = i;
          break;
        case 4:
          localbmh.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28591);
          paramInt = i;
          break;
        case 5:
          localbmh.wOP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28591);
          paramInt = i;
          break;
        case 6:
          localbmh.wOS = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28591);
          paramInt = i;
          break;
        case 7:
          localbmh.jBT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28591);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28591);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmh
 * JD-Core Version:    0.6.2
 */