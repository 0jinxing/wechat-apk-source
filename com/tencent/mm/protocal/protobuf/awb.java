package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class awb extends btd
{
  public String guQ;
  public String ncH;
  public String vAN;
  public String vBa;
  public String vDm;
  public LinkedList<buj> wlE;
  public avi wzH;
  public String wzN;
  public String wzO;
  public String wzP;
  public int wzQ;

  public awb()
  {
    AppMethodBeat.i(96264);
    this.wlE = new LinkedList();
    AppMethodBeat.o(96264);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96265);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96265);
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
      paramArrayOfObject.e(4, 8, this.wlE);
      if (this.ncH != null)
        paramArrayOfObject.e(5, this.ncH);
      if (this.vDm != null)
        paramArrayOfObject.e(6, this.vDm);
      if (this.vBa != null)
        paramArrayOfObject.e(7, this.vBa);
      if (this.vAN != null)
        paramArrayOfObject.e(8, this.vAN);
      if (this.wzP != null)
        paramArrayOfObject.e(9, this.wzP);
      paramArrayOfObject.iz(10, this.wzQ);
      if (this.wzN != null)
        paramArrayOfObject.e(11, this.wzN);
      if (this.guQ != null)
        paramArrayOfObject.e(12, this.guQ);
      AppMethodBeat.o(96265);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1246;
    label1246: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wzH != null)
        paramInt = i + e.a.a.a.ix(2, this.wzH.computeSize());
      i = paramInt;
      if (this.wzO != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wzO);
      i += e.a.a.a.c(4, 8, this.wlE);
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.ncH);
      i = paramInt;
      if (this.vDm != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vDm);
      int j = i;
      if (this.vBa != null)
        j = i + e.a.a.b.b.a.f(7, this.vBa);
      paramInt = j;
      if (this.vAN != null)
        paramInt = j + e.a.a.b.b.a.f(8, this.vAN);
      i = paramInt;
      if (this.wzP != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wzP);
      i += e.a.a.b.b.a.bs(10, this.wzQ);
      paramInt = i;
      if (this.wzN != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wzN);
      i = paramInt;
      if (this.guQ != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.guQ);
      AppMethodBeat.o(96265);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wlE.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(96265);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96265);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        awb localawb = (awb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96265);
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
            localawb.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(96265);
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
            localawb.wzH = ((avi)localObject1);
          }
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 3:
          localawb.wzO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new buj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((buj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawb.wlE.add(localObject1);
          }
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 5:
          localawb.ncH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 6:
          localawb.vDm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 7:
          localawb.vBa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 8:
          localawb.vAN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 9:
          localawb.wzP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 10:
          localawb.wzQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 11:
          localawb.wzN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        case 12:
          localawb.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96265);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96265);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.awb
 * JD-Core Version:    0.6.2
 */