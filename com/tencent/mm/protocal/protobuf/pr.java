package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class pr extends btd
{
  public String desc;
  public int kCl;
  public String kCm;
  public String pPw;
  public String vWG;
  public String vWJ;
  public String vWM;
  public String vWO;
  public String vWP;
  public String vWS;
  public LinkedList<Integer> vWt;
  public int vWv;

  public pr()
  {
    AppMethodBeat.i(48802);
    this.vWt = new LinkedList();
    AppMethodBeat.o(48802);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48803);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48803);
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
      if (this.vWJ != null)
        paramArrayOfObject.e(4, this.vWJ);
      paramArrayOfObject.e(5, 2, this.vWt);
      if (this.desc != null)
        paramArrayOfObject.e(6, this.desc);
      if (this.vWS != null)
        paramArrayOfObject.e(7, this.vWS);
      if (this.pPw != null)
        paramArrayOfObject.e(8, this.pPw);
      if (this.vWM != null)
        paramArrayOfObject.e(9, this.vWM);
      if (this.vWO != null)
        paramArrayOfObject.e(10, this.vWO);
      if (this.vWP != null)
        paramArrayOfObject.e(11, this.vWP);
      paramArrayOfObject.iz(12, this.vWv);
      if (this.vWG != null)
        paramArrayOfObject.e(13, this.vWG);
      AppMethodBeat.o(48803);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1114;
    label1114: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.vWJ != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vWJ);
      paramInt = i + e.a.a.a.c(5, 2, this.vWt);
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.desc);
      paramInt = i;
      if (this.vWS != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vWS);
      i = paramInt;
      if (this.pPw != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.pPw);
      paramInt = i;
      if (this.vWM != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vWM);
      i = paramInt;
      if (this.vWO != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vWO);
      paramInt = i;
      if (this.vWP != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vWP);
      i = paramInt + e.a.a.b.b.a.bs(12, this.vWv);
      paramInt = i;
      if (this.vWG != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.vWG);
      AppMethodBeat.o(48803);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vWt.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(48803);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48803);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pr localpr = (pr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48803);
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
            localpr.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 2:
          localpr.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 3:
          localpr.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 4:
          localpr.vWJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 5:
          localpr.vWt.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 6:
          localpr.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 7:
          localpr.vWS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 8:
          localpr.pPw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 9:
          localpr.vWM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 10:
          localpr.vWO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 11:
          localpr.vWP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 12:
          localpr.vWv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        case 13:
          localpr.vWG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48803);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48803);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pr
 * JD-Core Version:    0.6.2
 */