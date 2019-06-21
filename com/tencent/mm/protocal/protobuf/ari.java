package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ari extends btd
{
  public cwg vXT;
  public int wve;
  public LinkedList<cxi> wvk;
  public cxi wvl;
  public String wvm;
  public int wvn;
  public String wvo;
  public String wvp;
  public String wvq;
  public String wvr;

  public ari()
  {
    AppMethodBeat.i(96244);
    this.wvk = new LinkedList();
    AppMethodBeat.o(96244);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96245);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96245);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.vXT != null)
      {
        paramArrayOfObject.iy(2, this.vXT.computeSize());
        this.vXT.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(3, 8, this.wvk);
      if (this.wvl != null)
      {
        paramArrayOfObject.iy(4, this.wvl.computeSize());
        this.wvl.writeFields(paramArrayOfObject);
      }
      if (this.wvm != null)
        paramArrayOfObject.e(5, this.wvm);
      paramArrayOfObject.iz(6, this.wvn);
      if (this.wvo != null)
        paramArrayOfObject.e(7, this.wvo);
      if (this.wvp != null)
        paramArrayOfObject.e(8, this.wvp);
      if (this.wvq != null)
        paramArrayOfObject.e(9, this.wvq);
      if (this.wvr != null)
        paramArrayOfObject.e(10, this.wvr);
      paramArrayOfObject.iz(11, this.wve);
      AppMethodBeat.o(96245);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1256;
    label1256: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vXT != null)
        i = paramInt + e.a.a.a.ix(2, this.vXT.computeSize());
      i += e.a.a.a.c(3, 8, this.wvk);
      paramInt = i;
      if (this.wvl != null)
        paramInt = i + e.a.a.a.ix(4, this.wvl.computeSize());
      i = paramInt;
      if (this.wvm != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wvm);
      i += e.a.a.b.b.a.bs(6, this.wvn);
      paramInt = i;
      if (this.wvo != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wvo);
      i = paramInt;
      if (this.wvp != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wvp);
      paramInt = i;
      if (this.wvq != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wvq);
      i = paramInt;
      if (this.wvr != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wvr);
      paramInt = i + e.a.a.b.b.a.bs(11, this.wve);
      AppMethodBeat.o(96245);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wvk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(96245);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96245);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ari localari = (ari)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96245);
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
            localari.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cwg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cwg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localari.vXT = ((cwg)localObject1);
          }
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localari.wvk.add(localObject1);
          }
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localari.wvl = ((cxi)localObject1);
          }
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 5:
          localari.wvm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 6:
          localari.wvn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 7:
          localari.wvo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 8:
          localari.wvp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 9:
          localari.wvq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 10:
          localari.wvr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        case 11:
          localari.wve = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96245);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96245);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ari
 * JD-Core Version:    0.6.2
 */