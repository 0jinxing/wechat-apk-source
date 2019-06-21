package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class uq extends btd
{
  public int ehB;
  public SKBuiltinBuffer_t vEF;
  public LinkedList<baz> vEh;
  public bts vEi;
  public String vXm;
  public String vXn;
  public bts wcc;
  public bts wce;
  public bts wcf;

  public uq()
  {
    AppMethodBeat.i(5570);
    this.vEh = new LinkedList();
    AppMethodBeat.o(5570);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5571);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5571);
        throw paramArrayOfObject;
      }
      if (this.wcc == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Topic");
        AppMethodBeat.o(5571);
        throw paramArrayOfObject;
      }
      if (this.wce == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PYInitial");
        AppMethodBeat.o(5571);
        throw paramArrayOfObject;
      }
      if (this.wcf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QuanPin");
        AppMethodBeat.o(5571);
        throw paramArrayOfObject;
      }
      if (this.vEi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ChatRoomName");
        AppMethodBeat.o(5571);
        throw paramArrayOfObject;
      }
      if (this.vEF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
        AppMethodBeat.o(5571);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wcc != null)
      {
        paramArrayOfObject.iy(2, this.wcc.computeSize());
        this.wcc.writeFields(paramArrayOfObject);
      }
      if (this.wce != null)
      {
        paramArrayOfObject.iy(3, this.wce.computeSize());
        this.wce.writeFields(paramArrayOfObject);
      }
      if (this.wcf != null)
      {
        paramArrayOfObject.iy(4, this.wcf.computeSize());
        this.wcf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.ehB);
      paramArrayOfObject.e(6, 8, this.vEh);
      if (this.vEi != null)
      {
        paramArrayOfObject.iy(7, this.vEi.computeSize());
        this.vEi.writeFields(paramArrayOfObject);
      }
      if (this.vEF != null)
      {
        paramArrayOfObject.iy(8, this.vEF.computeSize());
        this.vEF.writeFields(paramArrayOfObject);
      }
      if (this.vXm != null)
        paramArrayOfObject.e(9, this.vXm);
      if (this.vXn != null)
        paramArrayOfObject.e(10, this.vXn);
      AppMethodBeat.o(5571);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1757;
    label1757: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wcc != null)
        paramInt = i + e.a.a.a.ix(2, this.wcc.computeSize());
      i = paramInt;
      if (this.wce != null)
        i = paramInt + e.a.a.a.ix(3, this.wce.computeSize());
      paramInt = i;
      if (this.wcf != null)
        paramInt = i + e.a.a.a.ix(4, this.wcf.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(5, this.ehB) + e.a.a.a.c(6, 8, this.vEh);
      paramInt = i;
      if (this.vEi != null)
        paramInt = i + e.a.a.a.ix(7, this.vEi.computeSize());
      i = paramInt;
      if (this.vEF != null)
        i = paramInt + e.a.a.a.ix(8, this.vEF.computeSize());
      paramInt = i;
      if (this.vXm != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vXm);
      i = paramInt;
      if (this.vXn != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vXn);
      AppMethodBeat.o(5571);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(5571);
          throw paramArrayOfObject;
        }
        if (this.wcc == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Topic");
          AppMethodBeat.o(5571);
          throw paramArrayOfObject;
        }
        if (this.wce == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PYInitial");
          AppMethodBeat.o(5571);
          throw paramArrayOfObject;
        }
        if (this.wcf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QuanPin");
          AppMethodBeat.o(5571);
          throw paramArrayOfObject;
        }
        if (this.vEi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ChatRoomName");
          AppMethodBeat.o(5571);
          throw paramArrayOfObject;
        }
        if (this.vEF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ImgBuf");
          AppMethodBeat.o(5571);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5571);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        uq localuq = (uq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5571);
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
            localuq.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(5571);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuq.wcc = ((bts)localObject1);
          }
          AppMethodBeat.o(5571);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuq.wce = paramArrayOfObject;
          }
          AppMethodBeat.o(5571);
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
            localuq.wcf = ((bts)localObject1);
          }
          AppMethodBeat.o(5571);
          paramInt = i;
          break;
        case 5:
          localuq.ehB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5571);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new baz();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuq.vEh.add(paramArrayOfObject);
          }
          AppMethodBeat.o(5571);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuq.vEi = paramArrayOfObject;
          }
          AppMethodBeat.o(5571);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuq.vEF = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(5571);
          paramInt = i;
          break;
        case 9:
          localuq.vXm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5571);
          paramInt = i;
          break;
        case 10:
          localuq.vXn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5571);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5571);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.uq
 * JD-Core Version:    0.6.2
 */