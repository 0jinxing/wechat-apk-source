package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aml extends btd
{
  public String Desc;
  public LinkedList<EmotionSummary> EmotionList;
  public String HeadUrl;
  public String Name;
  public SKBuiltinBuffer_t ReqBuf;
  public String vKE;
  public LinkedList<xx> vKl;
  public String wrl;

  public aml()
  {
    AppMethodBeat.i(62570);
    this.EmotionList = new LinkedList();
    this.vKl = new LinkedList();
    AppMethodBeat.o(62570);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62571);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(62571);
        throw paramArrayOfObject;
      }
      if (this.wrl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BannerUrl");
        AppMethodBeat.o(62571);
        throw paramArrayOfObject;
      }
      if (this.Name == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Name");
        AppMethodBeat.o(62571);
        throw paramArrayOfObject;
      }
      if (this.Desc == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Desc");
        AppMethodBeat.o(62571);
        throw paramArrayOfObject;
      }
      if (this.HeadUrl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HeadUrl");
        AppMethodBeat.o(62571);
        throw paramArrayOfObject;
      }
      if (this.vKE == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BizName");
        AppMethodBeat.o(62571);
        throw paramArrayOfObject;
      }
      if (this.ReqBuf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReqBuf");
        AppMethodBeat.o(62571);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wrl != null)
        paramArrayOfObject.e(2, this.wrl);
      if (this.Name != null)
        paramArrayOfObject.e(3, this.Name);
      if (this.Desc != null)
        paramArrayOfObject.e(4, this.Desc);
      if (this.HeadUrl != null)
        paramArrayOfObject.e(5, this.HeadUrl);
      if (this.vKE != null)
        paramArrayOfObject.e(6, this.vKE);
      paramArrayOfObject.e(7, 8, this.EmotionList);
      if (this.ReqBuf != null)
      {
        paramArrayOfObject.iy(8, this.ReqBuf.computeSize());
        this.ReqBuf.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(9, 8, this.vKl);
      AppMethodBeat.o(62571);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1430;
    label1430: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wrl != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wrl);
      paramInt = i;
      if (this.Name != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Name);
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Desc);
      paramInt = i;
      if (this.HeadUrl != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.HeadUrl);
      i = paramInt;
      if (this.vKE != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vKE);
      i += e.a.a.a.c(7, 8, this.EmotionList);
      paramInt = i;
      if (this.ReqBuf != null)
        paramInt = i + e.a.a.a.ix(8, this.ReqBuf.computeSize());
      paramInt += e.a.a.a.c(9, 8, this.vKl);
      AppMethodBeat.o(62571);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.EmotionList.clear();
        this.vKl.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(62571);
          throw paramArrayOfObject;
        }
        if (this.wrl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BannerUrl");
          AppMethodBeat.o(62571);
          throw paramArrayOfObject;
        }
        if (this.Name == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Name");
          AppMethodBeat.o(62571);
          throw paramArrayOfObject;
        }
        if (this.Desc == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Desc");
          AppMethodBeat.o(62571);
          throw paramArrayOfObject;
        }
        if (this.HeadUrl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HeadUrl");
          AppMethodBeat.o(62571);
          throw paramArrayOfObject;
        }
        if (this.vKE == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BizName");
          AppMethodBeat.o(62571);
          throw paramArrayOfObject;
        }
        if (this.ReqBuf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ReqBuf");
          AppMethodBeat.o(62571);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62571);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aml localaml = (aml)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62571);
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
            localaml.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(62571);
          paramInt = i;
          break;
        case 2:
          localaml.wrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62571);
          paramInt = i;
          break;
        case 3:
          localaml.Name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62571);
          paramInt = i;
          break;
        case 4:
          localaml.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62571);
          paramInt = i;
          break;
        case 5:
          localaml.HeadUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62571);
          paramInt = i;
          break;
        case 6:
          localaml.vKE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62571);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new EmotionSummary();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((EmotionSummary)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaml.EmotionList.add(localObject1);
          }
          AppMethodBeat.o(62571);
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
            localaml.ReqBuf = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(62571);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new xx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((xx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaml.vKl.add(localObject1);
          }
          AppMethodBeat.o(62571);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62571);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aml
 * JD-Core Version:    0.6.2
 */