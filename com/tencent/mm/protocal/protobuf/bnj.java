package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bnj extends btd
{
  public String cIY;
  public int iAd;
  public int kdT;
  public String kdU;
  public String kdf;
  public String vAh;
  public long wch;
  public chl woi;
  public btn wxm;
  public long wxq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48933);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48933);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      if (this.vAh != null)
        paramArrayOfObject.e(4, this.vAh);
      paramArrayOfObject.ai(5, this.wxq);
      paramArrayOfObject.ai(6, this.wch);
      if (this.wxm != null)
      {
        paramArrayOfObject.iy(7, this.wxm.computeSize());
        this.wxm.writeFields(paramArrayOfObject);
      }
      if (this.woi != null)
      {
        paramArrayOfObject.iy(8, this.woi.computeSize());
        this.woi.writeFields(paramArrayOfObject);
      }
      if (this.kdf != null)
        paramArrayOfObject.e(9, this.kdf);
      paramArrayOfObject.iz(10, this.iAd);
      if (this.cIY != null)
        paramArrayOfObject.e(11, this.cIY);
      AppMethodBeat.o(48933);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1139;
    label1139: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt;
      if (this.vAh != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vAh);
      paramInt = i + e.a.a.b.b.a.o(5, this.wxq) + e.a.a.b.b.a.o(6, this.wch);
      i = paramInt;
      if (this.wxm != null)
        i = paramInt + e.a.a.a.ix(7, this.wxm.computeSize());
      paramInt = i;
      if (this.woi != null)
        paramInt = i + e.a.a.a.ix(8, this.woi.computeSize());
      i = paramInt;
      if (this.kdf != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.kdf);
      i += e.a.a.b.b.a.bs(10, this.iAd);
      paramInt = i;
      if (this.cIY != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.cIY);
      AppMethodBeat.o(48933);
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
          AppMethodBeat.o(48933);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48933);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnj localbnj = (bnj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48933);
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
            localbnj.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 2:
          localbnj.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 3:
          localbnj.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 4:
          localbnj.vAh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 5:
          localbnj.wxq = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 6:
          localbnj.wch = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnj.wxm = paramArrayOfObject;
          }
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new chl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbnj.woi = ((chl)localObject1);
          }
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 9:
          localbnj.kdf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 10:
          localbnj.iAd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        case 11:
          localbnj.cIY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48933);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48933);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnj
 * JD-Core Version:    0.6.2
 */