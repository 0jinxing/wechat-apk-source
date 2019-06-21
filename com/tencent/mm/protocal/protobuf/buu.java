package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class buu extends bsr
{
  public int OpCode;
  public SKBuiltinBuffer_t ReqBuf;
  public int wOo;
  public int wWi;
  public bts wcB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80176);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wcB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(80176);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wcB != null)
      {
        paramArrayOfObject.iy(2, this.wcB.computeSize());
        this.wcB.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.OpCode);
      if (this.ReqBuf != null)
      {
        paramArrayOfObject.iy(4, this.ReqBuf.computeSize());
        this.ReqBuf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wOo);
      paramArrayOfObject.iz(6, this.wWi);
      AppMethodBeat.o(80176);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label826;
    label826: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wcB != null)
        i = paramInt + e.a.a.a.ix(2, this.wcB.computeSize());
      i += e.a.a.b.b.a.bs(3, this.OpCode);
      paramInt = i;
      if (this.ReqBuf != null)
        paramInt = i + e.a.a.a.ix(4, this.ReqBuf.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.wOo) + e.a.a.b.b.a.bs(6, this.wWi);
      AppMethodBeat.o(80176);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wcB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(80176);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80176);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        buu localbuu = (buu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80176);
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
            localbuu.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(80176);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuu.wcB = paramArrayOfObject;
          }
          AppMethodBeat.o(80176);
          paramInt = i;
          break;
        case 3:
          localbuu.OpCode = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80176);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbuu.ReqBuf = paramArrayOfObject;
          }
          AppMethodBeat.o(80176);
          paramInt = i;
          break;
        case 5:
          localbuu.wOo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80176);
          paramInt = i;
          break;
        case 6:
          localbuu.wWi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80176);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80176);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.buu
 * JD-Core Version:    0.6.2
 */