package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aki extends btd
{
  public String guP;
  public int vQe;
  public String vQg;
  public SKBuiltinBuffer_t wpP;
  public int wpU;
  public LinkedList<bts> wpV;
  public int wpW;
  public LinkedList<axw> wpX;
  public String wpY;
  public int wpZ;
  public int wqa;
  public axx wqb;
  public String wqc;

  public aki()
  {
    AppMethodBeat.i(28447);
    this.wpV = new LinkedList();
    this.wpX = new LinkedList();
    AppMethodBeat.o(28447);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28448);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28448);
        throw paramArrayOfObject;
      }
      if (this.wpP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Buff");
        AppMethodBeat.o(28448);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wpP != null)
      {
        paramArrayOfObject.iy(2, this.wpP.computeSize());
        this.wpP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wpU);
      paramArrayOfObject.e(4, 8, this.wpV);
      paramArrayOfObject.iz(5, this.wpW);
      paramArrayOfObject.e(6, 8, this.wpX);
      paramArrayOfObject.iz(7, this.vQe);
      if (this.wpY != null)
        paramArrayOfObject.e(8, this.wpY);
      if (this.vQg != null)
        paramArrayOfObject.e(9, this.vQg);
      paramArrayOfObject.iz(10, this.wpZ);
      if (this.guP != null)
        paramArrayOfObject.e(11, this.guP);
      paramArrayOfObject.iz(12, this.wqa);
      if (this.wqb != null)
      {
        paramArrayOfObject.iy(13, this.wqb.computeSize());
        this.wqb.writeFields(paramArrayOfObject);
      }
      if (this.wqc != null)
        paramArrayOfObject.e(14, this.wqc);
      AppMethodBeat.o(28448);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1546;
    label1546: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wpP != null)
        i = paramInt + e.a.a.a.ix(2, this.wpP.computeSize());
      i = i + e.a.a.b.b.a.bs(3, this.wpU) + e.a.a.a.c(4, 8, this.wpV) + e.a.a.b.b.a.bs(5, this.wpW) + e.a.a.a.c(6, 8, this.wpX) + e.a.a.b.b.a.bs(7, this.vQe);
      paramInt = i;
      if (this.wpY != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wpY);
      i = paramInt;
      if (this.vQg != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vQg);
      i += e.a.a.b.b.a.bs(10, this.wpZ);
      paramInt = i;
      if (this.guP != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.guP);
      i = paramInt + e.a.a.b.b.a.bs(12, this.wqa);
      paramInt = i;
      if (this.wqb != null)
        paramInt = i + e.a.a.a.ix(13, this.wqb.computeSize());
      i = paramInt;
      if (this.wqc != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.wqc);
      AppMethodBeat.o(28448);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wpV.clear();
        this.wpX.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28448);
          throw paramArrayOfObject;
        }
        if (this.wpP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Buff");
          AppMethodBeat.o(28448);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28448);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aki localaki = (aki)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28448);
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
            localaki.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaki.wpP = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 3:
          localaki.wpU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaki.wpV.add(localObject1);
          }
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 5:
          localaki.wpW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((axw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaki.wpX.add(localObject1);
          }
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 7:
          localaki.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 8:
          localaki.wpY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 9:
          localaki.vQg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 10:
          localaki.wpZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 11:
          localaki.guP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 12:
          localaki.wqa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new axx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaki.wqb = paramArrayOfObject;
          }
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        case 14:
          localaki.wqc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28448);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28448);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aki
 * JD-Core Version:    0.6.2
 */