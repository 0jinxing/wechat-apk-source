package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ek extends btd
{
  public String fgd;
  public String url;
  public LinkedList<ew> vGg;
  public int vGh;
  public String vGi;
  public int vGj;
  public int vGk;
  public int vGl;
  public dw vGm;
  public cns vGn;
  public String vGo;
  public bac vGp;
  public eg vGq;

  public ek()
  {
    AppMethodBeat.i(14694);
    this.vGg = new LinkedList();
    AppMethodBeat.o(14694);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(14695);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(14695);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.vGg);
      paramArrayOfObject.iz(3, this.vGh);
      if (this.vGi != null)
        paramArrayOfObject.e(4, this.vGi);
      paramArrayOfObject.iz(5, this.vGj);
      paramArrayOfObject.iz(6, this.vGk);
      paramArrayOfObject.iz(7, this.vGl);
      if (this.vGm != null)
      {
        paramArrayOfObject.iy(8, this.vGm.computeSize());
        this.vGm.writeFields(paramArrayOfObject);
      }
      if (this.url != null)
        paramArrayOfObject.e(9, this.url);
      if (this.fgd != null)
        paramArrayOfObject.e(10, this.fgd);
      if (this.vGn != null)
      {
        paramArrayOfObject.iy(11, this.vGn.computeSize());
        this.vGn.writeFields(paramArrayOfObject);
      }
      if (this.vGo != null)
        paramArrayOfObject.e(12, this.vGo);
      if (this.vGp != null)
      {
        paramArrayOfObject.iy(13, this.vGp.computeSize());
        this.vGp.writeFields(paramArrayOfObject);
      }
      if (this.vGq != null)
      {
        paramArrayOfObject.iy(14, this.vGq.computeSize());
        this.vGq.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(14695);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1623;
    label1623: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.vGg) + e.a.a.b.b.a.bs(3, this.vGh);
      paramInt = i;
      if (this.vGi != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vGi);
      i = paramInt + e.a.a.b.b.a.bs(5, this.vGj) + e.a.a.b.b.a.bs(6, this.vGk) + e.a.a.b.b.a.bs(7, this.vGl);
      paramInt = i;
      if (this.vGm != null)
        paramInt = i + e.a.a.a.ix(8, this.vGm.computeSize());
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.url);
      paramInt = i;
      if (this.fgd != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.fgd);
      i = paramInt;
      if (this.vGn != null)
        i = paramInt + e.a.a.a.ix(11, this.vGn.computeSize());
      paramInt = i;
      if (this.vGo != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vGo);
      i = paramInt;
      if (this.vGp != null)
        i = paramInt + e.a.a.a.ix(13, this.vGp.computeSize());
      paramInt = i;
      if (this.vGq != null)
        paramInt = i + e.a.a.a.ix(14, this.vGq.computeSize());
      AppMethodBeat.o(14695);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vGg.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(14695);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(14695);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ek localek = (ek)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14695);
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
            localek.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ew();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ew)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localek.vGg.add(localObject1);
          }
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 3:
          localek.vGh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 4:
          localek.vGi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 5:
          localek.vGj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 6:
          localek.vGk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 7:
          localek.vGl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new dw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localek.vGm = paramArrayOfObject;
          }
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 9:
          localek.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 10:
          localek.fgd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cns();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cns)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localek.vGn = ((cns)localObject1);
          }
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 12:
          localek.vGo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 13:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bac();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bac)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localek.vGp = ((bac)localObject1);
          }
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        case 14:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new eg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((eg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localek.vGq = ((eg)localObject1);
          }
          AppMethodBeat.o(14695);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(14695);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ek
 * JD-Core Version:    0.6.2
 */