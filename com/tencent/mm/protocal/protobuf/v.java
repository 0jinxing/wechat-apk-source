package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class v extends btd
{
  public int kCl;
  public String kCm;
  public int state;
  public String title;
  public int type;
  public String vAg;
  public String vAk;
  public long vAl;
  public int vAm;
  public long vAn;
  public int vAo;
  public int vAp;
  public int vAq;
  public int vAr;
  public long vAs;
  public long vAt;
  public long vAu;
  public int vAv;
  public String vAw;
  public int vAx;
  public long vAy;
  public String vzL;
  public LinkedList<t> vzQ;
  public int vzW;

  public v()
  {
    AppMethodBeat.i(56690);
    this.kCl = 268513600;
    this.kCm = "请求不成功，请稍候再试";
    this.vzQ = new LinkedList();
    AppMethodBeat.o(56690);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56691);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56691);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kCl);
      if (this.kCm != null)
        paramArrayOfObject.e(3, this.kCm);
      if (this.vzL != null)
        paramArrayOfObject.e(4, this.vzL);
      if (this.title != null)
        paramArrayOfObject.e(5, this.title);
      paramArrayOfObject.iz(6, this.type);
      if (this.vAk != null)
        paramArrayOfObject.e(7, this.vAk);
      paramArrayOfObject.ai(8, this.vAl);
      paramArrayOfObject.iz(9, this.vAm);
      paramArrayOfObject.ai(10, this.vAn);
      paramArrayOfObject.iz(11, this.vAo);
      paramArrayOfObject.iz(12, this.state);
      paramArrayOfObject.iz(13, this.vAp);
      paramArrayOfObject.iz(14, this.vAq);
      paramArrayOfObject.iz(15, this.vzW);
      paramArrayOfObject.iz(16, this.vAr);
      paramArrayOfObject.ai(17, this.vAs);
      paramArrayOfObject.ai(18, this.vAt);
      paramArrayOfObject.ai(19, this.vAu);
      paramArrayOfObject.iz(20, this.vAv);
      if (this.vAg != null)
        paramArrayOfObject.e(21, this.vAg);
      paramArrayOfObject.e(22, 8, this.vzQ);
      if (this.vAw != null)
        paramArrayOfObject.e(23, this.vAw);
      paramArrayOfObject.iz(24, this.vAx);
      paramArrayOfObject.ai(25, this.vAy);
      AppMethodBeat.o(56691);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1708;
    label1708: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.vzL != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vzL);
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.title);
      i = paramInt + e.a.a.b.b.a.bs(6, this.type);
      paramInt = i;
      if (this.vAk != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vAk);
      i = paramInt + e.a.a.b.b.a.o(8, this.vAl) + e.a.a.b.b.a.bs(9, this.vAm) + e.a.a.b.b.a.o(10, this.vAn) + e.a.a.b.b.a.bs(11, this.vAo) + e.a.a.b.b.a.bs(12, this.state) + e.a.a.b.b.a.bs(13, this.vAp) + e.a.a.b.b.a.bs(14, this.vAq) + e.a.a.b.b.a.bs(15, this.vzW) + e.a.a.b.b.a.bs(16, this.vAr) + e.a.a.b.b.a.o(17, this.vAs) + e.a.a.b.b.a.o(18, this.vAt) + e.a.a.b.b.a.o(19, this.vAu) + e.a.a.b.b.a.bs(20, this.vAv);
      paramInt = i;
      if (this.vAg != null)
        paramInt = i + e.a.a.b.b.a.f(21, this.vAg);
      i = paramInt + e.a.a.a.c(22, 8, this.vzQ);
      paramInt = i;
      if (this.vAw != null)
        paramInt = i + e.a.a.b.b.a.f(23, this.vAw);
      paramInt = paramInt + e.a.a.b.b.a.bs(24, this.vAx) + e.a.a.b.b.a.o(25, this.vAy);
      AppMethodBeat.o(56691);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vzQ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56691);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56691);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        v localv = (v)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56691);
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
            localv.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 2:
          localv.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 3:
          localv.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 4:
          localv.vzL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 5:
          localv.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 6:
          localv.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 7:
          localv.vAk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 8:
          localv.vAl = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 9:
          localv.vAm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 10:
          localv.vAn = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 11:
          localv.vAo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 12:
          localv.state = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 13:
          localv.vAp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 14:
          localv.vAq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 15:
          localv.vzW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 16:
          localv.vAr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 17:
          localv.vAs = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 18:
          localv.vAt = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 19:
          localv.vAu = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 20:
          localv.vAv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 21:
          localv.vAg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 22:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localv.vzQ.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 23:
          localv.vAw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 24:
          localv.vAx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        case 25:
          localv.vAy = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56691);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56691);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.v
 * JD-Core Version:    0.6.2
 */