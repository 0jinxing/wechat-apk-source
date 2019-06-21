package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aer extends bsr
{
  public String appId;
  public String cvO;
  public String mwU;
  public String mwV;
  public String mwW;
  public String sign;
  public String vAN;
  public int vAO;
  public dh wmv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28415);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.appId != null)
        paramArrayOfObject.e(2, this.appId);
      if (this.mwU != null)
        paramArrayOfObject.e(3, this.mwU);
      if (this.mwV != null)
        paramArrayOfObject.e(4, this.mwV);
      if (this.mwW != null)
        paramArrayOfObject.e(5, this.mwW);
      if (this.cvO != null)
        paramArrayOfObject.e(6, this.cvO);
      if (this.sign != null)
        paramArrayOfObject.e(7, this.sign);
      if (this.wmv != null)
      {
        paramArrayOfObject.iy(8, this.wmv.computeSize());
        this.wmv.writeFields(paramArrayOfObject);
      }
      if (this.vAN != null)
        paramArrayOfObject.e(9, this.vAN);
      paramArrayOfObject.iz(10, this.vAO);
      AppMethodBeat.o(28415);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1003;
    label1003: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.appId != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.appId);
      i = paramInt;
      if (this.mwU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mwU);
      int j = i;
      if (this.mwV != null)
        j = i + e.a.a.b.b.a.f(4, this.mwV);
      paramInt = j;
      if (this.mwW != null)
        paramInt = j + e.a.a.b.b.a.f(5, this.mwW);
      i = paramInt;
      if (this.cvO != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.cvO);
      j = i;
      if (this.sign != null)
        j = i + e.a.a.b.b.a.f(7, this.sign);
      paramInt = j;
      if (this.wmv != null)
        paramInt = j + e.a.a.a.ix(8, this.wmv.computeSize());
      i = paramInt;
      if (this.vAN != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vAN);
      paramInt = i + e.a.a.b.b.a.bs(10, this.vAO);
      AppMethodBeat.o(28415);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28415);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aer localaer = (aer)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28415);
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
            localaer.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        case 2:
          localaer.appId = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        case 3:
          localaer.mwU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        case 4:
          localaer.mwV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        case 5:
          localaer.mwW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        case 6:
          localaer.cvO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        case 7:
          localaer.sign = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new dh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((dh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaer.wmv = ((dh)localObject1);
          }
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        case 9:
          localaer.vAN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        case 10:
          localaer.vAO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28415);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28415);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aer
 * JD-Core Version:    0.6.2
 */