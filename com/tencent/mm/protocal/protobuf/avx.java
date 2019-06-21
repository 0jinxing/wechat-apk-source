package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class avx extends btd
{
  public String ncH;
  public String vDm;
  public LinkedList<buj> wlE;
  public avi wzH;
  public String wzJ;
  public String wzK;
  public String wzL;

  public avx()
  {
    AppMethodBeat.i(96257);
    this.wlE = new LinkedList();
    AppMethodBeat.o(96257);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96258);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96258);
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
      paramArrayOfObject.e(3, 8, this.wlE);
      if (this.ncH != null)
        paramArrayOfObject.e(4, this.ncH);
      if (this.vDm != null)
        paramArrayOfObject.e(5, this.vDm);
      if (this.wzJ != null)
        paramArrayOfObject.e(6, this.wzJ);
      if (this.wzK != null)
        paramArrayOfObject.e(7, this.wzK);
      if (this.wzL != null)
        paramArrayOfObject.e(8, this.wzL);
      AppMethodBeat.o(96258);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label998;
    label998: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wzH != null)
        i = paramInt + e.a.a.a.ix(2, this.wzH.computeSize());
      paramInt = i + e.a.a.a.c(3, 8, this.wlE);
      i = paramInt;
      if (this.ncH != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ncH);
      paramInt = i;
      if (this.vDm != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vDm);
      i = paramInt;
      if (this.wzJ != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wzJ);
      paramInt = i;
      if (this.wzK != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wzK);
      i = paramInt;
      if (this.wzL != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wzL);
      AppMethodBeat.o(96258);
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
          AppMethodBeat.o(96258);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96258);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avx localavx = (avx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96258);
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
            localavx.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(96258);
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
            localavx.wzH = ((avi)localObject1);
          }
          AppMethodBeat.o(96258);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new buj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((buj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavx.wlE.add(localObject1);
          }
          AppMethodBeat.o(96258);
          paramInt = i;
          break;
        case 4:
          localavx.ncH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96258);
          paramInt = i;
          break;
        case 5:
          localavx.vDm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96258);
          paramInt = i;
          break;
        case 6:
          localavx.wzJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96258);
          paramInt = i;
          break;
        case 7:
          localavx.wzK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96258);
          paramInt = i;
          break;
        case 8:
          localavx.wzL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96258);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96258);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avx
 * JD-Core Version:    0.6.2
 */