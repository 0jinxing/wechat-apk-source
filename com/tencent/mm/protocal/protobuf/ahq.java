package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ahq extends btd
{
  public String ID;
  public int Scene;
  public long jBP;
  public int jCt;
  public int vIN;
  public LinkedList<ua> vIO;
  public String vIP;
  public String vIQ;
  public String vIR;
  public int vIV;
  public String vIW;
  public String vIX;
  public SKBuiltinBuffer_t vIn;
  public String wnV;

  public ahq()
  {
    AppMethodBeat.i(28423);
    this.vIO = new LinkedList();
    AppMethodBeat.o(28423);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28424);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28424);
        throw paramArrayOfObject;
      }
      if (this.vIn == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Key");
        AppMethodBeat.o(28424);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.ID != null)
        paramArrayOfObject.e(2, this.ID);
      if (this.vIn != null)
      {
        paramArrayOfObject.iy(3, this.vIn.computeSize());
        this.vIn.writeFields(paramArrayOfObject);
      }
      if (this.vIW != null)
        paramArrayOfObject.e(4, this.vIW);
      if (this.vIX != null)
        paramArrayOfObject.e(5, this.vIX);
      paramArrayOfObject.iz(6, this.jCt);
      paramArrayOfObject.iz(7, this.vIN);
      paramArrayOfObject.e(8, 8, this.vIO);
      if (this.wnV != null)
        paramArrayOfObject.e(9, this.wnV);
      if (this.vIP != null)
        paramArrayOfObject.e(10, this.vIP);
      if (this.vIQ != null)
        paramArrayOfObject.e(11, this.vIQ);
      paramArrayOfObject.iz(12, this.vIV);
      paramArrayOfObject.iz(13, this.Scene);
      paramArrayOfObject.ai(14, this.jBP);
      if (this.vIR != null)
        paramArrayOfObject.e(15, this.vIR);
      AppMethodBeat.o(28424);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1436;
    label1436: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ID != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ID);
      i = paramInt;
      if (this.vIn != null)
        i = paramInt + e.a.a.a.ix(3, this.vIn.computeSize());
      paramInt = i;
      if (this.vIW != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vIW);
      i = paramInt;
      if (this.vIX != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vIX);
      paramInt = i + e.a.a.b.b.a.bs(6, this.jCt) + e.a.a.b.b.a.bs(7, this.vIN) + e.a.a.a.c(8, 8, this.vIO);
      i = paramInt;
      if (this.wnV != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wnV);
      paramInt = i;
      if (this.vIP != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vIP);
      i = paramInt;
      if (this.vIQ != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.vIQ);
      i = i + e.a.a.b.b.a.bs(12, this.vIV) + e.a.a.b.b.a.bs(13, this.Scene) + e.a.a.b.b.a.o(14, this.jBP);
      paramInt = i;
      if (this.vIR != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.vIR);
      AppMethodBeat.o(28424);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vIO.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28424);
          throw paramArrayOfObject;
        }
        if (this.vIn == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Key");
          AppMethodBeat.o(28424);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28424);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ahq localahq = (ahq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28424);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahq.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 2:
          localahq.ID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahq.vIn = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 4:
          localahq.vIW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 5:
          localahq.vIX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 6:
          localahq.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 7:
          localahq.vIN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ua();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ua)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localahq.vIO.add(localObject1);
          }
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 9:
          localahq.wnV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 10:
          localahq.vIP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 11:
          localahq.vIQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 12:
          localahq.vIV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 13:
          localahq.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 14:
          localahq.jBP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        case 15:
          localahq.vIR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28424);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28424);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ahq
 * JD-Core Version:    0.6.2
 */