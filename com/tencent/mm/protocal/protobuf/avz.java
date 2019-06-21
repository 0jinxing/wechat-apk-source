package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class avz extends btd
{
  public String guQ;
  public String vAN;
  public String vBa;
  public avi wzH;
  public String wzN;
  public String wzO;
  public String wzP;
  public int wzQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96261);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96261);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wzH != null)
      {
        paramArrayOfObject.iy(2, this.wzH.computeSize());
        this.wzH.writeFields(paramArrayOfObject);
      }
      if (this.wzO != null)
        paramArrayOfObject.e(3, this.wzO);
      if (this.vBa != null)
        paramArrayOfObject.e(4, this.vBa);
      if (this.vAN != null)
        paramArrayOfObject.e(5, this.vAN);
      if (this.wzP != null)
        paramArrayOfObject.e(6, this.wzP);
      paramArrayOfObject.iz(7, this.wzQ);
      if (this.wzN != null)
        paramArrayOfObject.e(8, this.wzN);
      if (this.guQ != null)
        paramArrayOfObject.e(9, this.guQ);
      AppMethodBeat.o(96261);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label965;
    label965: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wzH != null)
        paramInt = i + e.a.a.a.ix(2, this.wzH.computeSize());
      i = paramInt;
      if (this.wzO != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wzO);
      paramInt = i;
      if (this.vBa != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vBa);
      i = paramInt;
      if (this.vAN != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vAN);
      paramInt = i;
      if (this.wzP != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wzP);
      i = paramInt + e.a.a.b.b.a.bs(7, this.wzQ);
      paramInt = i;
      if (this.wzN != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wzN);
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.guQ);
      AppMethodBeat.o(96261);
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
          AppMethodBeat.o(96261);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96261);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avz localavz = (avz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96261);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavz.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(96261);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new avi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((avi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavz.wzH = ((avi)localObject1);
          }
          AppMethodBeat.o(96261);
          paramInt = i;
          break;
        case 3:
          localavz.wzO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96261);
          paramInt = i;
          break;
        case 4:
          localavz.vBa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96261);
          paramInt = i;
          break;
        case 5:
          localavz.vAN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96261);
          paramInt = i;
          break;
        case 6:
          localavz.wzP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96261);
          paramInt = i;
          break;
        case 7:
          localavz.wzQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96261);
          paramInt = i;
          break;
        case 8:
          localavz.wzN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96261);
          paramInt = i;
          break;
        case 9:
          localavz.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96261);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96261);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avz
 * JD-Core Version:    0.6.2
 */